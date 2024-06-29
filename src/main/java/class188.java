import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class188 {

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "Lpf;")
    private class485 field2559 = new class485();

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Lpf;")
    private class485 field2560 = new class485();

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Lpf;")
    private class485 field2561 = new class485();

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "Lpf;")
    private class485 field2562 = new class485();

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "Lvt;")
    private class179 field2565 = new class179(4);

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "B")
    private byte field2569 = 0;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "I")
    public volatile int field2570 = 0;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public volatile int field2567 = 0;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "Lvt;")
    private class179 field2568 = new class179(8);

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "J")
    public static long field2543 = 0L;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field2549 = 0;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field2554 = 0;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "[I")
    public static int[] field2548 = new int[2];

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "[B")
    public static byte[] field2556 = new byte[2048];

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field2558;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "I")
    private int field2563;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "J")
    private long field2566;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "Lue;")
    private class142 field2564;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "Lwo;")
    private class57 field2571;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[Lr;")
    public static class69[] field2540;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 4)
    public final void method1021(int arg0) {
        if (this.field2564 != null) {
            this.field2564.method670((byte) 80);
        }
        field2542++;
        if (arg0 > -5) {
            field2554 = 79;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZLue;B)V", line = 18)
    public final void method1022(boolean arg0, class142 arg1, byte arg2) {
        field2558++;
        if (this.field2564 != null) {
            try {
                this.field2564.method669(5000);
            } catch (Exception var8) {
            }
            this.field2564 = null;
        }
        this.field2564 = arg1;
        this.method1026((byte) -95);
        this.method1030(arg0, (byte) -122);
        this.field2571 = null;
        this.field2568.field2206 = 0;
        while (true) {
            class57 var4 = (class57) this.field2560.method2865(2);
            if (var4 == null) {
                while (true) {
                    class57 var5 = (class57) this.field2562.method2865(2);
                    if (var5 == null) {
                        if (this.field2569 != 0) {
                            try {
                                this.field2565.field2206 = 0;
                                this.field2565.method909(4, -1);
                                this.field2565.method909(this.field2569, -1);
                                this.field2565.method884(0, true);
                                this.field2564.method675(4, 0, (byte) 30, this.field2565.field2159);
                            } catch (IOException var7) {
                                try {
                                    this.field2564.method669(5000);
                                } catch (Exception var6) {
                                }
                                this.field2567 = -2;
                                this.field2564 = null;
                                this.field2570++;
                            }
                        }
                        this.field2563 = 0;
                        if (arg2 != -70) {
                            this.field2562 = null;
                        }
                        this.field2566 = class434.method2591(arg2 - 19240);
                        return;
                    }
                    this.field2561.method2866(var5, 674847596);
                }
            }
            this.field2559.method2866(var4, 674847596);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 89)
    public final void method1023(byte arg0) {
        if (this.field2564 != null) {
            this.field2564.method669(5000);
        }
        int var2 = -107 / ((arg0 - 27) / 54);
        field2557++;
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)Z", line = 108)
    public final boolean method1024(int arg0) {
        if (arg0 != 8) {
            field2548 = null;
        }
        field2555++;
        return this.method1025(-102) >= 20;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)I", line = 120)
    public final int method1025(int arg0) {
        if (arg0 >= -51) {
            return -2;
        } else {
            field2544++;
            return this.field2559.method2868((byte) -81) + this.field2560.method2868((byte) -105);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V", line = 131)
    private final void method1026(byte arg0) {
        field2551++;
        if (this.field2564 == null) {
            return;
        }
        try {
            this.field2565.field2206 = 0;
            this.field2565.method909(6, -1);
            if (arg0 >= -12) {
                field2554 = 9;
            }
            this.field2565.method904(3, 1036808816);
            this.field2564.method675(4, 0, (byte) -97, this.field2565.field2159);
        } catch (IOException var3) {
            try {
                this.field2564.method669(5000);
            } catch (Exception var2) {
            }
            this.field2570++;
            this.field2564 = null;
            this.field2567 = -2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V", line = 159)
    public final void method1027(int arg0) {
        try {
            this.field2564.method669(5000);
        } catch (Exception var2) {
        }
        if (arg0 != 20603) {
            this.method1028(13);
        }
        field2546++;
        this.field2564 = null;
        this.field2570++;
        this.field2569 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
        this.field2567 = -1;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Z", line = 180)
    public final boolean method1028(int arg0) {
        field2541++;
        if (arg0 != 1) {
            this.method1023((byte) -11);
        }
        return this.method1032(arg0 - 1913) >= 20;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)V", line = 194)
    public final void method1029(byte arg0) {
        field2547++;
        if (this.field2564 == null) {
            return;
        }
        try {
            this.field2565.field2206 = 0;
            this.field2565.method909(7, -1);
            this.field2565.method904(0, 1036808816);
            this.field2564.method675(4, 0, (byte) 94, this.field2565.field2159);
            if (arg0 > -107) {
                this.field2561 = null;
            }
        } catch (IOException var3) {
            try {
                this.field2564.method669(5000);
            } catch (Exception var2) {
            }
            this.field2570++;
            this.field2564 = null;
            this.field2567 = -2;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZB)V", line = 222)
    public final void method1030(boolean arg0, byte arg1) {
        field2545++;
        if (this.field2564 == null || arg1 > -120) {
            return;
        }
        try {
            this.field2565.field2206 = 0;
            this.field2565.method909(arg0 ? 2 : 3, -1);
            this.field2565.method904(0, 1036808816);
            this.field2564.method675(4, 0, (byte) 115, this.field2565.field2159);
        } catch (IOException var4) {
            try {
                this.field2564.method669(5000);
            } catch (Exception var3) {
            }
            this.field2564 = null;
            this.field2567 = -2;
            this.field2570++;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 251)
    public static void method1031(boolean arg0) {
        if (!arg0) {
            field2543 = 42L;
        }
        field2548 = null;
        field2540 = null;
        field2556 = null;
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)I", line = 267)
    private final int method1032(int arg0) {
        if (arg0 == -1912) {
            field2552++;
            return this.field2561.method2868((byte) -89) + this.field2562.method2868((byte) -87);
        } else {
            return -23;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BIIIZ)Lwo;", line = 291)
    public final class57 method1033(byte arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field2553++;
        long var6 = (long) ((arg1 << 16) + arg3);
        class57 var8 = new class57();
        var8.field721 = arg0;
        var8.field4921 = arg4;
        var8.field199 = var6;
        if (arg2 != 0) {
            return null;
        }
        if (arg4) {
            if (this.method1025(arg2 ^ 0xFFFFFF9F) >= 20) {
                throw new RuntimeException();
            }
            this.field2559.method2866(var8, 674847596);
        } else if (this.method1032(-1912) < 20) {
            this.field2561.method2866(var8, arg2 + 674847596);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)Z", line = 335)
    public final boolean method1034(byte arg0) {
        field2550++;
        if (this.field2564 != null) {
            long var2 = class434.method2591(-19310);
            int var4 = (int) (var2 - this.field2566);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field2566 = var2;
            this.field2563 += var4;
            if (this.field2563 > 30000) {
                try {
                    this.field2564.method669(arg0 ^ 0xFFFFEC2D);
                } catch (Exception var27) {
                }
                this.field2564 = null;
            }
        }
        if (this.field2564 == null) {
            return this.method1025(-94) == 0 && this.method1032(arg0 ^ 0x72D) == 0;
        }
        try {
            this.field2564.method668(0);
            if (arg0 != -91) {
                return false;
            }
            for (class57 var5 = (class57) this.field2559.method2862(2); var5 != null; var5 = (class57) this.field2559.method2869(true)) {
                this.field2565.field2206 = 0;
                this.field2565.method909(1, -1);
                this.field2565.method904((int) var5.field199, 1036808816);
                this.field2564.method675(4, 0, (byte) 68, this.field2565.field2159);
                this.field2560.method2866(var5, 674847596);
            }
            for (class57 var6 = (class57) this.field2561.method2862(arg0 + 93); var6 != null; var6 = (class57) this.field2561.method2869(true)) {
                this.field2565.field2206 = 0;
                this.field2565.method909(0, -1);
                this.field2565.method904((int) var6.field199, arg0 + 1036808907);
                this.field2564.method675(4, 0, (byte) -114, this.field2565.field2159);
                this.field2562.method2866(var6, 674847596);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field2564.method676((byte) -79);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field2563 = 0;
                byte var9 = 0;
                if (this.field2571 == null) {
                    var9 = 8;
                } else if (this.field2571.field716 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field2571.field723.field2159.length - this.field2571.field721;
                    int var11 = 512 - this.field2571.field716;
                    if (var10 - this.field2571.field723.field2206 < var11) {
                        var11 = var10 - this.field2571.field723.field2206;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field2564.method672(this.field2571.field723.field2159, this.field2571.field723.field2206, (byte) -51, var11);
                    if (this.field2569 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field2571.field723.field2159[this.field2571.field723.field2206 + var12] = (byte) class293.method1843(this.field2571.field723.field2159[this.field2571.field723.field2206 + var12], this.field2569);
                        }
                    }
                    this.field2571.field716 += var11;
                    this.field2571.field723.field2206 += var11;
                    if (this.field2571.field723.field2206 == var10) {
                        this.field2571.method104((byte) -88);
                        this.field2571.field4927 = false;
                        this.field2571 = null;
                    } else if (this.field2571.field716 == 512) {
                        this.field2571.field716 = 0;
                    }
                } else {
                    int var13 = var9 - this.field2568.field2206;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field2564.method672(this.field2568.field2159, this.field2568.field2206, (byte) -93, var13);
                    if (this.field2569 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field2568.field2159[this.field2568.field2206 + var14] = (byte) class293.method1843(this.field2568.field2159[this.field2568.field2206 + var14], this.field2569);
                        }
                    }
                    this.field2568.field2206 += var13;
                    if (this.field2568.field2206 >= var9) {
                        if (this.field2571 == null) {
                            this.field2568.field2206 = 0;
                            int var15 = this.field2568.method895((byte) -76);
                            int var16 = this.field2568.method916(21933);
                            int var17 = this.field2568.method895((byte) -91);
                            int var18 = this.field2568.method939((byte) 66);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class57 var24;
                            if (var20) {
                                for (var24 = (class57) this.field2562.method2862(2); var24 != null && var24.field199 != var21; var24 = (class57) this.field2562.method2869(true)) {
                                }
                            } else {
                                for (var24 = (class57) this.field2560.method2862(2); var24 != null && var24.field199 != var21; var24 = (class57) this.field2560.method2869(true)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            this.field2571 = var24;
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field2571.field723 = new class179(var18 + var25 + this.field2571.field721);
                            this.field2571.field723.method909(var19, -1);
                            this.field2571.field723.method897(var18, -115);
                            this.field2571.field716 = 8;
                            this.field2568.field2206 = 0;
                        } else if (this.field2571.field716 != 0) {
                            throw new IOException();
                        } else if (this.field2568.field2159[0] == -1) {
                            this.field2571.field716 = 1;
                            this.field2568.field2206 = 0;
                        } else {
                            this.field2571 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field2564.method669(5000);
            } catch (Exception var26) {
            }
            this.field2567 = -2;
            this.field2570++;
            this.field2564 = null;
            return this.method1025(-52) == 0 && this.method1032(-1912) == 0;
        }
    }
}
