import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class332 extends class115 {

    @OriginalMember(owner = "client!bw", name = "o", descriptor = "Lpq;")
    public static class52 field5150 = new class52();

    @OriginalMember(owner = "client!bw", name = "u", descriptor = "[I")
    public static int[] field5156 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!bw", name = "q", descriptor = "F")
    public static float field5152;

    @OriginalMember(owner = "client!bw", name = "k", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!bw", name = "m", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!bw", name = "n", descriptor = "I")
    public int field5149;

    @OriginalMember(owner = "client!bw", name = "t", descriptor = "I")
    public int field5155;

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "[I")
    public int[] field5145;

    @OriginalMember(owner = "client!bw", name = "r", descriptor = "[I")
    public int[] field5153;

    @OriginalMember(owner = "client!bw", name = "s", descriptor = "[I")
    public int[] field5154;

    @OriginalMember(owner = "client!bw", name = "i", descriptor = "[Ltf;")
    public class533[] field5144;

    @OriginalMember(owner = "client!bw", name = "p", descriptor = "[Ltf;")
    public class533[] field5151;

    @OriginalMember(owner = "client!bw", name = "l", descriptor = "[[[B")
    public byte[][][] field5147;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)V", line = 13)
    public static void method2050(int arg0) {
        if (arg0 != -14861) {
            field5150 = null;
        }
        field5156 = null;
        field5150 = null;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lec;BLjava/awt/Frame;)V", line = 26)
    public static final void method2051(class109 arg0, byte arg1, Frame arg2) {
        field5146++;
        while (true) {
            class533 var3 = arg0.method831(10000, arg2);
            while (var3.field7848 == 0) {
                class389.method2332(99, 10L);
            }
            if (var3.field7848 == 1) {
                arg2.setVisible(false);
                arg2.dispose();
                int var4 = 6 % ((arg1 + 28) / 45);
                return;
            }
            class389.method2332(-8, 100L);
        }
    }
}
