import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class174 {

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Ldj;")
    public static class44 field3013 = class89.method650(255, "Bitte wenden Sie sich an den Kundendienst)3");

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lih;")
    public static class95 field3016 = new class95(50);

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "[Ldj;")
    public static class44[] field3026 = new class44[200];

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Ldj;")
    public static class44 field3029 = class89.method650(255, "(U(Y");

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public int field3014;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field3017;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field3018;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public int field3020;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public int field3021;

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public int field3023;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field3025;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "I")
    public static int field3030;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "J")
    public long field3015;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Lwd;")
    public class234 field3019;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lwd;")
    public class234 field3022;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "Lwd;")
    public class234 field3024;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Z")
    public static boolean field3027;

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "[I")
    public static int[] field3028;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V")
    public static final void method1103(boolean arg0, int arg1) {
        if (!arg0) {
            field3016 = null;
        }
        field3025++;
        class117.field2080 = 1000 / arg1;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
    public static void method1104(int arg0) {
        field3026 = null;
        if (arg0 != 50) {
            field3030 = 97;
        }
        field3013 = null;
        field3029 = null;
        field3028 = null;
        field3016 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lve;ILve;Lve;)V")
    public static final void method1105(class225 arg0, int arg1, class225 arg2, class225 arg3) {
        field3017++;
        if (arg1 < 126) {
            method1103(false, 34);
        }
        class160.field2763 = arg3.method1463(class175.field3037, -121);
        class140.field2517 = arg0.method1463(class181.field3139, -78);
        class60.field1127 = arg0.method1463(client.field607, -93);
        class128.field2283 = arg0.method1463(class156.field2721, -87);
        class123.field2184 = arg0.method1463(class44.field836, -117);
        class221.field4006 = arg0.method1463(class204.field3647, -118);
        class19.field326 = arg0.method1463(class190.field3278, -94);
        class169.field2924 = arg0.method1463(class49.field905, -98);
        class139.field2483 = arg0.method1463(class188.field3240, -95);
        class166.field2867 = arg0.method1463(class32.field561, -128);
        class153.field2656 = arg0.method1463(class101.field1852, -70);
        class180.field3114 = arg2.method1463(class63.field1170, -99);
    }
}
