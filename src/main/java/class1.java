import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class1 {

    @OriginalMember(owner = "client!aa", name = "o", descriptor = "Z")
    public boolean field15 = true;

    @OriginalMember(owner = "client!aa", name = "r", descriptor = "I")
    public int field18;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "I")
    public int field2;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public int field11;

    @OriginalMember(owner = "client!aa", name = "m", descriptor = "I")
    public int field13;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "I")
    public int field5;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public int field8;

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Loc;")
    public static class99 field12 = class48.method402((byte) -104, "redstone2");

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "Loc;")
    private static class99 field3 = class48.method402((byte) -104, "Enter name:");

    @OriginalMember(owner = "client!aa", name = "p", descriptor = "Loc;")
    public static class99 field16 = field3;

    @OriginalMember(owner = "client!aa", name = "s", descriptor = "I")
    public static int field19 = 0;

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "Lr;")
    public static class118 field9 = new class118(64);

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "Lr;")
    public static class118 field21 = new class118(260);

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "Loc;")
    public static class99 field22 = class48.method402((byte) -104, "Bitte starten Sie eine Mitgliedschaft");

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "I")
    public static int field25 = 0;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "Loc;")
    public static class99 field24 = class48.method402((byte) -104, "runes");

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!aa", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!aa", name = "n", descriptor = "Llb;")
    public static class77 field14;

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "[Ldc;")
    public static class24[] field20;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "[[I")
    public static int[][] field23;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "([Lld;BI[II[I)V")
    public static final void method1(class80[] arg0, byte arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        if (arg2 > arg4) {
            int var6 = arg4 - 1;
            int var7 = (arg4 + arg2) / 2;
            int var8 = arg2 + 1;
            class80 var9 = arg0[var7];
            arg0[var7] = arg0[arg4];
            arg0[arg4] = var9;
            while (var6 < var8) {
                boolean var10 = true;
                do {
                    var8--;
                    for (int var11 = 0; var11 < 4; var11++) {
                        int var12;
                        int var13;
                        if (arg3[var11] == 2) {
                            var12 = arg0[var8].field1991;
                            var13 = var9.field1991;
                        } else if (arg3[var11] == 1) {
                            var12 = arg0[var8].field1970;
                            if (var12 == -1 && arg5[var11] == 1) {
                                var12 = 2001;
                            }
                            var13 = var9.field1970;
                            if (var13 == -1 && arg5[var11] == 1) {
                                var13 = 2001;
                            }
                        } else if (arg3[var11] == 3) {
                            var12 = arg0[var8].field1985 ? 1 : 0;
                            var13 = var9.field1985 ? 1 : 0;
                        } else {
                            var12 = arg0[var8].field1983;
                            var13 = var9.field1983;
                        }
                        if (var12 != var13) {
                            if ((arg5[var11] != 1 || var12 <= var13) && (arg5[var11] != 0 || var12 >= var13)) {
                                var10 = false;
                            }
                            break;
                        }
                        if (var11 == 3) {
                            var10 = false;
                        }
                    }
                } while (var10);
                boolean var14 = true;
                do {
                    var6++;
                    for (int var15 = 0; var15 < 4; var15++) {
                        int var16;
                        int var17;
                        if (arg3[var15] == 2) {
                            var16 = arg0[var6].field1991;
                            var17 = var9.field1991;
                        } else if (arg3[var15] == 1) {
                            var16 = arg0[var6].field1970;
                            var17 = var9.field1970;
                            if (var16 == -1 && arg5[var15] == 1) {
                                var16 = 2001;
                            }
                            if (var17 == -1 && arg5[var15] == 1) {
                                var17 = 2001;
                            }
                        } else if (arg3[var15] == 3) {
                            var17 = var9.field1985 ? 1 : 0;
                            var16 = arg0[var6].field1985 ? 1 : 0;
                        } else {
                            var16 = arg0[var6].field1983;
                            var17 = var9.field1983;
                        }
                        if (var16 != var17) {
                            if ((arg5[var15] != 1 || var17 <= var16) && (arg5[var15] != 0 || var17 >= var16)) {
                                var14 = false;
                            }
                            break;
                        }
                        if (var15 == 3) {
                            var14 = false;
                        }
                    }
                } while (var14);
                if (var8 > var6) {
                    class80 var18 = arg0[var6];
                    arg0[var6] = arg0[var8];
                    arg0[var8] = var18;
                }
            }
            method1(arg0, (byte) -12, var8, arg3, arg4, arg5);
            method1(arg0, (byte) -12, arg2, arg3, var8 + 1, arg5);
        }
        field10++;
        if (arg1 != -12) {
            method1(null, (byte) 12, 75, null, 70, null);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)Lvd;")
    public static final class143 method2(byte arg0, int arg1) {
        field7++;
        class143 var2 = (class143) class21.field502.method997(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        int var3 = -2 % ((arg0 - 65) / 48);
        byte[] var4 = class37.field935.method903(10, (byte) -128, arg1);
        class143 var5 = new class143();
        var5.field3523 = arg1;
        if (var4 != null) {
            var5.method1164((byte) -62, new class57(var4));
        }
        var5.method1177(7);
        if (var5.field3548 != -1) {
            var5.method1179(method2((byte) -120, var5.field3548), true, method2((byte) -102, var5.field3533));
        }
        if (!class133.field3261 && var5.field3544) {
            var5.field3527 = null;
            var5.field3551 = class69.field1772;
            var5.field3575 = 0;
            var5.field3571 = null;
        }
        class21.field502.method993((byte) 100, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(II)I")
    public static final int method3(int arg0, int arg1) {
        int var7 = arg1 - 1;
        int var2 = var7 | var7 >>> 1;
        field4++;
        int var3 = var2 | var2 >>> arg0;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IZI[Loc;)Loc;")
    public static final class99 method4(int arg0, boolean arg1, int arg2, class99[] arg3) {
        field1++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg0; var5++) {
            if (arg3[arg2 + var5] == null) {
                arg3[arg2 + var5] = class53.field1258;
            }
            var4 += arg3[arg2 + var5].field2391;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        if (arg1) {
            return null;
        }
        for (int var8 = 0; var8 < arg0; var8++) {
            class99 var10 = arg3[arg2 + var8];
            class116.method990(var10.field2394, 0, var6, var7, var10.field2391);
            var7 += var10.field2391;
        }
        class99 var9 = new class99();
        var9.field2391 = var4;
        var9.field2394 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V")
    public static void method5(int arg0) {
        field20 = null;
        field9 = null;
        if (arg0 != -8924) {
            return;
        }
        field22 = null;
        field16 = null;
        field21 = null;
        field3 = null;
        field14 = null;
        field12 = null;
        field23 = null;
        field24 = null;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field18 = arg0;
        this.field2 = arg4;
        this.field15 = arg6;
        this.field11 = arg2;
        this.field13 = arg3;
        this.field5 = arg1;
        this.field8 = arg5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLpc;)V")
    public static final void method6(boolean arg0, class105 arg1) {
        class119.field2921 = arg1;
        class59.field1556 = class119.field2921.method892(arg0, 16);
        field17++;
    }
}
