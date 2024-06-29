import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class41 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[I")
    private int[] field978;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "[I")
    private int[] field980;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "[B")
    private byte[] field974;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Lmc;")
    public static class75 field976 = class30.method234(true, "Name eingeben:");

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field981 = 20;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field982 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "Lmc;")
    public static class75 field987 = class30.method234(true, "@or3@");

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "I")
    public static int field989 = 0;

    @OriginalMember(owner = "client!ge", name = "s", descriptor = "Lmc;")
    public static class75 field991 = class30.method234(true, "(X");

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "Lmc;")
    private static class75 field986 = class30.method234(true, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lmc;")
    public static class75 field990 = class30.method234(true, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "B")
    public static byte field993 = 0;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "Z")
    public static boolean field994 = true;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "Lmc;")
    public static class75 field997 = field986;

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "Lkc;")
    public static class63 field992 = new class63(64);

    @OriginalMember(owner = "client!ge", name = "z", descriptor = "Lkc;")
    public static class63 field998 = new class63(64);

    @OriginalMember(owner = "client!ge", name = "C", descriptor = "Lmc;")
    private static class75 field1001 = class30.method234(true, "To play on this world move to a free area first");

    @OriginalMember(owner = "client!ge", name = "B", descriptor = "Lmc;")
    public static class75 field1000 = field1001;

    @OriginalMember(owner = "client!ge", name = "D", descriptor = "Lmc;")
    public static class75 field1002 = class30.method234(true, "Aus");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field996;

    @OriginalMember(owner = "client!ge", name = "A", descriptor = "Lpb;")
    public static class92 field999;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "[I")
    public static int[] field995;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II[BZ[BI)I", line = 14)
    public final int method312(int arg0, int arg1, byte[] arg2, boolean arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg5;
        if (arg3) {
            field989 = -90;
        }
        field983++;
        int var8 = 0;
        int var9 = arg1 << 3;
        while (arg0 < var7) {
            int var10 = arg4[arg0] & 0xFF;
            byte var11 = this.field974[var10];
            int var12 = this.field980[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var9 >> 3;
            var9 += var11;
            int var15 = (var13 + var11 - 1 >> 3) + var14;
            int var16 = var8 & -var13 >> 31;
            int var17 = var13 + 24;
            arg2[var14] = (byte) (var8 = class34.method263(var16, var12 >>> var17));
            if (var15 > var14) {
                var13 = var17 - 8;
                var14++;
                arg2[var14] = (byte) (var8 = var12 >>> var13);
                if (var15 > var14) {
                    var13 -= 8;
                    var14++;
                    arg2[var14] = (byte) (var8 = var12 >>> var13);
                    if (var14 < var15) {
                        var14++;
                        var13 -= 8;
                        arg2[var14] = (byte) (var8 = var12 >>> var13);
                        if (var14 < var15) {
                            var13 -= 8;
                            var14++;
                            arg2[var14] = (byte) (var8 = var12 << -var13);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V", line = 92)
    public static void method313(int arg0) {
        field999 = null;
        field990 = null;
        field976 = null;
        field986 = null;
        field987 = null;
        field997 = null;
        field992 = null;
        field982 = null;
        if (arg0 != 128) {
            return;
        }
        field998 = null;
        field1002 = null;
        field991 = null;
        field1000 = null;
        field1001 = null;
        field995 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lja;IIII)[B", line = 120)
    public static final byte[] method314(class55 arg0, int arg1, int arg2, int arg3, int arg4) {
        field975++;
        if (arg3 >= -91) {
            method317(94);
        }
        long var5 = ((long) arg1 << 32) + ((long) (arg2 << 16)) + (long) (arg2 * 37 - -arg4 & 0xFFFF);
        if (class17.field350 != null) {
            class43 var7 = (class43) class17.field350.method559(var5, -126);
            if (var7 != null) {
                return var7.field1022;
            }
        }
        byte[] var8 = arg0.method436(arg4, 5, arg2);
        if (var8 == null) {
            return null;
        } else {
            if (class17.field350 != null) {
                class17.field350.method558(var5, new class43(var8), 304);
            }
            return var8;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "([BBII[BI)I", line = 154)
    public final int method315(byte[] arg0, byte arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field979++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg2 + arg3;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field978[var8];
            }
            int var11;
            if ((var11 = this.field978[var8]) < 0) {
                arg0[arg2++] = (byte) ~var11;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field978[var8];
            }
            int var12;
            if ((var12 = this.field978[var8]) < 0) {
                arg0[arg2++] = (byte) ~var12;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field978[var8];
            }
            int var13;
            if ((var13 = this.field978[var8]) < 0) {
                arg0[arg2++] = (byte) ~var13;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field978[var8];
            }
            int var14;
            if ((var14 = this.field978[var8]) < 0) {
                arg0[arg2++] = (byte) ~var14;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field978[var8];
            }
            int var15;
            if ((var15 = this.field978[var8]) < 0) {
                arg0[arg2++] = (byte) ~var15;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field978[var8];
            }
            int var16;
            if ((var16 = this.field978[var8]) < 0) {
                arg0[arg2++] = (byte) ~var16;
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field978[var8];
            }
            int var17;
            if ((var17 = this.field978[var8]) < 0) {
                arg0[arg2++] = (byte) ~var17;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field978[var8];
            }
            int var18;
            if ((var18 = this.field978[var8]) < 0) {
                arg0[arg2++] = (byte) ~var18;
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg1 < 102) {
            field999 = null;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 304)
    public static final void method316(int arg0) {
        class101.field2612.method553((byte) 121);
        field973++;
        if (arg0 != 15858) {
            field997 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 315)
    public static final void method317(int arg0) {
        class47.field1154 = null;
        class85.field2109 = null;
        class100.field2592 = null;
        class118.field2924 = null;
        field977++;
        class43.field1031 = null;
        if (arg0 != 7) {
            field982 = null;
        }
        class36.field880 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lja;Lja;IZ)V", line = 334)
    public static final void method318(class55 arg0, class55 arg1, int arg2, boolean arg3) {
        class27.field557 = arg1;
        class97.field2454 = arg0;
        field985++;
        int var4 = 53 % ((-arg2 - 70) / 39);
        class34.field808 = arg3;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)V", line = 346)
    public static final void method319(byte arg0) {
        field996++;
        int var1 = class69.field1759 * 128 + 64;
        int var2 = class68.field1731 * 128 + 64;
        int var3 = class126.method1000(var2, class99.field2510, false, var1) - class70.field1778;
        if (class44.field1057 < var2) {
            class44.field1057 += (var2 - class44.field1057) * class61.field1609 / 1000 + class32.field735;
            if (var2 < class44.field1057) {
                class44.field1057 = var2;
            }
        }
        if (class44.field1057 > var2) {
            class44.field1057 -= (class44.field1057 - var2) * class61.field1609 / 1000 + class32.field735;
            if (var2 > class44.field1057) {
                class44.field1057 = var2;
            }
        }
        int var4 = class24.field476 * 128 + 64;
        if (class84.field2082 < var1) {
            class84.field2082 += (var1 - class84.field2082) * class61.field1609 / 1000 + class32.field735;
            if (class84.field2082 > var1) {
                class84.field2082 = var1;
            }
        }
        if (arg0 < 59) {
            return;
        }
        if (class84.field2082 > var1) {
            class84.field2082 -= (class84.field2082 - var1) * class61.field1609 / 1000 + class32.field735;
            if (var1 > class84.field2082) {
                class84.field2082 = var1;
            }
        }
        if (class12.field235 < var3) {
            class12.field235 += (var3 - class12.field235) * class61.field1609 / 1000 + class32.field735;
            if (class12.field235 > var3) {
                class12.field235 = var3;
            }
        }
        int var5 = class52.field1285 * 128 + 64;
        if (class12.field235 > var3) {
            class12.field235 -= (class12.field235 - var3) * class61.field1609 / 1000 + class32.field735;
            if (var3 > class12.field235) {
                class12.field235 = var3;
            }
        }
        int var6 = class126.method1000(var4, class99.field2510, false, var5) - class131.field3181;
        int var7 = var5 - class84.field2082;
        int var8 = var4 - class44.field1057;
        int var9 = var6 - class12.field235;
        int var10 = (int) Math.sqrt((double) (var7 * var7 + var8 * var8));
        int var11 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
        int var12 = (int) (Math.atan2((double) var7, (double) var8) * -325.949D) & 0x7FF;
        int var13 = var12 - class111.field2809;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class111.field2809 += class71.field1816 * var13 / 1000 + class16.field300;
            class111.field2809 &= 0x7FF;
        }
        if (var11 > class37.field889) {
            class37.field889 += class16.field300 + (var11 - class37.field889) * class71.field1816 / 1000;
            if (class37.field889 > var11) {
                class37.field889 = var11;
            }
        }
        if (var13 < 0) {
            class111.field2809 -= class16.field300 + -var13 * class71.field1816 / 1000;
            class111.field2809 &= 0x7FF;
        }
        int var14 = var12 - class111.field2809;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (class37.field889 > var11) {
            class37.field889 -= (class37.field889 - var11) * class71.field1816 / 1000 + class16.field300;
            if (class37.field889 < var11) {
                class37.field889 = var11;
            }
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class111.field2809 = var12;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)Z", line = 490)
    public static final boolean method320(int arg0, int arg1) {
        field988++;
        if (arg0 < 32) {
            return false;
        } else if (arg0 == 127) {
            return false;
        } else if (arg0 >= 129 && arg0 <= 159) {
            return false;
        } else {
            if (arg1 != -160) {
                method316(-18);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "([B)V", line = 511)
    public class41(byte[] arg0) {
        int var2 = 0;
        int var3 = arg0.length;
        this.field978 = new int[8];
        this.field980 = new int[var3];
        int[] var4 = new int[33];
        this.field974 = arg0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = var4[var6];
                int var8 = 0x1 << 32 - var6;
                this.field980[var5] = var7;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var7 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class34.method263(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var7) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var7 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field978[var14] == 0) {
                            this.field978[var14] = var2;
                        }
                        var14 = this.field978[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field978.length) {
                        int[] var18 = new int[this.field978.length * 2];
                        for (int var19 = 0; var19 < this.field978.length; var19++) {
                            var18[var19] = this.field978[var19];
                        }
                        this.field978 = var18;
                    }
                }
                this.field978[var14] = ~var5;
                if (var14 >= var2) {
                    var2 = var14 + 1;
                }
            }
        }
    }
}
