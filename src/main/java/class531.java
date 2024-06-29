import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class531 {

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public int field7389 = 128;

    @OriginalMember(owner = "client!qn", name = "l", descriptor = "I")
    public int field7400 = 128;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public int field7394;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public int field7396;

    @OriginalMember(owner = "client!qn", name = "j", descriptor = "I")
    public int field7398;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public int field7392;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "Lsv;")
    public static class570 field7391 = new class570(87, 2);

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field7397;

    @OriginalMember(owner = "client!qn", name = "k", descriptor = "I")
    public static int field7399;

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Z")
    public static boolean field7395;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 3)
    public static void method3094(int arg0) {
        field7391 = null;
        if (arg0 != 0) {
            method3095(77, 9, 34, null, -120, true);
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(I)V", line = 74)
    public class531(int arg0) {
        this.field7394 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(IIIIII)V", line = 84)
    private class531(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field7389 = arg2;
        this.field7396 = arg5;
        this.field7398 = arg4;
        this.field7392 = arg3;
        this.field7400 = arg1;
        this.field7394 = arg0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IIILgga;IZ)V", line = 20)
    public static final void method3095(int arg0, int arg1, int arg2, class513 arg3, int arg4, boolean arg5) {
        field7397++;
        int var6 = 28 / ((48 - arg1) / 47);
        class570.method3300(arg0, arg2, 0L, 0, arg4, arg3, arg5);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(B)Lqn;", line = 32)
    public final class531 method3096(byte arg0) {
        field7390++;
        if (arg0 <= 102) {
            this.field7392 = 38;
        }
        return new class531(this.field7394, this.field7400, this.field7389, this.field7392, this.field7398, this.field7396);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(BLqn;)V", line = 45)
    public final void method3097(byte arg0, class531 arg1) {
        this.field7389 = arg1.field7389;
        field7393++;
        this.field7400 = arg1.field7400;
        int var3 = 74 % ((-arg0 - 50) / 49);
        this.field7396 = arg1.field7396;
        this.field7392 = arg1.field7392;
        this.field7394 = arg1.field7394;
        this.field7398 = arg1.field7398;
    }
}
