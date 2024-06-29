import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class463 {

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public int field6733 = -1;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public int field6735 = -1;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[I")
    public int[] field6737;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lgk;B)V")
    public final void method2681(class468 arg0, byte arg1) {
        field6736++;
        while (true) {
            int var3 = arg0.method2765(79);
            if (var3 == 0) {
                int var4 = 101 % ((2 - arg1) / 45);
                return;
            }
            this.method2682(arg0, var3, 1);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lgk;II)V")
    private final void method2682(class468 arg0, int arg1, int arg2) {
        field6734++;
        if (arg1 == arg2) {
            this.field6733 = arg0.method2727((byte) 43);
        } else if (arg1 == 2) {
            this.field6737 = new int[arg0.method2765(arg2 + 87)];
            for (int var4 = 0; var4 < this.field6737.length; var4++) {
                this.field6737[var4] = arg0.method2727((byte) 43);
            }
        } else if (arg1 == 3) {
            this.field6735 = arg0.method2765(arg2 ^ 0x72);
        }
    }
}
