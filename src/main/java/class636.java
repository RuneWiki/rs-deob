import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class636 implements class126 {

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "Lvd;")
    private class39 field8938;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lqe;")
    public static class469 field8933 = new class469(47, 6);

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field8934;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field8937;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "Lvd;")
    public static class39 field8936;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Lgj;")
    public final class637 method27(int arg0) {
        field8937++;
        if (arg0 > -40) {
            this.field8938 = null;
        }
        return class637.field8939;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)V")
    public static void method3658(int arg0) {
        field8936 = null;
        field8933 = null;
        if (arg0 > -40) {
            method3659((byte) 30);
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    public static final void method3659(byte arg0) {
        field8935++;
        int[] var1 = new int[class336.field4876.field4676];
        int var2 = 0;
        if (arg0 >= -8) {
            return;
        }
        for (int var3 = 0; var3 < class336.field4876.field4676; var3++) {
            class578 var5 = class336.field4876.method2079(var3, (byte) -36);
            if (var5.field8235 >= 0 || var5.field8171 >= 0) {
                var1[var2++] = var3;
            }
        }
        class574.field8112 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class574.field8112[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lvd;)V")
    public class636(class39 arg0) {
        this.field8938 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)I")
    public final int method31(byte arg0) {
        field8934++;
        if (this.field8938.method220(-15563)) {
            return 100;
        } else {
            if (arg0 > -16) {
                field8933 = null;
            }
            return this.field8938.method216((byte) 115);
        }
    }
}
