import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class386 {

    @OriginalMember(owner = "client!im", name = "o", descriptor = "I")
    public int field5211 = 0;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    public int field5210 = 0;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "Lad;")
    private class19 field5206 = new class19(64);

    @OriginalMember(owner = "client!im", name = "q", descriptor = "Lte;")
    private class493 field5213 = null;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "Ltf;")
    private class701 field5197;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "Ltf;")
    private class701 field5198;

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field5212 = -2;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Lsb;")
    public static class305 field5203 = new class305(47, 3);

    @OriginalMember(owner = "client!im", name = "c", descriptor = "F")
    public static float field5199;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!im", name = "f", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "Lnp;")
    public static class115 field5205;

    @OriginalMember(owner = "client!im", name = "e", descriptor = "Lcj;")
    public static class178 field5201;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Lqs;")
    public static class71 field5208;

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(ILoh;[II)V")
    public static final void method2207(int arg0, class600 arg1, int[] arg2, int arg3) {
        field5204++;
        if (arg1.field9466 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg1.field9466.length; var5++) {
                if (arg1.field9466[var5] != arg2[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg1.field9455 != -1) {
                class257 var6 = class265.field3301.method3043(arg1.field9455, -8191);
                int var7 = var6.field3220;
                if (var7 == 1) {
                    arg1.field9435 = 0;
                    arg1.field9482 = arg3;
                    arg1.field9421 = 1;
                    arg1.field9424 = 0;
                    arg1.field9442 = 0;
                    class635.method3570((byte) -68, false, arg1.field5179, var6, arg1.field5166, arg1.field5176, arg1.field9435);
                }
                if (var7 == 2) {
                    arg1.field9424 = 0;
                }
            }
        }
        boolean var8 = true;
        int var9 = 0;
        if (arg0 != -3) {
            field5212 = 71;
        }
        while (var9 < arg2.length) {
            if (arg2[var9] != -1) {
                var8 = false;
            }
            if (arg1.field9466 == null || arg1.field9466[var9] == -1 || class265.field3301.method3043(arg2[var9], -8191).field3225 >= class265.field3301.method3043(arg1.field9466[var9], -8191).field3225) {
                arg1.field9516 = arg1.field9518;
                arg1.field9466 = arg2;
                arg1.field9482 = arg3;
            }
            var9++;
        }
        if (var8) {
            arg1.field9466 = arg2;
            arg1.field9482 = arg3;
            arg1.field9516 = arg1.field9518;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(JLwd;I[I)Ljava/lang/String;")
    public final String method2208(long arg0, class357 arg1, int arg2, int[] arg3) {
        field5202++;
        if (arg2 != 1) {
            method2207(56, null, null, 37);
        }
        if (this.field5213 != null) {
            String var6 = this.field5213.method1475(arg1, arg3, false, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)V")
    public static void method2209(int arg0) {
        field5208 = null;
        field5201 = null;
        field5205 = null;
        int var1 = -109 % ((arg0 - 70) / 33);
        field5203 = null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lr;IIZ)Ldda;")
    public static final class651 method2210(class564 arg0, int arg1, int arg2, boolean arg3) {
        field5207++;
        if (arg2 == -1) {
            return null;
        }
        if (class274.field3434 != null) {
            for (int var4 = 0; var4 < class274.field3434.length; var4++) {
                if (class274.field3434[var4] == arg2) {
                    return class517.field7368[var4];
                }
            }
        }
        if (arg1 >= -72) {
            method2209(29);
        }
        class651 var5 = (class651) class403.field5401.method78(0, (long) arg2);
        if (var5 != null) {
            if (arg3 && var5.field9143 == null) {
                class463 var6 = class658.method3651(-113, arg2, class489.field7119);
                if (var6 == null) {
                    return null;
                }
                var5.field9143 = var6;
            }
            return var5;
        }
        class550[] var7 = class550.method3119(class157.field1759, arg2);
        if (var7 == null) {
            return null;
        }
        class463 var8 = class658.method3651(-111, arg2, class489.field7119);
        if (var8 == null) {
            return null;
        }
        class651 var9;
        if (arg3) {
            var9 = new class651(arg0.method998(var8, var7, true), var8);
        } else {
            var9 = new class651(arg0.method998(var8, var7, true));
        }
        class403.field5401.method92(1, (long) arg2, var9);
        return var9;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)Lfn;")
    public final class290 method2211(int arg0, int arg1) {
        field5200++;
        if (arg1 != -27582) {
            this.method2208(-56L, null, 118, null);
        }
        class290 var3 = (class290) this.field5206.method78(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field5197.method3854((byte) 64, 1, arg0);
        } else {
            var4 = this.field5198.method3854((byte) 68, 1, arg0 & 0x7FFF);
        }
        class290 var5 = new class290();
        var5.field3634 = this;
        if (var4 != null) {
            var5.method1690(new class115(var4), true);
        }
        if (arg0 >= 32768) {
            var5.method1695((byte) -128);
        }
        this.field5206.method92(arg1 + 27583, (long) arg0, var5);
        return var5;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(ILtf;Ltf;Lte;)V")
    public class386(int arg0, class701 arg1, class701 arg2, class493 arg3) {
        this.field5197 = arg1;
        this.field5198 = arg2;
        this.field5213 = arg3;
        if (this.field5197 != null) {
            this.field5210 = this.field5197.method3883(1, 0);
        }
        if (this.field5198 != null) {
            this.field5211 = this.field5198.method3883(1, 0);
        }
    }
}
