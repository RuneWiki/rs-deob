import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class19 extends class59 {

    @OriginalMember(owner = "client!wf", name = "O", descriptor = "I")
    private int field258 = 4096;

    @OriginalMember(owner = "client!wf", name = "T", descriptor = "I")
    private int field263 = 4096;

    @OriginalMember(owner = "client!wf", name = "V", descriptor = "I")
    private int field265 = 4096;

    @OriginalMember(owner = "client!wf", name = "S", descriptor = "[S")
    public static short[] field262 = new short[256];

    @OriginalMember(owner = "client!wf", name = "Q", descriptor = "I")
    public static int field260 = 0;

    @OriginalMember(owner = "client!wf", name = "I", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!wf", name = "J", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!wf", name = "K", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!wf", name = "M", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!wf", name = "P", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!wf", name = "R", descriptor = "I")
    public static int field261;

    @OriginalMember(owner = "client!wf", name = "U", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!wf", name = "W", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!wf", name = "L", descriptor = "[Lcl;")
    public static class32[] field256;

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "()V", line = 3)
    public class19() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "(I)V", line = 19)
    public static final void method114(int arg0) {
        field255++;
        if (class208.field3429 > 0) {
            class110.method836(false);
            return;
        }
        class263.field4396 = class121.field2031;
        if (arg0 == 4096) {
            class121.field2031 = null;
            class80.method595(40, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZLce;)V", line = 43)
    public static final void method115(boolean arg0, class209 arg1) {
        field253++;
        class332 var2 = (class332) class122.field2049.method713(3365, arg1.field3463.method1634(false));
        if (!arg0) {
            method114(-14);
        }
        if (var2 == null) {
            class250.method1756(arg1.field5104[0], class298.field4849, !arg0, 0, arg1, (class83) null, arg1.field5159[0], (class217) null);
        } else {
            var2.method2271(0);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(II)[[I", line = 73)
    public final int[][] method116(int arg0, int arg1) {
        if (arg1 != 4588) {
            this.field265 = -91;
        }
        field266++;
        int[][] var3 = this.field838.method1796(true, arg0);
        if (this.field838.field4334) {
            int[][] var4 = this.method397(1, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class293.field4789; var11++) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 == var14 && var13 == var14) {
                    var8[var11] = this.field265 * var12 >> 12;
                    var9[var11] = this.field258 * var14 >> 12;
                    var10[var11] = this.field263 * var13 >> 12;
                } else {
                    var8[var11] = this.field265;
                    var9[var11] = this.field258;
                    var10[var11] = this.field263;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZII)I", line = 136)
    public static final int method117(boolean arg0, int arg1, int arg2) {
        field264++;
        if (arg2 == -1) {
            return 12345678;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 ? 45 : (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(B)V", line = 164)
    public static void method118(byte arg0) {
        field262 = null;
        if (arg0 == 18) {
            field256 = null;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(IIIII)V", line = 178)
    public static final void method119(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field261++;
        if (class192.field3172 <= (arg1 - arg3) && (arg1 + arg3) <= class77.field1289 && class206.field3398 <= arg4 - arg3 && (arg3 + arg4) <= class214.field3533) {
            class58.method388(arg3, arg2, (byte) -63, arg1, arg4);
        } else {
            class314.method2130(arg4, arg3, arg1, arg2, true);
        }
        if (arg0 != 0) {
            method118((byte) -1);
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(BILhb;)V", line = 203)
    public final void method67(byte arg0, int arg1, class164 arg2) {
        field259++;
        if (arg0 != 115) {
            this.method67((byte) -106, -12, (class164) null);
        }
        if (arg1 == 0) {
            this.field265 = arg2.method1161(true);
        } else if (arg1 == 1) {
            this.field258 = arg2.method1161(true);
        } else if (arg1 == 2) {
            this.field263 = arg2.method1161(true);
        }
    }
}
