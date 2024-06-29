import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class479 {

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "Luj;")
    public class260 field6997 = new class260();

    @OriginalMember(owner = "client!ar", name = "i", descriptor = "Lwj;")
    public static class270 field7002 = new class270(29, 6);

    @OriginalMember(owner = "client!ar", name = "t", descriptor = "I")
    public static int field7013 = 1;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "I")
    public static int field6994;

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "I")
    public static int field6995;

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "I")
    public static int field6996;

    @OriginalMember(owner = "client!ar", name = "e", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!ar", name = "f", descriptor = "I")
    public static int field6999;

    @OriginalMember(owner = "client!ar", name = "g", descriptor = "I")
    public static int field7000;

    @OriginalMember(owner = "client!ar", name = "h", descriptor = "I")
    public static int field7001;

    @OriginalMember(owner = "client!ar", name = "j", descriptor = "I")
    public static int field7003;

    @OriginalMember(owner = "client!ar", name = "k", descriptor = "I")
    public static int field7004;

    @OriginalMember(owner = "client!ar", name = "l", descriptor = "I")
    public static int field7005;

    @OriginalMember(owner = "client!ar", name = "m", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!ar", name = "n", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!ar", name = "p", descriptor = "I")
    public static int field7009;

    @OriginalMember(owner = "client!ar", name = "q", descriptor = "I")
    public static int field7010;

    @OriginalMember(owner = "client!ar", name = "s", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!ar", name = "r", descriptor = "Luj;")
    private class260 field7011;

    @OriginalMember(owner = "client!ar", name = "o", descriptor = "[I")
    public static int[] field7008;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method2805(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7003++;
        float var5 = (float) class350.field5137 / (float) class350.field5132;
        int var6 = arg1;
        int var7 = arg2;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg1 * var5);
        } else {
            var6 = (int) ((float) arg2 / var5);
        }
        int var8 = arg4 - (arg2 - var7) / 2;
        int var9 = arg0 - (arg1 - var6) / 2;
        class295.field4056 = -1;
        class299.field4107 = class350.field5132 * var9 / var6;
        class495.field7230 = arg3;
        class80.field1216 = class350.field5137 - (class350.field5137 * var8 / var7);
        class279.method1660(false);
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I", line = 28)
    public final int method2806(byte arg0) {
        field7001++;
        int var2 = 0;
        class260 var3 = this.field6997.field3612;
        int var4 = 45 % ((-arg0 - 39) / 45);
        while (this.field6997 != var3) {
            var2++;
            var3 = var3.field3612;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)Z", line = 48)
    public final boolean method2807(int arg0) {
        field7012++;
        if (arg0 <= 99) {
            return false;
        } else {
            return this.field6997.field3612 == this.field6997;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lar;I)V", line = 59)
    public final void method2808(class479 arg0, int arg1) {
        field6996++;
        if (arg1 <= -62) {
            this.method2812(arg0, this.field6997.field3612, 111);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Luj;I)V", line = 71)
    public final void method2809(class260 arg0, int arg1) {
        if (arg0.field3617 != null) {
            arg0.method1565(0);
        }
        field6999++;
        arg0.field3617 = this.field6997.field3617;
        if (arg1 == 2) {
            arg0.field3612 = this.field6997;
            arg0.field3617.field3612 = arg0;
            arg0.field3612.field3617 = arg0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(I)V", line = 96)
    public static void method2810(int arg0) {
        if (arg0 != 2) {
            field7013 = -121;
        }
        field7002 = null;
        field7008 = null;
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)Luj;", line = 107)
    public final class260 method2811(int arg0) {
        field7007++;
        class260 var2 = this.field6997.field3617;
        if (arg0 != 2) {
            return null;
        } else if (this.field6997 == var2) {
            this.field7011 = null;
            return null;
        } else {
            this.field7011 = var2.field3617;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lar;Luj;I)V", line = 130)
    private final void method2812(class479 arg0, class260 arg1, int arg2) {
        field7000++;
        int var4 = -59 / ((64 - arg2) / 32);
        class260 var5 = this.field6997.field3617;
        this.field6997.field3617 = arg1.field3617;
        arg1.field3617.field3612 = this.field6997;
        if (this.field6997 != arg1) {
            arg1.field3617 = arg0.field6997.field3617;
            arg1.field3617.field3612 = arg1;
            arg0.field6997.field3617 = var5;
            var5.field3612 = arg0.field6997;
        }
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)Luj;", line = 153)
    public final class260 method2813(int arg0) {
        field7004++;
        class260 var2 = this.field7011;
        if (this.field6997 == var2) {
            this.field7011 = null;
            return null;
        } else {
            this.field7011 = var2.field3617;
            return arg0 == 29 ? var2 : null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V", line = 175)
    public final void method2814(byte arg0) {
        field7005++;
        while (true) {
            class260 var2 = this.field6997.field3612;
            if (this.field6997 == var2) {
                this.field7011 = null;
                if (arg0 <= 71) {
                    this.field7011 = null;
                    return;
                } else {
                    return;
                }
            }
            var2.method1565(0);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IIB)Z", line = 196)
    public static final boolean method2815(int arg0, int arg1, byte arg2) {
        field7009++;
        if (arg2 <= 67) {
            return false;
        } else {
            return (arg0 & 0x70000) != 0 | class438.method2587(0, arg0, arg1) || class211.method1306(arg0, 32, arg1);
        }
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)Luj;", line = 208)
    public final class260 method2816(boolean arg0) {
        field7006++;
        class260 var2 = this.field6997.field3612;
        if (this.field6997 == var2) {
            return null;
        }
        var2.method1565(0);
        if (!arg0) {
            field7013 = -66;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Luj;Z)V", line = 230)
    public final void method2817(class260 arg0, boolean arg1) {
        field6994++;
        if (arg0.field3617 != null) {
            arg0.method1565(0);
        }
        arg0.field3617 = this.field6997;
        arg0.field3612 = this.field6997.field3612;
        if (arg1) {
            arg0.field3617.field3612 = arg0;
            arg0.field3612.field3617 = arg0;
        }
    }

    @OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Luj;", line = 249)
    public final class260 method2818(byte arg0) {
        field6995++;
        class260 var2 = this.field6997.field3612;
        int var3 = -25 / ((arg0 - 58) / 42);
        if (this.field6997 == var2) {
            this.field7011 = null;
            return null;
        } else {
            this.field7011 = var2.field3612;
            return var2;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V", line = 290)
    public class479() {
        this.field6997.field3612 = this.field6997;
        this.field6997.field3617 = this.field6997;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(Ltt;BLtt;ZZII)I", line = 300)
    public static final int method2819(class61 arg0, byte arg1, class61 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field7010++;
        if (arg1 < 60) {
            return -83;
        }
        int var7 = class416.method2479(arg4, arg0, 44, arg6, arg2);
        if (var7 != 0) {
            return arg4 ? -var7 : var7;
        } else if (arg5 == -1) {
            return 0;
        } else {
            int var8 = class416.method2479(arg3, arg0, -117, arg5, arg2);
            return arg3 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(B)Luj;", line = 332)
    public final class260 method2820(byte arg0) {
        field6998++;
        class260 var2 = this.field7011;
        if (arg0 != -58) {
            this.method2811(-2);
        }
        if (this.field6997 == var2) {
            this.field7011 = null;
            return null;
        } else {
            this.field7011 = var2.field3612;
            return var2;
        }
    }
}
