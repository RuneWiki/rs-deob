import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class240 extends class197 {

    @OriginalMember(owner = "client!pm", name = "Q", descriptor = "I")
    public static int field4178 = -1;

    @OriginalMember(owner = "client!pm", name = "N", descriptor = "I")
    public static volatile int field4175 = -1;

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "Loh;")
    public static class258 field4179 = class153.method1046(")2", 106);

    @OriginalMember(owner = "client!pm", name = "O", descriptor = "Loh;")
    public static class258 field4176 = class153.method1046("; Max)2Age=", 107);

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "Loh;")
    public static class258 field4181 = class153.method1046("Sie k-Onnen sich selbst nicht selbst auf Ihre Ignorieren)2Liste setzen(Q", 91);

    @OriginalMember(owner = "client!pm", name = "M", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!pm", name = "P", descriptor = "Lgb;")
    public static class213 field4177;

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 9)
    public class240() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "(B)V", line = 13)
    public static void method1644(byte arg0) {
        field4177 = null;
        field4181 = null;
        if (arg0 <= -104) {
            field4176 = null;
            field4179 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)[I", line = 56)
    public final int[] method96(int arg0, int arg1) {
        if (arg0 != -16221) {
            this.method96(65, 121);
        }
        field4174++;
        int[] var3 = this.field3456.method2104(arg1, 0);
        if (this.field3456.field5115) {
            int[][] var4 = this.method1322(arg0 ^ 0xFFFFC0A3, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[2];
            int[] var7 = var4[1];
            for (int var8 = 0; var8 < class190.field3362; var8++) {
                var3[var8] = (var6[var8] + var7[var8] + var5[var8]) / 3;
            }
        }
        return var3;
    }
}
