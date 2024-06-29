import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class169 extends class362 {

    @OriginalMember(owner = "client!kt", name = "y", descriptor = "Lju;")
    public static class137 field2709 = new class137(0, 8);

    @OriginalMember(owner = "client!kt", name = "E", descriptor = "Lwg;")
    public static class450 field2714 = new class450(15, 0, 1, 0);

    @OriginalMember(owner = "client!kt", name = "G", descriptor = "[Lfr;")
    public static class434[] field2716 = new class434[100];

    @OriginalMember(owner = "client!kt", name = "z", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!kt", name = "A", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!kt", name = "B", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!kt", name = "D", descriptor = "I")
    public static int field2713;

    @OriginalMember(owner = "client!kt", name = "F", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "(B)V", line = 4)
    public static void method1301(byte arg0) {
        field2714 = null;
        field2716 = null;
        int var1 = -46 / ((arg0 - 63) / 48);
        field2709 = null;
    }

    @OriginalMember(owner = "client!kt", name = "<init>", descriptor = "()V", line = 16)
    public class169() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)[I", line = 19)
    public final int[] method156(int arg0, int arg1) {
        ++field2712;
        int[] var3 = super.field4927.method808(arg0 + 2026769184, arg1);
        if (arg0 != -2026769311) {
            this.method156(-46, -38);
        }
        if (super.field4927.field1471) {
            class275.method1772(var3, 0, class769.field10597, class135.field2287[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIB)V", line = 43)
    public static final void method1302(int arg0, int arg1, byte arg2) {
        class210.field3141 = arg0 - class64.field907;
        if (arg2 > -52) {
            field2714 = null;
        }
        ++field2713;
        class499.field6826 = arg1 - class64.field914;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(BLkh;)V", line = 56)
    public static final void method1303(byte arg0, class17 arg1) {
        ++field2710;
        if (arg0 <= -29) {
            if (~class531.field7191 == ~arg1.field379) {
                if (class235.field3379.field10641 == null) {
                    arg1.field339 = 0;
                    arg1.field276 = 0;
                } else {
                    arg1.field295 = 150;
                    arg1.field414 = 2047 & (int) (Math.sin((double) class440.field5977 / 40.0D) * 256.0D);
                    arg1.field339 = class483.field6533;
                    arg1.field272 = 5;
                    arg1.field276 = class220.method1513(class235.field3379.field10641, 0);
                    arg1.field375 = class235.field3379.field5293;
                    arg1.field247 = class235.field3379.field5285;
                    arg1.field259 = class235.field3379.field5249;
                    arg1.field374 = 0;
                    class200 var2 = ~arg1.field259 == 0 ? null : class108.field1696.method1279((byte) 92, arg1.field259);
                    if (var2 != null) {
                        class189.method1391(var2, 62, arg1.field375);
                    }
                }
            }
        }
    }
}
