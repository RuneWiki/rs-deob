import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class464 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "[I")
    public static int[] field6884 = new int[2];

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "Z")
    public static boolean field6887 = false;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "[I")
    public static int[] field6888 = new int[13];

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Los;")
    public static class309 field6885 = new class309("Allocated memory", "Zugewiesener Speicher.", "Mémoire attribuée", "Memória alocada");

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field6886;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Llq;")
    public static class390 field6883;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IZ)Z")
    public static final boolean method2779(int arg0, boolean arg1) {
        if (arg1) {
            field6886++;
            return arg0 == 2 || arg0 == 3 || arg0 == 4 || arg0 == 5;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method2780(int arg0) {
        field6888 = null;
        if (arg0 != 1) {
            method2781(47, -27, (byte) 1, -120);
        }
        field6884 = null;
        field6885 = null;
        field6883 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIBI)I")
    public static final int method2781(int arg0, int arg1, byte arg2, int arg3) {
        field6889++;
        int var4 = arg1 & 0x3;
        if (arg2 > -1) {
            return -15;
        } else if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg3;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg3;
        }
    }
}
