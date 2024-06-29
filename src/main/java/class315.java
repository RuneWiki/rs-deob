import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class315 extends class540 {

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public int field4706 = 0;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public int field4679;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field4680;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public int field4682;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "I")
    public int field4689;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public int field4692;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public int field4694;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "I")
    public static int field4696;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public int field4697;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public int field4698;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public int field4700;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public int field4701;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public int field4704;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    public static int field4708;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public int field4709;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public int field4710;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "Lct;")
    public class154 field4678;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "Lct;")
    public class154 field4688;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Lvp;")
    public class198 field4695;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Lvp;")
    public class198 field4699;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "Ldja;")
    public class322 field4681;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "Lbc;")
    public class383 field4703;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "Lbc;")
    public class383 field4707;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Lts;")
    public class559 field4693;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "Lkia;")
    public class645 field4685;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "Z")
    public boolean field4686;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "Z")
    public boolean field4691;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "Z")
    public boolean field4702;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "[I")
    public int[] field4684;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V")
    public final void method2068(byte arg0) {
        field4680++;
        if (arg0 >= -71) {
            return;
        }
        int var2 = this.field4679;
        boolean var3 = this.field4702;
        if (this.field4681 != null) {
            class322 var6 = this.field4681.method2099(class271.field3796, -119);
            if (var6 == null) {
                this.field4689 = 256;
                this.field4682 = 0;
                this.field4710 = 0;
                this.field4701 = 0;
                this.field4702 = false;
                this.field4679 = -1;
                this.field4697 = 0;
                this.field4692 = 0;
                this.field4691 = false;
                this.field4687 = 256;
                this.field4684 = null;
            } else {
                this.field4710 = var6.field4758;
                this.field4679 = var6.field4818;
                this.field4684 = var6.field4819;
                this.field4689 = var6.field4775;
                this.field4701 = var6.field4771 << 9;
                this.field4692 = var6.field4815;
                this.field4691 = var6.field4764;
                this.field4687 = var6.field4812;
                this.field4702 = var6.field4808;
                this.field4697 = var6.field4743;
            }
        } else if (this.field4685 != null) {
            int var4 = class241.method1640(this.field4685, 0);
            if (var2 != var4) {
                this.field4679 = var4;
                class279 var5 = this.field4685.field9071;
                if (var5.field3943 != null) {
                    var5 = var5.method1810((byte) 81, class271.field3796);
                }
                if (var5 == null) {
                    this.field4692 = this.field4701 = this.field4682 = 0;
                    this.field4702 = this.field4685.field9071.field3879;
                    this.field4689 = 256;
                    this.field4687 = 256;
                } else {
                    this.field4689 = var5.field3924;
                    this.field4682 = var5.field3923 << 9;
                    this.field4702 = var5.field3879;
                    this.field4687 = var5.field3880;
                    this.field4692 = var5.field3913;
                    this.field4701 = var5.field3876 << 9;
                }
            }
        } else if (this.field4693 != null) {
            this.field4679 = class541.method3120(this.field4693, -1);
            this.field4687 = 256;
            this.field4682 = 0;
            this.field4689 = 256;
            this.field4701 = this.field4693.field7977 << 9;
            this.field4692 = this.field4693.field7939;
            this.field4702 = this.field4693.field7957;
        }
        if (this.field4679 == var2 && this.field4702 == var3) {
            return;
        }
        if (this.field4688 == null) {
            return;
        }
        class229.field3307.method3439(this.field4688);
        this.field4695 = null;
        this.field4688 = null;
        this.field4707 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)Z")
    public static final boolean method2069(int arg0, int arg1) {
        if (arg1 == 17744) {
            field4696++;
            return arg0 >= 12 && arg0 <= 17;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Z")
    public static final boolean method2070(int arg0) {
        if (arg0 == -21415) {
            field4708++;
            return class179.field2711;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)Z")
    public static final boolean method2071(int arg0, int arg1) {
        if (arg0 >= -125) {
            return true;
        } else {
            field4705++;
            return (arg1 & -arg1) == arg1;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V")
    public static final void method2072(int arg0) {
        int var1 = -32 % ((76 - arg0) / 35);
        if (class380.field5449 != null) {
            class613[] var2 = class380.field5449;
            for (int var3 = 0; var3 < var2.length; var3++) {
                class613 var4 = var2[var3];
                var4.method1541(-67);
            }
        }
        field4690++;
    }
}
