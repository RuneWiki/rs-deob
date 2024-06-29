import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class730 extends class529 {

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "[I")
    private int[] field10212 = new int[3];

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    private int field10215 = 3216;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "I")
    private int field10217 = 4096;

    @OriginalMember(owner = "client!ak", name = "Q", descriptor = "I")
    private int field10223 = 3216;

    @OriginalMember(owner = "client!ak", name = "P", descriptor = "Z")
    public static boolean field10222 = false;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "Lmq;")
    public static class78 field10219 = null;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public static int field10211;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field10213;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public static int field10216;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "I")
    public static int field10218;

    @OriginalMember(owner = "client!ak", name = "N", descriptor = "I")
    public static int field10220;

    @OriginalMember(owner = "client!ak", name = "O", descriptor = "I")
    public static int field10221;

    @OriginalMember(owner = "client!ak", name = "R", descriptor = "I")
    public static int field10224;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "Let;")
    public static class718 field10214;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)[I")
    public final int[] method191(int arg0, byte arg1) {
        ++field10211;
        int[] var3 = super.field7456.method1635(arg0, -101);
        int var4 = 127 / ((arg1 - 27) / 49);
        if (super.field7456.field3449) {
            int var5 = class348.field4510 * this.field10217 >> 12;
            int[] var6 = this.method3028((byte) 106, class33.field516 & arg0 + -1, 0);
            int[] var7 = this.method3028((byte) 118, arg0, 0);
            int[] var8 = this.method3028((byte) 103, class33.field516 & arg0 - -1, 0);
            for (int var9 = 0; ~var9 > ~class304.field3909; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[class404.field5700 & var9 + -1] + -var7[var9 - -1 & class404.field5700]) * var5 >> 12;
                int var12 = var11 >> 4;
                if (~var12 > -1) {
                    var12 = -var12;
                }
                int var13 = var10 >> 4;
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = class704.field9931[((var13 + 1) * var13 >> 1) + var12] & 255;
                int var15 = var11 * var14 >> 8;
                int var16 = var14 * 4096 >> 8;
                int var17 = var10 * var14 >> 8;
                int var18 = this.field10212[0] * var15 >> 12;
                int var19 = this.field10212[2] * var16 >> 12;
                int var20 = this.field10212[1] * var17 >> 12;
                var3[var9] = var18 + var20 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "(I)V")
    private final void method4076(int arg0) {
        ++field10218;
        double var2 = Math.cos((double) ((float) this.field10223 / 4096.0F));
        this.field10212[0] = (int) ((double) arg0 * Math.sin((double) ((float) this.field10215 / 4096.0F)) * var2);
        this.field10212[1] = (int) (Math.cos((double) ((float) this.field10215 / 4096.0F)) * var2 * 4096.0D);
        this.field10212[2] = (int) (4096.0D * Math.sin((double) ((float) this.field10223 / 4096.0F)));
        int var4 = this.field10212[0] * this.field10212[0] >> 12;
        int var5 = this.field10212[1] * this.field10212[1] >> 12;
        int var6 = this.field10212[2] * this.field10212[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (~var7 != -1) {
            this.field10212[2] = (this.field10212[2] << 12) / var7;
            this.field10212[0] = (this.field10212[0] << 12) / var7;
            this.field10212[1] = (this.field10212[1] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public final void method303(int arg0) {
        ++field10220;
        this.method4076(4096);
        if (arg0 > -92) {
            method4078(30, -25, 27);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBLtn;)V")
    public final void method190(int arg0, byte arg1, class179 arg2) {
        ++field10221;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 == -3) {
                    this.field10223 = arg2.method1107(false);
                }
            } else {
                this.field10215 = arg2.method1107(false);
            }
        } else {
            this.field10217 = arg2.method1107(false);
        }
        if (arg1 < 45) {
            this.method303(89);
        }
    }

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "(I)V")
    public static void method4077(int arg0) {
        int var1 = -52 % ((arg0 - 68) / 36);
        field10214 = null;
        field10219 = null;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(III)Z")
    public static final boolean method4078(int arg0, int arg1, int arg2) {
        ++field10216;
        if (arg0 != -999060308) {
            field10214 = null;
        }
        return (arg2 & 393216) != 0 | class303.method1784((byte) 115, arg2, arg1) || class2.method4(0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class730() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILjava/lang/Class;)Lrq;")
    public static final class451 method4079(int arg0, int arg1, int arg2, Class arg3) {
        class73 var4 = class495.field7002[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        } else {
            for (class456 var5 = var4.field969; var5 != null; var5 = var5.field6389) {
                class451 var6 = var5.field6384;
                if (arg3.isAssignableFrom(var6.getClass()) && var6.field6321 == arg1 && var6.field6328 == arg2) {
                    return var6;
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(III)V")
    public static final void method4080(int arg0, int arg1, int arg2) {
        ++field10213;
        if (~class128.field1555 != -2) {
            if (~class128.field1555 == -3) {
                if (!class107.field1323) {
                    class595.method3294(false, arg1, arg0);
                } else {
                    class595.method3294(false, class203.method1259((byte) 122) + arg1, arg0 - -class173.method1075(80));
                }
            }
        } else {
            class268.method1607((byte) -16, arg0, class115.field1415, arg1);
        }
        if (arg2 != 14284) {
            method4077(-100);
        }
        class128.field1555 = 0;
        class115.field1415 = null;
    }
}
