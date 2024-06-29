import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class173 {

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "Ldf;")
    private class231 field2915 = new class231(256);

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Ldf;")
    private class231 field2922 = new class231(256);

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "Lbk;")
    private class136 field2919;

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "Lbk;")
    private class136 field2911;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lqj;")
    public static class196 field2910 = class80.method502(" x ", -48);

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public static int field2913 = 0;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public static int field2921 = 0;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "Lqj;")
    private static class196 field2912 = class80.method502("You can(Wt add yourself to your own ignore list)3", -48);

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "Lqj;")
    public static class196 field2909 = field2912;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "[I")
    public static int[] field2914;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([III)Lfj;")
    public final class89 method1129(int[] arg0, int arg1, int arg2) {
        field2918++;
        if (arg1 >= -27) {
            return null;
        } else if (this.field2911.method834((byte) 112) == 1) {
            return this.method1133(arg2, -19807, 0, arg0);
        } else if (this.field2911.method831(-12858, arg2) == 1) {
            return this.method1133(0, -19807, arg2, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "([IZII)Lfj;")
    private final class89 method1130(int[] arg0, boolean arg1, int arg2, int arg3) {
        if (!arg1) {
            method1132(100, -34, -71, true, -88, 58);
        }
        field2917++;
        int var5 = ((arg3 & 0x50000FFF) << 4 | arg3 >>> 12) ^ arg2;
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class89 var9 = (class89) this.field2922.method1551(32768, var7);
        if (var9 != null) {
            return var9;
        } else if (arg0 == null || arg0[0] > 0) {
            class115 var10 = class115.method701(this.field2919, arg3, arg2);
            if (var10 == null) {
                return null;
            }
            class89 var11 = var10.method702();
            this.field2922.method1552(var11, var7, 0);
            if (arg0 != null) {
                arg0[0] -= var11.field1305.length;
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[II)Lfj;")
    public final class89 method1131(int arg0, int[] arg1, int arg2) {
        field2920++;
        if (this.field2919.method834((byte) 125) == 1) {
            return this.method1130(arg1, true, arg0, 0);
        } else if (this.field2919.method831(-12858, arg0) == 1) {
            return this.method1130(arg1, true, 0, arg0);
        } else if (arg2 == 30460) {
            throw new RuntimeException();
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIZII)V")
    public static final void method1132(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class232.field4133 = arg1;
        class52.field653 = arg2;
        class210.field3788 = arg4;
        class252.field4461 = arg0;
        class22.field276 = arg5;
        if (!arg3) {
            method1132(-94, 93, 110, false, 72, 126);
        }
        field2908++;
        if (class22.field276 >= 100) {
            int var6 = class210.field3788 * 128 + 64;
            int var7 = class52.field653 * 128 + 64;
            int var8 = class74.method470(var7, class27.field335, 103, var6) - class232.field4133;
            int var9 = var6 - class13.field151;
            int var10 = var7 - class25.field321;
            int var11 = var8 - class132.field1889;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class149.field2396 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class185.field3232 = (int) (-325.949D * Math.atan2((double) var9, (double) var10)) & 0x7FF;
            if (class149.field2396 < 128) {
                class149.field2396 = 128;
            }
            if (class149.field2396 > 383) {
                class149.field2396 = 383;
            }
        }
        class202.field3597 = 2;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(III[I)Lfj;")
    private final class89 method1133(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (arg2 >>> 12 | arg2 << 4 & 0xFFF6) ^ arg0;
        int var6 = var5 | arg2 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        field2916++;
        class89 var9 = (class89) this.field2922.method1551(32768, var7);
        if (var9 != null) {
            return var9;
        } else if (arg3 == null || arg3[0] > 0) {
            class162 var10 = (class162) this.field2915.method1551(32768, var7);
            if (var10 == null) {
                var10 = class162.method1021(this.field2911, arg2, arg0);
                if (var10 == null) {
                    return null;
                }
                this.field2915.method1552(var10, var7, 0);
            }
            class89 var11 = var10.method1020(arg3);
            if (var11 == null) {
                return null;
            } else {
                var10.method797((byte) 109);
                this.field2922.method1552(var11, var7, arg1 ^ arg1);
                return var11;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(B)V")
    public static void method1134(byte arg0) {
        field2909 = null;
        field2914 = null;
        field2910 = null;
        field2912 = null;
        if (arg0 != 35) {
            field2909 = null;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "(Lbk;Lbk;)V")
    public class173(class136 arg0, class136 arg1) {
        this.field2919 = arg0;
        this.field2911 = arg1;
    }
}
