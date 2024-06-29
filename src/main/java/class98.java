import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class98 extends class89 {

    @OriginalMember(owner = "client!ct", name = "v", descriptor = "I")
    public int field1194 = 0;

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "I")
    public static int field1192 = 0;

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "Lkg;")
    public static class179 field1191 = new class179(73, 3);

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field1190;

    @OriginalMember(owner = "client!ct", name = "u", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!ct", name = "w", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!ct", name = "x", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I)V")
    public static final void method738(int arg0) {
        if (arg0 == -24837) {
            field1190++;
            class525.field7763 = class245.method1491(8, 8, 2048, 4, true, 0.4F, 35, false);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(III)I")
    public static final int method739(int arg0, int arg1, int arg2) {
        if (arg1 != 65408) {
            method740(-65);
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        field1189++;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "(I)V")
    public static void method740(int arg0) {
        if (arg0 == -20204) {
            field1191 = null;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ILfh;)V")
    public final void method741(int arg0, class463 arg1) {
        while (true) {
            int var3 = arg1.method2737(false);
            if (var3 == 0) {
                field1196++;
                if (arg0 != 35) {
                    this.field1194 = 103;
                    return;
                }
                return;
            }
            this.method742(arg1, -112, var3);
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Lfh;II)V")
    private final void method742(class463 arg0, int arg1, int arg2) {
        if (arg2 == 2) {
            this.field1194 = arg0.method2758((byte) 80);
        }
        if (arg1 >= -68) {
            this.field1194 = -41;
        }
        field1195++;
    }
}
