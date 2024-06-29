import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class73 extends class396 {

    @OriginalMember(owner = "client!kl", name = "j", descriptor = "F")
    public float field944;

    @OriginalMember(owner = "client!kl", name = "t", descriptor = "F")
    public float field954;

    @OriginalMember(owner = "client!kl", name = "u", descriptor = "F")
    public float field955;

    @OriginalMember(owner = "client!kl", name = "w", descriptor = "F")
    public float field957;

    @OriginalMember(owner = "client!kl", name = "x", descriptor = "F")
    public float field958;

    @OriginalMember(owner = "client!kl", name = "A", descriptor = "F")
    public float field961;

    @OriginalMember(owner = "client!kl", name = "B", descriptor = "F")
    public float field962;

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "F")
    public float field966;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "F")
    public float field967;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "F")
    public float field968;

    @OriginalMember(owner = "client!kl", name = "L", descriptor = "F")
    public float field972;

    @OriginalMember(owner = "client!kl", name = "M", descriptor = "F")
    public float field973;

    @OriginalMember(owner = "client!kl", name = "h", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!kl", name = "i", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!kl", name = "k", descriptor = "I")
    public static int field945;

    @OriginalMember(owner = "client!kl", name = "l", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!kl", name = "m", descriptor = "I")
    public static int field947;

    @OriginalMember(owner = "client!kl", name = "n", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!kl", name = "o", descriptor = "I")
    public static int field949;

    @OriginalMember(owner = "client!kl", name = "p", descriptor = "I")
    public static int field950;

    @OriginalMember(owner = "client!kl", name = "q", descriptor = "I")
    public static int field951;

    @OriginalMember(owner = "client!kl", name = "r", descriptor = "I")
    public static int field952;

    @OriginalMember(owner = "client!kl", name = "s", descriptor = "I")
    public static int field953;

    @OriginalMember(owner = "client!kl", name = "v", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!kl", name = "y", descriptor = "I")
    public static int field959;

    @OriginalMember(owner = "client!kl", name = "z", descriptor = "I")
    public static int field960;

    @OriginalMember(owner = "client!kl", name = "C", descriptor = "I")
    public static int field963;

    @OriginalMember(owner = "client!kl", name = "D", descriptor = "I")
    public static int field964;

    @OriginalMember(owner = "client!kl", name = "E", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!kl", name = "K", descriptor = "I")
    public static int field971;

    @OriginalMember(owner = "client!kl", name = "XA", descriptor = "(I)V", line = 3)
    public final void method573(int arg0) {
        field963++;
        this.field967 = 1.0F;
        this.field973 = this.field968 = class280.field3550[arg0 & 0x3FFF];
        this.field958 = class280.field3548[arg0 & 0x3FFF];
        this.field955 = this.field954 = this.field972 = this.field966 = this.field944 = this.field961 = this.field957 = 0.0F;
        this.field962 = -this.field958;
    }

    @OriginalMember(owner = "client!kl", name = "R", descriptor = "(III[I)V", line = 20)
    public final void method574(int arg0, int arg1, int arg2, int[] arg3) {
        field951++;
        arg3[2] = (int) ((float) arg2 * this.field968 + (float) arg0 * this.field961 + (float) arg1 * this.field958);
        arg3[0] = (int) ((float) arg2 * this.field954 + (float) arg0 * this.field967 + (float) arg1 * this.field955);
        arg3[1] = (int) ((float) arg2 * this.field962 + (float) arg0 * this.field966 + (float) arg1 * this.field973);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(II[BI)I", line = 32)
    public static final int method575(int arg0, int arg1, byte[] arg2, int arg3) {
        field943++;
        int var4 = -1;
        for (int var5 = arg3; var5 < arg1; var5++) {
            var4 = class436.field5488[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        if (arg0 != -32424) {
            method587(35, -74, (byte) 18);
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "()Lq;", line = 57)
    public final class396 method576() {
        field945++;
        class73 var1 = new class73();
        var1.field962 = this.field962;
        var1.field966 = this.field966;
        var1.field967 = this.field967;
        var1.field972 = this.field972;
        var1.field958 = this.field958;
        var1.field973 = this.field973;
        var1.field944 = this.field944;
        var1.field955 = this.field955;
        var1.field968 = this.field968;
        var1.field961 = this.field961;
        var1.field957 = this.field957;
        var1.field954 = this.field954;
        return var1;
    }

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "(I)[F", line = 84)
    public final float[] method577(int arg0) {
        class669.field9068[14] = this.field957;
        class669.field9068[2] = this.field961;
        class669.field9068[1] = this.field966;
        field942++;
        class669.field9068[4] = this.field955;
        class669.field9068[6] = this.field958;
        class669.field9068[0] = this.field967;
        class669.field9068[13] = this.field944;
        class669.field9068[8] = this.field954;
        class669.field9068[10] = this.field968;
        class669.field9068[12] = this.field972;
        class669.field9068[arg0] = this.field962;
        class669.field9068[5] = this.field973;
        return class669.field9068;
    }

    @OriginalMember(owner = "client!kl", name = "O", descriptor = "([I)V", line = 108)
    public final void method578(int[] arg0) {
        field948++;
        float var2 = (float) arg0[0] - this.field972;
        float var3 = (float) arg0[1] - this.field944;
        float var4 = (float) arg0[2] - this.field957;
        arg0[2] = (int) (this.field968 * var4 + this.field962 * var3 + this.field954 * var2);
        arg0[0] = (int) (this.field961 * var4 + this.field967 * var2 + this.field966 * var3);
        arg0[1] = (int) (this.field958 * var4 + this.field973 * var3 + this.field955 * var2);
    }

    @OriginalMember(owner = "client!kl", name = "S", descriptor = "(I)V", line = 131)
    public final void method579(int arg0) {
        field969++;
        float var2 = class280.field3550[arg0 & 0x3FFF];
        float var3 = class280.field3548[arg0 & 0x3FFF];
        float var4 = this.field966;
        float var5 = this.field973;
        float var6 = this.field962;
        float var7 = this.field944;
        this.field966 = var2 * var4 - (this.field961 * var3);
        this.field973 = var2 * var5 - (this.field958 * var3);
        this.field961 = this.field961 * var2 + var3 * var4;
        this.field962 = var2 * var6 - (this.field968 * var3);
        this.field958 = this.field958 * var2 + var3 * var5;
        this.field968 = this.field968 * var2 + var3 * var6;
        this.field944 = var2 * var7 - this.field957 * var3;
        this.field957 = this.field957 * var2 + var3 * var7;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(I)V", line = 160)
    public final void method580(int arg0) {
        field959++;
        this.field973 = 1.0F;
        this.field967 = this.field968 = class280.field3550[arg0 & 0x3FFF];
        this.field954 = class280.field3548[arg0 & 0x3FFF];
        this.field955 = this.field972 = this.field966 = this.field962 = this.field944 = this.field958 = this.field957 = 0.0F;
        this.field961 = -this.field954;
    }

    @OriginalMember(owner = "client!kl", name = "pa", descriptor = "(IIIIII)V", line = 172)
    public final void method581(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field950++;
        float var7 = class280.field3550[arg3 & 0x3FFF];
        float var8 = class280.field3548[arg3 & 0x3FFF];
        float var9 = class280.field3550[arg4 & 0x3FFF];
        float var10 = class280.field3548[arg4 & 0x3FFF];
        float var11 = class280.field3550[arg5 & 0x3FFF];
        float var12 = class280.field3548[arg5 & 0x3FFF];
        float var13 = var8 * var11;
        float var14 = var8 * var12;
        this.field954 = -var10 * var11 + var9 * var14;
        this.field961 = var7 * var10;
        this.field962 = var9 * var13 + var10 * var12;
        this.field967 = var9 * var11 + var10 * var14;
        this.field968 = var7 * var9;
        this.field966 = -var9 * var12 + var10 * var13;
        this.field955 = var7 * var12;
        this.field973 = var7 * var11;
        this.field958 = -var8;
        this.field957 = (float) (-arg0) * this.field961 - (float) arg1 * this.field958 - ((float) arg2 * this.field968);
        this.field944 = (float) (-arg0) * this.field966 - ((float) arg1 * this.field973) - (float) arg2 * this.field962;
        this.field972 = (float) (-arg0) * this.field967 - ((float) arg1 * this.field955) - (float) arg2 * this.field954;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(III[I)V", line = 207)
    public final void method582(int arg0, int arg1, int arg2, int[] arg3) {
        arg3[0] = (int) ((float) arg2 * this.field954 + (float) arg0 * this.field967 + (float) arg1 * this.field955 + this.field972);
        arg3[2] = (int) ((float) arg2 * this.field968 + (float) arg0 * this.field961 + (float) arg1 * this.field958 + this.field957);
        arg3[1] = (int) ((float) arg2 * this.field962 + (float) arg0 * this.field966 + (float) arg1 * this.field973 + this.field944);
        field964++;
    }

    @OriginalMember(owner = "client!kl", name = "la", descriptor = "(Lq;)V", line = 217)
    public final void method583(class396 arg0) {
        field949++;
        class73 var2 = (class73) arg0;
        this.field962 = var2.field962;
        this.field973 = var2.field973;
        this.field944 = var2.field944;
        this.field968 = var2.field968;
        this.field954 = var2.field954;
        this.field958 = var2.field958;
        this.field967 = var2.field967;
        this.field966 = var2.field966;
        this.field957 = var2.field957;
        this.field972 = var2.field972;
        this.field955 = var2.field955;
        this.field961 = var2.field961;
    }

    @OriginalMember(owner = "client!kl", name = "Y", descriptor = "()V", line = 239)
    public final void method584() {
        this.field967 = this.field973 = this.field968 = 1.0F;
        field946++;
        this.field966 = this.field961 = this.field955 = this.field958 = this.field954 = this.field962 = this.field972 = this.field944 = this.field957 = 0.0F;
    }

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "(I)[F", line = 250)
    public final float[] method585(int arg0) {
        class669.field9068[13] = 0.0F;
        class669.field9068[8] = this.field954;
        class669.field9068[14] = 0.0F;
        class669.field9068[9] = this.field962;
        class669.field9068[2] = this.field961;
        class669.field9068[4] = this.field955;
        class669.field9068[12] = 0.0F;
        field956++;
        class669.field9068[arg0] = this.field966;
        class669.field9068[6] = this.field958;
        class669.field9068[10] = this.field968;
        class669.field9068[5] = this.field973;
        class669.field9068[0] = this.field967;
        return class669.field9068;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lpv;Lqs;)V", line = 271)
    public static final void method586(class66 arg0, class565 arg1) {
        if (!arg1.field7092) {
            return;
        }
        short var2 = arg1.field7091;
        short var3 = arg1.field7090;
        byte var4 = arg1.field7094;
        byte var5 = arg1.field7083;
        int var6 = (var2 << class480.field5972) + class660.field8949;
        int var7 = (var3 << class480.field5972) + class660.field8949;
        class565[][] var8 = class407.field5237[var4];
        if (class299.field3801 == class286.field3633) {
            class687.field9409.method456(class252.field3250[0].method194(var6, var7), class106.method746(var2, var3), class439.method2411(var2, var3), class682.method3770(var2, var3));
        }
        if (arg1.field7088) {
            if (class618.field8386) {
                if (var4 > 0) {
                    class565 var9 = class407.field5237[var4 - 1][var2][var3];
                    if (var9 != null && var9.field7092) {
                        return;
                    }
                }
                if (var2 <= class662.field8971 && var2 > class254.field3275) {
                    class565 var10 = var8[var2 - 1][var3];
                    if (var10 != null && var10.field7092 && (var10.field7088 || (arg1.field7086 & 0x1) == 0)) {
                        return;
                    }
                }
                if (var2 >= class662.field8971 && var2 < class683.field9311 - 1) {
                    class565 var11 = var8[var2 + 1][var3];
                    if (var11 != null && var11.field7092 && (var11.field7088 || (arg1.field7086 & 0x4) == 0)) {
                        return;
                    }
                }
                if (var3 <= class513.field6440 && var3 > class430.field5431) {
                    class565 var12 = var8[var2][var3 - 1];
                    if (var12 != null && var12.field7092 && (var12.field7088 || (arg1.field7086 & 0x8) == 0)) {
                        return;
                    }
                }
                if (var3 >= class513.field6440 && var3 < class711.field9935 - 1) {
                    class565 var13 = var8[var2][var3 + 1];
                    if (var13 != null && var13.field7092 && (var13.field7088 || (arg1.field7086 & 0x2) == 0)) {
                        return;
                    }
                }
            } else {
                class618.field8386 = true;
            }
            arg1.field7088 = false;
            if (arg1.field7075 != null) {
                class565 var14 = arg1.field7075;
                if (!class294.method1773(var14.field7083, var2, var3)) {
                    class299.field3801[var14.field7083].method186(var2, var3);
                }
                class567 var15 = var14.field7079;
                if (var15 != null) {
                    if (class24.field281) {
                        if ((var15.field7103 & arg1.field7081) == 0) {
                            class500.method2725(arg0, var4, var2, var3);
                        } else {
                            class587.method3264(arg0, var15.field7103, var5, var2, var3);
                        }
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    var15.method11(-127, class687.field9409);
                }
                for (class436 var16 = var14.field7074; var16 != null; var16 = var16.field5485) {
                    class597 var17 = var16.field5486;
                    if (var17 != null) {
                        if (class24.field281) {
                            class500.method2725(arg0, var4, var2, var3);
                            class687.field9409.method473(arg0.field794, arg0.field797);
                        }
                        var17.method11(-114, class687.field9409);
                    }
                }
            }
            boolean var18 = !class294.method1773(var5, var2, var3);
            if (var18) {
                class299.field3801[var5].method186(var2, var3);
                class445 var19 = arg1.field7085;
                if (var19 != null && var19.field5598) {
                    if (class24.field281) {
                        class500.method2725(arg0, var4, var2, var3);
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    class686 var20 = var19.method11(-122, class687.field9409);
                    if (var20 != null) {
                        var20.field9364 = var19;
                        var20.field9367 = var4;
                        var20.field9366 = var2;
                        var20.field9362 = var3;
                        class14.field136.method1714(var20, (byte) 11);
                    }
                }
            }
            int var21 = 0;
            int var22 = 0;
            class567 var23 = arg1.field7079;
            class539 var24 = arg1.field7082;
            if (var23 != null || var24 != null) {
                if (class662.field8971 == var2) {
                    var21++;
                } else if (class662.field8971 < var2) {
                    var21 += 2;
                }
                if (class513.field6440 == var3) {
                    var21 += 3;
                } else if (class513.field6440 > var3) {
                    var21 += 6;
                }
                var22 = class654.field8908[var21];
                arg1.field7081 = class364.field4666[var21];
            }
            if (var23 != null) {
                if ((var23.field7103 & class694.field9612[var21]) == 0) {
                    arg1.field7080 = 0;
                } else if (var23.field7103 == 16) {
                    arg1.field7080 = 3;
                    arg1.field7077 = class94.field1206[var21];
                    arg1.field7089 = (byte) (3 - arg1.field7077);
                } else if (var23.field7103 == 32) {
                    arg1.field7080 = 6;
                    arg1.field7077 = class526.field6651[var21];
                    arg1.field7089 = (byte) (6 - arg1.field7077);
                } else if (var23.field7103 == 64) {
                    arg1.field7080 = 12;
                    arg1.field7077 = class90.field1169[var21];
                    arg1.field7089 = (byte) (12 - arg1.field7077);
                } else {
                    arg1.field7080 = 9;
                    arg1.field7077 = class517.field6545[var21];
                    arg1.field7089 = (byte) (9 - arg1.field7077);
                }
                if ((var23.field7103 & var22) != 0 && !class221.method1263(var5, var2, var3, var23.field7103)) {
                    if (class24.field281) {
                        class500.method2725(arg0, var4, var2, var3);
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    class686 var25 = var23.method11(-109, class687.field9409);
                    if (var25 != null) {
                        var25.field9364 = var23;
                        var25.field9367 = var4;
                        var25.field9366 = var2;
                        var25.field9362 = var3;
                        class14.field136.method1714(var25, (byte) 11);
                    }
                }
                class567 var26 = arg1.field7087;
                if (var26 != null && (var26.field7103 & var22) != 0 && !class221.method1263(var5, var2, var3, var26.field7103)) {
                    if (class24.field281) {
                        class500.method2725(arg0, var4, var2, var3);
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    class686 var27 = var26.method11(-115, class687.field9409);
                    if (var27 != null) {
                        var27.field9364 = var26;
                        var27.field9367 = var4;
                        var27.field9366 = var2;
                        var27.field9362 = var3;
                        class14.field136.method1714(var27, (byte) 11);
                    }
                }
            }
            if (var24 != null && !class404.method2275(var5, var2, var3, var24.method1858((byte) 108))) {
                class539 var28 = arg1.field7073;
                if ((var24.field6809 & var22) != 0) {
                    if (class24.field281) {
                        class500.method2725(arg0, var4, var2, var3);
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    class686 var29 = var24.method11(-125, class687.field9409);
                    if (var29 != null) {
                        var29.field9364 = var24;
                        var29.field9367 = var4;
                        var29.field9366 = var2;
                        var29.field9362 = var3;
                        class14.field136.method1714(var29, (byte) 11);
                    }
                } else if (var24.field6809 == 256) {
                    int var30 = var24.field6793 - class424.field5373;
                    int var31 = var24.field6808 - class370.field4786;
                    int var32 = var24.field6798;
                    int var33;
                    if (var32 == 1 || var32 == 2) {
                        var33 = -var30;
                    } else {
                        var33 = var30;
                    }
                    int var34;
                    if (var32 == 2 || var32 == 3) {
                        var34 = -var31;
                    } else {
                        var34 = var31;
                    }
                    if (class24.field281) {
                        class500.method2725(arg0, var4, var2, var3);
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    if (var34 < var33) {
                        class686 var35 = var24.method11(-110, class687.field9409);
                        if (var35 != null) {
                            var35.field9364 = var24;
                            var35.field9367 = var4;
                            var35.field9366 = var2;
                            var35.field9362 = var3;
                            class14.field136.method1714(var35, (byte) 11);
                        }
                    } else if (var28 != null) {
                        class686 var36 = var28.method11(-99, class687.field9409);
                        if (var36 != null) {
                            var36.field9364 = var28;
                            var36.field9367 = var4;
                            var36.field9366 = var2;
                            var36.field9362 = var3;
                            class14.field136.method1714(var36, (byte) 11);
                        }
                    }
                }
            }
            if (var18) {
                class445 var37 = arg1.field7085;
                if (var37 != null && !var37.field5598) {
                    if (class24.field281) {
                        class500.method2725(arg0, var4, var2, var3);
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    class686 var38 = var37.method11(-100, class687.field9409);
                    if (var38 != null) {
                        var38.field9364 = var37;
                        var38.field9367 = var4;
                        var38.field9366 = var2;
                        var38.field9362 = var3;
                        class14.field136.method1714(var38, (byte) 11);
                    }
                }
                class387 var39 = arg1.field7078;
                if (var39 != null && !var39.field4962) {
                    if (class24.field281) {
                        class500.method2725(arg0, var4, var2, var3);
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    class686 var40 = var39.method11(-97, class687.field9409);
                    if (var40 != null) {
                        var40.field9364 = var39;
                        var40.field9367 = var4;
                        var40.field9366 = var2;
                        var40.field9362 = var3;
                        class14.field136.method1714(var40, (byte) 11);
                    }
                }
            }
            byte var41 = arg1.field7086;
            if (var41 != 0) {
                if (var2 < class662.field8971 && (var41 & 0x4) != 0) {
                    class565 var42 = var8[var2 + 1][var3];
                    if (var42 != null && var42.field7092) {
                        class489.field6114.method1807(-18542, var42);
                    }
                }
                if (var3 < class513.field6440 && (var41 & 0x2) != 0) {
                    class565 var43 = var8[var2][var3 + 1];
                    if (var43 != null && var43.field7092) {
                        class489.field6114.method1807(-18542, var43);
                    }
                }
                if (var2 > class662.field8971 && (var41 & 0x1) != 0) {
                    class565 var44 = var8[var2 - 1][var3];
                    if (var44 != null && var44.field7092) {
                        class489.field6114.method1807(-18542, var44);
                    }
                }
                if (var3 > class513.field6440 && (var41 & 0x8) != 0) {
                    class565 var45 = var8[var2][var3 - 1];
                    if (var45 != null && var45.field7092) {
                        class489.field6114.method1807(-18542, var45);
                    }
                }
            }
        }
        if (arg1.field7080 != 0) {
            boolean var46 = true;
            for (class436 var47 = arg1.field7074; var47 != null; var47 = var47.field5485) {
                if (class58.field745 != var47.field5486.field8009 && (var47.field5491 & arg1.field7080) == arg1.field7077) {
                    var46 = false;
                    break;
                }
            }
            if (var46) {
                class567 var48 = arg1.field7079;
                if (!class221.method1263(var5, var2, var3, var48.field7103)) {
                    if (class24.field281) {
                        label663: {
                            if (var48.field7103 >= 16) {
                                int var49 = var2 - class662.field8971;
                                int var50 = var3 - class513.field6440;
                                if (var48.field7103 == 16) {
                                    int var51 = var49 - class660.field8949;
                                    int var52 = class660.field8949 + var50;
                                    if (var52 < var51 && var2 > 0 && var3 <= class36.field538) {
                                        class500.method2725(arg0, var4, var2 - 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field7103 == 32) {
                                    int var53 = class660.field8949 + var49;
                                    int var54 = class660.field8949 + var50;
                                    if (var54 < -var53 && var2 < class546.field6871 && var3 < class36.field538) {
                                        class500.method2725(arg0, var4, var2 + 1, var3 + 1);
                                        break label663;
                                    }
                                } else if (var48.field7103 == 64) {
                                    int var55 = class660.field8949 + var49;
                                    int var56 = var50 - class660.field8949;
                                    if (var56 > var55 && var2 < class546.field6871 && var3 > 0) {
                                        class500.method2725(arg0, var4, var2 + 1, var3 - 1);
                                        break label663;
                                    }
                                } else if (var48.field7103 == 128) {
                                    int var57 = var49 - class660.field8949;
                                    int var58 = var50 - class660.field8949;
                                    if (var58 > -var57 && var2 > 0 && var3 > 0) {
                                        class500.method2725(arg0, var4, var2 - 1, var3 - 1);
                                        break label663;
                                    }
                                }
                            }
                            class500.method2725(arg0, var4, var2, var3);
                        }
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    class686 var59 = var48.method11(-108, class687.field9409);
                    if (var59 != null) {
                        var59.field9364 = var48;
                        var59.field9367 = var4;
                        var59.field9366 = var2;
                        var59.field9362 = var3;
                        class14.field136.method1714(var59, (byte) 11);
                    }
                }
                arg1.field7080 = 0;
            }
        }
        if (arg1.field7076) {
            try {
                arg1.field7076 = false;
                int var60 = 0;
                label606: for (class436 var61 = arg1.field7074; var61 != null; var61 = var61.field5485) {
                    class597 var62 = var61.field5486;
                    if (class58.field745 != var62.field8009) {
                        for (int var63 = var62.field8017; var63 <= var62.field8005; var63++) {
                            for (int var64 = var62.field8014; var64 <= var62.field8008; var64++) {
                                class565 var65 = var8[var63][var64];
                                if (var65.field7088) {
                                    arg1.field7076 = true;
                                    continue label606;
                                }
                                if (var65.field7080 != 0) {
                                    int var66 = 0;
                                    if (var63 > var62.field8017) {
                                        var66++;
                                    }
                                    if (var63 < var62.field8005) {
                                        var66 += 4;
                                    }
                                    if (var64 > var62.field8014) {
                                        var66 += 8;
                                    }
                                    if (var64 < var62.field8008) {
                                        var66 += 2;
                                    }
                                    if ((var66 & var65.field7080) == arg1.field7089) {
                                        arg1.field7076 = true;
                                        continue label606;
                                    }
                                }
                            }
                        }
                        int var67 = class662.field8971 - var62.field8017;
                        int var68 = var62.field8005 - class662.field8971;
                        if (var68 > var67) {
                            var67 = var68;
                        }
                        int var69 = class513.field6440 - var62.field8014;
                        int var70 = var62.field8008 - class513.field6440;
                        if (var70 > var69) {
                            var69 = var70;
                        }
                        arg0.field799[var60] = var62;
                        arg0.field792[var60++] = var67 + var69;
                    }
                }
                while (var60 > 0) {
                    int var71 = -50;
                    int var72 = -1;
                    for (int var73 = 0; var73 < var60; var73++) {
                        class597 var74 = arg0.field799[var73];
                        if (class58.field745 != var74.field8009) {
                            int var75 = arg0.field792[var73];
                            if (var75 > var71) {
                                var71 = var75;
                                var72 = var73;
                            } else if (var71 == var75) {
                                int var76 = var74.field8018 - class424.field5373;
                                int var77 = var74.field8011 - class370.field4786;
                                int var78 = arg0.field799[var72].field8018 - class424.field5373;
                                int var79 = arg0.field799[var72].field8011 - class370.field4786;
                                if (var76 * var76 + var77 * var77 > var78 * var78 + var79 * var79) {
                                    var72 = var73;
                                }
                            }
                        }
                    }
                    if (var72 == -1) {
                        break;
                    }
                    class597 var80 = arg0.field799[var72];
                    var80.field8009 = class58.field745;
                    if (!class396.method2243(var5, var80.field8017, var80.field8005, var80.field8014, var80.field8008, var80.method2117(9295))) {
                        if (class24.field281) {
                            if (var80.field8004 == 0) {
                                class674.method3740(arg0, var4, var80.field8017, var80.field8014, var80.field8005, var80.field8008);
                            } else {
                                class500.method2725(arg0, var4, var2, var3);
                                int var81 = var2 - class662.field8971;
                                int var82 = var3 - class513.field6440;
                                if (var80.field8004 == 2) {
                                    if (var82 > -var81) {
                                        class81.method625(arg0, var4, var2, var3 - 1, var2 - 1, var3);
                                    } else {
                                        class81.method625(arg0, var4, var2, var3 + 1, var2 + 1, var3);
                                    }
                                } else if (var82 > var81) {
                                    class81.method625(arg0, var4, var2, var3 - 1, var2 + 1, var3);
                                } else {
                                    class81.method625(arg0, var4, var2, var3 + 1, var2 - 1, var3);
                                }
                            }
                            class687.field9409.method473(arg0.field794, arg0.field797);
                        }
                        class686 var83 = var80.method11(-107, class687.field9409);
                        if (var83 != null) {
                            var83.field9364 = var80;
                            var83.field9367 = var4;
                            var83.field9366 = var80.field8017;
                            var83.field9362 = var80.field8014;
                            class14.field136.method1714(var83, (byte) 11);
                        }
                    }
                    for (int var84 = var80.field8017; var84 <= var80.field8005; var84++) {
                        for (int var85 = var80.field8014; var85 <= var80.field8008; var85++) {
                            class565 var86 = var8[var84][var85];
                            if (var86.field7080 != 0) {
                                class489.field6114.method1807(-18542, var86);
                            } else if ((var2 != var84 || var3 != var85) && var86.field7092) {
                                class489.field6114.method1807(-18542, var86);
                            }
                        }
                    }
                }
                if (arg1.field7076) {
                    return;
                }
            } catch (Exception var121) {
                arg1.field7076 = false;
            }
        }
        if (arg1.field7084 != null && (byte) (class592.field7956 & 0xFF) == arg1.field7093) {
            class228 var87 = arg1.field7084;
            int var88 = class299.field3801[var4].method201(var2, var3);
            int var89;
            if (var4 < class709.field9904 - 1) {
                var89 = class299.field3801[var4].method201(var2, var3) - class299.field3801[var4 + 1].method201(var2, var3);
            } else {
                var89 = 0x8 << class480.field5972;
            }
            class5.field39.method582(var6, var88, var7, arg0.field795);
            int var90 = arg0.field795[2];
            class5.field39.method582(var6, var88 - var89, var7, arg0.field795);
            int var91 = arg0.field795[2];
            int var92 = var90;
            int var93 = var91;
            if (var90 > var91) {
                var92 = var91;
                var93 = var90;
            }
            int var94 = var92 - class522.field6613;
            int var95 = class522.field6613 + var93;
            var87.field2947 = var94;
            var87.field2946 = var95;
            var87.field2945 = true;
            class687.field9409.method485(var87);
        }
        if (!arg1.field7092) {
            return;
        }
        if (arg1.field7080 != 0) {
            return;
        }
        if (var2 <= class662.field8971 && var2 > class254.field3275) {
            class565 var96 = var8[var2 - 1][var3];
            if (var96 != null && var96.field7092) {
                return;
            }
        }
        if (var2 >= class662.field8971 && var2 < class683.field9311 - 1) {
            class565 var97 = var8[var2 + 1][var3];
            if (var97 != null && var97.field7092) {
                return;
            }
        }
        if (var3 <= class513.field6440 && var3 > class430.field5431) {
            class565 var98 = var8[var2][var3 - 1];
            if (var98 != null && var98.field7092) {
                return;
            }
        }
        if (var3 >= class513.field6440 && var3 < class711.field9935 - 1) {
            class565 var99 = var8[var2][var3 + 1];
            if (var99 != null && var99.field7092) {
                return;
            }
        }
        arg1.field7092 = false;
        class238.field3091--;
        class387 var100 = arg1.field7078;
        if (var100 != null && var100.field4962) {
            if (class24.field281) {
                class500.method2725(arg0, var4, var2, var3);
                class687.field9409.method473(arg0.field794, arg0.field797);
            }
            class686 var101 = var100.method11(-110, class687.field9409);
            if (var101 != null) {
                var101.field9364 = var100;
                var101.field9367 = var4;
                var101.field9366 = var2;
                var101.field9362 = var3;
                class14.field136.method1714(var101, (byte) 11);
            }
        }
        if (arg1.field7081 != 0) {
            class539 var102 = arg1.field7082;
            if (var102 != null && !class404.method2275(var5, var2, var3, var102.method1858((byte) 47))) {
                if ((var102.field6809 & arg1.field7081) != 0) {
                    if (class24.field281) {
                        class500.method2725(arg0, var4, var2, var3);
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    class686 var103 = var102.method11(-122, class687.field9409);
                    if (var103 != null) {
                        var103.field9364 = var102;
                        var103.field9367 = var4;
                        var103.field9366 = var2;
                        var103.field9362 = var3;
                        class14.field136.method1714(var103, (byte) 11);
                    }
                } else if (var102.field6809 == 256) {
                    int var104 = var102.field6793 - class424.field5373;
                    int var105 = var102.field6808 - class370.field4786;
                    int var106 = var102.field6798;
                    int var107;
                    if (var106 == 1 || var106 == 2) {
                        var107 = -var104;
                    } else {
                        var107 = var104;
                    }
                    int var108;
                    if (var106 == 2 || var106 == 3) {
                        var108 = -var105;
                    } else {
                        var108 = var105;
                    }
                    if (class24.field281) {
                        class500.method2725(arg0, var4, var2, var3);
                        class687.field9409.method473(arg0.field794, arg0.field797);
                    }
                    class539 var109 = arg1.field7073;
                    if (var108 > var107) {
                        class686 var110 = var102.method11(-92, class687.field9409);
                        if (var110 != null) {
                            var110.field9364 = var102;
                            var110.field9367 = var4;
                            var110.field9366 = var2;
                            var110.field9362 = var3;
                            class14.field136.method1714(var110, (byte) 11);
                        }
                    } else if (var109 != null) {
                        class686 var111 = var109.method11(-91, class687.field9409);
                        if (var111 != null) {
                            var111.field9364 = var109;
                            var111.field9367 = var4;
                            var111.field9366 = var2;
                            var111.field9362 = var3;
                            class14.field136.method1714(var111, (byte) 11);
                        }
                    }
                }
            }
            class567 var112 = arg1.field7079;
            class567 var113 = arg1.field7087;
            if (var113 != null && (var113.field7103 & arg1.field7081) != 0 && !class221.method1263(var5, var2, var3, var113.field7103)) {
                if (class24.field281) {
                    class587.method3264(arg0, var113.field7103, var4, var2, var3);
                    class687.field9409.method473(arg0.field794, arg0.field797);
                }
                class686 var114 = var113.method11(-110, class687.field9409);
                if (var114 != null) {
                    var114.field9364 = var113;
                    var114.field9367 = var4;
                    var114.field9366 = var2;
                    var114.field9362 = var3;
                    class14.field136.method1714(var114, (byte) 11);
                }
            }
            if (var112 != null && (var112.field7103 & arg1.field7081) != 0 && !class221.method1263(var5, var2, var3, var112.field7103)) {
                if (class24.field281) {
                    class587.method3264(arg0, var112.field7103, var4, var2, var3);
                    class687.field9409.method473(arg0.field794, arg0.field797);
                }
                class686 var115 = var112.method11(-104, class687.field9409);
                if (var115 != null) {
                    var115.field9364 = var112;
                    var115.field9367 = var4;
                    var115.field9366 = var2;
                    var115.field9362 = var3;
                    class14.field136.method1714(var115, (byte) 11);
                }
            }
        }
        if (var4 < class709.field9904 - 1) {
            class565 var116 = class407.field5237[var4 + 1][var2][var3];
            if (var116 != null && var116.field7092) {
                class489.field6114.method1797(var116, (byte) 97);
            }
        }
        if (var2 < class662.field8971) {
            class565 var117 = var8[var2 + 1][var3];
            if (var117 != null && var117.field7092) {
                class489.field6114.method1807(-18542, var117);
            }
        }
        if (var3 < class513.field6440) {
            class565 var118 = var8[var2][var3 + 1];
            if (var118 != null && var118.field7092) {
                class489.field6114.method1807(-18542, var118);
            }
        }
        if (var2 > class662.field8971) {
            class565 var119 = var8[var2 - 1][var3];
            if (var119 != null && var119.field7092) {
                class489.field6114.method1807(-18542, var119);
            }
        }
        if (var3 > class513.field6440) {
            class565 var120 = var8[var2][var3 - 1];
            if (var120 != null && var120.field7092) {
                class489.field6114.method1807(-18542, var120);
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)Z", line = 1366)
    public static final boolean method587(int arg0, int arg1, byte arg2) {
        field960++;
        return arg2 < 3 ? true : (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "(III)V", line = 1381)
    public final void method588(int arg0, int arg1, int arg2) {
        this.field944 += arg1;
        this.field957 += arg2;
        field971++;
        this.field972 += arg0;
    }

    @OriginalMember(owner = "client!kl", name = "P", descriptor = "(I)V", line = 1391)
    public final void method589(int arg0) {
        field947++;
        float var2 = class280.field3550[arg0 & 0x3FFF];
        float var3 = class280.field3548[arg0 & 0x3FFF];
        float var4 = this.field967;
        float var5 = this.field955;
        float var6 = this.field954;
        this.field967 = this.field961 * var3 + var2 * var4;
        float var7 = this.field972;
        this.field955 = this.field958 * var3 + var2 * var5;
        this.field961 = this.field961 * var2 - var3 * var4;
        this.field958 = this.field958 * var2 - (var3 * var5);
        this.field954 = this.field968 * var3 + var2 * var6;
        this.field968 = this.field968 * var2 - (var3 * var6);
        this.field972 = this.field957 * var3 + var2 * var7;
        this.field957 = this.field957 * var2 - var3 * var7;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(Lq;Z)V", line = 1420)
    public final void method590(class396 arg0, boolean arg1) {
        field952++;
        class73 var3 = (class73) arg0;
        this.field954 = var3.field961;
        if (!arg1) {
            this.method583(null);
        }
        this.field955 = var3.field966;
        this.field967 = var3.field967;
        this.field973 = var3.field973;
        this.field966 = var3.field955;
        this.field962 = var3.field958;
        this.field961 = var3.field954;
        this.field972 = -(this.field954 * var3.field957 + this.field967 * var3.field972 + this.field955 * var3.field944);
        this.field968 = var3.field968;
        this.field958 = var3.field962;
        this.field944 = -(this.field962 * var3.field957 + this.field973 * var3.field944 + this.field966 * var3.field972);
        this.field957 = -(this.field968 * var3.field957 + this.field961 * var3.field972 + this.field958 * var3.field944);
    }

    @OriginalMember(owner = "client!kl", name = "GA", descriptor = "(III)V", line = 1446)
    public final void method591(int arg0, int arg1, int arg2) {
        this.field972 = arg0;
        this.field967 = this.field973 = this.field968 = 1.0F;
        this.field957 = arg2;
        field953++;
        this.field966 = this.field961 = this.field955 = this.field958 = this.field954 = this.field962 = 0.0F;
        this.field944 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(FFIBIIF)V", line = 1458)
    public final void method592(float arg0, float arg1, int arg2, byte arg3, int arg4, int arg5, float arg6) {
        field970++;
        if (arg5 == 0) {
            this.field966 = this.field961 = this.field955 = this.field958 = this.field954 = this.field962 = 0.0F;
            this.field967 = arg4;
            this.field968 = 1.0F;
            this.field973 = arg2;
        } else {
            float var8 = class280.field3550[arg5 & 0x3FFF];
            float var9 = class280.field3548[arg5 & 0x3FFF];
            this.field968 = 1.0F;
            this.field967 = (float) arg4 * var8;
            this.field973 = (float) arg2 * var8;
            this.field966 = (float) arg4 * var9;
            this.field955 = (float) arg2 * -var9;
            this.field961 = this.field958 = this.field954 = this.field962 = 0.0F;
        }
        this.field972 = arg0;
        this.field957 = arg1;
        this.field944 = arg6;
        if (arg3 != 107) {
            this.method593(-64);
        }
    }

    @OriginalMember(owner = "client!kl", name = "ra", descriptor = "(I)V", line = 1493)
    public final void method593(int arg0) {
        this.field968 = 1.0F;
        field965++;
        this.field967 = this.field973 = class280.field3550[arg0 & 0x3FFF];
        this.field966 = class280.field3548[arg0 & 0x3FFF];
        this.field954 = this.field972 = this.field962 = this.field944 = this.field961 = this.field958 = this.field957 = 0.0F;
        this.field955 = -this.field966;
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "()V", line = 1505)
    public class73() {
        this.method584();
    }
}
