import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wn")
public class class720 {

    @OriginalMember(owner = "client!wn", name = "d", descriptor = "Z")
    public boolean field10078 = false;

    @OriginalMember(owner = "client!wn", name = "i", descriptor = "Lqaa;")
    public static class27 field10083 = new class27(74, 4);

    @OriginalMember(owner = "client!wn", name = "j", descriptor = "Lmp;")
    public static class758 field10084 = new class758(16);

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!wn", name = "b", descriptor = "I")
    public static int field10076;

    @OriginalMember(owner = "client!wn", name = "c", descriptor = "I")
    public static int field10077;

    @OriginalMember(owner = "client!wn", name = "e", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!wn", name = "f", descriptor = "I")
    public static int field10080;

    @OriginalMember(owner = "client!wn", name = "g", descriptor = "I")
    public int field10081;

    @OriginalMember(owner = "client!wn", name = "k", descriptor = "I")
    public int field10085;

    @OriginalMember(owner = "client!wn", name = "h", descriptor = "Lgv;")
    public class81 field10082;

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(IILha;Z)Lkr;")
    public final class743 method4014(int arg0, int arg1, class58 arg2, boolean arg3) {
        int var5 = 97 / ((32 - arg1) / 45);
        field10080++;
        long var6 = (long) (arg2.field1071 << 19 | this.field10085 | arg0 << 16 | (arg3 ? 262144 : 0));
        class743 var8 = (class743) this.field10082.field1513.method3054((byte) -110, var6);
        if (var8 != null) {
            return var8;
        } else if (this.field10082.field1509.method1472(-25711, this.field10085)) {
            class55 var9 = class55.method502(this.field10082.field1509, this.field10085, 0);
            if (var9 != null) {
                var9.field1043 = var9.field1042 = var9.field1037 = var9.field1036 = 0;
                if (arg3) {
                    var9.method508();
                }
                for (int var10 = 0; var10 < arg0; var10++) {
                    var9.method497();
                }
            }
            class743 var11 = arg2.method637(var9, true);
            if (var11 != null) {
                this.field10082.field1513.method3047(false, var11, var6);
            }
            return var11;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(ILud;I)V")
    private final void method4015(int arg0, class35 arg1, int arg2) {
        field10079++;
        int var4 = -22 % ((1 - arg0) / 33);
        if (arg2 == 1) {
            this.field10085 = arg1.method253(-13900);
        } else if (arg2 == 2) {
            this.field10081 = arg1.method239(-47);
        } else if (arg2 == 3) {
            this.field10078 = true;
        } else if (arg2 == 4) {
            this.field10085 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(Z)Z")
    public final boolean method4016(boolean arg0) {
        field10075++;
        if (!arg0) {
            this.field10081 = 54;
        }
        return this.field10082.field1509.method1472(-25711, this.field10085);
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(I)V")
    public static void method4017(int arg0) {
        if (arg0 == 1804438800) {
            field10083 = null;
            field10084 = null;
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "(BLud;)V")
    public final void method4018(byte arg0, class35 arg1) {
        field10077++;
        if (arg0 >= -84) {
            return;
        }
        while (true) {
            int var3 = arg1.method273(255);
            if (var3 == 0) {
                return;
            }
            this.method4015(-54, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!wn", name = "a", descriptor = "([IIII[I)V")
    public static final void method4019(int[] arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field10076++;
        if (arg3 <= 52) {
            field10084 = null;
        }
        if (arg1 >= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg1;
        int var7 = arg4[var5];
        arg4[var5] = arg4[arg2];
        arg4[arg2] = var7;
        int var8 = arg0[var5];
        arg0[var5] = arg0[arg2];
        arg0[arg2] = var8;
        int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
        for (int var10 = arg1; var10 < arg2; var10++) {
            if (arg4[var10] < ((var9 & var10) + var7)) {
                int var11 = arg4[var10];
                arg4[var10] = arg4[var6];
                arg4[var6] = var11;
                int var12 = arg0[var10];
                arg0[var10] = arg0[var6];
                arg0[var6++] = var12;
            }
        }
        arg4[arg2] = arg4[var6];
        arg4[var6] = var7;
        arg0[arg2] = arg0[var6];
        arg0[var6] = var8;
        method4019(arg0, arg1, var6 - 1, 125, arg4);
        method4019(arg0, var6 + 1, arg2, 88, arg4);
    }
}
