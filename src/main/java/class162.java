import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class162 implements class91 {

    @OriginalMember(owner = "client!ei", name = "w", descriptor = "I")
    private int field1924 = -1;

    @OriginalMember(owner = "client!ei", name = "j", descriptor = "[Lih;")
    private class640[] field1911 = new class640[9];

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    private int field1932 = 0;

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "Lap;")
    private class435 field1904;

    @OriginalMember(owner = "client!ei", name = "s", descriptor = "I")
    private int field1920;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "[I")
    public static int[] field1929 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field1903;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1905;

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!ei", name = "f", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "I")
    public static int field1908;

    @OriginalMember(owner = "client!ei", name = "h", descriptor = "I")
    public static int field1909;

    @OriginalMember(owner = "client!ei", name = "i", descriptor = "I")
    public static int field1910;

    @OriginalMember(owner = "client!ei", name = "k", descriptor = "I")
    public static int field1912;

    @OriginalMember(owner = "client!ei", name = "l", descriptor = "I")
    public static int field1913;

    @OriginalMember(owner = "client!ei", name = "m", descriptor = "I")
    public static int field1914;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!ei", name = "r", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!ei", name = "t", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!ei", name = "u", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!ei", name = "v", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!ei", name = "x", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!ei", name = "y", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ei", name = "z", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "I")
    private int field1928;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(I)V", line = 3)
    public final void method579(int arg0) {
        if (arg0 != 24738) {
            this.method982(-105, -55);
        }
        field1906++;
        OpenGL.glBindFramebufferEXT(36008, 0);
        this.field1932 &= 0xFFFFFFFE;
        this.field1924 = this.method980((byte) 74);
    }

    @OriginalMember(owner = "client!ei", name = "e", descriptor = "(I)V", line = 18)
    public final void method582(int arg0) {
        if (arg0 == -5540) {
            field1903++;
            OpenGL.glBindFramebufferEXT(36009, 0);
            this.field1932 &= 0xFFFFFFFD;
            this.field1924 = this.method980((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(B)V", line = 32)
    public final void method577(byte arg0) {
        OpenGL.glBindFramebufferEXT(36160, this.field1920);
        field1902++;
        this.field1932 |= 0x4;
        if (arg0 == 6) {
            this.field1924 = this.method980((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(B)V", line = 50)
    public static void method974(byte arg0) {
        int var1 = -93 % ((2 - arg0) / 41);
        field1929 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IZIIB)V", line = 59)
    public static final void method975(int arg0, boolean arg1, int arg2, int arg3, byte arg4) {
        field1930++;
        if (!arg1 && class65.field687 == arg0 && class311.field4022 == arg2 && class676.field9588 == class353.field4625 || class601.field8530.method1835(class150.field1711, (byte) 127)) {
            return;
        }
        class676.field9588 = class353.field4625;
        class65.field687 = arg0;
        class311.field4022 = arg2;
        if (class601.field8530.method1835(class150.field1711, (byte) 100)) {
            class676.field9588 = 0;
        }
        class508.method2921(arg3, (byte) -96);
        class1.method1(101, class221.field2684.method1296(class226.field2899, (byte) -114), true, class404.field5386);
        int var5 = class682.field9685;
        int var6 = class146.field1642;
        class682.field9685 = (class65.field687 - (class399.field5338 >> 4)) * 8;
        class146.field1642 = (class311.field4022 - (class349.field4567 >> 4)) * 8;
        class84.field893 = class637.method3582(class65.field687 * 8, class311.field4022 * 8);
        class65.field691 = null;
        int var7 = class682.field9685 - var5;
        int var8 = class146.field1642 - var6;
        if (arg3 == 11) {
            for (int var17 = 0; var17 < class208.field2528; var17++) {
                class443 var31 = class609.field8605[var17];
                if (var31 != null) {
                    class625 var32 = var31.field6107;
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field3839[var33] -= var7;
                        var32.field3841[var33] -= var8;
                    }
                    var32.field4641 -= var7 * 512;
                    var32.field4647 -= var8 * 512;
                }
            }
        } else {
            boolean var9 = false;
            class118.field1356 = 0;
            int var10 = (class399.field5338 - 1) * 512;
            int var11 = (class349.field4567 - 1) * 512;
            for (int var12 = 0; var12 < class208.field2528; var12++) {
                class443 var13 = class609.field8605[var12];
                if (var13 != null) {
                    class625 var14 = var13.field6107;
                    var14.field4647 -= var8 * 512;
                    var14.field4641 -= var7 * 512;
                    if (var14.field4641 >= 0 && var14.field4641 <= var10 && var14.field4647 >= 0 && var14.field4647 <= var11) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field3839[var16] -= var7;
                            var14.field3841[var16] -= var8;
                            if (var14.field3839[var16] < 0 || class399.field5338 <= var14.field3839[var16] || var14.field3841[var16] < 0 || var14.field3841[var16] >= class349.field4567) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class664.field9449[class118.field1356++] = var14.field3784;
                        } else {
                            var14.method3501(null, 17);
                            var9 = true;
                            var13.method1519((byte) 121);
                        }
                    } else {
                        var14.method3501(null, 30);
                        var13.method1519((byte) 121);
                        var9 = true;
                    }
                }
            }
            if (var9) {
                class208.field2528 = class392.field5223.method3230(false);
                class392.field5223.method3229(class609.field8605, 20028);
            }
        }
        int var18 = 87 % ((arg4 + 33) / 44);
        for (int var19 = 0; var19 < 2048; var19++) {
            class455 var29 = class362.field4726[var19];
            if (var29 != null) {
                for (int var30 = 0; var30 < 10; var30++) {
                    var29.field3839[var30] -= var7;
                    var29.field3841[var30] -= var8;
                }
                var29.field4641 -= var7 * 512;
                var29.field4647 -= var8 * 512;
            }
        }
        class492[] var20 = class81.field863;
        for (int var21 = 0; var21 < var20.length; var21++) {
            class492 var28 = var20[var21];
            if (var28 != null) {
                var28.field7139 -= var7 * 512;
                var28.field7144 -= var8 * 512;
            }
        }
        for (class595 var22 = (class595) class454.field6292.method3174((byte) 49); var22 != null; var22 = (class595) class454.field6292.method3168(false)) {
            var22.field8445 -= var7;
            var22.field8448 -= var8;
            if (class381.field4954 != 4 && (var22.field8445 < 0 || var22.field8448 < 0 || var22.field8445 >= class399.field5338 || class349.field4567 <= var22.field8448)) {
                var22.method1519((byte) 121);
            }
        }
        if (class381.field4954 != 4) {
            for (class43 var23 = (class43) class152.field1725.method3232(-1); var23 != null; var23 = (class43) class152.field1725.method3236(-27646)) {
                int var24 = (int) (var23.field3405 & 0x3FFFL);
                int var25 = var24 - class682.field9685;
                int var26 = (int) (var23.field3405 >> 14 & 0x3FFFL);
                int var27 = var26 - class146.field1642;
                if (var25 < 0 || var27 < 0 || var25 >= class399.field5338 || var27 >= class349.field4567) {
                    var23.method1519((byte) 121);
                }
            }
        }
        if (class377.field4897 != 0) {
            class319.field4130 -= var8;
            class377.field4897 -= var7;
        }
        class185.method1075(-98);
        if (arg3 != 11) {
            class662.field9411 -= var8 * 512;
            class399.field5335 -= var7;
            class67.field720 -= var8;
            class656.field9367 -= var7;
            class345.field4493 -= var7 * 512;
            class566.field8023 -= var8;
            if (Math.abs(var7) > class399.field5338 || Math.abs(var8) > class349.field4567) {
                class89.method558(0);
            }
        } else if (class5.field41 == 4) {
            class638.field9053 -= var7 * 512;
            class656.field9368 -= var8 * 512;
            class534.field7634 -= var7 * 512;
            class437.field6085 -= var8 * 512;
        } else {
            class5.field41 = 1;
        }
        class195.method1125(-15444);
        class622.method3488(6065);
        class369.field4792.method3170((byte) 113);
        class582.field8274.method3170((byte) -98);
        class224.field2837.method85(25042);
        class508.method2920(0);
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(I)V", line = 321)
    public final void method581(int arg0) {
        field1908++;
        OpenGL.glBindFramebufferEXT(36009, this.field1920);
        if (arg0 > 72) {
            this.field1932 |= 0x2;
            this.field1924 = this.method980((byte) 74);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(B)Z", line = 335)
    public final boolean method976(byte arg0) {
        field1931++;
        int var2 = OpenGL.glCheckFramebufferStatusEXT(this.field1924);
        if (arg0 != 45) {
            this.field1921 = 57;
        }
        return var2 == 36053;
    }

    @OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V", line = 358)
    protected final void finalize() throws Throwable {
        field1917++;
        this.field1904.method2401(20155, this.field1920);
        super.finalize();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V", line = 368)
    public final void method578(int arg0) {
        field1915++;
        OpenGL.glBindFramebufferEXT(36008, this.field1920);
        int var2 = 76 % ((arg0 + 57) / 57);
        this.field1932 |= 0x1;
        this.field1924 = this.method980((byte) 74);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lrc;IB)V", line = 381)
    public final void method977(class491 arg0, int arg1, byte arg2) {
        field1916++;
        if (this.field1924 == -1) {
            throw new RuntimeException();
        }
        int var4 = 0x1 << arg1;
        if (arg2 != 123) {
            return;
        }
        if ((this.field1921 & ~var4) == 0) {
            this.field1919 = arg0.field7128;
            this.field1928 = arg0.field7126;
        } else if (this.field1919 != arg0.field7128 || this.field1928 != arg0.field7126) {
            throw new RuntimeException();
        }
        arg0.method2834(this.field1924, arg2 + 3, class620.field8721[arg1]);
        this.field1911[arg1] = arg0;
        this.field1921 |= var4;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Loa;Lep;Z)V", line = 411)
    public static final void method978(class635 arg0, class382 arg1, boolean arg2) {
        if (arg2) {
            method975(-121, false, 41, 52, (byte) -10);
        }
        field1918++;
        boolean var3 = class472.field6588.method1913(arg1.field4963, arg0, arg1.field5110, arg1.field4967, -1, arg1.field4965 ? class377.field4914.field6309 : null, arg1.field5049 | 0xFF000000, arg1.field4981) == null;
        if (var3) {
            class602.field8537.method3164(new class642(arg1.field5110, arg1.field4963, arg1.field4981, arg1.field5049 | 0xFF000000, arg1.field4967, arg1.field4965), 256);
            class567.method3207((byte) -69, arg1);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V", line = 439)
    public final void method580(int arg0) {
        field1914++;
        OpenGL.glBindFramebufferEXT(36160, 0);
        this.field1932 &= 0xFFFFFFFB;
        if (arg0 > 0) {
            method978(null, null, false);
        }
        this.field1924 = this.method980((byte) 74);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(BLkp;II)V", line = 453)
    private final void method979(byte arg0, class446 arg1, int arg2, int arg3) {
        field1909++;
        if (this.field1924 == -1) {
            throw new RuntimeException();
        }
        if (arg0 != -27) {
            field1926 = 104;
        }
        int var5 = 0x1 << arg3;
        if ((~var5 & this.field1921) == 0) {
            this.field1928 = arg1.field6125;
            this.field1919 = arg1.field6130;
        } else if (this.field1919 != arg1.field6130 || this.field1928 != arg1.field6125) {
            throw new RuntimeException();
        }
        arg1.method2468(27783, arg2, this.field1924, class620.field8721[arg3]);
        this.field1911[arg3] = arg1;
        this.field1921 |= var5;
    }

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "(B)I", line = 488)
    private final int method980(byte arg0) {
        if (arg0 != 74) {
            return 35;
        }
        field1922++;
        if ((this.field1932 & 0x4) != 0) {
            return 36160;
        } else if ((this.field1932 & 0x2) == 0) {
            return (this.field1932 & 0x1) == 0 ? -1 : 36008;
        } else {
            return 36009;
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lap;)V", line = 816)
    public class162(class435 arg0) {
        if (!arg0.field6063) {
            throw new IllegalStateException("");
        }
        this.field1904 = arg0;
        OpenGL.glGenFramebuffersEXT(1, class122.field1372, 0);
        this.field1920 = class122.field1372[0];
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IB)V", line = 514)
    public final void method981(int arg0, byte arg1) {
        field1907++;
        if (this.field1924 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glReadBuffer(class620.field8721[arg0]);
        if (arg1 != -83) {
            this.method984(-39, -103, null);
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(II)V", line = 531)
    public final void method982(int arg0, int arg1) {
        field1925++;
        if (this.field1924 == -1) {
            throw new RuntimeException();
        }
        OpenGL.glDrawBuffer(class620.field8721[arg0]);
        if (arg1 != 30862) {
            field1929 = null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIBI)I", line = 547)
    public static final int method983(int arg0, int arg1, byte arg2, int arg3) {
        field1927++;
        int var4 = arg1 & 0x3;
        if (var4 == 0) {
            return arg3;
        }
        if (arg2 > -25) {
            method978(null, null, true);
        }
        if (var4 == 1) {
            return 4095 - arg0;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IILkp;)V", line = 571)
    public final void method984(int arg0, int arg1, class446 arg2) {
        field1923++;
        this.method979((byte) -27, arg2, arg0, arg1);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(ILng;IZ)V", line = 580)
    public final void method985(int arg0, class310 arg1, int arg2, boolean arg3) {
        this.method987(-17343, 0, arg0, arg1, arg2);
        if (arg3) {
            field1926 = -16;
        }
        field1905++;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIIIII)V", line = 591)
    public static final void method986(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1910++;
        int var8 = 0;
        int var9 = arg6;
        int var10 = 0;
        int var11 = arg7 - arg0;
        int var12 = arg6 - arg0;
        int var13 = arg7 * arg7;
        int var14 = arg6 * arg6;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg6 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - ((var22 - 1) * var20);
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg6 - 1) * var27;
        int var37 = var30;
        int var38 = (arg2 + var12) * var29;
        int[] var39 = class156.field1755[arg3];
        class445.method2463(arg4 - arg7, 117, arg4 - var11, arg1, var39);
        class445.method2463(arg4 - var11, 100, arg4 + var11, arg5, var39);
        class445.method2463(arg4 + var11, 106, arg4 + arg7, arg1, var39);
        while (var9 > 0) {
            boolean var40 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var26 += var37;
                        var25 += var33;
                        var10++;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (var26 < 0) {
                    var26 += var37;
                    var25 += var33;
                    var33 += var30;
                    var37 += var30;
                    var10++;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var24 += var35;
                var23 += var31;
                var8++;
                var31 += var28;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            var32 -= var27;
            var36 -= var27;
            var9--;
            int var41 = arg3 - var9;
            int var42 = arg3 + var9;
            int var43 = arg4 + var8;
            int var44 = arg4 - var8;
            if (var40) {
                int var45 = arg4 + var10;
                int var46 = arg4 - var10;
                class445.method2463(var44, arg2 + 121, var46, arg1, class156.field1755[var41]);
                class445.method2463(var46, arg2 + 122, var45, arg5, class156.field1755[var41]);
                class445.method2463(var45, 96, var43, arg1, class156.field1755[var41]);
                class445.method2463(var44, 93, var46, arg1, class156.field1755[var42]);
                class445.method2463(var46, 92, var45, arg5, class156.field1755[var42]);
                class445.method2463(var45, 119, var43, arg1, class156.field1755[var42]);
            } else {
                class445.method2463(var44, 103, var43, arg1, class156.field1755[var41]);
                class445.method2463(var44, 115, var43, arg1, class156.field1755[var42]);
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIILng;I)V", line = 760)
    private final void method987(int arg0, int arg1, int arg2, class310 arg3, int arg4) {
        field1913++;
        if (this.field1924 == -1) {
            throw new RuntimeException();
        }
        int var6 = 0x1 << arg4;
        if (arg0 != -17343) {
            this.field1924 = -61;
        }
        if ((this.field1921 & ~var6) == 0) {
            this.field1928 = arg3.field4018;
            this.field1919 = arg3.field4018;
        } else if (this.field1919 != arg3.field4018 || this.field1928 != arg3.field4018) {
            throw new RuntimeException();
        }
        arg3.method1761(arg2, arg1, -12765, this.field1924, class620.field8721[arg4]);
        this.field1911[arg4] = arg3;
        this.field1921 |= var6;
    }

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "(II)V", line = 797)
    public final void method988(int arg0, int arg1) {
        if (arg1 != 512) {
            method983(-84, 27, (byte) -14, -116);
        }
        if (this.field1911[arg0] != null) {
            this.field1911[arg0].method260((byte) -84);
        }
        field1912++;
        this.field1921 &= ~(0x1 << arg0);
        this.field1911[arg0] = null;
    }
}
