import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class295 {

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "I")
    public int field4414 = 43594;

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "I")
    public int field4418 = 443;

    @OriginalMember(owner = "client!dh", name = "k", descriptor = "Z")
    private boolean field4424 = false;

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "Z")
    private boolean field4427 = false;

    @OriginalMember(owner = "client!dh", name = "g", descriptor = "I")
    public static int field4420 = -1;

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "I")
    public static int field4415 = 0;

    @OriginalMember(owner = "client!dh", name = "i", descriptor = "I")
    public static int field4422 = 0;

    @OriginalMember(owner = "client!dh", name = "c", descriptor = "I")
    public static int field4416;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!dh", name = "f", descriptor = "I")
    public int field4419;

    @OriginalMember(owner = "client!dh", name = "h", descriptor = "I")
    public static int field4421;

    @OriginalMember(owner = "client!dh", name = "j", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!dh", name = "m", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!dh", name = "l", descriptor = "Ljava/lang/String;")
    public String field4425;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ln;I)Lkp;")
    public final class456 method1961(class17 arg0, int arg1) {
        field4417++;
        return arg1 == 43594 ? arg0.method396(this.field4425, this.field4427, (byte) 5, this.field4424 ? this.field4418 : this.field4414) : null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ldh;I)Z")
    public final boolean method1962(class295 arg0, int arg1) {
        if (arg1 != 1) {
            method1964(31);
        }
        field4416++;
        if (arg0 == null) {
            return false;
        } else {
            return this.field4419 == arg0.field4419 && this.field4425.equals(arg0.field4425);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V")
    public final void method1963(byte arg0) {
        if (!this.field4424) {
            this.field4427 = true;
            this.field4424 = true;
        } else if (this.field4427) {
            this.field4427 = false;
        } else {
            this.field4424 = false;
        }
        field4423++;
        int var2 = 124 % ((-arg0 - 50) / 52);
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(I)V")
    public static final void method1964(int arg0) {
        field4426++;
        class481.field6904 = 0;
        class126.field2292.method1222((byte) -98);
        class308.field4551 = false;
        if (arg0 >= -105) {
            method1964(-68);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(II)V")
    public static final void method1965(int arg0, int arg1) {
        field4421++;
        if (!class225.method1539(arg1, 4)) {
            return;
        }
        class545[] var2 = class156.field2667[arg1];
        int var3 = 0;
        int var4 = 45 % ((arg0 - 57) / 54);
        while (var2.length > var3) {
            class545 var5 = var2[var3];
            if (var5 != null) {
                var5.field7715 = 0;
                var5.field7624 = 0;
                var5.field7661 = 1;
            }
            var3++;
        }
    }
}
