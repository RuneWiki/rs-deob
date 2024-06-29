import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class647 extends class496 {

    @OriginalMember(owner = "client!tba", name = "m", descriptor = "Ljava/lang/String;")
    public String field9387;

    @OriginalMember(owner = "client!tba", name = "i", descriptor = "I")
    public static int field9383 = 0;

    @OriginalMember(owner = "client!tba", name = "n", descriptor = "[I")
    public static int[] field9388 = new int[25];

    @OriginalMember(owner = "client!tba", name = "j", descriptor = "[Ljava/awt/Color;")
    public static Color[] field9384 = new Color[] { new Color(16777215), new Color(16777215) };

    @OriginalMember(owner = "client!tba", name = "k", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!tba", name = "l", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!tba", name = "o", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(IB)Z")
    public static final boolean method3732(int arg0, byte arg1) {
        field9386++;
        if (arg0 == 60 || arg0 == 3 || arg0 == 22 || arg0 == 50 || arg0 == 4) {
            return true;
        } else if (arg0 == 17 || arg0 == 1002) {
            return true;
        } else {
            return arg1 != -80;
        }
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(III)I")
    public static final int method3733(int arg0, int arg1, int arg2) {
        if (arg1 < arg2) {
            int var3 = arg1;
            arg1 = arg2;
            arg2 = var3;
        }
        field9385++;
        if (arg0 >= -113) {
            method3733(73, 19, -50);
        }
        while (arg2 != 0) {
            int var4 = arg1 % arg2;
            arg1 = arg2;
            arg2 = var4;
        }
        return arg1;
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(I)V")
    public static void method3734(int arg0) {
        field9384 = null;
        if (arg0 != 22) {
            method3732(15, (byte) 114);
        }
        field9388 = null;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "()V")
    public class647() {
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(BII)Z")
    public static final boolean method3735(byte arg0, int arg1, int arg2) {
        field9389++;
        if (arg0 != -111) {
            field9383 = -92;
        }
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class647(String arg0) {
        this.field9387 = arg0;
    }
}
