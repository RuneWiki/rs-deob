import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class22 {

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Z")
    public boolean field316 = true;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public int field320;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public int field315;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public int field314;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public int field311;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public int field313;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public int field318;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static volatile int field309 = 0;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field317 = 0;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field310 = 0;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public static int field312 = -1;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(II)Ldk;")
    public static final class283 method200(int arg0, int arg1) {
        field319++;
        class283 var2 = (class283) class75.field1251.method1887(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class38.field542.method1590(arg1, (byte) -25, 32);
        class283 var4 = new class283();
        int var5 = 101 / ((arg0 + 88) / 38);
        if (var3 != null) {
            var4.method1899(new class88(var3), 119);
        }
        var4.method1902(-2);
        class75.field1251.method1886(-63, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class22(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field320 = arg4;
        this.field315 = arg5;
        this.field314 = arg3;
        this.field311 = arg1;
        this.field313 = arg0;
        this.field316 = arg6;
        this.field318 = arg2;
    }
}
