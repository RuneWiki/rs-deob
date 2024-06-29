import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class270 {

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "[I")
    private int[] field4067;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "Lqv;")
    public static class316 field4068 = new class316(98, 12);

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field4065;

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field4069;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public static int field4070;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public static int field4071;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Lba;")
    public static class269 field4072;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(II)I")
    public final int method1751(int arg0, int arg1) {
        field4069++;
        int var3 = (this.field4067.length >> 1) - 1;
        if (arg1 != 4065) {
            field4072 = null;
        }
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field4067[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4067[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(BLjava/awt/Component;)Lno;")
    public static final class505 method1752(byte arg0, Component arg1) {
        field4071++;
        if (arg0 < 63) {
            field4068 = null;
        }
        return new class14(arg1);
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Z)Z")
    public static final boolean method1753(boolean arg0) {
        for (int var1 = class70.field1150; var1 < class251.field3740; var1++) {
            class188[][] var2 = class461.field6675[var1];
            for (int var3 = -class272.field4085; var3 <= 0; var3++) {
                int var4 = class295.field4418 + var3;
                int var5 = class295.field4418 - var3;
                if (var4 >= class11.field111 || var5 < class520.field7589) {
                    for (int var6 = -class272.field4085; var6 <= 0; var6++) {
                        int var7 = class118.field1845 + var6;
                        int var8 = class118.field1845 - var6;
                        if (var4 >= class11.field111) {
                            if (var7 >= class27.field383) {
                                class188 var9 = var2[var4][var7];
                                if (var9 != null && var9.field2758) {
                                    class55.field1000 = arg0;
                                    class386.field5506.method775((byte) -91, var9);
                                    class386.field5506.method769(-89);
                                }
                            }
                            if (var8 < class56.field1010) {
                                class188 var10 = var2[var4][var8];
                                if (var10 != null && var10.field2758) {
                                    class55.field1000 = arg0;
                                    class386.field5506.method775((byte) -14, var10);
                                    class386.field5506.method769(-121);
                                }
                            }
                        }
                        if (var5 < class520.field7589) {
                            if (var7 >= class27.field383) {
                                class188 var11 = var2[var5][var7];
                                if (var11 != null && var11.field2758) {
                                    class55.field1000 = arg0;
                                    class386.field5506.method775((byte) -123, var11);
                                    class386.field5506.method769(-120);
                                }
                            }
                            if (var8 < class56.field1010) {
                                class188 var12 = var2[var5][var8];
                                if (var12 != null && var12.field2758) {
                                    class55.field1000 = arg0;
                                    class386.field5506.method775((byte) -124, var12);
                                    class386.field5506.method769(-118);
                                }
                            }
                        }
                        if (class229.field3440 == 0) {
                            if (class530.field7833) {
                                class386.field5506.method770(24, -26602);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V")
    public static void method1754(int arg0) {
        field4068 = null;
        field4072 = null;
        if (arg0 != -19856) {
            field4072 = null;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IZ)V")
    public static final void method1755(int arg0, boolean arg1) {
        class259.method1668(arg0 + 12973);
        field4066++;
        if (arg0 != -4872) {
            field4072 = null;
        }
        if (!class171.method1210(class37.field799, -11)) {
            return;
        }
        class97.field1534++;
        if (class97.field1534 < 50 && !arg1) {
            return;
        }
        class97.field1534 = 0;
        if (!class161.field2455 && class410.field5802 != null) {
            class496.field7173++;
            class228.method1528(true, class392.field5565);
            try {
                class410.field5802.method1296(class276.field4124.field7558, 0, 20188, class276.field4124.field7545);
                class276.field4124.field7558 = 0;
            } catch (IOException var2) {
                class161.field2455 = true;
            }
        }
        class259.method1668(arg0 ^ 0xFFFFF35D);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(Z)V")
    public static final void method1756(boolean arg0) {
        field4070++;
        for (int var1 = 0; var1 < class215.field3238; var1++) {
            class306 var2 = class79.field1281[var1];
            boolean var3 = false;
            if (var2.field4536 == null) {
                var2.field4537--;
                if ((var2.field4538 == 2 ? -1500 : -10) > var2.field4537) {
                    var3 = true;
                } else {
                    if (var2.field4538 == 1 && var2.field4533 == null) {
                        var2.field4533 = class61.method514(class386.field5505, var2.field4532, 0);
                        if (var2.field4533 == null) {
                            continue;
                        }
                        var2.field4537 += var2.field4533.method513();
                    } else if (var2.field4538 == 2 && (var2.field4541 == null || var2.field4535 == null)) {
                        if (var2.field4541 == null) {
                            var2.field4541 = class527.method3128(class76.field1248, var2.field4532);
                        }
                        if (var2.field4541 == null) {
                            continue;
                        }
                        if (var2.field4535 == null) {
                            var2.field4535 = var2.field4541.method3126(new int[] { 22050 });
                            if (var2.field4535 == null) {
                                continue;
                            }
                        }
                    }
                    if (var2.field4537 < 0) {
                        int var4;
                        if (var2.field4534 == 0) {
                            var4 = class220.field3371.field2549 * var2.field4539 >> 8;
                        } else {
                            int var5 = var2.field4534 >> 24 & 0x3;
                            if (class364.field5293.field6956 == var5) {
                                int var6 = (var2.field4534 & 0xFF) << 7;
                                int var7 = var2.field4534 >> 16 & 0xFF;
                                int var8 = (var7 << 7) + 64 - class364.field5293.field6961;
                                if (var8 < 0) {
                                    var8 = -var8;
                                }
                                int var9 = (var2.field4534 & 0xFF35) >> 8;
                                int var10 = (var9 << 7) + 64 - class364.field5293.field6965;
                                if (var10 < 0) {
                                    var10 = -var10;
                                }
                                int var11 = var8 + var10 - 128;
                                if (var11 > var6) {
                                    var2.field4537 = -99999;
                                    continue;
                                }
                                if (var11 < 0) {
                                    var11 = 0;
                                }
                                var4 = (var6 - var11) * var2.field4539 * class220.field3371.field2550 / var6 >> 8;
                            } else {
                                var4 = 0;
                            }
                        }
                        if (var4 > 0) {
                            class407 var12 = null;
                            if (var2.field4538 == 1) {
                                var12 = var2.field4533.method512().method2425(class434.field6212);
                            } else if (var2.field4538 == 2) {
                                var12 = var2.field4535;
                            }
                            class93 var13 = var2.field4536 = class93.method696(var12, 100, var4);
                            var13.method691(var2.field4529 - 1);
                            class504.field7295.method1586(var13);
                        }
                    }
                }
            } else if (!var2.field4536.method416((byte) -72)) {
                var3 = true;
            }
            if (var3) {
                class215.field3238--;
                for (int var14 = var1; var14 < class215.field3238; var14++) {
                    class79.field1281[var14] = class79.field1281[var14 + 1];
                }
                var1--;
            }
        }
        if (arg0) {
            field4068 = null;
        }
        if (class75.field1240 && !class497.method2913(0)) {
            if (class220.field3371.field2569 != 0 && class441.field6285 != -1) {
                class445.method2628(class220.field3371.field2569, class441.field6285, false, class425.field6000, 10000, 0);
            }
            class75.field1240 = false;
        } else if (class220.field3371.field2569 != 0 && class441.field6285 != -1 && !class497.method2913(0)) {
            class487.field7052++;
            class228.method1528(true, class302.field4484);
            class276.field4124.method3019(class441.field6285, 11648);
            class441.field6285 = -1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "<init>", descriptor = "([I)V")
    public class270(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field4067 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4067[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4067[var5 - (-var5 - 1)] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field4067[var5 + var5] = arg0[var4];
            this.field4067[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IILwo;I)J")
    public static final long method1757(int arg0, int arg1, class534 arg2, int arg3) {
        field4065++;
        long var4 = 4194304L;
        long var6 = 2147483648L;
        long var8 = Long.MIN_VALUE;
        class261 var10 = class277.field4139.method569((byte) 118, arg2.method561((byte) -85));
        long var11 = (long) (arg3 | 0x40000000 | arg1 << 7 | arg2.method559((byte) 36) << 14 | arg2.method560(-29863) << 20);
        if (var10.field3872 == 0) {
            var11 |= var8;
        }
        if (var10.field3866 == 1) {
            var11 |= var4;
        }
        if (var10.field3939) {
            var11 |= var6;
        }
        long var13 = var11 | (long) arg2.method561((byte) -85) << 32;
        return arg0 == -25746 ? var13 : -73L;
    }
}
