import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class418 {

    @OriginalMember(owner = "client!kq", name = "b", descriptor = "Lbg;")
    public static class324 field6166 = new class324(36, 12);

    @OriginalMember(owner = "client!kq", name = "f", descriptor = "Lgk;")
    public static class331 field6170 = new class331("K", "T", "K", "K");

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "I")
    public static int field6165;

    @OriginalMember(owner = "client!kq", name = "c", descriptor = "I")
    public static int field6167;

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "I")
    public static int field6168;

    @OriginalMember(owner = "client!kq", name = "e", descriptor = "[[[Lnt;")
    public static class148[][][] field6169;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V")
    public static final void method2547(int arg0) {
        field6167++;
        if (arg0 != 22) {
            return;
        }
        for (class97 var1 = (class97) class498.field7394.method1018(40); var1 != null; var1 = (class97) class498.field7394.method1022((byte) -112)) {
            if (class270.method1741(4, var1.field1307)) {
                class406.method2494(21944, var1);
            }
        }
        if (class291.field4175 == 1) {
            class500.field7415 = false;
            class410.method2512(class389.field5748, true, class518.field7624, class22.field244, class429.field6318);
            return;
        }
        class410.method2512(class389.field5748, true, class518.field7624, class22.field244, class429.field6318);
        int var2 = class387.field5731.method1969(-1, class192.field2804.method2031(true, class377.field5585));
        for (class97 var3 = (class97) class498.field7394.method1018(106); var3 != null; var3 = (class97) class498.field7394.method1022((byte) -112)) {
            int var4 = class236.method1571(var3, 3);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class22.field244 = var2 + 8;
        class518.field7624 = (class473.field6974 ? 26 : 22) + class291.field4175 * 16;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(B)V")
    public static void method2548(byte arg0) {
        field6166 = null;
        field6170 = null;
        field6169 = null;
        int var1 = 126 % ((arg0 - 62) / 34);
    }
}
