import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class272 {

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "I")
    public static int field3589 = 104;

    @OriginalMember(owner = "client!kv", name = "c", descriptor = "[I")
    public static int[] field3590 = new int[1];

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ILoi;)V")
    public static final void method1626(int arg0, class74 arg1) {
        field3588++;
        int var2 = arg1.field843 - class406.field5732;
        int var3 = arg1.field826 * 512 + arg1.method543(arg0 ^ arg0) * 256;
        int var4 = arg1.field786 * 512 + arg1.method543(0) * 256;
        arg1.field2165 += (var4 - arg1.field2165) / var2;
        arg1.field2170 += (var3 - arg1.field2170) / var2;
        arg1.field894 = 0;
        if (arg1.field864 == 0) {
            arg1.method551(8192, arg0 - 20481);
        }
        if (arg1.field864 == 1) {
            arg1.method551(12288, -8193);
        }
        if (arg1.field864 == 2) {
            arg1.method551(0, -8193);
        }
        if (arg1.field864 == 3) {
            arg1.method551(4096, -8193);
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)V")
    public static void method1627(byte arg0) {
        if (arg0 > -103) {
            method1627((byte) 15);
        }
        field3590 = null;
    }
}
