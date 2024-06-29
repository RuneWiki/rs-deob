import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class56 {

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "Z")
    public static boolean field817 = true;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field818 = 0;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field823;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static final void method395(int arg0) {
        field819++;
        class159.field2475 = new class2();
        if (arg0 != -265) {
            method397(-102);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method396(int arg0, int arg1) {
        field823++;
        if (class309.method2092(91923, arg0)) {
            if (arg1 != 5947) {
                method398((String) null, (byte) 57);
            }
            class75.method561(-1, class134.field2195[arg0], false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(I)V")
    public static final void method397(int arg0) {
        field821++;
        if (arg0 <= 57) {
            method398((String) null, (byte) 108);
        }
        class169.field2559.method1422((byte) 108);
        class159.field2480.method1422((byte) 97);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method398(String arg0, byte arg1) {
        if (arg1 <= 46) {
            method395(-48);
        }
        field820++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
    }
}
