import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class124 {

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public int field2174 = -1;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "Z")
    public boolean field2175 = true;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    private int field2159 = 0;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public int field2171 = 128;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "Lhi;")
    public static class82 field2162 = class95.method664((byte) -63, "; version=1; path=)4; domain=");

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Z")
    public static boolean field2166 = false;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Lhi;")
    public static class82 field2173 = class95.method664((byte) -35, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!w", name = "g", descriptor = "Lhi;")
    public static class82 field2165 = class95.method664((byte) -64, "um");

    @OriginalMember(owner = "client!w", name = "s", descriptor = "Lhi;")
    public static class82 field2177 = class95.method664((byte) -101, "vert:");

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public int field2163;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field2170;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field2179;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "[S")
    public static short[] field2178;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V", line = 17)
    public static final void method845(int arg0) {
        field2164++;
        class263.field4493.method2168(0);
        class149.field2525.method2168(0);
        if (arg0 >= -76) {
            field2166 = false;
        }
        class164.field2861.method2168(0);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V", line = 30)
    public static final void method846(byte arg0) {
        field2176++;
        class166.field2899.method2172(false);
        if (arg0 <= -124) {
            class28.field383.method2172(false);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIILme;)V", line = 43)
    public static final void method847(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class75 arg7) {
        if (class199.field3403) {
            class245.field4253 = 32;
        } else {
            class245.field4253 = 0;
        }
        class199.field3403 = false;
        if (class272.field4579 != 0) {
            if (arg4 <= arg2 && arg2 < arg4 + 16 && arg3 >= arg6 && arg6 + 16 > arg3) {
                arg7.field1188 -= 4;
                class138.method937(arg7, 16);
            } else if (arg2 >= arg4 && arg2 < arg4 + 16 && (arg5 + arg6 - 16) <= arg3 && (arg5 + arg6) > arg3) {
                arg7.field1188 += 4;
                class138.method937(arg7, 16);
            } else if ((arg4 - class245.field4253) <= arg2 && (class245.field4253 + arg4 + 16) > arg2 && arg6 + 16 <= arg3 && arg6 + arg5 - 16 > arg3) {
                int var8 = (arg5 - 32) * arg5 / arg1;
                if (var8 < 8) {
                    var8 = 8;
                }
                int var9 = arg5 - var8 - 32;
                int var10 = arg3 - arg6 - (var8 / 2) - 16;
                arg7.field1188 = (arg1 - arg5) * var10 / var9;
                class138.method937(arg7, 16);
                class199.field3403 = true;
            }
        }
        if (arg0 != 45) {
            return;
        }
        field2169++;
        if (class4.field39 == 0) {
            return;
        }
        int var11 = arg7.field1216;
        if (arg4 - var11 <= arg2 && arg6 <= arg3 && arg4 + 16 > arg2 && arg3 <= (arg5 + arg6)) {
            arg7.field1188 += class4.field39 * 45;
            class138.method937(arg7, arg0 ^ 0x3D);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILbc;I)V", line = 112)
    private final void method848(int arg0, int arg1, class153 arg2, int arg3) {
        if (arg1 != 4) {
            return;
        }
        if (arg0 == 1) {
            this.field2159 = arg2.method1107((byte) 82);
            this.method849(0, this.field2159);
        } else if (arg0 == 2) {
            this.field2174 = arg2.method1090(false);
            if (this.field2174 == 65535) {
                this.field2174 = -1;
            }
        } else if (arg0 == 3) {
            this.field2171 = arg2.method1090(false);
        } else if (arg0 == 4) {
            this.field2175 = false;
        }
        field2160++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)V", line = 150)
    private final void method849(int arg0, int arg1) {
        field2161++;
        double var3 = 0.0D;
        double var5 = (double) (arg1 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var9 = (double) ((arg1 & 0xFF48) >> 8) / 256.0D;
        double var11 = var7;
        double var13 = 0.0D;
        if (var7 < var9) {
            var11 = var9;
        }
        if (var5 > var11) {
            var11 = var5;
        }
        double var15 = var7;
        if (var7 > var9) {
            var15 = var9;
        }
        if (var5 < var15) {
            var15 = var5;
        }
        double var17 = (var11 + var15) / 2.0D;
        if (var11 != var15) {
            if (var17 < 0.5D) {
                var13 = (var11 - var15) / (var11 + var15);
            }
            if (var7 == var11) {
                var3 = (var9 - var5) / (var11 - var15);
            } else if (var9 == var11) {
                var3 = (var5 - var7) / (var11 - var15) + 2.0D;
            } else if (var5 == var11) {
                var3 = (var7 - var9) / (var11 - var15) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var15) / (2.0D - var11 - var15);
            }
        }
        if (var17 > 0.5D) {
            this.field2172 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field2172 = (int) (var13 * var17 * 512.0D);
        }
        this.field2167 = (int) (var17 * 256.0D);
        this.field2163 = (int) (var13 * 256.0D);
        if (this.field2167 < arg0) {
            this.field2167 = 0;
        } else if (this.field2167 > 255) {
            this.field2167 = 255;
        }
        double var19 = var3 / 6.0D;
        if (this.field2163 < 0) {
            this.field2163 = 0;
        } else if (this.field2163 > 255) {
            this.field2163 = 255;
        }
        if (this.field2172 < 1) {
            this.field2172 = 1;
        }
        this.field2179 = (int) ((double) this.field2172 * var19);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lbc;BI)V", line = 243)
    public final void method850(class153 arg0, byte arg1, int arg2) {
        if (arg1 != 4) {
            method847(31, -117, 90, -20, 114, 62, 60, (class75) null);
        }
        field2168++;
        while (true) {
            int var4 = arg0.method1082(-99);
            if (var4 == 0) {
                return;
            }
            this.method848(var4, arg1 ^ 0x0, arg0, arg2);
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(B)V", line = 290)
    public static void method851(byte arg0) {
        field2177 = null;
        field2173 = null;
        field2162 = null;
        field2165 = null;
        field2178 = null;
        if (arg0 != 51) {
            field2177 = (class82) null;
        }
    }
}
