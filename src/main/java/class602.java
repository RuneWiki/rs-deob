import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class602 {

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public int field8148;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    private int field8145;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field8144 = 0;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "Lkr;")
    public static class602 field8146 = new class602(23, 10);

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "Z")
    public static boolean field8149 = false;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field8143;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field8147;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field8150;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "[S")
    public static short[] field8142;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V", line = 6)
    public static void method3431(byte arg0) {
        field8146 = null;
        field8142 = null;
        int var1 = -12 / ((arg0 - 51) / 43);
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V", line = 16)
    public static final void method3432(byte arg0) {
        field8143++;
        if (!class49.field736) {
            return;
        }
        int var1 = 22 / (-arg0 / 49);
        while (true) {
            while (class76.field1114 < class462.field6425.length) {
                class370 var2 = class462.field6425[class76.field1114];
                if (var2 != null && var2.field5225 == -1) {
                    if (class81.field1175 == null) {
                        class81.field1175 = class67.field1040.method2533(var2.field5224, true);
                    }
                    int var3 = class81.field1175.field3930;
                    if (var3 == -1) {
                        return;
                    }
                    var2.field5225 = var3;
                    class76.field1114++;
                    class81.field1175 = null;
                } else {
                    class76.field1114++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!kr", name = "toString", descriptor = "()Ljava/lang/String;", line = 58)
    public final String toString() {
        field8150++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(II)V", line = 73)
    public class602(int arg0, int arg1) {
        this.field8148 = arg1;
        this.field8145 = arg0;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)I", line = 82)
    public final int method3433(int arg0) {
        field8147++;
        if (arg0 != -1) {
            this.field8148 = 93;
        }
        return this.field8145;
    }
}
