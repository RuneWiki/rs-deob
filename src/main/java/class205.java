import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class205 {

    @OriginalMember(owner = "client!hw", name = "i", descriptor = "Lfr;")
    private class231 field3251 = new class231(256);

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "Lqs;")
    private class496 field3243;

    @OriginalMember(owner = "client!hw", name = "j", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "Z")
    public static boolean field3245;

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!hw", name = "m", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "Lqs;")
    public static class496 field3246;

    @OriginalMember(owner = "client!hw", name = "k", descriptor = "[[B")
    public static byte[][] field3253;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "[[Z")
    public static boolean[][] field3249;

    static {
        new class306("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field3252 = 0;
        field3245 = false;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(BI)V", line = 4)
    public final void method1345(byte arg0, int arg1) {
        class231 var3 = this.field3251;
        synchronized (this.field3251) {
            this.field3251.method1603((byte) -107, arg1);
        }
        field3250++;
        if (arg0 != 81) {
            this.method1346(10, -51);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(II)Lwn;", line = 17)
    public final class392 method1346(int arg0, int arg1) {
        field3255++;
        class231 var3 = this.field3251;
        class392 var4;
        synchronized (this.field3251) {
            var4 = (class392) this.field3251.method1593((byte) -62, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class496 var5 = this.field3243;
        byte[] var6;
        synchronized (this.field3243) {
            var6 = this.field3243.method2926(arg0, -106, 26);
        }
        class392 var7 = new class392();
        if (var6 != null) {
            var7.method2450(new class23(var6), 86);
        }
        class231 var8 = this.field3251;
        synchronized (this.field3251) {
            this.field3251.method1595(var7, (long) arg0, (byte) -95);
        }
        if (arg1 != 0) {
            field3249 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V", line = 58)
    public final void method1347(int arg0) {
        field3254++;
        if (arg0 >= -47) {
            this.field3243 = null;
        }
        class231 var2 = this.field3251;
        synchronized (this.field3251) {
            this.field3251.method1598(97);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 72)
    public final void method1348(byte arg0) {
        field3247++;
        class231 var2 = this.field3251;
        synchronized (this.field3251) {
            int var3 = -27 % ((-arg0 - 34) / 62);
            this.field3251.method1604(4);
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIZII)V", line = 92)
    public static final void method1349(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field3244++;
        int var8 = arg2 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        int var9 = (class466.field6924 - class23.field275) * var8 / 100 + class23.field275;
        int var10 = arg6 * var9 >> 8;
        int var11 = 16384 - arg4 & 0x3FFF;
        int var12 = 16384 - arg7 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        if (!arg5) {
            return;
        }
        int var15 = var10;
        if (var11 != 0) {
            var14 = class46.field757[var11] * -var10 >> 15;
            var15 = class46.field755[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class46.field757[var12] * var15 >> 15;
            var15 = class46.field755[var12] * var15 >> 15;
        }
        class130.field2234 = arg3 - var14;
        class381.field5891 = arg7;
        class64.field950 = 0;
        class48.field764 = arg1 - var15;
        class227.field3927 = arg4;
        class473.field7021 = arg0 - var13;
    }

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "(I)V", line = 150)
    public static void method1350(int arg0) {
        if (arg0 == 20591) {
            field3253 = null;
            field3246 = null;
            field3249 = null;
        }
    }

    @OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lwv;ILqs;)V", line = 165)
    public class205(class535 arg0, int arg1, class496 arg2) {
        this.field3243 = arg2;
        this.field3243.method2940(26, -10511);
    }
}
