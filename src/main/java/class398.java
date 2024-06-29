import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class398 {

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    private int field5797 = 128;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    private int field5807 = 0;

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    private int field5800 = 0;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "I")
    private int field5809 = 128;

    @OriginalMember(owner = "client!qi", name = "y", descriptor = "B")
    public byte field5821 = 0;

    @OriginalMember(owner = "client!qi", name = "w", descriptor = "I")
    private int field5819 = -1;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    private int field5799 = 0;

    @OriginalMember(owner = "client!qi", name = "x", descriptor = "Z")
    public boolean field5820 = false;

    @OriginalMember(owner = "client!qi", name = "B", descriptor = "I")
    public int field5824 = -1;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "Ldi;")
    public static class83 field5806 = new class83(16, 2);

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5798;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5801;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public int field5802;

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field5805;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field5810;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!qi", name = "r", descriptor = "I")
    public static int field5814;

    @OriginalMember(owner = "client!qi", name = "s", descriptor = "I")
    public static int field5815;

    @OriginalMember(owner = "client!qi", name = "t", descriptor = "I")
    private int field5816;

    @OriginalMember(owner = "client!qi", name = "v", descriptor = "I")
    public static int field5818;

    @OriginalMember(owner = "client!qi", name = "C", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!qi", name = "D", descriptor = "I")
    public static int field5826;

    @OriginalMember(owner = "client!qi", name = "z", descriptor = "Lw;")
    public static class195 field5822;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "Luv;")
    public class244 field5804;

    @OriginalMember(owner = "client!qi", name = "A", descriptor = "Llk;")
    public static class414 field5823;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "[S")
    private short[] field5808;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "[S")
    private short[] field5811;

    @OriginalMember(owner = "client!qi", name = "q", descriptor = "[S")
    private short[] field5813;

    @OriginalMember(owner = "client!qi", name = "u", descriptor = "[S")
    private short[] field5817;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ILan;IIILya;I)Lt;")
    public final class471 method2391(int arg0, class20 arg1, int arg2, int arg3, int arg4, class38 arg5, int arg6) {
        if (arg6 != 10061) {
            this.field5813 = null;
        }
        field5805++;
        return this.method2399(arg5, 0, null, 0, arg4, arg3, arg2, arg1, (byte) 2, arg6 - 10061, 0, arg0, false, null);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lya;IIZIILan;)Lt;")
    public final class471 method2392(class38 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class20 arg6) {
        if (!arg3) {
            this.field5824 = 51;
        }
        field5812++;
        return this.method2399(arg0, 0, null, 0, arg5, arg1, arg2, arg6, (byte) 5, 0, 0, arg4, false, null);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(II)I")
    public static final int method2393(int arg0, int arg1) {
        return class257.field3581 == null ? 0 : class257.field3581[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZIZII)Lmg;")
    public static final class101 method2394(boolean arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg1 >= -41) {
            method2397(98);
        }
        field5798++;
        class343 var5 = null;
        if (class166.field2505 != null) {
            var5 = new class343(arg3, class166.field2505, class117.field1744[arg3], 1000000);
        }
        class328.field4478[arg3] = class307.field4188.method2685(class111.field1675, arg3, 0, var5);
        if (arg2) {
            class328.field4478[arg3].method2795((byte) 114);
        }
        return new class101(class328.field4478[arg3], arg0, arg4);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lsi;IB)V")
    private final void method2395(class391 arg0, int arg1, byte arg2) {
        field5818++;
        if (arg1 == 1) {
            this.field5816 = arg0.method2353((byte) 104);
        } else if (arg1 == 2) {
            this.field5824 = arg0.method2353((byte) 106);
        } else if (arg1 == 4) {
            this.field5809 = arg0.method2353((byte) 85);
        } else if (arg1 == 5) {
            this.field5797 = arg0.method2353((byte) 109);
        } else if (arg1 == 6) {
            this.field5800 = arg0.method2353((byte) 83);
        } else if (arg1 == 7) {
            this.field5799 = arg0.method2348(-2);
        } else if (arg1 == 8) {
            this.field5807 = arg0.method2348(-2);
        } else if (arg1 == 9) {
            this.field5819 = 8224;
            this.field5821 = 3;
        } else if (arg1 == 10) {
            this.field5820 = true;
        } else if (arg1 == 11) {
            this.field5821 = 1;
        } else if (arg1 == 12) {
            this.field5821 = 4;
        } else if (arg1 == 13) {
            this.field5821 = 5;
        } else if (arg1 == 14) {
            this.field5821 = 2;
            this.field5819 = arg0.method2348(-2) * 256;
        } else if (arg1 == 15) {
            this.field5821 = 3;
            this.field5819 = arg0.method2353((byte) 77);
        } else if (arg1 == 16) {
            this.field5821 = 3;
            this.field5819 = arg0.method2361((byte) -56);
        } else if (arg1 == 40) {
            int var6 = arg0.method2348(-2);
            this.field5813 = new short[var6];
            this.field5808 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5813[var7] = (short) arg0.method2353((byte) 71);
                this.field5808[var7] = (short) arg0.method2353((byte) 77);
            }
        } else if (arg1 == 41) {
            int var4 = arg0.method2348(-2);
            this.field5817 = new short[var4];
            this.field5811 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5817[var5] = (short) arg0.method2353((byte) 109);
                this.field5811[var5] = (short) arg0.method2353((byte) 120);
            }
        }
        if (arg2 >= -9) {
            this.method2392(null, -41, 62, true, 72, -47, null);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lya;ILan;ZILta;IIIIILta;I)Lt;")
    public final class471 method2396(class38 arg0, int arg1, class20 arg2, boolean arg3, int arg4, class142 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class142 arg11, int arg12) {
        if (arg4 >= -43) {
            field5826 = -42;
        }
        field5803++;
        return this.method2399(arg0, arg9, arg11, arg6, arg8, arg7, arg12, arg2, (byte) 2, 0, arg1, arg10, arg3, arg5);
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
    public static void method2397(int arg0) {
        field5823 = null;
        field5822 = null;
        field5806 = null;
        if (arg0 < 9) {
            field5822 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method2398(String arg0, int arg1) throws ClassNotFoundException {
        field5825++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else {
            if (arg1 != 0) {
                field5822 = null;
            }
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lya;ILta;IIIILan;BIIIZLta;)Lt;")
    private final class471 method2399(class38 arg0, int arg1, class142 arg2, int arg3, int arg4, int arg5, int arg6, class20 arg7, byte arg8, int arg9, int arg10, int arg11, boolean arg12, class142 arg13) {
        field5814++;
        int var15 = arg6;
        class104 var16 = this.field5824 == -1 || arg5 == -1 ? null : arg7.method126(-110, this.field5824);
        boolean var17 = arg12 & this.field5821 != arg9;
        if (var16 != null) {
            var15 = arg6 | var16.method769(false, 1024, arg11, arg5);
        }
        if (var17) {
            var15 |= this.field5821 == 3 ? 7 : 2;
        }
        if (this.field5797 != 128) {
            var15 |= 0x2;
        }
        if (this.field5809 != 128 || this.field5800 != 0) {
            var15 |= 0x5;
        }
        class162 var18 = this.field5804.field3416;
        class471 var19;
        synchronized (this.field5804.field3416) {
            var19 = (class471) this.field5804.field3416.method1073((long) (this.field5802 |= arg0.field468 << 29), false);
        }
        if (var19 == null || arg0.method257(var19.method372(), var15) != 0) {
            if (var19 != null) {
                var15 = arg0.method288(var15, var19.method372());
            }
            int var20 = var15;
            if (this.field5813 != null) {
                var20 = var15 | 0x4000;
            }
            if (this.field5817 != null) {
                var20 |= 0x8000;
            }
            class419 var21 = class109.method798(this.field5804.field3407, 0, this.field5816, -128);
            if (var21 == null) {
                return null;
            }
            if (var21.field6121 < 13) {
                var21.method2492((byte) -89, 0);
            }
            var19 = arg0.method231(var21, var20, this.field5804.field3420, this.field5799 + 64, this.field5807 + 850);
            if (this.field5813 != null) {
                for (int var22 = 0; var22 < this.field5813.length; var22++) {
                    var19.method408(this.field5813[var22], this.field5808[var22]);
                }
            }
            if (this.field5817 != null) {
                for (int var23 = 0; var23 < this.field5817.length; var23++) {
                    var19.method400(this.field5817[var23], this.field5811[var23]);
                }
            }
            var19.method402(var15);
            class162 var24 = this.field5804.field3416;
            synchronized (this.field5804.field3416) {
                this.field5804.field3416.method1072((long) (this.field5802 |= arg0.field468 << 29), var19, false);
            }
        }
        class471 var25 = var16 == null ? var19.method381(arg8, var15, true) : var16.method770((byte) -108, var15, arg4, 0, var19, arg5, arg11, arg8);
        if (this.field5809 != 128 || this.field5797 != 128) {
            var25.method403(this.field5809, this.field5797, this.field5809);
        }
        if (this.field5800 != 0) {
            if (this.field5800 == 90) {
                var25.method393(4096);
            }
            if (this.field5800 == 180) {
                var25.method393(8192);
            }
            if (this.field5800 == 270) {
                var25.method393(12288);
            }
        }
        if (var17) {
            var25.method405(this.field5821, this.field5819, arg13, arg2, arg10, arg1, arg3);
        }
        var25.method402(arg6);
        return var25;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IBLsk;ILvc;)V")
    public static final void method2400(int arg0, byte arg1, class438 arg2, int arg3, class207 arg4) {
        if (arg1 != -4) {
            method2393(-30, -90);
        }
        field5810++;
        if ((arg0 & 0x20) != 0) {
            int var5 = arg4.method2313(255);
            int var6 = arg4.method2348(-2);
            int var7 = arg4.method2305(-108);
            int var8 = arg4.field5719;
            boolean var9 = (var5 & 0x8000) != 0;
            if (arg2.field6421 != null && arg2.field6417 != null) {
                boolean var10 = false;
                if (var6 <= 1) {
                    if (!var9 && (class58.field691 && !class275.field3776 || class414.field6040)) {
                        var10 = true;
                    } else if (class129.method888(false, arg2.field6421)) {
                        var10 = true;
                    }
                }
                if (!var10 && class45.field539 == 0) {
                    class122.field1830.field5719 = 0;
                    arg4.method2330(0, true, class122.field1830.field5678, var7);
                    class122.field1830.field5719 = 0;
                    int var11 = -1;
                    String var13;
                    if (var9) {
                        var5 &= 0x7FFF;
                        class515 var12 = class457.method2681(class122.field1830, (byte) 127);
                        var11 = var12.field7614;
                        var13 = var12.field7616.method2175(class122.field1830, (byte) -76);
                    } else {
                        var13 = class427.method2528((byte) 122, class380.method2257(true, class122.field1830));
                    }
                    arg2.field1100 = var13.trim();
                    arg2.field1050 = 150;
                    arg2.field1104 = var5 & 0xFF;
                    arg2.field1073 = var5 >> 8;
                    int var14;
                    if (var6 == 1 || var6 == 2) {
                        var14 = var9 ? 17 : 1;
                    } else {
                        var14 = var9 ? 17 : 2;
                    }
                    if (var6 == 2) {
                        class424.method2519(var11, "<img=1>" + arg2.method2581(false, (byte) -97), var14, 0, "<img=1>" + arg2.method2588((byte) 74, true), 92, null, var13);
                    } else if (var6 == 1) {
                        class424.method2519(var11, "<img=0>" + arg2.method2581(false, (byte) 103), var14, 0, "<img=0>" + arg2.method2588((byte) 106, true), arg1 + 74, null, var13);
                    } else {
                        class424.method2519(var11, arg2.method2581(false, (byte) -117), var14, 0, arg2.method2588((byte) 82, true), 58, null, var13);
                    }
                }
            }
            arg4.field5719 = var7 + var8;
        }
        byte var15 = -1;
        if ((arg0 & 0x40) != 0) {
            int var16 = arg4.method2348(-2);
            byte[] var17 = new byte[var16];
            class391 var18 = new class391(var17);
            arg4.method2356(var17, 0, (byte) -119, var16);
            class149.field2152[arg3] = var18;
            arg2.method2580(var18, -1);
        }
        if ((arg0 & 0x800) != 0) {
            arg2.field6413 = arg4.method2305(-126) == 1;
        }
        if ((arg0 & 0x2000) != 0) {
            int var19 = arg4.method2353((byte) 77);
            arg2.field1041 = arg4.method2352((byte) 8);
            arg2.field1040 = arg4.method2352((byte) 8);
            arg2.field1044 = var19 & 0x7FFF;
            arg2.field1029 = (var19 & 0x8000) != 0;
            arg2.field1039 = arg2.field1044 + arg2.field1041 + class441.field6516;
        }
        if ((arg0 & 0x4000) != 0) {
            int var20 = class441.field6516;
            int var21 = arg4.method2332(2);
            int var22 = arg4.method2317(0);
            arg2.method625(-106, var21, var22, var20);
        }
        if ((arg0 & 0x8) != 0) {
            int var23 = arg4.method2332(2);
            int var24 = arg4.method2352((byte) 8);
            arg2.method625(-127, var23, var24, class441.field6516);
            arg2.field1056 = class441.field6516 + 300;
            arg2.field1079 = arg4.method2352((byte) 8);
        }
        if ((arg0 & 0x400) != 0) {
            arg2.field1100 = arg4.method2347((byte) -87);
            if (arg2.field1100.charAt(0) == '~') {
                arg2.field1100 = arg2.field1100.substring(1);
                class310.method1795(2, 0, arg2.method2588((byte) 81, true), arg2.method2581(false, (byte) 123), 12406, arg2.field1100);
            } else if (class316.field4324 == arg2) {
                class310.method1795(2, 0, arg2.method2588((byte) 95, true), arg2.method2581(false, (byte) -74), arg1 + 12410, arg2.field1100);
            }
            arg2.field1073 = 0;
            arg2.field1050 = 150;
            arg2.field1104 = 0;
        }
        if ((arg0 & 0x1) != 0) {
            arg2.field6403 = arg4.method2313(arg1 ^ 0xFFFFFF03);
            if (arg2.field1123 == 0) {
                arg2.method619(-18477, arg2.field6403);
                arg2.field6403 = -1;
            }
        }
        if ((arg0 & 0x80) != 0) {
            int var25 = arg4.method2353((byte) 68);
            if (var25 == 65535) {
                var25 = -1;
            }
            arg2.field1069 = var25;
        }
        if ((arg0 & 0x20000) != 0) {
            int var26 = arg4.method2352((byte) 8);
            int[] var27 = new int[var26];
            int[] var28 = new int[var26];
            int[] var29 = new int[var26];
            for (int var30 = 0; var30 < var26; var30++) {
                int var31 = arg4.method2346((byte) 43);
                if (var31 == 65535) {
                    var31 = -1;
                }
                var27[var30] = var31;
                var28[var30] = arg4.method2317(0);
                var29[var30] = arg4.method2353((byte) 68);
            }
            class73.method594(arg2, var29, 0, var28, var27);
        }
        if ((arg0 & 0x10) != 0) {
            int var32 = arg4.method2313(arg1 + 259);
            if (var32 == 65535) {
                var32 = -1;
            }
            int var33 = arg4.method2348(-2);
            client.method1236(-11, arg2, var33, var32);
        }
        if ((arg0 & 0x100) != 0) {
            var15 = arg4.method2364(36);
        }
        if ((arg0 & 0x4) != 0) {
            class413.field6033[arg3] = arg4.method2337(-1);
        }
        if ((arg0 & 0x10000) != 0) {
            arg2.field1068 = arg4.method2364(-128);
            arg2.field1092 = arg4.method2364(-97);
            arg2.field1075 = arg4.method2337(-1);
            arg2.field1103 = (byte) arg4.method2305(arg1 - 101);
            arg2.field1047 = class441.field6516 + arg4.method2346((byte) 43);
            arg2.field1030 = class441.field6516 + arg4.method2345(arg1 ^ 0xFFFFFFFE);
        }
        if ((arg0 & 0x40000) != 0) {
            int var34 = arg4.method2353((byte) 104);
            if (var34 == 65535) {
                var34 = -1;
            }
            int var35 = arg4.method2321(false);
            int var36 = arg4.method2317(0);
            arg2.method615(var36, -107, true, var34, var35);
        }
        if ((arg0 & 0x1000) != 0) {
            arg2.field1080 = arg4.method2324(arg1 + 13490);
            arg2.field1077 = arg4.method2350((byte) -53);
            arg2.field1097 = arg4.method2324(13486);
            arg2.field1086 = arg4.method2364(42);
            arg2.field1088 = arg4.method2346((byte) 43) + class441.field6516;
            arg2.field1090 = arg4.method2353((byte) 84) + class441.field6516;
            arg2.field1028 = arg4.method2317(0);
            arg2.field1119 = 0;
            if (arg2.field6409) {
                arg2.field1086 += arg2.field6408;
                arg2.field1097 += arg2.field6423;
                arg2.field1077 += arg2.field6408;
                arg2.field1080 += arg2.field6423;
                arg2.field1123 = 0;
            } else {
                arg2.field1097 += arg2.field1127[0];
                arg2.field1123 = 1;
                arg2.field1086 += arg2.field1117[0];
                arg2.field1077 += arg2.field1117[0];
                arg2.field1080 += arg2.field1127[0];
            }
        }
        if ((arg0 & 0x8000) != 0) {
            int var37 = arg4.method2345(2);
            int var38 = arg4.method2361((byte) -56);
            if (var37 == 65535) {
                var37 = -1;
            }
            int var39 = arg4.method2348(-2);
            arg2.method615(var39, -119, false, var37, var38);
        }
        if (!arg2.field6409) {
            return;
        }
        if (var15 == 127) {
            arg2.method2586(arg2.field6423, -12186, arg2.field6408);
            return;
        }
        byte var40;
        if (var15 == -1) {
            var40 = class413.field6033[arg3];
        } else {
            var40 = var15;
        }
        arg2.method2576(arg2.field6408, arg2.field6423, var40, (byte) 18);
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)V")
    public static final void method2401(int arg0) {
        field5801++;
        if (~class481.field7028 != arg0) {
            class289.method1723(class481.field7028, -1, -1, (byte) -59, false);
            class481.field7028 = -1;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2402(int arg0, int arg1, int arg2, int arg3) {
        if (class442.method2635(arg0, arg1, arg2)) {
            int var4 = arg1 << class523.field7736;
            int var5 = arg2 << class523.field7736;
            return class61.method501(var4 + 1, class211.field2950[arg0].method351(arg1, arg2) + arg3, var5 + 1) && class61.method501(class424.field6241 + var4 - 1, class211.field2950[arg0].method351(arg1 + 1, arg2) + arg3, var5 + 1) && class61.method501(class424.field6241 + var4 - 1, class211.field2950[arg0].method351(arg1 + 1, arg2 + 1) + arg3, class424.field6241 + var5 - 1) && class61.method501(var4 + 1, class211.field2950[arg0].method351(arg1, arg2 + 1) + arg3, class424.field6241 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lsi;I)V")
    public final void method2403(class391 arg0, int arg1) {
        if (arg1 >= 0) {
            method2397(34);
        }
        while (true) {
            int var3 = arg0.method2348(-2);
            if (var3 == 0) {
                field5815++;
                return;
            }
            this.method2395(arg0, var3, (byte) -45);
        }
    }
}
