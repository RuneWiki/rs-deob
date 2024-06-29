import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class148 extends class51 {

    @OriginalMember(owner = "client!qe", name = "eb", descriptor = "I")
    private int field3074 = 4096;

    @OriginalMember(owner = "client!qe", name = "bb", descriptor = "Lea;")
    private static class38 field3071 = class9.method46((byte) 116, "Cancel");

    @OriginalMember(owner = "client!qe", name = "db", descriptor = "Lea;")
    public static class38 field3073 = class9.method46((byte) 121, "<)4col> x");

    @OriginalMember(owner = "client!qe", name = "ab", descriptor = "Lea;")
    public static class38 field3070 = field3071;

    @OriginalMember(owner = "client!qe", name = "Z", descriptor = "Lrc;")
    public static class155 field3069 = new class155(500);

    @OriginalMember(owner = "client!qe", name = "ib", descriptor = "I")
    public static int field3078 = 0;

    @OriginalMember(owner = "client!qe", name = "lb", descriptor = "I")
    public static int field3081 = 0;

    @OriginalMember(owner = "client!qe", name = "mb", descriptor = "I")
    public static volatile int field3082 = -1;

    @OriginalMember(owner = "client!qe", name = "cb", descriptor = "I")
    public static int field3072;

    @OriginalMember(owner = "client!qe", name = "fb", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!qe", name = "gb", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!qe", name = "jb", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!qe", name = "hb", descriptor = "[I")
    public static int[] field3077;

    @OriginalMember(owner = "client!qe", name = "kb", descriptor = "[I")
    public static int[] field3080;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI[BLre;[Lfh;)V")
    public static final void method1047(int arg0, byte arg1, int arg2, byte[] arg3, class157 arg4, class54[] arg5) {
        int var6 = 117 % ((-22 - arg1) / 34);
        ++field3076;
        int var7 = -1;
        class66 var8 = new class66(arg3);
        while (true) {
            int var9 = var8.method492(255);
            if (~var9 == -1) {
                return;
            }
            int var10 = 0;
            var7 += var9;
            while (true) {
                int var11 = var8.method492(255);
                if (~var11 == -1) {
                    break;
                }
                var10 += var11 + -1;
                int var12 = var10 & 63;
                int var13 = (4077 & var10) >> 6;
                int var14 = var8.method509(127);
                int var15 = var10 >> 12;
                int var16 = var14 >> 2;
                int var17 = arg0 + var12;
                int var18 = arg2 + var13;
                int var19 = var14 & 3;
                if (~var18 < -1 && ~var17 < -1 && ~var18 > -104 && ~var17 > -104) {
                    class54 var20 = null;
                    int var21 = var15;
                    if ((class3.field104[1][var18][var17] & 2) == 2) {
                        var21 = var15 - 1;
                    }
                    if (var21 >= 0) {
                        var20 = arg5[var21];
                    }
                    class137.method990(var7, var16, var19, var15, arg4, false, var17, var18, var20);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        if (arg0 >= -125) {
            field3078 = -70;
        }
        int[] var3 = super.field1312.method827(arg1, true);
        if (super.field1312.field2271) {
            int[] var4 = this.method376(class144.field3018 & arg1 + -1, 0, -61);
            int[] var5 = this.method376(arg1, 0, -44);
            int[] var6 = this.method376(arg1 + 1 & class144.field3018, 0, -95);
            for (int var7 = 0; var7 < class86.field2008; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field3074;
                int var9 = (var5[var7 + 1 & class39.field850] + -var5[class39.field850 & var7 + -1]) * this.field3074;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((var11 + var13 + 4096) / 4096)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        ++field3072;
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class148() {
        super(1, true);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)V")
    public static void method1048(byte arg0) {
        field3077 = null;
        field3070 = null;
        field3071 = null;
        field3069 = null;
        field3080 = null;
        field3073 = null;
        if (arg0 != -122) {
            method1047(-47, (byte) -83, -14, (byte[]) null, (class157) null, (class54[]) null);
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lhc;IZ)V")
    public final void method51(class66 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field3080 = null;
        }
        if (arg1 == 0) {
            this.field3074 = arg0.method511(-127);
        }
        ++field3075;
    }
}
