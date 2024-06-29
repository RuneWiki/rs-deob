import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class200 {

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "Lbe;")
    public static class283 field3418 = class153.method941(127, "Spielwelt erstellt)3");

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "Lbe;")
    public static class283 field3420 = class153.method941(-13, "sch-Utteln:");

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "I")
    public static int field3421 = 0;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Lbe;")
    public static class283 field3425 = class153.method941(27, "Spieler");

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "Lbe;")
    public static class283 field3419 = class153.method941(-45, "runes");

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "Lbe;")
    private static class283 field3426 = class153.method941(-87, "Loading )2 please wait)3");

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "Lbe;")
    public static class283 field3424 = field3426;

    @OriginalMember(owner = "client!dk", name = "l", descriptor = "Lbe;")
    public static class283 field3429 = class153.method941(125, "gr-Un:");

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "F")
    public static float field3427;

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "I")
    public static int field3423;

    @OriginalMember(owner = "client!dk", name = "k", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!dk", name = "m", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(II)I", line = 12)
    public static final int method1285(int arg0, int arg1) {
        if (arg0 == 2001) {
            field3423++;
            return arg1 & 0x7F;
        } else {
            return 29;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)V", line = 25)
    public static void method1286(int arg0) {
        field3418 = null;
        field3424 = null;
        field3419 = null;
        if (arg0 != 4) {
            field3427 = 0.6074591F;
        }
        field3426 = null;
        field3429 = null;
        field3425 = null;
        field3420 = null;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lfe;I)Leg;", line = 63)
    public static final class286 method1287(class229 arg0, int arg1) {
        arg0.method1535((byte) 118);
        int var2 = arg0.method1535((byte) 81);
        class286 var3 = class112.method737(var2, -10982);
        var3.field4869 = arg0.method1535((byte) 98);
        int var4 = arg0.method1535((byte) 107);
        field3422++;
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method1535((byte) 88);
            var3.method19(arg0, false, var6);
        }
        var3.method276(arg1 + 3);
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IBI[Lom;)V", line = 93)
    public static final void method1288(int arg0, byte arg1, int arg2, class65[] arg3) {
        if (arg2 > arg0) {
            int var4 = arg0 - 1;
            int var5 = (arg0 + arg2) / 2;
            int var6 = arg2 + 1;
            class65 var7 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var7;
            while (var6 > var4) {
                boolean var8 = true;
                do {
                    var6--;
                    for (int var9 = 0; var9 < 4; var9++) {
                        int var10;
                        int var11;
                        if (class194.field3317[var9] == 2) {
                            var10 = var7.field898;
                            var11 = arg3[var6].field898;
                        } else if (class194.field3317[var9] == 1) {
                            var10 = var7.field901;
                            var11 = arg3[var6].field901;
                            if (var10 == -1 && class248.field4233[var9] == 1) {
                                var10 = 2001;
                            }
                            if (var11 == -1 && class248.field4233[var9] == 1) {
                                var11 = 2001;
                            }
                        } else if (class194.field3317[var9] == 3) {
                            var11 = arg3[var6].field910 ? 1 : 0;
                            var10 = var7.field910 ? 1 : 0;
                        } else {
                            var10 = var7.field903;
                            var11 = arg3[var6].field903;
                        }
                        if (var10 != var11) {
                            if ((class248.field4233[var9] != 1 || var11 <= var10) && (class248.field4233[var9] != 0 || var11 >= var10)) {
                                var8 = false;
                            }
                            break;
                        }
                        if (var9 == 3) {
                            var8 = false;
                        }
                    }
                } while (var8);
                boolean var12 = true;
                do {
                    var4++;
                    for (int var13 = 0; var13 < 4; var13++) {
                        int var14;
                        int var15;
                        if (class194.field3317[var13] == 2) {
                            var14 = var7.field898;
                            var15 = arg3[var4].field898;
                        } else if (class194.field3317[var13] == 1) {
                            var15 = arg3[var4].field901;
                            if (var15 == -1 && class248.field4233[var13] == 1) {
                                var15 = 2001;
                            }
                            var14 = var7.field901;
                            if (var14 == -1 && class248.field4233[var13] == 1) {
                                var14 = 2001;
                            }
                        } else if (class194.field3317[var13] == 3) {
                            var14 = var7.field910 ? 1 : 0;
                            var15 = arg3[var4].field910 ? 1 : 0;
                        } else {
                            var15 = arg3[var4].field903;
                            var14 = var7.field903;
                        }
                        if (var14 != var15) {
                            if ((class248.field4233[var13] != 1 || var15 >= var14) && (class248.field4233[var13] != 0 || var15 <= var14)) {
                                var12 = false;
                            }
                            break;
                        }
                        if (var13 == 3) {
                            var12 = false;
                        }
                    }
                } while (var12);
                if (var4 < var6) {
                    class65 var16 = arg3[var4];
                    arg3[var4] = arg3[var6];
                    arg3[var6] = var16;
                }
            }
            method1288(arg0, (byte) -124, var6, arg3);
            method1288(var6 + 1, (byte) -128, arg2, arg3);
        }
        if (arg1 >= -123) {
            field3421 = 121;
        }
        field3430++;
    }
}
