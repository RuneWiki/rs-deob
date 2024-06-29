import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class172 extends class601 {

    @OriginalMember(owner = "client!ij", name = "J", descriptor = "I")
    private int field2271 = 4096;

    @OriginalMember(owner = "client!ij", name = "H", descriptor = "I")
    private int field2269 = 3216;

    @OriginalMember(owner = "client!ij", name = "K", descriptor = "[I")
    private int[] field2272 = new int[3];

    @OriginalMember(owner = "client!ij", name = "O", descriptor = "I")
    private int field2276 = 3216;

    @OriginalMember(owner = "client!ij", name = "F", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!ij", name = "G", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!ij", name = "L", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ij", name = "M", descriptor = "I")
    public static int field2274;

    @OriginalMember(owner = "client!ij", name = "N", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ij", name = "I", descriptor = "Lwm;")
    public static class30 field2270;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(Lmc;II)V", line = 3)
    public final void method259(class234 arg0, int arg1, int arg2) {
        int var4 = 87 / ((40 - arg2) / 52);
        ++field2274;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field2269 = arg0.method1553((byte) 71);
                }
            } else {
                this.field2276 = arg0.method1553((byte) -127);
            }
        } else {
            this.field2271 = arg0.method1553((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "()V", line = 155)
    public class172() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(B)V", line = 56)
    public final void method292(byte arg0) {
        ++field2273;
        if (arg0 < 44) {
            this.field2272 = null;
        }
        this.method1083(88);
    }

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "(I)V", line = 69)
    public static void method1081(int arg0) {
        if (arg0 != -29867) {
            field2270 = null;
        }
        field2270 = null;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)[I", line = 83)
    public final int[] method261(int arg0, byte arg1) {
        ++field2267;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (arg1 > -76) {
            return null;
        } else {
            if (super.field7643.field4364) {
                int var4 = class739.field9995 * this.field2271 >> 12;
                int[] var5 = this.method3243(arg0 - 1 & class104.field1388, 27123, 0);
                int[] var6 = this.method3243(arg0, 27123, 0);
                int[] var7 = this.method3243(class104.field1388 & arg0 + 1, 27123, 0);
                for (int var8 = 0; class418.field5518 > var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = (var6[var8 + -1 & class511.field6519] + -var6[var8 + 1 & class511.field6519]) * var4 >> 12;
                    int var11 = var10 >> 4;
                    if (~var11 > -1) {
                        var11 = -var11;
                    }
                    int var12 = var9 >> 4;
                    if (~var11 < -256) {
                        var11 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = 255 & class784.field10734[var11 - -((var12 + 1) * var12 >> 1)];
                    int var14 = var9 * var13 >> 8;
                    int var15 = var10 * var13 >> 8;
                    int var16 = var13 * 4096 >> 8;
                    int var17 = this.field2272[1] * var14 >> 12;
                    int var18 = this.field2272[0] * var15 >> 12;
                    int var19 = this.field2272[2] * var16 >> 12;
                    var3[var8] = var17 + var18 + var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([BIII)[B", line = 158)
    public static final byte[] method1082(byte[] arg0, int arg1, int arg2, int arg3) {
        ++field2268;
        byte[] var4;
        if (arg3 <= 0) {
            var4 = arg0;
        } else {
            var4 = new byte[arg1];
            for (int var5 = 0; ~var5 > ~arg1; ++var5) {
                var4[var5] = arg0[arg3 + var5];
            }
        }
        class538 var6 = new class538();
        var6.method2934((byte) -46);
        var6.method2937((long) (arg1 * 8), var4, (byte) -112);
        if (arg2 < 34) {
            field2270 = null;
        }
        byte[] var7 = new byte[64];
        var6.method2938(0, var7, true);
        return var7;
    }

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "(I)V", line = 194)
    private final void method1083(int arg0) {
        ++field2275;
        double var2 = Math.cos((double) ((float) this.field2269 / 4096.0F));
        this.field2272[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field2276 / 4096.0F)));
        this.field2272[1] = (int) (var2 * Math.cos((double) ((float) this.field2276 / 4096.0F)) * 4096.0D);
        this.field2272[2] = (int) (4096.0D * Math.sin((double) ((float) this.field2269 / 4096.0F)));
        int var4 = this.field2272[0] * this.field2272[0] >> 12;
        int var5 = this.field2272[1] * this.field2272[1] >> 12;
        int var6 = this.field2272[2] * this.field2272[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 + var5 + var6 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field2272[1] = (this.field2272[1] << 12) / var7;
            this.field2272[0] = (this.field2272[0] << 12) / var7;
            this.field2272[2] = (this.field2272[2] << 12) / var7;
        }
        if (arg0 <= 9) {
            method1081(-127);
        }
    }
}
