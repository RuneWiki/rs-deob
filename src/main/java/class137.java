import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class137 extends class3 {

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "[J")
    private long[] field3436 = new long[10];

    @OriginalMember(owner = "client!ud", name = "B", descriptor = "Loc;")
    public static class99 field3407 = class48.method402((byte) -104, "");

    @OriginalMember(owner = "client!ud", name = "G", descriptor = "Loc;")
    public static class99 field3412 = field3407;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "[Loc;")
    public static class99[] field3420 = new class99[100];

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field3418 = 1;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "Loc;")
    public static class99 field3429 = class48.method402((byte) -104, "gr-Un:");

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "Loc;")
    private static class99 field3421 = class48.method402((byte) -104, "Loading)3)3)3");

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "Loc;")
    public static class99 field3424 = field3407;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "Loc;")
    public static class99 field3425 = field3407;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "[I")
    public static int[] field3431 = new int[200];

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "Loc;")
    public static class99 field3427 = field3407;

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "Loc;")
    public static class99 field3417 = field3421;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "Loc;")
    public static class99 field3434 = field3407;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "Loc;")
    public static class99 field3423 = field3407;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "Loc;")
    public static class99 field3435 = field3407;

    @OriginalMember(owner = "client!ud", name = "z", descriptor = "Loc;")
    public static class99 field3405 = class48.method402((byte) -104, "");

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Loc;")
    public static class99 field3419 = field3407;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "I")
    public static volatile int field3437 = -1;

    @OriginalMember(owner = "client!ud", name = "A", descriptor = "I")
    private int field3406;

    @OriginalMember(owner = "client!ud", name = "C", descriptor = "I")
    private int field3408;

    @OriginalMember(owner = "client!ud", name = "D", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!ud", name = "F", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ud", name = "I", descriptor = "I")
    public static int field3413;

    @OriginalMember(owner = "client!ud", name = "J", descriptor = "I")
    private int field3414;

    @OriginalMember(owner = "client!ud", name = "K", descriptor = "I")
    private int field3415;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field3426;

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "I")
    public static int field3432;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "I")
    public static int field3433;

    @OriginalMember(owner = "client!ud", name = "L", descriptor = "J")
    private long field3416;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lpc;")
    public static class105 field3430;

    @OriginalMember(owner = "client!ud", name = "E", descriptor = "[I")
    public static int[] field3410;

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)Lne;")
    public static final class95 method1141(byte arg0) {
        field3428++;
        if (arg0 != -7) {
            method1145((byte) 107);
        }
        try {
            return (class95) Class.forName("va").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)V")
    public static void method1142(int arg0) {
        field3429 = null;
        field3407 = null;
        if (arg0 != 1) {
            method1145((byte) 123);
        }
        field3417 = null;
        field3427 = null;
        field3423 = null;
        field3412 = null;
        field3419 = null;
        field3421 = null;
        field3405 = null;
        field3434 = null;
        field3424 = null;
        field3430 = null;
        field3431 = null;
        field3420 = null;
        field3410 = null;
        field3435 = null;
        field3425 = null;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)V")
    public final void method18(int arg0) {
        this.field3408 = 256;
        field3422++;
        this.field3406 = 1;
        if (arg0 != -15127) {
            this.method18(110);
        }
        this.field3415 = 0;
        this.field3416 = class60.method535(2);
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3436[var2] = this.field3416;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V")
    public static final void method1143(boolean arg0) {
        field3409++;
        if (!arg0) {
            method1146(-29, 1);
        }
        class27.field684 = false;
        class6.field146 = false;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(ZIII)I")
    public static final int method1144(boolean arg0, int arg1, int arg2, int arg3) {
        field3426++;
        int var4 = arg2 >> 7;
        int var5 = arg1 >> 7;
        if (var5 < 0 || var4 < 0 || var5 > 103 || var4 > 103) {
            return 0;
        }
        int var6 = arg1 & 0x7F;
        int var7 = arg3;
        if (arg3 < 3 && (class81.field2028[1][var5][var4] & 0x2) == 2) {
            var7 = arg3 + 1;
        }
        int var8 = (128 - var6) * class121.field2964[var7][var5][var4] + class121.field2964[var7][var5 + 1][var4] * var6 >> 7;
        if (arg0) {
            int var9 = arg2 & 0x7F;
            int var10 = (128 - var6) * class121.field2964[var7][var5][var4 - -1] + class121.field2964[var7][var5 + 1][var4 + 1] * var6 >> 7;
            return (128 - var9) * var8 + var9 * var10 >> 7;
        } else {
            return 108;
        }
    }

    @OriginalMember(owner = "client!ud", name = "d", descriptor = "(I)V")
    public final void method17(int arg0) {
        field3433++;
        if (arg0 != 14) {
            this.method17(-12);
        }
        for (int var2 = 0; var2 < 10; var2++) {
            this.field3436[var2] = 0L;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(III)I")
    public final int method19(int arg0, int arg1, int arg2) {
        field3432++;
        int var4 = this.field3408;
        this.field3408 = 300;
        int var5 = this.field3406;
        this.field3406 = 1;
        this.field3416 = class60.method535(2);
        if (this.field3436[this.field3414] == 0L) {
            this.field3406 = var5;
            this.field3408 = var4;
        } else if (this.field3436[this.field3414] < this.field3416) {
            this.field3408 = (int) ((long) (arg0 * 2560) / (this.field3416 - this.field3436[this.field3414]));
        }
        if (this.field3408 < 25) {
            this.field3408 = 25;
        }
        if (arg1 != 9) {
            return 45;
        }
        if (this.field3408 > 256) {
            this.field3408 = 256;
            this.field3406 = (int) ((long) arg0 - (this.field3416 - this.field3436[this.field3414]) / 10L);
        }
        if (this.field3406 > arg0) {
            this.field3406 = arg0;
        }
        this.field3436[this.field3414] = this.field3416;
        this.field3414 = (this.field3414 + 1) % 10;
        if (this.field3406 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field3436[var6] != 0L) {
                    this.field3436[var6] -= -((long) this.field3406);
                }
            }
        }
        if (arg2 > this.field3406) {
            this.field3406 = arg2;
        }
        class57.method509(-126, (long) this.field3406);
        int var7 = 0;
        while (this.field3415 < 256) {
            this.field3415 += this.field3408;
            var7++;
        }
        this.field3415 &= 0xFF;
        return var7;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "()V")
    public class137() {
        this.method18(-15127);
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V")
    public static final void method1145(byte arg0) {
        field3413++;
        if (class118.field2904 != null) {
            class118.field2904.method1215(false);
        }
        if (arg0 <= 111) {
            method1146(125, 120);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z")
    public static final boolean method1146(int arg0, int arg1) {
        if (arg0 != 200) {
            field3412 = null;
        }
        field3411++;
        return (arg1 >> 31 & 0x1) != 0;
    }
}
