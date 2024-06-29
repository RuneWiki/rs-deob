import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class61 {

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public int field1256 = -1;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Led;")
    private static class43 field1252 = class191.method1219("Free world", false);

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Led;")
    public static class43 field1249 = class191.method1219("Versteckt", false);

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "Led;")
    public static class43 field1254 = class191.method1219("", false);

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[I")
    public static int[] field1251 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "[Led;")
    public static class43[] field1247 = new class43[100];

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "Led;")
    public static class43 field1257 = field1252;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field1248;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lwe;")
    public class204 field1255;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field1245;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "[I")
    public int[] field1253;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "[Led;")
    public class43[] field1250;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method385(int arg0) {
        field1254 = null;
        field1251 = null;
        field1249 = null;
        if (arg0 == 16) {
            field1252 = null;
            field1257 = null;
            field1245 = null;
            field1247 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(III)V")
    public static final void method386(int arg0, int arg1, int arg2) {
        field1246++;
        if (arg0 > -112) {
            return;
        }
        if (class122.field2442 != arg2) {
            class95.field1855 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class95.field1855[var3] = (var3 << 12) / arg2;
            }
            class122.field2442 = arg2;
            class108.field2080 = arg2 - 1;
        }
        if (class112.field2144 == arg1) {
            return;
        }
        class40.field771 = new int[arg1];
        for (int var4 = 0; var4 < arg1; var4++) {
            class40.field771[var4] = (var4 << 12) / arg1;
        }
        class71.field1407 = arg1 - 1;
        class112.field2144 = arg1;
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)I")
    public static final int method387(int arg0) {
        field1248++;
        if (arg0 <= 85) {
            method385(-37);
        }
        return class23.field450++;
    }
}
