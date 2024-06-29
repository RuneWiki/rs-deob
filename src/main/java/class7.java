import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 extends class87 {

    @OriginalMember(owner = "client!il", name = "C", descriptor = "B")
    public byte field109 = 5;

    @OriginalMember(owner = "client!il", name = "D", descriptor = "Z")
    public static boolean field110 = false;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public int field100;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!il", name = "v", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!il", name = "x", descriptor = "I")
    public int field104;

    @OriginalMember(owner = "client!il", name = "y", descriptor = "I")
    public int field105;

    @OriginalMember(owner = "client!il", name = "z", descriptor = "I")
    public int field106;

    @OriginalMember(owner = "client!il", name = "B", descriptor = "I")
    public static int field108;

    @OriginalMember(owner = "client!il", name = "A", descriptor = "Ljava/lang/String;")
    public static String field107;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Z")
    public boolean field103;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V")
    public static void method43(byte arg0) {
        if (arg0 <= -61) {
            field107 = null;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "()V")
    public static final void method44() {
        class292.field4473 = 0;
        label212: for (int var0 = 0; var0 < class296.field4501; var0++) {
            class519 var1 = class161.field2589[var0];
            if (class271.field4118 != null) {
                for (int var2 = 0; var2 < class271.field4118.length; var2++) {
                    if (class271.field4118[var2] != -1000000 && (var1.field7549 <= class271.field4118[var2] || var1.field7555 <= class271.field4118[var2]) && (var1.field7545 <= class12.field174[var2] || var1.field7536 <= class12.field174[var2]) && (var1.field7545 >= class261.field3979[var2] || var1.field7536 >= class261.field3979[var2]) && (var1.field7535 <= class499.field7329[var2] || var1.field7534 <= class499.field7329[var2]) && (var1.field7535 >= class58.field1221[var2] || var1.field7534 >= class58.field1221[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field7539 == 1) {
                int var3 = var1.field7553 + class97.field1894 - class107.field1974;
                if (var3 >= 0 && var3 <= class97.field1894 + class97.field1894) {
                    int var4 = var1.field7538 + class97.field1894 - class199.field3222;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class97.field1894 + class97.field1894) {
                        continue;
                    }
                    int var5 = var1.field7554 + class97.field1894 - class199.field3222;
                    if (var5 > class97.field1894 + class97.field1894) {
                        var5 = class97.field1894 + class97.field1894;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class38.field559[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class233.field3595 - var1.field7545;
                        if (var7 > class31.field499) {
                            var1.field7546 = 1;
                        } else {
                            if (var7 >= -class31.field499) {
                                continue;
                            }
                            var1.field7546 = 2;
                            var7 = -var7;
                        }
                        var1.field7551 = (var1.field7535 - class471.field6987 << 8) / var7;
                        var1.field7547 = (var1.field7534 - class471.field6987 << 8) / var7;
                        var1.field7544 = (var1.field7549 - class91.field1815 << 8) / var7;
                        var1.field7552 = (var1.field7555 - class91.field1815 << 8) / var7;
                        class488.field7187[class292.field4473++] = var1;
                    }
                }
            } else if (var1.field7539 == 2) {
                int var8 = var1.field7538 + class97.field1894 - class199.field3222;
                if (var8 >= 0 && var8 <= class97.field1894 + class97.field1894) {
                    int var9 = var1.field7553 + class97.field1894 - class107.field1974;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class97.field1894 + class97.field1894) {
                        continue;
                    }
                    int var10 = var1.field7550 + class97.field1894 - class107.field1974;
                    if (var10 > class97.field1894 + class97.field1894) {
                        var10 = class97.field1894 + class97.field1894;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class38.field559[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class471.field6987 - var1.field7535;
                        if (var12 > class31.field499) {
                            var1.field7546 = 3;
                        } else {
                            if (var12 >= -class31.field499) {
                                continue;
                            }
                            var1.field7546 = 4;
                            var12 = -var12;
                        }
                        var1.field7556 = (var1.field7545 - class233.field3595 << 8) / var12;
                        var1.field7548 = (var1.field7536 - class233.field3595 << 8) / var12;
                        var1.field7544 = (var1.field7549 - class91.field1815 << 8) / var12;
                        var1.field7552 = (var1.field7555 - class91.field1815 << 8) / var12;
                        class488.field7187[class292.field4473++] = var1;
                    }
                }
            } else if (var1.field7539 == 4) {
                int var13 = var1.field7549 - class91.field1815;
                if (var13 > class113.field2039) {
                    int var14 = var1.field7538 + class97.field1894 - class199.field3222;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class97.field1894 + class97.field1894) {
                        continue;
                    }
                    int var15 = var1.field7554 + class97.field1894 - class199.field3222;
                    if (var15 > class97.field1894 + class97.field1894) {
                        var15 = class97.field1894 + class97.field1894;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field7553 + class97.field1894 - class107.field1974;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class97.field1894 + class97.field1894) {
                        continue;
                    }
                    int var17 = var1.field7550 + class97.field1894 - class107.field1974;
                    if (var17 > class97.field1894 + class97.field1894) {
                        var17 = class97.field1894 + class97.field1894;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class38.field559[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field7546 = 5;
                        var1.field7556 = (var1.field7545 - class233.field3595 << 8) / var13;
                        var1.field7548 = (var1.field7536 - class233.field3595 << 8) / var13;
                        var1.field7551 = (var1.field7535 - class471.field6987 << 8) / var13;
                        var1.field7547 = (var1.field7534 - class471.field6987 << 8) / var13;
                        class488.field7187[class292.field4473++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BLza;Ll;)V")
    public static final void method45(byte arg0, class288 arg1, class16 arg2) {
        field108++;
        if (class319.field4850 == null) {
            return;
        }
        if (class35.field537 < 10) {
            if (!class319.field4847.method2732(2, class319.field4850.field3092)) {
                class35.field537 = class449.field6678.method2767(-54, class319.field4850.field3092) / 10;
                return;
            }
            class113.method937((byte) 119);
            class35.field537 = 10;
        }
        if (class35.field537 == 10) {
            class319.field4869 = class319.field4850.field3078 >> 6 << 6;
            class319.field4876 = class319.field4850.field3090 >> 6 << 6;
            class319.field4865 = (class319.field4850.field3085 >> 6 << 6) + 64 - class319.field4869;
            class319.field4880 = (class319.field4850.field3071 >> 6 << 6) + 64 - class319.field4876;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class319.field4850.method1298((byte) -66, class15.field266.field6084, var3, class212.field3378 + (class15.field266.field6078 >> 7), class496.field7292 - -(class15.field266.field6073 >> 7))) {
                var5 = var3[2] - class319.field4869;
                var4 = var3[1] - class319.field4876;
            }
            if (!class107.field1983 && var4 >= 0 && var4 < class319.field4880 && var5 >= 0 && class319.field4865 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + ((int) (Math.random() * 10.0D) - 5);
                class71.field1437 = var6;
                class457.field6775 = var7;
            } else if (class535.field7860 == -1 || class467.field6938 == -1) {
                class319.field4850.method1297(class319.field4850.field3091 & 0x3FFF, class319.field4850.field3091 >> 14 & 0x3FFF, (byte) -69, var3);
                class71.field1437 = var3[1] - class319.field4876;
                class457.field6775 = var3[2] - class319.field4869;
            } else {
                class319.field4850.method1297(class467.field6938, class535.field7860, (byte) -80, var3);
                class467.field6938 = -1;
                class535.field7860 = -1;
                class107.field1983 = false;
                if (var3 != null) {
                    class71.field1437 = var3[1] - class319.field4876;
                    class457.field6775 = var3[2] - class319.field4869;
                }
            }
            if (class319.field4850.field3074 == 37) {
                class319.field4859 = 3.0F;
                class319.field4856 = 3.0F;
            } else if (class319.field4850.field3074 == 50) {
                class319.field4859 = 4.0F;
                class319.field4856 = 4.0F;
            } else if (class319.field4850.field3074 == 75) {
                class319.field4859 = 6.0F;
                class319.field4856 = 6.0F;
            } else if (class319.field4850.field3074 == 100) {
                class319.field4859 = 8.0F;
                class319.field4856 = 8.0F;
            } else if (class319.field4850.field3074 == 200) {
                class319.field4859 = 16.0F;
                class319.field4856 = 16.0F;
            } else {
                class319.field4859 = 8.0F;
                class319.field4856 = 8.0F;
            }
            class319.field4851 = (int) class319.field4859 >> 1;
            class319.field4857 = class19.method128(class319.field4851, -18606);
            class191.method1295(1130);
            class319.method2030();
            class454.field6754 = new class291();
            class319.field4853 += (int) (Math.random() * 5.0D) - 2;
            if (class319.field4853 < -8) {
                class319.field4853 = -8;
            }
            class319.field4855 += (int) (Math.random() * 5.0D) - 2;
            if (class319.field4853 > 8) {
                class319.field4853 = 8;
            }
            if (class319.field4855 < -16) {
                class319.field4855 = -16;
            }
            if (class319.field4855 > 16) {
                class319.field4855 = 16;
            }
            class319.method2031(arg2, class319.field4853 >> 2 << 10, class319.field4855 >> 1);
            class319.field4842.method1249(256, -122, 1024);
            class319.field4848.method2132(256, 256, true);
            class319.field4846.method1522(4096, (byte) -92);
            class155.field2526.method1453(1073741824, 256);
            class35.field537 = 20;
        } else if (class35.field537 == 20) {
            class525.method3105((byte) 63, true);
            class319.method2041(arg1, class319.field4853, class319.field4855);
            class35.field537 = 60;
            class525.method3105((byte) -119, true);
            class175.method1208((byte) 36);
        } else if (class35.field537 == 60) {
            if (class319.field4847.method2737(class319.field4850.field3092 + "_staticelements", 0)) {
                if (!class319.field4847.method2732(2, class319.field4850.field3092 + "_staticelements")) {
                    return;
                }
                class319.field4854 = class493.method2976(class319.field4850.field3092 + "_staticelements", class319.field4847, 0, field110);
            } else {
                class319.field4854 = new class344(0);
            }
            class319.method2035();
            class35.field537 = 70;
            class525.method3105((byte) 61, true);
            class175.method1208((byte) 36);
        } else if (class35.field537 == 70) {
            class512.field7446 = new class126(arg1, 11, true, class262.field4007);
            class35.field537 = 73;
            class525.method3105((byte) -111, true);
            class175.method1208((byte) 36);
        } else if (class35.field537 == 73) {
            class520.field7561 = new class126(arg1, 12, true, class262.field4007);
            class35.field537 = 76;
            class525.method3105((byte) 62, true);
            class175.method1208((byte) 36);
        } else if (class35.field537 == 76) {
            class456.field6773 = new class126(arg1, 14, true, class262.field4007);
            class35.field537 = 79;
            class525.method3105((byte) -87, true);
            class175.method1208((byte) 36);
        } else if (class35.field537 == 79) {
            class383.field5603 = new class126(arg1, 17, true, class262.field4007);
            class35.field537 = 82;
            class525.method3105((byte) 88, true);
            class175.method1208((byte) 36);
        } else if (class35.field537 == 82) {
            class100.field1928 = new class126(arg1, 19, true, class262.field4007);
            class35.field537 = 85;
            class525.method3105((byte) -95, true);
            class175.method1208((byte) 36);
        } else if (arg0 >= 46) {
            if (class35.field537 == 85) {
                class533.field7742 = new class126(arg1, 22, true, class262.field4007);
                class35.field537 = 88;
                class525.method3105((byte) -55, true);
                class175.method1208((byte) 36);
            } else if (class35.field537 == 88) {
                class136.field2292 = new class126(arg1, 26, true, class262.field4007);
                class35.field537 = 91;
                class525.method3105((byte) -103, true);
                class175.method1208((byte) 36);
            } else {
                class326.field4943 = new class126(arg1, 30, true, class262.field4007);
                class35.field537 = 100;
                class525.method3105((byte) 85, true);
                class175.method1208((byte) 36);
                System.gc();
            }
        }
    }
}
