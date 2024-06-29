import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class98 extends class312 {

    @OriginalMember(owner = "client!oe", name = "E", descriptor = "I")
    public static int field1527 = 0;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public int field1519;

    @OriginalMember(owner = "client!oe", name = "y", descriptor = "I")
    public static int field1521;

    @OriginalMember(owner = "client!oe", name = "z", descriptor = "I")
    public int field1522;

    @OriginalMember(owner = "client!oe", name = "C", descriptor = "I")
    public int field1525;

    @OriginalMember(owner = "client!oe", name = "G", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!oe", name = "H", descriptor = "I")
    public int field1530;

    @OriginalMember(owner = "client!oe", name = "I", descriptor = "Lqk;")
    public static class264 field1531;

    @OriginalMember(owner = "client!oe", name = "D", descriptor = "Ljava/lang/String;")
    public String field1526;

    @OriginalMember(owner = "client!oe", name = "A", descriptor = "[I")
    public int[] field1523;

    @OriginalMember(owner = "client!oe", name = "F", descriptor = "[I")
    public int[] field1528;

    @OriginalMember(owner = "client!oe", name = "B", descriptor = "[Ljf;")
    public class227[] field1524;

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[Ljava/lang/String;")
    public String[] field1520;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)V", line = 8)
    public static void method676(int arg0) {
        field1531 = null;
        if (arg0 != 128) {
            field1531 = (class264) null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)V", line = 27)
    public static final void method677(byte arg0) {
        if (arg0 != -48) {
            field1531 = (class264) null;
        }
        for (int var1 = 0; var1 < class271.field4162; var1++) {
            int var10002 = class44.field631[var1]--;
            if (class44.field631[var1] >= -10) {
                class300 var3 = class222.field3536[var1];
                if (var3 == null) {
                    var3 = class300.method1973(class311.field4935, class207.field3223[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class44.field631[var1] += var3.method1976();
                    class222.field3536[var1] = var3;
                }
                if (class44.field631[var1] < 0) {
                    int var4;
                    if (class29.field359[var1] == 0) {
                        var4 = class315.field4966[var1] * class34.field441 >> 8;
                    } else {
                        int var5 = (class29.field359[var1] & 0xFF) * 128;
                        int var6 = (class29.field359[var1] & 0xFFD140) >> 16;
                        int var7 = var6 * 128 + 64 - class79.field1173.field537;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class29.field359[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class79.field1173.field519;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var7 + var9 - 128;
                        if (var5 < var10) {
                            class44.field631[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class274.field4219 * class315.field4966[var1] / var5 >> 8;
                    }
                    if (var4 > 0) {
                        class73 var11 = var3.method1974().method520(class203.field3068);
                        class331 var12 = class331.method2265(var11, 100, var4);
                        var12.method2262(class228.field3652[var1] - 1);
                        class74.field1102.method214(var12);
                    }
                    class44.field631[var1] = -100;
                }
            } else {
                class271.field4162--;
                for (int var2 = var1; var2 < class271.field4162; var2++) {
                    class207.field3223[var2] = class207.field3223[var2 + 1];
                    class222.field3536[var2] = class222.field3536[var2 + 1];
                    class228.field3652[var2] = class228.field3652[var2 + 1];
                    class44.field631[var2] = class44.field631[var2 + 1];
                    class29.field359[var2] = class29.field359[var2 + 1];
                    class315.field4966[var2] = class315.field4966[var2 + 1];
                }
                var1--;
            }
        }
        if (class58.field826 && !class91.method627(258)) {
            if (class334.field5199 != 0 && class146.field2306 != -1) {
                class101.method686(0, false, class146.field2306, class211.field3353, class334.field5199, 0);
            }
            class58.field826 = false;
        } else if (class334.field5199 != 0 && class146.field2306 != -1 && !class91.method627(arg0 ^ 0xFFFFFED2)) {
            class265.field4095.method2064(255, 122);
            class265.field4095.method2013(class146.field2306, -117);
            class146.field2306 = -1;
            class198.field2979++;
        }
        field1521++;
    }
}
