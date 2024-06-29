import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public abstract class class73 {

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "I")
    public int field1101;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "Lss;")
    public static class213 field1103 = new class213("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!so", name = "i", descriptor = "Lss;")
    public static class213 field1104 = new class213("Loaded interface scripts", "Interface-Skripte geladen", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!so", name = "l", descriptor = "[Lnb;")
    public static class249[] field1107 = new class249[14];

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field1099;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!so", name = "k", descriptor = "Lmn;")
    public static class162 field1106;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "Lkn;")
    public static class239 field1105;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIB)V")
    public abstract void method532(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static void method533(int arg0) {
        field1106 = null;
        if (arg0 != 6046) {
            method533(-52);
        }
        field1103 = null;
        field1107 = null;
        field1104 = null;
        field1105 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLmn;II)Lfc;")
    public static final class438 method534(boolean arg0, class162 arg1, int arg2, int arg3) {
        field1099++;
        byte[] var4 = arg1.method1004(arg2, arg0, arg3);
        return var4 == null ? null : new class438(var4);
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lna;IIBII)Lme;")
    public static final class508 method535(class211 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field1100++;
        if (arg3 != -15) {
            method534(true, null, -90, -127);
        }
        if (!arg0.field3618 && (!class357.method2363(-62, arg5) || !class357.method2363(-46, arg4))) {
            return arg0.field3549 ? new class508(arg0, 34037, arg1, arg2, arg5, arg4, true) : new class508(arg0, arg1, arg2, arg5, arg4, class123.method774(-95, arg5), class123.method774(arg3 - 54, arg4), true);
        } else {
            return new class508(arg0, 3553, arg1, arg2, arg5, arg4, true);
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIBI)I")
    public static final int method536(int arg0, int arg1, byte arg2, int arg3) {
        field1097++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg3;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else if (arg2 <= 1) {
            return 107;
        } else {
            return 7 - arg3;
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(IIB)V")
    public abstract void method537(int arg0, int arg1, byte arg2);

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IZI)V")
    public abstract void method538(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(III)V")
    public class73(int arg0, int arg1, int arg2) {
        this.field1098 = arg1;
        this.field1096 = arg0;
        this.field1101 = arg2;
    }
}
