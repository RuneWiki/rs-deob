import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class673 extends class220 {

    @OriginalMember(owner = "client!mea", name = "p", descriptor = "I")
    public int field9519 = (int) (class18.method109(-11121) / 1000L);

    @OriginalMember(owner = "client!mea", name = "r", descriptor = "Ljava/lang/String;")
    public String field9521;

    @OriginalMember(owner = "client!mea", name = "u", descriptor = "S")
    public short field9524;

    @OriginalMember(owner = "client!mea", name = "m", descriptor = "I")
    public static int field9516 = -1;

    @OriginalMember(owner = "client!mea", name = "t", descriptor = "I")
    public static volatile int field9523 = -1;

    @OriginalMember(owner = "client!mea", name = "o", descriptor = "Lwe;")
    public static class357 field9518 = new class357();

    @OriginalMember(owner = "client!mea", name = "w", descriptor = "I")
    public static int field9526 = 0;

    @OriginalMember(owner = "client!mea", name = "v", descriptor = "Ltm;")
    public static class334 field9525 = new class334(91, 2);

    @OriginalMember(owner = "client!mea", name = "n", descriptor = "I")
    public static int field9517;

    @OriginalMember(owner = "client!mea", name = "q", descriptor = "I")
    public static int field9520;

    @OriginalMember(owner = "client!mea", name = "s", descriptor = "I")
    public static int field9522;

    @OriginalMember(owner = "client!mea", name = "c", descriptor = "(I)I", line = 3)
    public static final int method3757(int arg0) {
        field9520++;
        class544 var1 = class364.field5573;
        boolean var2 = false;
        if (class654.field9289.field5415.method2004(3) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var1 = class405.method2499(null, var3, 0, 0, (byte) -101, null);
            var2 = true;
        }
        long var4 = class18.method109(-11121);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method275(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        int var7 = (int) (class18.method109(-11121) - var4);
        var1.method3183(arg0, 100, -16777216, 0, arg0 ^ 0xFFFFFFEF, 0);
        if (var2) {
            var1.method3190((byte) 114);
        }
        return var7;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Z)V", line = 41)
    public static void method3758(boolean arg0) {
        field9518 = null;
        field9525 = null;
        if (arg0) {
            field9525 = null;
        }
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(BIII)I", line = 52)
    public static final int method3759(byte arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 & 0x3;
        field9517++;
        if (var4 == 0) {
            return arg1;
        } else if (var4 == 1) {
            return arg2;
        } else if (var4 == 2) {
            return 7 - arg1;
        } else {
            int var5 = -81 % ((-arg0 - 84) / 33);
            return 7 - arg2;
        }
    }

    @OriginalMember(owner = "client!mea", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 95)
    public class673(String arg0, int arg1) {
        this.field9521 = arg0;
        this.field9524 = (short) arg1;
    }
}
