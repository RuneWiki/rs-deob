import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class656 implements class409 {

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "Lcb;")
    private class544 field9244;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "Lwu;")
    public class390 field9254;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "[Lae;")
    public static class261[] field9245 = new class261[37];

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "I")
    public static int field9248;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    public static int field9249;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field9250;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field9253;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "Lqda;")
    public class112 field9246;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Lfj;")
    public static class681 field9247;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)V", line = 6)
    public final void method811(boolean arg0) {
        field9252++;
        this.field9246 = class158.method1258(arg0, this.field9254.field5545, this.field9244);
        if (arg0) {
            this.method811(true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lkj;ILjava/lang/Object;)V", line = 21)
    public static final void method3758(class590 arg0, int arg1, Object arg2) {
        field9249++;
        if (arg0.field8335 == null || arg1 != 1) {
            return;
        }
        for (int var3 = 0; var3 < 50 && arg0.field8335.peekEvent() != null; var3++) {
            class117.method820(false, 1L);
        }
        try {
            if (arg2 != null) {
                arg0.field8335.postEvent(new ActionEvent(arg2, 1001, "dummy"));
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)Z", line = 48)
    public final boolean method814(byte arg0) {
        int var2 = -85 / ((arg0 + 65) / 37);
        field9253++;
        return this.field9244.method3131(-113, this.field9254.field5545);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V", line = 59)
    public static void method3759(byte arg0) {
        field9245 = null;
        if (arg0 != 61) {
            field9251 = 86;
        }
        field9247 = null;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZB)V", line = 75)
    public void method374(boolean arg0, byte arg1) {
        field9250++;
        if (arg1 != -105) {
            this.method811(false);
        }
        if (arg0) {
            int var3 = this.field9254.field5542.method2164(class785.field10790, arg1 ^ 0xFFFFFF97, this.field9246.method781()) + this.field9254.field5546;
            int var4 = this.field9254.field5540.method1378((byte) 24, class264.field3734, this.field9246.method792()) + this.field9254.field5544;
            this.field9246.method785(var3, var4);
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(Lcb;Lwu;)V", line = 95)
    public class656(class544 arg0, class390 arg1) {
        this.field9244 = arg0;
        this.field9254 = arg1;
    }
}
