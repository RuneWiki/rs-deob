import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class74 extends class512 {

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    private int field1266 = 3072;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    private int field1268 = 2048;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    private int field1270 = 1024;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field1267 = 0;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!gg", name = "R", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 5)
    public static final void method521(String arg0, int arg1, int arg2) {
        ++field1261;
        class266 var3 = class308.method1961(true, arg2, arg1);
        var3.method1781((byte) 95);
        var3.field4452 = arg0;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZIII)V", line = 17)
    public static final void method522(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            method521((String) null, 61, -40);
        }
        ++field1269;
        if (~class510.field7403.field5119 != -1 && ~arg0 != -1 && ~class238.field4104 > -51 && ~arg4 != 0) {
            class241.field4163[class238.field4104++] = new class452((byte) 2, arg4, arg0, arg3, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!gg", name = "<init>", descriptor = "()V", line = 36)
    public class74() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(II)[[I", line = 46)
    public final int[][] method278(int arg0, int arg1) {
        ++field1271;
        int[][] var3 = super.field7496.method2777(arg1, 0);
        int var4 = 79 / ((-40 - arg0) / 47);
        if (super.field7496.field6942) {
            int[][] var5 = this.method3012(arg1, 104, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var3[0];
            int[] var10 = var3[1];
            int[] var11 = var3[2];
            for (int var12 = 0; ~class402.field6113 < ~var12; ++var12) {
                var9[var12] = this.field1270 - -(var6[var12] * this.field1268 >> 12);
                var10[var12] = (var7[var12] * this.field1268 >> 12) + this.field1270;
                var11[var12] = this.field1270 - -(var8[var12] * this.field1268 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V", line = 97)
    public final void method74(int arg0) {
        if (arg0 == 12388) {
            this.field1268 = -this.field1270 + this.field1266;
            ++field1263;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZILia;)V", line = 108)
    public final void method71(boolean arg0, int arg1, class23 arg2) {
        ++field1264;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 == -3) {
                    super.field7491 = arg2.method126((byte) -125) == 1;
                }
            } else {
                this.field1266 = arg2.method132(105);
            }
        } else {
            this.field1270 = arg2.method132(35);
        }
        if (!arg0) {
            this.field1270 = -12;
        }
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "(Z)Z", line = 156)
    public static final boolean method523(boolean arg0) {
        ++field1265;
        if (arg0) {
            return false;
        } else {
            try {
                return class395.method2470(28);
            } catch (IOException var4) {
                class404.method2503((byte) -128);
                return true;
            } catch (Exception var5) {
                String var2 = "T2 - " + (class339.field5325 == null ? -1 : class339.field5325.method1986(8)) + "," + (class212.field3373 != null ? class212.field3373.method1986(8) : -1) + "," + (class534.field7847 == null ? -1 : class534.field7847.method1986(8)) + " - " + class195.field3050 + "," + (class302.field4850.field3159[0] + class16.field181) + "," + (class302.field4850.field3158[0] + class455.field6794) + " - ";
                for (int var3 = 0; var3 < class195.field3050 && var3 < 50; ++var3) {
                    var2 = var2 + class506.field7365.field302[var3] + ",";
                }
                class502.method2968(var2, (byte) -123, var5);
                class165.method1132(false, arg0);
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)[I", line = 189)
    public final int[] method75(int arg0, byte arg1) {
        ++field1262;
        int[] var3 = super.field7494.method232(arg0, true);
        int var4 = 60 % ((arg1 - 43) / 48);
        if (super.field7494.field474) {
            int[] var5 = this.method3013(false, 0, arg0);
            for (int var6 = 0; class402.field6113 > var6; ++var6) {
                var3[var6] = this.field1270 - -(var5[var6] * this.field1268 >> 12);
            }
        }
        return var3;
    }
}
