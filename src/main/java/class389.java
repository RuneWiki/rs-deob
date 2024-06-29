import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class389 extends class508 {

    @OriginalMember(owner = "client!hp", name = "B", descriptor = "[I")
    private int[] field4908;

    @OriginalMember(owner = "client!hp", name = "A", descriptor = "[I")
    private int[] field4907;

    @OriginalMember(owner = "client!hp", name = "y", descriptor = "Lmca;")
    private class5 field4905;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "Lmca;")
    private class5 field4910;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "Lmca;")
    private class5 field4913;

    @OriginalMember(owner = "client!hp", name = "x", descriptor = "[Lmca;")
    private class5[] field4904;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "I")
    public static int field4909 = -60;

    @OriginalMember(owner = "client!hp", name = "v", descriptor = "Lwp;")
    public static class453 field4902 = new class453(23, 0);

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "[I")
    public static int[] field4915 = new int[2];

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "[F")
    public static float[] field4914 = new float[4];

    @OriginalMember(owner = "client!hp", name = "s", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!hp", name = "t", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!hp", name = "u", descriptor = "I")
    public static int field4901;

    @OriginalMember(owner = "client!hp", name = "w", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!hp", name = "z", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "Loj;")
    public static class543 field4912;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILks;)V")
    public static final void method2090(int arg0, class30 arg1) {
        field4911++;
        if (arg0 != 4) {
            field4902 = null;
        }
        class113 var2 = (class113) class115.field1487.method237(arg0 + 97);
        if (var2 == null) {
            return;
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < var2.field1478; var4++) {
            if (var2.field1470[var4] != null) {
                if (var2.field1470[var4].field3358 == 2) {
                    var2.field1471[var4] = -5;
                }
                if (var2.field1470[var4].field3358 == 0) {
                    var3 = true;
                }
            }
            if (var2.field1477[var4] != null) {
                if (var2.field1477[var4].field3358 == 2) {
                    var2.field1471[var4] = -6;
                }
                if (var2.field1477[var4].field3358 == 0) {
                    var3 = true;
                }
            }
        }
        if (var3) {
            return;
        }
        int var5 = arg1.field8812;
        arg1.method3464(var2.field1475, -97);
        for (int var6 = 0; var6 < var2.field1478; var6++) {
            if (var2.field1471[var6] == 0) {
                try {
                    int var7 = var2.field1473[var6];
                    if (var7 == 0) {
                        Field var8 = (Field) var2.field1470[var6].field3356;
                        int var9 = var8.getInt(null);
                        arg1.method3509(0, (byte) -125);
                        arg1.method3464(var9, arg0 - 103);
                    } else if (var7 == 1) {
                        Field var10 = (Field) var2.field1470[var6].field3356;
                        var10.setInt(null, var2.field1476[var6]);
                        arg1.method3509(0, (byte) -128);
                    } else if (var7 == 2) {
                        Field var11 = (Field) var2.field1470[var6].field3356;
                        int var12 = var11.getModifiers();
                        arg1.method3509(0, (byte) -115);
                        arg1.method3464(var12, -98);
                    }
                    if (var7 == 3) {
                        Method var15 = (Method) var2.field1477[var6].field3356;
                        byte[][] var16 = var2.field1472[var6];
                        Object[] var17 = new Object[var16.length];
                        for (int var18 = 0; var18 < var16.length; var18++) {
                            ObjectInputStream var19 = new ObjectInputStream(new ByteArrayInputStream(var16[var18]));
                            var17[var18] = var19.readObject();
                        }
                        Object var20 = var15.invoke(null, var17);
                        if (var20 == null) {
                            arg1.method3509(0, (byte) -124);
                        } else if ((var20 instanceof Number)) {
                            arg1.method3509(1, (byte) -110);
                            arg1.method3494(((Number) var20).longValue(), arg0 ^ 0xFFFFBEB5);
                        } else if (var20 instanceof String) {
                            arg1.method3509(2, (byte) -121);
                            arg1.method3489((String) var20, -126);
                        } else {
                            arg1.method3509(4, (byte) -125);
                        }
                    } else if (var7 == 4) {
                        Method var13 = (Method) var2.field1477[var6].field3356;
                        int var14 = var13.getModifiers();
                        arg1.method3509(0, (byte) -112);
                        arg1.method3464(var14, arg0 ^ 0xFFFFFF93);
                    }
                } catch (ClassNotFoundException var21) {
                    arg1.method3509(-10, (byte) -113);
                } catch (InvalidClassException var22) {
                    arg1.method3509(-11, (byte) -126);
                } catch (StreamCorruptedException var23) {
                    arg1.method3509(-12, (byte) -115);
                } catch (OptionalDataException var24) {
                    arg1.method3509(-13, (byte) -119);
                } catch (IllegalAccessException var25) {
                    arg1.method3509(-14, (byte) -113);
                } catch (IllegalArgumentException var26) {
                    arg1.method3509(-15, (byte) -109);
                } catch (InvocationTargetException var27) {
                    arg1.method3509(-16, (byte) -111);
                } catch (SecurityException var28) {
                    arg1.method3509(-17, (byte) -115);
                } catch (IOException var29) {
                    arg1.method3509(-18, (byte) -117);
                } catch (NullPointerException var30) {
                    arg1.method3509(-19, (byte) -116);
                } catch (Exception var31) {
                    arg1.method3509(-20, (byte) -110);
                } catch (Throwable var32) {
                    arg1.method3509(-21, (byte) -124);
                }
            } else {
                arg1.method3509(var2.field1471[var6], (byte) -116);
            }
        }
        arg1.method3461(arg0 + 119, var5);
        var2.method1871(-72);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lfa;IZLpl;IDI)[I")
    public final int[] method2091(class526 arg0, int arg1, boolean arg2, class612 arg3, int arg4, double arg5, int arg6) {
        field4900++;
        class433.field5432 = arg3;
        class281.field3523 = arg0;
        for (int var9 = 0; var9 < this.field4904.length; var9++) {
            this.field4904[var9].method42(arg4, (byte) -70, arg1);
        }
        class139.method798((byte) 86, arg5);
        if (arg6 >= -123) {
            return null;
        }
        class386.method2076(arg4, (byte) -107, arg1);
        int[] var10 = new int[arg4 * 4 * arg1];
        int var11 = 0;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field4910.field120) {
                int[] var14 = this.field4910.method39(-24, var12);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field4910.method44(var12, true);
                var17 = var18[0];
                var15 = var18[1];
                var16 = var18[2];
            }
            if (arg2) {
                var11 = var12;
            }
            int[] var19;
            if (this.field4913.field120) {
                var19 = this.field4913.method39(-98, var12);
            } else {
                var19 = this.field4913.method44(var12, true)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var17[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class434.field5434[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class434.field5434[var21];
                int var26 = class434.field5434[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var27 << 24) - (-(var25 << 16) - ((var24 << 8) + var26));
                if (arg2) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field4904.length; var13++) {
            this.field4904[var13].method37(45);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILpl;Lfa;)Z")
    public final boolean method2092(int arg0, class612 arg1, class526 arg2) {
        field4901++;
        if (class506.field6697 < arg0) {
            for (int var4 = 0; var4 < this.field4908.length; var4++) {
                if (!arg1.method3368(arg0 + 1912, this.field4908[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4908.length; var5++) {
                if (!arg1.method3370(this.field4908[var5], (byte) 98, class506.field6697)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field4907.length; var6++) {
            if (!arg2.method2480(false, this.field4907[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIILfa;Lpl;I)[F")
    public final float[] method2093(boolean arg0, int arg1, int arg2, class526 arg3, class612 arg4, int arg5) {
        class281.field3523 = arg3;
        field4899++;
        class433.field5432 = arg4;
        for (int var7 = arg2; var7 < this.field4904.length; var7++) {
            this.field4904[var7].method42(arg1, (byte) 59, arg5);
        }
        class386.method2076(arg1, (byte) -77, arg5);
        float[] var8 = new float[arg1 * arg5 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg1; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field4910.field120) {
                int[] var16 = this.field4910.method39(118, var10);
                var14 = var16;
                var15 = var16;
                var13 = var16;
            } else {
                int[][] var12 = this.field4910.method44(var10, true);
                var13 = var12[1];
                var14 = var12[0];
                var15 = var12[2];
            }
            int[] var17;
            if (this.field4913.field120) {
                var17 = this.field4913.method39(arg2 ^ 0xFFFFFFF4, var10);
            } else {
                var17 = this.field4913.method44(var10, true)[0];
            }
            if (arg0) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field4905.field120) {
                var18 = this.field4905.method39(117, var10);
            } else {
                var18 = this.field4905.method44(var10, true)[0];
            }
            for (int var19 = arg5 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg0) {
                    var9 += (arg5 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field4904.length; var11++) {
            this.field4904[var11].method37(46);
        }
        return var8;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLpl;DIZZILfa;)[I")
    public final int[] method2094(byte arg0, class612 arg1, double arg2, int arg3, boolean arg4, boolean arg5, int arg6, class526 arg7) {
        class433.field5432 = arg1;
        field4903++;
        class281.field3523 = arg7;
        for (int var10 = 0; var10 < this.field4904.length; var10++) {
            this.field4904[var10].method42(arg6, (byte) -85, arg3);
        }
        class139.method798((byte) 86, arg2);
        class386.method2076(arg6, (byte) -109, arg3);
        int[] var11 = new int[arg3 * arg6];
        byte var12;
        int var13;
        int var14;
        if (arg4) {
            var12 = -1;
            var13 = arg3 - 1;
            var14 = -1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg3;
        }
        int var15 = 0;
        if (arg0 < 61) {
            this.field4908 = null;
        }
        for (int var16 = 0; var16 < arg6; var16++) {
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field4910.field120) {
                int[] var22 = this.field4910.method39(121, var16);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field4910.method44(var16, true);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            if (arg5) {
                var15 = var16;
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class434.field5434[var24];
                int var28 = class434.field5434[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class434.field5434[var26];
                int var30 = (var28 << 8) + (var27 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg5) {
                    var15 += arg3 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field4904.length; var17++) {
            this.field4904[var17].method37(47);
        }
        return var11;
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)V")
    public static void method2095(byte arg0) {
        field4912 = null;
        field4915 = null;
        field4902 = null;
        if (arg0 < 112) {
            method2090(-127, null);
        }
        field4914 = null;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
    public class389() {
        this.field4908 = new int[0];
        this.field4907 = new int[0];
        this.field4905 = new class366(0);
        this.field4905.field128 = 1;
        this.field4910 = new class366();
        this.field4910.field128 = 1;
        this.field4913 = new class366();
        this.field4904 = new class5[] { this.field4910, this.field4913, this.field4905 };
        this.field4913.field128 = 1;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Les;)V")
    public class389(class630 arg0) {
        int var2 = arg0.method3501(-9268);
        int var3 = 0;
        int var4 = 0;
        this.field4904 = new class5[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class5 var16 = class173.method1096((byte) 62, arg0);
            if (var16.method38((byte) 126) >= 0) {
                var3++;
            }
            if (var16.method43((byte) 104) >= 0) {
                var4++;
            }
            int var17 = var16.field130.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method3501(-9268);
            }
            this.field4904[var6] = var16;
        }
        this.field4908 = new int[var3];
        this.field4907 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class5 var11 = this.field4904[var9];
            int var12 = var11.field130.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field130[var13] = this.field4904[var5[var9][var13]];
            }
            int var14 = var11.method38((byte) 127);
            int var15 = var11.method43((byte) 58);
            if (var14 > 0) {
                this.field4908[var7++] = var14;
            }
            if (var15 > 0) {
                this.field4907[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field4910 = this.field4904[arg0.method3501(-9268)];
        this.field4913 = this.field4904[arg0.method3501(-9268)];
        Object var10 = null;
        this.field4905 = this.field4904[arg0.method3501(-9268)];
    }
}
