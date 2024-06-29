import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class692 {

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "I")
    public int field9590 = 64;

    @OriginalMember(owner = "client!fl", name = "e", descriptor = "I")
    public int field9593 = 2;

    @OriginalMember(owner = "client!fl", name = "i", descriptor = "I")
    public int field9597 = 1;

    @OriginalMember(owner = "client!fl", name = "j", descriptor = "I")
    public int field9598 = 64;

    @OriginalMember(owner = "client!fl", name = "k", descriptor = "Z")
    public boolean field9599 = false;

    @OriginalMember(owner = "client!fl", name = "g", descriptor = "Z")
    public boolean field9595 = false;

    @OriginalMember(owner = "client!fl", name = "f", descriptor = "I")
    public int field9594 = -1;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "Lws;")
    public static class333 field9589 = new class333();

    @OriginalMember(owner = "client!fl", name = "c", descriptor = "I")
    public static int field9591;

    @OriginalMember(owner = "client!fl", name = "d", descriptor = "I")
    public static int field9592;

    @OriginalMember(owner = "client!fl", name = "h", descriptor = "I")
    public static int field9596;

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILji;)V")
    private final void method3821(int arg0, int arg1, int arg2, class572 arg3) {
        if (arg0 == 1) {
            this.field9594 = arg3.method3031(-1);
            if (this.field9594 == 65535) {
                this.field9594 = -1;
            }
        } else if (arg0 == 2) {
            this.field9598 = arg3.method3031(-1) + 1;
            this.field9590 = arg3.method3031(-1) + 1;
        } else if (arg0 == 3) {
            arg3.method3083(255);
        } else if (arg0 == 4) {
            this.field9593 = arg3.method3097((byte) 12);
        } else if (arg0 == 5) {
            this.field9597 = arg3.method3097((byte) 12);
        } else if (arg0 == 6) {
            this.field9599 = true;
        } else if (arg0 == 7) {
            this.field9595 = true;
        }
        if (arg2 <= 72) {
            method3822(23);
        }
        field9592++;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(I)V")
    public static void method3822(int arg0) {
        if (arg0 != -611) {
            field9589 = null;
        }
        field9589 = null;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(IIILpfa;)Lub;")
    public static final class20 method3823(int arg0, int arg1, int arg2, class275 arg3) {
        field9591++;
        byte[] var4 = arg3.method1659(arg1 + 31528, arg2, arg0);
        if (var4 == null) {
            return null;
        } else if (arg1 == -31445) {
            return new class20(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(ILji;I)V")
    public final void method3824(int arg0, class572 arg1, int arg2) {
        field9596++;
        int var4 = -14 / ((arg2 - 26) / 47);
        while (true) {
            int var5 = arg1.method3097((byte) 12);
            if (var5 == 0) {
                return;
            }
            this.method3821(var5, arg0, 119, arg1);
        }
    }
}
