import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class203 extends class142 {

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    private int field3951 = 1;

    @OriginalMember(owner = "client!wd", name = "cb", descriptor = "I")
    private int field3962 = 1;

    @OriginalMember(owner = "client!wd", name = "lb", descriptor = "I")
    private int field3971 = 204;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "I")
    public static int field3952 = 0;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "Lai;")
    public static class10 field3958 = class44.method278("<col=ff7000>", -45);

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Lai;")
    public static class10 field3957 = class44.method278("Gegenstand f-Ur Mitglieder", 126);

    @OriginalMember(owner = "client!wd", name = "gb", descriptor = "Lai;")
    public static class10 field3966 = class44.method278("::rect_debug", 104);

    @OriginalMember(owner = "client!wd", name = "ab", descriptor = "Lai;")
    public static class10 field3960 = class44.method278("(U0a )2 non)2existant gosub script)2num: ", 92);

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "Lai;")
    private static class10 field3956 = class44.method278("To create a new account you need to", -85);

    @OriginalMember(owner = "client!wd", name = "hb", descriptor = "Lai;")
    public static class10 field3967 = class44.method278("<col=c0ff00>", 125);

    @OriginalMember(owner = "client!wd", name = "jb", descriptor = "[I")
    public static int[] field3969 = new int[128];

    @OriginalMember(owner = "client!wd", name = "ib", descriptor = "Lai;")
    public static class10 field3968 = field3956;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "I")
    public static int field3955;

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!wd", name = "db", descriptor = "I")
    public static int field3963;

    @OriginalMember(owner = "client!wd", name = "kb", descriptor = "Lwb;")
    public static class201 field3970;

    @OriginalMember(owner = "client!wd", name = "eb", descriptor = "Lc;")
    public static class21 field3964;

    @OriginalMember(owner = "client!wd", name = "fb", descriptor = "Lc;")
    public static class21 field3965;

    @OriginalMember(owner = "client!wd", name = "bb", descriptor = "[I")
    public static int[] field3961;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILwa;)I")
    public static final int method1318(int arg0, class200 arg1) {
        if (arg0 != 0) {
            field3964 = null;
        }
        ++field3955;
        class29 var2 = (class29) class207.field4032.method213(-127, ((long) arg1.field3833 << 32) + (long) arg1.field3871);
        return var2 != null ? var2.field430 : arg1.field3849;
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "()V")
    public class203() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lme;IB)V")
    public final void method78(class114 arg0, int arg1, byte arg2) {
        ++field3953;
        if (arg2 < -34) {
            if (arg1 != 0) {
                if (~arg1 != -2) {
                    if (arg1 == 2) {
                        this.field3971 = arg0.method762((byte) 107);
                    }
                } else {
                    this.field3951 = arg0.method767(true);
                }
            } else {
                this.field3962 = arg0.method767(true);
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ZI)[I")
    public final int[] method6(boolean arg0, int arg1) {
        ++field3959;
        int[] var3 = super.field2683.method1186((byte) -114, arg1);
        if (arg0) {
            method1318(-59, (class200) null);
        }
        if (super.field2683.field3516) {
            for (int var4 = 0; var4 < class133.field2499; ++var4) {
                int var5 = class13.field212[arg1];
                int var6 = class79.field1395[var4];
                int var7 = this.field3951 * var5 >> 12;
                int var8 = var6 % (4096 / this.field3962) * this.field3962;
                int var9 = var5 % (4096 / this.field3951) * this.field3951;
                int var10 = this.field3962 * var6 >> 12;
                if (~this.field3971 < ~var9) {
                    for (var10 -= var7; ~var10 > -1; var10 += 4) {
                    }
                    while (~var10 < -4) {
                        var10 -= 4;
                    }
                    if (~var10 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~this.field3971 < ~var8) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var8 > ~this.field3971) {
                    int var11;
                    for (var11 = var10 - var7; ~var11 > -1; var11 += 4) {
                    }
                    while (~var11 < -4) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[BIIII[Ll;III)V")
    public static final void method1319(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, class100[] arg6, int arg7, int arg8, int arg9) {
        for (int var10 = arg2; ~var10 > -9; ++var10) {
            for (int var15 = 0; var15 < 8; ++var15) {
                if (arg4 - -var10 > 0 && arg4 - -var10 < 103 && ~(arg7 - -var15) < -1 && arg7 + var15 < 103) {
                    arg6[arg5].field1852[arg4 + var10][arg7 + var15] = class123.method861(arg6[arg5].field1852[arg4 + var10][arg7 + var15], -16777217);
                }
            }
        }
        ++field3954;
        class114 var11 = new class114(arg1);
        for (int var12 = 0; var12 < 4; ++var12) {
            for (int var13 = 0; ~var13 > -65; ++var13) {
                for (int var14 = 0; var14 < 64; ++var14) {
                    if (arg9 == var12 && ~var13 <= ~arg0 && var13 < arg0 + 8 && var14 >= arg8 && ~(arg8 + 8) < ~var14) {
                        class67.method437(false, 0, arg5, arg3, 0, arg4 - -class76.method472(var14 & 7, var13 & 7, arg2 ^ 22373, arg3), var11, class121.method852(7 & var13, arg3, (byte) 21, var14 & 7) + arg7);
                    } else {
                        class67.method437(false, 0, 0, 0, 0, -1, var11, -1);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "(I)V")
    public static void method1320(int arg0) {
        field3958 = null;
        field3966 = null;
        field3964 = null;
        field3961 = null;
        field3970 = null;
        field3967 = null;
        field3968 = null;
        field3957 = null;
        field3965 = null;
        field3956 = null;
        if (arg0 != -2) {
            field3967 = null;
        }
        field3969 = null;
        field3960 = null;
    }
}
