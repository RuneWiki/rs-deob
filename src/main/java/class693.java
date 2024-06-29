import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class693 {

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public int field9631;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    private int field9627;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field9628;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field9630;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field9632;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)S")
    public static final short method3882(int arg0, int arg1) {
        field9629++;
        int var2 = arg0 >> 10 & arg1;
        int var3 = arg0 >> 3 & 0x70;
        int var4 = arg0 & 0x7F;
        int var5 = var4 <= 64 ? var3 * var4 >> 7 : (127 - var4) * var3 >> 7;
        int var6 = var4 + var5;
        int var7;
        if (var6 == 0) {
            var7 = var5 << 1;
        } else {
            var7 = (var5 << 8) / var6;
        }
        return (short) (var2 << 10 | var7 >> 4 << 7 | var6);
    }

    @OriginalMember(owner = "client!hg", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9630++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)I")
    public final int method3883(int arg0) {
        field9632++;
        if (arg0 != -35424733) {
            this.field9631 = 50;
        }
        return this.field9627;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(II)V")
    public class693(int arg0, int arg1) {
        this.field9631 = arg1;
        this.field9627 = arg0;
    }
}
