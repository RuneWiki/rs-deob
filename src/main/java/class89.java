import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class89 {

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "[B")
    private byte[] field1631;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
    private int[] field1628;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[I")
    private int[] field1634;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1630 = 0;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "Lpj;")
    public static class237 field1632 = class33.method353("Spielwelt erstellt)3", 94);

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1637 = 0;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1636 = 0;

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "Lpj;")
    public static class237 field1638 = class33.method353("Gegenstand f-Ur Mitglieder", 44);

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "Lpj;")
    public static class237 field1627 = class33.method353("T", 37);

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1626;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "I")
    public static int field1633;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "I")
    public static int field1635;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I[B[BIII)I")
    public final int method681(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1629++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = arg3 + arg4;
        int var8 = arg5;
        int var9 = arg0;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1634[var8];
            }
            int var11;
            if ((var11 = this.field1634[var8]) < 0) {
                arg2[arg4++] = (byte) (~var11);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1634[var8];
            }
            int var12;
            if ((var12 = this.field1634[var8]) < 0) {
                arg2[arg4++] = (byte) (~var12);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1634[var8];
            }
            int var13;
            if ((var13 = this.field1634[var8]) < 0) {
                arg2[arg4++] = (byte) (~var13);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1634[var8];
            }
            int var14;
            if ((var14 = this.field1634[var8]) < 0) {
                arg2[arg4++] = (byte) (~var14);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1634[var8];
            }
            int var15;
            if ((var15 = this.field1634[var8]) < 0) {
                arg2[arg4++] = (byte) (~var15);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1634[var8];
            }
            int var16;
            if ((var16 = this.field1634[var8]) < 0) {
                arg2[arg4++] = (byte) (~var16);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1634[var8];
            }
            int var17;
            if ((var17 = this.field1634[var8]) < 0) {
                arg2[arg4++] = (byte) (~var17);
                if (var7 <= arg4) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1634[var8];
            }
            int var18;
            if ((var18 = this.field1634[var8]) < 0) {
                arg2[arg4++] = (byte) (~var18);
                if (arg4 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 - (arg0 - 1);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method682(byte arg0) {
        if (arg0 > 123) {
            field1638 = null;
            field1627 = null;
            field1632 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "([BIIIB[B)I")
    public final int method683(byte[] arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        int var7 = arg1 + arg3;
        if (arg4 >= -114) {
            this.method681(80, (byte[]) null, (byte[]) null, -69, 10, -95);
        }
        field1633++;
        int var8 = arg2 << 3;
        int var9 = 0;
        while (var7 > arg3) {
            int var10 = arg5[arg3] & 0xFF;
            int var11 = this.field1628[var10];
            byte var12 = this.field1631[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg0[var13] = (byte) (var9 = class34.method362(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg0[var13] = (byte) (var9 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg0[var13] = (byte) (var9 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg0[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg0[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "([B)V")
    public class89(byte[] arg0) {
        int var2 = arg0.length;
        this.field1631 = arg0;
        int[] var3 = new int[33];
        this.field1628 = new int[var2];
        this.field1634 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1628[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class34.method362(var11, var12);
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
                        if (this.field1634[var14] == 0) {
                            this.field1634[var14] = var4;
                        }
                        var14 = this.field1634[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field1634.length) {
                        int[] var18 = new int[this.field1634.length * 2];
                        for (int var19 = 0; var19 < this.field1634.length; var19++) {
                            var18[var19] = this.field1634[var19];
                        }
                        this.field1634 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field1634[var14] = ~var5;
            }
        }
    }
}
