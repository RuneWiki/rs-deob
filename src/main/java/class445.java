import java.io.File;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class445 extends class4 {

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    private int field6148 = 1024;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    private int field6150 = 0;

    @OriginalMember(owner = "client!lo", name = "Q", descriptor = "I")
    private int field6157 = 409;

    @OriginalMember(owner = "client!lo", name = "R", descriptor = "I")
    private int field6158 = 1024;

    @OriginalMember(owner = "client!lo", name = "S", descriptor = "I")
    private int field6159 = 1024;

    @OriginalMember(owner = "client!lo", name = "V", descriptor = "I")
    private int field6162 = 819;

    @OriginalMember(owner = "client!lo", name = "U", descriptor = "I")
    private int field6161 = 2048;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    private int field6152 = 0;

    @OriginalMember(owner = "client!lo", name = "Z", descriptor = "I")
    private int field6166 = 1024;

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "Lbv;")
    public static class568 field6147 = new class568();

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
    public static int field6149;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public static int field6151;

    @OriginalMember(owner = "client!lo", name = "M", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!lo", name = "N", descriptor = "I")
    public static int field6154;

    @OriginalMember(owner = "client!lo", name = "O", descriptor = "I")
    public static int field6155;

    @OriginalMember(owner = "client!lo", name = "P", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!lo", name = "T", descriptor = "I")
    public static int field6160;

    @OriginalMember(owner = "client!lo", name = "W", descriptor = "I")
    private int field6163;

    @OriginalMember(owner = "client!lo", name = "X", descriptor = "I")
    public static int field6164;

    // $FF: synthetic field
    @OriginalMember(owner = "client!lo", name = "ab", descriptor = "Ljava/lang/Class;")
    public static Class field6167;

    @OriginalMember(owner = "client!lo", name = "Y", descriptor = "[Lha;")
    public static class116[] field6165;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/util/Random;[[IIIZII)V")
    private final void method2587(Random arg0, int[][] arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field6149;
        int var8 = ~this.field6166 >= -1 ? 4096 : -class585.method3373(arg0, true, this.field6166) + 4096;
        int var9 = this.field6163 * this.field6148 >> 12;
        int var10 = this.field6163 - (~var9 >= -1 ? 0 : class585.method3373(arg0, true, var9));
        if (~class132.field1627 >= ~arg2) {
            arg2 -= class132.field1627;
        }
        if (~var10 >= -1) {
            if (arg2 + arg6 > class132.field1627) {
                int var11 = class132.field1627 - arg2;
                for (int var12 = 0; ~var12 > ~arg3; ++var12) {
                    int[] var13 = arg1[arg5 + var12];
                    class205.method1315(var13, arg2, var11, var8);
                    class205.method1315(var13, 0, -var11 + arg6, var8);
                }
            } else {
                for (int var14 = 0; ~var14 > ~arg3; ++var14) {
                    class205.method1315(arg1[arg5 + var14], arg2, arg6, var8);
                }
            }
        } else {
            if (~arg3 >= -1 || arg6 <= 0) {
                return;
            }
            int var15 = arg6 / 2;
            int var16 = arg3 / 2;
            int var17 = var10 <= var15 ? var10 : var15;
            int var18 = ~var10 >= ~var16 ? var10 : var16;
            int var19 = arg2 - -var17;
            int var20 = arg6 - var17 * 2;
            for (int var21 = 0; ~arg3 < ~var21; ++var21) {
                int[] var22 = arg1[var21 - -arg5];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field6152 != 0) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class143.method783(class150.field1971, arg2 + var24)] = var22[class143.method783(arg2 + arg6 + -var24 - 1, class150.field1971)] = var25 < var23 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; var17 > var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class143.method783(arg2 + var26, class150.field1971)] = var22[class143.method783(class150.field1971, arg2 - var26 + arg6 + -1)] = var23 * var28 >> 12;
                        }
                    }
                    if (~(var19 + var20) < ~class132.field1627) {
                        int var27 = class132.field1627 - var19;
                        class205.method1315(var22, var19, var27, var23);
                        class205.method1315(var22, 0, -var27 + var20, var23);
                    } else {
                        class205.method1315(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg3;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field6152 == -1) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class143.method783(arg2 + var31, class150.field1971)] = var22[class143.method783(-var31 + arg6 + -1 + arg2, class150.field1971)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class143.method783(arg2 + var33, class150.field1971)] = var22[class143.method783(class150.field1971, -var33 + arg6 + -1 + arg2)] = var35 < var30 ? var35 : var30;
                            }
                        }
                        if (~class132.field1627 > ~(var19 + var20)) {
                            int var34 = -var19 + class132.field1627;
                            class205.method1315(var22, var19, var34, var30);
                            class205.method1315(var22, 0, var20 - var34, var30);
                        } else {
                            class205.method1315(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var17 > var36; ++var36) {
                            var22[class143.method783(class150.field1971, arg2 + var36)] = var22[class143.method783(class150.field1971, arg2 + arg6 - var36 + -1)] = var8 * var36 / var17;
                        }
                        if (class132.field1627 < var19 + var20) {
                            int var37 = -var19 + class132.field1627;
                            class205.method1315(var22, var19, var37, var8);
                            class205.method1315(var22, 0, -var37 + var20, var8);
                        } else {
                            class205.method1315(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
        if (arg4) {
            this.field6159 = -116;
        }
    }

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "(I)V")
    public final void method18(int arg0) {
        if (arg0 != -9) {
            this.field6163 = 125;
        }
        ++field6154;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)[I")
    public final int[] method15(byte arg0, int arg1) {
        ++field6160;
        int[] var3 = super.field31.method2252(arg1, arg0 ^ 1);
        if (arg0 != 10) {
            return null;
        } else if (super.field31.field5127) {
            int[][] var4 = super.field31.method2255((byte) -105);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class132.field1627 * this.field6158 >> 12;
            int var15 = class132.field1627 * this.field6161 >> 12;
            int var16 = class620.field8925 * this.field6157 >> 12;
            int var17 = class620.field8925 * this.field6162 >> 12;
            if (var17 <= 1) {
                return var4[arg1];
            } else {
                this.field6163 = class132.field1627 / 8 * this.field6159 >> 12;
                int var18 = class132.field1627 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field6150);
                while (true) {
                    while (true) {
                        int var22 = var14 + class585.method3373(var21, true, var15 - var14);
                        int var23 = class585.method3373(var21, true, -var16 + var17) + var16;
                        int var24 = var8 - -var22;
                        if (class132.field1627 < var24) {
                            var22 = -var8 + class132.field1627;
                            var24 = class132.field1627;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class132.field1627;
                            }
                            if (class132.field1627 < var29) {
                                var29 -= class132.field1627;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var29 <= ~var30[0] && var29 <= var30[1]) {
                                    var25 = var27[2];
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class132.field1627;
                                        }
                                        if (var31 > class132.field1627) {
                                            var31 -= class132.field1627;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var28 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (~var36 == -1) {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class132.field1627;
                                                }
                                                this.method2587(var21, var4, var38 - -var7, -var35 + var25, false, var35, -var38 + var39);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (~var26 <= ~var12) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (class620.field8925 < var25 - -var23) {
                            var23 = -var25 + class620.field8925;
                        } else {
                            var10 = false;
                        }
                        if (~class132.field1627 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var25;
                            var41[0] = var8;
                            var41[1] = var24;
                            this.method2587(var21, var4, var6 + var8, var23, false, var25, var22);
                            var8 = var24;
                        } else {
                            this.method2587(var21, var4, var6 + var8, var23, false, var25, var22);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[2] = var23 + var25;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var19 = var43;
                            var12 = var13;
                            var7 = var6;
                            var13 = 0;
                            var6 = class585.method3373(var21, true, class132.field1627);
                            var5 = var6 - var7;
                            var8 = 0;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class132.field1627 + var5;
                            }
                            if (~var44 < ~class132.field1627) {
                                var44 -= class132.field1627;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var45[0] <= var44 && ~var45[1] <= ~var44) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILjq;B)V")
    public static final void method2588(int arg0, int arg1, class447 arg2, byte arg3) {
        if (arg3 > -60) {
            method2589(18, (Class) null, (String) null);
        }
        class623.field8996 = arg1;
        class174.field2259 = arg2;
        class563.field7881 = arg0;
        ++field6156;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjava/lang/Class;Ljava/lang/String;)Z")
    public static final boolean method2589(int arg0, Class arg1, String arg2) {
        ++field6153;
        Class var3 = (Class) class20.field291.get(arg2);
        if (var3 != null) {
            return var3.getClassLoader() == arg1.getClassLoader();
        } else {
            Object var4 = null;
            if (arg0 != -30877) {
                field6147 = null;
            }
            File var5 = (File) class496.field6915.get(arg2);
            if (var5 != null) {
                try {
                    var5 = new File(var5.getCanonicalPath());
                    Class var6 = Class.forName("java.lang.Runtime");
                    Class var7 = Class.forName("java.lang.reflect.AccessibleObject");
                    Method var8 = var7.getDeclaredMethod("setAccessible", Boolean.TYPE);
                    Method var9 = var6.getDeclaredMethod("load0", Class.forName("java.lang.Class"), Class.forName("java.lang.String"));
                    var8.invoke(var9, Boolean.TRUE);
                    var9.invoke(Runtime.getRuntime(), arg1, var5.getPath());
                    var8.invoke(var9, Boolean.FALSE);
                    class20.field291.put(arg2, arg1);
                    return true;
                } catch (NoSuchMethodException var10) {
                    System.load(var5.getPath());
                    class20.field291.put(arg2, field6167 != null ? field6167 : (field6167 = method2592("dba")));
                    return true;
                } catch (Throwable var11) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(B)V")
    public static void method2590(byte arg0) {
        if (arg0 > 23) {
            field6165 = null;
            field6147 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "()V")
    public class445() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILjj;I)V")
    public static final void method2591(int arg0, class66 arg1, int arg2) {
        class80.field1087 = 0;
        ++field6155;
        class513.field7143 = false;
        if (arg0 == -9009) {
            class148.method804(arg1, 0);
            class621.method3558(-122, arg1);
            if (class513.field7143) {
                System.out.println("---endgpp---");
            }
            if (~arg1.field7707 != ~arg2) {
                throw new RuntimeException("gpi1 pos:" + arg1.field7707 + " psize:" + arg2);
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILge;I)V")
    public final void method13(int arg0, class551 arg1, int arg2) {
        if (arg0 >= -89) {
            field6165 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field6166 = arg1.method3090(-124);
                                        }
                                    } else {
                                        this.field6148 = arg1.method3090(-94);
                                    }
                                } else {
                                    this.field6152 = arg1.method3045(-128);
                                }
                            } else {
                                this.field6159 = arg1.method3090(-77);
                            }
                        } else {
                            this.field6162 = arg1.method3090(-117);
                        }
                    } else {
                        this.field6157 = arg1.method3090(-71);
                    }
                } else {
                    this.field6161 = arg1.method3090(-123);
                }
            } else {
                this.field6158 = arg1.method3090(-107);
            }
        } else {
            this.field6150 = arg1.method3045(-127);
        }
        ++field6151;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2592(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
