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

@OriginalClass("client!ak")
public class class138 extends class228 {

    @OriginalMember(owner = "client!ak", name = "T", descriptor = "I")
    private int field2426 = 4096;

    @OriginalMember(owner = "client!ak", name = "nb", descriptor = "I")
    private int field2446 = 4096;

    @OriginalMember(owner = "client!ak", name = "kb", descriptor = "I")
    private int field2443 = 4096;

    @OriginalMember(owner = "client!ak", name = "eb", descriptor = "J")
    public static long field2437 = 0L;

    @OriginalMember(owner = "client!ak", name = "V", descriptor = "Loa;")
    public static class99 field2428 = class221.method1463(2844, "<col=40ff00>");

    @OriginalMember(owner = "client!ak", name = "S", descriptor = "Z")
    public static boolean field2425 = false;

    @OriginalMember(owner = "client!ak", name = "gb", descriptor = "Loa;")
    public static class99 field2439 = class221.method1463(2844, "");

    @OriginalMember(owner = "client!ak", name = "fb", descriptor = "I")
    public static int field2438 = 0;

    @OriginalMember(owner = "client!ak", name = "Z", descriptor = "I")
    public static int field2432 = 0;

    @OriginalMember(owner = "client!ak", name = "qb", descriptor = "Loa;")
    public static class99 field2449 = class221.method1463(2844, "(U3");

    @OriginalMember(owner = "client!ak", name = "rb", descriptor = "I")
    public static int field2450 = 0;

    @OriginalMember(owner = "client!ak", name = "sb", descriptor = "Loa;")
    public static class99 field2451 = class221.method1463(2844, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!ak", name = "jb", descriptor = "Loa;")
    public static class99 field2442 = class221.method1463(2844, "; Expires=");

    @OriginalMember(owner = "client!ak", name = "W", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!ak", name = "Y", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!ak", name = "ab", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!ak", name = "bb", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!ak", name = "cb", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!ak", name = "db", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!ak", name = "hb", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!ak", name = "ib", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!ak", name = "lb", descriptor = "I")
    public static int field2444;

    @OriginalMember(owner = "client!ak", name = "ob", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!ak", name = "pb", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!ak", name = "U", descriptor = "Ltg;")
    public static class182 field2427;

    @OriginalMember(owner = "client!ak", name = "X", descriptor = "Ltg;")
    public static class182 field2430;

    @OriginalMember(owner = "client!ak", name = "mb", descriptor = "[I")
    public static int[] field2445;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(II)Lqf;")
    public static final class245 method940(int arg0, int arg1) {
        class245 var2 = (class245) class116.field2060.method512((byte) 78, (long) arg1);
        ++field2433;
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class260.field4536.method1242(arg1, arg0, 6801);
            class245 var4 = new class245();
            if (var3 != null) {
                var4.method1585((byte) 112, new class261(var3));
            }
            class116.field2060.method511(arg0 ^ -97, var4, (long) arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(Z)V")
    public static void method941(boolean arg0) {
        field2430 = null;
        field2428 = null;
        field2451 = null;
        field2445 = null;
        field2439 = null;
        if (!arg0) {
            method941(true);
        }
        field2449 = null;
        field2427 = null;
        field2442 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IB)V")
    public static final void method942(int arg0, byte arg1) {
        ++field2436;
        if (arg1 != -82) {
            field2427 = null;
        }
        class106.field1773.method1809(arg0, (byte) -50);
    }

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "(II)V")
    public static final void method943(int arg0, int arg1) {
        ++field2448;
        if (class156.field2808 != arg1) {
            boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
            if (class156.field2808 == arg0) {
                class108.method748(100);
            }
            if (arg1 == 40) {
                class96.method641((byte) 123);
            }
            if (~arg1 != -41 && class95.field1596 != null) {
                class95.field1596.method54((byte) 124);
                class95.field1596 = null;
            }
            if (arg1 == 25 || ~arg1 == -29) {
                class184.field3274 = 0;
                class117.field2076 = 0;
                class222.field3866 = 0;
                class269.field4727 = 1;
                class39.field671 = 1;
                class79.method552(true, 105);
            }
            if (~arg1 == -26 || arg1 == 10) {
                class59.method398(108);
            }
            if (arg1 != 5) {
                class39.method304(0);
            } else {
                class80.method557((byte) 56, class280.field4908);
            }
            boolean var3 = class156.field2808 == 5 || class156.field2808 == 10 || class156.field2808 == 28;
            if (!var3 == var2) {
                if (var2) {
                    class62.field1037 = class183.field3236;
                    if (class160.field2839 != 0) {
                        class167.method1132(class183.field3236, 2, arg0, false, 0, 255, class227.field3923);
                    } else {
                        class272.method1803(2, (byte) 103);
                    }
                    class58.field975.method1406(false, 80);
                } else {
                    class272.method1803(2, (byte) 121);
                    class58.field975.method1406(true, 75);
                }
            }
            class156.field2808 = arg1;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        ++field2431;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field2443 = arg1.method1740((byte) 77);
                }
            } else {
                this.field2446 = arg1.method1740((byte) 48);
            }
        } else {
            this.field2426 = arg1.method1740((byte) 82);
        }
        if (arg2 != -7618) {
            method940(0, -97);
        }
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V")
    public class138() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
    public static final void method944(int arg0) {
        ++field2435;
        if (arg0 != 40) {
            method942(-27, (byte) 12);
        }
        int var1 = class34.field610 * 128 + 64;
        int var2 = class244.field4212 * 128 + 64;
        int var3 = class115.method777(-1, var2, class255.field4407, var1) + -class237.field4103;
        if (~class276.field4865 > -101) {
            if (class2.field13 < var1) {
                class2.field13 += (-class2.field13 + var1) * class276.field4865 / 1000 + class23.field296;
                if (~class2.field13 < ~var1) {
                    class2.field13 = var1;
                }
            }
            if (var1 < class2.field13) {
                class2.field13 -= (-var1 + class2.field13) * class276.field4865 / 1000 + class23.field296;
                if (~var1 < ~class2.field13) {
                    class2.field13 = var1;
                }
            }
            if (var2 > class221.field3850) {
                class221.field3850 += class23.field296 - -((var2 - class221.field3850) * class276.field4865 / 1000);
                if (~class221.field3850 < ~var2) {
                    class221.field3850 = var2;
                }
            }
            if (~class24.field367 > ~var3) {
                class24.field367 += (-class24.field367 + var3) * class276.field4865 / 1000 + class23.field296;
                if (~class24.field367 < ~var3) {
                    class24.field367 = var3;
                }
            }
            if (~var2 > ~class221.field3850) {
                class221.field3850 -= (class221.field3850 - var2) * class276.field4865 / 1000 + class23.field296;
                if (var2 > class221.field3850) {
                    class221.field3850 = var2;
                }
            }
            if (var3 < class24.field367) {
                class24.field367 -= class23.field296 - -((class24.field367 - var3) * class276.field4865 / 1000);
                if (~var3 < ~class24.field367) {
                    class24.field367 = var3;
                }
            }
        } else {
            class221.field3850 = class244.field4212 * 128 + 64;
            class2.field13 = class34.field610 * 128 + 64;
            class24.field367 = class115.method777(-1, class221.field3850, class255.field4407, class2.field13) + -class237.field4103;
        }
        int var4 = class35.field622 * 128 + 64;
        int var5 = class3.field20 * 128 + 64;
        int var6 = class115.method777(-1, var5, class255.field4407, var4) - class280.field4911;
        int var7 = -class2.field13 + var4;
        int var8 = -class221.field3850 + var5;
        int var9 = -class24.field367 + var6;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = 2047 & (int) (325.949D * Math.atan2((double) var9, (double) var10));
        if (var11 < 128) {
            var11 = 128;
        }
        int var12 = 2047 & (int) (-325.949D * Math.atan2((double) var7, (double) var8));
        int var13 = -class173.field3061 + var12;
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (~var13 > 1023) {
            var13 += 2048;
        }
        if (~var11 < -384) {
            var11 = 383;
        }
        if (~class267.field4709 > ~var11) {
            class267.field4709 += (-class267.field4709 + var11) * class290.field5088 / 1000 + class25.field441;
            if (var11 < class267.field4709) {
                class267.field4709 = var11;
            }
        }
        if (~var11 > ~class267.field4709) {
            class267.field4709 -= (-var11 + class267.field4709) * class290.field5088 / 1000 + class25.field441;
            if (class267.field4709 < var11) {
                class267.field4709 = var11;
            }
        }
        if (var13 > 0) {
            class173.field3061 += class290.field5088 * var13 / 1000 + class25.field441;
            class173.field3061 &= 2047;
        }
        if (~var13 > -1) {
            class173.field3061 -= -var13 * class290.field5088 / 1000 + class25.field441;
            class173.field3061 &= 2047;
        }
        int var14 = -class173.field3061 + var12;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (~var14 > 1023) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || ~var14 < -1 && ~var13 > -1) {
            class173.field3061 = var12;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Loe;II)V")
    public static final void method945(class143 arg0, int arg1, int arg2) {
        ++field2444;
        if (arg1 < -20) {
            while (true) {
                class251 var3 = (class251) class185.field3280.method529(10);
                if (var3 == null) {
                    return;
                }
                boolean var4 = false;
                for (int var5 = 0; var5 < var3.field4331; ++var5) {
                    if (var3.field4327[var5] != null) {
                        if (~var3.field4327[var5].field4844 == -3) {
                            var3.field4335[var5] = -5;
                        }
                        if (~var3.field4327[var5].field4844 == -1) {
                            var4 = true;
                        }
                    }
                    if (var3.field4346[var5] != null) {
                        if (~var3.field4346[var5].field4844 == -3) {
                            var3.field4335[var5] = -6;
                        }
                        if (var3.field4346[var5].field4844 == 0) {
                            var4 = true;
                        }
                    }
                }
                if (var4) {
                    return;
                }
                arg0.method966((byte) 49, arg2);
                arg0.method1691(0, (byte) 53);
                int var6 = arg0.field4587;
                arg0.method1701(var3.field4336, 4994);
                for (int var7 = 0; ~var3.field4331 < ~var7; ++var7) {
                    if (var3.field4335[var7] != 0) {
                        arg0.method1691(var3.field4335[var7], (byte) 53);
                    } else {
                        try {
                            int var8 = var3.field4326[var7];
                            if (~var8 != -1) {
                                if (var8 != 1) {
                                    if (~var8 == -3) {
                                        Field var9 = (Field) var3.field4327[var7].field4843;
                                        int var10 = var9.getModifiers();
                                        arg0.method1691(0, (byte) 53);
                                        arg0.method1701(var10, 4994);
                                    }
                                } else {
                                    Field var11 = (Field) var3.field4327[var7].field4843;
                                    var11.setInt((Object) null, var3.field4334[var7]);
                                    arg0.method1691(0, (byte) 53);
                                }
                            } else {
                                Field var12 = (Field) var3.field4327[var7].field4843;
                                int var13 = var12.getInt((Object) null);
                                arg0.method1691(0, (byte) 53);
                                arg0.method1701(var13, 4994);
                            }
                            if (var8 != 3) {
                                if (var8 == 4) {
                                    Method var14 = (Method) var3.field4346[var7].field4843;
                                    int var15 = var14.getModifiers();
                                    arg0.method1691(0, (byte) 53);
                                    arg0.method1701(var15, 4994);
                                }
                            } else {
                                byte[][] var16 = var3.field4333[var7];
                                Object[] var17 = new Object[var16.length];
                                Method var18 = (Method) var3.field4346[var7].field4843;
                                for (int var19 = 0; ~var19 > ~var16.length; ++var19) {
                                    ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var16[var19]));
                                    var17[var19] = var20.readObject();
                                }
                                Object var21 = var18.invoke((Object) null, var17);
                                if (var21 == null) {
                                    arg0.method1691(0, (byte) 53);
                                } else if (var21 instanceof Number) {
                                    arg0.method1691(1, (byte) 53);
                                    arg0.method1699(((Number) var21).longValue(), 101);
                                } else if (!(var21 instanceof class99)) {
                                    arg0.method1691(4, (byte) 53);
                                } else {
                                    arg0.method1691(2, (byte) 53);
                                    arg0.method1725((class99) var21, 94);
                                }
                            }
                        } catch (ClassNotFoundException var22) {
                            arg0.method1691(-10, (byte) 53);
                        } catch (InvalidClassException var23) {
                            arg0.method1691(-11, (byte) 53);
                        } catch (StreamCorruptedException var24) {
                            arg0.method1691(-12, (byte) 53);
                        } catch (OptionalDataException var25) {
                            arg0.method1691(-13, (byte) 53);
                        } catch (IllegalAccessException var26) {
                            arg0.method1691(-14, (byte) 53);
                        } catch (IllegalArgumentException var27) {
                            arg0.method1691(-15, (byte) 53);
                        } catch (InvocationTargetException var28) {
                            arg0.method1691(-16, (byte) 53);
                        } catch (SecurityException var29) {
                            arg0.method1691(-17, (byte) 53);
                        } catch (IOException var30) {
                            arg0.method1691(-18, (byte) 53);
                        } catch (NullPointerException var31) {
                            arg0.method1691(-19, (byte) 53);
                        } catch (Exception var32) {
                            arg0.method1691(-20, (byte) 53);
                        } catch (Throwable var33) {
                            arg0.method1691(-21, (byte) 53);
                        }
                    }
                }
                arg0.method1731((byte) -123, var6);
                arg0.method1724(-var6 + arg0.field4587, (byte) 24);
                var3.method828((byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(ZI)V")
    public static final void method946(boolean arg0, int arg1) {
        if (arg1 != -5) {
            method944(29);
        }
        ++field2429;
        if (class200.field3473 != arg0) {
            class200.field3473 = arg0;
            class124.method820((byte) 108);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)[[I")
    public final int[][] method19(byte arg0, int arg1) {
        if (arg0 != -27) {
            method942(41, (byte) 116);
        }
        ++field2447;
        int[][] var3 = super.field3948.method1797(arg1, (byte) -124);
        if (super.field3948.field4791) {
            int[][] var4 = this.method1502(255, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; ~class234.field4046 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = var7[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var13 == var14) {
                    var10[var11] = this.field2426 * var12 >> 12;
                    var8[var11] = this.field2446 * var13 >> 12;
                    var9[var11] = this.field2443 * var14 >> 12;
                } else {
                    var10[var11] = this.field2426;
                    var8[var11] = this.field2446;
                    var9[var11] = this.field2443;
                }
            }
        }
        return var3;
    }
}
