import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class68 extends class405 {

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "Luv;")
    public static class2 field903;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public int field890;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public int field894;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field895;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field896;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    public int field898;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "I")
    public int field900;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
    public static int field904;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "Lsl;")
    public class456 field902;

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "Ljava/lang/String;")
    public String field901;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "[I")
    public int[] field893;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "[I")
    public int[] field897;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "[Lmt;")
    public class517[] field899;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "[Ljava/lang/String;")
    public String[] field892;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIZ)V")
    public static final void method476(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            method478(true, 64, true);
        }
        field891++;
        int var4 = class454.field6661.field980 * arg0 >> 8;
        if (arg2 == -1 && !class520.field7641) {
            class18.method202(4);
        } else if (arg2 != -1 && (class120.field1840 != arg2 || !class258.method1578(10105)) && var4 != 0 && !class520.field7641) {
            class473.method2817(false, arg2, 0, class497.field7381, var4, arg1, 13829);
        }
        class120.field1840 = arg2;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(Z)V")
    public static void method477(boolean arg0) {
        field903 = null;
        if (arg0) {
            field904 = 51;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZIZ)V")
    public static final void method478(boolean arg0, int arg1, boolean arg2) {
        field896++;
        if (arg2) {
            class5.field44++;
            class123.method916(-16777216);
        }
        if (arg0) {
            class181.field2684++;
            class521.method3092(true);
        }
        if (arg1 != 0) {
            method476(-122, -100, 0, false);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBI)I")
    public static final int method479(int arg0, byte arg1, int arg2) {
        if (arg1 < 15) {
            method478(false, 101, true);
        }
        field895++;
        return arg2 == 4 || arg2 == 5 ? class136.field2013[arg0 & 0x3] : 256;
    }

    static {
        new class347("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
        field903 = new class2(13, 0);
    }
}
