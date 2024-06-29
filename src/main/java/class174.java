import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class174 {

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "Z")
    public boolean field2299;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ada", name = "d", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!ada", name = "g", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "Lkm;")
    public class373 field2298;

    @OriginalMember(owner = "client!ada", name = "e", descriptor = "Lkm;")
    public class373 field2301;

    @OriginalMember(owner = "client!ada", name = "f", descriptor = "Z")
    public boolean field2302;

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(B)V", line = 3)
    public final void method1197(byte arg0) {
        if (this.field2298 != null) {
            this.field2298.method851(-21765);
        }
        field2300++;
        if (arg0 >= 60) {
            this.field2302 = false;
        }
    }

    @OriginalMember(owner = "client!ada", name = "b", descriptor = "(B)Z", line = 23)
    public final boolean method1198(byte arg0) {
        field2303++;
        if (arg0 == -124) {
            return this.field2302 && !this.field2299;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ada", name = "c", descriptor = "(B)Z", line = 34)
    public static final boolean method1199(byte arg0) {
        field2297++;
        if (arg0 < 122) {
            return true;
        }
        boolean var1 = true;
        if (class738.field10017 == null) {
            if (class490.field6826.method1185(class626.field8487, 9330)) {
                class738.field10017 = class162.method1129(class490.field6826, class626.field8487);
            } else {
                var1 = false;
            }
        }
        if (class411.field5838 == null) {
            if (class490.field6826.method1185(class224.field2914, 9330)) {
                class411.field5838 = class162.method1129(class490.field6826, class224.field2914);
            } else {
                var1 = false;
            }
        }
        if (class351.field5124 == null) {
            if (class490.field6826.method1185(class635.field8579, 9330)) {
                class351.field5124 = class162.method1129(class490.field6826, class635.field8579);
            } else {
                var1 = false;
            }
        }
        if (class661.field8893 == null) {
            if (class410.field5827.method1185(class315.field4442, 9330)) {
                class661.field8893 = class588.method3309(true, class315.field4442, class410.field5827);
            } else {
                var1 = false;
            }
        }
        if (class400.field5719 == null) {
            if (class490.field6826.method1185(class315.field4442, 9330)) {
                class400.field5719 = class162.method1124(class490.field6826, class315.field4442);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!ada", name = "a", descriptor = "(I)I", line = 108)
    public static final int method1200(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class496.field6975 - 1; var2++) {
            if (arg0 < class641.field8642[var2] + class533.field7398[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class496.field6975 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!ada", name = "<init>", descriptor = "(Z)V", line = 131)
    public class174(boolean arg0) {
        this.field2299 = arg0;
    }
}
