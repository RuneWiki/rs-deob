import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class19 {

    @OriginalMember(owner = "client!ab", name = "R", descriptor = "Z")
    public boolean field36 = true;

    @OriginalMember(owner = "client!ab", name = "M", descriptor = "I")
    public int field31 = 0;

    @OriginalMember(owner = "client!ab", name = "fb", descriptor = "I")
    public int field50 = -1;

    @OriginalMember(owner = "client!ab", name = "U", descriptor = "I")
    public int field39 = -1;

    @OriginalMember(owner = "client!ab", name = "X", descriptor = "Lsd;")
    private static class166 field42 = class135.method935("Loading wordpack )2 ", 0);

    @OriginalMember(owner = "client!ab", name = "bb", descriptor = "Lsd;")
    public static class166 field46 = field42;

    @OriginalMember(owner = "client!ab", name = "gb", descriptor = "Lsd;")
    private static class166 field51 = class135.method935("Please reload this page)3", 0);

    @OriginalMember(owner = "client!ab", name = "W", descriptor = "Lsd;")
    public static class166 field41 = field51;

    @OriginalMember(owner = "client!ab", name = "cb", descriptor = "Lb;")
    public static class11 field47 = new class11(30);

    @OriginalMember(owner = "client!ab", name = "jb", descriptor = "Lsd;")
    public static class166 field54 = class135.method935("welle2:", 0);

    @OriginalMember(owner = "client!ab", name = "kb", descriptor = "Lsd;")
    private static class166 field55 = class135.method935("Free world", 0);

    @OriginalMember(owner = "client!ab", name = "mb", descriptor = "Lsd;")
    public static class166 field57 = field55;

    @OriginalMember(owner = "client!ab", name = "lb", descriptor = "Lsd;")
    public static class166 field56 = class135.method935("::fpson", 0);

    @OriginalMember(owner = "client!ab", name = "L", descriptor = "I")
    public int field30;

    @OriginalMember(owner = "client!ab", name = "N", descriptor = "I")
    public int field32;

    @OriginalMember(owner = "client!ab", name = "Q", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ab", name = "S", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!ab", name = "T", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!ab", name = "V", descriptor = "I")
    public int field40;

    @OriginalMember(owner = "client!ab", name = "Y", descriptor = "I")
    public int field43;

    @OriginalMember(owner = "client!ab", name = "Z", descriptor = "I")
    public int field44;

    @OriginalMember(owner = "client!ab", name = "ab", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ab", name = "db", descriptor = "I")
    public static int field48;

    @OriginalMember(owner = "client!ab", name = "eb", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ab", name = "hb", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ab", name = "P", descriptor = "Lvd;")
    public static class193 field34;

    @OriginalMember(owner = "client!ab", name = "O", descriptor = "Lcb;")
    public static class22 field33;

    @OriginalMember(owner = "client!ab", name = "ib", descriptor = "[Lkf;")
    public static class96[] field53;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "(I)V")
    public static void method17(int arg0) {
        field53 = null;
        field56 = null;
        field55 = null;
        field47 = null;
        field54 = null;
        field42 = null;
        int var1 = 27 % ((-arg0 - 76) / 49);
        field33 = null;
        field57 = null;
        field41 = null;
        field46 = null;
        field51 = null;
        field34 = null;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V")
    private final void method18(int arg0, boolean arg1) {
        field37++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        if (!arg1) {
            this.method20(74, null, -120);
        }
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        double var11 = var3;
        double var13 = 0.0D;
        if (var5 < var3) {
            var11 = var5;
        }
        double var15 = 0.0D;
        if (var5 > var3) {
            var9 = var5;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        if (var7 > var9) {
            var9 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
            if (var3 == var9) {
                var13 = (var5 - var7) / (-var11 + var9);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (var9 - var11) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (-var11 + var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field30 = (int) (var15 * 256.0D);
        this.field38 = (int) (var17 * 256.0D);
        if (this.field30 < 0) {
            this.field30 = 0;
        } else if (this.field30 > 255) {
            this.field30 = 255;
        }
        if (this.field38 < 0) {
            this.field38 = 0;
        } else if (this.field38 > 255) {
            this.field38 = 255;
        }
        this.field44 = (int) (var19 * 256.0D);
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(IZ)Lga;")
    public static final class57 method19(int arg0, boolean arg1) {
        field45++;
        class57 var2 = (class57) class77.field1590.method64((byte) 28, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        if (!arg1) {
            method21(false);
        }
        byte[] var3 = class34.field641.method353(10, arg0, -117);
        class57 var4 = new class57();
        var4.field1161 = arg0;
        if (var3 != null) {
            var4.method495(new class53(var3), 128);
        }
        var4.method491(-37);
        if (var4.field1121 != -1) {
            var4.method482((byte) 124, method19(var4.field1121, true), method19(var4.field1147, arg1));
        }
        if (!class51.field934 && var4.field1118) {
            var4.field1122 = class102.field1997;
            var4.field1131 = null;
            var4.field1145 = 0;
            var4.field1123 = null;
            var4.field1128 = false;
        }
        class77.field1590.method67(var4, 15266, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(ILff;I)V")
    public final void method20(int arg0, class53 arg1, int arg2) {
        field52++;
        if (arg0 != 255) {
            field34 = null;
        }
        while (true) {
            int var4 = arg1.method400(255);
            if (var4 == 0) {
                return;
            }
            this.method23(arg1, arg2, -114, var4);
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Z)V")
    public static final void method21(boolean arg0) {
        class5.field98 = new int[4][105][105];
        class108.field2099 = new int[104];
        class156.field2991 = new int[105][105];
        class25.field452 = new int[104];
        class74.field1538 = new byte[4][105][105];
        class102.field1981 = new byte[4][104][104];
        if (arg0) {
            method21(true);
        }
        class206.field4055 = new int[104];
        class187.field3572 = new byte[4][104][104];
        class150.field2917 = new byte[4][104][104];
        class138.field2685 = new int[104];
        class110.field2123 = new int[104];
        class120.field2351 = 99;
        field49++;
        class190.field3620 = new byte[4][104][104];
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V")
    public final void method22(byte arg0) {
        field35++;
        if (this.field50 != -1) {
            this.method18(this.field50, true);
            this.field43 = this.field38;
            this.field32 = this.field30;
            this.field40 = this.field44;
        }
        this.method18(this.field31, true);
        class143.method982(this.field30, this.field38, (byte) -40, this.field44);
        if (arg0 > -50) {
            field46 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(Lff;III)V")
    private final void method23(class53 arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            this.field31 = arg0.method422((byte) -127);
        } else if (arg3 == 2) {
            this.field39 = arg0.method400(255);
        } else if (arg3 == 3) {
            this.field39 = arg0.method405(2);
            if (this.field39 == 65535) {
                this.field39 = -1;
            }
        } else if (arg3 == 5) {
            this.field36 = false;
        } else if (arg3 == 7) {
            this.field50 = arg0.method422((byte) 94);
        } else if (arg3 != 8 && arg3 == 9) {
            arg0.method405(2);
        }
        field48++;
        int var5 = 52 % ((arg2 + 50) / 63);
    }
}
