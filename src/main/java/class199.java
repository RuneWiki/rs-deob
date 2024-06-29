import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class199 {

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "Z")
    public boolean field3014 = true;

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "I")
    public int field3020 = -1;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "I")
    private int field3013 = 0;

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "I")
    public int field3019 = 128;

    @OriginalMember(owner = "client!ig", name = "o", descriptor = "I")
    public static int field3024 = 0;

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "I")
    public static int field3011 = 0;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "I")
    public static int field3010;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "I")
    public static int field3012;

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public int field3015;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "I")
    public static int field3016;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public int field3017;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "I")
    public int field3022;

    @OriginalMember(owner = "client!ig", name = "n", descriptor = "I")
    public static int field3023;

    @OriginalMember(owner = "client!ig", name = "p", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!ig", name = "q", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!ig", name = "r", descriptor = "I")
    public static int field3027;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 8)
    public static final void method1381(int arg0) {
        class160.method1160();
        field3025++;
        for (int var1 = 0; var1 < 4; var1++) {
            class247.field3914[var1].method1851(arg0 + 37062);
        }
        if (arg0 != -21212) {
            field3024 = 68;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILlf;II)V", line = 28)
    private final void method1382(int arg0, class143 arg1, int arg2, int arg3) {
        field3018++;
        if (arg0 != -5) {
            return;
        }
        if (arg3 == 1) {
            this.field3013 = arg1.method1017((byte) 101);
            this.method1383(arg0 + 1415183605, this.field3013);
        } else if (arg3 == 2) {
            this.field3020 = arg1.method1051(1);
            if (this.field3020 == 65535) {
                this.field3020 = -1;
            }
        } else if (arg3 == 3) {
            this.field3019 = arg1.method1051(arg0 + 6);
        } else if (arg3 == 4) {
            this.field3014 = false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(II)V", line = 69)
    private final void method1383(int arg0, int arg1) {
        field3016++;
        if (arg0 != 1415183600) {
            field3024 = 80;
        }
        double var3 = (double) ((arg1 & 0xFF37EB) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var9 > var7) {
            var9 = var7;
        }
        double var11 = var3;
        double var13 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field3015 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field3015 = (int) (var15 * var17 * 512.0D);
        }
        this.field3021 = (int) (var15 * 256.0D);
        if (this.field3021 < 0) {
            this.field3021 = 0;
        } else if (this.field3021 > 255) {
            this.field3021 = 255;
        }
        if (this.field3015 < 1) {
            this.field3015 = 1;
        }
        this.field3022 = (int) (var17 * 256.0D);
        double var19 = var13 / 6.0D;
        this.field3017 = (int) ((double) this.field3015 * var19);
        if (this.field3022 < 0) {
            this.field3022 = 0;
        } else if (this.field3022 > 255) {
            this.field3022 = 255;
        }
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V", line = 162)
    public static final void method1384(int arg0) {
        field3023++;
        class112.field1558.method383((byte) -48);
        if (arg0 != 1) {
            method1384(64);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 173)
    public static final boolean method1385(String arg0, int arg1) {
        field3027++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class274.field4339; var2++) {
            if (arg0.equalsIgnoreCase(class172.field2615[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "(I)V", line = 200)
    public static final void method1386(int arg0) {
        field3026++;
        class238.field3655.method378(0);
        if (arg0 != -1) {
            method1386(23);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILlf;I)V", line = 225)
    public final void method1387(int arg0, class143 arg1, int arg2) {
        field3010++;
        if (arg2 != 0) {
            this.field3020 = -4;
        }
        while (true) {
            int var4 = arg1.method1043(true);
            if (var4 == 0) {
                return;
            }
            this.method1382(arg2 - 5, arg1, arg0, var4);
        }
    }
}
