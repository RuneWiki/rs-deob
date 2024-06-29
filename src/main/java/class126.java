import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public abstract class class126 {

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public static int field2302 = 0;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "[I")
    public static int[] field2305 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!o", name = "e", descriptor = "I")
    public static int field2306 = 0;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "Lqf;")
    public static class150 field2304 = null;

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)I")
    public abstract int method225(int arg0);

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method224(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method770(int arg0) {
        field2305 = null;
        field2304 = null;
        if (arg0 != 0) {
            method770(12);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method226(int arg0, Component arg1);

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(I)V")
    public static final void method771(int arg0) {
        class64.method404(arg0 ^ 0xFFFFFF99, class37.field726);
        field2303++;
        client.field594++;
        if (class63.field1169 && class56.field1024) {
            if (arg0 != -2) {
                method771(-31);
            }
            int var1 = class22.field459;
            int var2 = var1 - class44.field818;
            if (var2 < class69.field1291) {
                var2 = class69.field1291;
            }
            if (class37.field726.field2875 + var2 > class69.field1291 + class180.field3498.field2875) {
                var2 = class180.field3498.field2875 + class69.field1291 - class37.field726.field2875;
            }
            int var3 = class150.field2806;
            int var4 = var3 - class172.field3331;
            int var5 = var2 - class155.field2983;
            int var6 = class37.field726.field2819;
            if (class64.field1189 > var4) {
                var4 = class64.field1189;
            }
            if (class64.field1189 + class180.field3498.field2770 < class37.field726.field2770 + var4) {
                var4 = class64.field1189 + class180.field3498.field2770 - class37.field726.field2770;
            }
            int var7 = var4 - class58.field1098;
            int var8 = class180.field3498.field2811 + var4 - class64.field1189;
            int var9 = var2 + class180.field3498.field2860 - class69.field1291;
            if (class37.field726.field2814 < client.field594 && (var5 > var6 || -var6 > var5 || var6 < var7 || var7 < -var6)) {
                class7.field184 = true;
            }
            if (class37.field726.field2804 != null && class7.field184) {
                class200 var10 = new class200();
                var10.field3904 = var8;
                var10.field3913 = var9;
                var10.field3907 = class37.field726;
                var10.field3911 = class37.field726.field2804;
                class172.method1147(-19955, var10);
            }
            if (class32.field684 == 0) {
                if (class7.field184) {
                    if (class37.field726.field2880 != null) {
                        class200 var11 = new class200();
                        var11.field3907 = class37.field726;
                        var11.field3913 = var9;
                        var11.field3909 = field2304;
                        var11.field3904 = var8;
                        var11.field3911 = class37.field726.field2880;
                        class172.method1147(arg0 ^ 0x4DF3, var11);
                    }
                    if (field2304 != null && class125.method767(-7472, class37.field726) != null) {
                        class141.field2621.method1024(84, (byte) -94);
                        class182.field3548++;
                        class141.field2621.method797(field2304.field2850, false);
                        class141.field2621.method774(112, class37.field726.field2878);
                        class141.field2621.method810((byte) 99, class37.field726.field2850);
                        class141.field2621.method802((byte) 64, field2304.field2878);
                    }
                } else if ((class112.field2054 == 1 || class149.method977(class20.field436 - 1, 102)) && class20.field436 > 2) {
                    class91.method534((byte) 125);
                } else if (class20.field436 > 0) {
                    class60.method375((byte) 17, class20.field436 - 1);
                }
                class37.field726 = null;
            }
        } else if (client.field594 > 1) {
            class37.field726 = null;
        }
    }
}
