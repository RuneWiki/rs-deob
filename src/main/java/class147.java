import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class147 {

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public int field2708;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public int field2709;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "Lsg;")
    private static class169 field2711 = class165.method1060("wishes to trade with you)3", 1536);

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lsg;")
    public static class169 field2710 = class165.method1060("Lade Wordpack )2 ", 1536);

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lsg;")
    public static class169 field2713 = field2711;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field2705;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2706;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "[[[B")
    public static byte[][][] field2704;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method960(int arg0) {
        field2713 = null;
        if (arg0 > 51) {
            field2704 = null;
            field2711 = null;
            field2710 = null;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I")
    public static final int method961(int arg0, int arg1) {
        field2712++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg1 != 12482) {
            method960(121);
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)Lsg;")
    public static final class169 method962(boolean arg0, int arg1) {
        if (!arg0) {
            method960(-104);
        }
        field2705++;
        return class154.field2967[arg1].method1134(0) <= 0 ? class63.field1166[arg1] : class165.method1058(0, new class169[] { class63.field1166[arg1], class129.field2405, class154.field2967[arg1] });
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class147() {
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(Lqc;)V")
    public class147(class147 arg0) {
        this.field2714 = arg0.field2714;
        this.field2707 = arg0.field2707;
        this.field2708 = arg0.field2708;
        this.field2709 = arg0.field2709;
    }
}
