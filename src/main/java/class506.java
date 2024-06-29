import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class506 extends class8 {

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public int field7469;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public int field7472;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public int field7473;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "I")
    public int field7474;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    public int field7467;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public int field7470;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public int field7471;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "I")
    public static int field7461 = 0;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field7462;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "I")
    public static int field7464;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "I")
    public static int field7465;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field7466;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field7468;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ILqa;ZLto;III)V", line = 12)
    public final void method18(int arg0, class162 arg1, boolean arg2, class8 arg3, int arg4, int arg5, int arg6) {
        field7462++;
        if (arg4 != -1) {
            this.method381(38);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)Z", line = 24)
    public static final boolean method3027(int arg0) {
        field7464++;
        if (class61.field1073) {
            try {
                class512.method3065("showVideoAd", class368.field5553.field4170, (byte) 10);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 0) {
            field7463 = -98;
        }
        return false;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Z)Z", line = 49)
    public final boolean method24(boolean arg0) {
        field7466++;
        return arg0 ? false : false;
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(B)V", line = 62)
    public final void method22(byte arg0) {
        if (arg0 != -3) {
            field7468 = -125;
        }
        field7465++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(IIIIIII)V", line = 75)
    public class506(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field7469 = arg5;
        this.field7472 = arg1;
        this.field7473 = arg4;
        this.field7474 = arg2;
        this.field7467 = arg6;
        this.field7470 = arg0;
        this.field7471 = arg3;
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)I")
    public abstract int method381(int arg0);
}
