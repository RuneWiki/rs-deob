import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class302 {

    @OriginalMember(owner = "client!km", name = "g", descriptor = "Lad;")
    public static class275 field4941 = new class275(50);

    @OriginalMember(owner = "client!km", name = "j", descriptor = "[I")
    public static int[] field4944 = new int[256];

    @OriginalMember(owner = "client!km", name = "h", descriptor = "Ljava/lang/String;")
    public static String field4942 = "cyan:";

    @OriginalMember(owner = "client!km", name = "l", descriptor = "D")
    public static double field4946 = -1.0D;

    @OriginalMember(owner = "client!km", name = "m", descriptor = "Ljava/lang/String;")
    public static String field4947 = "Starting 3d Library";

    @OriginalMember(owner = "client!km", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4943 = "Please wait - attempting to reestablish.";

    @OriginalMember(owner = "client!km", name = "a", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!km", name = "b", descriptor = "I")
    public static int field4936;

    @OriginalMember(owner = "client!km", name = "c", descriptor = "I")
    public static int field4937;

    @OriginalMember(owner = "client!km", name = "e", descriptor = "I")
    public static int field4939;

    @OriginalMember(owner = "client!km", name = "k", descriptor = "I")
    public static int field4945;

    @OriginalMember(owner = "client!km", name = "d", descriptor = "Lkm;")
    public class302 field4938;

    @OriginalMember(owner = "client!km", name = "f", descriptor = "Lkm;")
    public class302 field4940;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(BIILha;III)Lha;")
    public static final class32 method2062(byte arg0, int arg1, int arg2, class32 arg3, int arg4, int arg5, int arg6) {
        field4937++;
        int var7 = 92 % ((-arg0 - 77) / 32);
        long var8 = (long) arg2;
        class32 var10 = (class32) class45.field664.method1879(8887, var8);
        if (var10 == null) {
            class201 var11 = class201.method1380(class164.field2710, arg2, 0);
            if (var11 == null) {
                return null;
            }
            var10 = var11.method1391(64, 768, -50, -10, -50);
            class45.field664.method1883(var8, -120, var10);
        }
        int var12 = arg3.method26();
        int var13 = arg3.method34();
        int var14 = arg3.method51();
        int var15 = arg3.method46();
        class32 var16 = var10.method25(true, true, true);
        if (arg4 != 0) {
            var16.method32(arg4);
        }
        class3 var17 = (class3) var16;
        if (arg1 != class60.method387(-18796, arg6 + var14, arg5 - -var12, class214.field3389) || class60.method387(-18796, arg6 + var15, arg5 + var13, class214.field3389) != arg1) {
            for (int var18 = 0; var18 < var17.field37; var18++) {
                var17.field40[var18] += class60.method387(-18796, var17.field10[var18] + arg6, var17.field36[var18] + arg5, class214.field3389) - arg1;
            }
            var17.field4 = false;
        }
        return var16;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(I)V")
    public static final void method2063(int arg0) {
        if (arg0 == 50) {
            field4935++;
            class170.field2793.method1873(arg0 - 7451);
        }
    }

    @OriginalMember(owner = "client!km", name = "b", descriptor = "(I)V")
    public final void method2064(int arg0) {
        field4936++;
        if (this.field4940 == null) {
            return;
        }
        this.field4940.field4938 = this.field4938;
        this.field4938.field4940 = this.field4940;
        this.field4940 = null;
        this.field4938 = null;
        if (arg0 != 20307) {
            this.field4940 = null;
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Ltl;B)V")
    public static final void method2065(class69 arg0, byte arg1) {
        field4939++;
        class56 var2 = null;
        if (arg1 != 93) {
            method2062((byte) -32, -59, 101, (class32) null, 39, -77, 27);
        }
        try {
            class301 var3 = arg0.method479(true, "runescape");
            while (var3.field4929 == 0) {
                class33.method250(1L, 256);
            }
            if (var3.field4929 == 1) {
                var2 = (class56) var3.field4930;
                class274 var4 = class220.method1494(-12);
                var2.method363(0, -1, var4.field4458, var4.field4441);
            }
        } catch (Exception var6) {
        }
        try {
            if (var2 != null) {
                var2.method360(arg1 ^ 0xFFFFA62B);
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(B)V")
    public static void method2066(byte arg0) {
        field4942 = null;
        field4944 = null;
        field4943 = null;
        if (arg0 != 72) {
            method2063(71);
        }
        field4947 = null;
        field4941 = null;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(III)V")
    public static final void method2067(int arg0, int arg1, int arg2) {
        if (arg2 != -30420) {
            return;
        }
        class92 var3 = class163.method1116((byte) 15, arg0);
        int var4 = var3.field1467;
        field4945++;
        int var5 = var3.field1461;
        int var6 = class171.field2802[var4 - var5];
        int var7 = var3.field1465;
        if (arg1 < 0 || arg1 > var6) {
            arg1 = 0;
        }
        int var8 = var6 << var5;
        class249.method1697(arg1 << var5 & var8 | class310.field5022[var7] & ~var8, var7, -70);
    }
}
