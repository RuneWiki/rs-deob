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

@OriginalClass("client!vg")
public class class291 {

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "Ljava/lang/String;")
    public static String field4580 = "skill: ";

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field4581 = -1;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "Lvh;")
    public static class62 field4582 = new class62(64);

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field4584 = "Examine";

    @OriginalMember(owner = "client!vg", name = "m", descriptor = "I")
    public static int field4586 = 0;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "[I")
    public static int[] field4585 = new int[4096];

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field4574;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "I")
    public static int field4576;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field4577;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field4578;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "Lnk;")
    public static class16 field4583;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(I)V", line = 6)
    public static void method2075(int arg0) {
        field4582 = null;
        if (arg0 != 255) {
            method2079(false, (String) null);
        }
        field4584 = null;
        field4580 = null;
        field4585 = null;
        field4583 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([[FB[[I[[BII[[B[[F[[B[Lh;[[F[[B)V", line = 29)
    public static final void method2076(float[][] arg0, byte arg1, int[][] arg2, byte[][] arg3, int arg4, int arg5, byte[][] arg6, float[][] arg7, byte[][] arg8, class244[] arg9, float[][] arg10, byte[][] arg11) {
        for (int var12 = 0; var12 < arg4; var12++) {
            class244 var13 = arg9[var12];
            if (var13.field3831 == arg5) {
                class350 var14 = new class350();
                int var15 = 0;
                int var16 = (var13.field3839 >> 7) - var13.field3835;
                int var17 = (var13.field3841 >> 7) - var13.field3835;
                if (var17 < 0) {
                    var15 -= var17;
                    var17 = 0;
                }
                int var18 = (var13.field3841 >> 7) + var13.field3835;
                if (var18 > 103) {
                    var18 = 103;
                }
                for (int var19 = var17; var19 <= var18; var19++) {
                    short var20 = var13.field3837[var15];
                    int var21 = (var20 >> 8) + var16;
                    int var22 = (var20 & 0xFF) + var21 - 1;
                    if (var22 > 103) {
                        var22 = 103;
                    }
                    if (var21 < 0) {
                        var21 = 0;
                    }
                    for (int var23 = var21; var23 <= var22; var23++) {
                        int var24 = arg6[var23][var19] & 0xFF;
                        int var25 = arg11[var23][var19] & 0xFF;
                        boolean var26 = false;
                        if (var24 == 0) {
                            if (var25 == 0) {
                                continue;
                            }
                            class146 var27 = class348.method2412(true, var25 - 1);
                            if (var27.field2328 == -1) {
                                continue;
                            }
                            if (arg3[var23][var19] != 0) {
                                int[] var28 = class279.field4400[arg3[var23][var19]];
                                var14.field5580 += ((var28.length >> 1) - 2) * 3;
                                var14.field5589 += var28.length >> 1;
                                continue;
                            }
                        } else if (var25 != 0) {
                            class146 var29 = class348.method2412(true, var25 - 1);
                            if (var29.field2328 == -1) {
                                byte var30 = arg3[var23][var19];
                                if (var30 != 0) {
                                    int[] var31 = class110.field1520[var30];
                                    var14.field5580 += ((var31.length >> 1) - 2) * 3;
                                    var14.field5589 += var31.length >> 1;
                                }
                                continue;
                            }
                            byte var32 = arg3[var23][var19];
                            if (var32 != 0) {
                                var26 = true;
                            }
                        }
                        class44 var33 = class285.method2053(arg5, var23, var19);
                        if (var33 != null) {
                            int var34 = (int) (var33.field502 >> 14) & 0x3F;
                            if (var34 == 9) {
                                int[] var35 = null;
                                int var36 = (int) (var33.field502 >> 20) & 0x3;
                                if ((var36 & 0x1) == 0) {
                                    boolean var37 = var23 - 1 >= var21;
                                    boolean var38 = var22 >= (var23 + 1);
                                    if (!var37 && (var19 + 1) <= var18) {
                                        short var39 = var13.field3837[var15 + 1];
                                        int var40 = (var39 >> 8) + var16;
                                        int var41 = (var39 & 0xFF) + var40;
                                        var37 = var23 > var40 && var23 < var41;
                                    }
                                    if (!var38 && var17 <= var19 - 1) {
                                        short var42 = var13.field3837[var15 - 1];
                                        int var43 = (var42 >> 8) + var16;
                                        int var44 = (var42 & 0xFF) + var43;
                                        var38 = var43 < var23 && var23 < var44;
                                    }
                                    if (var37 && var38) {
                                        var35 = class279.field4400[0];
                                    } else if (var37) {
                                        var35 = class279.field4400[1];
                                    } else if (var38) {
                                        var35 = class279.field4400[1];
                                    }
                                } else {
                                    boolean var45 = var23 + 1 <= var22;
                                    boolean var46 = var21 <= (var23 - 1);
                                    if (!var46 && var17 <= (var19 - 1)) {
                                        short var47 = var13.field3837[var15 - 1];
                                        int var48 = (var47 >> 8) + var16;
                                        int var49 = (var47 & 0xFF) + var48;
                                        var46 = var48 < var23 && var23 < var49;
                                    }
                                    if (!var45 && (var19 + 1) <= var18) {
                                        short var50 = var13.field3837[var15 + 1];
                                        int var51 = (var50 >> 8) + var16;
                                        int var52 = (var50 & 0xFF) + var51;
                                        var45 = var51 < var23 && var52 > var23;
                                    }
                                    if (var46 && var45) {
                                        var35 = class279.field4400[0];
                                    } else if (var46) {
                                        var35 = class279.field4400[1];
                                    } else if (var45) {
                                        var35 = class279.field4400[1];
                                    }
                                }
                                if (var35 != null) {
                                    var14.field5580 += ((var35.length >> 1) - 2) * 3;
                                    var14.field5589 += var35.length >> 1;
                                }
                                continue;
                            }
                        }
                        if (var26) {
                            int[] var54 = class279.field4400[arg3[var23][var19]];
                            int[] var55 = class110.field1520[arg3[var23][var19]];
                            var14.field5580 += (var54.length >> 1) * 3 - 6;
                            var14.field5580 += (var55.length >> 1) * 3 - 6;
                            var14.field5589 += var54.length >> 1;
                            var14.field5589 += var55.length >> 1;
                        } else {
                            int[] var53 = class279.field4400[0];
                            var14.field5580 += (var53.length >> 1) * 3 - 6;
                            var14.field5589 += var53.length >> 1;
                        }
                    }
                    var15++;
                }
                int var56 = 0;
                var14.method2427();
                if ((var13.field3841 >> 7) - var13.field3835 < 0) {
                    var56 -= (var13.field3841 >> 7) - var13.field3835;
                }
                for (int var57 = var17; var57 <= var18; var57++) {
                    short var58 = var13.field3837[var56];
                    int var59 = (var58 >> 8) + var16;
                    int var60 = (var58 & 0xFF) + var59 - 1;
                    if (var59 < 0) {
                        var59 = 0;
                    }
                    if (var60 > 103) {
                        var60 = 103;
                    }
                    for (int var61 = var59; var61 <= var60; var61++) {
                        byte var62 = arg8[var61][var57];
                        int var63 = arg6[var61][var57] & 0xFF;
                        int var64 = arg11[var61][var57] & 0xFF;
                        boolean var65 = false;
                        if (var63 == 0) {
                            if (var64 == 0) {
                                continue;
                            }
                            class146 var68 = class348.method2412(true, var64 - 1);
                            if (var68.field2328 == -1) {
                                continue;
                            }
                            if (arg3[var61][var57] != 0) {
                                class252.method1790(arg10, var57, var61, arg0, arg7, -497, class279.field4400[arg3[var61][var57]], arg8[var61][var57], var13, arg2, var14);
                                continue;
                            }
                        } else if (var64 != 0) {
                            class146 var66 = class348.method2412(true, var64 - 1);
                            if (var66.field2328 == -1) {
                                class252.method1790(arg10, var57, var61, arg0, arg7, -497, class110.field1520[arg3[var61][var57]], arg8[var61][var57], var13, arg2, var14);
                                continue;
                            }
                            byte var67 = arg3[var61][var57];
                            if (var67 != 0) {
                                var65 = true;
                            }
                        }
                        class44 var69 = class285.method2053(arg5, var61, var57);
                        if (var69 != null) {
                            int var70 = (int) (var69.field502 >> 14) & 0x3F;
                            if (var70 == 9) {
                                int var71 = (int) (var69.field502 >> 20) & 0x3;
                                int[] var72 = null;
                                if ((var71 & 0x1) == 0) {
                                    boolean var81 = var61 - 1 >= var59;
                                    boolean var82 = (var61 + 1) <= var60;
                                    if (!var81 && var57 + 1 <= var18) {
                                        short var83 = var13.field3837[var56 + 1];
                                        int var84 = (var83 >> 8) + var16;
                                        int var85 = (var83 & 0xFF) + var84;
                                        var81 = var84 < var61 && var61 < var85;
                                    }
                                    if (!var82 && var57 - 1 >= var17) {
                                        short var86 = var13.field3837[var56 - 1];
                                        int var87 = (var86 >> 8) + var16;
                                        int var88 = (var86 & 0xFF) + var87;
                                        var82 = var87 < var61 && var88 > var61;
                                    }
                                    if (var81 && var82) {
                                        var72 = class279.field4400[0];
                                    } else if (var81) {
                                        var72 = class279.field4400[1];
                                        var62 = 1;
                                    } else if (var82) {
                                        var72 = class279.field4400[1];
                                        var62 = 3;
                                    }
                                } else {
                                    boolean var73 = (var61 - 1) >= var59;
                                    if (!var73 && var17 <= (var57 - 1)) {
                                        short var74 = var13.field3837[var56 - 1];
                                        int var75 = var16 + (var74 >> 8);
                                        int var76 = (var74 & 0xFF) + var75;
                                        var73 = var75 < var61 && var61 < var76;
                                    }
                                    boolean var77 = var61 + 1 <= var60;
                                    if (!var77 && (var57 + 1) <= var18) {
                                        short var78 = var13.field3837[var56 + 1];
                                        int var79 = (var78 >> 8) + var16;
                                        int var80 = (var78 & 0xFF) + var79;
                                        var77 = var79 < var61 && var80 > var61;
                                    }
                                    if (var73 && var77) {
                                        var72 = class279.field4400[0];
                                    } else if (var73) {
                                        var72 = class279.field4400[1];
                                        var62 = 0;
                                    } else if (var77) {
                                        var62 = 2;
                                        var72 = class279.field4400[1];
                                    }
                                }
                                if (var72 != null) {
                                    class252.method1790(arg10, var57, var61, arg0, arg7, -497, var72, var62, var13, arg2, var14);
                                }
                                continue;
                            }
                        }
                        if (var65) {
                            class252.method1790(arg10, var57, var61, arg0, arg7, -497, class110.field1520[arg3[var61][var57]], arg8[var61][var57], var13, arg2, var14);
                            class252.method1790(arg10, var57, var61, arg0, arg7, -497, class279.field4400[arg3[var61][var57]], arg8[var61][var57], var13, arg2, var14);
                        } else {
                            class252.method1790(arg10, var57, var61, arg0, arg7, -497, class279.field4400[0], var62, var13, arg2, var14);
                        }
                    }
                    var56++;
                }
                if (var14.field5578 > 0 && var14.field5576 > 0) {
                    var14.method2428();
                    var13.field3821 = var14;
                }
            }
        }
        field4577++;
        int var89 = -92 / ((arg1 + 3) / 35);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IILen;)V", line = 556)
    public static final void method2077(int arg0, int arg1, class49 arg2) {
        field4574++;
        if (arg1 >= -4) {
            field4584 = (String) null;
        }
        while (true) {
            class27 var3 = (class27) class307.field4774.method1812(1);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field314; var5++) {
                if (var3.field311[var5] != null) {
                    if (var3.field311[var5].field2419 == 2) {
                        var3.field315[var5] = -5;
                    }
                    if (var3.field311[var5].field2419 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field320[var5] != null) {
                    if (var3.field320[var5].field2419 == 2) {
                        var3.field315[var5] = -6;
                    }
                    if (var3.field320[var5].field2419 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method304(arg0, 19830);
            arg2.method1055(0, 94);
            int var6 = arg2.field2295;
            arg2.method1052(var3.field322, false);
            for (int var7 = 0; var7 < var3.field314; var7++) {
                if (var3.field315[var7] == 0) {
                    try {
                        int var8 = var3.field325[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field311[var7].field2421;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1055(0, 115);
                            arg2.method1052(var10, false);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field311[var7].field2421;
                            var11.setInt((Object) null, var3.field313[var7]);
                            arg2.method1055(0, 85);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field311[var7].field2421;
                            int var13 = var12.getModifiers();
                            arg2.method1055(0, 97);
                            arg2.method1052(var13, false);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field320[var7].field2421;
                            byte[][] var17 = var3.field324[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1055(0, 117);
                            } else if (var21 instanceof Number) {
                                arg2.method1055(1, 78);
                                arg2.method1039(((Number) var21).longValue(), (byte) 103);
                            } else if ((var21 instanceof String)) {
                                arg2.method1055(2, 113);
                                arg2.method1050((String) var21, -16);
                            } else {
                                arg2.method1055(4, 81);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field320[var7].field2421;
                            int var15 = var14.getModifiers();
                            arg2.method1055(0, 82);
                            arg2.method1052(var15, false);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method1055(-10, 78);
                    } catch (InvalidClassException var35) {
                        arg2.method1055(-11, 102);
                    } catch (StreamCorruptedException var36) {
                        arg2.method1055(-12, 97);
                    } catch (OptionalDataException var37) {
                        arg2.method1055(-13, 109);
                    } catch (IllegalAccessException var38) {
                        arg2.method1055(-14, 94);
                    } catch (IllegalArgumentException var39) {
                        arg2.method1055(-15, 126);
                    } catch (InvocationTargetException var40) {
                        arg2.method1055(-16, 81);
                    } catch (SecurityException var41) {
                        arg2.method1055(-17, 125);
                    } catch (IOException var42) {
                        arg2.method1055(-18, 100);
                    } catch (NullPointerException var43) {
                        arg2.method1055(-19, 95);
                    } catch (Exception var44) {
                        arg2.method1055(-20, 94);
                    } catch (Throwable var45) {
                        arg2.method1055(-21, 95);
                    }
                } else {
                    arg2.method1055(var3.field315[var7], 81);
                }
            }
            arg2.method1030(var6, (byte) -94);
            arg2.method1044(arg2.field2295 - var6, (byte) 81);
            var3.method1290(-101);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)Lhi;", line = 752)
    public static final class323 method2078(int arg0, int arg1, int arg2) {
        field4576++;
        class323 var3 = class45.method277(-12866, arg0);
        if (~arg1 == arg2) {
            return var3;
        } else if (var3 == null || var3.field5036 == null || var3.field5036.length <= arg1) {
            return null;
        } else {
            return var3.field5036[arg1];
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZLjava/lang/String;)Z", line = 769)
    public static final boolean method2079(boolean arg0, String arg1) {
        field4578++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class95.field1313; var2++) {
            if (arg1.equalsIgnoreCase(class235.field3618[var2])) {
                return true;
            }
        }
        if (!arg0) {
            method2079(true, (String) null);
        }
        if (arg1.equalsIgnoreCase(class11.field113.field848)) {
            return true;
        } else {
            return false;
        }
    }
}
