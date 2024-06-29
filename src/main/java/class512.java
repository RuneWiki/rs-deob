import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class512 {

    @OriginalMember(owner = "client!qd", name = "i", descriptor = "I")
    public int field7216 = 1;

    @OriginalMember(owner = "client!qd", name = "h", descriptor = "I")
    public int field7215 = 64;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public int field7208 = 64;

    @OriginalMember(owner = "client!qd", name = "k", descriptor = "Z")
    public boolean field7218 = false;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "I")
    public int field7211 = -1;

    @OriginalMember(owner = "client!qd", name = "l", descriptor = "I")
    public int field7219 = 2;

    @OriginalMember(owner = "client!qd", name = "m", descriptor = "Z")
    public boolean field7220 = false;

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "Z")
    public static boolean field7212 = true;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "[I")
    public static int[] field7210 = new int[13];

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "I")
    public static int field7209;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "I")
    public static int field7213;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "I")
    public static int field7214;

    @OriginalMember(owner = "client!qd", name = "n", descriptor = "I")
    public static int field7221;

    @OriginalMember(owner = "client!qd", name = "j", descriptor = "Z")
    public static boolean field7217;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IIIB)Z")
    public static final boolean method2897(int arg0, int arg1, int arg2, byte arg3) {
        class311.field4577.method892(arg0, arg2, arg1, class520.field7297);
        field7209++;
        int var4 = class520.field7297[2];
        if (arg3 != 68) {
            method2901(-45);
        }
        if (var4 < 50) {
            return false;
        } else {
            class520.field7297[0] = class520.field7297[0] * class443.field6437 / var4 + class542.field8028;
            class520.field7297[2] = var4;
            class520.field7297[1] = class520.field7297[1] * class111.field1636 / var4 + class205.field2803;
            return true;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ZI)V")
    public static final void method2898(boolean arg0, int arg1) {
        field7221++;
        if (class362.field5322.length() == 0) {
            return;
        }
        class600.method3415("--> " + class362.field5322, true);
        class640.method3648(false, arg0, class362.field5322, -89);
        class576.field8374 = 0;
        class569.field8287 = arg1;
        class362.field5322 = "";
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IILgk;)V")
    public final void method2899(int arg0, int arg1, class540 arg2) {
        field7214++;
        while (true) {
            int var4 = arg2.method3115(29871);
            if (var4 == 0) {
                int var5 = -41 % ((arg1 - 21) / 62);
                return;
            }
            this.method2900(-127, arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILgk;II)V")
    private final void method2900(int arg0, class540 arg1, int arg2, int arg3) {
        int var5 = -126 % ((arg0 + 68) / 54);
        field7213++;
        if (arg3 == 1) {
            this.field7211 = arg1.method3169(26488);
            if (this.field7211 == 65535) {
                this.field7211 = -1;
                return;
            }
        } else if (arg3 == 2) {
            this.field7215 = arg1.method3169(26488) + 1;
            this.field7208 = arg1.method3169(26488) + 1;
            return;
        } else if (arg3 == 3) {
            arg1.method3128(32767);
        } else if (arg3 == 4) {
            this.field7219 = arg1.method3115(29871);
            return;
        } else if (arg3 == 5) {
            this.field7216 = arg1.method3115(29871);
            return;
        } else if (arg3 == 6) {
            this.field7220 = true;
            return;
        } else if (arg3 == 7) {
            this.field7218 = true;
            return;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method2901(int arg0) {
        if (arg0 > 21) {
            field7210 = null;
        }
    }
}
