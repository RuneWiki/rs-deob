import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class29 {

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field741 = -1;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "Lv;")
    public static class122 field742 = class55.method425(-116, "compass");

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "I")
    public static int field744 = 78;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Lv;")
    public static class122 field745 = class55.method425(-108, "Privater Chat");

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "[I")
    public static int[] field746 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "Lv;")
    public static class122 field737 = class55.method425(-123, "Regeln versto\u001c1en hat)3");

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lv;")
    private static class122 field736 = class55.method425(-85, " from your ignore list first");

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Lv;")
    public static class122 field738 = field736;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field740;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!ed", name = "n", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lmc;")
    public static class75 field735;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field734;

    @OriginalMember(owner = "client!ed", name = "o", descriptor = "[I")
    public static int[] field748;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V", line = 6)
    public static final void method275(int arg0, int arg1) {
        if (arg1 != 1622083330) {
            field746 = null;
        }
        field740++;
        class24.field658 += arg0;
        while (client.field447 <= class24.field658) {
            class24.field658 -= client.field447;
            class45.field1167 -= class45.field1167 >> 2;
        }
        class45.field1167 -= arg0 * 1000;
        if (class45.field1167 < 0) {
            class45.field1167 = 0;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V", line = 28)
    public static void method276(byte arg0) {
        field738 = null;
        field745 = null;
        field735 = null;
        field746 = null;
        field742 = null;
        field748 = null;
        field734 = null;
        field737 = null;
        if (arg0 != -38) {
            field736 = null;
        }
        field736 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V", line = 59)
    public static final void method277(int arg0) {
        field739++;
        while (class14.field372.method992(123, class74.field1969) >= 26) {
            int var1 = class14.field372.method994(14, (byte) -119);
            if (var1 == 16383) {
                break;
            }
            if (class94.field2423[var1] == null) {
                class94.field2423[var1] = new class80();
            }
            class80 var2 = class94.field2423[var1];
            class21.field581[class49.field1245++] = var1;
            var2.field333 = class16.field396;
            var2.field2089 = class109.method843(class14.field372.method994(13, (byte) -100), (byte) -31);
            var2.field299 = class25.field682[class14.field372.method994(3, (byte) -92)];
            int var3 = class14.field372.method994(5, (byte) -120);
            int var4 = class14.field372.method994(1, (byte) -78);
            int var5 = class14.field372.method994(5, (byte) -89);
            int var6 = class14.field372.method994(1, (byte) -82);
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var3 > 15) {
                var3 -= 32;
            }
            if (var6 == 1) {
                class118.field2859[class107.field2661++] = var1;
            }
            var2.field296 = var2.field2089.field558;
            var2.field297 = var2.field2089.field547;
            var2.field282 = var2.field2089.field529;
            var2.field340 = var2.field2089.field564;
            var2.field317 = var2.field2089.field540;
            var2.field279 = var2.field2089.field560;
            var2.field294 = var2.field2089.field569;
            if (var2.field294 == 0) {
                var2.field299 = 0;
            }
            var2.method109(class70.field1828.field307[0] + var5, class70.field1828.field287[0] + var3, (byte) -108, var4 == 1);
        }
        if (arg0 != -14960) {
            method275(-88, -90);
        }
        class14.field372.method995(false);
    }
}
