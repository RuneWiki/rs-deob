import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!f")
public class class410 extends class259 implements class401 {

    @OriginalMember(owner = "client!f", name = "B", descriptor = "B")
    private byte field6179;

    @OriginalMember(owner = "client!f", name = "A", descriptor = "Z")
    private boolean field6178;

    @OriginalMember(owner = "client!f", name = "M", descriptor = "Z")
    private boolean field6190;

    @OriginalMember(owner = "client!f", name = "v", descriptor = "Z")
    private boolean field6173;

    @OriginalMember(owner = "client!f", name = "u", descriptor = "B")
    private byte field6172;

    @OriginalMember(owner = "client!f", name = "S", descriptor = "S")
    private short field6196;

    @OriginalMember(owner = "client!f", name = "z", descriptor = "Z")
    private boolean field6177;

    @OriginalMember(owner = "client!f", name = "y", descriptor = "Lba;")
    private class502 field6176;

    @OriginalMember(owner = "client!f", name = "w", descriptor = "Lt;")
    private class398 field6174;

    @OriginalMember(owner = "client!f", name = "L", descriptor = "I")
    public static int field6189;

    @OriginalMember(owner = "client!f", name = "T", descriptor = "Luv;")
    public static class2 field6197;

    @OriginalMember(owner = "client!f", name = "V", descriptor = "Lni;")
    public static class521 field6199;

    @OriginalMember(owner = "client!f", name = "t", descriptor = "I")
    public static int field6171;

    @OriginalMember(owner = "client!f", name = "x", descriptor = "I")
    public static int field6175;

    @OriginalMember(owner = "client!f", name = "C", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!f", name = "D", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!f", name = "E", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!f", name = "F", descriptor = "I")
    public static int field6183;

    @OriginalMember(owner = "client!f", name = "G", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!f", name = "H", descriptor = "I")
    public static int field6185;

    @OriginalMember(owner = "client!f", name = "I", descriptor = "I")
    public static int field6186;

    @OriginalMember(owner = "client!f", name = "J", descriptor = "I")
    public static int field6187;

    @OriginalMember(owner = "client!f", name = "K", descriptor = "I")
    public static int field6188;

    @OriginalMember(owner = "client!f", name = "N", descriptor = "I")
    public static int field6191;

    @OriginalMember(owner = "client!f", name = "O", descriptor = "I")
    public static int field6192;

    @OriginalMember(owner = "client!f", name = "P", descriptor = "I")
    public static int field6193;

    @OriginalMember(owner = "client!f", name = "Q", descriptor = "I")
    public static int field6194;

    @OriginalMember(owner = "client!f", name = "R", descriptor = "I")
    public static int field6195;

    @OriginalMember(owner = "client!f", name = "U", descriptor = "Lvi;")
    public static class480 field6198;

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Z)Z")
    public final boolean method232(boolean arg0) {
        ++field6181;
        if (arg0) {
            this.method224((class11) null, -66, 122, -19, (class419) null, -98, true);
        }
        return this.field6177;
    }

    @OriginalMember(owner = "client!f", name = "e", descriptor = "(I)Z")
    public final boolean method230(int arg0) {
        ++field6184;
        if (arg0 != -22611) {
            this.method240(-100);
        }
        return this.field6173;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILya;I)Lt;")
    public final class398 method241(int arg0, class11 arg1, int arg2) {
        int var4 = -97 / ((62 - arg2) / 42);
        ++field6195;
        return this.method2459((byte) 58, arg0, arg1);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(I)I")
    public final int method223(int arg0) {
        ++field6175;
        return arg0 != -19634 ? 45 : this.field6179;
    }

    @OriginalMember(owner = "client!f", name = "f", descriptor = "(I)V")
    public static void method2457(int arg0) {
        field6198 = null;
        field6199 = null;
        if (arg0 != 18253) {
            method2457(85);
        }
        field6197 = null;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lya;IIILqj;IZ)V")
    public final void method224(class11 arg0, int arg1, int arg2, int arg3, class419 arg4, int arg5, boolean arg6) {
        ++field6186;
        if (arg4 instanceof class410) {
            class410 var8 = (class410) arg4;
            if (this.field6174 != null && var8.field6174 != null) {
                this.field6174.method604(var8.field6174, arg2, arg1, arg3, arg6);
            }
        }
        int var9 = -68 % ((24 - arg5) / 62);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(B)I")
    public final int method222(byte arg0) {
        ++field6183;
        return arg0 > -99 ? 49 : 22;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(ILya;II)Z")
    public final boolean method233(int arg0, class11 arg1, int arg2, int arg3) {
        ++field6193;
        class398 var5 = this.method2459((byte) 67, 131072, arg1);
        if (arg2 != 2) {
            this.field6176 = null;
        }
        if (var5 != null) {
            class511 var6 = arg1.method66();
            var6.method1307(super.field3864, super.field3861, super.field3854);
            return var5.method655(arg0, arg3, var6, false);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!f", name = "c", descriptor = "(I)V")
    public final void method239(int arg0) {
        ++field6171;
        this.field6173 = false;
        if (this.field6174 != null) {
            this.field6174.method602(-65537 & this.field6174.method626());
        }
        if (arg0 >= -38) {
            this.method229(false);
        }
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BLya;)V")
    public final void method231(byte arg0, class11 arg1) {
        if (arg0 != 33) {
            this.method240(-121);
        }
        ++field6192;
        Object var3 = null;
        class502 var5;
        if (this.field6176 == null && this.field6177) {
            class126 var4 = this.method2458(3, true, arg1, 262144);
            var5 = var4 != null ? var4.field1897 : null;
        } else {
            var5 = this.field6176;
            this.field6176 = null;
        }
        if (var5 != null) {
            class174.method1197(var5, this.field6172, super.field3864, super.field3854, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Lya;I)Lmo;")
    public final class268 method238(class11 arg0, int arg1) {
        ++field6185;
        if (this.field6174 == null) {
            return null;
        } else {
            if (arg1 != -1) {
                method2457(-11);
            }
            class511 var3 = arg0.method66();
            var3.method1307(super.field3864, super.field3861, super.field3854);
            class268 var4 = null;
            if (this.field6178) {
                var4 = class281.method1757(~arg1, 1);
            }
            this.field6174.method640(var3, var4 != null ? var4.field3992[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(Z)V")
    public final void method229(boolean arg0) {
        if (this.field6174 != null) {
            this.field6174.method624();
        }
        if (arg0) {
            this.method238((class11) null, -114);
        }
        ++field6188;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(IZLya;I)Lro;")
    private final class126 method2458(int arg0, boolean arg1, class11 arg2, int arg3) {
        ++field6191;
        class486 var5 = class119.field1824.method248(this.field6196 & 65535, 30);
        if (arg0 != 3) {
            this.field6172 = -52;
        }
        class337 var6;
        class337 var7;
        if (!this.field6190) {
            if (this.field6172 >= 3) {
                var6 = null;
            } else {
                var6 = class213.field3048[this.field6172 + 1];
            }
            var7 = class213.field3048[this.field6172];
        } else {
            var7 = class420.field6281[this.field6172];
            var6 = class213.field3048[0];
        }
        return var5.method2900(arg3, arg1, super.field3861, this.field6179, super.field3864, arg2, var7, 22, var6, true, super.field3854);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(BILya;)Lt;")
    private final class398 method2459(byte arg0, int arg1, class11 arg2) {
        ++field6194;
        if (this.field6174 != null && ~arg2.method160(this.field6174.method626(), arg1) == -1) {
            return this.field6174;
        } else {
            class126 var4 = this.method2458(3, false, arg2, arg1);
            if (arg0 < 27) {
                this.method238((class11) null, -8);
            }
            return var4 == null ? null : var4.field1903;
        }
    }

    @OriginalMember(owner = "client!f", name = "<init>", descriptor = "(Lya;Lpf;IIIIZIZ)V")
    public class410(class11 arg0, class486 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field7232, arg1.field7180, arg1.field7231);
        super.field3854 = arg5;
        this.field6179 = (byte) arg7;
        this.field6178 = ~arg1.field7230 != -1 && !arg6;
        super.field3864 = arg3;
        this.field6190 = arg6;
        this.field6173 = arg8;
        this.field6172 = (byte) arg2;
        this.field6196 = (short) arg1.field7207;
        this.field6177 = arg0.method77() && arg1.field7152 && !this.field6190 && ~class454.field6661.method509(class113.field1723, -2) != -1;
        int var10 = 2048;
        if (this.field6173) {
            var10 |= 65536;
        }
        class126 var11 = this.method2458(3, this.field6177, arg0, var10);
        if (var11 != null) {
            this.field6176 = var11.field1897;
            this.field6174 = var11.field1903;
            if (this.field6173) {
                this.field6174 = this.field6174.method610((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!f", name = "b", descriptor = "(I)I")
    public final int method240(int arg0) {
        ++field6187;
        if (arg0 != -15578) {
            this.method232(false);
        }
        return this.field6196 & 65535;
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lya;B)V")
    public final void method225(class11 arg0, byte arg1) {
        ++field6180;
        Object var3 = null;
        class502 var5;
        if (this.field6176 == null && this.field6177) {
            class126 var4 = this.method2458(3, true, arg0, 262144);
            var5 = var4 == null ? null : var4.field1897;
        } else {
            var5 = this.field6176;
            this.field6176 = null;
        }
        if (var5 != null) {
            class489.method2918(var5, this.field6172, super.field3864, super.field3854, (boolean[]) null);
        }
        int var6 = 6 % ((42 - arg1) / 36);
    }

    @OriginalMember(owner = "client!f", name = "a", descriptor = "(Lya;I)V")
    public final void method234(class11 arg0, int arg1) {
        if (arg1 != 28007) {
            this.method231((byte) 66, (class11) null);
        }
        ++field6182;
    }

    static {
        new class347("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
        field6189 = 0;
        field6197 = new class2(47, 3);
        field6199 = new class521();
    }
}
