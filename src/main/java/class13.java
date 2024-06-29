import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class13 extends class337 {

    @OriginalMember(owner = "client!fi", name = "r", descriptor = "Lcja;")
    public static class83 field134 = new class83();

    @OriginalMember(owner = "client!fi", name = "u", descriptor = "Z")
    public static boolean field137 = false;

    @OriginalMember(owner = "client!fi", name = "t", descriptor = "[Ljava/awt/Color;")
    public static Color[] field136 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381), new Color(16741381) };

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public int field131;

    @OriginalMember(owner = "client!fi", name = "q", descriptor = "I")
    public int field133;

    @OriginalMember(owner = "client!fi", name = "s", descriptor = "I")
    public static int field135;

    @OriginalMember(owner = "client!fi", name = "v", descriptor = "Lwm;")
    public static class30 field138;

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "Lrn;")
    public class633 field132;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "Ltia;")
    public class740 field130;

    @OriginalMember(owner = "client!fi", name = "w", descriptor = "Lpu;")
    public static class772 field139;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 10)
    public final void method55(int arg0) {
        field135++;
        if (class699.field9266.length > class570.field7200) {
            class699.field9266[class570.field7200++] = this;
            if (arg0 < 2) {
                method57(-8, -94, (byte) 120);
            }
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 26)
    public static final void method56(int arg0) {
        class377.field4617 = null;
        if (arg0 != -1) {
            field136 = null;
        }
        class192.field2685 = null;
        class91.field1241 = null;
        class154.field1962 = null;
        class444.field5815 = null;
        field128++;
        class234.field3201 = null;
        class269.field3556 = null;
        field139 = null;
        class573.field7256 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIB)Z", line = 50)
    public static final boolean method57(int arg0, int arg1, byte arg2) {
        field129++;
        if (arg2 >= -68) {
            return false;
        } else {
            return (arg0 & 0x21) != 0;
        }
    }

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "(I)V", line = 75)
    public static void method58(int arg0) {
        field136 = null;
        field134 = null;
        if (arg0 <= 2) {
            field134 = null;
        }
        field138 = null;
        field139 = null;
    }
}
