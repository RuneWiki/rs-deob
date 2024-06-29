import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class51 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "I")
    public static int field692 = 2;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "Lpb;")
    public static class296 field694 = new class296("", 16);

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "Lpi;")
    public static class340 field697 = new class340(74, 8);

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "I")
    public static int field702 = 1401;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public int field698;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "I")
    public int field700;

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "I")
    public static int field701;

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "I")
    public int field703;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lqa;BIILjt;I)V")
    public static final void method306(class129 arg0, byte arg1, int arg2, int arg3, class402 arg4, int arg5) {
        field695++;
        class451 var6 = class471.field6882.method1562(arg4.field5379, arg1 - 18298);
        if (var6.field6278 == -1) {
            return;
        }
        int var8;
        if (arg4.field5393) {
            int var7 = arg4.field5343 + arg5;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class404 var9 = var6.method2672((byte) 105, var8, arg4.field5411, arg0);
        if (var9 == null) {
            return;
        }
        int var10 = arg4.field5340;
        int var11 = arg4.field5396;
        if ((var8 & 0x1) == 1) {
            var11 = arg4.field5340;
            var10 = arg4.field5396;
        }
        if (arg1 != -1) {
            method306(null, (byte) -101, 27, 29, null, -106);
        }
        int var12 = var9.method370();
        int var13 = var9.method369();
        if (var6.field6280) {
            var13 = var11 * 4;
            var12 = var10 * 4;
        }
        if (var6.field6273 == 0) {
            var9.method2407(arg2, -(var11 * 4) - (-arg3 - 4), var12, var13);
        } else {
            var9.method356(arg2, 4 - (var11 * 4 - arg3), var12, var13, 0, var6.field6273 | 0xFF000000, 1);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public static void method307(boolean arg0) {
        if (arg0) {
            field699 = -89;
        }
        field697 = null;
        field694 = null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lbt;II)V")
    private final void method308(class88 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field700 = arg0.method568((byte) 110);
            this.field698 = arg0.method617(2);
            this.field703 = arg0.method617(2);
        }
        field696++;
        if (arg1 != -4) {
            field697 = null;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZLbt;)V")
    public final void method309(boolean arg0, class88 arg1) {
        field693++;
        if (!arg0) {
            return;
        }
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                return;
            }
            this.method308(arg1, -4, var3);
        }
    }
}
