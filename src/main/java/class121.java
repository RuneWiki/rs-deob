import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class121 extends class69 {

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "Lbo;")
    public class16 field1706 = new class16();

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "Lde;")
    public class195 field1707 = new class195();

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "Lhf;")
    private class330 field1702;

    @OriginalMember(owner = "client!uc", name = "u", descriptor = "Lth;")
    public static class57 field1697 = new class57(16);

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "Lmd;")
    public static class127 field1704 = new class127();

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "J")
    public static volatile long field1711 = 0L;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field1710 = -2;

    @OriginalMember(owner = "client!uc", name = "p", descriptor = "I")
    public static int field1692;

    @OriginalMember(owner = "client!uc", name = "q", descriptor = "I")
    public static int field1693;

    @OriginalMember(owner = "client!uc", name = "r", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!uc", name = "s", descriptor = "I")
    public static int field1695;

    @OriginalMember(owner = "client!uc", name = "t", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!uc", name = "v", descriptor = "I")
    public static int field1698;

    @OriginalMember(owner = "client!uc", name = "w", descriptor = "I")
    public static int field1699;

    @OriginalMember(owner = "client!uc", name = "x", descriptor = "I")
    public static int field1700;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    public static int field1701;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    public static int field1705;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "[Z")
    public static boolean[] field1709;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z[B)[B", line = 6)
    public static final byte[] method898(boolean arg0, byte[] arg1) {
        int var2 = arg1.length;
        field1694++;
        byte[] var3 = new byte[var2];
        if (arg0) {
            method902(-26, (class190) null);
        }
        class84.method684(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Llk;II)V", line = 25)
    private final void method899(class286 arg0, int arg1, int arg2) {
        field1701++;
        if ((this.field1702.field5000[arg0.field4321] & 0x4) != 0 && arg0.field4305 < 0) {
            int var4 = this.field1702.field5017[arg0.field4321] / class56.field812;
            int var5 = (var4 + 1048575 - arg0.field4315) / var4;
            arg0.field4315 = arg0.field4315 + (arg2 * var4) & 0xFFFFF;
            if (var5 <= arg2) {
                if (this.field1702.field4968[arg0.field4321] == 0) {
                    arg0.field4333 = class226.method1672(arg0.field4306, arg0.field4333.method1653(), arg0.field4333.method1660(), arg0.field4333.method1671());
                } else {
                    arg0.field4333 = class226.method1672(arg0.field4306, arg0.field4333.method1653(), 0, arg0.field4333.method1671());
                    this.field1702.method2319(-679202554, arg0, arg0.field4317.field4412[arg0.field4331] < 0);
                }
                if (arg0.field4317.field4412[arg0.field4331] < 0) {
                    arg0.field4333.method1650(-1);
                }
                arg2 = arg0.field4315 / var4;
            }
        }
        if (arg1 != -14562) {
            method898(true, (byte[]) null);
        }
        arg0.field4333.method562(arg2);
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "()Lvc;", line = 68)
    public final class69 method559() {
        field1692++;
        class286 var1 = (class286) this.field1706.method93((byte) -120);
        if (var1 == null) {
            return null;
        } else if (var1.field4333 == null) {
            return this.method556();
        } else {
            return var1.field4333;
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "([III)V", line = 94)
    public final void method560(int[] arg0, int arg1, int arg2) {
        field1705++;
        this.field1707.method560(arg0, arg1, arg2);
        for (class286 var4 = (class286) this.field1706.method93((byte) -97); var4 != null; var4 = (class286) this.field1706.method97(-57)) {
            if (!this.field1702.method2297(var4, (byte) 111)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field4318) {
                        this.method901(var6, var5 + var6, 5678, var5, var4, arg0);
                        var4.field4318 -= var6;
                        break;
                    }
                    this.method901(var4.field4318, var5 + var6, 5678, var5, var4, arg0);
                    var6 -= var4.field4318;
                    var5 += var4.field4318;
                } while (!this.field1702.method2307(true, var5, arg0, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(B)V", line = 131)
    public static void method900(byte arg0) {
        field1704 = null;
        if (arg0 != -104) {
            method900((byte) -115);
        }
        field1709 = null;
        field1697 = null;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIILlk;[I)V", line = 145)
    private final void method901(int arg0, int arg1, int arg2, int arg3, class286 arg4, int[] arg5) {
        field1698++;
        if ((this.field1702.field5000[arg4.field4321] & 0x4) != 0 && arg4.field4305 < 0) {
            int var7 = this.field1702.field5017[arg4.field4321] / class56.field812;
            while (true) {
                int var8 = (var7 + 1048575 - arg4.field4315) / var7;
                if (var8 > arg0) {
                    arg4.field4315 += arg0 * var7;
                    break;
                }
                arg4.field4333.method560(arg5, arg3, var8);
                arg0 -= var8;
                arg4.field4315 += var7 * var8 - 1048576;
                arg3 += var8;
                int var9 = class56.field812 / 100;
                int var10 = 262144 / var7;
                class226 var11 = arg4.field4333;
                if (var10 < var9) {
                    var9 = var10;
                }
                if (this.field1702.field4968[arg4.field4321] == 0) {
                    arg4.field4333 = class226.method1672(arg4.field4306, var11.method1653(), var11.method1660(), var11.method1671());
                } else {
                    arg4.field4333 = class226.method1672(arg4.field4306, var11.method1653(), 0, var11.method1671());
                    this.field1702.method2319(-679202554, arg4, arg4.field4317.field4412[arg4.field4331] < 0);
                    arg4.field4333.method1663(var9, var11.method1660());
                }
                if (arg4.field4317.field4412[arg4.field4331] < 0) {
                    arg4.field4333.method1650(-1);
                }
                var11.method1668(var9);
                var11.method560(arg5, arg3, arg1 - arg3);
                if (var11.method1659()) {
                    this.field1707.method1398(var11);
                }
            }
        }
        if (arg2 == 5678) {
            arg4.field4333.method560(arg5, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ILsb;)V", line = 215)
    public static final void method902(int arg0, class190 arg1) {
        field1703++;
        if ((arg1.field2718.length - arg1.field2776) < 1) {
            return;
        }
        int var2 = arg1.method1319(arg0 ^ 0x5EC1);
        if (var2 < 0 || var2 > 11) {
            return;
        }
        byte var3;
        if (var2 == 11) {
            var3 = 33;
        } else if (var2 == 10) {
            var3 = 32;
        } else if (var2 == 9) {
            var3 = 31;
        } else if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > arg1.field2718.length - arg1.field2776) {
            return;
        }
        class257.field3849 = arg1.method1319(255);
        if (class257.field3849 < 1) {
            class257.field3849 = 1;
        } else if (class257.field3849 > 4) {
            class257.field3849 = 4;
        }
        class331.method2325(false, arg1.method1319(255) == 1);
        class197.field2863 = arg1.method1319(arg0 ^ 0x5EC1) == 1;
        class229.field3472 = arg1.method1319(255) == 1;
        class299.field4475 = arg1.method1319(255) == 1;
        class86.field1219 = arg1.method1319(arg0 - 23871) == 1;
        class324.field4888 = arg1.method1319(255) == 1;
        class291.field4410 = arg1.method1319(arg0 ^ 0x5EC1) == 1;
        class221.field3304 = arg1.method1319(255) == 1;
        class173.field2497 = arg1.method1319(arg0 - 23871);
        if (class173.field2497 > 2) {
            class173.field2497 = 2;
        }
        if (var2 < 2) {
            class98.field1379 = arg1.method1319(arg0 ^ 0x5EC1) == 1;
            arg1.method1319(255);
        } else {
            class98.field1379 = arg1.method1319(255) == 1;
        }
        class267.field4078 = arg1.method1319(255) == 1;
        class128.field1862 = arg1.method1319(255) == 1;
        class149.field2173 = arg1.method1319(255);
        if (class149.field2173 > 2) {
            class149.field2173 = 2;
        }
        class304.field4559 = class149.field2173;
        class177.field2547 = arg1.method1319(255) == 1;
        class38.field565 = arg1.method1319(arg0 ^ 0x5EC1);
        if (class38.field565 > 127) {
            class38.field565 = 127;
        }
        class267.field4077 = arg1.method1319(arg0 ^ 0x5EC1);
        class207.field3035 = arg1.method1319(255);
        if (class207.field3035 > 127) {
            class207.field3035 = 127;
        }
        if (var2 >= 1) {
            class96.field1365 = arg1.method1317((byte) 54);
            class285.field4298 = arg1.method1317((byte) 48);
        }
        if (var2 >= 3 && var2 < 6) {
            arg1.method1319(255);
        }
        if (var2 >= 4) {
            int var4 = arg1.method1319(255);
            if (class243.field3620 < 96) {
                var4 = 0;
            }
            class155.method1120(var4);
        }
        if (arg0 != 24126) {
            field1697 = (class57) null;
        }
        if (var2 >= 5) {
            class249.field3703 = arg1.method1371(-4);
        }
        if (var2 >= 6) {
            class135.field1971 = arg1.method1319(255);
        }
        if (var2 >= 7) {
            class130.field1879 = arg1.method1319(255) == 1;
        }
        if (var2 >= 8) {
            class274.field4156 = arg1.method1319(arg0 ^ 0x5EC1) == 1;
        }
        if (var2 >= 9) {
            class93.field1299 = arg1.method1319(arg0 - 23871);
        }
        if (var2 >= 10) {
            class133.field1948 = arg1.method1319(255) != 0;
        }
        if (var2 >= 11) {
            class123.field1795 = arg1.method1319(255) != 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()Lvc;", line = 378)
    public final class69 method556() {
        field1708++;
        class286 var1;
        do {
            var1 = (class286) this.field1706.method97(-68);
            if (var1 == null) {
                return null;
            }
        } while (var1.field4333 == null);
        return var1.field4333;
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(I)V", line = 398)
    public static final void method903(int arg0) {
        if ((class105.field1506 < class105.field1504)) {
            class105.field1506 = (float) ((double) class105.field1506 / 30.0D + (double) class105.field1506);
            if (class105.field1506 > class105.field1504) {
                class105.field1506 = class105.field1504;
            }
            class259.method1905(arg0 ^ 0x7D);
        } else if (class105.field1504 < class105.field1506) {
            class105.field1506 = (float) ((double) class105.field1506 - (double) class105.field1506 / 30.0D);
            if (class105.field1504 > class105.field1506) {
                class105.field1506 = class105.field1504;
            }
            class259.method1905(arg0 - 94);
        }
        if (class299.field4473 != arg0 && class362.field5742 != -1) {
            int var1 = class362.field5742 - class124.field1810;
            int var2 = class299.field4473 - class147.field2114;
            if (var1 < 2 || var1 > 2) {
                var1 >>= 0x4;
            }
            if (var2 < 2 || var2 > 2) {
                var2 >>= 0x4;
            }
            class124.field1810 += var1;
            if (var2 == 0 && var1 == 0) {
                class299.field4473 = -1;
                class362.field5742 = -1;
            }
            class147.field2114 += var2;
            class259.method1905(-127);
        }
        if (class107.field1528 > 0) {
            class68.field994--;
            if (class68.field994 == 0) {
                class68.field994 = 100;
                class107.field1528--;
            }
        } else {
            class41.field596 = -1;
            class209.field3047 = -1;
        }
        if (class30.field430 && class49.field727 != null) {
            for (class92 var3 = (class92) class49.field727.method93((byte) -63); var3 != null; var3 = (class92) class49.field727.method97(-70)) {
                class200 var4 = class349.method2447(var3.field1270.field4350, (byte) -9);
                if (class177.field2541 == 0 && var3.method725(117, class56.field815, class165.field2353)) {
                    if (!var3.field1270.field4349) {
                        var3.field1270.field4349 = true;
                        class313.method2187(var3.field1270.field4350, var4.field2915, 15, false);
                    }
                    if (var3.field1270.field4349) {
                        class313.method2187(var3.field1270.field4350, var4.field2915, 17, false);
                    }
                } else if (var3.field1270.field4349) {
                    var3.field1270.field4349 = false;
                    class313.method2187(var3.field1270.field4350, var4.field2915, 16, false);
                }
            }
        }
        field1695++;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lhf;)V", line = 570)
    public class121(class330 arg0) {
        this.field1702 = arg0;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 513)
    public final void method562(int arg0) {
        field1696++;
        this.field1707.method562(arg0);
        for (class286 var2 = (class286) this.field1706.method93((byte) -31); var2 != null; var2 = (class286) this.field1706.method97(-50)) {
            if (!this.field1702.method2297(var2, (byte) 72)) {
                int var3 = arg0;
                do {
                    if (var2.field4318 >= var3) {
                        this.method899(var2, -14562, var3);
                        var2.field4318 -= var3;
                        break;
                    }
                    this.method899(var2, -14562, var2.field4318);
                    var3 -= var2.field4318;
                } while (!this.field1702.method2307(true, 0, (int[]) null, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)V", line = 545)
    public static final void method904(int arg0) {
        field1693++;
        if (arg0 == -3) {
            class235.field3533.method462(24);
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "()I", line = 564)
    public final int method558() {
        field1700++;
        return 0;
    }
}
