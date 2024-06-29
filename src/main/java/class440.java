import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class440 {

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lrp;")
    private class288 field6458 = new class288(16);

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "Llt;")
    private class458 field6457;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Z")
    public static boolean field6454 = false;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field6452;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "I")
    public static int field6453;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "I")
    public static int field6456;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIILcf;)V")
    public static final void method2564(int arg0, int arg1, int arg2, int arg3, class412 arg4) {
        class268 var5 = class18.method95(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field5975 = (arg1 << class239.field3602) + class42.field621;
        arg4.field5977 = arg3;
        arg4.field5973 = (arg2 << class239.field3602) + class42.field621;
        for (class297 var7 = var5.field4045; var7 != null; var7 = var7.field4500) {
            if (var7.field4505.field3223) {
                int var8 = var7.field4505.method333(0);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field5977 += var6;
            arg4.field5976 = true;
        }
        var5.field4056 = arg4;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V")
    public final void method2565(boolean arg0) {
        field6452++;
        if (!arg0) {
            this.method2565(false);
        }
        class288 var2 = this.field6458;
        synchronized (this.field6458) {
            this.field6458.method1761(-126);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZ)V")
    public final void method2566(int arg0, boolean arg1) {
        class288 var3 = this.field6458;
        synchronized (this.field6458) {
            if (!arg1) {
                field6454 = false;
            }
            this.field6458.method1760(arg0, 30398);
        }
        field6455++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BI)Llu;")
    public final class482 method2567(byte arg0, int arg1) {
        field6453++;
        class288 var3 = this.field6458;
        class482 var4;
        synchronized (this.field6458) {
            var4 = (class482) this.field6458.method1752(arg0 - 119, (long) arg1);
        }
        if (arg0 != 119) {
            method2564(-110, -68, -121, -20, null);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field6457.method2715(arg1, 30, false);
        class482 var6 = new class482();
        if (var5 != null) {
            var6.method2910(new class40(var5), 0);
        }
        class288 var7 = this.field6458;
        synchronized (this.field6458) {
            this.field6458.method1758(arg0 - 118, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZI)V")
    public static final void method2568(boolean arg0, int arg1) {
        field6450++;
        if (arg1 <= 95) {
            field6454 = true;
        }
        class41.method289(class375.field5475, class482.field7368, -1, class147.field2384, arg0);
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(Z)V")
    public final void method2569(boolean arg0) {
        field6451++;
        class288 var2 = this.field6458;
        synchronized (this.field6458) {
            this.field6458.method1749((byte) 127);
            if (!arg0) {
                this.method2567((byte) -17, 66);
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZIIIIII)V")
    public static final void method2570(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6456++;
        class97[] var7 = class228.field3487;
        if (!arg0) {
            field6454 = true;
        }
        for (int var8 = 0; var8 < var7.length; var8++) {
            class97 var9 = var7[var8];
            if (var9 != null && var9.field1745 == 2) {
                class52.method368(arg1, var9.field1749, 0, var9.field1753, var9.field1750, arg4, arg2 >> 1, arg6 >> 1, var9.field1751 * 2);
                if (class161.field2529[0] > -1 && (class369.field5424 % 20) < 10) {
                    class512.field7766[var9.field1755].method994(arg5 + class161.field2529[0] - 12, class161.field2529[1] + arg3 + -28);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lcm;ILlt;)V")
    public class440(class491 arg0, int arg1, class458 arg2) {
        this.field6457 = arg2;
        this.field6457.method2726((byte) 113, 30);
    }
}
