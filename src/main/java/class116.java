import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class116 {

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "[B")
    private byte[] field1650;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "[I")
    private int[] field1647;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "[I")
    private int[] field1651;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1641 = "Loaded config";

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "[I")
    public static int[] field1646 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Ljava/lang/String;")
    public static String field1653 = "glow3:";

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lcc;")
    public static class263 field1649 = null;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field1639;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field1642;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "Llc;")
    public static class175 field1645;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Lef;", line = 5)
    public static final class339 method790(int arg0, int arg1) {
        class339 var2 = (class339) class62.field770.method1239((byte) -115, (long) arg0);
        field1642++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class80.field1018.method1199(28815, arg0, 30);
        class339 var4 = new class339();
        int var5 = -73 / ((61 - arg1) / 36);
        if (var3 != null) {
            var4.method2351(110, new class107(var3), arg0);
        }
        class62.field770.method1243(var4, (long) arg0, -29282);
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([BIBII[B)I", line = 34)
    public final int method791(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, byte[] arg5) {
        field1639++;
        int var7 = arg1 + arg3;
        if (arg2 > -89) {
            this.field1647 = (int[]) null;
        }
        int var8 = 0;
        int var9 = arg4 << 3;
        while (var7 > arg1) {
            int var10 = arg5[arg1] & 0xFF;
            int var11 = this.field1651[var10];
            byte var12 = this.field1650[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var14 - (1 - var12) >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            var9 += var12;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var8 = class48.method283(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg0[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var13++;
                            var14 -= 8;
                            arg0[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V", line = 104)
    public static final void method792(int arg0) {
        class222.method1526(-13529);
        class76.method456((byte) 70);
        field1643++;
        class196.method1356(0);
        class253.method1842(false);
        class171.method1126((byte) 96);
        class128.method850((byte) 32);
        class282.method2012(31664);
        class112.method772(-15197);
        class320.method2229(-125);
        class53.method320(-98);
        class263.method1891(true);
        class345.method2385(9538);
        class81.method484(false);
        class183.method1272(-124);
        class127.method846(2);
        if (arg0 != -29452) {
            method792(-128);
        }
        class73.method443(2048);
        class154.method1039(-64);
        class216.method1493((byte) -76);
        class57.method336(arg0 + 15811);
        class113.method776(arg0 ^ 0xFFFFE417);
        class137.field1900.method1241(arg0 + 29576);
        class40.field472.method1241(122);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZJIZZILjava/lang/String;Ljava/lang/String;II)V", line = 140)
    public static final void method793(int arg0, boolean arg1, long arg2, int arg3, boolean arg4, boolean arg5, int arg6, String arg7, String arg8, int arg9, int arg10) {
        field1648++;
        if (arg10 != 719) {
            method793(57, false, 127L, 93, true, false, -16, (String) null, (String) null, 112, 63);
        }
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class107 var14 = new class107(128);
        var14.method648(10, (byte) 38);
        var14.method662(true, (arg1 ? 1 : 0) | (arg4 ? 2 : 0) | (arg5 ? 4 : 0));
        var14.method678(arg2, (byte) 105);
        var14.method641(1773202520, var12[0]);
        var14.method636(255, arg7);
        var14.method641(1773202520, var12[1]);
        var14.method662(true, class244.field3667);
        var14.method648(arg9, (byte) 38);
        var14.method648(arg6, (byte) 38);
        var14.method641(1773202520, var12[2]);
        var14.method662(true, arg3);
        var14.method662(true, arg0);
        var14.method641(arg10 + 1773201801, var12[3]);
        var14.method644(-1, class16.field219, class176.field2560);
        class107 var15 = new class107(350);
        var15.method636(255, arg8);
        int var16 = 8 - (class309.method2164(arg8, (byte) 117) % 8);
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method648((int) (Math.random() * 255.0D), (byte) 38);
        }
        var15.method668((byte) 81, var12);
        class140.field1954.field1400 = 0;
        class140.field1954.method648(22, (byte) 38);
        class140.field1954.method662(true, var14.field1400 + var15.field1400 + 2);
        class140.field1954.method662(true, 542);
        class140.field1954.method665(var14.field1400, var14.field1388, -124, 0);
        class140.field1954.method665(var15.field1400, var15.field1388, -128, 0);
        class272.field4272 = -3;
        class239.field3585 = 1;
        class292.field4581 = 0;
        class307.field4747 = 0;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BCILjava/lang/StringBuffer;)Ljava/lang/StringBuffer;", line = 199)
    public static final StringBuffer method794(byte arg0, char arg1, int arg2, StringBuffer arg3) {
        field1652++;
        int var4 = arg3.length();
        arg3.setLength(arg2);
        int var5 = var4;
        int var6 = 1 % ((arg0 + 79) / 42);
        while (var5 < arg2) {
            arg3.setCharAt(var5, arg1);
            var5++;
        }
        return arg3;
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(I)V", line = 220)
    public static void method795(int arg0) {
        field1645 = null;
        field1646 = null;
        field1641 = null;
        field1653 = null;
        field1649 = null;
        if (arg0 != -1) {
            method795(51);
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "([B)V", line = 242)
    public class116(byte[] arg0) {
        int var2 = arg0.length;
        this.field1650 = arg0;
        this.field1647 = new int[8];
        int[] var3 = new int[33];
        this.field1651 = new int[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1651[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class48.method283(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1647[var14] == 0) {
                            this.field1647[var14] = var4;
                        }
                        var14 = this.field1647[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1647.length) {
                        int[] var18 = new int[this.field1647.length * 2];
                        for (int var19 = 0; var19 < this.field1647.length; var19++) {
                            var18[var19] = this.field1647[var19];
                        }
                        this.field1647 = var18;
                    }
                }
                this.field1647[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ[BII[B)I", line = 370)
    public final int method796(int arg0, boolean arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        if (!arg1) {
            method793(-51, false, -30L, -117, false, false, 106, (String) null, (String) null, -98, -21);
        }
        field1644++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg0 + arg3;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field1647[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1647[var8]) < 0) {
                arg2[arg0++] = (byte) (~var11);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1647[var8];
            }
            int var12;
            if ((var12 = this.field1647[var8]) < 0) {
                arg2[arg0++] = (byte) (~var12);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1647[var8];
            }
            int var13;
            if ((var13 = this.field1647[var8]) < 0) {
                arg2[arg0++] = (byte) (~var13);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1647[var8];
            }
            int var14;
            if ((var14 = this.field1647[var8]) < 0) {
                arg2[arg0++] = (byte) (~var14);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1647[var8];
            }
            int var15;
            if ((var15 = this.field1647[var8]) < 0) {
                arg2[arg0++] = (byte) (~var15);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1647[var8];
            }
            int var16;
            if ((var16 = this.field1647[var8]) < 0) {
                arg2[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1647[var8];
            }
            int var17;
            if ((var17 = this.field1647[var8]) < 0) {
                arg2[arg0++] = (byte) (~var17);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1647[var8];
            }
            int var18;
            if ((var18 = this.field1647[var8]) < 0) {
                arg2[arg0++] = (byte) (~var18);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }
}
