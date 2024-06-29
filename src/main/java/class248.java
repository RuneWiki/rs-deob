import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class248 extends class71 {

    @OriginalMember(owner = "client!au", name = "l", descriptor = "S")
    public short field3646;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "F")
    public static float field3644 = 1.0F;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "Lst;")
    public static class335 field3648 = new class335(29, 3);

    @OriginalMember(owner = "client!au", name = "q", descriptor = "[I")
    public static int[] field3651 = new int[2048];

    @OriginalMember(owner = "client!au", name = "k", descriptor = "I")
    public static int field3645;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    public static int field3647;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "Loo;")
    public static class649 field3649;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "([BBZ)V", line = 4)
    public static final void method1706(byte[] arg0, byte arg1, boolean arg2) {
        if (class709.field9895 == null) {
            class709.field9895 = new class63(20000);
        }
        field3647++;
        class709.field9895.method497(arg0, arg0.length, 0, -1);
        if (arg2) {
            class494.method2987(class709.field9895.field954, 20832);
            class462.field6425 = new class370[class451.field6255];
            int var3 = 0;
            for (int var4 = class650.field8719; var4 <= class15.field147; var4++) {
                class370 var5 = class76.method568(var4, arg1 ^ 0xFFFFFFCE);
                if (var5 != null) {
                    class462.field6425[var3++] = var5;
                }
            }
            class728.field10123 = false;
            class754.field10379 = class97.method664((byte) -50);
            class709.field9895 = null;
        }
        if (arg1 != -49) {
            field3649 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(III)Z", line = 46)
    public static final boolean method1707(int arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            field3645++;
            return (arg2 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(B)V", line = 57)
    public static void method1708(byte arg0) {
        field3649 = null;
        field3651 = null;
        if (arg0 != -51) {
            method1708((byte) -13);
        }
        field3648 = null;
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V", line = 75)
    public class248() {
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(S)V", line = 79)
    public class248(short arg0) {
        this.field3646 = arg0;
    }
}
