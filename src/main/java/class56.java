import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class56 {

    @OriginalMember(owner = "client!df", name = "d", descriptor = "Ljava/lang/String;")
    public static String field924 = "wishes to trade with you.";

    @OriginalMember(owner = "client!df", name = "m", descriptor = "J")
    public static long field933 = 0L;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "Ljava/lang/String;")
    public static String field926 = "cyan:";

    @OriginalMember(owner = "client!df", name = "h", descriptor = "[I")
    public static int[] field928 = new int[256];

    @OriginalMember(owner = "client!df", name = "j", descriptor = "I")
    public static int field930 = 0;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!df", name = "l", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "Lhc;")
    public static class235 field922;

    @OriginalMember(owner = "client!df", name = "k", descriptor = "Lhc;")
    public static class235 field931;

    // $FF: synthetic field
    @OriginalMember(owner = "client!df", name = "n", descriptor = "Ljava/lang/Class;")
    public static Class field934;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[[[I")
    public static int[][][] field923;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V")
    public static void method426(int arg0) {
        field924 = null;
        field928 = null;
        field923 = null;
        field926 = null;
        if (arg0 != 1) {
            method428('6', -60);
        }
        field922 = null;
        field931 = null;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(I)V")
    public static final void method427(int arg0) {
        if (arg0 < 36) {
            return;
        }
        field921++;
        if (class293.field4621 < 0) {
            class4.field27 = -1;
            class250.field4038 = -1;
            class293.field4621 = 0;
        }
        if (class293.field4621 > class85.field1431) {
            class293.field4621 = class85.field1431;
            class250.field4038 = -1;
            class4.field27 = -1;
        }
        if (class201.field3148 < 0) {
            class250.field4038 = -1;
            class4.field27 = -1;
            class201.field3148 = 0;
        }
        if (class201.field3148 > class191.field2970) {
            class201.field3148 = class191.field2970;
            class4.field27 = -1;
            class250.field4038 = -1;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(CI)B")
    public static final byte method428(char arg0, int arg1) {
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        if (arg1 <= 13) {
            return -118;
        } else {
            field925++;
            return var2;
        }
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(I)V")
    public static final void method429(int arg0) {
        field932++;
        try {
            Method var1 = (field934 == null ? (field934 = method431("java.lang.Runtime")) : field934).getMethod("maxMemory");
            if (var1 != null) {
                try {
                    Runtime var2 = Runtime.getRuntime();
                    Long var3 = (Long) var1.invoke(var2, (Object[]) null);
                    class50.field741 = (int) (var3 / 1048576L) + 1;
                } catch (Throwable var4) {
                }
            }
            if (arg0 != -733) {
                field931 = null;
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "()V")
    public static final void method430() {
        class16.field250 = 0;
        label191: for (int var0 = 0; var0 < class196.field3099; var0++) {
            class163 var1 = class41.field590[var0];
            if (class111.field1826 != null) {
                for (int var2 = 0; var2 < class111.field1826.length; var2++) {
                    if (class111.field1826[var2] != -1000000 && (var1.field2572 <= class111.field1826[var2] || var1.field2573 <= class111.field1826[var2]) && (var1.field2565 <= class167.field2616[var2] || var1.field2554 <= class167.field2616[var2]) && (var1.field2565 >= class189.field2923[var2] || var1.field2554 >= class189.field2923[var2]) && (var1.field2548 <= class69.field1111[var2] || var1.field2564 <= class69.field1111[var2]) && (var1.field2548 >= class269.field4314[var2] || var1.field2564 >= class269.field4314[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field2547 == 1) {
                int var3 = var1.field2552 + class79.field1320 - class99.field1669;
                if (var3 >= 0 && var3 <= class79.field1320 + class79.field1320) {
                    int var4 = var1.field2550 + class79.field1320 - class99.field1664;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field2557 + class79.field1320 - class99.field1664;
                    if (var5 > class79.field1320 + class79.field1320) {
                        var5 = class79.field1320 + class79.field1320;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class94.field1605[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class6.field127 - var1.field2565;
                        if (var7 > 32) {
                            var1.field2570 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field2570 = 2;
                            var7 = -var7;
                        }
                        var1.field2553 = (var1.field2548 - class193.field3029 << 8) / var7;
                        var1.field2561 = (var1.field2564 - class193.field3029 << 8) / var7;
                        var1.field2568 = (var1.field2572 - class140.field2145 << 8) / var7;
                        var1.field2556 = (var1.field2573 - class140.field2145 << 8) / var7;
                        class218.field3366[class16.field250++] = var1;
                    }
                }
            } else if (var1.field2547 == 2) {
                int var8 = var1.field2550 + class79.field1320 - class99.field1664;
                if (var8 >= 0 && var8 <= class79.field1320 + class79.field1320) {
                    int var9 = var1.field2552 + class79.field1320 - class99.field1669;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field2562 + class79.field1320 - class99.field1669;
                    if (var10 > class79.field1320 + class79.field1320) {
                        var10 = class79.field1320 + class79.field1320;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class94.field1605[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class193.field3029 - var1.field2548;
                        if (var12 > 32) {
                            var1.field2570 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field2570 = 4;
                            var12 = -var12;
                        }
                        var1.field2566 = (var1.field2565 - class6.field127 << 8) / var12;
                        var1.field2569 = (var1.field2554 - class6.field127 << 8) / var12;
                        var1.field2568 = (var1.field2572 - class140.field2145 << 8) / var12;
                        var1.field2556 = (var1.field2573 - class140.field2145 << 8) / var12;
                        class218.field3366[class16.field250++] = var1;
                    }
                }
            } else if (var1.field2547 == 4) {
                int var13 = var1.field2572 - class140.field2145;
                if (var13 > 128) {
                    int var14 = var1.field2550 + class79.field1320 - class99.field1664;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field2557 + class79.field1320 - class99.field1664;
                    if (var15 > class79.field1320 + class79.field1320) {
                        var15 = class79.field1320 + class79.field1320;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field2552 + class79.field1320 - class99.field1669;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field2562 + class79.field1320 - class99.field1669;
                        if (var17 > class79.field1320 + class79.field1320) {
                            var17 = class79.field1320 + class79.field1320;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class94.field1605[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field2570 = 5;
                            var1.field2566 = (var1.field2565 - class6.field127 << 8) / var13;
                            var1.field2569 = (var1.field2554 - class6.field127 << 8) / var13;
                            var1.field2553 = (var1.field2548 - class193.field3029 << 8) / var13;
                            var1.field2561 = (var1.field2564 - class193.field3029 << 8) / var13;
                            class218.field3366[class16.field250++] = var1;
                        }
                    }
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method431(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
