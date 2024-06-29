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

@OriginalClass("client!sb")
public class class107 {

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "I")
    public int field2433 = 0;

    @OriginalMember(owner = "client!sb", name = "q", descriptor = "I")
    public int field2441 = 0;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "[B")
    public static byte[] field2428 = new byte[520];

    @OriginalMember(owner = "client!sb", name = "l", descriptor = "I")
    public static int field2436 = 0;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "Lva;")
    public static class121 field2425 = method797("hitmarks", -10983);

    @OriginalMember(owner = "client!sb", name = "h", descriptor = "I")
    public static int field2432 = 0;

    @OriginalMember(owner = "client!sb", name = "u", descriptor = "I")
    public static int field2445 = 127;

    @OriginalMember(owner = "client!sb", name = "p", descriptor = "Lva;")
    private static class121 field2440 = method797("Your friendlist is full)3 Max of 100 for free users)1 and 200 for members", -10983);

    @OriginalMember(owner = "client!sb", name = "y", descriptor = "Lva;")
    public static class121 field2449 = method797("@whi@ )4 ", -10983);

    @OriginalMember(owner = "client!sb", name = "s", descriptor = "Lva;")
    public static class121 field2443 = field2440;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public int field2431;

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!sb", name = "m", descriptor = "I")
    public int field2437;

    @OriginalMember(owner = "client!sb", name = "n", descriptor = "I")
    public static int field2438;

    @OriginalMember(owner = "client!sb", name = "r", descriptor = "I")
    public int field2442;

    @OriginalMember(owner = "client!sb", name = "v", descriptor = "I")
    public int field2446;

    @OriginalMember(owner = "client!sb", name = "w", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!sb", name = "x", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!sb", name = "k", descriptor = "Lhe;")
    public static class47 field2435;

    @OriginalMember(owner = "client!sb", name = "o", descriptor = "Loa;")
    public class85 field2439;

    @OriginalMember(owner = "client!sb", name = "t", descriptor = "Loa;")
    public class85 field2444;

    @OriginalMember(owner = "client!sb", name = "z", descriptor = "[I")
    public static int[] field2450;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 12)
    public static final void method793(int arg0) {
        class86.field1988.method984(-1);
        field2434++;
        if (arg0 < 83) {
            field2436 = 99;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lpa;II)V", line = 31)
    public static final void method794(class91 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            method795(null, (byte) -20);
        }
        field2448++;
        while (true) {
            class53 var3 = (class53) class91.field2062.method57((byte) 86);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field1221; var5++) {
                if (var3.field1238[var5] != null) {
                    if (var3.field1238[var5].field795 == 2) {
                        var3.field1231[var5] = -5;
                    }
                    if (var3.field1238[var5].field795 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field1220[var5] != null) {
                    if (var3.field1220[var5].field795 == 2) {
                        var3.field1231[var5] = -6;
                    }
                    if (var3.field1220[var5].field795 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg0.method622(arg2, true);
            arg0.method836(arg1, 0);
            int var6 = arg0.field2507;
            arg0.method867((byte) -66, var3.field1225);
            for (int var7 = 0; var7 < var3.field1221; var7++) {
                if (var3.field1231[var7] == 0) {
                    try {
                        int var8 = var3.field1224[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field1238[var7].field800;
                            int var10 = var9.getInt(null);
                            arg0.method836(0, 0);
                            arg0.method867((byte) -66, var10);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field1238[var7].field800;
                            var11.setInt(null, var3.field1233[var7]);
                            arg0.method836(0, 0);
                        } else if (var8 == 2) {
                            Field var12 = (Field) var3.field1238[var7].field800;
                            int var13 = var12.getModifiers();
                            arg0.method836(0, 0);
                            arg0.method867((byte) -66, var13);
                        }
                        if (var8 == 3) {
                            Method var14 = (Method) var3.field1220[var7].field800;
                            byte[][] var15 = var3.field1228[var7];
                            Object[] var16 = new Object[var15.length];
                            for (int var17 = 0; var17 < var15.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var15[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var14.invoke(null, var16);
                            if (var19 == null) {
                                arg0.method836(0, 0);
                            } else if (var19 instanceof Number) {
                                arg0.method836(0, 1);
                                arg0.method835(false, ((Number) var19).longValue());
                            } else if (var19 instanceof class121) {
                                arg0.method836(0, 2);
                                arg0.method826((class121) var19, (byte) -101);
                            } else {
                                arg0.method836(0, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field1220[var7].field800;
                            int var21 = var20.getModifiers();
                            arg0.method836(0, 0);
                            arg0.method867((byte) -66, var21);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg0.method836(0, -10);
                    } catch (InvalidClassException var23) {
                        arg0.method836(0, -11);
                    } catch (StreamCorruptedException var24) {
                        arg0.method836(0, -12);
                    } catch (OptionalDataException var25) {
                        arg0.method836(0, -13);
                    } catch (IllegalAccessException var26) {
                        arg0.method836(arg1, -14);
                    } catch (IllegalArgumentException var27) {
                        arg0.method836(0, -15);
                    } catch (InvocationTargetException var28) {
                        arg0.method836(0, -16);
                    } catch (SecurityException var29) {
                        arg0.method836(arg1, -17);
                    } catch (IOException var30) {
                        arg0.method836(arg1, -18);
                    } catch (NullPointerException var31) {
                        arg0.method836(arg1, -19);
                    } catch (Exception var32) {
                        arg0.method836(arg1, -20);
                    } catch (Throwable var33) {
                        arg0.method836(0, -21);
                    }
                } else {
                    arg0.method836(0, var3.field1231[var7]);
                }
            }
            arg0.method871((byte) 69, var6);
            arg0.method857(-1, arg0.field2507 - var6);
            var3.method187((byte) 39);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Lhe;B)V", line = 231)
    public static final void method795(class47 arg0, byte arg1) {
        field2438++;
        class37.field870 = arg0;
        if (arg1 != 29) {
            method797(null, -123);
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Z)V", line = 259)
    public static void method796(boolean arg0) {
        field2443 = null;
        if (arg0) {
            return;
        }
        field2440 = null;
        field2435 = null;
        field2449 = null;
        field2450 = null;
        field2425 = null;
        field2428 = null;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/lang/String;I)Lva;", line = 278)
    public static final class121 method797(String arg0, int arg1) {
        field2427++;
        if (arg1 != -10983) {
            method796(false);
        }
        byte[] var2 = arg0.getBytes();
        int var3 = 0;
        int var4 = var2.length;
        class121 var5 = new class121();
        var5.field2817 = new byte[var4];
        while (var3 < var4) {
            int var6 = var2[var3++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var4 <= var3) {
                    break;
                }
                int var7 = var2[var3++] & 0xFF;
                var5.field2817[var5.field2783++] = (byte) (var6 * 43 + var7 - 1720 - 48);
            } else {
                var5.field2817[var5.field2783++] = (byte) var6;
            }
        }
        var5.method952(0);
        return var5.method936(4096);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(II)V", line = 319)
    public static final void method798(int arg0, int arg1) {
        if (arg1 == -3) {
            class56.method410(class18.field413, class80.field1864, class77.field1785, -4774);
        } else if (arg1 == -2) {
            class56.method410(class18.field372, class18.field416, class52.field1213, -4774);
        } else if (arg1 == -1) {
            class56.method410(class18.field380, class63.field1529, class77.field1786, -4774);
        } else if (arg1 == 3) {
            class56.method410(class18.field376, class18.field393, class61.field1468, -4774);
        } else if (arg1 == 4) {
            class56.method410(class18.field386, class118.field2692, class9.field156, -4774);
        } else if (arg1 == 5) {
            class56.method410(class18.field388, class37.field866, class101.field2264, -4774);
        } else if (arg1 == 6) {
            class56.method410(class18.field369, class108.field2451, class35.field835, -4774);
        } else if (arg1 == 7) {
            class56.method410(class18.field418, class5.field87, class21.field571, -4774);
        } else if (arg1 == 8) {
            class56.method410(class18.field374, class101.field2261, class37.field868, -4774);
        } else if (arg1 == 9) {
            class56.method410(class18.field368, class126.field2861, class96.field2148, -4774);
        } else if (arg1 == 10) {
            class56.method410(class18.field401, class101.field2251, class9.field135, -4774);
        } else if (arg1 == 11) {
            class56.method410(class18.field375, class58.field1352, class22.field576, -4774);
        } else if (arg1 == 12) {
            class56.method410(class18.field407, class53.field1227, class16.field315, -4774);
        } else if (arg1 == 13) {
            class56.method410(class18.field410, class124.field2836, class77.field1789, -4774);
        } else if (arg1 == 14) {
            class56.method410(class18.field381, class113.field2554, class76.field1746, -4774);
        } else if (arg1 == 16) {
            class56.method410(class18.field403, class67.field1616, class76.field1752, -4774);
        } else if (arg1 == 17) {
            class56.method410(class18.field400, class114.field2595, class45.field1045, -4774);
        } else if (arg1 == 18) {
            class56.method410(class18.field405, class66.field1586, class118.field2683, -4774);
        } else if (arg1 == 20) {
            class56.method410(class18.field414, class28.field719, class77.field1787, -4774);
        } else if (arg1 == 22) {
            class56.method410(class18.field377, class76.field1750, class97.field2188, -4774);
        } else if (arg1 == 23) {
            class56.method410(class18.field363, class14.field266, class76.field1744, -4774);
        } else if (arg1 == 24) {
            class56.method410(class18.field357, class21.field553, class86.field1974, -4774);
        } else if (arg1 == 25) {
            class56.method410(class18.field366, class41.field935, class77.field1790, -4774);
        } else if (arg1 == 26) {
            class56.method410(class18.field356, class48.field1163, class126.field2860, -4774);
        } else {
            class56.method410(class18.field409, class61.field1451, class77.field1792, -4774);
        }
        class60.method437((byte) 67, 10);
        field2447++;
        if (arg0 <= 2) {
            field2449 = null;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(ILhe;Lhe;)I", line = 432)
    public static final int method799(int arg0, class47 arg1, class47 arg2) {
        int var3 = 0;
        field2429++;
        if (arg2.method334(class101.field2260, class18.field378, -1)) {
            var3++;
        }
        if (arg1.method334(class47.field1124, class18.field378, -1)) {
            var3++;
        }
        if (arg1.method334(class15.field279, class18.field378, arg0 ^ 0xFFFFEBED)) {
            var3++;
        }
        if (arg1.method334(class11.field178, class18.field378, arg0 - 5139)) {
            var3++;
        }
        if (arg1.method334(class84.field1938, class18.field378, -1)) {
            var3++;
        }
        if (arg0 != 5138) {
            method797(null, -6);
        }
        return var3;
    }
}
