import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class379 extends class546 implements class128 {

    @OriginalMember(owner = "client!ku", name = "v", descriptor = "I")
    private int field4843;

    @OriginalMember(owner = "client!ku", name = "p", descriptor = "Lcha;")
    public static class220 field4837 = new class220(7, 5);

    @OriginalMember(owner = "client!ku", name = "s", descriptor = "J")
    public static long field4840 = 0L;

    @OriginalMember(owner = "client!ku", name = "q", descriptor = "I")
    public static int field4838;

    @OriginalMember(owner = "client!ku", name = "r", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!ku", name = "t", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!ku", name = "u", descriptor = "I")
    public static int field4842;

    @OriginalMember(owner = "client!ku", name = "w", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!ku", name = "x", descriptor = "I")
    public static int field4845;

    @OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)V")
    public static void method2164(int arg0) {
        field4837 = null;
        if (arg0 != 0) {
            method2164(-16);
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[BB)V")
    public final void method958(int arg0, int arg1, byte[] arg2, byte arg3) {
        ++field4842;
        int var5 = -24 / ((arg3 - -59) / 35);
        this.method3148(arg2, arg1, 35044);
        this.field4843 = arg0;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lbi;ILjaclib/memory/Buffer;IZ)V")
    public class379(class483 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4843 = arg1;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lbi;I[BIZ)V")
    public class379(class483 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34962, arg2, arg3, arg4);
        this.field4843 = arg1;
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)V")
    public final void method2165(int arg0) {
        if (arg0 == 34963) {
            super.field7616.method2852((byte) 48, this);
            ++field4839;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Z)J")
    public final long method961(boolean arg0) {
        if (arg0) {
            field4837 = null;
        }
        ++field4838;
        return 0L;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)I")
    public final int method960(int arg0) {
        ++field4845;
        if (arg0 != -21047) {
            field4840 = -40L;
        }
        return super.field7606;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(II[I[I[B[[B[[BI)I")
    public static final int method2166(int arg0, int arg1, int[] arg2, int[] arg3, byte[] arg4, byte[][] arg5, byte[][] arg6, int arg7) {
        ++field4844;
        if (arg1 < 55) {
            field4840 = -21L;
        }
        int var8 = arg2[arg0];
        int var9 = arg3[arg0] + var8;
        int var10 = arg2[arg7];
        int var11 = arg3[arg7] + var10;
        int var12 = var8;
        if (~var10 < ~var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var9 < ~var11) {
            var13 = var11;
        }
        int var14 = arg4[arg0] & 255;
        if (~var14 < ~(arg4[arg7] & 255)) {
            var14 = arg4[arg7] & 255;
        }
        byte[] var15 = arg5[arg0];
        byte[] var16 = arg6[arg7];
        int var17 = -var8 + var12;
        int var18 = -var10 + var12;
        for (int var19 = var12; ~var13 < ~var19; ++var19) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I")
    public final int method959(int arg0) {
        if (arg0 < 110) {
            return -126;
        } else {
            ++field4841;
            return this.field4843;
        }
    }
}
