import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class239 extends class5 {

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public int field3641 = 0;

    @OriginalMember(owner = "client!rc", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3646 = "Cancel";

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!rc", name = "A", descriptor = "I")
    public int field3637;

    @OriginalMember(owner = "client!rc", name = "B", descriptor = "I")
    public int field3638;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "I")
    public int field3640;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public int field3643;

    @OriginalMember(owner = "client!rc", name = "H", descriptor = "I")
    public int field3644;

    @OriginalMember(owner = "client!rc", name = "I", descriptor = "I")
    public int field3645;

    @OriginalMember(owner = "client!rc", name = "K", descriptor = "I")
    public int field3647;

    @OriginalMember(owner = "client!rc", name = "L", descriptor = "I")
    public int field3648;

    @OriginalMember(owner = "client!rc", name = "M", descriptor = "I")
    public int field3649;

    @OriginalMember(owner = "client!rc", name = "N", descriptor = "I")
    public int field3650;

    @OriginalMember(owner = "client!rc", name = "O", descriptor = "I")
    public int field3651;

    @OriginalMember(owner = "client!rc", name = "z", descriptor = "Lth;")
    public class270 field3636;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "Lhg;")
    public class316 field3632;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lhg;")
    public class316 field3633;

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Lqh;")
    public class32 field3634;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lkk;")
    public class76 field3630;

    @OriginalMember(owner = "client!rc", name = "P", descriptor = "Z")
    public boolean field3652;

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "[I")
    public int[] field3631;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(B)V", line = 12)
    public static void method1663(byte arg0) {
        field3646 = null;
        if (arg0 <= 37) {
            method1663((byte) -64);
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IB)V", line = 32)
    public static final void method1664(int arg0, byte arg1) {
        class268.field4171 = null;
        class77.field1135 = arg0;
        field3639++;
        class220.field3364 = -1;
        class106.field1540 = 1;
        if (arg1 == 84) {
            class333.field5191 = false;
            class23.field260 = 0;
            class4.field52 = -1;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)V", line = 60)
    public final void method1665(int arg0) {
        field3642++;
        if (arg0 >= -78) {
            return;
        }
        int var2 = this.field3644;
        if (this.field3634 != null) {
            class32 var5 = this.field3634.method247(-1);
            if (var5 == null) {
                this.field3631 = null;
                this.field3648 = 0;
                this.field3649 = 0;
                this.field3643 = 0;
                this.field3644 = -1;
                this.field3645 = 0;
            } else {
                this.field3644 = var5.field445;
                this.field3631 = var5.field447;
                this.field3645 = var5.field460 * 128;
                this.field3649 = var5.field471;
                this.field3643 = var5.field481;
                this.field3648 = var5.field414;
            }
        } else if (this.field3630 != null) {
            int var3 = class114.method876(-123, this.field3630);
            if (var2 != var3) {
                this.field3644 = var3;
                class332 var4 = this.field3630.field1104;
                if (var4.field5162 != null) {
                    var4 = var4.method2324((byte) -124);
                }
                if (var4 == null) {
                    this.field3649 = this.field3645 = 0;
                } else {
                    this.field3645 = var4.field5135 * 128;
                    this.field3649 = var4.field5161;
                }
            }
        } else if (this.field3636 != null) {
            this.field3644 = class87.method647(1, this.field3636);
            this.field3645 = this.field3636.field4190 * 128;
            this.field3649 = this.field3636.field4225;
        }
        if (this.field3644 != var2 && this.field3632 != null) {
            class322.field4961.method147(this.field3632);
            this.field3632 = null;
        }
    }
}
