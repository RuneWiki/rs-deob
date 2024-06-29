import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class34 {

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "[I")
    private int[] field802;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "[B")
    private byte[] field797;

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "[I")
    private int[] field799;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
    public static int field789 = 0;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field787 = 0;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "Z")
    public static boolean field792 = true;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public static int field794 = 0;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "Z")
    public static boolean field784 = false;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "I")
    public static int field798 = 0;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "[J")
    public static long[] field801 = new long[32];

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "Z")
    public static boolean field800 = false;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "Lid;")
    private static class60 field796 = class11.method72(" from your friend list first", (byte) -12);

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "Lid;")
    public static class60 field795 = class11.method72("Lade Benutzeroberfl-=che )2 ", (byte) 116);

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "[Lid;")
    public static class60[] field791 = new class60[1000];

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "Lid;")
    private static class60 field788 = class11.method72("We suspect someone knows your password)3", (byte) -82);

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "Lid;")
    public static class60 field790 = class11.method72("<col=ffff00>", (byte) 127);

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "Lid;")
    public static class60 field803 = field788;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "Lid;")
    public static class60 field793 = field796;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public static int field786;

    @OriginalMember(owner = "client!ee", name = "v", descriptor = "I")
    public static int field804;

    @OriginalMember(owner = "client!ee", name = "w", descriptor = "I")
    public static int field805;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)V")
    public static void method255(byte arg0) {
        field788 = null;
        field791 = null;
        field801 = null;
        field793 = null;
        field795 = null;
        field796 = null;
        field803 = null;
        if (arg0 != 114) {
            field790 = null;
        }
        field790 = null;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[B[BII)I")
    public final int method256(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg0 + arg5;
        int var8 = 0;
        field783++;
        int var9 = arg1 << 3;
        while (arg5 < var7) {
            int var10 = arg3[arg5] & 0xFF;
            int var11 = this.field802[var10];
            byte var12 = this.field797[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var9 >> 3;
            int var16 = (var13 + var12 - 1 >> 3) + var15;
            var9 += var12;
            int var17 = var13 + 24;
            arg2[var15] = (byte) (var8 = class97.method769(var14, var11 >>> var17));
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
                        if (var16 > var15) {
                            var15++;
                            var13 -= 8;
                            arg2[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg5++;
        }
        if (arg4 != 7) {
            this.field802 = null;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(I)V")
    public static final void method257(int arg0) {
        int var1 = class63.field1576;
        int var2 = class101.field2465;
        field805++;
        int var3 = class2.field54;
        int var4 = class17.field416;
        int var5 = 6116423;
        class130.method1015(var2, var1, var3, var4, var5);
        if (arg0 != -20274) {
            field796 = null;
        }
        class130.method1015(var2 + 1, var1 + 1, var3 - 2, 16, 0);
        class130.method1019(var2 + 1, var1 + 18, var3 - 2, var4 + -19, 0);
        class103.field2491.method947(class23.field559, var2 + 3, var1 + 14, var5, -1);
        int var6 = class43.field1153;
        int var7 = class21.field494;
        for (int var8 = 0; var8 < class80.field1956; var8++) {
            int var9 = var1 + (class80.field1956 - var8 - 1) * 15 + 31;
            int var10 = 16777215;
            if (var2 < var6 && var2 + var3 > var6 && var9 - 13 < var7 && var7 < var9 + 3) {
                var10 = 16776960;
            }
            class103.field2491.method947(class17.method141((byte) 106, var8), var2 + 3, var9, var10, 0);
        }
        class86.method715(class101.field2465, class17.field416, (byte) 40, class63.field1576, class2.field54);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II[BII[B)I")
    public final int method258(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field804++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        int var8 = 0;
        if (arg0 != 6116423) {
            return 81;
        }
        int var9 = arg3;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var8 = this.field799[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field799[var8]) < 0) {
                arg2[arg1++] = (byte) ~var11;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field799[var8];
            }
            int var12;
            if ((var12 = this.field799[var8]) < 0) {
                arg2[arg1++] = (byte) ~var12;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field799[var8];
            }
            int var13;
            if ((var13 = this.field799[var8]) < 0) {
                arg2[arg1++] = (byte) ~var13;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field799[var8];
            }
            int var14;
            if ((var14 = this.field799[var8]) < 0) {
                arg2[arg1++] = (byte) ~var14;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field799[var8];
            }
            int var15;
            if ((var15 = this.field799[var8]) < 0) {
                arg2[arg1++] = (byte) ~var15;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field799[var8];
            }
            int var16;
            if ((var16 = this.field799[var8]) < 0) {
                arg2[arg1++] = (byte) ~var16;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field799[var8];
            }
            int var17;
            if ((var17 = this.field799[var8]) < 0) {
                arg2[arg1++] = (byte) ~var17;
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field799[var8];
            }
            int var18;
            if ((var18 = this.field799[var8]) < 0) {
                arg2[arg1++] = (byte) ~var18;
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!ee", name = "<init>", descriptor = "([B)V")
    public class34(byte[] arg0) {
        int var2 = arg0.length;
        this.field802 = new int[var2];
        int[] var3 = new int[33];
        this.field797 = arg0;
        int var4 = 0;
        this.field799 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field802[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
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
                        var3[var10] = class97.method769(var11, var12);
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
                        if (this.field799[var14] == 0) {
                            this.field799[var14] = var4;
                        }
                        var14 = this.field799[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field799.length <= var14) {
                        int[] var18 = new int[this.field799.length * 2];
                        for (int var19 = 0; var19 < this.field799.length; var19++) {
                            var18[var19] = this.field799[var19];
                        }
                        this.field799 = var18;
                    }
                }
                this.field799[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
