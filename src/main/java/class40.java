import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class40 {

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[B")
    private byte[] field798;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "[I")
    private int[] field803;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "[I")
    private int[] field794;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "Z")
    public static boolean field796 = false;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "[I")
    public static int[] field797 = new int[32];

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "Lqf;")
    public static class117 field799 = class72.method514(110, "<col=80ff00>");

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field793 = 0;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lqf;")
    public static class117 field795 = class72.method514(100, "redstone3");

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field800;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "[Lmf;")
    public static class89[] field801;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[BIB[B)I")
    public final int method285(int arg0, int arg1, byte[] arg2, int arg3, byte arg4, byte[] arg5) {
        field800++;
        int var7 = arg0 + arg1;
        int var8 = arg3 << 3;
        int var9 = 0;
        if (arg4 > -73) {
            field797 = null;
        }
        while (arg0 < var7) {
            int var10 = arg5[arg0] & 0xFF;
            byte var11 = this.field798[var10];
            int var12 = this.field794[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 & 0x7;
            int var14 = var9 & -var13 >> 31;
            int var15 = var8 >> 3;
            int var16 = (var11 + var13 - 1 >> 3) + var15;
            int var17 = var13 + 24;
            arg2[var15] = (byte) (var9 = class96.method763(var14, var12 >>> var17));
            if (var16 > var15) {
                var13 = var17 - 8;
                var15++;
                arg2[var15] = (byte) (var9 = var12 >>> var13);
                if (var16 > var15) {
                    var13 -= 8;
                    var15++;
                    arg2[var15] = (byte) (var9 = var12 >>> var13);
                    if (var15 < var16) {
                        var15++;
                        var13 -= 8;
                        arg2[var15] = (byte) (var9 = var12 >>> var13);
                        if (var16 > var15) {
                            var13 -= 8;
                            var15++;
                            arg2[var15] = (byte) (var9 = var12 << -var13);
                        }
                    }
                }
            }
            var8 += var11;
            arg0++;
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)V")
    public static void method286(int arg0) {
        field801 = null;
        if (arg0 != 0) {
            field797 = null;
        }
        field799 = null;
        field795 = null;
        field797 = null;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([BIIII[B)I")
    public final int method287(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        field804++;
        if (arg2 == 0) {
            return 0;
        } else if (arg4 == 255) {
            int var7 = arg2 + arg3;
            int var8 = 0;
            int var9 = arg1;
            while (true) {
                byte var10 = arg0[var9];
                if (var10 < 0) {
                    var8 = this.field803[var8];
                } else {
                    var8++;
                }
                int var11;
                if ((var11 = this.field803[var8]) < 0) {
                    arg5[arg3++] = (byte) ~var11;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x40) == 0) {
                    var8++;
                } else {
                    var8 = this.field803[var8];
                }
                int var12;
                if ((var12 = this.field803[var8]) < 0) {
                    arg5[arg3++] = (byte) ~var12;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x20) == 0) {
                    var8++;
                } else {
                    var8 = this.field803[var8];
                }
                int var13;
                if ((var13 = this.field803[var8]) < 0) {
                    arg5[arg3++] = (byte) ~var13;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x10) == 0) {
                    var8++;
                } else {
                    var8 = this.field803[var8];
                }
                int var14;
                if ((var14 = this.field803[var8]) < 0) {
                    arg5[arg3++] = (byte) ~var14;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x8) == 0) {
                    var8++;
                } else {
                    var8 = this.field803[var8];
                }
                int var15;
                if ((var15 = this.field803[var8]) < 0) {
                    arg5[arg3++] = (byte) ~var15;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x4) == 0) {
                    var8++;
                } else {
                    var8 = this.field803[var8];
                }
                int var16;
                if ((var16 = this.field803[var8]) < 0) {
                    arg5[arg3++] = (byte) ~var16;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x2) == 0) {
                    var8++;
                } else {
                    var8 = this.field803[var8];
                }
                int var17;
                if ((var17 = this.field803[var8]) < 0) {
                    arg5[arg3++] = (byte) ~var17;
                    if (var7 <= arg3) {
                        break;
                    }
                    var8 = 0;
                }
                if ((var10 & 0x1) == 0) {
                    var8++;
                } else {
                    var8 = this.field803[var8];
                }
                int var18;
                if ((var18 = this.field803[var8]) < 0) {
                    arg5[arg3++] = (byte) ~var18;
                    if (arg3 >= var7) {
                        break;
                    }
                    var8 = 0;
                }
                var9++;
            }
            return var9 + 1 - arg1;
        } else {
            return 70;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "([B)V")
    public class40(byte[] arg0) {
        int var2 = arg0.length;
        this.field798 = arg0;
        this.field803 = new int[8];
        this.field794 = new int[var2];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field794[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class96.method763(var12, var11);
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
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field803[var14] == 0) {
                            this.field803[var14] = var4;
                        }
                        var14 = this.field803[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field803.length <= var14) {
                        int[] var18 = new int[this.field803.length * 2];
                        for (int var19 = 0; var19 < this.field803.length; var19++) {
                            var18[var19] = this.field803[var19];
                        }
                        this.field803 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field803[var14] = ~var5;
            }
        }
    }
}
