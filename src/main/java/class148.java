import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class148 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field3374 = 50;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "Lod;")
    private static class101 field3381 = class46.method335(-104, "Press (Wrecover a locked account(W on front page)3");

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "Lod;")
    public static class101 field3377 = class46.method335(71, "");

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lod;")
    public static class101 field3371 = field3381;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lod;")
    public static class101 field3380 = class46.method335(77, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "[I")
    public static int[] field3375 = new int[50];

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "Lod;")
    private static class101 field3378 = class46.method335(-92, "Members only world");

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "Lod;")
    public static class101 field3379 = field3378;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Lc;")
    public static class15 field3373;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static final void method1160(int arg0) {
        class11.field176 = 0;
        class24.field579 = 0;
        class27.method223(true);
        class133.method1026(false);
        field3372++;
        class85.method616((byte) -59);
        for (int var1 = 0; var1 < class24.field579; var1++) {
            int var3 = class3.field55[var1];
            if (class143.field3305 != class18.field376[var3].field1283) {
                class18.field376[var3].field1374 = null;
                class18.field376[var3] = null;
            }
        }
        if (arg0 > -98) {
            field3378 = null;
        }
        if (class8.field121 != class118.field2611.field3175) {
            throw new RuntimeException("gnp1 pos:" + class118.field2611.field3175 + " psize:" + class8.field121);
        }
        for (int var2 = 0; var2 < class40.field959; var2++) {
            if (class18.field376[class73.field1586[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class40.field959);
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method1161(byte arg0) {
        field3371 = null;
        field3378 = null;
        field3377 = null;
        field3373 = null;
        field3380 = null;
        field3375 = null;
        field3379 = null;
        field3381 = null;
        if (arg0 != 82) {
            method1161((byte) -22);
        }
    }
}
