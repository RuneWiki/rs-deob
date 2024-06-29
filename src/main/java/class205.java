import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class205 extends OutputStream {

    @OriginalMember(owner = "client!k", name = "a", descriptor = "I")
    public static int field2968 = 0;

    @OriginalMember(owner = "client!k", name = "b", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!k", name = "c", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!k", name = "d", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!k", name = "e", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!k", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2972++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIII)V")
    public static final void method1322(int arg0, int arg1, int arg2, int arg3) {
        field2969++;
        if (class32.field473 == arg0 || arg2 == 0 || class224.field3358 >= 50 || arg1 == -1) {
            return;
        }
        class212.field3042[class224.field3358] = arg1;
        class160.field2325[class224.field3358] = arg2;
        class146.field2098[class224.field3358] = arg3;
        class236.field3563[class224.field3358] = null;
        class123.field1783[class224.field3358] = 0;
        class224.field3358++;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1323(int arg0, String arg1) {
        field2971++;
        if (class168.field2440 == null || arg1.length() == 0) {
            return -1;
        } else if (arg0 == -1) {
            for (int var2 = 0; var2 < class168.field2440.field1204; var2++) {
                if (class158.method1060("<br>", class168.field2440.field1203[var2], " ", arg0 - 97).equals(arg1)) {
                    return var2;
                }
            }
            return -1;
        } else {
            return 6;
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(Z)I")
    public static final int method1324(boolean arg0) {
        field2970++;
        if (arg0) {
            field2968 = -9;
        }
        return 15;
    }
}
