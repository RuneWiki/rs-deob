import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class168 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field3085;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "Z")
    public static boolean field3082;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
    public static final void method1258(int arg0, int arg1) {
        field3079++;
        if (class157.field2919 == arg0) {
            class115.field2191.method714(-9352, arg1);
        } else {
            class49.field817 = arg1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V")
    public static final void method1259(byte arg0) {
        for (int var1 = 0; var1 < class222.field4040; var1++) {
            int var2 = class124.field2392[var1];
            class2 var3 = class111.field2098[var2];
            int var4 = class33.field502.method622(true);
            if ((var4 & 0x10) != 0) {
                var3.field3623 = class33.field502.method605(true);
                var3.field3681 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var5 = class33.field502.method611(true);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class33.field502.method622(true);
                class94.method746(-126, var3, var5, var6);
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field41.method1324(true)) {
                    class54.method368(var3, 30754);
                }
                var3.field41 = class220.method1556(class33.field502.method658(67), true);
                var3.field3635 = var3.field41.field3303;
                var3.field3679 = var3.field41.field3332;
                var3.field3645 = var3.field41.field3274;
                var3.field3648 = var3.field41.field3281;
                var3.field3670 = var3.field41.field3312;
                var3.field3656 = var3.field41.field3298;
                var3.field3651 = var3.field41.field3282;
                var3.field3652 = var3.field41.field3275;
                var3.field3663 = var3.field41.field3334;
                if (var3.field41.method1324(true)) {
                    class175.method1300(class20.field323, (class35) null, var3.field3629[0], false, var3, 0, (class126) null, var3.field3614[0]);
                }
            }
            if ((var4 & 0x1) != 0) {
                int var7 = class33.field502.method619(119);
                int var8 = class33.field502.method609((byte) 118);
                var3.method1443(var7, class227.field4092, (byte) 126, var8);
            }
            if ((var4 & 0x4) != 0) {
                var3.field3634 = class33.field502.method611(true);
                var3.field3680 = class33.field502.method658(-117);
            }
            if ((var4 & 0x8) != 0) {
                int var9 = class33.field502.method619(-111);
                int var10 = class33.field502.method609((byte) 118);
                var3.method1443(var9, class227.field4092, (byte) -95, var10);
                var3.field3621 = class227.field4092 + 300;
                var3.field3669 = class33.field502.method622(true);
            }
            if ((var4 & 0x80) != 0) {
                var3.field3671 = class33.field502.method614((byte) -128);
                int var11 = class33.field502.method620((byte) -82);
                var3.field3657 = (var11 & 0xFFFF) + class227.field4092;
                var3.field3636 = 0;
                if (var3.field3671 == 65535) {
                    var3.field3671 = -1;
                }
                var3.field3649 = var11 >> 16;
                var3.field3630 = 0;
                if (var3.field3657 > class227.field4092) {
                    var3.field3630 = -1;
                }
            }
            if ((var4 & 0x40) != 0) {
                var3.field3618 = class33.field502.method658(127);
                if (var3.field3618 == 65535) {
                    var3.field3618 = -1;
                }
            }
        }
        field3083++;
        if (arg0 >= -6) {
            field3085 = 94;
        }
    }
}
