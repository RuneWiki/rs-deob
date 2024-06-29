import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class187 {

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[I")
    private int[] field3620;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "[B")
    private byte[] field3618;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "[I")
    private int[] field3631;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "Lra;")
    public static class170 field3621 = null;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "Lob;")
    public static class141 field3627 = class175.method1195(40, ")3");

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field3629 = -1;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lvc;")
    public static class212 field3622 = new class212(64);

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field3632 = 0;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "Lob;")
    private static class141 field3635 = class175.method1195(40, "Enter your username (V password)3");

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "[I")
    public static int[] field3634 = new int[256];

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Lob;")
    public static class141 field3633 = field3635;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field3619;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field3624;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "Lpe;")
    public static class154 field3628;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III[B[BI)I")
    public final int method1242(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field3617++;
        if (arg0 != -786703935) {
            return -127;
        }
        int var7 = arg1 + arg2;
        int var8 = arg5 << 3;
        int var9 = 0;
        while (arg1 < var7) {
            int var10 = arg3[arg1] & 0xFF;
            int var11 = this.field3631[var10];
            byte var12 = this.field3618[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            var8 += var12;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var9 = class57.method389(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg4[var13] = (byte) (var9 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var9 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var9 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg1++;
        }
        return (var8 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method1243(int arg0) {
        field3634 = null;
        field3633 = null;
        field3621 = null;
        if (arg0 != 0) {
            field3634 = null;
        }
        field3628 = null;
        field3635 = null;
        field3622 = null;
        field3627 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II[BI[BI)I")
    public final int method1244(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field3625++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg1 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field3620[var8];
            }
            int var11;
            if ((var11 = this.field3620[var8]) < 0) {
                arg2[arg1++] = (byte) ~var11;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3620[var8];
            }
            int var12;
            if ((var12 = this.field3620[var8]) < 0) {
                arg2[arg1++] = (byte) ~var12;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3620[var8];
            }
            int var13;
            if ((var13 = this.field3620[var8]) < 0) {
                arg2[arg1++] = (byte) ~var13;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3620[var8];
            }
            int var14;
            if ((var14 = this.field3620[var8]) < 0) {
                arg2[arg1++] = (byte) ~var14;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3620[var8];
            }
            int var15;
            if ((var15 = this.field3620[var8]) < 0) {
                arg2[arg1++] = (byte) ~var15;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3620[var8];
            }
            int var16;
            if ((var16 = this.field3620[var8]) < 0) {
                arg2[arg1++] = (byte) ~var16;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3620[var8];
            }
            int var17;
            if ((var17 = this.field3620[var8]) < 0) {
                arg2[arg1++] = (byte) ~var17;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3620[var8];
            }
            int var18;
            if ((var18 = this.field3620[var8]) < 0) {
                arg2[arg1++] = (byte) ~var18;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return arg0 == 3 ? var9 + 1 - arg3 : -118;
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static final void method1245(int arg0) {
        field3624++;
        int var1 = -5 % ((29 - arg0) / 57);
        class85.field1690.method472((byte) 64);
        class202.field3820 = 1;
        class119.field2322 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILgf;)V")
    public static final void method1246(int arg0, class66 arg1) {
        long var2 = 0L;
        field3630++;
        int var4 = -1;
        if (arg1.field1292 == 0) {
            var2 = class224.method1442(arg1.field1276, arg1.field1285, arg1.field1290);
        }
        if (arg1.field1292 == 1) {
            var2 = class113.method732(arg1.field1276, arg1.field1285, arg1.field1290);
        }
        if (arg1.field1292 == 2) {
            var2 = class40.method263(arg1.field1276, arg1.field1285, arg1.field1290);
        }
        if (arg1.field1292 == 3) {
            var2 = class177.method1206(arg1.field1276, arg1.field1285, arg1.field1290);
        }
        int var5 = 0;
        int var6 = 0;
        if (var2 != 0L) {
            var6 = (int) var2 >> 20 & 0x3;
            var5 = (int) var2 >> 14 & 0x1F;
            var4 = (int) (var2 >>> 32) & Integer.MAX_VALUE;
        }
        if (arg0 == 8) {
            arg1.field1284 = var6;
            arg1.field1270 = var4;
            arg1.field1288 = var5;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
    public static final boolean method1247(int arg0, int arg1) {
        field3619++;
        if (arg0 != 8) {
            field3634 = null;
        }
        return (arg1 >> 28 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)I")
    public static final int method1248(int arg0, int arg1, int arg2) {
        field3623++;
        if (arg2 != 1) {
            method1243(-31);
        }
        int var3 = 0;
        while (arg0 > 0) {
            arg0--;
            var3 = var3 << 1 | arg1 & 0x1;
            arg1 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([B)V")
    public class187(byte[] arg0) {
        int var2 = arg0.length;
        this.field3620 = new int[8];
        this.field3618 = arg0;
        this.field3631 = new int[var2];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3631[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
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
                        var3[var10] = class57.method389(var12, var11);
                    }
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
                        if (this.field3620[var14] == 0) {
                            this.field3620[var14] = var4;
                        }
                        var14 = this.field3620[var14];
                    }
                    if (this.field3620.length <= var14) {
                        int[] var17 = new int[this.field3620.length * 2];
                        for (int var18 = 0; var18 < this.field3620.length; var18++) {
                            var17[var18] = this.field3620[var18];
                        }
                        this.field3620 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field3620[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)V")
    public static final void method1249(int arg0) {
        class96.field1894 = new class123(arg0);
        field3626++;
    }
}
