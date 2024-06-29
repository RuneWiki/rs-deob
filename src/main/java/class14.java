import java.awt.FontMetrics;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class14 {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "La;")
    public static class1 field456 = class113.method934(-11538, "backright1");

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "La;")
    private static class1 field461 = class113.method934(-11538, "Unexpected loginserver response)3");

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "La;")
    public static class1 field453 = field461;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Ljava/util/Calendar;")
    public static Calendar field454 = Calendar.getInstance();

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "La;")
    public static class1 field474 = class113.method934(-11538, "runes");

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field465 = 0;

    @OriginalMember(owner = "client!ca", name = "B", descriptor = "B")
    public static byte field477 = 0;

    @OriginalMember(owner = "client!ca", name = "C", descriptor = "La;")
    public static class1 field478 = class113.method934(-11538, "_");

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "I")
    public static int field467 = 0;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "La;")
    public static class1 field468 = class113.method934(-11538, "Duell akzeptieren");

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "La;")
    public static class1 field475 = class113.method934(-11538, "welle2:");

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "[I")
    public static int[] field472 = new int[5];

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "La;")
    private static class1 field466 = class113.method934(-11538, "You have only just left another world)3");

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "La;")
    public static class1 field469 = field466;

    @OriginalMember(owner = "client!ca", name = "A", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "client!ca", name = "E", descriptor = "La;")
    public static class1 field480 = class113.method934(-11538, "");

    @OriginalMember(owner = "client!ca", name = "D", descriptor = "La;")
    public static class1 field479 = class113.method934(-11538, "backhmid2");

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field452;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field457;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "J")
    public static long field463;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "Lbd;")
    public static class11 field459;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Lwc;")
    public static class134 field473;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field470;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "[Ljd;")
    public static class58[] field471;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V", line = 6)
    public static final void method253(int arg0) {
        for (int var1 = 0; var1 < class49.field1343; var1++) {
            int var3 = class22.field678[var1];
            class130 var4 = class120.field2995[var3];
            if (var4 != null) {
                class24.method320(var4, var4.field3185.field1085, (byte) 107);
            }
        }
        int var2 = -30 % ((arg0 + 8) / 34);
        field462++;
    }

    @OriginalMember(owner = "client!ca", name = "<init>", descriptor = "(I)V", line = 32)
    public class14(int arg0) {
        class5.field193 = arg0;
        field463 = class103.method872(1);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V", line = 42)
    public static final void method254(int arg0) {
        class93.field2335 = false;
        if (arg0 != 0) {
            method253(-4);
        }
        field451++;
        class3.field116 = false;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V", line = 54)
    public static final void method255(byte arg0) {
        field455++;
        class39.field1067.method268((byte) 78);
        class122.field3038.method268((byte) 36);
        if (arg0 != 60) {
            method261(17, (byte) -110);
        }
        class8.field254.method268((byte) 72);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(J)V", line = 74)
    public void method256(long arg0) {
        field452++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "()V", line = 96)
    public void method257() {
        field450++;
    }

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "(I)V", line = 104)
    public static void method258(int arg0) {
        field461 = null;
        field453 = null;
        field472 = null;
        field470 = null;
        int var1 = 53 % ((51 - arg0) / 40);
        field480 = null;
        field459 = null;
        field466 = null;
        field478 = null;
        field454 = null;
        field474 = null;
        field473 = null;
        field479 = null;
        field471 = null;
        field475 = null;
        field468 = null;
        field469 = null;
        field456 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "([II)V", line = 130)
    public static final synchronized void method259(int[] arg0, int arg1) {
        int var2 = 0;
        int var3 = arg1 - 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
            arg0[var2++] = 0;
        }
        var3 += 7;
        while (var2 < var3) {
            arg0[var2++] = 0;
        }
        if (class52.field1384 != null) {
            class52.field1384.method135(arg0, 0, var3);
        }
        class115.method952(true, var3);
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lha;", line = 164)
    public static final class43 method260(Throwable arg0, String arg1) {
        field457++;
        class43 var2;
        if (arg0 instanceof class43) {
            var2 = (class43) arg0;
            var2.field1157 = var2.field1157 + ' ' + arg1;
        } else {
            var2 = new class43(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IB)V", line = 182)
    public static final synchronized void method261(int arg0, byte arg1) {
        if (class52.field1384 != null) {
            class52.field1384.method128(arg0);
        }
        field460++;
        if (arg1 > 28) {
            class115.method952(true, arg0);
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Loc;I)V", line = 196)
    public static final synchronized void method262(class87 arg0, int arg1) {
        class52.field1384 = arg0;
        field458++;
        if (arg1 >= -113) {
            method260(null, null);
        }
    }
}
