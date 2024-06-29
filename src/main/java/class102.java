import jaggl.memory.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public class class102 extends class53 {

    @OriginalMember(owner = "client!ho", name = "s", descriptor = "Ljaggl/memory/NativeHeap;")
    public NativeHeap field1542;

    @OriginalMember(owner = "client!ho", name = "t", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ho", name = "v", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!ho", name = "w", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!ho", name = "x", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!ho", name = "u", descriptor = "Leb;")
    public static class439 field1544;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "(B)V")
    public static final void method757(byte arg0) {
        if (arg0 != -37) {
            field1544 = null;
        }
        class423.field6197.method1490(true);
        field1546++;
    }

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "(I)V")
    public static void method758(int arg0) {
        if (arg0 != 8) {
            field1544 = null;
        }
        field1544 = null;
    }

    @OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V")
    public class102(int arg0) {
        this.field1542 = new NativeHeap(arg0);
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(III)Z")
    public static final boolean method759(int arg0, int arg1, int arg2) {
        field1543++;
        if (arg0 <= 65) {
            return true;
        } else {
            return (arg2 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IIBLbf;)V")
    public static final void method760(int arg0, int arg1, byte arg2, class373 arg3) {
        class267.field3695[arg0][arg1] = arg3;
        if (arg2 != -44) {
            method761(null, -22, -53, 81, -64);
        }
        field1545++;
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Leo;IIII)V")
    public static final void method761(class194 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class36.method217(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class206.field2881) {
            class36.method217(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class36.method217(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class371.field5427) {
            class36.method217(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class371.field5427) {
            class36.method217(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class206.field2881 && arg4 <= class371.field5427) {
            class36.method217(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class36.method217(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class206.field2881 && arg4 > 0) {
            class36.method217(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ho", name = "e", descriptor = "(I)V")
    public final void method762(int arg0) {
        if (arg0 != 0) {
            method758(18);
        }
        this.field1542.method2601();
        field1547++;
    }
}
