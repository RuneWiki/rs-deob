import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class308 extends class232 {

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    private int field5239 = 3072;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    private int field5245 = 2048;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    private int field5241 = 1024;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "Z")
    public static boolean field5238 = true;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "Lhi;")
    public static class82 field5248 = class95.method664((byte) -57, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "Lhi;")
    private static class82 field5249 = class95.method664((byte) -59, "Please remove ");

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "Lhi;")
    public static class82 field5255 = class95.method664((byte) -32, "_labels");

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "Lhi;")
    public static class82 field5256 = field5249;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "Lhi;")
    public static class82 field5257 = field5249;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public static int field5253;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "[[[I")
    public static int[][][] field5244;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(IB)[I", line = 12)
    public final int[] method80(int arg0, byte arg1) {
        int[] var3 = this.field4008.method131((byte) -74, arg0);
        field5247++;
        if (this.field4008.field256) {
            int[] var4 = this.method1649(0, (byte) 65, arg0);
            for (int var5 = 0; var5 < class54.field858; var5++) {
                var3[var5] = (var4[var5] * this.field5245 >> 12) + this.field5241;
            }
        }
        int var6 = 79 % ((-arg1 - 31) / 55);
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLtg;)V", line = 39)
    public static final void method2123(boolean arg0, class93 arg1) {
        if (arg0) {
            return;
        }
        field5252++;
        if (arg1.field1710 == 0) {
            return;
        }
        if (arg1.field1683 != -1 && arg1.field1683 < 32768) {
            class275 var2 = class99.field1777[arg1.field1683];
            if (var2 != null) {
                int var3 = arg1.field1689 - var2.field1689;
                int var4 = arg1.field1685 - var2.field1685;
                if (var4 != 0 || var3 != 0) {
                    arg1.field1673 = (int) (Math.atan2((double) var4, (double) var3) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field1683 >= 32768) {
            int var5 = arg1.field1683 - 32768;
            if (class109.field1949 == var5) {
                var5 = 2047;
            }
            class81 var6 = class29.field405[var5];
            if (var6 != null) {
                int var7 = arg1.field1685 - var6.field1685;
                int var8 = arg1.field1689 - var6.field1689;
                if (var7 != 0 || var8 != 0) {
                    arg1.field1673 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field1681 != 0 || arg1.field1726 != 0) && (arg1.field1674 == 0 || arg1.field1652 > 0)) {
            int var9 = arg1.field1685 + (arg1.method520(true) * 64 - (-class230.field3976 + arg1.field1681 + -class230.field3976) * 64 - 64);
            int var10 = arg1.field1689 + ((arg1.method520(true) - 1) * 64) - (-class226.field3916 - class226.field3916 + arg1.field1726) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field1673 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field1726 = 0;
            arg1.field1681 = 0;
        }
        int var11 = arg1.field1673 - arg1.field1704 & 0x7FF;
        if (var11 == 0) {
            arg1.field1697 = 0;
            return;
        }
        arg1.field1697++;
        if (var11 > 1024) {
            boolean var12 = true;
            arg1.field1704 -= arg1.field1710;
            if (var11 < arg1.field1710 || var11 > (2048 - arg1.field1710)) {
                var12 = false;
                arg1.field1704 = arg1.field1673;
            }
            if (arg1.field1703 == arg1.field1668 && (arg1.field1697 > 25 || var12)) {
                if (arg1.field1717 == -1) {
                    arg1.field1668 = arg1.field1663;
                } else {
                    arg1.field1668 = arg1.field1717;
                }
            }
        } else {
            boolean var13 = true;
            arg1.field1704 += arg1.field1710;
            if (var11 < arg1.field1710 || var11 > (2048 - arg1.field1710)) {
                var13 = false;
                arg1.field1704 = arg1.field1673;
            }
            if (arg1.field1703 == arg1.field1668 && (arg1.field1697 > 25 || var13)) {
                if (arg1.field1702 == -1) {
                    arg1.field1668 = arg1.field1663;
                } else {
                    arg1.field1668 = arg1.field1702;
                }
            }
        }
        arg1.field1704 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IB)[[I", line = 163)
    public final int[][] method146(int arg0, byte arg1) {
        field5253++;
        if (arg1 != -82) {
            this.field5245 = -95;
        }
        int[][] var3 = this.field3996.method136(arg1 ^ 0xFFFFFFAE, arg0);
        if (this.field3996.field278) {
            int[][] var4 = this.method1641(0, arg0, (byte) -98);
            int[] var5 = var4[1];
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class54.field858; var11++) {
                var8[var11] = (var6[var11] * this.field5245 >> 12) + this.field5241;
                var9[var11] = (var5[var11] * this.field5245 >> 12) + this.field5241;
                var10[var11] = (var7[var11] * this.field5245 >> 12) + this.field5241;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V", line = 210)
    public class308() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)[Ljf;", line = 215)
    public static final class86[] method2124(int arg0) {
        field5242++;
        int var1 = 106 / ((arg0 - 56) / 39);
        class86[] var2 = new class86[class212.field3714];
        for (int var3 = 0; var3 < class212.field3714; var3++) {
            int var4 = class42.field747[var3] * class107.field1897[var3];
            int[] var5 = new int[var4];
            byte[] var6 = class260.field4453[var3];
            for (int var7 = 0; var7 < var4; var7++) {
                var5[var7] = class142.field2427[class277.method1935(255, var6[var7])];
            }
            if (class147.field2485) {
                var2[var3] = new class210(class285.field4793, class28.field381, class86.field1536[var3], class20.field262[var3], class107.field1897[var3], class42.field747[var3], var5);
            } else {
                var2[var3] = new class303(class285.field4793, class28.field381, class86.field1536[var3], class20.field262[var3], class107.field1897[var3], class42.field747[var3], var5);
            }
        }
        class3.method23(286013516);
        return var2;
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(B)V", line = 280)
    public static final void method2125(byte arg0) {
        int var1 = -58 % ((arg0 - 27) / 58);
        class314.field5412.method2172(false);
        field5254++;
        class19.field255.method2172(false);
        class196.field3326.method2172(false);
        class51.field825.method2172(false);
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)V", line = 294)
    public static void method2126(int arg0) {
        field5256 = null;
        field5255 = null;
        field5257 = null;
        field5249 = null;
        field5248 = null;
        field5244 = (int[][][]) null;
        if (arg0 != -1) {
            field5240 = -45;
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)Lgg;", line = 313)
    public static final class69 method2127(int arg0, int arg1, int arg2) {
        class16 var3 = class15.field120[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field165; var4++) {
            class69 var5 = var3.field158[var4];
            if ((var5.field1064 >> 29 & 0x3L) == 2L && var5.field1076 == arg1 && var5.field1080 == arg2) {
                class64.method409(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V", line = 338)
    public final void method144(int arg0) {
        field5250++;
        if (arg0 < 48) {
            this.method80(-75, (byte) -17);
        }
        this.field5245 = this.field5239 - this.field5241;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZLhi;)V", line = 349)
    public static final void method2128(boolean arg0, class82 arg1) {
        field5246++;
        if (arg0) {
            class143.method969((byte) 27, false);
            class205.method1467(4, arg1);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IBLbc;)V", line = 376)
    public final void method81(int arg0, byte arg1, class153 arg2) {
        if (arg1 != -19) {
            method2125((byte) -11);
        }
        if (arg0 == 0) {
            this.field5241 = arg2.method1090(false);
        } else if (arg0 == 1) {
            this.field5239 = arg2.method1090(false);
        } else if (arg0 == 2) {
            this.field3990 = arg2.method1082(-78) == 1;
        }
        field5251++;
    }
}
