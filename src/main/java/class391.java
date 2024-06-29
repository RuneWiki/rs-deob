import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class391 extends class739 {

    @OriginalMember(owner = "client!ml", name = "H", descriptor = "I")
    private int field4979 = 6;

    @OriginalMember(owner = "client!ml", name = "F", descriptor = "Lcha;")
    public static class220 field4977 = new class220(0, 7);

    @OriginalMember(owner = "client!ml", name = "G", descriptor = "I")
    public static int field4978 = 0;

    @OriginalMember(owner = "client!ml", name = "E", descriptor = "I")
    public static int field4976;

    @OriginalMember(owner = "client!ml", name = "I", descriptor = "I")
    public static int field4980;

    @OriginalMember(owner = "client!ml", name = "J", descriptor = "I")
    public static int field4981;

    @OriginalMember(owner = "client!ml", name = "K", descriptor = "I")
    public static int field4982;

    @OriginalMember(owner = "client!ml", name = "L", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!ml", name = "M", descriptor = "I")
    public static int field4984;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "(I)V")
    public static void method2212(int arg0) {
        if (arg0 == 0) {
            field4977 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "()V")
    public class391() {
        super(2, false);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BZI)V")
    public static final void method2213(byte arg0, boolean arg1, int arg2) {
        ++field4983;
        class515 var3 = class534.method3075(arg1, arg2, -82);
        if (var3 != null) {
            int var4 = 101 / (arg0 / 33);
            for (int var5 = 0; ~var3.field7226.length < ~var5; ++var5) {
                var3.field7226[var5] = -1;
                var3.field7228[var5] = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BI)[[I")
    public final int[][] method223(byte arg0, int arg1) {
        ++field4976;
        if (arg0 <= 26) {
            field4978 = -110;
        }
        int[][] var3 = super.field10312.method2191((byte) 52, arg1);
        if (super.field10312.field4922) {
            int[][] var4 = this.method4119(2, 0, arg1);
            int[][] var5 = this.method4119(2, 1, arg1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            int[] var12 = var5[0];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field4979;
            if (var15 != 1) {
                if (var15 != 2) {
                    if (var15 != 3) {
                        if (var15 != 4) {
                            if (var15 != 5) {
                                if (var15 != 6) {
                                    if (var15 != 7) {
                                        if (var15 != 8) {
                                            if (~var15 != -10) {
                                                if (var15 != 10) {
                                                    if (~var15 != -12) {
                                                        if (~var15 == -13) {
                                                            for (int var16 = 0; var16 < class29.field523; ++var16) {
                                                                int var17 = var13[var16];
                                                                int var18 = var10[var16];
                                                                int var19 = var12[var16];
                                                                int var20 = var14[var16];
                                                                int var21 = var9[var16];
                                                                int var22 = var11[var16];
                                                                var6[var16] = -(var19 * var21 >> 11) + var19 + var21;
                                                                var7[var16] = -(var17 * var18 >> 11) + var18 - -var17;
                                                                var8[var16] = var20 + var22 - (var20 * var22 >> 11);
                                                            }
                                                        }
                                                    } else {
                                                        for (int var23 = 0; var23 < class29.field523; ++var23) {
                                                            int var24 = var13[var23];
                                                            int var25 = var10[var23];
                                                            int var26 = var9[var23];
                                                            int var27 = var12[var23];
                                                            int var28 = var11[var23];
                                                            int var29 = var14[var23];
                                                            var6[var23] = var27 < var26 ? -var27 + var26 : -var26 + var27;
                                                            var7[var23] = var24 >= var25 ? -var25 + var24 : -var24 + var25;
                                                            var8[var23] = ~var29 > ~var28 ? -var29 + var28 : -var28 + var29;
                                                        }
                                                    }
                                                } else {
                                                    for (int var30 = 0; class29.field523 > var30; ++var30) {
                                                        int var31 = var9[var30];
                                                        int var32 = var12[var30];
                                                        int var33 = var11[var30];
                                                        int var34 = var10[var30];
                                                        int var35 = var13[var30];
                                                        int var36 = var14[var30];
                                                        var6[var30] = var32 >= var31 ? var32 : var31;
                                                        var7[var30] = ~var35 > ~var34 ? var34 : var35;
                                                        var8[var30] = var33 > var36 ? var33 : var36;
                                                    }
                                                }
                                            } else {
                                                for (int var37 = 0; ~class29.field523 < ~var37; ++var37) {
                                                    int var38 = var13[var37];
                                                    int var39 = var11[var37];
                                                    int var40 = var14[var37];
                                                    int var41 = var10[var37];
                                                    int var42 = var12[var37];
                                                    int var43 = var9[var37];
                                                    var6[var37] = var43 < var42 ? var43 : var42;
                                                    var7[var37] = ~var41 <= ~var38 ? var38 : var41;
                                                    var8[var37] = ~var39 <= ~var40 ? var40 : var39;
                                                }
                                            }
                                        } else {
                                            for (int var44 = 0; var44 < class29.field523; ++var44) {
                                                int var45 = var9[var44];
                                                int var46 = var11[var44];
                                                int var47 = var10[var44];
                                                var6[var44] = var45 == 0 ? 0 : -((4096 - var12[var44] << 12) / var45) + 4096;
                                                var7[var44] = var47 == 0 ? 0 : -((-var13[var44] + 4096 << 12) / var47) + 4096;
                                                var8[var44] = var46 == 0 ? 0 : 4096 - (-var14[var44] + 4096 << 12) / var46;
                                            }
                                        }
                                    } else {
                                        for (int var48 = 0; class29.field523 > var48; ++var48) {
                                            int var49 = var11[var48];
                                            int var50 = var9[var48];
                                            int var51 = var10[var48];
                                            var6[var48] = var50 != 4096 ? (var12[var48] << 12) / (-var50 + 4096) : 4096;
                                            var7[var48] = ~var51 != -4097 ? (var13[var48] << 12) / (-var51 + 4096) : 4096;
                                            var8[var48] = var49 == 4096 ? 4096 : (var14[var48] << 12) / (4096 - var49);
                                        }
                                    }
                                } else {
                                    for (int var52 = 0; ~var52 > ~class29.field523; ++var52) {
                                        int var53 = var13[var52];
                                        int var54 = var12[var52];
                                        int var55 = var14[var52];
                                        var6[var52] = ~var54 > -2049 ? var9[var52] * var54 >> 11 : -((4096 - var54) * (-var9[var52] + 4096) >> 11) + 4096;
                                        var7[var52] = var53 >= 2048 ? -((-var10[var52] + 4096) * (-var53 + 4096) >> 11) + 4096 : var10[var52] * var53 >> 11;
                                        var8[var52] = var55 < 2048 ? var11[var52] * var55 >> 11 : -((-var11[var52] + 4096) * (-var55 + 4096) >> 11) + 4096;
                                    }
                                }
                            } else {
                                for (int var56 = 0; ~class29.field523 < ~var56; ++var56) {
                                    var6[var56] = -((-var9[var56] + 4096) * (-var12[var56] + 4096) >> 12) + 4096;
                                    var7[var56] = -((4096 - var13[var56]) * (-var10[var56] + 4096) >> 12) + 4096;
                                    var8[var56] = -((-var11[var56] + 4096) * (-var14[var56] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var57 = 0; var57 < class29.field523; ++var57) {
                                int var58 = var12[var57];
                                int var59 = var13[var57];
                                int var60 = var14[var57];
                                var6[var57] = var58 == 0 ? 4096 : (var9[var57] << 12) / var58;
                                var7[var57] = var59 == 0 ? 4096 : (var10[var57] << 12) / var59;
                                var8[var57] = ~var60 != -1 ? (var11[var57] << 12) / var60 : 4096;
                            }
                        }
                    } else {
                        for (int var61 = 0; var61 < class29.field523; ++var61) {
                            var6[var61] = var9[var61] * var12[var61] >> 12;
                            var7[var61] = var10[var61] * var13[var61] >> 12;
                            var8[var61] = var11[var61] * var14[var61] >> 12;
                        }
                    }
                } else {
                    for (int var62 = 0; class29.field523 > var62; ++var62) {
                        var6[var62] = var9[var62] + -var12[var62];
                        var7[var62] = var10[var62] + -var13[var62];
                        var8[var62] = var11[var62] + -var14[var62];
                    }
                }
            } else {
                for (int var63 = 0; ~var63 > ~class29.field523; ++var63) {
                    var6[var63] = var9[var63] - -var12[var63];
                    var7[var63] = var10[var63] + var13[var63];
                    var8[var63] = var11[var63] + var14[var63];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lha;III)V")
    public static final void method2214(class60 arg0, int arg1, int arg2, int arg3) {
        class739.field10303 = arg0;
        ++field4982;
        if (arg3 != -6723) {
            method2214((class60) null, -61, 65, 2);
        }
        class203.field2718 = new class210[arg2][arg1];
        if (class615.field8494 != null) {
            class196.field2676 = class117.method909(class615.field8494[4], (byte) -90, class615.field8494[2], class615.field8494[0], class615.field8494[3], class615.field8494[5], class615.field8494[1]);
        }
        class605.field8417 = new class210();
        class299.method1789((byte) 47);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)[I")
    public final int[] method215(int arg0, int arg1) {
        ++field4984;
        int[] var3 = super.field10311.method2116(arg1, (byte) 108);
        if (super.field10311.field4728) {
            int[] var4 = this.method4115(-124, arg1, 0);
            int[] var5 = this.method4115(-126, arg1, 1);
            int var6 = this.field4979;
            if (var6 != 1) {
                if (var6 != 2) {
                    if (~var6 != -4) {
                        if (var6 != 4) {
                            if (~var6 != -6) {
                                if (var6 != 6) {
                                    if (~var6 != -8) {
                                        if (var6 != 8) {
                                            if (var6 != 9) {
                                                if (~var6 != -11) {
                                                    if (~var6 != -12) {
                                                        if (var6 == 12) {
                                                            for (int var7 = 0; class29.field523 > var7; ++var7) {
                                                                int var8 = var5[var7];
                                                                int var9 = var4[var7];
                                                                var3[var7] = -(var8 * var9 >> 11) + var8 + var9;
                                                            }
                                                        }
                                                    } else {
                                                        for (int var10 = 0; class29.field523 > var10; ++var10) {
                                                            int var11 = var5[var10];
                                                            int var12 = var4[var10];
                                                            var3[var10] = ~var12 < ~var11 ? var12 - var11 : -var12 + var11;
                                                        }
                                                    }
                                                } else {
                                                    for (int var13 = 0; ~var13 > ~class29.field523; ++var13) {
                                                        int var14 = var4[var13];
                                                        int var15 = var5[var13];
                                                        var3[var13] = var15 >= var14 ? var15 : var14;
                                                    }
                                                }
                                            } else {
                                                for (int var16 = 0; class29.field523 > var16; ++var16) {
                                                    int var17 = var5[var16];
                                                    int var18 = var4[var16];
                                                    var3[var16] = var18 < var17 ? var18 : var17;
                                                }
                                            }
                                        } else {
                                            for (int var19 = 0; ~class29.field523 < ~var19; ++var19) {
                                                int var20 = var4[var19];
                                                var3[var19] = ~var20 == -1 ? 0 : -((-var5[var19] + 4096 << 12) / var20) + 4096;
                                            }
                                        }
                                    } else {
                                        for (int var21 = 0; class29.field523 > var21; ++var21) {
                                            int var22 = var4[var21];
                                            var3[var21] = var22 != 4096 ? (var5[var21] << 12) / (4096 - var22) : 4096;
                                        }
                                    }
                                } else {
                                    for (int var23 = 0; var23 < class29.field523; ++var23) {
                                        int var24 = var5[var23];
                                        var3[var23] = var24 >= 2048 ? -((-var4[var23] + 4096) * (-var24 + 4096) >> 11) + 4096 : var4[var23] * var24 >> 11;
                                    }
                                }
                            } else {
                                for (int var25 = 0; ~var25 > ~class29.field523; ++var25) {
                                    var3[var25] = -((4096 - var5[var25]) * (-var4[var25] + 4096) >> 12) + 4096;
                                }
                            }
                        } else {
                            for (int var26 = 0; var26 < class29.field523; ++var26) {
                                int var27 = var5[var26];
                                var3[var26] = var27 != 0 ? (var4[var26] << 12) / var27 : 4096;
                            }
                        }
                    } else {
                        for (int var28 = 0; ~class29.field523 < ~var28; ++var28) {
                            var3[var28] = var4[var28] * var5[var28] >> 12;
                        }
                    }
                } else {
                    for (int var29 = 0; class29.field523 > var29; ++var29) {
                        var3[var29] = var4[var29] + -var5[var29];
                    }
                }
            } else {
                for (int var30 = 0; var30 < class29.field523; ++var30) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            }
        }
        if (arg0 != -23347) {
            this.method215(-69, 48);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "(I)Z")
    public static final boolean method2215(int arg0) {
        ++field4981;
        if (arg0 <= 18) {
            method2213((byte) 125, false, -10);
        }
        Hashtable var1 = new Hashtable();
        Enumeration var2 = class593.field8293.keys();
        while (var2.hasMoreElements()) {
            Object var3 = var2.nextElement();
            var1.put(var3, class593.field8293.get(var3));
        }
        try {
            Class var4 = Class.forName("java.lang.reflect.AccessibleObject");
            Class var5 = Class.forName("java.lang.ClassLoader");
            Field var6 = var5.getDeclaredField("nativeLibraries");
            Method var7 = var4.getDeclaredMethod("setAccessible", Boolean.TYPE);
            var7.invoke(var6, Boolean.TRUE);
            try {
                Enumeration var8 = class593.field8293.keys();
                while (var8.hasMoreElements()) {
                    String var9 = (String) var8.nextElement();
                    try {
                        File var10 = (File) class551.field7694.get(var9);
                        Class var11 = (Class) class593.field8293.get(var9);
                        Vector var12 = (Vector) var6.get(var11.getClassLoader());
                        for (int var13 = 0; ~var12.size() < ~var13; ++var13) {
                            try {
                                Object var14 = var12.elementAt(var13);
                                Field var15 = var14.getClass().getDeclaredField("name");
                                var7.invoke(var15, Boolean.TRUE);
                                try {
                                    String var16 = (String) var15.get(var14);
                                    if (var16 != null && var16.equalsIgnoreCase(var10.getCanonicalPath())) {
                                        Field var17 = var14.getClass().getDeclaredField("handle");
                                        Method var18 = var14.getClass().getDeclaredMethod("finalize");
                                        var7.invoke(var17, Boolean.TRUE);
                                        var7.invoke(var18, Boolean.TRUE);
                                        try {
                                            var18.invoke(var14);
                                            var17.set(var14, new Integer(0));
                                            var1.remove(var9);
                                        } catch (Throwable var19) {
                                        }
                                        var7.invoke(var18, Boolean.FALSE);
                                        var7.invoke(var17, Boolean.FALSE);
                                    }
                                } catch (Throwable var20) {
                                }
                                var7.invoke(var15, Boolean.FALSE);
                            } catch (Throwable var21) {
                            }
                        }
                    } catch (Throwable var22) {
                    }
                }
            } catch (Throwable var23) {
            }
            var7.invoke(var6, Boolean.FALSE);
        } catch (Throwable var24) {
        }
        class593.field8293 = var1;
        return class593.field8293.isEmpty();
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lsl;II)V")
    public final void method214(class461 arg0, int arg1, int arg2) {
        if (arg2 != -3) {
            this.field4979 = -54;
        }
        if (arg1 != 0) {
            if (arg1 == 1) {
                super.field10297 = ~arg0.method2600((byte) -123) == -2;
            }
        } else {
            this.field4979 = arg0.method2600((byte) -123);
        }
        ++field4980;
    }
}
