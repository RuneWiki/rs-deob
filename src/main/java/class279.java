import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class279 {

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    private int field4458 = -1;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    private int field4455 = 0;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "Ljl;")
    public static class231 field4449 = new class231(128);

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "Z")
    public static boolean field4462 = false;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "I")
    public static int field4465 = 0;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field4447;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "I")
    public int field4448;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    public static int field4450;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field4451;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field4452;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field4453;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field4454;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    public int field4456;

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "I")
    public static int field4457;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    public int field4461;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public int field4463;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lkl;IB)V")
    public final void method1876(class114 arg0, int arg1, byte arg2) {
        field4447++;
        while (true) {
            int var4 = arg0.method760(false);
            if (var4 == 0) {
                int var5 = -61 % ((arg2 + 1) / 41);
                return;
            }
            this.method1879(arg0, (byte) -98, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Ljava/lang/String;")
    public static final String method1877(int arg0) {
        field4450++;
        String var1 = "www";
        String var2 = "";
        if (~class180.field2579 != arg0) {
            var1 = "www-wtqa";
        }
        if (class39.field585 != null) {
            var2 = "/p=" + class39.field585;
        }
        return "http://" + var1 + ".runescape.com/l=" + class149.field2135 + "/a=" + class76.field1177 + var2 + "/";
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Ljava/lang/String;BLkl;)I")
    public static final int method1878(String arg0, byte arg1, class114 arg2) {
        field4452++;
        int var3 = arg2.field1673;
        int var4 = -65 % ((arg1 - 8) / 36);
        byte[] var5 = class72.method488(-8212, arg0);
        arg2.method792((byte) 116, var5.length);
        arg2.field1673 += class217.field3210.method539(0, arg2.field1673, var5.length, var5, arg2.field1629, 24826);
        return arg2.field1673 - var3;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lkl;BII)V")
    private final void method1879(class114 arg0, byte arg1, int arg2, int arg3) {
        int var5 = 89 / ((arg1 + 2) / 53);
        if (arg3 == 1) {
            this.field4455 = arg0.method779(16711680);
            this.method1882((byte) 69, this.field4455);
        } else if (arg3 == 2) {
            this.field4458 = arg0.method756(-29901);
            if (this.field4458 == 65535) {
                this.field4458 = -1;
            }
        } else if (arg3 == 3) {
            arg0.method756(-29901);
        }
        field4457++;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lde;B)I")
    public static final int method1880(class53 arg0, byte arg1) {
        field4451++;
        int var2 = arg0.field797;
        if (arg1 != 110) {
            return 9;
        }
        class35 var3 = arg0.method73((byte) -44);
        if (arg0.field112 == var3.field531) {
            var2 = arg0.field795;
        } else if (arg0.field112 == var3.field526 || arg0.field112 == var3.field524 || arg0.field112 == var3.field529 || arg0.field112 == var3.field505) {
            var2 = arg0.field776;
        } else if (arg0.field112 == var3.field509 || arg0.field112 == var3.field515 || arg0.field112 == var3.field506 || arg0.field112 == var3.field523) {
            var2 = arg0.field791;
        }
        return var2;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(III)I")
    public static final int method1881(int arg0, int arg1, int arg2) {
        int var3 = -58 % ((arg2 - 32) / 38);
        int var4 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var4 = arg1 * var4;
            }
            arg1 *= arg1;
            arg0 >>= 0x1;
        }
        field4460++;
        if (arg0 == 1) {
            return arg1 * var4;
        } else {
            return var4;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(BI)V")
    private final void method1882(byte arg0, int arg1) {
        field4453++;
        double var3 = (double) ((arg1 & 0xFF0BD6) >> 16) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        if (var3 < var5) {
            var11 = var5;
        }
        if (var11 < var7) {
            var11 = var7;
        }
        if (var3 > var5) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field4461 = (int) (var17 * 256.0D);
        if (this.field4461 < 0) {
            this.field4461 = 0;
        } else if (this.field4461 > 255) {
            this.field4461 = 255;
        }
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var13 = (var11 - var9) / (var9 + var11);
            }
            if (var3 == var11) {
                var15 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var15 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var15 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
            if (var17 >= 0.5D) {
                var13 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        double var19 = var15 / 6.0D;
        this.field4448 = (int) (var13 * 256.0D);
        if (this.field4448 < 0) {
            this.field4448 = 0;
        } else if (this.field4448 > 255) {
            this.field4448 = 255;
        }
        if (arg0 != 69) {
            method1883(true);
        }
        if (var17 > 0.5D) {
            this.field4456 = (int) ((1.0D - var17) * var13 * 512.0D);
        } else {
            this.field4456 = (int) (var13 * var17 * 512.0D);
        }
        if (this.field4456 < 1) {
            this.field4456 = 1;
        }
        this.field4463 = (int) ((double) this.field4456 * var19);
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static void method1883(boolean arg0) {
        field4449 = null;
        if (arg0) {
            field4459 = 38;
        }
    }
}
