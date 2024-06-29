import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class228 extends class112 {

    @OriginalMember(owner = "client!dn", name = "ab", descriptor = "I")
    private int field3727 = 20;

    @OriginalMember(owner = "client!dn", name = "eb", descriptor = "I")
    private int field3731 = 1365;

    @OriginalMember(owner = "client!dn", name = "cb", descriptor = "I")
    private int field3729 = 0;

    @OriginalMember(owner = "client!dn", name = "fb", descriptor = "I")
    private int field3732 = 0;

    @OriginalMember(owner = "client!dn", name = "L", descriptor = "Lwm;")
    private static class152 field3712 = class157.method1048("Nov", 120);

    @OriginalMember(owner = "client!dn", name = "S", descriptor = "Lwm;")
    private static class152 field3719 = class157.method1048("May", 97);

    @OriginalMember(owner = "client!dn", name = "R", descriptor = "Lwm;")
    private static class152 field3718 = class157.method1048("Aug", 114);

    @OriginalMember(owner = "client!dn", name = "U", descriptor = "Lwm;")
    private static class152 field3721 = class157.method1048("Apr", 107);

    @OriginalMember(owner = "client!dn", name = "X", descriptor = "Lwm;")
    private static class152 field3724 = class157.method1048("Oct", 106);

    @OriginalMember(owner = "client!dn", name = "V", descriptor = "Lwm;")
    private static class152 field3722 = class157.method1048("Jun", 117);

    @OriginalMember(owner = "client!dn", name = "K", descriptor = "Lwm;")
    private static class152 field3711 = class157.method1048("Mar", 100);

    @OriginalMember(owner = "client!dn", name = "N", descriptor = "Lwm;")
    private static class152 field3714 = class157.method1048("Jul", 126);

    @OriginalMember(owner = "client!dn", name = "Z", descriptor = "Lwm;")
    private static class152 field3726 = class157.method1048("Feb", 115);

    @OriginalMember(owner = "client!dn", name = "T", descriptor = "Lwm;")
    private static class152 field3720 = class157.method1048("Jan", 118);

    @OriginalMember(owner = "client!dn", name = "W", descriptor = "Lwm;")
    private static class152 field3723 = class157.method1048("Dec", 123);

    @OriginalMember(owner = "client!dn", name = "db", descriptor = "Lwm;")
    private static class152 field3730 = class157.method1048("Sep", 94);

    @OriginalMember(owner = "client!dn", name = "Q", descriptor = "[Lwm;")
    public static class152[] field3717 = new class152[] { field3720, field3726, field3711, field3721, field3719, field3722, field3714, field3718, field3730, field3724, field3712, field3723 };

    @OriginalMember(owner = "client!dn", name = "P", descriptor = "Lfd;")
    public static class243 field3716 = new class243(64);

    @OriginalMember(owner = "client!dn", name = "hb", descriptor = "[I")
    public static int[] field3734 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!dn", name = "ib", descriptor = "Lwm;")
    public static class152 field3735 = class157.method1048("Lade Wordpack )2 ", 93);

    @OriginalMember(owner = "client!dn", name = "gb", descriptor = "Lne;")
    public static class235 field3733 = new class235(5);

    @OriginalMember(owner = "client!dn", name = "M", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!dn", name = "O", descriptor = "I")
    public static int field3715;

    @OriginalMember(owner = "client!dn", name = "Y", descriptor = "I")
    public static int field3725;

    @OriginalMember(owner = "client!dn", name = "bb", descriptor = "I")
    public static int field3728;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIII)V", line = 10)
    public static final void method1569(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= -95) {
            method1570((byte) 117, -15);
        }
        class238.field3902 = arg4;
        field3713++;
        class110.field1553 = arg2;
        class157.field2505 = arg0;
        class308.field5283 = arg1;
    }

    @OriginalMember(owner = "client!dn", name = "<init>", descriptor = "()V", line = 30)
    public class228() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(BI)V", line = 42)
    public static final void method1570(byte arg0, int arg1) {
        field3725++;
        int var2 = 70 / ((51 - arg0) / 38);
        class303 var3 = class90.method589(false, arg1, 6);
        var3.method2114((byte) 109);
    }

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "(I)V", line = 64)
    public static void method1571(int arg0) {
        if (arg0 != 0) {
            return;
        }
        field3734 = null;
        field3724 = null;
        field3733 = null;
        field3718 = null;
        field3723 = null;
        field3716 = null;
        field3712 = null;
        field3735 = null;
        field3717 = null;
        field3722 = null;
        field3714 = null;
        field3719 = null;
        field3721 = null;
        field3730 = null;
        field3726 = null;
        field3711 = null;
        field3720 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(BI)[I", line = 119)
    public final int[] method53(byte arg0, int arg1) {
        field3715++;
        int[] var3 = this.field1585.method1952(arg1, (byte) 110);
        if (this.field1585.field4935) {
            for (int var4 = 0; var4 < class58.field889; var4++) {
                int var5 = (class131.field1992[var4] << 12) / this.field3731 + this.field3732;
                int var6 = (class114.field1620[arg1] << 12) / this.field3731 + this.field3729;
                int var7 = var5;
                int var8 = var5;
                int var9 = var6;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && this.field3727 > var13) {
                    var10 = (var8 * var10 >> 12) * 2 + var9;
                    var8 = var11 + var7 - var12;
                    var12 = var10 * var10 >> 12;
                    var13++;
                    var11 = var8 * var8 >> 12;
                }
                var3[var4] = var13 < (this.field3727 - 1) ? (var13 << 12) / this.field3727 : 0;
            }
        }
        if (arg0 != -3) {
            this.field3729 = -56;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IILhi;)V", line = 193)
    public final void method52(int arg0, int arg1, class291 arg2) {
        if (arg1 == 0) {
            this.field3731 = arg2.method2021((byte) 74);
        } else if (arg1 == 1) {
            this.field3727 = arg2.method2021((byte) 74);
        } else if (arg1 == 2) {
            this.field3732 = arg2.method2021((byte) 74);
        } else if (arg1 == 3) {
            this.field3729 = arg2.method2021((byte) 74);
        }
        field3728++;
        if (arg0 != 31164) {
            method1570((byte) -96, 79);
        }
    }
}
