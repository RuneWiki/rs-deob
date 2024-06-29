import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class183 {

    @OriginalMember(owner = "client!ii", name = "g", descriptor = "[I")
    private int[] field3012;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "[I")
    private int[] field3006;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "[B")
    private byte[] field3007;

    @OriginalMember(owner = "client!ii", name = "h", descriptor = "Lij;")
    public static class50 field3013 = class78.method578(125, "cross");

    @OriginalMember(owner = "client!ii", name = "f", descriptor = "Le;")
    public static class86 field3011 = new class86();

    @OriginalMember(owner = "client!ii", name = "m", descriptor = "Le;")
    public static class86 field3018 = new class86();

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field3008;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field3009;

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ii", name = "i", descriptor = "I")
    public static int field3014;

    @OriginalMember(owner = "client!ii", name = "j", descriptor = "I")
    public static int field3015;

    @OriginalMember(owner = "client!ii", name = "k", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ii", name = "l", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(BLda;Lda;Lkf;Z)V")
    public static final void method1240(byte arg0, class22 arg1, class22 arg2, class38 arg3, boolean arg4) {
        field3015++;
        class131.field2295 = arg2;
        int var5 = -87 / ((arg0 - 33) / 40);
        class221.field3726 = arg4;
        class71.field1367 = arg1;
        int var6 = class131.field2295.method170(-1) - 1;
        class34.field667 = var6 * 256 + class131.field2295.method180(false, var6);
        class26.field557 = arg3;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1241(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field3017++;
        int var7 = class2.method10(class100.field1855, (byte) 97, arg1, class97.field1816);
        int var8 = class2.method10(class100.field1855, (byte) 97, arg2, class97.field1816);
        int var9 = class2.method10(class177.field2953, (byte) 97, arg6, class224.field3773);
        int var10 = class2.method10(class177.field2953, (byte) 97, arg0, class224.field3773);
        int var11 = class2.method10(class100.field1855, (byte) 97, arg1 + arg4, class97.field1816);
        int var12 = class2.method10(class100.field1855, (byte) 97, arg2 - arg4, class97.field1816);
        for (int var13 = var7; var13 < var11; var13++) {
            class155.method1090(class177.field2963[var13], var9, arg5, 160, var10);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class155.method1090(class177.field2963[var14], var9, arg5, 160, var10);
        }
        int var15 = class2.method10(class177.field2953, (byte) 97, arg4 + arg6, class224.field3773);
        int var16 = class2.method10(class177.field2953, (byte) 97, arg0 - arg4, class224.field3773);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class177.field2963[var17];
            class155.method1090(var18, var9, arg5, 160, var15);
            class155.method1090(var18, var16, arg5, 160, var10);
        }
        if (arg3 >= -22) {
            field3018 = null;
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public static final void method1242(boolean arg0) {
        class119.field2109.method1596(-124);
        if (arg0) {
            field3013 = null;
        }
        field3009++;
        int var1 = class119.field2109.method1600(2, 1);
        if (var1 == 0) {
            return;
        }
        int var2 = class119.field2109.method1600(2, 2);
        if (var2 == 0) {
            class249.field4322[class170.field2855++] = 2047;
        } else if (var2 == 1) {
            int var3 = class119.field2109.method1600(2, 3);
            class239.field4067.method1607(false, var3, 1);
            int var4 = class119.field2109.method1600(2, 1);
            if (var4 == 1) {
                class249.field4322[class170.field2855++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class119.field2109.method1600(2, 3);
            class239.field4067.method1607(true, var5, 1);
            int var6 = class119.field2109.method1600(2, 3);
            class239.field4067.method1607(true, var6, 1);
            int var7 = class119.field2109.method1600(2, 1);
            if (var7 == 1) {
                class249.field4322[class170.field2855++] = 2047;
            }
        } else if (var2 == 3) {
            class201.field3312 = class119.field2109.method1600(2, 2);
            int var8 = class119.field2109.method1600(2, 7);
            int var9 = class119.field2109.method1600(2, 7);
            int var10 = class119.field2109.method1600(2, 1);
            int var11 = class119.field2109.method1600(2, 1);
            if (var11 == 1) {
                class249.field4322[class170.field2855++] = 2047;
            }
            class239.field4067.method1609(var10 == 1, -67, var9, var8);
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(IB[BI[BI)I")
    public final int method1243(int arg0, byte arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg3 + arg5;
        int var8 = 0;
        if (arg1 <= 33) {
            method1242(false);
        }
        field3014++;
        int var9 = arg0 << 3;
        while (var7 > arg3) {
            int var10 = arg4[arg3] & 0xFF;
            int var11 = this.field3012[var10];
            byte var12 = this.field3007[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            var9 += var12;
            int var16 = var15 + (var12 + var13 - 1 >> 3);
            int var17 = var13 + 24;
            arg2[var15] = (byte) (var8 = class29.method261(var14, var11 >>> var17));
            if (var16 > var15) {
                var13 = var17 - 8;
                var15++;
                arg2[var15] = (byte) (var8 = var11 >>> var13);
                if (var15 < var16) {
                    var13 -= 8;
                    var15++;
                    arg2[var15] = (byte) (var8 = var11 >>> var13);
                    if (var15 < var16) {
                        var13 -= 8;
                        var15++;
                        arg2[var15] = (byte) (var8 = var11 >>> var13);
                        if (var15 < var16) {
                            var15++;
                            var13 -= 8;
                            arg2[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg0;
    }

    @OriginalMember(owner = "client!ii", name = "<init>", descriptor = "([B)V")
    public class183(byte[] arg0) {
        int var2 = arg0.length;
        this.field3012 = new int[var2];
        this.field3006 = new int[8];
        int[] var3 = new int[33];
        this.field3007 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3012[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class29.method261(var12, var11);
                    }
                    var9 = var8 | var7;
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field3006[var14] == 0) {
                            this.field3006[var14] = var4;
                        }
                        var14 = this.field3006[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field3006.length <= var14) {
                        int[] var18 = new int[this.field3006.length * 2];
                        for (int var19 = 0; var19 < this.field3006.length; var19++) {
                            var18[var19] = this.field3006[var19];
                        }
                        this.field3006 = var18;
                    }
                }
                this.field3006[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Lda;BII)Lek;")
    public static final class169 method1244(class22 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -124) {
            field3011 = null;
        }
        field3008++;
        return class79.method581((byte) -118, arg2, arg0, arg3) ? class132.method930(22675) : null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(B)V")
    public static void method1245(byte arg0) {
        if (arg0 != 90) {
            field3011 = null;
        }
        field3018 = null;
        field3013 = null;
        field3011 = null;
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "([BIIII[B)I")
    public final int method1246(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field3010++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg2 + arg3;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field3006[var8];
            }
            int var11;
            if ((var11 = this.field3006[var8]) < 0) {
                arg0[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3006[var8];
            }
            int var12;
            if ((var12 = this.field3006[var8]) < 0) {
                arg0[arg3++] = (byte) (~var12);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3006[var8];
            }
            int var13;
            if ((var13 = this.field3006[var8]) < 0) {
                arg0[arg3++] = (byte) (~var13);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3006[var8];
            }
            int var14;
            if ((var14 = this.field3006[var8]) < 0) {
                arg0[arg3++] = (byte) (~var14);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3006[var8];
            }
            int var15;
            if ((var15 = this.field3006[var8]) < 0) {
                arg0[arg3++] = (byte) (~var15);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3006[var8];
            }
            int var16;
            if ((var16 = this.field3006[var8]) < 0) {
                arg0[arg3++] = (byte) (~var16);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3006[var8];
            }
            int var17;
            if ((var17 = this.field3006[var8]) < 0) {
                arg0[arg3++] = (byte) (~var17);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3006[var8];
            }
            int var18;
            if ((var18 = this.field3006[var8]) < 0) {
                arg0[arg3++] = (byte) (~var18);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return arg1 == -2 ? var9 + 1 - arg4 : 45;
    }
}
