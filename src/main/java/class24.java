import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fba")
public class class24 extends class416 {

    @OriginalMember(owner = "client!fba", name = "K", descriptor = "Z")
    public static boolean field412 = false;

    @OriginalMember(owner = "client!fba", name = "J", descriptor = "[I")
    public static int[] field411 = new int[14];

    @OriginalMember(owner = "client!fba", name = "x", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!fba", name = "y", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!fba", name = "z", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!fba", name = "A", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!fba", name = "C", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!fba", name = "I", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!fba", name = "M", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!fba", name = "N", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!fba", name = "O", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!fba", name = "B", descriptor = "Ljava/lang/String;")
    public String field405;

    @OriginalMember(owner = "client!fba", name = "D", descriptor = "[C")
    public char[] field407;

    @OriginalMember(owner = "client!fba", name = "L", descriptor = "[C")
    public char[] field413;

    @OriginalMember(owner = "client!fba", name = "F", descriptor = "[I")
    public int[] field408;

    @OriginalMember(owner = "client!fba", name = "G", descriptor = "[I")
    public int[] field409;

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILee;)V", line = 5)
    private final void method234(int arg0, int arg1, class677 arg2) {
        field404++;
        if (arg0 == 1) {
            this.field405 = arg2.method3793(15598);
        } else if (arg0 == 2) {
            int var7 = arg2.method3821((byte) 108);
            this.field409 = new int[var7];
            this.field413 = new char[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field409[var8] = arg2.method3807(-1);
                byte var9 = arg2.method3811(42);
                this.field413[var8] = var9 == 0 ? 0 : class703.method3957((byte) -71, var9);
            }
        } else if (arg0 == 3) {
            int var4 = arg2.method3821((byte) 82);
            this.field407 = new char[var4];
            this.field408 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field408[var5] = arg2.method3807(class712.method4000(arg1, -3));
                byte var6 = arg2.method3811(78);
                this.field407[var5] = var6 == 0 ? 0 : class703.method3957((byte) -71, var6);
            }
        }
        if (arg1 != 2) {
            method242(-8, -37, null, 63);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 69)
    public static final void method235(int arg0, int arg1, int arg2, Class arg3) {
        class701 var4 = class660.field8718[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class10 var5 = var4.field9742; var5 != null; var5 = var5.field174) {
            class675 var6 = var5.field170;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field9367 == arg1 && var6.field9354 == arg2) {
                class208.method1389(var6, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(CI)I", line = 96)
    public final int method236(char arg0, int arg1) {
        field403++;
        if (this.field409 == null) {
            return -1;
        }
        for (int var3 = 0; var3 < this.field409.length; var3++) {
            if (this.field413[var3] == arg0) {
                return this.field409[var3];
            }
        }
        if (arg1 != 4137) {
            method241(-0.030454393F, -6, -116, 12, 1.1089808F, (byte) 14, -121, -49, 99, -1.393981F, 117, null, null, 70);
        }
        return -1;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BIIII)I", line = 121)
    public static final int method237(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field402++;
        int var5 = 65536 - class451.field6177[arg3 * 8192 / arg1] >> 1;
        if (arg0 >= -80) {
            field414 = -26;
        }
        return ((65536 - var5) * arg4 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(B)V", line = 137)
    public static void method238(byte arg0) {
        field411 = null;
        if (arg0 != 113) {
            method237((byte) -1, 12, 19, -70, -55);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(BC)I", line = 151)
    public final int method239(byte arg0, char arg1) {
        field415++;
        if (this.field408 == null) {
            return -1;
        }
        if (arg0 <= 85) {
            method235(116, -104, -89, null);
        }
        for (int var3 = 0; var3 < this.field408.length; var3++) {
            if (this.field407[var3] == arg1) {
                return this.field408[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!fba", name = "e", descriptor = "(B)V", line = 179)
    public final void method240(byte arg0) {
        if (this.field408 != null) {
            for (int var2 = 0; var2 < this.field408.length; var2++) {
                this.field408[var2] = class446.method2556(this.field408[var2], 32768);
            }
        }
        field401++;
        if (this.field409 != null) {
            for (int var3 = 0; var3 < this.field409.length; var3++) {
                this.field409[var3] = class446.method2556(this.field409[var3], 32768);
            }
        }
        if (arg0 != -31) {
            this.method234(70, -3, null);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(FIIIFBIIIFI[F[FI)V", line = 209)
    public static final void method241(float arg0, int arg1, int arg2, int arg3, float arg4, byte arg5, int arg6, int arg7, int arg8, float arg9, int arg10, float[] arg11, float[] arg12, int arg13) {
        if (arg5 != 9) {
            method242(99, -32, null, -75);
        }
        int var14 = arg2 - arg3;
        int var15 = arg7 - arg1;
        field410++;
        int var16 = arg8 - arg6;
        float var17 = arg12[2] * (float) var14 + arg12[1] * (float) var16 + arg12[0] * (float) var15;
        float var18 = arg12[5] * (float) var14 + arg12[3] * (float) var15 + arg12[4] * (float) var16;
        float var19 = arg12[8] * (float) var14 + arg12[6] * (float) var15 + arg12[7] * (float) var16;
        float var20;
        float var21;
        if (arg13 == 0) {
            var20 = arg9 + var17 + 0.5F;
            var21 = arg0 + 0.5F - var19;
        } else if (arg13 == 1) {
            var21 = arg0 + var19 + 0.5F;
            var20 = arg9 + var17 + 0.5F;
        } else if (arg13 == 2) {
            var21 = arg4 + 0.5F - var18;
            var20 = arg9 + 0.5F - var17;
        } else if (arg13 == 3) {
            var20 = arg9 + var17 + 0.5F;
            var21 = arg4 + 0.5F - var18;
        } else if (arg13 == 4) {
            var20 = arg0 + var19 + 0.5F;
            var21 = arg4 + 0.5F - var18;
        } else {
            var21 = arg4 + 0.5F - var18;
            var20 = arg0 + 0.5F - var19;
        }
        if (arg10 == 1) {
            float var23 = var20;
            var20 = -var21;
            var21 = var23;
        } else if (arg10 == 2) {
            var21 = -var21;
            var20 = -var20;
        } else if (arg10 == 3) {
            float var22 = var20;
            var20 = var21;
            var21 = -var22;
        }
        arg11[1] = var21;
        arg11[0] = var20;
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(IILvfa;I)V", line = 296)
    public static final void method242(int arg0, int arg1, class672 arg2, int arg3) {
        field416++;
        class490 var4 = arg2.method3715(class341.field4807, arg0 ^ arg0);
        if (var4 == null) {
            return;
        }
        class341.field4807.method419(arg1, arg3, arg2.field9287 + arg1, arg2.field9178 + arg3);
        if (class694.field9657 >= 3) {
            class341.field4807.method432(-16777216, var4, arg1, arg3);
        } else {
            class491.field6658.method1037((float) arg2.field9287 / 2.0F + (float) arg1, (float) arg2.field9178 / 2.0F + (float) arg3, 4096, ((int) (-class547.field7230) & 0x3FFF) << 2, var4, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!fba", name = "a", descriptor = "(Lee;B)V", line = 329)
    public final void method243(class677 arg0, byte arg1) {
        field406++;
        while (true) {
            int var3 = arg0.method3821((byte) 114);
            if (var3 == 0) {
                if (arg1 == -1) {
                    return;
                } else {
                    this.method240((byte) 40);
                    return;
                }
            }
            this.method234(var3, arg1 ^ 0xFFFFFFFD, arg0);
        }
    }
}
