import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class264 extends class41 {

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public int field4605 = 0;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field4594 = 0;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "Lsc;")
    public static class181 field4602 = class149.method967(255, "rect_debug=");

    @OriginalMember(owner = "client!og", name = "O", descriptor = "[I")
    public static int[] field4603 = new int[64];

    @OriginalMember(owner = "client!og", name = "v", descriptor = "I")
    public static int field4584 = 0;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "[I")
    public static int[] field4607 = new int[] { 12543016, 15504954, 15914854, 16773818 };

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field4591 = 0;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "Z")
    public static boolean field4614 = true;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public int field4587;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "I")
    public int field4588;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public int field4589;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "I")
    public int field4590;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public int field4596;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field4598;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public int field4599;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "I")
    public static int field4601;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field4609;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "I")
    public int field4610;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public int field4611;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public int field4612;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    public static int field4613;

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    public int field4615;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "Led;")
    public class116 field4595;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "Lra;")
    public class148 field4592;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "Ljj;")
    public class154 field4604;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "Ljj;")
    public class154 field4606;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "Lmj;")
    public class178 field4597;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "Ldg;")
    public static class90 field4600;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "Z")
    public boolean field4586;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "[I")
    public int[] field4608;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "[[B")
    public static byte[][] field4585;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public final void method1787(byte arg0) {
        if (arg0 < 74) {
            this.method1787((byte) -86);
        }
        field4593++;
        int var2 = this.field4610;
        if (this.field4592 != null) {
            class148 var3 = this.field4592.method966((byte) -107);
            if (var3 == null) {
                this.field4610 = -1;
                this.field4615 = 0;
                this.field4587 = 0;
                this.field4590 = 0;
                this.field4608 = null;
            } else {
                this.field4590 = var3.field2423 * 128;
                this.field4610 = var3.field2458;
                this.field4608 = var3.field2454;
                this.field4587 = var3.field2442;
                this.field4615 = var3.field2422;
            }
        } else if (this.field4597 != null) {
            int var4 = class19.method176(-1, this.field4597);
            if (var2 != var4) {
                class64 var5 = this.field4597.field3117;
                this.field4610 = var4;
                if (var5.field1050 != null) {
                    var5 = var5.method458((byte) -54);
                }
                if (var5 == null) {
                    this.field4590 = 0;
                } else {
                    this.field4590 = var5.field1014 * 128;
                }
            }
        } else if (this.field4595 != null) {
            this.field4610 = class20.method189(this.field4595, true);
            this.field4590 = this.field4595.field1925 * 128;
        }
        if (this.field4610 != var2 && this.field4606 != null) {
            class90.field1420.method696(this.field4606);
            this.field4606 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)V")
    public static void method1788(int arg0) {
        field4607 = null;
        if (arg0 != 16773818) {
            method1788(-76);
        }
        field4585 = null;
        field4603 = null;
        field4602 = null;
        field4600 = null;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)I")
    public static final int method1789(int arg0, int arg1) {
        int var7 = arg1 - 1;
        field4609++;
        if (arg0 > -7) {
            method1788(123);
        }
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }
}
