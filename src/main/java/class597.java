import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class597 {

    @OriginalMember(owner = "client!rj", name = "o", descriptor = "Z")
    public boolean field8329 = false;

    @OriginalMember(owner = "client!rj", name = "p", descriptor = "Lde;")
    private class534 field8330 = new class534(64);

    @OriginalMember(owner = "client!rj", name = "t", descriptor = "Lde;")
    public class534 field8334 = new class534(500);

    @OriginalMember(owner = "client!rj", name = "v", descriptor = "Lde;")
    public class534 field8336 = new class534(30);

    @OriginalMember(owner = "client!rj", name = "w", descriptor = "Lde;")
    public class534 field8337 = new class534(50);

    @OriginalMember(owner = "client!rj", name = "i", descriptor = "Z")
    public boolean field8323;

    @OriginalMember(owner = "client!rj", name = "g", descriptor = "Lnd;")
    private class547 field8321;

    @OriginalMember(owner = "client!rj", name = "j", descriptor = "Lnd;")
    public class547 field8324;

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "I")
    public static int field8318 = 0;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "I")
    public static int field8315;

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "I")
    public static int field8316;

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "I")
    public static int field8317;

    @OriginalMember(owner = "client!rj", name = "e", descriptor = "I")
    public static int field8319;

    @OriginalMember(owner = "client!rj", name = "f", descriptor = "I")
    public static int field8320;

    @OriginalMember(owner = "client!rj", name = "h", descriptor = "I")
    public static int field8322;

    @OriginalMember(owner = "client!rj", name = "k", descriptor = "I")
    public static int field8325;

    @OriginalMember(owner = "client!rj", name = "l", descriptor = "I")
    public static int field8326;

    @OriginalMember(owner = "client!rj", name = "m", descriptor = "I")
    public static int field8327;

    @OriginalMember(owner = "client!rj", name = "n", descriptor = "I")
    public static int field8328;

    @OriginalMember(owner = "client!rj", name = "q", descriptor = "I")
    public static int field8331;

    @OriginalMember(owner = "client!rj", name = "r", descriptor = "I")
    public static int field8332;

    @OriginalMember(owner = "client!rj", name = "s", descriptor = "I")
    public static int field8333;

    @OriginalMember(owner = "client!rj", name = "u", descriptor = "I")
    public static int field8335;

    @OriginalMember(owner = "client!rj", name = "x", descriptor = "I")
    public int field8338;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IB)V", line = 4)
    public final void method3380(int arg0, byte arg1) {
        this.field8338 = arg0;
        field8320++;
        class534 var3 = this.field8334;
        synchronized (this.field8334) {
            this.field8334.method3065(true);
        }
        class534 var4 = this.field8336;
        synchronized (this.field8336) {
            this.field8336.method3065(true);
        }
        int var5 = 94 / ((54 - arg1) / 37);
        class534 var6 = this.field8337;
        synchronized (this.field8337) {
            this.field8337.method3065(true);
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(IB)V", line = 27)
    public final void method3381(int arg0, byte arg1) {
        if (arg1 >= -17) {
            this.field8336 = null;
        }
        class534 var3 = this.field8330;
        synchronized (this.field8330) {
            this.field8330.method3070(arg0, 124);
        }
        field8317++;
        class534 var4 = this.field8334;
        synchronized (this.field8334) {
            this.field8334.method3070(arg0, 125);
        }
        class534 var5 = this.field8336;
        synchronized (this.field8336) {
            this.field8336.method3070(arg0, 120);
        }
        class534 var6 = this.field8337;
        synchronized (this.field8337) {
            this.field8337.method3070(arg0, 123);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZZ)V", line = 51)
    public final void method3382(boolean arg0, boolean arg1) {
        field8315++;
        if (arg1 == this.field8323) {
            return;
        }
        this.field8323 = arg1;
        this.method3392(0);
        if (arg0) {
            method3393(42, false, -10, -87, -29);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(III)Z", line = 66)
    public static final boolean method3383(int arg0, int arg1, int arg2) {
        field8327++;
        if (arg1 != 7) {
            field8318 = 126;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZ)Lac;", line = 80)
    public final class543 method3384(int arg0, boolean arg1) {
        field8328++;
        class534 var3 = this.field8330;
        class543 var4;
        synchronized (this.field8330) {
            var4 = (class543) this.field8330.method3079((long) arg0, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class547 var5 = this.field8321;
        byte[] var6;
        synchronized (this.field8321) {
            var6 = this.field8321.method3153(class635.method3562((byte) 70, arg0), 0, class405.method2268(arg0, (byte) 75));
        }
        class543 var7 = new class543();
        var7.field7526 = this;
        var7.field7586 = arg0;
        if (var6 != null) {
            var7.method3109(new class461(var6), 1);
        }
        var7.method3122((byte) -125);
        if (!this.field8323 && var7.field7577) {
            var7.field7545 = null;
            var7.field7542 = null;
        }
        if (var7.field7521) {
            var7.field7580 = 0;
            var7.field7548 = false;
        }
        if (arg1) {
            this.field8324 = null;
        }
        class534 var8 = this.field8330;
        synchronized (this.field8330) {
            this.field8330.method3077((byte) -119, (long) arg0, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rj", name = "c", descriptor = "(IB)V", line = 132)
    public final void method3385(int arg0, byte arg1) {
        field8322++;
        this.field8330 = new class534(arg0);
        if (arg1 != 117) {
            method3393(52, true, -113, -36, -126);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(II)I", line = 145)
    public static final int method3386(int arg0, int arg1) {
        if (arg1 > -116) {
            field8318 = -32;
        }
        field8316++;
        byte var2;
        if (arg0 > 12000) {
            var2 = 4;
            class109.method873(-113);
        } else if (arg0 > 5000) {
            class651.method3652(false);
            var2 = 3;
        } else if (arg0 <= 2000) {
            var2 = 1;
            class699.method3932(0, true);
        } else {
            var2 = 2;
            class614.method3437((byte) -107);
        }
        if (class748.field10451.field10399.method1924((byte) -61) != 2) {
            class748.field10451.method4150(class748.field10451.field10400, 2, -5);
            class415.method2331(false, 2, -4);
        }
        class472.method2688(29);
        return var2;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;I)Lnh;", line = 193)
    public static final class749 method3387(int arg0, String arg1, int arg2) {
        field8331++;
        class749 var3;
        try {
            var3 = (class749) Class.forName("tu").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class77();
        }
        if (arg0 != 30) {
            method3383(-47, 43, -47);
        }
        var3.field10473 = arg2;
        var3.field10472 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V", line = 215)
    public final void method3388(boolean arg0, int arg1) {
        field8326++;
        if (this.field8329 != arg0) {
            this.field8329 = arg0;
            this.method3392(arg1 ^ arg1);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIIIIIII)V", line = 228)
    public static final void method3389(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field8335++;
        int var8 = 20 / ((arg0 + 19) / 59);
        int var9 = class720.method4025(class546.field7619, arg3, class760.field10606, 0);
        int var10 = class720.method4025(class546.field7619, arg4, class760.field10606, 0);
        int var11 = class720.method4025(class667.field9373, arg6, class225.field2994, 0);
        int var12 = class720.method4025(class667.field9373, arg5, class225.field2994, 0);
        int var13 = class720.method4025(class546.field7619, arg3 + arg7, class760.field10606, 0);
        int var14 = class720.method4025(class546.field7619, arg4 - arg7, class760.field10606, 0);
        for (int var15 = var9; var15 < var13; var15++) {
            class636.method3569(var12, arg1, var11, 347845800, class432.field5765[var15]);
        }
        for (int var16 = var10; var16 > var14; var16--) {
            class636.method3569(var12, arg1, var11, 347845800, class432.field5765[var16]);
        }
        int var17 = class720.method4025(class667.field9373, arg6 + arg7, class225.field2994, 0);
        int var18 = class720.method4025(class667.field9373, arg5 - arg7, class225.field2994, 0);
        for (int var19 = var13; var19 <= var14; var19++) {
            int[] var20 = class432.field5765[var19];
            class636.method3569(var17, arg1, var11, 347845800, var20);
            class636.method3569(var18, arg2, var17, 347845800, var20);
            class636.method3569(var12, arg1, var18, 347845800, var20);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(I)V", line = 281)
    public final void method3390(int arg0) {
        field8319++;
        class534 var2 = this.field8330;
        synchronized (this.field8330) {
            this.field8330.method3064(false);
        }
        if (arg0 > -122) {
            method3383(93, -48, -22);
        }
        class534 var3 = this.field8334;
        synchronized (this.field8334) {
            this.field8334.method3064(false);
        }
        class534 var4 = this.field8336;
        synchronized (this.field8336) {
            this.field8336.method3064(false);
        }
        class534 var5 = this.field8337;
        synchronized (this.field8337) {
            this.field8337.method3064(false);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IIII)I", line = 303)
    public static final int method3391(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field8325++;
        if (arg0 <= 78) {
            return -100;
        } else if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 7 - arg1;
        } else if (var4 == 2) {
            return 7 - arg3;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!rj", name = "b", descriptor = "(I)V", line = 326)
    public final void method3392(int arg0) {
        field8333++;
        class534 var2 = this.field8330;
        synchronized (this.field8330) {
            this.field8330.method3065(true);
        }
        class534 var3 = this.field8334;
        synchronized (this.field8334) {
            this.field8334.method3065(true);
        }
        class534 var4 = this.field8336;
        synchronized (this.field8336) {
            this.field8336.method3065(true);
        }
        if (arg0 != 0) {
            this.field8336 = null;
        }
        class534 var5 = this.field8337;
        synchronized (this.field8337) {
            this.field8337.method3065(true);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IZIII)V", line = 348)
    public static final void method3393(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        for (int var5 = 0; var5 < class654.field9100; var5++) {
            Rectangle var6 = class694.field9642[var5];
            if (var6.x + var6.width > arg3 && var6.x < (arg3 + arg4) && arg0 < var6.y + var6.height && arg0 + arg2 > var6.y) {
                class755.field10530[var5] = true;
            }
        }
        if (arg1) {
            field8318 = 125;
        }
        field8332++;
        class236.method1478(85, arg0, arg3 + arg4, arg3, arg0 + arg2);
    }

    @OriginalMember(owner = "client!rj", name = "<init>", descriptor = "(Lal;IZLnd;Lnd;)V", line = 397)
    public class597(class102 arg0, int arg1, boolean arg2, class547 arg3, class547 arg4) {
        this.field8323 = arg2;
        this.field8321 = arg3;
        this.field8324 = arg4;
        if (this.field8321 != null) {
            int var6 = this.field8321.method3155((byte) -8) - 1;
            this.field8321.method3178((byte) 44, var6);
        }
    }
}
