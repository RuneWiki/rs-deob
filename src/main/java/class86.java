import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class86 {

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "[I")
    private int[] field1962;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "[I")
    private int[] field1957;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "[B")
    private byte[] field1954;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "Lo;")
    public static class84 field1956 = class15.method124("Report abuse", 255);

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Z")
    public static boolean field1961 = false;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "Loa;")
    public static class85 field1959 = new class85();

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Lqc;")
    public static class97 field1965 = new class97(30);

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lo;")
    public static class84 field1966 = class15.method124("*6nYou have not yet set any recovery questions)3*6nIt is @lre@strongly@yel@ recommended that you do so)3*6n*6nIf you don(Wt you will be @lre@unable to recover your*6n@lre@password@yel@ if you forget it)1 or it is stolen)3", 255);

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "Lo;")
    public static class84 field1968 = class15.method124("(U1", 255);

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lo;")
    public static class84 field1967 = class15.method124("Choose Option", 255);

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field1971 = 0;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "Lo;")
    public static class84 field1972 = class15.method124("Walk here @whi@", 255);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "Lud;")
    public static class118 field1953;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Lcb;")
    public static class15 field1969;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lad;")
    public static class5 field1970;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Z")
    public static boolean field1955;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[[[B")
    public static byte[][][] field1964;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V", line = 9)
    public static final void method680(boolean arg0) {
        field1958++;
        if (!arg0) {
            field1956 = null;
        }
        for (class41 var1 = (class41) class111.field2404.method695((byte) -118); var1 != null; var1 = (class41) class111.field2404.method702(0)) {
            if (var1.field840 > 0) {
                var1.field840--;
            }
            if (var1.field840 != 0) {
                if (var1.field841 > 0) {
                    var1.field841--;
                }
                if (var1.field841 == 0 && var1.field823 >= 1 && var1.field827 >= 1 && var1.field823 <= 102 && var1.field827 <= 102 && (var1.field842 < 0 || class99.method747(var1.field842, 74, var1.field825))) {
                    class117.method895(var1.field834, var1.field823, !arg0, var1.field827, var1.field825, var1.field822, var1.field842, var1.field843);
                    var1.field841 = -1;
                    if (var1.field842 == var1.field826 && var1.field826 == -1) {
                        var1.method333(0);
                    } else if (var1.field842 == var1.field826 && var1.field843 == var1.field837 && var1.field844 == var1.field825) {
                        var1.method333(0);
                    }
                }
            } else if (var1.field826 < 0 || class99.method747(var1.field826, -123, var1.field844)) {
                class117.method895(var1.field834, var1.field823, false, var1.field827, var1.field844, var1.field822, var1.field826, var1.field837);
                var1.method333(0);
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(Z)V", line = 66)
    public static final void method681(boolean arg0) {
        field1960++;
        if (arg0) {
            method682(115);
        }
        class73.field1538.method742(4);
        class109.field2370.method742(4);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 79)
    public static void method682(int arg0) {
        field1970 = null;
        field1972 = null;
        field1959 = null;
        field1966 = null;
        if (arg0 > -76) {
            method680(false);
        }
        field1969 = null;
        field1965 = null;
        field1967 = null;
        field1956 = null;
        field1968 = null;
        field1953 = null;
        field1964 = null;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III[BI[B)I", line = 110)
    public final int method683(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field1951++;
        if (~arg1 == arg4) {
            return 0;
        }
        int var7 = arg0 + arg1;
        int var8 = 0;
        int var9 = arg2;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1957[var8];
            }
            int var11;
            if ((var11 = this.field1957[var8]) < 0) {
                arg5[arg0++] = (byte) ~var11;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1957[var8];
            }
            int var12;
            if ((var12 = this.field1957[var8]) < 0) {
                arg5[arg0++] = (byte) ~var12;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1957[var8];
            }
            int var13;
            if ((var13 = this.field1957[var8]) < 0) {
                arg5[arg0++] = (byte) ~var13;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1957[var8];
            }
            int var14;
            if ((var14 = this.field1957[var8]) < 0) {
                arg5[arg0++] = (byte) ~var14;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1957[var8];
            }
            int var15;
            if ((var15 = this.field1957[var8]) < 0) {
                arg5[arg0++] = (byte) ~var15;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1957[var8];
            }
            int var16;
            if ((var16 = this.field1957[var8]) < 0) {
                arg5[arg0++] = (byte) ~var16;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1957[var8];
            }
            int var17;
            if ((var17 = this.field1957[var8]) < 0) {
                arg5[arg0++] = (byte) ~var17;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1957[var8];
            }
            int var18;
            if ((var18 = this.field1957[var8]) < 0) {
                arg5[arg0++] = (byte) ~var18;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "([BI[BIBI)I", line = 260)
    public final int method684(byte[] arg0, int arg1, byte[] arg2, int arg3, byte arg4, int arg5) {
        if (arg4 > -20) {
            field1967 = null;
        }
        int var7 = 0;
        int var8 = arg1 + arg3;
        int var9 = arg5 << 3;
        field1952++;
        while (var8 > arg3) {
            int var10 = arg0[arg3] & 0xFF;
            byte var11 = this.field1954[var10];
            int var12 = this.field1962[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var14 + var11 - 1 >> 3) + var13;
            int var16 = var7 & -var14 >> 31;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var7 = class106.method785(var16, var12 >>> var17));
            if (var13 < var15) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var7 = var12 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var7 = var12 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var7 = var12 >>> var14);
                        if (var13 < var15) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var7 = var12 << -var14);
                        }
                    }
                }
            }
            var9 += var11;
            arg3++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!ob", name = "<init>", descriptor = "([B)V", line = 361)
    public class86(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field1962 = new int[var3];
        this.field1957 = new int[8];
        int var4 = 0;
        this.field1954 = arg0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field1962[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
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
                        var2[var10] = class106.method785(var12, var11);
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
                        if (this.field1957[var14] == 0) {
                            this.field1957[var14] = var4;
                        }
                        var14 = this.field1957[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1957.length <= var14) {
                        int[] var18 = new int[this.field1957.length * 2];
                        for (int var19 = 0; var19 < this.field1957.length; var19++) {
                            var18[var19] = this.field1957[var19];
                        }
                        this.field1957 = var18;
                    }
                }
                this.field1957[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
