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

@OriginalClass("client!fm")
public class class46 {

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "Lwm;")
    public static class152 field735 = class157.method1048("leuchten3:", 117);

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Z")
    public static boolean field737 = false;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIBIIII)V", line = 4)
    public static final void method314(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9, int arg10) {
        field730++;
        int var11 = arg5 - arg4;
        int var12 = arg1 - arg7;
        if (class26.field446 > arg5) {
            var11++;
        }
        if (class239.field3921 > arg1) {
            var12++;
        }
        int var10000;
        for (int var13 = 0; var13 < var12; var13++) {
            int var14 = (var13 + 1) * arg10 + arg8 >> 16;
            int var15 = arg10 * var13 + arg8 >> 16;
            int var16 = var14 - var15;
            if (var16 > 0) {
                int var17 = var13 + arg7 >> 6;
                if (var17 >= 0 && var17 <= (class86.field1213.length - 1)) {
                    int var18 = arg9 + var14;
                    int[][] var19 = class86.field1213[var17];
                    int var20 = arg9 + var15;
                    byte[][] var21 = class2.field41[var17];
                    byte[][] var22 = class291.field4981[var17];
                    byte[][] var23 = class69.field1005[var17];
                    byte[][] var24 = class156.field2487[var17];
                    byte[][] var25 = class232.field3792[var17];
                    for (int var26 = 0; var26 < var11; var26++) {
                        int var27 = (var26 + 1) * arg2 + arg0 >> 16;
                        int var28 = arg2 * var26 + arg0 >> 16;
                        int var29 = var27 - var28;
                        if (var29 > 0) {
                            int var30 = arg4 + var26 >> 6;
                            int var31 = arg4 + var26 & 0x3F;
                            int var32 = arg3 + var28;
                            int var33 = var13 + arg7 & 0x3F;
                            int var34 = (var31 << 6) + var33;
                            int var35 = arg3 + var27;
                            int var36;
                            if (var30 < 0 || (var19.length - 1) < var30 || var19[var30] == null) {
                                if (class23.field399.field5325 != -1) {
                                    var36 = class23.field399.field5325;
                                } else if ((arg4 + var26 & 0x4) == (arg7 + var13 & 0x4)) {
                                    var36 = class322.field5630[class202.field3270 + 1];
                                } else {
                                    var36 = 4936552;
                                }
                                if (var30 < 0 || var19.length - 1 < var30) {
                                    if (var36 == 0) {
                                        var36 = 1;
                                    }
                                    class96.method635(var20, var32, var16, var29, var36);
                                    continue;
                                }
                            } else {
                                var36 = var19[var30][var34];
                            }
                            if (var36 == 0) {
                                var36 = 1;
                            }
                            int var37 = var21[var30] == null ? 0 : class322.field5630[var21[var30][var34] & 0xFF];
                            int var38 = var23[var30] == null ? 0 : class322.field5630[var23[var30][var34] & 0xFF];
                            if (var37 == 0 && var38 == 0) {
                                class96.method635(var20, var32, var16, var29, var36);
                            } else {
                                if (var37 != 0) {
                                    if (var37 == -1) {
                                        var37 = 1;
                                    }
                                    byte var39 = var22[var30] == null ? 0 : var22[var30][var34];
                                    int var40 = var39 & 0xFC;
                                    if (var40 == 0 || var16 <= 1 || var29 <= 1) {
                                        class96.method635(var20, var32, var16, var29, var37);
                                    } else {
                                        class304.method2121(var36, var40 >> 2, arg6 - 21995, var16, class96.field1376, var32, true, var29, var39 & 0x3, var37, var20);
                                    }
                                }
                                if (var38 != 0) {
                                    if (var38 == -1) {
                                        var38 = var36;
                                    }
                                    byte var41 = var24[var30][var34];
                                    int var42 = var41 & 0xFC;
                                    if (var42 == 0 || var16 <= 1 || var29 <= 1) {
                                        class96.method635(var20, var32, var16, var29, var38);
                                    }
                                    class304.method2121(0, var42 >> 2, -22084, var16, class96.field1376, var32, var37 == 0, var29, var41 & 0x3, var38, var20);
                                }
                            }
                            if (var25[var30] != null) {
                                int var43 = var25[var30][var34] & 0xFF;
                                if (var43 != 0) {
                                    int var44;
                                    if (var16 == 1) {
                                        var44 = var20;
                                    } else {
                                        var44 = var18 - 1;
                                    }
                                    int var45 = 13421772;
                                    int var46;
                                    if (var29 == 1) {
                                        var46 = var32;
                                    } else {
                                        var46 = var35 - 1;
                                    }
                                    if (var43 >= 5 && var43 <= 8 || var43 >= 13 && var43 <= 16 || var43 >= 21 && var43 <= 24 || var43 == 27 || var43 == 28) {
                                        var43 -= 4;
                                        var45 = 13369344;
                                    }
                                    if (var43 == 1) {
                                        class96.method630(var20, var32, var29, var45);
                                    } else if (var43 == 2) {
                                        class96.method647(var20, var32, var16, var45);
                                    } else if (var43 == 3) {
                                        class96.method630(var44, var32, var29, var45);
                                    } else if (var43 == 4) {
                                        class96.method647(var20, var46, var16, var45);
                                    } else if (var43 == 9) {
                                        class96.method630(var20, var32, var29, 16777215);
                                        class96.method647(var20, var32, var16, var45);
                                    } else if (var43 == 10) {
                                        class96.method630(var44, var32, var29, 16777215);
                                        class96.method647(var20, var32, var16, var45);
                                    } else if (var43 == 11) {
                                        class96.method630(var44, var32, var29, 16777215);
                                        class96.method647(var20, var46, var16, var45);
                                    } else if (var43 == 12) {
                                        class96.method630(var20, var32, var29, 16777215);
                                        class96.method647(var20, var46, var16, var45);
                                    } else if (var43 == 17) {
                                        class96.method647(var20, var32, 1, var45);
                                    } else if (var43 == 18) {
                                        class96.method647(var44, var32, 1, var45);
                                    } else if (var43 == 19) {
                                        class96.method647(var44, var46, 1, var45);
                                    } else if (var43 == 20) {
                                        class96.method647(var20, var46, 1, var45);
                                    } else if (var43 == 25) {
                                        for (int var48 = 0; var48 < var29; var48++) {
                                            class96.method647(var20 + var48, var46 - var48, 1, var45);
                                        }
                                    } else if (var43 == 26) {
                                        for (int var47 = 0; var47 < var29; var47++) {
                                            class96.method647(var20 + var47, var32 + var47, 1, var45);
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    var10000 = arg9 + var14;
                    int var50 = arg9 + var15;
                    for (int var51 = 0; var51 < var11; var51++) {
                        int var52;
                        if (class23.field399.field5325 != -1) {
                            var52 = class23.field399.field5325;
                        } else if ((var13 + arg7 & 0x4) == (arg4 + var51 & 0x4)) {
                            var52 = class322.field5630[class202.field3270 + 1];
                        } else {
                            var52 = 4936552;
                        }
                        if (var52 == 0) {
                            var52 = 1;
                        }
                        int var53 = (arg0 + (arg2 * var51) >> 16) + arg3;
                        int var54 = ((var51 + 1) * arg2 + arg0 >> 16) + arg3;
                        int var55 = var54 - var53;
                        class96.method635(var50, var53, var16, var55, var52);
                    }
                }
            }
        }
        if (arg6 != -89) {
            field735 = (class152) null;
        }
        for (int var56 = -2; var56 < (var12 + 2); var56++) {
            int var57 = arg8 + (arg10 * var56) >> 16;
            int var58 = (var56 + 1) * arg10 + arg8 >> 16;
            int var59 = var58 - var57;
            if (var59 > 0) {
                var10000 = arg9 + var58;
                int var61 = arg7 + var56 >> 6;
                int var62 = arg9 + var57;
                if (var61 >= 0 && (class317.field5497.length - 1) >= var61) {
                    int[][] var63 = class317.field5497[var61];
                    for (int var64 = -2; var64 < var11 + 2; var64++) {
                        int var65 = arg2 * var64 + arg0 >> 16;
                        int var66 = arg0 + ((var64 + 1) * arg2) >> 16;
                        int var67 = var66 - var65;
                        if (var67 > 0) {
                            int var68 = arg3 + var65;
                            var10000 = arg3 + var66;
                            int var70 = arg4 + var64 >> 6;
                            if (var70 >= 0 && var70 <= var63.length - 1) {
                                int var71 = (var64 + arg4 & 0x3F << 6) + (arg7 + var56 & 0x3F);
                                if (var63[var70] != null) {
                                    int var72 = var63[var70][var71];
                                    int var73 = var72 & 0x3FFF;
                                    if (var73 != 0) {
                                        class169 var74 = class216.method1450(var73 - 1, 34);
                                        int var75 = (var72 & 0xCA5F) >> 14;
                                        class300 var76 = var74.method1110(30, var75);
                                        if (var76 != null) {
                                            int var77 = var76.field3736 * var67 / 4;
                                            int var78 = var76.field3746 * var59 / 4;
                                            if (var74.field2655) {
                                                int var79 = var72 >> 20 & 0xF;
                                                int var80 = var72 >> 16 & 0xF;
                                                if ((var75 & 0x1) == 1) {
                                                    int var81 = var80;
                                                    var80 = var79;
                                                    var79 = var81;
                                                }
                                                var78 = var59 * var80;
                                                var77 = var67 * var79;
                                            }
                                            if (var78 != 0 && var77 != 0) {
                                                if (var74.field2647 == 0) {
                                                    var76.method2100(var62, var68 + var67 - var77, var78, var77);
                                                } else {
                                                    var76.method2101(var62, var68 + var67 - var77, var78, var77, var74.field2647);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Le;II)V", line = 422)
    public static final void method315(class159 arg0, int arg1, int arg2) {
        if (arg1 <= 80) {
            field735 = (class152) null;
        }
        field731++;
        while (true) {
            class233 var3 = (class233) class8.field104.method1221((byte) 124);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field3824; var5++) {
                if (var3.field3825[var5] != null) {
                    if (var3.field3825[var5].field2980 == 2) {
                        var3.field3819[var5] = -5;
                    }
                    if (var3.field3825[var5].field2980 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field3822[var5] != null) {
                    if (var3.field3822[var5].field2980 == 2) {
                        var3.field3819[var5] = -6;
                    }
                    if (var3.field3822[var5].field2980 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method1065(arg2, 15);
            arg0.method1980(false, 0);
            int var6 = arg0.field4946;
            arg0.method1967(var3.field3828, -1303690792);
            for (int var7 = 0; var7 < var3.field3824; var7++) {
                if (var3.field3819[var7] == 0) {
                    try {
                        int var8 = var3.field3820[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field3825[var7].field2977;
                            int var13 = var12.getInt((Object) null);
                            arg0.method1980(false, 0);
                            arg0.method1967(var13, -1303690792);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field3825[var7].field2977;
                            var11.setInt((Object) null, var3.field3821[var7]);
                            arg0.method1980(false, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field3825[var7].field2977;
                            int var10 = var9.getModifiers();
                            arg0.method1980(false, 0);
                            arg0.method1967(var10, -1303690792);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field3822[var7].field2977;
                            byte[][] var17 = var3.field3823[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg0.method1980(false, 0);
                            } else if (var21 instanceof Number) {
                                arg0.method1980(false, 1);
                                arg0.method1988(((Number) var21).longValue(), 104);
                            } else if (var21 instanceof class152) {
                                arg0.method1980(false, 2);
                                arg0.method2015(-21389, (class152) var21);
                            } else {
                                arg0.method1980(false, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field3822[var7].field2977;
                            int var15 = var14.getModifiers();
                            arg0.method1980(false, 0);
                            arg0.method1967(var15, -1303690792);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg0.method1980(false, -10);
                    } catch (InvalidClassException var35) {
                        arg0.method1980(false, -11);
                    } catch (StreamCorruptedException var36) {
                        arg0.method1980(false, -12);
                    } catch (OptionalDataException var37) {
                        arg0.method1980(false, -13);
                    } catch (IllegalAccessException var38) {
                        arg0.method1980(false, -14);
                    } catch (IllegalArgumentException var39) {
                        arg0.method1980(false, -15);
                    } catch (InvocationTargetException var40) {
                        arg0.method1980(false, -16);
                    } catch (SecurityException var41) {
                        arg0.method1980(false, -17);
                    } catch (IOException var42) {
                        arg0.method1980(false, -18);
                    } catch (NullPointerException var43) {
                        arg0.method1980(false, -19);
                    } catch (Exception var44) {
                        arg0.method1980(false, -20);
                    } catch (Throwable var45) {
                        arg0.method1980(false, -21);
                    }
                } else {
                    arg0.method1980(false, var3.field3819[var7]);
                }
            }
            arg0.method1982(-6004, var6);
            arg0.method2005(arg0.field4946 - var6, (byte) 119);
            var3.method1880(-25368);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZJ)V", line = 615)
    public static final void method316(boolean arg0, long arg1) {
        field732++;
        if (arg1 == 0L) {
            return;
        }
        if (class299.field5190 >= 100) {
            class245.method1687(class201.field3252, 0, class272.field4675, -1);
            return;
        }
        class152 var3 = class160.method1077(92, arg1).method1022(-117);
        for (int var4 = 0; var4 < class299.field5190; var4++) {
            if (class11.field133[var4] == arg1) {
                class245.method1687(class201.field3252, 0, class195.method1307(new class152[] { var3, class249.field4204 }, (byte) 29), -1);
                return;
            }
        }
        for (int var5 = 0; var5 < class199.field3206; var5++) {
            if (class317.field5504[var5] == arg1) {
                class245.method1687(class201.field3252, 0, class195.method1307(new class152[] { class106.field1513, var3, class22.field370 }, (byte) 29), -1);
                return;
            }
        }
        if (!arg0) {
            field735 = (class152) null;
        }
        if (var3.method992(23292, class85.field1176.field146)) {
            class245.method1687(class201.field3252, 0, class295.field5041, -1);
            return;
        }
        class237.field3894++;
        class11.field133[class299.field5190] = arg1;
        class123.field1733[class299.field5190++] = class160.method1077(50, arg1);
        class276.field4730 = class86.field1212;
        class245.field4102.method1065(23, -95);
        class245.field4102.method1988(arg1, 85);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IILah;ILah;)Lrd;", line = 680)
    public static final class171 method317(int arg0, int arg1, class205 arg2, int arg3, class205 arg4) {
        field736++;
        if (class86.method566(arg0, arg4, arg1, 1)) {
            return arg3 == -1 ? class16.method100((byte) -7, arg2.method1381(arg0, arg1, 0)) : (class171) null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILah;)V", line = 694)
    public static final void method318(int arg0, class205 arg1) {
        if (arg0 != -4274) {
            field737 = true;
        }
        class94.field1347 = arg1;
        class157.field2514 = class94.field1347.method1375(16, arg0 + 4274);
        field734++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Z)V", line = 710)
    public static final void method319(boolean arg0) {
        int var1 = class267.field4503;
        field733++;
        int var2 = class128.field1957;
        int var3 = class17.field232;
        int var4 = class258.field4429;
        if (class284.field4824 == null || class120.field1702 == null) {
            if (class224.field3650.method1361(-1, class51.field795) && class224.field3650.method1361(-1, class227.field3705)) {
                class284.field4824 = class216.method1448(class224.field3650, (byte) -128, class51.field795, 0);
                class120.field1702 = class216.method1448(class224.field3650, (byte) -128, class227.field3705, 0);
                if (class217.field3516) {
                    if (class284.field4824 instanceof class78) {
                        class284.field4824 = new class178((class109) class284.field4824);
                    } else {
                        class284.field4824 = new class68((class109) class284.field4824);
                    }
                    if ((class120.field1702 instanceof class78)) {
                        class120.field1702 = new class178((class109) class120.field1702);
                    } else {
                        class120.field1702 = new class68((class109) class120.field1702);
                    }
                }
            } else if (class217.field3516) {
                class13.method74(var1, var2, var3, 20, class8.field109, 256 - class169.field2641);
            } else {
                class96.method644(var1, var2, var3, 20, class8.field109, 256 - class169.field2641);
            }
        }
        if (class284.field4824 != null && class120.field1702 != null) {
            int var5 = var3 / class284.field4824.field3281;
            for (int var6 = 0; var6 < var5; var6++) {
                class284.field4824.method429(class284.field4824.field3281 * var6 + var1, var2);
            }
            class120.field1702.method429(var1, var2);
            class120.field1702.method436(var1 + var3 - class120.field1702.field3281, var2);
        }
        class316.field5485.method1133(class48.field741, var1 + 3, var2 - -14, class128.field1964, -1);
        if (class217.field3516) {
            class13.method74(var1, var2 + 20, var3, var4 - 20, class8.field109, 256 - class169.field2641);
        } else {
            class96.method644(var1, var2 + 20, var3, var4 - 20, class8.field109, 256 - class169.field2641);
        }
        int var7 = class254.field4397;
        int var8 = class278.field4763;
        for (int var9 = 0; var9 < class160.field2556; var9++) {
            int var10 = (class160.field2556 - var9 - 1) * 15 + var2 + 35;
            if (var8 > var1 && var1 + var3 > var8 && var7 > var10 - 13 && var10 + 3 > var7) {
                if (class217.field3516) {
                    class13.method74(var1, var10 - 13, var3, 16, class282.field4810, 256 - class272.field4676);
                } else {
                    class96.method644(var1, var10 - 13, var3, 16, class282.field4810, 256 - class272.field4676);
                }
            }
        }
        if ((class124.field1742 == null || class133.field2043 == null || class253.field4382 == null) && class224.field3650.method1361(-1, class10.field126) && class224.field3650.method1361(-1, class42.field678) && class224.field3650.method1361(-1, class50.field782)) {
            class124.field1742 = class216.method1448(class224.field3650, (byte) -128, class10.field126, 0);
            class133.field2043 = class216.method1448(class224.field3650, (byte) -128, class42.field678, 0);
            class253.field4382 = class216.method1448(class224.field3650, (byte) -128, class50.field782, 0);
            if (class217.field3516) {
                if ((class124.field1742 instanceof class78)) {
                    class124.field1742 = new class178((class109) class124.field1742);
                } else {
                    class124.field1742 = new class68((class109) class124.field1742);
                }
                if ((class133.field2043 instanceof class78)) {
                    class133.field2043 = new class178((class109) class133.field2043);
                } else {
                    class133.field2043 = new class68((class109) class133.field2043);
                }
                if ((class253.field4382 instanceof class78)) {
                    class253.field4382 = new class178((class109) class253.field4382);
                } else {
                    class253.field4382 = new class68((class109) class253.field4382);
                }
            }
        }
        if (class124.field1742 != null && class133.field2043 != null && class253.field4382 != null) {
            int var11 = var3 / class124.field1742.field3281;
            for (int var12 = 0; var12 < var11; var12++) {
                class124.field1742.method429(class124.field1742.field3281 * var12 + var1, var2 + var4 - class124.field1742.field3284);
            }
            int var13 = (var4 - 20) / class133.field2043.field3284;
            for (int var14 = 0; var14 < var13; var14++) {
                class133.field2043.method429(var1, class133.field2043.field3284 * var14 + (var2 + 20));
                class133.field2043.method436(var1 - (class133.field2043.field3281 - var3), class133.field2043.field3284 * var14 + var2 + 20);
            }
            class253.field4382.method429(var1, var4 + var2 - class253.field4382.field3284);
            class253.field4382.method436(var1 + var3 - class253.field4382.field3281, var2 - -var4 + -class253.field4382.field3284);
        }
        if (arg0) {
            method318(65, (class205) null);
        }
        for (int var15 = 0; var15 < class160.field2556; var15++) {
            int var16 = (class160.field2556 - var15 - 1) * 15 + var2 + 35;
            int var17 = class128.field1964;
            if (var8 > var1 && var1 + var3 > var8 && var7 > var16 - 13 && var16 + 3 > var7) {
                var17 = class26.field440;
            }
            class316.field5485.method1133(class6.method27(var15, -95), var1 + 3, var16, var17, 0);
        }
        class48.method336(class128.field1957, 65, class17.field232, class258.field4429, class267.field4503);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V", line = 880)
    public static final void method320(byte arg0) {
        field728++;
        class37.field607.method1613(-22696);
        class211.field3425.method1613(-22696);
        if (arg0 <= 12) {
            field737 = false;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(B)V", line = 919)
    public static void method321(byte arg0) {
        field735 = null;
        int var1 = -38 % ((-arg0 - 44) / 55);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)V", line = 929)
    public static final void method322(int arg0, int arg1) {
        class306.field5254.method1617(arg1, 50);
        class176.field2833.method1617(arg1, 50);
        if (arg0 > -72) {
            field735 = (class152) null;
        }
        field729++;
    }
}
