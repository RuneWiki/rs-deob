import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class263 extends class286 {

    @OriginalMember(owner = "client!lk", name = "U", descriptor = "I")
    private int field4478 = 0;

    @OriginalMember(owner = "client!lk", name = "T", descriptor = "I")
    private int field4477 = 4096;

    @OriginalMember(owner = "client!lk", name = "P", descriptor = "I")
    public static int field4473 = -1;

    @OriginalMember(owner = "client!lk", name = "S", descriptor = "Lbe;")
    private static class283 field4476 = class153.method941(127, " from your friend list first)3");

    @OriginalMember(owner = "client!lk", name = "N", descriptor = "Lbe;")
    public static class283 field4471 = field4476;

    @OriginalMember(owner = "client!lk", name = "R", descriptor = "Lbe;")
    public static class283 field4475 = class153.method941(125, "sl_stars");

    @OriginalMember(owner = "client!lk", name = "Y", descriptor = "[I")
    public static int[] field4482 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!lk", name = "O", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!lk", name = "Q", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!lk", name = "V", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!lk", name = "W", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!lk", name = "X", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!lk", name = "Z", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!lk", name = "ab", descriptor = "Llb;")
    public static class199 field4484;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "(I)Lgi;", line = 8)
    public static final class204 method1782(int arg0) {
        field4483++;
        int var1 = class202.field3451[0] * class201.field3440[0];
        byte[] var2 = class256.field4329[0];
        int[] var3 = new int[var1];
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class296.field5018[class178.method1174(255, var2[var4])];
        }
        int var5 = 99 % ((-arg0 - 20) / 48);
        class204 var6 = new class204(class197.field3372, class193.field3301, class247.field4226[0], class232.field3933[0], class202.field3451[0], class201.field3440[0], var3);
        class88.method571(-4);
        return var6;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(III)J", line = 36)
    public static final long method1783(int arg0, int arg1, int arg2) {
        class160 var3 = class86.field1459[arg0][arg1][arg2];
        return var3 == null || var3.field2617 == null ? 0L : var3.field2617.field1859;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lfe;ZI)V", line = 56)
    public final void method19(class229 arg0, boolean arg1, int arg2) {
        if (arg2 == 0) {
            this.field4478 = arg0.method1496(true);
        } else if (arg2 == 1) {
            this.field4477 = arg0.method1496(true);
        }
        field4474++;
        if (arg1) {
            this.method19((class229) null, false, 58);
        }
    }

    @OriginalMember(owner = "client!lk", name = "<init>", descriptor = "()V", line = 85)
    public class263() {
        super(1, true);
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(IIZ)Lbe;", line = 89)
    public static final class283 method1784(int arg0, int arg1, boolean arg2) {
        field4481++;
        if (arg1 != 10) {
            field4473 = -80;
        }
        return class210.method1385(arg1 - 13, arg2, arg0, 10);
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)[I", line = 105)
    public final int[] method14(int arg0, int arg1) {
        if (arg0 >= -52) {
            field4471 = (class283) null;
        }
        int[] var3 = this.field4863.method1579(arg1, (byte) 90);
        if (this.field4863.field3984) {
            int[] var4 = this.method1963(arg1, 0, -1);
            for (int var5 = 0; var5 < class27.field410; var5++) {
                int var6 = var4[var5];
                var3[var5] = this.field4478 <= var6 && this.field4477 >= var6 ? 4096 : 0;
            }
        }
        field4472++;
        return var3;
    }

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "(I)V", line = 149)
    public static void method1785(int arg0) {
        field4484 = null;
        if (arg0 == 4096) {
            field4471 = null;
            field4475 = null;
            field4476 = null;
            field4482 = null;
        }
    }
}
