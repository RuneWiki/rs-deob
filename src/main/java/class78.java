import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class78 extends class34 {

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    private int field1107 = 4096;

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "I")
    private int field1111 = 3216;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    private int field1110 = 3216;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "[I")
    private int[] field1113 = new int[3];

    @OriginalMember(owner = "client!kq", name = "C", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!kq", name = "D", descriptor = "I")
    public static int field1105;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!kq", name = "E", descriptor = "Lqn;")
    public static class436 field1106;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "(I)V")
    public static void method607(int arg0) {
        field1106 = null;
        if (arg0 != 31072) {
            field1106 = null;
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        ++field1108;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 == -3) {
                    this.field1110 = arg0.method1844(-121);
                }
            } else {
                this.field1111 = arg0.method1844(-116);
            }
        } else {
            this.field1107 = arg0.method1844(-119);
        }
        if (arg1 < 16) {
            method608(7, 9, -33, -98, 79, -48, -109, -36);
        }
    }

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "(B)V")
    public final void method146(byte arg0) {
        ++field1109;
        if (arg0 >= -84) {
            this.method609((byte) 12);
        }
        this.method609((byte) 44);
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V")
    public class78() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method608(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1112;
        int var8 = arg2 + arg6;
        int var9 = arg7 - arg2;
        for (int var10 = arg6; var10 < var8; ++var10) {
            class188.method1259(arg1, (byte) 27, arg0, arg5, class42.field626[var10]);
        }
        for (int var11 = arg7; ~var11 < ~var9; --var11) {
            class188.method1259(arg1, (byte) 27, arg0, arg5, class42.field626[var11]);
        }
        int var12 = -arg2 + arg0;
        int var13 = arg1 + arg2;
        if (arg4 != -3) {
            method608(-44, -35, -4, 55, -110, -47, 121, 92);
        }
        for (int var14 = var8; ~var9 <= ~var14; ++var14) {
            int[] var15 = class42.field626[var14];
            class188.method1259(arg1, (byte) 27, var13, arg5, var15);
            class188.method1259(var13, (byte) 27, var12, arg3, var15);
            class188.method1259(var12, (byte) 27, arg0, arg5, var15);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        int var3 = -26 / (arg1 / 50);
        ++field1105;
        int[] var4 = super.field537.method1780(arg0, (byte) 82);
        if (super.field537.field4191) {
            int var5 = class279.field3800 * this.field1107 >> 12;
            int[] var6 = this.method252(false, arg0 + -1 & class343.field4968, 0);
            int[] var7 = this.method252(false, arg0, 0);
            int[] var8 = this.method252(false, arg0 + 1 & class343.field4968, 0);
            for (int var9 = 0; ~var9 > ~class383.field5502; ++var9) {
                int var10 = (var8[var9] + -var6[var9]) * var5 >> 12;
                int var11 = (var7[class120.field1872 & var9 + -1] + -var7[var9 + 1 & class120.field1872]) * var5 >> 12;
                int var12 = var11 >> 4;
                int var13 = var10 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (~var13 > -1) {
                    var13 = -var13;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                if (~var13 < -256) {
                    var13 = 255;
                }
                int var14 = 255 & class392.field5665[((var13 + 1) * var13 >> 1) + var12];
                int var15 = var11 * var14 >> 8;
                int var16 = var10 * var14 >> 8;
                int var17 = var14 * 4096 >> 8;
                int var18 = this.field1113[0] * var15 >> 12;
                int var19 = this.field1113[1] * var16 >> 12;
                int var20 = this.field1113[2] * var17 >> 12;
                var4[var9] = var18 + var19 + var20;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(B)V")
    private final void method609(byte arg0) {
        ++field1104;
        if (arg0 > 3) {
            double var2 = Math.cos((double) ((float) this.field1110 / 4096.0F));
            this.field1113[0] = (int) (var2 * Math.sin((double) ((float) this.field1111 / 4096.0F)) * 4096.0D);
            this.field1113[1] = (int) (4096.0D * Math.cos((double) ((float) this.field1111 / 4096.0F)) * var2);
            this.field1113[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1110 / 4096.0F)));
            int var4 = this.field1113[0] * this.field1113[0] >> 12;
            int var5 = this.field1113[1] * this.field1113[1] >> 12;
            int var6 = this.field1113[2] * this.field1113[2] >> 12;
            int var7 = (int) (4096.0D * Math.sqrt((double) (var5 + var6 + var4 >> 12)));
            if (var7 != 0) {
                this.field1113[0] = (this.field1113[0] << 12) / var7;
                this.field1113[1] = (this.field1113[1] << 12) / var7;
                this.field1113[2] = (this.field1113[2] << 12) / var7;
            }
        }
    }
}
