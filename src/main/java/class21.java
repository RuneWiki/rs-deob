import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class21 {

    @OriginalMember(owner = "client!lm", name = "d", descriptor = "I")
    public int field237 = 0;

    @OriginalMember(owner = "client!lm", name = "b", descriptor = "[I")
    public static int[] field235 = new int[2];

    @OriginalMember(owner = "client!lm", name = "i", descriptor = "[[I")
    public static int[][] field242 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!lm", name = "c", descriptor = "I")
    public static int field236;

    @OriginalMember(owner = "client!lm", name = "e", descriptor = "I")
    public static int field238;

    @OriginalMember(owner = "client!lm", name = "f", descriptor = "I")
    public static int field239;

    @OriginalMember(owner = "client!lm", name = "g", descriptor = "I")
    public static int field240;

    @OriginalMember(owner = "client!lm", name = "h", descriptor = "I")
    public static int field241;

    @OriginalMember(owner = "client!lm", name = "j", descriptor = "I")
    public static int field243;

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ZII)V", line = 6)
    public static final void method123(boolean arg0, int arg1, int arg2) {
        field243++;
        class321 var3 = class46.method370(5, (byte) -106, arg1);
        var3.method2265(arg0);
        var3.field5112 = arg2;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(B)V", line = 17)
    public static final void method124(byte arg0) {
        field238++;
        class78.method647(5, -61);
        class362.method2541(5, 14429);
        class27.method172(5, -101);
        class79.method654((byte) 86, 5);
        class125.method979(-51, 5);
        if (arg0 != -126) {
            method127(-11);
        }
        client.method352(15194, 5);
        class222.method1665(arg0 ^ 0xD3DB64CA, 5);
        class148.method1149(3650, 5);
        class149.method1155(5, -26);
        class3.method15(5, 10);
        class307.method2185(-1537713145, 5);
        class214.method1616(4, 5);
        class165.method1286(5, true);
        class200.method1541((byte) 29, 5);
        class291.method2101(22, 5);
        class35.method240(arg0 ^ 0xFFFFFF85, 5);
        class93.method728(5, arg0 + 140);
        class178.method1404(5, 2);
        class52.method401(true, 50);
        class178.method1401(5, arg0 + 125);
        class245.method1876(5, arg0 ^ 0xFFFFEF82);
        class101.field1655.method2334(4, 5);
        class183.field2948.method2334(4, 5);
        class106.field1755.method2334(4, 5);
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(Lqm;I)V", line = 51)
    public final void method125(class227 arg0, int arg1) {
        field240++;
        while (true) {
            int var3 = arg0.method1720((byte) -56);
            if (var3 == 0) {
                int var4 = 104 / ((arg1 + 86) / 33);
                return;
            }
            this.method126(var3, arg0, false);
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILqm;Z)V", line = 71)
    private final void method126(int arg0, class227 arg1, boolean arg2) {
        if (arg2) {
            field242 = (int[][]) ((int[][]) null);
        }
        if (arg0 == 5) {
            this.field237 = arg1.method1765(true);
        }
        field236++;
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V", line = 93)
    public static void method127(int arg0) {
        field242 = (int[][]) null;
        field235 = null;
        if (arg0 != 4015) {
            field239 = 58;
        }
    }

    @OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;)V", line = 119)
    public static final void method128(int arg0, String arg1) {
        field241++;
        if (class306.field4891 == null) {
            return;
        }
        class115.field1923++;
        class36.field520.method2228(165, 16547);
        class36.field520.method1712(class163.method1261(1, arg1), arg0 - 1114);
        class36.field520.method1709(arg1, (byte) 99);
        if (arg0 != 1031) {
            field239 = -52;
        }
    }
}
