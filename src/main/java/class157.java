import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class157 {

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "[B")
    private byte[] field1835;

    @OriginalMember(owner = "client!eh", name = "i", descriptor = "[I")
    private int[] field1836;

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "[I")
    private int[] field1830;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "Lhq;")
    public static class365 field1828 = new class365(128);

    @OriginalMember(owner = "client!eh", name = "f", descriptor = "I")
    public static int field1833 = 0;

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "I")
    public static int field1829 = -1;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "I")
    public static int field1832 = -1;

    @OriginalMember(owner = "client!eh", name = "j", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!eh", name = "k", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!eh", name = "l", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "Lgd;")
    public static class172 field1834;

    @OriginalMember(owner = "client!eh", name = "d", descriptor = "Lwo;")
    public static class285 field1831;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[B[BIII)I")
    public final int method1002(int arg0, byte[] arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1837++;
        int var7 = 0;
        int var8 = arg3 << 3;
        int var9 = arg4 + arg5;
        while (var9 > arg5) {
            int var10 = arg2[arg5] & 0xFF;
            int var11 = this.field1836[var10];
            byte var12 = this.field1835[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class213.method1307(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg5++;
        }
        if (arg0 != 16325) {
            this.method1003(true, -16, (byte[]) null, 73, 100, (byte[]) null);
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI[BII[B)I")
    public final int method1003(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        if (!arg0) {
            return 16;
        }
        field1838++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg4;
        int var9 = arg1;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field1830[var7];
            }
            int var11;
            if ((var11 = this.field1830[var7]) < 0) {
                arg2[arg3++] = (byte) (~var11);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1830[var7];
            }
            int var12;
            if ((var12 = this.field1830[var7]) < 0) {
                arg2[arg3++] = (byte) (~var12);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1830[var7];
            }
            int var13;
            if ((var13 = this.field1830[var7]) < 0) {
                arg2[arg3++] = (byte) (~var13);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1830[var7];
            }
            int var14;
            if ((var14 = this.field1830[var7]) < 0) {
                arg2[arg3++] = (byte) (~var14);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1830[var7];
            }
            int var15;
            if ((var15 = this.field1830[var7]) < 0) {
                arg2[arg3++] = (byte) (~var15);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1830[var7];
            }
            int var16;
            if ((var16 = this.field1830[var7]) < 0) {
                arg2[arg3++] = (byte) (~var16);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1830[var7];
            }
            int var17;
            if ((var17 = this.field1830[var7]) < 0) {
                arg2[arg3++] = (byte) (~var17);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1830[var7];
            }
            int var18;
            if ((var18 = this.field1830[var7]) < 0) {
                arg2[arg3++] = (byte) (~var18);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg1;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
    public static final void method1004(boolean arg0) {
        class238.field3146 = 0;
        class341.field4651 = 0;
        field1839++;
        class390.method2418(-70);
        class91.method574(arg0);
        class262.method1657((byte) 86);
        class261.method1651(-123);
        for (int var1 = 0; var1 < class238.field3146; var1++) {
            int var3 = class374.field5062[var1];
            if (class106.field1273 != class212.field2584[var3].field2427) {
                if (class212.field2584[var3].field1464 > 0) {
                    class201.method1238(-1, class212.field2584[var3]);
                }
                class212.field2584[var3] = null;
            }
        }
        if (class134.field1533 != class215.field2658.field3211) {
            throw new RuntimeException("gpp1 pos:" + class215.field2658.field3211 + " psize:" + class134.field1533);
        }
        for (int var2 = 0; var2 < class450.field6291; var2++) {
            if (class212.field2584[class304.field4083[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class450.field6291);
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static void method1005(int arg0) {
        field1828 = null;
        int var1 = -67 / ((-arg0 - 30) / 47);
        field1834 = null;
        field1831 = null;
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "([B)V")
    public class157(byte[] arg0) {
        int var2 = arg0.length;
        this.field1835 = arg0;
        this.field1836 = new int[var2];
        this.field1830 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1836[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class213.method1307(var10, var11);
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
                        if (this.field1830[var14] == 0) {
                            this.field1830[var14] = var4;
                        }
                        var14 = this.field1830[var14];
                    }
                    if (this.field1830.length <= var14) {
                        int[] var17 = new int[this.field1830.length * 2];
                        for (int var18 = 0; var18 < this.field1830.length; var18++) {
                            var17[var18] = this.field1830[var18];
                        }
                        this.field1830 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field1830[var14] = ~var5;
            }
        }
    }
}
