import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 extends class75 {

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public int field888 = 0;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "Lod;")
    private static class101 field889 = class46.method335(81, "Please reload this page)3");

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Lod;")
    public static class101 field885 = field889;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "Llb;")
    public static class78 field884 = new class78();

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "I")
    public static int field893 = 0;

    @OriginalMember(owner = "client!ef", name = "S", descriptor = "Lod;")
    public static class101 field897 = class46.method335(80, "Ein kostenloses Spielkonto erstellen)3");

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "I")
    public static int field895 = 0;

    @OriginalMember(owner = "client!ef", name = "W", descriptor = "I")
    public static int field901 = 0;

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "Lod;")
    private static class101 field896 = class46.method335(-108, "Too many connections from your address)3");

    @OriginalMember(owner = "client!ef", name = "T", descriptor = "I")
    public static int field898 = 0;

    @OriginalMember(owner = "client!ef", name = "U", descriptor = "[Lod;")
    public static class101[] field899 = new class101[200];

    @OriginalMember(owner = "client!ef", name = "V", descriptor = "Lod;")
    public static class101 field900 = field896;

    @OriginalMember(owner = "client!ef", name = "X", descriptor = "Lod;")
    public static class101 field902 = class46.method335(122, "Update)2Liste geladen)3");

    @OriginalMember(owner = "client!ef", name = "Y", descriptor = "Lod;")
    public static class101 field903 = class46.method335(-97, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "I")
    public static int field886;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field887;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "I")
    public static int field890;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "I")
    public static int field891;

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "Lc;")
    public static class15 field892;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "[[I")
    public static int[][] field894;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IILtf;)V")
    private final void method258(int arg0, int arg1, class138 arg2) {
        if (arg0 != 1) {
            field898 = -1;
        }
        if (arg1 == 5) {
            this.field888 = arg2.method1098(true);
        }
        field886++;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static void method259(boolean arg0) {
        field897 = null;
        field892 = null;
        field884 = null;
        field900 = null;
        field899 = null;
        field903 = null;
        field902 = null;
        if (arg0) {
            field894 = null;
        }
        field894 = null;
        field889 = null;
        field885 = null;
        field896 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Ltf;I)V")
    public final void method260(class138 arg0, int arg1) {
        field891++;
        if (arg1 != -1) {
            field899 = null;
        }
        while (true) {
            int var3 = arg0.method1055(arg1 ^ 0xFFFFFF85);
            if (var3 == 0) {
                return;
            }
            this.method258(arg1 + 2, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)V")
    public static final void method261(boolean arg0) {
        field887++;
        if (arg0) {
            method262(92, -21);
        }
        for (int var1 = -1; var1 < class150.field3442; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class143.field3285[var1];
            }
            class13 var3 = class94.field2032[var2];
            if (var3 != null) {
                class27.method219(0, var3, 1);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)V")
    public static final void method262(int arg0, int arg1) {
        field890++;
        if (class145.field3335 == arg1) {
            return;
        }
        if (class145.field3335 == arg0) {
            class140.method1121(arg0 - 28194);
        }
        if (arg1 == 20 || arg1 == 40) {
            class15.field334 = 0;
            class118.field2602 = 0;
            class43.field1034 = 0;
        }
        if (arg1 != 20 && arg1 != 40 && class5.field77 != null) {
            class5.field77.method444((byte) 101);
            class5.field77 = null;
        }
        if (class145.field3335 == 25) {
            class33.field852 = 0;
            class112.field2389 = 1;
            class5.field62 = 0;
            class17.field369 = 1;
            class75.field1610 = 0;
        }
        if (arg1 == 5 || arg1 == 10 || arg1 == 20) {
            class95.method667(class20.field442, class85.field1864, 256, class134.field3062);
        } else {
            class100.method696(arg0 ^ 0xFFFFC9E0);
        }
        class145.field3335 = arg1;
    }
}
