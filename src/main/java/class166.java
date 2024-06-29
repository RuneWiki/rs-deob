import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class166 {

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!ok", name = "h", descriptor = "[I")
    public static int[] field2578;

    @OriginalMember(owner = "client!ok", name = "g", descriptor = "Lrn;")
    public static class174 field2577;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "I")
    public static int field2571;

    @OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
    public int field2573;

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ok", name = "i", descriptor = "Lhi;")
    public static class137 field2579;

    @OriginalMember(owner = "client!ok", name = "b", descriptor = "Lok;")
    public class166 field2572;

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "Lnu;")
    public class417 field2576;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
    public static void method1224(byte arg0) {
        if (arg0 <= -85) {
            field2578 = null;
            field2577 = null;
            field2579 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILea;Lmq;IIILf;I)V")
    public static final void method1225(int arg0, class381 arg1, class350 arg2, int arg3, int arg4, int arg5, class529 arg6, int arg7) {
        field2574++;
        if (arg5 > -126) {
            field2575 = -30;
        }
        if (arg6 == null) {
            return;
        }
        int var8;
        if (class85.field1473 == 4) {
            var8 = (int) class526.field7779 & 0x3FFF;
        } else {
            var8 = (int) class526.field7779 + class255.field3674 & 0x3FFF;
        }
        int var9 = Math.max(arg2.field5329 / 2, arg2.field5269 / 2) + 10;
        int var10 = arg3 * arg3 + arg7 * arg7;
        if (var9 * var9 < var10) {
            return;
        }
        int var11 = class528.field7783[var8];
        int var12 = class528.field7786[var8];
        if (class85.field1473 != 4) {
            var12 = var12 * 256 / (class70.field1215 + 256);
            var11 = var11 * 256 / (class70.field1215 + 256);
        }
        int var13 = arg3 * var12 + arg7 * var11 >> 15;
        int var14 = arg7 * var12 - (arg3 * var11) >> 15;
        arg6.method103(arg0 + var13 + (arg2.field5329 / 2) - arg6.method100() / 2, arg2.field5269 / 2 + arg4 + (-var14 - arg6.method104() / 2), arg1, arg0, arg4);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)V")
    public final void method1226(int arg0) {
        field2571++;
        if (class175.field2678 >= 500) {
            return;
        }
        this.field2576 = null;
        this.field2572 = class261.field3793;
        this.field2573 = arg0;
        class261.field3793 = this;
        class175.field2678++;
    }

    static {
        new class342("Loaded additional fonts", "Zusatzschriftarten geladen", "Polices secondaires chargées", "Fontes principais carregadas");
        field2575 = 2;
        field2578 = new int[] { 1, 2, 4, 8 };
        field2577 = new class174(75, 3);
    }
}
