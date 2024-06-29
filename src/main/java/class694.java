import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class694 {

    @OriginalMember(owner = "client!v", name = "a", descriptor = "Lbh;")
    public static class538 field9695 = new class538(4);

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lmha;")
    public static class701 field9697 = new class701(2, 4, 4, 0);

    @OriginalMember(owner = "client!v", name = "b", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(B)V")
    public static void method3940(byte arg0) {
        if (arg0 == 114) {
            field9697 = null;
            field9695 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ILec;Lig;Z)V")
    public static final void method3941(int arg0, class103 arg1, class674 arg2, boolean arg3) {
        field9696++;
        if (class596.field8577 >= 50 || arg1 == null || arg1.field1488 == null || arg1.field1488.length <= arg0 || arg1.field1488[arg0] == null) {
            return;
        }
        int var4 = arg1.field1488[arg0][0];
        int var5 = var4 >> 8;
        int var6 = var4 >> 5 & 0x7;
        int var7 = var4 & 0x1F;
        if (arg1.field1488[arg0].length > 1) {
            int var8 = (int) ((double) arg1.field1488[arg0].length * Math.random());
            if (var8 > 0) {
                var5 = arg1.field1488[arg0][var8];
            }
        }
        int var9 = 256;
        if (arg1.field1482 != null && arg1.field1470 != null) {
            var9 = (int) (Math.random() * (double) (arg1.field1470[arg0] - arg1.field1482[arg0])) + arg1.field1482[arg0];
        }
        int var10 = arg1.field1467 == null ? 255 : arg1.field1467[arg0];
        if (var7 == 0) {
            if (class473.field6483 == arg2) {
                if (arg1.field1471) {
                    class167.method1060(0, (byte) 126, false, var5, var9, var6, var10);
                    return;
                }
                class151.method967(0, var10, var6, var5, var9, 0);
            }
        } else if (class674.field9500.field5114.method3216(0) != 0) {
            int var11 = arg2.field9490 - 256 >> 9;
            int var12 = arg2.field9489 - 256 >> 9;
            int var13 = class473.field6483 == arg2 ? 0 : (arg2.field9501 << 24) + (var11 << 16) - (-(var12 << 8) - var7);
            if (!arg3) {
                field9698 = -119;
            }
            class293.field3830[class596.field8577++] = new class362((byte) (arg1.field1471 ? 2 : 1), var5, var6, 0, var10, var13, var9, arg2);
        }
    }
}
