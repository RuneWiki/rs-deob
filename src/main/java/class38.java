import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class38 extends class42 {

    @OriginalMember(owner = "client!ga", name = "gb", descriptor = "Lad;")
    private static class5 field934 = class88.method674("No matching objects found)1 please shorten search", 125);

    @OriginalMember(owner = "client!ga", name = "pb", descriptor = "Lad;")
    private static class5 field943 = class88.method674("Message", 63);

    @OriginalMember(owner = "client!ga", name = "mb", descriptor = "Lad;")
    public static class5 field940 = null;

    @OriginalMember(owner = "client!ga", name = "ob", descriptor = "Lad;")
    public static class5 field942 = field934;

    @OriginalMember(owner = "client!ga", name = "hb", descriptor = "Lad;")
    public static class5 field935 = class88.method674("Ung-Ultiger Benutzername", 69);

    @OriginalMember(owner = "client!ga", name = "sb", descriptor = "Lad;")
    public static class5 field946 = class88.method674("@gre@", -83);

    @OriginalMember(owner = "client!ga", name = "yb", descriptor = "Lad;")
    public static class5 field952 = class88.method674("Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3", -126);

    @OriginalMember(owner = "client!ga", name = "xb", descriptor = "Lad;")
    public static class5 field951 = field943;

    @OriginalMember(owner = "client!ga", name = "db", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!ga", name = "eb", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ga", name = "fb", descriptor = "I")
    public int field933;

    @OriginalMember(owner = "client!ga", name = "ib", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ga", name = "kb", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ga", name = "rb", descriptor = "I")
    public int field945;

    @OriginalMember(owner = "client!ga", name = "ub", descriptor = "I")
    public static int field948;

    @OriginalMember(owner = "client!ga", name = "vb", descriptor = "I")
    public int field949;

    @OriginalMember(owner = "client!ga", name = "wb", descriptor = "I")
    public int field950;

    @OriginalMember(owner = "client!ga", name = "nb", descriptor = "Lsb;")
    public static class110 field941;

    @OriginalMember(owner = "client!ga", name = "qb", descriptor = "Luc;")
    public static class123 field944;

    @OriginalMember(owner = "client!ga", name = "cb", descriptor = "[I")
    public static int[] field930;

    @OriginalMember(owner = "client!ga", name = "jb", descriptor = "[I")
    public int[] field937;

    @OriginalMember(owner = "client!ga", name = "lb", descriptor = "[I")
    public int[] field939;

    @OriginalMember(owner = "client!ga", name = "tb", descriptor = "[Lad;")
    public class5[] field947;

    @OriginalMember(owner = "client!ga", name = "f", descriptor = "(I)V", line = 10)
    public static final void method292(int arg0) {
        for (class94 var1 = (class94) class7.field259.method180(0); var1 != null; var1 = (class94) class7.field259.method181(0)) {
            if (var1.field2238 != null) {
                var1.method721(-17);
            }
        }
        if (arg0 <= 112) {
            method293(-24, (byte) 84);
        }
        field936++;
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(IB)V", line = 33)
    public static final void method293(int arg0, byte arg1) {
        field938++;
        if (class8.field275 == null) {
            return;
        }
        if (arg1 != -93) {
            method295((byte) -110);
        }
        if (class9.field299 != 0) {
            if (class63.field1525 == null) {
                return;
            }
            class100.field2429 = arg0;
        } else if (class39.field972 >= 0) {
            class39.field972 = arg0;
            class8.field275.method283(arg0, (byte) -117, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!ga", name = "b", descriptor = "(Z)V", line = 89)
    public static final void method294(boolean arg0) {
        field932++;
        if (arg0) {
            field943 = null;
        }
        class59.field1444.method101((byte) -80);
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)V", line = 103)
    public static void method295(byte arg0) {
        field951 = null;
        field952 = null;
        field946 = null;
        field942 = null;
        field941 = null;
        field943 = null;
        field934 = null;
        field940 = null;
        field944 = null;
        field930 = null;
        if (arg0 == 100) {
            field935 = null;
        }
    }
}
