import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class39 {

    @OriginalMember(owner = "client!hn", name = "f", descriptor = "[I")
    private int[] field584;

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "[B")
    private byte[] field580;

    @OriginalMember(owner = "client!hn", name = "e", descriptor = "[I")
    private int[] field583;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "Z")
    public static boolean field579 = false;

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "Lnb;")
    public static class341 field581 = new class341(128);

    @OriginalMember(owner = "client!hn", name = "i", descriptor = "[Lwl;")
    public static class100[] field587 = new class100[14];

    @OriginalMember(owner = "client!hn", name = "d", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!hn", name = "h", descriptor = "I")
    public static int field586;

    @OriginalMember(owner = "client!hn", name = "k", descriptor = "I")
    public static int field589;

    @OriginalMember(owner = "client!hn", name = "l", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!hn", name = "j", descriptor = "Lcg;")
    public static class49 field588;

    @OriginalMember(owner = "client!hn", name = "g", descriptor = "[I")
    public static int[] field585;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([B[BIIBI)I", line = 8)
    public final int method330(byte[] arg0, byte[] arg1, int arg2, int arg3, byte arg4, int arg5) {
        int var7 = arg2 + arg5;
        if (arg4 > -125) {
            return 119;
        }
        int var8 = 0;
        field582++;
        int var9 = arg3 << 3;
        while (var7 > arg2) {
            int var10 = arg0[arg2] & 0xFF;
            byte var11 = this.field580[var10];
            int var12 = this.field584[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var9 >> 3;
            int var15 = var8 & -var13 >> 31;
            var9 += var11;
            int var16 = var14 + (var11 + var13 - 1 >> 3);
            int var17 = var13 + 24;
            arg1[var14] = (byte) (var8 = class144.method1159(var15, var12 >>> var17));
            if (var14 < var16) {
                var14++;
                var13 = var17 - 8;
                arg1[var14] = (byte) (var8 = var12 >>> var13);
                if (var16 > var14) {
                    var13 -= 8;
                    var14++;
                    arg1[var14] = (byte) (var8 = var12 >>> var13);
                    if (var16 > var14) {
                        var13 -= 8;
                        var14++;
                        arg1[var14] = (byte) (var8 = var12 >>> var13);
                        if (var14 < var16) {
                            var14++;
                            var13 -= 8;
                            arg1[var14] = (byte) (var8 = var12 << -var13);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V", line = 93)
    public static final void method331(int arg0) {
        if (arg0 != 2047) {
            method334(-8);
        }
        for (int var1 = -1; var1 < class291.field4664; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class119.field2064[var1];
            }
            class205 var3 = class135.field2359[var2];
            if (var3 != null) {
                class272.method1866(var3, (byte) -128, var3.method987(3047));
            }
        }
        field589++;
    }

    @OriginalMember(owner = "client!hn", name = "b", descriptor = "(I)V", line = 125)
    public static final void method332(int arg0) {
        class310.field4908.method466(-1);
        class181.field3044.method466(-1);
        int var1 = 41 % ((arg0 + 64) / 49);
        field590++;
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "([B[BIBII)I", line = 147)
    public final int method333(byte[] arg0, byte[] arg1, int arg2, byte arg3, int arg4, int arg5) {
        field586++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg2 + arg4;
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field583[var8];
            }
            int var11;
            if ((var11 = this.field583[var8]) < 0) {
                arg1[arg2++] = (byte) (~var11);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field583[var8];
            }
            int var12;
            if ((var12 = this.field583[var8]) < 0) {
                arg1[arg2++] = (byte) (~var12);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field583[var8];
            }
            int var13;
            if ((var13 = this.field583[var8]) < 0) {
                arg1[arg2++] = (byte) (~var13);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field583[var8];
            }
            int var14;
            if ((var14 = this.field583[var8]) < 0) {
                arg1[arg2++] = (byte) (~var14);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field583[var8];
            }
            int var15;
            if ((var15 = this.field583[var8]) < 0) {
                arg1[arg2++] = (byte) (~var15);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field583[var8];
            }
            int var16;
            if ((var16 = this.field583[var8]) < 0) {
                arg1[arg2++] = (byte) (~var16);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field583[var8];
            }
            int var17;
            if ((var17 = this.field583[var8]) < 0) {
                arg1[arg2++] = (byte) (~var17);
                if (var7 <= arg2) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field583[var8];
            }
            int var18;
            if ((var18 = this.field583[var8]) < 0) {
                arg1[arg2++] = (byte) (~var18);
                if (arg2 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg3 != 89) {
            method332(-52);
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!hn", name = "<init>", descriptor = "([B)V", line = 297)
    public class39(byte[] arg0) {
        int var2 = arg0.length;
        this.field584 = new int[var2];
        int[] var3 = new int[33];
        this.field580 = arg0;
        int var4 = 0;
        this.field583 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field584[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class144.method1159(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field583[var14] == 0) {
                            this.field583[var14] = var4;
                        }
                        var14 = this.field583[var14];
                    }
                    if (this.field583.length <= var14) {
                        int[] var17 = new int[this.field583.length * 2];
                        for (int var18 = 0; var18 < this.field583.length; var18++) {
                            var17[var18] = this.field583[var18];
                        }
                        this.field583 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field583[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hn", name = "c", descriptor = "(I)V", line = 422)
    public static void method334(int arg0) {
        field585 = null;
        field587 = null;
        field581 = null;
        if (arg0 <= 79) {
            field588 = (class49) null;
        }
        field588 = null;
    }
}
