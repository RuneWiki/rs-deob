import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kp")
public class class345 extends class535 {

    @OriginalMember(owner = "client!kp", name = "G", descriptor = "[I")
    private int[] field5075 = new int[3];

    @OriginalMember(owner = "client!kp", name = "L", descriptor = "I")
    private int field5079 = 3216;

    @OriginalMember(owner = "client!kp", name = "K", descriptor = "I")
    private int field5078 = 4096;

    @OriginalMember(owner = "client!kp", name = "R", descriptor = "I")
    private int field5084 = 3216;

    @OriginalMember(owner = "client!kp", name = "O", descriptor = "I")
    public static int field5081 = 0;

    @OriginalMember(owner = "client!kp", name = "I", descriptor = "Lqv;")
    public static class316 field5077 = new class316(72, 3);

    @OriginalMember(owner = "client!kp", name = "S", descriptor = "I")
    public static int field5085 = 0;

    @OriginalMember(owner = "client!kp", name = "T", descriptor = "Lgw;")
    public static class118 field5086 = new class118();

    @OriginalMember(owner = "client!kp", name = "F", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!kp", name = "H", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!kp", name = "N", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!kp", name = "P", descriptor = "I")
    public static int field5082;

    @OriginalMember(owner = "client!kp", name = "Q", descriptor = "I")
    public static int field5083;

    @OriginalMember(owner = "client!kp", name = "e", descriptor = "(B)V", line = 11)
    public final void method66(byte arg0) {
        this.method2185((byte) 92);
        if (arg0 < 111) {
            field5085 = 33;
        }
        ++field5083;
    }

    @OriginalMember(owner = "client!kp", name = "<init>", descriptor = "()V", line = 214)
    public class345() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(ILwn;I)V", line = 25)
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field5079 = arg1.method3018(566990904);
                }
            } else {
                this.field5084 = arg1.method3018(566990904);
            }
        } else {
            this.field5078 = arg1.method3018(566990904);
        }
        ++field5082;
        if (arg2 != -6232) {
            field5086 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(III)V", line = 72)
    public static final void method2183(int arg0, int arg1, int arg2) {
        ++field5074;
        if (class272.field4083 != 1) {
            if (~class272.field4083 == -3) {
                class302.method1931(arg1, -15, arg0);
            }
        } else {
            class391.method2359(0, arg0, arg1, class277.field4138);
        }
        class277.field4138 = null;
        int var3 = -27 / ((arg2 - 46) / 59);
        class272.field4083 = 0;
    }

    @OriginalMember(owner = "client!kp", name = "b", descriptor = "(II)[I", line = 92)
    public final int[] method65(int arg0, int arg1) {
        ++field5076;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int var4 = class56.field1007 * this.field5078 >> 12;
            int[] var5 = this.method3158(67, 0, class293.field4364 & arg0 - 1);
            int[] var6 = this.method3158(-123, 0, arg0);
            int[] var7 = this.method3158(95, 0, arg0 + 1 & class293.field4364);
            for (int var8 = 0; ~var8 > ~class174.field2597; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class529.field7783 & var8 + -1] + -var6[class529.field7783 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (~var12 > -1) {
                    var12 = -var12;
                }
                if (~var12 < -256) {
                    var12 = 255;
                }
                int var13 = class244.field3659[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                int var14 = var10 * var13 >> 8;
                int var15 = var9 * var13 >> 8;
                int var16 = var13 * 4096 >> 8;
                int var17 = this.field5075[1] * var15 >> 12;
                int var18 = this.field5075[2] * var16 >> 12;
                int var19 = this.field5075[0] * var14 >> 12;
                var3[var8] = var17 + var19 - -var18;
            }
        }
        if (arg1 != 1) {
            this.method66((byte) -26);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kp", name = "a", descriptor = "(Z)V", line = 174)
    public static void method2184(boolean arg0) {
        if (!arg0) {
            field5077 = null;
            field5086 = null;
        }
    }

    @OriginalMember(owner = "client!kp", name = "f", descriptor = "(B)V", line = 185)
    private final void method2185(byte arg0) {
        ++field5080;
        double var2 = Math.cos((double) ((float) this.field5079 / 4096.0F));
        this.field5075[0] = (int) (Math.sin((double) ((float) this.field5084 / 4096.0F)) * var2 * 4096.0D);
        this.field5075[1] = (int) (Math.cos((double) ((float) this.field5084 / 4096.0F)) * var2 * 4096.0D);
        this.field5075[2] = (int) (Math.sin((double) ((float) this.field5079 / 4096.0F)) * 4096.0D);
        int var4 = this.field5075[0] * this.field5075[0] >> 12;
        int var5 = this.field5075[1] * this.field5075[1] >> 12;
        int var6 = this.field5075[2] * this.field5075[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var4 - (-var5 - var6) >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field5075[0] = (this.field5075[0] << 12) / var7;
            this.field5075[2] = (this.field5075[2] << 12) / var7;
            this.field5075[1] = (this.field5075[1] << 12) / var7;
        }
        int var8 = -17 / ((arg0 - 15) / 36);
    }
}
