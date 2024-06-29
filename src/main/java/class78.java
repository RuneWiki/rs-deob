import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class78 extends class224 {

    @OriginalMember(owner = "client!el", name = "U", descriptor = "Z")
    private boolean field1067 = true;

    @OriginalMember(owner = "client!el", name = "ib", descriptor = "I")
    private int field1081 = 4096;

    @OriginalMember(owner = "client!el", name = "gb", descriptor = "Luf;")
    public static class168 field1079 = class148.method1019(-1720, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "Luf;")
    public static class168 field1071 = class148.method1019(-1720, "Null");

    @OriginalMember(owner = "client!el", name = "X", descriptor = "Luf;")
    public static class168 field1070 = class148.method1019(-1720, "weiss:");

    @OriginalMember(owner = "client!el", name = "ab", descriptor = "Luf;")
    public static class168 field1073 = class148.method1019(-1720, "<img=0>");

    @OriginalMember(owner = "client!el", name = "W", descriptor = "[I")
    public static int[] field1069 = new int[5];

    @OriginalMember(owner = "client!el", name = "kb", descriptor = "[B")
    public static byte[] field1083 = new byte[] { 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };

    @OriginalMember(owner = "client!el", name = "ob", descriptor = "Luf;")
    public static class168 field1087 = class148.method1019(-1720, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!el", name = "T", descriptor = "Lej;")
    public static class204 field1066 = new class204(64);

    @OriginalMember(owner = "client!el", name = "R", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    public static int field1065;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "I")
    public static int field1072;

    @OriginalMember(owner = "client!el", name = "bb", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!el", name = "cb", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!el", name = "db", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!el", name = "fb", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!el", name = "hb", descriptor = "I")
    public static int field1080;

    @OriginalMember(owner = "client!el", name = "jb", descriptor = "I")
    public static int field1082;

    @OriginalMember(owner = "client!el", name = "mb", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!el", name = "V", descriptor = "Lhc;")
    public static class183 field1068;

    @OriginalMember(owner = "client!el", name = "lb", descriptor = "[Lgk;")
    public static class265[] field1084;

    @OriginalMember(owner = "client!el", name = "nb", descriptor = "[Z")
    public static boolean[] field1086;

    @OriginalMember(owner = "client!el", name = "eb", descriptor = "[[B")
    public static byte[][] field1077;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IB)[[I", line = 5)
    public final int[][] method17(int arg0, byte arg1) {
        field1065++;
        if (arg1 != -77) {
            method461(-53L, 57);
        }
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756) {
            int[] var4 = this.method1537(arg0 - 1 & class169.field2777, 0, 0);
            int[] var5 = this.method1537(arg0, 0, 0);
            int[] var6 = this.method1537(arg0 + 1 & class169.field2777, 0, 0);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            for (int var10 = 0; var10 < class187.field2961; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field1081;
                int var12 = (var5[var10 + 1 & class205.field3363] - var5[class205.field3363 & var10 - 1]) * this.field1081;
                int var13 = var12 >> 12;
                int var14 = var11 >> 12;
                int var15 = var13 * var13 >> 12;
                int var16 = var14 * var14 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var18 = 0;
                    var19 = 0;
                    var20 = 0;
                } else {
                    var20 = var11 / var17;
                    var19 = var12 / var17;
                    var18 = 16777216 / var17;
                }
                if (this.field1067) {
                    var20 = (var20 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                }
                var7[var10] = var19;
                var8[var10] = var20;
                var9[var10] = var18;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(JI)V", line = 98)
    public static final void method461(long arg0, int arg1) {
        class249.field4262.field2367 = 0;
        class249.field4262.method1095(29, -62);
        field1076++;
        if (arg1 <= 78) {
            method466(-48, -1, 0, 69, 34, -78, -97);
        }
        class249.field4262.method1053(arg0, 11247);
        class38.field476 = 1;
        class95.field1515 = 0;
        class273.field4588 = -3;
        class99.field1559 = 0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLch;)V", line = 118)
    public static final void method462(int arg0, boolean arg1, class95 arg2) {
        if (!arg1) {
            return;
        }
        field1078++;
        while (true) {
            class50 var3 = (class50) class167.field2678.method442(65293);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field606; var5++) {
                if (var3.field601[var5] != null) {
                    if (var3.field601[var5].field1746 == 2) {
                        var3.field603[var5] = -5;
                    }
                    if (var3.field601[var5].field1746 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field602[var5] != null) {
                    if (var3.field602[var5].field1746 == 2) {
                        var3.field603[var5] = -6;
                    }
                    if (var3.field602[var5].field1746 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method726(arg0, 2138389379);
            arg2.method1095(0, -60);
            int var6 = arg2.field2367;
            arg2.method1045(var3.field604, (byte) 24);
            for (int var7 = 0; var7 < var3.field606; var7++) {
                if (var3.field603[var7] == 0) {
                    try {
                        int var8 = var3.field608[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field601[var7].field1742;
                            int var10 = var9.getInt((Object) null);
                            arg2.method1095(0, -96);
                            arg2.method1045(var10, (byte) 21);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field601[var7].field1742;
                            var13.setInt((Object) null, var3.field607[var7]);
                            arg2.method1095(0, -57);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field601[var7].field1742;
                            int var12 = var11.getModifiers();
                            arg2.method1095(0, -94);
                            arg2.method1045(var12, (byte) 39);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field602[var7].field1742;
                            byte[][] var17 = var3.field600[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg2.method1095(0, -49);
                            } else if ((var21 instanceof Number)) {
                                arg2.method1095(1, -54);
                                arg2.method1053(((Number) var21).longValue(), 11247);
                            } else if (var21 instanceof class168) {
                                arg2.method1095(2, -65);
                                arg2.method1073((byte) 84, (class168) var21);
                            } else {
                                arg2.method1095(4, -51);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field602[var7].field1742;
                            int var15 = var14.getModifiers();
                            arg2.method1095(0, -94);
                            arg2.method1045(var15, (byte) 127);
                        }
                    } catch (ClassNotFoundException var34) {
                        arg2.method1095(-10, -101);
                    } catch (InvalidClassException var35) {
                        arg2.method1095(-11, -82);
                    } catch (StreamCorruptedException var36) {
                        arg2.method1095(-12, -95);
                    } catch (OptionalDataException var37) {
                        arg2.method1095(-13, -74);
                    } catch (IllegalAccessException var38) {
                        arg2.method1095(-14, -59);
                    } catch (IllegalArgumentException var39) {
                        arg2.method1095(-15, -82);
                    } catch (InvocationTargetException var40) {
                        arg2.method1095(-16, -104);
                    } catch (SecurityException var41) {
                        arg2.method1095(-17, -125);
                    } catch (IOException var42) {
                        arg2.method1095(-18, -37);
                    } catch (NullPointerException var43) {
                        arg2.method1095(-19, -127);
                    } catch (Exception var44) {
                        arg2.method1095(-20, -59);
                    } catch (Throwable var45) {
                        arg2.method1095(-21, -105);
                    }
                } else {
                    arg2.method1095(var3.field603[var7], -86);
                }
            }
            arg2.method1067(-3864, var6);
            arg2.method1063(arg2.field2367 - var6, 116);
            var3.method124((byte) 68);
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 311)
    public class78() {
        super(1, false);
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IZLj;)V", line = 317)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        field1074++;
        if (arg0 == 0) {
            this.field1081 = arg2.method1069(68);
        } else if (arg0 == 1) {
            this.field1067 = arg2.method1042((byte) 104) == 1;
        }
        if (arg1) {
            method464((class153) null, 88);
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)V", line = 357)
    public static final void method463(int arg0) {
        field1075++;
        class90.method611();
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        if (class8.field98 != null) {
            class293.method2018(class51.field622, (byte) -103, class8.field98);
        }
        if (arg0 == -1) {
            class8.field98 = null;
            class161.method1130(65, 0);
            class134.method941(74);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Lj;I)V", line = 380)
    public static final void method464(class153 arg0, int arg1) {
        field1082++;
        int var2 = class197.field3263 >> 1;
        int var3 = class43.field522 >> 2 << 10;
        byte[][] var4 = new byte[class140.field2161][class172.field2801];
        while (arg0.field2359.length > arg0.field2367) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method1042((byte) 107) == 1) {
                var5 = true;
                var6 = arg0.method1042((byte) 112);
                var7 = arg0.method1042((byte) -69);
            }
            int var8 = arg0.method1042((byte) -116);
            int var9 = arg0.method1042((byte) -72);
            int var10 = var8 * 64 - class40.field506;
            int var11 = class172.field2801 + class261.field4420 - (var9 * 64) - 1;
            if (var10 >= 0 && var11 - 63 >= 0 && (var10 + 63) < class140.field2161 && class172.field2801 > var11) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || var6 * 8 <= var12 && (var6 * 8 + 8) > var12 && var14 >= (var7 * 8) && var14 < var7 * 8 + 8) {
                            var13[var11 - var14] = arg0.method1078(-6338);
                        }
                    }
                }
            } else if (var5) {
                arg0.field2367 += 64;
            } else {
                arg0.field2367 += 4096;
            }
        }
        int var15 = class140.field2161;
        int var16 = class172.field2801;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        if (arg1 < 90) {
            field1086 = (boolean[]) null;
        }
        for (int var22 = -5; var22 < var15; var22++) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class149 var26 = class282.method1943(35, var25 - 1);
                        var19[var23] += var26.field2308;
                        var18[var23] += var26.field2312;
                        var17[var23] += var26.field2306;
                        var20[var23] += var26.field2305;
                        var10002 = var21[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class149 var29 = class282.method1943(68, var28 - 1);
                        var19[var23] -= var29.field2308;
                        var18[var23] -= var29.field2312;
                        var17[var23] -= var29.field2306;
                        var20[var23] -= var29.field2305;
                        var10002 = var21[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class177.field2867[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var16 > var37) {
                        var34 += var20[var37];
                        var35 += var21[var37];
                        var33 += var17[var37];
                        var32 += var18[var37];
                        var31 += var19[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var33 -= var17[var38];
                        var34 -= var20[var38];
                        var32 -= var18[var38];
                        var35 -= var21[var38];
                        var31 -= var19[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class179.method1284(var32 / var35, var31 * 256 / var34, var33 / var35, -123);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var3 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class159.method1119(var36 << 6, 4032) + class159.method1119(var22, 63)] = class173.field2822[class180.method1292(var42, 96, true)];
                        } else if (var39 != null) {
                            var39[class159.method1119(63, var22) + class159.method1119(var36 << 6, 4032)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "e", descriptor = "(I)V", line = 623)
    public static void method465(int arg0) {
        field1069 = null;
        field1086 = null;
        field1066 = null;
        field1077 = (byte[][]) null;
        field1087 = null;
        field1073 = null;
        field1083 = null;
        field1084 = null;
        field1071 = null;
        field1068 = null;
        field1070 = null;
        int var1 = 12 / ((52 - arg0) / 51);
        field1079 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIIIII)V", line = 663)
    public static final void method466(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1080++;
        int var7 = -111 / ((-arg6 - 74) / 46);
        int var8 = class54.method301(class44.field538, arg2, class9.field112, -44);
        int var9 = class54.method301(class44.field538, arg1, class9.field112, 70);
        int var10 = class54.method301(class65.field874, arg0, class150.field2331, -73);
        int var11 = class54.method301(class65.field874, arg4, class150.field2331, 82);
        int var12 = class54.method301(class44.field538, arg2 + arg5, class9.field112, -49);
        int var13 = class54.method301(class44.field538, arg1 - arg5, class9.field112, -60);
        for (int var14 = var8; var14 < var12; var14++) {
            class133.method925(14678, var10, arg3, var11, class284.field4810[var14]);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class133.method925(14678, var10, arg3, var11, class284.field4810[var15]);
        }
        int var16 = class54.method301(class65.field874, arg0 + arg5, class150.field2331, 110);
        int var17 = class54.method301(class65.field874, arg4 - arg5, class150.field2331, -55);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class284.field4810[var18];
            class133.method925(14678, var10, arg3, var16, var19);
            class133.method925(14678, var17, arg3, var11, var19);
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(Z)V", line = 719)
    public static final void method467(boolean arg0) {
        class166.field2671.method718(false);
        if (!arg0) {
            return;
        }
        int var1 = class166.field2671.method728(8, 20544);
        field1064++;
        if (class2.field15 > var1) {
            for (int var2 = var1; var2 < class2.field15; var2++) {
                class300.field5084[class127.field1954++] = class116.field1814[var2];
            }
        }
        if (var1 > class2.field15) {
            throw new RuntimeException("gnpov1");
        }
        class2.field15 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class116.field1814[var3];
            class22 var5 = class190.field3065[var4];
            int var6 = class166.field2671.method728(1, 20544);
            if (var6 == 0) {
                class116.field1814[class2.field15++] = var4;
                var5.field3011 = class203.field3335;
            } else {
                int var7 = class166.field2671.method728(2, 20544);
                if (var7 == 0) {
                    class116.field1814[class2.field15++] = var4;
                    var5.field3011 = class203.field3335;
                    class12.field136[class9.field120++] = var4;
                } else if (var7 == 1) {
                    class116.field1814[class2.field15++] = var4;
                    var5.field3011 = class203.field3335;
                    int var11 = class166.field2671.method728(3, 20544);
                    var5.method1333((byte) -126, false, var11);
                    int var12 = class166.field2671.method728(1, 20544);
                    if (var12 == 1) {
                        class12.field136[class9.field120++] = var4;
                    }
                } else if (var7 == 2) {
                    class116.field1814[class2.field15++] = var4;
                    var5.field3011 = class203.field3335;
                    int var8 = class166.field2671.method728(3, 20544);
                    var5.method1333((byte) -103, true, var8);
                    int var9 = class166.field2671.method728(3, 20544);
                    var5.method1333((byte) -111, true, var9);
                    int var10 = class166.field2671.method728(1, 20544);
                    if (var10 == 1) {
                        class12.field136[class9.field120++] = var4;
                    }
                } else if (var7 == 3) {
                    class300.field5084[class127.field1954++] = var4;
                }
            }
        }
    }
}
