import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class7 extends class196 {

    @OriginalMember(owner = "client!af", name = "z", descriptor = "I")
    private int field77 = 0;

    @OriginalMember(owner = "client!af", name = "P", descriptor = "I")
    private int field92 = -1;

    @OriginalMember(owner = "client!af", name = "C", descriptor = "Lai;")
    private static class10 field80 = class44.method278("Please enter your password)3", -24);

    @OriginalMember(owner = "client!af", name = "A", descriptor = "I")
    public static int field78 = 1;

    @OriginalMember(owner = "client!af", name = "Q", descriptor = "Lai;")
    public static class10 field93 = field80;

    @OriginalMember(owner = "client!af", name = "B", descriptor = "I")
    public static int field79 = 0;

    @OriginalMember(owner = "client!af", name = "K", descriptor = "I")
    public static int field87 = 1;

    @OriginalMember(owner = "client!af", name = "R", descriptor = "Lai;")
    public static class10 field94 = class44.method278("oder benutzen Sie eine andere Welt)3", 108);

    @OriginalMember(owner = "client!af", name = "J", descriptor = "[I")
    public static int[] field86 = new int[5];

    @OriginalMember(owner = "client!af", name = "D", descriptor = "I")
    public static int field81;

    @OriginalMember(owner = "client!af", name = "E", descriptor = "I")
    public static int field82;

    @OriginalMember(owner = "client!af", name = "G", descriptor = "I")
    public static int field83;

    @OriginalMember(owner = "client!af", name = "H", descriptor = "I")
    public static int field84;

    @OriginalMember(owner = "client!af", name = "I", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!af", name = "L", descriptor = "I")
    public int field88;

    @OriginalMember(owner = "client!af", name = "M", descriptor = "I")
    public int field89;

    @OriginalMember(owner = "client!af", name = "N", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!af", name = "O", descriptor = "I")
    public int field91;

    @OriginalMember(owner = "client!af", name = "S", descriptor = "I")
    public static int field95;

    @OriginalMember(owner = "client!af", name = "T", descriptor = "I")
    public int field96;

    @OriginalMember(owner = "client!af", name = "V", descriptor = "I")
    public static int field97;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(B)V")
    public static final void method21(byte arg0) {
        field82++;
        for (class139 var1 = (class139) class171.field3298.method1223(true); var1 != null; var1 = (class139) class171.field3298.method1226((byte) -57)) {
            if (class42.field687 != var1.field2616 || var1.field2622) {
                var1.method848(false);
            } else if (class120.field2304 >= var1.field2627) {
                var1.method948(class145.field2769, (byte) -104);
                if (var1.field2622) {
                    var1.method848(false);
                } else {
                    class36.field560.method583(var1.field2616, var1.field2624, var1.field2631, var1.field2632, 60, var1, 0, -1, false);
                }
            }
        }
        if (arg0 != -99) {
            method24(true, -4);
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(Z)V")
    public static void method22(boolean arg0) {
        field93 = null;
        field94 = null;
        field80 = null;
        if (arg0) {
            method24(false, -85);
        }
        field86 = null;
    }

    @OriginalMember(owner = "client!af", name = "b", descriptor = "(II)V")
    private final void method23(int arg0, int arg1) {
        field97++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var7 < var3) {
            var9 = var7;
        }
        double var13 = 0.0D;
        if (var3 < var7) {
            var11 = var7;
        }
        if (var5 > var11) {
            var11 = var5;
        }
        double var15 = 0.0D;
        if (var9 > var5) {
            var9 = var5;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var7 - var5) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var5 - var3) / (-var9 + var11) + 2.0D;
            } else if (var5 == var11) {
                var13 = (var3 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        this.field96 = (int) (var15 * 256.0D);
        if (var17 > 0.5D) {
            this.field91 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field91 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field96 < 0) {
            this.field96 = 0;
        } else if (this.field96 > 255) {
            this.field96 = 255;
        }
        if (this.field91 < 1) {
            this.field91 = 1;
        }
        this.field88 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field89 = (int) ((double) this.field91 * var19);
        if (arg1 != -23045) {
            this.field89 = -126;
        }
        if (this.field88 < 0) {
            this.field88 = 0;
        } else if (this.field88 > 255) {
            this.field88 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(ZI)Lai;")
    public static final class10 method24(boolean arg0, int arg1) {
        class10 var2 = new class10();
        if (!arg0) {
            field79 = -22;
        }
        field84++;
        var2.field160 = new byte[arg1];
        var2.field118 = 0;
        return var2;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lme;II)V")
    public final void method25(class114 arg0, int arg1, int arg2) {
        if (arg2 >= -112) {
            method27((byte) 56);
        }
        field85++;
        while (true) {
            int var4 = arg0.method767(true);
            if (var4 == 0) {
                return;
            }
            this.method26(arg0, arg1, -125, var4);
        }
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(Lme;III)V")
    private final void method26(class114 arg0, int arg1, int arg2, int arg3) {
        field90++;
        if (arg2 >= -104) {
            field93 = null;
        }
        if (arg3 == 1) {
            this.field77 = arg0.method771(117);
            this.method23(this.field77, -23045);
        } else if (arg3 == 2) {
            this.field92 = arg0.method762((byte) 108);
            if (this.field92 == 65535) {
                this.field92 = -1;
                return;
            }
        } else if (arg3 == 3) {
            arg0.method762((byte) 120);
            return;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!af", name = "c", descriptor = "(B)V")
    public static final void method27(byte arg0) {
        if (arg0 <= 101) {
            return;
        }
        Object var1 = class149.field2871;
        synchronized (class149.field2871) {
            if (class134.field2507 != 0) {
                class134.field2507 = 1;
                try {
                    class149.field2871.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field95++;
    }
}
