import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class242 {

    @OriginalMember(owner = "client!cl", name = "c", descriptor = "[[I")
    public static int[][] field3303 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
    public static int field3301;

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "[I")
    public static int[] field3302;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Ljava/awt/Frame;Llaa;B)V", line = 7)
    public static final void method1503(Frame arg0, class105 arg1, byte arg2) {
        field3301++;
        while (true) {
            class70 var3 = arg1.method768(arg0, 0);
            while (var3.field948 == 0) {
                class519.method2960(-33, 10L);
            }
            if (var3.field948 == 1) {
                arg0.setVisible(false);
                arg0.dispose();
                if (arg2 > -96) {
                    method1503(null, null, (byte) 93);
                    return;
                }
                return;
            }
            class519.method2960(-41, 100L);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V", line = 37)
    public static void method1504(byte arg0) {
        field3303 = null;
        if (arg0 != -120) {
            method1503(null, null, (byte) -18);
        }
        field3302 = null;
    }
}
