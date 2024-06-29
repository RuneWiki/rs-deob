import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class15 extends class64 {

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lid;")
    public class149 field216;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "[I")
    public static int[] field213 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2, 1, 1, 1, 4, 1 };

    @OriginalMember(owner = "client!we", name = "t", descriptor = "Lid;")
    public static class149 field214 = class60.method382("k", (byte) 95);

    @OriginalMember(owner = "client!we", name = "x", descriptor = "Lid;")
    public static class149 field218 = class60.method382("Schlie-8en", (byte) 114);

    @OriginalMember(owner = "client!we", name = "y", descriptor = "Z")
    public static boolean field219 = false;

    @OriginalMember(owner = "client!we", name = "q", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!we", name = "r", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!we", name = "u", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!we", name = "A", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!we", name = "z", descriptor = "[[I")
    public static int[][] field220;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)Lce;")
    public static final class216 method93(int arg0) {
        if (arg0 > -15) {
            return null;
        }
        field215++;
        class216 var1 = (class216) class16.field225.method426(104);
        if (var1 != null) {
            var1.method401((byte) -118);
            var1.method1230(24120);
            return var1;
        }
        class216 var2;
        do {
            var2 = (class216) class90.field1612.method426(104);
            if (var2 == null) {
                return null;
            }
            if (var2.method1458((byte) -34) > class81.method608(19644)) {
                return null;
            }
            var2.method401((byte) -118);
            var2.method1230(24120);
        } while ((var2.field3174 & Long.MIN_VALUE) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)Log;")
    public static final class219 method94(int arg0, int arg1) {
        field217++;
        class219 var2 = (class219) class27.field406.method1293((long) arg1, false);
        if (var2 != null) {
            return var2;
        } else if (arg0 == 31473) {
            byte[] var3 = class188.field3369.method1562(-809612665, class23.method130(arg1, (byte) -95), class26.method151(arg1, (byte) -80));
            class219 var4 = new class219();
            if (var3 != null) {
                var4.method1481(new class74(var3), 16609);
            }
            class27.field406.method1295((long) arg1, var4, (byte) -71);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static void method95(int arg0) {
        field218 = null;
        if (arg0 <= -24) {
            field214 = null;
            field213 = null;
            field220 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(ILaj;)V")
    public static final void method96(int arg0, class47 arg1) {
        field212++;
        if (arg0 != 12449) {
            field219 = false;
        }
        int var2 = arg1.field820;
        if (var2 == 324) {
            if (class254.field4446 == -1) {
                class95.field1678 = arg1.field809;
                class254.field4446 = arg1.field758;
            }
            if (class36.field533.field3476) {
                arg1.field758 = class254.field4446;
            } else {
                arg1.field758 = class95.field1678;
            }
        } else if (var2 == 325) {
            if (class254.field4446 == -1) {
                class95.field1678 = arg1.field809;
                class254.field4446 = arg1.field758;
            }
            if (class36.field533.field3476) {
                arg1.field758 = class95.field1678;
            } else {
                arg1.field758 = class254.field4446;
            }
        } else if (var2 == 327) {
            arg1.field863 = 150;
            arg1.field697 = (int) (Math.sin((double) class118.field2022 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field862 = 5;
            arg1.field716 = -1;
        } else if (var2 == 328) {
            if (class77.field1449.field2243 == null) {
                arg1.field716 = 0;
            } else {
                arg1.field863 = 150;
                arg1.field697 = (int) (Math.sin((double) class118.field2022 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field862 = 5;
                arg1.field716 = ((int) class77.field1449.field2243.method1023((byte) -16) << 11) + 2047;
                arg1.field831 = 0;
                arg1.field790 = class77.field1449.field2372;
                arg1.field736 = class77.field1449.field2336;
                arg1.field807 = class77.field1449.field2334;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "()V")
    public class15() {
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lid;)V")
    public class15(class149 arg0) {
        this.field216 = arg0;
    }
}
