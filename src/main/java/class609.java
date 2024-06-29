import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class609 {

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "I")
    public int field8237 = 0;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public int field8241 = 0;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "Lqj;")
    private class535 field8234 = new class535(64);

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "Lhj;")
    private class595 field8245 = null;

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "Luq;")
    private class172 field8235;

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "Luq;")
    private class172 field8238;

    @OriginalMember(owner = "client!pm", name = "c", descriptor = "Ljb;")
    public static class519 field8236 = new class519(11, -2);

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Z")
    public static boolean field8244 = false;

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field8239;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field8240;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field8242;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "I")
    public static int field8243;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V")
    public static void method3390(byte arg0) {
        field8236 = null;
        if (arg0 != -32) {
            field8240 = -38;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(II)Lrg;")
    public final class667 method3391(int arg0, int arg1) {
        int var3 = -80 / ((arg1 + 51) / 49);
        field8239++;
        class667 var4 = (class667) this.field8234.method3109((byte) 126, (long) arg0);
        if (var4 != null) {
            return var4;
        }
        byte[] var5;
        if (arg0 < 32768) {
            var5 = this.field8235.method1188(1, -18047, arg0);
        } else {
            var5 = this.field8238.method1188(1, -18047, arg0 & 0x7FFF);
        }
        class667 var6 = new class667();
        var6.field8947 = this;
        if (var5 != null) {
            var6.method3676(new class254(var5), 25973);
        }
        if (arg0 >= 32768) {
            var6.method3675((byte) -39);
        }
        this.field8234.method3108((long) arg0, 16337, var6);
        return var6;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I[ILed;J)Ljava/lang/String;")
    public final String method3392(int arg0, int[] arg1, class732 arg2, long arg3) {
        if (arg0 != -32769) {
            field8240 = 7;
        }
        field8243++;
        if (this.field8245 != null) {
            String var6 = this.field8245.method2860(arg1, arg3, arg2, -13132);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(ILuq;Luq;Lhj;)V")
    public class609(int arg0, class172 arg1, class172 arg2, class595 arg3) {
        this.field8245 = arg3;
        this.field8235 = arg1;
        this.field8238 = arg2;
        if (this.field8235 != null) {
            this.field8237 = this.field8235.method1175(1, (byte) 94);
        }
        if (this.field8238 != null) {
            this.field8241 = this.field8238.method1175(1, (byte) 96);
        }
    }
}
