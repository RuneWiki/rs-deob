import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class212 extends class376 {

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public int field3184 = -1;

    @OriginalMember(owner = "client!ti", name = "G", descriptor = "I")
    public int field3190 = -1;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "Lpf;")
    public static class425 field3181 = new class425(23, 4);

    @OriginalMember(owner = "client!ti", name = "F", descriptor = "[I")
    public static int[] field3189 = new int[3];

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "Ljava/lang/String;")
    public static String field3187 = "";

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "Lsf;")
    public static class398 field3185 = new class398();

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "Z")
    public static boolean field3194 = false;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field3178;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public int field3179;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "I")
    public int field3182;

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "I")
    public int field3183;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field3188;

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!ti", name = "I", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "Z")
    public static boolean field3193;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "[I")
    public static int[] field3196;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZIB)V")
    public static final void method1240(boolean arg0, int arg1, byte arg2) {
        ++field3186;
        if (arg2 != 67) {
            field3185 = null;
        }
        class148 var3 = class432.method2655((byte) 113, arg0, arg1);
        if (var3 != null) {
            var3.method625((byte) -50);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method1241(byte arg0) {
        field3181 = null;
        field3189 = null;
        field3185 = null;
        field3187 = null;
        if (arg0 != 77) {
            field3195 = 55;
        }
        field3196 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        ++field3178;
        class361 var5 = arg2.method434();
        if (arg3 != 2) {
            this.method10((class261) null, 9);
        }
        var5.method611(super.field5481, super.field5490, super.field5488);
        class292 var6 = class186.field2796.method1106(50, this.field3183).method1006(this.field3182, 65536, 0, arg2, (byte) 82, 0, -1, (class379) null, (class128) null);
        if (var6 != null && var6.method1297(arg0, arg1, var5, true)) {
            return true;
        } else {
            if (this.field3184 != -1) {
                class292 var7 = class186.field2796.method1106(50, this.field3184).method1006(this.field3179, 65536, 0, arg2, (byte) 79, 0, -1, (class379) null, (class128) null);
                if (var7 != null && var7.method1297(arg0, arg1, var5, true)) {
                    return true;
                }
            }
            if (this.field3190 != -1) {
                class292 var8 = class186.field2796.method1106(50, this.field3190).method1006(this.field3191, 65536, 0, arg2, (byte) 109, 0, -1, (class379) null, (class128) null);
                if (var8 != null && var8.method1297(arg0, arg1, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field3180;
        class361 var3 = arg0.method434();
        var3.method611(super.field5481, super.field5490, super.field5488);
        class70 var4 = class383.method2309(-90, 3);
        if (~this.field3190 != 0) {
            class292 var5 = class186.field2796.method1106(arg1 ^ 53, this.field3190).method1006(this.field3191, 1024, 0, arg0, (byte) 78, 0, -1, (class379) null, (class128) null);
            if (var5 != null) {
                var5.method1282(var3, var4.field899[2], 0);
            }
        }
        if (arg1 != 7) {
            field3187 = null;
        }
        if (this.field3184 != -1) {
            class292 var6 = class186.field2796.method1106(50, this.field3184).method1006(this.field3179, 1024, 0, arg0, (byte) 118, 0, -1, (class379) null, (class128) null);
            if (var6 != null) {
                var6.method1282(var3, var4.field899[1], 0);
            }
        }
        class292 var7 = class186.field2796.method1106(50, this.field3183).method1006(this.field3182, 1024, 0, arg0, (byte) 96, 0, -1, (class379) null, (class128) null);
        if (var7 != null) {
            var7.method1282(var3, var4.field899[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        if (arg1 >= 114) {
            ++field3192;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(II)V")
    public static final void method1242(int arg0, int arg1) {
        class306.field4627.method1481(3, arg1);
        if (arg0 != -17088) {
            method1241((byte) -82);
        }
        ++field3188;
    }
}
