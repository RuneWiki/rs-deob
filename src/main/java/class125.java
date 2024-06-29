import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class125 extends class139 {

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field2054 = 0;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "Ljo;")
    public static class307 field2056 = new class307("", 11);

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "Lufa;")
    public static class632 field2057;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lla;)V", line = 9)
    public static final void method1102(class418 arg0) {
        class65.field841 = arg0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z)V", line = 13)
    public static void method1103(boolean arg0) {
        if (arg0) {
            method1104((byte) 106);
        }
        field2056 = null;
        field2057 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V", line = 29)
    public static final void method1104(byte arg0) {
        field2055++;
        if (class682.field9564 == 7) {
            class6.method63(0, false);
            return;
        }
        class585.field8325 = class499.field7329;
        class499.field7329 = null;
        class68.method715(13, (byte) -38);
        if (arg0 != 28) {
            field2054 = -19;
        }
    }
}
