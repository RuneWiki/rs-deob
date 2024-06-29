import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class150 {

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "[I")
    private int[] field2165;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field2160;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public static int field2161;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "I")
    public static int field2162;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field2163;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field2164;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field2166;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public static int field2167;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field2168;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)I")
    public final int method1010(int arg0, int arg1) {
        field2163++;
        if (arg0 != 9817) {
            this.field2165 = null;
        }
        int var3 = (this.field2165.length >> 1) - 1;
        int var4 = arg1 & var3;
        while (true) {
            int var5 = this.field2165[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field2165[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lve;B)V")
    public static final void method1011(class233 arg0, byte arg1) {
        class158.field2301 = class77.method509(arg0, class118.field1738, (byte) 124, 0);
        class42.field601 = class204.method1317(0, class90.field1375, arg0, -2740);
        field2168++;
        class274.field4395 = class204.method1317(0, class264.field3982, arg0, -2740);
        class16.field231 = class204.method1317(0, class72.field1109, arg0, -2740);
        class234.field3517 = class204.method1317(0, class267.field4143, arg0, -2740);
        class257.field3902 = class204.method1317(0, class108.field1564, arg0, -2740);
        class131.field1917 = class204.method1317(0, class24.field319, arg0, -2740);
        class27.field398 = class211.method1347(arg0, 0, 0, class52.field762);
        class285.field4533 = class111.method725(false, 0, arg0, class260.field3933);
        class64.field1016 = class111.method725(false, 0, arg0, class84.field1299);
        class142.field2056 = class33.method234(class223.field3332, false, 0, arg0);
        class158.field2290 = class33.method234(class53.field775, false, 0, arg0);
        class134.field1948.method1285(class158.field2290, (int[]) null);
        class258.field3914.method1285(class158.field2290, (int[]) null);
        class179.field2556.method1285(class158.field2290, (int[]) null);
        if (arg1 > -9) {
            return;
        }
        class244 var2 = class82.method546((byte) -20, class207.field2995, arg0, 0);
        var2.method1594();
        class145.field2077 = var2;
        class244[] var3 = class77.method509(arg0, class122.field1768, (byte) 99, 0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            var3[var4].method1594();
        }
        int var5 = (int) (Math.random() * 21.0D) - 10;
        class72.field1118 = var3;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 41.0D) - 20;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        for (int var9 = 0; var9 < class158.field2301.length; var9++) {
            class158.field2301[var9].method1598(var5 + var7, var6 + var7, var7 + var8);
        }
        class37.field556 = class158.field2301;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIB)V")
    public static final void method1012(int arg0, int arg1, int arg2, byte arg3) {
        field2161++;
        class270 var4 = class190.method1213(25702, arg1, 11);
        if (arg3 == 61) {
            var4.method1808((byte) 62);
            var4.field4226 = arg2;
            var4.field4230 = arg0;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)Z")
    public static final boolean method1013(byte arg0) {
        int var1 = 124 % ((arg0 - 54) / 62);
        field2160++;
        try {
            if (class184.field2620 == 2) {
                if (class225.field3377 == null) {
                    class225.field3377 = class36.method252(class154.field2255, class182.field2599, class43.field619);
                    if (class225.field3377 == null) {
                        return false;
                    }
                }
                if (class94.field1436 == null) {
                    class94.field1436 = new class158(class152.field2188, class176.field2503);
                }
                if (class138.field1995.method425(class225.field3377, 22050, (byte) -79, class94.field1436, class13.field209)) {
                    class138.field1995.method430((byte) 100);
                    class138.field1995.method411((byte) -121, class70.field1098);
                    class138.field1995.method402(class225.field3377, class224.field3353, 8327696);
                    class154.field2255 = null;
                    class184.field2620 = 0;
                    class225.field3377 = null;
                    class94.field1436 = null;
                    return true;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
            class138.field1995.method421((byte) 109);
            class184.field2620 = 0;
            class225.field3377 = null;
            class154.field2255 = null;
            class94.field1436 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIII)V")
    public static final void method1014(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class183.method1181(arg4, (byte) -69, arg1 + arg2, class163.field2370[arg3], arg1 - arg2);
        field2162++;
        if (arg0 != 21) {
            return;
        }
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class163.field2370[arg3 + var6];
                int var10 = arg1 + var5;
                int var11 = arg1 - var5;
                int[] var12 = class163.field2370[arg3 - var6];
                class183.method1181(arg4, (byte) -69, var10, var9, var11);
                class183.method1181(arg4, (byte) -69, var10, var12, var11);
            }
            int var13 = arg1 + var6;
            int var14 = arg1 - var6;
            int[] var15 = class163.field2370[arg3 + var5];
            int[] var16 = class163.field2370[arg3 - var5];
            class183.method1181(arg4, (byte) -69, var13, var15, var14);
            class183.method1181(arg4, (byte) -69, var13, var16, var14);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "([I)V")
    public class150(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= arg0.length + (arg0.length >> 1); var2 <<= 0x1) {
        }
        this.field2165 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field2165[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2165[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2165[var5 + var5] = arg0[var4];
            this.field2165[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lve;Lve;Lve;Lv;I)Z")
    public static final boolean method1015(class233 arg0, class233 arg1, class233 arg2, class61 arg3, int arg4) {
        if (arg4 != 10) {
            return true;
        }
        class176.field2503 = arg2;
        class13.field209 = arg1;
        field2166++;
        class152.field2188 = arg0;
        class138.field1995 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(III)V")
    public static final void method1016(int arg0, int arg1, int arg2) {
        field2164++;
        if (arg0 != 1425091048) {
            return;
        }
        short var3 = 256;
        if (class227.field3406 > 0) {
            class153.method1038(7472, class227.field3406);
            class227.field3406 = 0;
        }
        int var4 = 0;
        int var5 = class144.field2068 * arg1;
        int var6 = 0;
        for (int var7 = 1; var7 < var3 - 1; var7++) {
            int var8 = (var3 - var7) * class264.field3983[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var11 = class191.field2727[var4++];
                int var12 = class144.field2070[arg2 + var5++];
                if (var11 == 0) {
                    class151.field2176.field3663[var6++] = var12;
                } else {
                    int var13 = var11 + 18;
                    int var14 = 238 - var11;
                    int var15 = class19.field265[var11];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    class151.field2176.field3663[var6++] = class184.method1188(16711680, class184.method1188(65280, var12) * var14 + var13 * class184.method1188(var15, 65280)) + class184.method1188(-16711936, class184.method1188(var12, 16711935) * var14 + var13 * class184.method1188(var15, 16711935)) >> 8;
                }
            }
            for (int var10 = 0; var10 < var8; var10++) {
                class151.field2176.field3663[var6++] = class144.field2070[arg2 + var5++];
            }
            var5 += class144.field2068 - 128;
        }
        class151.field2176.method473(arg2, arg1);
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ZI)V")
    public static final void method1017(boolean arg0, int arg1) {
        class13.field203.method258(arg1, (byte) 67);
        field2167++;
        if (arg0) {
            method1013((byte) 65);
        }
        class232.field3468.method258(arg1, (byte) 53);
    }
}
