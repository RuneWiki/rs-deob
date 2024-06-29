import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public abstract class class274 {

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public int field4609;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public int field4606;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "Lce;")
    public static class126 field4607 = class206.method1445(-7923, ":clanreq:");

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "Lce;")
    public static class126 field4608 = class206.method1445(-7923, "(Z");

    @OriginalMember(owner = "client!gj", name = "i", descriptor = "I")
    public static int field4614 = 0;

    @OriginalMember(owner = "client!gj", name = "j", descriptor = "Lce;")
    public static class126 field4615 = class206.method1445(-7923, "p11_full");

    @OriginalMember(owner = "client!gj", name = "h", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!gj", name = "k", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!gj", name = "l", descriptor = "I")
    public static int field4617;

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "Lcc;")
    public static class313 field4612;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "Lpj;")
    public static class57 field4611;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIIIZ)V", line = 6)
    public static final void method1833(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class197.field3377 = arg1;
        class65.field1094 = arg2;
        class31.field438 = arg3;
        class293.field4860 = new class5[arg0][class197.field3377][class65.field1094];
        class320.field5486 = new int[arg0][class197.field3377 + 1][class65.field1094 + 1];
        if (class56.field846) {
            class319.field5461 = new class201[4][];
        }
        if (arg4) {
            class307.field5211 = new class5[1][class197.field3377][class65.field1094];
            class166.field2959 = new int[class197.field3377][class65.field1094];
            class177.field3122 = new int[1][class197.field3377 + 1][class65.field1094 + 1];
            if (class56.field846) {
                class25.field359 = new class201[1][];
            }
        } else {
            class307.field5211 = (class5[][][]) null;
            class166.field2959 = (int[][]) null;
            class177.field3122 = (int[][][]) null;
            class25.field359 = (class201[][]) null;
        }
        class309.method2112(false);
        class39.field623 = new class76[500];
        class50.field764 = 0;
        class286.field4749 = new class76[500];
        class306.field5134 = 0;
        class26.field369 = new int[arg0][class197.field3377 + 1][class65.field1094 + 1];
        class217.field3653 = new class240[5000];
        class305.field5121 = 0;
        class139.field2520 = new class240[100];
        class29.field411 = new boolean[class31.field438 + class31.field438 + 1][class31.field438 + class31.field438 + 1];
        class63.field1072 = new boolean[class31.field438 + class31.field438 + 2][class31.field438 + class31.field438 + 2];
        class85.field1353 = new byte[arg0][class197.field3377][class65.field1094];
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(III)V", line = 51)
    public class274(int arg0, int arg1, int arg2) {
        this.field4610 = arg1;
        this.field4609 = arg0;
        this.field4606 = arg2;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lcc;Lcc;I)I", line = 78)
    public static final int method1834(class313 arg0, class313 arg1, int arg2) {
        field4613++;
        int var3 = 0;
        if (arg1.method2166(-28257, class157.field2833)) {
            var3++;
        }
        if (arg1.method2166(-28257, class85.field1349)) {
            var3++;
        }
        if (arg1.method2166(arg2 ^ 0x2D2F, class300.field4966)) {
            var3++;
        }
        if (arg2 != -17232) {
            field4611 = (class57) null;
        }
        if (arg0.method2166(-28257, class157.field2833)) {
            var3++;
        }
        if (arg0.method2166(-28257, class85.field1349)) {
            var3++;
        }
        if (arg0.method2166(-28257, class300.field4966)) {
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)V", line = 131)
    public static void method1835(byte arg0) {
        field4611 = null;
        field4607 = null;
        int var1 = 120 % ((arg0 + 24) / 58);
        field4612 = null;
        field4608 = null;
        field4615 = null;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(III)V")
    public abstract void method50(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IIB)V")
    public abstract void method56(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBI)V")
    public abstract void method52(int arg0, byte arg1, int arg2);
}
