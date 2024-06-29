import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class357 extends class168 {

    @OriginalMember(owner = "client!km", name = "v", descriptor = "I")
    public int field4600 = 0;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!km", name = "l", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!km", name = "o", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!km", name = "p", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!km", name = "q", descriptor = "I")
    public int field4595;

    @OriginalMember(owner = "client!km", name = "r", descriptor = "I")
    public int field4596;

    @OriginalMember(owner = "client!km", name = "s", descriptor = "I")
    public int field4597;

    @OriginalMember(owner = "client!km", name = "t", descriptor = "I")
    public int field4598;

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public int field4602;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public int field4605;

    @OriginalMember(owner = "client!km", name = "C", descriptor = "I")
    public int field4607;

    @OriginalMember(owner = "client!km", name = "D", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!km", name = "G", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!km", name = "H", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!km", name = "K", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!km", name = "j", descriptor = "Lct;")
    public class148 field4588;

    @OriginalMember(owner = "client!km", name = "L", descriptor = "Lct;")
    public class148 field4616;

    @OriginalMember(owner = "client!km", name = "F", descriptor = "Lrm;")
    public class413 field4610;

    @OriginalMember(owner = "client!km", name = "I", descriptor = "Lrm;")
    public class413 field4613;

    @OriginalMember(owner = "client!km", name = "E", descriptor = "Lgs;")
    public class45 field4609;

    @OriginalMember(owner = "client!km", name = "M", descriptor = "Lgs;")
    public class45 field4617;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "Lac;")
    public class543 field4604;

    @OriginalMember(owner = "client!km", name = "N", descriptor = "Lrl;")
    public class724 field4618;

    @OriginalMember(owner = "client!km", name = "n", descriptor = "Lcc;")
    public class733 field4592;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Z")
    public boolean field4591;

    @OriginalMember(owner = "client!km", name = "u", descriptor = "Z")
    public boolean field4599;

    @OriginalMember(owner = "client!km", name = "J", descriptor = "Z")
    public boolean field4614;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "[I")
    public int[] field4606;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static final void method2071(int arg0) {
        class565.field7943.method505(class705.field9776);
        if (arg0 == 256) {
            field4608++;
            class565.field7943.method437(class8.field93, class27.field491, class518.field7261, class429.field5743);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public final void method2072(int arg0) {
        field4594++;
        int var2 = this.field4611;
        boolean var3 = this.field4614;
        if (this.field4604 != null) {
            class543 var6 = this.field4604.method3111(class516.field7236, -127);
            if (var6 == null) {
                this.field4591 = false;
                this.field4590 = 0;
                this.field4589 = 0;
                this.field4614 = false;
                this.field4596 = 0;
                this.field4611 = -1;
                this.field4603 = 0;
                this.field4595 = 256;
                this.field4615 = 256;
                this.field4606 = null;
                this.field4602 = 0;
            } else {
                this.field4611 = var6.field7589;
                this.field4603 = var6.field7582;
                this.field4615 = var6.field7567;
                this.field4596 = var6.field7564;
                this.field4614 = var6.field7591;
                this.field4602 = var6.field7549;
                this.field4606 = var6.field7587;
                this.field4595 = var6.field7538;
                this.field4590 = var6.field7576 << 9;
                this.field4591 = var6.field7588;
            }
        } else if (this.field4592 != null) {
            int var4 = class646.method3621(this.field4592, arg0);
            if (var2 != var4) {
                this.field4611 = var4;
                class131 var5 = this.field4592.field10192;
                if (var5.field1899 != null) {
                    var5 = var5.method981(-127, class516.field7236);
                }
                if (var5 == null) {
                    this.field4615 = 256;
                    this.field4602 = this.field4590 = this.field4589 = 0;
                    this.field4614 = this.field4592.field10192.field1865;
                    this.field4595 = 256;
                } else {
                    this.field4614 = var5.field1865;
                    this.field4602 = var5.field1885;
                    this.field4589 = var5.field1860 << 9;
                    this.field4590 = var5.field1889 << 9;
                    this.field4615 = var5.field1864;
                    this.field4595 = var5.field1884;
                }
            }
        } else if (this.field4618 != null) {
            this.field4611 = class469.method2666(this.field4618, -28557);
            this.field4615 = 256;
            this.field4595 = 256;
            this.field4614 = this.field4618.field10087;
            this.field4589 = 0;
            this.field4590 = this.field4618.field10080 << 9;
            this.field4602 = this.field4618.field10067;
        }
        if (arg0 != 0) {
            this.field4592 = null;
        }
        if (this.field4611 == var2 && this.field4614 == var3) {
            return;
        }
        if (this.field4617 == null) {
            return;
        }
        class307.field4055.method1319(this.field4617);
        this.field4610 = null;
        this.field4588 = null;
        this.field4617 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(II)I")
    public static final int method2073(int arg0, int arg1) {
        if (arg0 < 53) {
            method2073(-125, 38);
        }
        field4601++;
        return arg1 & 0x7F;
    }
}
