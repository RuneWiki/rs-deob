import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class117 extends class180 {

    @OriginalMember(owner = "client!js", name = "y", descriptor = "I")
    public static int field1647 = 1405;

    @OriginalMember(owner = "client!js", name = "q", descriptor = "Lpf;")
    public static class133 field1639 = new class133(5000);

    @OriginalMember(owner = "client!js", name = "B", descriptor = "Lfn;")
    public static class52 field1650 = new class52(31, 10);

    @OriginalMember(owner = "client!js", name = "s", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!js", name = "t", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!js", name = "u", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!js", name = "v", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!js", name = "w", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!js", name = "x", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!js", name = "z", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!js", name = "A", descriptor = "J")
    public long field1649;

    @OriginalMember(owner = "client!js", name = "p", descriptor = "Ljs;")
    public class117 field1638;

    @OriginalMember(owner = "client!js", name = "r", descriptor = "Ljs;")
    public class117 field1640;

    @OriginalMember(owner = "client!js", name = "o", descriptor = "Lnp;")
    public static class146 field1637;

    @OriginalMember(owner = "client!js", name = "b", descriptor = "(B)Z")
    public final boolean method737(byte arg0) {
        field1644++;
        if (arg0 > -70) {
            method739(40, 20, 20, -26);
        }
        return this.field1638 != null;
    }

    @OriginalMember(owner = "client!js", name = "c", descriptor = "(I)V")
    public final void method738(int arg0) {
        field1643++;
        if (this.field1638 == null) {
            return;
        }
        this.field1638.field1640 = this.field1640;
        this.field1640.field1638 = this.field1638;
        this.field1638 = null;
        if (arg0 != -13002) {
            method742(-118);
        }
        this.field1640 = null;
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIII)I")
    public static final int method739(int arg0, int arg1, int arg2, int arg3) {
        field1641++;
        int var4 = arg0 / arg1;
        int var5 = arg0 & arg1 - 1;
        if (arg2 != -6108) {
            method741(30, -94, 110, true);
        }
        int var6 = arg3 / arg1;
        int var7 = arg1 - 1 & arg3;
        int var8 = class73.method500(arg2 ^ 0x17BE, var6, var4);
        int var9 = class73.method500(arg2 + 6008, var6, var4 + 1);
        int var10 = class73.method500(-102, var6 + 1, var4);
        int var11 = class73.method500(arg2 + 5980, var6 + 1, var4 + 1);
        int var12 = class227.method1433(var8, false, var5, arg1, var9);
        int var13 = class227.method1433(var10, false, var5, arg1, var11);
        return class227.method1433(var12, false, var7, arg1, var13);
    }

    @OriginalMember(owner = "client!js", name = "d", descriptor = "(I)V")
    public static void method740(int arg0) {
        if (arg0 == 1) {
            field1650 = null;
            field1639 = null;
            field1637 = null;
        }
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIZ)V")
    public static final void method741(int arg0, int arg1, int arg2, boolean arg3) {
        field1645++;
        class265 var4 = class440.method2554(arg1, 2, 11);
        if (!arg3) {
            method742(-9);
        }
        var4.method1675(false);
        var4.field3698 = arg2;
        var4.field3689 = arg0;
    }

    @OriginalMember(owner = "client!js", name = "e", descriptor = "(I)V")
    public static final void method742(int arg0) {
        field1642++;
        if (arg0 == -1) {
            class131.method793(class266.field3705, 127);
            class332.field4555++;
            class366.field5214.method2470((byte) -74, 0);
        }
    }
}
