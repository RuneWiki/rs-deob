import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class120 extends class741 {

    @OriginalMember(owner = "client!fl", name = "m", descriptor = "F")
    private float field1596 = 0.0F;

    @OriginalMember(owner = "client!fl", name = "w", descriptor = "Loca;")
    private class639 field1606;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!fl", name = "n", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!fl", name = "q", descriptor = "I")
    public static int field1600;

    @OriginalMember(owner = "client!fl", name = "r", descriptor = "I")
    public static int field1601;

    @OriginalMember(owner = "client!fl", name = "s", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!fl", name = "t", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!fl", name = "u", descriptor = "I")
    public static int field1604;

    @OriginalMember(owner = "client!fl", name = "v", descriptor = "I")
    public static int field1605;

    @OriginalMember(owner = "client!fl", name = "l", descriptor = "Lho;")
    public static class318 field1595;

    @OriginalMember(owner = "client!fl", name = "p", descriptor = "Lee;")
    public static class506 field1599;

    @OriginalMember(owner = "client!fl", name = "o", descriptor = "[[I")
    public static int[][] field1598;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)V")
    public final void method434(int arg0) {
        super.field10209.method1473(1, (byte) 38);
        ++field1601;
        super.field10209.method1494(class785.field10763, 775, class785.field10763);
        super.field10209.method1409(class157.field2039, 0, -121);
        super.field10209.method1455(0, -3, class157.field2039);
        super.field10209.method1417((byte) -81, 1);
        super.field10209.method1492((class34) null, 2);
        super.field10209.method1473(0, (byte) 106);
        super.field10209.method1455(0, -3, class157.field2039);
        int var2 = -96 / ((10 - arg0) / 44);
    }

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Llba;Loca;)V")
    public class120(class223 arg0, class639 arg1) {
        super(arg0);
        this.field1606 = arg1;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)V")
    public final void method426(byte arg0) {
        if (~super.field10209.method1486((byte) 56) == -1) {
            class517 var2 = super.field10209.method1500(15720);
            super.field10209.method1473(1, (byte) 124);
            class517 var3 = super.field10209.method1470(107);
            var3.method49(var2);
            var3.method3086(7, 0.125F, 0.125F, 1.0F);
            var3.method3072(8929, this.field1596, 0.0F, 0.0F);
            super.field10209.method1475(92, class347.field5057);
            super.field10209.method1473(0, (byte) 75);
        }
        if (arg0 > -91) {
            this.method426((byte) 39);
        }
        ++field1604;
    }

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "(I)V")
    public static void method853(int arg0) {
        field1598 = null;
        field1595 = null;
        field1599 = null;
        int var1 = -5 / ((arg0 - -49) / 48);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(III)V")
    public final void method432(int arg0, int arg1, int arg2) {
        ++field1602;
        super.field10209.method1473(1, (byte) 64);
        if (~(128 & arg0) != -1) {
            super.field10209.method1492((class34) null, 2);
        } else if (~(arg1 & 1) != -2) {
            if (this.field1606.field8984) {
                super.field10209.method1492(this.field1606.field8983, 2);
            } else {
                super.field10209.method1492(this.field1606.field8980[0], 2);
            }
        } else if (this.field1606.field8984) {
            this.field1596 = (float) (super.field10209.field3373 % 4000) / 4000.0F;
            super.field10209.method1492(this.field1606.field8983, 2);
        } else {
            int var4 = super.field10209.field3373 % 4000 * 16 / 4000;
            super.field10209.method1492(this.field1606.field8980[var4], 2);
        }
        int var5 = -114 % ((-18 - arg2) / 51);
        super.field10209.method1473(0, (byte) 18);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(BZ)V")
    public final void method429(byte arg0, boolean arg1) {
        ++field1594;
        super.field10209.method1473(1, (byte) 51);
        super.field10209.method1494(class587.field8280, 775, class92.field1073);
        if (arg0 < 15) {
            this.method425((byte) -38);
        }
        super.field10209.method1469(false, 0, false, class157.field2039, true);
        super.field10209.method1455(0, -3, class224.field3416);
        super.field10209.method1417((byte) -67, 0);
        super.field10209.method1473(0, (byte) 97);
        super.field10209.method1468((byte) 67, -16777216);
        super.field10209.method1455(0, -3, class41.field423);
        this.method426((byte) -110);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IILml;)V")
    public final void method433(int arg0, int arg1, class34 arg2) {
        if (arg0 != -1) {
            field1599 = null;
        }
        super.field10209.method1492(arg2, 2);
        ++field1603;
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)Z")
    public final boolean method425(byte arg0) {
        ++field1605;
        if (arg0 > -37) {
            field1599 = null;
        }
        return this.field1606.method3674(99);
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IZ)V")
    public final void method430(int arg0, boolean arg1) {
        ++field1600;
        if (arg0 < 96) {
            this.method430(127, false);
        }
        super.field10209.method1494(class785.field10763, 775, class92.field1073);
    }
}
