import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qi")
public class class398 {

    @OriginalMember(owner = "client!qi", name = "g", descriptor = "Lgj;")
    private class448 field5543 = new class448();

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "I")
    public static int field5540 = 0;

    @OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
    public static int field5544 = -1;

    @OriginalMember(owner = "client!qi", name = "l", descriptor = "[I")
    public static int[] field5548 = new int[4096];

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "I")
    public static int field5538;

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!qi", name = "e", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!qi", name = "i", descriptor = "I")
    public static int field5545;

    @OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!qi", name = "k", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!qi", name = "n", descriptor = "I")
    public static int field5550;

    @OriginalMember(owner = "client!qi", name = "o", descriptor = "I")
    public static int field5551;

    @OriginalMember(owner = "client!qi", name = "p", descriptor = "Lgj;")
    private class448 field5552;

    @OriginalMember(owner = "client!qi", name = "m", descriptor = "Lqf;")
    public static class479 field5549;

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V", line = 4)
    public static void method2299(byte arg0) {
        field5548 = null;
        field5549 = null;
        if (arg0 < 100) {
            field5549 = null;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V", line = 15)
    public static final void method2300(int arg0, int arg1, int arg2) {
        field5551++;
        if (arg1 != -30233) {
            method2304();
        }
        class163 var3 = class271.method1546(arg2, 6, true);
        var3.method1017(0);
        var3.field2328 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Z)V", line = 29)
    public final void method2301(boolean arg0) {
        while (true) {
            class448 var2 = this.field5543.field6478;
            if (this.field5543 == var2) {
                field5542++;
                this.field5552 = null;
                if (arg0) {
                    method2300(-69, 115, -72);
                    return;
                }
                return;
            }
            var2.method2645(126);
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)Lgj;", line = 55)
    public final class448 method2302(int arg0) {
        field5545++;
        class448 var2 = this.field5552;
        if (arg0 >= -74) {
            this.field5552 = null;
        }
        if (this.field5543 == var2) {
            this.field5552 = null;
            return null;
        } else {
            this.field5552 = var2.field6478;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(I)Lgj;", line = 76)
    public final class448 method2303(int arg0) {
        field5547++;
        if (arg0 != -17197) {
            field5544 = 110;
        }
        class448 var2 = this.field5543.field6474;
        if (this.field5543 == var2) {
            this.field5552 = null;
            return null;
        } else {
            this.field5552 = var2.field6474;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "()V", line = 101)
    public static final void method2304() {
        class493.field7286 = 0;
        label212: for (int var0 = 0; var0 < class61.field835; var0++) {
            class437 var1 = class300.field4131[var0];
            if (class435.field6342 != null) {
                for (int var2 = 0; var2 < class435.field6342.length; var2++) {
                    if (class435.field6342[var2] != -1000000 && (var1.field6368 <= class435.field6342[var2] || var1.field6386 <= class435.field6342[var2]) && (var1.field6382 <= class127.field1735[var2] || var1.field6363 <= class127.field1735[var2]) && (var1.field6382 >= class174.field2495[var2] || var1.field6363 >= class174.field2495[var2]) && (var1.field6369 <= class377.field5312[var2] || var1.field6387 <= class377.field5312[var2]) && (var1.field6369 >= class458.field6688[var2] || var1.field6387 >= class458.field6688[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field6375 == 1) {
                int var3 = var1.field6371 + class231.field3212 - class192.field2742;
                if (var3 >= 0 && var3 <= class231.field3212 + class231.field3212) {
                    int var4 = var1.field6380 + class231.field3212 - class141.field2010;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class231.field3212 + class231.field3212) {
                        continue;
                    }
                    int var5 = var1.field6376 + class231.field3212 - class141.field2010;
                    if (var5 > class231.field3212 + class231.field3212) {
                        var5 = class231.field3212 + class231.field3212;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class39.field529[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class263.field3600 - var1.field6382;
                        if (var7 > class446.field6462) {
                            var1.field6383 = 1;
                        } else {
                            if (var7 >= -class446.field6462) {
                                continue;
                            }
                            var1.field6383 = 2;
                            var7 = -var7;
                        }
                        var1.field6379 = (var1.field6369 - class304.field4172 << 8) / var7;
                        var1.field6361 = (var1.field6387 - class304.field4172 << 8) / var7;
                        var1.field6366 = (var1.field6368 - class379.field5327 << 8) / var7;
                        var1.field6377 = (var1.field6386 - class379.field5327 << 8) / var7;
                        class94.field1260[class493.field7286++] = var1;
                    }
                }
            } else if (var1.field6375 == 2) {
                int var8 = var1.field6380 + class231.field3212 - class141.field2010;
                if (var8 >= 0 && var8 <= class231.field3212 + class231.field3212) {
                    int var9 = var1.field6371 + class231.field3212 - class192.field2742;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class231.field3212 + class231.field3212) {
                        continue;
                    }
                    int var10 = var1.field6378 + class231.field3212 - class192.field2742;
                    if (var10 > class231.field3212 + class231.field3212) {
                        var10 = class231.field3212 + class231.field3212;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class39.field529[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class304.field4172 - var1.field6369;
                        if (var12 > class446.field6462) {
                            var1.field6383 = 3;
                        } else {
                            if (var12 >= -class446.field6462) {
                                continue;
                            }
                            var1.field6383 = 4;
                            var12 = -var12;
                        }
                        var1.field6364 = (var1.field6382 - class263.field3600 << 8) / var12;
                        var1.field6365 = (var1.field6363 - class263.field3600 << 8) / var12;
                        var1.field6366 = (var1.field6368 - class379.field5327 << 8) / var12;
                        var1.field6377 = (var1.field6386 - class379.field5327 << 8) / var12;
                        class94.field1260[class493.field7286++] = var1;
                    }
                }
            } else if (var1.field6375 == 4) {
                int var13 = var1.field6368 - class379.field5327;
                if (var13 > class92.field1233) {
                    int var14 = var1.field6380 + class231.field3212 - class141.field2010;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class231.field3212 + class231.field3212) {
                        continue;
                    }
                    int var15 = var1.field6376 + class231.field3212 - class141.field2010;
                    if (var15 > class231.field3212 + class231.field3212) {
                        var15 = class231.field3212 + class231.field3212;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field6371 + class231.field3212 - class192.field2742;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class231.field3212 + class231.field3212) {
                        continue;
                    }
                    int var17 = var1.field6378 + class231.field3212 - class192.field2742;
                    if (var17 > class231.field3212 + class231.field3212) {
                        var17 = class231.field3212 + class231.field3212;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class39.field529[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field6383 = 5;
                        var1.field6364 = (var1.field6382 - class263.field3600 << 8) / var13;
                        var1.field6365 = (var1.field6363 - class263.field3600 << 8) / var13;
                        var1.field6379 = (var1.field6369 - class304.field4172 << 8) / var13;
                        var1.field6361 = (var1.field6387 - class304.field4172 << 8) / var13;
                        class94.field1260[class493.field7286++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 352)
    public static final long method2305(String arg0, int arg1) {
        if (arg1 != 4) {
            field5544 = -125;
        }
        field5541++;
        int var2 = arg0.length();
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(I)Lgj;", line = 375)
    public final class448 method2306(int arg0) {
        field5537++;
        if (arg0 < 105) {
            method2304();
        }
        class448 var2 = this.field5543.field6478;
        if (this.field5543 == var2) {
            this.field5552 = null;
            return null;
        } else {
            this.field5552 = var2.field6478;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "d", descriptor = "(I)I", line = 411)
    public final int method2307(int arg0) {
        field5550++;
        int var2 = arg0;
        class448 var3 = this.field5543.field6478;
        while (this.field5543 != var3) {
            var3 = var3.field6478;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!qi", name = "b", descriptor = "(B)Lgj;", line = 432)
    public final class448 method2308(byte arg0) {
        field5546++;
        class448 var2 = this.field5543.field6478;
        if (arg0 != 20) {
            return null;
        } else if (this.field5543 == var2) {
            return null;
        } else {
            var2.method2645(121);
            return var2;
        }
    }

    @OriginalMember(owner = "client!qi", name = "c", descriptor = "(B)Z", line = 456)
    public final boolean method2309(byte arg0) {
        field5538++;
        if (arg0 > -61) {
            return false;
        } else {
            return this.field5543.field6478 == this.field5543;
        }
    }

    @OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lgj;I)V", line = 467)
    public final void method2310(class448 arg0, int arg1) {
        if (arg1 != -21801) {
            return;
        }
        if (arg0.field6474 != null) {
            arg0.method2645(117);
        }
        field5539++;
        arg0.field6474 = this.field5543.field6474;
        arg0.field6478 = this.field5543;
        arg0.field6474.field6478 = arg0;
        arg0.field6478.field6474 = arg0;
    }

    @OriginalMember(owner = "client!qi", name = "<init>", descriptor = "()V", line = 488)
    public class398() {
        this.field5543.field6478 = this.field5543;
        this.field5543.field6474 = this.field5543;
    }
}
