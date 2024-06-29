import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class167 {

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "J")
    public long field2860 = 0L;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "Ljf;")
    public static class229 field2859 = class212.method1457((byte) 71, "V-Brification des mises -9 jour )2 ");

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "Ljf;")
    public static class229 field2863 = class212.method1457((byte) 80, " )2> <col=00ffff>");

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "Ljf;")
    public static class229 field2858 = class212.method1457((byte) 90, "Monde de jeu cr-B-B");

    @OriginalMember(owner = "client!lc", name = "o", descriptor = "I")
    public static int field2871 = -1;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public int field2857;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2864;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public int field2866;

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "I")
    public static int field2867;

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public int field2868;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public int field2870;

    @OriginalMember(owner = "client!lc", name = "q", descriptor = "I")
    public int field2873;

    @OriginalMember(owner = "client!lc", name = "p", descriptor = "Lpm;")
    public static class103 field2872;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Lbc;")
    public static class118 field2861;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lhg;")
    public class174 field2865;

    @OriginalMember(owner = "client!lc", name = "r", descriptor = "Lhg;")
    public class174 field2874;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "Lek;")
    public static class185 field2862;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 12)
    public static void method1139(boolean arg0) {
        field2859 = null;
        field2872 = null;
        field2862 = null;
        field2858 = null;
        field2863 = null;
        if (!arg0) {
            field2867 = 34;
        }
        field2861 = null;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1140(int arg0) {
        field2869++;
        for (class321 var1 = (class321) class151.field2618.method1884((byte) 126); var1 != null; var1 = (class321) class151.field2618.method1886(-128)) {
            int var2 = var1.field5432;
            if (class192.method1314(var2, 106)) {
                boolean var3 = true;
                class67[] var4 = class23.field423[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field1249;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field4265;
                    class67 var7 = class96.method662(var6, true);
                    if (var7 != null) {
                        class194.method1328((byte) -124, var7);
                    }
                }
            }
        }
        int var8 = -32 % ((6 - arg0) / 32);
    }
}
