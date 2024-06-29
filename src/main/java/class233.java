import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public abstract class class233 extends class309 {

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "I")
    public int field3489;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public int field3490;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public int field3497;

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "I")
    public int field3494;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public int field3491;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public int field3495;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public int field3496;

    @OriginalMember(owner = "client!ds", name = "o", descriptor = "Lvq;")
    public static class24 field3498;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field3493;

    @OriginalMember(owner = "client!ds", name = "p", descriptor = "I")
    public static int field3499;

    @OriginalMember(owner = "client!ds", name = "q", descriptor = "I")
    public static int field3500;

    @OriginalMember(owner = "client!ds", name = "r", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!ds", name = "s", descriptor = "Lhi;")
    public static class365 field3502;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "(B)I")
    public abstract int method16(byte arg0);

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(I)V")
    public final void method33(int arg0) {
        if (arg0 <= 109) {
            method1583((byte) -113);
        }
        field3500++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIIIZFI)[I")
    public static final int[] method1582(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, float arg6, int arg7) {
        field3492++;
        int[] var8 = new int[arg2];
        class227 var9 = new class227();
        var9.field3411 = arg5;
        if (arg1 != 23219) {
            return null;
        }
        var9.field3404 = arg7;
        var9.field3406 = arg4;
        var9.field3405 = arg0;
        var9.field3397 = (int) (arg6 * 4096.0F);
        var9.field3413 = arg3;
        var9.method363(0);
        class131.method879(false, 1, arg2);
        var9.method1552((byte) -1, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(Lfp;Lje;ZIIII)V")
    public final void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        field3499++;
        if (arg5 > -31) {
            this.method32((class9) null, (class309) null, true, 35, -103, 78, 80);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "(B)Z")
    public final boolean method34(byte arg0) {
        field3501++;
        int var2 = -42 % ((arg0 + 19) / 44);
        return false;
    }

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "(B)V")
    public static void method1583(byte arg0) {
        if (arg0 != -93) {
            field3502 = null;
        }
        field3498 = null;
        field3502 = null;
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(IIIIIII)V")
    public class233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field3489 = arg3;
        this.field3490 = arg1;
        this.field3497 = arg0;
        this.field3494 = arg2;
        this.field3491 = arg4;
        this.field3495 = arg5;
        this.field3496 = arg6;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IC)C")
    public static final char method1584(int arg0, char arg1) {
        field3488++;
        return ~arg1 == arg0 || arg1 == 'ƒ' ? arg1 : Character.toTitleCase(arg1);
    }

    static {
        new class409("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field3498 = new class24(96, 5);
    }
}
