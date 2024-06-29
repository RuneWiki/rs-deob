import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class143 extends Canvas {

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "Ljava/awt/Component;")
    private Component field2938;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "[I")
    public static int[] field2940 = new int[2000];

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "Lrf;")
    public static class163 field2939 = class53.method392(91, "Der Anmelde)2Server ist offline)3");

    @OriginalMember(owner = "client!pd", name = "k", descriptor = "I")
    public static int field2946 = 0;

    @OriginalMember(owner = "client!pd", name = "p", descriptor = "Lrf;")
    public static class163 field2951 = class53.method392(42, "runes");

    @OriginalMember(owner = "client!pd", name = "r", descriptor = "I")
    public static int field2953 = 50;

    @OriginalMember(owner = "client!pd", name = "t", descriptor = "Z")
    public static boolean field2955 = false;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field2937;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!pd", name = "m", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!pd", name = "n", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!pd", name = "o", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!pd", name = "q", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!pd", name = "s", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!pd", name = "l", descriptor = "Lea;")
    public static class42 field2947;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "Ljf;")
    public static class92 field2945;

    @OriginalMember(owner = "client!pd", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field2950++;
        this.field2938.update(arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(B)V")
    public static final void method927(byte arg0) {
        field2952++;
        if (arg0 < 5) {
            return;
        }
        for (class77 var1 = (class77) class79.field1602.method46(126); var1 != null; var1 = (class77) class79.field1602.method53(7759444)) {
            if (class60.field1227 != var1.field1580 || var1.field1596) {
                var1.method630(49);
            } else if (class51.field1023 >= var1.field1581) {
                var1.method533(class79.field1607, 100);
                if (var1.field1596) {
                    var1.method630(114);
                } else {
                    class144.method936(var1.field1580, var1.field1592, var1.field1597, var1.field1583, 60, var1, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I[Loa;BII[BI)V")
    public static final void method928(int arg0, class131[] arg1, byte arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        if (arg2 != -54) {
            method934(null, 95);
        }
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg4 + var12 > 0 && arg4 + var12 < 103 && arg6 + var13 > 0 && arg6 + var13 < 103) {
                        arg1[var7].field2736[arg4 + var12][arg6 + var13] = class133.method887(arg1[var7].field2736[arg4 + var12][arg6 + var13], -16777217);
                    }
                }
            }
        }
        field2941++;
        class52 var8 = new class52(arg5);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class184.method1247(var9, arg2 ^ 0xFFFFFFD2, arg4 + var10, arg3, arg0, var8, var11 + arg6, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2938.paint(arg0);
        field2937++;
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class143(Component arg0) {
        this.field2938 = arg0;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Z")
    public static final boolean method929(int arg0, int arg1, int arg2) {
        field2942++;
        if (arg2 != 0) {
            field2947 = null;
        }
        if (arg0 == 11) {
            arg0 = 10;
        }
        class61 var3 = class199.method1314((byte) 127, arg1);
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method440((byte) -44, arg0);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLgd;)V")
    public static final void method930(byte arg0, class64 arg1) {
        field2943++;
        long var2 = 0L;
        int var4 = -1;
        if (arg1.field1344 == 0) {
            var2 = class6.method58(arg1.field1355, arg1.field1356, arg1.field1341);
        }
        int var5 = 0;
        if (arg1.field1344 == 1) {
            var2 = class74.method524(arg1.field1355, arg1.field1356, arg1.field1341);
        }
        if (arg1.field1344 == 2) {
            var2 = class9.method74(arg1.field1355, arg1.field1356, arg1.field1341);
        }
        int var6 = 0;
        if (arg1.field1344 == 3) {
            var2 = class48.method294(arg1.field1355, arg1.field1356, arg1.field1341);
        }
        if (var2 != 0L) {
            var5 = (int) var2 >> 14 & 0x1F;
            var4 = Integer.MAX_VALUE & (int) (var2 >>> 32);
            var6 = (int) var2 >> 20 & 0x3;
        }
        int var7 = -1 % ((arg0 - 58) / 58);
        arg1.field1349 = var4;
        arg1.field1339 = var6;
        arg1.field1363 = var5;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(B)V")
    public static void method931(byte arg0) {
        if (arg0 != -108) {
            method933(-119, -20, 123, null, 88);
        }
        field2951 = null;
        field2947 = null;
        field2945 = null;
        field2940 = null;
        field2939 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method932(int arg0, int arg1, int arg2, long arg3) {
        field2949++;
        int var5 = (int) arg3 >> 14 & 0x1F;
        int var6 = (int) arg3 >> 20 & 0x3;
        if (arg1 != 4) {
            method931((byte) -94);
        }
        int var7 = Integer.MAX_VALUE & (int) (arg3 >>> 32);
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class61 var8 = class199.method1314((byte) 126, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field1257;
                var10 = var8.field1250;
            } else {
                var9 = var8.field1250;
                var10 = var8.field1257;
            }
            int var11 = var8.field1281;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class15.method103(class56.field1136.field692[0], arg0, var11, 2, 110, 0, var9, class56.field1136.field718[0], arg2, 0, var10, true);
        } else {
            class15.method103(class56.field1136.field692[0], arg0, 0, 2, -69, var5 + 1, 0, class56.field1136.field718[0], arg2, var6, 0, true);
        }
        class115.field2442 = class193.field3796;
        class136.field2805 = class16.field283;
        class107.field2218 = 0;
        class124.field2591 = 2;
        return true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILig;I)V")
    public static final void method933(int arg0, int arg1, int arg2, class84 arg3, int arg4) {
        field2954++;
        if (arg1 != 256) {
            method932(-28, 2, -103, -15L);
        }
        if (class19.field321 >= 3) {
            class173.method1170(arg4, arg0, 0, arg3.field1756, arg3.field1795);
        } else {
            class44.field890.method1122(arg4, arg0, arg3.field1746, arg3.field1815, class44.field890.field3364 / 2, class44.field890.field3365 / 2, class77.field1593, 256, arg3.field1756, arg3.field1795);
        }
        class27.field498[arg2] = true;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method934(Component arg0, int arg1) {
        arg0.removeKeyListener(class175.field3528);
        field2944++;
        arg0.removeFocusListener(class175.field3528);
        class3.field31 = -1;
        if (arg1 != -12127) {
            field2940 = null;
        }
    }
}
