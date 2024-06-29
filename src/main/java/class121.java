import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class121 {

    @OriginalMember(owner = "client!re", name = "i", descriptor = "[I")
    private int[] field2785;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
    private int[] field2777;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "[B")
    private byte[] field2786;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lt;")
    public static class128 field2783 = new class128(5000);

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Lwd;")
    public static class150 field2788 = class2.method9(true, "Name eingeben:");

    @OriginalMember(owner = "client!re", name = "m", descriptor = "[[[I")
    public static int[][][] field2789 = new int[4][105][105];

    @OriginalMember(owner = "client!re", name = "p", descriptor = "Lwd;")
    private static class150 field2792 = class2.method9(true, "Malformed login packet)3");

    @OriginalMember(owner = "client!re", name = "t", descriptor = "I")
    public static int field2796 = -1;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "[I")
    public static int[] field2795 = new int[2000];

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lwd;")
    public static class150 field2791 = class2.method9(true, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!re", name = "n", descriptor = "Lwd;")
    public static class150 field2790 = field2792;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "Lwd;")
    public static class150 field2797 = class2.method9(true, "Ihr Charakter)2Profil wird in:");

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field2787;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "Lff;")
    public static class42 field2793;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "Lkc;")
    public static class72 field2794;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(II[BI[BB)I")
    public final int method883(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, byte arg5) {
        int var7 = arg0 + arg1;
        field2787++;
        int var8 = arg3 << 3;
        int var9 = 0;
        while (var7 > arg0) {
            int var10 = arg2[arg0] & 0xFF;
            int var11 = this.field2777[var10];
            byte var12 = this.field2786[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = (var12 + var14 - 1 >> 3) + var13;
            var8 += var12;
            int var16 = var9 & -var14 >> 31;
            int var17 = var14 + 24;
            arg4[var13] = (byte) (var9 = class147.method1100(var16, var11 >>> var17));
            if (var15 > var13) {
                var13++;
                var14 = var17 - 8;
                arg4[var13] = (byte) (var9 = var11 >>> var14);
                if (var15 > var13) {
                    var14 -= 8;
                    var13++;
                    arg4[var13] = (byte) (var9 = var11 >>> var14);
                    if (var13 < var15) {
                        var14 -= 8;
                        var13++;
                        arg4[var13] = (byte) (var9 = var11 >>> var14);
                        if (var13 < var15) {
                            var13++;
                            var14 -= 8;
                            arg4[var13] = (byte) (var9 = var11 << -var14);
                        }
                    }
                }
            }
            arg0++;
        }
        return arg5 >= -57 ? 22 : (var8 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILva;)Z")
    public static final boolean method884(int arg0, class141 arg1) {
        field2784++;
        if (arg1.field3308 == null) {
            return false;
        }
        for (int var2 = arg0; var2 < arg1.field3308.length; var2++) {
            int var3 = class40.method288(-88, arg1, var2);
            int var4 = arg1.field3310[var2];
            if (arg1.field3308[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg1.field3308[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg1.field3308[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V")
    public static final void method885(int arg0) {
        if (client.field618 == 1) {
            if (class14.field370 >= 539 && class14.field370 <= 573 && class131.field3098 >= 169 && class131.field3098 < 205 && class42.field1111[0] != -1) {
                class24.field695 = 0;
                class82.field1972 = true;
                class66.field1685 = true;
            }
            if (class14.field370 >= 569 && class14.field370 <= 599 && class131.field3098 >= 168 && class131.field3098 < 205 && class42.field1111[1] != -1) {
                class82.field1972 = true;
                class66.field1685 = true;
                class24.field695 = 1;
            }
            if (class14.field370 >= 597 && class14.field370 <= 627 && class131.field3098 >= 168 && class131.field3098 < 205 && class42.field1111[2] != -1) {
                class82.field1972 = true;
                class24.field695 = 2;
                class66.field1685 = true;
            }
            if (class14.field370 >= 625 && class14.field370 <= 669 && class131.field3098 >= 168 && class131.field3098 < 203 && class42.field1111[3] != -1) {
                class24.field695 = 3;
                class66.field1685 = true;
                class82.field1972 = true;
            }
            if (class14.field370 >= 666 && class14.field370 <= 696 && class131.field3098 >= 168 && class131.field3098 < 205 && class42.field1111[4] != -1) {
                class82.field1972 = true;
                class24.field695 = 4;
                class66.field1685 = true;
            }
            if (class14.field370 >= 694 && class14.field370 <= 724 && class131.field3098 >= 168 && class131.field3098 < 205 && class42.field1111[5] != -1) {
                class82.field1972 = true;
                class66.field1685 = true;
                class24.field695 = 5;
            }
            if (class14.field370 >= 722 && class14.field370 <= 756 && class131.field3098 >= 169 && class131.field3098 < 205 && class42.field1111[6] != -1) {
                class82.field1972 = true;
                class66.field1685 = true;
                class24.field695 = 6;
            }
            if (class14.field370 >= 540 && class14.field370 <= 574 && class131.field3098 >= 466 && class131.field3098 < 502 && class42.field1111[7] != -1) {
                class24.field695 = 7;
                class66.field1685 = true;
                class82.field1972 = true;
            }
            if (class14.field370 >= 572 && class14.field370 <= 602 && class131.field3098 >= 466 && class131.field3098 < 503 && class42.field1111[8] != -1) {
                class66.field1685 = true;
                class82.field1972 = true;
                class24.field695 = 8;
            }
            if (class14.field370 >= 599 && class14.field370 <= 629 && class131.field3098 >= 466 && class131.field3098 < 503 && class42.field1111[9] != -1) {
                class24.field695 = 9;
                class82.field1972 = true;
                class66.field1685 = true;
            }
            if (class14.field370 >= 627 && class14.field370 <= 671 && class131.field3098 >= 467 && class131.field3098 < 502 && class42.field1111[10] != -1) {
                class82.field1972 = true;
                class66.field1685 = true;
                class24.field695 = 10;
            }
            if (class14.field370 >= 669 && class14.field370 <= 699 && class131.field3098 >= 466 && class131.field3098 < 503 && class42.field1111[11] != -1) {
                class24.field695 = 11;
                class66.field1685 = true;
                class82.field1972 = true;
            }
            if (class14.field370 >= 696 && class14.field370 <= 726 && class131.field3098 >= 466 && class131.field3098 < 503 && class42.field1111[12] != -1) {
                class82.field1972 = true;
                class24.field695 = 12;
                class66.field1685 = true;
            }
            if (class14.field370 >= 724 && class14.field370 <= 758 && class131.field3098 >= 466 && class131.field3098 < 502 && class42.field1111[13] != -1) {
                class24.field695 = 13;
                class66.field1685 = true;
                class82.field1972 = true;
            }
        }
        if (arg0 == 0) {
            field2779++;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III[B[BI)I")
    public final int method886(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field2781++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg0 + arg1;
        int var8 = 0;
        if (arg5 != -4) {
            this.field2777 = null;
        }
        int var9 = arg2;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field2785[var8];
            }
            int var11;
            if ((var11 = this.field2785[var8]) < 0) {
                arg4[arg0++] = (byte) ~var11;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field2785[var8];
            }
            int var12;
            if ((var12 = this.field2785[var8]) < 0) {
                arg4[arg0++] = (byte) ~var12;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field2785[var8];
            }
            int var13;
            if ((var13 = this.field2785[var8]) < 0) {
                arg4[arg0++] = (byte) ~var13;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field2785[var8];
            }
            int var14;
            if ((var14 = this.field2785[var8]) < 0) {
                arg4[arg0++] = (byte) ~var14;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field2785[var8];
            }
            int var15;
            if ((var15 = this.field2785[var8]) < 0) {
                arg4[arg0++] = (byte) ~var15;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field2785[var8];
            }
            int var16;
            if ((var16 = this.field2785[var8]) < 0) {
                arg4[arg0++] = (byte) ~var16;
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field2785[var8];
            }
            int var17;
            if ((var17 = this.field2785[var8]) < 0) {
                arg4[arg0++] = (byte) ~var17;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field2785[var8];
            }
            int var18;
            if ((var18 = this.field2785[var8]) < 0) {
                arg4[arg0++] = (byte) ~var18;
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
    public static void method887(byte arg0) {
        int var1 = 51 / ((arg0 - 51) / 35);
        field2795 = null;
        field2789 = null;
        field2783 = null;
        field2793 = null;
        field2788 = null;
        field2797 = null;
        field2792 = null;
        field2794 = null;
        field2791 = null;
        field2790 = null;
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "([B)V")
    public class121(byte[] arg0) {
        int var2 = arg0.length;
        this.field2785 = new int[8];
        this.field2777 = new int[var2];
        int[] var3 = new int[33];
        this.field2786 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field2777[var5] = var8;
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
                        var3[var9] = class147.method1100(var10, var11);
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
                        if (this.field2785[var14] == 0) {
                            this.field2785[var14] = var4;
                        }
                        var14 = this.field2785[var14];
                    }
                    if (var14 >= this.field2785.length) {
                        int[] var17 = new int[this.field2785.length * 2];
                        for (int var18 = 0; var18 < this.field2785.length; var18++) {
                            var17[var18] = this.field2785[var18];
                        }
                        this.field2785 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field2785[var14] = ~var5;
            }
        }
    }
}
