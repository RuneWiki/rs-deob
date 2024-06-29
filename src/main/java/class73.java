import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class73 {

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
    private int[] field1672;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "[B")
    private byte[] field1662;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "[I")
    private int[] field1663;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "Lcd;")
    public static class23 field1661 = class54.method414("Spieler kann nicht gefunden werden: ", -1);

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1666 = 0;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "Z")
    public static boolean field1660 = false;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field1664 = 0;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1665 = -1;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1667;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public static int field1669;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "Ljava/awt/Font;")
    public static Font field1668;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([BIII[BI)I")
    public final int method518(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field1671++;
        if (~arg5 == arg1) {
            return 0;
        }
        int var7 = arg3 + arg5;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var8 = this.field1663[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field1663[var8]) < 0) {
                arg0[arg3++] = (byte) ~var11;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1663[var8];
            }
            int var12;
            if ((var12 = this.field1663[var8]) < 0) {
                arg0[arg3++] = (byte) ~var12;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1663[var8];
            }
            int var13;
            if ((var13 = this.field1663[var8]) < 0) {
                arg0[arg3++] = (byte) ~var13;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1663[var8];
            }
            int var14;
            if ((var14 = this.field1663[var8]) < 0) {
                arg0[arg3++] = (byte) ~var14;
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1663[var8];
            }
            int var15;
            if ((var15 = this.field1663[var8]) < 0) {
                arg0[arg3++] = (byte) ~var15;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1663[var8];
            }
            int var16;
            if ((var16 = this.field1663[var8]) < 0) {
                arg0[arg3++] = (byte) ~var16;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1663[var8];
            }
            int var17;
            if ((var17 = this.field1663[var8]) < 0) {
                arg0[arg3++] = (byte) ~var17;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1663[var8];
            }
            int var18;
            if ((var18 = this.field1663[var8]) < 0) {
                arg0[arg3++] = (byte) ~var18;
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)V")
    public static final void method519(boolean arg0) {
        if (arg0) {
            method519(true);
        }
        class204.field4021 = new class36(32);
        field1670++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I[BII[BI)I")
    public final int method520(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg0 + arg2;
        int var8 = arg5 << 3;
        field1659++;
        int var9 = 0;
        while (arg2 < var7) {
            int var11 = arg4[arg2] & 0xFF;
            int var12 = this.field1672[var11];
            byte var13 = this.field1662[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var8 >> 3;
            int var15 = var8 & 0x7;
            int var16 = var9 & -var15 >> 31;
            int var17 = (var13 + var15 - 1 >> 3) + var14;
            int var18 = var15 + 24;
            arg1[var14] = (byte) (var9 = class119.method745(var16, var12 >>> var18));
            if (var17 > var14) {
                var14++;
                var15 = var18 - 8;
                arg1[var14] = (byte) (var9 = var12 >>> var15);
                if (var17 > var14) {
                    var14++;
                    var15 -= 8;
                    arg1[var14] = (byte) (var9 = var12 >>> var15);
                    if (var17 > var14) {
                        var15 -= 8;
                        var14++;
                        arg1[var14] = (byte) (var9 = var12 >>> var15);
                        if (var14 < var17) {
                            var15 -= 8;
                            var14++;
                            arg1[var14] = (byte) (var9 = var12 << -var15);
                        }
                    }
                }
            }
            var8 += var13;
            arg2++;
        }
        int var10 = 8 % ((arg3 + 12) / 32);
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)I")
    public static final int method521(int arg0, int arg1) {
        field1669++;
        int var2 = (arg0 * arg0 >> 12) * arg0 >> 12;
        int var3 = arg0 * 6 - 61440;
        if (arg1 != 0) {
            field1661 = null;
        }
        int var4 = (arg0 * var3 >> 12) + 40960;
        return var2 * var4 >> 12;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method522(int arg0) {
        field1661 = null;
        field1668 = null;
        if (arg0 < 18) {
            field1661 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method523(byte arg0) {
        for (int var1 = -1; var1 < class57.field1348; var1++) {
            int var3;
            if (var1 == -1) {
                var3 = 2047;
            } else {
                var3 = class69.field1622[var1];
            }
            class57 var4 = class95.field2007[var3];
            if (var4 != null) {
                class51.method399(1, (byte) -13, var4);
            }
        }
        int var2 = -107 % ((61 - arg0) / 44);
        field1667++;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "([B)V")
    public class73(byte[] arg0) {
        int var2 = 0;
        int[] var3 = new int[33];
        int var4 = arg0.length;
        this.field1672 = new int[var4];
        this.field1662 = arg0;
        this.field1663 = new int[8];
        for (int var5 = 0; var5 < var4; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1672[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class119.method745(var12, var11);
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1663[var14] == 0) {
                            this.field1663[var14] = var2;
                        }
                        var14 = this.field1663[var14];
                    }
                    if (var14 >= this.field1663.length) {
                        int[] var17 = new int[this.field1663.length * 2];
                        for (int var18 = 0; var18 < this.field1663.length; var18++) {
                            var17[var18] = this.field1663[var18];
                        }
                        this.field1663 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var2 <= var14) {
                    var2 = var14 + 1;
                }
                this.field1663[var14] = ~var5;
            }
        }
    }
}
