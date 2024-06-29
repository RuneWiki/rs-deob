import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class183 {

    @OriginalMember(owner = "client!o", name = "b", descriptor = "I")
    public int field2344 = 128;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public int field2356 = 128;

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    public int field2348;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "I")
    public int field2343;

    @OriginalMember(owner = "client!o", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2346 = "";

    @OriginalMember(owner = "client!o", name = "h", descriptor = "Z")
    public static boolean field2350 = false;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    public static int field2352;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field2353;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    public static int field2357;

    @OriginalMember(owner = "client!o", name = "p", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!o", name = "c", descriptor = "J")
    public static long field2345;

    @OriginalMember(owner = "client!o", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2347;

    @OriginalMember(owner = "client!o", name = "q", descriptor = "[I")
    public static int[] field2359;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IZIII)V")
    public static final void method1225(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg2 != 0) {
            method1225(-114, false, 16, -23, -59);
        }
        field2353++;
        if (class364.field4697 == 0) {
            class495.method2697((byte) -45, false);
        } else {
            class708.field9877 = class364.field4697;
            class11.method58(0, arg2 - 101);
        }
        class541.field7030 = arg1;
        class645.field8995 = arg3;
        class275.field3606 = arg4;
        class706.method3863(arg0);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILo;)V")
    public final void method1226(int arg0, class183 arg1) {
        this.field2349 = arg1.field2349;
        this.field2351 = arg1.field2351;
        field2352++;
        this.field2343 = arg1.field2343;
        this.field2344 = arg1.field2344;
        if (arg0 == 0) {
            this.field2348 = arg1.field2348;
            this.field2356 = arg1.field2356;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ZLjava/lang/String;ZZLufa;)V")
    public static final void method1227(boolean arg0, String arg1, boolean arg2, boolean arg3, class140 arg4) {
        field2358++;
        if (arg2) {
            if (class140.field1828.startsWith("win") && arg4.field1823) {
                String var5 = null;
                if (class348.field4462 != null) {
                    var5 = class348.field4462.getParameter("haveie6");
                }
                if (var5 == null || !var5.equals("1")) {
                    class548 var6 = class472.method2614(0, arg4, arg1, 31593);
                    class91.field1204 = var6;
                    class361.field4671 = arg4;
                    class567.field7404 = arg1;
                    return;
                }
            }
            if (class140.field1828.startsWith("mac")) {
                String var7 = null;
                if (class348.field4462 != null) {
                    var7 = class348.field4462.getParameter("havefirefox");
                }
                if (var7 != null && var7.equals("1") && arg3) {
                    class472.method2614(1, arg4, arg1, 31593);
                    return;
                }
            }
            class472.method2614(2, arg4, arg1, 31593);
        } else {
            class472.method2614(3, arg4, arg1, 31593);
        }
        if (arg0) {
            method1229(null, -99);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(I)V")
    public static void method1228(int arg0) {
        field2359 = null;
        if (arg0 != 0) {
            method1225(78, false, -106, -126, -47);
        }
        field2347 = null;
        field2346 = null;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Ljava/lang/String;I)J")
    public static final long method1229(String arg0, int arg1) {
        field2354++;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (var3 << 5) + (long) arg0.charAt(var5) - var3;
        }
        if (arg1 != 2) {
            field2345 = 117L;
        }
        return var3;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lw;III[Z)Z")
    public static final boolean method1230(class605 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class477.field6327 != class392.field4997) {
            int var6 = class353.field4540[arg1].method669(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class88 var8 = class353.field4540[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method669(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method665(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method666(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)Lo;")
    public final class183 method1231(int arg0) {
        if (arg0 == 0) {
            field2355++;
            return new class183(this.field2351, this.field2344, this.field2356, this.field2349, this.field2348, this.field2343);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(I)V")
    public class183(int arg0) {
        this.field2351 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIII)V")
    private class183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field2351 = arg0;
        this.field2348 = arg4;
        this.field2356 = arg2;
        this.field2349 = arg3;
        this.field2343 = arg5;
        this.field2344 = arg1;
    }
}
