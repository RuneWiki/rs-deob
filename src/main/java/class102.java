import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class102 extends RuntimeException {

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "Ljava/lang/Throwable;")
    public Throwable field1855;

    @OriginalMember(owner = "client!jd", name = "e", descriptor = "Ljava/lang/String;")
    public String field1859;

    @OriginalMember(owner = "client!jd", name = "f", descriptor = "Lkh;")
    public static class117 field1860 = class224.method1450((byte) 113, "rect_debug=");

    @OriginalMember(owner = "client!jd", name = "b", descriptor = "I")
    public static int field1856;

    @OriginalMember(owner = "client!jd", name = "c", descriptor = "I")
    public static int field1857;

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!jd", name = "h", descriptor = "I")
    public static int field1862;

    @OriginalMember(owner = "client!jd", name = "i", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "Lai;")
    public static class10 field1864;

    @OriginalMember(owner = "client!jd", name = "g", descriptor = "Ls;")
    public static class197 field1861;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(I)V")
    public static void method687(int arg0) {
        if (arg0 < 116) {
            method691(null, null, null, -50);
        }
        field1864 = null;
        field1861 = null;
        field1860 = null;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(IB)V")
    public static final void method688(int arg0, byte arg1) {
        field1863++;
        if (!class223.method1446(arg0, 6)) {
            return;
        }
        if (arg1 <= 84) {
            field1860 = null;
        }
        class9[] var2 = class90.field1675[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class9 var4 = var2[var3];
            if (var4 != null) {
                var4.field270 = 0;
                var4.field299 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Lef;I)V")
    public static final void method689(class51 arg0, int arg1) {
        if (arg1 < -45) {
            field1858++;
            class229.method1482(false, 200000, arg0);
        }
    }

    @OriginalMember(owner = "client!jd", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class102(Throwable arg0, String arg1) {
        this.field1855 = arg0;
        this.field1859 = arg1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "([BZ)V")
    public static final void method690(byte[] arg0, boolean arg1) {
        if (arg1) {
            return;
        }
        int var2 = 0;
        field1857++;
        while (true) {
            while (var2 < arg0.length) {
                int var3 = (arg0[var2++] & 0xFF) * 64 - class80.field1501;
                int var4 = (arg0[var2++] & 0xFF) * 64 - class173.field3116;
                if (var3 > 0 && var4 > 0 && class237.field4284 > var3 + 64 && var4 + 64 < class33.field773) {
                    int var5 = class33.field773 - var4 - 1 >> 6;
                    int var6 = var3 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg0[var2++];
                            if (var9 != 0) {
                                if (class215.field3903[var6][var5] == null) {
                                    class215.field3903[var6][var5] = new byte[4096];
                                }
                                class215.field3903[var6][var5][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg0[var2++];
                                if (class106.field1932[var6][var5] == null) {
                                    class106.field1932[var6][var5] = new byte[4096];
                                }
                                class106.field1932[var6][var5][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg0[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Ljava/awt/Component;Lai;Lai;I)V")
    public static final void method691(Component arg0, class10 arg1, class10 arg2, int arg3) {
        field1856++;
        if (class67.field1294) {
            return;
        }
        class83.method566();
        byte[] var4 = arg2.method104(-117, class191.field3403, 0);
        int var5 = -48 / ((arg3 - 27) / 54);
        class8.field139 = new class144(var4, arg0);
        client.field785 = class8.field139.method971();
        class39.field901 = class180.method1248(arg1, class178.field3220, 1);
        class60.field1213 = class180.method1248(arg1, class111.field2096, 1);
        class86.field1628 = class180.method1248(arg1, class44.field956, 1);
        class74.field1401 = class199.method1327((byte) 45, arg1, class96.field1756);
        class80.field1506 = class169.method1195(class97.field1783, arg1, (byte) 122);
        class80.field1510 = new int[256];
        for (int var6 = 0; var6 < 64; var6++) {
            class80.field1510[var6] = var6 * 262144;
        }
        for (int var7 = 0; var7 < 64; var7++) {
            class80.field1510[var7 + 64] = var7 * 1024 + 16711680;
        }
        for (int var8 = 0; var8 < 64; var8++) {
            class80.field1510[var8 + 128] = var8 * 4 + 16776960;
        }
        for (int var9 = 0; var9 < 64; var9++) {
            class80.field1510[var9 + 192] = 16777215;
        }
        class182.field3287 = new int[256];
        for (int var10 = 0; var10 < 64; var10++) {
            class182.field3287[var10] = var10 * 1024;
        }
        for (int var11 = 0; var11 < 64; var11++) {
            class182.field3287[var11 + 64] = var11 * 4 + 65280;
        }
        for (int var12 = 0; var12 < 64; var12++) {
            class182.field3287[var12 + 128] = var12 * 262144 + 65535;
        }
        for (int var13 = 0; var13 < 64; var13++) {
            class182.field3287[var13 + 192] = 16777215;
        }
        class194.field3458 = new int[256];
        for (int var14 = 0; var14 < 64; var14++) {
            class194.field3458[var14] = var14 * 4;
        }
        for (int var15 = 0; var15 < 64; var15++) {
            class194.field3458[var15 + 64] = var15 * 262144 + 255;
        }
        for (int var16 = 0; var16 < 64; var16++) {
            class194.field3458[var16 + 128] = var16 * 1024 + 16711935;
        }
        for (int var17 = 0; var17 < 64; var17++) {
            class194.field3458[var17 + 192] = 16777215;
        }
        class137.field2481 = new int[256];
        class209.field3752 = new int[32768];
        class209.field3747 = new int[32768];
        class147.method1053(-6275, null);
        class110.field2072 = new int[32768];
        class13.field404 = class13.field414;
        class13.field402 = class13.field414;
        class45.field987 = false;
        if (class175.field3161 == 0) {
            class61.field1228 = true;
        } else {
            class61.field1228 = false;
        }
        class103.field1876 = 0;
        class98.field1800 = new int[32768];
        if (class61.field1228) {
            class26.method232(2, (byte) 106);
        } else {
            class226.method1462(2, false, class117.field2187, false, 0, class76.field1453, 255);
        }
        class171.method1202(111, false);
        class67.field1294 = true;
        class184.method1262(124);
        class90.field1679 = new class144(128, 254);
        class104.field1908 = new class144(128, 254);
    }
}
