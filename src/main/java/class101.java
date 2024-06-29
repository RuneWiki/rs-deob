import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class101 extends RuntimeException {

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "Ljava/lang/String;")
    public String field1841;

    @OriginalMember(owner = "client!jc", name = "h", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1846;

    @OriginalMember(owner = "client!jc", name = "g", descriptor = "Ldj;")
    public static class44 field1845 = class89.method650(255, " <col=00ff80>");

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "Ljava/util/Random;")
    public static Random field1839 = new Random();

    @OriginalMember(owner = "client!jc", name = "i", descriptor = "Ls;")
    public static class190 field1847 = new class190();

    @OriginalMember(owner = "client!jc", name = "k", descriptor = "[[I")
    public static int[][] field1849 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Ldj;")
    public static class44 field1852 = class89.method650(255, "sl_button");

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "I")
    public static int field1851 = 0;

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Ldj;")
    public static class44 field1853 = class89.method650(255, "<col=ff3000>");

    @OriginalMember(owner = "client!jc", name = "d", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "J")
    public static long field1840;

    @OriginalMember(owner = "client!jc", name = "f", descriptor = "Ljj;")
    public static class108 field1844;

    @OriginalMember(owner = "client!jc", name = "j", descriptor = "Lwc;")
    public static class233 field1848;

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(I)V")
    public static void method749(int arg0) {
        field1847 = null;
        field1839 = null;
        field1852 = null;
        field1845 = null;
        field1844 = null;
        if (arg0 >= -19) {
            method750(5);
        }
        field1848 = null;
        field1853 = null;
        field1849 = null;
    }

    @OriginalMember(owner = "client!jc", name = "b", descriptor = "(I)[Lle;")
    public static final class125[] method750(int arg0) {
        field1843++;
        class125[] var1 = new class125[class106.field1942];
        for (int var2 = arg0; var2 < class106.field1942; var2++) {
            class125 var3 = new class125();
            var3.field2272 = class92.field1725;
            var3.field2267 = class227.field4275;
            var3.field2268 = class88.field1684[var2];
            var3.field2266 = class38.field672[var2];
            var3.field2271 = class94.field1745[var2];
            var3.field2269 = class175.field3039[var2];
            var3.field2265 = class170.field2933;
            var3.field2270 = class58.field1082[var2];
            var1[var2] = var3;
        }
        class122.method840(-33);
        return var1;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B[B)V")
    public static final void method751(byte arg0, byte[] arg1) {
        field1842++;
        int var2 = 0;
        while (true) {
            while (var2 < arg1.length) {
                int var3 = (arg1[var2++] & 0xFF) * 64 - class198.field3502;
                int var4 = (arg1[var2++] & 0xFF) * 64 - class136.field2431;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class168.field2896 && var4 + 64 < class214.field3851) {
                    int var5 = var3 >> 6;
                    int var6 = class214.field3851 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if (class225.field4218[var5][var6] == null) {
                                    class225.field4218[var5][var6] = new byte[4096];
                                }
                                class225.field4218[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg1[var2++];
                                if (class30.field541[var5][var6] == null) {
                                    class30.field541[var5][var6] = new byte[4096];
                                }
                                class30.field541[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg1[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            if (arg0 != -69) {
                field1853 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class101(Throwable arg0, String arg1) {
        this.field1841 = arg1;
        this.field1846 = arg0;
    }
}
