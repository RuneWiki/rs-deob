import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class42 extends InputStream {

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "Lvf;")
    public static class87 field619 = new class87();

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "I")
    public static int field620 = 1407;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "I")
    public static int field617;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field618;

    @OriginalMember(owner = "client!ic", name = "e", descriptor = "I")
    public static int field621;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(B)V")
    public static void method239(byte arg0) {
        if (arg0 <= 109) {
            field619 = null;
        }
        field619 = null;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(B)V")
    public static final void method240(byte arg0) {
        field618++;
        if (arg0 != 30) {
            field619 = null;
        }
        int var1 = (int) ((double) class72.field1144 * 34.46D);
        int var2 = var1 << 2;
        if (class332.field4821.method694()) {
            var2 += 512;
        }
        class332.field4821.method675(200, var2);
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)V")
    public static final void method241(String arg0, String arg1, int arg2) {
        class642.field9203 = -1;
        field621++;
        class673.field9460 = 1;
        class504.method2873(false, arg0, arg1, (byte) 124);
        if (arg2 != -4151) {
            method240((byte) -104);
        }
    }

    @OriginalMember(owner = "client!ic", name = "read", descriptor = "()I")
    public final int read() {
        field617++;
        class687.method3846(30000L, 88);
        return -1;
    }
}
