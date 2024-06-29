import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class4 {

    @OriginalMember(owner = "client!ac", name = "s", descriptor = "[I")
    private int[] field59;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[I")
    private int[] field53;

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "[B")
    private byte[] field49;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "Lof;")
    public static class103 field41 = null;

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "Laf;")
    public static class7 field43 = class48.method406(40, "titlebox");

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "[[I")
    public static int[][] field46 = new int[104][104];

    @OriginalMember(owner = "client!ac", name = "p", descriptor = "Laf;")
    public static class7 field56 = class48.method406(40, "http:)4)4www)3runescape)3com");

    @OriginalMember(owner = "client!ac", name = "h", descriptor = "I")
    public static int field48 = 0;

    @OriginalMember(owner = "client!ac", name = "q", descriptor = "Laf;")
    private static class7 field57 = class48.method406(40, "Please wait 1 minute and try again)3");

    @OriginalMember(owner = "client!ac", name = "r", descriptor = "[[S")
    public static short[][] field58 = new short[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, -31839, 22433, 2983, -11343 }, { 8741, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533, 25239 }, { 25238, 8742, 12, -1506, -22374, 7735, 8404, 1701, -27106, 24094, 10153, -8915, 4783, 1341, 16578, -30533 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ac", name = "e", descriptor = "Laf;")
    public static class7 field45 = field57;

    @OriginalMember(owner = "client!ac", name = "v", descriptor = "Laf;")
    public static class7 field62 = field57;

    @OriginalMember(owner = "client!ac", name = "u", descriptor = "Laf;")
    private static class7 field61 = class48.method406(40, "Please contact customer support)3");

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Laf;")
    public static class7 field54 = field61;

    @OriginalMember(owner = "client!ac", name = "w", descriptor = "I")
    public static int field63 = 0;

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ac", name = "o", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
    public static int field60;

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
    public static int[] field42;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method20(int arg0) {
        field43 = null;
        field57 = null;
        field62 = null;
        field58 = null;
        field41 = null;
        if (arg0 != -13402) {
            return;
        }
        field54 = null;
        field42 = null;
        field56 = null;
        field61 = null;
        field46 = null;
        field45 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I[BIII[B)I")
    public final int method21(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field52++;
        if (arg3 != -16394) {
            method20(4);
        }
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field53[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field53[var8]) < 0) {
                arg1[arg0++] = (byte) ~var11;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field53[var8];
            }
            int var12;
            if ((var12 = this.field53[var8]) < 0) {
                arg1[arg0++] = (byte) ~var12;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field53[var8];
            }
            int var13;
            if ((var13 = this.field53[var8]) < 0) {
                arg1[arg0++] = (byte) ~var13;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field53[var8];
            }
            int var14;
            if ((var14 = this.field53[var8]) < 0) {
                arg1[arg0++] = (byte) ~var14;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field53[var8];
            }
            int var15;
            if ((var15 = this.field53[var8]) < 0) {
                arg1[arg0++] = (byte) ~var15;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field53[var8];
            }
            int var16;
            if ((var16 = this.field53[var8]) < 0) {
                arg1[arg0++] = (byte) ~var16;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field53[var8];
            }
            int var17;
            if ((var17 = this.field53[var8]) < 0) {
                arg1[arg0++] = (byte) ~var17;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field53[var8];
            }
            int var18;
            if ((var18 = this.field53[var8]) < 0) {
                arg1[arg0++] = (byte) ~var18;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method22(byte arg0, byte[] arg1) {
        field44++;
        int var2 = arg1.length;
        if (arg0 < 25) {
            method27((byte) 29);
        }
        byte[] var3 = new byte[var2];
        class125.method1039(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIII[B[B)I")
    public final int method23(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        int var7 = arg0 + arg3;
        int var8 = arg1;
        field60++;
        int var9 = arg2 << 3;
        while (var7 > arg0) {
            int var10 = arg5[arg0] & 0xFF;
            int var11 = this.field59[var10];
            byte var12 = this.field49[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            var9 += var12;
            int var16 = (var12 + var13 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg4[var15] = (byte) (var8 = class141.method1150(var14, var11 >>> var17));
            if (var16 > var15) {
                var15++;
                var13 = var17 - 8;
                arg4[var15] = (byte) (var8 = var11 >>> var13);
                if (var16 > var15) {
                    var15++;
                    var13 -= 8;
                    arg4[var15] = (byte) (var8 = var11 >>> var13);
                    if (var16 > var15) {
                        var15++;
                        var13 -= 8;
                        arg4[var15] = (byte) (var8 = var11 >>> var13);
                        if (var16 > var15) {
                            var15++;
                            var13 -= 8;
                            arg4[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)V")
    public static final void method24(int arg0) {
        field47++;
        if (arg0 != 4783) {
            return;
        }
        for (class96 var1 = (class96) class39.field980.method758(arg0 ^ 0x1250); var1 != null; var1 = (class96) class39.field980.method766(-102)) {
            if (var1.field2278 != null) {
                var1.method784(22773);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method25(String arg0, int arg1) throws ClassNotFoundException {
        field51++;
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
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            if (arg1 != 1) {
                field54 = null;
            }
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(B)V")
    public static final void method26(byte arg0) {
        class47.field1150.method1131(101, 2027385224);
        int var1 = 68 % ((arg0 - 16) / 53);
        for (class28 var2 = (class28) class75.field1748.method127(-82); var2 != null; var2 = (class28) class75.field1748.method123(false)) {
            if (var2.field737 == 0 || var2.field737 == 3) {
                class99.method814(true, (byte) 113, var2);
            }
        }
        if (class12.field317 != null) {
            class141.method1151(15569, class12.field317);
            class12.field317 = null;
        }
        class99.field2360++;
        field50++;
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)V")
    public static final void method27(byte arg0) {
        field55++;
        if (class14.field361 > 0) {
            class8.method103((byte) 96);
            return;
        }
        class111.method880(20, 40);
        class74.field1720 = class12.field302;
        class12.field302 = null;
        if (arg0 != 67) {
            method27((byte) 118);
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "([B)V")
    public class4(byte[] arg0) {
        int var2 = arg0.length;
        this.field59 = new int[var2];
        int var3 = 0;
        this.field53 = new int[8];
        int[] var4 = new int[33];
        this.field49 = arg0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field59[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class141.method1150(var12, var11);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field53[var14] == 0) {
                            this.field53[var14] = var3;
                        }
                        var14 = this.field53[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field53.length) {
                        int[] var18 = new int[this.field53.length * 2];
                        for (int var19 = 0; var19 < this.field53.length; var19++) {
                            var18[var19] = this.field53[var19];
                        }
                        this.field53 = var18;
                    }
                }
                this.field53[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }
}
