import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public class class577 {

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "I")
    public int field8095;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
    public int field8101;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
    public int field8096;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "I")
    public int field8098;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "Lkg;")
    public static class275 field8099 = new class275(3, 4);

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
    public static int field8093;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    public static int field8094;

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
    public static int field8097;

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "I")
    public static int field8100;

    @OriginalMember(owner = "client!fia", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field8094++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IZ)V", line = 11)
    public static final void method3300(int arg0, boolean arg1) {
        field8093++;
        class37 var2 = class636.method3571(10, arg0, -107);
        var2.method230(123);
        if (!arg1) {
            field8099 = null;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(I)V", line = 26)
    public static void method3301(int arg0) {
        field8099 = null;
        int var1 = 65 % ((48 - arg0) / 41);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIIIIIB)I", line = 44)
    public static final int method3302(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg3;
            arg3 = arg2;
            arg2 = var7;
        }
        field8100++;
        int var8 = arg5 & 0x3;
        if (var8 == 0) {
            return arg1;
        }
        if (arg6 >= -45) {
            method3302(-6, 97, -117, 23, 81, -27, (byte) 69);
        }
        if (var8 == 1) {
            return 8 - arg3 - arg4;
        } else if (var8 == 2) {
            return 7 + 1 - arg1 - arg2;
        } else {
            return arg4;
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(IIII)V", line = 78)
    public class577(int arg0, int arg1, int arg2, int arg3) {
        this.field8095 = arg3;
        this.field8101 = arg2;
        this.field8096 = arg0;
        this.field8098 = arg1;
    }
}
