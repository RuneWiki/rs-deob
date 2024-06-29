import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class48 {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Lic;")
    public static class59 field1213 = class59.method433(0, "Einloggen");

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "Lic;")
    public static class59 field1211 = class59.method433(0, " <col=00ff80>");

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(I)V")
    public static void method373(int arg0) {
        field1213 = null;
        field1211 = null;
        if (arg0 != 98) {
            method373(-19);
        }
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
    public static final void method374(int arg0, int arg1) {
        field1214++;
        if (class114.method923(arg1, (byte) -128)) {
            class152.method1117((byte) -107, class46.field1173[arg1], arg0);
        }
    }

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "(I)V")
    public static final void method375(int arg0) {
        field1212++;
        class38 var1 = class18.field353;
        synchronized (class18.field353) {
            class42.field1089 = class131.field2934;
            if (arg0 == -24988) {
                if (class107.field2553 >= 0) {
                    while (class108.field2606 != class107.field2553) {
                        int var2 = class158.field3517[class108.field2606];
                        class108.field2606 = class108.field2606 + 1 & 0x7F;
                        if (var2 >= 0) {
                            class95.field2423[var2] = true;
                        } else {
                            class95.field2423[~var2] = false;
                        }
                    }
                } else {
                    for (int var3 = 0; var3 < 112; var3++) {
                        class95.field2423[var3] = false;
                    }
                    class107.field2553 = class108.field2606;
                }
                class131.field2934 = class46.field1181;
            }
        }
    }
}
