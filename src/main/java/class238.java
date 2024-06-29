import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kda")
public class class238 {

    @OriginalMember(owner = "client!kda", name = "e", descriptor = "I")
    public int field3478 = 128;

    @OriginalMember(owner = "client!kda", name = "k", descriptor = "I")
    public int field3484 = 128;

    @OriginalMember(owner = "client!kda", name = "g", descriptor = "I")
    public int field3480;

    @OriginalMember(owner = "client!kda", name = "j", descriptor = "I")
    public int field3483;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!kda", name = "f", descriptor = "I")
    public int field3479;

    @OriginalMember(owner = "client!kda", name = "c", descriptor = "Lfo;")
    public static class22 field3476 = new class22(0, 19);

    @OriginalMember(owner = "client!kda", name = "i", descriptor = "Lfo;")
    public static class22 field3482 = new class22(4, 7);

    @OriginalMember(owner = "client!kda", name = "l", descriptor = "Lnj;")
    public static class487 field3485 = new class487("Loading JAGGL - ", "Lade JAGGL - ", "Chargement JAGGL - ", "Carregando JAGGL - ");

    @OriginalMember(owner = "client!kda", name = "m", descriptor = "[I")
    public static int[] field3486 = new int[14];

    @OriginalMember(owner = "client!kda", name = "n", descriptor = "[I")
    public static int[] field3487 = new int[1];

    @OriginalMember(owner = "client!kda", name = "d", descriptor = "F")
    public static float field3477;

    @OriginalMember(owner = "client!kda", name = "b", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!kda", name = "h", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Z)Lkda;", line = 7)
    public final class238 method1530(boolean arg0) {
        if (arg0) {
            this.method1531(null, -15);
        }
        field3481++;
        return new class238(this.field3480, this.field3478, this.field3484, this.field3474, this.field3483, this.field3479);
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(Lkda;I)V", line = 25)
    public final void method1531(class238 arg0, int arg1) {
        if (arg1 >= -24) {
            this.method1530(true);
        }
        this.field3479 = arg0.field3479;
        this.field3484 = arg0.field3484;
        this.field3483 = arg0.field3483;
        this.field3480 = arg0.field3480;
        this.field3474 = arg0.field3474;
        field3475++;
        this.field3478 = arg0.field3478;
    }

    @OriginalMember(owner = "client!kda", name = "a", descriptor = "(I)V", line = 41)
    public static void method1532(int arg0) {
        field3486 = null;
        field3482 = null;
        field3485 = null;
        field3476 = null;
        field3487 = null;
        if (arg0 != 19) {
            field3482 = null;
        }
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(I)V", line = 72)
    public class238(int arg0) {
        this.field3480 = arg0;
    }

    @OriginalMember(owner = "client!kda", name = "<init>", descriptor = "(IIIIII)V", line = 86)
    private class238(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field3480 = arg0;
        this.field3483 = arg4;
        this.field3474 = arg3;
        this.field3484 = arg2;
        this.field3479 = arg5;
        this.field3478 = arg1;
    }
}
