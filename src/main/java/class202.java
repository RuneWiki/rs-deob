import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class202 extends class70 implements class140 {

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
    private int field2847;

    @OriginalMember(owner = "client!mba", name = "m", descriptor = "Ljc;")
    public static class584 field2846 = new class584("runescape", 0);

    @OriginalMember(owner = "client!mba", name = "l", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!mba", name = "v", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "Lha;")
    public static class116 field2849;

    @OriginalMember(owner = "client!mba", name = "u", descriptor = "Ljq;")
    public static class446 field2854;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(I)J")
    public final long method305(int arg0) {
        ++field2848;
        return arg0 != -21337 ? -71L : 0L;
    }

    @OriginalMember(owner = "client!mba", name = "d", descriptor = "(I)V")
    public final void method684(int arg0) {
        ++field2855;
        super.field1314.method540((byte) -25, this);
        if (arg0 != 58) {
            this.field2847 = -55;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII[B)V")
    public final void method310(byte arg0, int arg1, int arg2, byte[] arg3) {
        this.method682(-114, arg3, arg2);
        if (arg0 != 53) {
            this.method310((byte) -73, 44, -50, (byte[]) null);
        }
        ++field2845;
        this.field2847 = arg1;
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Ljj;I[BIZ)V")
    public class202(class66 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field2847 = arg1;
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V")
    public static void method1303(int arg0) {
        if (arg0 == 58) {
            field2849 = null;
            field2854 = null;
            field2846 = null;
        }
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(Z)I")
    public final int method302(boolean arg0) {
        if (arg0) {
            this.method305(-27);
        }
        ++field2850;
        return super.field1312;
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(Z)I")
    public final int method309(boolean arg0) {
        if (!arg0) {
            this.method302(false);
        }
        ++field2851;
        return this.field2847;
    }

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(BII)Z")
    public static final boolean method1304(byte arg0, int arg1, int arg2) {
        if (arg0 <= 50) {
            return false;
        } else {
            ++field2852;
            if (!class2.field20) {
                return false;
            } else {
                int var3 = arg2 >> 16;
                int var4 = arg2 & 65535;
                if (class177.field2593[var3] != null && class177.field2593[var3][var4] != null) {
                    class549 var5 = class177.field2593[var3][var4];
                    if (arg1 == -1 && ~var5.field7749 == -1) {
                        for (class587 var6 = (class587) class432.field6356.method427(true); var6 != null; var6 = (class587) class432.field6356.method420(false)) {
                            if (~var6.field8359 == -6 || var6.field8359 == 1007 || ~var6.field8359 == -13 || ~var6.field8359 == -23 || var6.field8359 == 58) {
                                for (class549 var7 = class495.method2822((byte) -101, var6.field8367); var7 != null; var7 = class106.method907((byte) 77, var7)) {
                                    if (~var5.field7734 == ~var7.field7734) {
                                        return true;
                                    }
                                }
                            }
                        }
                    } else {
                        for (class587 var8 = (class587) class432.field6356.method427(true); var8 != null; var8 = (class587) class432.field6356.method420(false)) {
                            if (var8.field8369 == arg1 && var5.field7734 == var8.field8367 && (~var8.field8359 == -6 || ~var8.field8359 == -1008 || var8.field8359 == 12 || ~var8.field8359 == -23 || var8.field8359 == 58)) {
                                return true;
                            }
                        }
                    }
                    return false;
                } else {
                    return false;
                }
            }
        }
    }
}
