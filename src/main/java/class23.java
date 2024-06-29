import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class23 {

    @OriginalMember(owner = "client!r", name = "d", descriptor = "Ljava/lang/String;")
    public static String field416 = "Prepared sound engine";

    @OriginalMember(owner = "client!r", name = "b", descriptor = "I")
    public static int field414 = 2;

    @OriginalMember(owner = "client!r", name = "k", descriptor = "I")
    public static int field423 = 0;

    @OriginalMember(owner = "client!r", name = "h", descriptor = "Z")
    public static boolean field420 = false;

    @OriginalMember(owner = "client!r", name = "l", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "client!r", name = "n", descriptor = "Ljava/lang/String;")
    public static String field426 = "slide:";

    @OriginalMember(owner = "client!r", name = "o", descriptor = "[I")
    public static int[] field427 = new int[50];

    @OriginalMember(owner = "client!r", name = "a", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!r", name = "c", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!r", name = "e", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!r", name = "i", descriptor = "I")
    public int field421;

    @OriginalMember(owner = "client!r", name = "j", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!r", name = "q", descriptor = "I")
    public int field429;

    @OriginalMember(owner = "client!r", name = "r", descriptor = "I")
    public static int field430;

    @OriginalMember(owner = "client!r", name = "p", descriptor = "J")
    public long field428;

    @OriginalMember(owner = "client!r", name = "f", descriptor = "Laj;")
    public static class151 field418;

    @OriginalMember(owner = "client!r", name = "g", descriptor = "Laj;")
    public static class151 field419;

    @OriginalMember(owner = "client!r", name = "m", descriptor = "Lda;")
    public class312 field425;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Z)Lmm;")
    public static final class216 method148(boolean arg0) {
        if (!arg0) {
            method148(false);
        }
        field430++;
        try {
            return (class216) Class.forName("mk").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "()V")
    public static final void method149() {
        class287.field4745 = 0;
        label191: for (int var0 = 0; var0 < class216.field3653; var0++) {
            class41 var1 = class241.field4063[var0];
            if (class101.field1605 != null) {
                for (int var2 = 0; var2 < class101.field1605.length; var2++) {
                    if (class101.field1605[var2] != -1000000 && (var1.field617 <= class101.field1605[var2] || var1.field627 <= class101.field1605[var2]) && (var1.field614 <= class3.field104[var2] || var1.field610 <= class3.field104[var2]) && (var1.field614 >= class54.field902[var2] || var1.field610 >= class54.field902[var2]) && (var1.field620 <= class16.field319[var2] || var1.field609 <= class16.field319[var2]) && (var1.field620 >= class292.field4783[var2] || var1.field609 >= class292.field4783[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field631 == 1) {
                int var3 = var1.field616 + class6.field139 - class286.field4742;
                if (var3 >= 0 && var3 <= class6.field139 + class6.field139) {
                    int var4 = var1.field628 + class6.field139 - class303.field4929;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field624 + class6.field139 - class303.field4929;
                    if (var5 > class6.field139 + class6.field139) {
                        var5 = class6.field139 + class6.field139;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class36.field584[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class118.field1987 - var1.field614;
                        if (var7 > 32) {
                            var1.field611 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field611 = 2;
                            var7 = -var7;
                        }
                        var1.field618 = (var1.field620 - class84.field1398 << 8) / var7;
                        var1.field626 = (var1.field609 - class84.field1398 << 8) / var7;
                        var1.field621 = (var1.field617 - class28.field481 << 8) / var7;
                        var1.field608 = (var1.field627 - class28.field481 << 8) / var7;
                        class107.field1752[class287.field4745++] = var1;
                    }
                }
            } else if (var1.field631 == 2) {
                int var8 = var1.field628 + class6.field139 - class303.field4929;
                if (var8 >= 0 && var8 <= class6.field139 + class6.field139) {
                    int var9 = var1.field616 + class6.field139 - class286.field4742;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field625 + class6.field139 - class286.field4742;
                    if (var10 > class6.field139 + class6.field139) {
                        var10 = class6.field139 + class6.field139;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class36.field584[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class84.field1398 - var1.field620;
                        if (var12 > 32) {
                            var1.field611 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field611 = 4;
                            var12 = -var12;
                        }
                        var1.field622 = (var1.field614 - class118.field1987 << 8) / var12;
                        var1.field612 = (var1.field610 - class118.field1987 << 8) / var12;
                        var1.field621 = (var1.field617 - class28.field481 << 8) / var12;
                        var1.field608 = (var1.field627 - class28.field481 << 8) / var12;
                        class107.field1752[class287.field4745++] = var1;
                    }
                }
            } else if (var1.field631 == 4) {
                int var13 = var1.field617 - class28.field481;
                if (var13 > 128) {
                    int var14 = var1.field628 + class6.field139 - class303.field4929;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field624 + class6.field139 - class303.field4929;
                    if (var15 > class6.field139 + class6.field139) {
                        var15 = class6.field139 + class6.field139;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field616 + class6.field139 - class286.field4742;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field625 + class6.field139 - class286.field4742;
                        if (var17 > class6.field139 + class6.field139) {
                            var17 = class6.field139 + class6.field139;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class36.field584[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field611 = 5;
                            var1.field622 = (var1.field614 - class118.field1987 << 8) / var13;
                            var1.field612 = (var1.field610 - class118.field1987 << 8) / var13;
                            var1.field618 = (var1.field620 - class84.field1398 << 8) / var13;
                            var1.field626 = (var1.field609 - class84.field1398 << 8) / var13;
                            class107.field1752[class287.field4745++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V")
    public static void method150(int arg0) {
        field426 = null;
        field418 = null;
        if (arg0 != -6225) {
            field419 = null;
        }
        field419 = null;
        field416 = null;
        field427 = null;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)V")
    public static final void method151(boolean arg0, int arg1) {
        field415++;
        byte[][] var2 = class111.field1832;
        if (arg1 != 26713) {
            method151(true, 42);
        }
        byte var3 = 4;
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class159.method1187(arg1 ^ 0xD8AC61F3);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class173.field2778[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = var9 >> 1 & 0x3;
                            int var12 = (var9 & 0xFFDF39) >> 14;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class184.field2947.length; var15++) {
                                if (class184.field2947[var15] == var14 && var2[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class43.method259(arg1 ^ 0x6826, arg0, var2[var15], var7 * 8, var12, var11, class225.field3790, var10, var5, var13, var6 * 8);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class299.method2048(-118, var6 * 8, var5, 8, 8, var7 * 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class183.field2927 = -1;
            return;
        }
        class261.field4379 = var4[3];
        class259.field4356 = var4[2];
        class116.field1980 = var4[4];
        class146.field2412 = var4[1];
        class183.field2927 = var4[0];
    }
}
