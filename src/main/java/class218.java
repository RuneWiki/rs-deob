import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class218 extends class162 {

    @OriginalMember(owner = "client!el", name = "H", descriptor = "I")
    public int field3470 = 12800;

    @OriginalMember(owner = "client!el", name = "N", descriptor = "I")
    public int field3476 = 0;

    @OriginalMember(owner = "client!el", name = "I", descriptor = "I")
    public int field3471 = 12800;

    @OriginalMember(owner = "client!el", name = "S", descriptor = "I")
    public int field3481 = -1;

    @OriginalMember(owner = "client!el", name = "K", descriptor = "Z")
    public boolean field3473 = true;

    @OriginalMember(owner = "client!el", name = "D", descriptor = "I")
    public int field3466 = 0;

    @OriginalMember(owner = "client!el", name = "W", descriptor = "I")
    public int field3485 = -1;

    @OriginalMember(owner = "client!el", name = "O", descriptor = "Ljava/lang/String;")
    public String field3477;

    @OriginalMember(owner = "client!el", name = "E", descriptor = "I")
    public int field3467;

    @OriginalMember(owner = "client!el", name = "X", descriptor = "Ljava/lang/String;")
    public String field3486;

    @OriginalMember(owner = "client!el", name = "B", descriptor = "I")
    public int field3464;

    @OriginalMember(owner = "client!el", name = "V", descriptor = "Lwa;")
    public class281 field3484;

    @OriginalMember(owner = "client!el", name = "A", descriptor = "I")
    public static int field3463 = 0;

    @OriginalMember(owner = "client!el", name = "F", descriptor = "I")
    public static int field3468 = 0;

    @OriginalMember(owner = "client!el", name = "Q", descriptor = "[I")
    public static int[] field3479 = new int[2];

    @OriginalMember(owner = "client!el", name = "U", descriptor = "I")
    public static int field3483 = 0;

    @OriginalMember(owner = "client!el", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field3488 = "RuneScape is loading - please wait...";

    @OriginalMember(owner = "client!el", name = "T", descriptor = "Lec;")
    public static class25 field3482 = new class25(64);

    @OriginalMember(owner = "client!el", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3489 = "slide:";

    @OriginalMember(owner = "client!el", name = "C", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!el", name = "G", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!el", name = "L", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!el", name = "M", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!el", name = "P", descriptor = "I")
    public static int field3478;

    @OriginalMember(owner = "client!el", name = "Y", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!el", name = "R", descriptor = "Lkk;")
    public static class254 field3480;

    @OriginalMember(owner = "client!el", name = "J", descriptor = "[S")
    public static short[] field3472;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II[II)Z")
    public final boolean method1522(int arg0, int arg1, int[] arg2, int arg3) {
        field3478++;
        if (arg0 != 18539) {
            this.field3485 = -63;
        }
        for (class277 var5 = (class277) this.field3484.method1959(205); var5 != null; var5 = (class277) this.field3484.method1956(80)) {
            if (var5.method1931(arg3, (byte) -53, arg1)) {
                var5.method1930(arg3, arg2, arg1, (byte) 101);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BII)V")
    public static final void method1523(byte arg0, int arg1, int arg2) {
        if (arg0 != -70) {
            method1523((byte) 109, 54, -76);
        }
        if (class42.field590 != arg2) {
            class152.field2367 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class152.field2367[var3] = (var3 << 12) / arg2;
            }
            class227.field3594 = arg2 - 1;
            class42.field590 = arg2;
            class31.field392 = arg2 * 32;
        }
        field3474++;
        if (class258.field4243 == arg1) {
            return;
        }
        if (class42.field590 == arg1) {
            class42.field591 = class152.field2367;
        } else {
            class42.field591 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class42.field591[var4] = (var4 << 12) / arg1;
            }
        }
        class258.field4243 = arg1;
        class52.field704 = arg1 - 1;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III[I)Z")
    public final boolean method1524(int arg0, int arg1, int arg2, int[] arg3) {
        field3465++;
        if (arg0 != 6778) {
            field3480 = null;
        }
        for (class277 var5 = (class277) this.field3484.method1959(arg0 - 6573); var5 != null; var5 = (class277) this.field3484.method1956(arg0 ^ 0x1A29)) {
            if (var5.method1932(arg1, arg2, 0)) {
                var5.method1924(arg3, arg1, arg2, arg0 - 6776);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
    public final boolean method1525(int arg0, int arg1, int arg2) {
        field3475++;
        class277 var4 = (class277) this.field3484.method1959(205);
        if (arg0 != -12421) {
            return false;
        }
        while (var4 != null) {
            if (var4.method1931(arg1, (byte) 125, arg2)) {
                return true;
            }
            var4 = (class277) this.field3484.method1956(arg0 ^ 0xFFFFCF15);
        }
        return false;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZIII[I)Z")
    public final boolean method1526(boolean arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field3487++;
        if (arg0) {
            this.method1524(27, -118, 50, (int[]) null);
        }
        for (class277 var6 = (class277) this.field3484.method1959(205); var6 != null; var6 = (class277) this.field3484.method1956(119)) {
            if (var6.method1927(arg3, arg1, arg2, -122)) {
                var6.method1930(arg2, arg4, arg1, (byte) 120);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!el", name = "g", descriptor = "(I)V")
    public final void method1527(int arg0) {
        this.field3476 = 0;
        field3469++;
        this.field3466 = 0;
        int var2 = 13 / ((arg0 + 58) / 50);
        this.field3471 = 12800;
        this.field3470 = 12800;
        for (class277 var3 = (class277) this.field3484.method1959(205); var3 != null; var3 = (class277) this.field3484.method1956(117)) {
            if (var3.field4597 > this.field3476) {
                this.field3476 = var3.field4597;
            }
            if (var3.field4579 > this.field3466) {
                this.field3466 = var3.field4579;
            }
            if (this.field3470 > var3.field4594) {
                this.field3470 = var3.field4594;
            }
            if (this.field3471 > var3.field4585) {
                this.field3471 = var3.field4585;
            }
        }
    }

    @OriginalMember(owner = "client!el", name = "h", descriptor = "(I)V")
    public static void method1528(int arg0) {
        if (arg0 != -1) {
            return;
        }
        field3488 = null;
        field3479 = null;
        field3482 = null;
        field3480 = null;
        field3472 = null;
        field3489 = null;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZI)V")
    public class218(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6) {
        this.field3485 = arg4;
        this.field3481 = arg6;
        this.field3477 = arg2;
        this.field3467 = arg3;
        this.field3486 = arg1;
        if (this.field3481 == 255) {
            this.field3481 = 0;
        }
        this.field3464 = arg0;
        this.field3473 = arg5;
        this.field3484 = new class281();
    }
}
