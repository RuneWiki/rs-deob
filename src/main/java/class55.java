import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class55 {

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "B")
    private byte field920;

    @OriginalMember(owner = "client!rg", name = "p", descriptor = "I")
    public int field917;

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "I")
    public int field907;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "I")
    public int field925;

    @OriginalMember(owner = "client!rg", name = "i", descriptor = "I")
    public int field910;

    @OriginalMember(owner = "client!rg", name = "k", descriptor = "I")
    public int field912;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "Z")
    public static boolean field908 = false;

    @OriginalMember(owner = "client!rg", name = "l", descriptor = "Z")
    public static boolean field913 = false;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "[Lqi;")
    public static class132[] field918 = new class132[5000];

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "Lhh;")
    public static class163 field921 = class137.method1065("m", 17);

    @OriginalMember(owner = "client!rg", name = "n", descriptor = "I")
    public static int field915 = 0;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field905;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field909;

    @OriginalMember(owner = "client!rg", name = "m", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!rg", name = "o", descriptor = "I")
    public static int field916;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field922;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "Lpa;")
    public static class123 field903;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "[Lrh;")
    public static class242[] field924;

    @OriginalMember(owner = "client!rg", name = "j", descriptor = "[[[B")
    public static byte[][][] field911;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(II)V")
    public static final void method381(int arg0, int arg1) {
        class144 var2 = class259.field4542[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class144 var4 = class259.field4542[var3][arg0][arg1] = class259.field4542[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field2727--;
                for (int var5 = 0; var5 < var4.field2741; var5++) {
                    class132 var6 = var4.field2746[var5];
                    if ((var6.field2568 >> 29 & 0x3L) == 2L && var6.field2555 == arg0 && var6.field2550 == arg1) {
                        var6.field2552--;
                    }
                }
            }
        }
        if (class259.field4542[0][arg0][arg1] == null) {
            class259.field4542[0][arg0][arg1] = new class144(0, arg0, arg1);
        }
        class259.field4542[0][arg0][arg1].field2740 = var2;
        class259.field4542[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B)I")
    public final int method382(byte arg0) {
        field914++;
        int var2 = 16 / ((arg0 + 56) / 62);
        return (this.field920 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V")
    public static void method383(int arg0) {
        field903 = null;
        field911 = null;
        field921 = null;
        field918 = null;
        field924 = null;
        if (arg0 != -15100) {
            field913 = true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(B)I")
    public final int method384(byte arg0) {
        field905++;
        return arg0 == 75 ? this.field920 & 0x7 : 108;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Lwg;")
    public static final class211 method385(int arg0, int arg1, int arg2) {
        class144 var3 = class259.field4542[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class211 var4 = var3.field2736;
            var3.field2736 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(ILpa;)V")
    public static final void method386(int arg0, class123 arg1) {
        if (arg0 == 0) {
            class66.field1125 = arg1;
            field909++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(III)V")
    public static final void method387(int arg0, int arg1, int arg2) {
        field923++;
        int[] var3 = new int[4];
        int var4 = 1;
        int[] var5 = new int[4];
        var3[0] = arg1;
        var5[0] = arg0;
        for (int var6 = 0; var6 < 4; var6++) {
            if (class30.field473[var6] != arg1) {
                var3[var4] = class30.field473[var6];
                var5[var4] = class69.field1300[var6];
                var4++;
            }
        }
        class69.field1300 = var5;
        class30.field473 = var3;
        class192.method1408(-1, class144.field2722.length - 1, class144.field2722, 0);
        if (arg2 != -19652) {
            field913 = true;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(B[I)[I")
    public static final int[] method388(byte arg0, int[] arg1) {
        field916++;
        if (arg1 == null) {
            return null;
        } else {
            int[] var2 = new int[arg1.length];
            class241.method1666(arg1, 0, var2, 0, arg1.length);
            int var3 = 85 / ((arg0 - 55) / 53);
            return var2;
        }
    }

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "(I)V")
    public static final void method389(int arg0) {
        class9 var1 = class191.field3494;
        synchronized (class191.field3494) {
            class247.field4371++;
            class31.field482 = class163.field3016;
            if (class30.field470 >= 0) {
                while (class30.field470 != class12.field179) {
                    int var2 = class58.field951[class12.field179];
                    class12.field179 = class12.field179 + 1 & 0x7F;
                    if (var2 >= 0) {
                        class217.field3942[var2] = true;
                    } else {
                        class217.field3942[~var2] = false;
                    }
                }
            } else {
                for (int var3 = 0; var3 < 112; var3++) {
                    class217.field3942[var3] = false;
                }
                class30.field470 = class12.field179;
            }
            if (arg0 != 381) {
                method388((byte) -25, (int[]) null);
            }
            class163.field3016 = class39.field656;
        }
        field922++;
    }

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(III)V")
    public static final void method390(int arg0, int arg1, int arg2) {
        field906++;
        class128 var3 = class32.field498[class20.field323][arg0][arg2];
        if (var3 == null) {
            class39.method277(class20.field323, arg0, arg2);
            return;
        }
        int var4 = -99999999;
        class120 var5 = null;
        for (class120 var6 = (class120) var3.method1017(69); var6 != null; var6 = (class120) var3.method1016((byte) -31)) {
            class99 var13 = class120.method939(22952, var6.field2255.field1393);
            int var14 = var13.field1908;
            if (var13.field1892 == 1) {
                var14 = (var6.field2255.field1395 + 1) * var14;
            }
            if (var14 > var4) {
                var5 = var6;
                var4 = var14;
            }
        }
        if (var5 == null) {
            class39.method277(class20.field323, arg0, arg2);
            return;
        }
        var3.method1014(false, var5);
        class74 var7 = null;
        class120 var8 = (class120) var3.method1017(109);
        class74 var9 = null;
        while (var8 != null) {
            class74 var12 = var8.field2255;
            if (var5.field2255.field1393 != var12.field1393) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field1393 != var12.field1393 && var9 == null) {
                    var9 = var12;
                }
            }
            var8 = (class120) var3.method1016((byte) -31);
        }
        long var10 = (long) ((arg2 << 7) + arg0 + 1610612736);
        if (arg1 != 16952) {
            method391((byte) -115, (class123) null, (class123) null);
        }
        class38.method271(class20.field323, arg0, arg2, class127.method1011(arg2 * 128 + 64, arg0 * 128 - -64, class20.field323, arg1 + 12956), var5.field2255, var10, var7, var9);
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(BLpa;Lpa;)V")
    public static final void method391(byte arg0, class123 arg1, class123 arg2) {
        if (arg0 >= 65) {
            class91.field1672 = arg1;
            field903 = arg2;
            field919++;
        }
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "()V")
    public class55() {
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(Lpg;)V")
    public class55(class81 arg0) {
        this.field920 = arg0.method635(124);
        this.field917 = arg0.method658(-86);
        this.field907 = arg0.method620((byte) -82);
        this.field925 = arg0.method620((byte) -82);
        this.field910 = arg0.method620((byte) -82);
        this.field912 = arg0.method620((byte) -82);
    }
}
