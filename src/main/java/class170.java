import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class170 extends class45 {

    @OriginalMember(owner = "client!kf", name = "D", descriptor = "I")
    public int field2708 = 0;

    @OriginalMember(owner = "client!kf", name = "o", descriptor = "I")
    public static int field2694 = 0;

    @OriginalMember(owner = "client!kf", name = "r", descriptor = "Z")
    public static boolean field2697 = false;

    @OriginalMember(owner = "client!kf", name = "p", descriptor = "I")
    public int field2695;

    @OriginalMember(owner = "client!kf", name = "q", descriptor = "I")
    public int field2696;

    @OriginalMember(owner = "client!kf", name = "x", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!kf", name = "y", descriptor = "I")
    public int field2704;

    @OriginalMember(owner = "client!kf", name = "z", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!kf", name = "C", descriptor = "I")
    public int field2707;

    @OriginalMember(owner = "client!kf", name = "E", descriptor = "I")
    public int field2709;

    @OriginalMember(owner = "client!kf", name = "F", descriptor = "I")
    public int field2710;

    @OriginalMember(owner = "client!kf", name = "G", descriptor = "I")
    public int field2711;

    @OriginalMember(owner = "client!kf", name = "H", descriptor = "I")
    public int field2712;

    @OriginalMember(owner = "client!kf", name = "J", descriptor = "I")
    public int field2714;

    @OriginalMember(owner = "client!kf", name = "L", descriptor = "I")
    public int field2716;

    @OriginalMember(owner = "client!kf", name = "s", descriptor = "Luk;")
    public class139 field2698;

    @OriginalMember(owner = "client!kf", name = "I", descriptor = "Luk;")
    public class139 field2713;

    @OriginalMember(owner = "client!kf", name = "K", descriptor = "Ljh;")
    public class258 field2715;

    @OriginalMember(owner = "client!kf", name = "A", descriptor = "Lfc;")
    public class288 field2706;

    @OriginalMember(owner = "client!kf", name = "u", descriptor = "Lkc;")
    public class29 field2700;

    @OriginalMember(owner = "client!kf", name = "w", descriptor = "Lth;")
    public static class57 field2702;

    @OriginalMember(owner = "client!kf", name = "v", descriptor = "Z")
    public boolean field2701;

    @OriginalMember(owner = "client!kf", name = "t", descriptor = "[I")
    public int[] field2699;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(B)V", line = 5)
    public static void method1320(byte arg0) {
        if (arg0 == -25) {
            field2702 = null;
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Z)V", line = 25)
    public final void method1321(boolean arg0) {
        field2703++;
        int var2 = this.field2714;
        if (this.field2700 != null) {
            class29 var5 = this.field2700.method177(5000);
            if (var5 == null) {
                this.field2712 = 0;
                this.field2704 = 0;
                this.field2699 = null;
                this.field2696 = 0;
                this.field2709 = 0;
                this.field2714 = -1;
            } else {
                this.field2696 = var5.field334;
                this.field2699 = var5.field406;
                this.field2704 = var5.field386 * 128;
                this.field2712 = var5.field352;
                this.field2714 = var5.field404;
                this.field2709 = var5.field385;
            }
        } else if (this.field2706 != null) {
            int var3 = class123.method967((byte) -45, this.field2706);
            if (var2 != var3) {
                this.field2714 = var3;
                class121 var4 = this.field2706.field4692;
                if (var4.field2066 != null) {
                    var4 = var4.method958((byte) -115);
                }
                if (var4 == null) {
                    this.field2696 = this.field2704 = 0;
                } else {
                    this.field2704 = var4.field2027 * 128;
                    this.field2696 = var4.field2075;
                }
            }
        } else if (this.field2715 != null) {
            this.field2714 = class239.method1822(this.field2715, -68);
            this.field2696 = this.field2715.field4352;
            this.field2704 = this.field2715.field4351 * 128;
        }
        if (this.field2714 != var2 && this.field2713 != null) {
            class245.field4030.method2163(this.field2713);
            this.field2713 = null;
        }
        if (!arg0) {
            this.field2712 = -90;
        }
    }
}
