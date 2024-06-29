import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class62 {

    @OriginalMember(owner = "client!g", name = "b", descriptor = "Loh;")
    public static class258 field1092 = class153.method1046("Schlie-8en", 113);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1091 = 0;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1097 = 0;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "I")
    public static int field1096;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lkk;")
    public static class112 field1093;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "Lkk;")
    public static class112 field1095;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V", line = 5)
    public static void method480(int arg0) {
        field1095 = null;
        field1092 = null;
        field1093 = null;
        int var1 = -30 % ((54 - arg0) / 48);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 26)
    public static final void method482(String arg0, int arg1) {
        field1096++;
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        System.exit(1);
        if (arg1 != 0) {
            method480(-95);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method481(Component arg0, byte arg1);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public abstract void method483(Component arg0, boolean arg1);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)I")
    public abstract int method484(int arg0);
}
