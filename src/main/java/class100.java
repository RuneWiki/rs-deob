import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class100 extends OutputStream {

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "I")
    public static int field1595 = 0;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1594 = "slide:";

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field1593;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "I")
    public static int field1597;

    @OriginalMember(owner = "client!uk", name = "write", descriptor = "(I)V", line = 5)
    public final void write(int arg0) throws IOException {
        field1596++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(B)V", line = 19)
    public static void method806(byte arg0) {
        if (arg0 >= 35) {
            field1594 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V", line = 33)
    public static final void method807(int arg0, int arg1) {
        class30.field471.method2285(arg0, (byte) 127);
        field1592++;
        class31.field487.method2285(arg0, (byte) 104);
        int var2 = -38 % ((-arg1 - 25) / 48);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(BB)V", line = 47)
    public static final void method808(byte arg0, byte arg1) {
        field1593++;
        if (arg0 != -116) {
            method808((byte) 70, (byte) -75);
        }
        if (class242.field3621 == null) {
            class242.field3621 = new byte[4][104][104];
        }
        for (int var2 = 0; var2 < 4; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                for (int var4 = 0; var4 < 104; var4++) {
                    class242.field3621[var2][var3][var4] = arg1;
                }
            }
        }
    }
}
