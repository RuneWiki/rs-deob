import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class135 extends class283 {

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    private int field2054 = 0;

    @OriginalMember(owner = "client!mh", name = "T", descriptor = "I")
    private int field2058 = 12288;

    @OriginalMember(owner = "client!mh", name = "bb", descriptor = "I")
    private int field2066 = 2048;

    @OriginalMember(owner = "client!mh", name = "U", descriptor = "I")
    private int field2059 = 0;

    @OriginalMember(owner = "client!mh", name = "ib", descriptor = "I")
    private int field2073 = 2048;

    @OriginalMember(owner = "client!mh", name = "Q", descriptor = "I")
    private int field2055 = 4096;

    @OriginalMember(owner = "client!mh", name = "kb", descriptor = "I")
    private int field2075 = 8192;

    @OriginalMember(owner = "client!mh", name = "Y", descriptor = "Z")
    public static boolean field2063 = false;

    @OriginalMember(owner = "client!mh", name = "eb", descriptor = "I")
    public static int field2069 = 0;

    @OriginalMember(owner = "client!mh", name = "X", descriptor = "I")
    public static int field2062 = -1;

    @OriginalMember(owner = "client!mh", name = "R", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!mh", name = "S", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!mh", name = "V", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!mh", name = "W", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!mh", name = "Z", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!mh", name = "ab", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!mh", name = "cb", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!mh", name = "db", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!mh", name = "fb", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!mh", name = "gb", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!mh", name = "jb", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!mh", name = "hb", descriptor = "Lbn;")
    public static class66 field2072;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILwa;Z)V", line = 23)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (arg0 == 0) {
            this.field2073 = arg1.method576(1);
        } else if (arg0 == 1) {
            this.field2054 = arg1.method576(1);
        } else if (arg0 == 2) {
            this.field2059 = arg1.method576(1);
        } else if (arg0 == 3) {
            this.field2066 = arg1.method576(1);
        } else if (arg0 == 4) {
            this.field2058 = arg1.method576(1);
        } else if (arg0 == 5) {
            this.field2055 = arg1.method576(1);
        } else if (arg0 == 6) {
            this.field2075 = arg1.method576(1);
        }
        if (!arg2) {
            this.field2075 = 85;
        }
        field2065++;
    }

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "(B)V", line = 84)
    public static final void method910(byte arg0) {
        field2074++;
        if (class127.field1969 == 0) {
            return;
        }
        try {
            if (++class108.field1692 > 2000) {
                if (class88.field1449 != null) {
                    class88.field1449.method2018(14821);
                    class88.field1449 = null;
                }
                if (class300.field5174 >= 1) {
                    class259.field4238 = -5;
                    class127.field1969 = 0;
                    return;
                }
                class127.field1969 = 1;
                class108.field1692 = 0;
                class300.field5174++;
                if (class319.field5446 == class104.field1661) {
                    class319.field5446 = class279.field4656;
                } else {
                    class319.field5446 = class104.field1661;
                }
            }
            if (class127.field1969 == 1) {
                class224.field3544 = class45.field712.method1056((byte) 8, class11.field149, class319.field5446);
                class127.field1969 = 2;
            }
            if (class127.field1969 == 2) {
                if (class224.field3544.field2811 == 2) {
                    throw new IOException();
                }
                if (class224.field3544.field2811 != 1) {
                    return;
                }
                class88.field1449 = new class285((Socket) class224.field3544.field2812, class45.field712);
                class224.field3544 = null;
                class88.field1449.method2014(false, 0, class114.field1789.field1280, class114.field1789.field1301);
                if (class166.field2580 != null) {
                    class166.field2580.method393(63);
                }
                if (class23.field329 != null) {
                    class23.field329.method393(66);
                }
                int var1 = class88.field1449.method2012(0);
                if (class166.field2580 != null) {
                    class166.field2580.method393(64);
                }
                if (class23.field329 != null) {
                    class23.field329.method393(111);
                }
                if (var1 != 21) {
                    class259.field4238 = var1;
                    class127.field1969 = 0;
                    class88.field1449.method2018(14821);
                    class88.field1449 = null;
                    return;
                }
                class127.field1969 = 3;
            }
            if (arg0 <= 26) {
                method912(-75, 44);
            }
            if (class127.field1969 == 3) {
                if (class88.field1449.method2015(-18358) < 1) {
                    return;
                }
                class315.field5387 = new class26[class88.field1449.method2012(0)];
                class127.field1969 = 4;
            }
            if (class127.field1969 == 4) {
                if (class88.field1449.method2015(-18358) < (class315.field5387.length * 8)) {
                    return;
                }
                class300.field5157.field1301 = 0;
                class88.field1449.method2011(0, class315.field5387.length * 8, -18455, class300.field5157.field1280);
                for (int var2 = 0; var2 < class315.field5387.length; var2++) {
                    class315.field5387[var2] = class153.method1042(-29664, class300.field5157.method595(-125));
                }
                class259.field4238 = 21;
                class127.field1969 = 0;
                class88.field1449.method2018(14821);
                class88.field1449 = null;
                return;
            }
        } catch (IOException var4) {
            if (class88.field1449 != null) {
                class88.field1449.method2018(14821);
                class88.field1449 = null;
            }
            if (class300.field5174 < 1) {
                class300.field5174++;
                if (class319.field5446 == class104.field1661) {
                    class319.field5446 = class279.field4656;
                } else {
                    class319.field5446 = class104.field1661;
                }
                class108.field1692 = 0;
                class127.field1969 = 1;
            } else {
                class259.field4238 = -4;
                class127.field1969 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "(B)V", line = 252)
    public static void method911(byte arg0) {
        if (arg0 != -91) {
            method911((byte) 7);
        }
        field2072 = null;
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "()V", line = 261)
    public class135() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "(II)V", line = 284)
    public static final void method912(int arg0, int arg1) {
        field2070++;
        if (arg0 != -5) {
            field2069 = 109;
        }
        class32.field540.method1985(-128, arg1);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IB)[I", line = 301)
    public final int[] method8(int arg0, byte arg1) {
        field2071++;
        int var3 = 15 % ((30 - arg1) / 36);
        int[] var4 = this.field4733.method664(-16409, arg0);
        if (this.field4733.field1406) {
            int var5 = class59.field955[arg0] - 2048;
            for (int var6 = 0; var6 < class101.field1632; var6++) {
                int var7 = this.field2054 + var5;
                int var8 = class13.field184[var6] - 2048;
                int var9 = this.field2073 + var8;
                int var10 = var7 < -2048 ? var7 + 4096 : var7;
                int var11 = var10 > 2048 ? var10 - 4096 : var10;
                int var12 = this.field2059 + var8;
                int var13 = var9 < -2048 ? var9 + 4096 : var9;
                int var14 = var13 <= 2048 ? var13 : var13 - 4096;
                int var15 = var12 >= -2048 ? var12 : var12 + 4096;
                int var16 = var15 > 2048 ? var15 - 4096 : var15;
                int var17 = var5 + this.field2066;
                int var18 = var17 < -2048 ? var17 + 4096 : var17;
                int var19 = var18 > 2048 ? var18 - 4096 : var18;
                var4[var6] = this.method914(var14, var11, (byte) 113) || this.method913((byte) -44, var16, var19) ? 4096 : 0;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BII)Z", line = 360)
    private final boolean method913(byte arg0, int arg1, int arg2) {
        field2064++;
        int var4 = (arg1 + arg2) * this.field2058 >> 12;
        if (arg0 > -17) {
            method910((byte) 89);
        }
        int var5 = class36.field586[var4 * 255 >> 12 & 0xFF];
        int var6 = (var5 << 12) / this.field2058;
        int var7 = (var6 << 12) / this.field2075;
        int var8 = this.field2055 * var7 >> 12;
        return var8 > arg2 - arg1 && (-var8) < (arg2 - arg1);
    }

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "(I)V", line = 391)
    public final void method130(int arg0) {
        class321.method2237((byte) -9);
        field2060++;
        if (arg0 != 16251) {
            method915((byte) -85);
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(IIB)Z", line = 406)
    private final boolean method914(int arg0, int arg1, byte arg2) {
        int var4 = (arg1 - arg0) * this.field2058 >> 12;
        if (arg2 != 113) {
            this.method913((byte) -91, -79, -4);
        }
        field2068++;
        int var5 = class36.field586[(var4 * 255 & 0xFFD8C) >> 12];
        int var6 = (var5 << 12) / this.field2058;
        int var7 = (var6 << 12) / this.field2075;
        int var8 = this.field2055 * var7 >> 12;
        return (arg0 + arg1) < var8 && -var8 < arg0 + arg1;
    }

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "(B)V", line = 427)
    public static final void method915(byte arg0) {
        if (arg0 != -124) {
            field2072 = (class66) null;
        }
        int var1 = class201.field3136.length;
        field2067++;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class201.field3136[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class155.field2413; var4++) {
                    if (class293.field4884[var2] == class18.field263[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class18.field263[class155.field2413] = class293.field4884[var2];
                    var3 = class155.field2413++;
                }
                int var5 = 0;
                class82 var6 = new class82(class201.field3136[var2]);
                while (var6.field1301 < class201.field3136[var2].length && var5 < 511) {
                    int var7 = var5++ << 6 | var3;
                    int var8 = var6.method576(arg0 ^ 0xFFFFFF85);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = (class293.field4884[var2] >> 8) * 64 + var10 - class12.field157;
                    int var12 = var8 & 0x3F;
                    int var13 = (class293.field4884[var2] & 0xFF) * 64 + var12 - class165.field2568;
                    class187 var14 = class96.method720(var6.method576(1), 27112);
                    if (class185.field2877[var7] == null && (var14.field2925 & 0x1) > 0 && class109.field1737 == var9 && var11 >= 0 && var14.field2894 + var11 < 104 && var13 >= 0 && var13 + var14.field2894 < 104) {
                        class185.field2877[var7] = new class324();
                        class324 var15 = class185.field2877[var7];
                        class316.field5412[class81.field1270++] = var7;
                        var15.field3982 = class229.field3626;
                        var15.method2251(-1, var14);
                        var15.method1665(var15.field5565.field2894, 2);
                        var15.field3946 = var15.field3922 = class322.field5527[var15.field5565.field2926];
                        var15.field3916 = var15.field5565.field2932;
                        if (var15.field3916 == 0) {
                            var15.field3922 = 0;
                        }
                        var15.field3900 = var15.field5565.field2938;
                        var15.method1657(-2, var15.method1078((byte) 114), var11, var13, true);
                    }
                }
            }
        }
    }
}
