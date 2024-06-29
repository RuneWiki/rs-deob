import java.io.File;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class645 extends class642 {

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "[I")
    public static int[] field9287 = new int[8];

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "[Ljava/lang/String;")
    public static String[] field9294 = new String[200];

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field9297 = -1;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field9289;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field9290;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field9295;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "I")
    public static int field9296;

    // $FF: synthetic field
    @OriginalMember(owner = "client!hf", name = "O", descriptor = "Ljava/lang/Class;")
    public static Class field9298;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "[Lnu;")
    private class409[] field9285;

    // $FF: synthetic method
    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method3676(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "([[IZ)V", line = 3)
    private final void method3670(int[][] arg0, boolean arg1) {
        ++field9296;
        if (!arg1) {
            this.method138(120, -39);
        }
        int var3 = class338.field4909;
        int var4 = class106.field1578;
        class57.method359(arg0, -49);
        class566.method3266(class412.field6121, 0, 0, arg1, class553.field8133);
        if (this.field9285 != null) {
            for (int var5 = 0; this.field9285.length > var5; ++var5) {
                class409 var6 = this.field9285[var5];
                int var7 = var6.field6095;
                int var8 = var6.field6091;
                if (~var7 > -1) {
                    if (var8 >= 0) {
                        var6.method205(2048, var4, var3);
                    }
                } else if (~var8 > -1) {
                    var6.method210(var3, 27775, var4);
                } else {
                    var6.method207(-1, var4, var3);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)V", line = 54)
    public static final void method3671(int arg0) {
        class124.field1818 = new class261(8);
        ++field9288;
        class430.field6259 = 0;
        for (class16 var1 = (class16) class165.field2320.method2370(-26173); var1 != null; var1 = (class16) class165.field2320.method2369((byte) 125)) {
            var1.method111();
        }
        if (arg0 != -1) {
            field9297 = -113;
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(II)V", line = 76)
    public static final void method3672(int arg0, int arg1) {
        if (arg1 < -26) {
            class606.field8764 = 3;
            class405.field6057 = 100;
            class164.field2305 = arg0;
            ++field9286;
            class280.field3710 = -1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "()V", line = 90)
    public class645() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/Class;Ljava/lang/String;I)Z", line = 93)
    public static final boolean method3673(Class arg0, String arg1, int arg2) {
        ++field9289;
        Class var3 = (Class) class145.field2084.get(arg1);
        if (var3 != null) {
            return var3.getClassLoader() == arg0.getClassLoader();
        } else {
            File var4 = null;
            if (arg2 <= 26) {
                return true;
            } else {
                if (var4 == null) {
                    var4 = (File) class285.field3798.get(arg1);
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
                        class145.field2084.put(arg1, arg0);
                        return true;
                    } catch (NoSuchMethodException var9) {
                        System.load(var4.getPath());
                        class145.field2084.put(arg1, field9298 != null ? field9298 : (field9298 = method3676("fs")));
                        return true;
                    } catch (Throwable var10) {
                    }
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)[[I", line = 163)
    public final int[][] method138(int arg0, int arg1) {
        ++field9293;
        if (arg0 != 21402) {
            field9297 = 3;
        }
        int[][] var3 = super.field9211.method1068(arg0 + -21402, arg1);
        if (super.field9211.field2131) {
            int var4 = class338.field4909;
            int var5 = class106.field1578;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field9211.method1073((byte) -79);
            this.method3670(var6, true);
            for (int var8 = 0; class106.field1578 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; class338.field4909 > var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class425.method2563(255, var15) << 4;
                    var12[var14] = class425.method2563(var15, 65280) >> 4;
                    var11[var14] = class425.method2563(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V", line = 228)
    public static void method3674(byte arg0) {
        if (arg0 != -26) {
            field9292 = 57;
        }
        field9287 = null;
        field9294 = null;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(II)[I", line = 239)
    public final int[] method3(int arg0, int arg1) {
        ++field9295;
        if (arg1 != -9) {
            field9287 = null;
        }
        int[] var3 = super.field9216.method1185(arg0, -113);
        if (super.field9216.field2418) {
            this.method3670(super.field9216.method1188(0), true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILgk;B)V", line = 262)
    public final void method1(int arg0, class540 arg1, byte arg2) {
        ++field9291;
        if (arg2 < 29) {
            this.method3(-25, 84);
        }
        if (arg0 == 0) {
            this.field9285 = new class409[arg1.method3115(29871)];
            for (int var4 = 0; var4 < this.field9285.length; ++var4) {
                int var5 = arg1.method3115(29871);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field9285[var4] = class510.method2894(arg1, 0);
                            }
                        } else {
                            this.field9285[var4] = class237.method1465(arg1, -39);
                        }
                    } else {
                        this.field9285[var4] = class317.method1965(arg1, (byte) -43);
                    }
                } else {
                    this.field9285[var4] = class197.method1290(arg1, 0);
                }
            }
        } else if (arg0 == 1) {
            super.field9207 = ~arg1.method3115(29871) == -2;
        }
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)V", line = 344)
    public static final void method3675(int arg0) {
        int var1 = 111 % ((55 - arg0) / 47);
        ++field9290;
        if (class589.field8551 == null) {
            class589.field8551 = new int[65536];
            double var2 = 0.03D * Math.random() - 0.015D + 0.7D;
            int var4 = 0;
            for (int var5 = 0; var5 < 512; ++var5) {
                float var6 = ((float) (var5 >> 3) / 64.0F + 0.0078125F) * 360.0F;
                float var7 = (float) (7 & var5) / 8.0F + 0.0625F;
                for (int var8 = 0; ~var8 > -129; ++var8) {
                    float var9 = (float) var8 / 128.0F;
                    float var10 = 0.0F;
                    float var11 = 0.0F;
                    float var12 = 0.0F;
                    float var13 = var6 / 60.0F;
                    int var14 = (int) var13;
                    int var15 = var14 % 6;
                    float var16 = (float) (-var14) + var13;
                    float var17 = (1.0F - var7) * var9;
                    float var18 = (-(var7 * var16) + 1.0F) * var9;
                    float var19 = (1.0F - (-var16 + 1.0F) * var7) * var9;
                    if (var15 == 0) {
                        var11 = var19;
                        var12 = var17;
                        var10 = var9;
                    } else if (var15 != 1) {
                        if (~var15 == -3) {
                            var10 = var17;
                            var11 = var9;
                            var12 = var19;
                        } else if (var15 != 3) {
                            if (~var15 != -5) {
                                if (~var15 == -6) {
                                    var11 = var17;
                                    var10 = var9;
                                    var12 = var18;
                                }
                            } else {
                                var11 = var17;
                                var10 = var19;
                                var12 = var9;
                            }
                        } else {
                            var11 = var18;
                            var12 = var9;
                            var10 = var17;
                        }
                    } else {
                        var11 = var9;
                        var10 = var18;
                        var12 = var17;
                    }
                    float var20 = (float) Math.pow((double) var10, var2);
                    float var21 = (float) Math.pow((double) var11, var2);
                    float var22 = (float) Math.pow((double) var12, var2);
                    int var23 = (int) (var20 * 256.0F);
                    int var24 = (int) (var21 * 256.0F);
                    int var25 = (int) (var22 * 256.0F);
                    int var26 = (var23 << 16) + (var24 << 8) + -16777216 + var25;
                    class589.field8551[var4++] = var26;
                }
            }
        }
    }
}
