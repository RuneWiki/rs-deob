import java.awt.Component;
import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class194 {

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "I")
    private int field3823 = 32;

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "J")
    private long field3830 = class30.method224((byte) 95);

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    private int field3853 = 0;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "I")
    private int field3854 = 0;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "J")
    private long field3851 = 0L;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "[Lnb;")
    private class118[] field3849 = new class118[8];

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "I")
    private int field3855 = 0;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    private int field3858 = 0;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "J")
    private long field3859 = 0L;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "[Lnb;")
    private class118[] field3860 = new class118[8];

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "Z")
    private boolean field3856 = true;

    @OriginalMember(owner = "client!vf", name = "o", descriptor = "I")
    public static int field3837 = 20;

    @OriginalMember(owner = "client!vf", name = "i", descriptor = "Lcd;")
    private static class23 field3831 = class54.method414("Type", -1);

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "[I")
    public static int[] field3842 = new int[128];

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "Lcd;")
    public static class23 field3825 = field3831;

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!vf", name = "j", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!vf", name = "k", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!vf", name = "l", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!vf", name = "m", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!vf", name = "n", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!vf", name = "p", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!vf", name = "q", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!vf", name = "r", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    private int field3857;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "Lnb;")
    private class118 field3847;

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "[I")
    public int[] field3843;

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "()I")
    public int method1136() throws Exception {
        field3833++;
        return this.field3850;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "()V")
    public void method1137() throws Exception {
        field3829++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Ljava/awt/Component;)V")
    public void method1135(Component arg0) throws Exception {
        field3834++;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "()V")
    public void method1140() throws Exception {
        field3828++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Z)V")
    public final synchronized void method1251(boolean arg0) {
        field3835++;
        if (!arg0) {
            this.method1256(false);
        }
        if (this.field3843 == null) {
            return;
        }
        long var2 = class30.method224((byte) 95);
        try {
            if (this.field3859 != 0L) {
                if (var2 < this.field3859) {
                    return;
                }
                this.method1138(this.field3850);
                this.field3859 = 0L;
                this.field3856 = true;
            }
            int var4 = this.method1136();
            if (this.field3858 - var4 > this.field3854) {
                this.field3854 = this.field3858 - var4;
            }
            int var5 = this.field3857 + this.field3852;
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (this.field3850 < var5 + 256) {
                var4 = 0;
                this.field3850 += 1024;
                if (this.field3850 > 16384) {
                    this.field3850 = 16384;
                }
                this.method1139();
                this.method1138(this.field3850);
                if (this.field3850 < var5 + 256) {
                    var5 = this.field3850 - 256;
                    this.field3857 = var5 - this.field3852;
                }
                this.field3856 = true;
            }
            while (var4 < var5) {
                this.method1257(this.field3843, 256);
                var4 += 256;
                this.method1137();
            }
            if (this.field3851 < var2) {
                if (this.field3856) {
                    this.field3856 = false;
                } else if (this.field3854 == 0 && this.field3853 == 0) {
                    this.method1139();
                    this.field3859 = var2 + 2000L;
                    return;
                } else {
                    this.field3857 = Math.min(this.field3853, this.field3854);
                    this.field3853 = this.field3854;
                }
                this.field3851 = var2 + 2000L;
                this.field3854 = 0;
            }
            this.field3858 = var4;
        } catch (Exception var7) {
            this.method1139();
            this.field3859 = var2 + 2000L;
        }
        try {
            if (var2 > this.field3830 + 500000L) {
                var2 = this.field3830;
            }
            while (var2 > this.field3830 + 5000L) {
                this.method1259(256, 0);
                this.field3830 += 256000 / class48.field1163;
            }
        } catch (Exception var6) {
            this.field3830 = var2;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)V")
    public static void method1252(int arg0) {
        if (arg0 != -2) {
            method1261(22, 10, -53);
        }
        field3842 = null;
        field3825 = null;
        field3831 = null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLfa;Lcd;)Lcd;")
    public static final class23 method1253(byte arg0, class47 arg1, class23 arg2) {
        if (arg2.method168(0, class31.field670) != -1) {
            label62: while (true) {
                int var3 = arg2.method168(0, class138.field2845);
                if (var3 == -1) {
                    while (true) {
                        int var4 = arg2.method168(arg0 ^ 0xF, class70.field1632);
                        if (var4 == -1) {
                            while (true) {
                                int var5 = arg2.method168(arg0 - 15, class49.field1169);
                                if (var5 == -1) {
                                    while (true) {
                                        int var6 = arg2.method168(arg0 - 15, class63.field1459);
                                        if (var6 == -1) {
                                            while (true) {
                                                int var7 = arg2.method168(0, class139.field2875);
                                                if (var7 == -1) {
                                                    while (true) {
                                                        int var8 = arg2.method168(0, class69.field1621);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class23 var9 = class66.field1566;
                                                        if (class67.field1579 != null) {
                                                            var9 = class69.method504(class67.field1579.field684, arg0 ^ 0xF);
                                                            try {
                                                                if (class67.field1579.field683 != null) {
                                                                    byte[] var10 = ((String) class67.field1579.field683).getBytes("ISO-8859-1");
                                                                    var9 = class57.method439(-1, var10.length, 0, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg2 = class3.method14(true, new class23[] { arg2.method156(0, var8, -115), var9, arg2.method136(var8 + 4, -3331) });
                                                    }
                                                }
                                                arg2 = class3.method14(true, new class23[] { arg2.method156(0, var7, -117), client.method204(class191.method1238(arg1, 4, (byte) -123), 999999999), arg2.method136(var7 + 2, -3331) });
                                            }
                                        }
                                        arg2 = class3.method14(true, new class23[] { arg2.method156(0, var6, -107), client.method204(class191.method1238(arg1, 3, (byte) -49), arg0 ^ 0x3B9AC9F0), arg2.method136(var6 + 2, -3331) });
                                    }
                                }
                                arg2 = class3.method14(true, new class23[] { arg2.method156(0, var5, -108), client.method204(class191.method1238(arg1, 2, (byte) -32), 999999999), arg2.method136(var5 + 2, arg0 + -3346) });
                            }
                        }
                        arg2 = class3.method14(true, new class23[] { arg2.method156(0, var4, -98), client.method204(class191.method1238(arg1, 1, (byte) -71), 999999999), arg2.method136(var4 + 2, -3331) });
                    }
                }
                arg2 = class3.method14(true, new class23[] { arg2.method156(0, var3, arg0 ^ 0xFFFFFFAA), client.method204(class191.method1238(arg1, 0, (byte) -64), 999999999), arg2.method136(var3 + 2, arg0 ^ 0xFFFFF2F2) });
            }
        }
        field3846++;
        return arg0 == 15 ? arg2 : null;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public final synchronized void method1254(byte arg0) {
        this.field3856 = true;
        try {
            this.method1140();
            if (arg0 <= 76) {
                this.field3860 = null;
            }
        } catch (Exception var2) {
            this.method1139();
            this.field3859 = class30.method224((byte) 95) + 2000L;
        }
        field3848++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lnb;IB)V")
    private final void method1255(class118 arg0, int arg1, byte arg2) {
        field3845++;
        int var4 = arg1 >> 5;
        class118 var5 = this.field3860[var4];
        if (var5 == null) {
            this.field3849[var4] = arg0;
        } else {
            var5.field2447 = arg0;
        }
        if (arg2 != -98) {
            this.field3859 = 15L;
        }
        this.field3860[var4] = arg0;
        arg0.field2446 = arg1;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(Z)V")
    public final void method1256(boolean arg0) {
        this.field3856 = arg0;
        field3839++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "([II)V")
    private final void method1257(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class143.field2934) {
            var3 = arg1 << 1;
        }
        class93.method609(arg0, 0, var3);
        this.field3855 -= arg1;
        if (this.field3847 != null && this.field3855 <= 0) {
            this.field3855 += class48.field1163 >> 4;
            class1.method5(0, this.field3847);
            this.method1255(this.field3847, this.field3847.method743(), (byte) -98);
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
                        class118 var10 = null;
                        class118 var11 = this.field3849[var7];
                        label101: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label101;
                                }
                                class77 var12 = var11.field2445;
                                if (var12 == null || var12.field1717 <= var8) {
                                    var11.field2444 = true;
                                    int var13 = var11.method235();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field1717 += var13;
                                    }
                                    if (var4 >= this.field3823) {
                                        break label107;
                                    }
                                    class118 var14 = var11.method232();
                                    if (var14 != null) {
                                        int var15 = var11.field2446;
                                        while (var14 != null) {
                                            this.method1255(var14, var15 * var14.method743() >> 8, (byte) -98);
                                            var14 = var11.method231();
                                        }
                                    }
                                    class118 var16 = var11.field2447;
                                    var11.field2447 = null;
                                    if (var10 == null) {
                                        this.field3849[var7] = var16;
                                    } else {
                                        var10.field2447 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field3860[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field2447;
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
                class118 var18 = this.field3849[var17];
                this.field3849[var17] = this.field3860[var17] = null;
                while (var18 != null) {
                    class118 var19 = var18.field2447;
                    var18.field2447 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field3855 < 0) {
            this.field3855 = 0;
        }
        if (this.field3847 != null) {
            this.field3847.method234(arg0, 0, arg1);
        }
        this.field3830 = class30.method224((byte) 95);
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)V")
    public void method1138(int arg0) throws Exception {
        field3841++;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
    public final synchronized void method1258(byte arg0) {
        if (arg0 >= -71) {
            field3836 = 112;
        }
        if (class180.field3566 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class180.field3566.field450[var3] == this) {
                    class180.field3566.field450[var3] = null;
                }
                if (class180.field3566.field450[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class180.field3566.field455 = true;
                while (class180.field3566.field451) {
                    class53.method409(50L, -25391);
                }
                class180.field3566 = null;
            }
        }
        this.method1139();
        this.field3843 = null;
        field3826++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(II)V")
    private final void method1259(int arg0, int arg1) {
        field3824++;
        this.field3855 -= arg0;
        if (arg1 > this.field3855) {
            this.field3855 = 0;
        }
        if (this.field3847 != null) {
            this.field3847.method236(arg0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "()V")
    public void method1139() {
        field3844++;
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BLnb;)V")
    public final synchronized void method1260(byte arg0, class118 arg1) {
        this.field3847 = arg1;
        field3840++;
        if (arg0 != 101) {
            this.method1251(false);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(III)V")
    public static final void method1261(int arg0, int arg1, int arg2) {
        field3827++;
        if (class124.field2547 != 0 && class124.field2547 != 3 || (arg0 != 705299499 || class43.field911 != 1)) {
            return;
        }
        int var3 = class65.field1535 - arg1 - 25;
        int var4 = class43.field912 - arg2 - 5;
        if (var3 < 0 || var4 < 0 || var3 >= 146 || var4 >= 151) {
            return;
        }
        var3 -= 73;
        var4 -= 75;
        int var5 = class67.field1580 + class48.field1155 & 0x7FF;
        int var6 = class140.field2878[var5];
        int var7 = (class107.field2292 + 256) * var6 >> 8;
        int var8 = class140.field2891[var5];
        int var9 = (class107.field2292 + 256) * var8 >> 8;
        int var10 = var3 * var9 + var4 * var7 >> 11;
        int var11 = class134.field2790.field215 + var10 >> 7;
        int var12 = var4 * var9 - var3 * var7 >> 11;
        int var13 = class134.field2790.field277 - var12 >> 7;
        boolean var14 = class186.method1147(0, (byte) 109, true, 0, class134.field2790.field219[0], 0, var11, 0, 0, 1, var13, class134.field2790.field230[0]);
        if (!var14) {
            return;
        }
        class159.field3190.method1180(var3, (byte) 121);
        class159.field3190.method1180(var4, (byte) 85);
        class159.field3190.method1220((byte) 105, class48.field1155);
        class159.field3190.method1180(57, (byte) 65);
        class159.field3190.method1180(class67.field1580, (byte) 122);
        class159.field3190.method1180(class107.field2292, (byte) 102);
        class159.field3190.method1180(89, (byte) 97);
        class159.field3190.method1220((byte) 31, class134.field2790.field215);
        class159.field3190.method1220((byte) 61, class134.field2790.field277);
        class159.field3190.method1180(class47.field1080, (byte) 75);
        class159.field3190.method1180(63, (byte) 80);
        return;
    }
}
