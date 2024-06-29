import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class448 extends class14 {

    @OriginalMember(owner = "client!sp", name = "M", descriptor = "I")
    private int field6112 = 0;

    @OriginalMember(owner = "client!sp", name = "N", descriptor = "I")
    private int field6113 = 0;

    @OriginalMember(owner = "client!sp", name = "P", descriptor = "I")
    private int field6115 = 1;

    @OriginalMember(owner = "client!sp", name = "J", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!sp", name = "K", descriptor = "I")
    public static int field6110;

    @OriginalMember(owner = "client!sp", name = "L", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!sp", name = "O", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!sp", name = "Q", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!sp", name = "R", descriptor = "I")
    public static int field6117;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(BIIIILjs;)Ljava/awt/Frame;", line = 3)
    public static final Frame method2568(byte arg0, int arg1, int arg2, int arg3, int arg4, class216 arg5) {
        ++field6110;
        if (!arg5.method1359(-5)) {
            return null;
        } else {
            if (~arg4 == -1) {
                class83[] var6 = class116.method794((byte) -88, arg5);
                if (var6 == null) {
                    return null;
                }
                boolean var7 = false;
                for (int var8 = 0; var6.length > var8; ++var8) {
                    if (var6[var8].field1234 == arg1 && var6[var8].field1237 == arg2 && (arg3 == 0 || ~var6[var8].field1236 == ~arg3) && (!var7 || ~arg4 > ~var6[var8].field1239)) {
                        arg4 = var6[var8].field1239;
                        var7 = true;
                    }
                }
                if (!var7) {
                    return null;
                }
            }
            class446 var9 = arg5.method1351(arg1, arg3, -246664304, arg4, arg2);
            if (arg0 >= -99) {
                method2569((String) null, (String) null, 34, (String) null);
            }
            while (var9.field6100 == 0) {
                class94.method674(10L, 1);
            }
            Frame var10 = (Frame) var9.field6104;
            if (var10 == null) {
                return null;
            } else if (~var9.field6100 == -3) {
                class423.method2437(var10, true, arg5);
                return null;
            } else {
                return var10;
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "<init>", descriptor = "()V", line = 74)
    public class448() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IB)[I", line = 77)
    public final int[] method140(int arg0, byte arg1) {
        ++field6117;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (super.field270.field5222) {
            int var4 = class273.field3590[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~var6 > ~class115.field1637; ++var6) {
                int var7 = class195.field2715[var6];
                int var8 = var7 + -2048 >> 1;
                int var9;
                if (~this.field6113 == -1) {
                    var9 = (-var4 + var7) * this.field6115;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (4096.0D * Math.sqrt((double) ((float) var10 / 4096.0F)));
                    var9 = (int) ((double) (this.field6115 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (-4096 & var9);
                if (this.field6112 != 0) {
                    if (~this.field6112 == -3) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class383.field5225[(4089 & var12) >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        return arg1 > -2 ? null : var3;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;", line = 148)
    public static final String method2569(String arg0, String arg1, int arg2, String arg3) {
        ++field6114;
        if (arg2 != 0) {
            return null;
        } else {
            for (int var4 = arg3.indexOf(arg0); ~var4 != 0; var4 = arg3.indexOf(arg0, arg1.length() + var4)) {
                arg3 = arg3.substring(0, var4) + arg1 + arg3.substring(arg0.length() + var4);
            }
            return arg3;
        }
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V", line = 168)
    public final void method142(byte arg0) {
        class204.method1307((byte) 64);
        ++field6111;
        int var2 = -104 % ((arg0 - 39) / 59);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IBLmd;)V", line = 179)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 3) {
                    this.field6115 = arg2.method2238(255);
                }
            } else {
                this.field6112 = arg2.method2238(255);
            }
        } else {
            this.field6113 = arg2.method2238(255);
        }
        int var5 = 70 / ((arg1 - -51) / 37);
        ++field6109;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(IB)V", line = 229)
    public static final void method2570(int arg0, byte arg1) {
        if (arg1 > 90) {
            ++field6116;
            class253 var2 = class332.method1911(arg0, (byte) 61, 3);
            var2.method1523((byte) -126);
        }
    }
}
