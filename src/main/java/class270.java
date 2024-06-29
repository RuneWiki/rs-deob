import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class270 extends class222 {

    @OriginalMember(owner = "client!h", name = "i", descriptor = "[B")
    public byte[] field4811;

    @OriginalMember(owner = "client!h", name = "l", descriptor = "Lcf;")
    public static class93 field4814 = class147.method1066("underlay", -48);

    @OriginalMember(owner = "client!h", name = "j", descriptor = "Lej;")
    public static class50 field4812 = new class50();

    @OriginalMember(owner = "client!h", name = "n", descriptor = "[Lcf;")
    public static class93[] field4816 = new class93[100];

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "[[[I")
    public static int[][][] field4815;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)I")
    public static int method1797(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ILhg;)V")
    public static final void method1798(int arg0, class177 arg1) {
        class288.field5144 = arg1.method1277(class212.field3891, (byte) 74);
        field4813++;
        class280.field5055 = arg1.method1277(class31.field500, (byte) 74);
        class172.field3018 = arg1.method1277(class43.field678, (byte) 74);
        class37.field567 = arg1.method1277(class169.field2983, (byte) 74);
        class227.field4063 = arg1.method1277(class288.field5153, (byte) 74);
        class29.field430 = arg1.method1277(class118.field2105, (byte) 74);
        class177.field3071 = arg1.method1277(class39.field611, (byte) 74);
        class238.field4258 = arg1.method1277(class180.field3178, (byte) 74);
        class180.field3179 = arg1.method1277(class242.field4373, (byte) 74);
        class46.field751 = arg1.method1277(class193.field3536, (byte) 74);
        class11.field150 = arg1.method1277(class44.field699, (byte) 74);
        class33.field519 = arg1.method1277(class218.field3978, (byte) 74);
        class143.field2481 = arg1.method1277(class182.field3365, (byte) 74);
        class159.field2797 = arg1.method1277(class267.field4752, (byte) 74);
        class38.field574 = arg1.method1277(class102.field1781, (byte) 74);
        class272.field4849 = arg1.method1277(client.field2722, (byte) 74);
        if (arg0 != 100) {
            field4816 = null;
        }
        class253.field4560 = arg1.method1277(class155.field2713, (byte) 74);
        class146.field2577 = arg1.method1277(class145.field2563, (byte) 74);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(Z)V")
    public static void method1799(boolean arg0) {
        field4816 = null;
        if (!arg0) {
            field4816 = null;
        }
        field4815 = null;
        field4812 = null;
        field4814 = null;
    }

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "([B)V")
    public class270(byte[] arg0) {
        this.field4811 = arg0;
    }
}
