import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class139 extends class234 {

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "Z")
    public boolean field2477 = false;

    @OriginalMember(owner = "client!mh", name = "N", descriptor = "I")
    private int field2500 = 0;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    private int field2482 = -32768;

    @OriginalMember(owner = "client!mh", name = "O", descriptor = "I")
    private int field2501 = 0;

    @OriginalMember(owner = "client!mh", name = "E", descriptor = "I")
    private int field2491;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!mh", name = "z", descriptor = "I")
    public int field2486;

    @OriginalMember(owner = "client!mh", name = "B", descriptor = "I")
    public int field2488;

    @OriginalMember(owner = "client!mh", name = "C", descriptor = "I")
    public int field2489;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public int field2480;

    @OriginalMember(owner = "client!mh", name = "F", descriptor = "Ltd;")
    private class204 field2492;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "Ldj;")
    public static class44 field2474 = class89.method650(255, "Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "Ldj;")
    public static class44 field2481 = class89.method650(255, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "Ldj;")
    private static class44 field2475 = class89.method650(255, "Select a world");

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    public static int field2483 = -1;

    @OriginalMember(owner = "client!mh", name = "G", descriptor = "Ldj;")
    private static class44 field2493 = class89.method650(255, "Too many connections from your address)3");

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "Ldj;")
    public static class44 field2478 = field2475;

    @OriginalMember(owner = "client!mh", name = "A", descriptor = "Ldj;")
    public static class44 field2487 = class89.method650(255, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field2485 = 0;

    @OriginalMember(owner = "client!mh", name = "L", descriptor = "I")
    public static int field2498 = 0;

    @OriginalMember(owner = "client!mh", name = "M", descriptor = "Ldj;")
    public static class44 field2499 = field2493;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field2484;

    @OriginalMember(owner = "client!mh", name = "D", descriptor = "I")
    public static int field2490;

    @OriginalMember(owner = "client!mh", name = "H", descriptor = "I")
    public static int field2494;

    @OriginalMember(owner = "client!mh", name = "I", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!mh", name = "J", descriptor = "I")
    public static int field2496;

    @OriginalMember(owner = "client!mh", name = "K", descriptor = "I")
    public static int field2497;

    @OriginalMember(owner = "client!mh", name = "P", descriptor = "I")
    public static int field2502;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)V")
    public static void method931(byte arg0) {
        field2499 = null;
        field2474 = null;
        field2493 = null;
        field2478 = null;
        field2481 = null;
        field2475 = null;
        field2487 = null;
        int var1 = 127 % ((arg0 + 6) / 54);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    public final void method932(int arg0, int arg1) {
        if (arg1 != -6645) {
            field2478 = null;
        }
        field2476++;
        if (this.field2477) {
            return;
        }
        this.field2501 += arg0;
        while (this.field2492.field3648[this.field2500] < this.field2501) {
            this.field2501 -= this.field2492.field3648[this.field2500];
            this.field2500++;
            if (this.field2500 >= this.field2492.field3658.length) {
                this.field2477 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2495++;
        class127 var11 = this.method934(false);
        if (var11 != null) {
            var11.method42(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2482 = var11.method67();
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(JI)V")
    public static final void method933(long arg0, int arg1) {
        field2497++;
        if (arg1 > 16) {
            try {
                Thread.sleep(arg0);
            } catch (InterruptedException var3) {
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Z)Llg;")
    private final class127 method934(boolean arg0) {
        field2502++;
        if (arg0) {
            method937(null, 5, 105, 43, -28, true);
        }
        class13 var2 = class79.method606(this.field2491, -1830);
        class127 var3;
        if (this.field2477) {
            var3 = var2.method117(arg0, -1);
        } else {
            var3 = var2.method117(false, this.field2500);
        }
        return var3 == null ? null : var3;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "()I")
    public final int method67() {
        field2479++;
        return this.field2482;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZLve;ZLve;I)V")
    public static final void method935(boolean arg0, class225 arg1, boolean arg2, class225 arg3, int arg4) {
        class20.field341 = arg0;
        class227.field4271 = arg2;
        class67.field1278 = arg3;
        field2490++;
        class118.field2100 = arg1;
        class31.field548 = new class95(30);
        if (arg4 != 2855) {
            method937(null, 106, -33, -49, 117, true);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ZIIILue;II)V")
    public static final void method936(boolean arg0, int arg1, int arg2, int arg3, class215 arg4, int arg5, int arg6) {
        field2473++;
        if (arg0) {
            method935(true, null, true, null, 20);
        }
        boolean var7 = true;
        boolean var8 = false;
        long var9 = 0L;
        boolean var11 = false;
        if (arg5 == 0) {
            var9 = class221.method1426(arg6, arg3, arg1);
        }
        if (arg5 == 1) {
            var9 = class120.method827(arg6, arg3, arg1);
        }
        if (arg5 == 2) {
            var9 = class86.method640(arg6, arg3, arg1);
        }
        if (arg5 == 3) {
            var9 = class239.method1552(arg6, arg3, arg1);
        }
        if (var9 == 0L) {
            return;
        }
        int var12 = (int) var9 >> 14 & 0x1F;
        int var13 = (int) var9 >> 20 & 0x3;
        int var14 = Integer.MAX_VALUE & (int) (var9 >>> 32);
        class39 var15 = class40.method281(true, var14);
        if (arg5 == 0) {
            class2.method16(arg6, arg3, arg1);
            if (var15.field706 != 0) {
                arg4.method1408(arg3, arg1, (byte) 105, var12, var13, var15.field724);
            }
        }
        if (arg5 == 1) {
            class31.method214(arg6, arg3, arg1);
        }
        if (arg5 == 2) {
            class29.method207(arg6, arg3, arg1);
            if (var15.field706 != 0 && var15.field725 + arg3 < 104 && var15.field725 + arg1 < 104 && arg3 + var15.field698 < 104 && arg1 + var15.field698 < 104) {
                arg4.method1404(arg1, var15.field725, var15.field724, var13, var15.field698, (byte) 93, arg3);
            }
        }
        if (arg5 != 3) {
            return;
        }
        class134.method906(arg6, arg3, arg1);
        if (var15.field706 == 1) {
            arg4.method1397(2964, arg3, arg1);
            return;
        }
    }

    @OriginalMember(owner = "client!mh", name = "<init>", descriptor = "(IIIIIII)V")
    public class139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2491 = arg0;
        this.field2472 = arg4;
        this.field2486 = arg2;
        this.field2488 = arg3;
        this.field2489 = arg5 + arg6;
        this.field2480 = arg1;
        int var8 = class79.method606(this.field2491, -1830).field248;
        if (var8 == -1) {
            this.field2477 = true;
        } else {
            this.field2477 = false;
            this.field2492 = class94.method672(var8, -95);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Ltd;IIIIZ)V")
    public static final void method937(class204 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field2494++;
        if (class73.field1401 >= 50 || (arg0.field3649 == null || arg4 >= arg0.field3649.length)) {
            return;
        }
        int var6 = arg0.field3649[arg4];
        if (var6 == 0) {
            return;
        }
        int var7 = var6 >> 4 & 0x7;
        int var8 = var6 & 0xF;
        int var9 = var6 >> 8;
        if (var8 == 0) {
            if (arg5) {
                class66.method521(0, -1, var9, var7);
            }
        } else if (class226.field4254 != 0) {
            class163.field2821[class73.field1401] = var9;
            class53.field966[class73.field1401] = var7;
            int var10 = (arg1 - 64) / 128;
            class73.field1403[class73.field1401] = 0;
            class23.field378[class73.field1401] = null;
            int var11 = (arg3 - 64) / 128;
            class87.field1669[class73.field1401] = (var10 << 16) + (var11 << 8) + var8;
            class73.field1401++;
            if (arg2 >= -41) {
                field2478 = null;
            }
        }
    }
}
