import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class107 {

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
    public static int[] field1343 = new int[100];

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field1342 = new String[5];

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Lwf;")
    public static class79 field1341 = new class79(17, 3);

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field1344;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V")
    public static final void method596() {
        class382.field5458 = 0;
        label191: for (int var0 = 0; var0 < class23.field302; var0++) {
            class9 var1 = class451.field6241[var0];
            if (class71.field888 != null) {
                for (int var2 = 0; var2 < class71.field888.length; var2++) {
                    if (class71.field888[var2] != -1000000 && (var1.field97 <= class71.field888[var2] || var1.field88 <= class71.field888[var2]) && (var1.field85 <= class185.field2745[var2] || var1.field102 <= class185.field2745[var2]) && (var1.field85 >= class22.field293[var2] || var1.field102 >= class22.field293[var2]) && (var1.field92 <= class128.field1677[var2] || var1.field91 <= class128.field1677[var2]) && (var1.field92 >= class349.field5049[var2] || var1.field91 >= class349.field5049[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field96 == 1) {
                int var3 = var1.field89 + class36.field463 - class58.field770;
                if (var3 >= 0 && var3 <= class36.field463 + class36.field463) {
                    int var4 = var1.field87 + class36.field463 - class214.field3218;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field95 + class36.field463 - class214.field3218;
                    if (var5 > class36.field463 + class36.field463) {
                        var5 = class36.field463 + class36.field463;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class386.field5483[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class132.field1743 - var1.field85;
                        if (var7 > class418.field5844) {
                            var1.field101 = 1;
                        } else {
                            if (var7 >= -class418.field5844) {
                                continue;
                            }
                            var1.field101 = 2;
                            var7 = -var7;
                        }
                        var1.field103 = (var1.field92 - class2.field21 << 8) / var7;
                        var1.field86 = (var1.field91 - class2.field21 << 8) / var7;
                        var1.field90 = (var1.field97 - class206.field3155 << 8) / var7;
                        var1.field83 = (var1.field88 - class206.field3155 << 8) / var7;
                        class279.field4118[class382.field5458++] = var1;
                    }
                }
            } else if (var1.field96 == 2) {
                int var8 = var1.field87 + class36.field463 - class214.field3218;
                if (var8 >= 0 && var8 <= class36.field463 + class36.field463) {
                    int var9 = var1.field89 + class36.field463 - class58.field770;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field93 + class36.field463 - class58.field770;
                    if (var10 > class36.field463 + class36.field463) {
                        var10 = class36.field463 + class36.field463;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class386.field5483[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class2.field21 - var1.field92;
                        if (var12 > class418.field5844) {
                            var1.field101 = 3;
                        } else {
                            if (var12 >= -class418.field5844) {
                                continue;
                            }
                            var1.field101 = 4;
                            var12 = -var12;
                        }
                        var1.field99 = (var1.field85 - class132.field1743 << 8) / var12;
                        var1.field98 = (var1.field102 - class132.field1743 << 8) / var12;
                        var1.field90 = (var1.field97 - class206.field3155 << 8) / var12;
                        var1.field83 = (var1.field88 - class206.field3155 << 8) / var12;
                        class279.field4118[class382.field5458++] = var1;
                    }
                }
            } else if (var1.field96 == 4) {
                int var13 = var1.field97 - class206.field3155;
                if (var13 > class418.field5843) {
                    int var14 = var1.field87 + class36.field463 - class214.field3218;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field95 + class36.field463 - class214.field3218;
                    if (var15 > class36.field463 + class36.field463) {
                        var15 = class36.field463 + class36.field463;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field89 + class36.field463 - class58.field770;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field93 + class36.field463 - class58.field770;
                        if (var17 > class36.field463 + class36.field463) {
                            var17 = class36.field463 + class36.field463;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class386.field5483[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field101 = 5;
                            var1.field99 = (var1.field85 - class132.field1743 << 8) / var13;
                            var1.field98 = (var1.field102 - class132.field1743 << 8) / var13;
                            var1.field103 = (var1.field92 - class2.field21 << 8) / var13;
                            var1.field86 = (var1.field91 - class2.field21 << 8) / var13;
                            class279.field4118[class382.field5458++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method597(int arg0) {
        field1341 = null;
        field1342 = null;
        if (arg0 != 1) {
            field1342 = null;
        }
        field1343 = null;
    }
}
