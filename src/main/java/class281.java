import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class281 extends class176 {

    @OriginalMember(owner = "client!bm", name = "C", descriptor = "I")
    private int field4854 = -32768;

    @OriginalMember(owner = "client!bm", name = "q", descriptor = "I")
    public static int field4842 = 0;

    @OriginalMember(owner = "client!bm", name = "r", descriptor = "[J")
    public static long[] field4843 = new long[500];

    @OriginalMember(owner = "client!bm", name = "A", descriptor = "Ltl;")
    public static class59 field4852 = class85.method639("Liste der Welten geladen", 9588);

    @OriginalMember(owner = "client!bm", name = "y", descriptor = "I")
    public static int field4850 = 0;

    @OriginalMember(owner = "client!bm", name = "x", descriptor = "Ltl;")
    public static class59 field4849 = class85.method639("cookiehost", 9588);

    @OriginalMember(owner = "client!bm", name = "B", descriptor = "Ltl;")
    public static class59 field4853 = class85.method639("Untersuchen", 9588);

    @OriginalMember(owner = "client!bm", name = "u", descriptor = "Ltl;")
    public static class59 field4846 = class85.method639("(Udns", 9588);

    @OriginalMember(owner = "client!bm", name = "D", descriptor = "J")
    public static volatile long field4855 = 0L;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field4839;

    @OriginalMember(owner = "client!bm", name = "o", descriptor = "I")
    public static int field4840;

    @OriginalMember(owner = "client!bm", name = "p", descriptor = "I")
    public static int field4841;

    @OriginalMember(owner = "client!bm", name = "s", descriptor = "I")
    public static int field4844;

    @OriginalMember(owner = "client!bm", name = "t", descriptor = "I")
    public int field4845;

    @OriginalMember(owner = "client!bm", name = "v", descriptor = "I")
    public static int field4847;

    @OriginalMember(owner = "client!bm", name = "w", descriptor = "I")
    public int field4848;

    @OriginalMember(owner = "client!bm", name = "z", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "()V", line = 3)
    public static final void method1975() {
        class255.field4234 = 0;
        label194: for (int var0 = 0; var0 < class254.field4220; var0++) {
            class86 var1 = class269.field4671[var0];
            if (class316.field5329 != null) {
                for (int var2 = 0; var2 < class316.field5329.length; var2++) {
                    if (class316.field5329[var2] != -1000000 && (var1.field1352 <= class316.field5329[var2] || var1.field1364 <= class316.field5329[var2]) && (var1.field1365 <= class245.field4077[var2] || var1.field1363 <= class245.field4077[var2]) && (var1.field1365 >= class31.field433[var2] || var1.field1363 >= class31.field433[var2]) && (var1.field1355 <= class162.field2628[var2] || var1.field1368 <= class162.field2628[var2]) && (var1.field1355 >= class129.field2143[var2] || var1.field1368 >= class129.field2143[var2])) {
                        continue label194;
                    }
                }
            }
            if (var1.field1367 == 1) {
                int var3 = var1.field1354 + class286.field4918 - class33.field469;
                if (var3 >= 0 && var3 <= class286.field4918 + class286.field4918) {
                    int var4 = var1.field1351 + class286.field4918 - class88.field1390;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field1359 + class286.field4918 - class88.field1390;
                    if (var5 > class286.field4918 + class286.field4918) {
                        var5 = class286.field4918 + class286.field4918;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class292.field4994[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class235.field3901 - var1.field1365;
                        if (var7 > 32) {
                            var1.field1348 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field1348 = 2;
                            var7 = -var7;
                        }
                        var1.field1356 = (var1.field1355 - class70.field1073 << 8) / var7;
                        var1.field1366 = (var1.field1368 - class70.field1073 << 8) / var7;
                        var1.field1346 = (var1.field1352 - class189.field3158 << 8) / var7;
                        var1.field1344 = (var1.field1364 - class189.field3158 << 8) / var7;
                        class154.field2517[class255.field4234++] = var1;
                    }
                }
            } else if (var1.field1367 == 2) {
                int var8 = var1.field1351 + class286.field4918 - class88.field1390;
                if (var8 >= 0 && var8 <= class286.field4918 + class286.field4918) {
                    int var9 = var1.field1354 + class286.field4918 - class33.field469;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field1369 + class286.field4918 - class33.field469;
                    if (var10 > class286.field4918 + class286.field4918) {
                        var10 = class286.field4918 + class286.field4918;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class292.field4994[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class70.field1073 - var1.field1355;
                        if (var12 > 32) {
                            var1.field1348 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field1348 = 4;
                            var12 = -var12;
                        }
                        var1.field1345 = (var1.field1365 - class235.field3901 << 8) / var12;
                        var1.field1358 = (var1.field1363 - class235.field3901 << 8) / var12;
                        var1.field1346 = (var1.field1352 - class189.field3158 << 8) / var12;
                        var1.field1344 = (var1.field1364 - class189.field3158 << 8) / var12;
                        class154.field2517[class255.field4234++] = var1;
                    }
                }
            } else if (var1.field1367 == 4) {
                int var13 = var1.field1352 - class189.field3158;
                if (var13 > 128) {
                    int var14 = var1.field1351 + class286.field4918 - class88.field1390;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field1359 + class286.field4918 - class88.field1390;
                    if (var15 > class286.field4918 + class286.field4918) {
                        var15 = class286.field4918 + class286.field4918;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field1354 + class286.field4918 - class33.field469;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field1369 + class286.field4918 - class33.field469;
                        if (var17 > class286.field4918 + class286.field4918) {
                            var17 = class286.field4918 + class286.field4918;
                        }
                        boolean var18 = false;
                        label166: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class292.field4994[var19][var20]) {
                                    var18 = true;
                                    break label166;
                                }
                            }
                        }
                        if (var18) {
                            var1.field1348 = 5;
                            var1.field1345 = (var1.field1365 - class235.field3901 << 8) / var13;
                            var1.field1358 = (var1.field1363 - class235.field3901 << 8) / var13;
                            var1.field1356 = (var1.field1355 - class70.field1073 << 8) / var13;
                            var1.field1366 = (var1.field1368 - class70.field1073 << 8) / var13;
                            class154.field2517[class255.field4234++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 235)
    public static void method1976(int arg0) {
        field4852 = null;
        field4853 = null;
        field4846 = null;
        field4849 = null;
        field4843 = null;
        if (arg0 > -7) {
            method1978(-89, 91);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(IIIIIIIIJ)V", line = 258)
    public final void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field4844++;
        class57 var11 = class81.method616(this.field4845, (byte) 25).method299(true, (class129) null, 0, this.field4848);
        if (var11 != null) {
            var11.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field4854 = var11.method152();
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "()I", line = 274)
    public final int method152() {
        field4841++;
        return this.field4854;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ILu;)V", line = 282)
    public static final void method1977(int arg0, class24 arg1) {
        if (arg1.field316 != null) {
            arg1.field316.field1809 = 0;
        }
        field4851++;
        arg1.field315 = false;
        class24 var2 = arg1.method156();
        if (arg0 == 31406) {
            while (var2 != null) {
                method1977(31406, var2);
                var2 = arg1.method158();
            }
        }
    }

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "(II)Lfb;", line = 310)
    public static final class218 method1978(int arg0, int arg1) {
        field4839++;
        class218 var2 = (class218) class215.field3505.method1006((long) arg0, 1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class259.field4331.method2042(26, arg0, (byte) -128);
        class218 var4 = new class218();
        if (var3 != null) {
            var4.method1508(-1, new class170(var3));
        }
        class215.field3505.method1008(var4, (long) arg0, arg1 + 1000000);
        if (arg1 != -1000000) {
            field4849 = (class59) null;
        }
        return var4;
    }
}
