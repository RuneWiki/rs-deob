import java.io.IOException;
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class87 extends class170 {

    @OriginalMember(owner = "client!lc", name = "Y", descriptor = "Lsc;")
    public static class181 field1387 = class149.method967(255, "Freie Welt");

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "Z")
    public static boolean field1383 = false;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Ljd;")
    public static class265 field1376 = new class265(64);

    @OriginalMember(owner = "client!lc", name = "cb", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1391 = new CRC32();

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public int field1377;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field1378;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public int field1379;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field1384;

    @OriginalMember(owner = "client!lc", name = "X", descriptor = "I")
    public int field1386;

    @OriginalMember(owner = "client!lc", name = "Z", descriptor = "I")
    public int field1388;

    @OriginalMember(owner = "client!lc", name = "ab", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "Lsc;")
    public class181 field1380;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "[I")
    public int[] field1375;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "[I")
    public int[] field1382;

    @OriginalMember(owner = "client!lc", name = "bb", descriptor = "[Lsc;")
    public class181[] field1390;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "[Lhd;")
    public class214[] field1381;

    @OriginalMember(owner = "client!lc", name = "W", descriptor = "[Lpg;")
    public static class69[] field1385;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "(I)V")
    public static void method584(int arg0) {
        field1376 = null;
        field1387 = null;
        if (arg0 == 0) {
            field1391 = null;
            field1385 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Ljb;B)V")
    public static final void method585(class11 arg0, byte arg1) {
        field1389++;
        if (arg1 <= 31) {
            return;
        }
        class2.field64 = class38.method278(true, 0, arg0, class194.field3400);
        class241.field4194 = new class134[class2.field64.length];
        class256.field4475 = new class134[class2.field64.length];
        class263.field4579 = new class134[class2.field64.length];
        for (int var2 = 0; var2 < class2.field64.length; var2++) {
            class2.field64[var2].method867();
            class241.field4194[var2] = class2.field64[var2].method861();
            class2.field64[var2].method867();
            class256.field4475[var2] = class2.field64[var2].method861();
            class2.field64[var2].method867();
            class263.field4579[var2] = class2.field64[var2].method861();
            class2.field64[var2].method867();
        }
        class110.field1816 = class16.method138(0, arg0, 0, class225.field3882);
        class96.field1554 = class196.method1335(arg0, 0, (byte) 35, class76.field1224);
        class135.field2203 = class196.method1335(arg0, 0, (byte) 35, class159.field2727);
        class47.field746 = class196.method1335(arg0, 0, (byte) 35, class210.field3610);
        class190.field3350 = class196.method1335(arg0, 0, (byte) 35, class192.field3376);
        class18.field318 = class13.method127(0, 0, class166.field2827, arg0);
        class97.field1579 = class13.method127(0, 0, class182.field3209, arg0);
        class41.field610 = class208.method1382(class163.field2779, 127, 0, arg0);
        class256.field4474 = class13.method127(0, 0, class263.field4582, arg0);
        class243.field4224 = class13.method127(0, 0, class83.field1332, arg0);
        class59.field893 = class122.method797(0, -7449, class92.field1468, arg0);
        class156.field2610 = class122.method797(0, -7449, class264.field4613, arg0);
        class164.field2797.method1665(class156.field2610, (int[]) null);
        class18.field316.method1665(class156.field2610, (int[]) null);
        class114.field1853.method1665(class156.field2610, (int[]) null);
        class48 var3 = class159.method1065(0, arg0, class76.field1230, false);
        var3.method323();
        class143.field2326 = var3;
        class48[] var4 = class16.method138(0, arg0, 0, class151.field2521);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method323();
        }
        class26.field454 = var4;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 41.0D) - 20;
        for (int var10 = 0; var10 < class110.field1816.length; var10++) {
            class110.field1816[var10].method324(var8 + var9, var6 + var9, var7 + var9);
        }
        class2.field64[0].method860(var8 + var9, var6 - -var9, var7 + var9);
        class18.field320 = class110.field1816;
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V")
    public static final void method586(int arg0) {
        field1384++;
        class83.field1328.method1790(0);
        int var1 = -77 % ((75 - arg0) / 32);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZLng;)V")
    public static final void method587(int arg0, boolean arg1, class46 arg2) {
        if (class199.field3446 != null) {
            try {
                class199.field3446.method313(-45);
            } catch (Exception var8) {
            }
            class199.field3446 = null;
        }
        class199.field3446 = arg2;
        class192.method1320((byte) 109, arg1);
        class38.field593 = null;
        class196.field3429 = 0;
        class254.field4447.field3933 = 0;
        class143.field2318 = null;
        if (arg0 >= -83) {
            return;
        }
        field1378++;
        while (true) {
            class232 var3 = (class232) class132.field2188.method1418(0);
            if (var3 == null) {
                while (true) {
                    class232 var4 = (class232) class172.field2877.method1418(0);
                    if (var4 == null) {
                        if (class38.field591 != 0) {
                            try {
                                class230 var5 = new class230(4);
                                var5.method1538(4, (byte) 111);
                                var5.method1538(class38.field591, (byte) 56);
                                var5.method1534(0, 0);
                                class199.field3446.method317(4, 77, var5.field3977, 0);
                            } catch (IOException var7) {
                                try {
                                    class199.field3446.method313(-57);
                                } catch (Exception var6) {
                                }
                                class199.field3446 = null;
                                class75.field1206++;
                            }
                        }
                        class57.field865 = 0;
                        class93.field1475 = class213.method1414(-9292);
                        return;
                    }
                    class25.field442.method624(-585, var4);
                    class164.field2793.method1422(var4.field606, var4, -1);
                    class19.field348++;
                    class151.field2525--;
                }
            }
            class242.field4206.method1422(var3.field606, var3, -1);
            class74.field1180++;
            class214.field3683--;
        }
    }
}
