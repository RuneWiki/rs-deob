import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class126 {

    @OriginalMember(owner = "client!lfa", name = "c", descriptor = "[F")
    public static float[] field1593 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!lfa", name = "b", descriptor = "Lhj;")
    public static class596 field1592 = new class596(59, 0);

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "I")
    public static int field1591;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)I", line = 6)
    public static final int method968(int arg0, int arg1, int arg2) {
        field1591++;
        int var3 = 0;
        while (arg1 > 0) {
            var3 = arg0 & 0x1 | var3 << 1;
            arg0 >>>= 0x1;
            arg1--;
        }
        if (arg2 > -34) {
            method969(-81);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V", line = 46)
    public static void method969(int arg0) {
        field1592 = null;
        if (arg0 != 11249) {
            method969(12);
        }
        field1593 = null;
    }
}
