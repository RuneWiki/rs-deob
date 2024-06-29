import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class636 {

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Ltb;")
    private class450 field8929 = new class450(64);

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lpl;")
    private class612 field8927;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field8922;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field8923;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field8924;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field8928;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field8930;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field8931;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "Lpl;")
    public static class612 field8925;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "[I")
    public static int[] field8926;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lks;II)Z")
    public static final boolean method3562(class30 arg0, int arg1, int arg2) {
        field8930++;
        int var3 = arg0.method200(false, 2);
        if (var3 == 0) {
            if (arg0.method200(false, 1) != 0) {
                method3562(arg0, arg1, 31261);
            }
            int var4 = arg0.method200(false, 6);
            int var5 = arg0.method200(false, 6);
            boolean var6 = arg0.method200(false, 1) == 1;
            if (var6) {
                class139.field1805[class207.field2620++] = arg1;
            }
            if (class351.field4490[arg1] != null) {
                throw new RuntimeException("hr:lr");
            }
            class654 var7 = class359.field4571[arg1];
            class514 var8 = class351.field4490[arg1] = new class514();
            var8.field9676 = arg1;
            if (class476.field6042[arg1] != null) {
                var8.method2783(-1, class476.field6042[arg1]);
            }
            var8.method3873(var7.field9224, 1003, true);
            var8.field9650 = var7.field9225;
            int var9 = var7.field9228;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            int var12 = var9 & 0xFF;
            int var13 = (var11 << 6) + var4 - class145.field1879;
            int var14 = (var12 << 6) + var5 - class630.field8817;
            var8.field6985 = var7.field9223;
            var8.field9752[0] = class492.field6494[arg1];
            var8.field6470 = var8.field6456 = (byte) var10;
            if (class3.method22(var14, var13, 5706)) {
                var8.field6456++;
            }
            var8.method2786(-3377, var13, var14);
            var8.field6978 = false;
            class359.field4571[arg1] = null;
            return true;
        } else if (var3 == 1) {
            int var15 = arg0.method200(false, 2);
            int var16 = class359.field4571[arg1].field9228;
            class359.field4571[arg1].field9228 = (((var16 >> 28) + var15 & 0x3) << 28) + (var16 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var17 = arg0.method200(false, 5);
            int var18 = var17 >> 3;
            int var19 = var17 & 0x7;
            int var20 = class359.field4571[arg1].field9228;
            int var21 = (var20 >> 28) + var18 & 0x3;
            int var22 = (var20 & 0x3FDB35) >> 14;
            int var23 = var20 & 0xFF;
            if (var19 == 0) {
                var23--;
                var22--;
            }
            if (var19 == 1) {
                var23--;
            }
            if (var19 == 2) {
                var22++;
                var23--;
            }
            if (var19 == 3) {
                var22--;
            }
            if (var19 == 4) {
                var22++;
            }
            if (var19 == 5) {
                var22--;
                var23++;
            }
            if (var19 == 6) {
                var23++;
            }
            if (var19 == 7) {
                var23++;
                var22++;
            }
            class359.field4571[arg1].field9228 = (var21 << 28) + (var22 << 14) + var23;
            return false;
        } else {
            int var24 = arg0.method200(false, 18);
            int var25 = var24 >> 16;
            int var26 = var24 >> 8 & 0xFF;
            int var27 = var24 & 0xFF;
            int var28 = class359.field4571[arg1].field9228;
            int var29 = (var28 >> 28) + var25 & 0x3;
            int var30 = (var28 >> 14) + var26 & 0xFF;
            int var31 = var27 + var28 & 0xFF;
            if (arg2 == 31261) {
                class359.field4571[arg1].field9228 = (var29 << 28) + (var30 << 14) + var31;
                return false;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method3563(byte arg0) {
        field8926 = null;
        if (arg0 < 49) {
            field8925 = null;
        }
        field8925 = null;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)Lqb;")
    public final class683 method3564(byte arg0, int arg1) {
        field8931++;
        class450 var3 = this.field8929;
        class683 var4;
        synchronized (this.field8929) {
            var4 = (class683) this.field8929.method2418((long) arg1, (byte) 100);
            if (arg0 != 126) {
                method3562(null, -30, -46);
            }
        }
        if (var4 != null) {
            return var4;
        }
        class612 var5 = this.field8927;
        byte[] var6;
        synchronized (this.field8927) {
            var6 = this.field8927.method3365(class572.method3160(arg1, 1023), 119, class348.method1926(arg1, -252896726));
        }
        class683 var7 = new class683();
        if (var6 != null) {
            var7.method3845(1, new class630(var6));
        }
        class450 var8 = this.field8929;
        synchronized (this.field8929) {
            this.field8929.method2409((long) arg1, var7, arg0 ^ 0x7F);
            return var7;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public final void method3565(int arg0) {
        class450 var2 = this.field8929;
        synchronized (this.field8929) {
            this.field8929.method2412((byte) -125);
        }
        if (arg0 == -15501) {
            field8924++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)V")
    public final void method3566(int arg0, byte arg1) {
        field8922++;
        class450 var3 = this.field8929;
        synchronized (this.field8929) {
            if (arg1 != 75) {
                this.method3567(-96, -8);
            }
            this.field8929.method2411(true, arg0);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II)V")
    public final void method3567(int arg0, int arg1) {
        field8923++;
        class450 var3 = this.field8929;
        synchronized (this.field8929) {
            this.field8929.method2406(18385);
            this.field8929 = new class450(arg1);
        }
        if (arg0 >= -12) {
            this.method3567(-17, -115);
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(I)V")
    public final void method3568(int arg0) {
        class450 var2 = this.field8929;
        synchronized (this.field8929) {
            if (arg0 < 27) {
                this.method3566(46, (byte) 20);
            }
            this.field8929.method2406(18385);
        }
        field8921++;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(Lrf;ILpl;)V")
    public class636(class112 arg0, int arg1, class612 arg2) {
        this.field8927 = arg2;
        if (this.field8927 != null) {
            int var4 = this.field8927.method3342((byte) -107) - 1;
            this.field8927.method3349(var4, true);
        }
    }
}
