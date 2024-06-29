import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class467 extends class164 {

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "[I")
    private int[] field6520;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "[I")
    private int[] field6530;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "Lmba;")
    private class386 field6522;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Lmba;")
    private class386 field6527;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "Lmba;")
    private class386 field6524;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "[Lmba;")
    private class386[] field6518;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "[I")
    public static int[] field6521 = new int[14];

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "[F")
    public static float[] field6528 = new float[16];

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "[Lbca;")
    public static class612[] field6525 = new class612[14];

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    public static int field6523;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    public static int field6534;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ve", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field6535;

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public static final void method2736(int arg0) {
        field6529++;
        int var1 = -31 / ((arg0 - 45) / 55);
        class150.field1859.method1966(12104);
        for (int var2 = 0; var2 < 32; var2++) {
            class314.field4123[var2] = 0L;
        }
        for (int var3 = 0; var3 < 32; var3++) {
            class690.field9836[var3] = 0L;
        }
        class238.field3290 = 0;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/Class;BLjava/lang/String;)Z")
    public static final boolean method2737(Class arg0, byte arg1, String arg2) {
        field6523++;
        Class var3 = (Class) class674.field9678.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        }
        if (arg1 != 124) {
            method2737(null, (byte) -104, null);
        }
        File var4 = null;
        if (var4 == null) {
            var4 = (File) class540.field7845.get(arg2);
        }
        if (var4 != null) {
            try {
                var4 = new File(var4.getCanonicalPath());
                Class var5 = Class.forName("java.lang.Runtime");
                Class var6 = Class.forName("java.lang.reflect.AccessibleObject");
                Method var7 = var6.getDeclaredMethod("setAccessible", Boolean.TYPE);
                Method var8 = var5.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                var7.invoke(var8, Boolean.TRUE);
                var8.invoke(Runtime.getRuntime(), arg0, var4.getPath());
                var7.invoke(var8, Boolean.FALSE);
                class674.field9678.put(arg2, arg0);
                return true;
            } catch (NoSuchMethodException var9) {
                System.load(var4.getPath());
                class674.field9678.put(arg2, field6535 == null ? (field6535 = method2746("gl")) : field6535);
                return true;
            } catch (Throwable var10) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(BLfa;Ljn;)Z")
    public final boolean method2738(byte arg0, class212 arg1, class668 arg2) {
        if (arg0 != -94) {
            this.field6520 = null;
        }
        field6519++;
        if (class106.field1382 >= 0) {
            for (int var4 = 0; var4 < this.field6520.length; var4++) {
                if (!arg2.method3783(class106.field1382, this.field6520[var4], arg0 + 32163)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field6520.length; var5++) {
                if (!arg2.method3802(this.field6520[var5], (byte) 117)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field6530.length; var6++) {
            if (!arg1.method395(this.field6530[var6], 28576)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IB)I")
    public static final int method2739(int arg0, byte arg1) {
        field6516++;
        if (arg0 < 96) {
            return 0;
        } else if (arg0 < 128) {
            return 2;
        } else {
            int var2 = 13 / ((-arg1 - 50) / 36);
            return 3;
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V")
    public static void method2740(byte arg0) {
        if (arg0 != 81) {
            field6528 = null;
        }
        field6521 = null;
        field6525 = null;
        field6528 = null;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lfa;ILjn;IIZ)[F")
    public final float[] method2741(class212 arg0, int arg1, class668 arg2, int arg3, int arg4, boolean arg5) {
        class364.field4905 = arg0;
        field6532++;
        class634.field9108 = arg2;
        for (int var7 = 0; var7 < this.field6518.length; var7++) {
            this.field6518[var7].method1863(arg1, (byte) -75, arg3);
        }
        class415.method2490(arg1, (byte) 33, arg3);
        float[] var8 = new float[arg1 * arg3 * 4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg3; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field6527.field5145) {
                int[] var16 = this.field6527.method359(var10, 72);
                var14 = var16;
                var13 = var16;
                var15 = var16;
            } else {
                int[][] var12 = this.field6527.method645(var10, 3);
                var13 = var12[1];
                var14 = var12[2];
                var15 = var12[0];
            }
            int[] var17;
            if (this.field6524.field5145) {
                var17 = this.field6524.method359(var10, 84);
            } else {
                var17 = this.field6524.method645(var10, 3)[0];
            }
            if (arg5) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field6522.field5145) {
                var18 = this.field6522.method359(var10, 92);
            } else {
                var18 = this.field6522.method645(var10, 3)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg5) {
                    var9 += (arg1 << 2) - 4;
                }
            }
        }
        if (arg4 >= -104) {
            this.field6530 = null;
        }
        for (int var11 = 0; var11 < this.field6518.length; var11++) {
            this.field6518[var11].method926(false);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)[Lpc;")
    public static final class621[] method2742(int arg0) {
        if (arg0 <= 67) {
            field6525 = null;
        }
        field6517++;
        if (class90.field1264 == null) {
            class621[] var1 = class72.method635(class517.field7570, false);
            class621[] var2 = new class621[var1.length];
            int var3 = 0;
            int var4 = class221.field2851.method1759(class375.field5039, -67);
            label72: for (int var5 = 0; var5 < var1.length; var5++) {
                class621 var9 = var1[var5];
                if ((var9.field8896 <= 0 || var9.field8896 >= 24) && var9.field8891 >= 800 && var9.field8894 >= 600 && (var4 != 2 || var9.field8891 <= 800 && var9.field8894 <= 600) && (var4 != 1 || var9.field8891 <= 1024 && var9.field8894 <= 768)) {
                    for (int var10 = 0; var10 < var3; var10++) {
                        class621 var11 = var2[var10];
                        if (var9.field8891 == var11.field8891 && var9.field8894 == var11.field8894) {
                            if (var11.field8896 < var9.field8896) {
                                var2[var10] = var9;
                            }
                            continue label72;
                        }
                    }
                    var2[var3] = var9;
                    var3++;
                }
            }
            class90.field1264 = new class621[var3];
            class252.method1540(var2, 0, class90.field1264, 0, var3);
            int[] var6 = new int[class90.field1264.length];
            for (int var7 = 0; var7 < class90.field1264.length; var7++) {
                class621 var8 = class90.field1264[var7];
                var6[var7] = var8.field8894 * var8.field8891;
            }
            class161.method1020(var6, (byte) 89, class90.field1264);
        }
        return class90.field1264;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(DLfa;ZILjn;ZI)[I")
    public final int[] method2743(double arg0, class212 arg1, boolean arg2, int arg3, class668 arg4, boolean arg5, int arg6) {
        class364.field4905 = arg1;
        class634.field9108 = arg4;
        field6534++;
        for (int var9 = 0; var9 < this.field6518.length; var9++) {
            this.field6518[var9].method1863(arg3, (byte) 122, arg6);
        }
        class207.method1246(arg0, 0);
        class415.method2490(arg3, (byte) 33, arg6);
        int[] var10 = new int[arg3 * arg6 * 4];
        int var11 = 0;
        for (int var12 = 0; var12 < arg6; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field6527.field5145) {
                int[] var18 = this.field6527.method359(var12, 53);
                var15 = var18;
                var16 = var18;
                var17 = var18;
            } else {
                int[][] var14 = this.field6527.method645(var12, 3);
                var15 = var14[0];
                var16 = var14[2];
                var17 = var14[1];
            }
            if (arg5) {
                var11 = var12;
            }
            int[] var19;
            if (this.field6524.field5145) {
                var19 = this.field6524.method359(var12, -61);
            } else {
                var19 = this.field6524.method645(var12, 3)[0];
            }
            for (int var20 = arg3 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
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
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class16.field307[var22];
                int var25 = class16.field307[var21];
                int var26 = class16.field307[var23];
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
                var10[var11++] = (var25 << 16) + (var24 << 8) + (var27 << 24) + var26;
                if (arg5) {
                    var11 += arg3 - 1;
                }
            }
        }
        if (arg2) {
            this.field6524 = null;
        }
        for (int var13 = 0; var13 < this.field6518.length; var13++) {
            this.field6518[var13].method926(false);
        }
        return var10;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class467() {
        this.field6520 = new int[0];
        this.field6530 = new int[0];
        this.field6522 = new class375(0);
        this.field6522.field5132 = 1;
        this.field6527 = new class375();
        this.field6527.field5132 = 1;
        this.field6524 = new class375();
        this.field6524.field5132 = 1;
        this.field6518 = new class386[] { this.field6527, this.field6524, this.field6522 };
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILjn;ZDZLfa;II)[I")
    public final int[] method2744(int arg0, class668 arg1, boolean arg2, double arg3, boolean arg4, class212 arg5, int arg6, int arg7) {
        class634.field9108 = arg1;
        if (arg0 != 20343) {
            field6525 = null;
        }
        class364.field4905 = arg5;
        field6531++;
        for (int var10 = 0; var10 < this.field6518.length; var10++) {
            this.field6518[var10].method1863(arg7, (byte) 104, arg6);
        }
        class207.method1246(arg3, 0);
        class415.method2490(arg7, (byte) 33, arg6);
        int[] var11 = new int[arg6 * arg7];
        int var12;
        int var13;
        byte var14;
        if (arg4) {
            var12 = -1;
            var13 = arg7 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = arg7;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg6; var16++) {
            if (arg2) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field6527.field5145) {
                int[] var22 = this.field6527.method359(var16, -110);
                var20 = var22;
                var19 = var22;
                var21 = var22;
            } else {
                int[][] var18 = this.field6527.method645(var16, arg0 ^ 0x4F74);
                var19 = var18[0];
                var20 = var18[2];
                var21 = var18[1];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
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
                int var27 = class16.field307[var24];
                int var28 = class16.field307[var25];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class16.field307[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg2) {
                    var15 += arg7 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field6518.length; var17++) {
            this.field6518[var17].method926(false);
        }
        return var11;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2745(int arg0, byte arg1, int arg2) {
        if (arg1 == -74) {
            field6526++;
            return (arg2 & 0x84080) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lun;)V")
    public class467(class389 arg0) {
        int var2 = arg0.method2229(255);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field6518 = new class386[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class386 var16 = class614.method3528(-53, arg0);
            if (var16.method930((byte) 114) >= 0) {
                var3++;
            }
            if (var16.method1862((byte) 96) >= 0) {
                var4++;
            }
            int var17 = var16.field5131.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method2229(255);
            }
            this.field6518[var6] = var16;
        }
        this.field6520 = new int[var3];
        this.field6530 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class386 var11 = this.field6518[var9];
            int var12 = var11.field5131.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field5131[var13] = this.field6518[var5[var9][var13]];
            }
            int var14 = var11.method930((byte) 105);
            int var15 = var11.method1862((byte) 101);
            if (var14 > 0) {
                this.field6520[var7++] = var14;
            }
            if (var15 > 0) {
                this.field6530[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field6527 = this.field6518[arg0.method2229(255)];
        this.field6524 = this.field6518[arg0.method2229(255)];
        Object var10 = null;
        this.field6522 = this.field6518[arg0.method2229(255)];
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2746(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
