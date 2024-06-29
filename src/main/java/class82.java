import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class82 {

    @OriginalMember(owner = "client!mf", name = "c", descriptor = "[S")
    public static short[] field1230 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
    public static int field1232 = 0;

    @OriginalMember(owner = "client!mf", name = "d", descriptor = "Ltm;")
    public static class112 field1231 = new class112("skill: ", "Fertigkeit: ", "compétence ", "habilidade: ");

    @OriginalMember(owner = "client!mf", name = "g", descriptor = "[S")
    public static short[] field1234 = new short[256];

    @OriginalMember(owner = "client!mf", name = "h", descriptor = "Lcs;")
    public static class351 field1235 = new class351(14, 8);

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "I")
    public static int field1228;

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "I")
    public static int field1229;

    @OriginalMember(owner = "client!mf", name = "f", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V", line = 6)
    public static void method563(byte arg0) {
        field1235 = null;
        field1231 = null;
        field1234 = null;
        if (arg0 > 21) {
            field1230 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V", line = 22)
    public static final void method564(byte arg0) {
        if (arg0 != -103) {
            field1233 = 8;
        }
        field1229++;
        if (class472.field6618) {
            class472.field6618 = false;
            class320.field4372 = null;
            class78.field1181 = null;
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(II)V", line = 39)
    public static final void method565(int arg0, int arg1) {
        field1228++;
        if (class56.method431(12449, arg1)) {
            class488.method2870(arg0, class39.field666[arg1], 49);
        }
    }
}
