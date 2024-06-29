import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gf")
public class class30 extends OutputStream {

    @OriginalMember(owner = "client!gf", name = "c", descriptor = "Z")
    public static boolean field564 = false;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "I")
    public static int field562;

    @OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!gf", name = "d", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V", line = 6)
    public static final void method239(byte arg0) {
        field566++;
        class72.field1501 = 0;
        class14.field263.field3249 = 0;
        class97.field1711 = -1;
        class250.field3926 = 0;
        class290.field4459 = false;
        if (arg0 >= -115) {
            method239((byte) 31);
        }
        class224.field3532 = 0;
        class301.field4559 = -1;
        class85.field1607 = 0;
        class190.field3082.field3249 = 0;
        class318.field4799 = -1;
        class313.field4757 = 0;
        class209.field3383 = -1;
        class48.field999 = 0;
        for (int var1 = 0; var1 < class97.field1715.length; var1++) {
            if (class97.field1715[var1] != null) {
                class97.field1715[var1].field1878 = -1;
            }
        }
        for (int var2 = 0; var2 < class8.field179.length; var2++) {
            if (class8.field179[var2] != null) {
                class8.field179[var2].field1878 = -1;
            }
        }
        class80.method581(64);
        class135.field2271 = 1;
        class9.method79((byte) -101, 30);
        for (int var3 = 0; var3 < 100; var3++) {
            class337.field5220[var3] = true;
        }
        class35.method284(118);
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(ILag;)Lvc;", line = 70)
    public static final class67 method240(int arg0, class202 arg1) {
        field565++;
        if (arg0 != 1) {
            method240(50, (class202) null);
        }
        return new class67(arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1356(false), arg1.method1352((byte) 122), arg1.method1352((byte) 127), arg1.method1317((byte) -108));
    }

    @OriginalMember(owner = "client!gf", name = "write", descriptor = "(I)V", line = 82)
    public final void write(int arg0) throws IOException {
        field562++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!gf", name = "a", descriptor = "(IIB)I", line = 96)
    public static final int method241(int arg0, int arg1, byte arg2) {
        int var3 = class189.method1212(arg0 - 1, false, arg1 - 1) + (class189.method1212(arg0 + 1, false, arg1 - 1) - (-class189.method1212(arg0 - 1, false, arg1 + 1) - class189.method1212(arg0 + 1, false, arg1 + 1)));
        field563++;
        int var4 = class189.method1212(arg0 - 1, false, arg1) - (-class189.method1212(arg0 + 1, false, arg1) + (-class189.method1212(arg0, false, arg1 - 1) - class189.method1212(arg0, false, arg1 + 1)));
        int var5 = -103 % ((arg2 + 15) / 61);
        int var6 = class189.method1212(arg0, false, arg1);
        return var4 / 8 + (var3 / 16 + (var6 / 4));
    }
}
