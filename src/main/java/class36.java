import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class36 extends class45 {

    @OriginalMember(owner = "client!f", name = "gb", descriptor = "I")
    public int field980 = 5;

    @OriginalMember(owner = "client!f", name = "X", descriptor = "I")
    public int field971 = -1;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "I")
    public int field967 = -1;

    @OriginalMember(owner = "client!f", name = "mb", descriptor = "I")
    public int field986 = 99;

    @OriginalMember(owner = "client!f", name = "Y", descriptor = "I")
    public int field972 = -1;

    @OriginalMember(owner = "client!f", name = "xb", descriptor = "I")
    public int field997 = -1;

    @OriginalMember(owner = "client!f", name = "sb", descriptor = "I")
    public int field992 = -1;

    @OriginalMember(owner = "client!f", name = "vb", descriptor = "I")
    public int field995 = 2;

    @OriginalMember(owner = "client!f", name = "bb", descriptor = "Z")
    public boolean field975 = false;

    @OriginalMember(owner = "client!f", name = "ab", descriptor = "Lkd;")
    private static class73 field974 = class126.method1070((byte) -66, "Enter name of player to delete from list");

    @OriginalMember(owner = "client!f", name = "W", descriptor = "[I")
    public static int[] field970 = new int[1000];

    @OriginalMember(owner = "client!f", name = "zb", descriptor = "Lkd;")
    public static class73 field999 = field974;

    @OriginalMember(owner = "client!f", name = "ub", descriptor = "Lkd;")
    public static class73 field994 = class126.method1070((byte) -66, "overlay_multiway");

    @OriginalMember(owner = "client!f", name = "Bb", descriptor = "Lkd;")
    public static class73 field1001 = class126.method1070((byte) -66, " (X");

    @OriginalMember(owner = "client!f", name = "R", descriptor = "Ljb;")
    public static class64 field965 = new class64(30);

    @OriginalMember(owner = "client!f", name = "Db", descriptor = "Lkd;")
    private static class73 field1003 = class126.method1070((byte) -66, "Create a free account");

    @OriginalMember(owner = "client!f", name = "Eb", descriptor = "Lkd;")
    public static class73 field1004 = field1003;

    @OriginalMember(owner = "client!f", name = "Gb", descriptor = "I")
    public static int field1006 = 0;

    @OriginalMember(owner = "client!f", name = "Ab", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "I")
    public static int field969;

    @OriginalMember(owner = "client!f", name = "Z", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!f", name = "db", descriptor = "I")
    public static int field977;

    @OriginalMember(owner = "client!f", name = "eb", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!f", name = "hb", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!f", name = "jb", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!f", name = "lb", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!f", name = "nb", descriptor = "I")
    public static int field987;

    @OriginalMember(owner = "client!f", name = "ob", descriptor = "I")
    public static int field988;

    @OriginalMember(owner = "client!f", name = "pb", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!f", name = "qb", descriptor = "I")
    public static int field990;

    @OriginalMember(owner = "client!f", name = "tb", descriptor = "I")
    public static int field993;

    @OriginalMember(owner = "client!f", name = "yb", descriptor = "I")
    public static int field998;

    @OriginalMember(owner = "client!f", name = "wb", descriptor = "J")
    public static long field996;

    @OriginalMember(owner = "client!f", name = "Fb", descriptor = "Lq;")
    public static class111 field1005;

    @OriginalMember(owner = "client!f", name = "ib", descriptor = "Lbc;")
    public static class11 field982;

    @OriginalMember(owner = "client!f", name = "Cb", descriptor = "Lud;")
    public static class140 field1002;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "[I")
    public int[] field968;

    @OriginalMember(owner = "client!f", name = "cb", descriptor = "[I")
    public int[] field976;

    @OriginalMember(owner = "client!f", name = "fb", descriptor = "[I")
    public int[] field979;

    @OriginalMember(owner = "client!f", name = "kb", descriptor = "[I")
    private int[] field984;

    @OriginalMember(owner = "client!f", name = "rb", descriptor = "[I")
    private int[] field991;

    @OriginalMember(owner = "client!f", name = "Hb", descriptor = "[[I")
    public static int[][] field1007;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lna;II)Lna;")
    public final class91 method281(class91 arg0, int arg1, int arg2) {
        int var4 = this.field976[arg1];
        field969++;
        class115 var5 = class2.method17(var4 >> 16, arg2);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg0.method764(true);
        } else {
            class91 var7 = arg0.method764(!var5.method982(false, var6));
            var7.method768(var5, var6);
            return var7;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILqc;I)V")
    private final void method282(int arg0, class114 arg1, int arg2) {
        if (~arg2 == arg0) {
            int var4 = arg1.method944((byte) 124);
            this.field968 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field968[var5] = arg1.method944((byte) 109);
            }
            this.field976 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                this.field976[var6] = arg1.method944((byte) 118);
            }
            for (int var7 = 0; var7 < var4; var7++) {
                this.field976[var7] += arg1.method944((byte) 115) << 16;
            }
        } else if (arg2 == 2) {
            this.field992 = arg1.method944((byte) 119);
        } else if (arg2 == 3) {
            int var8 = arg1.method957((byte) 73);
            this.field991 = new int[var8 + 1];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field991[var9] = arg1.method957((byte) 44);
            }
            this.field991[var8] = 9999999;
        } else if (arg2 == 4) {
            this.field975 = true;
        } else if (arg2 == 5) {
            this.field980 = arg1.method957((byte) 124);
        } else if (arg2 == 6) {
            this.field971 = arg1.method944((byte) 112);
        } else if (arg2 == 7) {
            this.field967 = arg1.method944((byte) 110);
        } else if (arg2 == 8) {
            this.field986 = arg1.method957((byte) 113);
        } else if (arg2 == 9) {
            this.field972 = arg1.method957((byte) 21);
        } else if (arg2 == 10) {
            this.field997 = arg1.method957((byte) 12);
        } else if (arg2 == 11) {
            this.field995 = arg1.method957((byte) 60);
        } else if (arg2 == 12) {
            int var12 = arg1.method957((byte) 87);
            this.field984 = new int[var12];
            for (int var13 = 0; var13 < var12; var13++) {
                this.field984[var13] = arg1.method944((byte) 120);
            }
            for (int var14 = 0; var14 < var12; var14++) {
                this.field984[var14] += arg1.method944((byte) 116) << 16;
            }
        } else if (arg2 == 13) {
            int var10 = arg1.method957((byte) 82);
            this.field979 = new int[var10];
            for (int var11 = 0; var11 < var10; var11++) {
                this.field979[var11] = arg1.method933(-64);
            }
        }
        field1000++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILf;ILna;I)Lna;")
    public final class91 method283(int arg0, class36 arg1, int arg2, class91 arg3, int arg4) {
        field983++;
        int var6 = this.field976[arg2];
        class115 var7 = class2.method17(var6 >> 16, 0);
        int var8 = var6 & 0xFFFF;
        if (var7 == null) {
            return arg1.method281(arg3, arg4, 0);
        }
        int var9 = arg1.field976[arg4];
        class115 var10 = class2.method17(var9 >> 16, arg0 ^ arg0);
        int var11 = var9 & 0xFFFF;
        if (var10 == null) {
            class91 var12 = arg3.method764(!var7.method982(false, var8));
            var12.method768(var7, var8);
            return var12;
        } else {
            class91 var13 = arg3.method764(!var7.method982(false, var8) & !var10.method982(false, var11));
            var13.method770(var7, var8, var10, var11, this.field991);
            return var13;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLna;I)Lna;")
    public final class91 method284(byte arg0, class91 arg1, int arg2) {
        field981++;
        int var4 = this.field976[arg2];
        class115 var5 = class2.method17(var4 >> 16, 0);
        int var6 = var4 & 0xFFFF;
        if (var5 == null) {
            return arg1.method763(true);
        }
        if (arg0 >= -23) {
            this.field967 = 49;
        }
        class91 var7 = arg1.method763(!var5.method982(false, var6));
        var7.method768(var5, var6);
        return var7;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIZ)V")
    public static final void method285(int arg0, int arg1, boolean arg2) {
        field977++;
        class61 var3 = class118.field3019[class11.field320][arg0][arg1];
        if (var3 == null) {
            class34.field923.method54(class11.field320, arg0, arg1);
            return;
        }
        class24 var4 = (class24) var3.method514((byte) -79);
        int var5 = -99999999;
        if (!arg2) {
            field1003 = null;
        }
        class24 var6 = null;
        while (var4 != null) {
            class126 var11 = class9.method86(var4.field692, (byte) -24);
            int var12 = var11.field3222;
            if (var11.field3238 == 1) {
                var12 = (var4.field687 + 1) * var12;
            }
            if (var12 > var5) {
                var5 = var12;
                var6 = var4;
            }
            var4 = (class24) var3.method517(-98);
        }
        if (var6 == null) {
            class34.field923.method54(class11.field320, arg0, arg1);
            return;
        }
        var3.method510(-29474, var6);
        class24 var7 = (class24) var3.method514((byte) -79);
        class24 var8 = null;
        class24 var9 = null;
        int var10 = (arg1 << 7) + arg0 + 1610612736;
        while (var7 != null) {
            if (var6.field692 != var7.field692) {
                if (var8 == null) {
                    var8 = var7;
                }
                if (var7.field692 != var8.field692 && var9 == null) {
                    var9 = var7;
                }
            }
            var7 = (class24) var3.method517(-118);
        }
        class34.field923.method52(class11.field320, arg0, arg1, class70.method585(class11.field320, arg0 * 128 + 64, arg1 * 128 - -64, (byte) -99), var6, var10, var8, var9);
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public static void method286(int arg0) {
        field982 = null;
        field1001 = null;
        field999 = null;
        if (arg0 != -1610612736) {
            return;
        }
        field994 = null;
        field1004 = null;
        field1002 = null;
        field970 = null;
        field965 = null;
        field1003 = null;
        field1007 = null;
        field1005 = null;
        field974 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IIILna;)Lna;")
    public final class91 method287(int arg0, int arg1, int arg2, class91 arg3) {
        field985++;
        int var5 = this.field976[arg2];
        class115 var6 = class2.method17(var5 >> 16, 0);
        int var7 = var5 & 0xFFFF;
        if (var6 == null) {
            return arg3.method764(true);
        }
        int var8 = 58 % ((34 - arg1) / 51);
        class91 var9 = arg3.method764(!var6.method982(false, var7));
        int var10 = arg0 & 0x3;
        if (var10 == 1) {
            var9.method769();
        } else if (var10 == 2) {
            var9.method756();
        } else if (var10 == 3) {
            var9.method758();
        }
        var9.method768(var6, var7);
        if (var10 == 1) {
            var9.method758();
        } else if (var10 == 2) {
            var9.method756();
        } else if (var10 == 3) {
            var9.method769();
        }
        return var9;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ZLde;)V")
    public static final void method288(boolean arg0, class27 arg1) {
        field998++;
        for (int var2 = 0; var2 < class119.field3031.length; var2++) {
            class119.field3031[var2] = 0;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < 5000; var4++) {
            int var16 = (int) (Math.random() * 128.0D * (double) var3);
            class119.field3031[var16] = (int) (Math.random() * 256.0D);
        }
        if (!arg0) {
            method292((byte) -77, 48);
        }
        for (int var5 = 0; var5 < 20; var5++) {
            for (int var12 = 1; var12 < var3 - 1; var12++) {
                for (int var14 = 1; var14 < 127; var14++) {
                    int var15 = (var12 << 7) + var14;
                    class70.field1779[var15] = (class119.field3031[var15 - 128] + class119.field3031[var15 - 1] + class119.field3031[var15 + 1] + class119.field3031[var15 - -128]) / 4;
                }
            }
            int[] var13 = class119.field3031;
            class119.field3031 = class70.field1779;
            class70.field1779 = var13;
        }
        if (arg1 == null) {
            return;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < arg1.field774; var7++) {
            for (int var8 = 0; var8 < arg1.field772; var8++) {
                if (arg1.field771[var6++] != 0) {
                    int var9 = var8 + arg1.field775 + 16;
                    int var10 = arg1.field776 + var7 + 16;
                    int var11 = (var10 << 7) + var9;
                    class119.field3031[var11] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "d", descriptor = "(I)V")
    public final void method289(int arg0) {
        if (~this.field997 == arg0) {
            if (this.field991 == null) {
                this.field997 = 0;
            } else {
                this.field997 = 2;
            }
        }
        if (this.field972 == -1) {
            if (this.field991 == null) {
                this.field972 = 0;
            } else {
                this.field972 = 2;
            }
        }
        field966++;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILqc;)V")
    public final void method290(int arg0, class114 arg1) {
        if (arg0 > -111) {
            method291(null, 56);
        }
        field987++;
        while (true) {
            int var3 = arg1.method957((byte) 107);
            if (var3 == 0) {
                return;
            }
            this.method282(-2, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(La;I)Z")
    public static final boolean method291(class1 arg0, int arg1) {
        int var2 = arg0.field84;
        field973++;
        if (var2 >= 1 && var2 <= 200 || !(var2 < 701 || var2 > 900)) {
            class48.field1298++;
            if (var2 >= 801) {
                var2 -= 701;
            } else if (var2 >= 701) {
                var2 -= 601;
            } else if (var2 < 101) {
                var2--;
            } else {
                var2 -= 101;
            }
            class153.field3767++;
            class80.method684(class32.method258(-114, new class73[] { client.field615, class137.field3424[var2] }), false, 21, class16.field498, 0, 0, 0);
            class80.method684(class32.method258(-98, new class73[] { client.field615, class137.field3424[var2] }), false, 29, class47.field1248, 0, 0, 0);
            return true;
        }
        if (arg1 != 701) {
            method288(true, null);
        }
        if (var2 >= 401 && var2 <= 500) {
            class80.method684(class32.method258(-117, new class73[] { client.field615, arg0.field29 }), false, 25, class16.field498, 0, 0, 0);
            class132.field3307++;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BI)Z")
    public static final boolean method292(byte arg0, int arg1) {
        if (arg0 >= -72) {
            method285(65, -106, false);
        }
        field978++;
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lna;IB)Lna;")
    public final class91 method293(class91 arg0, int arg1, byte arg2) {
        field989++;
        int var4 = this.field976[arg1];
        class115 var5 = class2.method17(var4 >> 16, 0);
        int var6 = var4 & 0xFFFF;
        if (arg2 <= 97) {
            this.method283(23, null, -16, null, 31);
        }
        if (var5 == null) {
            return arg0.method764(true);
        }
        class115 var7 = null;
        int var8 = 0;
        if (this.field984 != null && this.field984.length > arg1) {
            int var9 = this.field984[arg1];
            var7 = class2.method17(var9 >> 16, 0);
            var8 = var9 & 0xFFFF;
        }
        if (var7 == null || var8 == 65535) {
            class91 var11 = arg0.method764(!var5.method982(false, var6));
            var11.method768(var5, var6);
            return var11;
        } else {
            class91 var10 = arg0.method764(!var5.method982(false, var6) & !var7.method982(false, var8));
            var10.method768(var5, var6);
            var10.method768(var7, var8);
            return var10;
        }
    }
}
