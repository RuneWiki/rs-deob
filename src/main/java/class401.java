import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class401 extends class310 {

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "Les;")
    public class320 field5716;

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "Ldv;")
    public static class566 field5714 = new class566(0, 6);

    @OriginalMember(owner = "client!maa", name = "p", descriptor = "Lej;")
    public static class104 field5721 = new class104("Initialised native registry", "Registry initialisiert", "Registre natif initialisé", "Inicializando registro nativo");

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
    public static int field5711;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
    public static int field5712;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "I")
    public static int field5713;

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!maa", name = "n", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!maa", name = "q", descriptor = "Lbp;")
    public static class323 field5722;

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "Lhv;")
    public static class442 field5717;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "Lha;")
    public static class52 field5715;

    @OriginalMember(owner = "client!maa", name = "o", descriptor = "Lha;")
    public static class52 field5720;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IILpa;ILha;Lmc;II)V")
    public static final void method2397(int arg0, int arg1, class310 arg2, int arg3, class52 arg4, class114 arg5, int arg6, int arg7) {
        field5719++;
        if (arg4 == null) {
            return;
        }
        int var8;
        if (class107.field1653 == 4) {
            var8 = (int) class1.field13 & 0x3FFF;
        } else {
            var8 = (int) class1.field13 + class2.field27 & 0x3FFF;
        }
        int var9 = Math.max(arg5.field1853 / 2, arg5.field1769 / arg7) + 10;
        int var10 = arg1 * arg1 + arg3 * arg3;
        if (var10 > var9 * var9) {
            return;
        }
        int var11 = class1.field2[var8];
        int var12 = class1.field7[var8];
        if (class107.field1653 != 4) {
            var11 = var11 * 256 / (class353.field4779 + 256);
            var12 = var12 * 256 / (class353.field4779 + 256);
        }
        int var13 = arg3 * var11 + (arg1 * var12) >> 15;
        int var14 = arg3 * var12 - arg1 * var11 >> 15;
        arg4.method431(var13 + arg0 + (arg5.field1853 / 2 - arg4.method419() / 2), -var14 + arg5.field1769 / 2 + arg6 + -(arg4.method432() / 2), arg2, arg0, arg6);
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IJ)V")
    public static final void method2398(int arg0, long arg1) {
        field5713++;
        class479.field6754.field165 = 0;
        class479.field6754.method108((byte) -128, class21.field307.field6351);
        class479.field6754.method102(arg1, false);
        class479.field6754.method108((byte) -128, class173.field2491);
        if (arg0 >= 48) {
            class10.field109 = 1;
            class111.field1721 = -3;
            class440.field6262 = 0;
            class208.field2931 = 0;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)V")
    public static void method2399(int arg0) {
        field5715 = null;
        field5717 = null;
        field5720 = null;
        field5721 = null;
        field5714 = null;
        if (arg0 <= 62) {
            field5720 = null;
        }
        field5722 = null;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IBI)Z")
    public static final boolean method2400(int arg0, byte arg1, int arg2) {
        field5718++;
        if (arg1 <= 23) {
            field5714 = null;
        }
        return class524.method3023(arg2, arg0, 1) | (arg0 & 0x70000) != 0 || class376.method2228(16024, arg0, arg2);
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(Lgi;II[B)V")
    public class401(class583 arg0, int arg1, int arg2, byte[] arg3) {
        this.field5716 = class46.method454(6406, arg3, false, arg0, (byte) 116, 6406, arg1, arg2);
        this.field5716.method3666(53, false, false);
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
    public static final void method2401(int arg0) {
        if (arg0 != -28566) {
            method2397(-30, -113, null, 102, null, null, 0, -65);
        }
        class494.field6915.method3246(false);
        field5712++;
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(III)V")
    public static final void method2402(int arg0, int arg1, int arg2) {
        field5711++;
        if (arg0 < 77) {
            method2401(39);
        }
        class314 var3 = class483.method2819(16, arg2, 21303);
        var3.method1959(19793);
        var3.field4227 = arg1;
    }
}
