import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class95 {

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "[I")
    private int[] field1630;

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "[I")
    private int[] field1621;

    @OriginalMember(owner = "client!hd", name = "g", descriptor = "[B")
    private byte[] field1625;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field1628 = 0;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field1629 = 0;

    @OriginalMember(owner = "client!hd", name = "i", descriptor = "I")
    public static int field1627 = 0;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "Lda;")
    public static class275 field1620 = class255.method1672(120, "Verbindung zum Update)2Server hergestellt)3");

    @OriginalMember(owner = "client!hd", name = "d", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!hd", name = "f", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!hd", name = "h", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "[Lrk;")
    public static class20[] field1619;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I)[Lkb;")
    public static final class259[] method681(int arg0) {
        field1626++;
        class259[] var1 = new class259[class151.field2633];
        if (arg0 != -6827) {
            return null;
        }
        for (int var2 = 0; var2 < class151.field2633; var2++) {
            byte[] var3 = class67.field1101[var2];
            int var4 = class32.field480[var2] * class152.field2662[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class270.field4695[class19.method98(var3[var6], 255)];
            }
            var1[var2] = new class259(class267.field4646, class250.field4419, class114.field2010[var2], class246.field4357[var2], class152.field2662[var2], class32.field480[var2], var5);
        }
        class134.method978(-42);
        return var1;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(BII[B[BI)I")
    public final int method682(byte arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        int var7 = arg1 + arg5;
        field1623++;
        int var8 = 0;
        if (arg0 != -76) {
            return -24;
        }
        int var9 = arg2 << 3;
        while (var7 > arg1) {
            int var10 = arg3[arg1] & 0xFF;
            int var11 = this.field1621[var10];
            byte var12 = this.field1625[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var9 >> 3;
            var9 += var12;
            int var15 = var8 & -var13 >> 31;
            int var16 = var14 + (var13 - (1 - var12) >> 3);
            int var17 = var13 + 24;
            arg4[var14] = (byte) (var8 = class246.method1612(var15, var11 >>> var17));
            if (var14 < var16) {
                var14++;
                var13 = var17 - 8;
                arg4[var14] = (byte) (var8 = var11 >>> var13);
                if (var14 < var16) {
                    var14++;
                    var13 -= 8;
                    arg4[var14] = (byte) (var8 = var11 >>> var13);
                    if (var16 > var14) {
                        var14++;
                        var13 -= 8;
                        arg4[var14] = (byte) (var8 = var11 >>> var13);
                        if (var14 < var16) {
                            var14++;
                            var13 -= 8;
                            arg4[var14] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var9 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(III[BI[B)I")
    public final int method683(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field1624++;
        if (arg1 == 0) {
            return 0;
        } else if (arg2 == -17170) {
            int var7 = arg1 + arg4;
            int var8 = 0;
            int var9 = arg0;
            while (true) {
                byte var10 = arg3[var9];
                if (var10 < 0) {
                    var8 = this.field1630[var8];
                } else {
                    var8++;
                }
                int var11;
                if ((var11 = this.field1630[var8]) < 0) {
                    arg5[arg4++] = (byte) (~var11);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field1630[var8];
                }
                int var12;
                if ((var12 = this.field1630[var8]) < 0) {
                    arg5[arg4++] = (byte) (~var12);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field1630[var8];
                }
                int var13;
                if ((var13 = this.field1630[var8]) < 0) {
                    arg5[arg4++] = (byte) (~var13);
                    if (var7 <= arg4) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field1630[var8];
                }
                int var14;
                if ((var14 = this.field1630[var8]) < 0) {
                    arg5[arg4++] = (byte) (~var14);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field1630[var8];
                }
                int var15;
                if ((var15 = this.field1630[var8]) < 0) {
                    arg5[arg4++] = (byte) (~var15);
                    if (var7 <= arg4) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field1630[var8];
                }
                int var16;
                if ((var16 = this.field1630[var8]) < 0) {
                    arg5[arg4++] = (byte) (~var16);
                    if (var7 <= arg4) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field1630[var8];
                }
                int var17;
                if ((var17 = this.field1630[var8]) < 0) {
                    arg5[arg4++] = (byte) (~var17);
                    if (arg4 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field1630[var8];
                }
                int var18;
                if ((var18 = this.field1630[var8]) < 0) {
                    arg5[arg4++] = (byte) (~var18);
                    if (var7 <= arg4) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg0;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(B)V")
    public static void method684(byte arg0) {
        field1619 = null;
        if (arg0 == -3) {
            field1620 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "([B)V")
    public class95(byte[] arg0) {
        int var2 = arg0.length;
        this.field1630 = new int[8];
        this.field1621 = new int[var2];
        this.field1625 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1621[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var4[var10] = class246.method1612(var11, var12);
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
                        if (this.field1630[var14] == 0) {
                            this.field1630[var14] = var3;
                        }
                        var14 = this.field1630[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1630.length <= var14) {
                        int[] var18 = new int[this.field1630.length * 2];
                        for (int var19 = 0; var19 < this.field1630.length; var19++) {
                            var18[var19] = this.field1630[var19];
                        }
                        this.field1630 = var18;
                    }
                }
                this.field1630[var14] = ~var5;
                if (var3 <= var14) {
                    var3 = var14 + 1;
                }
            }
        }
    }
}
