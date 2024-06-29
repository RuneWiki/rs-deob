import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class347 extends class237 {

    @OriginalMember(owner = "client!ve", name = "n", descriptor = "Lao;")
    public static class188 field5261 = new class188(34, -1);

    @OriginalMember(owner = "client!ve", name = "k", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ve", name = "m", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!ve", name = "l", descriptor = "Lve;")
    public class347 field5259;

    @OriginalMember(owner = "client!ve", name = "o", descriptor = "Lve;")
    public class347 field5262;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II)I", line = 6)
    public static final int method2251(int arg0, int arg1) {
        field5260++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else {
            int var2 = 76 / ((arg0 - 22) / 39);
            if (arg1 == 6410 || arg1 == 34847) {
                return 6410;
            } else if (arg1 == 6402) {
                return 6402;
            } else {
                throw new IllegalArgumentException("");
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)V", line = 42)
    public final void method2252(byte arg0) {
        field5258++;
        if (this.field5259 == null) {
            return;
        }
        this.field5259.field5262 = this.field5262;
        if (arg0 == 122) {
            this.field5262.field5259 = this.field5259;
            this.field5259 = null;
            this.field5262 = null;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)V", line = 66)
    public static void method2253(byte arg0) {
        field5261 = null;
        int var1 = -102 / ((-arg0 - 59) / 43);
    }
}
