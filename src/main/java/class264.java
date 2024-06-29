import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class264 {

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public int field3824 = 128;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "Z")
    public boolean field3826 = true;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    private int field3832 = 0;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public int field3836 = -1;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "[[I")
    public static int[][] field3830 = new int[128][128];

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public static int field3827 = 20;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "Ljava/lang/String;")
    public static String field3831 = "Loaded title screen";

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public int field3825;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field3828;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public int field3833;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!il", name = "p", descriptor = "I")
    public static int field3837;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "I")
    public int field3839;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(II)V")
    private final void method1811(int arg0, int arg1) {
        field3835++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field3828 = (int) (var15 * 256.0D);
        this.field3839 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field3828 < 0) {
            this.field3828 = 0;
        } else if (this.field3828 > 255) {
            this.field3828 = 255;
        }
        int var21 = -68 / ((arg0 - 61) / 52);
        if (var17 > 0.5D) {
            this.field3833 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3833 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field3839 < 0) {
            this.field3839 = 0;
        } else if (this.field3839 > 255) {
            this.field3839 = 255;
        }
        if (this.field3833 < 1) {
            this.field3833 = 1;
        }
        this.field3825 = (int) ((double) this.field3833 * var19);
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lnj;III)V")
    private final void method1812(class228 arg0, int arg1, int arg2, int arg3) {
        field3823++;
        if (arg1 != 255) {
            return;
        }
        if (arg3 == 1) {
            this.field3832 = arg0.method1333((byte) -93);
            this.method1811(arg1 - 132, this.field3832);
        } else if (arg3 == 2) {
            this.field3836 = arg0.method1343(255);
            if (this.field3836 == 65535) {
                this.field3836 = -1;
                return;
            }
        } else if (arg3 == 3) {
            this.field3824 = arg0.method1343(255);
        } else if (arg3 == 4) {
            this.field3826 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V")
    public static void method1813(byte arg0) {
        field3831 = null;
        if (arg0 != 109) {
            method1813((byte) -125);
        }
        field3830 = null;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lnj;BI)V")
    public final void method1814(class228 arg0, byte arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1348(-121);
            if (var4 == 0) {
                if (arg1 != -35) {
                    this.field3824 = -52;
                }
                field3822++;
                return;
            }
            this.method1812(arg0, 255, arg2, var4);
        }
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(II)V")
    public static final void method1815(int arg0, int arg1) {
        field3837++;
        class142.method904(false);
        class248.method1493(1);
        if (arg0 != 3930) {
            return;
        }
        int var2 = class284.method1956(arg1, -118).field2301;
        if (var2 == 0) {
            return;
        }
        int var3 = class191.field2561[arg1];
        if (var2 == 5) {
            class88.field1232 = var3;
        }
        if (var2 == 6) {
            class75.field1064 = var3;
        }
        if (var2 == 9) {
            class263.field3819 = var3;
        }
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V")
    public static final void method1816(int arg0) {
        field3829++;
        if (arg0 != 27478) {
            method1816(86);
        }
        for (int var1 = -1; var1 < class65.field861; var1++) {
            int var5;
            if (var1 == -1) {
                var5 = 2047;
            } else {
                var5 = class229.field3071[var1];
            }
            class25 var6 = class206.field2777[var5];
            if (var6 != null && var6.field4310 > 0) {
                var6.field4310--;
                if (var6.field4310 == 0) {
                    var6.field4309 = null;
                }
            }
        }
        for (int var2 = 0; var2 < class198.field2637; var2++) {
            int var3 = class398.field5938[var2];
            class43 var4 = class306.field4496[var3];
            if (var4 != null && var4.field4310 > 0) {
                var4.field4310--;
                if (var4.field4310 == 0) {
                    var4.field4309 = null;
                }
            }
        }
    }
}
