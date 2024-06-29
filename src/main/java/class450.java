import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hca")
public class class450 implements class297 {

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "[I")
    public static int[] field6280 = new int[14];

    @OriginalMember(owner = "client!hca", name = "j", descriptor = "Z")
    public static boolean field6287 = false;

    @OriginalMember(owner = "client!hca", name = "e", descriptor = "Luc;")
    public static class27 field6282 = new class27(22, 3);

    @OriginalMember(owner = "client!hca", name = "l", descriptor = "[I")
    public static int[] field6289 = new int[4096];

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "I")
    public static int field6281;

    @OriginalMember(owner = "client!hca", name = "f", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!hca", name = "g", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!hca", name = "h", descriptor = "I")
    public static int field6285;

    @OriginalMember(owner = "client!hca", name = "i", descriptor = "I")
    public static int field6286;

    @OriginalMember(owner = "client!hca", name = "k", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I[Lfaa;B)V", line = 3)
    public static final void method2581(int arg0, class140[] arg1, byte arg2) {
        int var3 = -22 / ((arg2 - 51) / 46);
        field6286++;
        for (int var4 = 0; var4 < arg1.length; var4++) {
            class140 var5 = arg1[var4];
            if (var5 != null) {
                if (var5.field2023 == 0) {
                    if (var5.field2043 != null) {
                        method2581(arg0, var5.field2043, (byte) -75);
                    }
                    class198 var6 = (class198) class368.field5262.method2061(-17305, (long) var5.field2100);
                    if (var6 != null) {
                        class589.method3274(var6.field2922, arg0, (byte) 86);
                    }
                }
                if (arg0 == 0 && var5.field1999 != null) {
                    class388 var7 = new class388();
                    var7.field5451 = var5.field1999;
                    var7.field5443 = var5;
                    class523.method2890(var7);
                }
                if (arg0 == 1 && var5.field2003 != null) {
                    if (var5.field2092 >= 0) {
                        class140 var8 = class266.method1626(var5.field2100, 120);
                        if (var8 == null || var8.field2043 == null || var8.field2043.length <= var5.field2092 || var8.field2043[var5.field2092] != var5) {
                            continue;
                        }
                    }
                    class388 var9 = new class388();
                    var9.field5443 = var5;
                    var9.field5451 = var5.field2003;
                    class523.method2890(var9);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hca", name = "d", descriptor = "(I)V", line = 72)
    public static void method2582(int arg0) {
        field6280 = null;
        if (arg0 != 20444) {
            field6289 = null;
        }
        field6289 = null;
        field6282 = null;
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(IZ)Lwc;", line = 84)
    public static final class60 method2583(int arg0, boolean arg1) {
        field6281++;
        class663[] var2 = class625.field8714;
        synchronized (class625.field8714) {
            class60 var3;
            if (arg0 >= class625.field8714.length || class625.field8714[arg0].method3675(-28821)) {
                var3 = new class60();
                var3.field818 = new class494[arg0];
                for (int var4 = 0; var4 < arg0; var4++) {
                    var3.field818[var4] = new class494();
                }
            } else {
                var3 = (class60) class625.field8714[arg0].method3680(-105);
                var3.method118(-30545);
                int var10002 = class25.field328[arg0]--;
            }
            return arg1 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(B)I", line = 117)
    public final int method1854(byte arg0) {
        if (arg0 > -68) {
            return -14;
        } else {
            field6288++;
            return 100;
        }
    }

    @OriginalMember(owner = "client!hca", name = "b", descriptor = "(I)V", line = 133)
    public final void method1856(int arg0) {
        field6285++;
        if (arg0 != 18259) {
            field6287 = true;
        }
        class144.method1011(arg0 - 18259);
    }

    @OriginalMember(owner = "client!hca", name = "c", descriptor = "(I)V", line = 149)
    public final void method1857(int arg0) {
        field6278++;
        if (arg0 >= -123) {
            this.method1853(-16, false);
        }
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(IZ)V", line = 161)
    public final void method1853(int arg0, boolean arg1) {
        if (arg0 != -1472) {
            field6289 = null;
        }
        field6283++;
        class175.method1200(class463.field6522, class209.field3083[class72.field991], class327.field4829[class72.field991], -53, class173.field2589[class72.field991], class514.field7031);
    }

    @OriginalMember(owner = "client!hca", name = "a", descriptor = "(I)Z", line = 174)
    public final boolean method1855(int arg0) {
        if (arg0 == 20709) {
            field6284++;
            return true;
        } else {
            return false;
        }
    }
}
