import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class30 implements Runnable {

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "[Lqe;")
    public static class168[] field365 = new class168[200];

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field367 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lqe;")
    public static class168 field362 = class66.method448("Lade Sprites )2 ", -112);

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "[I")
    public static int[] field369;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B[S[Lqe;)V")
    public static final void method196(byte arg0, short[] arg1, class168[] arg2) {
        class191.method1243((byte) -75, arg2.length - 1, arg1, arg2, 0);
        field363++;
        if (arg0 < 40) {
            field365 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lcg;")
    public static final class7 method197(Throwable arg0, String arg1) {
        field364++;
        class7 var2;
        if (arg0 instanceof class7) {
            var2 = (class7) arg0;
            var2.field81 = var2.field81 + ' ' + arg1;
        } else {
            var2 = new class7(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III[[[BIBII)V")
    public static final void method198(int arg0, int arg1, int arg2, byte[][][] arg3, int arg4, byte arg5, int arg6, int arg7) {
        class129.field2266++;
        class86.field1342 = 0;
        int var8 = arg6 - 16;
        int var9 = arg6 + 16;
        int var10 = arg7 - 16;
        int var11 = arg7 + 16;
        for (int var12 = class116.field1902; var12 < class89.field1395; var12++) {
            class177[][] var38 = class254.field4395[var12];
            for (int var39 = class29.field347; var39 < class107.field1716; var39++) {
                for (int var40 = class206.field3585; var40 < class150.field2614; var40++) {
                    class177 var41 = var38[var39][var40];
                    if (var41 != null) {
                        if (var41.field3095 <= class6.field69 && class197.field3416[var39 + class84.field1280 - class193.field3371][var40 + class84.field1280 - class62.field848] && (arg3 == null || var12 < arg4 || arg3[var12][var39][var40] != arg5)) {
                            var41.field3104 = true;
                            var41.field3094 = true;
                            if (var41.field3115 > 0) {
                                var41.field3112 = true;
                            } else {
                                var41.field3112 = false;
                            }
                            class86.field1342++;
                        } else {
                            var41.field3104 = false;
                            var41.field3094 = false;
                            var41.field3111 = 0;
                            if (var39 >= var8 && var39 <= var9 && var40 >= var10 && var40 <= var11) {
                                if (var41.field3116 != null) {
                                    class162 var42 = var41.field3116;
                                    var42.field2775.method47(var42.field2768, var42.field2768, var42.field2772, var42.field2772, (byte) -83);
                                    if (var42.field2777 != null) {
                                        var42.field2777.method47(var42.field2768, var42.field2768, var42.field2772, var42.field2772, (byte) -83);
                                    }
                                }
                                if (var41.field3103 != null) {
                                    class199 var43 = var41.field3103;
                                    var43.field3446.method47(var43.field3439, var43.field3439, var43.field3431, var43.field3431, (byte) -83);
                                    if (var43.field3441 != null) {
                                        var43.field3441.method47(var43.field3439, var43.field3439, var43.field3431, var43.field3431, (byte) -83);
                                    }
                                }
                                if (var41.field3101 != null) {
                                    class17 var44 = var41.field3101;
                                    var44.field153.method47(var44.field147, var44.field147, var44.field150, var44.field150, (byte) -83);
                                }
                                if (var41.field3090 != null) {
                                    for (int var45 = 0; var45 < var41.field3115; var45++) {
                                        class169 var46 = var41.field3090[var45];
                                        var46.field2934.method47(var46.field2932, var46.field2939, var46.field2936, var46.field2923, (byte) -83);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        boolean var13 = class23.field275 == class150.field2603;
        for (int var14 = class116.field1902; var14 < class89.field1395; var14++) {
            class177[][] var27 = class254.field4395[var14];
            for (int var28 = -class84.field1280; var28 <= 0; var28++) {
                int var29 = class193.field3371 + var28;
                int var30 = class193.field3371 - var28;
                if (var29 >= class29.field347 || var30 < class107.field1716) {
                    for (int var31 = -class84.field1280; var31 <= 0; var31++) {
                        int var32 = class62.field848 + var31;
                        int var33 = class62.field848 - var31;
                        if (var29 >= class29.field347) {
                            if (var32 >= class206.field3585) {
                                class177 var34 = var27[var29][var32];
                                if (var34 != null && var34.field3104) {
                                    class97.method638(var34, true);
                                }
                            }
                            if (var33 < class150.field2614) {
                                class177 var35 = var27[var29][var33];
                                if (var35 != null && var35.field3104) {
                                    class97.method638(var35, true);
                                }
                            }
                        }
                        if (var30 < class107.field1716) {
                            if (var32 >= class206.field3585) {
                                class177 var36 = var27[var30][var32];
                                if (var36 != null && var36.field3104) {
                                    class97.method638(var36, true);
                                }
                            }
                            if (var33 < class150.field2614) {
                                class177 var37 = var27[var30][var33];
                                if (var37 != null && var37.field3104) {
                                    class97.method638(var37, true);
                                }
                            }
                        }
                        if (class86.field1342 == 0) {
                            if (!var13) {
                                class187.field3292 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        for (int var15 = class116.field1902; var15 < class89.field1395; var15++) {
            class177[][] var16 = class254.field4395[var15];
            for (int var17 = -class84.field1280; var17 <= 0; var17++) {
                int var18 = class193.field3371 + var17;
                int var19 = class193.field3371 - var17;
                if (var18 >= class29.field347 || var19 < class107.field1716) {
                    for (int var20 = -class84.field1280; var20 <= 0; var20++) {
                        int var21 = class62.field848 + var20;
                        int var22 = class62.field848 - var20;
                        if (var18 >= class29.field347) {
                            if (var21 >= class206.field3585) {
                                class177 var23 = var16[var18][var21];
                                if (var23 != null && var23.field3104) {
                                    class97.method638(var23, false);
                                }
                            }
                            if (var22 < class150.field2614) {
                                class177 var24 = var16[var18][var22];
                                if (var24 != null && var24.field3104) {
                                    class97.method638(var24, false);
                                }
                            }
                        }
                        if (var19 < class107.field1716) {
                            if (var21 >= class206.field3585) {
                                class177 var25 = var16[var19][var21];
                                if (var25 != null && var25.field3104) {
                                    class97.method638(var25, false);
                                }
                            }
                            if (var22 < class150.field2614) {
                                class177 var26 = var16[var19][var22];
                                if (var26 != null && var26.field3104) {
                                    class97.method638(var26, false);
                                }
                            }
                        }
                        if (class86.field1342 == 0) {
                            if (!var13) {
                                class187.field3292 = false;
                            }
                            return;
                        }
                    }
                }
            }
        }
        class187.field3292 = false;
    }

    @OriginalMember(owner = "client!tc", name = "run", descriptor = "()V")
    public final void run() {
        field368++;
        try {
            while (true) {
                class47 var1 = class169.field2941;
                class19 var2;
                synchronized (class169.field2941) {
                    var2 = (class19) class169.field2941.method315(-31594);
                }
                if (var2 == null) {
                    class38.method259(100L, 31644);
                    Object var3 = class229.field3882;
                    synchronized (class229.field3882) {
                        if (class154.field2676 <= 1) {
                            class154.field2676 = 0;
                            class229.field3882.notifyAll();
                            return;
                        }
                        class154.field2676--;
                    }
                } else {
                    if (var2.field230 == 0) {
                        var2.field229.method1332(-24647, var2.field237.length, (int) var2.field3308, var2.field237);
                        class47 var5 = class169.field2941;
                        synchronized (class169.field2941) {
                            var2.method1234(17216);
                        }
                    } else if (var2.field230 == 1) {
                        var2.field237 = var2.field229.method1334(0, (int) var2.field3308);
                        class47 var4 = class169.field2941;
                        synchronized (class169.field2941) {
                            class255.field4426.method311((byte) 16, var2);
                        }
                    }
                    Object var6 = class229.field3882;
                    synchronized (class229.field3882) {
                        if (class154.field2676 <= 1) {
                            class154.field2676 = 0;
                            class229.field3882.notifyAll();
                            return;
                        }
                        class154.field2676 = 600;
                    }
                }
            }
        } catch (Exception var17) {
            class112.method763(var17, null, 121);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)[Lgd;")
    public static final class65[] method199(int arg0) {
        if (arg0 != 600) {
            method198(-65, 98, -94, null, -45, (byte) -91, -53, -7);
        }
        field366++;
        class65[] var1 = new class65[class85.field1331];
        for (int var2 = 0; var2 < class85.field1331; var2++) {
            int var3 = class85.field1332[var2] * class69.field978[var2];
            byte[] var4 = class7.field84[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class92.field1457[class86.method571(var4[var6], 255)];
            }
            var1[var2] = new class15(class243.field4225, class150.field2597, class33.field415[var2], class54.field746[var2], class85.field1332[var2], class69.field978[var2], var5);
        }
        class246.method1613(0);
        return var1;
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Lqe;Z)V")
    public static final void method200(class168 arg0, boolean arg1) {
        field361++;
        class131.field2314 = arg0;
        class166.method1064((byte) 93);
        if (arg1) {
            method199(21);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V")
    public static void method201(byte arg0) {
        field365 = null;
        field362 = null;
        field369 = null;
        if (arg0 != 47) {
            method199(71);
        }
    }
}
