import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class359 {

    @OriginalMember(owner = "client!dr", name = "m", descriptor = "I")
    public int field5103 = 16777215;

    @OriginalMember(owner = "client!dr", name = "l", descriptor = "I")
    public int field5102 = 8;

    @OriginalMember(owner = "client!dr", name = "j", descriptor = "I")
    public static int field5100 = 0;

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "Lbv;")
    public static class567 field5094 = new class567("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public int field5093;

    @OriginalMember(owner = "client!dr", name = "e", descriptor = "I")
    public int field5095;

    @OriginalMember(owner = "client!dr", name = "f", descriptor = "I")
    public int field5096;

    @OriginalMember(owner = "client!dr", name = "g", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!dr", name = "h", descriptor = "I")
    public static int field5098;

    @OriginalMember(owner = "client!dr", name = "i", descriptor = "I")
    public int field5099;

    @OriginalMember(owner = "client!dr", name = "k", descriptor = "I")
    public int field5101;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Z")
    public boolean field5092;

    @OriginalMember(owner = "client!dr", name = "n", descriptor = "[I")
    public static int[] field5104;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lco;I)V", line = 10)
    public final void method2171(class268 arg0, int arg1) {
        field5097++;
        while (true) {
            int var3 = arg0.method1738(arg1 ^ 0xFD);
            if (var3 == 0) {
                if (arg1 == 2) {
                    return;
                } else {
                    this.method2171(null, 104);
                    return;
                }
            }
            this.method2173(arg0, 0, var3);
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(I)V", line = 31)
    public static void method2172(int arg0) {
        if (arg0 == -4) {
            field5104 = null;
            field5094 = null;
        }
    }

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lco;II)V", line = 43)
    private final void method2173(class268 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field5102 = arg0.method1745(32132);
        } else if (arg2 == 2) {
            this.field5092 = true;
        } else if (arg2 == 3) {
            this.field5101 = arg0.method1730(13436);
            this.field5096 = arg0.method1730(13436);
            this.field5093 = arg0.method1730(13436);
        } else if (arg2 == 4) {
            this.field5099 = arg0.method1738(255);
        } else if (arg2 == 5) {
            this.field5095 = arg0.method1745(32132);
        } else if (arg2 == 6) {
            this.field5103 = arg0.method1700((byte) 44);
        }
        field5091++;
        if (arg1 != 0) {
            this.method2171(null, 10);
        }
    }
}
