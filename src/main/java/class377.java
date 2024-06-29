import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public abstract class class377 extends class61 {

    @OriginalMember(owner = "client!bga", name = "N", descriptor = "S")
    public short field4765;

    @OriginalMember(owner = "client!bga", name = "P", descriptor = "S")
    public short field4767;

    @OriginalMember(owner = "client!bga", name = "G", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!bga", name = "H", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!bga", name = "J", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!bga", name = "K", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!bga", name = "L", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!bga", name = "M", descriptor = "I")
    public static int field4764;

    @OriginalMember(owner = "client!bga", name = "O", descriptor = "I")
    public static int field4766;

    @OriginalMember(owner = "client!bga", name = "Q", descriptor = "I")
    public static int field4768;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lgda;Lha;IIZII)V", line = 3)
    public final void method524(class61 arg0, class66 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        ++field4762;
        if (arg6 < -6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(B[Lkp;)I", line = 15)
    public final int method528(byte arg0, class515[] arg1) {
        if (arg0 != -48) {
            this.field4765 = -122;
        }
        ++field4761;
        return this.method525(super.field813 >> class714.field10017, super.field823 >> class714.field10017, (byte) -108, arg1);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZIIII)V", line = 30)
    public static final void method2210(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; ~class104.field1332 < ~var5; ++var5) {
            Rectangle var6 = class483.field6743[var5];
            if (arg1 < var6.x + var6.width && ~(arg1 + arg2) < ~var6.x && var6.y + var6.height > arg3 && var6.y < arg3 + arg4) {
                class417.field5443[var5] = true;
            }
        }
        ++field4766;
        class326.method1945(arg3, arg1 + arg2, arg1, arg3 + arg4, arg0);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Lha;B)Z", line = 52)
    public final boolean method523(class66 arg0, byte arg1) {
        ++field4764;
        int var3 = -38 / ((18 - arg1) / 55);
        return class255.method1517((byte) 123, this.method509(33), super.field811, super.field823 >> class714.field10017, super.field813 >> class714.field10017);
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(III)Z", line = 66)
    public static final boolean method2211(int arg0, int arg1, int arg2) {
        if (arg1 != 2048) {
            return true;
        } else {
            ++field4759;
            return ~(arg2 & 2048) != -1;
        }
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(Z)V", line = 77)
    public final void method530(boolean arg0) {
        if (!arg0) {
            ++field4763;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!bga", name = "e", descriptor = "(Z)Z", line = 88)
    public final boolean method531(boolean arg0) {
        ++field4760;
        if (arg0) {
            this.field4767 = 22;
        }
        return false;
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(IIIIIII)V", line = 99)
    public class377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super.field811 = (byte) arg4;
        super.field808 = (byte) arg3;
        this.field4765 = (short) arg5;
        super.field809 = arg1;
        super.field813 = arg2;
        this.field4767 = (short) arg6;
        super.field823 = arg0;
    }

    @OriginalMember(owner = "client!bga", name = "g", descriptor = "(I)Z", line = 116)
    public final boolean method529(int arg0) {
        if (arg0 != -31509) {
            return true;
        } else {
            ++field4768;
            return class308.field3820[(super.field823 >> class714.field10017) + class573.field7852 + -class463.field6493][(super.field813 >> class714.field10017) + -class619.field8331 + class573.field7852];
        }
    }
}
