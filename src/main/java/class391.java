import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public abstract class class391 extends class230 {

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "S")
    public short field5564;

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field5566 = 0;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public static int field5565;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public static int field5567;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "I")
    public static int field5568;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)Z")
    public final boolean method1534(int arg0) {
        if (arg0 != 382) {
            field5565 = -92;
        }
        ++field5569;
        return class592.field8338[(super.field3470 >> class732.field10110) + -class591.field8336 - -class270.field3904][(super.field3460 >> class732.field10110) + -class112.field1363 - -class270.field3904];
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lha;B)Z")
    public final boolean method1525(class473 arg0, byte arg1) {
        if (arg1 != -127) {
            field5566 = 124;
        }
        ++field5568;
        return class158.method1019(super.field3469, super.field3470 >> class732.field10110, arg1 ^ 51, super.field3460 >> class732.field10110, this);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Z[Lsca;)I")
    public final int method1526(boolean arg0, class251[] arg1) {
        ++field5567;
        int var3 = super.field3470 >> class732.field10110;
        int var4 = super.field3460 >> class732.field10110;
        int var5 = 0;
        if (class591.field8336 == var3) {
            ++var5;
        } else if (class591.field8336 < var3) {
            var5 += 2;
        }
        if (class112.field1363 != var4) {
            if (var4 < class112.field1363) {
                var5 += 6;
            }
        } else {
            var5 += 3;
        }
        int var6 = class161.field2071[var5];
        if ((this.field5564 & var6) != 0) {
            return this.method1527((byte) -32, arg1, var4, var3);
        } else if (this.field5564 == 1 && var3 > 0) {
            return this.method1527((byte) -32, arg1, var4, var3 + -1);
        } else if (~this.field5564 == -5 && var3 <= class414.field5796) {
            return this.method1527((byte) -32, arg1, var4, var3 + 1);
        } else if (~this.field5564 == -9 && ~var4 < -1) {
            return this.method1527((byte) -32, arg1, var4 + -1, var3);
        } else if (this.field5564 == 2 && ~class704.field9799 <= ~var4) {
            return this.method1527((byte) -32, arg1, var4 + 1, var3);
        } else if (arg0) {
            return 126;
        } else if (this.field5564 == 16 && ~var3 < -1 && class704.field9799 >= var4) {
            return this.method1527((byte) -32, arg1, var4 + 1, var3 + -1);
        } else if (~this.field5564 == -33 && ~class414.field5796 <= ~var3 && ~class704.field9799 <= ~var4) {
            return this.method1527((byte) -32, arg1, var4 - -1, var3 - -1);
        } else if (~this.field5564 == -129 && var3 > 0 && var4 > 0) {
            return this.method1527((byte) -32, arg1, var4 + -1, var3 + -1);
        } else if (~this.field5564 == -65 && class414.field5796 >= var3 && ~var4 < -1) {
            return this.method1527((byte) -32, arg1, var4 + -1, var3 + 1);
        } else {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIII)V")
    public class391(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field5564 = (short) arg5;
        super.field3460 = arg2;
        super.field3464 = arg1;
        super.field3470 = arg0;
        super.field3469 = (byte) arg4;
        super.field3467 = (byte) arg3;
    }
}
