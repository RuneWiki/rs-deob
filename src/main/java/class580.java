import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!v")
public class class580 {

    @OriginalMember(owner = "client!v", name = "f", descriptor = "J")
    public long field8133;

    @OriginalMember(owner = "client!v", name = "c", descriptor = "Lac;")
    private class541 field8130;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "I")
    public static int field8128;

    @OriginalMember(owner = "client!v", name = "d", descriptor = "I")
    public static int field8131;

    @OriginalMember(owner = "client!v", name = "e", descriptor = "I")
    public static int field8132;

    @OriginalMember(owner = "client!v", name = "b", descriptor = "Liu;")
    public static class579 field8129;

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3243(String arg0, int arg1) {
        field8132++;
        if (arg1 != 2 || arg0.equals("")) {
            return;
        }
        class546.field7711++;
        class103 var2 = class752.method4186(arg1 ^ 0x106, class617.field8650, class449.field6285);
        var2.field1379.method3393(class601.method3326(arg0, (byte) 74), arg1 ^ 0xFFFFFFBF);
        var2.field1379.method3387(arg0, (byte) 113);
        class27.method104(false, var2);
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(IIB)I")
    public static final int method3244(int arg0, int arg1, byte arg2) {
        field8131++;
        if (arg1 == -2) {
            return 12345678;
        }
        if (arg2 != -21) {
            method3245(-112);
        }
        if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        }
        int var3 = (arg1 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg1 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!v", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8130.method2998(false, this.field8133);
        field8128++;
        super.finalize();
    }

    @OriginalMember(owner = "client!v", name = "a", descriptor = "(I)V")
    public static void method3245(int arg0) {
        field8129 = null;
        if (arg0 > -68) {
            field8129 = null;
        }
    }

    @OriginalMember(owner = "client!v", name = "<init>", descriptor = "(Lac;JI)V")
    public class580(class541 arg0, long arg1, int arg2) {
        this.field8133 = arg1;
        this.field8130 = arg0;
    }
}
