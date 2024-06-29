import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class465 extends class287 {

    @OriginalMember(owner = "client!rg", name = "C", descriptor = "I")
    public int field6712 = 0;

    @OriginalMember(owner = "client!rg", name = "y", descriptor = "Z")
    public boolean field6709 = true;

    @OriginalMember(owner = "client!rg", name = "D", descriptor = "I")
    public int field6713 = -1;

    @OriginalMember(owner = "client!rg", name = "G", descriptor = "I")
    public int field6716 = -1;

    @OriginalMember(owner = "client!rg", name = "H", descriptor = "I")
    public int field6717 = 12800;

    @OriginalMember(owner = "client!rg", name = "q", descriptor = "I")
    public int field6701 = 12800;

    @OriginalMember(owner = "client!rg", name = "L", descriptor = "I")
    public int field6721 = 0;

    @OriginalMember(owner = "client!rg", name = "x", descriptor = "Ljava/lang/String;")
    public String field6708;

    @OriginalMember(owner = "client!rg", name = "J", descriptor = "I")
    public int field6719;

    @OriginalMember(owner = "client!rg", name = "E", descriptor = "I")
    public int field6714;

    @OriginalMember(owner = "client!rg", name = "v", descriptor = "Ljava/lang/String;")
    public String field6706;

    @OriginalMember(owner = "client!rg", name = "r", descriptor = "Lmg;")
    public class530 field6702;

    @OriginalMember(owner = "client!rg", name = "B", descriptor = "I")
    public static int field6711 = 0;

    @OriginalMember(owner = "client!rg", name = "w", descriptor = "Lkc;")
    public static class157 field6707 = new class157("M", "M", "M", "M");

    @OriginalMember(owner = "client!rg", name = "s", descriptor = "I")
    public static int field6703;

    @OriginalMember(owner = "client!rg", name = "t", descriptor = "I")
    public static int field6704;

    @OriginalMember(owner = "client!rg", name = "u", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
    public static int field6710;

    @OriginalMember(owner = "client!rg", name = "F", descriptor = "I")
    public static int field6715;

    @OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
    public static int field6720;

    @OriginalMember(owner = "client!rg", name = "I", descriptor = "Lmk;")
    public static class382 field6718;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "(B)V")
    public final void method2692(byte arg0) {
        this.field6712 = 0;
        field6705++;
        this.field6701 = 12800;
        this.field6717 = 12800;
        this.field6721 = 0;
        for (class32 var2 = (class32) this.field6702.method3137(0); var2 != null; var2 = (class32) this.field6702.method3132(0)) {
            if (this.field6701 > var2.field481) {
                this.field6701 = var2.field481;
            }
            if (var2.field484 > this.field6712) {
                this.field6712 = var2.field484;
            }
            if (this.field6717 > var2.field477) {
                this.field6717 = var2.field477;
            }
            if (var2.field478 > this.field6721) {
                this.field6721 = var2.field478;
            }
        }
        if (arg0 != -90) {
            this.method2695(-62, null, (byte) 71, 49);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[III)Z")
    public final boolean method2693(int arg0, int[] arg1, int arg2, int arg3) {
        field6703++;
        for (class32 var5 = (class32) this.field6702.method3137(arg2); var5 != null; var5 = (class32) this.field6702.method3132(arg2)) {
            if (var5.method235(arg0, arg3, 12124)) {
                var5.method232((byte) -128, arg3, arg0, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Z")
    public final boolean method2694(int arg0, int arg1, int arg2) {
        field6710++;
        if (arg2 != -1) {
            this.field6706 = null;
        }
        for (class32 var4 = (class32) this.field6702.method3137(0); var4 != null; var4 = (class32) this.field6702.method3132(0)) {
            if (var4.method234(arg0, arg1, 13423)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I[IBI)Z")
    public final boolean method2695(int arg0, int[] arg1, byte arg2, int arg3) {
        if (arg2 > -30) {
            method2696(82);
        }
        field6704++;
        for (class32 var5 = (class32) this.field6702.method3137(0); var5 != null; var5 = (class32) this.field6702.method3132(0)) {
            if (var5.method234(arg0, arg3, 13423)) {
                var5.method233(arg0, (byte) -25, arg3, arg1);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "(I)V")
    public static void method2696(int arg0) {
        field6707 = null;
        field6718 = null;
        if (arg0 != 12800) {
            field6711 = -4;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIII[I)Z")
    public final boolean method2697(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field6720++;
        if (arg2 > -73) {
            return true;
        }
        for (class32 var6 = (class32) this.field6702.method3137(0); var6 != null; var6 = (class32) this.field6702.method3132(0)) {
            if (var6.method236(arg0, arg1, (byte) 75, arg3)) {
                var6.method233(arg1, (byte) -25, arg3, arg4);
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!rg", name = "<init>", descriptor = "(ILjava/lang/String;Ljava/lang/String;IIZII)V")
    public class465(int arg0, String arg1, String arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        this.field6713 = arg4;
        this.field6708 = arg1;
        this.field6719 = arg3;
        this.field6714 = arg0;
        this.field6706 = arg2;
        this.field6709 = arg5;
        this.field6716 = arg6;
        if (this.field6716 == 255) {
            this.field6716 = 0;
        }
        this.field6702 = new class530();
    }
}
