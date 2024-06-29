import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class150 extends class81 {

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lrd;")
    public static class173 field2847 = class133.method843("Die Verbindung konnte", -115);

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lrd;")
    public static class173 field2849 = null;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "D")
    public static double field2853 = -1.0D;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lqc;")
    public static class162 field2851;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lqc;ZLqc;)V")
    public static final void method985(class162 arg0, boolean arg1, class162 arg2) {
        if (class24.field521 == null) {
            class24.field521 = class144.method908(class67.field1304, 4413, class145.field2700, 0);
        }
        field2854++;
        if (class163.field3009 == null) {
            class163.field3009 = class60.method381(-42, class176.field3452, 0, class145.field2700);
        }
        if (!arg1) {
            method985(null, true, null);
        }
        if (class173.field3368 == null) {
            class173.field3368 = class60.method381(-94, class87.field1707, 0, class145.field2700);
        }
        if (class152.field2875 == null) {
            class152.field2875 = class60.method381(-92, class207.field4033, 0, class145.field2700);
        }
        class27.method219(0, 23, 765, 480, 0);
        class27.method204(0, 0, 125, 23, 12425273, 9135624);
        class27.method204(125, 0, 640, 23, 5197647, 2697513);
        arg0.method543(class26.field549, 62, 15, 0, -1);
        if (class152.field2875 != null) {
            class152.field2875[1].method291(140, 1);
            arg2.method534(class41.field842, 152, 10, 16777215, -1);
            class152.field2875[0].method291(140, 12);
            arg2.method534(class160.field2987, 152, 21, 16777215, -1);
        }
        if (class173.field3368 != null) {
            short var3 = 500;
            short var4 = 280;
            if (class161.field3002[0] == 0 && class149.field2839[0] == 0) {
                class173.field3368[2].method291(var4, 4);
            } else {
                class173.field3368[0].method291(var4, 4);
            }
            short var5 = 390;
            if (class161.field3002[0] == 0 && class149.field2839[0] == 1) {
                class173.field3368[3].method291(var4 + 15, 4);
            } else {
                class173.field3368[1].method291(var4 + 15, 4);
            }
            arg0.method534(class103.field1922, var4 + 32, 17, 16777215, -1);
            short var6 = 610;
            if (class161.field3002[0] == 1 && class149.field2839[0] == 0) {
                class173.field3368[2].method291(var5, 4);
            } else {
                class173.field3368[0].method291(var5, 4);
            }
            if (class161.field3002[0] == 1 && class149.field2839[0] == 1) {
                class173.field3368[3].method291(var5 + 15, 4);
            } else {
                class173.field3368[1].method291(var5 + 15, 4);
            }
            arg0.method534(class168.field3236, var5 + 32, 17, 16777215, -1);
            if (class161.field3002[0] == 2 && class149.field2839[0] == 0) {
                class173.field3368[2].method291(var3, 4);
            } else {
                class173.field3368[0].method291(var3, 4);
            }
            if (class161.field3002[0] == 2 && class149.field2839[0] == 1) {
                class173.field3368[3].method291(var3 + 15, 4);
            } else {
                class173.field3368[1].method291(var3 + 15, 4);
            }
            arg0.method534(class147.field2819, var3 + 32, 17, 16777215, -1);
            if (class161.field3002[0] == 3 && class149.field2839[0] == 0) {
                class173.field3368[2].method291(var6, 4);
            } else {
                class173.field3368[0].method291(var6, 4);
            }
            if (class161.field3002[0] == 3 && class149.field2839[0] == 1) {
                class173.field3368[3].method291(var6 + 15, 4);
            } else {
                class173.field3368[1].method291(var6 + 15, 4);
            }
            arg0.method534(class124.field2332, var6 + 32, 17, 16777215, -1);
        }
        class27.method219(708, 4, 50, 16, 0);
        arg2.method543(class203.field3963, 733, 16, 16777215, -1);
        class100.field1833 = -1;
        if (class24.field521 == null) {
            return;
        }
        byte var7 = 88;
        byte var8 = 19;
        int var9 = 765 / (var7 + 1);
        int var10 = 480 / (var8 + 1);
        int var11;
        int var12;
        do {
            var11 = var10;
            var12 = var9;
            if ((var9 - 1) * var10 >= class112.field2079) {
                var9--;
            }
            if (class112.field2079 <= (var10 - 1) * var9) {
                var10--;
            }
            if (class112.field2079 <= (var10 - 1) * var9) {
                var10--;
            }
        } while (var10 != var11 || var9 != var12);
        int var13 = (480 - var8 * var10) / (var10 - -1);
        if (var13 > 5) {
            var13 = 5;
        }
        int var14 = (765 - var7 * var9) / (var9 + 1);
        int var15 = (480 - (var10 - 1) * var13 - var8 * var10) / 2;
        int var16 = 0;
        if (var14 > 5) {
            var14 = 5;
        }
        int var17 = var15 + 23;
        int var18 = (765 - var7 * var9 - (var9 + -1) * var14) / 2;
        int var19 = var18;
        for (int var20 = 0; var20 < class112.field2079; var20++) {
            boolean var21 = true;
            class40 var22 = class198.field3861[var20];
            class173 var23 = class93.method588(var22.field832, true);
            if (var22.field832 == -1) {
                var23 = class169.field3269;
                var21 = false;
            } else if (var22.field832 > 1980) {
                var21 = false;
                var23 = class12.field190;
            }
            if (var19 <= class214.field4154 && class4.field72 >= var17 && var7 + var19 > class214.field4154 && var8 + var17 > class4.field72 && var21) {
                class100.field1833 = var20;
                class24.field521[var22.field834 ? 1 : 0].method1230(var19, var17, 128, 16777215);
            } else {
                class24.field521[var22.field834 ? 1 : 0].method1226(var19, var17);
            }
            if (class163.field3009 != null) {
                class163.field3009[(var22.field834 ? 8 : 0) + var22.field825].method291(var19 + 29, var17);
            }
            arg0.method543(class93.method588(var22.field822, true), var19 + 15, var8 / 2 + var17 - -5, 0, -1);
            arg2.method543(var23, var19 + 60, var8 / 2 + 5 + var17, 268435455, -1);
            var17 += var8 + var13;
            var16++;
            if (var16 >= var10) {
                var16 = 0;
                var17 = var15 + 23;
                var19 += var7 + var14;
            }
        }
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public static void method986(int arg0) {
        field2847 = null;
        field2849 = null;
        field2851 = null;
        if (arg0 != 765) {
            field2847 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(I)Z")
    public static final boolean method987(int arg0) {
        long var1 = class97.method599(5);
        if (arg0 != 12820) {
            method986(48);
        }
        int var3 = (int) (var1 - class189.field3686);
        field2848++;
        if (var3 > 200) {
            var3 = 200;
        }
        class189.field3686 = var1;
        class184.field3605 += var3;
        if (class211.field4092 == 0 && class52.field1063 == 0 && class105.field1968 == 0 && class48.field1028 == 0) {
            return true;
        } else if (class99.field1809 == null) {
            return false;
        } else {
            try {
                if (class184.field3605 > 30000) {
                    throw new IOException();
                }
                while (class52.field1063 < 20 && class48.field1028 > 0) {
                    class220 var4 = (class220) class106.field1976.method684((byte) -76);
                    class121 var5 = new class121(4);
                    var5.method752(1, (byte) -128);
                    var5.method740((int) var4.field2437, (byte) -91);
                    class99.field1809.method1097(0, var5.field2218, 4, (byte) -84);
                    class121.field2275.method675(var4.field2437, var4, false);
                    class52.field1063++;
                    class48.field1028--;
                }
                while (class211.field4092 < 20 && class105.field1968 > 0) {
                    class220 var6 = (class220) class161.field2991.method720(0);
                    class121 var7 = new class121(4);
                    var7.method752(0, (byte) -128);
                    var7.method740((int) var6.field2437, (byte) -91);
                    class99.field1809.method1097(0, var7.field2218, 4, (byte) -84);
                    var6.method236((byte) 120);
                    class196.field3811.method675(var6.field2437, var6, false);
                    class211.field4092++;
                    class105.field1968--;
                }
                for (int var8 = 0; var8 < 100; var8++) {
                    int var9 = class99.field1809.method1094(0);
                    if (var9 < 0) {
                        throw new IOException();
                    }
                    if (var9 == 0) {
                        break;
                    }
                    class184.field3605 = 0;
                    byte var10 = 0;
                    if (class149.field2846 == null) {
                        var10 = 8;
                    } else if (class75.field1484 == 0) {
                        var10 = 1;
                    }
                    if (var10 > 0) {
                        int var11 = var10 - class174.field3427.field2222;
                        if (var11 > var9) {
                            var11 = var9;
                        }
                        class99.field1809.method1093(var11, class174.field3427.field2222, (byte) -5, class174.field3427.field2218);
                        if (class25.field529 != 0) {
                            for (int var12 = 0; var12 < var11; var12++) {
                                class174.field3427.field2218[class174.field3427.field2222 + var12] = (byte) class195.method1297(class174.field3427.field2218[class174.field3427.field2222 + var12], class25.field529);
                            }
                        }
                        class174.field3427.field2222 += var11;
                        if (var10 > class174.field3427.field2222) {
                            break;
                        }
                        if (class149.field2846 == null) {
                            class174.field3427.field2222 = 0;
                            int var13 = class174.field3427.method751((byte) 90);
                            int var14 = class174.field3427.method755((byte) -33);
                            int var15 = class174.field3427.method751((byte) -112);
                            int var16 = class174.field3427.method776(arg0 - 12720);
                            long var17 = (long) ((var13 << 16) + var14);
                            class220 var19 = (class220) class121.field2275.method677(-2755, var17);
                            class135.field2566 = true;
                            if (var19 == null) {
                                var19 = (class220) class196.field3811.method677(-2755, var17);
                                class135.field2566 = false;
                            }
                            if (var19 == null) {
                                throw new IOException();
                            }
                            class149.field2846 = var19;
                            int var20 = var15 == 0 ? 5 : 9;
                            class112.field2080 = new class121(var16 + var20 + class149.field2846.field4228);
                            class112.field2080.method752(var15, (byte) -128);
                            class112.field2080.method775(732495312, var16);
                            class75.field1484 = 8;
                            class174.field3427.field2222 = 0;
                        } else if (class75.field1484 == 0) {
                            if (class174.field3427.field2218[0] == -1) {
                                class75.field1484 = 1;
                                class174.field3427.field2222 = 0;
                            } else {
                                class149.field2846 = null;
                            }
                        }
                    } else {
                        int var21 = 512 - class75.field1484;
                        int var22 = class112.field2080.field2218.length - class149.field2846.field4228;
                        if (var22 - class112.field2080.field2222 < var21) {
                            var21 = var22 - class112.field2080.field2222;
                        }
                        if (var21 > var9) {
                            var21 = var9;
                        }
                        class99.field1809.method1093(var21, class112.field2080.field2222, (byte) -5, class112.field2080.field2218);
                        if (class25.field529 != 0) {
                            for (int var23 = 0; var23 < var21; var23++) {
                                class112.field2080.field2218[class112.field2080.field2222 + var23] = (byte) class195.method1297(class112.field2080.field2218[class112.field2080.field2222 + var23], class25.field529);
                            }
                        }
                        class112.field2080.field2222 += var21;
                        class75.field1484 += var21;
                        if (class112.field2080.field2222 == var22) {
                            if (class149.field2846.field2437 == 16711935L) {
                                class177.field3464 = class112.field2080;
                                for (int var24 = 0; var24 < 256; var24++) {
                                    class1 var25 = class74.field1446[var24];
                                    if (var25 != null) {
                                        class177.field3464.field2222 = var24 * 8 + 5;
                                        int var26 = class177.field3464.method776(83);
                                        int var27 = class177.field3464.method776(-85);
                                        var25.method6(var26, var27, (byte) 10);
                                    }
                                }
                            } else {
                                class73.field1417.reset();
                                class73.field1417.update(class112.field2080.field2218, 0, var22);
                                int var28 = (int) class73.field1417.getValue();
                                if (class149.field2846.field4236 != var28) {
                                    try {
                                        class99.field1809.method1095((byte) 127);
                                    } catch (Exception var30) {
                                    }
                                    class214.field4159++;
                                    class25.field529 = (byte) (Math.random() * 255.0D + 1.0D);
                                    class99.field1809 = null;
                                    return false;
                                }
                                class214.field4159 = 0;
                                class125.field2361 = 0;
                                class149.field2846.field4232.method4((class149.field2846.field2437 & 0xFF0000L) == 16711680L, (int) (class149.field2846.field2437 & 0xFFFFL), class112.field2080.field2218, class135.field2566, 0);
                            }
                            class149.field2846.method824((byte) -123);
                            class112.field2080 = null;
                            if (class135.field2566) {
                                class52.field1063--;
                            } else {
                                class211.field4092--;
                            }
                            class75.field1484 = 0;
                            class149.field2846 = null;
                        } else {
                            if (class75.field1484 != 512) {
                                break;
                            }
                            class75.field1484 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var31) {
                try {
                    class99.field1809.method1095((byte) 126);
                } catch (Exception var29) {
                }
                class99.field1809 = null;
                class125.field2361++;
                return false;
            }
        }
    }
}
