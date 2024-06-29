import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class61 {

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public int field1257 = -1;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public int field1260 = -1;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!in", name = "f", descriptor = "[B")
    public static byte[] field1261 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!in", name = "a", descriptor = "I")
    public static int field1256;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "[I")
    public int[] field1259;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IILnn;)V")
    private final void method542(int arg0, int arg1, class289 arg2) {
        if (arg1 != -3) {
            this.method543(null, 20);
        }
        field1263++;
        if (arg0 == 1) {
            this.field1257 = arg2.method1841((byte) -128);
        } else if (arg0 == 2) {
            this.field1259 = new int[arg2.method1858(-3256)];
            for (int var4 = 0; var4 < this.field1259.length; var4++) {
                this.field1259[var4] = arg2.method1841((byte) -7);
            }
            return;
        } else if (arg0 == 3) {
            this.field1260 = arg2.method1858(-3256);
            return;
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Lnn;I)V")
    public final void method543(class289 arg0, int arg1) {
        field1258++;
        if (arg1 <= 101) {
            return;
        }
        while (true) {
            int var3 = arg0.method1858(-3256);
            if (var3 == 0) {
                return;
            }
            this.method542(var3, -3, arg0);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z)V")
    public static void method544(boolean arg0) {
        field1261 = null;
        if (arg0) {
            method544(true);
        }
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(III)Lse;")
    public static final class170 method545(int arg0, int arg1, int arg2) {
        class234 var3 = class518.field7511[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class170 var4 = var3.field3618;
            var3.field3618 = null;
            return var4;
        }
    }
}
