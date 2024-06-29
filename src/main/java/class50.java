import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class50 {

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public int field1070 = -1;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "I")
    public static int field1065 = 0;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "[I")
    public static int[] field1064 = new int[5];

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Loh;")
    public static class263 field1089 = class253.method1681(-126, "leuchten2:");

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Loh;")
    public static class263 field1083 = class253.method1681(-121, ")4a=");

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field1074 = 0;

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "Loh;")
    private static class263 field1085 = class253.method1681(-122, "glow2:");

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "Loh;")
    public static class263 field1082 = field1085;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Loh;")
    public static class263 field1066 = field1085;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public int field1068;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public int field1071;

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "I")
    public int field1072;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "I")
    public int field1076;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public int field1079;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public int field1080;

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "I")
    public int field1081;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public int field1088;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "Z")
    public static boolean field1077;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "[[[S")
    public static short[][][] field1084;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static final void method318(int arg0) {
        field1069++;
        Container var1;
        if (class90.field1774 != null) {
            var1 = class90.field1774;
        } else if (class130.field2381 == null) {
            var1 = class95.field1867.field4557;
        } else {
            var1 = class130.field2381;
        }
        class195.field3527 = var1.getSize().width;
        class225.field3964 = var1.getSize().height;
        if (class130.field2381 == var1) {
            Insets var2 = class130.field2381.getInsets();
            class225.field3964 -= var2.top + var2.bottom;
            class195.field3527 -= var2.right + var2.left;
        }
        if (class220.method1506((byte) -88) < 2) {
            class114.field2138 = (class195.field3527 - 765) / 2;
            class200.field3621 = 0;
            class143.field2616 = 503;
            class138.field2558 = 765;
        } else {
            class114.field2138 = 0;
            class200.field3621 = 0;
            class143.field2616 = class225.field3964;
            class138.field2558 = class195.field3527;
        }
        class202.field3648.setSize(class138.field2558, class143.field2616);
        if (class130.field2381 == var1) {
            Insets var3 = class130.field2381.getInsets();
            class202.field3648.setLocation(var3.left + class114.field2138, class200.field3621 + var3.top);
        } else {
            class202.field3648.setLocation(class114.field2138, class200.field3621);
        }
        if (class186.field3353 != -1) {
            class82.method553(arg0 ^ 0xFFFF7C00, true);
        }
        if (arg0 != 64512) {
            method318(96);
        }
        class174.method1149(true);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I")
    public static final int method319(int arg0, int arg1) {
        field1073++;
        if (arg1 != -1890609558) {
            method319(-86, -100);
        }
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V")
    public static void method320(byte arg0) {
        field1084 = null;
        field1064 = null;
        field1066 = null;
        if (arg0 != -11) {
            method319(-108, -106);
        }
        field1089 = null;
        field1083 = null;
        field1085 = null;
        field1082 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(III)Z")
    public static final boolean method321(int arg0, int arg1, int arg2) {
        field1067++;
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        if (arg2 != 127) {
            method319(23, -27);
        }
        class12 var3 = class117.method763(arg1, (byte) 111);
        return var3.method91(-115, arg0);
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(B)[Loe;")
    public static final class140[] method322(byte arg0) {
        field1086++;
        if (arg0 != 28) {
            method318(-8);
        }
        class140[] var1 = new class140[class31.field781];
        for (int var2 = 0; var2 < class31.field781; var2++) {
            byte[] var3 = class191.field3425[var2];
            int var4 = class198.field3583[var2] * class181.field3289[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class103.field1965[class263.method1777(255, var3[var6])];
            }
            var1[var2] = new class140(class240.field4200, class2.field46, class198.field3584[var2], class46.field1003[var2], class198.field3583[var2], class181.field3289[var2], var5);
        }
        class14.method111(0);
        return var1;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ZIII[Lpc;I)V")
    public static final void method323(boolean arg0, int arg1, int arg2, int arg3, class21[] arg4, int arg5) {
        field1090++;
        if (arg2 != 127) {
            method323(true, -47, -57, 101, (class21[]) null, 83);
        }
        for (int var6 = 0; var6 < arg4.length; var6++) {
            class21 var7 = arg4[var6];
            if (var7 != null && var7.field536 == arg3) {
                class30.method199(var7, false, arg0, arg1, arg5);
                class164.method1076(11426, arg5, arg1, var7);
                if (var7.field530 > (var7.field503 - var7.field479)) {
                    var7.field530 = var7.field503 - var7.field479;
                }
                if (var7.field530 < 0) {
                    var7.field530 = 0;
                }
                if (var7.field520 - var7.field539 < var7.field591) {
                    var7.field591 = var7.field520 - var7.field539;
                }
                if (var7.field591 < 0) {
                    var7.field591 = 0;
                }
                if (var7.field519 == 0) {
                    class225.method1532(arg0, var7, -1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(III)V")
    public static final void method324(int arg0, int arg1, int arg2) {
        field1087++;
        for (int var3 = 0; var3 < class118.field2199; var3++) {
            class225 var5 = class22.method165(4, var3);
            if (var5 != null) {
                int var6 = var5.field3966;
                if (var6 >= 0 && !class270.field4764.method52(var6, 0)) {
                    var6 = -1;
                }
                int var10;
                if (var5.field3977 >= 0) {
                    int var7 = var5.field3977;
                    int var8 = (var7 & 0x7F) + arg1;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg0 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var10 = class270.field4767[class256.method1696(96, 108, var9)];
                } else if (var6 >= 0) {
                    var10 = class270.field4767[class256.method1696(96, 87, class270.field4764.method60(65535, var6))];
                } else if (var5.field3974 == -1) {
                    var10 = -1;
                } else {
                    int var11 = var5.field3974;
                    int var12 = (var11 & 0x7F) + arg1;
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 127) {
                        var12 = 127;
                    }
                    int var13 = (arg0 + var11 & 0xFC00) + (var11 & 0x380) + var12;
                    var10 = class270.field4767[class256.method1696(96, 86, var13)];
                }
                class82.field1638[var3 + 1] = var10;
            }
        }
        int var4 = 65 % ((arg2 + 40) / 45);
    }
}
