import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nv")
public class class683 {

    @OriginalMember(owner = "client!nv", name = "n", descriptor = "Z")
    public boolean field9668;

    @OriginalMember(owner = "client!nv", name = "o", descriptor = "I")
    public int field9669;

    @OriginalMember(owner = "client!nv", name = "m", descriptor = "I")
    public int field9667;

    @OriginalMember(owner = "client!nv", name = "d", descriptor = "B")
    public byte field9658;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "I")
    public int field9655;

    @OriginalMember(owner = "client!nv", name = "h", descriptor = "S")
    public short field9662;

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "S")
    public short field9657;

    @OriginalMember(owner = "client!nv", name = "i", descriptor = "I")
    public int field9663;

    @OriginalMember(owner = "client!nv", name = "l", descriptor = "I")
    public int field9666;

    @OriginalMember(owner = "client!nv", name = "j", descriptor = "S")
    public short field9664;

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "I")
    public static int field9656;

    @OriginalMember(owner = "client!nv", name = "e", descriptor = "I")
    public static int field9659;

    @OriginalMember(owner = "client!nv", name = "g", descriptor = "I")
    public static int field9661;

    @OriginalMember(owner = "client!nv", name = "k", descriptor = "I")
    public static int field9665;

    @OriginalMember(owner = "client!nv", name = "p", descriptor = "I")
    public static int field9670;

    @OriginalMember(owner = "client!nv", name = "f", descriptor = "[Lit;")
    public static class34[] field9660;

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(I)V", line = 6)
    public static final void method3809(int arg0) throws IOException {
        field9656++;
        if (arg0 != 0 || class166.field2624 == null || class97.field1436 <= 0) {
            return;
        }
        int var1 = 0;
        while (true) {
            class540 var2 = (class540) class702.field9935.method3463((byte) -50);
            if (var2 == null) {
                class12.field117 = 0;
                class408.field6036 += var1;
                return;
            }
            class166.field2624.method3115(126, 0, var2.field7711, var2.field7707.field4543);
            var1 += var2.field7711;
            class97.field1436 -= var2.field7711;
            var2.method636((byte) 97);
            var2.field7707.method1967(-2);
            var2.method3165(108);
        }
    }

    @OriginalMember(owner = "client!nv", name = "b", descriptor = "(I)V", line = 52)
    public static void method3810(int arg0) {
        field9660 = null;
        if (arg0 != 2883) {
            method3810(-43);
        }
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IBIIII[B)Z", line = 65)
    public static final boolean method3811(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field9665++;
        int var7 = arg5 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg3 + arg4 - 1) / arg3);
        int var10 = -((arg5 - (1 - arg3)) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg6[arg0] == 0) {
                    return true;
                }
                arg0 += arg3;
            }
            int var13 = arg0 - var8;
            if (arg6[var13 - 1] == 0) {
                return true;
            }
            arg0 = arg2 + var13;
        }
        if (arg1 != -62) {
            method3810(40);
        }
        return false;
    }

    @OriginalMember(owner = "client!nv", name = "a", descriptor = "(IIIIILla;Z)V", line = 113)
    public static final void method3812(int arg0, int arg1, int arg2, int arg3, int arg4, class422 arg5, boolean arg6) {
        if (arg3 != 1) {
            method3813(125);
        }
        if (arg4 <= 0) {
            class736.method4110((byte) -31, arg0, arg1, arg2, arg5, arg6);
        } else {
            class442.field6421 = 1;
            class259.field4052 = null;
            class371.field5634 = arg6;
            class560.field7944 = arg2;
            class140.field2198 = arg5;
            class540.field7712 = arg1;
            class577.field8182 = arg0;
            class730.field10244 = class208.field3480.method2336(123) / arg4;
            if (class730.field10244 < 1) {
                class730.field10244 = 1;
            }
        }
        field9670++;
    }

    @OriginalMember(owner = "client!nv", name = "c", descriptor = "(I)V", line = 143)
    public static final void method3813(int arg0) {
        field9661++;
        for (int var1 = 0; var1 < class434.field6341.length; var1++) {
            for (int var3 = 0; var3 < class434.field6341[0].length; var3++) {
                for (int var4 = 0; var4 < class434.field6341[0][0].length; var4++) {
                    class434.field6341[var1][var3][var4] = 0;
                }
            }
        }
        int var2 = -111 % ((arg0 - 18) / 58);
    }

    @OriginalMember(owner = "client!nv", name = "<init>", descriptor = "(IIIIIIIIIZZI)V", line = 178)
    public class683(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, boolean arg10, int arg11) {
        this.field9668 = arg10;
        this.field9669 = arg11;
        this.field9667 = arg0;
        this.field9658 = (byte) arg8;
        this.field9655 = arg2;
        this.field9662 = (short) arg5;
        this.field9657 = (short) arg4;
        this.field9663 = arg1;
        this.field9666 = arg3;
        this.field9664 = (short) arg6;
    }
}
