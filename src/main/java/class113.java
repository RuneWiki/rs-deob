import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class113 {

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "[I")
    private int[] field1699;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "[B")
    private byte[] field1707;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "[I")
    private int[] field1698;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Lkf;")
    public static class193 field1700 = new class193(64);

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "[S")
    public static short[] field1709 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field1705 = 0;

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "[I")
    public static int[] field1710 = new int[25];

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field1703;

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "I")
    public static int field1704;

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "I")
    public static int field1706;

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "I")
    public static int field1708;

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "I")
    public static int field1711;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1701;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I[BII[BI)I")
    public final int method717(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg2;
        field1706++;
        int var8 = arg5 << 3;
        if (arg3 != -1) {
            return -33;
        }
        int var9 = 0;
        while (var7 > arg2) {
            int var10 = arg1[arg2] & 0xFF;
            int var11 = this.field1699[var10];
            byte var12 = this.field1707[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = (var14 + var12 - 1 >> 3) + var13;
            var8 += var12;
            int var16 = var9 & -var14 >> 31;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var9 = class82.method554(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var9 = var11 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var9 = var11 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg4[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg4[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IZ[B[BII)I")
    public final int method718(int arg0, boolean arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        if (arg1) {
            field1700 = null;
        }
        field1703++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg0 + arg5;
        int var8 = 0;
        int var9 = arg4;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1698[var8];
            }
            int var11;
            if ((var11 = this.field1698[var8]) < 0) {
                arg3[arg0++] = (byte) (~var11);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1698[var8];
            }
            int var12;
            if ((var12 = this.field1698[var8]) < 0) {
                arg3[arg0++] = (byte) (~var12);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1698[var8];
            }
            int var13;
            if ((var13 = this.field1698[var8]) < 0) {
                arg3[arg0++] = (byte) (~var13);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1698[var8];
            }
            int var14;
            if ((var14 = this.field1698[var8]) < 0) {
                arg3[arg0++] = (byte) (~var14);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1698[var8];
            }
            int var15;
            if ((var15 = this.field1698[var8]) < 0) {
                arg3[arg0++] = (byte) (~var15);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1698[var8];
            }
            int var16;
            if ((var16 = this.field1698[var8]) < 0) {
                arg3[arg0++] = (byte) (~var16);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1698[var8];
            }
            int var17;
            if ((var17 = this.field1698[var8]) < 0) {
                arg3[arg0++] = (byte) (~var17);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1698[var8];
            }
            int var18;
            if ((var18 = this.field1698[var8]) < 0) {
                arg3[arg0++] = (byte) (~var18);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method719(int arg0) {
        field1700 = null;
        field1710 = null;
        if (arg0 != 11169) {
            method720(71, -65, 55);
        }
        field1709 = null;
        field1701 = null;
    }

    @OriginalMember(owner = "client!jm", name = "<init>", descriptor = "([B)V")
    public class113(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field1699 = new int[var3];
        int var4 = 0;
        this.field1707 = arg0;
        this.field1698 = new int[8];
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field1699[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var7 | var8;
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
                        var2[var10] = class82.method554(var11, var12);
                    }
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
                        if (this.field1698[var14] == 0) {
                            this.field1698[var14] = var4;
                        }
                        var14 = this.field1698[var14];
                    }
                    if (var14 >= this.field1698.length) {
                        int[] var17 = new int[this.field1698.length * 2];
                        for (int var18 = 0; var18 < this.field1698.length; var18++) {
                            var17[var18] = this.field1698[var18];
                        }
                        this.field1698 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1698[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(III)V")
    public static final void method720(int arg0, int arg1, int arg2) {
        if (class87.field1359 > 0) {
            class132.method881(-109, class87.field1359);
            class87.field1359 = 0;
        }
        short var3 = 256;
        field1702++;
        int var4 = 0;
        int var5 = 0;
        int var6 = class62.field934 * arg1;
        if (arg2 < 70) {
            field1711 = -111;
        }
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class97.field1459[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class62.field932[var6++ + arg0];
                int var12 = class159.field2503[var4++];
                if (var12 == 0) {
                    class103.field1550.field488[var5++] = var11;
                } else {
                    int var13 = 256 - var12 - 18;
                    int var14 = var12 + 18;
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    int var15 = class271.field4439[var12];
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class103.field1550.field488[var5++] = class10.method53(class10.method53(var15, 16711935) * var14 + var13 * class10.method53(16711935, var11), -16711936) + class10.method53(16711680, class10.method53(var15, 65280) * var14 + var13 * class10.method53(65280, var11)) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class103.field1550.field488[var5++] = class62.field932[var6++ + arg0];
            }
            var6 += class62.field934 - 128;
        }
        class103.field1550.method235(arg0, arg1);
    }
}
