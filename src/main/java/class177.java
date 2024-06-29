import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bka")
public class class177 {

    @OriginalMember(owner = "client!bka", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field2463 = new String[] { method1555(method1554("|W\\\u0018|6")), method1555(method1554("|W\\\u0018~6")), method1555(method1554("kO")), method1555(method1554("JSIWQ>hOWSm\u001crXN}NXSS$\u001c")), method1555(method1554("ZESWPw_\u0007\u0016")), method1555(method1554("Q_^ZHzY\u001du\\r_\u001dbRqW\u0007\u0016")), method1555(method1554(">}^BThY\u0007\u0016")), method1555(method1554(">k\\ZQm\u0006\u001d")), method1555(method1554("Q_^ZHzYOE\u0007>")), method1555(method1554("Q_^ZHzYY\f\u001dYNRCSz\u0006")), method1555(method1554(">lTNXrO\u0007\u0016")), method1555(method1554(">\u007fmE\u0007>")), method1555(method1554("JSIWQ>sMWLkY\u001dySm_OSXp\u0006\u001d")) };

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "Z")
    public static boolean field2460 = false;

    @OriginalMember(owner = "client!bka", name = "c", descriptor = "I")
    public static int field2461;

    @OriginalMember(owner = "client!bka", name = "b", descriptor = "I")
    public static int field2462;

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(III)Z")
    public static final boolean method1551(int arg0, int arg1, int arg2) {
        try {
            field2461++;
            if (arg2 != 262144) {
                method1551(39, -84, 80);
            }
            return class683.method5007((byte) -106, arg1, arg0) | (arg1 & 0x40000) != 0 || class454.method3477(arg1, arg0, -18);
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field2463[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "()V")
    public static final void method1552() {
        byte var0 = 10;
        byte var1 = 30;
        if (class87.field984 == 0 || class210.field3216 == null) {
            return;
        }
        class606.field8877.method543(class501.field7247);
        for (int var2 = 0; var2 < class733.field10653.length; var2++) {
            class606.field8877.method476(class501.field7247[3] - class501.field7247[1], class501.field7247[1], class85.field951[var2] + class733.field10653[var2], -256, (byte) -124);
        }
        for (int var3 = 0; var3 < class655.field9468; var3++) {
            class367 var11 = class247.field3848[var3];
            class606.field8877.method524(var11.field5614[0], var11.field5621[0], var11.field5610[0], class653.field9432);
            class606.field8877.method524(var11.field5614[1], var11.field5621[1], var11.field5610[1], class531.field7798);
            class606.field8877.method524(var11.field5614[2], var11.field5621[2], var11.field5610[2], class61.field642);
            class606.field8877.method524(var11.field5614[3], var11.field5621[3], var11.field5610[3], class64.field656);
            if (class653.field9432[2] != -1 && class531.field7798[2] != -1 && class61.field642[2] != -1 && class64.field656[2] != -1) {
                int var12 = -65536;
                if (var11.field5617 == 4) {
                    var12 = -16776961;
                }
                class606.field8877.method492(class531.field7798[1], class653.field9432[1], 1, class653.field9432[0], class531.field7798[0], var12);
                class606.field8877.method492(class61.field642[1], class531.field7798[1], 1, class531.field7798[0], class61.field642[0], var12);
                class606.field8877.method492(class64.field656[1], class61.field642[1], 1, class61.field642[0], class64.field656[0], var12);
                class606.field8877.method492(class653.field9432[1], class64.field656[1], 1, class64.field656[0], class653.field9432[0], var12);
                class606.field8877.method492(class61.field642[1], class653.field9432[1], 1, class653.field9432[0], class61.field642[0], var12);
            }
        }
        class210.field3216.method596(-16777216, 31, field2463[4] + class272.field4124 + "/" + 5000, var1 + 45, -256, var0);
        class210.field3216.method596(-16777216, 31, field2463[12] + class416.field6133 + "/" + 10000, var1 + 60, -256, var0);
        class210.field3216.method596(-16777216, 31, field2463[3] + class116.field1384 + "/" + 5000, var1 + 75, -256, var0);
        class210.field3216.method596(-16777216, 31, field2463[8] + (class48.field547 + class440.field6489) + field2463[6] + class655.field9468, var1 + 90, -256, var0);
        class210.field3216.method596(-16777216, 31, field2463[9] + class673.field9770 + field2463[7] + class26.field324 + field2463[11] + class519.field7615 + field2463[10] + class73.field850, var1 + 105, -256, var0);
        class210.field3216.method596(-16777216, 31, field2463[5] + class506.field7334 / 1000L + field2463[2], var1 + 120, -256, var0);
        if (class87.field984 != 2 || class21.field249 == null) {
            return;
        }
        for (int var4 = 0; var4 < class21.field249.length; var4++) {
            float var6 = (float) class21.field249[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class21.field249[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class581 var5 = class606.field8877.method520(0, class756.field10986, class21.field249, (byte) 41, class756.field10986, class58.field617);
        var5.method999(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!bka", name = "a", descriptor = "(I)V")
    public static final void method1553(int arg0) {
        try {
            field2462++;
            while (class430.field6332.method158((byte) 72, class476.field6930) >= 15) {
                int var1 = class430.field6332.method156(-10160, 15);
                if (var1 == 32767) {
                    break;
                }
                boolean var2 = false;
                class383 var3 = (class383) class207.field3184.method977((long) var1, 1);
                if (var3 == null) {
                    class612 var4 = new class612();
                    var4.field3780 = var1;
                    var3 = new class383(var4);
                    class207.field3184.method968((byte) -111, (long) var1, var3);
                    var2 = true;
                    class753.field10966[class750.field10912++] = var3;
                }
                class612 var5 = var3.field5799;
                class590.field8680[class6.field60++] = var1;
                var5.field3840 = class190.field2585;
                if (var5.field8947 != null && var5.field8947.method3747(27420)) {
                    class136.method1153((byte) 111, var5);
                }
                var5.method4519(true, class262.field4035.method4250(class430.field6332.method156(arg0 - 10162, 14), arg0));
                int var6 = class430.field6332.method156(arg0 - 10162, 1);
                if (var6 == 1) {
                    class545.field8146[class172.field2402++] = var1;
                }
                int var7 = (class430.field6332.method156(-10160, 3) + 4 & 0x72200007) << 11;
                int var8 = class430.field6332.method156(-10160, 1);
                int var9 = class430.field6332.method156(arg0 - 10162, 2);
                int var10 = class430.field6332.method156(arg0 ^ 0xFFFFD852, 5);
                if (var10 > 15) {
                    var10 -= 32;
                }
                int var11 = class430.field6332.method156(-10160, 5);
                if (var11 > 15) {
                    var11 -= 32;
                }
                var5.method2095((byte) -80, var5.field8947.field7159);
                var5.field3810 = var5.field8947.field7180 << 3;
                if (var2) {
                    var5.method2103(0, var7, true);
                }
                var5.method4527(class225.field3446.field3863[0] + var10, 21824, var8 == 1, class225.field3446.field3859[0] + var11, var5.method2101(31463), var9);
                if (var5.field8947.method3747(arg0 + 27418)) {
                    class483.method3682(var5.field3859[0], 0, var5, 29075, var5.field6200, null, var5.field3863[0], null);
                }
            }
            if (arg0 != 2) {
                field2460 = true;
            }
            class430.field6332.method154(3);
        } catch (RuntimeException var13) {
            throw class759.method5498(var13, field2463[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!bka", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1554(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!bka", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1555(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 30;
                    break;
                case 1:
                    var10005 = 60;
                    break;
                case 2:
                    var10005 = 61;
                    break;
                case 3:
                    var10005 = 54;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
