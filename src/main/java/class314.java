import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class314 {

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "Lhb;")
    public static class318 field4749 = new class318(20);

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field4756 = new String[1000];

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public int field4751;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public int field4752;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public int field4753;

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "I")
    public int field4754;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "Llm;")
    public static class210 field4757;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(I)V", line = 14)
    public static final void method2157(int arg0) {
        field4750++;
        int var1 = 125 % ((-arg0) / 48);
        if (class22.field285 != null && class321.field4852 != null) {
            return;
        }
        class22.field285 = new int[256];
        class321.field4852 = new int[256];
        for (int var2 = 0; var2 < 256; var2++) {
            double var3 = (double) var2 / 255.0D * 6.283185307179586D;
            class22.field285[var2] = (int) (Math.sin(var3) * 4096.0D);
            class321.field4852[var2] = (int) (Math.cos(var3) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLlm;)V", line = 48)
    public static final void method2158(boolean arg0, class210 arg1) {
        class153.field2307 = arg1;
        if (arg0) {
            field4757 = (class210) null;
        }
        field4755++;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(I)V", line = 60)
    public static void method2159(int arg0) {
        if (arg0 < 55) {
            method2157(-15);
        }
        field4756 = null;
        field4749 = null;
        field4757 = null;
    }
}
