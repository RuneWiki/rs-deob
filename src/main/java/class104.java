import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public abstract class class104 {

    @OriginalMember(owner = "client!p", name = "l", descriptor = "Lwd;")
    public static class150 field2357 = class2.method9(true, " (X");

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lwd;")
    private static class150 field2356 = class2.method9(true, "Take");

    @OriginalMember(owner = "client!p", name = "e", descriptor = "[I")
    public static int[] field2350 = new int[2000];

    @OriginalMember(owner = "client!p", name = "c", descriptor = "[J")
    public static long[] field2348 = new long[32];

    @OriginalMember(owner = "client!p", name = "a", descriptor = "I")
    public static int field2346 = 255;

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lwd;")
    public static class150 field2351 = field2356;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "Lwd;")
    private static class150 field2360 = class2.method9(true, " has logged in)3");

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field2365 = 2;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "Lwd;")
    private static class150 field2359 = class2.method9(true, "To create a new account you need to");

    @OriginalMember(owner = "client!p", name = "i", descriptor = "Lwd;")
    public static class150 field2354 = field2359;

    @OriginalMember(owner = "client!p", name = "b", descriptor = "Lwd;")
    public static class150 field2347 = field2360;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "Lwd;")
    private static class150 field2353 = class2.method9(true, "No matching objects found)1 please shorten search");

    @OriginalMember(owner = "client!p", name = "g", descriptor = "Lwd;")
    public static class150 field2352 = field2353;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field2349;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field2358;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!p", name = "s", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "I")
    public static int field2366;

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lff;")
    public static class42 field2363;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)I")
    public abstract int method712(byte arg0);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILva;)Lwd;")
    public static final class150 method713(int arg0, class141 arg1) {
        field2366++;
        if (class70.method531((byte) -116, class124.method942(arg1, true)) == 0) {
            return null;
        }
        if (arg0 <= 68) {
            method714(true, null, null);
        }
        if (arg1.field3352 == null || arg1.field3352.method1201(true).method1174((byte) -123) == 0) {
            return class118.field2690 ? class46.field1243 : null;
        } else {
            return arg1.field3352;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZLff;Lff;)V")
    public static final void method714(boolean arg0, class42 arg1, class42 arg2) {
        field2361++;
        if (arg0) {
            field2353 = null;
        }
        class72.field1809 = arg2;
        class29.field884 = arg1;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)V")
    public static void method715(int arg0) {
        field2357 = null;
        if (arg0 != 83) {
            field2357 = null;
        }
        field2356 = null;
        field2359 = null;
        field2350 = null;
        field2347 = null;
        field2354 = null;
        field2363 = null;
        field2351 = null;
        field2352 = null;
        field2353 = null;
        field2348 = null;
        field2360 = null;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method716(int arg0, Component arg1);

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IB)Lwd;")
    public static final class150 method717(int arg0, byte arg1) {
        field2349++;
        if (arg1 <= 107) {
            field2360 = null;
        }
        return arg0 < 999999999 ? class29.method239(1000, arg0) : class72.field1806;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(II)Lba;")
    public static final class9 method718(int arg0, int arg1) {
        field2364++;
        class9 var2 = (class9) class143.field3461.method440((long) arg1, 26976);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class12.field290.method315(arg1, true, 1);
        class9 var4 = new class9();
        if (var3 != null) {
            var4.method52(arg1, arg0 ^ 0xFFFFFEFD, new class148(var3));
        }
        var4.method56((byte) -11);
        if (arg0 != 10) {
            method713(-12, null);
        }
        class143.field3461.method433(var4, (long) arg1, (byte) -122);
        return var4;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lv;Lff;ZLff;I)V")
    public static final void method719(class140 arg0, class42 arg1, boolean arg2, class42 arg3, int arg4) {
        class24.field678 = arg1;
        class107.field2421 = arg3;
        class99.field2266 = arg2;
        class103.field2342 = class24.field678.method319((byte) 65, 10);
        class86.field2030 = arg0;
        field2358++;
        if (arg4 < 53) {
            field2363 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lhb;III)V")
    public static final void method720(class51 arg0, int arg1, int arg2, int arg3) {
        if (arg2 <= 24) {
            field2353 = null;
        }
        field2362++;
        if (arg0 == null) {
            return;
        }
        int var4 = arg1 * arg1 + arg3 * arg3;
        int var5 = class147.field3568 + class109.field2532 & 0x7FF;
        if (var4 > 6400) {
            return;
        }
        int var6 = class60.field1523[var5];
        int var7 = class60.field1515[var5];
        int var8 = var7 * 256 / (class131.field3094 + 256);
        int var9 = var6 * 256 / (class131.field3094 + 256);
        int var10 = arg1 * var9 + arg3 * var8 >> 16;
        int var11 = arg1 * var8 - arg3 * var9 >> 16;
        if (var4 <= 2500) {
            arg0.method398(var10 + 94 + 4 - arg0.field1375 / 2, -var11 + -4 + 83 - arg0.field1374 / 2);
        } else {
            arg0.method403(class106.field2403, var10 + 94 + 4 - arg0.field1375 / 2, -var11 + 83 - arg0.field1374 / 2 + -4);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method721(Component arg0, int arg1);
}
