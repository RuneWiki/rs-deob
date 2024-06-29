import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class494 {

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "[Lsd;")
    public class595[] field6678 = null;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "[Lsd;")
    private class595[] field6677 = null;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "Lgp;")
    public class94 field6679 = null;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "Z")
    public boolean field6681;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "Lcb;")
    public static class318 field6682 = new class318(72, 10);

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "Z")
    public static boolean field6686 = false;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "[I")
    public static int[] field6683 = new int[6];

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "I")
    public static int field6680;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(I)Z", line = 6)
    public final boolean method2788(int arg0) {
        if (arg0 != 72) {
            return true;
        }
        field6684++;
        if (this.field6681) {
            return this.field6679 != null;
        } else {
            return this.field6678 != null;
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lsv;)V", line = 64)
    public class494(class312 arg0) {
        this.field6681 = arg0.field4423;
        if (this.field6681 && !arg0.method808(class603.field8244, 59, class680.field9664)) {
            this.field6681 = false;
        }
        if (this.field6681 || arg0.method826(class603.field8244, class680.field9664, true)) {
            class519.method2960(-98);
            if (this.field6681) {
                byte[] var6 = class648.method3605(true, class34.field334, false);
                this.field6679 = arg0.method799(128, 16, 128, class603.field8244, var6, 88);
                byte[] var7 = class648.method3605(true, class401.field5697, false);
                arg0.method799(128, 16, 128, class603.field8244, var7, 58);
            } else {
                this.field6678 = new class595[16];
                for (int var2 = 0; var2 < 16; var2++) {
                    byte[] var5 = class55.method349(var2 * 128 * 256, 32768, class34.field334, (byte) 50);
                    this.field6678[var2] = arg0.method1978((byte) 55, 128, var5, 128, true, class603.field8244);
                }
                this.field6677 = new class595[16];
                for (int var3 = 0; var3 < 16; var3++) {
                    byte[] var4 = class55.method349(var3 * 128 * 256, 32768, class401.field5697, (byte) 50);
                    this.field6677[var3] = arg0.method1978((byte) 55, 128, var4, 128, true, class603.field8244);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IIZIII)V", line = 27)
    public static final void method2789(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        int var9 = arg1 + 1;
        class653.method3620(arg5, arg0, arg2, arg4, class319.field4673[arg1]);
        field6680++;
        int var10 = arg3 - 1;
        class653.method3620(arg5, arg0, arg2, arg4, class319.field4673[arg3]);
        for (int var6 = var9; var6 <= var10; var6++) {
            int[] var7 = class319.field4673[var6];
            var7[arg0] = var7[arg5] = arg4;
        }
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(I)V", line = 50)
    public static void method2790(int arg0) {
        field6682 = null;
        if (arg0 != 128) {
            method2790(-99);
        }
        field6683 = null;
    }
}
