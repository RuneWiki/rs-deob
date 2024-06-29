import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class3 {

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lfba;")
    private class348 field19 = new class348(64);

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lla;")
    private class423 field18;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[I")
    public static int[] field12 = new int[1];

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "Llc;")
    public static class435 field17 = new class435(2, 3);

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
    public static int field22 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[B)Ljj;", line = 5)
    public static final class657 method10(int arg0, byte[] arg1) {
        field20++;
        class657 var2 = new class657();
        class479 var3 = new class479(arg1);
        var3.field6864 = var3.field6800.length - 2;
        int var4 = var3.method2882(-1);
        int var5 = var3.field6800.length - var4 - 14;
        var3.field6864 = var5;
        int var6 = var3.method2868(-118);
        var2.field9411 = var3.method2882(-1);
        var2.field9416 = var3.method2882(arg0 ^ 0x27);
        var2.field9412 = var3.method2882(-1);
        var2.field9409 = var3.method2882(arg0 ^ 0x27);
        int var7 = var3.method2886(true);
        if (arg0 != -40) {
            return null;
        }
        if (var7 > 0) {
            var2.field9414 = new class715[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2882(-1);
                class715 var10 = new class715(class68.method609(var9, (byte) -126));
                var2.field9414[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2868(arg0 - 59);
                    int var12 = var3.method2868(-128);
                    var10.method4022(new class177(var12), -39, (long) var11);
                }
            }
        }
        var3.field6864 = 0;
        var2.field9410 = var3.method2917(-112);
        var2.field9406 = new int[var6];
        var2.field9408 = new String[var6];
        var2.field9413 = new int[var6];
        int var13 = 0;
        while (var3.field6864 < var5) {
            int var14 = var3.method2882(-1);
            if (var14 == 3) {
                var2.field9408[var13] = var3.method2894(-13192).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field9406[var13] = var3.method2886(true);
            } else {
                var2.field9406[var13] = var3.method2868(-49);
            }
            var2.field9413[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lru;)V", line = 88)
    public static final void method11(class678 arg0) {
        class465.field6628 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIIII)Z", line = 100)
    public static final boolean method12(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field15++;
        if (!class522.field7591 || !class511.field7403) {
            return false;
        } else if (class163.field2324 < 100) {
            return false;
        } else if (arg2 != arg6 || arg3 != arg5) {
            for (int var9 = arg2; var9 <= arg6; var9++) {
                for (int var12 = arg3; var12 <= arg5; var12++) {
                    if (class694.field9823[arg1][var9][var12] == -class119.field1636) {
                        return false;
                    }
                }
            }
            int var10 = (arg2 << class639.field9095) + 1;
            int var11 = (arg3 << class639.field9095) + 2;
            if (class550.method3313(class95.field1372[arg1].method2087(109, arg2, arg3), var10, (arg6 + 1 - arg2) * class150.field2190, (byte) -113, (arg5 - arg4 - arg3) * class150.field2190, arg0, var11)) {
                class671.field9573++;
                return true;
            } else {
                return false;
            }
        } else if (class141.method998(arg2, 84, arg3, arg1)) {
            int var7 = arg2 << class639.field9095;
            int var8 = arg3 << class639.field9095;
            if (class550.method3313(class95.field1372[arg1].method2087(99, arg2, arg3), var7, class150.field2190, (byte) -68, class150.field2190, arg0, var8)) {
                class671.field9573++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V", line = 163)
    public static void method13(byte arg0) {
        field17 = null;
        field12 = null;
        if (arg0 != -44) {
            field12 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V", line = 174)
    public final void method14(boolean arg0) {
        field16++;
        class348 var2 = this.field19;
        synchronized (this.field19) {
            this.field19.method2220(false);
        }
        if (!arg0) {
            method11(null);
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)V", line = 187)
    public final void method15(byte arg0, int arg1) {
        class348 var3 = this.field19;
        synchronized (this.field19) {
            this.field19.method2207(arg1, 1);
        }
        field13++;
        if (arg0 != 5) {
            field17 = null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(II)Luw;", line = 200)
    public final class195 method16(int arg0, int arg1) {
        field14++;
        class348 var3 = this.field19;
        class195 var5;
        synchronized (this.field19) {
            if (arg1 >= -49) {
                return null;
            }
            var5 = (class195) this.field19.method2216(0, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class423 var6 = this.field18;
        byte[] var7;
        synchronized (this.field18) {
            var7 = this.field18.method2600(0, 31, arg0);
        }
        class195 var8 = new class195();
        if (var7 != null) {
            var8.method1377(new class479(var7), (byte) -127);
        }
        class348 var9 = this.field19;
        synchronized (this.field19) {
            this.field19.method2213((byte) -16, (long) arg0, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V", line = 238)
    public final void method17(int arg0) {
        if (arg0 != 31) {
            method13((byte) -112);
        }
        class348 var2 = this.field19;
        synchronized (this.field19) {
            this.field19.method2219(-5300);
        }
        field21++;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(Lmp;ILla;)V", line = 254)
    public class3(class315 arg0, int arg1, class423 arg2) {
        this.field18 = arg2;
        this.field18.method2616(31, 0);
    }
}
