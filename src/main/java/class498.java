import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class498 {

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public int field7018 = 128;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public int field7021 = 128;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public int field7013;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "I")
    public int field7012;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "I")
    public int field7008;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public int field7022;

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "I")
    public static int field7010 = 0;

    @OriginalMember(owner = "client!mi", name = "i", descriptor = "Lkg;")
    public static class275 field7014 = new class275(121, 3);

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "Z")
    public static boolean field7020 = true;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "I")
    public static int field7006;

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "I")
    public int field7007;

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "I")
    public int field7009;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!mi", name = "j", descriptor = "I")
    public int field7015;

    @OriginalMember(owner = "client!mi", name = "k", descriptor = "I")
    public int field7016;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    public int field7017;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "[[I")
    public static int[][] field7019;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(Z)Lmi;")
    public final class498 method2910(boolean arg0) {
        if (arg0) {
            field7006++;
            return new class498(this.field7013, this.field7018, this.field7021, this.field7012, this.field7008, this.field7022);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)V")
    public static void method2911(byte arg0) {
        if (arg0 != -104) {
            method2911((byte) -52);
        }
        field7019 = null;
        field7014 = null;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILmi;)V")
    public final void method2912(int arg0, class498 arg1) {
        this.field7018 = arg1.field7018;
        this.field7022 = arg1.field7022;
        if (arg0 < 85) {
            this.method2912(-55, null);
        }
        this.field7021 = arg1.field7021;
        field7011++;
        this.field7013 = arg1.field7013;
        this.field7008 = arg1.field7008;
        this.field7012 = arg1.field7012;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(I)V")
    public class498(int arg0) {
        this.field7013 = arg0;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(IIIIII)V")
    private class498(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7012 = arg3;
        this.field7008 = arg4;
        this.field7013 = arg0;
        this.field7021 = arg2;
        this.field7018 = arg1;
        this.field7022 = arg5;
    }
}
