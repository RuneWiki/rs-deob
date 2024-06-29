import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class107 extends class224 {

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "I")
    private int field1645 = 0;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    private int field1638 = 0;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "I")
    private int field1648 = 1365;

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    private int field1639 = 20;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "Luf;")
    public static class168 field1637 = class148.method1019(-1720, "");

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "I")
    public static int field1641 = 0;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field1642 = 0;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    public static int field1643 = 0;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "Lqe;")
    public static class285 field1647;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "(I)V", line = 5)
    public static void method792(int arg0) {
        field1637 = null;
        field1647 = null;
        if (arg0 != 0) {
            field1641 = 70;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[I", line = 24)
    public final int[] method18(byte arg0, int arg1) {
        int var3 = -58 % ((arg0 - 20) / 51);
        int[] var4 = this.field3613.method1866(1, arg1);
        if (this.field3613.field4531) {
            for (int var5 = 0; var5 < class187.field2961; var5++) {
                int var6 = (class303.field5103[arg1] << 12) / this.field1648 + this.field1638;
                int var7 = (class73.field979[var5] << 12) / this.field1648 + this.field1645;
                int var8 = var7;
                int var9 = var6;
                int var10 = var6;
                int var11 = var7;
                int var12 = var7 * var7 >> 12;
                int var13 = var6 * var6 >> 12;
                int var14 = 0;
                while (var12 + var13 < 16384 && var14 < this.field1639) {
                    var10 = (var10 * var11 >> 12) * 2 + var9;
                    var11 = var12 + var8 - var13;
                    var12 = var11 * var11 >> 12;
                    var14++;
                    var13 = var10 * var10 >> 12;
                }
                var4[var5] = var14 < (this.field1639 - 1) ? (var14 << 12) / this.field1639 : 0;
            }
        }
        field1646++;
        return var4;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIII)V", line = 80)
    public static final void method793(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1640++;
        if (arg4 <= 99) {
            return;
        }
        if (arg2 - arg5 >= class150.field2331 && class65.field874 >= arg2 + arg5 && class9.field112 <= (arg6 - arg5) && arg6 + arg5 <= class44.field538) {
            class157.method1111(arg3, arg2, arg6, 0, arg5, arg1, arg0);
        } else {
            class266.method1851(arg0, arg3, arg1, arg6, arg5, arg2, 109);
        }
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 112)
    public class107() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IZLj;)V", line = 143)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg1) {
            return;
        }
        if (arg0 == 0) {
            this.field1648 = arg2.method1069(84);
        } else if (arg0 == 1) {
            this.field1639 = arg2.method1069(67);
        } else if (arg0 == 2) {
            this.field1645 = arg2.method1069(44);
        } else if (arg0 == 3) {
            this.field1638 = arg2.method1069(127);
        }
        field1644++;
    }
}
