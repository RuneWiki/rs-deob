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

@OriginalClass("client!cf")
public class class21 {

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lrd;")
    public static class117 field586 = class95.method812(" steht bereits auf Ihrer Freunde)2Liste(Q", (byte) 8);

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "Lrd;")
    private static class117 field593 = class95.method812("Use", (byte) 8);

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Lrd;")
    public static class117 field589 = class95.method812("Gegenstand f-Ur Mitglieder", (byte) 8);

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "Lrd;")
    public static class117 field583 = field593;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "Lrd;")
    private static class117 field595 = class95.method812("Add friend", (byte) 8);

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "Lrd;")
    public static class117 field602 = class95.method812("blinken1:", (byte) 8);

    @OriginalMember(owner = "client!cf", name = "v", descriptor = "Lwa;")
    public static class144 field603 = null;

    @OriginalMember(owner = "client!cf", name = "w", descriptor = "I")
    public static int field604 = 0;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "Lrd;")
    public static class117 field592 = field595;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field584;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public int field585;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public int field587;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "I")
    public int field590;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field591;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public static int field594;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public int field596;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field597;

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public static int field598;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lid;")
    public class60 field588;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Lid;")
    public class60 field599;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "Lid;")
    public class60 field601;

    @OriginalMember(owner = "client!cf", name = "x", descriptor = "Lm;")
    public static class83 field605;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "[I")
    public static int[] field606;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
    public static void method232(int arg0) {
        field605 = null;
        field603 = null;
        field592 = null;
        field583 = null;
        field606 = null;
        field595 = null;
        field593 = null;
        field589 = null;
        if (arg0 == -16) {
            field586 = null;
            field602 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIB)V")
    public static final void method233(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        field582++;
        class85.field2208[0].method929(arg4, arg2);
        class85.field2208[1].method929(arg4, arg2 + arg0 - 16);
        class145.method1165(arg4, arg2 + 16, 16, arg0 - 32, class25.field759);
        int var6 = (arg0 - 32) * arg0 / arg1;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg0 - var6 - 32) * arg3 / (arg1 - arg0);
        int var8 = -64 % (arg5 / 55);
        class145.method1165(arg4, var7 + arg2 + 16, 16, var6, class52.field1456);
        class145.method1157(arg4, arg2 + var7 + 16, var6, class40.field1152);
        class145.method1157(arg4 + 1, arg2 + var7 - -16, var6, class40.field1152);
        class145.method1164(arg4, var7 + arg2 + 16, 16, class40.field1152);
        class145.method1164(arg4, var7 + arg2 + 17, 16, class40.field1152);
        class145.method1157(arg4 + 15, arg2 + var7 + 16, var6, class35.field1052);
        class145.method1157(arg4 + 14, 17 - -var7 + arg2, var6 - 1, class35.field1052);
        class145.method1164(arg4, arg2 + var6 + var7 + 15, 16, class35.field1052);
        class145.method1164(arg4 + 1, arg2 + var6 + var7 + 14, 15, class35.field1052);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IILla;)V")
    public static final void method234(int arg0, int arg1, class77 arg2) {
        if (arg1 != -6) {
            field604 = 121;
        }
        field598++;
        while (true) {
            class97 var3 = (class97) class137.field3283.method3(false);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2433; var5++) {
                if (var3.field2425[var5] != null) {
                    if (var3.field2425[var5].field940 == 2) {
                        var3.field2423[var5] = -5;
                    }
                    if (var3.field2425[var5].field940 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2440[var5] != null) {
                    if (var3.field2440[var5].field940 == 2) {
                        var3.field2423[var5] = -6;
                    }
                    if (var3.field2440[var5].field940 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method739(false, arg0);
            arg2.method162(0, -23339);
            int var6 = arg2.field314;
            arg2.method124(var3.field2439, 0);
            for (int var7 = 0; var7 < var3.field2433; var7++) {
                if (var3.field2423[var7] == 0) {
                    try {
                        int var8 = var3.field2441[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2425[var7].field937;
                            int var13 = var12.getInt(null);
                            arg2.method162(0, arg1 - 23333);
                            arg2.method124(var13, arg1 ^ 0xFFFFFFFA);
                        } else if (var8 == 1) {
                            Field var9 = (Field) var3.field2425[var7].field937;
                            var9.setInt(null, var3.field2424[var7]);
                            arg2.method162(0, arg1 ^ 0x5B2F);
                        } else if (var8 == 2) {
                            Field var10 = (Field) var3.field2425[var7].field937;
                            int var11 = var10.getModifiers();
                            arg2.method162(0, -23339);
                            arg2.method124(var11, 0);
                        }
                        if (var8 == 3) {
                            byte[][] var14 = var3.field2434[var7];
                            Method var15 = (Method) var3.field2440[var7].field937;
                            Object[] var16 = new Object[var14.length];
                            for (int var17 = 0; var17 < var14.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var14[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var15.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method162(0, -23339);
                            } else if (var19 instanceof Number) {
                                arg2.method162(1, -23339);
                                arg2.method163(83, ((Number) var19).longValue());
                            } else if (var19 instanceof class117) {
                                arg2.method162(2, arg1 - 23333);
                                arg2.method147(arg1 ^ 0x50, (class117) var19);
                            } else {
                                arg2.method162(4, -23339);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field2440[var7].field937;
                            int var21 = var20.getModifiers();
                            arg2.method162(0, -23339);
                            arg2.method124(var21, 0);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method162(-10, -23339);
                    } catch (InvalidClassException var23) {
                        arg2.method162(-11, -23339);
                    } catch (StreamCorruptedException var24) {
                        arg2.method162(-12, arg1 - 23333);
                    } catch (OptionalDataException var25) {
                        arg2.method162(-13, arg1 - 23333);
                    } catch (IllegalAccessException var26) {
                        arg2.method162(-14, -23339);
                    } catch (IllegalArgumentException var27) {
                        arg2.method162(-15, -23339);
                    } catch (InvocationTargetException var28) {
                        arg2.method162(-16, arg1 ^ 0x5B2F);
                    } catch (SecurityException var29) {
                        arg2.method162(-17, -23339);
                    } catch (IOException var30) {
                        arg2.method162(-18, arg1 - 23333);
                    } catch (NullPointerException var31) {
                        arg2.method162(-19, -23339);
                    } catch (Exception var32) {
                        arg2.method162(-20, arg1 ^ 0x5B2F);
                    } catch (Throwable var33) {
                        arg2.method162(-21, arg1 - 23333);
                    }
                } else {
                    arg2.method162(var3.field2423[var7], -23339);
                }
            }
            arg2.method140(var6, arg1 + 132);
            arg2.method148((byte) -94, arg2.field314 - var6);
            var3.method691(0);
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V")
    public static final void method235(byte arg0) {
        field584++;
        int var1 = class64.field1828 * 128 + 64;
        int var2 = class102.field2574 * 128 + 64;
        int var3 = class133.method1091(class120.field2940, var2, (byte) 121, var1) - class102.field2572;
        if (var1 > class45.field1271) {
            class45.field1271 += (var1 - class45.field1271) * class38.field1116 / 1000 + class95.field2372;
            if (class45.field1271 > var1) {
                class45.field1271 = var1;
            }
        }
        if (var2 > class4.field105) {
            class4.field105 += class95.field2372 + (var2 - class4.field105) * class38.field1116 / 1000;
            if (var2 < class4.field105) {
                class4.field105 = var2;
            }
        }
        if (class45.field1271 > var1) {
            class45.field1271 -= (class45.field1271 - var1) * class38.field1116 / 1000 + class95.field2372;
            if (class45.field1271 < var1) {
                class45.field1271 = var1;
            }
        }
        int var4 = class116.field2827 * 128 + 64;
        if (var2 < class4.field105) {
            class4.field105 -= (class4.field105 - var2) * class38.field1116 / 1000 + class95.field2372;
            if (class4.field105 < var2) {
                class4.field105 = var2;
            }
        }
        if (class38.field1117 < var3) {
            class38.field1117 += (var3 - class38.field1117) * class38.field1116 / 1000 + class95.field2372;
            if (var3 < class38.field1117) {
                class38.field1117 = var3;
            }
        }
        if (arg0 <= 88) {
            field606 = null;
        }
        int var5 = class61.field1710 * 128 + 64;
        if (class38.field1117 > var3) {
            class38.field1117 -= (class38.field1117 - var3) * class38.field1116 / 1000 + class95.field2372;
            if (class38.field1117 < var3) {
                class38.field1117 = var3;
            }
        }
        int var6 = class133.method1091(class120.field2940, var5, (byte) 111, var4) - class105.field2634;
        int var7 = var6 - class38.field1117;
        int var8 = var5 - class4.field105;
        int var9 = var4 - class45.field1271;
        int var10 = (int) Math.sqrt((double) (var8 * var8 + var9 * var9));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class111.field2784;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class111.field2784 += class108.field2706 * var13 / 1000 + class140.field3334;
            class111.field2784 &= 0x7FF;
        }
        if (class39.field1131 < var11) {
            class39.field1131 += (var11 - class39.field1131) * class108.field2706 / 1000 + class140.field3334;
            if (class39.field1131 > var11) {
                class39.field1131 = var11;
            }
        }
        if (var11 < class39.field1131) {
            class39.field1131 -= (class39.field1131 - var11) * class108.field2706 / 1000 + class140.field3334;
            if (var11 > class39.field1131) {
                class39.field1131 = var11;
            }
        }
        if (var13 < 0) {
            class111.field2784 -= -var13 * class108.field2706 / 1000 + class140.field3334;
            class111.field2784 &= 0x7FF;
        }
        int var14 = var12 - class111.field2784;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class111.field2784 = var12;
        }
    }
}
