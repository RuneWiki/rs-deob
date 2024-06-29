import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class36 extends class235 {

    @OriginalMember(owner = "client!di", name = "t", descriptor = "I")
    public static int field601 = 0;

    @OriginalMember(owner = "client!di", name = "B", descriptor = "[[B")
    public static byte[][] field609 = new byte[250][];

    @OriginalMember(owner = "client!di", name = "w", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!di", name = "u", descriptor = "I")
    public int field602;

    @OriginalMember(owner = "client!di", name = "A", descriptor = "I")
    public static int field608;

    @OriginalMember(owner = "client!di", name = "C", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!di", name = "G", descriptor = "I")
    public static int field614;

    @OriginalMember(owner = "client!di", name = "H", descriptor = "I")
    public int field615;

    @OriginalMember(owner = "client!di", name = "I", descriptor = "I")
    public static int field616;

    @OriginalMember(owner = "client!di", name = "J", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!di", name = "y", descriptor = "Lva;")
    public static class172 field606;

    @OriginalMember(owner = "client!di", name = "v", descriptor = "[I")
    public int[] field603;

    @OriginalMember(owner = "client!di", name = "x", descriptor = "[I")
    public int[] field605;

    @OriginalMember(owner = "client!di", name = "z", descriptor = "[I")
    public int[] field607;

    @OriginalMember(owner = "client!di", name = "D", descriptor = "[Lbd;")
    public class22[] field611;

    @OriginalMember(owner = "client!di", name = "E", descriptor = "[Lbd;")
    public class22[] field612;

    @OriginalMember(owner = "client!di", name = "F", descriptor = "[[[B")
    public byte[][][] field613;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ZI)V")
    public static final void method299(boolean arg0, int arg1) {
        field610++;
        byte[][] var2 = class238.field4106;
        byte var3 = 4;
        for (int var4 = arg1; var4 < var3; var4++) {
            class115.method867(112);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    boolean var7 = false;
                    int var8 = class156.field2847[var4][var5][var6];
                    if (var8 != -1) {
                        int var9 = var8 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = var8 >> 14 & 0x3FF;
                            int var11 = (var8 & 0x6) >> 1;
                            int var12 = (var8 & 0x3FFB) >> 3;
                            int var13 = (var10 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class49.field812.length; var14++) {
                                if (class49.field812[var14] == var13 && var2[var14] != null) {
                                    var7 = true;
                                    class23.method243(var5 * 8, (var12 & 0x7) * 8, class110.field1961, arg0, var9, var2[var14], var6 * 8, (byte) 54, (var10 & 0x7) * 8, var4, var11);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var7) {
                        class251.method1740(8, 8, var4, var5 * 8, 0, var6 * 8);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(BI)V")
    public static final void method300(byte arg0, int arg1) {
        field616++;
        if (!class141.method1056(arg1, (byte) -64) || arg0 != -42) {
            return;
        }
        class148[] var2 = class33.field585[arg1];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class148 var4 = var2[var3];
            if (var4 != null) {
                var4.field2633 = 0;
                var4.field2679 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)I")
    public static final int method301(int arg0, int arg1, int arg2) {
        field617++;
        if (arg1 == 0) {
            int var3 = arg0 - 1 & arg2 >> 31;
            return ((arg2 >>> 31) + arg2) % arg0 + var3;
        } else {
            return -50;
        }
    }

    @OriginalMember(owner = "client!di", name = "c", descriptor = "(II)Lsb;")
    public static final class98 method302(int arg0, int arg1) {
        field614++;
        return class217.field3751[arg0].method724((byte) 25) > arg1 ? class186.method1288(new class98[] { class112.field1994[arg0], class67.field1079, class217.field3751[arg0] }, arg1 ^ 0x7B82) : class112.field1994[arg0];
    }

    @OriginalMember(owner = "client!di", name = "d", descriptor = "(B)V")
    public static void method303(byte arg0) {
        if (arg0 != -19) {
            field606 = null;
        }
        field606 = null;
        field609 = null;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IIIILlj;IZII)V")
    public static final void method304(int arg0, int arg1, int arg2, int arg3, class216 arg4, int arg5, boolean arg6, int arg7, int arg8) {
        if (arg3 >= 0 && arg3 < 104 && arg1 >= 0 && arg1 < 104) {
            if (!arg6) {
                class138.field2461[arg8][arg3][arg1] = 0;
            }
            while (true) {
                int var9 = arg4.method1446(5350);
                if (var9 == 0) {
                    if (arg6) {
                        class78.field1393[0][arg3][arg1] = class244.field4248[0][arg3][arg1];
                    } else if (arg8 == 0) {
                        class78.field1393[0][arg3][arg1] = -class16.method146(arg1 + arg7 + 556238, (byte) 112, arg3 + arg0 + 932731) * 8;
                    } else {
                        class78.field1393[arg8][arg3][arg1] = class78.field1393[arg8 - 1][arg3][arg1] - 240;
                    }
                    break;
                }
                if (var9 == 1) {
                    int var10 = arg4.method1446(5350);
                    if (arg6) {
                        class78.field1393[0][arg3][arg1] = var10 * 8 + class244.field4248[0][arg3][arg1];
                    } else {
                        if (var10 == 1) {
                            var10 = 0;
                        }
                        if (arg8 == 0) {
                            class78.field1393[0][arg3][arg1] = -var10 * 8;
                        } else {
                            class78.field1393[arg8][arg3][arg1] = class78.field1393[arg8 - 1][arg3][arg1] - (var10 * 8);
                        }
                    }
                    break;
                }
                if (var9 <= 49) {
                    class103.field1834[arg8][arg3][arg1] = arg4.method1472(65);
                    class228.field3924[arg8][arg3][arg1] = (byte) ((var9 - 2) / 4);
                    class117.field2098[arg8][arg3][arg1] = (byte) class214.method1427(arg5 + var9 - 2, 3);
                } else if (var9 > 81) {
                    class233.field4006[arg8][arg3][arg1] = (byte) (var9 - 81);
                } else if (!arg6) {
                    class138.field2461[arg8][arg3][arg1] = (byte) (var9 - 49);
                }
            }
        } else {
            while (true) {
                int var11 = arg4.method1446(5350);
                if (var11 == 0) {
                    break;
                }
                if (var11 == 1) {
                    arg4.method1446(5350);
                    break;
                }
                if (var11 <= 49) {
                    arg4.method1446(5350);
                }
            }
        }
        if (arg2 <= 38) {
            field601 = -95;
        }
        field608++;
    }
}
