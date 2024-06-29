import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class662 extends class125 {

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "Z")
    private boolean field9458 = true;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "I")
    public static int field9461 = -1;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "Llc;")
    public static class435 field9454 = new class435(118, 0);

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "I")
    public static int field9452;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field9453;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field9455;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field9456;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field9457;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field9459;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field9460;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field9462;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        if (!super.field1733.method3303(-1).method2047(11861)) {
            super.field1732 = 0;
        }
        ++field9460;
        if (super.field1732 < 0 || ~super.field1732 < -6) {
            super.field1732 = this.method158((byte) -116);
        }
        if (!arg0) {
            this.method157((byte) 101, -112);
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V")
    public static void method3771(int arg0) {
        if (arg0 != 1) {
            method3771(-39);
        }
        field9454 = null;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZ)V")
    public final void method3772(int arg0, boolean arg1) {
        ++field9455;
        if (arg0 != 1) {
            method3771(-71);
        }
        this.field9458 = arg1;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Lgp;)V")
    public class662(class549 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)Z")
    public final boolean method3773(int arg0) {
        ++field9459;
        int var2 = 70 / ((arg0 - -54) / 38);
        return this.field9458;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(ZI)I")
    public final int method155(boolean arg0, int arg1) {
        ++field9462;
        if (!arg0) {
            return -99;
        } else {
            return !super.field1733.method3303(-1).method2047(11861) ? 3 : 2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
    public static final void method3774(byte arg0) {
        ++field9456;
        class352.field5213.method1203(-26008);
        if (arg0 < 76) {
            method3771(-37);
        }
        int var1 = class352.field5213.method1206(8, (byte) -90);
        if (var1 < class619.field8816) {
            for (int var2 = var1; var2 < class619.field8816; ++var2) {
                class84.field1252[class308.field4177++] = class545.field7927[var2];
            }
        }
        if (class619.field8816 < var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class619.field8816 = 0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class545.field7927[var3];
                class571 var5 = ((class63) class389.field5608.method4020((long) var4, (byte) -75)).field1004;
                int var6 = class352.field5213.method1206(1, (byte) -90);
                if (~var6 == -1) {
                    class545.field7927[class619.field8816++] = var4;
                    var5.field4548 = class628.field8906;
                } else {
                    int var7 = class352.field5213.method1206(2, (byte) -90);
                    if (var7 == 0) {
                        class545.field7927[class619.field8816++] = var4;
                        var5.field4548 = class628.field8906;
                        class597.field8490[class172.field2414++] = var4;
                    } else if (~var7 == -2) {
                        class545.field7927[class619.field8816++] = var4;
                        var5.field4548 = class628.field8906;
                        int var8 = class352.field5213.method1206(3, (byte) -90);
                        var5.method3398(1, var8, 28092);
                        int var9 = class352.field5213.method1206(1, (byte) -90);
                        if (~var9 == -2) {
                            class597.field8490[class172.field2414++] = var4;
                        }
                    } else if (var7 == 2) {
                        class545.field7927[class619.field8816++] = var4;
                        var5.field4548 = class628.field8906;
                        if (~class352.field5213.method1206(1, (byte) -90) == -2) {
                            int var10 = class352.field5213.method1206(3, (byte) -90);
                            var5.method3398(2, var10, 28092);
                            int var11 = class352.field5213.method1206(3, (byte) -90);
                            var5.method3398(2, var11, 28092);
                        } else {
                            int var12 = class352.field5213.method1206(3, (byte) -90);
                            var5.method3398(0, var12, 28092);
                        }
                        int var13 = class352.field5213.method1206(1, (byte) -90);
                        if (~var13 == -2) {
                            class597.field8490[class172.field2414++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class84.field1252[class308.field4177++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
    public final int method158(byte arg0) {
        ++field9452;
        if (!super.field1733.method3303(-1).method2047(11861)) {
            return 0;
        } else {
            int var2 = 74 % ((arg0 - -63) / 49);
            return 2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(BI)V")
    public final void method157(byte arg0, int arg1) {
        ++field9453;
        super.field1732 = arg1;
        if (arg0 > -32) {
            this.method157((byte) 56, -24);
        }
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(Z)I")
    public final int method3775(boolean arg0) {
        ++field9457;
        return arg0 ? 69 : super.field1732;
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(ILgp;)V")
    public class662(int arg0, class549 arg1) {
        super(arg0, arg1);
    }
}
