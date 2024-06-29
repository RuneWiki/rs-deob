import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gca")
public class class227 {

    @OriginalMember(owner = "client!gca", name = "g", descriptor = "Lrp;")
    public class401 field3151 = new class401();

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "Llh;")
    public static class487 field3145 = new class487(27, 2);

    @OriginalMember(owner = "client!gca", name = "s", descriptor = "I")
    public static int field3163 = -1;

    @OriginalMember(owner = "client!gca", name = "p", descriptor = "[I")
    public static int[] field3160 = new int[2];

    @OriginalMember(owner = "client!gca", name = "o", descriptor = "Lhw;")
    public static class115 field3159 = new class115();

    @OriginalMember(owner = "client!gca", name = "u", descriptor = "Llh;")
    public static class487 field3165 = new class487(24, -1);

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "I")
    public static int field3146;

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!gca", name = "e", descriptor = "I")
    public static int field3149;

    @OriginalMember(owner = "client!gca", name = "f", descriptor = "I")
    public static int field3150;

    @OriginalMember(owner = "client!gca", name = "h", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!gca", name = "i", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!gca", name = "j", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!gca", name = "k", descriptor = "I")
    public static int field3155;

    @OriginalMember(owner = "client!gca", name = "l", descriptor = "I")
    public static int field3156;

    @OriginalMember(owner = "client!gca", name = "m", descriptor = "I")
    public static int field3157;

    @OriginalMember(owner = "client!gca", name = "n", descriptor = "I")
    public static int field3158;

    @OriginalMember(owner = "client!gca", name = "q", descriptor = "I")
    public static int field3161;

    @OriginalMember(owner = "client!gca", name = "t", descriptor = "Lrp;")
    private class401 field3164;

    @OriginalMember(owner = "client!gca", name = "r", descriptor = "Lsea;")
    public static class648 field3162;

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILrp;Lgca;)V")
    private final void method1432(int arg0, class401 arg1, class227 arg2) {
        if (arg0 != 0) {
            this.method1433(true);
        }
        field3158++;
        class401 var4 = this.field3151.field5621;
        this.field3151.field5621 = arg1.field5621;
        arg1.field5621.field5625 = this.field3151;
        if (this.field3151 != arg1) {
            arg1.field5621 = arg2.field3151.field5621;
            arg1.field5621.field5625 = arg1;
            var4.field5625 = arg2.field3151;
            arg2.field3151.field5621 = var4;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Z)Lrp;")
    public final class401 method1433(boolean arg0) {
        field3146++;
        if (!arg0) {
            field3159 = null;
        }
        class401 var2 = this.field3151.field5621;
        if (this.field3151 == var2) {
            this.field3164 = null;
            return null;
        } else {
            this.field3164 = var2.field5621;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(B)I")
    public final int method1434(byte arg0) {
        field3153++;
        if (arg0 > -44) {
            this.field3164 = null;
        }
        int var2 = 0;
        class401 var3 = this.field3151.field5625;
        while (this.field3151 != var3) {
            var3 = var3.field5625;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(B)Z")
    public final boolean method1435(byte arg0) {
        field3156++;
        if (arg0 != -98) {
            this.method1442(-73);
        }
        return this.field3151.field5625 == this.field3151;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(I)Lrp;")
    public final class401 method1436(int arg0) {
        field3155++;
        class401 var2 = this.field3151.field5625;
        if (this.field3151 == var2) {
            this.field3164 = null;
            return null;
        }
        if (arg0 != 28964) {
            this.method1443((byte) -114);
        }
        this.field3164 = var2.field5625;
        return var2;
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(B)V")
    public static void method1437(byte arg0) {
        field3165 = null;
        if (arg0 >= -25) {
            method1439((byte) -62, 76, null, 63, 24, 24, -94, -74, null);
        }
        field3145 = null;
        field3162 = null;
        field3159 = null;
        field3160 = null;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(Lrp;I)V")
    public final void method1438(class401 arg0, int arg1) {
        if (arg1 != -32762) {
            return;
        }
        if (arg0.field5621 != null) {
            arg0.method2340(arg1 + 32882);
        }
        field3152++;
        arg0.field5625 = this.field3151.field5625;
        arg0.field5621 = this.field3151;
        arg0.field5621.field5625 = arg0;
        arg0.field5625.field5621 = arg0;
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(BI[BIIIII[B)V")
    public static final void method1439(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (arg0 >= 0) {
            method1437((byte) -10);
        }
        field3161++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        for (int var11 = -arg7; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg2[var10001] = (byte) (arg2[var10001] - arg8[arg4++]);
                int var14 = arg1++;
                arg2[var14] = (byte) (arg2[var14] - arg8[arg4++]);
                int var15 = arg1++;
                arg2[var15] = (byte) (arg2[var15] - arg8[arg4++]);
                int var16 = arg1++;
                arg2[var16] = (byte) (arg2[var16] - arg8[arg4++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg2[var10001] = (byte) (arg2[var10001] - arg8[arg4++]);
            }
            arg1 += arg6;
            arg4 += arg3;
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(I)Lrp;")
    public final class401 method1440(int arg0) {
        if (arg0 <= 92) {
            return null;
        }
        field3149++;
        class401 var2 = this.field3164;
        if (this.field3151 == var2) {
            this.field3164 = null;
            return null;
        } else {
            this.field3164 = var2.field5621;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gca", name = "b", descriptor = "(Lrp;I)V")
    public final void method1441(class401 arg0, int arg1) {
        field3150++;
        if (arg0.field5621 != null) {
            arg0.method2340(-53);
        }
        if (arg1 == 0) {
            arg0.field5621 = this.field3151.field5621;
            arg0.field5625 = this.field3151;
            arg0.field5621.field5625 = arg0;
            arg0.field5625.field5621 = arg0;
        }
    }

    @OriginalMember(owner = "client!gca", name = "c", descriptor = "(I)Lrp;")
    public final class401 method1442(int arg0) {
        field3148++;
        class401 var2 = this.field3151.field5625;
        if (this.field3151 == var2) {
            return null;
        }
        if (arg0 != -10011) {
            field3145 = null;
        }
        var2.method2340(75);
        return var2;
    }

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "(B)Lrp;")
    public final class401 method1443(byte arg0) {
        field3154++;
        class401 var2 = this.field3164;
        if (arg0 != 6) {
            field3160 = null;
        }
        if (this.field3151 == var2) {
            this.field3164 = null;
            return null;
        } else {
            this.field3164 = var2.field5625;
            return var2;
        }
    }

    @OriginalMember(owner = "client!gca", name = "d", descriptor = "(I)V")
    public final void method1444(int arg0) {
        field3147++;
        while (true) {
            class401 var2 = this.field3151.field5625;
            if (this.field3151 == var2) {
                this.field3164 = null;
                if (arg0 == -27547) {
                    return;
                } else {
                    this.method1434((byte) -41);
                    return;
                }
            }
            var2.method2340(75);
        }
    }

    @OriginalMember(owner = "client!gca", name = "a", descriptor = "(ILgca;)V")
    public final void method1445(int arg0, class227 arg1) {
        field3157++;
        if (arg0 != -2788) {
            this.method1432(1, null, null);
        }
        this.method1432(0, this.field3151.field5625, arg1);
    }

    @OriginalMember(owner = "client!gca", name = "<init>", descriptor = "()V")
    public class227() {
        this.field3151.field5625 = this.field3151;
        this.field3151.field5621 = this.field3151;
    }
}
