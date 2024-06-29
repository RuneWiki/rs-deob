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

@OriginalClass("client!pc")
public class class101 {

    @OriginalMember(owner = "client!pc", name = "G", descriptor = "I")
    private int field2343 = 0;

    @OriginalMember(owner = "client!pc", name = "y", descriptor = "I")
    private int field2335;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "[Lje;")
    private class67[] field2324;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Lrd;")
    public static class114 field2315 = class84.method656(" )2>", (byte) 117);

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Lrd;")
    public static class114 field2316 = class84.method656("Fps:", (byte) 119);

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "Lrd;")
    private static class114 field2319 = class84.method656("No response from server)3", (byte) 117);

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Lrd;")
    public static class114 field2312 = field2319;

    @OriginalMember(owner = "client!pc", name = "B", descriptor = "Lrd;")
    public static class114 field2338 = class84.method656("Zu viele Anmelde)2Versuche von Ihrer Adresse", (byte) 127);

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lrd;")
    public static class114 field2323 = class84.method656(":", (byte) 122);

    @OriginalMember(owner = "client!pc", name = "C", descriptor = "[Z")
    public static boolean[] field2339 = new boolean[112];

    @OriginalMember(owner = "client!pc", name = "E", descriptor = "Lrd;")
    public static class114 field2341 = class84.method656("Benutzen", (byte) 118);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    public static int field2326;

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "I")
    public static int field2327;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "I")
    public static int field2328;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!pc", name = "v", descriptor = "I")
    public static int field2332;

    @OriginalMember(owner = "client!pc", name = "w", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!pc", name = "z", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!pc", name = "A", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!pc", name = "D", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!pc", name = "F", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!pc", name = "u", descriptor = "J")
    private long field2331;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Lua;")
    public static class129 field2325;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Lje;")
    private class67 field2322;

    @OriginalMember(owner = "client!pc", name = "H", descriptor = "Lje;")
    private class67 field2344;

    @OriginalMember(owner = "client!pc", name = "x", descriptor = "Loa;")
    public static class93 field2334;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)Lje;")
    public final class67 method776(byte arg0) {
        this.field2343 = 0;
        if (arg0 == 104) {
            field2330++;
            return this.method782(-1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILuc;I)V")
    public static final void method777(int arg0, class131 arg1, int arg2) {
        if (arg2 != 2) {
            method777(-95, null, 10);
        }
        field2333++;
        while (true) {
            class120 var3 = (class120) class61.field1292.method654((byte) 21);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2793; var5++) {
                if (var3.field2807[var5] != null) {
                    if (var3.field2807[var5].field1826 == 2) {
                        var3.field2809[var5] = -5;
                    }
                    if (var3.field2807[var5].field1826 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2797[var5] != null) {
                    if (var3.field2797[var5].field1826 == 2) {
                        var3.field2809[var5] = -6;
                    }
                    if (var3.field2797[var5].field1826 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method1054(8, arg0);
            arg1.method478((byte) -24, 0);
            int var6 = arg1.field1227;
            arg1.method476(-7155, var3.field2787);
            for (int var7 = 0; var7 < var3.field2793; var7++) {
                if (var3.field2809[var7] == 0) {
                    try {
                        int var8 = var3.field2805[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field2807[var7].field1823;
                            int var10 = var9.getInt(null);
                            arg1.method478((byte) 114, 0);
                            arg1.method476(-7155, var10);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field2807[var7].field1823;
                            var13.setInt(null, var3.field2801[var7]);
                            arg1.method478((byte) -77, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field2807[var7].field1823;
                            int var12 = var11.getModifiers();
                            arg1.method478((byte) -51, 0);
                            arg1.method476(-7155, var12);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2797[var7].field1823;
                            byte[][] var17 = var3.field2812[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke(null, var18);
                            if (var21 == null) {
                                arg1.method478((byte) 113, 0);
                            } else if (var21 instanceof Number) {
                                arg1.method478((byte) 125, 1);
                                arg1.method455(((Number) var21).longValue(), 2);
                            } else if (var21 instanceof class114) {
                                arg1.method478((byte) 93, 2);
                                arg1.method452(-6595, (class114) var21);
                            } else {
                                arg1.method478((byte) 106, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2797[var7].field1823;
                            int var15 = var14.getModifiers();
                            arg1.method478((byte) 88, 0);
                            arg1.method476(-7155, var15);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method478((byte) 112, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method478((byte) 110, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method478((byte) -29, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method478((byte) 89, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method478((byte) 115, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method478((byte) -116, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method478((byte) 124, -16);
                    } catch (SecurityException var29) {
                        arg1.method478((byte) 109, -17);
                    } catch (IOException var30) {
                        arg1.method478((byte) 103, -18);
                    } catch (NullPointerException var31) {
                        arg1.method478((byte) -120, -19);
                    } catch (Exception var32) {
                        arg1.method478((byte) -107, -20);
                    } catch (Throwable var33) {
                        arg1.method478((byte) 95, -21);
                    }
                } else {
                    arg1.method478((byte) 104, var3.field2809[var7]);
                }
            }
            arg1.method495((byte) -122, var6);
            arg1.method491(-1, arg1.field1227 - var6);
            var3.method540(arg2 ^ 0xFFFF97D1);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILf;)V")
    public static final void method778(int arg0, class36 arg1) {
        field2332++;
        if (class20.field370 == arg1.field707 || arg1.field750 == -1 || arg1.field705 != 0 || arg1.field755 + 1 > class12.method97(arg1.field750, false).field605[arg1.field692]) {
            int var2 = arg1.field707 - arg1.field745;
            int var3 = arg1.field735 * 64 + arg1.field703 * 128;
            int var4 = arg1.field735 * 64 + arg1.field734 * 128;
            int var5 = arg1.field735 * 64 + arg1.field691 * 128;
            int var6 = class20.field370 - arg1.field745;
            arg1.field756 = ((var2 - var6) * var3 + var5 * var6) / var2;
            int var7 = arg1.field735 * 64 + arg1.field724 * 128;
            arg1.field712 = ((var2 - var6) * var7 + var4 * var6) / var2;
        }
        if (arg1.field728 == 0) {
            arg1.field725 = 1024;
        }
        arg1.field708 = 0;
        if (arg1.field728 == 1) {
            arg1.field725 = 1536;
        }
        if (arg1.field728 == 2) {
            arg1.field725 = 0;
        }
        if (arg1.field728 == 3) {
            arg1.field725 = 512;
        }
        arg1.field700 = arg1.field725;
        if (arg0 != 3031) {
            field2341 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)V")
    public static void method779(byte arg0) {
        if (arg0 <= 125) {
            return;
        }
        field2334 = null;
        field2319 = null;
        field2316 = null;
        field2325 = null;
        field2323 = null;
        field2339 = null;
        field2338 = null;
        field2341 = null;
        field2315 = null;
        field2312 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([Lnd;IIIIIBIII)Z")
    public static final boolean method780(class90[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, int arg9) {
        field2342++;
        class59.method428(arg8, arg5, arg7, arg2);
        boolean var10 = true;
        if (arg6 != 71) {
            method778(-65, null);
        }
        for (int var11 = 0; var11 < arg0.length; var11++) {
            class90 var12 = arg0[var11];
            if (var12 != null && (var12.field2103 == arg3 || arg3 == -1412584499 && class13.field285 == var12)) {
                if (var12.field2049 > 0) {
                    class69.method551(var12, arg6 ^ 0xFFFF8BDD);
                }
                int var13 = var12.field2038 + arg5 - arg9;
                int var14 = var12.field2015 + arg8 - arg1;
                int var15 = var12.field2073;
                if (class13.field285 == var12) {
                    if (arg3 != -1412584499 && !var12.field2048) {
                        class72.field1620 = arg1;
                        class14.field311 = arg0;
                        class8.field111 = arg9;
                        continue;
                    }
                    class90 var16 = class122.method951(var12, 104);
                    if (var16 == null) {
                        class13.field285 = null;
                    } else {
                        int[] var17 = class100.method769(var16, 18168);
                        int[] var18 = class100.method769(var12, 18168);
                        int var19 = class75.field1741 - class75.field1743;
                        if (!var12.field2048) {
                            var15 = 128;
                        }
                        int var20 = class100.field2289 - class63.field1343;
                        if (var20 <= var12.field2080 && -var12.field2080 <= var20 && var19 <= var12.field2080 && var19 >= -var12.field2080 && !class16.field321) {
                            var19 = 0;
                            var20 = 0;
                        } else if (class130.field3141 > var12.field2045 || class16.field321) {
                            class16.field321 = true;
                        } else {
                            var19 = 0;
                            var20 = 0;
                        }
                        int var21 = var18[1] + var19 - var17[1];
                        int var22 = var18[0] + var20 - var17[0];
                        if (var22 < 0) {
                            var22 = 0;
                        }
                        if (var12.field2032 + var22 > var16.field2032) {
                            var22 = var16.field2032 - var12.field2032;
                        }
                        if (var21 < 0) {
                            var21 = 0;
                        }
                        if (var12.field2044 + var21 > var16.field2044) {
                            var21 = var16.field2044 - var12.field2044;
                        }
                        var13 = var17[1] + var21;
                        var14 = var17[0] + var22;
                    }
                }
                if ((!var12.field2011 || var14 <= class59.field1212 && var13 <= class59.field1216 && var12.field2032 + var14 >= class59.field1213 && var12.field2044 + var13 >= class59.field1214) && (!var12.field2011 || !class121.method947(var12, true))) {
                    if (var12.field2024 == 0) {
                        if (!var12.field2011 && class121.method947(var12, true) && !class121.method942(arg4, var11, arg6 ^ 0xFFFFFFBB)) {
                            continue;
                        }
                        if (!var12.field2011) {
                            if (var12.field2013 > var12.field2017 - var12.field2044) {
                                var12.field2013 = var12.field2017 - var12.field2044;
                            }
                            if (var12.field2013 < 0) {
                                var12.field2013 = 0;
                            }
                        }
                        var10 &= method780(arg0, var12.field2043, var12.field2044 + var13, var12.field2060, arg4, var13, (byte) 71, var12.field2032 + var14, var14, var12.field2013);
                        if (var12.field2031 != null) {
                            var10 &= method780(var12.field2031, var12.field2043, var12.field2044 + var13, var12.field2060, arg4, var13, (byte) 71, var12.field2032 + var14, var14, var12.field2013);
                        }
                        class59.method428(arg8, arg5, arg7, arg2);
                        if (var12.field2044 < var12.field2017 && !var12.field2011) {
                            class132.method1059(var12.field2013, var14 + var12.field2032, var12.field2017, var12.field2044, (byte) 95, var13);
                        }
                    }
                    if (var12.field2024 != 1) {
                        if (var12.field2024 == 2) {
                            int var23 = 0;
                            for (int var24 = 0; var24 < var12.field2044; var24++) {
                                for (int var25 = 0; var25 < var12.field2032; var25++) {
                                    int var26 = var14 + (var12.field2012 + 32) * var25;
                                    int var27 = (var12.field2104 + 32) * var24 + var13;
                                    if (var23 < 20) {
                                        var27 += var12.field2090[var23];
                                        var26 += var12.field2028[var23];
                                    }
                                    if (var12.field2019[var23] > 0) {
                                        boolean var28 = false;
                                        boolean var29 = false;
                                        int var30 = var12.field2019[var23] - 1;
                                        if (class59.field1213 - 32 < var26 && var26 < class59.field1212 && class59.field1214 - 32 < var27 && class59.field1216 > var27 || class14.field312 != 0 && class1.field13 == var23) {
                                            class54 var31;
                                            if (class145.field3452 == 1 && class52.field1087 == var23 && class80.field1818 == var12.field2060) {
                                                var31 = class64.method521(var30, var12.field2082[var23], 2, 2, 0, false);
                                            } else {
                                                var31 = class64.method521(var30, var12.field2082[var23], 1, 2, 3153952, false);
                                            }
                                            if (var31 == null) {
                                                var10 = false;
                                            } else if (class14.field312 != 0 && class1.field13 == var23 && class74.field1702 == var12.field2060) {
                                                int var32 = class75.field1741 - class50.field1051;
                                                int var33 = class100.field2289 - class14.field307;
                                                if (var32 < 5 && var32 > -5) {
                                                    var32 = 0;
                                                }
                                                if (var33 < 5 && var33 > -5) {
                                                    var33 = 0;
                                                }
                                                if (class86.field1942 < 5) {
                                                    var32 = 0;
                                                    var33 = 0;
                                                }
                                                var31.method401(var26 + var33, var27 + var32, 128);
                                                if (arg3 != -1) {
                                                    class90 var34 = arg0[arg3 & 0xFFFF];
                                                    if (class59.field1214 > var27 + var32 && var34.field2013 > 0) {
                                                        int var35 = (class59.field1214 - var27 - var32) * class135.field3289 / 3;
                                                        if (var35 > class135.field3289 * 10) {
                                                            var35 = class135.field3289 * 10;
                                                        }
                                                        if (var35 > var34.field2013) {
                                                            var35 = var34.field2013;
                                                        }
                                                        var34.field2013 -= var35;
                                                        class50.field1051 += var35;
                                                    }
                                                    if (class59.field1216 < var27 + var32 + 32 && var34.field2017 - var34.field2044 > var34.field2013) {
                                                        int var36 = (var27 + var32 + 32 - class59.field1216) * class135.field3289 / 3;
                                                        if (class135.field3289 * 10 < var36) {
                                                            var36 = class135.field3289 * 10;
                                                        }
                                                        if (var34.field2017 - var34.field2044 - var34.field2013 < var36) {
                                                            var36 = var34.field2017 - var34.field2044 - var34.field2013;
                                                        }
                                                        class50.field1051 -= var36;
                                                        var34.field2013 += var36;
                                                    }
                                                }
                                            } else if (class141.field3374 != 0 && class63.field1347 == var23 && class123.field2895 == var12.field2060) {
                                                var31.method401(var26, var27, 128);
                                            } else {
                                                var31.method400(var26, var27);
                                            }
                                        }
                                    } else if (var12.field2108 != null && var23 < 20) {
                                        class54 var37 = var12.method690(var23, 0);
                                        if (var37 != null) {
                                            var37.method400(var26, var27);
                                        } else if (class89.field2003) {
                                            var10 = false;
                                        }
                                    }
                                    var23++;
                                }
                            }
                        } else if (var12.field2024 == 3) {
                            int var38;
                            if (class98.method740(arg6 ^ 0xFFFFFFC5, var12)) {
                                var38 = var12.field2105;
                                if (class121.method942(arg4, var11, -4) && var12.field2085 != 0) {
                                    var38 = var12.field2085;
                                }
                            } else {
                                var38 = var12.field2004;
                                if (class121.method942(arg4, var11, -4) && var12.field2052 != 0) {
                                    var38 = var12.field2052;
                                }
                            }
                            if (var15 == 0) {
                                if (var12.field2112) {
                                    class59.method434(var14, var13, var12.field2032, var12.field2044, var38);
                                } else {
                                    class59.method427(var14, var13, var12.field2032, var12.field2044, var38);
                                }
                            } else if (var12.field2112) {
                                class59.method430(var14, var13, var12.field2032, var12.field2044, var38, 256 - (var15 & 0xFF));
                            } else {
                                class59.method433(var14, var13, var12.field2032, var12.field2044, var38, 256 - (var15 & 0xFF));
                            }
                        } else if (var12.field2024 == 4) {
                            class45 var39 = var12.method683((byte) 118);
                            if (var39 != null) {
                                class114 var40 = var12.field2025;
                                int var41;
                                if (class98.method740(-127, var12)) {
                                    var41 = var12.field2105;
                                    if (class121.method942(arg4, var11, -4) && var12.field2085 != 0) {
                                        var41 = var12.field2085;
                                    }
                                    if (var12.field2094.method854(-29348) > 0) {
                                        var40 = var12.field2094;
                                    }
                                } else {
                                    var41 = var12.field2004;
                                    if (class121.method942(arg4, var11, arg6 ^ 0xFFFFFFBB) && var12.field2052 != 0) {
                                        var41 = var12.field2052;
                                    }
                                }
                                if (var12.field2011 && var12.field2099 != -1) {
                                    class52 var42 = class128.method988(var12.field2099, false);
                                    var40 = var42.field1111;
                                    if (var40 == null) {
                                        var40 = class145.field3455;
                                    }
                                    if ((var42.field1074 == 1 || var12.field2063 != 1) && var12.field2063 != -1) {
                                        var40 = method786((byte) 126, new class114[] { var40, class118.field2762, class62.method506(var12.field2063, 3056) });
                                    }
                                }
                                if (class20.field357 == var12.field2060 && class86.field1940 == var12.field2107) {
                                    var41 = var12.field2004;
                                    var40 = class67.field1452;
                                }
                                if (class59.field1218 == 479) {
                                    if (var41 == 16776960) {
                                        var41 = 255;
                                    }
                                    if (var41 == 49152) {
                                        var41 = 16777215;
                                    }
                                }
                                class114 var43 = class144.method1146(var40, arg6 ^ 0xFFFFFFB8, var12);
                                var39.method330(var43, var14, var13, var12.field2032, var12.field2044, var41, var12.field2101, var12.field2100, var12.field2074, var12.field2006);
                            } else if (class89.field2003) {
                                var10 = false;
                            }
                        } else if (var12.field2024 == 5) {
                            if (var12.field2011) {
                                class54 var44;
                                if (var12.field2099 == -1) {
                                    var44 = var12.method691(117, false);
                                } else {
                                    var44 = class64.method521(var12.field2099, var12.field2063, var12.field2102, 2, var12.field2126, false);
                                }
                                if (var44 != null) {
                                    int var45 = var44.field1132;
                                    int var46 = var44.field1131;
                                    if (var12.field2034) {
                                        int var47 = var14;
                                        int[] var48 = new int[4];
                                        class59.method439(var48);
                                        if (var14 < var48[0]) {
                                            var47 = var48[0];
                                        }
                                        int var49 = var13;
                                        if (var13 < var48[1]) {
                                            var49 = var48[1];
                                        }
                                        int var50 = var12.field2032 + var14;
                                        if (var50 > var48[2]) {
                                            var50 = var48[2];
                                        }
                                        int var51 = var12.field2044 + var13;
                                        if (var51 > var48[3]) {
                                            var51 = var48[3];
                                        }
                                        class59.method428(var47, var49, var50, var51);
                                        int var52 = (var12.field2044 + var46 - 1) / var46;
                                        int var53 = (var45 + var12.field2032 - 1) / var45;
                                        for (int var54 = 0; var54 < var53; var54++) {
                                            for (int var55 = 0; var55 < var52; var55++) {
                                                if (var12.field2110 != 0) {
                                                    var44.method383(var45 / 2 + var45 * var54 + var14, var46 * var55 + var46 / 2 + var13, var12.field2110, 4096);
                                                } else if (var15 == 0) {
                                                    var44.method400(var45 * var54 + var14, var46 * var55 + var13);
                                                } else {
                                                    var44.method401(var14 + var45 * var54, var46 * var55 + var13, 256 - (var15 & 0xFF));
                                                }
                                            }
                                        }
                                        class59.method429(var48);
                                    } else {
                                        int var56 = var12.field2032 * 4096 / var45;
                                        if (var12.field2110 != 0) {
                                            var44.method383(var12.field2032 / 2 + var14, var13 - -(var12.field2044 / 2), var12.field2110, var56);
                                        } else if (var15 != 0) {
                                            var44.method385(var14, var13, var12.field2032, var12.field2044, 256 - (var15 & 0xFF));
                                        } else if (var12.field2032 == var45 && var12.field2044 == var46) {
                                            var44.method400(var14, var13);
                                        } else {
                                            var44.method394(var14, var13, var12.field2032, var12.field2044);
                                        }
                                    }
                                } else if (class89.field2003) {
                                    var10 = false;
                                }
                            } else {
                                class54 var57 = var12.method691(116, class98.method740(-118, var12));
                                if (var57 != null) {
                                    var57.method400(var14, var13);
                                } else if (class89.field2003) {
                                    var10 = false;
                                }
                            }
                        } else if (var12.field2024 == 6) {
                            boolean var58 = class98.method740(-124, var12);
                            int var59;
                            if (var58) {
                                var59 = var12.field2050;
                            } else {
                                var59 = var12.field2022;
                            }
                            class133 var60 = null;
                            int var61 = 0;
                            if (var12.field2099 != -1) {
                                class52 var63 = class128.method988(var12.field2099, false);
                                if (var63 != null) {
                                    class52 var64 = var63.method369(var12.field2063, (byte) 35);
                                    var60 = var64.method375(1, -93);
                                    if (var60 == null) {
                                        var10 = false;
                                    } else {
                                        var60.method1071();
                                        var61 = var60.field1052 / 2;
                                    }
                                }
                            } else if (var12.field2123 == 5) {
                                if (var12.field2067 == 0) {
                                    var60 = class116.field2708.method717(-1, null, 0, -1, null);
                                } else {
                                    var60 = class7.field103.method67((byte) -64);
                                }
                            } else if (var59 == -1) {
                                var60 = var12.method685(class7.field103.field2995, var58, -1, null, (byte) -17);
                                if (var60 == null && class89.field2003) {
                                    var10 = false;
                                }
                            } else {
                                class29 var62 = class12.method97(var59, false);
                                var60 = var12.method685(class7.field103.field2995, var58, var12.field2042, var62, (byte) -17);
                                if (var60 == null && class89.field2003) {
                                    var10 = false;
                                }
                            }
                            class134.method1092(var14 + var12.field2032 / 2, var12.field2044 / 2 + var13);
                            int var65 = class134.field3272[var12.field2117] * var12.field2008 >> 16;
                            int var66 = class134.field3279[var12.field2117] * var12.field2008 >> 16;
                            if (var60 != null) {
                                if (var12.field2011) {
                                    var60.method1071();
                                    if (var12.field2047) {
                                        var60.method1080(0, var12.field2127, var12.field2023, var12.field2117, var12.field2113, var65 + var61 + var12.field2057, var66 - -var12.field2057, var12.field2008);
                                    } else {
                                        var60.method1084(0, var12.field2127, var12.field2023, var12.field2117, var12.field2113, var65 + var61 + var12.field2057, var66 - -var12.field2057);
                                    }
                                } else {
                                    var60.method1084(0, var12.field2127, 0, var12.field2117, 0, var65, var66);
                                }
                            }
                            class134.method1093();
                        } else {
                            if (var12.field2024 == 7) {
                                class45 var67 = var12.method683((byte) 116);
                                if (var67 == null) {
                                    if (class89.field2003) {
                                        var10 = false;
                                    }
                                    continue;
                                }
                                int var68 = 0;
                                for (int var69 = 0; var69 < var12.field2044; var69++) {
                                    for (int var70 = 0; var70 < var12.field2032; var70++) {
                                        if (var12.field2019[var68] > 0) {
                                            class52 var71 = class128.method988(var12.field2019[var68] - 1, false);
                                            class114 var72 = var71.field1111;
                                            if (var72 == null) {
                                                var72 = class145.field3455;
                                            }
                                            if (var71.field1074 == 1 || var12.field2082[var68] != 1) {
                                                var72 = method786((byte) 127, new class114[] { var72, class118.field2762, class62.method506(var12.field2082[var68], 3056) });
                                            }
                                            int var73 = (var12.field2012 + 115) * var70 + var14;
                                            int var74 = (var12.field2104 + 12) * var69 + var13;
                                            if (var12.field2100 == 0) {
                                                var67.method338(var72, var73, var74, var12.field2004, var12.field2101);
                                            } else if (var12.field2100 == 1) {
                                                var67.method335(var72, var12.field2032 / 2 + var73, var74, var12.field2004, var12.field2101);
                                            } else {
                                                var67.method320(var72, var73 + var12.field2032 - 1, var74, var12.field2004, var12.field2101);
                                            }
                                        }
                                        var68++;
                                    }
                                }
                            }
                            if (var12.field2024 == 8 && class46.method340(var11, arg4, (byte) -125) && class31.field629 == class117.field2730) {
                                int var75 = 0;
                                class45 var76 = class5.field54;
                                class114 var77 = var12.field2025;
                                class114 var78 = class144.method1146(var77, -1, var12);
                                int var79 = 0;
                                while (var78.method854(-29348) > 0) {
                                    int var87 = var78.method858((byte) 126, class66.field1434);
                                    class114 var88;
                                    if (var87 == -1) {
                                        var88 = var78;
                                        var78 = class72.field1610;
                                    } else {
                                        var88 = var78.method860(var87, arg6 - 23816, 0);
                                        var78 = var78.method866(false, var87 + 2);
                                    }
                                    int var89 = var76.method325(var88);
                                    var79 += var76.field937 + 1;
                                    if (var75 < var89) {
                                        var75 = var89;
                                    }
                                }
                                var75 += 6;
                                int var80 = var14 + var12.field2032 - var75 - 5;
                                int var81 = var12.field2044 + var13 + 5;
                                if (var14 + 5 > var80) {
                                    var80 = var14 + 5;
                                }
                                if (var75 + var80 > arg7) {
                                    var80 = arg7 - var75;
                                }
                                var79 += 7;
                                if (var79 + var81 > arg2) {
                                    var81 = arg2 - var79;
                                }
                                class59.method434(var80, var81, var75, var79, 16777120);
                                class59.method427(var80, var81, var75, var79, 0);
                                class114 var82 = var12.field2025;
                                int var83 = var81 + var76.field937 + 2;
                                class114 var84 = class144.method1146(var82, -1, var12);
                                while (var84.method854(-29348) > 0) {
                                    int var85 = var84.method858((byte) 32, class66.field1434);
                                    class114 var86;
                                    if (var85 == -1) {
                                        var86 = var84;
                                        var84 = class72.field1610;
                                    } else {
                                        var86 = var84.method860(var85, -23745, 0);
                                        var84 = var84.method866(false, var85 + 2);
                                    }
                                    var76.method338(var86, var80 + 3, var83, 0, false);
                                    var83 += var76.field937 + 1;
                                }
                            }
                            if (var12.field2024 == 9) {
                                if (var12.field2075 == 1) {
                                    class59.method431(var14, var13, var12.field2032 + var14, var13 - -var12.field2044, var12.field2004);
                                } else {
                                    int var90 = var12.field2032 >= 0 ? var12.field2032 : -var12.field2032;
                                    int var91 = var12.field2044 < 0 ? -var12.field2044 : var12.field2044;
                                    int var92 = var90;
                                    if (var91 > var90) {
                                        var92 = var91;
                                    }
                                    if (var92 != 0) {
                                        int var93 = (var12.field2032 << 16) / var92;
                                        int var94 = (var12.field2044 << 16) / var92;
                                        if (var94 <= var93) {
                                            var93 = -var93;
                                        } else {
                                            var94 = -var94;
                                        }
                                        int var95 = var12.field2075 * var94 >> 17;
                                        int var96 = var12.field2075 * var94 + 1 >> 17;
                                        int var97 = var12.field2075 * var93 >> 17;
                                        int var98 = var12.field2075 * var93 + 1 >> 17;
                                        int var99 = var14 + var12.field2032 - var96;
                                        int var100 = var14 + var95;
                                        int var101 = var14 - var96;
                                        int var102 = var14 + var12.field2032 + var95;
                                        int var103 = var13 + var97;
                                        int var104 = var13 - var98;
                                        int var105 = var12.field2044 + var13 - var98;
                                        int var106 = var12.field2044 + var13 + var97;
                                        class134.method1091(var100, var101, var99);
                                        class134.method1098(var103, var104, var105, var100, var101, var99, var12.field2004);
                                        class134.method1091(var100, var99, var102);
                                        class134.method1098(var103, var105, var106, var100, var99, var102, var12.field2004);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BJLje;)V")
    public final void method781(byte arg0, long arg1, class67 arg2) {
        if (arg0 != -7) {
            return;
        }
        field2340++;
        if (arg2.field1436 != null) {
            arg2.method540(arg0 - 26662);
        }
        class67 var5 = this.field2324[(int) ((long) (this.field2335 - 1) & arg1)];
        arg2.field1448 = arg1;
        arg2.field1436 = var5.field1436;
        arg2.field1441 = var5;
        arg2.field1436.field1441 = arg2;
        arg2.field1441.field1436 = arg2;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)Lje;")
    public final class67 method782(int arg0) {
        field2336++;
        if (this.field2343 > 0 && this.field2324[this.field2343 - 1] != this.field2344) {
            class67 var2 = this.field2344;
            this.field2344 = var2.field1441;
            return var2;
        }
        while (this.field2335 > this.field2343) {
            class67 var3 = this.field2324[this.field2343++].field1441;
            if (this.field2324[this.field2343 - 1] != var3) {
                this.field2344 = var3.field1441;
                return var3;
            }
        }
        return arg0 == -1 ? null : null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IJ)Lje;")
    public final class67 method783(int arg0, long arg1) {
        this.field2331 = arg1;
        class67 var4 = this.field2324[(int) ((long) (this.field2335 + arg0) & arg1)];
        field2327++;
        for (this.field2322 = var4.field1441; this.field2322 != var4; this.field2322 = this.field2322.field1441) {
            if (this.field2322.field1448 == arg1) {
                class67 var5 = this.field2322;
                this.field2322 = this.field2322.field1441;
                return var5;
            }
        }
        this.field2322 = null;
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)Lje;")
    public final class67 method784(int arg0) {
        field2313++;
        if (this.field2322 == null) {
            return null;
        }
        class67 var2 = this.field2324[(int) (this.field2331 & (long) (this.field2335 - 1))];
        if (arg0 != 2) {
            field2339 = null;
        }
        while (this.field2322 != var2) {
            if (this.field2322.field1448 == this.field2331) {
                class67 var3 = this.field2322;
                this.field2322 = this.field2322.field1441;
                return var3;
            }
            this.field2322 = this.field2322.field1441;
        }
        this.field2322 = null;
        return null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I[B)V")
    public static final void method785(int arg0, byte[] arg1) {
        class60 var2 = new class60(arg1);
        var2.field1227 = arg1.length - 2;
        field2318++;
        class120.field2796 = var2.method467(255);
        class111.field2594 = new int[class120.field2796];
        class140.field3346 = new byte[class120.field2796][];
        class120.field2814 = new int[class120.field2796];
        class29.field599 = new int[class120.field2796];
        class140.field3328 = new int[class120.field2796];
        var2.field1227 = arg1.length - class120.field2796 * 8 - 7;
        class78.field1776 = var2.method467(255);
        class1.field14 = var2.method467(255);
        int var3 = (var2.method462((byte) 116) & 0xFF) + 1;
        for (int var4 = 0; var4 < class120.field2796; var4++) {
            class29.field599[var4] = var2.method467(255);
        }
        for (int var5 = 0; var5 < class120.field2796; var5++) {
            class120.field2814[var5] = var2.method467(255);
        }
        if (arg0 < 32) {
            method786((byte) 24, null);
        }
        for (int var6 = 0; var6 < class120.field2796; var6++) {
            class111.field2594[var6] = var2.method467(255);
        }
        for (int var7 = 0; var7 < class120.field2796; var7++) {
            class140.field3328[var7] = var2.method467(255);
        }
        var2.field1227 = arg1.length - class120.field2796 * 8 - (var3 + -1) * 3 - 7;
        class31.field630 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class31.field630[var8] = var2.method493((byte) -122);
            if (class31.field630[var8] == 0) {
                class31.field630[var8] = 1;
            }
        }
        var2.field1227 = 0;
        for (int var9 = 0; var9 < class120.field2796; var9++) {
            int var10 = class111.field2594[var9];
            int var11 = class140.field3328[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class140.field3346[var9] = var13;
            int var14 = var2.method462((byte) 116);
            if (var14 == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method449(true);
                }
            } else if (var14 == 1) {
                for (int var15 = 0; var15 < var10; var15++) {
                    for (int var16 = 0; var16 < var11; var16++) {
                        var13[var10 * var16 + var15] = var2.method449(true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B[Lrd;)Lrd;")
    public static final class114 method786(byte arg0, class114[] arg1) {
        if (arg0 <= 124) {
            field2334 = null;
        }
        field2329++;
        if (arg1.length < 2) {
            throw new IllegalArgumentException();
        }
        return class61.method501(arg1, (byte) -14, arg1.length, 0);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(I)V")
    public class101(int arg0) {
        this.field2335 = arg0;
        this.field2324 = new class67[arg0];
        for (int var2 = 0; var2 < arg0; var2++) {
            class67 var3 = this.field2324[var2] = new class67();
            var3.field1436 = var3;
            var3.field1441 = var3;
        }
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static final void method787(int arg0) {
        field2311++;
        class117.field2743 = 0;
        for (int var1 = -1; var1 < class8.field116 + class77.field1765; var1++) {
            class36 var18;
            if (var1 == -1) {
                var18 = class7.field103;
            } else if (class8.field116 > var1) {
                var18 = class36.field762[class110.field2573[var1]];
            } else {
                var18 = class123.field2894[class16.field317[var1 - class8.field116]];
            }
            if (var18 != null && var18.method66((byte) -126)) {
                if (var18 instanceof class8) {
                    class124 var19 = ((class8) var18).field121;
                    if (var19.field2939 != null) {
                        var19 = var19.method961(-1);
                    }
                    if (var19 == null) {
                        continue;
                    }
                }
                if (class8.field116 <= var1) {
                    class124 var22 = ((class8) var18).field121;
                    if (var22.field2939 != null) {
                        var22 = var22.method961(-1);
                    }
                    if (var22.field2936 >= 0 && var22.field2936 < class66.field1424.length) {
                        class20.method135(var18, -1, var18.field746 + 15);
                        if (class21.field380 > -1) {
                            class66.field1424[var22.field2936].method400(class21.field380 - 12, class38.field802 - 30);
                        }
                    }
                    if (class118.field2757 == 1 && class16.field317[var1 - class8.field116] == class51.field1063 && class20.field370 % 20 < 10) {
                        class20.method135(var18, -1, var18.field746 + 15);
                        if (class21.field380 > -1) {
                            class22.field424[0].method400(class21.field380 - 12, class38.field802 + -28);
                        }
                    }
                } else {
                    int var20 = 30;
                    class126 var21 = (class126) var18;
                    if (var21.field2991 != -1 || var21.field3009 != -1) {
                        class20.method135(var18, arg0 - 1, var18.field746 + 15);
                        if (class21.field380 > -1) {
                            if (var21.field2991 != -1) {
                                class18.field345[var21.field2991].method400(class21.field380 - 12, -var20 + class38.field802);
                                var20 += 25;
                            }
                            if (var21.field3009 != -1) {
                                class66.field1424[var21.field3009].method400(class21.field380 - 12, -var20 + class38.field802);
                                var20 += 25;
                            }
                        }
                    }
                    if (var1 >= 0 && class118.field2757 == 10 && class110.field2573[var1] == class109.field2512) {
                        class20.method135(var18, -1, var18.field746 + 15);
                        if (class21.field380 > -1) {
                            class22.field424[1].method400(class21.field380 - 12, -var20 + class38.field802);
                        }
                    }
                }
                if (var18.field715 != null && (var1 >= class8.field116 || class12.field253 == 0 || class12.field253 == 3 || class12.field253 == 1 && class24.method175((byte) 32, ((class126) var18).field3018))) {
                    class20.method135(var18, -1, var18.field746);
                    if (class21.field380 > -1 && class117.field2743 < class11.field180) {
                        class11.field197[class117.field2743] = client.field399.method326(var18.field715) / 2;
                        class11.field173[class117.field2743] = client.field399.field937;
                        class11.field188[class117.field2743] = class21.field380;
                        class11.field203[class117.field2743] = class38.field802;
                        class11.field192[class117.field2743] = var18.field702;
                        class11.field175[class117.field2743] = var18.field711;
                        class11.field179[class117.field2743] = var18.field747;
                        class11.field171[class117.field2743] = var18.field715;
                        class117.field2743++;
                    }
                }
                if (var18.field741 > class20.field370) {
                    class20.method135(var18, -1, var18.field746 + 15);
                    if (class21.field380 > -1) {
                        int var23 = var18.field732 * 30 / var18.field713;
                        if (var23 > 30) {
                            var23 = 30;
                        }
                        class59.method434(class21.field380 - 15, class38.field802 - 3, var23, 5, 65280);
                        class59.method434(class21.field380 + var23 - 15, class38.field802 - 3, 30 - var23, 5, 16711680);
                    }
                }
                for (int var24 = 0; var24 < 4; var24++) {
                    if (var18.field740[var24] > class20.field370) {
                        class20.method135(var18, -1, var18.field746 / 2);
                        if (class21.field380 > -1) {
                            if (var24 == 1) {
                                class38.field802 -= 20;
                            }
                            if (var24 == 2) {
                                class21.field380 -= 15;
                                class38.field802 -= 10;
                            }
                            if (var24 == 3) {
                                class21.field380 += 15;
                                class38.field802 -= 10;
                            }
                            class135.field3294[var18.field737[var24]].method400(class21.field380 - 12, class38.field802 - 12);
                            class29.field609.method337(class14.method113(var18.field718[var24], -31766), class21.field380, class38.field802 + 4, 0);
                            class29.field609.method337(class14.method113(var18.field718[var24], -31766), class21.field380 - 1, class38.field802 - -3, 16777215);
                        }
                    }
                }
            }
        }
        for (int var2 = arg0; var2 < class117.field2743; var2++) {
            int var3 = class11.field188[var2];
            int var4 = class11.field203[var2];
            int var5 = class11.field197[var2];
            int var6 = class11.field173[var2];
            boolean var7 = true;
            while (var7) {
                var7 = false;
                for (int var17 = 0; var17 < var2; var17++) {
                    if (var4 + 2 > class11.field203[var17] + -class11.field173[var17] && var4 - var6 < class11.field203[var17] + 2 && class11.field188[var17] + class11.field197[var17] > var3 - var5 && class11.field188[var17] - class11.field197[var17] < var3 + var5 && class11.field203[var17] - class11.field173[var17] < var4) {
                        var4 = class11.field203[var17] - class11.field173[var17];
                        var7 = true;
                    }
                }
            }
            class21.field380 = class11.field188[var2];
            class38.field802 = class11.field203[var2] = var4;
            class114 var8 = class11.field171[var2];
            if (class100.field2296 == 0) {
                int var9 = 16776960;
                if (class11.field192[var2] < 6) {
                    var9 = class1.field15[class11.field192[var2]];
                }
                if (class11.field192[var2] == 6) {
                    var9 = class109.field2524 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class11.field192[var2] == 7) {
                    var9 = class109.field2524 % 20 < 10 ? 255 : 65535;
                }
                if (class11.field192[var2] == 8) {
                    var9 = class109.field2524 % 20 >= 10 ? 8454016 : 45056;
                }
                if (class11.field192[var2] == 9) {
                    int var10 = 150 - class11.field179[var2];
                    if (var10 < 50) {
                        var9 = var10 * 1280 + 16711680;
                    } else if (var10 < 100) {
                        var9 = 16384000 + 16776960 - var10 * 327680;
                    } else if (var10 < 150) {
                        var9 = var10 * 5 + 64780;
                    }
                }
                if (class11.field192[var2] == 10) {
                    int var11 = 150 - class11.field179[var2];
                    if (var11 < 50) {
                        var9 = var11 * 5 + 16711680;
                    } else if (var11 < 100) {
                        var9 = 16711935 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var9 = var11 * 327680 + 255 + 500 - var11 * 5 - 32768000;
                    }
                }
                if (class11.field192[var2] == 11) {
                    int var12 = 150 - class11.field179[var2];
                    if (var12 < 50) {
                        var9 = 16777215 - var12 * 327685;
                    } else if (var12 < 100) {
                        var9 = (var12 - 50) * 327685 + 65280;
                    } else if (var12 < 150) {
                        var9 = 49545215 - var12 * 327680;
                    }
                }
                if (class11.field175[var2] == 0) {
                    client.field399.method337(var8, class21.field380, class38.field802 + 1, 0);
                    client.field399.method337(var8, class21.field380, class38.field802, var9);
                }
                if (class11.field175[var2] == 1) {
                    client.field399.method319(var8, class21.field380, class38.field802 + 1, 0, class109.field2524);
                    client.field399.method319(var8, class21.field380, class38.field802, var9, class109.field2524);
                }
                if (class11.field175[var2] == 2) {
                    client.field399.method324(var8, class21.field380, class38.field802 + 1, 0, class109.field2524);
                    client.field399.method324(var8, class21.field380, class38.field802, var9, class109.field2524);
                }
                if (class11.field175[var2] == 3) {
                    client.field399.method331(var8, class21.field380, class38.field802 + 1, 0, class109.field2524, 150 - class11.field179[var2]);
                    client.field399.method331(var8, class21.field380, class38.field802, var9, class109.field2524, 150 - class11.field179[var2]);
                }
                if (class11.field175[var2] == 4) {
                    int var13 = client.field399.method326(var8);
                    int var14 = (150 - class11.field179[var2]) * (var13 + 100) / 150;
                    class59.method428(class21.field380 - 50, 0, class21.field380 + 50, 334);
                    client.field399.method333(var8, class21.field380 + 50 - var14, class38.field802 - -1, 0);
                    client.field399.method333(var8, class21.field380 + 50 - var14, class38.field802, var9);
                    class59.method426();
                }
                if (class11.field175[var2] == 5) {
                    int var15 = 150 - class11.field179[var2];
                    class59.method428(0, class38.field802 - client.field399.field937 - 1, 512, class38.field802 + 5);
                    int var16 = 0;
                    if (var15 < 25) {
                        var16 = var15 - 25;
                    } else if (var15 > 125) {
                        var16 = var15 - 125;
                    }
                    client.field399.method337(var8, class21.field380, class38.field802 + var16 + 1, 0);
                    client.field399.method337(var8, class21.field380, class38.field802 + var16, var9);
                    class59.method426();
                }
            } else {
                client.field399.method337(var8, class21.field380, class38.field802 + 1, 0);
                client.field399.method337(var8, class21.field380, class38.field802, 16776960);
            }
        }
    }
}
