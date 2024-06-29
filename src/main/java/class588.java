import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class588 {

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "[I")
    public static int[] field8511 = new int[50];

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "Lbv;")
    public static class568 field8516 = new class568();

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field8510;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field8512;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field8513;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    public static int field8517;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lui;")
    public class588 field8514;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "Lui;")
    public class588 field8515;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BLqa;)V")
    public static final void method3393(byte arg0, class167 arg1) {
        if (arg0 >= -16) {
            field8511 = null;
        }
        field8512++;
        int var2 = class431.field5868;
        int var3 = class423.field5739;
        int var4 = class641.field9318;
        int var5 = class81.field1095;
        int var6 = -10660793;
        arg1.method974(var6, 1, var5, var2, var4, var3);
        arg1.method974(-16777216, 1, 16, var2 + 1, var4 - 2, var3 + 1);
        arg1.method919(var2 + 1, var5 + -19, var4 - 2, (byte) 0, -16777216, var3 + 18);
        class95.field1282.method1626(-1, class245.field3102.method2157(class245.field3103, 4074), var6, var3 + 14, (byte) -16, var2 + 3);
        int var7 = class343.field4760.method100((byte) -87);
        int var8 = class343.field4760.method92(8);
        int var9 = 0;
        for (class245 var10 = (class245) class57.field760.method3188((byte) -100); var10 != null; var10 = (class245) class57.field760.method3182((byte) -48)) {
            int var11 = (class50.field673 - var9 - 1) * 16 + var3 + 31;
            short var12 = -1;
            if (var2 < var7 && var7 < var2 + var4 && var8 > (var11 - 13) && var11 + 3 > var8 && var10.field3092) {
                var12 = -256;
            }
            int[] var13 = null;
            if (class630.method3645(true, var10.field3094)) {
                var13 = class98.field1307.method3391(0, (int) var10.field3099).field6491;
            } else if (var10.field3100 != -1) {
                var13 = class98.field1307.method3391(0, var10.field3100).field6491;
            } else if (class17.method77(-30195, var10.field3094)) {
                class480 var14 = (class480) class131.field1619.method3476((long) ((int) var10.field3099), (byte) 28);
                if (var14 != null) {
                    class585 var15 = var14.field6729;
                    class626 var16 = var15.field8478;
                    if (var16.field9085 != null) {
                        var16 = var16.method3607(false, class257.field3191);
                    }
                    if (var16 != null) {
                        var13 = var16.field9110;
                    }
                }
            } else if (class318.method1981(15, var10.field3094)) {
                Object var17 = null;
                class137 var18;
                if (var10.field3094 == 1012) {
                    var18 = class626.field9084.method1093(0, (int) var10.field3099);
                } else {
                    var18 = class626.field9084.method1093(0, (int) (var10.field3099 >>> 32 & 0x7FFFFFFFL));
                }
                if (var18.field1719 != null) {
                    var18 = var18.method722(class257.field3191, -1);
                }
                if (var18 != null) {
                    var13 = var18.field1702;
                }
            }
            String var19 = class247.method1515(-89, var10);
            if (var13 != null) {
                var19 = var19 + class66.method384((byte) 97, var13);
            }
            class95.field1282.method1620(var2 + 3, var11, var12, 20730, class134.field1639, var19, 0, class106.field1370);
            var9++;
            if (var10.field3091) {
                class53.field708.method632(class627.field9137.method856(0, var19) + var2 + 5, var11 + -12);
            }
        }
        class466.method2679(class81.field1095, class431.field5868, class641.field9318, false, class423.field5739);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)V")
    public final void method3394(boolean arg0) {
        field8510++;
        if (this.field8515 == null) {
            return;
        }
        if (arg0) {
            this.field8514 = null;
        }
        this.field8515.field8514 = this.field8514;
        this.field8514.field8515 = this.field8515;
        this.field8515 = null;
        this.field8514 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)V")
    public static final void method3395(byte arg0) {
        class82.field1118 = null;
        class523.field7291 = null;
        class364.field5091 = null;
        if (arg0 <= 32) {
            field8511 = null;
        }
        field8518++;
        class624.field9030 = null;
        class526.field7326 = null;
        class375.field5230 = false;
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)V")
    public static void method3396(byte arg0) {
        if (arg0 <= 120) {
            method3395((byte) 94);
        }
        field8511 = null;
        field8516 = null;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    public static final void method3397(int arg0, int arg1) {
        if (arg0 != 28000) {
            return;
        }
        field8513++;
        if (class257.field3193 == arg1) {
            return;
        }
        class139.field1760 = class369.field5135 = class320.field4435[arg1];
        class236.method1489(200);
        class446.field6171 = new int[class139.field1760][class369.field5135];
        class270.field3439 = new int[4][class139.field1760 >> 3][class369.field5135 >> 3];
        class503.field6997 = new int[class139.field1760][class369.field5135];
        for (int var2 = 0; var2 < 4; var2++) {
            class15.field154[var2] = class633.method3663(class369.field5135, false, class139.field1760);
        }
        class625.field9046 = new byte[4][class139.field1760][class369.field5135];
        class364.method2246(4, 2048, class369.field5135, class139.field1760);
        class248.method1519(class139.field1760 >> 3, class369.field5135 >> 3, class301.field3918, -10564);
        class257.field3193 = arg1;
    }
}
