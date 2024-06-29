import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oda")
public class class737 extends class12 {

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "F")
    public float field10140;

    @OriginalMember(owner = "client!oda", name = "j", descriptor = "F")
    public float field10143;

    @OriginalMember(owner = "client!oda", name = "k", descriptor = "F")
    public float field10144;

    @OriginalMember(owner = "client!oda", name = "m", descriptor = "F")
    public float field10146;

    @OriginalMember(owner = "client!oda", name = "n", descriptor = "F")
    public float field10147;

    @OriginalMember(owner = "client!oda", name = "o", descriptor = "F")
    public float field10148;

    @OriginalMember(owner = "client!oda", name = "p", descriptor = "F")
    public float field10149;

    @OriginalMember(owner = "client!oda", name = "s", descriptor = "F")
    public float field10152;

    @OriginalMember(owner = "client!oda", name = "t", descriptor = "F")
    public float field10153;

    @OriginalMember(owner = "client!oda", name = "z", descriptor = "F")
    public float field10159;

    @OriginalMember(owner = "client!oda", name = "D", descriptor = "F")
    public float field10163;

    @OriginalMember(owner = "client!oda", name = "E", descriptor = "F")
    public float field10164;

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "I")
    public static int field10139;

    @OriginalMember(owner = "client!oda", name = "h", descriptor = "I")
    public static int field10141;

    @OriginalMember(owner = "client!oda", name = "i", descriptor = "I")
    public static int field10142;

    @OriginalMember(owner = "client!oda", name = "l", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!oda", name = "q", descriptor = "I")
    public static int field10150;

    @OriginalMember(owner = "client!oda", name = "r", descriptor = "I")
    public static int field10151;

    @OriginalMember(owner = "client!oda", name = "u", descriptor = "I")
    public static int field10154;

    @OriginalMember(owner = "client!oda", name = "v", descriptor = "I")
    public static int field10155;

    @OriginalMember(owner = "client!oda", name = "w", descriptor = "I")
    public static int field10156;

    @OriginalMember(owner = "client!oda", name = "x", descriptor = "I")
    public static int field10157;

    @OriginalMember(owner = "client!oda", name = "y", descriptor = "I")
    public static int field10158;

    @OriginalMember(owner = "client!oda", name = "A", descriptor = "I")
    public static int field10160;

    @OriginalMember(owner = "client!oda", name = "B", descriptor = "I")
    public static int field10161;

    @OriginalMember(owner = "client!oda", name = "C", descriptor = "I")
    public static int field10162;

    @OriginalMember(owner = "client!oda", name = "F", descriptor = "I")
    public static int field10165;

    @OriginalMember(owner = "client!oda", name = "G", descriptor = "I")
    public static int field10166;

    @OriginalMember(owner = "client!oda", name = "H", descriptor = "I")
    public static int field10167;

    @OriginalMember(owner = "client!oda", name = "I", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(III)V", line = 5)
    public final void method50(int arg0, int arg1, int arg2) {
        this.field10164 = arg1;
        field10151++;
        this.field10148 = arg0;
        this.field10152 = arg2;
        this.field10153 = this.field10140 = this.field10147 = this.field10146 = this.field10143 = this.field10159 = 0.0F;
        this.field10149 = this.field10163 = this.field10144 = 1.0F;
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(I)V", line = 17)
    public final void method45(int arg0) {
        field10165++;
        float var2 = class289.field4263[arg0 & 0x3FFF];
        float var3 = class289.field4262[arg0 & 0x3FFF];
        float var4 = this.field10149;
        float var5 = this.field10147;
        float var6 = this.field10143;
        this.field10149 = var2 * var4 - (this.field10153 * var3);
        float var7 = this.field10148;
        this.field10153 = this.field10153 * var2 + var3 * var4;
        this.field10147 = var2 * var5 - this.field10163 * var3;
        this.field10163 = this.field10163 * var2 + var3 * var5;
        this.field10143 = var2 * var6 - this.field10159 * var3;
        this.field10159 = this.field10159 * var2 + var3 * var6;
        this.field10148 = var2 * var7 - this.field10164 * var3;
        this.field10164 = this.field10164 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(Loo;)V", line = 54)
    public final void method49(class12 arg0) {
        field10158++;
        class737 var2 = (class737) arg0;
        this.field10153 = var2.field10153;
        this.field10164 = var2.field10164;
        this.field10159 = var2.field10159;
        this.field10140 = var2.field10140;
        this.field10144 = var2.field10144;
        this.field10147 = var2.field10147;
        this.field10149 = var2.field10149;
        this.field10143 = var2.field10143;
        this.field10152 = var2.field10152;
        this.field10146 = var2.field10146;
        this.field10148 = var2.field10148;
        this.field10163 = var2.field10163;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III[I)V", line = 82)
    public final void method33(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[2] = (int) ((float) arg2 * this.field10144 + (float) arg0 * this.field10140 + (float) arg1 * this.field10146 + this.field10152);
        arg3[0] = (int) ((float) arg2 * this.field10143 + (float) arg0 * this.field10149 + (float) arg1 * this.field10147 + this.field10148);
        field10142++;
        arg3[1] = (int) ((float) arg2 * this.field10159 + (float) arg0 * this.field10153 + (float) arg1 * this.field10163 + this.field10164);
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "()Loo;", line = 94)
    public final class12 method37() {
        field10157++;
        class737 var1 = new class737();
        var1.field10149 = this.field10149;
        var1.field10148 = this.field10148;
        var1.field10163 = this.field10163;
        var1.field10140 = this.field10140;
        var1.field10159 = this.field10159;
        var1.field10143 = this.field10143;
        var1.field10147 = this.field10147;
        var1.field10152 = this.field10152;
        var1.field10146 = this.field10146;
        var1.field10144 = this.field10144;
        var1.field10153 = this.field10153;
        var1.field10164 = this.field10164;
        return var1;
    }

    @OriginalMember(owner = "client!oda", name = "d", descriptor = "(I)V", line = 116)
    public final void method46(int arg0) {
        this.field10144 = 1.0F;
        field10156++;
        this.field10149 = this.field10163 = class289.field4263[arg0 & 0x3FFF];
        this.field10153 = class289.field4262[arg0 & 0x3FFF];
        this.field10143 = this.field10148 = this.field10159 = this.field10164 = this.field10140 = this.field10146 = this.field10152 = 0.0F;
        this.field10147 = -this.field10153;
    }

    @OriginalMember(owner = "client!oda", name = "f", descriptor = "(I)V", line = 131)
    public final void method52(int arg0) {
        field10139++;
        float var2 = class289.field4263[arg0 & 0x3FFF];
        float var3 = class289.field4262[arg0 & 0x3FFF];
        float var4 = this.field10153;
        float var5 = this.field10163;
        float var6 = this.field10159;
        float var7 = this.field10164;
        this.field10153 = var2 * var4 - this.field10140 * var3;
        this.field10163 = var2 * var5 - this.field10146 * var3;
        this.field10140 = this.field10140 * var2 + var3 * var4;
        this.field10159 = var2 * var6 - (this.field10144 * var3);
        this.field10146 = this.field10146 * var2 + var3 * var5;
        this.field10164 = var2 * var7 - (this.field10152 * var3);
        this.field10144 = this.field10144 * var2 + var3 * var6;
        this.field10152 = this.field10152 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!oda", name = "e", descriptor = "(I)V", line = 158)
    public final void method51(int arg0) {
        field10154++;
        float var2 = class289.field4263[arg0 & 0x3FFF];
        float var3 = class289.field4262[arg0 & 0x3FFF];
        float var4 = this.field10149;
        float var5 = this.field10147;
        float var6 = this.field10143;
        float var7 = this.field10148;
        this.field10149 = this.field10140 * var3 + var2 * var4;
        this.field10140 = this.field10140 * var2 - var3 * var4;
        this.field10147 = this.field10146 * var3 + var2 * var5;
        this.field10146 = this.field10146 * var2 - var3 * var5;
        this.field10143 = this.field10144 * var3 + var2 * var6;
        this.field10144 = this.field10144 * var2 - var3 * var6;
        this.field10148 = this.field10152 * var3 + var2 * var7;
        this.field10152 = this.field10152 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "()V", line = 186)
    public final void method42() {
        this.field10153 = this.field10140 = this.field10147 = this.field10146 = this.field10143 = this.field10159 = this.field10148 = this.field10164 = this.field10152 = 0.0F;
        this.field10149 = this.field10163 = this.field10144 = 1.0F;
        field10150++;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(III)V", line = 195)
    public final void method47(int arg0, int arg1, int arg2) {
        field10167++;
        this.field10164 += arg1;
        this.field10148 += arg0;
        this.field10152 += arg2;
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "([I)V", line = 208)
    public final void method34(int[] arg0) {
        field10162++;
        float var2 = (float) arg0[0] - this.field10148;
        float var3 = (float) arg0[1] - this.field10164;
        float var4 = (float) arg0[2] - this.field10152;
        arg0[0] = (int) (this.field10140 * var4 + this.field10153 * var3 + this.field10149 * var2);
        arg0[2] = (int) (this.field10144 * var4 + this.field10159 * var3 + this.field10143 * var2);
        arg0[1] = (int) (this.field10146 * var4 + this.field10163 * var3 + this.field10147 * var2);
    }

    @OriginalMember(owner = "client!oda", name = "g", descriptor = "(I)V", line = 224)
    public static final void method4085(int arg0) {
        field10168++;
        class315.field4517.method2590((byte) 127);
        int var1 = class315.field4517.method2591(-30, 8);
        if (class429.field5988 > var1) {
            for (int var2 = var1; var2 < class429.field5988; var2++) {
                class106.field1246[class396.field5621++] = class425.field5934[var2];
            }
        }
        if (arg0 != 1) {
            return;
        }
        if (var1 > class429.field5988) {
            throw new RuntimeException("gnpov1");
        }
        class429.field5988 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class425.field5934[var3];
            class359 var5 = ((class685) class450.field6288.method3669(false, (long) var4)).field9573;
            int var6 = class315.field4517.method2591(arg0 - 31, 1);
            if (var6 == 0) {
                class425.field5934[class429.field5988++] = var4;
                var5.field9132 = class346.field5034;
            } else {
                int var7 = class315.field4517.method2591(-30, 2);
                if (var7 == 0) {
                    class425.field5934[class429.field5988++] = var4;
                    var5.field9132 = class346.field5034;
                    class588.field8293[class701.field9773++] = var4;
                } else if (var7 == 1) {
                    class425.field5934[class429.field5988++] = var4;
                    var5.field9132 = class346.field5034;
                    int var8 = class315.field4517.method2591(arg0 - 31, 3);
                    var5.method2260((byte) 36, var8, 1);
                    int var9 = class315.field4517.method2591(arg0 ^ 0xFFFFFFE3, 1);
                    if (var9 == 1) {
                        class588.field8293[class701.field9773++] = var4;
                    }
                } else if (var7 == 2) {
                    class425.field5934[class429.field5988++] = var4;
                    var5.field9132 = class346.field5034;
                    if (class315.field4517.method2591(arg0 ^ 0xFFFFFFE3, 1) == 1) {
                        int var11 = class315.field4517.method2591(-30, 3);
                        var5.method2260((byte) 36, var11, 2);
                        int var12 = class315.field4517.method2591(-30, 3);
                        var5.method2260((byte) 36, var12, 2);
                    } else {
                        int var10 = class315.field4517.method2591(-30, 3);
                        var5.method2260((byte) 36, var10, 0);
                    }
                    int var13 = class315.field4517.method2591(-30, 1);
                    if (var13 == 1) {
                        class588.field8293[class701.field9773++] = var4;
                    }
                } else if (var7 == 3) {
                    class106.field1246[class396.field5621++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(I)V", line = 341)
    public final void method38(int arg0) {
        field10161++;
        this.field10163 = 1.0F;
        this.field10149 = this.field10144 = class289.field4263[arg0 & 0x3FFF];
        this.field10143 = class289.field4262[arg0 & 0x3FFF];
        this.field10147 = this.field10148 = this.field10153 = this.field10159 = this.field10164 = this.field10146 = this.field10152 = 0.0F;
        this.field10140 = -this.field10143;
    }

    @OriginalMember(owner = "client!oda", name = "c", descriptor = "(III[I)V", line = 361)
    public final void method48(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (int) ((float) arg2 - this.field10152);
        int var6 = (int) ((float) arg0 - this.field10148);
        field10145++;
        int var7 = (int) ((float) arg1 - this.field10164);
        arg3[2] = (int) ((float) var5 * this.field10144 + (float) var6 * this.field10143 + (float) var7 * this.field10159);
        arg3[0] = (int) ((float) var5 * this.field10140 + (float) var6 * this.field10149 + (float) var7 * this.field10153);
        arg3[1] = (int) ((float) var5 * this.field10146 + (float) var6 * this.field10147 + (float) var7 * this.field10163);
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(III[I)V", line = 377)
    public final void method43(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[1] = (int) ((float) arg2 * this.field10159 + (float) arg0 * this.field10153 + (float) arg1 * this.field10163);
        arg3[0] = (int) ((float) arg2 * this.field10143 + (float) arg0 * this.field10149 + (float) arg1 * this.field10147);
        field10155++;
        arg3[2] = (int) ((float) arg2 * this.field10144 + (float) arg0 * this.field10140 + (float) arg1 * this.field10146);
    }

    @OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V", line = 391)
    public final void method40(int arg0) {
        this.field10149 = 1.0F;
        field10166++;
        this.field10163 = this.field10144 = class289.field4263[arg0 & 0x3FFF];
        this.field10146 = class289.field4262[arg0 & 0x3FFF];
        this.field10159 = -this.field10146;
        this.field10147 = this.field10143 = this.field10148 = this.field10153 = this.field10164 = this.field10140 = this.field10152 = 0.0F;
    }

    @OriginalMember(owner = "client!oda", name = "<init>", descriptor = "()V", line = 404)
    public class737() {
        this.method42();
    }

    @OriginalMember(owner = "client!oda", name = "a", descriptor = "(IIIIII)V", line = 419)
    public final void method39(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field10160++;
        float var7 = class289.field4263[arg3 & 0x3FFF];
        float var8 = class289.field4262[arg3 & 0x3FFF];
        float var9 = class289.field4263[arg4 & 0x3FFF];
        float var10 = class289.field4262[arg4 & 0x3FFF];
        float var11 = class289.field4263[arg5 & 0x3FFF];
        float var12 = class289.field4262[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field10163 = var7 * var11;
        this.field10153 = -var9 * var12 + var10 * var13;
        this.field10159 = var9 * var13 + var10 * var12;
        this.field10143 = -var10 * var11 + var9 * var14;
        this.field10147 = var7 * var12;
        this.field10149 = var9 * var11 + var10 * var14;
        this.field10144 = var7 * var9;
        this.field10146 = -var8;
        this.field10140 = var7 * var10;
        this.field10148 = (float) (-arg0) * this.field10149 - ((float) arg1 * this.field10147) - ((float) arg2 * this.field10143);
        this.field10152 = (float) (-arg0) * this.field10140 - (float) arg1 * this.field10146 - (float) arg2 * this.field10144;
        this.field10164 = (float) (-arg0) * this.field10153 - ((float) arg1 * this.field10163) - ((float) arg2 * this.field10159);
    }
}
