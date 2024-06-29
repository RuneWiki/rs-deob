import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class542 {

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "Ljq;")
    private class475 field7570;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "J")
    public long field7563;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "J")
    public static long field7565 = -1L;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "I")
    public static int field7564;

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public static int field7566;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "I")
    public static int field7567;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field7568;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field7571;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "Lla;")
    public static class421 field7569;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)V")
    public static void method3124(int arg0) {
        field7569 = null;
        if (arg0 != -4670) {
            method3124(-106);
        }
    }

    @OriginalMember(owner = "client!pm", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field7570.method2856((byte) 127, this.field7563);
        field7568++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(I)V")
    public static final void method3125(int arg0) {
        class584.method3343((byte) 127);
        field7564++;
        class569.method3286(class527.field7429.field2660, -27377, 2, 22050);
        if (arg0 >= -93) {
            method3125(72);
        }
        class428.field6169 = class576.method3306(0, 22050, (byte) 37, class604.field8775, class699.field9853);
        class428.field6169.method918(class317.field4663, true);
        class589.field8482 = class576.method3306(1, 2048, (byte) 37, class604.field8775, class699.field9853);
        class589.field8482.method918(class50.field1184, true);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method3126(boolean arg0, int arg1, String arg2) {
        field7571++;
        if (arg2 == null) {
            return;
        }
        if (class296.field4436 >= 100) {
            class108.method974(4, class265.field3914.method1733(255, class140.field2466), arg1 ^ 0xF1B);
            return;
        }
        String var3 = class655.method3728(arg2, true);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class296.field4436; var4++) {
            String var9 = class655.method3728(class518.field7306[var4], true);
            if (var9 != null && var9.equals(var3)) {
                class108.method974(4, arg2 + class265.field3915.method1733(255, class140.field2466), 3867);
                return;
            }
            if (class291.field4370[var4] != null) {
                String var10 = class655.method3728(class291.field4370[var4], true);
                if (var10 != null && var10.equals(var3)) {
                    class108.method974(4, arg2 + class265.field3915.method1733(255, class140.field2466), arg1 ^ 0xF1B);
                    return;
                }
            }
        }
        for (int var5 = arg1; var5 < class164.field2749; var5++) {
            String var7 = class655.method3728(class343.field5109[var5], true);
            if (var7 != null && var7.equals(var3)) {
                class108.method974(4, class265.field3920.method1733(255, class140.field2466) + arg2 + class265.field3921.method1733(arg1 + 255, class140.field2466), 3867);
                return;
            }
            if (class673.field9579[var5] != null) {
                String var8 = class655.method3728(class673.field9579[var5], true);
                if (var8 != null && var8.equals(var3)) {
                    class108.method974(4, class265.field3920.method1733(arg1 ^ 0xFF, class140.field2466) + arg2 + class265.field3921.method1733(arg1 + 255, class140.field2466), 3867);
                    return;
                }
            }
        }
        if (class655.method3728(class532.field7456.field8631, true).equals(var3)) {
            class108.method974(4, class265.field3917.method1733(arg1 + 255, class140.field2466), arg1 + 3867);
            return;
        }
        class91.field1659++;
        class275 var6 = class185.method1355(0, class192.field3031, class395.field5772);
        var6.field4103.method693((byte) 106, class511.method3019(arg2, -99) + 1);
        var6.field4103.method750(117, arg2);
        var6.field4103.method693((byte) 106, arg0 ? 1 : 0);
        class140.method1141(var6, arg1 + 19321);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Ljq;JI)V")
    public class542(class475 arg0, long arg1, int arg2) {
        this.field7570 = arg0;
        this.field7563 = arg1;
    }
}
