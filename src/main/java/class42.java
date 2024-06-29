import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pja")
public class class42 {

    @OriginalMember(owner = "client!pja", name = "h", descriptor = "Z")
    public boolean field654 = true;

    @OriginalMember(owner = "client!pja", name = "n", descriptor = "Z")
    public boolean field660 = true;

    @OriginalMember(owner = "client!pja", name = "m", descriptor = "I")
    private int field659 = 0;

    @OriginalMember(owner = "client!pja", name = "r", descriptor = "I")
    public int field664 = 512;

    @OriginalMember(owner = "client!pja", name = "e", descriptor = "I")
    public int field651 = -1;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "Z")
    public static boolean field647 = false;

    @OriginalMember(owner = "client!pja", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field653 = new String[200];

    @OriginalMember(owner = "client!pja", name = "b", descriptor = "Ljw;")
    public static class581 field648 = new class581(60, 6);

    @OriginalMember(owner = "client!pja", name = "c", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!pja", name = "d", descriptor = "I")
    public static int field650;

    @OriginalMember(owner = "client!pja", name = "f", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!pja", name = "i", descriptor = "I")
    public static int field655;

    @OriginalMember(owner = "client!pja", name = "j", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!pja", name = "k", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!pja", name = "l", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!pja", name = "o", descriptor = "I")
    public static int field661;

    @OriginalMember(owner = "client!pja", name = "p", descriptor = "I")
    public int field662;

    @OriginalMember(owner = "client!pja", name = "q", descriptor = "I")
    public static int field663;

    @OriginalMember(owner = "client!pja", name = "s", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!pja", name = "t", descriptor = "I")
    public static int field666;

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(III)V", line = 3)
    public static final void method282(int arg0, int arg1, int arg2) {
        field665++;
        class16 var3 = class94.method753(12, arg1 + 9615, (long) arg0);
        if (arg1 != 3560) {
            field648 = null;
        }
        var3.method119(arg1 ^ 0xFFFFF27E);
        var3.field237 = arg2;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(BILgaa;)V", line = 31)
    public static final void method283(byte arg0, int arg1, class315 arg2) {
        field650++;
        boolean var3 = arg2.method1993(-1, 1) == 1;
        if (var3) {
            class477.field6626[class697.field9766++] = arg1;
        }
        int var4 = arg2.method1993(-1, 2);
        class73 var5 = class599.field8149[arg1];
        if (var4 == 0) {
            if (var3) {
                var5.field1066 = false;
            } else if (class363.field5292 == arg1) {
                throw new RuntimeException("s:lr");
            } else {
                class349 var6 = class94.field1342[arg1] = new class349();
                var6.field5126 = (var5.field2250 << 28) + (class121.field1765 + var5.field1890[0] >> 6 << 14) + (var5.field1884[0] + class230.field3147 >> 6);
                if (var5.field1060 == -1) {
                    var6.field5122 = var5.field1860.method3980(2);
                } else {
                    var6.field5122 = var5.field1060;
                }
                var6.field5127 = var5.field1052;
                var6.field5124 = var5.field1787;
                var6.field5121 = var5.field1046;
                if (var5.field1062 > 0) {
                    class293.method1857(var5, -9269);
                }
                class599.field8149[arg1] = null;
                if (arg2.method1993(-1, 1) != 0) {
                    class226.method1494(arg1, arg2, 0);
                }
            }
        } else if (var4 == 1) {
            int var7 = arg2.method1993(-1, 3);
            int var8 = var5.field1890[0];
            int var9 = var5.field1884[0];
            if (var7 == 0) {
                var8--;
                var9--;
            } else if (var7 == 1) {
                var9--;
            } else if (var7 == 2) {
                var9--;
                var8++;
            } else if (var7 == 3) {
                var8--;
            } else if (var7 == 4) {
                var8++;
            } else if (var7 == 5) {
                var9++;
                var8--;
            } else if (var7 == 6) {
                var9++;
            } else if (var7 == 7) {
                var9++;
                var8++;
            }
            if (var3) {
                var5.field1036 = var9;
                var5.field1041 = var8;
                var5.field1066 = true;
            } else {
                var5.method647(var8, -105, var9, class697.field9785[arg1]);
            }
        } else if (var4 == 2) {
            int var10 = arg2.method1993(-1, 4);
            int var11 = var5.field1890[0];
            int var12 = var5.field1884[0];
            if (var10 == 0) {
                var12 -= 2;
                var11 -= 2;
            } else if (var10 == 1) {
                var12 -= 2;
                var11--;
            } else if (var10 == 2) {
                var12 -= 2;
            } else if (var10 == 3) {
                var12 -= 2;
                var11++;
            } else if (var10 == 4) {
                var11 += 2;
                var12 -= 2;
            } else if (var10 == 5) {
                var12--;
                var11 -= 2;
            } else if (var10 == 6) {
                var11 += 2;
                var12--;
            } else if (var10 == 7) {
                var11 -= 2;
            } else if (var10 == 8) {
                var11 += 2;
            } else if (var10 == 9) {
                var12++;
                var11 -= 2;
            } else if (var10 == 10) {
                var12++;
                var11 += 2;
            } else if (var10 == 11) {
                var11 -= 2;
                var12 += 2;
            } else if (var10 == 12) {
                var11--;
                var12 += 2;
            } else if (var10 == 13) {
                var12 += 2;
            } else if (var10 == 14) {
                var11++;
                var12 += 2;
            } else if (var10 == 15) {
                var12 += 2;
                var11 += 2;
            }
            if (var3) {
                var5.field1066 = true;
                var5.field1041 = var11;
                var5.field1036 = var12;
            } else {
                var5.method647(var11, -124, var12, class697.field9785[arg1]);
            }
        } else {
            int var13 = arg2.method1993(-1, 1);
            if (var13 == 0) {
                int var14 = arg2.method1993(-1, 12);
                int var15 = var14 >> 10;
                int var16 = (var14 & 0x3F8) >> 5;
                if (var16 > 15) {
                    var16 -= 32;
                }
                int var17 = var14 & 0x1F;
                if (var17 > 15) {
                    var17 -= 32;
                }
                int var18 = var5.field1890[0] + var16;
                int var19 = var5.field1884[0] + var17;
                if (var3) {
                    var5.field1036 = var19;
                    var5.field1041 = var18;
                    var5.field1066 = true;
                } else {
                    var5.method647(var18, -116, var19, class697.field9785[arg1]);
                }
                var5.field2250 = var5.field2244 = (byte) (var5.field2250 + var15 & 0x3);
                if (class74.method661(var18, var19, 1)) {
                    var5.field2244++;
                }
                if (class363.field5292 == arg1) {
                    if (class610.field8296 != var5.field2250) {
                        class768.field10591 = true;
                    }
                    class610.field8296 = var5.field2250;
                }
            } else {
                int var20 = arg2.method1993(-1, 30);
                int var21 = 44 / ((arg0 - 5) / 55);
                int var22 = var20 >> 28;
                int var23 = (var20 & 0xFFFCE96) >> 14;
                int var24 = var20 & 0x3FFF;
                int var25 = (var5.field1890[0] + var23 + class121.field1765 & 0x3FFF) - class121.field1765;
                int var26 = (var5.field1884[0] + class230.field3147 + var24 & 0x3FFF) - class230.field3147;
                if (var3) {
                    var5.field1036 = var26;
                    var5.field1066 = true;
                    var5.field1041 = var25;
                } else {
                    var5.method647(var25, -123, var26, class697.field9785[arg1]);
                }
                var5.field2250 = var5.field2244 = (byte) (var5.field2250 + var22 & 0x3);
                if (class74.method661(var25, var26, 1)) {
                    var5.field2244++;
                }
                if (class363.field5292 == arg1) {
                    class610.field8296 = var5.field2250;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILjp;B)V", line = 358)
    private final void method284(int arg0, class376 arg1, byte arg2) {
        field656++;
        if (arg0 == 1) {
            this.field659 = arg1.method2373(1223262424);
            this.method285(-98, this.field659);
        } else if (arg0 == 2) {
            this.field651 = arg1.method2359(-1);
            if (this.field651 == 65535) {
                this.field651 = -1;
            }
        } else if (arg0 == 3) {
            this.field664 = arg1.method2359(-1) << 2;
        } else if (arg0 == 4) {
            this.field654 = false;
        } else if (arg0 == 5) {
            this.field660 = false;
        }
        if (arg2 > -20) {
            method289((byte) 91);
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(II)V", line = 403)
    private final void method285(int arg0, int arg1) {
        field663++;
        double var3 = (double) ((arg1 & 0xFF397F) >> 16) / 256.0D;
        double var5 = (double) ((arg1 & 0xFFBF) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        int var13 = -47 % ((-arg0 - 11) / 55);
        if (var7 > var11) {
            var11 = var7;
        }
        double var14 = 0.0D;
        double var16 = 0.0D;
        double var18 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var18 < 0.5D) {
                var16 = (var11 - var9) / (var9 + var11);
            }
            if (var18 >= 0.5D) {
                var16 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var14 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var14 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var14 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var20 = var14 / 6.0D;
        this.field649 = (int) (var18 * 256.0D);
        this.field662 = (int) (var16 * 256.0D);
        if (this.field649 < 0) {
            this.field649 = 0;
        } else if (this.field649 > 255) {
            this.field649 = 255;
        }
        if ((var18 > 0.5D)) {
            this.field658 = (int) ((1.0D - var18) * var16 * 512.0D);
        } else {
            this.field658 = (int) (var16 * var18 * 512.0D);
        }
        if (this.field662 < 0) {
            this.field662 = 0;
        } else if (this.field662 > 255) {
            this.field662 = 255;
        }
        if (this.field658 < 1) {
            this.field658 = 1;
        }
        this.field652 = (int) ((double) this.field658 * var20);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(ILjp;)V", line = 498)
    public final void method286(int arg0, class376 arg1) {
        if (arg0 != 2) {
            this.field649 = -113;
        }
        field661++;
        while (true) {
            int var3 = arg1.method2398(arg0 - 1372747258);
            if (var3 == 0) {
                return;
            }
            this.method284(var3, arg1, (byte) -96);
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(BII)I", line = 518)
    public static final int method287(byte arg0, int arg1, int arg2) {
        field666++;
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return arg0 == 13 ? (arg2 & 0xFF80) + var3 : 105;
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(Ldia;I[II[II)Lcg;", line = 540)
    public static final class148 method288(class246 arg0, int arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        field657++;
        byte[] var6 = new byte[arg1 * arg3];
        for (int var7 = arg5; var7 < arg1; var7++) {
            int var8 = arg3 * var7 + arg2[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class148(arg0, arg3, arg1, var6);
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(B)V", line = 570)
    public static void method289(byte arg0) {
        field653 = null;
        field648 = null;
        if (arg0 >= -38) {
            method282(20, -93, 72);
        }
    }

    @OriginalMember(owner = "client!pja", name = "a", descriptor = "(I)V", line = 593)
    public static final void method290(int arg0) {
        class453.field6295 = null;
        if (arg0 == 26016) {
            field655++;
            class214.field2819 = null;
        }
    }
}
