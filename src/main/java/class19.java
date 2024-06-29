import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class19 {

    @OriginalMember(owner = "client!ak", name = "m", descriptor = "I")
    private int field234 = 0;

    @OriginalMember(owner = "client!ak", name = "q", descriptor = "I")
    private int field238 = -1;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "[I")
    public static int[] field224 = new int[2500];

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "Ljava/lang/String;")
    public static String field226 = "purple:";

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
    public static int field230 = 0;

    @OriginalMember(owner = "client!ak", name = "o", descriptor = "I")
    public static int field236 = 0;

    @OriginalMember(owner = "client!ak", name = "p", descriptor = "Ljava/lang/String;")
    public static String field237 = "Hidden";

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "Z")
    public static boolean field240 = false;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public int field227;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
    public int field228;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ak", name = "n", descriptor = "I")
    public int field235;

    @OriginalMember(owner = "client!ak", name = "r", descriptor = "I")
    public int field239;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IBIII)V")
    public static final void method114(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        class66 var5 = class6.method34(10, true, arg3);
        var5.method408(0);
        if (arg1 == -79) {
            var5.field782 = arg0;
            field223++;
            var5.field786 = arg4;
            var5.field784 = arg2;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lmc;ZLmc;ZI)I")
    public static final int method115(class176 arg0, boolean arg1, class176 arg2, boolean arg3, int arg4) {
        field222++;
        if (arg4 == 1) {
            int var5 = arg2.field266;
            int var6 = arg0.field266;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class188.method1237(arg0.method1142((byte) -25).field199, arg2.method1142((byte) -25).field199, class146.field2156, (byte) -1);
        } else if (arg4 == 3) {
            if (arg2.field2494.equals("-")) {
                if (arg0.field2494.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field2494.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class188.method1237(arg0.field2494, arg2.field2494, class146.field2156, (byte) -1);
            }
        } else if (arg4 == 4) {
            if (arg2.method129((byte) 97)) {
                return arg0.method129((byte) 97) ? 0 : 1;
            } else if (arg0.method129((byte) 97)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg2.method131((byte) -104)) {
                return arg0.method131((byte) -27) ? 0 : 1;
            } else if (arg0.method131((byte) -27)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 != 6) {
            if (!arg1) {
                method118((byte) -70);
            }
            if (arg4 != 7) {
                return arg2.field2503 - arg0.field2503;
            } else if (arg2.method130(-1)) {
                return arg0.method130(-1) ? 0 : 1;
            } else if (arg0.method130(-1)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg2.method138(100)) {
            return arg0.method138(104) ? 0 : 1;
        } else if (arg0.method138(99)) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lqi;II)V")
    public final void method116(class216 arg0, int arg1, int arg2) {
        field233++;
        while (true) {
            int var4 = arg0.method1407(118);
            if (var4 == 0) {
                if (arg1 == 28777) {
                    return;
                } else {
                    field231 = -62;
                    return;
                }
            }
            this.method119(arg2, true, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)V")
    private final void method117(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        field225++;
        double var5 = (double) ((arg1 & 0xFFDB) >> 8) / 256.0D;
        double var7 = var3;
        if (var5 < var3) {
            var7 = var5;
        }
        double var9 = (double) (arg1 & 0xFF) / 256.0D;
        double var11 = var3;
        double var13 = 0.0D;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var9 > var11) {
            var11 = var9;
        }
        if (var7 > var9) {
            var7 = var9;
        }
        double var15 = 0.0D;
        double var17 = (var7 + var11) / 2.0D;
        this.field228 = (int) (var17 * 256.0D);
        if (this.field228 < 0) {
            this.field228 = 0;
        } else if (this.field228 > 255) {
            this.field228 = 255;
        }
        if (var7 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var7) / (var7 + var11);
            }
            if (var3 == var11) {
                var13 = (var5 - var9) / (var11 - var7);
            } else if (var5 == var11) {
                var13 = (var9 - var3) / (var11 - var7) + 2.0D;
            } else if (var9 == var11) {
                var13 = (var3 - var5) / (var11 - var7) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var7) / (2.0D - var11 - var7);
            }
        }
        this.field239 = (int) (var15 * 256.0D);
        if ((var17 > 0.5D)) {
            this.field227 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field227 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field227 < 1) {
            this.field227 = 1;
        }
        double var19 = var13 / 6.0D;
        if (arg0 != 4) {
            return;
        }
        this.field235 = (int) ((double) this.field227 * var19);
        if (this.field239 < 0) {
            this.field239 = 0;
        } else if (this.field239 > 255) {
            this.field239 = 255;
            return;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public static void method118(byte arg0) {
        field237 = null;
        if (arg0 <= 5) {
            method115((class176) null, true, (class176) null, true, -48);
        }
        field224 = null;
        field226 = null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IZLqi;I)V")
    private final void method119(int arg0, boolean arg1, class216 arg2, int arg3) {
        if (!arg1) {
            return;
        }
        if (arg3 == 1) {
            this.field234 = arg2.method1382(-41);
            this.method117(4, this.field234);
        } else if (arg3 == 2) {
            this.field238 = arg2.method1380(arg1);
            if (this.field238 == 65535) {
                this.field238 = -1;
            }
        } else if (arg3 == 3) {
            arg2.method1380(arg1);
        }
        field232++;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V")
    public static final void method120(int arg0) {
        field229++;
        for (class159 var1 = (class159) class130.field1883.method1532(-113); var1 != null; var1 = (class159) class130.field1883.method1523(-92)) {
            class37 var2 = var1.field2305;
            if (class199.field2833 != var2.field441 || var2.field436) {
                var1.method1935(125);
            } else if (class198.field2819 >= var2.field438) {
                var2.method233(class123.field1771, -5227);
                if (var2.field436) {
                    var1.method1935(110);
                } else {
                    class274.method1763(var2.field441, var2.field425, var2.field430, var2.field448, 60, var2, 0, -1L, false);
                }
            }
        }
        if (arg0 != -7895) {
            field226 = null;
        }
    }
}
