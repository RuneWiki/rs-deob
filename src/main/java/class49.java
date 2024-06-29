import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class49 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Ltc;")
    public class233 field892 = new class233();

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "Z")
    public boolean field898 = false;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "Lpi;")
    public static class342 field891 = new class342("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field894 = -1;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "[I")
    public static int[] field897 = new int[4096];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field893;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "I")
    public int field895;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public int field896;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lqa;JI)V")
    public static final void method457(class162 arg0, long arg1, int arg2) {
        class203.field2973 = class123.field1994;
        field890++;
        class85.field1467 = 0;
        class123.field1994 = 0;
        long var4 = class211.method1419(12921);
        for (class94 var6 = (class94) class286.field4081.method1640(false); var6 != null; var6 = (class94) class286.field4081.method1641(true)) {
            if (var6.method725(arg0, arg1)) {
                class85.field1467++;
            }
        }
        int var7 = -26 / ((arg2 + 47) / 41);
        if (class163.field2526 && arg1 % 100L == 0L) {
            System.out.println("Particle system count: " + class286.field4081.method1635(true) + ", running: " + class85.field1467 + ". Particles: " + class123.field1994 + ". Time taken: " + (class211.method1419(12921) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V")
    public static void method458(int arg0) {
        field891 = null;
        field897 = null;
        if (arg0 > -99) {
            method457(null, 56L, 40);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)[Lgr;")
    public static final class296[] method459(byte arg0) {
        field893++;
        return arg0 == 50 ? new class296[] { class2.field73, class413.field6169, class357.field5435, class483.field7196, class282.field4034, class384.field5802, class56.field982, class29.field614, class80.field1415, class367.field5543, class60.field1060, class214.field3087, class88.field1536, class104.field1731, class98.field1632 } : null;
    }
}
