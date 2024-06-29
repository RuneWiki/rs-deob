import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class293 extends class259 {

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "[Loa;")
    public class318[] field4621;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "S")
    public static short field4610 = 32767;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field4613 = 0;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "[C")
    public static char[] field4609 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "Z")
    public static boolean field4612 = false;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "Ljava/lang/String;")
    public static String field4617 = "Please remove ";

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "Lvh;")
    public static class62 field4614 = new class62(50);

    @OriginalMember(owner = "client!ui", name = "T", descriptor = "Z")
    public static boolean field4625 = false;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "I")
    public static int field4611;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field4615;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field4616;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "I")
    public static int field4618;

    @OriginalMember(owner = "client!ui", name = "Q", descriptor = "I")
    public static int field4622;

    @OriginalMember(owner = "client!ui", name = "R", descriptor = "I")
    public static int field4623;

    @OriginalMember(owner = "client!ui", name = "S", descriptor = "I")
    public static int field4624;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "Lnk;")
    public static class16 field4619;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "Lkf;")
    public static class249 field4620;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(B)V", line = 6)
    public static final void method2084(byte arg0) {
        field4622++;
        class254 var1 = (class254) class27.field327.method1812(1);
        int var2 = 78 % ((-arg0 - 61) / 49);
        while (var1 != null) {
            if (var1.field4021 == -1) {
                var1.field4028 = 0;
                class32.method225(var1, (byte) 30);
            } else {
                var1.method1290(-26);
            }
            var1 = (class254) class27.field327.method1809(128);
        }
    }

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "(I)V", line = 45)
    public static void method2085(int arg0) {
        field4619 = null;
        field4614 = null;
        field4620 = null;
        if (arg0 < -82) {
            field4617 = null;
            field4609 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)[Lcf;", line = 67)
    public static final class149[] method2086(int arg0) {
        class149[] var1 = new class149[class10.field101];
        if (arg0 != 710) {
            method2085(33);
        }
        field4618++;
        for (int var2 = 0; var2 < class10.field101; var2++) {
            if (class272.field4317) {
                var1[var2] = new class217(class122.field1683, class253.field4004, class110.field1518[var2], class33.field392[var2], class245.field3855[var2], class259.field4093[var2], class14.field145[var2], class251.field3978);
            } else {
                var1[var2] = new class270(class122.field1683, class253.field4004, class110.field1518[var2], class33.field392[var2], class245.field3855[var2], class259.field4093[var2], class14.field145[var2], class251.field3978);
            }
        }
        class99.method627(3735);
        return var1;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(BII)V", line = 94)
    public static final void method2087(byte arg0, int arg1, int arg2) {
        field4615++;
        class279 var3 = class147.method1085(arg2, -19443, 5);
        var3.method1989(0);
        if (arg0 <= -65) {
            var3.field4388 = arg1;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IB)Z", line = 107)
    public final boolean method2088(int arg0, byte arg1) {
        field4616++;
        return arg1 == 39 ? this.field4621[arg0].field4965 : false;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIIZI)V", line = 125)
    public static final void method2089(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field4611++;
        if (class296.method2104((byte) -64, arg2)) {
            class213.method1489(arg1, arg4, class232.field3512[arg2], (byte) -114, arg3, arg0);
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lnk;I)V", line = 137)
    public static final void method2090(class16 arg0, int arg1) {
        field4623++;
        if (arg1 >= 28) {
            class111.field1549 = arg0;
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(II)Z", line = 160)
    public final boolean method2091(int arg0, int arg1) {
        field4608++;
        if (arg0 >= -24) {
            field4625 = true;
        }
        return this.field4621[arg1].field4973;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lnk;Lnk;IZ)V", line = 172)
    public class293(class16 arg0, class16 arg1, int arg2, boolean arg3) {
        class257 var5 = new class257();
        int var6 = arg0.method110(false, arg2);
        this.field4621 = new class318[var6];
        int[] var7 = arg0.method120(arg2, (byte) 95);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method100(arg2, var7[var8], (byte) -107);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class355 var11 = (class355) var5.method1812(1);
            class355 var12 = null;
            while (var11 != null) {
                if (var11.field5645 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class355) var5.method1809(128);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method97(var10, 0, -1);
                } else {
                    var13 = arg1.method97(0, var10, -1);
                }
                var12 = new class355(var10, var13);
                var5.method1814(var12, true);
            }
            this.field4621[var7[var8]] = new class318(var9, var12);
        }
    }
}
