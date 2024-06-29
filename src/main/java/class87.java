import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class87 {

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field1326;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public int field1328;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public int field1329;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public int field1332;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public int field1333;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public int field1335;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "I")
    public int field1336;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public int field1337;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "[B")
    public byte[] field1330;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "[B")
    public byte[] field1331;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "[Lf;")
    public static class529[] field1334;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 3)
    public static final void method507(int arg0) {
        field1327++;
        if (class1.field4 != -1) {
            class233.method1588(-1, 0, false, -1, class1.field4);
            class1.field4 = -1;
        }
        if (arg0 > -6) {
            method509(-50, -98, -55);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZLvg;II)V", line = 32)
    public static final void method508(int arg0, boolean arg1, class38 arg2, int arg3, int arg4) {
        field1326++;
        int var5 = arg2.field553;
        if (arg2.field508 == arg4) {
            arg2.field553 = arg2.field520;
        } else if (arg2.field508 == 1) {
            arg2.field553 = arg3 - arg2.field520;
        } else if (arg2.field508 == 2) {
            arg2.field553 = arg2.field520 * arg3 >> 14;
        }
        int var6 = arg2.field472;
        if (arg2.field513 == 0) {
            arg2.field472 = arg2.field428;
        } else if (arg2.field513 == 1) {
            arg2.field472 = arg0 - arg2.field428;
        } else if (arg2.field513 == 2) {
            arg2.field472 = arg2.field428 * arg0 >> 14;
        }
        if (arg2.field508 == 4) {
            arg2.field553 = arg2.field542 * arg2.field472 / arg2.field417;
        }
        if (arg2.field513 == 4) {
            arg2.field472 = arg2.field553 * arg2.field417 / arg2.field542;
        }
        if (class187.field2783 && (client.method1328(arg2).field5858 != 0 || arg2.field492 == 0)) {
            if (arg2.field472 < 5 && arg2.field553 < 5) {
                arg2.field472 = 5;
                arg2.field553 = 5;
            } else {
                if (arg2.field553 <= 0) {
                    arg2.field553 = 5;
                }
                if (arg2.field472 <= 0) {
                    arg2.field472 = 5;
                }
            }
        }
        if (class272.field3957 == arg2.field448) {
            class415.field6234 = arg2;
        }
        if (arg1 && arg2.field560 != null && arg2.field553 != var5 || arg2.field472 != var6) {
            class168 var7 = new class168();
            var7.field2488 = arg2;
            var7.field2484 = arg2.field560;
            class163.field2396.method809(var7, false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)V", line = 112)
    public static final void method509(int arg0, int arg1, int arg2) {
        class518 var3 = class108.field1553[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field7551 != null) {
            var3.field7551 = null;
        }
        if (var3.field7552 != null) {
            var3.field7552 = null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V", line = 130)
    public static void method510(byte arg0) {
        if (arg0 < 112) {
            method507(12);
        }
        field1334 = null;
    }
}
