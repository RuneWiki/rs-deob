import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class456 {

    @OriginalMember(owner = "client!rca", name = "f", descriptor = "Z")
    public boolean field6718 = false;

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "I")
    public int field6715 = 1190717;

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "Z")
    public boolean field6717 = true;

    @OriginalMember(owner = "client!rca", name = "i", descriptor = "I")
    public int field6721 = -1;

    @OriginalMember(owner = "client!rca", name = "p", descriptor = "I")
    public int field6728 = -1;

    @OriginalMember(owner = "client!rca", name = "n", descriptor = "I")
    public int field6726 = 8;

    @OriginalMember(owner = "client!rca", name = "h", descriptor = "Z")
    public boolean field6720 = true;

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
    public int field6733 = 64;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "I")
    public int field6713 = 0;

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "I")
    public int field6732 = 512;

    @OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
    public int field6736 = 127;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "Z")
    public static boolean field6723 = false;

    @OriginalMember(owner = "client!rca", name = "q", descriptor = "I")
    public static int field6729 = 0;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "I")
    public static int field6714;

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "I")
    public static int field6719;

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!rca", name = "m", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!rca", name = "o", descriptor = "I")
    public static int field6727;

    @OriginalMember(owner = "client!rca", name = "r", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!rca", name = "s", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "I")
    public int field6734;

    @OriginalMember(owner = "client!rca", name = "j", descriptor = "Lcs;")
    public static class342 field6722;

    @OriginalMember(owner = "client!rca", name = "w", descriptor = "Lhl;")
    public class530 field6735;

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Z", line = 4)
    public static final boolean method2790(int arg0, int arg1, int arg2) {
        field6730++;
        if (arg1 != -6) {
            field6727 = -5;
        }
        return class385.method2479(arg2, (byte) 8, arg0) & ((arg2 & 0x2000) != 0 | class33.method170(arg0, (byte) -87, arg2) | class377.method2440(arg2, arg0, 65536));
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)V", line = 16)
    public final void method2791(boolean arg0) {
        field6725++;
        this.field6726 = this.field6734 | this.field6726 << 8;
        if (arg0) {
            field6729 = 126;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lrg;II)V", line = 33)
    private final void method2792(class645 arg0, int arg1, int arg2) {
        field6719++;
        if (arg1 == 1) {
            this.field6713 = class211.method1437((byte) -104, arg0.method3747((byte) -74));
        } else if (arg1 == 2) {
            this.field6728 = arg0.method3745(-6314);
        } else if (arg1 == 3) {
            this.field6728 = arg0.method3712((byte) 113);
            if (this.field6728 == 65535) {
                this.field6728 = -1;
            }
        } else if (arg1 == 5) {
            this.field6717 = false;
        } else if (arg1 == 7) {
            this.field6721 = class211.method1437((byte) -90, arg0.method3747((byte) -74));
        } else if (arg1 == 8) {
            this.field6735.field7560 = this.field6734;
        } else if (arg1 == 9) {
            this.field6732 = arg0.method3712((byte) -125) << 2;
        } else if (arg1 == 10) {
            this.field6720 = false;
        } else if (arg1 == 11) {
            this.field6726 = arg0.method3745(-6314);
        } else if (arg1 == 12) {
            this.field6718 = true;
        } else if (arg1 == 13) {
            this.field6715 = arg0.method3747((byte) -74);
        } else if (arg1 == 14) {
            this.field6733 = arg0.method3745(-6314) << 2;
        } else if (arg1 == 16) {
            this.field6736 = arg0.method3745(-6314);
        }
        int var4 = -19 / ((arg2 - 28) / 51);
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(Z)V", line = 102)
    public static void method2793(boolean arg0) {
        field6722 = null;
        if (!arg0) {
            field6729 = -52;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 119)
    public static final void method2794(String arg0, byte arg1) {
        field6724++;
        class468 var2 = class317.method2011(0);
        var2.field6839.method3730(121, class725.field10131.field7796);
        var2.field6839.method3702(0, (byte) -117);
        int var3 = var2.field6839.field9084;
        var2.field6839.method3702(639, (byte) -121);
        int[] var4 = class15.method96(99999999, var2);
        int var5 = var2.field6839.field9084;
        var2.field6839.method3692(120, arg0);
        var2.field6839.method3730(116, class650.field9160);
        var2.field6839.field9084 += 7;
        var2.field6839.method3732(var2.field6839.field9084, var4, (byte) 124, var5);
        var2.field6839.method3700(var2.field6839.field9084 - var3, false);
        class120.method872((byte) 98, var2);
        class362.field5235 = 0;
        class79.field1100 = 0;
        class661.field9245 = 1;
        class313.field4434 = -3;
        if (arg1 < 88) {
            method2793(false);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Lrg;I)V", line = 181)
    public final void method2795(class645 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method3745(-6314);
            if (var3 == 0) {
                field6716++;
                if (arg1 != 29729) {
                    this.field6728 = 32;
                    return;
                }
                return;
            }
            this.method2792(arg0, var3, -65);
        }
    }
}
