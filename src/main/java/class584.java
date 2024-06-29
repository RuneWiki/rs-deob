import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class584 extends class307 implements class719 {

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    private int field8116;

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "[Lsba;")
    public static class412[] field8107 = new class412[6];

    @OriginalMember(owner = "client!dn", name = "k", descriptor = "J")
    public static long field8114 = 0L;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "[F")
    public static float[] field8113 = new float[4];

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "I")
    public static int field8108;

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field8109;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field8110;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field8111;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!dn", name = "c", descriptor = "(I)V")
    public static void method3254(int arg0) {
        field8107 = null;
        field8113 = null;
        if (arg0 != 0) {
            field8114 = -43L;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)J")
    public final long method2410(byte arg0) {
        if (arg0 <= 4) {
            field8114 = -83L;
        }
        ++field8110;
        return super.field3939.getAddress();
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)I")
    public final int method2404(int arg0) {
        if (arg0 != -10550) {
            field8107 = null;
        }
        ++field8106;
        return 0;
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V")
    public static final void method3255(int arg0) {
        ++field8117;
        if (arg0 != 0) {
            method3258((Component) null, (byte) 63);
        }
        for (class63 var1 = (class63) class73.field955.method3111(97); var1 != null; var1 = (class63) class73.field955.method3116(arg0 + -107)) {
            if (~var1.field847 == 0) {
                var1.field855 = 0;
                if (~var1.field856 <= -1 && var1.field848 >= 0 && ~var1.field856 > ~class613.field8591 && class1.field3 > var1.field848) {
                    class62.method479(-126, var1);
                }
            } else {
                var1.method3426((byte) -92);
            }
        }
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "(Leq;I[BI)V")
    public class584(class357 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8116 = arg1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[Ljava/lang/Object;I[J)V")
    public static final void method3256(int arg0, int arg1, Object[] arg2, int arg3, long[] arg4) {
        if (arg0 != -15475) {
            method3256(90, -105, (Object[]) null, -52, (long[]) null);
        }
        if (arg1 > arg3) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            Object var9 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var9;
            int var10 = ~var7 != Long.MIN_VALUE ? 1 : 0;
            for (int var11 = arg3; ~var11 > ~arg1; ++var11) {
                if ((long) (var10 & var11) + var7 > arg4[var11]) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    Object var14 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6++] = var14;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg1] = arg2[var6];
            arg2[var6] = var9;
            method3256(-15475, var6 - 1, arg2, arg3, arg4);
            method3256(arg0, arg1, arg2, var6 + 1, arg4);
        }
        ++field8111;
    }

    @OriginalMember(owner = "client!dn", name = "e", descriptor = "(I)Z")
    public static final boolean method3257(int arg0) {
        if (arg0 <= 84) {
            field8113 = null;
        }
        ++field8108;
        boolean var1 = true;
        if (class38.field563 == null) {
            if (class645.field8897.method3827(class666.field9114, (byte) 47)) {
                class38.field563 = class196.method1223(class645.field8897, class666.field9114);
            } else {
                var1 = false;
            }
        }
        if (class744.field10389 == null) {
            if (class645.field8897.method3827(class242.field3115, (byte) 64)) {
                class744.field10389 = class196.method1223(class645.field8897, class242.field3115);
            } else {
                var1 = false;
            }
        }
        if (class518.field7288 == null) {
            if (!class645.field8897.method3827(class531.field7481, (byte) 83)) {
                var1 = false;
            } else {
                class518.field7288 = class196.method1223(class645.field8897, class531.field7481);
            }
        }
        if (class646.field8900 == null) {
            if (!class378.field5293.method3827(class127.field1542, (byte) 71)) {
                var1 = false;
            } else {
                class646.field8900 = class653.method3527(class378.field5293, (byte) -119, class127.field1542);
            }
        }
        if (class585.field8120 == null) {
            if (!class645.field8897.method3827(class127.field1542, (byte) 89)) {
                var1 = false;
            } else {
                class585.field8120 = class196.method1235(class645.field8897, class127.field1542);
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[BI)V")
    public final void method2406(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg1 != -13184) {
            this.method2410((byte) -60);
        }
        this.method1804(arg2, arg3);
        ++field8115;
        this.field8116 = arg0;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)I")
    public final int method2405(int arg0) {
        ++field8109;
        if (arg0 != -14757) {
            method3257(-63);
        }
        return this.field8116;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Ljava/awt/Component;B)Lnt;")
    public static final class758 method3258(Component arg0, byte arg1) {
        ++field8112;
        if (arg1 >= -41) {
            field8113 = null;
        }
        return new class505(arg0);
    }
}
