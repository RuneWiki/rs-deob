import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class68 {

    @OriginalMember(owner = "client!md", name = "d", descriptor = "I")
    public int field1089 = 0;

    @OriginalMember(owner = "client!md", name = "b", descriptor = "Lsc;")
    public static class181 field1087 = class149.method967(255, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!md", name = "a", descriptor = "Lwh;")
    public static class200 field1086 = class229.method1504(1);

    @OriginalMember(owner = "client!md", name = "f", descriptor = "Lsc;")
    public static class181 field1091 = class149.method967(255, "<col=ff9040>");

    @OriginalMember(owner = "client!md", name = "h", descriptor = "Lsc;")
    public static class181 field1093 = class149.method967(255, "; Max)2Age=");

    @OriginalMember(owner = "client!md", name = "j", descriptor = "[Z")
    public static boolean[] field1095 = new boolean[112];

    @OriginalMember(owner = "client!md", name = "c", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!md", name = "e", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!md", name = "g", descriptor = "I")
    public static int field1092;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field1094;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILvf;)V")
    public final void method475(int arg0, class230 arg1) {
        while (true) {
            int var3 = arg1.method1516((byte) 82);
            if (var3 == 0) {
                field1094++;
                if (arg0 != -1) {
                    this.method476(-61, 27, (class230) null);
                    return;
                }
                return;
            }
            this.method476(5, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IILvf;)V")
    private final void method476(int arg0, int arg1, class230 arg2) {
        if (arg0 == arg1) {
            this.field1089 = arg2.method1535(2);
        }
        field1092++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIBI)V")
    public static final void method477(int arg0, int arg1, byte arg2, int arg3) {
        class181 var4 = class175.method1164(new class181[] { class137.field2241, class169.method1119((byte) -116, arg1), class100.field1679, class169.method1119((byte) -118, arg3 >> 6), class100.field1679, class169.method1119((byte) 32, arg0 >> 6), class100.field1679, class169.method1119((byte) -124, arg3 & 0x3F), class100.field1679, class169.method1119((byte) 61, arg0 & 0x3F) }, (byte) 127);
        int var5 = 21 / ((arg2 + 1) / 49);
        var4.method1198(false);
        class18.method171(false, var4);
        field1088++;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)V")
    public static void method478(byte arg0) {
        field1086 = null;
        field1093 = null;
        field1091 = null;
        field1095 = null;
        field1087 = null;
        if (arg0 <= 51) {
            field1093 = null;
        }
    }
}
