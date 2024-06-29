import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nh")
public class class78 {

    @OriginalMember(owner = "client!nh", name = "g", descriptor = "[I")
    private int[] field1124 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!nh", name = "l", descriptor = "I")
    public int field1129 = -1;

    @OriginalMember(owner = "client!nh", name = "f", descriptor = "Z")
    public boolean field1123 = false;

    @OriginalMember(owner = "client!nh", name = "t", descriptor = "I")
    public static int field1137 = 64;

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!nh", name = "i", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!nh", name = "j", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!nh", name = "k", descriptor = "I")
    public static int field1128;

    @OriginalMember(owner = "client!nh", name = "n", descriptor = "I")
    public static int field1131;

    @OriginalMember(owner = "client!nh", name = "q", descriptor = "I")
    public static int field1134;

    @OriginalMember(owner = "client!nh", name = "r", descriptor = "I")
    public static int field1135;

    @OriginalMember(owner = "client!nh", name = "e", descriptor = "Lkm;")
    public static class133 field1122;

    @OriginalMember(owner = "client!nh", name = "p", descriptor = "Lue;")
    public static class13 field1133;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "[I")
    private int[] field1118;

    @OriginalMember(owner = "client!nh", name = "h", descriptor = "[Lkn;")
    public static class178[] field1125;

    @OriginalMember(owner = "client!nh", name = "d", descriptor = "[S")
    private short[] field1121;

    @OriginalMember(owner = "client!nh", name = "m", descriptor = "[S")
    private short[] field1130;

    @OriginalMember(owner = "client!nh", name = "o", descriptor = "[S")
    private short[] field1132;

    @OriginalMember(owner = "client!nh", name = "s", descriptor = "[S")
    private short[] field1136;

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Lcg;II)V", line = 13)
    private final void method600(class316 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field1129 = arg0.method2219(16448);
        } else if (arg2 == 2) {
            int var8 = arg0.method2219(16448);
            this.field1118 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1118[var9] = arg0.method2220((byte) 104);
            }
        } else if (arg2 == 3) {
            this.field1123 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method2219(arg1 + 36908);
            this.field1132 = new short[var6];
            this.field1136 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1136[var7] = (short) arg0.method2220((byte) 94);
                this.field1132[var7] = (short) arg0.method2220((byte) 38);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method2219(16448);
            this.field1130 = new short[var4];
            this.field1121 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1130[var5] = (short) arg0.method2220((byte) 53);
                this.field1121[var5] = (short) arg0.method2220((byte) 88);
            }
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1124[arg2 - 60] = arg0.method2220((byte) 46);
        }
        if (arg1 != -20460) {
            field1122 = (class133) null;
        }
        field1131++;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(B)Ldl;", line = 90)
    public final class308 method601(byte arg0) {
        field1119++;
        if (this.field1118 == null) {
            return null;
        }
        class308[] var2 = new class308[this.field1118.length];
        for (int var3 = 0; var3 < this.field1118.length; var3++) {
            var2[var3] = class308.method2089(class123.field1670, this.field1118[var3], 0);
        }
        class308 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class308(var2, var2.length);
        }
        if (this.field1136 != null) {
            for (int var5 = 0; var5 < this.field1136.length; var5++) {
                var4.method2095(this.field1136[var5], this.field1132[var5]);
            }
        }
        if (this.field1130 != null) {
            for (int var6 = 0; var6 < this.field1130.length; var6++) {
                var4.method2092(this.field1130[var6], this.field1121[var6]);
            }
        }
        if (arg0 < 9) {
            this.method608(-11);
        }
        return var4;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILcg;)V", line = 147)
    public final void method602(int arg0, class316 arg1) {
        if (arg0 != 0) {
            return;
        }
        field1120++;
        while (true) {
            int var3 = arg1.method2219(16448);
            if (var3 == 0) {
                return;
            }
            this.method600(arg1, -20460, var3);
        }
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(B)V", line = 175)
    public static final void method603(byte arg0) {
        class90.field1264.method2238(76, (byte) -128);
        class90.field1264.method2202(0L, -113);
        class164.field2251++;
        field1134++;
        if (arg0 != 84) {
            field1137 = -17;
        }
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(Z)Ldl;", line = 197)
    public final class308 method604(boolean arg0) {
        class308[] var2 = new class308[5];
        field1126++;
        if (!arg0) {
            this.field1118 = (int[]) null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1124[var4] != -1) {
                var2[var3++] = class308.method2089(class123.field1670, this.field1124[var4], 0);
            }
        }
        class308 var5 = new class308(var2, var3);
        if (this.field1136 != null) {
            for (int var6 = 0; var6 < this.field1136.length; var6++) {
                var5.method2095(this.field1136[var6], this.field1132[var6]);
            }
        }
        if (this.field1130 != null) {
            for (int var7 = 0; var7 < this.field1130.length; var7++) {
                var5.method2092(this.field1130[var7], this.field1121[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!nh", name = "a", descriptor = "(I)V", line = 252)
    public static final void method605(int arg0) {
        field1128++;
        if (class31.field379 == -1 || class196.field2749 == -1) {
            return;
        }
        int var1 = ((class194.field2690 - class162.field2235) * class219.field3139 >> 16) + class162.field2235;
        float[] var2 = new float[3];
        class219.field3139 += var1;
        if (class219.field3139 < 65535) {
            class22.field287 = false;
            class232.field3279 = false;
        } else {
            if (class232.field3279) {
                class22.field287 = false;
            } else {
                class22.field287 = true;
            }
            class219.field3139 = 65535;
            class232.field3279 = true;
        }
        int var3 = class272.field4075 * 2;
        float var4 = (float) class219.field3139 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = (class289.field4315[class31.field379][var3 + 2][var5] + class289.field4315[class31.field379][var3 + 2][var5] - class289.field4315[class31.field379][var3 + 3][var5]) * 3;
            int var7 = class289.field4315[class31.field379][var3][var5] * 3;
            int var8 = class289.field4315[class31.field379][var3][var5];
            int var9 = class289.field4315[class31.field379][var3 + 1][var5] * 3;
            int var10 = var6 + var7 - (var9 * 2);
            int var11 = class289.field4315[class31.field379][var3 + 2][var5] + var9 - var8 - var6;
            int var12 = var9 - var7;
            var2[var5] = (((float) var11 * var4 + (float) var10) * var4 + (float) var12) * var4 + (float) var8;
        }
        class101.field1394 = (int) var2[1] * -1;
        class198.field2820 = (int) var2[0] - class132.field1809 * 128;
        class275.field4123 = (int) var2[2] - (class296.field4394 * 128);
        float[] var13 = new float[3];
        int var14 = class90.field1265 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class289.field4315[class196.field2749][var14][var15] * 3;
            int var17 = class289.field4315[class196.field2749][var14 + 1][var15] * 3;
            int var18 = (class289.field4315[class196.field2749][var14 + 2][var15] + class289.field4315[class196.field2749][var14 + 2][var15] - class289.field4315[class196.field2749][var14 + 3][var15]) * 3;
            int var19 = class289.field4315[class196.field2749][var14][var15];
            int var20 = var16 + var18 - var17 * 2;
            int var21 = class289.field4315[class196.field2749][var14 + 2][var15] + var17 - (var19 + var18);
            int var22 = var17 - var16;
            var13[var15] = (((float) var21 * var4 + (float) var20) * var4 + (float) var22) * var4 + (float) var19;
        }
        float var23 = var13[0] - var2[0];
        float var24 = (var13[1] - var2[1]) * -1.0F;
        float var25 = var13[2] - var2[arg0];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class207.field2972 = (float) Math.atan2((double) var24, var26);
        class188.field2605 = -((float) Math.atan2((double) var23, (double) var25));
        class204.field2944 = (int) ((double) class207.field2972 * 325.949D) & 0x7FF;
        class236.field3347 = (int) ((double) class188.field2605 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(B)Z", line = 354)
    public final boolean method606(byte arg0) {
        field1135++;
        boolean var2 = true;
        if (arg0 != 4) {
            this.method606((byte) 65);
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1124[var3] != -1 && !class123.field1670.method975((byte) 34, 0, this.field1124[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!nh", name = "b", descriptor = "(I)V", line = 383)
    public static void method607(int arg0) {
        field1122 = null;
        if (arg0 != -23252) {
            method605(96);
        }
        field1125 = null;
        field1133 = null;
    }

    @OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)Z", line = 399)
    public final boolean method608(int arg0) {
        field1127++;
        if (this.field1118 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field1118.length; var3++) {
            if (!class123.field1670.method975((byte) 54, 0, this.field1118[var3])) {
                var2 = false;
            }
        }
        return var2;
    }
}
