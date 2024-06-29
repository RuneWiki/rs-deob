import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class614 implements class162 {

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Lbba;")
    private class125 field8550 = new class125(256);

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "Lgj;")
    private class662 field8555;

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "Lgj;")
    private class662 field8559;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "I")
    private int field8552;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "[Ltr;")
    private class311[] field8562;

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "I")
    public static int field8549 = 0;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "Lqn;")
    public static class71 field8553 = new class71("RC", 1);

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field8561 = -1;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field8544;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "I")
    public static int field8545;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field8546;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field8547;

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "I")
    public static int field8551;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field8554;

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "I")
    public static int field8556;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "I")
    public static int field8557;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "I")
    public static int field8558;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field8560;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "Lpt;")
    public static class558 field8563;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V")
    public static void method3475(int arg0) {
        field8563 = null;
        field8553 = null;
        if (arg0 != 21625) {
            field8553 = null;
        }
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(II)Llm;")
    private final class527 method3476(int arg0, int arg1) {
        field8544++;
        class513 var3 = this.field8550.method1077((long) arg1, (byte) 119);
        if (var3 != null) {
            return (class527) var3;
        }
        byte[] var4 = this.field8555.method3742(arg0 + 5, arg1);
        if (var4 == null) {
            return null;
        }
        class527 var5 = new class527(new class93(var4));
        if (arg0 != 0) {
            field8563 = null;
        }
        this.field8550.method1079(var5, (long) arg1, (byte) 55);
        return var5;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)V")
    public static final void method3477(byte arg0) {
        field8546++;
        if (class753.field10398 == 7) {
            class479.method2746(false, false);
        } else if (arg0 == 19) {
            class373.field5061 = class193.field2948;
            class193.field2948 = null;
            class139.method1142(2, 13);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(FIZIIZ)[I")
    public final int[] method1269(float arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5) {
        if (!arg5) {
            this.method1274(-35, 63);
        }
        field8556++;
        return this.method3476(0, arg3).method2997(69, arg1, this.field8559, (double) arg0, this.field8562[arg3].field4234, arg4, arg2, this);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)Z")
    public final boolean method1274(int arg0, int arg1) {
        field8545++;
        class527 var3 = this.method3476(arg1 ^ arg1, arg0);
        return var3 != null && var3.method3000(this, this.field8559, (byte) -60);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lod;IIIIIIIIILha;I)V")
    public static final void method3478(class534 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class66 arg10, int arg11) {
        if (arg8 > arg6 && arg8 < (arg1 + arg6) && (arg11 - 13) < arg9 && (arg11 + 3) > arg9 && arg0.field7237) {
            arg4 = arg7;
        }
        field8548++;
        int var12 = -84 / ((-arg5 - 42) / 57);
        int[] var13 = null;
        if (class375.method2273((byte) -72, arg0.field7229)) {
            var13 = class143.field2427.method1410((byte) 96, (int) arg0.field7231).field10030;
        } else if (arg0.field7234 != -1) {
            var13 = class143.field2427.method1410((byte) 51, arg0.field7234).field10030;
        } else if (class93.method741(-106, arg0.field7229)) {
            class755 var16 = (class755) class664.field9216.method337((long) ((int) arg0.field7231), 1);
            if (var16 != null) {
                class666 var17 = var16.field10414;
                class568 var18 = var17.field9253;
                if (var18.field8023 != null) {
                    var18 = var18.method3283((byte) -108, class694.field9613);
                }
                if (var18 != null) {
                    var13 = var18.field8054;
                }
            }
        } else if (class453.method2619(125, arg0.field7229)) {
            Object var14 = null;
            class445 var15;
            if (arg0.field7229 == 1007) {
                var15 = class414.field5670.method2319((int) arg0.field7231, false);
            } else {
                var15 = class414.field5670.method2319((int) (arg0.field7231 >>> 32 & 0x7FFFFFFFL), false);
            }
            if (var15.field6028 != null) {
                var15 = var15.method2580(74, class694.field9613);
            }
            if (var15 != null) {
                var13 = var15.field6093;
            }
        }
        String var19 = class356.method2199((byte) 41, arg0);
        if (var13 != null) {
            var19 = var19 + class57.method408((byte) -99, var13);
        }
        class557.field7861.method608(arg6 + 3, arg11, class201.field3054, var19, 0, arg4, 0, class146.field2462);
        if (arg0.field7230) {
            class467.field6329.method3430(class333.field4511.method1172(var19, (byte) 53) + (arg6 + 5), arg11 + -12);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(III)Z")
    public static final boolean method3479(int arg0, int arg1, int arg2) {
        if (arg1 >= -94) {
            field8561 = 59;
        }
        field8558++;
        return (class520.method2959(arg0, 33, arg2) | class610.method3461(21906, arg0, arg2) | class104.method896(12992, arg2, arg0)) & class454.method2622(arg2, arg0, (byte) -18);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIFIBZ)[I")
    public final int[] method1272(int arg0, int arg1, float arg2, int arg3, byte arg4, boolean arg5) {
        field8547++;
        if (arg4 != 81) {
            method3478(null, 45, 25, 61, 105, -16, 70, 1, -47, 95, null, 10);
        }
        return this.method3476(0, arg1).method3001(this.field8559, (double) arg2, arg0, 0, this, arg3, this.field8562[arg1].field4234);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)I")
    public final int method1271(byte arg0) {
        field8557++;
        return arg0 == 63 ? this.field8552 : 64;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IZ)Ltr;")
    public final class311 method1270(int arg0, boolean arg1) {
        field8554++;
        if (!arg1) {
            field8553 = null;
        }
        return this.field8562[arg0];
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IBZIFI)[F")
    public final float[] method1273(int arg0, byte arg1, boolean arg2, int arg3, float arg4, int arg5) {
        field8551++;
        if (arg1 != 80) {
            field8560 = -58;
        }
        return this.method3476(0, arg0).method2995(arg5, arg3, this.field8559, 5533, this, this.field8562[arg0].field4234);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(IIILjava/lang/Class;)Lfe;")
    public static final class597 method3480(int arg0, int arg1, int arg2, Class arg3) {
        class549 var4 = class325.field4448[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class58 var5 = var4.field7466; var5 != null; var5 = var5.field811) {
            class597 var6 = var5.field815;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field8368 == arg1 && var6.field8369 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "(Lgj;Lgj;Lgj;)V")
    public class614(class662 arg0, class662 arg1, class662 arg2) {
        this.field8555 = arg1;
        this.field8559 = arg2;
        class93 var4 = new class93(arg0.method3732(0, 8906, 0));
        this.field8552 = var4.method763(98);
        this.field8562 = new class311[this.field8552];
        for (int var5 = 0; var5 < this.field8552; var5++) {
            if (var4.method793((byte) 118) == 1) {
                this.field8562[var5] = new class311();
            }
        }
        for (int var6 = 0; var6 < this.field8552; var6++) {
            if (this.field8562[var6] != null) {
                this.field8562[var6].field4244 = var4.method793((byte) 39) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field8552; var7++) {
            if (this.field8562[var7] != null) {
                this.field8562[var7].field4248 = var4.method793((byte) 117) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field8552; var8++) {
            if (this.field8562[var8] != null) {
                this.field8562[var8].field4233 = var4.method793((byte) 53) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field8552; var9++) {
            if (this.field8562[var9] != null) {
                this.field8562[var9].field4236 = var4.method766((byte) 122);
            }
        }
        for (int var10 = 0; var10 < this.field8552; var10++) {
            if (this.field8562[var10] != null) {
                this.field8562[var10].field4241 = var4.method766((byte) 122);
            }
        }
        for (int var11 = 0; var11 < this.field8552; var11++) {
            if (this.field8562[var11] != null) {
                this.field8562[var11].field4250 = var4.method766((byte) 122);
            }
        }
        for (int var12 = 0; var12 < this.field8552; var12++) {
            if (this.field8562[var12] != null) {
                this.field8562[var12].field4249 = var4.method766((byte) 122);
            }
        }
        for (int var13 = 0; var13 < this.field8552; var13++) {
            if (this.field8562[var13] != null) {
                this.field8562[var13].field4239 = (short) var4.method763(76);
            }
        }
        for (int var14 = 0; var14 < this.field8552; var14++) {
            if (this.field8562[var14] != null) {
                this.field8562[var14].field4251 = var4.method766((byte) 122);
            }
        }
        for (int var15 = 0; var15 < this.field8552; var15++) {
            if (this.field8562[var15] != null) {
                this.field8562[var15].field4243 = var4.method766((byte) 122);
            }
        }
        for (int var16 = 0; var16 < this.field8552; var16++) {
            if (this.field8562[var16] != null) {
                this.field8562[var16].field4245 = var4.method793((byte) 108) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field8552; var17++) {
            if (this.field8562[var17] != null) {
                this.field8562[var17].field4234 = var4.method793((byte) 100) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field8552; var18++) {
            if (this.field8562[var18] != null) {
                this.field8562[var18].field4238 = var4.method766((byte) 122);
            }
        }
        for (int var19 = 0; var19 < this.field8552; var19++) {
            if (this.field8562[var19] != null) {
                this.field8562[var19].field4235 = var4.method793((byte) 64) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field8552; var20++) {
            if (this.field8562[var20] != null) {
                this.field8562[var20].field4253 = var4.method793((byte) 21) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field8552; var21++) {
            if (this.field8562[var21] != null) {
                this.field8562[var21].field4232 = var4.method793((byte) 60) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field8552; var22++) {
            if (this.field8562[var22] != null) {
                this.field8562[var22].field4240 = var4.method793((byte) 53);
            }
        }
        for (int var23 = 0; var23 < this.field8552; var23++) {
            if (this.field8562[var23] != null) {
                this.field8562[var23].field4246 = var4.method773(3);
            }
        }
        for (int var24 = 0; var24 < this.field8552; var24++) {
            if (this.field8562[var24] != null) {
                this.field8562[var24].field4242 = var4.method793((byte) 103);
            }
        }
    }
}
