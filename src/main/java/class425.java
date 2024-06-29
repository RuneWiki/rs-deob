import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class425 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Z")
    public static boolean field5995 = false;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "Lbj;")
    public static class131 field5992 = new class131(8);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field5991;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lkh;I)V")
    public static final void method2686(class11 arg0, int arg1) {
        field5993++;
        if ((arg0.field230.length - arg0.field191) < 1) {
            return;
        }
        int var2 = arg0.method172((byte) 52);
        if (var2 < 0 || var2 > 15) {
            return;
        }
        byte var3;
        if (var2 == 15) {
            var3 = 37;
        } else if (var2 == 14) {
            var3 = 36;
        } else if (var2 == 13) {
            var3 = 35;
        } else if (var2 == 12) {
            var3 = 34;
        } else if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field230.length - arg0.field191) < var3) {
            return;
        }
        class361.field5000 = arg0.method172((byte) 52);
        if (class361.field5000 < 1) {
            class361.field5000 = 1;
        } else if (class361.field5000 > 4) {
            class361.field5000 = 4;
        }
        class34.method337(arg0.method172((byte) 52) == 1, (byte) 96);
        class61.field845 = arg0.method172((byte) 52) == 1;
        class154.field2169 = arg0.method172((byte) 52) == 1;
        class414.field5867 = arg0.method172((byte) 52) == 1;
        class237.field3369 = arg0.method172((byte) 52) == 1 ? 1 : 0;
        class70.field1032 = arg0.method172((byte) 52) == 1;
        class64.field886 = arg0.method172((byte) 52) == 1;
        class106.field1472 = arg0.method172((byte) 52) == 1;
        class327.field4508 = arg0.method172((byte) 52);
        if (class327.field4508 > 2) {
            class327.field4508 = 2;
        }
        if (var2 < 2) {
            class312.field4271 = arg0.method172((byte) 52) == 1;
            arg0.method172((byte) 52);
        } else {
            class312.field4271 = arg0.method172((byte) 52) == 1;
        }
        class171.field2346 = arg0.method172((byte) 52) == 1;
        class54.field755 = arg0.method172((byte) 52) == 1;
        class205.field2824 = arg0.method172((byte) 52);
        if (class205.field2824 > 2) {
            class205.field2824 = 2;
        }
        class403.field5720 = class205.field2824;
        class133.field1904 = arg0.method172((byte) 52) == 1;
        class371.field5212 = arg0.method172((byte) 52);
        if (class371.field5212 > 127) {
            class371.field5212 = 127;
        }
        class52.field731 = arg0.method172((byte) 52);
        class345.field4692 = arg0.method172((byte) 52);
        if (class345.field4692 > 127) {
            class345.field4692 = 127;
        }
        if (var2 >= 1) {
            class53.field741 = arg0.method174(arg1 ^ 0xFFFFFF07);
            class306.field4224 = arg0.method174(255);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method172((byte) 52);
        }
        if (var2 >= 4) {
            int var4 = arg0.method172((byte) 52);
            if (var4 < 0 || var4 > 2) {
                var4 = 0;
            }
            if (class445.field6242 < 96) {
                var4 = 0;
            }
            class244.method1654(arg1 + 8, var4);
        }
        if (var2 >= 5) {
            class405.field5762 = arg0.method185(25239);
        }
        int var5 = 0;
        if (var2 >= 6) {
            class284.field4010 = var5 = arg0.method172((byte) 52);
        }
        if (class284.field4010 != 1 && class284.field4010 != 2) {
            class284.field4010 = 2;
        }
        if (~var2 <= arg1) {
            class392.field5610 = arg0.method172((byte) 52) == 1;
        }
        if (var2 >= 8) {
            class133.field1916 = arg0.method172((byte) 52) == 1;
        }
        if (var2 >= 9) {
            class42.field614 = arg0.method172((byte) 52);
        }
        if (class42.field614 < 0 || class42.field614 > class386.method2446(class445.field6242, -6819)) {
            class42.field614 = 0;
        }
        if (var2 >= 10) {
            class288.field4049 = arg0.method172((byte) 52) != 0;
        }
        if (var2 >= 11) {
            class214.field2988 = arg0.method172((byte) 52) != 0;
        }
        if (var2 >= 12) {
            class237.field3369 = arg0.method172((byte) 52);
        }
        if (class237.field3369 < 0 || class237.field3369 > 2) {
            class237.field3369 = 1;
        }
        if (var2 >= 13) {
            class175.field2397 = arg0.method172((byte) 52) == 1;
        }
        if (var2 >= 14) {
            class251.field3544 = arg0.method172((byte) 52);
        } else if (var5 == 0) {
            class251.field3544 = 2;
        } else {
            class251.field3544 = 1;
        }
        if (class251.field3544 < 0 || class251.field3544 > 3) {
            class251.field3544 = 2;
        }
        if (var2 >= 15) {
            class411.field5840 = arg0.method172((byte) 52);
            if (class411.field5840 < 0 || class411.field5840 > 4) {
                class411.field5840 = class71.field1038 == 1 ? 2 : 4;
            }
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Z)V")
    public static void method2687(boolean arg0) {
        field5992 = null;
        if (!arg0) {
            method2687(true);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIIII)V")
    public static final void method2688(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class154.field2170; var5++) {
            Rectangle var6 = class192.field2642[var5];
            if (var6.x + var6.width > arg4 && (arg3 + arg4) > var6.x && var6.y + var6.height > arg1 && arg0 + arg1 > var6.y) {
                class25.field458[var5] = true;
            }
        }
        if (arg2 < -46) {
            field5991++;
        }
    }
}
