import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class212 extends class105 {

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public int field3222;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "Lqe;")
    public class218 field3224;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "[B")
    public byte[] field3223;

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)[B", line = 9)
    public final byte[] method697(int arg0) {
        int var2 = -10 / ((24 - arg0) / 40);
        field3221++;
        if (this.field1513) {
            throw new RuntimeException();
        }
        return this.field3223;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)I", line = 28)
    public final int method696(byte arg0) {
        if (arg0 < 97) {
            this.method696((byte) 106);
        }
        field3220++;
        return this.field1513 ? 0 : 100;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZI)V", line = 44)
    public static final void method1439(int arg0, boolean arg1, int arg2) {
        class211 var3 = class17.method115(1, arg0, 4086);
        var3.method1433(arg1);
        var3.field3210 = arg2;
        field3225++;
    }
}
