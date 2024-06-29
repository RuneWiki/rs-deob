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

@OriginalClass("client!na")
public class class141 implements class135 {

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field2182 = -1;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
    public static int[] field2185 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field2187 = 100;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "Ldk;")
    public static class307 field2180 = new class307();

    @OriginalMember(owner = "client!na", name = "j", descriptor = "[I")
    public static int[] field2189 = new int[4096];

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Ll;")
    public static class133 field2188;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[Lgm;")
    public static class249[] field2183;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILka;I)V", line = 8)
    public static final void method1010(int arg0, class104 arg1, int arg2) {
        if (arg0 != -17157) {
            field2188 = (class133) null;
        }
        field2181++;
        while (true) {
            class176 var3 = (class176) class240.field3835.method636(arg0 ^ 0x4304);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2676; var5++) {
                if (var3.field2670[var5] != null) {
                    if (var3.field2670[var5].field2956 == 2) {
                        var3.field2667[var5] = -5;
                    }
                    if (var3.field2670[var5].field2956 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2662[var5] != null) {
                    if (var3.field2662[var5].field2956 == 2) {
                        var3.field2667[var5] = -6;
                    }
                    if (var3.field2662[var5].field2956 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method753(124, arg2);
            arg1.method1132((byte) 29, 0);
            int var6 = arg1.field2532;
            arg1.method1174((byte) -32, var3.field2672);
            for (int var7 = 0; var7 < var3.field2676; var7++) {
                if (var3.field2667[var7] == 0) {
                    try {
                        int var8 = var3.field2669[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2670[var7].field2959;
                            int var10 = var9.getInt((Object) null);
                            arg1.method1132((byte) 29, 0);
                            arg1.method1174((byte) -32, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2670[var7].field2959;
                            var13.setInt((Object) null, var3.field2664[var7]);
                            arg1.method1132((byte) 29, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2670[var7].field2959;
                            int var12 = var11.getModifiers();
                            arg1.method1132((byte) 29, 0);
                            arg1.method1174((byte) -32, var12);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field2662[var7].field2959;
                            byte[][] var15 = var3.field2663[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke((Object) null, var16);
                            if (var19 == null) {
                                arg1.method1132((byte) 29, 0);
                            } else if ((var19 instanceof Number)) {
                                arg1.method1132((byte) 29, 1);
                                arg1.method1125(8473, ((Number) var19).longValue());
                            } else if ((var19 instanceof String)) {
                                arg1.method1132((byte) 29, 2);
                                arg1.method1121(-1, (String) var19);
                            } else {
                                arg1.method1132((byte) 29, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2662[var7].field2959;
                            int var21 = var20.getModifiers();
                            arg1.method1132((byte) 29, 0);
                            arg1.method1174((byte) -32, var21);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg1.method1132((byte) 29, -10);
                    } catch (InvalidClassException var35) {
                        arg1.method1132((byte) 29, -11);
                    } catch (StreamCorruptedException var36) {
                        arg1.method1132((byte) 29, -12);
                    } catch (OptionalDataException var37) {
                        arg1.method1132((byte) 29, -13);
                    } catch (IllegalAccessException var38) {
                        arg1.method1132((byte) 29, -14);
                    } catch (IllegalArgumentException var39) {
                        arg1.method1132((byte) 29, -15);
                    } catch (InvocationTargetException var40) {
                        arg1.method1132((byte) 29, -16);
                    } catch (SecurityException var41) {
                        arg1.method1132((byte) 29, -17);
                    } catch (IOException var42) {
                        arg1.method1132((byte) 29, -18);
                    } catch (NullPointerException var43) {
                        arg1.method1132((byte) 29, -19);
                    } catch (Exception var44) {
                        arg1.method1132((byte) 29, -20);
                    } catch (Throwable var45) {
                        arg1.method1132((byte) 29, -21);
                    }
                } else {
                    arg1.method1132((byte) 29, var3.field2667[var7]);
                }
            }
            arg1.method1164(-98, var6);
            arg1.method1141((byte) 118, arg1.field2532 - var6);
            var3.method403(arg0 + 17158);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 199)
    public static void method1011(int arg0) {
        field2188 = null;
        field2183 = null;
        field2189 = null;
        field2180 = null;
        if (arg0 > 3) {
            field2185 = null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([IIJI)Ljava/lang/String;", line = 218)
    public final String method988(int[] arg0, int arg1, long arg2, int arg3) {
        field2186++;
        if (arg1 == 0) {
            class70 var6 = class342.method2368(arg0[0], arg3 + 104);
            return var6.method525(~arg3, (int) arg2);
        }
        if (arg3 != 0) {
            field2188 = (class133) null;
        }
        if (arg1 == 1 || arg1 == 10) {
            class299 var7 = class237.method1657(2, (int) arg2);
            return var7.field4650;
        } else if (arg1 == 6 || arg1 == 7 || arg1 == 11) {
            return class342.method2368(arg0[0], -96).method525(-1, (int) arg2);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(BI)V", line = 249)
    public static final void method1012(byte arg0, int arg1) {
        class338 var2 = class195.method1391(11, (byte) -92, arg1);
        if (arg0 == 112) {
            var2.method2347(true);
            field2184++;
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V", line = 277)
    public static final void method1013(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class50.field817 * 128) {
            arg0 = class50.field817 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class267.field4171 * 128) {
            arg2 = class267.field4171 * 128 - 1;
        }
        class279.field4292 = class15.field204[arg3];
        class171.field2607 = class15.field216[arg3];
        class44.field704 = class15.field204[arg4];
        class53.field908 = class15.field216[arg4];
        class217.field3306 = arg0;
        class17.field238 = arg1;
        class212.field3226 = arg2;
        class106.field1637 = arg0 / 128;
        class219.field3330 = arg2 / 128;
        class304.field4751 = class106.field1637 - class73.field1197;
        if (class304.field4751 < 0) {
            class304.field4751 = 0;
        }
        class259.field4061 = class219.field3330 - class73.field1197;
        if (class259.field4061 < 0) {
            class259.field4061 = 0;
        }
        class46.field757 = class73.field1197 + class106.field1637;
        if (class46.field757 > class50.field817) {
            class46.field757 = class50.field817;
        }
        class18.field249 = class73.field1197 + class219.field3330;
        if (class18.field249 > class267.field4171) {
            class18.field249 = class267.field4171;
        }
        short var15;
        if (class94.field1516) {
            var15 = 3584;
        } else {
            var15 = 3500;
        }
        for (int var16 = 0; var16 < class73.field1197 + class73.field1197 + 2; var16++) {
            for (int var17 = 0; var17 < class73.field1197 + class73.field1197 + 2; var17++) {
                int var18 = (var16 - class73.field1197 << 7) - (class217.field3306 & 0x7F);
                int var19 = (var17 - class73.field1197 << 7) - (class212.field3226 & 0x7F);
                int var20 = class106.field1637 + var16 - class73.field1197;
                int var21 = class219.field3330 + var17 - class73.field1197;
                if (var20 >= 0 && var21 >= 0 && var20 < class50.field817 && var21 < class267.field4171) {
                    int var22;
                    if (class119.field1816 == null) {
                        var22 = class216.field3293[0][var20][var21] + 128 - class17.field238;
                    } else {
                        var22 = class119.field1816[0][var20][var21] + 128 - class17.field238;
                    }
                    int var23 = class216.field3293[3][var20][var21] - class17.field238 - 1000;
                    class53.field898[var16][var17] = class217.method1534(var18, var23, var22, var19, var15);
                } else {
                    class53.field898[var16][var17] = false;
                }
            }
        }
        for (int var24 = 0; var24 < class73.field1197 + class73.field1197 + 1; var24++) {
            for (int var25 = 0; var25 < class73.field1197 + class73.field1197 + 1; var25++) {
                class149.field2256[var24][var25] = class53.field898[var24][var25] || class53.field898[var24 + 1][var25] || class53.field898[var24][var25 + 1] || class53.field898[var24 + 1][var25 + 1];
            }
        }
        class16.field233 = arg6;
        class201.field3021 = arg7;
        class31.field450 = arg8;
        class156.field2338 = arg9;
        class265.field4114 = arg10;
        class210.method1487();
        if (class316.field4940 != null) {
            class298.method2022(true);
            class200.method1426(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            if (class94.field1516) {
                class174.field2641 = false;
                class37.method313(0, 0, 0);
                class250.method1733((float[]) null);
                class183.method1318();
            }
            class298.method2022(false);
        }
        class200.method1426(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }
}
