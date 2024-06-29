import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wv")
public class class246 {

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "I")
    public int field3366 = 443;

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "Z")
    private boolean field3367 = false;

    @OriginalMember(owner = "client!wv", name = "h", descriptor = "Z")
    private boolean field3373 = true;

    @OriginalMember(owner = "client!wv", name = "n", descriptor = "I")
    public int field3379 = 43594;

    @OriginalMember(owner = "client!wv", name = "d", descriptor = "[I")
    public static int[] field3369 = new int[2];

    @OriginalMember(owner = "client!wv", name = "j", descriptor = "I")
    public static int field3375 = 0;

    @OriginalMember(owner = "client!wv", name = "c", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!wv", name = "e", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!wv", name = "f", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!wv", name = "g", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!wv", name = "k", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!wv", name = "l", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!wv", name = "m", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!wv", name = "o", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!wv", name = "i", descriptor = "Ljava/lang/String;")
    public String field3374;

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(I)V", line = 3)
    public final void method1602(int arg0) {
        if (!this.field3373) {
            this.field3373 = true;
            this.field3367 = true;
        } else if (this.field3367) {
            this.field3367 = false;
        } else {
            this.field3373 = false;
        }
        int var2 = -5 % ((-arg0 - 15) / 52);
        field3368++;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(Lwv;I)Z", line = 30)
    public final boolean method1603(class246 arg0, int arg1) {
        field3372++;
        if (arg1 != 1) {
            this.method1603(null, -110);
        }
        if (arg0 == null) {
            return false;
        } else {
            return this.field3371 == arg0.field3371 && this.field3374.equals(arg0.field3374);
        }
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(BLoq;)Ltba;", line = 55)
    public final class339 method1604(byte arg0, class775 arg1) {
        int var3 = 121 % ((27 - arg0) / 43);
        field3377++;
        return arg1.method4239(this.field3367, 724, this.field3373 ? this.field3366 : this.field3379, this.field3374);
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(III)Z", line = 65)
    public static final boolean method1605(int arg0, int arg1, int arg2) {
        field3380++;
        if (arg1 != 1024) {
            method1605(-13, 117, 88);
        }
        return (arg0 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!wv", name = "a", descriptor = "(IILjava/lang/String;)V", line = 78)
    public static final void method1606(int arg0, int arg1, String arg2) {
        class259.field3484++;
        field3370++;
        class13 var3 = class659.method3587(class68.field909, 98, class116.field1533);
        var3.field130.method1491(-129, class32.method168(arg2, arg0 + 94) + 1);
        var3.field130.method1533(arg1, (byte) 80);
        var3.field130.method1547(arg2, arg0 - 6458);
        class116.method679(var3, arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!wv", name = "b", descriptor = "(I)V", line = 96)
    public static void method1607(int arg0) {
        if (arg0 != 20467) {
            field3378 = -36;
        }
        field3369 = null;
    }
}
