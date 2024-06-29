import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class189 implements class33 {

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "I")
    private int field3454 = 128;

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    private int field3457 = 50;

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Lwa;")
    private class238 field3453;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "Lwa;")
    private class238 field3439;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "Lbb;")
    private class14 field3450;

    @OriginalMember(owner = "client!rd", name = "m", descriptor = "Z")
    public static boolean field3451 = false;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "Ldc;")
    public static class37 field3445 = class185.method1233((byte) 86, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Ldc;")
    private static class37 field3455 = class185.method1233((byte) 86, "glow1:");

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "Ldc;")
    public static class37 field3442 = field3455;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "Ldc;")
    public static class37 field3446 = field3455;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field3441;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field3444;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    public static int field3449;

    @OriginalMember(owner = "client!rd", name = "n", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IZ)Z")
    public final boolean method273(int arg0, boolean arg1) {
        field3452++;
        if (this.field3454 == 64 || this.method1260((byte) -100, arg0).field3730 == 64) {
            return true;
        } else {
            return arg1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)[I")
    public final int[] method267(int arg0, int arg1) {
        field3440++;
        if (arg0 != 1) {
            this.field3454 = 107;
        }
        class200 var3 = this.method1260((byte) 69, arg1);
        return var3.method1321(arg0 + 122, this.field3453, this.field3454, this);
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(II)Z")
    public final boolean method268(int arg0, int arg1) {
        if (arg0 > -3) {
            this.method1260((byte) -101, -92);
        }
        field3444++;
        return this.method1260((byte) -122, arg1).field3715;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)I")
    public final int method270(int arg0, byte arg1) {
        field3441++;
        return arg1 == 50 ? this.method1260((byte) -83, arg0).field3714 : -59;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)V")
    public final void method1257(int arg0) {
        this.field3450 = new class14(this.field3457);
        if (arg0 == 1) {
            field3448++;
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(IZ)V")
    public final void method1258(int arg0, boolean arg1) {
        field3447++;
        for (class200 var3 = (class200) this.field3450.method94(111); var3 != null; var3 = (class200) this.field3450.method90(-1)) {
            if (var3.field3734) {
                var3.method1322(arg0, (byte) 69);
                var3.field3734 = false;
            }
        }
        if (!arg1) {
            this.field3450 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IFI)[I")
    public final int[] method272(int arg0, float arg1, int arg2) {
        field3458++;
        if (arg0 == 64) {
            class200 var4 = this.method1260((byte) 51, arg2);
            var4.field3734 = true;
            return var4.method1326(124, arg1, this, this.field3453, this.field3454);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static void method1259(boolean arg0) {
        if (!arg0) {
            field3445 = null;
            field3455 = null;
            field3446 = null;
            field3442 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZ)Z")
    public final boolean method269(int arg0, boolean arg1) {
        field3449++;
        return arg1 ? false : this.method1260((byte) 59, arg0).field3738;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)Z")
    public final boolean method271(int arg0, int arg1) {
        field3456++;
        if (arg1 < 59) {
            this.method271(-124, 57);
        }
        return this.method1260((byte) 85, arg0).method1324((byte) -88, this.field3453, this);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BI)Lsd;")
    private final class200 method1260(byte arg0, int arg1) {
        field3443++;
        class200 var3 = (class200) this.field3450.method87(-106, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        int var4 = -90 % ((-arg0 - 29) / 50);
        byte[] var5 = this.field3439.method1547(arg1, 0, 0);
        if (var5 == null) {
            return class123.method836(-1);
        } else {
            class28 var6 = new class28(var5);
            class200 var7 = new class200(var6);
            this.field3450.method92((long) arg1, var7, true);
            return var7;
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lwa;Lwa;II)V")
    public class189(class238 arg0, class238 arg1, int arg2, int arg3) {
        this.field3454 = arg3;
        this.field3453 = arg1;
        this.field3439 = arg0;
        this.field3457 = arg2;
        this.field3450 = new class14(this.field3457);
    }
}
