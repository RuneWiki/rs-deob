import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class316 {

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field4929 = -1;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field4932 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field4930;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IBIII)V", line = 13)
    public static final void method2175(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (class254 var5 = (class254) class67.field1071.method1490(200); var5 != null; var5 = (class254) class67.field1071.method1487((byte) 117)) {
            class57.method428(arg2, var5, arg0, arg3, -101, arg4);
        }
        if (arg1 <= 110) {
            method2175(12, (byte) -38, 103, 61, -7);
        }
        field4928++;
        for (class254 var6 = (class254) class139.field2216.method1490(200); var6 != null; var6 = (class254) class139.field2216.method1487((byte) 117)) {
            byte var7 = 1;
            class63 var8 = var6.field3920.method640(-86);
            if (var6.field3920.field1453 == var8.field970) {
                var7 = 0;
            } else if (var6.field3920.field1453 == var8.field989 || var6.field3920.field1453 == var8.field987 || var6.field3920.field1453 == var8.field1004 || var6.field3920.field1453 == var8.field974) {
                var7 = 2;
            } else if (var6.field3920.field1453 == var8.field971 || var6.field3920.field1453 == var8.field973 || var6.field3920.field1453 == var8.field980 || var6.field3920.field1453 == var8.field995) {
                var7 = 3;
            }
            if (var6.field3940 != var7) {
                int var9 = class151.method1157((byte) -38, var6.field3920);
                if (var6.field3927 != var9) {
                    if (var6.field3925 != null) {
                        class128.field2045.method358(var6.field3925);
                        var6.field3925 = null;
                    }
                    var6.field3927 = var9;
                }
                var6.field3940 = var7;
            }
            var6.field3921 = var6.field3920.field1442;
            var6.field3939 = var6.field3920.field1442 + (var6.field3920.method200(-1) * 64);
            var6.field3929 = var6.field3920.field1369;
            var6.field3936 = var6.field3920.field1369 + (var6.field3920.method200(-1) * 64);
            class57.method428(arg2, var6, arg0, arg3, -111, arg4);
        }
        for (class254 var10 = (class254) class94.field1553.method841(0); var10 != null; var10 = (class254) class94.field1553.method842((byte) -40)) {
            class63 var11 = var10.field3931.method640(114);
            byte var12 = 1;
            if (var10.field3931.field1453 == var11.field970) {
                var12 = 0;
            } else if (var10.field3931.field1453 == var11.field989 || var10.field3931.field1453 == var11.field987 || var10.field3931.field1453 == var11.field1004 || var10.field3931.field1453 == var11.field974) {
                var12 = 2;
            } else if (var10.field3931.field1453 == var11.field971 || var10.field3931.field1453 == var11.field973 || var10.field3931.field1453 == var11.field980 || var10.field3931.field1453 == var11.field995) {
                var12 = 3;
            }
            if (var10.field3940 != var12) {
                int var13 = class11.method92((byte) -94, var10.field3931);
                if (var10.field3927 != var13) {
                    if (var10.field3925 != null) {
                        class128.field2045.method358(var10.field3925);
                        var10.field3925 = null;
                    }
                    var10.field3927 = var13;
                }
                var10.field3940 = var12;
            }
            var10.field3921 = var10.field3931.field1442;
            var10.field3939 = var10.field3931.field1442 + (var10.field3931.method200(-1) * 64);
            var10.field3929 = var10.field3931.field1369;
            var10.field3936 = var10.field3931.field1369 + (var10.field3931.method200(-1) * 64);
            class57.method428(arg2, var10, arg0, arg3, -117, arg4);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V", line = 132)
    public static final void method2176(byte arg0, int arg1) {
        field4930++;
        if (class213.method1543(25641, arg1)) {
            class233.method1683(0, -1, class207.field3269[arg1]);
            if (arg0 > -63) {
                method2176((byte) 10, -24);
            }
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)Lmc;", line = 157)
    public static final class183 method2177(int arg0, int arg1, int arg2) {
        class272 var3 = class60.field946[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class183 var4 = var3.field4221;
            var3.field4221 = null;
            return var4;
        }
    }
}
