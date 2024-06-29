import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class308 {

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "[Lvk;")
    public static class272[] field4209 = new class272[4];

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "[Laq;")
    public static class385[] field4210;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZILes;)V")
    public static final void method1863(boolean arg0, int arg1, class75 arg2) {
        field4211++;
        int var3 = -1;
        if (arg0) {
            field4209 = null;
        }
        int var4 = 0;
        if (class356.field4972 < arg2.field1129) {
            class5.method76((byte) 94, arg2);
        } else if (arg2.field1131 < class356.field4972) {
            class99.method630(arg2, 1, false);
            var3 = class367.field5225;
            var4 = class58.field914;
        } else {
            class234.method1472(arg2, (byte) 127);
        }
        if (arg2.field6765 < 128 || arg2.field6746 < 128 || arg2.field6765 >= class200.field2875 * 128 - 128 || arg2.field6746 >= ((class422.field5811 - 1) * 128)) {
            arg2.field1131 = 0;
            arg2.field1128 = -1;
            var4 = 0;
            var3 = -1;
            arg2.field1079 = -1;
            arg2.field1129 = 0;
            arg2.field6765 = arg2.field1144[0] * 128 + (arg2.method206(0) * 64);
            arg2.field6746 = arg2.field1140[0] * 128 + arg2.method206(0) * 64;
            arg2.method509(2);
        }
        if (class2.field21 == arg2 && (arg2.field6765 < 1536 || arg2.field6746 < 1536 || (class200.field2875 * 128 - 1536) <= arg2.field6765 || (class422.field5811 * 128 - 1536) <= arg2.field6746)) {
            arg2.field1128 = -1;
            arg2.field1079 = -1;
            arg2.field1129 = 0;
            var3 = -1;
            arg2.field1131 = 0;
            var4 = 0;
            arg2.field6765 = arg2.field1144[0] * 128 + (arg2.method206(0) * 64);
            arg2.field6746 = arg2.field1140[0] * 128 + (arg2.method206(0) * 64);
            arg2.method509(2);
        }
        int var5 = class286.method1766(120, arg2);
        class438.method2543(var4, 121, var3, var5, arg2);
        class31.method246((byte) 56, arg2);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method1864(int arg0) {
        field4210 = null;
        field4209 = null;
        int var1 = -46 / ((arg0 - 7) / 46);
    }
}
