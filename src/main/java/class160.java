import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class160 {

    @OriginalMember(owner = "client!l", name = "j", descriptor = "Ldk;")
    private class275 field2832 = new class275(256);

    @OriginalMember(owner = "client!l", name = "n", descriptor = "Ldk;")
    private class275 field2836 = new class275(256);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lpk;")
    private class99 field2826;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lpk;")
    private class99 field2827;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lbf;")
    public static class199 field2830 = new class199(64);

    @OriginalMember(owner = "client!l", name = "p", descriptor = "I")
    public static int field2838 = 0;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "[I")
    public static int[] field2840 = new int[5];

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Lqk;")
    public static class207 field2841 = class24.method212(255, ":assistreq:");

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Lqk;")
    public static class207 field2843 = class24.method212(255, "D-Bmarrage de la librairie 3D");

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field2844 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2824;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2825;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2828;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field2829;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field2831;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lpk;")
    public static class99 field2837;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "Lpk;")
    public static class99 field2839;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIILdc;IJ)Z")
    public static final boolean method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class235 arg6, int arg7, long arg8) {
        if (arg6 == null) {
            return true;
        } else {
            int var10 = arg1 * 128 + arg4 * 64;
            int var11 = arg2 * 128 + arg5 * 64;
            return class72.method520(arg0, arg1, arg2, arg4, arg5, var10, var11, arg3, arg6, arg7, false, arg8);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([III)Lme;")
    public final class222 method1162(int[] arg0, int arg1, int arg2) {
        field2833++;
        if (arg1 != -26967) {
            field2841 = null;
        }
        if (this.field2827.method720(19680) == 1) {
            return this.method1163(0, arg0, true, arg2);
        } else if (this.field2827.method698(7, arg2) == 1) {
            return this.method1163(arg2, arg0, true, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[IZI)Lme;")
    private final class222 method1163(int arg0, int[] arg1, boolean arg2, int arg3) {
        field2828++;
        int var5 = arg3 ^ (arg0 >>> 12 | arg0 << 4 & 0xFFFB);
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class222 var9 = (class222) this.field2836.method1867(var7, arg2);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class29 var10 = (class29) this.field2832.method1867(var7, arg2);
            if (var10 == null) {
                var10 = class29.method224(this.field2827, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field2832.method1863((byte) -118, var10, var7);
            }
            class222 var11 = var10.method231(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1346((byte) -16);
                this.field2836.method1863((byte) 39, var11, var7);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)Z")
    public static final boolean method1164(int arg0, int arg1) {
        if (arg0 <= 109) {
            method1167(-84, -57);
        }
        field2829++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I[III)Lme;")
    private final class222 method1165(int arg0, int[] arg1, int arg2, int arg3) {
        field2823++;
        int var5 = arg3 ^ (arg2 >>> 12 | (arg2 & 0xB0000FFF) << 4);
        int var6 = var5 | arg2 << 16;
        if (arg0 != 0) {
            return null;
        }
        long var7 = (long) var6;
        class222 var9 = (class222) this.field2836.method1867(var7, true);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class76 var10 = class76.method548(this.field2826, arg2, arg3);
            if (var10 == null) {
                return null;
            }
            class222 var11 = var10.method547();
            this.field2836.method1863((byte) 114, var11, var7);
            if (arg1 != null) {
                arg1[0] -= var11.field4070.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static final void method1166(byte arg0) {
        if (class272.field4796 == 2) {
            if (class16.field261 == class105.field1870 && class27.field550 == class21.field346) {
                class272.field4796 = 0;
                if (class51.field997 && class165.field2920[81] && class268.field4751 > 2) {
                    class157.method1150(class268.field4751 - 2, (byte) 124);
                } else {
                    class157.method1150(class268.field4751 - 1, (byte) 119);
                }
            }
        } else if (class16.field261 == class121.field2092 && class47.field939 == class21.field346) {
            class272.field4796 = 0;
            if (class51.field997 && class165.field2920[81] && class268.field4751 > 2) {
                class157.method1150(class268.field4751 - 2, (byte) 109);
            } else {
                class157.method1150(class268.field4751 - 1, (byte) 103);
            }
        } else {
            class105.field1870 = class121.field2092;
            class27.field550 = class47.field939;
            class272.field4796 = 2;
        }
        field2825++;
        if (arg0 != 64) {
            method1164(-97, 101);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)V")
    public static final void method1167(int arg0, int arg1) {
        class26.field535 = 20;
        class201.field3556 = arg1;
        class78.field1430 = 3;
        field2831++;
        if (arg0 < 93) {
            method1169(false);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[I)Lme;")
    public final class222 method1168(int arg0, int arg1, int[] arg2) {
        field2824++;
        if (this.field2826.method720(arg0 ^ 0x4CE0) == 1) {
            return this.method1165(0, arg2, 0, arg1);
        } else if (this.field2826.method698(7, arg1) == 1) {
            return this.method1165(0, arg2, arg1, 0);
        } else {
            if (arg0 != 0) {
                field2844 = 102;
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method1169(boolean arg0) {
        field2837 = null;
        if (!arg0) {
            return;
        }
        field2830 = null;
        field2840 = null;
        field2841 = null;
        field2843 = null;
        field2839 = null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lpk;Lpk;)V")
    public class160(class99 arg0, class99 arg1) {
        this.field2826 = arg0;
        this.field2827 = arg1;
    }
}
