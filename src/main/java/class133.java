import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class133 {

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Ljava/lang/String;")
    public static String field2032 = "Examine";

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2029 = "green:";

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "[I")
    public static int[] field2028;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIBII)V", line = 32)
    public static final void method1028(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2025++;
        class130 var5 = (class130) class29.field355.method1716(-1, (long) arg3);
        if (arg2 != 95) {
            field2026 = 10;
        }
        if (var5 == null) {
            var5 = new class130();
            class29.field355.method1708((long) arg3, (byte) -79, var5);
        }
        if (var5.field1995.length <= arg1) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field1995.length; var8++) {
                var6[var8] = var5.field1995[var8];
                var7[var8] = var5.field1998[var8];
            }
            for (int var9 = var5.field1995.length; var9 < arg1; var9++) {
                var6[var9] = -1;
                var7[var9] = 0;
            }
            var5.field1995 = var6;
            var5.field1998 = var7;
        }
        var5.field1995[arg1] = arg4;
        var5.field1998[arg1] = arg0;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZII)V", line = 95)
    public static final void method1029(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class151.field2296 = arg2;
        field2031++;
        class167.field2704 = arg5;
        class298.field4591 = arg4;
        class269.field4181 = arg1;
        class273.field4265 = arg0;
        if (class269.field4181 >= 100) {
            int var6 = class167.field2704 * 128 + 64;
            int var7 = class151.field2296 * 128 + 64;
            int var8 = class328.method2291(class265.field4112, var7, var6, 78) - class298.field4591;
            int var9 = var8 - class7.field111;
            int var10 = var6 - class190.field2976;
            int var11 = var7 - class197.field3028;
            int var12 = (int) Math.sqrt((double) (var10 * var10 + (var11 * var11)));
            class193.field3015 = (int) (Math.atan2((double) var9, (double) var12) * 325.949D) & 0x7FF;
            class200.field3047 = (int) (Math.atan2((double) var10, (double) var11) * -325.949D) & 0x7FF;
            if (class193.field3015 < 128) {
                class193.field3015 = 128;
            }
            if (class193.field3015 > 383) {
                class193.field3015 = 383;
            }
        }
        class268.field4168 = 2;
        if (!arg3) {
            method1029(67, 37, -99, false, -19, -45);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z)V", line = 148)
    public static void method1030(boolean arg0) {
        field2029 = null;
        field2028 = null;
        if (!arg0) {
            field2032 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(Z)Lpa;", line = 177)
    public static final class163 method1031(boolean arg0) {
        field2033++;
        if (arg0) {
            field2032 = (String) null;
        }
        return class157.field2393.length <= class227.field3465 ? null : class157.field2393[class227.field3465++];
    }
}
