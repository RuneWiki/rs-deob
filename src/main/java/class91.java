import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class91 {

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "[I")
    private int[] field1552;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "[B")
    private byte[] field1555;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "[I")
    private int[] field1559;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field1547 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lmh;")
    public static class128 field1549 = class22.method156(123, "Cache:");

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "I")
    public static int field1558 = 0;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "F")
    public static float field1550;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "[[I")
    public static int[][] field1557;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V", line = 8)
    public static final void method573(int arg0, int arg1, int arg2) {
        class71.field1320.method570(27, -1);
        class183.field3212++;
        class71.field1320.method1298(arg0, (byte) -116);
        field1560++;
        if (arg2 != 0) {
            field1556 = 56;
        }
        class71.field1320.method1337(arg2 ^ 0xFFFFFFD5, arg1);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([BIIZ[BI)I", line = 33)
    public final int method574(byte[] arg0, int arg1, int arg2, boolean arg3, byte[] arg4, int arg5) {
        field1548++;
        if (arg3) {
            return 31;
        } else if (arg5 == 0) {
            return 0;
        } else {
            int var7 = 0;
            int var8 = arg1 + arg5;
            int var9 = arg2;
            while (true) {
                byte var10 = arg0[var9];
                if (var10 >= 0) {
                    var7++;
                } else {
                    var7 = this.field1552[var7];
                }
                int var11;
                if ((var11 = this.field1552[var7]) < 0) {
                    arg4[arg1++] = (byte) (~var11);
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var7++;
                } else {
                    var7 = this.field1552[var7];
                }
                int var12;
                if ((var12 = this.field1552[var7]) < 0) {
                    arg4[arg1++] = (byte) (~var12);
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var7++;
                } else {
                    var7 = this.field1552[var7];
                }
                int var13;
                if ((var13 = this.field1552[var7]) < 0) {
                    arg4[arg1++] = (byte) (~var13);
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var7++;
                } else {
                    var7 = this.field1552[var7];
                }
                int var14;
                if ((var14 = this.field1552[var7]) < 0) {
                    arg4[arg1++] = (byte) (~var14);
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var7++;
                } else {
                    var7 = this.field1552[var7];
                }
                int var15;
                if ((var15 = this.field1552[var7]) < 0) {
                    arg4[arg1++] = (byte) (~var15);
                    if (arg1 >= var8) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var7++;
                } else {
                    var7 = this.field1552[var7];
                }
                int var16;
                if ((var16 = this.field1552[var7]) < 0) {
                    arg4[arg1++] = (byte) (~var16);
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var7++;
                } else {
                    var7 = this.field1552[var7];
                }
                int var17;
                if ((var17 = this.field1552[var7]) < 0) {
                    arg4[arg1++] = (byte) (~var17);
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var7++;
                } else {
                    var7 = this.field1552[var7];
                }
                int var18;
                if ((var18 = this.field1552[var7]) < 0) {
                    arg4[arg1++] = (byte) (~var18);
                    if (var8 <= arg1) {
                        break;
                    }
                    var7 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg2;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 193)
    public static void method575(int arg0) {
        field1557 = (int[][]) null;
        field1549 = null;
        if (arg0 != -2) {
            method576(39, 126, (byte) -53, 117, -50);
        }
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "([B)V", line = 210)
    public class91(byte[] arg0) {
        int var2 = arg0.length;
        this.field1552 = new int[8];
        int[] var3 = new int[33];
        this.field1555 = arg0;
        int var4 = 0;
        this.field1559 = new int[var2];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1559[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class279.method1951(var11, var12);
                    }
                    var9 = var7 | var8;
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
                        if (this.field1552[var14] == 0) {
                            this.field1552[var14] = var4;
                        }
                        var14 = this.field1552[var14];
                    }
                    if (this.field1552.length <= var14) {
                        int[] var17 = new int[this.field1552.length * 2];
                        for (int var18 = 0; var18 < this.field1552.length; var18++) {
                            var17[var18] = this.field1552[var18];
                        }
                        this.field1552 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field1552[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIBII)V", line = 337)
    public static final void method576(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field1553++;
        class245 var5 = (class245) class151.field2591.method728(false, (long) arg4);
        if (var5 == null) {
            var5 = new class245();
            class151.field2591.method730(var5, (long) arg4, (byte) -109);
        }
        if (var5.field4185.length <= arg3) {
            int[] var6 = new int[arg3 + 1];
            int[] var7 = new int[arg3 + 1];
            for (int var8 = 0; var8 < var5.field4185.length; var8++) {
                var7[var8] = var5.field4185[var8];
                var6[var8] = var5.field4184[var8];
            }
            for (int var9 = var5.field4185.length; var9 < arg3; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field4185 = var7;
            var5.field4184 = var6;
        }
        var5.field4185[arg3] = arg0;
        var5.field4184[arg3] = arg1;
        if (arg2 <= 108) {
            field1558 = 79;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(BI[B[BII)I", line = 392)
    public final int method577(byte arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = 0;
        field1551++;
        int var8 = arg1 + arg5;
        if (arg0 != 37) {
            return 94;
        }
        int var9 = arg4 << 3;
        while (arg5 < var8) {
            int var10 = arg3[arg5] & 0xFF;
            int var11 = this.field1559[var10];
            byte var12 = this.field1555[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class279.method1951(var15, var11 >>> var17));
            if (var16 > var13) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg4;
    }
}
