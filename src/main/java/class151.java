import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class151 {

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    private int field2664 = 0;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Ldf;")
    private class146 field2658;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lmb;")
    private static class96 field2657 = class243.method1708("Prepared sound engine", (byte) 112);

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Z")
    public static boolean field2656 = false;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "Lmb;")
    public static class96 field2655 = field2657;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Lmb;")
    public static class96 field2667 = class243.method1708("Lade Titelbild )2 ", (byte) 95);

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    public static int field2659;

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    public static int field2661;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "I")
    public static int field2666;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "Lce;")
    public static class111 field2660;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Lh;")
    private class249 field2662;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)Lh;")
    public final class249 method1106(int arg0) {
        int var2 = 87 % ((-arg0 - 70) / 53);
        field2665++;
        this.field2664 = 0;
        return this.method1109(91);
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(BII)I")
    public static final int method1107(byte arg0, int arg1, int arg2) {
        if (arg0 != -96) {
            method1108(-15, -78, 11, 1, 26);
        }
        field2659++;
        class60 var3 = (class60) class132.field2373.method1081(0, (long) arg1);
        if (var3 == null) {
            return -1;
        } else if (arg2 >= 0 && arg2 < var3.field1035.length) {
            return var3.field1035[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIII)V")
    public static final void method1108(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= arg0) {
            for (int var5 = arg0; var5 < arg2; var5++) {
                class229.field3939[var5][arg3] = arg1;
            }
        } else {
            for (int var6 = arg2; var6 < arg0; var6++) {
                class229.field3939[var6][arg3] = arg1;
            }
        }
        if (arg4 == -1) {
            field2663++;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)Lh;")
    public final class249 method1109(int arg0) {
        field2661++;
        if (this.field2664 > 0 && this.field2658.field2585[this.field2664 - 1] != this.field2662) {
            class249 var2 = this.field2662;
            this.field2662 = var2.field4307;
            return var2;
        }
        int var3 = -75 % ((arg0 - 28) / 49);
        while (this.field2658.field2589 > this.field2664) {
            class249 var4 = this.field2658.field2585[this.field2664++].field4307;
            if (this.field2658.field2585[this.field2664 - 1] != var4) {
                this.field2662 = var4.field4307;
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IZ)I")
    public static final int method1110(int arg0, boolean arg1) {
        field2666++;
        if (arg0 < 0) {
            return 0;
        } else if (arg1) {
            class60 var2 = (class60) class132.field2373.method1081(0, (long) arg0);
            if (var2 == null) {
                return class9.method71(arg0, 3).field2383;
            }
            int var3 = 0;
            for (int var4 = 0; var4 < var2.field1035.length; var4++) {
                if (var2.field1035[var4] == -1) {
                    var3++;
                }
            }
            return var3 + (class9.method71(arg0, 3).field2383 - var2.field1035.length);
        } else {
            return 54;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Ldf;)V")
    public class151(class146 arg0) {
        this.field2658 = arg0;
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public static void method1111(int arg0) {
        if (arg0 != -1) {
            field2657 = null;
        }
        field2660 = null;
        field2657 = null;
        field2655 = null;
        field2667 = null;
    }
}
