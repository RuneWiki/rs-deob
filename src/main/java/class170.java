import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class170 {

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "Llh;")
    private class364 field2550 = new class364(16);

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Lhh;")
    private class84 field2549;

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "Lao;")
    public static class188 field2546 = new class188(84, 4);

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "Z")
    public static boolean field2554 = false;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2544;

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "I")
    public static int field2545;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2552;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "Lhh;")
    public static class84 field2548;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V")
    public final void method1204(int arg0, int arg1) {
        field2552++;
        class364 var3 = this.field2550;
        synchronized (this.field2550) {
            this.field2550.method2348(arg0, -127);
        }
        if (arg1 != -32613) {
            field2554 = true;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V")
    public final void method1205(int arg0) {
        if (arg0 != 26154) {
            return;
        }
        field2543++;
        class364 var2 = this.field2550;
        synchronized (this.field2550) {
            this.field2550.method2350((byte) 112);
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(IZ)Lue;")
    private final class154 method1206(int arg0, boolean arg1) {
        field2544++;
        class364 var3 = this.field2550;
        class154 var4;
        synchronized (this.field2550) {
            if (arg1) {
                this.field2549 = null;
            }
            var4 = (class154) this.field2550.method2339(-59, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field2549.method683(29, arg0, 5);
        class154 var6 = new class154();
        if (var5 != null) {
            var6.method1116((byte) 70, new class303(var5));
        }
        class364 var7 = this.field2550;
        synchronized (this.field2550) {
            this.field2550.method2342((long) arg0, var6, 51);
            return var6;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)V")
    public final void method1207(int arg0) {
        field2545++;
        if (arg0 <= -89) {
            class364 var2 = this.field2550;
            synchronized (this.field2550) {
                this.field2550.method2349(0);
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(III)Z")
    public static final boolean method1208(int arg0, int arg1, int arg2) {
        int var3 = class439.field6402[arg0][arg1][arg2];
        if (-class12.field196 == var3) {
            return false;
        } else if (class12.field196 == var3) {
            return true;
        } else {
            int var4 = arg1 << class225.field3278;
            int var5 = arg2 << class225.field3278;
            if (class475.method2842(var4 + 1, class529.field7807[arg0].method271(arg1, arg2), var5 + 1) && class475.method2842(class427.field6246 + var4 - 1, class529.field7807[arg0].method271(arg1 + 1, arg2), var5 + 1) && class475.method2842(class427.field6246 + var4 - 1, class529.field7807[arg0].method271(arg1 + 1, arg2 + 1), class427.field6246 + var5 - 1) && class475.method2842(var4 + 1, class529.field7807[arg0].method271(arg1, arg2 + 1), class427.field6246 + var5 - 1) && class475.method2842(class495.field7211 + var4, class529.field7807[arg0].method271(arg1, arg2), var5 + 1) && class475.method2842(class427.field6246 + var4 - 1, class529.field7807[arg0].method271(arg1 + 1, arg2), class495.field7211 + var5) && class475.method2842(class495.field7211 + var4, class529.field7807[arg0].method271(arg1, arg2 + 1), class427.field6246 + var5 - 1) && class475.method2842(class427.field6246 + var4 - 1, class529.field7807[arg0].method271(arg1, arg2), class495.field7211 + var5) && class475.method2842(class495.field7211 + var4, class529.field7807[arg0].method271(arg1, arg2), class495.field7211 + var5)) {
                class439.field6402[arg0][arg1][arg2] = class12.field196;
                return true;
            } else {
                class439.field6402[arg0][arg1][arg2] = -class12.field196;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lmk;BIIII)Ltc;")
    public final class233 method1209(class39 arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field2547++;
        class260[] var7 = null;
        if (arg1 < 40) {
            method1210(false, true, -66, -52, -54);
        }
        class154 var8 = this.method1206(arg3, false);
        if (var8.field2354 != null) {
            var7 = new class260[var8.field2354.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class342 var10 = arg0.method300(var8.field2354[var9], (byte) -58);
                var7[var9] = new class260(var10.field5223, var10.field5224, var10.field5211, var10.field5215, var10.field5227, var10.field5226, var10.field5225, var10.field5209);
            }
        }
        return new class233(var8.field2357, var7, var8.field2359, arg5, arg4, arg2);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(ZZIII)V")
    public static final void method1210(boolean arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field2551++;
        class454.method2735(arg3, (byte) -30, arg1, 0, arg4, arg0, class291.field4170.length - 1);
        class127.field1931 = null;
        if (arg2 <= -61) {
            class6.field93 = 0;
        }
    }

    @OriginalMember(owner = "client!uk", name = "<init>", descriptor = "(Lmt;ILhh;)V")
    public class170(class271 arg0, int arg1, class84 arg2) {
        this.field2549 = arg2;
        this.field2549.method656((byte) 122, 29);
    }

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "(I)V")
    public static void method1211(int arg0) {
        field2548 = null;
        int var1 = -5 / ((-arg0 - 56) / 50);
        field2546 = null;
    }
}
