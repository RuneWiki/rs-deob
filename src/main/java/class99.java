import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class99 extends class139 {

    @OriginalMember(owner = "client!hq", name = "H", descriptor = "I")
    private int field1261 = 4096;

    @OriginalMember(owner = "client!hq", name = "I", descriptor = "I")
    private int field1262 = 4096;

    @OriginalMember(owner = "client!hq", name = "O", descriptor = "I")
    private int field1268 = 4096;

    @OriginalMember(owner = "client!hq", name = "R", descriptor = "I")
    public static int field1271 = 0;

    @OriginalMember(owner = "client!hq", name = "Q", descriptor = "Lkr;")
    public static class486 field1270 = new class486();

    @OriginalMember(owner = "client!hq", name = "U", descriptor = "I")
    public static int field1274 = 1401;

    @OriginalMember(owner = "client!hq", name = "V", descriptor = "I")
    public static int field1275 = 0;

    @OriginalMember(owner = "client!hq", name = "J", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!hq", name = "L", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!hq", name = "M", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!hq", name = "N", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!hq", name = "P", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!hq", name = "S", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!hq", name = "T", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!hq", name = "K", descriptor = "Lb;")
    public static class201 field1264;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method562(int arg0, int arg1, boolean arg2) {
        ++field1267;
        int var3 = -arg0 + arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (~var3 > 5) {
            return "<col=ff3000>";
        } else if (~var3 > 2) {
            return "<col=ff7000>";
        } else if (!arg2) {
            return null;
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (~var3 < -10) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (~var3 < -4) {
            return "<col=80ff00>";
        } else {
            return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "(I)V")
    public static final void method563(int arg0) {
        if (class28.field381 != null) {
            class28.field381.method2476(0);
        }
        ++field1272;
        if (class116.field1481 != null) {
            class116.field1481.method2476(0);
        }
        class208.method1359(class314.field4438.field5777, 2, 22050, 127);
        class28.field381 = class422.method2485(256, 0, 22050, class465.field6503, class252.field3718);
        if (arg0 >= 19) {
            class28.field381.method2484((byte) 110, class157.field2345);
            class116.field1481 = class422.method2485(256, 1, 2048, class465.field6503, class252.field3718);
            class116.field1481.method2484((byte) 72, class59.field796);
        }
    }

    @OriginalMember(owner = "client!hq", name = "<init>", descriptor = "()V")
    public class99() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIII)Z")
    public static final boolean method564(int arg0, int arg1, int arg2, int arg3) {
        if (!class320.method2050(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << class216.field3242;
            int var5 = arg2 << class216.field3242;
            return class459.method2688(var4 + 1, class53.field725[arg0].method1218(arg1, arg2) + arg3, var5 + 1) && class459.method2688(class418.field5845 + var4 - 1, class53.field725[arg0].method1218(arg1 + 1, arg2) + arg3, var5 + 1) && class459.method2688(class418.field5845 + var4 - 1, class53.field725[arg0].method1218(arg1 + 1, arg2 + 1) + arg3, class418.field5845 + var5 - 1) && class459.method2688(var4 + 1, class53.field725[arg0].method1218(arg1, arg2 + 1) + arg3, class418.field5845 + var5 - 1);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IIIII)V")
    public static final void method565(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 0) {
            ++field1273;
            class489 var5 = class116.method731(-625541408, 4, arg0);
            var5.method2863(255);
            var5.field6890 = arg2;
            var5.field6892 = arg3;
            var5.field6895 = arg4;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([SB)[S")
    public static final short[] method566(short[] arg0, byte arg1) {
        ++field1269;
        if (arg0 == null) {
            return null;
        } else {
            if (arg1 <= 119) {
                method562(-28, 30, true);
            }
            short[] var2 = new short[arg0.length];
            class415.method2451(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "(I)V")
    public static void method567(int arg0) {
        if (arg0 != 0) {
            field1271 = -68;
        }
        field1270 = null;
        field1264 = null;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field1263;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (super.field1835.field2395) {
            int[][] var4 = this.method882(0, arg1, 1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class356.field5147; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && ~var13 == ~var14) {
                    var8[var11] = this.field1261 * var12 >> 12;
                    var9[var11] = this.field1262 * var13 >> 12;
                    var10[var11] = this.field1268 * var14 >> 12;
                } else {
                    var8[var11] = this.field1261;
                    var9[var11] = this.field1262;
                    var10[var11] = this.field1268;
                }
            }
        }
        if (arg0 >= -67) {
            this.method21((class276) null, (byte) 62, -86);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field1268 = arg0.method1729(65280);
                }
            } else {
                this.field1262 = arg0.method1729(65280);
            }
        } else {
            this.field1261 = arg0.method1729(65280);
        }
        ++field1266;
        if (arg1 != -45) {
            field1275 = -104;
        }
    }
}
