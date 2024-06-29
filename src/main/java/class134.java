import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class134 {

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "I")
    private int field2501 = 32;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "J")
    private long field2489 = class223.method1584(-25392);

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    private int field2511 = 0;

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "J")
    private long field2515 = 0L;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    private int field2516 = 0;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "[Lbh;")
    private class7[] field2514 = new class7[8];

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    private int field2518 = 0;

    @OriginalMember(owner = "client!ak", name = "J", descriptor = "J")
    private long field2521 = 0L;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    private int field2520 = 0;

    @OriginalMember(owner = "client!ak", name = "K", descriptor = "Z")
    private boolean field2522 = true;

    @OriginalMember(owner = "client!ak", name = "L", descriptor = "[Lbh;")
    private class7[] field2523 = new class7[8];

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "Lhj;")
    public static class69 field2503 = class181.method1318("leuchten3:", (byte) -110);

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field2509 = 0;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field2487;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2493;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    public static int field2498;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public static int field2499;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public int field2512;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    private int field2513;

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public int field2517;

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "I")
    public static int field2519;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Lbh;")
    private class7 field2490;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "[I")
    public int[] field2505;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method992(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var8 = 2048 - arg6 & 0x7FF;
        field2495++;
        int var9 = 2048 - arg0 & 0x7FF;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = class178.field3232[var8];
            int var14 = class178.field3247[var8];
            var10 = -arg2 * var14 >> 16;
            var12 = arg2 * var13 >> 16;
        }
        if (var9 != 0) {
            int var15 = class178.field3247[var9];
            var11 = var12 * var15 >> 16;
            int var16 = class178.field3232[var9];
            var12 = var12 * var16 >> 16;
        }
        class162.field3006 = arg0;
        class148.field2753 = arg6;
        class127.field2327 = arg5 - var11;
        if (arg4 != -305256944) {
            method1005(false);
        }
        class123.field2291 = arg7 - var12;
        class31.field427 = arg1 - var10;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "([II)V")
    private final void method993(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class256.field4597) {
            var3 = arg1 << 1;
        }
        class1.method5(arg0, 0, var3);
        this.field2520 -= arg1;
        if (this.field2490 != null && this.field2520 <= 0) {
            this.field2520 += class133.field2473 >> 4;
            class44.method248((byte) 37, this.field2490);
            this.method998(this.field2490, this.field2490.method29(), -38);
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label107: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class7 var10 = null;
                        class7 var11 = this.field2523[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class87 var12 = var11.field51;
                                if (var12 == null || var12.field1669 <= var8) {
                                    var11.field50 = true;
                                    int var13 = var11.method35();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1669 += var13;
                                    }
                                    if (var4 >= this.field2501) {
                                        break label107;
                                    }
                                    class7 var14 = var11.method33();
                                    if (var14 != null) {
                                        int var15 = var11.field48;
                                        while (var14 != null) {
                                            this.method998(var14, var15 * var14.method29() >> 8, -66);
                                            var14 = var11.method34();
                                        }
                                    }
                                    class7 var16 = var11.field49;
                                    var11.field49 = null;
                                    if (var10 == null) {
                                        this.field2523[var7] = var16;
                                    } else {
                                        var10.field49 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field2514[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field49;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class7 var18 = this.field2523[var17];
                this.field2523[var17] = this.field2514[var17] = null;
                while (var18 != null) {
                    class7 var19 = var18.field49;
                    var18.field49 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field2520 < 0) {
            this.field2520 = 0;
        }
        if (this.field2490 != null) {
            this.field2490.method32(arg0, 0, arg1);
        }
        this.field2489 = class223.method1584(-25392);
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "()I")
    public int method203() throws Exception {
        field2492++;
        return this.field2512;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILbh;)V")
    public final synchronized void method994(int arg0, class7 arg1) {
        this.field2490 = arg1;
        if (arg0 == -7667) {
            field2494++;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public void method200(int arg0) throws Exception {
        field2496++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public final synchronized void method995(byte arg0) {
        field2497++;
        if (this.field2505 == null) {
            return;
        }
        long var2 = class223.method1584(-25392);
        try {
            if (this.field2515 != 0L) {
                if (var2 < this.field2515) {
                    return;
                }
                this.method200(this.field2512);
                this.field2515 = 0L;
                this.field2522 = true;
            }
            if (arg0 <= 92) {
                this.method205();
            }
            int var4 = this.method203();
            if (this.field2518 < (this.field2516 - var4)) {
                this.field2518 = this.field2516 - var4;
            }
            int var5 = this.field2517 + this.field2513;
            if ((var5 + 256) > 16384) {
                var5 = 16128;
            }
            if (var5 + 256 > this.field2512) {
                this.field2512 += 1024;
                if (this.field2512 > 16384) {
                    this.field2512 = 16384;
                }
                var4 = 0;
                this.method205();
                this.method200(this.field2512);
                this.field2522 = true;
                if (this.field2512 < var5 + 256) {
                    var5 = this.field2512 - 256;
                    this.field2513 = var5 - this.field2517;
                }
            }
            while (var5 > var4) {
                this.method993(this.field2505, 256);
                var4 += 256;
                this.method204();
            }
            if (var2 > this.field2521) {
                if (this.field2522) {
                    this.field2522 = false;
                } else if (this.field2518 == 0 && this.field2511 == 0) {
                    this.method205();
                    this.field2515 = var2 + 2000L;
                    return;
                } else {
                    this.field2513 = Math.min(this.field2511, this.field2518);
                    this.field2511 = this.field2518;
                }
                this.field2521 = var2 + 2000L;
                this.field2518 = 0;
            }
            this.field2516 = var4;
        } catch (Exception var7) {
            this.method205();
            this.field2515 = var2 + 2000L;
        }
        try {
            if (var2 > (this.field2489 + 500000L)) {
                var2 = this.field2489;
            }
            while (var2 > this.field2489 + 5000L) {
                this.method1002((byte) 7, 256);
                this.field2489 += (long) (256000 / class133.field2473);
            }
        } catch (Exception var6) {
            this.field2489 = var2;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public final synchronized void method996(int arg0) {
        field2500++;
        this.field2522 = true;
        try {
            this.method201();
            if (arg0 != 8350) {
                this.field2489 = 93L;
            }
        } catch (Exception var2) {
            this.method205();
            this.field2515 = class223.method1584(arg0 ^ 0xFFFFBC4E) + 2000L;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z[Lhj;[S)V")
    public static final void method997(boolean arg0, class69[] arg1, short[] arg2) {
        field2519++;
        if (arg0) {
            class242.method1720(0, arg1.length - 1, 3, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lbh;II)V")
    private final void method998(class7 arg0, int arg1, int arg2) {
        field2506++;
        if (arg2 > -7) {
            method1005(true);
        }
        int var4 = arg1 >> 5;
        class7 var5 = this.field2514[var4];
        if (var5 == null) {
            this.field2523[var4] = arg0;
        } else {
            var5.field49 = arg0;
        }
        this.field2514[var4] = arg0;
        arg0.field48 = arg1;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method202(Component arg0) throws Exception {
        field2486++;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public final void method999(byte arg0) {
        this.field2522 = true;
        field2491++;
        if (arg0 < 117) {
            method1000(-12, (class108) null, false, -9);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ILth;ZI)V")
    public static final void method1000(int arg0, class108 arg1, boolean arg2, int arg3) {
        if (!arg2) {
            return;
        }
        if ((arg0 & 0x20) != 0) {
            arg1.field3989 = class199.field3595.method963(false);
            if (arg1.field3989.method490(102, 0) == 126) {
                arg1.field3989 = arg1.field3989.method478(-123, 1);
                class122.method881(2, arg1.method816(1), arg1.field3989, !arg2);
            } else if (class156.field2904 == arg1) {
                class122.method881(2, arg1.method816(1), arg1.field3989, !arg2);
            }
            arg1.field4036 = 150;
            arg1.field4029 = 0;
            arg1.field4040 = 0;
        }
        field2498++;
        if ((arg0 & 0x80) != 0) {
            int var4 = class199.field3595.method917(255);
            int var5 = class199.field3595.method946(false);
            arg1.method1572(class180.field3272, var5, 0, var4);
            arg1.field4042 = class180.field3272 + 300;
            arg1.field4032 = class199.field3595.method946(false);
        }
        if ((arg0 & 0x8) != 0) {
            arg1.field4060 = class199.field3595.method961(-268435456);
            arg1.field4053 = class199.field3595.method962((byte) 99);
        }
        if ((arg0 & 0x4) != 0) {
            arg1.field4025 = class199.field3595.method912(-102);
            if (arg1.field4025 == 65535) {
                arg1.field4025 = -1;
            }
        }
        if ((arg0 & 0x40) != 0) {
            int var6 = class199.field3595.method930((byte) 52);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = class199.field3595.method937(!arg2);
            class53.method314(var7, var6, !arg2, arg1);
        }
        if ((arg0 & 0x200) != 0) {
            arg1.field3992 = class199.field3595.method961(-268435456);
            int var8 = class199.field3595.method944(false);
            arg1.field4020 = (var8 & 0xFFFF) + class180.field3272;
            arg1.field4035 = var8 >> 16;
            if (arg1.field3992 == 65535) {
                arg1.field3992 = -1;
            }
            arg1.field4027 = 0;
            arg1.field4047 = 0;
            if (arg1.field4020 > class180.field3272) {
                arg1.field4027 = -1;
            }
            if (arg1.field3992 != -1 && class180.field3272 == arg1.field4020) {
                int var9 = class213.method1533(128, arg1.field3992).field561;
                if (var9 != -1) {
                    class159 var10 = class211.method1521(-81, var9);
                    if (var10 != null && var10.field2962 != null) {
                        class248.method1748(arg1.field4005, arg1.field3985, var10, -87, 0, class156.field2904 == arg1);
                    }
                }
            }
        }
        if ((arg0 & 0x400) != 0) {
            arg1.field4031 = class199.field3595.method917(255);
            arg1.field4057 = class199.field3595.method946(!arg2);
            arg1.field4030 = class199.field3595.method917(255);
            arg1.field4017 = class199.field3595.method926((byte) -105);
            arg1.field4028 = class199.field3595.method961(-268435456) + class180.field3272;
            arg1.field4056 = class199.field3595.method962((byte) -126) + class180.field3272;
            arg1.field4058 = class199.field3595.method946(false);
            arg1.field4009 = 0;
            arg1.field4021 = 1;
        }
        if ((arg0 & 0x10) != 0) {
            int var11 = class199.field3595.method912(-90);
            int var12 = class199.field3595.method946(!arg2);
            int var13 = class199.field3595.method937(false);
            int var14 = class199.field3595.field2379;
            boolean var15 = (var11 & 0x8000) != 0;
            if (arg1.field2045 != null && arg1.field2036 != null) {
                boolean var16 = false;
                long var17 = arg1.field2045.method473((byte) 79);
                if (var12 <= 1) {
                    if (!var15 && class108.field2060 == 1 || class182.field3313 == 1) {
                        var16 = true;
                    } else {
                        for (int var19 = 0; var19 < class149.field2778; var19++) {
                            if (class159.field2959[var19] == var17) {
                                var16 = true;
                                break;
                            }
                        }
                    }
                }
                if (!var16 && class105.field1993 == 0) {
                    class128.field2346.field2379 = 0;
                    int var20 = -1;
                    class199.field3595.method916(0, class128.field2346.field2385, 100, var13);
                    class128.field2346.field2379 = 0;
                    class69 var21;
                    if (var15) {
                        class27 var22 = class59.method355(class128.field2346, (byte) -128);
                        var11 &= 0x7FFF;
                        var20 = var22.field390;
                        var21 = var22.field387.method1430(class128.field2346, (byte) 35);
                    } else {
                        var21 = class225.method1611(class44.method249(class128.field2346, true).method488(8));
                    }
                    arg1.field3989 = var21.method442(-96);
                    arg1.field4029 = var11 >> 8;
                    arg1.field4040 = var11 & 0xFF;
                    arg1.field4036 = 150;
                    if (var12 == 2) {
                        class70.method498(var20, class9.method42(-84, new class69[] { class24.field351, arg1.method816(1) }), var21, (class69) null, -1, var15 ? 17 : 1);
                    } else if (var12 == 1) {
                        class70.method498(var20, class9.method42(-123, new class69[] { class168.field3093, arg1.method816(1) }), var21, (class69) null, -1, var15 ? 17 : 1);
                    } else {
                        class70.method498(var20, arg1.method816(1), var21, (class69) null, -1, var15 ? 17 : 2);
                    }
                }
            }
            class199.field3595.field2379 = var13 + var14;
        }
        if ((arg0 & 0x1) != 0) {
            int var23 = class199.field3595.method917(255);
            byte[] var24 = new byte[var23];
            class128 var25 = new class128(var24);
            class199.field3595.method916(0, var24, 37, var23);
            class28.field398[arg3] = var25;
            arg1.method810(arg2, var25);
        }
        if ((arg0 & 0x100) != 0) {
            int var26 = class199.field3595.method926((byte) -118);
            int var27 = class199.field3595.method926((byte) -70);
            arg1.method1572(class180.field3272, var27, 0, var26);
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "()V")
    public void method205() {
        field2487++;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)V")
    public final synchronized void method1001(int arg0) {
        if (arg0 != 2) {
            return;
        }
        field2508++;
        if (class189.field3432 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class189.field3432.field2850[var3] == this) {
                    class189.field3432.field2850[var3] = null;
                }
                if (class189.field3432.field2850[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class189.field3432.field2853 = true;
                while (class189.field3432.field2840) {
                    class59.method356(false, 50L);
                }
                class189.field3432 = null;
            }
        }
        this.method205();
        this.field2505 = null;
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "()V")
    public void method201() throws Exception {
        field2502++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BI)V")
    private final void method1002(byte arg0, int arg1) {
        field2507++;
        this.field2520 -= arg1;
        if (this.field2520 < 0) {
            this.field2520 = 0;
        }
        if (this.field2490 != null) {
            this.field2490.method31(arg1);
        }
        if (arg0 != 7) {
            this.field2505 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1003(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2499++;
        int var7 = arg1 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg6;
            arg6 = var8;
        }
        if (var7 == 0) {
            return arg3;
        } else if (var7 == 1) {
            return 7 + 1 - arg0 - arg5;
        } else if (var7 == 2) {
            return 1 + 7 - arg6 - arg3;
        } else if (arg4 <= 107) {
            return -67;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "()V")
    public void method204() throws Exception {
        field2510++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II[Ltk;)V")
    public static final void method1004(int arg0, int arg1, class50[] arg2) {
        field2488++;
        if (arg1 != -27091) {
            field2493 = -59;
        }
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class50 var4 = arg2[var3];
            if (var4 != null && var4.field778 == arg0 && (!var4.field763 || !client.method1147(var4))) {
                if (var4.field884 == 0) {
                    if (!var4.field763 && client.method1147(var4) && class119.field2250 != var4) {
                        continue;
                    }
                    method1004(var4.field773, -27091, arg2);
                    if (var4.field848 != null) {
                        method1004(var4.field773, arg1, var4.field848);
                    }
                    class259 var5 = (class259) class156.field2910.method769(true, (long) var4.field773);
                    if (var5 != null) {
                        class262.method1797((byte) -111, var5.field4640);
                    }
                }
                if (var4.field884 == 6) {
                    if (var4.field783 != -1 || var4.field775 != -1) {
                        boolean var6 = class221.method1566(var4, (byte) 77);
                        int var7;
                        if (var6) {
                            var7 = var4.field775;
                        } else {
                            var7 = var4.field783;
                        }
                        if (var7 != -1) {
                            class159 var8 = class211.method1521(arg1 ^ 0x6994, var7);
                            if (var8 != null) {
                                var4.field815 += class148.field2767;
                                while (var8.field2941[var4.field821] < var4.field815) {
                                    var4.field815 -= var8.field2941[var4.field821];
                                    var4.field821++;
                                    if (var8.field2962.length <= var4.field821) {
                                        var4.field821 -= var8.field2943;
                                        if (var4.field821 < 0 || var8.field2962.length <= var4.field821) {
                                            var4.field821 = 0;
                                        }
                                    }
                                    class204.method1478(var4, false);
                                }
                            }
                        }
                    }
                    if (var4.field824 != 0 && !var4.field763) {
                        int var9 = var4.field824 >> 16;
                        int var10 = var4.field824 << 16 >> 16;
                        int var11 = class148.field2767 * var10;
                        int var12 = class148.field2767 * var9;
                        var4.field835 = var4.field835 + var12 & 0x7FF;
                        var4.field883 = var4.field883 + var11 & 0x7FF;
                        class204.method1478(var4, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Z)V")
    public static void method1005(boolean arg0) {
        if (!arg0) {
            field2493 = -124;
        }
        field2503 = null;
    }
}
