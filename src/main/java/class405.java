import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class405 extends class42 implements class381 {

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "I")
    private int field5756;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "Lcba;")
    public static class471 field5754 = new class471(108, 20);

    @OriginalMember(owner = "client!qq", name = "k", descriptor = "Lej;")
    public static class104 field5762 = new class104(" ", ": ", " ", " ");

    @OriginalMember(owner = "client!qq", name = "l", descriptor = "I")
    public static int field5763 = 0;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field5755;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field5757;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!qq", name = "j", descriptor = "I")
    public static int field5761;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I[BII)V")
    public final void method2019(int arg0, byte[] arg1, int arg2, int arg3) {
        this.method416(arg1, arg0);
        ++field5760;
        if (arg3 == 12766) {
            this.field5756 = arg2;
        }
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II[JI[Ljava/lang/Object;)V")
    public static final void method2414(int arg0, int arg1, long[] arg2, int arg3, Object[] arg4) {
        if (~arg1 < ~arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg0;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var9 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg0; ~var11 > ~arg1; ++var11) {
                if (arg2[var11] < var7 - -((long) (var10 & var11))) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6++] = var14;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg4[arg1] = arg4[var6];
            arg4[var6] = var9;
            method2414(arg0, var6 + -1, arg2, 2, arg4);
            method2414(var6 - -1, arg1, arg2, 2, arg4);
        }
        if (arg3 != 2) {
            field5754 = null;
        }
        ++field5757;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(Z)J")
    public final long method2016(boolean arg0) {
        if (!arg0) {
            method2415((byte) 115);
        }
        ++field5755;
        return super.field811.getAddress();
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lgi;ILjaclib/memory/Buffer;)V")
    public class405(class583 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field5756 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(B)V")
    public static void method2415(byte arg0) {
        if (arg0 < -119) {
            field5754 = null;
            field5762 = null;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(I)I")
    public final int method2017(int arg0) {
        if (arg0 != 18322) {
            return -126;
        } else {
            ++field5759;
            return 0;
        }
    }

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "(B)Lkf;")
    public static final class212 method2416(byte arg0) {
        if (arg0 > -7) {
            field5762 = null;
        }
        ++field5758;
        return class32.field515 < class35.field749.length ? class35.field749[class32.field515++] : null;
    }

    @OriginalMember(owner = "client!qq", name = "<init>", descriptor = "(Lgi;I[BI)V")
    public class405(class583 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field5756 = arg1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)I")
    public final int method2015(int arg0) {
        ++field5761;
        return arg0 != 11070 ? -127 : this.field5756;
    }
}
