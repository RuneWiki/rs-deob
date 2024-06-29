import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public abstract class class512 extends class276 {

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "Z")
    public boolean field7491;

    @OriginalMember(owner = "client!pj", name = "r", descriptor = "[Lpj;")
    public class512[] field7493;

    @OriginalMember(owner = "client!pj", name = "B", descriptor = "Llo;")
    public static class306 field7503 = new class306("You can't add yourself to your own friends list.", "Du kannst dich nicht auf deine eigene Freunde-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste d'amis.", "Você não pode adicionar a si próprio à sua lista de amigos.");

    @OriginalMember(owner = "client!pj", name = "D", descriptor = "Lfr;")
    public static class231 field7505 = new class231(64);

    @OriginalMember(owner = "client!pj", name = "E", descriptor = "[I")
    public static int[] field7506 = new int[1];

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field7490;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!pj", name = "t", descriptor = "I")
    public int field7495;

    @OriginalMember(owner = "client!pj", name = "v", descriptor = "I")
    public static int field7497;

    @OriginalMember(owner = "client!pj", name = "w", descriptor = "I")
    public static int field7498;

    @OriginalMember(owner = "client!pj", name = "x", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!pj", name = "y", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!pj", name = "z", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!pj", name = "A", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!pj", name = "C", descriptor = "I")
    public static int field7504;

    @OriginalMember(owner = "client!pj", name = "s", descriptor = "Lsc;")
    public class29 field7494;

    @OriginalMember(owner = "client!pj", name = "u", descriptor = "Lji;")
    public class467 field7496;

    @OriginalMember(owner = "client!pj", name = "F", descriptor = "[I")
    public static int[] field7507;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method3011(int arg0) {
        field7503 = null;
        field7505 = null;
        field7506 = null;
        field7507 = null;
        if (arg0 != 1) {
            field7507 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(II)[[I")
    public int[][] method278(int arg0, int arg1) {
        int var3 = 112 % ((-arg0 - 40) / 47);
        field7498++;
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IB)[I")
    public int[] method75(int arg0, byte arg1) {
        int var3 = -38 / ((arg1 - 43) / 48);
        field7492++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(I)I")
    public int method2457(int arg0) {
        field7502++;
        return arg0 == -1 ? -1 : 115;
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(I)V")
    public void method74(int arg0) {
        field7501++;
        if (arg0 != 12388) {
            this.field7491 = true;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BII)V")
    public void method2262(byte arg0, int arg1, int arg2) {
        field7500++;
        int var4 = this.field7495 == 255 ? arg2 : this.field7495;
        if (arg0 != -89) {
            this.method75(-60, (byte) 70);
        }
        if (this.field7491) {
            this.field7494 = new class29(var4, arg2, arg1);
        } else {
            this.field7496 = new class467(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(III)[[I")
    public final int[][] method3012(int arg0, int arg1, int arg2) {
        field7497++;
        if (arg1 < 58) {
            field7505 = null;
        }
        if (this.field7493[arg2].field7491) {
            int[] var4 = this.field7493[arg2].method75(arg0, (byte) -13);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field7493[arg2].method278(-109, arg0);
        }
    }

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "(I)V")
    public void method2260(int arg0) {
        if (this.field7491) {
            this.field7494.method230(false);
            this.field7494 = null;
        } else {
            this.field7496.method2776(arg0 ^ 0x3B);
            this.field7496 = null;
        }
        field7504++;
        if (arg0 != 2) {
            this.field7496 = null;
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZII)[I")
    public final int[] method3013(boolean arg0, int arg1, int arg2) {
        field7489++;
        if (arg0) {
            return null;
        } else if (this.field7493[arg1].field7491) {
            return this.field7493[arg1].method75(arg2, (byte) 110);
        } else {
            return this.field7493[arg1].method278(-127, arg2)[0];
        }
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZILia;)V")
    public void method71(boolean arg0, int arg1, class23 arg2) {
        if (arg0) {
            field7490++;
        }
    }

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "(B)I")
    public int method2259(byte arg0) {
        if (arg0 < 0) {
            field7505 = null;
        }
        field7499++;
        return -1;
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "(IZ)V")
    public class512(int arg0, boolean arg1) {
        this.field7491 = arg1;
        this.field7493 = new class512[arg0];
    }
}
