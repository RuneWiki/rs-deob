import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class186 {

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "I")
    public int field2433 = -1;

    @OriginalMember(owner = "client!vr", name = "g", descriptor = "I")
    public int field2438 = -1;

    @OriginalMember(owner = "client!vr", name = "e", descriptor = "[[B")
    public static byte[][] field2436 = new byte[50][];

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!vr", name = "f", descriptor = "[I")
    public int[] field2437;

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(BILbt;)V", line = 11)
    private final void method1229(byte arg0, int arg1, class88 arg2) {
        if (arg1 == 1) {
            this.field2433 = arg2.method568((byte) 110);
        } else if (arg1 == 2) {
            this.field2437 = new int[arg2.method617(2)];
            for (int var4 = 0; var4 < this.field2437.length; var4++) {
                this.field2437[var4] = arg2.method568((byte) 110);
            }
        } else if (arg1 == 3) {
            this.field2438 = arg2.method617(2);
        }
        field2434++;
        if (arg0 != 41) {
            field2436 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILbt;)V", line = 44)
    public final void method1230(int arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                field2432++;
                if (arg0 != 0) {
                    method1232((byte) 49);
                    return;
                }
                return;
            }
            this.method1229((byte) 41, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)V", line = 69)
    public static void method1231(int arg0) {
        field2436 = null;
        if (arg0 >= -63) {
            field2436 = null;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V", line = 81)
    public static final void method1232(byte arg0) {
        class333.field4260 = null;
        class63.field807 = false;
        class446.field6207 = null;
        if (arg0 > -10) {
            field2436 = null;
        }
        class138.field1849 = null;
        class385.field5065 = null;
        class512.field7534 = null;
        field2435++;
    }
}
