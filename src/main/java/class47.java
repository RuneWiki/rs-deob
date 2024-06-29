import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class47 extends class184 {

    @OriginalMember(owner = "client!fk", name = "q", descriptor = "Lha;")
    private static class46 field818 = class271.method1828("Loading wordpack )2 ", -46);

    @OriginalMember(owner = "client!fk", name = "u", descriptor = "Lha;")
    public static class46 field822 = class271.method1828("gelb:", -46);

    @OriginalMember(owner = "client!fk", name = "t", descriptor = "Lha;")
    public static class46 field821 = field818;

    @OriginalMember(owner = "client!fk", name = "v", descriptor = "I")
    public static int field823 = 0;

    @OriginalMember(owner = "client!fk", name = "s", descriptor = "Lge;")
    public static class235 field820 = new class235(16);

    @OriginalMember(owner = "client!fk", name = "r", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!fk", name = "w", descriptor = "Lrc;")
    public static class9 field824;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public static void method353(byte arg0) {
        int var1 = -46 / ((arg0 + 71) / 47);
        field818 = null;
        field821 = null;
        field822 = null;
        field820 = null;
        field824 = null;
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method354(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        field819++;
        int var8 = class15.method77(arg2, class4.field70, class70.field1205, -82);
        int var9 = class15.method77(arg7, class4.field70, class70.field1205, -112);
        int var10 = class15.method77(arg6, class135.field2445, class73.field1309, -54);
        int var11 = class15.method77(arg4, class135.field2445, class73.field1309, -87);
        int var12 = class15.method77(arg0 + arg2, class4.field70, class70.field1205, -55);
        int var13 = class15.method77(arg7 - arg0, class4.field70, class70.field1205, -110);
        if (arg3 >= -13) {
            field821 = null;
        }
        for (int var14 = var8; var14 < var12; var14++) {
            class24.method170((byte) 33, var10, class6.field100[var14], var11, arg1);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class24.method170((byte) 33, var10, class6.field100[var15], var11, arg1);
        }
        int var16 = class15.method77(arg6 + arg0, class135.field2445, class73.field1309, -118);
        int var17 = class15.method77(arg4 - arg0, class135.field2445, class73.field1309, -84);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class6.field100[var18];
            class24.method170((byte) 33, var10, var19, var16, arg1);
            class24.method170((byte) 33, var16, var19, var17, arg5);
            class24.method170((byte) 33, var17, var19, var11, arg1);
        }
    }
}
