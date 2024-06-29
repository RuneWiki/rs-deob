import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class94 extends class64 {

    @OriginalMember(owner = "client!pd", name = "pb", descriptor = "Z")
    public boolean field2360 = false;

    @OriginalMember(owner = "client!pd", name = "Bb", descriptor = "I")
    private int field2372 = 0;

    @OriginalMember(owner = "client!pd", name = "Lb", descriptor = "I")
    private int field2382 = 0;

    @OriginalMember(owner = "client!pd", name = "ob", descriptor = "I")
    public int field2359;

    @OriginalMember(owner = "client!pd", name = "Kb", descriptor = "I")
    public int field2381;

    @OriginalMember(owner = "client!pd", name = "Fb", descriptor = "I")
    public int field2376;

    @OriginalMember(owner = "client!pd", name = "ub", descriptor = "I")
    public int field2365;

    @OriginalMember(owner = "client!pd", name = "vb", descriptor = "I")
    public int field2366;

    @OriginalMember(owner = "client!pd", name = "wb", descriptor = "I")
    private int field2367;

    @OriginalMember(owner = "client!pd", name = "Db", descriptor = "Ls;")
    private class107 field2374;

    @OriginalMember(owner = "client!pd", name = "yb", descriptor = "[I")
    public static int[] field2369 = new int[2048];

    @OriginalMember(owner = "client!pd", name = "Jb", descriptor = "Lmc;")
    public static class75 field2380 = class30.method234(true, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!pd", name = "xb", descriptor = "[B")
    public static byte[] field2368 = new byte[520];

    @OriginalMember(owner = "client!pd", name = "Eb", descriptor = "I")
    public static volatile int field2375 = 0;

    @OriginalMember(owner = "client!pd", name = "Ib", descriptor = "Lmc;")
    public static class75 field2379 = class30.method234(true, ": ");

    @OriginalMember(owner = "client!pd", name = "Mb", descriptor = "Lmc;")
    public static class75 field2383 = class30.method234(true, "headicons_hint");

    @OriginalMember(owner = "client!pd", name = "Cb", descriptor = "Lmc;")
    private static class75 field2373 = class30.method234(true, "Connection lost");

    @OriginalMember(owner = "client!pd", name = "Gb", descriptor = "Lmc;")
    public static class75 field2377 = class30.method234(true, "Cabbage");

    @OriginalMember(owner = "client!pd", name = "zb", descriptor = "Lmc;")
    private static class75 field2370 = class30.method234(true, "Please wait)3)3)3");

    @OriginalMember(owner = "client!pd", name = "sb", descriptor = "Lmc;")
    public static class75 field2363 = field2370;

    @OriginalMember(owner = "client!pd", name = "Nb", descriptor = "Lmc;")
    public static class75 field2384 = field2373;

    @OriginalMember(owner = "client!pd", name = "qb", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!pd", name = "rb", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!pd", name = "tb", descriptor = "I")
    public static int field2364;

    @OriginalMember(owner = "client!pd", name = "Hb", descriptor = "I")
    public static int field2378;

    @OriginalMember(owner = "client!pd", name = "Ab", descriptor = "Lnc;")
    public static class81 field2371;

    @OriginalMember(owner = "client!pd", name = "nb", descriptor = "Lpb;")
    public static class92 field2358;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)Lpc;", line = 7)
    public final class93 method561(boolean arg0) {
        if (arg0) {
            this.method801(126, 21);
        }
        field2362++;
        class86 var2 = class64.method564(108, this.field2367);
        class93 var3;
        if (this.field2360) {
            var3 = var2.method715(25187, -1);
        } else {
            var3 = var2.method715(25187, this.field2382);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(II)V", line = 35)
    public final void method801(int arg0, int arg1) {
        field2361++;
        if (this.field2360) {
            return;
        }
        this.field2372 += arg1;
        while (this.field2374.field2675[this.field2382] < this.field2372) {
            this.field2372 -= this.field2374.field2675[this.field2382];
            this.field2382++;
            if (this.field2374.field2662.length <= this.field2382) {
                this.field2360 = true;
                break;
            }
        }
        if (arg0 != 4) {
            method803(44);
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(IIIIIII)V", line = 201)
    public class94(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2359 = arg4;
        this.field2381 = arg6 + arg5;
        this.field2376 = arg3;
        this.field2365 = arg1;
        this.field2366 = arg2;
        this.field2367 = arg0;
        int var8 = class64.method564(103, this.field2367).field2124;
        if (var8 == -1) {
            this.field2360 = true;
        } else {
            this.field2360 = false;
            this.field2374 = class37.method289(var8, (byte) -128);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lja;BLmc;Lmc;)[Lnc;", line = 71)
    public static final class81[] method802(class55 arg0, byte arg1, class75 arg2, class75 arg3) {
        if (arg1 != 104) {
            field2380 = null;
        }
        field2364++;
        int var4 = arg0.method433(arg3, (byte) 64);
        int var5 = arg0.method451(arg2, var4, (byte) 124);
        return class128.method1009(arg0, var5, var4, 5);
    }

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "(I)V", line = 87)
    public static final void method803(int arg0) {
        class27.field546 = new byte[4][104][104];
        class63.field1676 = new byte[4][105][105];
        class52.field1287 = new int[104];
        class35.field827 = new byte[4][104][104];
        class108.field2734 = new int[105][105];
        field2378++;
        if (arg0 < 82) {
            return;
        }
        class92.field2280 = 99;
        class85.field2100 = new byte[4][104][104];
        class56.field1437 = new int[104];
        class28.field594 = new int[104];
        class62.field1626 = new int[104];
        class8.field123 = new byte[4][104][104];
        class17.field336 = new int[104];
        class63.field1675 = new int[4][105][105];
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(B)V", line = 125)
    public static void method804(byte arg0) {
        field2377 = null;
        field2369 = null;
        field2384 = null;
        field2380 = null;
        if (arg0 != -2) {
            field2379 = null;
        }
        field2370 = null;
        field2363 = null;
        field2371 = null;
        field2379 = null;
        field2383 = null;
        field2358 = null;
        field2373 = null;
        field2368 = null;
    }
}
