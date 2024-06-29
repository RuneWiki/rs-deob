import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class402 {

    @OriginalMember(owner = "client!ee", name = "h", descriptor = "I")
    private int field5995 = 0;

    @OriginalMember(owner = "client!ee", name = "g", descriptor = "Z")
    public boolean field5994 = true;

    @OriginalMember(owner = "client!ee", name = "o", descriptor = "I")
    public int field6002 = -1;

    @OriginalMember(owner = "client!ee", name = "j", descriptor = "I")
    public int field5997 = 128;

    @OriginalMember(owner = "client!ee", name = "r", descriptor = "I")
    public static int field6005 = 0;

    @OriginalMember(owner = "client!ee", name = "m", descriptor = "[Lgn;")
    public static class417[] field6000 = new class417[14];

    @OriginalMember(owner = "client!ee", name = "q", descriptor = "I")
    public static int field6004 = 0;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!ee", name = "b", descriptor = "I")
    public static int field5989;

    @OriginalMember(owner = "client!ee", name = "d", descriptor = "I")
    public int field5991;

    @OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
    public static int field5992;

    @OriginalMember(owner = "client!ee", name = "f", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!ee", name = "i", descriptor = "I")
    public static int field5996;

    @OriginalMember(owner = "client!ee", name = "k", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!ee", name = "l", descriptor = "I")
    public int field5999;

    @OriginalMember(owner = "client!ee", name = "n", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!ee", name = "s", descriptor = "I")
    public int field6006;

    @OriginalMember(owner = "client!ee", name = "t", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!ee", name = "u", descriptor = "I")
    public int field6008;

    @OriginalMember(owner = "client!ee", name = "p", descriptor = "Lgl;")
    public static class356 field6003;

    @OriginalMember(owner = "client!ee", name = "c", descriptor = "Lmo;")
    public static class447 field5990;

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB)V", line = 7)
    private final void method2526(int arg0, byte arg1) {
        field6001++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) ((arg0 & 0xFF19) >> 8) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
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
        if (arg1 != -70) {
            field5990 = null;
        }
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
        this.field6006 = (int) (var17 * 256.0D);
        this.field6008 = (int) (var15 * 256.0D);
        double var19 = var13 / 6.0D;
        if (this.field6006 < 0) {
            this.field6006 = 0;
        } else if (this.field6006 > 255) {
            this.field6006 = 255;
        }
        if (var17 > 0.5D) {
            this.field5991 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field5991 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field6008 < 0) {
            this.field6008 = 0;
        } else if (this.field6008 > 255) {
            this.field6008 = 255;
        }
        if (this.field5991 < 1) {
            this.field5991 = 1;
        }
        this.field5999 = (int) ((double) this.field5991 * var19);
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljg;II)V", line = 100)
    public final void method2527(class186 arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field6004 = 127;
        }
        while (true) {
            int var4 = arg0.method1322(false);
            if (var4 == 0) {
                field5989++;
                return;
            }
            this.method2528(arg0, var4, -5, arg2);
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Ljg;III)V", line = 121)
    private final void method2528(class186 arg0, int arg1, int arg2, int arg3) {
        field5996++;
        if (arg2 != -5) {
            field6005 = -117;
        }
        if (arg1 == 1) {
            this.field5995 = arg0.method1275(-1);
            this.method2526(this.field5995, (byte) -70);
        } else if (arg1 == 2) {
            this.field6002 = arg0.method1272((byte) -57);
            if (this.field6002 == 65535) {
                this.field6002 = -1;
                return;
            }
        } else if (arg1 == 3) {
            this.field5997 = arg0.method1272((byte) -109);
            return;
        } else if (arg1 == 4) {
            this.field5994 = false;
            return;
        } else {
            return;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(B)Z", line = 157)
    public static final boolean method2529(byte arg0) {
        if (arg0 >= -119) {
            method2529((byte) 23);
        }
        field6007++;
        return class417.field6178 == 0 ? class285.field4582.method1531((byte) 111) : true;
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(Z)V", line = 171)
    public static void method2530(boolean arg0) {
        field5990 = null;
        field6000 = null;
        field6003 = null;
        if (!arg0) {
            field5993 = -45;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(BIII)I", line = 209)
    public static final int method2531(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field5998++;
        if (var4 == 0) {
            return arg2;
        }
        if (arg0 != 79) {
            field5993 = -97;
        }
        if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!ee", name = "a", descriptor = "(II)V", line = 236)
    public static final void method2532(int arg0, int arg1) {
        field5988++;
        class52 var2 = class47.field584;
        synchronized (class47.field584) {
            class47.field584.method337(arg1, (byte) -117);
        }
        class52 var3 = class68.field849;
        synchronized (class68.field849) {
            class68.field849.method337(arg1, (byte) -111);
        }
        if (arg0 <= 9) {
            field6003 = null;
        }
    }
}
