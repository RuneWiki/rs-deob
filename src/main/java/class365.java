import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hfa")
public class class365 {

    @OriginalMember(owner = "client!hfa", name = "e", descriptor = "I")
    public int field5258 = 16777215;

    @OriginalMember(owner = "client!hfa", name = "f", descriptor = "I")
    public int field5259 = 8;

    @OriginalMember(owner = "client!hfa", name = "d", descriptor = "Z")
    public static boolean field5257 = false;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "I")
    public int field5254;

    @OriginalMember(owner = "client!hfa", name = "b", descriptor = "I")
    public int field5255;

    @OriginalMember(owner = "client!hfa", name = "c", descriptor = "I")
    public int field5256;

    @OriginalMember(owner = "client!hfa", name = "h", descriptor = "I")
    public static int field5261;

    @OriginalMember(owner = "client!hfa", name = "i", descriptor = "I")
    public static int field5262;

    @OriginalMember(owner = "client!hfa", name = "j", descriptor = "I")
    public int field5263;

    @OriginalMember(owner = "client!hfa", name = "k", descriptor = "I")
    public int field5264;

    @OriginalMember(owner = "client!hfa", name = "g", descriptor = "Z")
    public boolean field5260;

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(ZLgga;)V", line = 13)
    public final void method2287(boolean arg0, class511 arg1) {
        field5262++;
        while (true) {
            int var3 = arg1.method3013(90);
            if (var3 == 0) {
                if (arg0) {
                    this.method2287(false, null);
                    return;
                } else {
                    return;
                }
            }
            this.method2288(arg1, var3, (byte) 109);
        }
    }

    @OriginalMember(owner = "client!hfa", name = "a", descriptor = "(Lgga;IB)V", line = 36)
    private final void method2288(class511 arg0, int arg1, byte arg2) {
        field5261++;
        int var4 = 99 % ((36 - arg2) / 46);
        if (arg1 == 1) {
            this.field5259 = arg0.method3002(-1);
        } else if (arg1 == 2) {
            this.field5260 = true;
        } else if (arg1 == 3) {
            this.field5254 = arg0.method3034(1);
            this.field5255 = arg0.method3034(1);
            this.field5256 = arg0.method3034(1);
        } else if (arg1 == 4) {
            this.field5264 = arg0.method3013(46);
        } else if (arg1 == 5) {
            this.field5263 = arg0.method3002(-1);
        } else if (arg1 == 6) {
            this.field5258 = arg0.method2983(true);
            return;
        }
    }
}
