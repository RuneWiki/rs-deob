import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class423 {

    @OriginalMember(owner = "client!et", name = "a", descriptor = "I")
    public int field6152 = 1;

    @OriginalMember(owner = "client!et", name = "d", descriptor = "I")
    public static int field6155 = 0;

    @OriginalMember(owner = "client!et", name = "c", descriptor = "C")
    public char field6154;

    @OriginalMember(owner = "client!et", name = "b", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!et", name = "e", descriptor = "I")
    public static int field6156;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "I")
    public static int field6157;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public static final void method2609(int arg0) {
        class12.field127 = arg0;
        for (int var1 = 0; var1 < class515.field7487; var1++) {
            for (int var2 = 0; var2 < class114.field1494; var2++) {
                if (class186.field2421[arg0][var1][var2] == null) {
                    class186.field2421[arg0][var1][var2] = new class498(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lug;I)V")
    public final void method2610(class396 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2388((byte) -117);
            if (var3 == 0) {
                field6156++;
                if (arg1 < 46) {
                    this.method2611((byte) 16, null, -2);
                    return;
                }
                return;
            }
            this.method2611((byte) -99, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(BLug;I)V")
    private final void method2611(byte arg0, class396 arg1, int arg2) {
        if (arg0 != -99) {
            return;
        }
        if (arg2 == 1) {
            this.field6154 = class42.method246(0, arg1.method2418(-54));
        } else if (arg2 == 2) {
            this.field6152 = 0;
        }
        field6153++;
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
    public static final int method2612(int arg0) {
        if (arg0 != 2) {
            return -40;
        }
        field6157++;
        if (class119.field1559 == null) {
            return class507.field7351 ? 2 : 1;
        } else {
            return 3;
        }
    }
}
