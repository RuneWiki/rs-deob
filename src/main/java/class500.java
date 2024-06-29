import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class500 {

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "J")
    public static long field7335 = -1L;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Los;")
    public static class309 field7336 = new class309("Loaded textures", "Texturen geladen.", "Textures chargées", "Texturas carregadas");

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field7333;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lgh;I)Z")
    public static final boolean method3012(class388 arg0, int arg1) {
        if (arg1 != 250) {
            return false;
        }
        field7332++;
        if (class303.field4545 == arg0.field5765) {
            class43.field593 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([Ljava/lang/String;BII[S)V")
    public static final void method3013(String[] arg0, byte arg1, int arg2, int arg3, short[] arg4) {
        field7334++;
        if (arg2 > arg3) {
            int var5 = (arg3 + arg2) / 2;
            int var6 = arg3;
            String var7 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var7;
            short var8 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var8;
            for (int var9 = arg3; var9 < arg2; var9++) {
                if (var7 == null || arg0[var9] != null && arg0[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6] = var10;
                    short var11 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6++] = var11;
                }
            }
            arg0[arg2] = arg0[var6];
            arg0[var6] = var7;
            arg4[arg2] = arg4[var6];
            arg4[var6] = var8;
            method3013(arg0, (byte) -123, var6 - 1, arg3, arg4);
            method3013(arg0, (byte) -124, arg2, var6 + 1, arg4);
        }
        if (arg1 > -100) {
            method3013(null, (byte) -25, 13, -99, null);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static final void method3014(byte arg0) {
        field7333++;
        class199.field3241.method2475((byte) 67);
        if (arg0 > -96) {
            field7335 = -104L;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static void method3015(int arg0) {
        if (arg0 != 0) {
            field7335 = -103L;
        }
        field7336 = null;
    }
}
