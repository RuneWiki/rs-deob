import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class117 {

    @OriginalMember(owner = "client!m", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1817 = new String[100];

    @OriginalMember(owner = "client!m", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1822 = "Examine";

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IZLuf;ZIII)V")
    public static final void method847(int arg0, boolean arg1, class176 arg2, boolean arg3, int arg4, int arg5, int arg6) {
        class32.field516 = arg4;
        class297.field4700 = arg0;
        class174.field2583 = arg6;
        class219.field3420 = arg2;
        class72.field1140 = arg3;
        class13.field223 = arg5;
        class295.field4641 = 1;
        if (arg1) {
            field1818 = 37;
        }
        field1820++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILjava/awt/Component;II)Lfa;")
    public static final class257 method848(int arg0, Component arg1, int arg2, int arg3) {
        field1819++;
        try {
            Class var4 = Class.forName("eg");
            class257 var5 = (class257) var4.getDeclaredConstructor().newInstance();
            var5.method234((byte) -86, arg3, arg1, arg2);
            if (arg0 > -2) {
                field1821 = 26;
            }
            return var5;
        } catch (Throwable var7) {
            class29 var6 = new class29();
            var6.method234((byte) -112, arg3, arg1, arg2);
            return var6;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(B)V")
    public static void method849(byte arg0) {
        field1822 = null;
        field1817 = null;
        if (arg0 > -67) {
            field1817 = null;
        }
    }
}
