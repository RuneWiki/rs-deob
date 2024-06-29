import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class186 extends class23 {

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field3374 = 0;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "[I")
    public static int[] field3378 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "Llc;")
    public static class143 field3382 = class66.method374(":assistreq:", -1);

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "Lng;")
    public static class139 field3380 = new class139(64);

    @OriginalMember(owner = "client!fg", name = "I", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "I")
    public static int field3381;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "[Lvg;")
    public static class230[] field3379;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        if (arg0 > -13) {
            method1216(-62, -115, 112, 20, -36);
        }
        ++field3375;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            for (int var4 = 0; ~class72.field1359 < ~var4; ++var4) {
                this.method1214((byte) 59, var4, arg1);
                int[] var5 = this.method155(class133.field2323, (byte) 113, 0);
                var3[var4] = var5[class244.field4380];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        ++field3373;
        if (arg1 != 1) {
            method1215((byte) 110);
        }
        int[][] var3 = super.field366.method209(0, arg0);
        if (super.field366.field508) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            for (int var7 = 0; ~var7 > ~class72.field1359; ++var7) {
                this.method1214((byte) 59, var7, arg0);
                int[][] var8 = this.method161(class133.field2323, 0, 0);
                var4[var7] = var8[0][class244.field4380];
                var6[var7] = var8[1][class244.field4380];
                var5[var7] = var8[2][class244.field4380];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(JI)V")
    public static final void method1213(long arg0, int arg1) {
        ++field3376;
        if (arg0 != 0L) {
            for (int var3 = arg1; var3 < class184.field3338; ++var3) {
                if (~class255.field4585[var3] == ~arg0) {
                    ++class67.field1271;
                    --class184.field3338;
                    for (int var4 = var3; var4 < class184.field3338; ++var4) {
                        class255.field4585[var4] = class255.field4585[var4 + 1];
                        class153.field2769[var4] = class153.field2769[var4 + 1];
                    }
                    class129.field2294 = class13.field249;
                    class285.field5010.method799(103, 46);
                    class285.field5010.method1243(arg0, 92);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(BII)V")
    private final void method1214(byte arg0, int arg1, int arg2) {
        int var4 = class3.field43[arg1];
        if (arg0 != 59) {
            this.method83((class190) null, -69, true);
        }
        int var5 = class31.field495[arg2];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        ++field3381;
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class244.field4380 = arg1;
            class133.field2323 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class133.field2323 = arg1;
            class244.field4380 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class133.field2323 = arg1;
            class244.field4380 = -arg2 + class72.field1359;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class133.field2323 = -arg2 + class9.field179;
            class244.field4380 = arg1;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class244.field4380 = -arg1 + class72.field1359;
            class133.field2323 = -arg2 + class9.field179;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class244.field4380 = class72.field1359 - arg2;
            class133.field2323 = class9.field179 - arg1;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class133.field2323 = -arg1 + class9.field179;
            class244.field4380 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class133.field2323 = arg2;
            class244.field4380 = -arg1 + class72.field1359;
        }
        class133.field2323 &= class79.field1426;
        class244.field4380 &= class172.field3077;
    }

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "(B)V")
    public static void method1215(byte arg0) {
        field3378 = null;
        if (arg0 <= 45) {
            field3380 = null;
        }
        field3382 = null;
        field3379 = null;
        field3380 = null;
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class186() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        ++field3377;
        if (~arg1 == -1) {
            super.field373 = ~arg0.method1265(123) == -2;
        }
        if (!arg2) {
            field3382 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIII)V")
    public static final void method1216(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        if (arg2 > -121) {
            method1215((byte) -114);
        }
        while (~var5 > ~class128.field2260) {
            if (arg3 < class255.field4572[var5] + class133.field2330[var5] && ~(arg0 + arg3) < ~class255.field4572[var5] && class237.field4306[var5] + class176.field3151[var5] > arg1 && class176.field3151[var5] < arg1 + arg4) {
                class136.field2384[var5] = true;
            }
            ++var5;
        }
        ++field3372;
    }
}
