import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("dh")
public class class39 {

    @OriginalMember(owner = "dh", name = "c", descriptor = "Llf;")
    private static class109 field830 = class35.method275("Unexpected server response)3", 2);

    @OriginalMember(owner = "dh", name = "b", descriptor = "Llf;")
    public static class109 field829 = class35.method275("m-Ochte mit Ihnen handeln)3", 2);

    @OriginalMember(owner = "dh", name = "e", descriptor = "Llf;")
    public static class109 field832 = field830;

    @OriginalMember(owner = "dh", name = "d", descriptor = "Llf;")
    public static class109 field831 = class35.method275("Keine Antwort vom Anmelde)2Server)3", 2);

    @OriginalMember(owner = "dh", name = "g", descriptor = "I")
    public static volatile int field834 = -1;

    @OriginalMember(owner = "dh", name = "a", descriptor = "I")
    public static int field828;

    @OriginalMember(owner = "dh", name = "f", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "dh", name = "i", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "dh", name = "j", descriptor = "I")
    public static int field837;

    @OriginalMember(owner = "dh", name = "l", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "dh", name = "h", descriptor = "Loh;")
    public static class138 field835;

    @OriginalMember(owner = "dh", name = "k", descriptor = "[S")
    public static short[] field838;

    @OriginalMember(owner = "dh", name = "a", descriptor = "(B)V")
    public static final void method289(byte arg0) {
        field837++;
        class144.field2778.method874(0);
        if (arg0 != 1) {
            field830 = null;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class95.field1947[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class163.field3050[var2] = 0L;
        }
        class118.field2322 = 0;
    }

    @OriginalMember(owner = "dh", name = "a", descriptor = "(IIIII)I")
    public static final int method290(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field828++;
        if (arg2 != 31246) {
            field830 = null;
        }
        int var5 = 65536 - class124.field2387[arg4 * 1024 / arg0] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg1 * var5 >> 16);
    }

    @OriginalMember(owner = "dh", name = "a", descriptor = "(I)V")
    public static void method291(int arg0) {
        field835 = null;
        field831 = null;
        field838 = null;
        field830 = null;
        if (arg0 != -818007391) {
            method291(-43);
        }
        field832 = null;
        field829 = null;
    }
}
