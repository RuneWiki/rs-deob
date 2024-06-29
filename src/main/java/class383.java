import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class383 {

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "Lpf;")
    public static class425 field5586 = new class425(35, 7);

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "[I")
    public static int[] field5589 = new int[2];

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "Lwl;")
    public static class452 field5588 = new class452(19, 1);

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "Lnn;")
    public static class151 field5590 = new class151("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public static int field5582;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public int field5585;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public static int field5587;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "Lht;")
    public class402 field5581;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "[I")
    public int[] field5584;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(II)Lkq;")
    public static final class70 method2309(int arg0, int arg1) {
        int var2 = -5 / ((arg0 + 11) / 63);
        field5587++;
        class354[] var3 = class292.field4454;
        synchronized (class292.field4454) {
            class70 var4;
            if (arg1 >= class292.field4454.length || class292.field4454[arg1].method2123((byte) -93)) {
                var4 = new class70();
                var4.field899 = new class158[arg1];
                for (int var5 = 0; var5 < arg1; var5++) {
                    var4.field899[var5] = new class158();
                }
            } else {
                var4 = (class70) class292.field4454[arg1].method2124(-103);
                var4.method2759((byte) -25);
                int var10002 = class280.field4288[arg1]--;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(BI)V")
    public static final void method2310(byte arg0, int arg1) {
        field5582++;
        if (arg0 != -35) {
            field5586 = null;
        }
        class241 var2 = class177.field2679;
        synchronized (class177.field2679) {
            class177.field2679.method1481(3, arg1);
        }
        class241 var3 = class391.field5767;
        synchronized (class391.field5767) {
            class391.field5767.method1481(3, arg1);
        }
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Z)V")
    public static void method2311(boolean arg0) {
        field5589 = null;
        if (arg0) {
            method2311(false);
        }
        field5586 = null;
        field5590 = null;
        field5588 = null;
    }
}
