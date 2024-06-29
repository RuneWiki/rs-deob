import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tl")
public class class96 {

    @OriginalMember(owner = "client!tl", name = "m", descriptor = "[I")
    private int[] field1478;

    @OriginalMember(owner = "client!tl", name = "n", descriptor = "[B")
    private byte[] field1479;

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "[I")
    private int[] field1467;

    @OriginalMember(owner = "client!tl", name = "k", descriptor = "[J")
    public static long[] field1476 = new long[100];

    @OriginalMember(owner = "client!tl", name = "j", descriptor = "Lck;")
    private static class119 field1475 = class298.method1987((byte) 114, "level)2");

    @OriginalMember(owner = "client!tl", name = "d", descriptor = "Lck;")
    public static class119 field1469 = class298.method1987((byte) 94, "Cabbage");

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "Lck;")
    public static class119 field1466 = field1475;

    @OriginalMember(owner = "client!tl", name = "i", descriptor = "I")
    public static int field1474 = 0;

    @OriginalMember(owner = "client!tl", name = "c", descriptor = "Lpi;")
    public static class73 field1468 = new class73(16);

    @OriginalMember(owner = "client!tl", name = "e", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!tl", name = "f", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!tl", name = "g", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!tl", name = "h", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!tl", name = "l", descriptor = "Lfj;")
    public static class3 field1477;

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(Lml;Z)Lml;", line = 5)
    public static final class134 method648(class134 arg0, boolean arg1) {
        field1472++;
        class134 var2 = client.method623(arg0);
        if (arg1) {
            if (var2 == null) {
                var2 = arg0.field2106;
            }
            return var2;
        } else {
            return (class134) null;
        }
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(IIII[B[B)I", line = 21)
    public final int method649(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        field1473++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg0 + arg1;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1467[var8];
            }
            int var11;
            if ((var11 = this.field1467[var8]) < 0) {
                arg4[arg0++] = (byte) (~var11);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1467[var8];
            }
            int var12;
            if ((var12 = this.field1467[var8]) < 0) {
                arg4[arg0++] = (byte) (~var12);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1467[var8];
            }
            int var13;
            if ((var13 = this.field1467[var8]) < 0) {
                arg4[arg0++] = (byte) (~var13);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1467[var8];
            }
            int var14;
            if ((var14 = this.field1467[var8]) < 0) {
                arg4[arg0++] = (byte) (~var14);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1467[var8];
            }
            int var15;
            if ((var15 = this.field1467[var8]) < 0) {
                arg4[arg0++] = (byte) (~var15);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1467[var8];
            }
            int var16;
            if ((var16 = this.field1467[var8]) < 0) {
                arg4[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1467[var8];
            }
            int var17;
            if ((var17 = this.field1467[var8]) < 0) {
                arg4[arg0++] = (byte) (~var17);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1467[var8];
            }
            int var18;
            if ((var18 = this.field1467[var8]) < 0) {
                arg4[arg0++] = (byte) (~var18);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        if (arg2 != 16631) {
            field1477 = (class3) null;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I)V", line = 174)
    public static void method650(int arg0) {
        field1476 = null;
        field1469 = null;
        field1475 = null;
        if (arg0 != 30265) {
            method652(-47);
        }
        field1466 = null;
        field1477 = null;
        field1468 = null;
    }

    @OriginalMember(owner = "client!tl", name = "a", descriptor = "(I[BII[BI)I", line = 200)
    public final int method651(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg2;
        field1471++;
        int var8 = 0;
        int var9 = arg5 << 3;
        if (arg3 != 255) {
            return 68;
        }
        while (arg2 < var7) {
            int var10 = arg4[arg2] & 0xFF;
            int var11 = this.field1478[var10];
            byte var12 = this.field1479[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            var9 += var12;
            int var16 = var13 + (var12 + var14 - 1 >> 3);
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class156.method998(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!tl", name = "b", descriptor = "(I)I", line = 286)
    public static final int method652(int arg0) {
        if (arg0 != -1) {
            method648((class134) null, false);
        }
        field1470++;
        if (class108.field1651 == 3.0D) {
            return 37;
        } else if (class108.field1651 == 4.0D) {
            return 50;
        } else if (class108.field1651 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!tl", name = "<init>", descriptor = "([B)V", line = 325)
    public class96(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        int var4 = 0;
        this.field1478 = new int[var3];
        this.field1479 = arg0;
        this.field1467 = new int[8];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field1478[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var2[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var2[var10] = var2[var10 - 1];
                            break;
                        }
                        var2[var10] = class156.method998(var12, var11);
                    }
                    var9 = var8 | var7;
                } else {
                    var9 = var2[var6 - 1];
                }
                var2[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field1467[var14] == 0) {
                            this.field1467[var14] = var4;
                        }
                        var14 = this.field1467[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1467.length <= var14) {
                        int[] var18 = new int[this.field1467.length * 2];
                        for (int var19 = 0; var19 < this.field1467.length; var19++) {
                            var18[var19] = this.field1467[var19];
                        }
                        this.field1467 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field1467[var14] = ~var5;
            }
        }
    }
}
