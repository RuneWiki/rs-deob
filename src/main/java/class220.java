import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class220 extends class390 implements Runnable {

    @OriginalMember(owner = "client!tm", name = "s", descriptor = "Z")
    private boolean field3164 = true;

    @OriginalMember(owner = "client!tm", name = "z", descriptor = "I")
    public int field3171 = -1;

    @OriginalMember(owner = "client!tm", name = "x", descriptor = "Ldn;")
    private class302 field3169;

    @OriginalMember(owner = "client!tm", name = "p", descriptor = "Lpm;")
    public static class349 field3161 = new class349("flash3:", "blinken3:", "clignotant3:", "brilho3:");

    @OriginalMember(owner = "client!tm", name = "r", descriptor = "[Ljava/lang/String;")
    public static String[] field3163 = null;

    @OriginalMember(owner = "client!tm", name = "w", descriptor = "I")
    public static int field3168 = 2;

    @OriginalMember(owner = "client!tm", name = "n", descriptor = "I")
    public static int field3159;

    @OriginalMember(owner = "client!tm", name = "o", descriptor = "I")
    public static int field3160;

    @OriginalMember(owner = "client!tm", name = "t", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!tm", name = "u", descriptor = "I")
    public static int field3166;

    @OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
    public static int field3167;

    @OriginalMember(owner = "client!tm", name = "y", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!tm", name = "A", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!tm", name = "q", descriptor = "Ljava/lang/String;")
    public static String field3162;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(II)V", line = 13)
    public static final void method1548(int arg0, int arg1) {
        if (arg0 != 0) {
            return;
        }
        for (class425 var2 = class166.field2374.method1383(arg0 ^ 0x71); var2 != null; var2 = class166.field2374.method1378((byte) 98)) {
            if ((long) arg1 == (var2.field6070 >> 48 & 0xFFFFL)) {
                var2.method2660((byte) 116);
            }
        }
        field3172++;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IIIII)Lfs;", line = 39)
    public static final class331 method1549(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3160++;
        class344[] var5 = null;
        class87 var6 = class209.method1481(-10415, arg4);
        if (arg3 >= -127) {
            return null;
        }
        if (var6.field1131 != null) {
            var5 = new class344[var6.field1131.length];
            for (int var7 = 0; var7 < var5.length; var7++) {
                class215 var8 = class224.method1575(0, var6.field1131[var7]);
                var5[var7] = new class344(var8.field3087, var8.field3091, var8.field3077, var8.field3086, var8.field3096, var8.field3085, var8.field3079, var8.field3084);
            }
        }
        return new class331(var6.field1127, var5, var6.field1126, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(Z)V", line = 71)
    public final void method1550(boolean arg0) {
        field3166++;
        if (!arg0) {
            field3163 = null;
        }
        this.field3164 = false;
    }

    @OriginalMember(owner = "client!tm", name = "run", descriptor = "()V", line = 83)
    public final void run() {
        field3170++;
        while (this.field3164) {
            this.field3169.method2037(this, 111);
        }
    }

    @OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Ldn;)V", line = 263)
    public class220(class302 arg0) {
        this.field3169 = arg0;
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 98)
    public final void method1551(int arg0) {
        if (arg0 != 2) {
            this.field3169 = null;
        }
        (new Thread(this, "a")).start();
        field3167++;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(II)V", line = 110)
    public static final void method1552(int arg0, int arg1) {
        if (arg0 == 1) {
            field3159++;
            class276 var2 = class264.method1816((byte) -109, arg1, 14);
            var2.method1870((byte) 126);
        }
    }

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "(I)V", line = 131)
    public static void method1553(int arg0) {
        field3163 = null;
        field3162 = null;
        if (arg0 >= -103) {
            field3162 = null;
        }
        field3161 = null;
    }

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)V", line = 143)
    public static final void method1554(int arg0) {
        field3165++;
        int var1 = class352.field5114.method2053((byte) 0, 8);
        if (var1 < class334.field4847) {
            for (int var2 = var1; var2 < class334.field4847; var2++) {
                class232.field3434[class190.field2731++] = class26.field323[var2];
            }
        }
        if (var1 > class334.field4847) {
            throw new RuntimeException("gppov1");
        } else if (arg0 >= 112) {
            class334.field4847 = 0;
            for (int var3 = 0; var3 < var1; var3++) {
                int var4 = class26.field323[var3];
                class128 var5 = class243.field3596[var4];
                int var6 = class352.field5114.method2053((byte) 0, 1);
                if (var6 == 0) {
                    class26.field323[class334.field4847++] = var4;
                    var5.field4542 = class34.field434;
                } else {
                    int var7 = class352.field5114.method2053((byte) 0, 2);
                    if (var7 == 0) {
                        class26.field323[class334.field4847++] = var4;
                        var5.field4542 = class34.field434;
                        class314.field4623[class349.field5084++] = var4;
                    } else if (var7 == 1) {
                        class26.field323[class334.field4847++] = var4;
                        var5.field4542 = class34.field434;
                        int var8 = class352.field5114.method2053((byte) 0, 3);
                        var5.method776(1, var8, 23542);
                        int var9 = class352.field5114.method2053((byte) 0, 1);
                        if (var9 == 1) {
                            class314.field4623[class349.field5084++] = var4;
                        }
                    } else if (var7 == 2) {
                        class26.field323[class334.field4847++] = var4;
                        var5.field4542 = class34.field434;
                        if (class352.field5114.method2053((byte) 0, 1) == 1) {
                            int var10 = class352.field5114.method2053((byte) 0, 3);
                            var5.method776(2, var10, 23542);
                            int var11 = class352.field5114.method2053((byte) 0, 3);
                            var5.method776(2, var11, 23542);
                        } else {
                            int var12 = class352.field5114.method2053((byte) 0, 3);
                            var5.method776(0, var12, 23542);
                        }
                        int var13 = class352.field5114.method2053((byte) 0, 1);
                        if (var13 == 1) {
                            class314.field4623[class349.field5084++] = var4;
                        }
                    } else if (var7 == 3) {
                        class232.field3434[class190.field2731++] = var4;
                    }
                }
            }
        }
    }
}
