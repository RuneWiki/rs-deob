import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class113 extends class279 {

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    private int field1827 = 4096;

    @OriginalMember(owner = "client!md", name = "P", descriptor = "I")
    private int field1830 = 0;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "Ltl;")
    public static class59 field1822 = class85.method639("_", 9588);

    @OriginalMember(owner = "client!md", name = "I", descriptor = "I")
    public static int field1824 = -1;

    @OriginalMember(owner = "client!md", name = "O", descriptor = "Ltl;")
    public static class59 field1829 = class85.method639("_labels", 9588);

    @OriginalMember(owner = "client!md", name = "V", descriptor = "Ltl;")
    public static class59 field1836 = class85.method639("Spielwelt erstellt)3", 9588);

    @OriginalMember(owner = "client!md", name = "H", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!md", name = "N", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!md", name = "Q", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!md", name = "R", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!md", name = "S", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!md", name = "T", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!md", name = "U", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!md", name = "W", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIZZ)V", line = 5)
    public static final void method810(int arg0, int arg1, boolean arg2, boolean arg3) {
        if (arg2) {
            return;
        }
        field1834++;
        if (arg0 < 8000 || arg0 > 48000) {
            throw new IllegalArgumentException();
        }
        class189.field3167 = arg1;
        class84.field1322 = arg0;
        class274.field4723 = arg3;
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V", line = 28)
    public static void method811(byte arg0) {
        int var1 = -118 % ((90 - arg0) / 32);
        field1822 = null;
        field1836 = null;
        field1829 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V", line = 38)
    public static final void method812(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1833++;
        class234.field3888.field2787 = 0;
        class234.field3888.method1219(9, true);
        class234.field3888.method1219(arg4, true);
        class234.field3888.method1219(arg0, true);
        class234.field3888.method1237(true, arg1);
        class234.field3888.method1237(true, arg2);
        class265.field4576 = 0;
        class165.field2678 = 0;
        class238.field3977 = arg3;
        class90.field1405 = -3;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILs;)V", line = 67)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            this.field1830 = arg2.method1214(-18254);
        } else if (arg1 == 1) {
            this.field1827 = arg2.method1214(-18254);
        } else if (arg1 == 2) {
            this.field4789 = arg2.method1221(93) == 1;
        }
        if (arg0 > -125) {
            method814((class295) null, (byte) 1, 108, (class295) null, true);
        }
        field1828++;
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(ZI)Z", line = 130)
    public static final boolean method813(boolean arg0, int arg1) {
        if (!arg0) {
            method814((class295) null, (byte) -125, -31, (class295) null, true);
        }
        field1837++;
        return (arg1 >> 29 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZI)[I", line = 145)
    public final int[] method44(boolean arg0, int arg1) {
        field1825++;
        int[] var3 = this.field4781.method165(arg1, (byte) -11);
        if (arg0) {
            return (int[]) null;
        }
        if (this.field4781.field354) {
            int[] var4 = this.method1960(-125, arg1, 0);
            for (int var5 = 0; var5 < class56.field835; var5++) {
                int var6 = var4[var5];
                if (var6 < this.field1830) {
                    var3[var5] = this.field1830;
                } else if (var6 <= this.field1827) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field1827;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "()V", line = 184)
    public class113() {
        super(1, false);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lme;BILme;Z)Ld;", line = 188)
    public static final class40 method814(class295 arg0, byte arg1, int arg2, class295 arg3, boolean arg4) {
        field1826++;
        boolean var5 = true;
        int[] var6 = arg0.method2041((byte) 18, arg2);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg0.method2045(-116, var6[var7], arg2);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg4) {
                    var10 = arg3.method2045(-100, var9, 0);
                } else {
                    var10 = arg3.method2045(arg1 ^ 0x18, 0, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (arg1 != -108) {
            method811((byte) 88);
        }
        if (!var5) {
            return null;
        }
        try {
            return new class40(arg0, arg3, arg2, arg4);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(II)[[I", line = 245)
    public final int[][] method87(int arg0, int arg1) {
        if (arg0 != -7523) {
            return (int[][]) ((int[][]) null);
        }
        field1835++;
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (this.field4786.field3297) {
            int[][] var4 = this.method1956(0, arg1, (byte) -112);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[1];
            int[] var9 = var3[0];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class56.field835; var11++) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (this.field1830 > var13) {
                    var9[var11] = this.field1830;
                } else if (var13 <= this.field1827) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field1827;
                }
                if (this.field1830 > var14) {
                    var8[var11] = this.field1830;
                } else if (this.field1827 >= var14) {
                    var8[var11] = var14;
                } else {
                    var8[var11] = this.field1827;
                }
                if (this.field1830 > var12) {
                    var10[var11] = this.field1830;
                } else if (var12 > this.field1827) {
                    var10[var11] = this.field1827;
                } else {
                    var10[var11] = var12;
                }
            }
        }
        return var3;
    }
}
