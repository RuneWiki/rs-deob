import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class207 {

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "[Lpo;")
    public static class558[] field2970 = new class558[16];

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "Lmu;")
    public static class303 field2963 = new class303(70, -2);

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Lmu;")
    public static class303 field2974 = new class303(15, 16);

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "B")
    public byte field2969;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field2968;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "Ljava/lang/String;")
    public String field2965;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "Ljava/lang/String;")
    public String field2971;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "Ljava/lang/String;")
    public String field2972;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "Ljava/lang/String;")
    public String field2973;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1428(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class583 var7 = (class583) class399.field5901.method1301(8); var7 != null; var7 = (class583) class399.field5901.method1307((byte) 0)) {
            if (var7.field7981 <= class641.field8810) {
                var7.method4018(false);
            } else {
                class583.method3339(arg1 >> 1, var7.field7980 * 2, 0, arg6, arg3 >> 1, var7.field7978, (var7.field7982 << 9) + 256, arg2, (var7.field7979 << 9) + 256);
                class168.field2634.method638((byte) 122, arg4 + class339.field4768[0], var7.field7975 | 0xFF000000, var7.field7976, 0, arg5 + class339.field4768[1]);
            }
        }
        field2964++;
        if (arg0 >= -108) {
            field2963 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V")
    public static void method1429(byte arg0) {
        field2974 = null;
        field2963 = null;
        if (arg0 == 51) {
            field2970 = null;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)[Lad;")
    public static final class426[] method1430(int arg0) {
        field2968++;
        if (arg0 > -62) {
            method1431((byte) 66, null);
        }
        return new class426[] { class293.field4105, class215.field3087, class464.field6513, class681.field9229, class515.field7183, class438.field6244, class133.field2238, class558.field7732, class406.field5948, class186.field2801 };
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(BLwea;)[Lb;")
    public static final class335[] method1431(byte arg0, class158 arg1) {
        field2966++;
        if (!arg1.method1221(-4)) {
            return new class335[0];
        }
        int var2 = 52 / ((39 - arg0) / 61);
        class622 var3 = arg1.method1214(972476528);
        while (var3.field8462 == 0) {
            class700.method3916((byte) -97, 10L);
        }
        if (var3.field8462 == 2) {
            return new class335[0];
        }
        int[] var4 = (int[]) var3.field8463;
        class335[] var5 = new class335[var4.length >> 2];
        for (int var6 = 0; var6 < var5.length; var6++) {
            class335 var7 = new class335();
            var5[var6] = var7;
            var7.field4725 = var4[var6 << 2];
            var7.field4732 = var4[(var6 << 2) + 1];
            var7.field4724 = var4[(var6 << 2) + 2];
            var7.field4730 = var4[(var6 << 2) + 3];
        }
        return var5;
    }
}
