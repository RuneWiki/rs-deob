import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class209 extends class123 {

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    private int field3602 = 0;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "I")
    private int field3590 = 0;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    private int field3609 = -32768;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "Z")
    public boolean field3599 = false;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field3593;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public int field3604;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public int field3595;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    private int field3597;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public int field3600;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public int field3601;

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "Lpb;")
    private class2 field3591;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "[J")
    public static long[] field3607 = new long[100];

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "[I")
    public static int[] field3606 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "Loh;")
    public static class258 field3605 = class153.method1046("1", 108);

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "Loh;")
    private static class258 field3611 = class153.method1046("Hidden", 115);

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Loh;")
    public static class258 field3596 = field3611;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field3594;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "Lkk;")
    public static class112 field3603;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()V", line = 10)
    public static final void method1375() {
        for (int var0 = 0; var0 < class145.field2448; var0++) {
            class219 var1 = class42.field597[var0];
            class87.method626(var1);
            class42.field597[var0] = null;
        }
        class145.field2448 = 0;
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(Z)Li;", line = 25)
    private final class305 method1376(boolean arg0) {
        field3608++;
        class212 var2 = class149.method1022(this.field3597, arg0);
        class305 var3;
        if (this.field3599) {
            var3 = var2.method1417((byte) -62, -1);
        } else {
            var3 = var2.method1417((byte) -62, this.field3602);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIJ)V", line = 56)
    public final void method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3612++;
        class305 var11 = this.method1376(false);
        if (var11 != null) {
            var11.method363(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3609 = var11.method361();
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI[Ls;)V", line = 93)
    public static final void method1377(byte arg0, int arg1, class171[] arg2) {
        if (arg0 >= -95) {
            return;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class171 var4 = arg2[var3];
            if (var4 != null && var4.field2923 == arg1 && (!var4.field3006 || !client.method357(var4))) {
                if (var4.field2936 == 0) {
                    if (!var4.field3006 && client.method357(var4) && class49.field737 != var4) {
                        continue;
                    }
                    method1377((byte) -128, var4.field3061, arg2);
                    if (var4.field2982 != null) {
                        method1377((byte) -120, var4.field3061, var4.field2982);
                    }
                    class247 var5 = (class247) class276.field4750.method986((long) var4.field3061, 0);
                    if (var5 != null) {
                        class84.method609(var5.field4283, (byte) 127);
                    }
                }
                if (var4.field2936 == 6) {
                    if (var4.field3077 != -1 || var4.field2961 != -1) {
                        boolean var6 = class290.method2040(906, var4);
                        int var7;
                        if (var6) {
                            var7 = var4.field2961;
                        } else {
                            var7 = var4.field3077;
                        }
                        if (var7 != -1) {
                            class2 var8 = class263.method1842(var7, (byte) -114);
                            if (var8 != null) {
                                var4.field2950 += class251.field4329;
                                while (var4.field2950 > var8.field35[var4.field2965]) {
                                    var4.field2950 -= var8.field35[var4.field2965];
                                    var4.field2965++;
                                    if (var8.field41.length <= var4.field2965) {
                                        var4.field2965 -= var8.field14;
                                        if (var4.field2965 < 0 || var8.field41.length <= var4.field2965) {
                                            var4.field2965 = 0;
                                        }
                                    }
                                    class165.method1099((byte) 126, var4);
                                }
                            }
                        }
                    }
                    if (var4.field2926 != 0 && !var4.field3006) {
                        int var9 = var4.field2926 << 16 >> 16;
                        int var10 = class251.field4329 * var9;
                        var4.field2944 = var4.field2944 + var10 & 0x7FF;
                        int var11 = var4.field2926 >> 16;
                        int var12 = class251.field4329 * var11;
                        var4.field2954 = var4.field2954 + var12 & 0x7FF;
                        class165.method1099((byte) 125, var4);
                    }
                }
            }
        }
        field3592++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V", line = 197)
    public final void method1378(int arg0, byte arg1) {
        field3598++;
        if (this.field3599) {
            return;
        }
        this.field3590 += arg0;
        if (arg1 <= 8) {
            return;
        }
        while (this.field3590 > this.field3591.field35[this.field3602]) {
            this.field3590 -= this.field3591.field35[this.field3602];
            this.field3602++;
            if (this.field3602 >= this.field3591.field41.length) {
                this.field3599 = true;
                break;
            }
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZI)Z", line = 224)
    public static final boolean method1379(boolean arg0, int arg1) {
        field3594++;
        if (arg1 < 32) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else {
            if (!arg0) {
                method1377((byte) -56, -29, (class171[]) null);
            }
            return arg1 < 129 || arg1 > 159;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 245)
    public static void method1380(byte arg0) {
        field3606 = null;
        field3603 = null;
        field3607 = null;
        if (arg0 != -54) {
            method1375();
        }
        field3596 = null;
        field3605 = null;
        field3611 = null;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(IIIIIII)V", line = 299)
    public class209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3593 = arg3;
        this.field3604 = arg4;
        this.field3595 = arg1;
        this.field3597 = arg0;
        this.field3600 = arg2;
        this.field3601 = arg5 + arg6;
        int var8 = class149.method1022(this.field3597, false).field3657;
        if (var8 == -1) {
            this.field3599 = true;
        } else {
            this.field3599 = false;
            this.field3591 = class263.method1842(var8, (byte) -114);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()I", line = 273)
    public final int method361() {
        field3610++;
        return this.field3609;
    }
}
