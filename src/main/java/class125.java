import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class125 extends class222 {

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "[I")
    public static int[] field2215 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Lcf;")
    public static class93 field2224 = class147.method1066("::replacecanvas", -48);

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field2225;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Lt;")
    public static class197 field2220;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "[I")
    public static int[] field2223;

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public static final void method915(byte arg0) {
        field2219++;
        if (arg0 > -94) {
            method921(1);
        }
        class216.field3930.method294(0);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method916(int arg0, String arg1, String arg2, String arg3) {
        field2226++;
        for (int var4 = arg1.indexOf(arg3); var4 != -1; var4 = arg1.indexOf(arg3, var4 + arg2.length())) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(var4 + arg3.length());
        }
        if (arg0 != 0) {
            method917((byte) -26);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
    public static void method917(byte arg0) {
        field2220 = null;
        field2215 = null;
        field2224 = null;
        if (arg0 == -60) {
            field2223 = null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(II)V")
    public class125(int arg0, int arg1) {
        this.field2217 = arg1;
        this.field2222 = arg0;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
    public static final void method918(boolean arg0, int arg1) {
        field2216++;
        if (class249.field4484 != arg0) {
            int var2 = -2 / ((arg1 + 38) / 63);
            class249.field4484 = arg0;
            class9.method42(-10);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)V")
    public static final void method919(int arg0, int arg1) {
        if (arg0 <= 67) {
            field2220 = null;
        }
        field2218++;
        if (class146.method1062((byte) -103, arg1)) {
            class93.method684(-24845, -1, class6.field82[arg1]);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIIIII)V")
    public static final void method920(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2225++;
        if (class212.field3894 == arg3 && class15.field188 == arg0 && class47.field767 == arg2 || class13.method57(2357)) {
            return;
        }
        class15.field188 = arg0;
        class212.field3894 = arg3;
        class47.field767 = arg2;
        if (class13.method57(2357)) {
            class47.field767 = 0;
        }
        if (arg1) {
            class19.method88(28, false);
        } else {
            class19.method88(25, false);
        }
        class30.method175((byte) 1, true, class200.field3635);
        int var7 = class229.field4111;
        class229.field4111 = (arg3 - 6) * 8;
        int var8 = class4.field52;
        class4.field52 = arg0 * 8 - 48;
        class53.field873 = class105.method760(class212.field3894 * arg4, class15.field188 * 8, arg4 + 2040);
        int var9 = class4.field52 - var8;
        int var10 = class229.field4111 - var7;
        int var11 = class4.field52;
        class51.field837 = null;
        int var12 = class229.field4111;
        if (arg1) {
            class72.field1299 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class227 var14 = class155.field2709[var13];
                if (var14 != null) {
                    var14.field3784 -= var9 * 128;
                    var14.field3868 -= var10 * 128;
                    if (var14.field3868 >= 0 && var14.field3868 <= 13184 && var14.field3784 >= 0 && var14.field3784 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field3805[var15] -= var10;
                            var14.field3820[var15] -= var9;
                        }
                        class58.field995[class72.field1299++] = var13;
                    } else {
                        class155.field2709[var13].method1561((class145) null, 14579);
                        class155.field2709[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class227 var32 = class155.field2709[var16];
                if (var32 != null) {
                    for (int var33 = 0; var33 < 10; var33++) {
                        var32.field3805[var33] -= var10;
                        var32.field3820[var33] -= var9;
                    }
                    var32.field3868 -= var10 * 128;
                    var32.field3784 -= var9 * 128;
                }
            }
        }
        for (int var17 = 0; var17 < 2048; var17++) {
            class237 var30 = class224.field4031[var17];
            if (var30 != null) {
                for (int var31 = 0; var31 < 10; var31++) {
                    var30.field3805[var31] -= var10;
                    var30.field3820[var31] -= var9;
                }
                var30.field3868 -= var10 * 128;
                var30.field3784 -= var9 * 128;
            }
        }
        byte var18 = 0;
        class138.field2405 = arg2;
        class166.field2927.method1614((byte) -59, arg6, false, arg5);
        byte var19 = 104;
        byte var20 = 1;
        if (var10 < 0) {
            var20 = -1;
            var18 = 103;
            var19 = -1;
        }
        byte var21 = 0;
        byte var22 = 1;
        byte var23 = 104;
        if (var9 < 0) {
            var23 = -1;
            var21 = 103;
            var22 = -1;
        }
        for (int var24 = var18; var24 != var19; var24 += var20) {
            for (int var26 = var21; var26 != var23; var26 += var22) {
                int var27 = var24 + var10;
                int var28 = var26 + var9;
                for (int var29 = 0; var29 < 4; var29++) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104) {
                        class109.field1858[var29][var24][var26] = class109.field1858[var29][var27][var28];
                    } else {
                        class109.field1858[var29][var24][var26] = null;
                    }
                }
            }
        }
        for (class53 var25 = (class53) class284.field5093.method1151(arg4 ^ 0x63); var25 != null; var25 = (class53) class284.field5093.method1159(58)) {
            var25.field879 -= var9;
            var25.field883 -= var10;
            if (var25.field883 < 0 || var25.field879 < 0 || var25.field883 >= 104 || var25.field879 >= 104) {
                var25.method1544((byte) -44);
            }
        }
        class145.field2518 = -1;
        if (arg1) {
            class127.field2248 -= var9;
            class165.field2919 -= var9 * 128;
            class167.field2952 -= var9;
            class166.field2925 -= var10 * 128;
            class109.field1862 -= var10;
            class188.field3458 -= var10;
        } else {
            class18.field234 = 1;
        }
        class272.field4839 = 0;
        if (class55.field908 != 0) {
            class55.field908 -= var10;
            class269.field4802 -= var9;
        }
        class11.field152.method1153((byte) -6);
        class156.field2744.method1153((byte) -6);
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)V")
    public static final void method921(int arg0) {
        field2221++;
        if (arg0 == 26310 && class68.field1239 == 5) {
            class68.field1239 = 6;
        }
    }
}
