import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class95 {

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
    private int field1788 = -1;

    @OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
    private int field1799 = 0;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "I")
    public static int field1789 = 0;

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "I")
    public static int field1791 = 0;

    @OriginalMember(owner = "client!ba", name = "f", descriptor = "Z")
    public static boolean field1793 = false;

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "Lhh;")
    public static class163 field1790 = class137.method1065("(U2", 17);

    @OriginalMember(owner = "client!ba", name = "e", descriptor = "I")
    public int field1792;

    @OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
    public int field1794;

    @OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!ba", name = "j", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!ba", name = "k", descriptor = "I")
    public int field1798;

    @OriginalMember(owner = "client!ba", name = "m", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!ba", name = "n", descriptor = "I")
    public static int field1801;

    @OriginalMember(owner = "client!ba", name = "o", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
    public int field1803;

    @OriginalMember(owner = "client!ba", name = "i", descriptor = "Lv;")
    public static class22 field1796;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(ZILpg;)V")
    public final void method753(boolean arg0, int arg1, class81 arg2) {
        field1797++;
        while (true) {
            int var4 = arg2.method622(arg0);
            if (var4 == 0) {
                if (arg0) {
                    return;
                } else {
                    field1796 = null;
                    return;
                }
            }
            this.method758((byte) 111, var4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BZLhh;)V")
    public static final void method754(byte arg0, boolean arg1, class163 arg2) {
        short[] var3 = new short[16];
        class163 var4 = arg2.method1205(33);
        int var5 = 0;
        field1801++;
        if (arg0 > -7) {
            return;
        }
        for (int var6 = 0; var6 < class75.field1407; var6++) {
            class99 var9 = class120.method939(22952, var6);
            if ((!arg1 || var9.field1909) && var9.field1858 == -1 && var9.field1922 == -1 && var9.field1872 == 0 && var9.field1903.method1205(33).method1229((byte) 95, var4) != -1) {
                if (var5 >= 250) {
                    class259.field4544 = null;
                    class256.field4473 = -1;
                    return;
                }
                if (var5 >= var3.length) {
                    short[] var10 = new short[var3.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var3[var11];
                    }
                    var3 = var10;
                }
                var3[var5++] = (short) var6;
            }
        }
        class258.field4525 = 0;
        class256.field4473 = var5;
        class163[] var7 = new class163[class256.field4473];
        class259.field4544 = var3;
        for (int var8 = 0; var8 < class256.field4473; var8++) {
            var7[var8] = class120.method939(22952, var3[var8]).field1903;
        }
        class218.method1547(class259.field4544, var7, -1);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(II)V")
    private final void method755(int arg0, int arg1) {
        field1795++;
        double var3 = (double) ((arg0 & 0xFF0ABB) >> 16) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) ((arg0 & 0xFFE9) >> 8) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 < var7) {
            var11 = var7;
        }
        if (var11 < var5) {
            var11 = var5;
        }
        if (var3 > var7) {
            var9 = var7;
        }
        if (var9 > var5) {
            var9 = var5;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (var11 - var9) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field1794 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field1803 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1803 = (int) (var15 * var17 * 512.0D);
        }
        this.field1792 = (int) (var17 * 256.0D);
        if (this.field1803 < 1) {
            this.field1803 = 1;
        }
        if (this.field1792 < 0) {
            this.field1792 = 0;
        } else if (this.field1792 > 255) {
            this.field1792 = 255;
        }
        double var19 = var13 / 6.0D;
        if (~this.field1794 > arg1) {
            this.field1794 = 0;
        } else if (this.field1794 > 255) {
            this.field1794 = 255;
        }
        this.field1798 = (int) ((double) this.field1803 * var19);
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public static void method756(int arg0) {
        field1796 = null;
        if (arg0 >= -66) {
            field1790 = null;
        }
        field1790 = null;
    }

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(I)V")
    public static final void method757(int arg0) {
        class52.field863.method111((byte) -52);
        class161.field2949.method111((byte) -52);
        class114.field2129.method111((byte) -52);
        if (arg0 == -4206) {
            field1800++;
            class64.field1083.method111((byte) -52);
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(BIILpg;)V")
    private final void method758(byte arg0, int arg1, int arg2, class81 arg3) {
        field1802++;
        if (arg0 < 89) {
            return;
        }
        if (arg1 == 1) {
            this.field1799 = arg3.method615(-111);
            this.method755(this.field1799, -1);
        } else if (arg1 == 2) {
            this.field1788 = arg3.method658(107);
            if (this.field1788 == 65535) {
                this.field1788 = -1;
                return;
            }
            return;
        } else if (arg1 == 3) {
            arg3.method658(-61);
            return;
        }
    }
}
