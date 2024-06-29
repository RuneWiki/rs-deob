import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class331 extends class274 {

    @OriginalMember(owner = "client!nm", name = "n", descriptor = "I")
    private int field4501;

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    private int field4509;

    @OriginalMember(owner = "client!nm", name = "o", descriptor = "I")
    private int field4502;

    @OriginalMember(owner = "client!nm", name = "s", descriptor = "Lef;")
    private class338 field4506;

    @OriginalMember(owner = "client!nm", name = "q", descriptor = "I")
    private int field4504;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "I")
    private int field4495;

    @OriginalMember(owner = "client!nm", name = "m", descriptor = "I")
    private int field4500;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field4496 = -50;

    @OriginalMember(owner = "client!nm", name = "p", descriptor = "Ldi;")
    public static class83 field4503 = new class83(75, 4);

    @OriginalMember(owner = "client!nm", name = "u", descriptor = "Lwj;")
    public static class270 field4508 = new class270(95, 8);

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!nm", name = "l", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!nm", name = "r", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!nm", name = "t", descriptor = "I")
    public static int field4507;

    @OriginalMember(owner = "client!nm", name = "k", descriptor = "Lvg;")
    private class39 field4498;

    static {
        new class466("Unable to delete friend - system busy.", "Der Freund konnte nicht entfernt werden, das System ist derzeit ausgelastet.", "Impossible de supprimer un ami - système occupé.", "Não foi possível excluir o amigo. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Lya;IIILjo;I)V", line = 5)
    public static final void method1911(class38 arg0, int arg1, int arg2, int arg3, class220 arg4, int arg5) {
        field4497++;
        class256 var6 = class227.field3232.method2423(arg4.field3093, 64);
        if (var6.field3555 == -1) {
            return;
        }
        int var8;
        if (arg4.field3124) {
            int var7 = arg4.field3112 + arg1;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class16 var9 = var6.method1537(var8, arg0, 6, arg4.field3135);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field3143;
        int var11 = arg4.field3118;
        if (arg2 > -41) {
            method1911(null, 43, 76, 50, null, -117);
        }
        if ((var8 & 0x1) == 1) {
            var10 = arg4.field3118;
            var11 = arg4.field3143;
        }
        int var12 = var9.method84();
        int var13 = var9.method93();
        if (var6.field3564) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (var6.field3557 == 0) {
            var9.method99(arg5, arg3 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method94(arg5, arg3 - (var11 - 1) * 4, var12, var13, 0, var6.field3557 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "(I)V", line = 61)
    public static final void method1912(int arg0) {
        field4499++;
        if (arg0 != -20438) {
            field4496 = 13;
        }
        class239.field3363 = class252.method1510(true, 4, 35, 8, 44, 2048, 8, 0.4F);
    }

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "(I)V", line = 81)
    public static void method1913(int arg0) {
        field4503 = null;
        if (arg0 != -1) {
            field4508 = null;
        }
        field4508 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IB)V", line = 92)
    public static final void method1914(int arg0, byte arg1) {
        field4505++;
        class97 var2 = class348.method2064(arg0, 10, arg1 - 114);
        var2.method710(-9237);
        if (arg1 != 64) {
            field4508 = null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "(I)Lvg;", line = 106)
    public final class39 method1628(int arg0) {
        field4507++;
        if (arg0 < 44) {
            return null;
        }
        if (this.field4498 == null) {
            class76.field1018[0] = this.field4500;
            class76.field1018[5] = this.field4509;
            class76.field1018[4] = this.field4502;
            class76.field1018[2] = this.field4495;
            class277 var2 = this.field4506.field471;
            class76.field1018[3] = this.field4501;
            class76.field1018[1] = this.field4504;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1652(class76.field1018[var5], 29423)) {
                    return null;
                }
                class166 var7 = var2.method1654(11, class76.field1018[var5]);
                int var8 = var7.field2480 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field2496 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class322.field4390[var6] = var2.method1650(var4, class76.field1018[var6], true, 1.0F, false, var4);
            }
            this.field4498 = new class39(this.field4506, 6407, var4, var3, class322.field4390);
        }
        return this.field4498;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lef;IIIIII)V", line = 184)
    public class331(class338 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field4501 = arg4;
        this.field4509 = arg6;
        this.field4502 = arg5;
        this.field4506 = arg0;
        this.field4504 = arg2;
        this.field4495 = arg3;
        this.field4500 = arg1;
    }
}
