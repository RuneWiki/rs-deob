import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class194 {

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public int field3479 = 0;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Z")
    public boolean field3480 = true;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field3485 = -1;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public int field3486 = -1;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Lha;")
    public static class46 field3476 = class271.method1828("Untersuchen", -46);

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "Lha;")
    public static class46 field3478 = class271.method1828("null", -46);

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "Lha;")
    private static class46 field3484 = class271.method1828("Loading title screen )2 ", -46);

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lha;")
    public static class46 field3482 = field3484;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lge;")
    public static class235 field3475 = new class235(16);

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field3488 = 0;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Lej;")
    public static class188 field3487 = new class188(128);

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field3489 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "[J")
    public static long[] field3492 = new long[200];

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "[I")
    public static int[] field3491;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(BILwe;I)V")
    private final void method1399(byte arg0, int arg1, class75 arg2, int arg3) {
        if (arg3 == 1) {
            this.field3479 = class95.method744(arg2.method559(-1), -112);
        } else if (arg3 == 2) {
            this.field3486 = arg2.method558(1);
        } else if (arg3 == 3) {
            this.field3486 = arg2.method545((byte) 115);
            if (this.field3486 == 65535) {
                this.field3486 = -1;
            }
        } else if (arg3 == 5) {
            this.field3480 = false;
        } else if (arg3 == 7) {
            this.field3485 = class95.method744(arg2.method559(-1), -8);
        } else if (arg3 == 8) {
            class271.field4729 = arg1;
        } else if (arg3 == 9) {
            arg2.method545((byte) 77);
        } else if (arg3 != 10) {
            if (arg3 == 11) {
                arg2.method558(arg0 - 121);
            } else if (arg3 != 12) {
                if (arg3 == 13) {
                    arg2.method559(arg0 ^ 0xFFFFFF85);
                } else if (arg3 == 14) {
                    arg2.method558(1);
                }
            }
        }
        field3481++;
        if (arg0 != 122) {
            this.method1399((byte) 30, 126, (class75) null, -43);
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method1400(int arg0) {
        field3484 = null;
        field3492 = null;
        field3491 = null;
        field3475 = null;
        field3476 = null;
        field3482 = null;
        field3487 = null;
        if (arg0 > -17) {
            method1400(4);
        }
        field3478 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILwe;I)V")
    public final void method1401(int arg0, class75 arg1, int arg2) {
        field3474++;
        if (arg2 < 65) {
            return;
        }
        while (true) {
            int var4 = arg1.method558(1);
            if (var4 == 0) {
                return;
            }
            this.method1399((byte) 122, arg0, arg1, var4);
        }
    }
}
