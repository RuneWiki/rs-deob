import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class387 extends class286 {

    @OriginalMember(owner = "client!tc", name = "Z", descriptor = "J")
    public static long field5285 = 0L;

    @OriginalMember(owner = "client!tc", name = "Y", descriptor = "Lcq;")
    public static class72 field5284 = new class72("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

    @OriginalMember(owner = "client!tc", name = "bb", descriptor = "Lhq;")
    public static class365 field5287 = new class365(64);

    @OriginalMember(owner = "client!tc", name = "X", descriptor = "I")
    public static int field5283;

    @OriginalMember(owner = "client!tc", name = "ab", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!tc", name = "cb", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!tc", name = "db", descriptor = "I")
    public static int field5289;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "(II)[[I")
    public final int[][] method59(int arg0, int arg1) {
        ++field5286;
        int[][] var3 = super.field2283.method1667(arg1, arg0 + 647);
        if (super.field2283.field3451 && this.method1828(arg0 + 630)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field3775 * super.field3775;
            for (int var8 = 0; class138.field1579 > var8; ++var8) {
                int var9 = super.field3773[var7 - -(var8 % super.field3764)];
                var6[var8] = class191.method1183(var9, 255) << 4;
                var5[var8] = class191.method1183(var9 >> 4, 4080);
                var4[var8] = class191.method1183(16711680, var9) >> 12;
            }
        }
        if (arg0 != -730) {
            method2409(90, 60);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "(II)Z")
    public static final boolean method2409(int arg0, int arg1) {
        ++field5283;
        int var2 = 2 / ((arg0 - -51) / 35);
        return arg1 == 0 || arg1 == 1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "(I)V")
    public static void method2410(int arg0) {
        if (arg0 != 6422) {
            method2410(-48);
        }
        field5287 = null;
        field5284 = null;
    }
}
