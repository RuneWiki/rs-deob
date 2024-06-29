import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class66 extends class200 {

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    private int field1164;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "Lid;")
    private static class149 field1170 = class60.method382("Created gameworld", (byte) 52);

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "Lid;")
    public static class149 field1165 = field1170;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "Llc;")
    public static class84 field1167 = new class84(0, 0);

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "S")
    public static short field1171 = 32767;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field1166;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "I")
    public static int field1169;

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ID)V")
    public static final void method410(int arg0, double arg1) {
        if (class1.field22 != arg1) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class136.field2493[var3] = var4 > 255 ? 255 : var4;
            }
            class1.field22 = arg1;
        }
        if (arg0 != 0) {
            field1165 = null;
        }
        ++field1166;
    }

    @OriginalMember(owner = "client!ri", name = "e", descriptor = "(I)V")
    public static void method411(int arg0) {
        if (arg0 != 255) {
            method410(-40, 1.1815376649816978D);
        }
        field1170 = null;
        field1165 = null;
        field1167 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)[I")
    public final int[] method26(int arg0, byte arg1) {
        ++field1169;
        int[] var3 = super.field3638.method1879(arg0, true);
        if (super.field3638.field4887) {
            class209.method1427(var3, 0, class137.field2515, this.field1164);
        }
        if (arg1 != 55) {
            method412(-20, (class47[]) null, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I[Laj;Z)V")
    public static final void method412(int arg0, class47[] arg1, boolean arg2) {
        if (!arg2) {
            for (int var3 = 0; var3 < arg1.length; ++var3) {
                class47 var4 = arg1[var3];
                if (var4 != null) {
                    if (var4.field760 == 0) {
                        if (var4.field761 != null) {
                            method412(arg0, var4.field761, arg2);
                        }
                        class3 var5 = (class3) class34.field499.method639((byte) -86, (long) var4.field834);
                        if (var5 != null) {
                            class275.method1901((byte) 9, var5.field42, arg0);
                        }
                    }
                    if (arg0 == 0 && var4.field841 != null) {
                        class1 var6 = new class1();
                        var6.field17 = var4.field841;
                        var6.field13 = var4;
                        class288.method1973(var6, 90);
                    }
                    if (~arg0 == -2 && var4.field798 != null) {
                        if (var4.field799 >= 0) {
                            class47 var7 = class251.method1741((byte) 110, var4.field834);
                            if (var7 == null || var7.field761 == null || ~var7.field761.length >= ~var4.field799 || var7.field761[var4.field799] != var4) {
                                continue;
                            }
                        }
                        class1 var8 = new class1();
                        var8.field17 = var4.field798;
                        var8.field13 = var4;
                        class288.method1973(var8, 63);
                    }
                }
            }
            ++field1168;
        }
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "(I)V")
    private class66(int arg0) {
        super(0, true);
        this.field1164 = 4096;
        this.field1164 = arg0;
    }

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V")
    public class66() {
        this(4096);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lgd;ZI)V")
    public final void method31(class74 arg0, boolean arg1, int arg2) {
        if (arg1) {
            if (arg2 == 0) {
                this.field1164 = (arg0.method489((byte) -109) << 12) / 255;
            }
            ++field1163;
        }
    }
}
