import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fs")
public class class387 extends class337 {

    @OriginalMember(owner = "client!fs", name = "s", descriptor = "I")
    public int field5858;

    @OriginalMember(owner = "client!fs", name = "u", descriptor = "I")
    public int field5860;

    @OriginalMember(owner = "client!fs", name = "v", descriptor = "Llt;")
    public static class475 field5861 = new class475("K", "T", "K", "K");

    @OriginalMember(owner = "client!fs", name = "y", descriptor = "[I")
    public static int[] field5864 = new int[32];

    @OriginalMember(owner = "client!fs", name = "o", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!fs", name = "p", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!fs", name = "q", descriptor = "I")
    public static int field5856;

    @OriginalMember(owner = "client!fs", name = "r", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!fs", name = "t", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!fs", name = "w", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!fs", name = "x", descriptor = "I")
    public static int field5863;

    @OriginalMember(owner = "client!fs", name = "z", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IB)Z", line = 4)
    public final boolean method2359(int arg0, byte arg1) {
        if (arg1 != -10) {
            this.method2367(20);
        }
        field5856++;
        return (this.field5858 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(IZIIII)V", line = 16)
    public static final void method2360(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg0 != 2) {
            method2363(null, true, true);
        }
        field5863++;
        int var6 = arg2 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class402.field6054 - class66.field999) * var6 / 100 + class66.field999;
        if (class484.field7106 > var7) {
            var7 = class484.field7106;
        } else if (var7 > class474.field6977) {
            var7 = class474.field6977;
        }
        int var8 = arg2 * var7 * 512 / (arg4 * 334);
        if (var8 < class412.field6197) {
            short var9 = class412.field6197;
            var7 = arg4 * 334 * var9 / (arg2 * 512);
            if (var7 > class474.field6977) {
                var7 = class474.field6977;
                int var10 = arg2 * var7 * 512 / (var9 * 334);
                int var11 = (arg4 - var10) / 2;
                if (arg1) {
                    class348.field5015.method1112();
                    class348.field5015.method1087(arg5, arg3, 121, arg2, -16777216, var11);
                    class348.field5015.method1087(arg5, arg3 + arg4 - var11, 123, arg2, -16777216, var11);
                }
                arg4 -= var11 * 2;
                arg3 += var11;
            }
        } else if (class9.field124 < var8) {
            short var12 = class9.field124;
            var7 = arg4 * 334 * var12 / (arg2 * 512);
            if (class484.field7106 > var7) {
                var7 = class484.field7106;
                int var13 = arg4 * 334 * var12 / (var7 * 512);
                int var14 = (arg2 - var13) / 2;
                if (arg1) {
                    class348.field5015.method1112();
                    class348.field5015.method1087(arg5, arg3, arg0 ^ 0x7C, var14, -16777216, arg4);
                    class348.field5015.method1087(arg5 + arg2 - var14, arg3, 119, var14, -16777216, arg4);
                }
                arg2 -= var14 * 2;
                arg5 += var14;
            }
        }
        class463.field6863 = arg3;
        class364.field5576 = (short) arg2;
        class409.field6154 = (short) arg4;
        class11.field142 = arg5;
        class293.field4188 = arg2 * var7 / 334;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(B)I", line = 108)
    public final int method2361(byte arg0) {
        if (arg0 <= 67) {
            this.method2361((byte) -10);
        }
        field5862++;
        return class11.method70(this.field5858, 122);
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "(I)Z", line = 122)
    public final boolean method2362(int arg0) {
        if (arg0 != 1894923638) {
            method2366(53);
        }
        field5855++;
        return (this.field5858 >> 22 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fs", name = "<init>", descriptor = "(II)V", line = 136)
    public class387(int arg0, int arg1) {
        this.field5858 = arg0;
        this.field5860 = arg1;
    }

    @OriginalMember(owner = "client!fs", name = "a", descriptor = "([BZZ)Ljava/lang/Object;", line = 146)
    public static final Object method2363(byte[] arg0, boolean arg1, boolean arg2) {
        field5865++;
        if (arg1) {
            field5864 = null;
        }
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class158.field2298) {
            try {
                class91 var3 = (class91) Class.forName("ou").getDeclaredConstructor().newInstance();
                var3.method529(arg0, arg1);
                return var3;
            } catch (Throwable var4) {
                class158.field2298 = true;
            }
        }
        return arg2 ? class530.method3130(arg0, 0) : arg0;
    }

    @OriginalMember(owner = "client!fs", name = "e", descriptor = "(I)Z", line = 178)
    public final boolean method2364(int arg0) {
        field5859++;
        if (arg0 != -1427285771) {
            this.field5858 = 19;
        }
        return ((this.field5858 & 0x28A077) >> 21) != 0;
    }

    @OriginalMember(owner = "client!fs", name = "f", descriptor = "(I)Z", line = 192)
    public final boolean method2365(int arg0) {
        field5854++;
        if (arg0 < 122) {
            this.method2361((byte) 88);
        }
        return (this.field5858 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!fs", name = "g", descriptor = "(I)V", line = 212)
    public static void method2366(int arg0) {
        field5864 = null;
        field5861 = null;
        if (arg0 > -48) {
            field5861 = null;
        }
    }

    @OriginalMember(owner = "client!fs", name = "h", descriptor = "(I)I", line = 223)
    public final int method2367(int arg0) {
        field5857++;
        return arg0 == 1929833 ? (this.field5858 & 0x1D7269) >> 18 : -78;
    }
}
