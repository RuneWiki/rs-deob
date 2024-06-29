import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class646 extends class219 {

    @OriginalMember(owner = "client!of", name = "w", descriptor = "[[S")
    public short[][] field9105;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "D")
    public double field9102;

    @OriginalMember(owner = "client!of", name = "u", descriptor = "[Lhm;")
    public static class229[] field9103 = new class229[4];

    @OriginalMember(owner = "client!of", name = "v", descriptor = "I")
    public static int field9104;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field9106;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lkj;BLjava/awt/Frame;)V")
    public static final void method3693(class590 arg0, byte arg1, Frame arg2) {
        field9104++;
        while (true) {
            class370 var3 = arg0.method3416(16, arg2);
            while (var3.field5314 == 0) {
                class117.method820(false, 10L);
            }
            if (var3.field5314 == 1) {
                int var4 = 55 % ((18 - arg1) / 49);
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class117.method820(false, 100L);
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)J")
    public final long method3694(byte arg0) {
        int var2 = 19 / ((arg0 + 82) / 39);
        field9106++;
        return (long) (this.field9105.length << 0 | this.field9105[0].length);
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
    public static void method3695(int arg0) {
        field9103 = null;
        if (arg0 != 14058) {
            field9103 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "([[SD)V")
    public class646(short[][] arg0, double arg1) {
        this.field9105 = arg0;
        this.field9102 = arg1;
    }
}
