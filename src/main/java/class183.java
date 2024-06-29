import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cka")
public class class183 {

    @OriginalMember(owner = "client!cka", name = "c", descriptor = "I")
    public static int field2771 = 1339;

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!cka", name = "d", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!cka", name = "e", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(II)Z", line = 3)
    public static final boolean method1365(int arg0, int arg1) {
        field2773++;
        int var2 = -64 % ((arg1 - 50) / 45);
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(I)V", line = 13)
    public static final void method1366(int arg0) {
        field2770++;
        if (arg0 != -65536) {
            method1367(65);
        }
        try {
            if (class420.field5909 == 1) {
                int var1 = class76.field1020.method739(21288);
                if (var1 > 0 && class76.field1020.method753((byte) 34)) {
                    int var2 = var1 - class763.field10505;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class76.field1020.method757(arg0 + 65680, var2);
                    return;
                }
                class76.field1020.method759(105);
                class76.field1020.method767(21415);
                class285.field4369 = null;
                class729.field10197 = null;
                if (class368.field5295 == null) {
                    class420.field5909 = 0;
                } else {
                    class420.field5909 = 2;
                }
            }
            if (class420.field5909 == 3) {
                int var3 = class76.field1020.method739(arg0 + 86824);
                if (var3 < class246.field3513 && class76.field1020.method753((byte) 34)) {
                    int var4 = class101.field1279 + var3;
                    if (var4 > class246.field3513) {
                        var4 = class246.field3513;
                    }
                    class76.field1020.method757(arg0 + 65680, var4);
                } else {
                    class420.field5909 = 0;
                    class101.field1279 = 0;
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class76.field1020.method759(118);
            class729.field10197 = null;
            class420.field5909 = 0;
            class368.field5295 = null;
            class733.field10242 = null;
            class285.field4369 = null;
        }
    }

    @OriginalMember(owner = "client!cka", name = "b", descriptor = "(I)I", line = 84)
    public static final int method1367(int arg0) {
        field2772++;
        class66 var1 = class638.field8979;
        boolean var2 = false;
        if (class145.field1852.field9002.method2258((byte) -39) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class685.method3869(0, null, var3, null, 0, arg0 ^ 0x52);
            var2 = true;
        }
        long var4 = class109.method731(69);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method490(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class109.method731(arg0 - 24) - var4);
        var1.method488(0, 0, -16777216, 100, 1, arg0);
        if (var2) {
            var1.method450(1);
        }
        return var7;
    }

    @OriginalMember(owner = "client!cka", name = "a", descriptor = "(B)Lnh;", line = 131)
    public static final class777 method1368(byte arg0) {
        field2769++;
        return arg0 == 51 ? class787.method4314(0, 1) : null;
    }
}
