import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class387 extends class535 {

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "Lqv;")
    public static class316 field5511 = new class316(67, -1);

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public static int field5513 = 0;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public static int field5509;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "I")
    public static int field5512;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Laa;")
    public static class343 field5510;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)[I", line = 7)
    public final int[] method65(int arg0, int arg1) {
        ++field5509;
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int[][] var4 = this.method3157((byte) 67, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; var8 < class174.field2597; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        if (arg1 != 1) {
            this.method65(-44, 45);
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V", line = 47)
    public class387() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V", line = 53)
    public static void method2343(boolean arg0) {
        field5510 = null;
        if (arg0) {
            method2343(false);
        }
        field5511 = null;
    }
}
