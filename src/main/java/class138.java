import java.awt.Canvas;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class138 extends class214 {

    @OriginalMember(owner = "client!jk", name = "J", descriptor = "I")
    private int field1949 = 4096;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "I")
    private int field1955 = 0;

    @OriginalMember(owner = "client!jk", name = "N", descriptor = "I")
    private int field1953 = 2000;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    private int field1956 = 0;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    private int field1961 = 16;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "Z")
    public static boolean field1954 = false;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "Lcs;")
    public static class351 field1962 = new class351(60, 4);

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "Lbd;")
    public static class464 field1963 = new class464(6, 3);

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "Lcs;")
    public static class351 field1964 = new class351(25, -1);

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "Lcs;")
    public static class351 field1966 = new class351(58, 7);

    @OriginalMember(owner = "client!jk", name = "bb", descriptor = "S")
    public static short field1967 = 205;

    @OriginalMember(owner = "client!jk", name = "K", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!jk", name = "L", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!jk", name = "M", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "Lpc;")
    public static class141 field1959;

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1965;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
    public static final int method842(int arg0, int arg1) {
        ++field1950;
        int var2 = 0;
        if (~arg1 > -1 || ~arg1 <= -65537) {
            var2 += 16;
            arg1 >>>= 16;
        }
        if (~arg1 <= arg0) {
            arg1 >>>= 8;
            var2 += 8;
        }
        if (~arg1 <= -17) {
            var2 += 4;
            arg1 >>>= 4;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (~arg1 <= -2) {
            arg1 >>>= 1;
            ++var2;
        }
        return arg1 + var2;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class138() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Llk;II)V")
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg1 > -114) {
            field1962 = null;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            this.field1949 = arg0.method2508(true);
                        }
                    } else {
                        this.field1956 = arg0.method2508(true);
                    }
                } else {
                    this.field1961 = arg0.method2503(true);
                }
            } else {
                this.field1953 = arg0.method2508(true);
            }
        } else {
            this.field1955 = arg0.method2503(true);
        }
        ++field1960;
    }

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "(I)V")
    public final void method12(int arg0) {
        class407.method2390((byte) -111);
        ++field1952;
        if (arg0 != 27108) {
            field1959 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    public static void method843(byte arg0) {
        field1959 = null;
        field1964 = null;
        field1963 = null;
        field1962 = null;
        field1965 = null;
        int var1 = 1 / ((21 - arg0) / 45);
        field1966 = null;
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V")
    public static final void method844(byte arg0) {
        ++field1957;
        class345.field4714 = new String[500];
        class241.field3410 = class328.field4531.field1156 - -class328.field4531.field1148 + 2;
        class27.field454 = class437.field5993.field1156 + 2 + class437.field5993.field1148;
        if (arg0 != 54) {
            field1964 = null;
        }
        for (int var1 = 0; var1 < class345.field4714.length; ++var1) {
            class345.field4714[var1] = "";
        }
    }

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V")
    public static final void method845(int arg0) {
        ++field1951;
        int var1 = class51.field857 * 128 - -64;
        int var2 = class444.field6128 * 128 + 64;
        int var3 = class418.method2441(var2, class76.field1161, var1, -16778) - class106.field1513;
        int var4 = -18 / ((arg0 - 65) / 42);
        if (class266.field3711 < 100) {
            if (~class436.field5982 > ~var1) {
                class436.field5982 += class19.field322 - -((-class436.field5982 + var1) * class266.field3711 / 1000);
                if (~var1 > ~class436.field5982) {
                    class436.field5982 = var1;
                }
            }
            if (var3 > class183.field2665) {
                class183.field2665 += (-class183.field2665 + var3) * class266.field3711 / 1000 + class19.field322;
                if (~var3 > ~class183.field2665) {
                    class183.field2665 = var3;
                }
            }
            if (class436.field5982 > var1) {
                class436.field5982 -= (-var1 + class436.field5982) * class266.field3711 / 1000 + class19.field322;
                if (~var1 < ~class436.field5982) {
                    class436.field5982 = var1;
                }
            }
            if (class183.field2665 > var3) {
                class183.field2665 -= (class183.field2665 - var3) * class266.field3711 / 1000 + class19.field322;
                if (~var3 < ~class183.field2665) {
                    class183.field2665 = var3;
                }
            }
            if (class106.field1525 < var2) {
                class106.field1525 += (-class106.field1525 + var2) * class266.field3711 / 1000 + class19.field322;
                if (class106.field1525 > var2) {
                    class106.field1525 = var2;
                }
            }
            if (~class106.field1525 < ~var2) {
                class106.field1525 -= class19.field322 - -((-var2 + class106.field1525) * class266.field3711 / 1000);
                if (~var2 < ~class106.field1525) {
                    class106.field1525 = var2;
                }
            }
        } else {
            class106.field1525 = class444.field6128 * 128 - -64;
            class436.field5982 = class51.field857 * 128 + 64;
            class183.field2665 = class418.method2441(class106.field1525, class76.field1161, class436.field5982, -16778) + -class106.field1513;
        }
        int var5 = class175.field2569 * 128 + 64;
        int var6 = class294.field4057 * 128 + 64;
        int var7 = class418.method2441(var6, class76.field1161, var5, -16778) + -class7.field124;
        int var8 = var5 - class436.field5982;
        int var9 = -class183.field2665 + var7;
        int var10 = -class106.field1525 + var6;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = 16383 & (int) (Math.atan2((double) var9, (double) var11) * 2607.5945876176133D);
        if (var12 < 1024) {
            var12 = 1024;
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -2607.5945876176133D) & 16383;
        if (var12 > 3072) {
            var12 = 3072;
        }
        if (var12 > class160.field2306) {
            class160.field2306 += (-class160.field2306 + var12 >> 3) * class165.field2435 / 1000 + class287.field3916 << 3;
            if (~var12 > ~class160.field2306) {
                class160.field2306 = var12;
            }
        }
        if (var12 < class160.field2306) {
            class160.field2306 -= (-var12 + class160.field2306 >> 3) * class165.field2435 / 1000 + class287.field3916 << 3;
            if (~class160.field2306 > ~var12) {
                class160.field2306 = var12;
            }
        }
        int var14 = -class200.field2873 + var13;
        if (var14 > 8192) {
            var14 -= 16384;
        }
        if (~var14 > 8191) {
            var14 += 16384;
        }
        int var15 = var14 >> 3;
        if (~var15 < -1) {
            class200.field2873 += class165.field2435 * var15 / 1000 + class287.field3916 << 3;
            class200.field2873 &= 16383;
        }
        if (var15 < 0) {
            class200.field2873 -= -var15 * class165.field2435 / 1000 + class287.field3916 << 3;
            class200.field2873 &= 16383;
        }
        int var16 = -class200.field2873 + var13;
        if (var16 > 8192) {
            var16 -= 16384;
        }
        if (var16 < -8192) {
            var16 += 16384;
        }
        if (var16 < 0 && var15 > 0 || ~var16 < -1 && var15 < 0) {
            class200.field2873 = var13;
        }
        class259.field3618 = 0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BI)[I")
    public final int[] method14(byte arg0, int arg1) {
        if (arg0 != 123) {
            this.field1956 = 25;
        }
        ++field1958;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (super.field3024.field6135) {
            int var4 = this.field1949 >> 1;
            int[][] var5 = super.field3024.method2582(true);
            Random var6 = new Random((long) this.field1955);
            for (int var7 = 0; ~var7 > ~this.field1953; ++var7) {
                int var8 = ~this.field1949 >= -1 ? this.field1956 : this.field1956 - -class10.method100((byte) -80, this.field1949, var6) - var4;
                int var9 = (var8 & 4085) >> 4;
                int var10 = class10.method100((byte) -111, class399.field5585, var6);
                int var11 = class10.method100((byte) -59, class490.field6924, var6);
                int var12 = (class328.field4534[var9] * this.field1961 >> 12) + var10;
                int var13 = (class406.field5629[var9] * this.field1961 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class10.method100((byte) -78, 4096, var6) >> 2) + 1024;
                    int var27 = var11 >= var13 ? -1 : 1;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = var26 - -((-var10 + var28) * var25) + 1024;
                        int var30 = var28 & class467.field6551;
                        int var31 = var21 & class183.field2659;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var21 += var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
