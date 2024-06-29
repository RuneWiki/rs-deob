import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class534 extends class463 {

    @OriginalMember(owner = "client!nw", name = "F", descriptor = "I")
    public static int field7633;

    @OriginalMember(owner = "client!nw", name = "G", descriptor = "I")
    public static int field7634;

    @OriginalMember(owner = "client!nw", name = "I", descriptor = "I")
    public static int field7636;

    @OriginalMember(owner = "client!nw", name = "J", descriptor = "I")
    public static int field7637;

    @OriginalMember(owner = "client!nw", name = "K", descriptor = "I")
    public static int field7638;

    @OriginalMember(owner = "client!nw", name = "H", descriptor = "Lkaa;")
    public static class44 field7635;

    @OriginalMember(owner = "client!nw", name = "<init>", descriptor = "(IIIIIF)V")
    public class534(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIII)V")
    public final void method2509(int arg0, int arg1, int arg2, int arg3) {
        super.field6428 = arg2;
        super.field6438 = arg1;
        ++field7633;
        super.field6439 = arg3;
        int var5 = -35 % ((arg0 - -10) / 38);
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IILep;)I")
    public static final int method3039(int arg0, int arg1, class382 arg2) {
        ++field7637;
        if (!client.method1530(arg2).method1496(arg1, arg0) && arg2.field4966 == null) {
            return -1;
        } else {
            return arg2.field4984 != null && ~arg2.field4984.length < ~arg1 ? arg2.field4984[arg1] : -1;
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ZF)V")
    public final void method2507(boolean arg0, float arg1) {
        if (!arg0) {
            super.field6436 = arg1;
            ++field7638;
        }
    }

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "(I)V")
    public static void method3040(int arg0) {
        if (arg0 > -102) {
            method3039(-66, 107, (class382) null);
        }
        field7635 = null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(III[BIII)Z")
    public static final boolean method3041(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6) {
        ++field7636;
        if (arg2 != 0) {
            return false;
        } else {
            int var7 = arg1 % arg6;
            int var8;
            if (~var7 != -1) {
                var8 = -var7 + arg6;
            } else {
                var8 = 0;
            }
            int var9 = -((arg5 - -arg6 + -1) / arg6);
            int var10 = -((arg6 + -1 + arg1) / arg6);
            for (int var11 = var9; ~var11 > -1; ++var11) {
                for (int var12 = var10; ~var12 > -1; ++var12) {
                    if (~arg3[arg0] == -1) {
                        return true;
                    }
                    arg0 += arg6;
                }
                int var13 = arg0 - var8;
                if (~arg3[var13 + -1] == -1) {
                    return true;
                }
                arg0 = arg4 + var13;
            }
            return false;
        }
    }
}
