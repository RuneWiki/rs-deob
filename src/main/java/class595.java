import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class595 {

    @OriginalMember(owner = "client!df", name = "d", descriptor = "[I")
    private int[] field8201;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "[B")
    private byte[] field8202;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
    private int[] field8199;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Leba;")
    public static class550 field8204 = new class550(3, -1);

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lwh;")
    public static class546 field8206 = new class546(16);

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Leba;")
    public static class550 field8208 = new class550(64, 6);

    @OriginalMember(owner = "client!df", name = "n", descriptor = "I")
    public static int field8211 = -1;

    @OriginalMember(owner = "client!df", name = "m", descriptor = "[[I")
    public static int[][] field8210 = new int[128][128];

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public static int field8200;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field8203;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field8205;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field8209;

    @OriginalMember(owner = "client!df", name = "o", descriptor = "[Lui;")
    public static class638[] field8212;

    @OriginalMember(owner = "client!df", name = "j", descriptor = "[[Z")
    public static boolean[][] field8207;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 6)
    public static void method3302(byte arg0) {
        field8206 = null;
        int var1 = 94 % ((arg0 + 59) / 39);
        field8207 = null;
        field8208 = null;
        field8212 = null;
        field8204 = null;
        field8210 = null;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BI[BI[BI)I", line = 21)
    public final int method3303(byte arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        if (arg0 <= 77) {
            method3302((byte) -1);
        }
        field8200++;
        int var7 = 0;
        int var8 = arg3 << 3;
        int var9 = arg1 + arg5;
        while (var9 > arg1) {
            int var10 = arg4[arg1] & 0xFF;
            int var11 = this.field8201[var10];
            byte var12 = this.field8202[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class665.method3789(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var8 += var12;
            arg1++;
        }
        return (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lhk;", line = 97)
    public static final class363 method3304(int arg0, int arg1, int arg2) {
        class207 var3 = class153.field2168[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2763;
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "([B)V", line = 104)
    public class595(byte[] arg0) {
        int var2 = arg0.length;
        this.field8201 = new int[var2];
        this.field8202 = arg0;
        this.field8199 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field8201[var5] = var8;
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
                        var3[var10] = class665.method3789(var12, var11);
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
                        if (this.field8199[var14] == 0) {
                            this.field8199[var14] = var4;
                        }
                        var14 = this.field8199[var14];
                    }
                    if (var14 >= this.field8199.length) {
                        int[] var17 = new int[this.field8199.length * 2];
                        for (int var18 = 0; var18 < this.field8199.length; var18++) {
                            var17[var18] = this.field8199[var18];
                        }
                        this.field8199 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field8199[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 227)
    public static final void method3305(byte arg0) {
        field8198++;
        int var1 = 0;
        if (class602.field8408.method1868(class618.field8566, 1)) {
            int var2 = var1 | 0x1;
            int var3 = var2 | 0x10;
            int var4 = var3 | 0x20;
            int var5 = var4 | 0x2;
            var1 = var5 | 0x4;
        }
        if (!class602.field8408.field4311) {
            var1 |= 0x40;
        }
        class636.method3519((byte) -124, var1);
        class118.field1510.method3916(var1, 0);
        class87.field1058.method1396(var1, (byte) -118);
        if (arg0 != 91) {
            return;
        }
        class440.field5847.method497(arg0 - 132, var1);
        class24.field291.method2942(80, var1);
        class513.method2904(arg0 ^ 0xFFFFFFEF, var1);
        class466.method2598(var1, (byte) 112);
        class351.method2076(false, var1);
        class534.method2996(arg0 + 7217, var1);
        class446.method2514(false);
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 264)
    public static final void method3306(int arg0) {
        field8205++;
        if (!class602.field8408.method3554(class618.field8566, (byte) -117) && class32.field454 != class298.field3942) {
            class96.method545(11, class312.field4205, (byte) 17, class523.field7257, false);
            return;
        }
        class226.method1408(class146.field1963, (byte) -20);
        if (class298.field3942 != class250.field3297) {
            class254.method1537((byte) -56);
        }
        if (arg0 != 11) {
            field8204 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I[BI[BIB)I", line = 284)
    public final int method3307(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, byte arg5) {
        field8203++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        if (arg5 <= 11) {
            method3306(-74);
        }
        int var9 = arg4;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field8199[var8];
            }
            int var11;
            if ((var11 = this.field8199[var8]) < 0) {
                arg1[arg0++] = (byte) (~var11);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field8199[var8];
            }
            int var12;
            if ((var12 = this.field8199[var8]) < 0) {
                arg1[arg0++] = (byte) (~var12);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field8199[var8];
            }
            int var13;
            if ((var13 = this.field8199[var8]) < 0) {
                arg1[arg0++] = (byte) (~var13);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field8199[var8];
            }
            int var14;
            if ((var14 = this.field8199[var8]) < 0) {
                arg1[arg0++] = (byte) (~var14);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field8199[var8];
            }
            int var15;
            if ((var15 = this.field8199[var8]) < 0) {
                arg1[arg0++] = (byte) (~var15);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field8199[var8];
            }
            int var16;
            if ((var16 = this.field8199[var8]) < 0) {
                arg1[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field8199[var8];
            }
            int var17;
            if ((var17 = this.field8199[var8]) < 0) {
                arg1[arg0++] = (byte) (~var17);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field8199[var8];
            }
            int var18;
            if ((var18 = this.field8199[var8]) < 0) {
                arg1[arg0++] = (byte) (~var18);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }
}
