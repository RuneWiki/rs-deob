import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class249 {

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "Luf;")
    public static class168 field4255 = class148.method1019(-1720, "<br>");

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Z")
    public static boolean field4257 = false;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lch;")
    public static class95 field4262 = new class95(5000);

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field4259;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "[[[B")
    public static byte[][][] field4254;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V", line = 8)
    public static void method1707(int arg0) {
        field4254 = (byte[][][]) null;
        if (arg0 != -1477252336) {
            field4255 = (class168) null;
        }
        field4255 = null;
        field4262 = null;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)I", line = 36)
    public static final int method1708(byte arg0) {
        field4260++;
        return arg0 < 88 ? -24 : 2;
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIII)I", line = 53)
    public static final int method1709(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = arg3 - class173.field2818[arg0 * 1024 / arg4] >> 1;
        field4261++;
        return ((65536 - var5) * arg2 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILuf;)V", line = 62)
    public static final void method1710(int arg0, int arg1, class168 arg2) {
        field4256++;
        class168 var3 = arg2.method1215(4767).method1216(-32471);
        boolean var4 = false;
        int var5 = 0;
        if (arg0 >= -34) {
            field4255 = (class168) null;
        }
        while (var5 < class167.field2676) {
            class54 var6 = class9.field117[class281.field4719[var5]];
            if (var6 != null && var6.field658 != null && var6.field658.method1194(var3, -26023)) {
                var4 = true;
                class240.method1623(2, false, (byte) 80, class266.field4489.field3020[0], 0, var6.field3020[0], 1, 0, class266.field4489.field3033[0], 0, 1, var6.field3033[0]);
                if (arg1 == 1) {
                    field4262.method726(78, 2138389379);
                    class55.field718++;
                    field4262.method1076(class281.field4719[var5], -42);
                } else if (arg1 == 4) {
                    class39.field484++;
                    field4262.method726(140, 2138389379);
                    field4262.method1076(class281.field4719[var5], 100);
                } else if (arg1 == 5) {
                    field4262.method726(135, 2138389379);
                    field4262.method1050(class281.field4719[var5], -29944);
                    class295.field4998++;
                } else if (arg1 == 6) {
                    class206.field3387++;
                    field4262.method726(40, 2138389379);
                    field4262.method1050(class281.field4719[var5], -29944);
                } else if (arg1 == 7) {
                    class199.field3289++;
                    field4262.method726(126, 2138389379);
                    field4262.method1076(class281.field4719[var5], -29);
                }
                break;
            }
            var5++;
        }
        if (!var4) {
            class266.method1850(0, class134.method938((byte) -126, new class168[] { class150.field2323, var3 }), class182.field2934, -27);
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 143)
    public static final void method1711(Component arg0, int arg1) {
        arg0.removeKeyListener(class55.field704);
        arg0.removeFocusListener(class55.field704);
        if (arg1 == -1477252336) {
            field4259++;
            class280.field4705 = -1;
        }
    }
}
