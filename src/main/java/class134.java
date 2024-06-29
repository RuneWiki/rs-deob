import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ml")
public class class134 {

    @OriginalMember(owner = "client!ml", name = "k", descriptor = "Z")
    private boolean field2341 = false;

    @OriginalMember(owner = "client!ml", name = "t", descriptor = "I")
    public int field2350 = 0;

    @OriginalMember(owner = "client!ml", name = "w", descriptor = "I")
    public int field2353 = 0;

    @OriginalMember(owner = "client!ml", name = "h", descriptor = "Ljf;")
    private static class229 field2338 = class212.method1457((byte) 120, " has logged out)3");

    @OriginalMember(owner = "client!ml", name = "p", descriptor = "Ljf;")
    public static class229 field2346 = class212.method1457((byte) 64, " )2> <col=ff9040>");

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "Ljf;")
    public static class229 field2332 = field2338;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "I")
    public static int field2331;

    @OriginalMember(owner = "client!ml", name = "c", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!ml", name = "d", descriptor = "I")
    public int field2334;

    @OriginalMember(owner = "client!ml", name = "e", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ml", name = "f", descriptor = "I")
    public int field2336;

    @OriginalMember(owner = "client!ml", name = "g", descriptor = "I")
    public int field2337;

    @OriginalMember(owner = "client!ml", name = "i", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!ml", name = "j", descriptor = "I")
    public static int field2340;

    @OriginalMember(owner = "client!ml", name = "l", descriptor = "I")
    public int field2342;

    @OriginalMember(owner = "client!ml", name = "m", descriptor = "I")
    public static int field2343;

    @OriginalMember(owner = "client!ml", name = "o", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!ml", name = "q", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ml", name = "r", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ml", name = "s", descriptor = "I")
    private int field2349;

    @OriginalMember(owner = "client!ml", name = "u", descriptor = "I")
    public int field2351;

    @OriginalMember(owner = "client!ml", name = "v", descriptor = "I")
    public int field2352;

    @OriginalMember(owner = "client!ml", name = "x", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ml", name = "n", descriptor = "J")
    public long field2344;

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(ILkh;)V", line = 16)
    public final void method921(int arg0, class14 arg1) {
        field2354++;
        if (arg0 != 8693) {
            this.field2339 = 123;
        }
        while (true) {
            int var3 = arg1.method93(false);
            if (var3 == 0) {
                return;
            }
            this.method922(arg1, var3, 25467);
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(Lkh;II)V", line = 36)
    private final void method922(class14 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2349 = arg0.method116(-1);
        } else if (arg1 == 2) {
            arg0.method93(false);
        } else if (arg1 == 3) {
            this.field2337 = arg0.method128((byte) 4);
            this.field2334 = arg0.method128((byte) 4);
            this.field2333 = arg0.method128((byte) 4);
        } else if (arg1 == 4) {
            this.field2339 = arg0.method93(false);
            this.field2352 = arg0.method128((byte) 4);
        } else if (arg1 == 6) {
            this.field2342 = arg0.method93(false);
        } else if (arg1 == 8) {
            this.field2353 = 1;
        } else if (arg1 == 9) {
            this.field2350 = 1;
        } else if (arg1 == 10) {
            this.field2341 = true;
        }
        if (arg2 != 25467) {
            method924(68, -103, -11, -32, -124);
        }
        field2343++;
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(I)V", line = 113)
    public final void method923(int arg0) {
        field2340++;
        this.field2336 = class227.field3911[this.field2349];
        this.field2345 = (int) Math.sqrt((double) (this.field2333 * this.field2333 + this.field2337 * this.field2337 + this.field2334 * this.field2334));
        if (this.field2352 == 0) {
            this.field2352 = 1;
        }
        if (arg0 != 100) {
            this.field2349 = -80;
        }
        if (this.field2339 == 0) {
            this.field2344 = 2147483647L;
        } else if (this.field2339 == 1) {
            this.field2344 = (long) (this.field2345 * 8 / this.field2352);
            this.field2344 *= this.field2344;
        } else if (this.field2339 == 2) {
            this.field2344 = (long) (this.field2345 * 8 / this.field2352);
        }
        if (this.field2341) {
            this.field2345 *= -1;
        }
    }

    @OriginalMember(owner = "client!ml", name = "a", descriptor = "(IIIII)V", line = 166)
    public static final void method924(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (client.field4465 == 1) {
            class83.field1600[class215.field3697 / 100].method314(class141.field2445 - 8, class52.field904 - 8);
        }
        if (client.field4465 == 2) {
            class83.field1600[(class215.field3697 / 100) + 4].method314(class141.field2445 - 8, class52.field904 + -8);
        }
        field2348++;
        int var5 = -26 / ((arg3 - 72) / 49);
        class175.method1188((byte) -105);
    }

    @OriginalMember(owner = "client!ml", name = "b", descriptor = "(I)V", line = 197)
    public static void method925(int arg0) {
        field2332 = null;
        if (arg0 == -8) {
            field2338 = null;
            field2346 = null;
        }
    }
}
