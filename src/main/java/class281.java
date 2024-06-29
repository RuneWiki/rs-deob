import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class281 {

    @OriginalMember(owner = "client!av", name = "d", descriptor = "S")
    public short field4028;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "Z")
    public boolean field4025;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "S")
    public short field4033;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public int field4035;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "B")
    public byte field4030;

    @OriginalMember(owner = "client!av", name = "b", descriptor = "B")
    public byte field4026;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public int field4031;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "S")
    public short field4034;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "[F")
    public static float[] field4032 = new float[16384];

    @OriginalMember(owner = "client!av", name = "e", descriptor = "[F")
    public static float[] field4029 = new float[16384];

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Ljn;")
    public static class134 field4037;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Lkea;")
    public static class611 field4027;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field4032[var2] = (float) Math.sin((double) var2 * var0);
            field4029[var2] = (float) Math.cos((double) var2 * var0);
        }
        field4037 = new class134(59, 5);
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 13)
    public static void method1831(int arg0) {
        field4037 = null;
        field4027 = null;
        if (arg0 != 5) {
            field4036 = 90;
        }
        field4029 = null;
        field4032 = null;
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(IIIIIIIIIZI)V", line = 51)
    public class281(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        this.field4028 = (short) arg6;
        this.field4025 = arg9;
        this.field4033 = (short) arg5;
        this.field4035 = arg0;
        this.field4030 = (byte) arg7;
        this.field4026 = (byte) arg8;
        this.field4031 = arg10;
        this.field4034 = (short) arg4;
    }
}
