import java.awt.Component;
import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qb")
public class class176 extends class136 {

    @OriginalMember(owner = "client!qb", name = "R", descriptor = "I")
    public static int field3547 = 0;

    @OriginalMember(owner = "client!qb", name = "F", descriptor = "I")
    public static int field3537 = 0;

    @OriginalMember(owner = "client!qb", name = "J", descriptor = "Li;")
    private static class88 field3540 = class208.method1425(105, "Members object");

    @OriginalMember(owner = "client!qb", name = "D", descriptor = "Li;")
    public static class88 field3535 = field3540;

    @OriginalMember(owner = "client!qb", name = "S", descriptor = "Z")
    public static boolean field3548 = true;

    @OriginalMember(owner = "client!qb", name = "E", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!qb", name = "H", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!qb", name = "I", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!qb", name = "M", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!qb", name = "N", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!qb", name = "O", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!qb", name = "Q", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!qb", name = "T", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!qb", name = "L", descriptor = "Lob;")
    private class154 field3541;

    @OriginalMember(owner = "client!qb", name = "P", descriptor = "[Lrc;")
    public static class188[] field3545;

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILjava/awt/Component;I)Luj;")
    public static final class228 method1261(int arg0, int arg1, Component arg2, int arg3) {
        field3544++;
        try {
            Class var4 = Class.forName("gj");
            class228 var5 = (class228) var4.getDeclaredConstructor().newInstance();
            var5.method243(arg3, arg1, true, arg2);
            return arg0 == 2 ? var5 : null;
        } catch (Throwable var7) {
            class36 var6 = new class36();
            var6.method243(arg3, arg1, true, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(IILea;)V")
    private final void method1262(int arg0, int arg1, class46 arg2) {
        if (arg0 == arg1) {
            int var4 = arg2.method347(26119);
            if (this.field3541 == null) {
                int var5 = class184.method1298(true, var4);
                this.field3541 = new class154(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg2.method347(26119) == 1;
                int var8 = arg2.method304(-29629);
                class67 var9;
                if (var7) {
                    var9 = new class216(arg2.method298(arg0 ^ 0xFFFFFF79));
                } else {
                    var9 = new class192(arg2.method323((byte) -84));
                }
                this.field3541.method1054((long) var8, var9, arg0 - 250);
            }
        }
        field3543++;
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(B)V")
    public static final void method1263(byte arg0) {
        field3542++;
        try {
            if (class117.field2119 == 0) {
                if (class33.field556 != null) {
                    class33.field556.method919(true);
                    class33.field556 = null;
                }
                class6.field71 = 0;
                class117.field2119 = 1;
                class58.field1097 = false;
                class98.field1801 = null;
            }
            if (class117.field2119 == 1) {
                if (class98.field1801 == null) {
                    class98.field1801 = class126.field2326.method1290(class95.field1761, class168.field3248, 90);
                }
                if (class98.field1801.field3136 == 2) {
                    throw new IOException();
                }
                if (class98.field1801.field3136 == 1) {
                    class33.field556 = new class137((Socket) class98.field1801.field3131, class126.field2326);
                    class117.field2119 = 2;
                    class98.field1801 = null;
                }
            }
            if (class117.field2119 == 2) {
                long var1 = class36.field631 = class209.field3969.method630(false);
                class146.field2749.field831 = 0;
                class146.field2749.method346(255, 14);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class146.field2749.method346(255, var3);
                class33.field556.method913(2, 0, class146.field2749.field842, 17492);
                class117.field2119 = 3;
                class230.field4314.field831 = 0;
            }
            if (class117.field2119 == 3) {
                if (class27.field458 != null) {
                    class27.field458.method403(true);
                }
                if (class114.field2058 != null) {
                    class114.field2058.method403(true);
                }
                int var4 = class33.field556.method918(0);
                if (class27.field458 != null) {
                    class27.field458.method403(true);
                }
                if (class114.field2058 != null) {
                    class114.field2058.method403(true);
                }
                if (var4 != 0) {
                    class57.method417(-106, var4);
                    return;
                }
                class230.field4314.field831 = 0;
                class117.field2119 = 4;
            }
            if (class117.field2119 == 4) {
                if (class230.field4314.field831 < 8) {
                    int var5 = class33.field556.method911(1);
                    if (8 - class230.field4314.field831 < var5) {
                        var5 = 8 - class230.field4314.field831;
                    }
                    if (var5 > 0) {
                        class33.field556.method915(class230.field4314.field831, class230.field4314.field842, (byte) -93, var5);
                        class230.field4314.field831 += var5;
                    }
                }
                if (class230.field4314.field831 == 8) {
                    class230.field4314.field831 = 0;
                    class33.field528 = class230.field4314.method321(1054632416);
                    class117.field2119 = 5;
                }
            }
            if (class117.field2119 == 5) {
                class146.field2749.field831 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class33.field528 >> 32), (int) class33.field528 };
                class146.field2749.method346(255, 10);
                class146.field2749.method338(2112555600, var6[0]);
                class146.field2749.method338(2112555600, var6[1]);
                class146.field2749.method338(2112555600, var6[2]);
                class146.field2749.method338(2112555600, var6[3]);
                class146.field2749.method328(class209.field3969.method630(false), (byte) -123);
                class146.field2749.method336(class209.field3972, (byte) 0);
                class146.field2749.method311(0, class32.field515, class58.field1098);
                class31.field501.field831 = 0;
                if (class229.field4286 == 40) {
                    class31.field501.method346(255, 18);
                } else {
                    class31.field501.method346(255, 16);
                }
                class31.field501.method346(255, class146.field2749.field831 + class15.method72(class218.field4136, 1) + 141);
                class31.field501.method338(2112555600, 500);
                class31.field501.method346(255, class245.field4499 ? 1 : 0);
                class4.method19(class31.field501, (byte) -91);
                class31.field501.method336(class218.field4136, (byte) 0);
                class31.field501.method338(2112555600, class4.field46);
                class31.field501.method338(2112555600, class67.field1204.field2714);
                class31.field501.method338(2112555600, class223.field4203.field2714);
                class31.field501.method338(2112555600, class85.field1546.field2714);
                class31.field501.method338(2112555600, class89.field1671.field2714);
                class31.field501.method338(2112555600, class12.field172.field2714);
                class31.field501.method338(2112555600, class27.field451.field2714);
                class31.field501.method338(2112555600, class99.field1816.field2714);
                class31.field501.method338(2112555600, class233.field4367.field2714);
                class31.field501.method338(2112555600, class226.field4245.field2714);
                class31.field501.method338(2112555600, class66.field1193.field2714);
                class31.field501.method338(2112555600, class9.field137.field2714);
                class31.field501.method338(2112555600, class133.field2488.field2714);
                class31.field501.method338(2112555600, class18.field300.field2714);
                class31.field501.method338(2112555600, class98.field1795.field2714);
                class31.field501.method338(2112555600, class18.field280.field2714);
                class31.field501.method338(2112555600, class147.field2762.field2714);
                class31.field501.method338(2112555600, class109.field2006.field2714);
                class31.field501.method338(2112555600, class190.field3674.field2714);
                class31.field501.method338(2112555600, class161.field3115.field2714);
                class31.field501.method338(2112555600, class248.field4552.field2714);
                class31.field501.method338(2112555600, class196.field3773.field2714);
                class31.field501.method338(2112555600, class17.field274.field2714);
                class31.field501.method338(2112555600, class238.field4433.field2714);
                class31.field501.method338(2112555600, class130.field2442.field2714);
                class31.field501.method338(2112555600, class20.field321.field2714);
                class31.field501.method338(2112555600, class203.field3872.field2714);
                class31.field501.method338(2112555600, class155.field2996.field2714);
                class31.field501.method325((byte) 34, class146.field2749.field831, class146.field2749.field842, 0);
                class33.field556.method913(class31.field501.field831, 0, class31.field501.field842, 17492);
                class146.field2749.method36(var6, (byte) 75);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class230.field4314.method36(var6, (byte) 75);
                class117.field2119 = 6;
            }
            if (class117.field2119 == 6 && class33.field556.method911(1) > 0) {
                int var8 = class33.field556.method918(0);
                if (var8 == 21 && class229.field4286 == 20) {
                    class117.field2119 = 7;
                } else if (var8 == 2) {
                    class117.field2119 = 9;
                } else if (var8 == 15 && class229.field4286 == 40) {
                    class138.method920(true);
                    return;
                } else if (var8 == 23 && class196.field3760 < 1) {
                    class196.field3760++;
                    class117.field2119 = 0;
                } else {
                    class57.method417(-113, var8);
                    return;
                }
            }
            if (class117.field2119 == 7 && class33.field556.method911(1) > 0) {
                class237.field4426 = (class33.field556.method918(0) + 3) * 60;
                class117.field2119 = 8;
            }
            if (class117.field2119 == 8) {
                class6.field71 = 0;
                class34.method227((byte) 126, class166.method1142(new class88[] { class170.method1214(class237.field4426 / 60, 124), class127.field2372 }, -3), class110.field2017, class139.field2589);
                if (--class237.field4426 <= 0) {
                    class117.field2119 = 0;
                }
            } else {
                if (class117.field2119 == 9 && class33.field556.method911(1) >= 9) {
                    class67.field1208 = class33.field556.method918(0);
                    class29.field479 = class33.field556.method918(0);
                    class238.field4430 = class33.field556.method918(0);
                    if (class238.field4430 == 1) {
                        try {
                            class59.field1118.method628(class126.field2326.field3599, true);
                        } catch (Throwable var10) {
                        }
                    } else {
                        try {
                            class180.field3579.method628(class126.field2326.field3599, true);
                        } catch (Throwable var9) {
                        }
                    }
                    field3537 = class33.field556.method918(0);
                    class57.field1077 = class33.field556.method918(0) == 1;
                    class220.field4166 = class33.field556.method918(0);
                    class220.field4166 <<= 0x8;
                    class220.field4166 += class33.field556.method918(0);
                    class6.field72 = class33.field556.method918(0);
                    class33.field556.method915(0, class230.field4314.field842, (byte) -93, 1);
                    class230.field4314.field831 = 0;
                    class238.field4432 = class230.field4314.method33((byte) -53);
                    class33.field556.method915(0, class230.field4314.field842, (byte) -93, 2);
                    class230.field4314.field831 = 0;
                    class228.field4272 = class230.field4314.method301(80);
                    class117.field2119 = 10;
                }
                if (class117.field2119 != 10) {
                    if (arg0 > -39) {
                        field3540 = null;
                    }
                    class6.field71++;
                    if (class6.field71 > 2000) {
                        if (class196.field3760 < 1) {
                            class196.field3760++;
                            class117.field2119 = 0;
                            if (class220.field4158 == class168.field3248) {
                                class168.field3248 = class49.field911;
                            } else {
                                class168.field3248 = class220.field4158;
                            }
                        } else {
                            class57.method417(-101, -3);
                        }
                    }
                } else if (class33.field556.method911(1) >= class228.field4272) {
                    class230.field4314.field831 = 0;
                    class33.field556.method915(0, class230.field4314.field842, (byte) -93, class228.field4272);
                    class106.method733(124);
                    class140.field2597 = -1;
                    class43.method278(false, (byte) 106);
                    class238.field4432 = -1;
                }
            }
        } catch (IOException var11) {
            if (class196.field3760 < 1) {
                class196.field3760++;
                class117.field2119 = 0;
                if (class220.field4158 == class168.field3248) {
                    class168.field3248 = class49.field911;
                } else {
                    class168.field3248 = class220.field4158;
                }
            } else {
                class57.method417(90, -2);
            }
        }
    }

    @OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
    public static void method1264(int arg0) {
        field3545 = null;
        if (arg0 != 20) {
            field3540 = null;
        }
        field3535 = null;
        field3540 = null;
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Li;II)Li;")
    public final class88 method1265(class88 arg0, int arg1, int arg2) {
        field3546++;
        if (arg1 <= 1) {
            field3545 = null;
        }
        if (this.field3541 == null) {
            return arg0;
        } else {
            class216 var4 = (class216) this.field3541.method1051(-1, (long) arg2);
            return var4 == null ? arg0 : var4.field4048;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lea;I)V")
    public final void method1266(class46 arg0, int arg1) {
        field3536++;
        int var3 = 93 % ((arg1 - 68) / 57);
        while (true) {
            int var4 = arg0.method347(26119);
            if (var4 == 0) {
                return;
            }
            this.method1262(249, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(III)I")
    public final int method1267(int arg0, int arg1, int arg2) {
        field3539++;
        if (this.field3541 == null) {
            return arg1;
        }
        class192 var4 = (class192) this.field3541.method1051(-1, (long) arg2);
        if (var4 == null) {
            return arg1;
        } else {
            if (arg0 >= -96) {
                field3547 = 44;
            }
            return var4.field3700;
        }
    }

    @OriginalMember(owner = "client!qb", name = "a", descriptor = "(ZLnb;I)Lsh;")
    public static final class204 method1268(boolean arg0, class144 arg1, int arg2) {
        if (arg0) {
            return null;
        } else {
            byte[] var3 = arg1.method958(arg2, 0);
            field3549++;
            return var3 == null ? null : new class204(var3);
        }
    }
}
