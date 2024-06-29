import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pda")
public abstract class class149 extends class410 {

    @OriginalMember(owner = "client!pda", name = "G", descriptor = "S")
    public short field1810;

    @OriginalMember(owner = "client!pda", name = "B", descriptor = "S")
    public short field1805;

    @OriginalMember(owner = "client!pda", name = "F", descriptor = "[I")
    public static int[] field1809 = new int[1];

    @OriginalMember(owner = "client!pda", name = "J", descriptor = "Z")
    public static boolean field1813 = false;

    @OriginalMember(owner = "client!pda", name = "A", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!pda", name = "C", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!pda", name = "E", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!pda", name = "H", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!pda", name = "K", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!pda", name = "L", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!pda", name = "M", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!pda", name = "z", descriptor = "Lkha;")
    public static class687 field1803;

    @OriginalMember(owner = "client!pda", name = "D", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1807;

    @OriginalMember(owner = "client!pda", name = "I", descriptor = "[Laj;")
    public static class428[] field1812;

    @OriginalMember(owner = "client!pda", name = "e", descriptor = "(I)V")
    public final void method523(int arg0) {
        if (arg0 != 0) {
            field1812 = null;
        }
        ++field1811;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(ZILmb;Lha;III)V")
    public final void method514(boolean arg0, int arg1, class410 arg2, class454 arg3, int arg4, int arg5, int arg6) {
        if (arg1 != 12473) {
            field1807 = null;
        }
        ++field1815;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(Ljava/lang/String;I)[B")
    public static final byte[] method932(String arg0, int arg1) {
        ++field1808;
        int var2 = arg0.length();
        if (arg1 != 5518) {
            return null;
        } else if (~var2 == -1) {
            return new byte[0];
        } else {
            int var3 = -4 & var2 + 3;
            int var4 = var3 / 4 * 3;
            if (~var2 < ~(var3 - 2) && class653.method3521(arg0.charAt(var3 + -2), (byte) 10) != -1) {
                if (~(var3 + -1) <= ~var2 || class653.method3521(arg0.charAt(var3 - 1), (byte) 10) == -1) {
                    --var4;
                }
            } else {
                var4 -= 2;
            }
            byte[] var5 = new byte[var4];
            class669.method3619(var5, 0, arg1 + -5609, arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pda", name = "a", descriptor = "(I[Lpk;)I")
    public final int method933(int arg0, class621[] arg1) {
        ++field1804;
        if (arg0 != 16) {
            this.method935(79, (class454) null);
        }
        return this.method2425(super.field5790 >> class455.field6383, super.field5784 >> class455.field6383, true, arg1);
    }

    @OriginalMember(owner = "client!pda", name = "j", descriptor = "(I)V")
    public static void method934(int arg0) {
        field1807 = null;
        field1809 = null;
        field1812 = null;
        if (arg0 > -110) {
            method934(-45);
        }
        field1803 = null;
    }

    @OriginalMember(owner = "client!pda", name = "b", descriptor = "(ILha;)Z")
    public final boolean method935(int arg0, class454 arg1) {
        if (arg0 <= 64) {
            field1809 = null;
        }
        ++field1806;
        return class477.method2792((byte) -114, this.method247(0), super.field5790 >> class455.field6383, super.field5784 >> class455.field6383, super.field5792);
    }

    @OriginalMember(owner = "client!pda", name = "<init>", descriptor = "(IIIIIII)V")
    public class149(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field1810 = (short) arg5;
        super.field5791 = arg1;
        super.field5792 = (byte) arg4;
        this.field1805 = (short) arg6;
        super.field5779 = (byte) arg3;
        super.field5784 = arg2;
        super.field5790 = arg0;
    }

    @OriginalMember(owner = "client!pda", name = "c", descriptor = "(B)Z")
    public final boolean method516(byte arg0) {
        ++field1814;
        if (arg0 >= -67) {
            field1803 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!pda", name = "i", descriptor = "(I)Z")
    public final boolean method936(int arg0) {
        if (arg0 > -85) {
            field1809 = null;
        }
        ++field1816;
        return class376.field5266[(super.field5790 >> class455.field6383) + -class337.field4349 + class267.field3381][(super.field5784 >> class455.field6383) + -class561.field7852 - -class267.field3381];
    }
}
