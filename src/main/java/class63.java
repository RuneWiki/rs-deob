import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class63 extends class181 {

    @OriginalMember(owner = "client!fh", name = "y", descriptor = "Ldc;")
    public static class37 field1153 = class185.method1233((byte) 86, "Sie haben gerade eine andere Welt verlassen)3");

    @OriginalMember(owner = "client!fh", name = "z", descriptor = "Lsg;")
    public static class203 field1154 = new class203();

    @OriginalMember(owner = "client!fh", name = "B", descriptor = "Ldc;")
    private static class37 field1156 = class185.method1233((byte) 86, "No reply from loginserver)3");

    @OriginalMember(owner = "client!fh", name = "D", descriptor = "Ldc;")
    public static class37 field1158 = field1156;

    @OriginalMember(owner = "client!fh", name = "u", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!fh", name = "v", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!fh", name = "w", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!fh", name = "x", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!fh", name = "A", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!fh", name = "E", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!fh", name = "C", descriptor = "[I")
    public static int[] field1157;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIIIIII[III[B)V")
    public static final void method471(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8, int arg9, byte[] arg10) {
        field1152++;
        int var11 = ((arg5 & 0xFF00FF) * arg1 & 0xFF00FF00) + ((arg5 & 0xFF00) * arg1 & 0xFF0000) >> 8;
        int var12 = 256 - arg1;
        int var13 = -arg8;
        if (arg0 != -16) {
            method471((byte) 0, -60, -22, -87, -17, 105, 115, null, -91, -96, null);
        }
        while (var13 < 0) {
            for (int var14 = -arg4; var14 < 0; var14++) {
                if (arg10[arg6++] == 0) {
                    arg3++;
                } else {
                    int var15 = arg7[arg3];
                    arg7[arg3++] = (class58.method449(16711680, var12 * class58.method449(var15, 65280)) + class58.method449(var12 * class58.method449(16711935, var15), -16711936) >> 8) + var11;
                }
            }
            arg6 += arg9;
            arg3 += arg2;
            var13++;
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I[Lmf;I)V")
    public static final void method472(int arg0, class136[] arg1, int arg2) {
        for (int var3 = arg0; var3 < arg1.length; var3++) {
            class136 var4 = arg1[var3];
            if (var4 != null) {
                if (var4.field2513 == 0) {
                    if (var4.field2641 != null) {
                        method472(0, var4.field2641, arg2);
                    }
                    class201 var5 = (class201) class85.field1499.method1047((byte) 104, (long) var4.field2608);
                    if (var5 != null) {
                        class142.method987(var5.field3746, arg2, false);
                    }
                }
                if (arg2 == 0 && var4.field2629 != null) {
                    class51 var6 = new class51();
                    var6.field1031 = var4;
                    var6.field1042 = var4.field2629;
                    class210.method1397(var6, (byte) -95);
                }
                if (arg2 == 1 && var4.field2524 != null) {
                    if (var4.field2515 >= 0) {
                        class136 var7 = class180.method1200(var4.field2608, (byte) 111);
                        if (var7 == null || var7.field2641 == null || var4.field2515 >= var7.field2641.length || var7.field2641[var4.field2515] != var4) {
                            continue;
                        }
                    }
                    class51 var8 = new class51();
                    var8.field1042 = var4.field2524;
                    var8.field1031 = var4;
                    class210.method1397(var8, (byte) -91);
                }
            }
        }
        field1150++;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "([Lmf;II)V")
    public static final void method473(class136[] arg0, int arg1, int arg2) {
        field1155++;
        if (arg2 != -22561) {
            return;
        }
        for (int var3 = 0; var3 < arg0.length; var3++) {
            class136 var4 = arg0[var3];
            if (var4 != null && var4.field2566 == arg1 && (!var4.field2527 || !class25.method171(true, var4))) {
                if (var4.field2513 == 0) {
                    if (!var4.field2527 && class25.method171(true, var4) && class99.field1736 != var4) {
                        continue;
                    }
                    method473(arg0, var4.field2608, -22561);
                    if (var4.field2641 != null) {
                        method473(var4.field2641, var4.field2608, arg2);
                    }
                    class201 var5 = (class201) class85.field1499.method1047((byte) -111, (long) var4.field2608);
                    if (var5 != null) {
                        class209.method1392(var5.field3746, false);
                    }
                }
                if (var4.field2513 == 6) {
                    if (var4.field2516 != -1 || var4.field2628 != -1) {
                        boolean var6 = class160.method1079(true, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2628;
                        } else {
                            var7 = var4.field2516;
                        }
                        if (var7 != -1) {
                            class208 var8 = class16.method113(var7, (byte) 93);
                            if (var8 != null) {
                                var4.field2530 += class201.field3749;
                                while (var8.field3882[var4.field2610] < var4.field2530) {
                                    var4.field2530 -= var8.field3882[var4.field2610];
                                    var4.field2610++;
                                    if (var4.field2610 >= var8.field3881.length) {
                                        var4.field2610 -= var8.field3901;
                                        if (var4.field2610 < 0 || var8.field3881.length <= var4.field2610) {
                                            var4.field2610 = 0;
                                        }
                                    }
                                    class210.method1395((byte) 29, var4);
                                }
                            }
                        }
                    }
                    if (var4.field2600 != 0 && !var4.field2527) {
                        int var9 = var4.field2600 >> 16;
                        int var10 = class201.field3749 * var9;
                        var4.field2617 = var4.field2617 + var10 & 0x7FF;
                        int var11 = var4.field2600 << 16 >> 16;
                        int var12 = class201.field3749 * var11;
                        var4.field2620 = var4.field2620 + var12 & 0x7FF;
                        class210.method1395((byte) 29, var4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(II)V")
    public static final void method474(int arg0, int arg1) {
        field1151++;
        class210.field3942 = arg0 / arg1;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(BIZZZ)Ldj;")
    public static final class44 method475(byte arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        if (arg0 < 126) {
            method474(73, -75);
        }
        class32 var5 = null;
        field1149++;
        if (class38.field803 != null) {
            var5 = new class32(arg1, class38.field803, class173.field3294[arg1], 1000000);
        }
        return new class44(var5, class164.field3108, arg1, arg4, arg3, arg2);
    }

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "(B)V")
    public static void method476(byte arg0) {
        field1157 = null;
        field1153 = null;
        if (arg0 != 62) {
            method472(-52, null, -118);
        }
        field1156 = null;
        field1154 = null;
        field1158 = null;
    }
}
