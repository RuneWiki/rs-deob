import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fw")
public class class480 {

    @OriginalMember(owner = "client!fw", name = "d", descriptor = "I")
    public static int field7079 = 0;

    @OriginalMember(owner = "client!fw", name = "c", descriptor = "I")
    public static int field7078 = 0;

    @OriginalMember(owner = "client!fw", name = "b", descriptor = "Llo;")
    public static class306 field7077 = new class306("Loaded core fonts", "Schriftarten geladen", "Polices chargées", "Fontes principais carregadas");

    @OriginalMember(owner = "client!fw", name = "e", descriptor = "I")
    public static int field7080 = 0;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "I")
    public static int field7076;

    @OriginalMember(owner = "client!fw", name = "f", descriptor = "Lqs;")
    public static class496 field7081;

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "([IIIBLih;[I)Lib;", line = 8)
    public static final class485 method2826(int[] arg0, int arg1, int arg2, byte arg3, class214 arg4, int[] arg5) {
        field7076++;
        byte[] var6 = new byte[arg1 * arg2];
        int var7 = 0;
        if (arg3 > -25) {
            field7080 = -25;
        }
        while (arg1 > var7) {
            int var8 = arg2 * var7 + arg0[var7];
            for (int var9 = 0; var9 < arg5[var7]; var9++) {
                var6[var8++] = -1;
            }
            var7++;
        }
        return new class485(arg4, arg2, arg1, var6);
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(Z)V", line = 44)
    public static void method2827(boolean arg0) {
        if (arg0) {
            field7077 = null;
            field7081 = null;
        }
    }

    @OriginalMember(owner = "client!fw", name = "a", descriptor = "(IIIII)V", line = 60)
    public static final void method2828(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class526.field7761 != null) {
            class526.field7761[arg0][arg1] = arg2 | 0xFF000000;
        }
        if (class495.field7234 != null) {
            class495.field7234[arg0][arg1] = (short) arg3;
        }
        if (class374.field5819 != null) {
            class374.field5819[arg0][arg1] = (byte) arg4;
        }
    }
}
