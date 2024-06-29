import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class143 extends class544 {

    @OriginalMember(owner = "client!uh", name = "z", descriptor = "I")
    public int field1721 = 0;

    @OriginalMember(owner = "client!uh", name = "B", descriptor = "Lml;")
    private class325 field1723;

    @OriginalMember(owner = "client!uh", name = "x", descriptor = "I")
    public int field1719;

    @OriginalMember(owner = "client!uh", name = "I", descriptor = "I")
    public int field1729;

    @OriginalMember(owner = "client!uh", name = "H", descriptor = "[I")
    private int[] field1728;

    @OriginalMember(owner = "client!uh", name = "r", descriptor = "I")
    public int field1713;

    @OriginalMember(owner = "client!uh", name = "F", descriptor = "F")
    public float field1726;

    @OriginalMember(owner = "client!uh", name = "w", descriptor = "Lbda;")
    private class428 field1718;

    @OriginalMember(owner = "client!uh", name = "C", descriptor = "I")
    public int field1724;

    @OriginalMember(owner = "client!uh", name = "u", descriptor = "[B")
    public static byte[] field1716 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "[I")
    public static int[] field1708 = new int[13];

    @OriginalMember(owner = "client!uh", name = "J", descriptor = "I")
    public static int field1730 = 2;

    @OriginalMember(owner = "client!uh", name = "n", descriptor = "I")
    public static int field1709;

    @OriginalMember(owner = "client!uh", name = "q", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!uh", name = "t", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!uh", name = "v", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!uh", name = "y", descriptor = "I")
    public static int field1720;

    @OriginalMember(owner = "client!uh", name = "A", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!uh", name = "E", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!uh", name = "G", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!uh", name = "s", descriptor = "Lrq;")
    private class293 field1714;

    @OriginalMember(owner = "client!uh", name = "o", descriptor = "Ljaclib/memory/Stream;")
    private Stream field1710;

    @OriginalMember(owner = "client!uh", name = "K", descriptor = "Ljaclib/memory/heap/NativeHeapBuffer;")
    private NativeHeapBuffer field1731;

    @OriginalMember(owner = "client!uh", name = "p", descriptor = "[I")
    public static int[] field1711;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIFII)V")
    public final void method784(int arg0, int arg1, float arg2, int arg3, int arg4) {
        field1722++;
        if (this.field1729 != -1) {
            class217 var6 = this.field1718.field2481.method119(-124, this.field1729);
            int var7 = var6.field2656 & 0xFF;
            if (var7 != 0 && var6.field2657 != 4) {
                int var8;
                if (arg0 < 0) {
                    var8 = 0;
                } else if (arg0 <= 127) {
                    var8 = arg0 * 131586;
                } else {
                    var8 = 16777215;
                }
                if (var7 == 256) {
                    arg3 = var8;
                } else {
                    int var10 = 256 - var7;
                    arg3 = ((arg3 & 0xFF00) * var10 + (var8 & 0xFF00) * var7 & 0xFF0000) + ((arg3 & 0xFF00FF) * var10 + (var8 & 0xFF00FF) * var7 & 0xFF00FF00) >> 8;
                }
            }
            int var11 = var6.field2644 & 0xFF;
            if (var11 != 0) {
                var11 += 256;
                int var12 = (arg3 >> 16 & 0xFF) * var11;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                int var13 = ((arg3 & 0xFF00) >> 8) * var11;
                if (var13 > 65535) {
                    var13 = 65535;
                }
                int var14 = (arg3 & 0xFF) * var11;
                if (var14 > 65535) {
                    var14 = 65535;
                }
                arg3 = (var14 >> 8) + ((var12 & 0x7400FF00) << 8) + (var13 & 0xFF00);
            }
        }
        if (arg2 != 1.0F) {
            int var15 = (arg3 & 0xFFBE6E) >> 16;
            int var16 = (arg3 & 0xFF72) >> 8;
            int var17 = (int) ((float) var15 * arg2);
            int var18 = arg3 & 0xFF;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            int var19 = (int) ((float) var16 * arg2);
            if (var19 < 0) {
                var19 = 0;
            } else if (var19 > 255) {
                var19 = 255;
            }
            int var20 = (int) ((float) var18 * arg2);
            if (var20 < 0) {
                var20 = 0;
            } else if (var20 > 255) {
                var20 = 255;
            }
            arg3 = var20 | var17 << 16 | var19 << 8;
        }
        this.field1710.method3338(arg1 * 4);
        if (this.field1718.field5766 == arg4) {
            this.field1710.method3337((byte) arg3);
            this.field1710.method3337((byte) (arg3 >> 8));
            this.field1710.method3337((byte) (arg3 >> 16));
        } else {
            this.field1710.method3337((byte) (arg3 >> 16));
            this.field1710.method3337((byte) (arg3 >> 8));
            this.field1710.method3337((byte) arg3);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIB)I")
    public static final int method785(int arg0, int arg1, byte arg2) {
        field1715++;
        if (arg1 == 4 || arg1 == 5) {
            return class329.field4298[arg0 & 0x3];
        } else {
            if (arg2 != -93) {
                method785(109, -109, (byte) -21);
            }
            return 256;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BI)V")
    public final void method786(byte arg0, int arg1) {
        field1709++;
        if (arg0 > 9) {
            this.field1710.method3338(arg1 * 4 + 3);
            this.field1710.method3337(-1);
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(BIII)V")
    public final void method787(byte arg0, int arg1, int arg2, int arg3) {
        this.field1728[this.field1723.field2116 * arg2 + arg1] = class42.method223(this.field1728[this.field1723.field2116 * arg2 + arg1], 0x1 << arg3);
        if (arg0 > 115) {
            field1725++;
            this.field1721++;
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(II)Loj;")
    public static final class318 method788(int arg0, int arg1) {
        if (arg0 != 0) {
            field1716 = null;
        }
        field1720++;
        class354[] var2 = class463.field6478;
        synchronized (class463.field6478) {
            class318 var3;
            if (class463.field6478.length <= arg1 || class463.field6478[arg1].method1989((byte) 93)) {
                var3 = new class318();
                var3.field4059 = new class517[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    var3.field4059[var4] = new class517();
                }
            } else {
                var3 = (class318) class463.field6478[arg1].method1995(0);
                var3.method610((byte) -90);
                int var10002 = class509.field7204[arg1]--;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "(II)V")
    public final void method789(int arg0, int arg1) {
        field1717++;
        this.field1710.method3342();
        this.field1714 = this.field1718.method1823(117, false);
        if (arg0 <= -35) {
            this.field1714.method439(arg1 * 4, this.field1731, 26190, 4);
            this.field1731 = null;
            this.field1710 = null;
        }
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Z)V")
    public static void method790(boolean arg0) {
        if (!arg0) {
            method785(68, 76, (byte) 13);
        }
        field1708 = null;
        field1716 = null;
        field1711 = null;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(ZI[I)V")
    public final void method791(boolean arg0, int arg1, int[] arg2) {
        field1727++;
        class419 var4 = this.field1718.method2425(this.field1721 * 3, -22571);
        Buffer var5 = var4.method440(-109, arg0);
        if (var5 == null) {
            return;
        }
        Stream var6 = this.field1718.method2426(var5, (byte) 11);
        int var7 = 0;
        int var8 = 32767;
        int var9 = -32768;
        if (Stream.method3340()) {
            label122: for (int var10 = 0; var10 < arg1; var10++) {
                int var11 = arg2[var10];
                int var12 = this.field1728[var11];
                short[] var13 = this.field1723.field4124[var11];
                if (var12 != 0 && var13 != null) {
                    int var14 = 0;
                    int var15 = 0;
                    while (true) {
                        while (true) {
                            if (var13.length <= var15) {
                                continue label122;
                            }
                            if ((0x1 << var14++ & var12) == 0) {
                                var15 += 3;
                            } else {
                                for (int var16 = 0; var16 < 3; var16++) {
                                    int var17 = var13[var15++] & 0xFFFF;
                                    var6.method3339(var17);
                                    if (var17 > var9) {
                                        var9 = var17;
                                    }
                                    if (var17 < var8) {
                                        var8 = var17;
                                    }
                                }
                                var7++;
                            }
                        }
                    }
                }
            }
        } else {
            label96: for (int var18 = 0; var18 < arg1; var18++) {
                int var20 = arg2[var18];
                int var21 = this.field1728[var20];
                short[] var22 = this.field1723.field4124[var20];
                if (var21 != 0 && var22 != null) {
                    int var23 = 0;
                    int var24 = 0;
                    while (true) {
                        while (true) {
                            if (var24 >= var22.length) {
                                continue label96;
                            }
                            if ((var21 & 0x1 << var23++) == 0) {
                                var24 += 3;
                            } else {
                                var7++;
                                for (int var25 = 0; var25 < 3; var25++) {
                                    int var26 = var22[var24++] & 0xFFFF;
                                    var6.method3341(var26);
                                    if (var26 > var9) {
                                        var9 = var26;
                                    }
                                    if (var26 < var8) {
                                        var8 = var26;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        var6.method3342();
        if (!var4.method442(121) || var7 <= 0) {
            return;
        }
        this.field1718.method2439(this.field1729, (this.field1723.field4126 & 0x8) != 0, (this.field1723.field4126 & 0x7) != 0, (byte) 123);
        if (this.field1718.field5705) {
            this.field1718.method1159(Integer.MAX_VALUE, this.field1713, this.field1719, this.field1724);
        }
        class335 var19 = this.field1718.method2479((byte) 89);
        var19.method1878(1.0F / this.field1726, (byte) -61, 1.0F, 1.0F / this.field1726);
        this.field1718.method2431((byte) -87, class187.field2256);
        this.field1718.method1837(this.field1723.field4155, 9);
        this.field1718.method1792(this.field1714, 1, (byte) 89);
        this.field1718.method1801(var8, var9 + 1 - var8, 1440, class384.field5077, var4, var7, 0);
        this.field1718.method2447(arg0);
    }

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "(II)V")
    public final void method792(int arg0, int arg1) {
        field1712++;
        if (arg1 == -16011) {
            this.field1731 = this.field1718.method2451(true, arg0 * 4, true);
            this.field1710 = new Stream(this.field1731, 0, arg0 * 4);
        }
    }

    @OriginalMember(owner = "client!uh", name = "<init>", descriptor = "(Lml;IIIII)V")
    public class143(class325 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field1723 = arg0;
        this.field1719 = arg4;
        this.field1729 = arg1;
        this.field1728 = new int[this.field1723.field2116 * this.field1723.field2114];
        this.field1713 = arg3;
        this.field1726 = arg2;
        this.field1718 = this.field1723.field4114;
        this.field1724 = arg5;
    }
}
