import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class91 {

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "Lrd;")
    public static class173 field1730 = class133.method843(")1p", -107);

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lrd;")
    public static class173 field1726 = class133.method843("<col=00ff80>", 12);

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "[[I")
    public static int[][] field1728 = new int[104][104];

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "Lrd;")
    public static class173 field1727 = class133.method843("m", -85);

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "()V")
    public static final void method580() {
        int var0 = class208.field4044[class30.field606];
        class126[] var1 = class208.field4056[class30.field606];
        class216.field4192 = 0;
        for (int var2 = 0; var2 < var0; var2++) {
            class126 var3 = var1[var2];
            if (var3.field2388 == 1) {
                int var4 = var3.field2389 + class182.field3583 - class64.field1267;
                if (var4 >= 0 && var4 <= class182.field3583 + class182.field3583) {
                    int var5 = var3.field2378 + class182.field3583 - class33.field722;
                    if (var5 < 0) {
                        var5 = 0;
                    }
                    int var6 = var3.field2386 + class182.field3583 - class33.field722;
                    if (var6 > class182.field3583 + class182.field3583) {
                        var6 = class182.field3583 + class182.field3583;
                    }
                    boolean var7 = false;
                    while (var5 <= var6) {
                        if (class120.field2213[var4][var5++]) {
                            var7 = true;
                            break;
                        }
                    }
                    if (var7) {
                        int var8 = class98.field1791 - var3.field2382;
                        if (var8 > 32) {
                            var3.field2380 = 1;
                        } else {
                            if (var8 >= -32) {
                                continue;
                            }
                            var3.field2380 = 2;
                            var8 = -var8;
                        }
                        var3.field2385 = (var3.field2381 - class161.field2998 << 8) / var8;
                        var3.field2366 = (var3.field2372 - class161.field2998 << 8) / var8;
                        var3.field2374 = (var3.field2377 - class106.field1984 << 8) / var8;
                        var3.field2373 = (var3.field2371 - class106.field1984 << 8) / var8;
                        class215.field4166[class216.field4192++] = var3;
                    }
                }
            } else if (var3.field2388 == 2) {
                int var9 = var3.field2378 + class182.field3583 - class33.field722;
                if (var9 >= 0 && var9 <= class182.field3583 + class182.field3583) {
                    int var10 = var3.field2389 + class182.field3583 - class64.field1267;
                    if (var10 < 0) {
                        var10 = 0;
                    }
                    int var11 = var3.field2376 + class182.field3583 - class64.field1267;
                    if (var11 > class182.field3583 + class182.field3583) {
                        var11 = class182.field3583 + class182.field3583;
                    }
                    boolean var12 = false;
                    while (var10 <= var11) {
                        if (class120.field2213[var10++][var9]) {
                            var12 = true;
                            break;
                        }
                    }
                    if (var12) {
                        int var13 = class161.field2998 - var3.field2381;
                        if (var13 > 32) {
                            var3.field2380 = 3;
                        } else {
                            if (var13 >= -32) {
                                continue;
                            }
                            var3.field2380 = 4;
                            var13 = -var13;
                        }
                        var3.field2383 = (var3.field2382 - class98.field1791 << 8) / var13;
                        var3.field2387 = (var3.field2367 - class98.field1791 << 8) / var13;
                        var3.field2374 = (var3.field2377 - class106.field1984 << 8) / var13;
                        var3.field2373 = (var3.field2371 - class106.field1984 << 8) / var13;
                        class215.field4166[class216.field4192++] = var3;
                    }
                }
            } else if (var3.field2388 == 4) {
                int var14 = var3.field2377 - class106.field1984;
                if (var14 > 128) {
                    int var15 = var3.field2378 + class182.field3583 - class33.field722;
                    if (var15 < 0) {
                        var15 = 0;
                    }
                    int var16 = var3.field2386 + class182.field3583 - class33.field722;
                    if (var16 > class182.field3583 + class182.field3583) {
                        var16 = class182.field3583 + class182.field3583;
                    }
                    if (var15 <= var16) {
                        int var17 = var3.field2389 + class182.field3583 - class64.field1267;
                        if (var17 < 0) {
                            var17 = 0;
                        }
                        int var18 = var3.field2376 + class182.field3583 - class64.field1267;
                        if (var18 > class182.field3583 + class182.field3583) {
                            var18 = class182.field3583 + class182.field3583;
                        }
                        boolean var19 = false;
                        label145: for (int var20 = var17; var20 <= var18; var20++) {
                            for (int var21 = var15; var21 <= var16; var21++) {
                                if (class120.field2213[var20][var21]) {
                                    var19 = true;
                                    break label145;
                                }
                            }
                        }
                        if (var19) {
                            var3.field2380 = 5;
                            var3.field2383 = (var3.field2382 - class98.field1791 << 8) / var14;
                            var3.field2387 = (var3.field2367 - class98.field1791 << 8) / var14;
                            var3.field2385 = (var3.field2381 - class161.field2998 << 8) / var14;
                            var3.field2366 = (var3.field2372 - class161.field2998 << 8) / var14;
                            class215.field4166[class216.field4192++] = var3;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(B)V")
    public static void method581(byte arg0) {
        field1728 = null;
        field1727 = null;
        field1726 = null;
        if (arg0 >= -82) {
            field1730 = null;
        }
        field1730 = null;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(II)Lo;")
    public static final class139 method582(int arg0, int arg1) {
        class139 var2 = (class139) class145.field2721.method46((long) arg0, arg1 ^ 0x67D1);
        field1731++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class153.field2887.method142(arg1, arg0, (byte) 2);
        class139 var4 = new class139();
        if (var3 != null) {
            var4.method865((byte) 107, new class121(var3));
        }
        class145.field2721.method52(arg1 ^ 0xFFFFF204, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(Lmb;I)Lth;")
    public static final class197 method583(class121 arg0, int arg1) {
        int var2 = -50 / ((arg1 + 78) / 36);
        field1729++;
        return new class197(arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method782(true), arg0.method780(16711680), arg0.method780(16711680), arg0.method751((byte) 115));
    }
}
