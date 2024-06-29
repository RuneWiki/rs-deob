import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class399 extends class147 {

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    public int field5676 = 0;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field5679 = 0;

    @OriginalMember(owner = "client!wc", name = "M", descriptor = "[S")
    public static short[] field5692 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!wc", name = "K", descriptor = "I")
    public static int field5690 = 0;

    @OriginalMember(owner = "client!wc", name = "o", descriptor = "I")
    public int field5668;

    @OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
    public int field5670;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public int field5672;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field5673;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    public int field5674;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public int field5677;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public int field5680;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public int field5681;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "I")
    public int field5686;

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    public int field5687;

    @OriginalMember(owner = "client!wc", name = "J", descriptor = "I")
    public int field5689;

    @OriginalMember(owner = "client!wc", name = "L", descriptor = "I")
    public int field5691;

    @OriginalMember(owner = "client!wc", name = "N", descriptor = "I")
    public static int field5693;

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "Lqo;")
    public class137 field5671;

    @OriginalMember(owner = "client!wc", name = "p", descriptor = "Lcj;")
    public class198 field5669;

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "Ljr;")
    public class250 field5682;

    @OriginalMember(owner = "client!wc", name = "I", descriptor = "Ljr;")
    public class250 field5688;

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "Lcu;")
    public class415 field5685;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "Lg;")
    public static class470 field5683;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "Z")
    public boolean field5678;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "[I")
    public int[] field5675;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
    public final void method2386(int arg0) {
        field5684++;
        int var2 = this.field5677;
        if (this.field5685 != null) {
            class415 var3 = this.field5685.method2473(-18648, class75.field909);
            if (var3 == null) {
                this.field5675 = null;
                this.field5691 = 0;
                this.field5677 = -1;
                this.field5687 = 0;
                this.field5674 = 0;
                this.field5670 = 0;
            } else {
                this.field5687 = var3.field5930 * 128;
                this.field5674 = var3.field5997;
                this.field5675 = var3.field5938;
                this.field5670 = var3.field5923;
                this.field5677 = var3.field5917;
                this.field5691 = var3.field5999;
            }
        } else if (this.field5671 != null) {
            int var4 = class349.method2116(-105, this.field5671);
            if (var2 != var4) {
                this.field5677 = var4;
                class476 var5 = this.field5671.field1643;
                if (var5.field6694 != null) {
                    var5 = var5.method2812(class75.field909, true);
                }
                if (var5 == null) {
                    this.field5670 = this.field5687 = 0;
                } else {
                    this.field5670 = var5.field6690;
                    this.field5687 = var5.field6721 * 128;
                }
            }
        } else if (this.field5669 != null) {
            this.field5677 = class62.method318(9, this.field5669);
            this.field5687 = this.field5669.field2737 * 128;
            this.field5670 = this.field5669.field2725;
        }
        if (arg0 == 0 && this.field5677 != var2 && this.field5688 != null) {
            class226.field3136.method509(this.field5688);
            this.field5688 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Lab;")
    public static final class256 method2387(int arg0, int arg1) {
        field5673++;
        if (arg1 != -1857167024) {
            field5683 = null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class284.field4130[var2] == null || class284.field4130[var2][var3] == null) {
            boolean var4 = class480.method2837((byte) 96, var2);
            if (!var4) {
                return null;
            }
        }
        return class284.field4130[var2][var3];
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)V")
    public static void method2388(int arg0) {
        field5683 = null;
        if (arg0 == 0) {
            field5692 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lg;I)V")
    public static final void method2389(class470 arg0, int arg1) {
        class199.field2769 = 0;
        field5693++;
        if (arg1 <= 126) {
            field5692 = null;
        }
        class122.field1513 = 0;
        class224.field3110 = new class388();
        class28.field369 = new class59[1024];
        class315.method1945(-29811, arg0);
        class217.method1213(arg0, (byte) -65);
    }
}
