import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class433 {

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "I")
    public int field6349;

    @OriginalMember(owner = "client!wa", name = "f", descriptor = "S")
    public static short field6353 = 32767;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "[I")
    public static int[] field6350 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "Lqp;")
    public static class466 field6352 = new class466("wave:", "welle:", "ondulation:", "onda:");

    @OriginalMember(owner = "client!wa", name = "j", descriptor = "Lnj;")
    public static class162 field6357 = new class162(64);

    @OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
    public static int field6358 = -1;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field6351;

    @OriginalMember(owner = "client!wa", name = "g", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!wa", name = "h", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!wa", name = "i", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;)Ljava/lang/String;", line = 4)
    public static final String method2558(String arg0, String arg1, byte arg2, String arg3) {
        field6355++;
        if (arg2 == -19) {
            for (int var4 = arg1.indexOf(arg3); var4 != -1; var4 = arg1.indexOf(arg3, var4 + arg0.length())) {
                arg1 = arg1.substring(0, var4) + arg0 + arg1.substring(var4 + arg3.length());
            }
            return arg1;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wa", name = "toString", descriptor = "()Ljava/lang/String;", line = 31)
    public final String toString() {
        field6356++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V", line = 45)
    public static void method2559(int arg0) {
        if (arg0 != -20876) {
            method2558(null, null, (byte) -60, null);
        }
        field6352 = null;
        field6357 = null;
        field6350 = null;
    }

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(I)I", line = 57)
    public final int method2560(int arg0) {
        if (arg0 != 7) {
            field6352 = null;
        }
        field6351++;
        return this.field6349;
    }

    @OriginalMember(owner = "client!wa", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 79)
    public class433(String arg0, int arg1) {
        this.field6349 = arg1;
    }
}
