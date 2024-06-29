import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public class class449 extends class322 implements class52 {

    @OriginalMember(owner = "client!qt", name = "k", descriptor = "I")
    private int field6724;

    @OriginalMember(owner = "client!qt", name = "q", descriptor = "Z")
    public static boolean field6730 = false;

    @OriginalMember(owner = "client!qt", name = "m", descriptor = "Lug;")
    public static class392 field6726 = new class392();

    @OriginalMember(owner = "client!qt", name = "l", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!qt", name = "n", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!qt", name = "o", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!qt", name = "p", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!qt", name = "r", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!qt", name = "s", descriptor = "I")
    public static int field6732;

    @OriginalMember(owner = "client!qt", name = "t", descriptor = "I")
    public static int field6733;

    @OriginalMember(owner = "client!qt", name = "u", descriptor = "I")
    public static int field6734;

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(Z)V", line = 3)
    public final void method1282(boolean arg0) {
        ++field6728;
        super.field4917.method1911(this, 82);
        if (arg0) {
            method2684(-31, (class145) null);
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(Z)J", line = 15)
    public final long method468(boolean arg0) {
        if (!arg0) {
            return 113L;
        } else {
            ++field6725;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!qt", name = "b", descriptor = "(B)I", line = 29)
    public final int method469(byte arg0) {
        ++field6732;
        int var2 = -87 % ((24 - arg0) / 59);
        return super.field4914;
    }

    @OriginalMember(owner = "client!qt", name = "c", descriptor = "(Z)V", line = 39)
    public static final void method2681(boolean arg0) {
        ++field6729;
        if (~class370.field5609.length() != -1) {
            class343.method2185("--> " + class370.field5609, -56);
            class370.method2317(arg0, class370.field5609, false);
            class3.field98 = 0;
            class258.field3752 = 0;
            class370.field5609 = "";
        }
    }

    @OriginalMember(owner = "client!qt", name = "d", descriptor = "(Z)V", line = 57)
    public static void method2682(boolean arg0) {
        if (!arg0) {
            field6726 = null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(II[BI)V", line = 67)
    public final void method466(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method2097(arg2, arg3, arg1 + 15069);
        ++field6731;
        if (arg1 != 19971) {
            field6726 = null;
        }
        this.field6724 = arg0;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILmq;)Ljava/lang/String;", line = 80)
    public static final String method2683(int arg0, class350 arg1) {
        ++field6734;
        if (client.method1349(arg1).method1607(arg0) == 0) {
            return null;
        } else if (arg1.field5230 != null && ~arg1.field5230.trim().length() != -1) {
            return arg1.field5230;
        } else {
            return class210.field3027 ? "Hidden-use" : null;
        }
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(ILcu;)Ljava/lang/String;", line = 106)
    public static final String method2684(int arg0, class145 arg1) {
        if (arg0 != 32767) {
            return null;
        } else {
            ++field6727;
            return class91.method706(arg1, 53, 32767);
        }
    }

    @OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lvj;I[BIZ)V", line = 120)
    public class449(class303 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6724 = arg1;
    }

    @OriginalMember(owner = "client!qt", name = "a", descriptor = "(B)I", line = 131)
    public final int method467(byte arg0) {
        ++field6733;
        if (arg0 != -46) {
            this.method468(true);
        }
        return this.field6724;
    }
}
