import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class23 {

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "I")
    private int field222 = 0;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "I")
    private int field234 = 0;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    private int field235 = 0;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "Lrs;")
    private class166 field229;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "Lah;")
    private class374 field230;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "[Lie;")
    private class190[] field226;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "Lde;")
    public class601 field225;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "Z")
    public static boolean field221 = false;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "Lraa;")
    public static class353 field236 = null;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(B)V", line = 5)
    public static final void method122(byte arg0) {
        field224++;
        class14 var1 = class364.field5565;
        synchronized (class364.field5565) {
            class364.field5565.method76(-123);
        }
        class14 var2 = class638.field8958;
        synchronized (class638.field8958) {
            class638.field8958.method76(arg0 + 242);
        }
        if (arg0 != -125) {
            field236 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 21)
    public static void method123(int arg0) {
        field236 = null;
        if (arg0 != 0) {
            field221 = false;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IILpe;)V", line = 36)
    public static final void method124(int arg0, int arg1, class109 arg2) {
        field232++;
        int var3 = -1;
        int var4 = 0;
        if (class199.field3403 < arg2.field1645) {
            class741.method4151(false, arg2);
        } else if (class199.field3403 <= arg2.field1660) {
            class458.method2805(arg2, (byte) 102);
        } else {
            class699.method3886(arg2, false, 0);
            var4 = class736.field10372;
            var3 = class551.field7857;
        }
        if (arg0 <= 31) {
            field221 = false;
        }
        if (arg2.field9477 < 512 || arg2.field9475 < 512 || (class191.field3229 * 512 - 512) <= arg2.field9477 || (class314.field4720 - 1) * 512 <= arg2.field9475) {
            var3 = -1;
            arg2.field1693 = -1;
            arg2.field1695 = -1;
            arg2.field1595 = -1;
            arg2.field1645 = 0;
            arg2.field1591 = null;
            arg2.field1660 = 0;
            var4 = 0;
            arg2.field9477 = arg2.field1702[0] * 512 + (arg2.method878(-5740) * 256);
            arg2.field9475 = arg2.field1704[0] * 512 + (arg2.method878(-5740) * 256);
            arg2.method882(0);
        }
        if (class145.field2251 == arg2 && (arg2.field9477 < 6144 || arg2.field9475 < 6144 || ((class191.field3229 - 12) * 512) <= arg2.field9477 || (class314.field4720 - 12) * 512 <= arg2.field9475)) {
            arg2.field1660 = 0;
            arg2.field1693 = -1;
            arg2.field1695 = -1;
            arg2.field1591 = null;
            var3 = -1;
            arg2.field1645 = 0;
            var4 = 0;
            arg2.field1595 = -1;
            arg2.field9477 = arg2.field1702[0] * 512 + (arg2.method878(-5740) * 256);
            arg2.field9475 = arg2.field1704[0] * 512 + (arg2.method878(-5740) * 256);
            arg2.method882(0);
        }
        int var5 = class693.method3867(arg2, true);
        class647.method3653(arg2, true);
        class107.method863(arg2, var3, var4, -63, var5);
        class126.method970((byte) -73, var3, arg2);
        class313.method2061(arg2, -126);
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(Lrs;)V", line = 195)
    public class23(class166 arg0) {
        this.field229 = arg0;
        this.field230 = new class374(arg0);
        this.field226 = new class190[10];
        this.field226[1] = new class401(arg0);
        this.field226[2] = new class113(arg0, this.field230);
        this.field226[4] = new class189(arg0, this.field230);
        this.field226[5] = new class518(arg0, this.field230);
        this.field226[6] = new class519(arg0);
        this.field226[7] = new class543(arg0);
        this.field226[3] = this.field225 = new class601(arg0);
        this.field226[8] = new class614(arg0, this.field230);
        this.field226[9] = new class541(arg0, this.field230);
        if (!this.field226[8].method908(92)) {
            this.field226[8] = this.field226[4];
        }
        if (!this.field226[9].method908(49)) {
            this.field226[9] = this.field226[8];
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(ZI)Z", line = 120)
    public final boolean method125(boolean arg0, int arg1) {
        field233++;
        if (!arg0) {
            method122((byte) -85);
        }
        return this.field226[arg1].method908(71);
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZZIB)V", line = 131)
    public final void method126(int arg0, int arg1, boolean arg2, boolean arg3, int arg4, byte arg5) {
        boolean var7 = arg2 & this.field229.method400();
        field231++;
        if (!var7 && (arg4 == 4 || arg4 == 8 || arg4 == 9)) {
            if (arg4 == 4) {
                arg1 = arg0;
            }
            arg4 = 2;
        }
        if (arg4 != 0 && arg3) {
            arg4 |= Integer.MIN_VALUE;
        }
        if (this.field234 != arg4) {
            if (this.field234 != 0) {
                this.field226[this.field234 & Integer.MAX_VALUE].method910(false);
            }
            if (arg4 != 0) {
                this.field226[arg4 & Integer.MAX_VALUE].method915(arg3, 0);
                this.field226[arg4 & Integer.MAX_VALUE].method909(16450, arg3);
                this.field226[Integer.MAX_VALUE & arg4].method914(arg0, arg1, (byte) -122);
            }
            this.field222 = arg1;
            this.field235 = arg0;
            this.field234 = arg4;
        } else if (this.field234 != 0) {
            this.field226[this.field234 & Integer.MAX_VALUE].method909(16450, arg3);
            if (this.field235 != arg0 || this.field222 != arg1) {
                this.field226[Integer.MAX_VALUE & this.field234].method914(arg0, arg1, (byte) -122);
                this.field235 = arg0;
                this.field222 = arg1;
            }
        }
        if (arg5 < 48) {
            method122((byte) 99);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lnba;IZ)Z", line = 223)
    public final boolean method127(class487 arg0, int arg1, boolean arg2) {
        field227++;
        if (arg2) {
            this.field234 = 93;
        }
        if (this.field234 == 0) {
            return false;
        } else {
            this.field226[this.field234 & Integer.MAX_VALUE].method911(arg1, arg0, 0);
            return true;
        }
    }

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "(B)V", line = 239)
    public static final void method128(byte arg0) {
        int var1 = 4 / ((arg0 + 56) / 46);
        field223++;
        if (class399.field5924 != -1) {
            class290.method1893(false, -1, true, -1, class399.field5924);
            class399.field5924 = -1;
        }
    }
}
