import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class145 {

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lbv;")
    public static class567 field2235 = new class567("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public int field2234;

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public int field2236;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public int field2238;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lgp;")
    public static class561 field2232;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(I)I")
    public static final int method1064(int arg0) {
        field2233++;
        int var1 = 120 / ((arg0 - 53) / 55);
        class167 var2 = class159.field2378;
        boolean var3 = false;
        if (class646.field9388 != 0) {
            Canvas var4 = new Canvas();
            var4.setSize(100, 100);
            var2 = class167.method1162(0, 0, null, 0, var4, null);
            var3 = true;
        }
        long var5 = class508.method2860(false);
        for (int var7 = 0; var7 < 10000; var7++) {
            var2.method404(5, 10, 75, 50, 15, 90, -65536, -65536, -65536, 1);
        }
        int var8 = (int) (class508.method2860(false) - var5);
        var2.method1159(-16777216, 100, 0, 0, (byte) 103, 100);
        if (var3) {
            var2.method1163(6510);
        }
        return var8;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method1065(byte arg0) {
        field2235 = null;
        field2232 = null;
        if (arg0 != -18) {
            method1064(-117);
        }
    }
}
