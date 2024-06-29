import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class454 {

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "Lec;")
    public static class129 field6477 = new class129(8);

    @OriginalMember(owner = "client!mp", name = "t", descriptor = "I")
    public static int field6490 = 0;

    @OriginalMember(owner = "client!mp", name = "v", descriptor = "[[B")
    public static byte[][] field6492 = new byte[250][];

    @OriginalMember(owner = "client!mp", name = "u", descriptor = "Lkn;")
    public static class442 field6491 = new class442("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "B")
    public byte field6471;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "B")
    public byte field6474;

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "B")
    public byte field6476;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "B")
    public byte field6482;

    @OriginalMember(owner = "client!mp", name = "n", descriptor = "B")
    public byte field6484;

    @OriginalMember(owner = "client!mp", name = "p", descriptor = "B")
    public byte field6486;

    @OriginalMember(owner = "client!mp", name = "w", descriptor = "B")
    public byte field6493;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "I")
    public static int field6475;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public static int field6478;

    @OriginalMember(owner = "client!mp", name = "q", descriptor = "I")
    public static int field6487;

    @OriginalMember(owner = "client!mp", name = "s", descriptor = "S")
    public short field6489;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "Z")
    public boolean field6472;

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "Z")
    public boolean field6473;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "Z")
    public boolean field6479;

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "Z")
    public boolean field6480;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "Z")
    public boolean field6481;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "Z")
    public boolean field6483;

    @OriginalMember(owner = "client!mp", name = "o", descriptor = "Z")
    public boolean field6485;

    @OriginalMember(owner = "client!mp", name = "r", descriptor = "Z")
    public boolean field6488;

    @OriginalMember(owner = "client!mp", name = "x", descriptor = "Z")
    public boolean field6494;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(B)V", line = 3)
    public static final void method2820(byte arg0) {
        field6487++;
        if (class19.field367 == 0) {
            return;
        }
        int var1 = -24 / ((-arg0 - 19) / 36);
        try {
            if ((++class401.field5703) > 2000) {
                if (class156.field2207 != null) {
                    class156.field2207.method2210(-2);
                    class156.field2207 = null;
                }
                if (class145.field2063 >= 1) {
                    class438.field6170 = -5;
                    class19.field367 = 0;
                    return;
                }
                class19.field367 = 1;
                class145.field2063++;
                if (class158.field2224 == class13.field262) {
                    class158.field2224 = class412.field5845;
                } else {
                    class158.field2224 = class13.field262;
                }
                class401.field5703 = 0;
            }
            if (class19.field367 == 1) {
                class7.field106 = class241.field3426.method1912(class158.field2224, 1, class366.field5163);
                class19.field367 = 2;
            }
            if (class19.field367 == 2) {
                if (class7.field106.field3998 == 2) {
                    throw new IOException();
                }
                if (class7.field106.field3998 != 1) {
                    return;
                }
                class156.field2207 = new class348((Socket) class7.field106.field3999, class241.field3426);
                class7.field106 = null;
                class156.field2207.method2203(class46.field648.field230, 0, class46.field648.field191, -20);
                if (class417.field5927 != null) {
                    class417.field5927.method272(2);
                }
                if (class119.field1682 != null) {
                    class119.field1682.method272(2);
                }
                int var2 = class156.field2207.method2207(16776960);
                if (class417.field5927 != null) {
                    class417.field5927.method272(2);
                }
                if (class119.field1682 != null) {
                    class119.field1682.method272(2);
                }
                if (var2 != 21) {
                    class438.field6170 = var2;
                    class19.field367 = 0;
                    class156.field2207.method2210(-2);
                    class156.field2207 = null;
                    return;
                }
                class19.field367 = 3;
            }
            if (class19.field367 == 3) {
                if (class156.field2207.method2213(102) < 1) {
                    return;
                }
                class264.field3685 = new String[class156.field2207.method2207(16776960)];
                class19.field367 = 4;
            }
            if (class19.field367 == 4 && class156.field2207.method2213(107) >= (class264.field3685.length * 8)) {
                class333.field4591.field191 = 0;
                class156.field2207.method2209(class264.field3685.length * 8, class333.field4591.field230, 0, 1509);
                for (int var3 = 0; var3 < class264.field3685.length; var3++) {
                    class264.field3685[var3] = class158.method1058(false, class333.field4591.method161(false));
                }
                class19.field367 = 0;
                class438.field6170 = 21;
                class156.field2207.method2210(-2);
                class156.field2207 = null;
            }
        } catch (IOException var4) {
            if (class156.field2207 != null) {
                class156.field2207.method2210(-2);
                class156.field2207 = null;
            }
            if (class145.field2063 < 1) {
                class145.field2063++;
                class401.field5703 = 0;
                class19.field367 = 1;
                if (class158.field2224 == class13.field262) {
                    class158.field2224 = class412.field5845;
                } else {
                    class158.field2224 = class13.field262;
                }
            } else {
                class438.field6170 = -4;
                class19.field367 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 160)
    public static void method2821(int arg0) {
        field6492 = null;
        field6491 = null;
        field6477 = null;
        if (arg0 != -2) {
            method2820((byte) -95);
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(II)I", line = 174)
    public static final int method2822(int arg0, int arg1) {
        return class126.field1782 == null ? 0 : class126.field1782[arg0][arg1] >>> 21 & 0x7F8;
    }

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "(II)V", line = 178)
    public static final void method2823(int arg0, int arg1) {
        field6475++;
        class239 var2 = class436.method2740(arg0, arg1, arg0 ^ 0xECBB0CEB);
        var2.method1628(14478);
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(BLak;IIII)V", line = 201)
    public static final void method2824(byte arg0, class194 arg1, int arg2, int arg3, int arg4, int arg5) {
        field6478++;
        if (arg1.field2664 == -1 && arg1.field2657 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class345.field4692 * arg1.field2666 >> 8;
        if (arg1.field2652 < arg2) {
            var6 += arg2 - arg1.field2652;
        } else if (arg1.field2661 > arg2) {
            var6 += arg1.field2661 - arg2;
        }
        if (arg0 != 42) {
            return;
        }
        if (arg1.field2673 < arg4) {
            var6 += arg4 - arg1.field2673;
        } else if (arg1.field2670 > arg4) {
            var6 += arg1.field2670 - arg4;
        }
        if (arg1.field2653 == 0 || (var6 - 64) > arg1.field2653 || class345.field4692 == 0 || arg1.field2671 != arg5) {
            if (arg1.field2659 != null) {
                class164.field2266.method2788(arg1.field2659);
                arg1.field2659 = null;
            }
            if (arg1.field2658 != null) {
                class164.field2266.method2788(arg1.field2658);
                arg1.field2658 = null;
            }
            return;
        }
        var6 -= 64;
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg1.field2653 - var6) * var7 / arg1.field2653;
        if (arg1.field2659 != null) {
            arg1.field2659.method2642(var8);
        } else if (arg1.field2664 >= 0) {
            class330 var9 = class330.method2128(class130.field1829, arg1.field2664, 0);
            if (var9 != null) {
                class256 var10 = var9.method2131().method1698(class64.field957);
                class421 var11 = class421.method2655(var10, 100, var8);
                var11.method2679(-1);
                class164.field2266.method2792(var11);
                arg1.field2659 = var11;
            }
        }
        if (arg1.field2658 != null) {
            arg1.field2658.method2642(var8);
            if (arg1.field2658.method2470((byte) -110)) {
                return;
            }
            arg1.field2658 = null;
        } else if (arg1.field2657 != null && (arg1.field2665 -= arg3) <= 0) {
            int var12 = (int) (Math.random() * (double) arg1.field2657.length);
            class330 var13 = class330.method2128(class130.field1829, arg1.field2657[var12], 0);
            if (var13 != null) {
                class256 var14 = var13.method2131().method1698(class64.field957);
                class421 var15 = class421.method2655(var14, 100, var8);
                var15.method2679(0);
                class164.field2266.method2792(var15);
                arg1.field2665 = arg1.field2668 + (int) (Math.random() * (double) (arg1.field2655 - arg1.field2668));
                arg1.field2658 = var15;
                return;
            }
        }
    }
}
