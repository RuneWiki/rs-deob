import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jja")
public class class119 extends class159 {

    @OriginalMember(owner = "client!jja", name = "I", descriptor = "I")
    public int field1605 = 0;

    @OriginalMember(owner = "client!jja", name = "O", descriptor = "Lnc;")
    public static class26 field1611 = new class26();

    @OriginalMember(owner = "client!jja", name = "l", descriptor = "I")
    public int field1582;

    @OriginalMember(owner = "client!jja", name = "m", descriptor = "I")
    public int field1583;

    @OriginalMember(owner = "client!jja", name = "n", descriptor = "I")
    public int field1584;

    @OriginalMember(owner = "client!jja", name = "o", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!jja", name = "p", descriptor = "I")
    public int field1586;

    @OriginalMember(owner = "client!jja", name = "r", descriptor = "I")
    public int field1588;

    @OriginalMember(owner = "client!jja", name = "u", descriptor = "I")
    public int field1591;

    @OriginalMember(owner = "client!jja", name = "v", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!jja", name = "y", descriptor = "I")
    public int field1595;

    @OriginalMember(owner = "client!jja", name = "B", descriptor = "I")
    public int field1598;

    @OriginalMember(owner = "client!jja", name = "D", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!jja", name = "E", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!jja", name = "F", descriptor = "I")
    public int field1602;

    @OriginalMember(owner = "client!jja", name = "H", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!jja", name = "L", descriptor = "I")
    public int field1608;

    @OriginalMember(owner = "client!jja", name = "N", descriptor = "I")
    public int field1610;

    @OriginalMember(owner = "client!jja", name = "P", descriptor = "I")
    public int field1612;

    @OriginalMember(owner = "client!jja", name = "M", descriptor = "Lub;")
    public class22 field1609;

    @OriginalMember(owner = "client!jja", name = "t", descriptor = "Lvca;")
    public class296 field1590;

    @OriginalMember(owner = "client!jja", name = "C", descriptor = "Lvca;")
    public class296 field1599;

    @OriginalMember(owner = "client!jja", name = "J", descriptor = "Llp;")
    public class412 field1606;

    @OriginalMember(owner = "client!jja", name = "q", descriptor = "Lwm;")
    public class590 field1587;

    @OriginalMember(owner = "client!jja", name = "G", descriptor = "Lwm;")
    public class590 field1603;

    @OriginalMember(owner = "client!jja", name = "x", descriptor = "Lcm;")
    public class758 field1594;

    @OriginalMember(owner = "client!jja", name = "s", descriptor = "Lpv;")
    public class78 field1589;

    @OriginalMember(owner = "client!jja", name = "A", descriptor = "Lpv;")
    public class78 field1597;

    @OriginalMember(owner = "client!jja", name = "k", descriptor = "Z")
    public boolean field1581;

    @OriginalMember(owner = "client!jja", name = "w", descriptor = "Z")
    public boolean field1593;

    @OriginalMember(owner = "client!jja", name = "K", descriptor = "Z")
    public boolean field1607;

    @OriginalMember(owner = "client!jja", name = "z", descriptor = "[I")
    public int[] field1596;

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(I)V")
    public static void method852(int arg0) {
        if (arg0 == -25648) {
            field1611 = null;
        }
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(IIII)V")
    public static final void method853(int arg0, int arg1, int arg2, int arg3) {
        field1592++;
        if (class90.field1269 == arg3 && class325.field4611 == arg1 && class228.field2953 == arg0) {
            return;
        }
        class90.field1269 = arg3;
        class228.field2953 = arg0;
        class132.field1818 = true;
        class325.field4611 = arg1;
        double var4 = -((double) (arg3 * 2) * 3.141592653589793D) / (double) arg2;
        double var6 = -((double) (arg1 * 2) * 3.141592653589793D) / 16384.0D;
        double var8 = Math.cos(var6);
        double var10 = Math.sin(var6);
        double var12 = Math.cos(var4);
        double var14 = Math.sin(var4);
        class27.field269 = var10;
        class364.field5255 = 0.0D;
        class344.field4807 = -var10 * var12;
        class299.field4225 = var8 * var12;
        class282.field4077 = var12;
        class703.field9475 = -var8 * var14;
        class191.field2480 = var8;
        class297.field4198 = var14;
        class492.field6926 = var10 * var14;
    }

    @OriginalMember(owner = "client!jja", name = "a", descriptor = "(Z)V")
    public static final void method854(boolean arg0) {
        field1600++;
        if (!arg0) {
            field1611 = null;
        }
        class751.field10147.method80(false);
    }

    @OriginalMember(owner = "client!jja", name = "b", descriptor = "(Z)V")
    public final void method855(boolean arg0) {
        field1585++;
        if (arg0) {
            this.field1602 = 48;
        }
        int var2 = this.field1584;
        boolean var3 = this.field1593;
        if (this.field1606 != null) {
            class412 var4 = this.field1606.method2478(class480.field6740, -1);
            if (var4 == null) {
                this.field1596 = null;
                this.field1591 = 0;
                this.field1581 = false;
                this.field1593 = false;
                this.field1595 = 0;
                this.field1602 = 256;
                this.field1612 = 0;
                this.field1610 = 0;
                this.field1584 = -1;
                this.field1601 = 0;
                this.field1604 = 256;
            } else {
                this.field1596 = var4.field5874;
                this.field1584 = var4.field5924;
                this.field1581 = var4.field5940;
                this.field1604 = var4.field5901;
                this.field1595 = var4.field5876;
                this.field1593 = var4.field5937;
                this.field1591 = var4.field5882;
                this.field1602 = var4.field5911;
                this.field1610 = var4.field5866;
                this.field1612 = var4.field5935 << 9;
            }
        } else if (this.field1609 != null) {
            int var5 = class489.method2862(this.field1609, -1);
            if (var2 != var5) {
                this.field1584 = var5;
                class304 var6 = this.field1609.field217;
                if (var6.field4295 != null) {
                    var6 = var6.method1968(class480.field6740, -1);
                }
                if (var6 == null) {
                    this.field1593 = this.field1609.field217.field4282;
                    this.field1604 = 256;
                    this.field1602 = 256;
                    this.field1591 = this.field1612 = this.field1601 = 0;
                } else {
                    this.field1591 = var6.field4324;
                    this.field1602 = var6.field4320;
                    this.field1612 = var6.field4331 << 9;
                    this.field1593 = var6.field4282;
                    this.field1601 = var6.field4317 << 9;
                    this.field1604 = var6.field4337;
                }
            }
        } else if (this.field1594 != null) {
            this.field1584 = class585.method3294(this.field1594, (byte) -112);
            this.field1604 = 256;
            this.field1591 = this.field1594.field10372;
            this.field1612 = this.field1594.field10350 << 9;
            this.field1602 = 256;
            this.field1601 = 0;
            this.field1593 = this.field1594.field10351;
        }
        if (this.field1584 == var2 && this.field1593 == var3) {
            return;
        }
        if (this.field1599 == null) {
            return;
        }
        class701.field9285.method22(this.field1599);
        this.field1597 = null;
        this.field1603 = null;
        this.field1599 = null;
    }
}
