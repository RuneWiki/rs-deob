import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gq")
public class class515 extends class661 {

    @OriginalMember(owner = "client!gq", name = "B", descriptor = "Lca;")
    public static class308 field7169 = class685.method3835((byte) -42);

    @OriginalMember(owner = "client!gq", name = "D", descriptor = "Lej;")
    public static class124 field7171 = new class124(56, 7);

    @OriginalMember(owner = "client!gq", name = "P", descriptor = "Lad;")
    public static class426 field7183 = new class426(4, 1);

    @OriginalMember(owner = "client!gq", name = "h", descriptor = "F")
    public float field7149;

    @OriginalMember(owner = "client!gq", name = "o", descriptor = "F")
    public float field7156;

    @OriginalMember(owner = "client!gq", name = "q", descriptor = "F")
    public float field7158;

    @OriginalMember(owner = "client!gq", name = "s", descriptor = "F")
    public float field7160;

    @OriginalMember(owner = "client!gq", name = "v", descriptor = "F")
    public float field7163;

    @OriginalMember(owner = "client!gq", name = "y", descriptor = "F")
    public float field7166;

    @OriginalMember(owner = "client!gq", name = "z", descriptor = "F")
    public float field7167;

    @OriginalMember(owner = "client!gq", name = "E", descriptor = "F")
    public float field7172;

    @OriginalMember(owner = "client!gq", name = "G", descriptor = "F")
    public float field7174;

    @OriginalMember(owner = "client!gq", name = "H", descriptor = "F")
    public float field7175;

    @OriginalMember(owner = "client!gq", name = "L", descriptor = "F")
    public float field7179;

    @OriginalMember(owner = "client!gq", name = "M", descriptor = "F")
    public float field7180;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "I")
    public static int field7150;

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "I")
    public static int field7151;

    @OriginalMember(owner = "client!gq", name = "k", descriptor = "I")
    public static int field7152;

    @OriginalMember(owner = "client!gq", name = "l", descriptor = "I")
    public static int field7153;

    @OriginalMember(owner = "client!gq", name = "m", descriptor = "I")
    public static int field7154;

    @OriginalMember(owner = "client!gq", name = "n", descriptor = "I")
    public static int field7155;

    @OriginalMember(owner = "client!gq", name = "r", descriptor = "I")
    public static int field7159;

    @OriginalMember(owner = "client!gq", name = "t", descriptor = "I")
    public static int field7161;

    @OriginalMember(owner = "client!gq", name = "u", descriptor = "I")
    public static int field7162;

    @OriginalMember(owner = "client!gq", name = "w", descriptor = "I")
    public static int field7164;

    @OriginalMember(owner = "client!gq", name = "x", descriptor = "I")
    public static int field7165;

    @OriginalMember(owner = "client!gq", name = "A", descriptor = "I")
    public static int field7168;

    @OriginalMember(owner = "client!gq", name = "C", descriptor = "I")
    public static int field7170;

    @OriginalMember(owner = "client!gq", name = "F", descriptor = "I")
    public static int field7173;

    @OriginalMember(owner = "client!gq", name = "I", descriptor = "I")
    public static int field7176;

    @OriginalMember(owner = "client!gq", name = "J", descriptor = "I")
    public static int field7177;

    @OriginalMember(owner = "client!gq", name = "N", descriptor = "I")
    public static int field7181;

    @OriginalMember(owner = "client!gq", name = "O", descriptor = "I")
    public static int field7182;

    @OriginalMember(owner = "client!gq", name = "p", descriptor = "J")
    public static long field7157;

    @OriginalMember(owner = "client!gq", name = "K", descriptor = "Ld;")
    public static class152 field7178;

    @OriginalMember(owner = "client!gq", name = "i", descriptor = "(I)V", line = 5)
    public static void method3011(int arg0) {
        if (arg0 != 0) {
            method3011(-121);
        }
        field7183 = null;
        field7178 = null;
        field7169 = null;
        field7171 = null;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "()V", line = 21)
    public final void method745() {
        field7182++;
        this.field7166 = this.field7172 = this.field7158 = 1.0F;
        this.field7149 = this.field7156 = this.field7167 = this.field7174 = this.field7163 = this.field7160 = this.field7180 = this.field7179 = this.field7175 = 0.0F;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(III)V", line = 35)
    public final void method744(int arg0, int arg1, int arg2) {
        field7168++;
        this.field7179 = arg1;
        this.field7149 = this.field7156 = this.field7167 = this.field7174 = this.field7163 = this.field7160 = 0.0F;
        this.field7166 = this.field7172 = this.field7158 = 1.0F;
        this.field7180 = arg0;
        this.field7175 = arg2;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(IIIIII)V", line = 49)
    public final void method747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7176++;
        float var7 = class107.field1875[arg3 & 0x3FFF];
        float var8 = class107.field1873[arg3 & 0x3FFF];
        float var9 = class107.field1875[arg4 & 0x3FFF];
        float var10 = class107.field1873[arg4 & 0x3FFF];
        float var11 = class107.field1875[arg5 & 0x3FFF];
        float var12 = class107.field1873[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field7160 = var9 * var13 + var10 * var12;
        this.field7163 = -var10 * var11 + var9 * var14;
        this.field7174 = -var8;
        this.field7172 = var7 * var11;
        this.field7158 = var7 * var9;
        this.field7156 = var7 * var10;
        this.field7149 = -var9 * var12 + var10 * var13;
        this.field7167 = var7 * var12;
        this.field7166 = var9 * var11 + var10 * var14;
        this.field7175 = (float) (-arg0) * this.field7156 - ((float) arg1 * this.field7174) - ((float) arg2 * this.field7158);
        this.field7180 = (float) (-arg0) * this.field7166 - (float) arg1 * this.field7167 - (float) arg2 * this.field7163;
        this.field7179 = (float) (-arg0) * this.field7149 - (float) arg1 * this.field7172 - ((float) arg2 * this.field7160);
    }

    @OriginalMember(owner = "client!gq", name = "j", descriptor = "(I)I", line = 84)
    public static final int method3012(int arg0) {
        if (arg0 == 0) {
            field7151++;
            return class746.field10333;
        } else {
            return -41;
        }
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(Lbca;)V", line = 96)
    public final void method778(class661 arg0) {
        field7177++;
        class515 var2 = (class515) arg0;
        this.field7163 = var2.field7163;
        this.field7175 = var2.field7175;
        this.field7149 = var2.field7149;
        this.field7158 = var2.field7158;
        this.field7160 = var2.field7160;
        this.field7172 = var2.field7172;
        this.field7174 = var2.field7174;
        this.field7166 = var2.field7166;
        this.field7156 = var2.field7156;
        this.field7180 = var2.field7180;
        this.field7167 = var2.field7167;
        this.field7179 = var2.field7179;
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(III[I)V", line = 118)
    public final void method771(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field7163 + (float) arg0 * this.field7166 + (float) arg1 * this.field7167);
        field7181++;
        arg3[1] = (int) ((float) arg2 * this.field7160 + (float) arg0 * this.field7149 + (float) arg1 * this.field7172);
        arg3[2] = (int) ((float) arg2 * this.field7158 + (float) arg0 * this.field7156 + (float) arg1 * this.field7174);
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III)V", line = 135)
    public final void method752(int arg0, int arg1, int arg2) {
        this.field7179 += arg1;
        this.field7175 += arg2;
        this.field7180 += arg0;
        field7155++;
    }

    @OriginalMember(owner = "client!gq", name = "g", descriptor = "(I)V", line = 145)
    public final void method768(int arg0) {
        field7150++;
        float var2 = class107.field1875[arg0 & 0x3FFF];
        float var3 = class107.field1873[arg0 & 0x3FFF];
        float var4 = this.field7166;
        float var5 = this.field7167;
        float var6 = this.field7163;
        this.field7166 = var2 * var4 - (this.field7149 * var3);
        float var7 = this.field7180;
        this.field7167 = var2 * var5 - this.field7172 * var3;
        this.field7149 = this.field7149 * var2 + var3 * var4;
        this.field7163 = var2 * var6 - this.field7160 * var3;
        this.field7172 = this.field7172 * var2 + var3 * var5;
        this.field7160 = this.field7160 * var2 + var3 * var6;
        this.field7180 = var2 * var7 - (this.field7179 * var3);
        this.field7179 = this.field7179 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!gq", name = "d", descriptor = "(I)V", line = 183)
    public final void method756(int arg0) {
        field7152++;
        float var2 = class107.field1875[arg0 & 0x3FFF];
        float var3 = class107.field1873[arg0 & 0x3FFF];
        float var4 = this.field7149;
        float var5 = this.field7172;
        float var6 = this.field7160;
        this.field7149 = var2 * var4 - this.field7156 * var3;
        float var7 = this.field7179;
        this.field7156 = this.field7156 * var2 + var3 * var4;
        this.field7172 = var2 * var5 - this.field7174 * var3;
        this.field7160 = var2 * var6 - (this.field7158 * var3);
        this.field7174 = this.field7174 * var2 + var3 * var5;
        this.field7179 = var2 * var7 - this.field7175 * var3;
        this.field7158 = this.field7158 * var2 + var3 * var6;
        this.field7175 = this.field7175 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(III[I)V", line = 210)
    public final void method750(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field7175);
        field7162++;
        int var6 = (int) ((float) arg1 - this.field7179);
        int var7 = (int) ((float) arg0 - this.field7180);
        arg3[0] = (int) ((float) var5 * this.field7156 + (float) var6 * this.field7149 + (float) var7 * this.field7166);
        arg3[1] = (int) ((float) var5 * this.field7174 + (float) var6 * this.field7172 + (float) var7 * this.field7167);
        arg3[2] = (int) ((float) var5 * this.field7158 + (float) var6 * this.field7160 + (float) var7 * this.field7163);
    }

    @OriginalMember(owner = "client!gq", name = "c", descriptor = "(I)V", line = 227)
    public final void method749(int arg0) {
        field7164++;
        this.field7166 = 1.0F;
        this.field7172 = this.field7158 = class107.field1875[arg0 & 0x3FFF];
        this.field7174 = class107.field1873[arg0 & 0x3FFF];
        this.field7160 = -this.field7174;
        this.field7167 = this.field7163 = this.field7180 = this.field7149 = this.field7179 = this.field7156 = this.field7175 = 0.0F;
    }

    @OriginalMember(owner = "client!gq", name = "e", descriptor = "(I)V", line = 243)
    public final void method742(int arg0) {
        field7161++;
        this.field7158 = 1.0F;
        this.field7166 = this.field7172 = class107.field1875[arg0 & 0x3FFF];
        this.field7149 = class107.field1873[arg0 & 0x3FFF];
        this.field7163 = this.field7180 = this.field7160 = this.field7179 = this.field7156 = this.field7174 = this.field7175 = 0.0F;
        this.field7167 = -this.field7149;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "()Lbca;", line = 264)
    public final class661 method763() {
        field7154++;
        class515 var1 = new class515();
        var1.field7158 = this.field7158;
        var1.field7175 = this.field7175;
        var1.field7156 = this.field7156;
        var1.field7163 = this.field7163;
        var1.field7149 = this.field7149;
        var1.field7160 = this.field7160;
        var1.field7180 = this.field7180;
        var1.field7172 = this.field7172;
        var1.field7167 = this.field7167;
        var1.field7179 = this.field7179;
        var1.field7166 = this.field7166;
        var1.field7174 = this.field7174;
        return var1;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "(I)V", line = 293)
    public final void method748(int arg0) {
        this.field7172 = 1.0F;
        field7170++;
        this.field7166 = this.field7158 = class107.field1875[arg0 & 0x3FFF];
        this.field7163 = class107.field1873[arg0 & 0x3FFF];
        this.field7167 = this.field7180 = this.field7149 = this.field7160 = this.field7179 = this.field7174 = this.field7175 = 0.0F;
        this.field7156 = -this.field7163;
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(I)V", line = 311)
    public final void method774(int arg0) {
        field7153++;
        float var2 = class107.field1875[arg0 & 0x3FFF];
        float var3 = class107.field1873[arg0 & 0x3FFF];
        float var4 = this.field7166;
        float var5 = this.field7167;
        float var6 = this.field7163;
        this.field7166 = this.field7156 * var3 + var2 * var4;
        float var7 = this.field7180;
        this.field7167 = this.field7174 * var3 + var2 * var5;
        this.field7156 = this.field7156 * var2 - (var3 * var4);
        this.field7163 = this.field7158 * var3 + var2 * var6;
        this.field7174 = this.field7174 * var2 - (var3 * var5);
        this.field7158 = this.field7158 * var2 - (var3 * var6);
        this.field7180 = this.field7175 * var3 + var2 * var7;
        this.field7175 = this.field7175 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!gq", name = "a", descriptor = "([I)V", line = 340)
    public final void method769(int[] arg0) {
        field7165++;
        float var2 = (float) arg0[0] - this.field7180;
        float var3 = (float) arg0[1] - this.field7179;
        float var4 = (float) arg0[2] - this.field7175;
        arg0[2] = (int) (this.field7158 * var4 + this.field7163 * var2 + this.field7160 * var3);
        arg0[1] = (int) (this.field7174 * var4 + this.field7172 * var3 + this.field7167 * var2);
        arg0[0] = (int) (this.field7156 * var4 + this.field7166 * var2 + this.field7149 * var3);
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(B)Z", line = 357)
    public static final boolean method3013(byte arg0) {
        if (arg0 <= 115) {
            return true;
        } else {
            field7173++;
            return class192.field2844 > 0;
        }
    }

    @OriginalMember(owner = "client!gq", name = "<init>", descriptor = "()V", line = 367)
    public class515() {
        this.method745();
    }

    @OriginalMember(owner = "client!gq", name = "b", descriptor = "(III[I)V", line = 377)
    public final void method770(int arg0, int arg1, int arg2, int[] arg3) {
        field7159++;
        arg3[1] = (int) ((float) arg2 * this.field7160 + (float) arg0 * this.field7149 + (float) arg1 * this.field7172 + this.field7179);
        arg3[0] = (int) ((float) arg2 * this.field7163 + (float) arg0 * this.field7166 + (float) arg1 * this.field7167 + this.field7180);
        arg3[2] = (int) ((float) arg2 * this.field7158 + (float) arg0 * this.field7156 + (float) arg1 * this.field7174 + this.field7175);
    }
}
