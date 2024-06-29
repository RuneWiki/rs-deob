import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class193 {

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "Lja;")
    public static class143 field3188 = new class143(64);

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "I")
    public static int field3190 = 0;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "Lph;")
    public static class229 field3189 = class266.method1858("(U(Y", 0);

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "[I")
    public static int[] field3187;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(B)V", line = 5)
    public static final void method1351(byte arg0) {
        if (arg0 != 105) {
            method1354((byte) 104, -61, 81, 66, (int[]) null);
        }
        while (class88.field1497.method36(class187.field3052, 8) >= 27) {
            int var1 = class88.field1497.method34(-63, 15);
            if (var1 == 32767) {
                break;
            }
            boolean var2 = false;
            if (class187.field3035[var1] == null) {
                var2 = true;
                class187.field3035[var1] = new class217();
            }
            class217 var3 = class187.field3035[var1];
            class162.field2620[class253.field4233++] = var1;
            var3.field5162 = class319.field5393;
            if (var3.field3559 != null && var3.field3559.method2117(false)) {
                class108.method826(var3, (byte) 123);
            }
            var3.method1523((byte) 122, class25.method155(class88.field1497.method34(10, 14), -52));
            int var4 = class88.field1497.method34(-123, 5);
            int var5 = class88.field1497.method34(118, 1);
            if (var4 > 15) {
                var4 -= 32;
            }
            if (var5 == 1) {
                class105.field1782[class313.field5278++] = var1;
            }
            int var6 = class88.field1497.method34(113, 1);
            int var7 = class299.field4858[class88.field1497.method34(119, 3)];
            if (var2) {
                var3.field5163 = var3.field5122 = var7;
            }
            int var8 = class88.field1497.method34(arg0 ^ 0x16, 5);
            var3.method2058((byte) -90, var3.field3559.field5304);
            var3.field5114 = var3.field3559.field5276;
            var3.field5160 = var3.field3559.field5302;
            var3.field5146 = var3.field3559.field5317;
            var3.field5153 = var3.field3559.field5292;
            var3.field5108 = var3.field3559.field5312;
            if (var8 > 15) {
                var8 -= 32;
            }
            var3.field5161 = var3.field3559.field5319;
            if (var3.field5108 == 0) {
                var3.field5122 = 0;
            }
            var3.field5142 = var3.field3559.field5288;
            var3.field5131 = var3.field3559.field5289;
            var3.method2066(class230.field3820.field5104[0] + var4, class230.field3820.field5159[0] + var8, var3.method1457(0), (byte) -102, var6 == 1);
            if (var3.field3559.method2117(false)) {
                class250.method1756(var3.field5104[0], class298.field4849, false, 0, (class209) null, (class83) null, var3.field5159[0], var3);
            }
        }
        field3186++;
        class88.field1497.method35((byte) 90);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 104)
    public static void method1352(int arg0) {
        if (arg0 != 6463) {
            field3189 = (class229) null;
        }
        field3188 = null;
        field3187 = null;
        field3189 = null;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Lph;I)V", line = 154)
    public static final void method1353(class229 arg0, int arg1) {
        field3192++;
        if (arg1 != 11881) {
            method1352(-60);
        }
        if (class27.field378 >= 2) {
            if (arg0.method1630(10, class252.field4223)) {
                class155.method1120(0);
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class205.method1439(class248.method1746(8528, new class229[] { class175.field2881, class50.method354(0, var4), class329.field5609 }), true, 0, (class229) null);
            }
            if (arg0.method1630(10, class176.field2893)) {
                class155.method1120(0);
                for (int var5 = 0; var5 < 10; var5++) {
                    System.gc();
                }
                Runtime var6 = Runtime.getRuntime();
                int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class205.method1439(class248.method1746(8528, new class229[] { class148.field2398, class50.method354(0, var7), class329.field5609 }), true, 0, (class229) null);
                class306.method2060(true);
                class155.method1120(0);
                for (int var8 = 0; var8 < 10; var8++) {
                    System.gc();
                }
                int var9 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
                class205.method1439(class248.method1746(8528, new class229[] { class147.field2378, class50.method354(0, var9), class329.field5609 }), true, 0, (class229) null);
            }
            if (class99.field1675 && arg0.method1630(10, class80.field1322)) {
                System.out.println("oncard_geometry:" + class274.field4580);
                System.out.println("oncard_2d:" + class274.field4581);
                System.out.println("oncard_texture:" + class274.field4578);
            }
            if (arg0.method1630(arg1 - 11871, class223.field3666)) {
                class19.method114(4096);
            }
            if (arg0.method1630(10, class223.field3664)) {
                class177.field2921.method164(-2);
            }
            if (arg0.method1630(10, class243.field4005)) {
                class177.field2921.method170(512);
            }
            if (arg0.method1630(10, class18.field252)) {
                class249.field4143.method688(arg1 ^ 0x2E6B);
                class121.field2031.method531(-111);
                class177.field2921.method171(105);
            }
            if (arg0.method1630(10, class156.field2544)) {
                client.field5431 = true;
            }
            if (arg0.method1630(arg1 ^ 0x2E63, class10.field140)) {
                class80.method595(25, (byte) -128);
            }
            if (arg0.method1630(10, class329.field5598)) {
                class54.field785 = true;
            }
            if (arg0.method1630(10, class44.field678)) {
                class54.field785 = false;
            }
            if (arg0.method1630(10, class36.field589)) {
                class168.method1229(-1, false, (byte) -98, -1, 0);
            }
            if (arg0.method1630(10, class224.field3682)) {
                class168.method1229(-1, false, (byte) -124, -1, 1);
            }
            if (arg0.method1630(10, class26.field357)) {
                class168.method1229(-1, false, (byte) 67, -1, 2);
            }
            if (arg0.method1630(10, class225.field3703)) {
                class168.method1229(1024, false, (byte) 60, 768, 3);
            }
            if (arg0.method1630(10, class252.field4211)) {
                for (int var10 = 0; var10 < 4; var10++) {
                    for (int var11 = 1; var11 < 103; var11++) {
                        for (int var12 = 1; var12 < 103; var12++) {
                            class160.field2592[var10].field1828[var11][var12] = 0;
                        }
                    }
                }
            }
            if (arg0.method1614((byte) 123, class282.field4673) && class112.field1900 != 0) {
                class331.method2269((byte) -45, arg0.method1640(6, arg1 ^ 0xFFFFD1ED).method1619(10));
            }
            if (arg0.method1630(10, class262.field4382) && class112.field1900 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method1614((byte) 82, class15.field180)) {
                class114.field1934 = arg0.method1640(12, -109).method1638((byte) 47).method1619(10);
                class205.method1439(class248.method1746(arg1 ^ 0xF39, new class229[] { class174.field2833, class50.method354(0, class114.field1934) }), true, 0, (class229) null);
            }
            if (arg0.method1630(10, class43.field663)) {
                class40.field647 = true;
            }
        }
        class8.field100++;
        class121.field2033.method37(83, 102);
        class121.field2033.method1188(arg1 ^ 0xFFFFD1D9, arg0.method1642(-122) - 1);
        class121.field2033.method1194(arg1 ^ 0xFFFFFD79, arg0.method1640(2, -105));
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BIII[I)V", line = 336)
    public static final void method1354(byte arg0, int arg1, int arg2, int arg3, int[] arg4) {
        arg2--;
        field3191++;
        if (arg0 != -37) {
            return;
        }
        int var6 = arg1 - 1;
        int var5 = var6 - 7;
        while (var5 > arg2) {
            int var7 = arg2 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg2 = var13 + 1;
            arg4[arg2] = arg3;
        }
        while (var6 > arg2) {
            arg2++;
            arg4[arg2] = arg3;
        }
    }
}
