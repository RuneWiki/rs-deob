import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class10 implements Runnable {

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field183 = 0;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field179 = 0;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Z")
    public static boolean field184 = true;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Luj;")
    public static class156 field182 = new class156();

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field191 = 0;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "[I")
    public static int[] field192 = new int[2];

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field181;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field186;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Ltj;")
    public static class27 field190;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIII)I", line = 9)
    public static final int method102(int arg0, int arg1, int arg2, int arg3) {
        field187++;
        int var4 = 103 % ((arg0 - 22) / 40);
        int var5 = arg3 & 0x3;
        if (var5 == 0) {
            return arg1;
        } else if (var5 == 1) {
            return 1023 - arg2;
        } else if (var5 == 2) {
            return 1023 - arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V", line = 36)
    public static final void method103(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field181++;
        if (class198.field3166 < 100) {
            class289.method1925((byte) -86);
        }
        class121.method804(arg4, arg3, arg2 + arg4, arg0 + arg3);
        if (class198.field3166 < 100) {
            byte var14 = 20;
            int var15 = arg2 / 2 + arg4;
            int var16 = arg3 + arg0 / 2 - var14 - 18;
            class121.method811(arg4, arg3, arg2, arg0, 0);
            class121.method813(var15 - 152, var16, 304, 34, 9179409);
            class121.method813(var15 - 151, var16 + 1, 302, 32, 0);
            class121.method811(var15 - 150, var16 + 2, class198.field3166 * 3, 30, 9179409);
            class121.method811(class198.field3166 * 3 + var15 - 150, var16 + 2, 300 - (class198.field3166 * 3), 30, 0);
            class110.field1683.method1835(class19.field254, var15, var14 + var16, 16777215, -1);
            return;
        }
        class8.field164 = (int) ((double) (arg2 * 2) / class285.field4707);
        class76.field1189 = class162.field2561 - ((int) ((double) arg0 / class285.field4707));
        int var5 = class162.field2561 - ((int) ((double) arg0 / class285.field4707));
        class56.field903 = (int) ((double) (arg0 * 2) / class285.field4707);
        int var6 = class257.field4133 - (int) ((double) arg2 / class285.field4707);
        int var7 = (int) ((double) arg0 / class285.field4707) + class162.field2561;
        int var8 = (int) ((double) arg2 / class285.field4707) + class257.field4133;
        class243.field3907 = class257.field4133 - ((int) ((double) arg2 / class285.field4707));
        if (class237.field3803 == null || class237.field3803.field1347 != arg2 || class237.field3803.field1345 != arg0) {
            class237.field3803 = new class235(arg2, arg0);
        }
        class286.method1920(class237.field3803.field652, arg2, arg0);
        class285.method1907(0, 0, var6, var8, arg0, arg2, var7, 113, var5);
        class205.method1295(0, var7, (byte) -85, var8, var5, 0, var6, arg0, arg2);
        class237.field3803.method143(arg4, arg3);
        if (arg1 != 11755) {
            method104(-51);
        }
        if (class25.field380 > 0) {
            class25.field380--;
        }
        if (!class106.field1618) {
            return;
        }
        int var9 = arg2 + arg4 - 5;
        int var10 = arg3 - (8 - arg0);
        class8.field167.method1847(class170.method1074(new class119[] { class108.field1658, class234.method1506(class81.field1234, (byte) -79) }, -77), var9, var10, 16776960, -1);
        int var17 = var10 - 15;
        Runtime var11 = Runtime.getRuntime();
        int var12 = (int) ((var11.totalMemory() - var11.freeMemory()) / 1024L);
        int var13 = 16776960;
        if (var12 > 65536) {
            var13 = 16711680;
        }
        class8.field167.method1847(class170.method1074(new class119[] { class24.field367, class234.method1506(var12, (byte) -79), class101.field1533 }, arg1 ^ 0xFFFFD271), var9, var17, var13, -1);
        var10 = var17 - 15;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V", line = 130)
    public static void method104(int arg0) {
        field192 = null;
        field190 = null;
        if (arg0 != 100) {
            field190 = (class27) null;
        }
        field182 = null;
    }

    @OriginalMember(owner = "client!ce", name = "run", descriptor = "()V", line = 143)
    public final void run() {
        field180++;
        try {
            while (true) {
                class156 var1 = class82.field1256;
                class210 var2;
                synchronized (class82.field1256) {
                    var2 = (class210) class82.field1256.method995(1836596936);
                }
                if (var2 == null) {
                    class232.method1493(100L, (byte) -51);
                    Object var4 = class164.field2583;
                    synchronized (class164.field2583) {
                        if (class163.field2578 <= 1) {
                            class163.field2578 = 0;
                            class164.field2583.notifyAll();
                            return;
                        }
                        class163.field2578--;
                    }
                } else {
                    if (var2.field3349 == 0) {
                        var2.field3359.method540(var2.field3354.length, (int) var2.field1218, (byte) 45, var2.field3354);
                        class156 var6 = class82.field1256;
                        synchronized (class82.field1256) {
                            var2.method552((byte) 82);
                        }
                    } else if (var2.field3349 == 1) {
                        var2.field3354 = var2.field3359.method541(255, (int) var2.field1218);
                        class156 var8 = class82.field1256;
                        synchronized (class82.field1256) {
                            class299.field5052.method999(var2, (byte) -108);
                        }
                    }
                    Object var10 = class164.field2583;
                    synchronized (class164.field2583) {
                        if (class163.field2578 <= 1) {
                            class163.field2578 = 0;
                            class164.field2583.notifyAll();
                            return;
                        }
                        class163.field2578 = 600;
                    }
                }
            }
        } catch (Exception var18) {
            class87.method591((String) null, var18, 58);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIIIIZ)V", line = 223)
    public static final void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field185++;
        if (class177.field2816 == arg0 && class55.field884 == arg2 && class119.field1862 == arg1 || class64.method479(301989888)) {
            return;
        }
        class55.field884 = arg2;
        class119.field1862 = arg1;
        class177.field2816 = arg0;
        if (class64.method479(301989888)) {
            class119.field1862 = 0;
        }
        if (arg6) {
            class204.method1289(-122, 28);
        } else {
            class204.method1289(arg4 ^ 0x42, 25);
        }
        class142.method930(true, class244.field3961, 250);
        int var7 = class189.field2995;
        int var8 = class30.field421;
        class189.field2995 = (arg2 - 6) * 8;
        class30.field421 = (arg0 - 6) * 8;
        int var9 = class30.field421 - var8;
        int var10 = class30.field421;
        int var11 = class189.field2995 - var7;
        int var12 = class189.field2995;
        if (arg6) {
            class157.field2499 = 0;
            for (int var13 = 0; var13 < 32768; var13++) {
                class163 var14 = class70.field1103[var13];
                if (var14 != null) {
                    var14.field4949 -= var9 * 128;
                    var14.field4991 -= var11 * 128;
                    if (var14.field4949 >= 0 && var14.field4949 <= 13184 && var14.field4991 >= 0 && var14.field4991 <= 13184) {
                        for (int var15 = 0; var15 < 10; var15++) {
                            var14.field4963[var15] -= var9;
                            var14.field4973[var15] -= var11;
                        }
                        class23.field348[class157.field2499++] = var13;
                    } else {
                        class70.field1103[var13].field2575 = null;
                        class70.field1103[var13] = null;
                    }
                }
            }
        } else {
            for (int var16 = 0; var16 < 32768; var16++) {
                class163 var17 = class70.field1103[var16];
                if (var17 != null) {
                    for (int var18 = 0; var18 < 10; var18++) {
                        var17.field4963[var18] -= var9;
                        var17.field4973[var18] -= var11;
                    }
                    var17.field4949 -= var9 * 128;
                    var17.field4991 -= var11 * 128;
                }
            }
        }
        for (int var19 = 0; var19 < 2048; var19++) {
            class292 var20 = class23.field346[var19];
            if (var20 != null) {
                for (int var21 = 0; var21 < 10; var21++) {
                    var20.field4963[var21] -= var9;
                    var20.field4973[var21] -= var11;
                }
                var20.field4991 -= var11 * 128;
                var20.field4949 -= var9 * 128;
            }
        }
        field189 = arg1;
        byte var22 = 0;
        class124.field1917.method1982(arg3, 7, arg5, false);
        byte var23 = 1;
        byte var24 = 104;
        int var25 = arg4;
        if (var9 < 0) {
            var25 = -1;
            var22 = 103;
            var23 = -1;
        }
        byte var26 = 0;
        byte var27 = 1;
        if (var11 < 0) {
            var26 = 103;
            var24 = -1;
            var27 = -1;
        }
        for (int var28 = var22; var28 != var25; var28 += var23) {
            for (int var29 = var26; var29 != var24; var29 += var27) {
                int var30 = var29 + var11;
                int var31 = var9 + var28;
                for (int var32 = 0; var32 < 4; var32++) {
                    if (var31 >= 0 && var30 >= 0 && var31 < 104 && var30 < 104) {
                        class240.field3841[var32][var28][var29] = class240.field3841[var32][var31][var30];
                    } else {
                        class240.field3841[var32][var28][var29] = null;
                    }
                }
            }
        }
        for (class129 var33 = (class129) class87.field1318.method995(arg4 + 1836596832); var33 != null; var33 = (class129) class87.field1318.method996(0)) {
            var33.field1988 -= var11;
            var33.field1975 -= var9;
            if (var33.field1975 < 0 || var33.field1988 < 0 || var33.field1975 >= 104 || var33.field1988 >= 104) {
                var33.method552((byte) -122);
            }
        }
        if (arg6) {
            class266.field4364 -= var11;
            class234.field3775 -= var9;
            class232.field3743 -= var11;
            class81.field1247 -= var9;
        } else {
            class68.field1063 = 1;
        }
        class74.field1154 = 0;
        if (class244.field3952 != 0) {
            class244.field3952 -= var9;
            class68.field1059 -= var11;
        }
        if (arg6 && (Math.abs(var9) > 104 || Math.abs(var11) > 104)) {
            class59.method439(arg4 - 103);
        }
        class262.field4252 = -1;
        field182.method1001(-102);
        class147.field2355.method1001(97);
    }
}
