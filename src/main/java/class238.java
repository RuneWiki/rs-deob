import java.awt.event.KeyEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class238 {

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lsb;")
    public static class98 field4103 = class47.method368("(Udns", 0);

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "[I")
    public static int[] field4099 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lsb;")
    private static class98 field4104 = class47.method368("Your ignore list is full)3 Max of 100 users)3", 0);

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "Lsb;")
    public static class98 field4105 = field4104;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "[[B")
    public static byte[][] field4106;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "[[I")
    public static int[][] field4101;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method1626(int arg0) {
        field4104 = null;
        int var1 = 44 / ((arg0 - 48) / 40);
        field4106 = null;
        field4105 = null;
        field4099 = null;
        field4103 = null;
        field4101 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)V")
    public static final void method1627(int arg0, boolean arg1) {
        if (arg0 > -77) {
            return;
        }
        for (int var2 = 0; var2 < class222.field3837; var2++) {
            class108 var3 = class180.field3109[class87.field1546[var2]];
            long var4 = (long) class87.field1546[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method823(true) && arg1 == var3.field1928.field2182 && var3.field1928.method899(-1)) {
                int var6 = var3.field4492 >> 7;
                int var7 = var3.field4466 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field4486 == 1 && (var3.field4492 & 0x7F) == 64 && (var3.field4466 & 0x7F) == 64) {
                        if (class229.field3934[var6][var7] == class202.field3444) {
                            continue;
                        }
                        class229.field3934[var6][var7] = class202.field3444;
                    }
                    if (!var3.field1928.field2173) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field4475 = class70.method480(class265.field4640, (byte) 126, var3.field4492, var3.field4466);
                    class191.method1319(class265.field4640, var3.field4492, var3.field4466, var3.field4475, var3.field4486 * 64 - 4, var3, var3.field4527, var4, var3.field4468);
                }
            }
        }
        field4102++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ltg;I)V")
    public static final void method1628(class75 arg0, int arg1) {
        field4100++;
        class125.field2258 = arg0.method564(class75.field1323, -14783);
        class194.field3365 = arg0.method564(class76.field1352, arg1 - 15806);
        class189.field3272 = arg0.method564(class173.field3036, -14783);
        if (arg1 != 1023) {
            field4106 = null;
        }
        class166.field2968 = arg0.method564(class218.field3752, arg1 - 15806);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I")
    public static final int method1629(int arg0, KeyEvent arg1) {
        int var2 = 17 % ((arg0 + 20) / 52);
        field4098++;
        int var3 = arg1.getKeyChar();
        if (var3 == 8364) {
            return 128;
        } else {
            if (var3 <= 0 || var3 >= 256) {
                var3 = -1;
            }
            return var3;
        }
    }
}
