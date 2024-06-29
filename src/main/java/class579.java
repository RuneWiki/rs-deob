import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public class class579 extends class137 implements class558 {

    @OriginalMember(owner = "client!ht", name = "m", descriptor = "I")
    private int field8203;

    @OriginalMember(owner = "client!ht", name = "k", descriptor = "I")
    public static int field8201 = -1;

    @OriginalMember(owner = "client!ht", name = "i", descriptor = "Z")
    public static boolean field8199 = false;

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "I")
    public static int field8193;

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "I")
    public static int field8194;

    @OriginalMember(owner = "client!ht", name = "e", descriptor = "I")
    public static int field8195;

    @OriginalMember(owner = "client!ht", name = "f", descriptor = "I")
    public static int field8196;

    @OriginalMember(owner = "client!ht", name = "h", descriptor = "I")
    public static int field8198;

    @OriginalMember(owner = "client!ht", name = "l", descriptor = "I")
    public static int field8202;

    @OriginalMember(owner = "client!ht", name = "j", descriptor = "Lvh;")
    public static class359 field8200;

    @OriginalMember(owner = "client!ht", name = "g", descriptor = "Z")
    public static boolean field8197;

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)J", line = 4)
    public final long method920(int arg0) {
        if (arg0 != -26521) {
            field8197 = false;
        }
        ++field8193;
        return super.field1556.getAddress();
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "([BIII)V", line = 17)
    public final void method919(byte[] arg0, int arg1, int arg2, int arg3) {
        this.method873(arg0, arg1);
        ++field8196;
        if (arg2 != 6748) {
            field8199 = false;
        }
        this.field8203 = arg3;
    }

    @OriginalMember(owner = "client!ht", name = "c", descriptor = "(I)I", line = 32)
    public final int method922(int arg0) {
        if (arg0 != -25300) {
            this.method920(-117);
        }
        ++field8195;
        return this.field8203;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(BIII[BII)Z", line = 44)
    public static final boolean method3339(byte arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        if (arg0 >= -109) {
            return false;
        } else {
            ++field8198;
            int var7 = arg1 % arg3;
            int var8;
            if (var7 != 0) {
                var8 = -var7 + arg3;
            } else {
                var8 = 0;
            }
            int var9 = -((arg6 + -1 + arg3) / arg3);
            int var10 = -((arg1 + arg3 + -1) / arg3);
            for (int var11 = var9; var11 < 0; ++var11) {
                for (int var12 = var10; ~var12 > -1; ++var12) {
                    if (~arg4[arg2] == -1) {
                        return true;
                    }
                    arg2 += arg3;
                }
                int var13 = arg2 - var8;
                if (~arg4[var13 + -1] == -1) {
                    return true;
                }
                arg2 = arg5 + var13;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ht", name = "<init>", descriptor = "(Lnv;I[BI)V", line = 95)
    public class579(class417 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8203 = arg1;
    }

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)I", line = 109)
    public final int method921(int arg0) {
        if (arg0 != -5325) {
            return 8;
        } else {
            ++field8194;
            return 0;
        }
    }

    @OriginalMember(owner = "client!ht", name = "d", descriptor = "(I)V", line = 122)
    public static void method3340(int arg0) {
        if (arg0 != 0) {
            method3340(56);
        }
        field8200 = null;
    }
}
