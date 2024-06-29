import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public class class130 extends class533 {

    @OriginalMember(owner = "client!rw", name = "G", descriptor = "I")
    public static int field1804 = 0;

    @OriginalMember(owner = "client!rw", name = "H", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!rw", name = "I", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!rw", name = "E", descriptor = "Lwba;")
    public static class431 field1802;

    @OriginalMember(owner = "client!rw", name = "F", descriptor = "[B")
    private byte[] field1803;

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIII)[B")
    public final byte[] method760(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field1802 = null;
        }
        this.field1803 = new byte[arg0 * arg3 * arg2 * 2];
        field1805++;
        this.method481(arg0, arg3, (byte) -106, arg2);
        return this.field1803;
    }

    @OriginalMember(owner = "client!rw", name = "a", descriptor = "(IIB)V")
    public final void method761(int arg0, int arg1, byte arg2) {
        if (arg1 > -116) {
            return;
        }
        field1806++;
        int var4 = arg0 * 2;
        int var5 = arg2 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field1803[var10001] = (byte) (var5 * 3 >> 5);
        this.field1803[var6] = (byte) (var5 * 3 >> 5);
    }

    @OriginalMember(owner = "client!rw", name = "d", descriptor = "(I)V")
    public static void method762(int arg0) {
        if (arg0 != 3) {
            method762(-116);
        }
        field1802 = null;
    }

    @OriginalMember(owner = "client!rw", name = "<init>", descriptor = "()V")
    public class130() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }
}
