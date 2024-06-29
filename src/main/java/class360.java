import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class360 extends class298 {

    @OriginalMember(owner = "client!qk", name = "O", descriptor = "I")
    private int field5180 = 3216;

    @OriginalMember(owner = "client!qk", name = "P", descriptor = "I")
    private int field5181 = 4096;

    @OriginalMember(owner = "client!qk", name = "Q", descriptor = "I")
    private int field5182 = 3216;

    @OriginalMember(owner = "client!qk", name = "W", descriptor = "[I")
    private int[] field5188 = new int[3];

    @OriginalMember(owner = "client!qk", name = "M", descriptor = "Z")
    private static boolean field5178 = false;

    @OriginalMember(owner = "client!qk", name = "K", descriptor = "[Lvt;")
    public static class179[] field5176 = new class179[2048];

    @OriginalMember(owner = "client!qk", name = "Y", descriptor = "I")
    public static int field5190 = 0;

    @OriginalMember(owner = "client!qk", name = "bb", descriptor = "Lpn;")
    public static class72 field5193;

    @OriginalMember(owner = "client!qk", name = "cb", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!qk", name = "L", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!qk", name = "N", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!qk", name = "R", descriptor = "I")
    public static int field5183;

    @OriginalMember(owner = "client!qk", name = "S", descriptor = "I")
    public static int field5184;

    @OriginalMember(owner = "client!qk", name = "T", descriptor = "I")
    public static int field5185;

    @OriginalMember(owner = "client!qk", name = "U", descriptor = "I")
    public static int field5186;

    @OriginalMember(owner = "client!qk", name = "V", descriptor = "I")
    public static int field5187;

    @OriginalMember(owner = "client!qk", name = "X", descriptor = "I")
    public static int field5189;

    @OriginalMember(owner = "client!qk", name = "Z", descriptor = "I")
    public static int field5191;

    @OriginalMember(owner = "client!qk", name = "ab", descriptor = "I")
    public static int field5192;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "(I)V")
    private final void method2192(int arg0) {
        ++field5177;
        double var2 = Math.cos((double) ((float) this.field5180 / 4096.0F));
        this.field5188[0] = (int) (4096.0D * var2 * Math.sin((double) ((float) this.field5182 / 4096.0F)));
        this.field5188[1] = (int) (Math.cos((double) ((float) this.field5182 / 4096.0F)) * var2 * 4096.0D);
        this.field5188[2] = (int) (4096.0D * Math.sin((double) ((float) this.field5180 / 4096.0F)));
        int var4 = this.field5188[0] * this.field5188[0] >> 12;
        int var5 = this.field5188[1] * this.field5188[1] >> 12;
        int var6 = this.field5188[2] * this.field5188[2] >> 12;
        if (arg0 != -11950) {
            this.field5180 = 94;
        }
        int var7 = (int) (4096.0D * Math.sqrt((double) (var4 + var6 + var5 >> 12)));
        if (var7 != 0) {
            this.field5188[2] = (this.field5188[2] << 12) / var7;
            this.field5188[1] = (this.field5188[1] << 12) / var7;
            this.field5188[0] = (this.field5188[0] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
    public static final String method2193(int arg0, String arg1) {
        ++field5179;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 0;
            int var3 = arg1.length();
            while (var3 > var2 && class227.method1253(arg1.charAt(var2), (byte) 68)) {
                ++var2;
            }
            if (arg0 > -55) {
                method2195((byte) 44);
            }
            while (~var3 < ~var2 && class227.method1253(arg1.charAt(var3 + -1), (byte) 68)) {
                --var3;
            }
            int var4 = -var2 + var3;
            if (var4 >= 1 && var4 <= 12) {
                StringBuffer var5 = new StringBuffer(var4);
                for (int var6 = var2; ~var3 < ~var6; ++var6) {
                    char var7 = arg1.charAt(var6);
                    if (class174.method857(var7, 18)) {
                        char var8 = class276.method1684(true, var7);
                        if (var8 != 0) {
                            var5.append(var8);
                        }
                    }
                }
                if (~var5.length() == -1) {
                    return null;
                } else {
                    return var5.toString();
                }
            } else {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IZ)[I")
    public final int[] method13(int arg0, boolean arg1) {
        ++field5189;
        int[] var3 = super.field4443.method2877(arg0, 1);
        if (!arg1) {
            field5178 = true;
        }
        if (super.field4443.field6915) {
            int var4 = class154.field1857 * this.field5181 >> 12;
            int[] var5 = this.method1882(0, -2594, class208.field2886 & arg0 + -1);
            int[] var6 = this.method1882(0, -2594, arg0);
            int[] var7 = this.method1882(0, -2594, arg0 + 1 & class208.field2886);
            for (int var8 = 0; ~class158.field1877 < ~var8; ++var8) {
                int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                int var10 = (var6[class474.field6656 & var8 + -1] - var6[class474.field6656 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                int var12 = var9 >> 4;
                if (~var11 < -256) {
                    var11 = 255;
                }
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class325.field4686[var11 - -((var12 + 1) * var12 >> 1)] & 255;
                int var14 = var13 * 4096 >> 8;
                int var15 = var10 * var13 >> 8;
                int var16 = var9 * var13 >> 8;
                int var17 = this.field5188[2] * var14 >> 12;
                int var18 = this.field5188[0] * var15 >> 12;
                int var19 = this.field5188[1] * var16 >> 12;
                var3[var8] = var18 + var19 + var17;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "(I)V")
    public final void method15(int arg0) {
        this.method2192(-11950);
        if (arg0 <= -41) {
            ++field5191;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIB)V")
    public static final void method2194(int arg0, int arg1, byte arg2) {
        int var3 = -27 / ((68 - arg2) / 55);
        ++field5187;
        class89 var4 = class146.method695(14, arg1, (byte) -83);
        var4.method449(true);
        var4.field1106 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IILvt;)V")
    public final void method10(int arg0, int arg1, class179 arg2) {
        ++field5184;
        if (arg0 < -44) {
            if (arg1 != 0) {
                if (arg1 != 1) {
                    if (~arg1 == -3) {
                        this.field5180 = arg2.method916(21933);
                    }
                } else {
                    this.field5182 = arg2.method916(21933);
                }
            } else {
                this.field5181 = arg2.method916(21933);
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "()V")
    public class360() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(B)V")
    public static void method2195(byte arg0) {
        field5193 = null;
        int var1 = 23 / ((-48 - arg0) / 48);
        field5176 = null;
    }

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "(B)V")
    public static final void method2196(byte arg0) {
        ++field5192;
        if (~class69.field855 != 0 && ~class356.field5115 != 0) {
            int var1 = ((-class92.field1145 + class408.field5782) * class361.field5206 >> 16) + class92.field1145;
            class361.field5206 += var1;
            if (~class361.field5206 <= -65536) {
                if (!field5178) {
                    class84.field1018 = true;
                } else {
                    class84.field1018 = false;
                }
                class361.field5206 = 65535;
                field5178 = true;
            } else {
                class84.field1018 = false;
                field5178 = false;
            }
            float var2 = (float) class361.field5206 / 65535.0F;
            float[] var3 = new float[3];
            int var4 = class118.field1456 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class490.field6929[class69.field855][var4][var5] * 3;
                int var22 = class490.field6929[class69.field855][var4 + 1][var5] * 3;
                int var23 = (class490.field6929[class69.field855][var4 + 2][var5] + -class490.field6929[class69.field855][var4 + 3][var5] + class490.field6929[class69.field855][var4 + 2][var5]) * 3;
                int var24 = class490.field6929[class69.field855][var4][var5];
                int var25 = var22 - var21;
                int var26 = var21 + var23 + -(var22 * 2);
                int var27 = class490.field6929[class69.field855][var4 + 2][var5] + -var24 + -var23 + var22;
                var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
            }
            class58.field734 = (int) var3[0] + -(class93.field1163 * 128);
            class427.field6145 = (int) var3[1] * -1;
            class351.field5047 = (int) var3[2] + -(class349.field5023 * 128);
            float[] var6 = new float[3];
            int var7 = class42.field511 * 2;
            if (arg0 < -24) {
                for (int var8 = 0; ~var8 > -4; ++var8) {
                    int var14 = class490.field6929[class356.field5115][var7][var8] * 3;
                    int var15 = class490.field6929[class356.field5115][var7 + 1][var8] * 3;
                    int var16 = (class490.field6929[class356.field5115][var7 - -2][var8] + -class490.field6929[class356.field5115][var7 + 3][var8] + class490.field6929[class356.field5115][var7 - -2][var8]) * 3;
                    int var17 = class490.field6929[class356.field5115][var7][var8];
                    int var18 = -var14 + var15;
                    int var19 = -(var15 * 2) + var14 + var16;
                    int var20 = class490.field6929[class356.field5115][var7 + 2][var8] + var15 - var17 - var16;
                    var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
                }
                float var9 = var6[0] + -var3[0];
                float var10 = (var6[1] + -var3[1]) * -1.0F;
                float var11 = var6[2] - var3[2];
                double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
                class120.field1490 = (int) (2607.5945876176133D * Math.atan2((double) var10, var12)) & 16383;
                class13.field193 = 16383 & (int) (2607.5945876176133D * -Math.atan2((double) var9, (double) var11));
                class401.field5718 = ((class490.field6929[class69.field855][var4 + 2][3] + -class490.field6929[class69.field855][var4][3]) * class361.field5206 >> 16) + class490.field6929[class69.field855][var4][3];
            }
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "([[II)V")
    public static final void method2197(int[][] arg0, int arg1) {
        class240.field3303 = arg0;
        ++field5185;
        if (arg1 != -27964) {
            field5194 = -50;
        }
    }

    static {
        new class40("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field5193 = new class72(65, 3);
        field5194 = 0;
    }
}
