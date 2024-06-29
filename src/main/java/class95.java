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

@OriginalClass("client!ne")
public class class95 extends class30 {

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public int field2130 = 0;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field2126 = 0;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "I")
    public static int field2135 = 20;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "[S")
    public static short[] field2129 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "[I")
    public static int[] field2138 = new int[1000];

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "Lje;")
    public static class67 field2137 = class85.method592(255, "(U0a )2 non)2existant gosub script)2num: ");

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "Lje;")
    private static class67 field2125 = class85.method592(255, "flash1:");

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "Lje;")
    public static class67 field2124 = field2125;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Lje;")
    public static class67 field2127 = field2125;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field2128;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!ne", name = "hb", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!ne", name = "jb", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!ne", name = "ib", descriptor = "Lfd;")
    public static class40 field2141;

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lkc;")
    public static class72 field2133;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "Llb;")
    public static class78 field2132;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIZII)Lqb;")
    public static final class113 method731(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        long var6 = ((long) arg0 << 38) + ((long) arg4 << 40) + ((long) arg1 << 16) + (long) arg2;
        field2140++;
        if (!arg3) {
            class113 var8 = (class113) class133.field2981.method764(var6, 24182);
            if (var8 != null) {
                return var8;
            }
        }
        class103 var9 = class123.method961(arg2, 1658);
        if (arg1 > 1 && var9.field2313 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (var9.field2322[var11] <= arg1 && var9.field2322[var11] != 0) {
                    var10 = var9.field2313[var11];
                }
            }
            if (var10 != -1) {
                var9 = class123.method961(var10, 1658);
            }
        }
        class5 var12 = var9.method818(1, 23288);
        if (var12 == null) {
            return null;
        }
        class113 var13 = null;
        if (var9.field2290 != -1) {
            var13 = method731(1, 10, var9.field2347, true, 0, 127);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class8.field152;
        int var15 = class8.field153;
        if (arg5 <= 47) {
            method733(116);
        }
        int var16 = class8.field154;
        int[] var17 = new int[4];
        class8.method63(var17);
        class113 var18 = new class113(36, 32);
        class8.method73(var18.field2571, 36, 32);
        class8.method76();
        class96.method751();
        class96.method746(16, 16);
        class96.field2161 = false;
        int var19 = var9.field2328;
        if (arg3) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg0 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class96.field2143[var9.field2341] * var19 >> 16;
        int var21 = class96.field2148[var9.field2341] * var19 >> 16;
        var12.method42();
        var12.method39(0, var9.field2329, var9.field2299, var9.field2341, var9.field2305, var12.field2394 / 2 + var9.field2294 + var20, var9.field2294 + var21);
        if (arg0 >= 1) {
            var18.method908(1);
        }
        if (arg0 >= 2) {
            var18.method908(16777215);
        }
        if (arg4 != 0) {
            var18.method919(arg4);
        }
        class8.method73(var18.field2571, 36, 32);
        if (var9.field2290 != -1) {
            var13.method916(0, 0);
        }
        if (!arg3 && (var9.field2356 == 1 || arg1 != 1) && arg1 != -1) {
            class23.field424.method793(class41.method272(arg1, 100000), 0, 9, 16776960, 1);
        }
        if (!arg3) {
            class133.field2981.method765(var6, var18, (byte) -61);
        }
        class8.method73(var14, var16, var15);
        class8.method67(var17);
        class96.method751();
        class96.field2161 = true;
        return var18;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lna;II)V")
    private final void method732(class91 arg0, int arg1, int arg2) {
        field2136++;
        if (arg1 < 86) {
            this.method736(null, false);
        }
        if (arg2 == 5) {
            this.field2130 = arg0.method641(255);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V")
    public static final void method733(int arg0) {
        field2134++;
        class41.method273(false, arg0 ^ 0xFFFFF058);
        boolean var1 = true;
        class101.field2262 = 0;
        for (int var2 = 0; var2 < class116.field2616.length; var2++) {
            if (class25.field464[var2] != -1 && class116.field2616[var2] == null) {
                class116.field2616[var2] = class98.field2183.method267((byte) -124, 0, class25.field464[var2]);
                if (class116.field2616[var2] == null) {
                    class101.field2262++;
                    var1 = false;
                }
            }
            if (class67.field1329[var2] != -1 && class152.field3491[var2] == null) {
                class152.field3491[var2] = class98.field2183.method245(class67.field1329[var2], class142.field3254[var2], arg0 + 4001, 0);
                if (class152.field3491[var2] == null) {
                    var1 = false;
                    class101.field2262++;
                }
            }
        }
        if (!var1) {
            class116.field2621 = 1;
            return;
        }
        boolean var3 = true;
        class27.field487 = 0;
        for (int var4 = 0; var4 < class116.field2616.length; var4++) {
            byte[] var56 = class152.field3491[var4];
            if (var56 != null) {
                int var57 = (class42.field802[var4] >> 8) * 64 - class130.field2863;
                int var58 = (class42.field802[var4] & 0xFF) * 64 - class35.field647;
                if (class79.field1750) {
                    var57 = 10;
                    var58 = 10;
                }
                var3 &= class130.method990(var57, var56, arg0 - 25948, var58);
            }
        }
        if (!var3) {
            class116.field2621 = 2;
            return;
        }
        if (class116.field2621 != 0) {
            class6.method56(true, class49.method314(new class67[] { class39.field703, class33.field587 }, arg0 + 4001), 14489);
        }
        class67.method485(arg0 ^ 0xFA1);
        class144.method1108(arg0 ^ 0xFFFFD9DE);
        class67.method485(-2);
        class134.field3044.method354();
        class67.method485(-2);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class86.field1900[var5].method223(24495);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class82.field1809[var6][var54][var55] = 0;
                }
            }
        }
        class67.method485(-2);
        class46.method294(arg0 + 18224);
        int var7 = class116.field2616.length;
        class17.method118((byte) -126);
        class41.method273(true, arg0 ^ 0xFFFFF058);
        if (!class79.field1750) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class42.field802[var8] >> 8) * 64 - class130.field2863;
                int var18 = (class42.field802[var8] & 0xFF) * 64 - class35.field647;
                byte[] var19 = class116.field2616[var8];
                if (var19 != null) {
                    class67.method485(arg0 ^ 0xFA1);
                    class42.method277(false, var18, var17, var19, class159.field3654 * 8 - 48, class86.field1900, (class159.field3656 - 6) * 8);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class42.field802[var9] & 0xFF) * 64 - class35.field647;
                int var15 = (class42.field802[var9] >> 8) * 64 - class130.field2863;
                byte[] var16 = class116.field2616[var9];
                if (var16 == null && class159.field3656 < 800) {
                    class67.method485(arg0 + 3999);
                    class56.method390((byte) 115, var14, var15, 64, 64);
                }
            }
            class41.method273(true, arg0 + 4008);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class152.field3491[var10];
                if (var11 != null) {
                    int var12 = (class42.field802[var10] & 0xFF) * 64 - class35.field647;
                    int var13 = (class42.field802[var10] >> 8) * 64 - class130.field2863;
                    class67.method485(-2);
                    class112.method893(class134.field3044, class86.field1900, var12, var13, true, var11);
                }
            }
        }
        if (class79.field1750) {
            for (int var20 = 0; var20 < 4; var20++) {
                class67.method485(arg0 ^ 0xFA1);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class148.field3381[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 24 & 0x3;
                            int var39 = var37 >> 14 & 0x3FF;
                            int var40 = var37 >> 1 & 0x3;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var39 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class42.field802.length; var43++) {
                                if (class42.field802[var43] == var42 && class116.field2616[var43] != null) {
                                    class122.method959(var20, (var39 & 0x7) * 8, var35 * 8, var38, class86.field1900, var34 * 8, class116.field2616[var43], var40, (var41 & 0x7) * 8, 0);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class158.method1220(var20, var34 * 8, var35 * 8, (byte) -107);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class148.field3381[0][var21][var32];
                    if (var33 == -1) {
                        class56.method390((byte) 116, var32 * 8, var21 * 8, 8, 8);
                    }
                }
            }
            class41.method273(true, 7);
            for (int var22 = 0; var22 < 4; var22++) {
                class67.method485(-2);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class148.field3381[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 1 & 0x3;
                            int var27 = var25 >> 14 & 0x3FF;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = (var27 / 8 << 8) + var28 / 8;
                            int var30 = var25 >> 24 & 0x3;
                            for (int var31 = 0; var31 < class42.field802.length; var31++) {
                                if (class42.field802[var31] == var29 && class152.field3491[var31] != null) {
                                    class128.method980((var27 & 0x7) * 8, var22, 1, class152.field3491[var31], class134.field3044, var26, var23 * 8, class86.field1900, var24 * 8, var30, (var28 & 0x7) * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class41.method273(true, 7);
        class144.method1108(arg0 + 14626);
        class67.method485(-2);
        class23.method161(class86.field1900, true, class134.field3044);
        class41.method273(true, 7);
        if (arg0 != -4001) {
            return;
        }
        int var44 = class2.field21;
        if (class128.field2817 < var44) {
            var44 = class128.field2817;
        }
        if (class128.field2817 - 1 > var44) {
            int var45 = class128.field2817 - 1;
        }
        if (class41.field773) {
            class134.field3044.method372(class2.field21);
        } else {
            class134.field3044.method372(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class101.method806(var46, var53, true);
            }
        }
        class67.method485(-2);
        class158.method1223(3);
        class107.field2457.method767(1);
        if (class27.field489 != null) {
            class35.field633++;
            class69.field1399.method285(192, (byte) 64);
            class69.field1399.method629((byte) 85, 1057001181);
        }
        if (!class79.field1750) {
            int var47 = (class159.field3654 + 6) / 8;
            int var48 = (class159.field3654 - 6) / 8;
            int var49 = (class159.field3656 - 6) / 8;
            int var50 = (class159.field3656 + 6) / 8;
            for (int var51 = var48 - 1; var51 <= var47 + 1; var51++) {
                for (int var52 = var49 - 1; var52 <= var50 + 1; var52++) {
                    if (var48 > var51 || var47 < var51 || var49 > var52 || var52 > var50) {
                        class98.field2183.method253(0, class49.method314(new class67[] { class52.field1037, class60.method420(var51, arg0 ^ 0xFFFF9F0D), class34.field604, class60.method420(var52, 28498) }, arg0 ^ 0xFFFFF05F));
                        class98.field2183.method253(arg0 + 4001, class49.method314(new class67[] { class40.field737, class60.method420(var51, arg0 + 32499), class34.field604, class60.method420(var52, arg0 + 32499) }, 0));
                    }
                }
            }
        }
        class27.method181(30, arg0 + 3950);
        class67.method485(-2);
        class97.method757((byte) -9);
        class69.field1399.method285(6, (byte) 64);
        class55.method385((byte) 54);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lfd;Z)V")
    public static final void method734(class40 arg0, boolean arg1) {
        class61.field1214 = arg0;
        field2139++;
        if (!arg1) {
            field2132 = null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(I)V")
    public static void method735(int arg0) {
        field2129 = null;
        field2127 = null;
        field2125 = null;
        field2137 = null;
        field2133 = null;
        field2141 = null;
        if (arg0 != 2) {
            field2129 = null;
        }
        field2138 = null;
        field2132 = null;
        field2124 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lna;Z)V")
    public final void method736(class91 arg0, boolean arg1) {
        if (!arg1) {
            return;
        }
        while (true) {
            int var3 = arg0.method649(false);
            if (var3 == 0) {
                field2131++;
                return;
            }
            this.method732(arg0, 93, var3);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IILga;)V")
    public static final void method737(int arg0, int arg1, class44 arg2) {
        field2128++;
        if (arg1 != 12723) {
            method731(95, -56, -64, true, 69, 61);
        }
        while (true) {
            class56 var3 = (class56) class107.field2448.method26((byte) -90);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1113; var5++) {
                if (var3.field1127[var5] != null) {
                    if (var3.field1127[var5].field806 == 2) {
                        var3.field1110[var5] = -5;
                    }
                    if (var3.field1127[var5].field806 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1122[var5] != null) {
                    if (var3.field1122[var5].field806 == 2) {
                        var3.field1110[var5] = -6;
                    }
                    if (var3.field1122[var5].field806 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method285(arg0, (byte) 64);
            arg2.method653(0, 87);
            int var6 = arg2.field2043;
            arg2.method629((byte) 74, var3.field1121);
            for (int var7 = 0; var7 < var3.field1113; var7++) {
                if (var3.field1110[var7] == 0) {
                    try {
                        int var8 = var3.field1125[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field1127[var7].field808;
                            int var13 = var12.getInt(null);
                            arg2.method653(0, 81);
                            arg2.method629((byte) -113, var13);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1127[var7].field808;
                            var11.setInt(null, var3.field1119[var7]);
                            arg2.method653(0, 37);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field1127[var7].field808;
                            int var10 = var9.getModifiers();
                            arg2.method653(0, 52);
                            arg2.method629((byte) 83, var10);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field1122[var7].field808;
                            byte[][] var17 = var3.field1124[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg2.method653(0, 99);
                            } else if (var21 instanceof Number) {
                                arg2.method653(1, 42);
                                arg2.method656(112, ((Number) var21).longValue());
                            } else if (var21 instanceof class67) {
                                arg2.method653(2, 126);
                                arg2.method673((class67) var21, -1393);
                            } else {
                                arg2.method653(4, 106);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field1122[var7].field808;
                            int var15 = var14.getModifiers();
                            arg2.method653(0, arg1 ^ 0x31F9);
                            arg2.method629((byte) -107, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method653(-10, arg1 - 12598);
                    } catch (InvalidClassException var23) {
                        arg2.method653(-11, arg1 - 12670);
                    } catch (StreamCorruptedException var24) {
                        arg2.method653(-12, 117);
                    } catch (OptionalDataException var25) {
                        arg2.method653(-13, 89);
                    } catch (IllegalAccessException var26) {
                        arg2.method653(-14, 54);
                    } catch (IllegalArgumentException var27) {
                        arg2.method653(-15, 88);
                    } catch (InvocationTargetException var28) {
                        arg2.method653(-16, 111);
                    } catch (SecurityException var29) {
                        arg2.method653(-17, 118);
                    } catch (IOException var30) {
                        arg2.method653(-18, 51);
                    } catch (NullPointerException var31) {
                        arg2.method653(-19, 97);
                    } catch (Exception var32) {
                        arg2.method653(-20, arg1 - 12674);
                    } catch (Throwable var33) {
                        arg2.method653(-21, 45);
                    }
                } else {
                    arg2.method653(var3.field1110[var7], 37);
                }
            }
            arg2.method672(var6, (byte) -5);
            arg2.method617(arg1 + 10509, -var6 + arg2.field2043);
            var3.method115(26851);
        }
    }
}
