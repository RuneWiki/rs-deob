import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class551 extends class496 {

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public static int field8205 = 0;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public static int field8208 = 0;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field8206;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field8207;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "J")
    public long field8204;

    @OriginalMember(owner = "client!ge", name = "q", descriptor = "Llt;")
    public static class255 field8210;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Lge;")
    public class551 field8203;

    @OriginalMember(owner = "client!ge", name = "r", descriptor = "Lge;")
    public class551 field8211;

    @OriginalMember(owner = "client!ge", name = "p", descriptor = "[Lha;")
    public static class116[] field8209;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)Z", line = 8)
    public final boolean method3224(int arg0) {
        field8207++;
        if (this.field8203 == null) {
            return false;
        } else {
            if (arg0 != -11301) {
                this.field8203 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 25)
    public final void method3225(int arg0) {
        field8202++;
        if (this.field8203 == null) {
            return;
        }
        this.field8203.field8211 = this.field8211;
        this.field8211.field8203 = this.field8203;
        this.field8211 = null;
        if (arg0 > -39) {
            field8210 = null;
        }
        this.field8203 = null;
    }

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "(I)V", line = 50)
    public static void method3226(int arg0) {
        field8210 = null;
        field8209 = null;
        if (arg0 != 0) {
            method3227(-100, (byte) 37, -49);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(IBI)Z", line = 63)
    public static final boolean method3227(int arg0, byte arg1, int arg2) {
        int var3 = -59 % ((-arg1 - 10) / 62);
        field8206++;
        return class346.method2126(arg2, arg0, 55) & class540.method3167(2048, arg0, arg2);
    }
}
