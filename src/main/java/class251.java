import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lba")
public class class251 extends class335 {

    @OriginalMember(owner = "client!lba", name = "F", descriptor = "I")
    private int field3303;

    @OriginalMember(owner = "client!lba", name = "D", descriptor = "Ltt;")
    public static class338 field3301 = new class338(58, 4);

    @OriginalMember(owner = "client!lba", name = "B", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!lba", name = "G", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!lba", name = "E", descriptor = "Lvu;")
    public static class204 field3302;

    @OriginalMember(owner = "client!lba", name = "d", descriptor = "(I)V", line = 3)
    public static void method1528(int arg0) {
        if (arg0 <= -24) {
            field3302 = null;
            field3301 = null;
        }
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "()V", line = 16)
    public class251() {
        this(4096);
    }

    @OriginalMember(owner = "client!lba", name = "<init>", descriptor = "(I)V", line = 21)
    public class251(int arg0) {
        super(0, true);
        this.field3303 = 4096;
        this.field3303 = arg0;
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ZI)[I", line = 32)
    public final int[] method3(boolean arg0, int arg1) {
        ++field3300;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (!arg0) {
            return null;
        } else {
            if (super.field4525.field5435) {
                class2.method8(var3, 0, class649.field8968, this.field3303);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!lba", name = "a", descriptor = "(ILio;I)V", line = 61)
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg2 == -66) {
            ++field3304;
            if (arg0 == 0) {
                this.field3303 = (arg1.method930(arg2 + 321) << 12) / 255;
            }
        }
    }
}
