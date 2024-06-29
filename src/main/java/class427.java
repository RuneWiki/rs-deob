import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class427 extends class460 {

    @OriginalMember(owner = "client!qe", name = "w", descriptor = "[F")
    public static float[] field5666 = new float[16384];

    @OriginalMember(owner = "client!qe", name = "x", descriptor = "[F")
    public static float[] field5667 = new float[16384];

    @OriginalMember(owner = "client!qe", name = "B", descriptor = "Lida;")
    public static class215 field5671;

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public int field5660;

    @OriginalMember(owner = "client!qe", name = "r", descriptor = "I")
    public int field5661;

    @OriginalMember(owner = "client!qe", name = "s", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!qe", name = "t", descriptor = "I")
    public static int field5663;

    @OriginalMember(owner = "client!qe", name = "u", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!qe", name = "v", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!qe", name = "y", descriptor = "I")
    public int field5668;

    @OriginalMember(owner = "client!qe", name = "A", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!qe", name = "C", descriptor = "I")
    public static int field5672;

    @OriginalMember(owner = "client!qe", name = "z", descriptor = "J")
    public long field5669;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5666[var2] = (float) Math.sin((double) var2 * var0);
            field5667[var2] = (float) Math.cos((double) var2 * var0);
        }
        field5671 = new class215();
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)I", line = 5)
    public final int method784(byte arg0) {
        if (arg0 != 10) {
            this.field5669 = 21L;
        }
        field5664++;
        return 0;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(I)I", line = 18)
    public final int method786(int arg0) {
        field5663++;
        return arg0 == 22461 ? this.field5660 : -126;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)J", line = 31)
    public final long method788(boolean arg0) {
        field5662++;
        return arg0 ? -127L : this.field5669;
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)I", line = 45)
    public final int method787(int arg0) {
        if (arg0 != 4733) {
            method2302(14);
        }
        field5665++;
        return this.field5668;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)I", line = 63)
    public final int method785(int arg0) {
        field5670++;
        return arg0 == -6 ? this.field5661 : -86;
    }

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "(I)V", line = 76)
    public static void method2302(int arg0) {
        field5671 = null;
        if (arg0 != 16384) {
            field5671 = null;
        }
        field5667 = null;
        field5666 = null;
    }
}
