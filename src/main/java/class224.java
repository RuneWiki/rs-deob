import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class224 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field3552 = 0;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "[Lse;")
    public static class10[] field3555 = new class10[14];

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ljava/lang/String;")
    public static String field3557 = "scroll:";

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field3556 = 0;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3558 = "yellow:";

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field3559 = -1;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field3553;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field3554;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method1483(int arg0) {
        field3557 = null;
        field3555 = null;
        if (arg0 != 29837) {
            field3552 = -56;
        }
        field3558 = null;
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static final void method1484(int arg0) {
        field3554++;
        int var1 = class265.field4264.length;
        for (int var2 = arg0; var2 < var1; var2++) {
            if (class265.field4264[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class239.field3820; var4++) {
                    if (class69.field958[var2] == class138.field2286[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class138.field2286[class239.field3820] = class69.field958[var2];
                    var3 = class239.field3820++;
                }
                class264 var5 = new class264(class265.field4264[var2]);
                int var6 = 0;
                while (var5.field4195 < class265.field4264[var2].length && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1777(arg0 ^ 0xFFFFFF83);
                    int var9 = var8 >> 14;
                    int var10 = var8 & 0x3F;
                    int var11 = var8 >> 7 & 0x3F;
                    int var12 = (class69.field958[var2] >> 8) * 64 + var11 - class296.field4685;
                    int var13 = (class69.field958[var2] & 0xFF) * 64 + var10 - class93.field1321;
                    class265 var14 = class104.method741((byte) -84, var5.method1777(arg0 ^ 0xFFFFFFBC));
                    if (class198.field3193[var7] == null && (var14.field4248 & 0x1) > 0 && class109.field1891 == var9 && var12 >= 0 && var14.field4262 + var12 < 104 && var13 >= 0 && var14.field4262 + var13 < 104) {
                        class198.field3193[var7] = new class275();
                        class275 var15 = class198.field3193[var7];
                        class134.field2250[class251.field4027++] = var7;
                        var15.field656 = class9.field141;
                        var15.method1857(var14, 7324);
                        var15.method389(var15.field4439.field4262, (byte) 98);
                        var15.field691 = var15.field657 = class62.field845[var15.field4439.field4281];
                        var15.field611 = var15.field4439.field4290;
                        var15.field631 = var15.field4439.field4250;
                        if (var15.field611 == 0) {
                            var15.field657 = 0;
                        }
                        var15.method379(var12, (byte) -116, var15.method385((byte) -60), true, var13);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BI)I")
    public static final int method1485(byte arg0, int arg1) {
        if (arg0 != 72) {
            method1485((byte) 114, -21);
        }
        field3553++;
        return arg1 & 0xFF;
    }
}
