import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public class class606 extends class437 {

    @OriginalMember(owner = "client!rs", name = "B", descriptor = "Ljava/lang/Object;")
    private Object field8815;

    @OriginalMember(owner = "client!rs", name = "D", descriptor = "Lsb;")
    public static class266 field8817 = new class266(79, 3);

    @OriginalMember(owner = "client!rs", name = "C", descriptor = "I")
    public static int field8816;

    @OriginalMember(owner = "client!rs", name = "E", descriptor = "I")
    public static int field8818;

    @OriginalMember(owner = "client!rs", name = "F", descriptor = "I")
    public static int field8819;

    @OriginalMember(owner = "client!rs", name = "G", descriptor = "I")
    public static int field8820;

    @OriginalMember(owner = "client!rs", name = "H", descriptor = "I")
    public static int field8821;

    @OriginalMember(owner = "client!rs", name = "I", descriptor = "I")
    public static int field8822;

    @OriginalMember(owner = "client!rs", name = "J", descriptor = "I")
    public static int field8823;

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(B)V")
    public static final void method3488(byte arg0) {
        field8820++;
        class486.field6963.method3619(14288);
        class601.method3433(0);
        class547.field7769 = null;
        class158.field2698 = null;
        if (arg0 <= 97) {
            method3491(-104, (byte) -89);
        }
        class635.field9123 = null;
        class126.field2299.field1393 = 0;
        class445.field6405 = 0;
        class482.field6915 = 0;
        class210.method1465(0);
        class335.field5017 = null;
        class164.field2749 = 0;
        class694.field9773 = 0;
        class396.field5780 = null;
        class394.field5756 = 0;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "([BILjava/io/File;B)V")
    public static final void method3489(byte[] arg0, int arg1, File arg2, byte arg3) throws IOException {
        field8819++;
        DataInputStream var4 = new DataInputStream(new BufferedInputStream(new FileInputStream(arg2)));
        try {
            var4.readFully(arg0, 0, arg1);
        } catch (EOFException var5) {
        }
        var4.close();
        if (arg3 != 123) {
            method3490(false);
        }
    }

    @OriginalMember(owner = "client!rs", name = "g", descriptor = "(I)Z")
    public final boolean method2650(int arg0) {
        field8821++;
        if (arg0 != -1) {
            this.method2649(66);
        }
        return false;
    }

    @OriginalMember(owner = "client!rs", name = "b", descriptor = "(Z)V")
    public static void method3490(boolean arg0) {
        if (!arg0) {
            method3488((byte) 114);
        }
        field8817 = null;
    }

    @OriginalMember(owner = "client!rs", name = "<init>", descriptor = "(Lbga;Ljava/lang/Object;I)V")
    public class606(class329 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field8815 = arg1;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2649(int arg0) {
        if (arg0 >= -121) {
            method3488((byte) -57);
        }
        field8818++;
        return this.field8815;
    }

    @OriginalMember(owner = "client!rs", name = "a", descriptor = "(IB)V")
    public static final void method3491(int arg0, byte arg1) {
        field8816++;
        class287 var2 = class395.field5768;
        synchronized (class395.field5768) {
            class395.field5768.method1908(arg0, (byte) -11);
        }
        class287 var3 = class319.field4696;
        synchronized (class319.field4696) {
            class319.field4696.method1908(arg0, (byte) -11);
        }
        if (arg1 != -103) {
            method3491(-28, (byte) 96);
        }
    }
}
