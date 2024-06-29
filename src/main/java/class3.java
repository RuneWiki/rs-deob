import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 extends class34 {

    @OriginalMember(owner = "client!ab", name = "wb", descriptor = "[Lla;")
    public static class77[] field43 = new class77[2048];

    @OriginalMember(owner = "client!ab", name = "vb", descriptor = "Z")
    public static boolean field42 = false;

    @OriginalMember(owner = "client!ab", name = "yb", descriptor = "Lqf;")
    private static class117 field45 = class72.method514(120, "Private chat");

    @OriginalMember(owner = "client!ab", name = "Gb", descriptor = "Lqf;")
    private static class117 field53 = class72.method514(121, "Please try using a different world)3");

    @OriginalMember(owner = "client!ab", name = "ub", descriptor = "Lqf;")
    private static class117 field41 = class72.method514(111, "Please enter your password)3");

    @OriginalMember(owner = "client!ab", name = "Eb", descriptor = "Lqf;")
    public static class117 field51 = class72.method514(107, "Wen m-Ochten Sie entfernen?");

    @OriginalMember(owner = "client!ab", name = "Bb", descriptor = "Lqf;")
    public static class117 field48 = field53;

    @OriginalMember(owner = "client!ab", name = "Jb", descriptor = "Lqf;")
    public static class117 field56 = field41;

    @OriginalMember(owner = "client!ab", name = "Db", descriptor = "Lqf;")
    private static class117 field50 = class72.method514(98, "Please wait)3)3)3");

    @OriginalMember(owner = "client!ab", name = "Ab", descriptor = "Lqf;")
    public static class117 field47 = field53;

    @OriginalMember(owner = "client!ab", name = "Hb", descriptor = "[I")
    public static int[] field54 = new int[500];

    @OriginalMember(owner = "client!ab", name = "tb", descriptor = "Lqf;")
    public static class117 field40 = field53;

    @OriginalMember(owner = "client!ab", name = "Fb", descriptor = "Lqf;")
    public static class117 field52 = field53;

    @OriginalMember(owner = "client!ab", name = "nb", descriptor = "Lqf;")
    public static class117 field34 = field53;

    @OriginalMember(owner = "client!ab", name = "zb", descriptor = "Lqf;")
    public static class117 field46 = field50;

    @OriginalMember(owner = "client!ab", name = "rb", descriptor = "Lqf;")
    public static class117 field38 = field53;

    @OriginalMember(owner = "client!ab", name = "Qb", descriptor = "Lqf;")
    private static class117 field63 = class72.method514(103, "Enter name of player to add to list");

    @OriginalMember(owner = "client!ab", name = "xb", descriptor = "Lqf;")
    public static class117 field44 = field45;

    @OriginalMember(owner = "client!ab", name = "Pb", descriptor = "Lqf;")
    public static class117 field62 = field50;

    @OriginalMember(owner = "client!ab", name = "Kb", descriptor = "Lqf;")
    private static class117 field57 = class72.method514(108, "Location");

    @OriginalMember(owner = "client!ab", name = "qb", descriptor = "Lqf;")
    public static class117 field37 = field57;

    @OriginalMember(owner = "client!ab", name = "Mb", descriptor = "Lqf;")
    public static class117 field59 = field63;

    @OriginalMember(owner = "client!ab", name = "ob", descriptor = "I")
    public static int field35;

    @OriginalMember(owner = "client!ab", name = "pb", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!ab", name = "Cb", descriptor = "I")
    public static int field49;

    @OriginalMember(owner = "client!ab", name = "Ib", descriptor = "I")
    public static int field55;

    @OriginalMember(owner = "client!ab", name = "Nb", descriptor = "I")
    public int field60;

    @OriginalMember(owner = "client!ab", name = "Ob", descriptor = "I")
    public int field61;

    @OriginalMember(owner = "client!ab", name = "sb", descriptor = "Ljb;")
    public static class64 field39;

    @OriginalMember(owner = "client!ab", name = "Rb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field64;

    @OriginalMember(owner = "client!ab", name = "Lb", descriptor = "[[B")
    public static byte[][] field58;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIII)V")
    public static final void method6(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 98 / ((arg0 - 71) / 44);
        for (class22 var6 = (class22) class66.field1374.method27(18823); var6 != null; var6 = (class22) class66.field1374.method25((byte) -127)) {
            if (var6.field426 != -1 || var6.field428 != null) {
                int var7 = 0;
                if (arg2 > var6.field403) {
                    var7 += arg2 - var6.field403;
                } else if (arg2 < var6.field412) {
                    var7 += var6.field412 - arg2;
                }
                if (var6.field425 < arg1) {
                    var7 += arg1 - var6.field425;
                } else if (arg1 < var6.field404) {
                    var7 += var6.field404 - arg1;
                }
                if (var7 - 64 > var6.field419 || class27.field527 == 0 || var6.field417 != arg4) {
                    if (var6.field415 != null) {
                        class147.field3592.method279(var6.field415);
                        var6.field415 = null;
                    }
                    if (var6.field405 != null) {
                        class147.field3592.method279(var6.field405);
                        var6.field405 = null;
                    }
                } else {
                    var7 -= 64;
                    if (var7 < 0) {
                        var7 = 0;
                    }
                    int var8 = (var6.field419 - var7) * class27.field527 / var6.field419;
                    if (var6.field415 != null) {
                        var6.field415.method52(var8);
                    } else if (var6.field426 >= 0) {
                        class123 var9 = class123.method981(class31.field666, var6.field426, 0);
                        if (var9 != null) {
                            class39 var10 = var9.method979().method284(class119.field2856);
                            class9 var11 = class9.method50(var10, 100, var8);
                            var11.method42(-1);
                            class147.field3592.method283(var11);
                            var6.field415 = var11;
                        }
                    }
                    if (var6.field405 != null) {
                        var6.field405.method52(var8);
                        if (!var6.field405.method490(85)) {
                            var6.field405 = null;
                        }
                    } else if (var6.field428 != null && (var6.field431 -= arg3) <= 0) {
                        int var12 = (int) ((double) var6.field428.length * Math.random());
                        class123 var13 = class123.method981(class31.field666, var6.field428[var12], 0);
                        if (var13 != null) {
                            class39 var14 = var13.method979().method284(class119.field2856);
                            class9 var15 = class9.method50(var14, 100, var8);
                            var15.method42(0);
                            class147.field3592.method283(var15);
                            var6.field405 = var15;
                            var6.field431 = (int) (Math.random() * (double) (var6.field416 - var6.field433)) + var6.field433;
                        }
                    }
                }
            }
        }
        field36++;
    }

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "(I)Lea;")
    public final class30 method7(int arg0) {
        field55++;
        if (arg0 != -6941) {
            method6(36, 90, 39, 25, -41);
        }
        return class27.method206(this.field60, (byte) 90).method510(arg0 - 2629, this.field61);
    }

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "(I)V")
    public static void method8(int arg0) {
        field47 = null;
        field56 = null;
        field54 = null;
        field63 = null;
        field40 = null;
        field62 = null;
        field64 = null;
        field58 = null;
        field53 = null;
        field34 = null;
        field45 = null;
        field43 = null;
        field46 = null;
        field57 = null;
        field51 = null;
        field52 = null;
        field38 = null;
        field59 = null;
        field37 = null;
        if (arg0 >= -6) {
            method8(10);
        }
        field41 = null;
        field50 = null;
        field39 = null;
        field48 = null;
        field44 = null;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(Z)V")
    public static final void method9(boolean arg0) {
        if (arg0) {
            field44 = null;
        }
        field49++;
        System.out.println("Usage: worldid, [live/office/local], [live/rc/wip], [lowmem/highmem], [free/members], [english/german]");
        System.exit(1);
    }
}
