import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class194 extends RuntimeException {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field2318;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "Ljava/lang/String;")
    public String field2322;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "[I")
    public static int[] field2320 = new int[1];

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "I")
    public static int field2326 = -1;

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "Lfc;")
    public static class262 field2325 = new class262(64);

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "Lhba;")
    public static class10 field2324;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIII)V")
    public static final void method1078(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class29.field238 >= arg3 && arg1 >= class759.field10576) {
            boolean var6;
            if (class122.field1604 > arg2) {
                var6 = false;
                arg2 = class122.field1604;
            } else if (class165.field2070 >= arg2) {
                var6 = true;
            } else {
                arg2 = class165.field2070;
                var6 = false;
            }
            boolean var7;
            if (arg4 < class122.field1604) {
                var7 = false;
                arg4 = class122.field1604;
            } else if (arg4 <= class165.field2070) {
                var7 = true;
            } else {
                arg4 = class165.field2070;
                var7 = false;
            }
            if (arg3 < class759.field10576) {
                arg3 = class759.field10576;
            } else {
                class168.method980(arg5, class300.field4036[arg3++], arg2, arg4, (byte) 113);
            }
            if (arg1 > class29.field238) {
                arg1 = class29.field238;
            } else {
                class168.method980(arg5, class300.field4036[arg1--], arg2, arg4, (byte) 26);
            }
            if (var6 && var7) {
                for (int var8 = arg3; var8 <= arg1; var8++) {
                    int[] var9 = class300.field4036[var8];
                    var9[arg2] = var9[arg4] = arg5;
                }
            } else if (var6) {
                for (int var11 = arg3; var11 <= arg1; var11++) {
                    class300.field4036[var11][arg2] = arg5;
                }
            } else if (var7) {
                for (int var10 = arg3; var10 <= arg1; var10++) {
                    class300.field4036[var10][arg4] = arg5;
                }
            }
        }
        field2327++;
        if (arg0 != -31085) {
            method1080(false);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public static final void method1079(int arg0) {
        if (class167.field2098 >= 0) {
            long var1 = class538.method2963(-47);
            class167.field2098 = (int) ((long) class167.field2098 - (var1 - class742.field10332));
            if (class167.field2098 <= 0) {
                class324.field4353 = class487.field6680.field4186;
                class357.field4745 = class487.field6680.field4175;
                class406.field5730 = class487.field6680.field4185;
                class105.field1406 = class487.field6680.field4178;
                class274.field3665 = class487.field6680.field4184;
                class167.field2098 = -1;
                class402.field5681 = class487.field6680.field4181;
                class403.field5689 = class487.field6680.field4189;
                class464.field6427 = class487.field6680.field4183;
                class681.field9487 = class487.field6680.field4191;
                class300.field4058 = class487.field6680.field4187;
            } else {
                int var3 = (class167.field2098 << 8) / class354.field4733;
                int var4 = 255 - var3;
                float var5 = (float) var3 / 255.0F;
                float var6 = 1.0F - var5;
                class324.field4353 = ((class688.field9648 & 0xFF00) * var3 + ((class487.field6680.field4186 & 0xFF00) * var4) & 0xFF0000) + ((class688.field9648 & 0xFF00FF) * var3 + (class487.field6680.field4186 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class403.field5689 = (class487.field6680.field4189 - class149.field1906) * var6 + class149.field1906;
                class406.field5730 = (class487.field6680.field4185 - class165.field2071) * var6 + class165.field2071;
                class300.field4058 = (class487.field6680.field4187 - class192.field2310) * var6 + class192.field2310;
                class681.field9487 = (class487.field6680.field4191 - class469.field6486) * var6 + class469.field6486;
                class357.field4745 = (class487.field6680.field4175 - class232.field2993) * var6 + class232.field2993;
                class402.field5681 = ((class594.field8282 & 0xFF00) * var3 + ((class487.field6680.field4181 & 0xFF00) * var4) & 0xFF0000) + ((class594.field8282 & 0xFF00FF) * var3 + (class487.field6680.field4181 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
                class105.field1406 = class109.field1446 * var3 + class487.field6680.field4178 * var4 >> 8;
                class274.field3665 = (class487.field6680.field4184 - class591.field8249) * var6 + class591.field8249;
                if (class633.field8793 != class487.field6680.field4183) {
                    class464.field6427 = class395.field5617.method378(class633.field8793, class487.field6680.field4183, var6, class464.field6427);
                }
            }
            class742.field10332 = var1;
        }
        if (arg0 > -36) {
            method1078(24, 114, 12, -24, 33, -8);
        }
        field2319++;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class194(Throwable arg0, String arg1) {
        this.field2318 = arg0;
        this.field2322 = arg1;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Z)I")
    public static final int method1080(boolean arg0) {
        field2323++;
        if (!arg0) {
            method1078(46, -81, -49, 16, 90, -120);
        }
        return class633.field8786.method1169((byte) 3);
    }

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
    public static void method1081(int arg0) {
        field2320 = null;
        field2324 = null;
        if (arg0 == 16711935) {
            field2325 = null;
        }
    }
}
