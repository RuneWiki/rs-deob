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

@OriginalClass("client!gi")
public class class69 extends class177 {

    @OriginalMember(owner = "client!gi", name = "z", descriptor = "Lob;")
    public static class141 field1357 = class175.method1195(40, "auf einer freien Welt zu spielen)3");

    @OriginalMember(owner = "client!gi", name = "x", descriptor = "Lvc;")
    public static class212 field1355 = new class212(30);

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "Lob;")
    private static class141 field1364 = class175.method1195(40, "go back to the main RuneScape webpage");

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "Lob;")
    public static class141 field1362 = field1364;

    @OriginalMember(owner = "client!gi", name = "v", descriptor = "I")
    public static int field1353;

    @OriginalMember(owner = "client!gi", name = "w", descriptor = "I")
    public static int field1354;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "I")
    public static int field1358;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "I")
    public static int field1359;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    public static int field1360;

    @OriginalMember(owner = "client!gi", name = "y", descriptor = "Lt;")
    public static class189 field1356;

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "Lca;")
    public static class22 field1361;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "[Z")
    public static boolean[] field1363;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BILae;)V")
    public static final void method453(byte arg0, int arg1, class6 arg2) {
        if (arg0 != -69) {
            return;
        }
        field1358++;
        while (true) {
            class218 var3 = (class218) class49.field916.method1103((byte) -9);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field4133; var5++) {
                if (var3.field4137[var5] != null) {
                    if (var3.field4137[var5].field1089 == 2) {
                        var3.field4141[var5] = -5;
                    }
                    if (var3.field4137[var5].field1089 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field4144[var5] != null) {
                    if (var3.field4144[var5].field1089 == 2) {
                        var3.field4141[var5] = -6;
                    }
                    if (var3.field4144[var5].field1089 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg2.method32(arg1, 12885);
            arg2.method997(78, 0);
            int var6 = arg2.field2865;
            arg2.method970(var3.field4142, (byte) 90);
            for (int var7 = 0; var7 < var3.field4133; var7++) {
                if (var3.field4141[var7] == 0) {
                    try {
                        int var8 = var3.field4140[var7];
                        if (var8 == 0) {
                            Field var9 = (Field) var3.field4137[var7].field1090;
                            int var10 = var9.getInt(null);
                            arg2.method997(arg0 + 170, 0);
                            arg2.method970(var10, (byte) -119);
                        } else if (var8 == 1) {
                            Field var13 = (Field) var3.field4137[var7].field1090;
                            var13.setInt(null, var3.field4131[var7]);
                            arg2.method997(arg0 ^ 0xFFFFFFC7, 0);
                        } else if (var8 == 2) {
                            Field var11 = (Field) var3.field4137[var7].field1090;
                            int var12 = var11.getModifiers();
                            arg2.method997(127, 0);
                            arg2.method970(var12, (byte) -125);
                        }
                        if (var8 == 3) {
                            byte[][] var14 = var3.field4134[var7];
                            Method var15 = (Method) var3.field4144[var7].field1090;
                            Object[] var16 = new Object[var14.length];
                            for (int var17 = 0; var17 < var14.length; var17++) {
                                ObjectInputStream var18 = new ObjectInputStream(new ByteArrayInputStream(var14[var17]));
                                var16[var17] = var18.readObject();
                            }
                            Object var19 = var15.invoke(null, var16);
                            if (var19 == null) {
                                arg2.method997(94, 0);
                            } else if (var19 instanceof Number) {
                                arg2.method997(arg0 ^ 0xFFFFFFE6, 1);
                                arg2.method978(-127, ((Number) var19).longValue());
                            } else if (var19 instanceof class141) {
                                arg2.method997(87, 2);
                                arg2.method999((class141) var19, (byte) -95);
                            } else {
                                arg2.method997(95, 4);
                            }
                        } else if (var8 == 4) {
                            Method var20 = (Method) var3.field4144[var7].field1090;
                            int var21 = var20.getModifiers();
                            arg2.method997(arg0 ^ 0xFFFFFFCD, 0);
                            arg2.method970(var21, (byte) -128);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg2.method997(111, -10);
                    } catch (InvalidClassException var23) {
                        arg2.method997(125, -11);
                    } catch (StreamCorruptedException var24) {
                        arg2.method997(95, -12);
                    } catch (OptionalDataException var25) {
                        arg2.method997(arg0 ^ 0xFFFFFFC5, -13);
                    } catch (IllegalAccessException var26) {
                        arg2.method997(arg0 + 150, -14);
                    } catch (IllegalArgumentException var27) {
                        arg2.method997(69, -15);
                    } catch (InvocationTargetException var28) {
                        arg2.method997(111, -16);
                    } catch (SecurityException var29) {
                        arg2.method997(122, -17);
                    } catch (IOException var30) {
                        arg2.method997(70, -18);
                    } catch (NullPointerException var31) {
                        arg2.method997(100, -19);
                    } catch (Exception var32) {
                        arg2.method997(arg0 + 138, -20);
                    } catch (Throwable var33) {
                        arg2.method997(74, -21);
                    }
                } else {
                    arg2.method997(arg0 ^ 0xFFFFFFF0, var3.field4141[var7]);
                }
            }
            arg2.method993(var6, 48);
            arg2.method973(arg2.field2865 - var6, (byte) 17);
            var3.method1392(128);
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLna;)V")
    public static final void method454(byte arg0, class130 arg1) {
        field1360++;
        if (class87.field1739) {
            class47.method315(arg1, arg0 ^ 0x1F);
            return;
        }
        if (class164.field3170 == 1 && class81.field1630 >= 715 && class195.field3737 >= 453) {
            class138.field2648 = !class138.field2648;
            if (class138.field2648) {
                class187.method1245(100);
            } else {
                class4.method23(false, class54.field1076, true, class159.field3067, 0, 255);
            }
        }
        if (class161.field3132 == 5) {
            return;
        }
        class113.field2169++;
        if (class161.field3132 != 10) {
            return;
        }
        if (class142.field2747 != 2 && class147.field2875 == 0) {
            if (class164.field3170 == 1) {
                byte var2 = 5;
                short var3 = 463;
                byte var4 = 35;
                byte var5 = 100;
                if (var2 <= class81.field1630 && class81.field1630 <= var2 + var5 && class195.field3737 >= var3 && class195.field3737 <= var3 + var4) {
                    class109.method719(-25539);
                    return;
                }
            }
            if (class21.field354 != null) {
                class109.method719(arg0 ^ 0xFFFF9C21);
            }
        }
        int var6 = class164.field3170;
        int var7 = class81.field1630;
        int var8 = class195.field3737;
        if (arg0 != 28) {
            return;
        }
        if (class61.field1190 == 0) {
            short var17 = 291;
            short var18 = 302;
            if (var6 == 1 && var18 - 75 <= var7 && var7 <= var18 + 75 && var8 >= var17 - 20 && var8 <= var17 + 20) {
                class61.field1190 = 3;
                class216.field4122 = 0;
            }
            short var19 = 462;
            boolean var20 = false;
            if (class160.field3097 != 0) {
                while (class159.method1109(1)) {
                    if (class81.field1631 == 84) {
                        var20 = true;
                        break;
                    }
                }
            }
            if (var20 || var6 == 1 && var19 - 75 <= var7 && var7 <= var19 + 75 && var8 >= var17 - 20 && var17 + 20 >= var8) {
                class105.field2024 = class187.field3633;
                class216.field4122 = 0;
                class105.field2025 = class209.field3949;
                class105.field2019 = class209.field3967;
                class61.field1190 = 2;
            }
        } else if (class61.field1190 == 2) {
            short var11 = 231;
            int var21 = var11 + 30;
            short var12 = 321;
            if (var6 == 1 && var21 - 15 <= var8 && var8 < var21) {
                class216.field4122 = 0;
            }
            short var13 = 302;
            var21 += 15;
            if (var6 == 1 && var21 - 15 <= var8 && var21 > var8) {
                class216.field4122 = 1;
            }
            var21 += 15;
            if (var6 == 1 && var7 >= var13 - 75 && var7 <= var13 + 75 && var8 >= var12 - 20 && var8 <= var12 + 20) {
                class105.field2027 = class105.field2027.method925((byte) 34).method898(45);
                if (class105.field2027.method908(false) == 0) {
                    class21.method127(class209.field3936, class209.field3966, class113.field2167, (byte) -70);
                    return;
                }
                if (class105.field2021.method908(false) == 0) {
                    class21.method127(class209.field3959, class209.field3954, class62.field1216, (byte) -70);
                    return;
                }
                class21.method127(class209.field3956, class209.field3957, class166.field3212, (byte) -70);
                class156.method1086(20, (byte) -67);
                return;
            }
            short var14 = 462;
            if (var6 == 1 && var14 - 75 <= var7 && var14 + 75 >= var7 && var12 - 20 <= var8 && var8 <= var12 + 20) {
                class61.field1190 = 0;
                class105.field2021 = class105.field2020;
                class105.field2027 = class105.field2020;
            }
            while (true) {
                boolean var15;
                label207: do {
                    while (class159.method1109(1)) {
                        var15 = false;
                        for (int var16 = 0; var16 < class135.field2581.method908(false); var16++) {
                            if (class179.field3528 == class135.field2581.method900(126, var16)) {
                                var15 = true;
                                break;
                            }
                        }
                        if (class216.field4122 != 0) {
                            continue label207;
                        }
                        if (class81.field1631 == 85 && class105.field2027.method908(false) > 0) {
                            class105.field2027 = class105.field2027.method902(class105.field2027.method908(false) - 1, 0, (byte) 57);
                        }
                        if (class81.field1631 == 84 || class81.field1631 == 80) {
                            class216.field4122 = 1;
                        }
                        if (var15 && class105.field2027.method908(false) < 12) {
                            class105.field2027 = class105.field2027.method912(class179.field3528, -94);
                        }
                    }
                    return;
                } while (class216.field4122 != 1);
                if (class81.field1631 == 85 && class105.field2021.method908(false) > 0) {
                    class105.field2021 = class105.field2021.method902(class105.field2021.method908(false) - 1, 0, (byte) 74);
                }
                if (class81.field1631 == 84 || class81.field1631 == 80) {
                    class216.field4122 = 0;
                }
                if (class160.field3097 != 0 && class81.field1631 == 84) {
                    class105.field2027 = class105.field2027.method925((byte) 34).method898(88);
                    if (class105.field2027.method908(false) == 0) {
                        class21.method127(class209.field3936, class209.field3966, class113.field2167, (byte) -70);
                        return;
                    }
                    if (class105.field2021.method908(false) == 0) {
                        class21.method127(class209.field3959, class209.field3954, class62.field1216, (byte) -70);
                        return;
                    }
                    class21.method127(class209.field3956, class209.field3957, class166.field3212, (byte) -70);
                    class156.method1086(20, (byte) 112);
                    return;
                }
                if (var15 && class105.field2021.method908(false) < 20) {
                    class105.field2021 = class105.field2021.method912(class179.field3528, arg0 ^ 0xFFFFFF99);
                }
            }
        } else if (class61.field1190 == 3) {
            short var9 = 321;
            short var10 = 382;
            if (var6 == 1 && var7 >= var10 - 75 && var10 + 75 >= var7 && var9 - 20 <= var8 && var9 + 20 >= var8) {
                class61.field1190 = 0;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BI)V")
    public static final void method455(byte arg0, int arg1) {
        class130.method827((byte) -50);
        field1353++;
        class100.method659((byte) -65);
        int var2 = class163.method1133(false, arg1).field3435;
        if (arg0 >= -71 || var2 == 0) {
            return;
        }
        int var3 = class180.field3538[arg1];
        if (var2 == 1) {
            class221.field4182 = var3;
            if (class221.field4182 == 1) {
                class44.method281(0.9F);
            }
            if (class221.field4182 == 2) {
                class44.method281(0.8F);
            }
            if (class221.field4182 == 3) {
                class44.method281(0.7F);
            }
            if (class221.field4182 == 4) {
                class44.method281(0.6F);
            }
            class62.method416(255);
        }
        if (var2 == 3) {
            short var4 = 0;
            if (var3 == 0) {
                var4 = 255;
            }
            if (var3 == 1) {
                var4 = 192;
            }
            if (var3 == 2) {
                var4 = 128;
            }
            if (var3 == 3) {
                var4 = 64;
            }
            if (var3 == 4) {
                var4 = 0;
            }
            if (class14.field263 != var4) {
                if (class14.field263 == 0 && class182.field3579 != -1) {
                    class4.method23(false, class182.field3579, true, class159.field3067, 0, var4);
                    class118.field2305 = false;
                } else if (var4 == 0) {
                    class187.method1245(-114);
                    class118.field2305 = false;
                } else {
                    class5.method28(0, var4);
                }
                class14.field263 = var4;
            }
        }
        if (var2 == 4) {
            if (var3 == 0) {
                class30.field580 = 127;
            }
            if (var3 == 1) {
                class30.field580 = 96;
            }
            if (var3 == 2) {
                class30.field580 = 64;
            }
            if (var3 == 3) {
                class30.field580 = 32;
            }
            if (var3 == 4) {
                class30.field580 = 0;
            }
        }
        if (var2 == 10) {
            if (var3 == 0) {
                class165.field3202 = 127;
            }
            if (var3 == 1) {
                class165.field3202 = 96;
            }
            if (var3 == 2) {
                class165.field3202 = 64;
            }
            if (var3 == 3) {
                class165.field3202 = 32;
            }
            if (var3 == 4) {
                class165.field3202 = 0;
            }
        }
        if (var2 == 6) {
            class94.field1877 = var3;
        }
        if (var2 == 9) {
            class178.field3507 = var3;
        }
        if (var2 == 5) {
            class146.field2835 = var3;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public static void method456(byte arg0) {
        field1364 = null;
        if (arg0 > -74) {
            method456((byte) 3);
        }
        field1362 = null;
        field1363 = null;
        field1356 = null;
        field1357 = null;
        field1355 = null;
        field1361 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(Lob;ILpe;Lpe;Lob;)Li;")
    public static final class80 method457(class141 arg0, int arg1, class154 arg2, class154 arg3, class141 arg4) {
        if (arg1 == -20) {
            field1359++;
            int var5 = arg3.method1071((byte) -115, arg0);
            int var6 = arg3.method1059(var5, true, arg4);
            return class220.method1423(arg3, arg2, var5, -102, var6);
        } else {
            return null;
        }
    }
}
