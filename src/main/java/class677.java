import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bl")
public class class677 {

    @OriginalMember(owner = "client!bl", name = "b", descriptor = "[F")
    public static float[] field9433 = new float[16384];

    @OriginalMember(owner = "client!bl", name = "c", descriptor = "[F")
    public static float[] field9434 = new float[16384];

    @OriginalMember(owner = "client!bl", name = "e", descriptor = "Lkm;")
    public static class375 field9436;

    @OriginalMember(owner = "client!bl", name = "f", descriptor = "Lkm;")
    public static class375 field9437;

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "I")
    public static int field9432;

    @OriginalMember(owner = "client!bl", name = "d", descriptor = "I")
    public static int field9435;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field9433[var2] = (float) Math.sin((double) var2 * var0);
            field9434[var2] = (float) Math.cos((double) var2 * var0);
        }
        field9437 = field9436 = new class375(false);
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(I)V", line = 3)
    public static void method3818(int arg0) {
        field9434 = null;
        if (arg0 == 3) {
            field9433 = null;
            field9436 = null;
            field9437 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "a", descriptor = "(Z)V", line = 17)
    public static final void method3819(boolean arg0) {
        field9435++;
        class513.field7011 = null;
        if (class618.field8597 && class586.method3369(2) != 1) {
            class45.method334(0, 0, class484.method2767((byte) 120), -573243581, class177.method1344(-100), class753.field10398 == 3 || class753.field10398 == 7);
        }
        int var1 = 0;
        if (!arg0) {
            return;
        }
        int var2 = 0;
        if (class618.field8597) {
            var1 = class146.method1175(-29909);
            var2 = class605.method3435((byte) -98);
        }
        class423.method2502(var1, class108.field1697 + var2, var2, var2, -125, var1 + class732.field10098, var1, class359.field4911, -1);
        if (class513.field7011 != null) {
            class200.method1444(true, -1, -1412584499, var2, class549.field7469, class679.field9452.field297, class513.field7011, class732.field10098 + var1, class478.field6464, var1, class108.field1697 + var2);
            class513.field7011 = null;
        }
    }

    @OriginalMember(owner = "client!bl", name = "toString", descriptor = "()Ljava/lang/String;", line = 60)
    public final String toString() {
        field9432++;
        throw new IllegalStateException();
    }
}
