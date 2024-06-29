import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public abstract class class567 {

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "[I")
    public static int[] field7832 = new int[14];

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "Lej;")
    public static class104 field7835 = new class104("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field7836 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public static int field7831;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field7833;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(B)V")
    public static final void method3224(byte arg0) {
        field7834++;
        class45.method440(10, -3);
        class371.method2212(-1);
        int var1 = 22 % ((-arg0 - 78) / 41);
        System.gc();
    }

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "(B)V")
    public static void method3225(byte arg0) {
        field7836 = null;
        field7832 = null;
        if (arg0 != -6) {
            method3224((byte) -63);
        }
        field7835 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(FIFFB)F")
    public static final float method3226(float arg0, int arg1, float arg2, float arg3, byte arg4) {
        field7833++;
        int var5 = -22 / ((-arg4 - 82) / 44);
        float[] var6 = class589.field8422[arg1];
        return var6[2] * arg2 + var6[1] * arg3 + var6[0] * arg0;
    }
}
