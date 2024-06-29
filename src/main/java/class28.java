import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class28 extends class162 {

    @OriginalMember(owner = "client!be", name = "y", descriptor = "[J")
    private long[] field409 = new long[10];

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    private int field411 = 256;

    @OriginalMember(owner = "client!be", name = "C", descriptor = "I")
    private int field413 = 0;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "I")
    private int field406 = 1;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "J")
    private long field402 = class223.method1584(-25392);

    @OriginalMember(owner = "client!be", name = "n", descriptor = "[Lfh;")
    public static class128[] field398 = new class128[2048];

    @OriginalMember(owner = "client!be", name = "u", descriptor = "Lhj;")
    public static class69 field405 = class181.method1318("Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3", (byte) -113);

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    public static int field407 = -2;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field395 = 0;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field408 = 0;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Lhj;")
    public static class69 field410 = class181.method1318("hint_headicons", (byte) -118);

    @OriginalMember(owner = "client!be", name = "B", descriptor = "I")
    public static int field412 = 2;

    @OriginalMember(owner = "client!be", name = "F", descriptor = "Lhj;")
    private static class69 field416 = class181.method1318(" is already on your friend list)3", (byte) -112);

    @OriginalMember(owner = "client!be", name = "l", descriptor = "Lhj;")
    public static class69 field396 = field416;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!be", name = "D", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!be", name = "E", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "Lab;")
    public static class142 field399;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Lnc;")
    public static class83 field403;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Z)V")
    public final void method158(boolean arg0) {
        field404++;
        int var2 = 0;
        if (arg0) {
            this.field413 = -50;
        }
        while (var2 < 10) {
            this.field409[var2] = 0L;
            var2++;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIII)V")
    public static final void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class232[] var7 = class60.field1094;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class232 var9 = var7[var8];
            if (var9 != null && var9.field4241 == 2) {
                class56.method346(arg3 >> 1, var9.field4239 * 2, arg4, true, (var9.field4245 - class220.field3962 << 7) + var9.field4232, arg5 >> 1, arg0, (var9.field4248 - class242.field4441 << 7) + var9.field4231);
                if (class228.field4146 > -1 && class180.field3272 % 20 < 10) {
                    class13.field195[var9.field4242].method341(arg6 + class228.field4146 - 12, class236.field4296 + arg1 - 28);
                }
            }
        }
        field400++;
        if (arg2 != 4) {
            method160((byte) 10, -14);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)I")
    public static final int method160(byte arg0, int arg1) {
        int var2 = 0;
        if (arg1 < 0 || arg1 >= 65536) {
            arg1 >>>= 0x10;
            var2 += 16;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        field415++;
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 < 63) {
            field410 = null;
        }
        if (arg1 >= 4) {
            var2 += 2;
            arg1 >>>= 0x2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V")
    public static void method161(int arg0) {
        field398 = null;
        field396 = null;
        if (arg0 != -257) {
            method162(true);
        }
        field416 = null;
        field403 = null;
        field405 = null;
        field410 = null;
        field399 = null;
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)Z")
    public static final boolean method162(boolean arg0) {
        field397++;
        if (!arg0) {
            field399 = null;
        }
        return class194.field3534 == 0 ? class49.field724.method407(61) : true;
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "()V")
    public class28() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field409[var1] = this.field402;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III)I")
    public final int method163(int arg0, int arg1, int arg2) {
        field414++;
        int var4 = this.field406;
        this.field406 = 1;
        int var5 = this.field411;
        this.field411 = 300;
        this.field402 = class223.method1584(-25392);
        if (this.field409[this.field401] == 0L) {
            this.field411 = var5;
            this.field406 = var4;
        } else if (this.field409[this.field401] < this.field402) {
            this.field411 = (int) ((long) (arg1 * 2560) / (this.field402 - this.field409[this.field401]));
        }
        if (this.field411 < 25) {
            this.field411 = 25;
        }
        if (this.field411 > 256) {
            this.field411 = 256;
            this.field406 = (int) ((long) arg1 - ((this.field402 - this.field409[this.field401]) / 10L));
        }
        if (this.field406 > arg1) {
            this.field406 = arg1;
        }
        this.field409[this.field401] = this.field402;
        this.field401 = (this.field401 + 1) % 10;
        if (this.field406 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field409[var6] != 0L) {
                    this.field409[var6] += (long) this.field406;
                }
            }
        }
        if (this.field406 < arg2) {
            this.field406 = arg2;
        }
        int var7 = 0;
        class59.method356(false, (long) this.field406);
        while (this.field413 < 256) {
            var7++;
            this.field413 += this.field411;
        }
        this.field413 &= 0xFF;
        return arg0 == 5 ? var7 : 110;
    }
}
