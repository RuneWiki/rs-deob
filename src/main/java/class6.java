import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class6 extends class246 {

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "I")
    private final int field111;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "I")
    private final int field104;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "I")
    private final int field116;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    private final int field109;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "Lhh;")
    public static class163 field107 = class137.method1065("::fpson", 17);

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Lhh;")
    public static class163 field112 = class137.method1065("Bitte entfernen Sie ", 17);

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field108 = 0;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "[I")
    public static int[] field114 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field102;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field103;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field113;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "Z")
    public static boolean field118;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)V")
    public final void method42(int arg0, int arg1, int arg2) {
        ++field110;
        if (arg0 >= -17) {
            method48(-39, 114, 42);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BI)V")
    public static final void method43(byte arg0, int arg1) {
        int var2 = -54 % ((29 - arg0) / 47);
        class250.field4400.method112(arg1, 118);
        ++field102;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(BII)V")
    public final void method44(byte arg0, int arg1, int arg2) {
        ++field106;
        int var4 = this.field116 * arg1 >> 12;
        int var5 = this.field111 * arg1 >> 12;
        int var6 = this.field109 * arg2 >> 12;
        int var7 = this.field104 * arg2 >> 12;
        class1.method6(928944748, var5, var7, var4, super.field4342, var6);
        if (arg0 != 6) {
            method47(true);
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V")
    public static final void method45(int arg0) {
        class33.field502.method82(arg0 + -524279);
        ++field113;
        int var1 = class33.field502.method74((byte) -98, 1);
        if (~var1 != -1) {
            if (arg0 != 524287) {
                method48(48, 39, 125);
            }
            int var2 = class33.field502.method74((byte) 79, 2);
            if (~var2 == -1) {
                class124.field2392[class222.field4040++] = 2047;
            } else if (var2 == 1) {
                int var3 = class33.field502.method74((byte) -101, 3);
                class235.field4203.method1446(false, false, var3);
                int var4 = class33.field502.method74((byte) 101, 1);
                if (var4 == 1) {
                    class124.field2392[class222.field4040++] = 2047;
                }
            } else if (var2 == 2) {
                int var5 = class33.field502.method74((byte) 126, 3);
                class235.field4203.method1446(false, true, var5);
                int var6 = class33.field502.method74((byte) 104, 3);
                class235.field4203.method1446(false, true, var6);
                int var7 = class33.field502.method74((byte) -118, 1);
                if (~var7 == -2) {
                    class124.field2392[class222.field4040++] = 2047;
                }
            } else if (~var2 == -4) {
                int var8 = class33.field502.method74((byte) -112, 7);
                int var9 = class33.field502.method74((byte) 107, 7);
                int var10 = class33.field502.method74((byte) 104, 1);
                if (~var10 == -2) {
                    class124.field2392[class222.field4040++] = 2047;
                }
                int var11 = class33.field502.method74((byte) 96, 1);
                class20.field323 = class33.field502.method74((byte) 61, 2);
                class235.field4203.method1444(var8, 107, var9, ~var11 == -2);
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(III)V")
    public final void method46(int arg0, int arg1, int arg2) {
        ++field117;
        if (arg1 != 2) {
            field108 = 29;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(IIIIII)V")
    public class6(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field111 = arg2;
        this.field104 = arg3;
        this.field116 = arg0;
        this.field109 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)V")
    public static void method47(boolean arg0) {
        if (!arg0) {
            field114 = null;
        }
        field112 = null;
        field107 = null;
        field114 = null;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(III)I")
    public static final int method48(int arg0, int arg1, int arg2) {
        ++field105;
        if (arg0 != -1201173953) {
            field118 = false;
        }
        int var3 = arg2 >>> 31;
        return (arg2 + var3) / arg1 + -var3;
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(II)V")
    public static final void method49(int arg0, int arg1) {
        class197 var2 = (class197) class76.field1427.method1743((long) arg1, false);
        ++field115;
        if (arg0 == 33554431) {
            if (var2 != null) {
                var2.method1063(arg0 ^ 33554347);
            }
        }
    }
}
