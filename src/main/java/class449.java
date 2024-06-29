import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class449 extends class184 {

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public int field6629 = 0;

    @OriginalMember(owner = "client!uf", name = "N", descriptor = "I")
    public static int field6655 = -50;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "Lpha;")
    public static class165 field6633 = new class165();

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public int field6632;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public int field6635;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public int field6636;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public int field6637;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public int field6639;

    @OriginalMember(owner = "client!uf", name = "x", descriptor = "I")
    public static int field6640;

    @OriginalMember(owner = "client!uf", name = "y", descriptor = "I")
    public int field6641;

    @OriginalMember(owner = "client!uf", name = "A", descriptor = "I")
    public int field6643;

    @OriginalMember(owner = "client!uf", name = "E", descriptor = "I")
    public int field6647;

    @OriginalMember(owner = "client!uf", name = "F", descriptor = "I")
    public int field6648;

    @OriginalMember(owner = "client!uf", name = "G", descriptor = "I")
    public int field6649;

    @OriginalMember(owner = "client!uf", name = "I", descriptor = "I")
    public int field6650;

    @OriginalMember(owner = "client!uf", name = "J", descriptor = "I")
    public int field6651;

    @OriginalMember(owner = "client!uf", name = "K", descriptor = "I")
    public int field6652;

    @OriginalMember(owner = "client!uf", name = "Q", descriptor = "I")
    public int field6658;

    @OriginalMember(owner = "client!uf", name = "z", descriptor = "Lut;")
    public class125 field6642;

    @OriginalMember(owner = "client!uf", name = "U", descriptor = "Lut;")
    public class125 field6661;

    @OriginalMember(owner = "client!uf", name = "L", descriptor = "Lsu;")
    public class211 field6653;

    @OriginalMember(owner = "client!uf", name = "D", descriptor = "Lkd;")
    public class282 field6646;

    @OriginalMember(owner = "client!uf", name = "W", descriptor = "Lqq;")
    public static class477 field6663;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lcba;")
    public class552 field6631;

    @OriginalMember(owner = "client!uf", name = "C", descriptor = "Lcba;")
    public class552 field6645;

    @OriginalMember(owner = "client!uf", name = "O", descriptor = "Lia;")
    public class591 field6656;

    @OriginalMember(owner = "client!uf", name = "R", descriptor = "Lia;")
    public class591 field6659;

    @OriginalMember(owner = "client!uf", name = "S", descriptor = "Lbs;")
    public class689 field6660;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Z")
    public boolean field6638;

    @OriginalMember(owner = "client!uf", name = "M", descriptor = "Z")
    public boolean field6654;

    @OriginalMember(owner = "client!uf", name = "P", descriptor = "Z")
    public boolean field6657;

    @OriginalMember(owner = "client!uf", name = "B", descriptor = "[I")
    public int[] field6644;

    @OriginalMember(owner = "client!uf", name = "V", descriptor = "[Ltw;")
    public static class203[] field6662;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(B)V", line = 21)
    public static void method2766(byte arg0) {
        int var1 = 39 % ((44 - arg0) / 63);
        field6663 = null;
        field6662 = null;
        field6633 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 43)
    public final void method2767(int arg0) {
        int var2 = 45 / ((52 - arg0) / 52);
        field6630++;
        int var3 = this.field6641;
        boolean var4 = this.field6638;
        if (this.field6653 != null) {
            class211 var5 = this.field6653.method1442((byte) -41, class83.field1160);
            if (var5 == null) {
                this.field6643 = 0;
                this.field6641 = -1;
                this.field6652 = 0;
                this.field6632 = 0;
                this.field6657 = false;
                this.field6638 = false;
                this.field6635 = 256;
                this.field6649 = 256;
                this.field6648 = 0;
                this.field6651 = 0;
                this.field6644 = null;
            } else {
                this.field6641 = var5.field3160;
                this.field6651 = var5.field3155;
                this.field6632 = var5.field3127 << 9;
                this.field6652 = var5.field3156;
                this.field6638 = var5.field3091;
                this.field6635 = var5.field3085;
                this.field6643 = var5.field3171;
                this.field6657 = var5.field3122;
                this.field6649 = var5.field3133;
                this.field6644 = var5.field3148;
            }
        } else if (this.field6646 != null) {
            int var6 = class284.method1819(this.field6646, (byte) 73);
            if (var3 != var6) {
                this.field6641 = var6;
                class348 var7 = this.field6646.field4008;
                if (var7.field5076 != null) {
                    var7 = var7.method2207(123, class83.field1160);
                }
                if (var7 == null) {
                    this.field6649 = 256;
                    this.field6635 = 256;
                    this.field6638 = this.field6646.field4008.field5065;
                    this.field6651 = this.field6632 = this.field6648 = 0;
                } else {
                    this.field6635 = var7.field5047;
                    this.field6651 = var7.field5060;
                    this.field6649 = var7.field5095;
                    this.field6648 = var7.field5085 << 9;
                    this.field6632 = var7.field5090 << 9;
                    this.field6638 = var7.field5065;
                }
            }
        } else if (this.field6660 != null) {
            this.field6641 = class390.method2502(this.field6660, (byte) 96);
            this.field6638 = this.field6660.field9493;
            this.field6632 = this.field6660.field9527 << 9;
            this.field6648 = 0;
            this.field6635 = 256;
            this.field6651 = this.field6660.field9506;
            this.field6649 = 256;
        }
        if (this.field6641 == var3 && this.field6638 == var4) {
            return;
        }
        if (this.field6659 == null) {
            return;
        }
        class171.field2666.method3834(this.field6659);
        this.field6642 = null;
        this.field6631 = null;
        this.field6659 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)Z", line = 160)
    public static final boolean method2768(boolean arg0, int arg1) {
        if (arg0) {
            method2768(true, 46);
        }
        field6634++;
        return arg1 >= 4 && arg1 <= 8;
    }
}
