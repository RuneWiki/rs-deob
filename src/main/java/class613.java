import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class613 {

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public int field8656 = -1;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public int field8652 = -1;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "Lkfa;")
    public static class549 field8651 = new class549(10, 4);

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "[I")
    public static int[] field8658 = new int[1];

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field8657 = 0;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field8654;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field8655;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field8659;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "[I")
    public int[] field8653;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 3)
    public static void method3423(int arg0) {
        field8658 = null;
        field8651 = null;
        if (arg0 != -1) {
            method3424(97, null, true, 81, 3, 126);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjo;ZIII)V", line = 15)
    public static final void method3424(int arg0, class303 arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var6 = -11 % ((arg0 + 16) / 32);
        class385.field5149 = arg2;
        field8654++;
        class692.field9747 = arg1;
        class36.field411 = arg5;
        class41.field434 = arg4;
        class377.field4896 = arg3;
        class636.field9006 = 1;
        class602.field8542 = 10000;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IILiaa;)V", line = 33)
    private final void method3425(int arg0, int arg1, class452 arg2) {
        field8659++;
        if (arg0 != -1) {
            this.method3426(null, (byte) 19);
        }
        if (arg1 == 1) {
            this.field8652 = arg2.method2574(-1758460248);
        } else if (arg1 == 2) {
            this.field8653 = new int[arg2.method2541(arg0 ^ 0xFFFFFF88)];
            for (int var4 = 0; var4 < this.field8653.length; var4++) {
                this.field8653[var4] = arg2.method2574(-1758460248);
            }
        } else if (arg1 == 3) {
            this.field8656 = arg2.method2541(57);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Liaa;B)V", line = 66)
    public final void method3426(class452 arg0, byte arg1) {
        field8655++;
        if (arg1 != -3) {
            return;
        }
        while (true) {
            int var3 = arg0.method2541(116);
            if (var3 == 0) {
                return;
            }
            this.method3425(-1, var3, arg0);
        }
    }
}
