import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class232 extends class266 {

    @OriginalMember(owner = "client!v", name = "C", descriptor = "Lwj;")
    public static class153 field3845 = new class153(16);

    @OriginalMember(owner = "client!v", name = "V", descriptor = "Lma;")
    public static class5 field3863 = class12.method119("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) 113);

    @OriginalMember(owner = "client!v", name = "E", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!v", name = "G", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!v", name = "J", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!v", name = "K", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!v", name = "L", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!v", name = "M", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!v", name = "N", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!v", name = "O", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!v", name = "P", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!v", name = "Q", descriptor = "I")
    public static int field3858;

    @OriginalMember(owner = "client!v", name = "R", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!v", name = "S", descriptor = "I")
    public static int field3860;

    @OriginalMember(owner = "client!v", name = "F", descriptor = "[I")
    private int[] field3848;

    @OriginalMember(owner = "client!v", name = "H", descriptor = "[I")
    public int[] field3850;

    @OriginalMember(owner = "client!v", name = "U", descriptor = "[Lrj;")
    public static class237[] field3862;

    @OriginalMember(owner = "client!v", name = "T", descriptor = "[Lma;")
    private class5[] field3861;

    @OriginalMember(owner = "client!v", name = "D", descriptor = "[[I")
    private int[][] field3846;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "(B)I", line = 5)
    public final int method1647(byte arg0) {
        field3851++;
        if (this.field3848 == null) {
            return 0;
        } else if (arg0 <= 86) {
            return 116;
        } else {
            return this.field3848.length;
        }
    }

    @OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Lma;", line = 32)
    public final class5 method1648(int arg0) {
        field3856++;
        class5 var2 = class230.method1637(-9, 80);
        if (this.field3861 == null) {
            return class281.field4762;
        }
        var2.method64(11469, this.field3861[0]);
        for (int var3 = 1; var3 < this.field3861.length; var3++) {
            var2.method64(11469, class286.field4828);
            var2.method64(11469, this.field3861[var3]);
        }
        int var4 = -7 / ((-arg0 - 27) / 39);
        return var2.method45(-11069);
    }

    @OriginalMember(owner = "client!v", name = "f", descriptor = "(I)V", line = 59)
    public static void method1649(int arg0) {
        field3863 = null;
        field3862 = null;
        field3845 = null;
        if (arg0 != 5) {
            field3863 = (class5) null;
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)I", line = 76)
    public static final int method1650(int arg0, int arg1, byte arg2) {
        if (arg2 < 93) {
            method1655(114);
        }
        field3860++;
        if (arg0 > arg1) {
            int var3 = arg1;
            arg1 = arg0;
            arg0 = var3;
        }
        while (arg0 != 0) {
            int var4 = arg1 % arg0;
            arg1 = arg0;
            arg0 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Lii;II)V", line = 108)
    private final void method1651(class221 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field3861 = arg0.method1501((byte) -56).method55(arg1 ^ 0x0, 60);
        } else if (arg2 == 2) {
            int var4 = arg0.method1509(true);
            this.field3850 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field3850[var5] = arg0.method1524((byte) 71);
            }
        } else if (arg2 == 3) {
            int var6 = arg0.method1509(true);
            this.field3846 = new int[var6][];
            this.field3848 = new int[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method1524((byte) 82);
                this.field3848[var7] = var8;
                this.field3846[var7] = new int[class209.field3330[var8]];
                for (int var9 = 0; var9 < class209.field3330[var8]; var9++) {
                    this.field3846[var7][var9] = arg0.method1524((byte) 88);
                }
            }
        }
        field3857++;
        if (arg1 != 0) {
            this.method1657((byte) 112, (class221) null);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IBI)I", line = 171)
    public final int method1652(int arg0, byte arg1, int arg2) {
        field3859++;
        if (arg1 != -14) {
            method1653(-66, 49, 6);
        }
        if (this.field3848 == null || arg2 < 0 || arg2 > this.field3848.length) {
            return -1;
        } else if (this.field3846[arg2] == null || arg0 < 0 || this.field3846[arg2].length < arg0) {
            return -1;
        } else {
            return this.field3846[arg2][arg0];
        }
    }

    @OriginalMember(owner = "client!v", name = "b", descriptor = "(III)Z", line = 190)
    public static final boolean method1653(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class174.field2666; var3++) {
            class152 var4 = class47.field721[var3];
            if (var4.field2205 == 1) {
                int var5 = var4.field2223 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field2208 * var5 >> 8) + var4.field2229;
                    int var7 = (var4.field2211 * var5 >> 8) + var4.field2230;
                    int var8 = (var4.field2232 * var5 >> 8) + var4.field2220;
                    int var9 = (var4.field2203 * var5 >> 8) + var4.field2215;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field2205 == 2) {
                int var10 = arg0 - var4.field2223;
                if (var10 > 0) {
                    int var11 = (var4.field2208 * var10 >> 8) + var4.field2229;
                    int var12 = (var4.field2211 * var10 >> 8) + var4.field2230;
                    int var13 = (var4.field2232 * var10 >> 8) + var4.field2220;
                    int var14 = (var4.field2203 * var10 >> 8) + var4.field2215;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field2205 == 3) {
                int var15 = var4.field2229 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field2206 * var15 >> 8) + var4.field2223;
                    int var17 = (var4.field2219 * var15 >> 8) + var4.field2218;
                    int var18 = (var4.field2232 * var15 >> 8) + var4.field2220;
                    int var19 = (var4.field2203 * var15 >> 8) + var4.field2215;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field2205 == 4) {
                int var20 = arg2 - var4.field2229;
                if (var20 > 0) {
                    int var21 = (var4.field2206 * var20 >> 8) + var4.field2223;
                    int var22 = (var4.field2219 * var20 >> 8) + var4.field2218;
                    int var23 = (var4.field2232 * var20 >> 8) + var4.field2220;
                    int var24 = (var4.field2203 * var20 >> 8) + var4.field2215;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field2205 == 5) {
                int var25 = arg1 - var4.field2220;
                if (var25 > 0) {
                    int var26 = (var4.field2206 * var25 >> 8) + var4.field2223;
                    int var27 = (var4.field2219 * var25 >> 8) + var4.field2218;
                    int var28 = (var4.field2208 * var25 >> 8) + var4.field2229;
                    int var29 = (var4.field2211 * var25 >> 8) + var4.field2230;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(ZLii;)Lma;", line = 314)
    public final class5 method1654(boolean arg0, class221 arg1) {
        field3858++;
        class5 var3 = class230.method1637(-9, 80);
        if (this.field3848 != null) {
            for (int var4 = 0; var4 < this.field3848.length; var4++) {
                var3.method64(11469, this.field3861[var4]);
                var3.method64(11469, class72.method511(this.field3846[var4], this.field3848[var4], arg1.method1520((byte) -74, class88.field1314[this.field3848[var4]]), 4));
            }
        }
        if (!arg0) {
            this.field3850 = (int[]) null;
        }
        var3.method64(11469, this.field3861[this.field3861.length - 1]);
        return var3.method45(-11069);
    }

    @OriginalMember(owner = "client!v", name = "g", descriptor = "(I)V", line = 342)
    public static final void method1655(int arg0) {
        field3853++;
        class101.field1508 = null;
        if (arg0 != 1) {
            method1650(-14, -64, (byte) -47);
        }
        class224.method1592();
    }

    @OriginalMember(owner = "client!v", name = "h", descriptor = "(I)V", line = 356)
    public final void method1656(int arg0) {
        int var2 = -37 / ((-arg0 - 48) / 47);
        if (this.field3850 != null) {
            for (int var3 = 0; var3 < this.field3850.length; var3++) {
                this.field3850[var3] = class264.method1820(this.field3850[var3], 32768);
            }
        }
        field3855++;
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(BLii;)V", line = 379)
    public final void method1657(byte arg0, class221 arg1) {
        while (true) {
            int var3 = arg1.method1509(true);
            if (var3 == 0) {
                int var4 = 20 % ((-arg0 - 69) / 39);
                field3849++;
                return;
            }
            this.method1651(arg1, 0, var3);
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IZ)I", line = 398)
    public final int method1658(int arg0, boolean arg1) {
        field3847++;
        if (this.field3848 == null || arg0 < 0 || arg0 > this.field3848.length) {
            return -1;
        } else if (arg1) {
            return 52;
        } else {
            return this.field3848[arg0];
        }
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I[ILii;)V", line = 423)
    public final void method1659(int arg0, int[] arg1, class221 arg2) {
        field3852++;
        if (this.field3848 == null) {
            return;
        }
        for (int var4 = arg0; var4 < this.field3848.length && var4 < arg1.length; var4++) {
            int var5 = class119.field1808[this.method1658(var4, false)];
            if (var5 > 0) {
                arg2.method1554((long) arg1[var4], -1, var5);
            }
        }
    }
}
