import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class161 extends class200 {

    @OriginalMember(owner = "client!hd", name = "p", descriptor = "Lqe;")
    public static class168 field2762 = class66.method448("(U3", -111);

    @OriginalMember(owner = "client!hd", name = "m", descriptor = "Lhe;")
    public static class47 field2759 = new class47();

    @OriginalMember(owner = "client!hd", name = "s", descriptor = "I")
    public static int field2765 = 0;

    @OriginalMember(owner = "client!hd", name = "j", descriptor = "I")
    public static int field2756;

    @OriginalMember(owner = "client!hd", name = "k", descriptor = "I")
    public static int field2757;

    @OriginalMember(owner = "client!hd", name = "l", descriptor = "I")
    public static int field2758;

    @OriginalMember(owner = "client!hd", name = "n", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!hd", name = "o", descriptor = "I")
    public static int field2761;

    @OriginalMember(owner = "client!hd", name = "q", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!hd", name = "r", descriptor = "I")
    public static int field2764;

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V")
    public static final void method1044(int arg0) {
        field2758++;
        if (class179.field3156 != null) {
            class179.field3156.method1146(0);
        }
        if (class45.field587 != null) {
            class45.field587.method1146(0);
        }
        class77.method517(22050, 2, class247.field4284, true);
        class179.field3156 = class145.method981((byte) 96, class51.field686, class205.field3559, 22050, 0);
        class179.field3156.method1144(0, class233.field3965);
        class45.field587 = class145.method981((byte) -123, class51.field686, class205.field3559, 2048, arg0);
        class45.field587.method1144(arg0 - 1, class86.field1341);
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method1045(int arg0, int arg1, int arg2, long arg3) {
        class177 var5 = class254.field4395[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field3116 != null && var5.field3116.field2769 == arg3) {
            return true;
        } else if (var5.field3103 != null && var5.field3103.field3443 == arg3) {
            return true;
        } else if (var5.field3101 != null && var5.field3101.field148 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field3115; var6++) {
                if (var5.field3090[var6].field2937 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZIIII)V")
    public static final void method1046(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        if (!arg0) {
            field2757 = -54;
        }
        if (arg3 - arg1 >= class174.field3055 && arg1 + arg3 <= class249.field4314 && class222.field3811 <= arg2 - arg1 && arg1 + arg2 <= class196.field3402) {
            class198.method1269(126, arg2, arg3, arg4, arg1);
        } else {
            class223.method1458(5785, arg3, arg1, arg4, arg2);
        }
        field2756++;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Z)V")
    public static final void method1047(boolean arg0) {
        field2761++;
        if (!arg0) {
            method1049((byte) 36);
        }
        int var1 = class95.field1494.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class95.field1494[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class81.field1232; var4++) {
                    if (class138.field2429[var4] == class131.field2316[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class138.field2429[class81.field1232] = class131.field2316[var2];
                    var3 = class81.field1232++;
                }
                class112 var5 = new class112(class95.field1494[var2]);
                int var6 = 0;
                while (class95.field1494[var2].length > var5.field1821 && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method731(!arg0);
                    int var9 = var8 >> 7 & 0x3F;
                    int var10 = var8 & 0x3F;
                    int var11 = (class131.field2316[var2] >> 8) * 64 + var9 - class246.field4261;
                    int var12 = var8 >> 14;
                    int var13 = (class131.field2316[var2] & 0xFF) * 64 + var10 - class125.field2060;
                    class180 var14 = class74.method504(var5.method731(!arg0), (byte) -59);
                    if (class229.field3898[var7] == null && (var14.field3190 & 0x1) > 0 && class118.field1938 == var12 && var11 >= 0 && var11 + var14.field3189 < 104 && var13 >= 0 && var14.field3189 + var13 < 104) {
                        class229.field3898[var7] = new class222();
                        class222 var15 = class229.field3898[var7];
                        class51.field690[class82.field1244++] = var7;
                        var15.field165 = class133.field2326;
                        var15.field3814 = var14;
                        var15.field188 = var15.field3814.field3215;
                        var15.field224 = var15.field3814.field3165;
                        var15.field179 = var15.field3814.field3169;
                        var15.field196 = var15.field3814.field3163;
                        var15.field192 = var15.field3814.field3184;
                        var15.field204 = var15.field3814.field3195;
                        var15.field208 = var15.field3814.field3187;
                        var15.field171 = var15.field3814.field3189;
                        var15.field225 = var15.field3814.field3197;
                        if (var15.field179 == 0) {
                            var15.field194 = 0;
                        }
                        var15.method91(var11, -105, var13, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(B)V")
    public static void method1048(byte arg0) {
        field2759 = null;
        if (arg0 != -89) {
            method1047(true);
        }
        field2762 = null;
    }

    @OriginalMember(owner = "client!hd", name = "c", descriptor = "(B)V")
    public static final void method1049(byte arg0) {
        field2760++;
        try {
            if (class135.field2361 == 1) {
                int var1 = class114.field1866.method1315(arg0 + 69);
                if (var1 > 0 && class114.field1866.method1295(115)) {
                    int var2 = var1 - class96.field1514;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class114.field1866.method1319((byte) 118, var2);
                    return;
                }
                class114.field1866.method1322(false);
                class114.field1866.method1300(7394);
                class158.field2724 = null;
                if (class177.field3120 == null) {
                    class135.field2361 = 0;
                } else {
                    class135.field2361 = 2;
                }
                class138.field2435 = null;
            }
            if (arg0 != -69) {
                method1047(true);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class114.field1866.method1322(false);
            class138.field2435 = null;
            class135.field2361 = 0;
            class158.field2724 = null;
            class177.field3120 = null;
        }
    }
}
