import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!waa")
public class class734 {

    @OriginalMember(owner = "client!waa", name = "b", descriptor = "Ljava/lang/String;")
    public String field10761;

    @OriginalMember(owner = "client!waa", name = "g", descriptor = "J")
    public long field10766;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "Ljava/lang/String;")
    public String field10765;

    @OriginalMember(owner = "client!waa", name = "h", descriptor = "I")
    public int field10763;

    @OriginalMember(owner = "client!waa", name = "f", descriptor = "I")
    public int field10767;

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field10769 = new String[] { method5334(method5333("O{\u001aI\f\u0010")), method5334(method5333("O{\u001aIqQt\u0012\u0013s\u0010")), method5334(method5333("C4UI0")), method5334(method5333("Vo\u0017\u000b")), method5334(method5333("O{\u001aI\u000f\u0010")), method5334(method5333("O{\u001aI\u000e\u0010")) };

    @OriginalMember(owner = "client!waa", name = "e", descriptor = "I")
    public static int field10757 = 0;

    @OriginalMember(owner = "client!waa", name = "k", descriptor = "Leh;")
    public static class380 field10762 = new class380();

    @OriginalMember(owner = "client!waa", name = "l", descriptor = "I")
    public static int field10760;

    @OriginalMember(owner = "client!waa", name = "j", descriptor = "I")
    public static int field10768;

    @OriginalMember(owner = "client!waa", name = "d", descriptor = "Lkaa;")
    public static class49 field10764;

    @OriginalMember(owner = "client!waa", name = "c", descriptor = "[I")
    public static int[] field10758;

    @OriginalMember(owner = "client!waa", name = "i", descriptor = "[[[I")
    public static int[][][] field10759;

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(IIIIIII)V", line = 3)
    public static final void method5330(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            class165[] var7 = class262.field4273;
            int var8 = 0;
            if (arg3 != -239315007) {
                method5330(6, 21, -15, -128, 89, 107, 75);
            }
            while (var8 < var7.length) {
                class165 var9 = var7[var8];
                if (var9 != null && var9.field2676 == 2) {
                    class487.method3698(var9.field2675, var9.field2681, var9.field2680 * 2, var9.field2683, arg1, arg4 >> 1, arg5, arg2 >> 1, arg3 + 239249471);
                    if (class208.field3248[0] > -1 && class431.field6776 % 20 < 10) {
                        class107 var10 = class766.field11219[var9.field2679];
                        int var11 = class208.field3248[0] + arg0 - 12;
                        int var12 = arg6 + class208.field3248[1] - 28;
                        var10.method1001(var11, var12);
                        class458.method3552(var12, var10.method26() + var11, var12 + var10.method12(), var11, arg3 + 239314918);
                    }
                }
                var8++;
            }
            field10768++;
        } catch (RuntimeException var14) {
            throw class590.method4333(var14, field10769[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(I)V", line = 43)
    public static void method5331(int arg0) {
        try {
            field10759 = null;
            if (arg0 >= -7) {
                method5331(-32);
            }
            field10758 = null;
            field10764 = null;
            field10762 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field10769[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "a", descriptor = "(Lwq;I)Ldu;", line = 70)
    public static final class375 method5332(class176 arg0, int arg1) {
        try {
            field10760++;
            int var2 = arg0.method1645((byte) -123);
            class662 var3 = class268.method2315(false)[arg0.method1645((byte) -103)];
            class666 var4 = class395.method3197(false)[arg0.method1645((byte) -91)];
            int var5 = arg0.method1657(80);
            int var6 = arg0.method1657(107);
            int var7 = arg0.method1687((byte) -46);
            int var8 = arg0.method1687((byte) -117);
            int var9 = -89 % ((arg1 + 46) / 51);
            int var10 = arg0.method1622(-18712);
            int var11 = arg0.method1622(-18712);
            int var12 = arg0.method1622(-18712);
            boolean var13 = arg0.method1645((byte) -104) == 1;
            return new class375(var2, var3, var4, var5, var6, var7, var8, var10, var11, var12, var13);
        } catch (RuntimeException var15) {
            throw class590.method4333(var15, field10769[4] + (arg0 == null ? field10769[3] : field10769[2]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "<init>", descriptor = "(ILjava/lang/String;ILjava/lang/String;J)V", line = 101)
    public class734(int arg0, String arg1, int arg2, String arg3, long arg4) {
        try {
            this.field10761 = arg1;
            this.field10766 = arg4;
            this.field10765 = arg3;
            this.field10763 = arg0;
            this.field10767 = arg2;
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field10769[1] + arg0 + ',' + (arg1 == null ? field10769[3] : field10769[2]) + ',' + arg2 + ',' + (arg3 == null ? field10769[3] : field10769[2]) + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method5333(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x4D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!waa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method5334(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 56;
                    break;
                case 1:
                    var10005 = 26;
                    break;
                case 2:
                    var10005 = 123;
                    break;
                case 3:
                    var10005 = 103;
                    break;
                default:
                    var10005 = 77;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
