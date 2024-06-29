import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class83 extends class119 {

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Z")
    public boolean field2015 = true;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public int field2017 = -1;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public int field2019 = 0;

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public int field2026 = -1;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "[Z")
    public static boolean[] field2013 = new boolean[100];

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field2014 = 0;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "I")
    public int field2008;

    @OriginalMember(owner = "client!m", name = "G", descriptor = "I")
    public int field2009;

    @OriginalMember(owner = "client!m", name = "H", descriptor = "I")
    public int field2010;

    @OriginalMember(owner = "client!m", name = "I", descriptor = "I")
    public static int field2011;

    @OriginalMember(owner = "client!m", name = "J", descriptor = "I")
    public int field2012;

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public int field2016;

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IBILne;)V")
    private final void method626(int arg0, byte arg1, int arg2, class95 arg3) {
        field2024++;
        if (arg0 == 1) {
            this.field2019 = arg3.method763(true);
        } else if (arg0 == 2) {
            this.field2017 = arg3.method790((byte) 73);
        } else if (arg0 == 5) {
            this.field2015 = false;
        } else if (arg0 == 7) {
            this.field2026 = arg3.method763(true);
        }
        if (arg1 != -109) {
            this.field2026 = -87;
        }
    }

    @OriginalMember(owner = "client!m", name = "e", descriptor = "(I)V")
    public static void method627(int arg0) {
        field2013 = null;
        if (arg0 >= -87) {
            method630(109);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ZI)Z")
    public static final boolean method628(boolean arg0, int arg1) {
        if (arg0) {
            field2014 = -18;
        }
        field2011++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(B)V")
    public final void method629(byte arg0) {
        if (this.field2026 != -1) {
            this.method632(this.field2026, 2);
            this.field2016 = this.field2009;
            this.field2010 = this.field2012;
            this.field2020 = this.field2008;
        }
        this.method632(this.field2019, 2);
        if (arg0 > -76) {
            this.field2019 = 68;
        }
        field2021++;
    }

    @OriginalMember(owner = "client!m", name = "f", descriptor = "(I)V")
    public static final void method630(int arg0) {
        int var1 = -32 / ((arg0 - 9) / 47);
        class34.field732.method1050(true);
        field2022++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILne;I)V")
    public final void method631(int arg0, class95 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method790((byte) 73);
            if (var4 == 0) {
                if (arg2 <= 64) {
                    this.method631(-128, null, 28);
                }
                field2018++;
                return;
            }
            this.method626(var4, (byte) -109, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
    private final void method632(int arg0, int arg1) {
        double var3 = (double) (arg0 & 0xFF) / 256.0D;
        field2025++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var9 = var7;
        double var11 = var7;
        if (var7 < var5) {
            var9 = var5;
        }
        if (var9 < var3) {
            var9 = var3;
        }
        double var13 = 0.0D;
        if (arg1 != 2) {
            return;
        }
        if (var5 < var7) {
            var11 = var5;
        }
        double var15 = 0.0D;
        if (var3 < var11) {
            var11 = var3;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var7 == var9) {
                var13 = (var5 - var3) / (-var11 + var9);
            } else if (var5 == var9) {
                var13 = (var3 - var7) / (-var11 + var9) + 2.0D;
            } else if (var3 == var9) {
                var13 = (var7 - var5) / (-var11 + var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (-var9 + 2.0D + -var11);
            }
        }
        double var19 = var13 / 6.0D;
        this.field2009 = (int) (var17 * 256.0D);
        this.field2008 = (int) (var19 * 256.0D);
        this.field2012 = (int) (var15 * 256.0D);
        if (this.field2012 < 0) {
            this.field2012 = 0;
        } else if (this.field2012 > 255) {
            this.field2012 = 255;
        }
        if (this.field2009 < 0) {
            this.field2009 = 0;
        } else if (this.field2009 > 255) {
            this.field2009 = 255;
            return;
        }
    }
}
