import java.awt.Component;
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

@OriginalClass("client!lg")
public class class13 extends class172 {

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "Lid;")
    private class149 field173 = class1.field4;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "S")
    public static short field172 = 205;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "Lid;")
    public static class149 field174 = class60.method382("0", (byte) 40);

    @OriginalMember(owner = "client!lg", name = "N", descriptor = "Lid;")
    public static class149 field179 = class60.method382("settings=", (byte) 49);

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "Lid;")
    public static class149 field171 = class60.method382("(U5", (byte) 45);

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!lg", name = "D", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field175;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!lg", name = "L", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!lg", name = "M", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!lg", name = "P", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!lg", name = "Q", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!lg", name = "R", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!lg", name = "S", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!lg", name = "T", descriptor = "I")
    public static int field184;

    @OriginalMember(owner = "client!lg", name = "V", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!lg", name = "W", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!lg", name = "X", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!lg", name = "Y", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!lg", name = "Z", descriptor = "I")
    public int field190;

    @OriginalMember(owner = "client!lg", name = "ab", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!lg", name = "bb", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!lg", name = "B", descriptor = "Lnc;")
    private class85 field167;

    @OriginalMember(owner = "client!lg", name = "U", descriptor = "Lnc;")
    public class85 field185;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "[[[B")
    public static byte[][][] field166;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILbe;Z)V")
    public static final void method71(int arg0, class28 arg1, boolean arg2) {
        if (!arg2) {
            return;
        }
        field184++;
        while (true) {
            class147 var3 = (class147) class176.field3218.method1140(0);
            if (var3 == null) {
                return;
            }
            boolean var4 = false;
            for (int var5 = 0; var5 < var3.field2656; var5++) {
                if (var3.field2648[var5] != null) {
                    if (var3.field2648[var5].field3358 == 2) {
                        var3.field2644[var5] = -5;
                    }
                    if (var3.field2648[var5].field3358 == 0) {
                        var4 = true;
                    }
                }
                if (var3.field2642[var5] != null) {
                    if (var3.field2642[var5].field3358 == 2) {
                        var3.field2644[var5] = -6;
                    }
                    if (var3.field2642[var5].field3358 == 0) {
                        var4 = true;
                    }
                }
            }
            if (var4) {
                return;
            }
            arg1.method162(2, arg0);
            arg1.method494((byte) 4, 0);
            int var6 = arg1.field1340;
            arg1.method517(var3.field2654, 118);
            for (int var7 = 0; var7 < var3.field2656; var7++) {
                if (var3.field2644[var7] == 0) {
                    try {
                        int var8 = var3.field2649[var7];
                        if (var8 == 0) {
                            Field var12 = (Field) var3.field2648[var7].field3357;
                            int var13 = var12.getInt((Object) null);
                            arg1.method494((byte) 4, 0);
                            arg1.method517(var13, 121);
                        } else if (var8 == 1) {
                            Field var11 = (Field) var3.field2648[var7].field3357;
                            var11.setInt((Object) null, var3.field2643[var7]);
                            arg1.method494((byte) 4, 0);
                        } else if (var8 == 2) {
                            Field var9 = (Field) var3.field2648[var7].field3357;
                            int var10 = var9.getModifiers();
                            arg1.method494((byte) 4, 0);
                            arg1.method517(var10, 117);
                        }
                        if (var8 == 3) {
                            Method var16 = (Method) var3.field2642[var7].field3357;
                            byte[][] var17 = var3.field2647[var7];
                            Object[] var18 = new Object[var17.length];
                            for (int var19 = 0; var19 < var17.length; var19++) {
                                ObjectInputStream var20 = new ObjectInputStream(new ByteArrayInputStream(var17[var19]));
                                var18[var19] = var20.readObject();
                            }
                            Object var21 = var16.invoke((Object) null, var18);
                            if (var21 == null) {
                                arg1.method494((byte) 4, 0);
                            } else if ((var21 instanceof Number)) {
                                arg1.method494((byte) 4, 1);
                                arg1.method496(2, ((Number) var21).longValue());
                            } else if (var21 instanceof class149) {
                                arg1.method494((byte) 4, 2);
                                arg1.method523((class149) var21, (byte) 0);
                            } else {
                                arg1.method494((byte) 4, 4);
                            }
                        } else if (var8 == 4) {
                            Method var14 = (Method) var3.field2642[var7].field3357;
                            int var15 = var14.getModifiers();
                            arg1.method494((byte) 4, 0);
                            arg1.method517(var15, 122);
                        }
                    } catch (ClassNotFoundException var22) {
                        arg1.method494((byte) 4, -10);
                    } catch (InvalidClassException var23) {
                        arg1.method494((byte) 4, -11);
                    } catch (StreamCorruptedException var24) {
                        arg1.method494((byte) 4, -12);
                    } catch (OptionalDataException var25) {
                        arg1.method494((byte) 4, -13);
                    } catch (IllegalAccessException var26) {
                        arg1.method494((byte) 4, -14);
                    } catch (IllegalArgumentException var27) {
                        arg1.method494((byte) 4, -15);
                    } catch (InvocationTargetException var28) {
                        arg1.method494((byte) 4, -16);
                    } catch (SecurityException var29) {
                        arg1.method494((byte) 4, -17);
                    } catch (IOException var30) {
                        arg1.method494((byte) 4, -18);
                    } catch (NullPointerException var31) {
                        arg1.method494((byte) 4, -19);
                    } catch (Exception var32) {
                        arg1.method494((byte) 4, -20);
                    } catch (Throwable var33) {
                        arg1.method494((byte) 4, -21);
                    }
                } else {
                    arg1.method494((byte) 4, var3.field2644[var7]);
                }
            }
            arg1.method532((byte) 122, var6);
            arg1.method521(125, arg1.field1340 - var6);
            var3.method401((byte) -118);
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(B)V")
    private final void method72(byte arg0) {
        int var2 = -80 / ((arg0 - 66) / 38);
        field189++;
        this.field167 = new class85(this.field185.method632(-1));
        for (class15 var3 = (class15) this.field185.method633((byte) 74); var3 != null; var3 = (class15) this.field185.method630(11)) {
            class57 var4 = new class57(var3.field216, (int) var3.field1148);
            this.field167.method638((byte) -89, var4, var3.field216.method1026(111));
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BI)I")
    public static final int method73(byte arg0, int arg1) {
        field170++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) (arg1 & 0xFF) / 256.0D;
        double var6 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var8 = var2;
        double var10 = var2;
        if (arg0 != -117) {
            method86(-3, -10);
        }
        if (var2 > var6) {
            var10 = var6;
        }
        if (var4 < var10) {
            var10 = var4;
        }
        if (var2 < var6) {
            var8 = var6;
        }
        if (var8 < var4) {
            var8 = var4;
        }
        double var12 = 0.0D;
        double var14 = (var8 + var10) / 2.0D;
        double var16 = 0.0D;
        int var18 = (int) (var14 * 256.0D);
        if (var8 != var10) {
            if (var2 == var8) {
                var16 = (var6 - var4) / (var8 - var10);
            } else if (var6 == var8) {
                var16 = (var4 - var2) / (var8 - var10) + 2.0D;
            } else if (var4 == var8) {
                var16 = (var2 - var6) / (var8 - var10) + 4.0D;
            }
            if (var14 < 0.5D) {
                var12 = (var8 - var10) / (var8 + var10);
            }
            if (var14 >= 0.5D) {
                var12 = (var8 - var10) / (2.0D - var8 - var10);
            }
        }
        if (var18 < 0) {
            var18 = 0;
        } else if (var18 > 255) {
            var18 = 255;
        }
        double var19 = var16 / 6.0D;
        int var21 = (int) (var12 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        if (var18 > 243) {
            var21 >>= 0x4;
        } else if (var18 > 217) {
            var21 >>= 0x3;
        } else if (var18 > 192) {
            var21 >>= 0x2;
        } else if (var18 > 179) {
            var21 >>= 0x1;
        }
        int var22 = (int) (var19 * 256.0D);
        return (var21 >> 5 << 7) + (var22 >> 2 << 10) + (var18 >> 1);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(Z)V")
    public static final void method74(boolean arg0) {
        field169++;
        if (class269.field4848 == null) {
            return;
        }
        if (class260.field4581 < 10) {
            if (!class19.field291.method1529(256, class269.field4848.field363)) {
                class260.field4581 = class169.field3133.method1537(class269.field4848.field363, -19579) / 10;
                return;
            }
            class82.method613(-98);
            class260.field4581 = 10;
        }
        if (class260.field4581 == 10) {
            class80.field1480 = class269.field4848.field352 >> 6 << 6;
            class62.field1121 = (class269.field4848.field349 >> 6 << 6) + 64 - class80.field1480;
            if (class269.field4848.field351 == 37) {
                class11.field156 = 3.0F;
                class199.field3616 = 3.0F;
            } else if (class269.field4848.field351 == 50) {
                class11.field156 = 4.0F;
                class199.field3616 = 4.0F;
            } else if (class269.field4848.field351 == 75) {
                class11.field156 = 6.0F;
                class199.field3616 = 6.0F;
            } else if (class269.field4848.field351 == 100) {
                class11.field156 = 8.0F;
                class199.field3616 = 8.0F;
            } else if (class269.field4848.field351 == 200) {
                class11.field156 = 16.0F;
                class199.field3616 = 16.0F;
            } else {
                class11.field156 = 8.0F;
                class199.field3616 = 8.0F;
            }
            class91.field1615 = class269.field4848.field366 >> 6 << 6;
            int var1 = class125.field2199 + (class77.field1449.field2347 >> 7) - class80.field1480;
            int var2 = var1 + ((int) (Math.random() * 10.0D) - 5);
            class287.field5086 = (class269.field4848.field370 >> 6 << 6) + 64 - class91.field1615;
            int var3 = class287.field5086 + class91.field1615 - class115.field1969 - (class77.field1449.field2340 >> 7) - 1;
            int var4 = var3 + ((int) (Math.random() * 10.0D) - 5);
            if (var2 >= 0 && class62.field1121 > var2 && var4 >= 0 && var4 < class287.field5086) {
                class106.field1840 = var2;
                class163.field3019 = var4;
            } else {
                class163.field3019 = class91.field1615 + class287.field5086 - (class269.field4848.field361 * 64) - 1;
                class106.field1840 = class269.field4848.field360 * 64 - class80.field1480;
            }
            class197.method1346(98);
            int var5 = class198.field3607 >> 1;
            int var6 = class62.field1115 >> 2 << 10;
            int var7 = class62.field1121 >> 6;
            int var8 = class287.field5086 >> 6;
            class264.field4704 = new byte[var7][var8][];
            class118.field2026 = new byte[var7][var8][];
            class228.field3992 = new byte[var7][var8][];
            class86.field1564 = new int[var7][var8][];
            class68.field1189 = new byte[var7][var8][];
            class213.field3777 = new int[class83.field1517 + 1];
            class147.field2661 = new int[var7][var8][];
            class240.field4192 = new byte[var7][var8][];
            class69.field1218 = new int[var7][var8][];
            class25.method143(var6, var5, 122);
            class260.field4581 = 20;
        } else if (class260.field4581 == 20) {
            class219.method1482(new class74(class19.field291.method1540(122, class17.field255, class269.field4848.field363)), 63);
            class260.field4581 = 30;
            class78.method595(true, 118);
            class182.method1266(28028);
        } else if (class260.field4581 == 30) {
            class210.method1433(new class74(class19.field291.method1540(127, class69.field1223, class269.field4848.field363)), -1276586906);
            class260.field4581 = 40;
            class182.method1266(28028);
        } else if (class260.field4581 == 40) {
            class61.method387((byte) -82, new class74(class19.field291.method1540(123, class26.field388, class269.field4848.field363)));
            class260.field4581 = 50;
            class182.method1266(28028);
        } else if (class260.field4581 == 50) {
            class49.method314(81, new class74(class19.field291.method1540(118, class261.field4669, class269.field4848.field363)));
            class260.field4581 = 60;
            class78.method595(true, -124);
            class182.method1266(28028);
        } else if (class260.field4581 == 60) {
            if (class19.field291.method1532(class237.method1603(new class149[] { class269.field4848.field363, class277.field4949 }, -97), 0)) {
                if (!class19.field291.method1529(256, class237.method1603(new class149[] { class269.field4848.field363, class277.field4949 }, -104))) {
                    return;
                }
                class168.field3120 = class255.method1760(12447, class237.method1603(new class149[] { class269.field4848.field363, class277.field4949 }, -101), class19.field291);
            } else {
                class168.field3120 = new class278(0);
            }
            class260.field4581 = 70;
            class182.method1266(28028);
        } else if (class260.field4581 == 70) {
            class82.field1508 = new class225(11, true, class244.field4295);
            class260.field4581 = 73;
            class78.method595(true, -125);
            class182.method1266(28028);
        } else if (class260.field4581 == 73) {
            class9.field129 = new class225(12, true, class244.field4295);
            class260.field4581 = 76;
            class78.method595(true, 11);
            class182.method1266(28028);
        } else if (class260.field4581 == 76) {
            class224.field3938 = new class225(14, true, class244.field4295);
            class260.field4581 = 79;
            class78.method595(true, -127);
            class182.method1266(28028);
        } else if (class260.field4581 == 79) {
            class267.field4754 = new class225(17, true, class244.field4295);
            class260.field4581 = 82;
            class78.method595(true, -122);
            class182.method1266(28028);
        } else if (class260.field4581 == 82) {
            class151.field2755 = new class225(19, true, class244.field4295);
            class260.field4581 = 85;
            class78.method595(true, 126);
            class182.method1266(28028);
        } else if (class260.field4581 == 85) {
            class197.field3583 = new class225(22, true, class244.field4295);
            class260.field4581 = 88;
            class78.method595(true, 68);
            class182.method1266(28028);
        } else if (class260.field4581 == 88) {
            class287.field5116 = new class225(26, true, class244.field4295);
            class260.field4581 = 91;
            class78.method595(true, 122);
            class182.method1266(28028);
        } else {
            class71.field1247 = new class225(30, arg0, class244.field4295);
            class260.field4581 = 100;
            class78.method595(true, -122);
            class182.method1266(28028);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLid;)Z")
    public final boolean method75(boolean arg0, class149 arg1) {
        field187++;
        if (this.field185 == null) {
            return false;
        }
        if (this.field167 == null) {
            this.method72((byte) 127);
        }
        if (!arg0) {
            this.field167 = null;
        }
        for (class57 var3 = (class57) this.field167.method639((byte) -19, arg1.method1026(124)); var3 != null; var3 = (class57) this.field167.method627((byte) -75)) {
            if (var3.field1002.method1041((byte) -113, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILgd;)V")
    public static final void method76(int arg0, class74 arg1) {
        field181++;
        int var2 = arg1.method512(-116);
        class61.field1096 = new class99[var2];
        int var3 = 89 % ((35 - arg0) / 52);
        for (int var4 = 0; var4 < var2; var4++) {
            class61.field1096[var4] = new class99();
            class61.field1096[var4].field1752 = arg1.method512(-71);
            class61.field1096[var4].field1760 = arg1.method533(true);
        }
        class78.field1461 = arg1.method512(-76);
        class140.field2551 = arg1.method512(-100);
        class18.field262 = arg1.method512(-126);
        class61.field1101 = new class208[class140.field2551 + 1 - class78.field1461];
        for (int var5 = 0; var5 < class18.field262; var5++) {
            int var6 = arg1.method512(-46);
            class208 var7 = class61.field1101[var6] = new class208();
            var7.field4477 = arg1.method489((byte) 105);
            var7.field4485 = arg1.method498((byte) 127);
            var7.field3721 = var6 + class78.field1461;
            var7.field3723 = arg1.method533(true);
            var7.field3728 = arg1.method533(true);
        }
        class151.field2756 = arg1.method498((byte) 127);
        class237.field4149 = true;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lgd;I)V")
    public final void method77(class74 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method489((byte) -45);
            if (var3 == 0) {
                int var4 = 22 / ((-arg1 - 55) / 47);
                field175++;
                return;
            }
            this.method79(var3, arg0, (byte) 13);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILfb;IILjava/awt/Component;)Ldg;")
    public static final class140 method78(int arg0, class29 arg1, int arg2, int arg3, Component arg4) {
        field180++;
        if (class113.field1937 == 0) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && arg2 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class140 var5 = (class140) Class.forName("ua").getDeclaredConstructor().newInstance();
                if (arg3 != -9634) {
                    return null;
                }
                var5.field2589 = arg0;
                var5.field2557 = new int[(class17.field256 ? 2 : 1) * 256];
                var5.method357(arg4);
                var5.field2581 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field2581 > 16384) {
                    var5.field2581 = 16384;
                }
                var5.method359(var5.field2581);
                if (class155.field2842 > 0 && class172.field3176 == null) {
                    class172.field3176 = new class79();
                    class172.field3176.field1466 = arg1;
                    arg1.method175(2, class172.field3176, class155.field2842);
                }
                if (class172.field3176 != null) {
                    if (class172.field3176.field1477[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class172.field3176.field1477[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class58 var6 = new class58(arg1, arg2);
                    var6.field2589 = arg0;
                    var6.field2557 = new int[(class17.field256 ? 2 : 1) * 256];
                    var6.method357(arg4);
                    var6.field2581 = 16384;
                    var6.method359(var6.field2581);
                    if (class155.field2842 > 0 && class172.field3176 == null) {
                        class172.field3176 = new class79();
                        class172.field3176.field1466 = arg1;
                        arg1.method175(2, class172.field3176, class155.field2842);
                    }
                    if (class172.field3176 != null) {
                        if (class172.field3176.field1477[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class172.field3176.field1477[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class140();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILgd;B)V")
    private final void method79(int arg0, class74 arg1, byte arg2) {
        field168++;
        if (arg2 != 13) {
            return;
        }
        if (arg0 == 1) {
            this.field182 = arg1.method489((byte) -125);
        } else if (arg0 == 2) {
            this.field190 = arg1.method489((byte) -63);
        } else if (arg0 == 3) {
            this.field173 = arg1.method529(arg2 - 14);
        } else if (arg0 == 4) {
            this.field191 = arg1.method498((byte) 125);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method485(-2386);
            this.field185 = new class85(class5.method30(113, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method498((byte) 127);
                class64 var7;
                if (arg0 == 5) {
                    var7 = new class15(arg1.method529(-1));
                } else {
                    var7 = new class143(arg1.method498((byte) 126));
                }
                this.field185.method638((byte) -89, var7, (long) var6);
            }
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)I")
    public final int method80(int arg0, int arg1) {
        field183++;
        if (this.field185 == null) {
            return this.field191;
        } else {
            int var3 = -36 % ((arg1 - 53) / 51);
            class143 var4 = (class143) this.field185.method639((byte) -22, (long) arg0);
            return var4 == null ? this.field191 : var4.field2606;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(IIIBI)V")
    public static final void method81(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class163.field3019 = class287.field5086 * arg1 / arg4;
        class106.field1840 = class62.field1121 * arg2 / arg0;
        class129.field2285 = -1;
        class65.field1159 = -1;
        class197.method1346(98);
        field192++;
        if (arg3 != -91) {
            field171 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(B)V")
    private final void method82(byte arg0) {
        field177++;
        this.field167 = new class85(this.field185.method632(-1));
        class143 var2 = (class143) this.field185.method633((byte) 93);
        if (arg0 != 23) {
            return;
        }
        while (var2 != null) {
            class143 var3 = new class143((int) var2.field1148);
            this.field167.method638((byte) -89, var3, (long) var2.field2606);
            var2 = (class143) this.field185.method630(11);
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lid;Lid;II)V")
    public static final void method83(class149 arg0, class149 arg1, int arg2, int arg3) {
        field176++;
        class14.field208 = arg2;
        class171.field3155 = arg0;
        class171.field3154 = arg1;
        if (class171.field3155.method1041((byte) -96, class171.field3158) || class171.field3154.method1041((byte) -55, class171.field3158)) {
            class140.field2558 = 3;
        } else if (class147.field2652 == -1) {
            class140.field2558 = -3;
            class244.field4292 = 1;
            class276.field4929 = 0;
            class177.field3232 = 0;
            class74 var4 = new class74(128);
            var4.method494((byte) 4, 10);
            var4.method518(16711680, (int) (Math.random() * 99999.0D));
            var4.method518(16711680, 530);
            var4.method496(2, class171.field3155.method1023((byte) -16));
            var4.method517((int) (Math.random() * 9.9999999E7D), 121);
            var4.method523(class171.field3154, (byte) 0);
            var4.method517((int) (Math.random() * 9.9999999E7D), 118);
            var4.method480(class92.field1631, (byte) 108, class264.field4723);
            class208.field3720.field1340 = arg3;
            class208.field3720.method494((byte) 4, 210);
            class208.field3720.method494((byte) 4, var4.field1340);
            class208.field3720.method490(arg3 ^ 0x7D, var4.field1321, var4.field1340, 0);
        } else {
            class255.method1758(0);
        }
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(II)Lid;")
    public final class149 method84(int arg0, int arg1) {
        field178++;
        if (arg0 <= 28) {
            return null;
        } else if (this.field185 == null) {
            return this.field173;
        } else {
            class15 var3 = (class15) this.field185.method639((byte) -63, (long) arg1);
            return var3 == null ? this.field173 : var3.field216;
        }
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(I)V")
    public static void method85(int arg0) {
        field179 = null;
        field166 = null;
        field171 = null;
        if (arg0 != 40) {
            method73((byte) -103, -95);
        }
        field174 = null;
    }

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "(II)V")
    public static final void method86(int arg0, int arg1) {
        field188++;
        class137.field2508 = 1000 / arg0;
        if (arg1 != 14210) {
            field171 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "(II)Z")
    public final boolean method87(int arg0, int arg1) {
        field186++;
        if (this.field185 == null) {
            return false;
        }
        if (this.field167 == null) {
            this.method82((byte) 23);
        }
        class143 var3 = (class143) this.field167.method639((byte) -29, (long) arg1);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 != -1) {
                method78(-17, (class29) null, 77, -49, (Component) null);
            }
            return true;
        }
    }
}
