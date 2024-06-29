import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class648 {

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "Z")
    public boolean field8692 = true;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "C")
    private char field8688;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "I")
    public int field8689;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "Luu;")
    public static class237 field8694;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "Ljava/lang/String;")
    public String field8687;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)Z")
    public final boolean method3628(byte arg0) {
        if (arg0 != -16) {
            field8690 = 28;
        }
        field8693++;
        return this.field8688 == 's';
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(ILdc;)V")
    public final void method3629(int arg0, class63 arg1) {
        field8695++;
        if (arg0 != 0) {
            this.field8692 = false;
        }
        while (true) {
            int var3 = arg1.method505((byte) -119);
            if (var3 == 0) {
                return;
            }
            this.method3631(arg1, false, var3);
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V")
    public static void method3630(int arg0) {
        if (arg0 == -116) {
            field8694 = null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Ldc;ZI)V")
    private final void method3631(class63 arg0, boolean arg1, int arg2) {
        field8691++;
        if (arg1) {
            return;
        }
        if (arg2 == 1) {
            this.field8688 = class211.method1253(64, arg0.method491(arg1));
        } else if (arg2 == 2) {
            this.field8689 = arg0.method457(-14532);
        } else if (arg2 == 4) {
            this.field8692 = false;
            return;
        } else if (arg2 == 5) {
            this.field8687 = arg0.method479((byte) -74);
            return;
        }
    }
}
