import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class316 extends class329 {

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public int field4057 = -1;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "Z")
    public boolean field4054 = false;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lrga;")
    public static class280 field4059 = new class280(11, 3);

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field4060 = 503;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public static int field4063 = -1;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public int field4053;

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "I")
    public int field4055;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public int field4056;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field4058;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public int field4062;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "Lpl;")
    public static class612 field4061;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([Llo;II)V")
    public static final void method1824(class488[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class488 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field6455;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field6455 < (var7 & 0x1) + var6) {
                class488 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1824(arg0, arg1, var4 - 1);
        method1824(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method1825(int arg0) {
        if (arg0 == 17391) {
            field4061 = null;
            field4059 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "(I)V")
    public class316(int arg0) {
        this.field4057 = arg0;
    }
}
