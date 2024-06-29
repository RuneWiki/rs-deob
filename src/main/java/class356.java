import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class356 {

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "Lie;")
    private class6 field5199 = new class6();

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field5203 = 1339;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "F")
    public static float field5200 = 1.0F;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field5194;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field5195;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lmg;")
    public static class101 field5196;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Lie;")
    private class6 field5206;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BLie;)V", line = 7)
    public final void method2127(byte arg0, class6 arg1) {
        field5195++;
        if (arg1.field106 != null) {
            arg1.method36(0);
        }
        if (arg0 > -95) {
            this.method2130(true);
        }
        arg1.field106 = this.field5199.field106;
        arg1.field108 = this.field5199;
        arg1.field106.field108 = arg1;
        arg1.field108.field106 = arg1;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)Lie;", line = 24)
    public final class6 method2128(int arg0) {
        field5201++;
        class6 var2 = this.field5199.field108;
        if (this.field5199 == var2) {
            return null;
        }
        if (arg0 != 1339) {
            this.method2131(false);
        }
        var2.method36(0);
        return var2;
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(I)I", line = 41)
    public final int method2129(int arg0) {
        field5204++;
        int var2 = 0;
        if (arg0 != 1) {
            field5203 = 90;
        }
        for (class6 var3 = this.field5199.field108; var3 != this.field5199; var3 = var3.field108) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)Lie;", line = 64)
    public final class6 method2130(boolean arg0) {
        field5205++;
        class6 var2 = this.field5199.field108;
        if (this.field5199 == var2) {
            this.field5206 = null;
            return null;
        } else {
            this.field5206 = var2.field108;
            return arg0 ? null : var2;
        }
    }

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(Z)Lie;", line = 85)
    public final class6 method2131(boolean arg0) {
        field5197++;
        class6 var2 = this.field5206;
        if (this.field5199 == var2) {
            this.field5206 = null;
            return null;
        }
        if (!arg0) {
            this.method2127((byte) -107, null);
        }
        this.field5206 = var2.field108;
        return var2;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lem;BZ)V", line = 107)
    public static final void method2132(class150 arg0, byte arg1, boolean arg2) {
        field5194++;
        if (arg1 != 65) {
            method2133(109, null, -125, -26, 4);
        }
        int var3 = arg0.field2187 == 0 ? arg0.field2204 : arg0.field2187;
        int var4 = arg0.field2308 == 0 ? arg0.field2322 : arg0.field2308;
        class200.method1248(var4, class495.field7226[arg0.field2277 >> 16], arg0.field2277, var3, arg2, -1);
        if (arg0.field2299 != null) {
            class200.method1248(var4, arg0.field2299, arg0.field2277, var3, arg2, -1);
        }
        class295 var5 = (class295) class212.field2960.method1492((long) arg0.field2277, 6340);
        if (var5 != null) {
            class436.method2569(var5.field4055, 31708, var3, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILoo;III)V", line = 131)
    public static final void method2133(int arg0, class440 arg1, int arg2, int arg3, int arg4) {
        field5198++;
        long var5 = (long) (arg2 | arg4 << 28 | arg0 << 14);
        class135 var7 = (class135) class36.field457.method1492(var5, 6340);
        if (var7 == null) {
            class135 var8 = new class135();
            class36.field457.method1487(-103, var5, var8);
            var8.field1950.method2809(arg1, 2);
            return;
        }
        class508 var9 = class328.field4480.method3091(59, arg1.field6509);
        int var10 = var9.field7501;
        if (var9.field7511 == 1) {
            var10 = (arg1.field6507 + 1) * var10;
        }
        int var11 = 32 % (arg3 / 63);
        for (class440 var12 = (class440) var7.field1950.method2818((byte) 126); var12 != null; var12 = (class440) var7.field1950.method2820((byte) -58)) {
            class508 var13 = class328.field4480.method3091(118, var12.field6509);
            int var14 = var13.field7501;
            if (var13.field7511 == 1) {
                var14 = (var12.field6507 + 1) * var14;
            }
            if (var14 < var10) {
                class158.method1051(var12, arg1, -19039);
                return;
            }
        }
        var7.field1950.method2809(arg1, 2);
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 238)
    public class356() {
        this.field5199.field106 = this.field5199;
        this.field5199.field108 = this.field5199;
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(Z)V", line = 187)
    public static void method2134(boolean arg0) {
        field5196 = null;
        if (!arg0) {
            field5196 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(I)V", line = 209)
    public final void method2135(int arg0) {
        while (true) {
            class6 var2 = this.field5199.field108;
            if (this.field5199 == var2) {
                if (arg0 > -116) {
                    field5196 = null;
                }
                field5202++;
                this.field5206 = null;
                return;
            }
            var2.method36(0);
        }
    }
}
