import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class479 {

    @OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
    public int field6923 = 128;

    @OriginalMember(owner = "client!wm", name = "j", descriptor = "I")
    private int field6927 = 0;

    @OriginalMember(owner = "client!wm", name = "l", descriptor = "Z")
    public boolean field6929 = true;

    @OriginalMember(owner = "client!wm", name = "k", descriptor = "I")
    public int field6928 = -1;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "I")
    public static int field6918;

    @OriginalMember(owner = "client!wm", name = "b", descriptor = "I")
    public int field6919;

    @OriginalMember(owner = "client!wm", name = "c", descriptor = "I")
    public int field6920;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "I")
    public int field6921;

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "I")
    public static int field6922;

    @OriginalMember(owner = "client!wm", name = "g", descriptor = "I")
    public static int field6924;

    @OriginalMember(owner = "client!wm", name = "h", descriptor = "I")
    public static int field6925;

    @OriginalMember(owner = "client!wm", name = "i", descriptor = "I")
    public static int field6926;

    @OriginalMember(owner = "client!wm", name = "m", descriptor = "I")
    public int field6930;

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(JZ)V")
    public static final void method2837(long arg0, boolean arg1) {
        field6922++;
        int var3 = class40.field593 + class81.field1158.field6284;
        int var4 = class373.field5358 + class81.field1158.field6287;
        if ((class70.field1012 - var3) < -500 || (class70.field1012 - var3) > 500 || class193.field2815 - var4 < -500 || (class193.field2815 - var4) > 500) {
            class70.field1012 = var3;
            class193.field2815 = var4;
        }
        if (class70.field1012 != var3) {
            int var5 = var3 - class70.field1012;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 > 0) {
                if (var6 == 0) {
                    var6 = 1;
                } else if (var6 > var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = -1;
            } else if (var6 < var5) {
                var6 = var5;
            }
            class70.field1012 += var6;
        }
        if (!arg1) {
            method2837(-65L, true);
        }
        if (!class76.field1075.field3649) {
            class496.field7236 += (float) arg0 * class514.field7533 / 6.0F;
            class191.field2797 += (float) arg0 * class526.field7686 / 6.0F;
        }
        if (class193.field2815 != var4) {
            int var7 = var4 - class193.field2815;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class193.field2815 += var8;
        }
        class259.method1538((byte) -84);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(ILsv;I)V")
    private final void method2838(int arg0, class319 arg1, int arg2) {
        if (arg2 != -27396) {
            this.field6930 = -9;
        }
        field6925++;
        if (arg0 == 1) {
            this.field6927 = arg1.method1852(arg2 + 1086307884);
            this.method2839((byte) -80, this.field6927);
        } else if (arg0 == 2) {
            this.field6928 = arg1.method1844(-115);
            if (this.field6928 == 65535) {
                this.field6928 = -1;
                return;
            }
        } else if (arg0 == 3) {
            this.field6923 = arg1.method1844(-123) << 0;
            return;
        } else if (arg0 == 4) {
            this.field6929 = false;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BI)V")
    private final void method2839(byte arg0, int arg1) {
        field6926++;
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg1 & 0xFF5A) >> 8) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
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
        if (arg0 >= -59) {
            return;
        }
        this.field6921 = (int) (var15 * 256.0D);
        this.field6919 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        if ((var17 > 0.5D)) {
            this.field6920 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field6920 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field6919 < 0) {
            this.field6919 = 0;
        } else if (this.field6919 > 255) {
            this.field6919 = 255;
        }
        if (this.field6921 < 0) {
            this.field6921 = 0;
        } else if (this.field6921 > 255) {
            this.field6921 = 255;
        }
        if (this.field6920 < 1) {
            this.field6920 = 1;
        }
        this.field6930 = (int) ((double) this.field6920 * var19);
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(BLsv;)V")
    public final void method2840(byte arg0, class319 arg1) {
        if (arg0 != 48) {
            this.field6919 = 58;
        }
        field6924++;
        while (true) {
            int var3 = arg1.method1869(-116);
            if (var3 == 0) {
                return;
            }
            this.method2838(var3, arg1, -27396);
        }
    }
}
