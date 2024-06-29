import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class32 extends class79 {

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "I")
    public int field466 = 0;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "Lvk;")
    public static class67 field470 = new class67(64);

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "Lck;")
    public static class119 field471 = class298.method1987((byte) 82, "null");

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public int field452;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "I")
    public int field454;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public int field455;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "I")
    public int field456;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public int field457;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "I")
    public int field458;

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    public int field459;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public int field463;

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "Lqh;")
    public class163 field467;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "Loe;")
    public class239 field448;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "Loe;")
    public class239 field468;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "Lrb;")
    public class291 field464;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "Lba;")
    public class292 field472;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "Z")
    public boolean field469;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "[I")
    public int[] field465;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BLva;Lva;)V", line = 12)
    public static final void method236(byte arg0, class36 arg1, class36 arg2) {
        class161.field2557 = arg1;
        if (arg0 != -16) {
            method237(false);
        }
        class270.field4460 = arg2;
        field451++;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(Z)V", line = 46)
    public static final void method237(boolean arg0) {
        class91.field1416.method486((byte) 93);
        field449++;
        if (arg0) {
            method237(true);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)I", line = 63)
    public static final int method238(byte arg0, int arg1) {
        field462++;
        return arg0 <= 115 ? -76 : arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(B)V", line = 91)
    public final void method239(byte arg0) {
        field453++;
        int var2 = -9 % ((arg0 + 26) / 36);
        int var3 = this.field450;
        if (this.field464 != null) {
            class291 var4 = this.field464.method1940(true);
            if (var4 == null) {
                this.field459 = 0;
                this.field450 = -1;
                this.field465 = null;
                this.field456 = 0;
                this.field452 = 0;
            } else {
                this.field465 = var4.field4781;
                this.field452 = var4.field4798 * 128;
                this.field456 = var4.field4814;
                this.field459 = var4.field4766;
                this.field450 = var4.field4801;
            }
        } else if (this.field467 != null) {
            int var5 = class216.method1370(-1, this.field467);
            if (var3 != var5) {
                this.field450 = var5;
                class50 var6 = this.field467.field2575;
                if (var6.field826 != null) {
                    var6 = var6.method378((byte) -98);
                }
                if (var6 == null) {
                    this.field452 = 0;
                } else {
                    this.field452 = var6.field771 * 128;
                }
            }
        } else if (this.field472 != null) {
            this.field450 = class84.method568(119, this.field472);
            this.field452 = this.field472.field4871 * 128;
        }
        if (this.field450 != var3 && this.field448 != null) {
            class230.field3721.method1421(this.field448);
            this.field448 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)V", line = 166)
    public static final void method240(int arg0) {
        class31.field445 = null;
        class147.field2362 = null;
        if (arg0 == -16802) {
            field461++;
            class195.field3112 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V", line = 183)
    public static void method241(int arg0) {
        field470 = null;
        field471 = null;
        if (arg0 != 64) {
            method238((byte) 90, 69);
        }
    }
}
