import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class415 {

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public int field6014;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field6010;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field6011;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(I)V")
    public static void method2532(int arg0) {
        field6011 = null;
        int var1 = 15 / ((54 - arg0) / 55);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BI)Llk;")
    public static final class545 method2533(byte arg0, int arg1) {
        int var2 = 117 % (arg0 / 41);
        field6013++;
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (class156.field2667[var3] == null || class156.field2667[var3][var4] == null) {
            boolean var5 = class225.method1539(var3, 4);
            if (!var5) {
                return null;
            }
        }
        return class156.field2667[var3][var4];
    }

    @OriginalMember(owner = "client!pr", name = "<init>", descriptor = "(I)V")
    public class415(int arg0) {
        this.field6014 = arg0;
    }

    @OriginalMember(owner = "client!pr", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6010++;
        throw new IllegalStateException();
    }
}
