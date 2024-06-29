import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class226 {

    @OriginalMember(owner = "client!g", name = "c", descriptor = "Lhh;")
    public static class163 field4089 = class137.method1065(":assistreq:", 17);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field4088 = 0;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "Lhh;")
    public static class163 field4090 = class137.method1065("_labels", 17);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field4087;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field4091;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public static void method1581(int arg0) {
        if (arg0 >= -62) {
            field4091 = -60;
        }
        field4090 = null;
        field4089 = null;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "()V")
    public static final void method1582() {
        class63.field1070 = 0;
        label191: for (int var0 = 0; var0 < class20.field330; var0++) {
            class201 var1 = class239.field4254[var0];
            if (class152.field2846 != null) {
                for (int var2 = 0; var2 < class152.field2846.length; var2++) {
                    if (class152.field2846[var2] != -1000000 && (var1.field3608 <= class152.field2846[var2] || var1.field3597 <= class152.field2846[var2]) && (var1.field3590 <= class170.field3104[var2] || var1.field3606 <= class170.field3104[var2]) && (var1.field3590 >= class233.field4172[var2] || var1.field3606 >= class233.field4172[var2]) && (var1.field3604 <= class142.field2699[var2] || var1.field3599 <= class142.field2699[var2]) && (var1.field3604 >= class145.field2763[var2] || var1.field3599 >= class145.field2763[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3609 == 1) {
                int var3 = var1.field3592 + class236.field4208 - class110.field2072;
                if (var3 >= 0 && var3 <= class236.field4208 + class236.field4208) {
                    int var4 = var1.field3605 + class236.field4208 - client.field1990;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3602 + class236.field4208 - client.field1990;
                    if (var5 > class236.field4208 + class236.field4208) {
                        var5 = class236.field4208 + class236.field4208;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class120.field2267[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class134.field2601 - var1.field3590;
                        if (var7 > 32) {
                            var1.field3600 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3600 = 2;
                            var7 = -var7;
                        }
                        var1.field3603 = (var1.field3604 - class30.field476 << 8) / var7;
                        var1.field3591 = (var1.field3599 - class30.field476 << 8) / var7;
                        var1.field3596 = (var1.field3608 - class127.field2472 << 8) / var7;
                        var1.field3587 = (var1.field3597 - class127.field2472 << 8) / var7;
                        class18.field287[class63.field1070++] = var1;
                    }
                }
            } else if (var1.field3609 == 2) {
                int var8 = var1.field3605 + class236.field4208 - client.field1990;
                if (var8 >= 0 && var8 <= class236.field4208 + class236.field4208) {
                    int var9 = var1.field3592 + class236.field4208 - class110.field2072;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3610 + class236.field4208 - class110.field2072;
                    if (var10 > class236.field4208 + class236.field4208) {
                        var10 = class236.field4208 + class236.field4208;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class120.field2267[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class30.field476 - var1.field3604;
                        if (var12 > 32) {
                            var1.field3600 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3600 = 4;
                            var12 = -var12;
                        }
                        var1.field3595 = (var1.field3590 - class134.field2601 << 8) / var12;
                        var1.field3589 = (var1.field3606 - class134.field2601 << 8) / var12;
                        var1.field3596 = (var1.field3608 - class127.field2472 << 8) / var12;
                        var1.field3587 = (var1.field3597 - class127.field2472 << 8) / var12;
                        class18.field287[class63.field1070++] = var1;
                    }
                }
            } else if (var1.field3609 == 4) {
                int var13 = var1.field3608 - class127.field2472;
                if (var13 > 128) {
                    int var14 = var1.field3605 + class236.field4208 - client.field1990;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3602 + class236.field4208 - client.field1990;
                    if (var15 > class236.field4208 + class236.field4208) {
                        var15 = class236.field4208 + class236.field4208;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3592 + class236.field4208 - class110.field2072;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3610 + class236.field4208 - class110.field2072;
                        if (var17 > class236.field4208 + class236.field4208) {
                            var17 = class236.field4208 + class236.field4208;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class120.field2267[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3600 = 5;
                            var1.field3595 = (var1.field3590 - class134.field2601 << 8) / var13;
                            var1.field3589 = (var1.field3606 - class134.field2601 << 8) / var13;
                            var1.field3603 = (var1.field3604 - class30.field476 << 8) / var13;
                            var1.field3591 = (var1.field3599 - class30.field476 << 8) / var13;
                            class18.field287[class63.field1070++] = var1;
                        }
                    }
                }
            }
        }
    }
}
