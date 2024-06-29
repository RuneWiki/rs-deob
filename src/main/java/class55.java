import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class55 extends class170 {

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "Lf;")
    public class21 field854;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "I")
    public static int field848 = 0;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "I")
    public static int field849 = 127;

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    public static int field851 = 0;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field856 = -1;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "Lsc;")
    public static class181 field855 = class149.method967(255, " steht bereits auf Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "Lvf;")
    public static class230 field852;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "(I)V")
    public static void method403(int arg0) {
        field855 = null;
        if (arg0 == 127) {
            field852 = null;
        }
    }

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "(B)Z")
    public static final boolean method404(byte arg0) {
        field850++;
        class190 var1 = class2.field57;
        synchronized (class2.field57) {
            if (arg0 <= 111) {
                method404((byte) -53);
            }
            if (class229.field3926 == class148.field2475) {
                return false;
            } else {
                class13.field261 = class259.field4519[class148.field2475];
                class196.field3419 = class222.field3846[class148.field2475];
                class148.field2475 = class148.field2475 + 1 & 0x7F;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(Lf;)V")
    public class55(class21 arg0) {
        this.field854 = arg0;
    }
}
