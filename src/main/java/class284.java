import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class284 extends class472 {

    @OriginalMember(owner = "client!qm", name = "H", descriptor = "I")
    public int field4431 = 0;

    @OriginalMember(owner = "client!qm", name = "F", descriptor = "[I")
    public static int[] field4429 = new int[1000];

    @OriginalMember(owner = "client!qm", name = "G", descriptor = "Ljp;")
    public static class55 field4430 = new class55(113, -1);

    @OriginalMember(owner = "client!qm", name = "A", descriptor = "I")
    public static int field4426;

    @OriginalMember(owner = "client!qm", name = "C", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!qm", name = "E", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Lfh;B)V")
    public final void method1909(class194 arg0, byte arg1) {
        field4428++;
        while (true) {
            int var3 = arg0.method1337((byte) -114);
            if (var3 == 0) {
                if (arg1 >= -119) {
                    field4430 = null;
                    return;
                } else {
                    return;
                }
            }
            this.method1910(var3, false, arg0);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZLfh;)V")
    private final void method1910(int arg0, boolean arg1, class194 arg2) {
        field4426++;
        if (arg1) {
            this.field4431 = 100;
        }
        if (arg0 == 2) {
            this.field4431 = arg2.method1396(7);
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V")
    public static void method1911(int arg0) {
        field4430 = null;
        field4429 = null;
        int var1 = -42 % ((-arg0 - 64) / 33);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIIII)I")
    public static final int method1912(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4427++;
        int var5 = arg0 & 0xF;
        int var6 = ~var5 > arg2 ? arg3 : arg1;
        int var7 = var5 < 4 ? arg1 : (var5 == 12 || var5 == 14 ? arg3 : arg4);
        return ((var5 & 0x1) == 0 ? var6 : -var6) + ((var5 & 0x2) == 0 ? var7 : -var7);
    }
}
