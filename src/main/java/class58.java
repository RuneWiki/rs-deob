import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class58 {

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    private int field738 = 0;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "Lic;")
    private class329 field741;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field736 = 0;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "[I")
    public static int[] field740 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "I")
    public static int field745 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lni;")
    private class26 field746;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "Z")
    public static boolean field739;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lni;", line = 4)
    public final class26 method434(byte arg0) {
        this.field738 = 0;
        if (arg0 > -127) {
            method435(104, -127);
        }
        field735++;
        return this.method438((byte) 101);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)V", line = 22)
    public static final void method435(int arg0, int arg1) {
        if (~class194.field2673 == arg1) {
            class360.field5630.method1501(arg1 ^ 0xFFFFFF7F, arg0);
        } else {
            class172.field2384 = arg0;
        }
        field744++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "([BI)V", line = 43)
    public static final void method436(byte[] arg0, int arg1) {
        field743++;
        class299 var2 = new class299(arg0);
        var2.field4351 = arg0.length - 2;
        class171.field2369 = var2.method2083((byte) -119);
        class104.field1356 = new boolean[class171.field2369];
        class199.field2812 = new byte[class171.field2369][];
        class348.field5418 = new int[class171.field2369];
        class251.field3673 = new int[class171.field2369];
        class338.field5276 = new byte[class171.field2369][];
        class184.field2508 = new int[class171.field2369];
        class119.field1578 = new int[class171.field2369];
        var2.field4351 = arg0.length - (class171.field2369 * 8) - 7;
        class16.field201 = var2.method2083((byte) -41);
        class133.field1805 = var2.method2083((byte) -109);
        int var3 = (var2.method2096((byte) -122) & 0xFF) + 1;
        int var4 = -38 % ((arg1 - 4) / 46);
        for (int var5 = 0; var5 < class171.field2369; var5++) {
            class348.field5418[var5] = var2.method2083((byte) -97);
        }
        for (int var6 = 0; var6 < class171.field2369; var6++) {
            class119.field1578[var6] = var2.method2083((byte) -81);
        }
        for (int var7 = 0; var7 < class171.field2369; var7++) {
            class251.field3673[var7] = var2.method2083((byte) -68);
        }
        for (int var8 = 0; var8 < class171.field2369; var8++) {
            class184.field2508[var8] = var2.method2083((byte) -30);
        }
        var2.field4351 = arg0.length - (class171.field2369 * 8) - (var3 - 1) * 3 - 7;
        class292.field4253 = new int[var3];
        for (int var9 = 1; var9 < var3; var9++) {
            class292.field4253[var9] = var2.method2085((byte) 115);
            if (class292.field4253[var9] == 0) {
                class292.field4253[var9] = 1;
            }
        }
        var2.field4351 = 0;
        for (int var10 = 0; var10 < class171.field2369; var10++) {
            int var11 = class251.field3673[var10];
            int var12 = class184.field2508[var10];
            int var13 = var11 * var12;
            byte[] var14 = new byte[var13];
            class338.field5276[var10] = var14;
            byte[] var15 = new byte[var13];
            boolean var16 = false;
            class199.field2812[var10] = var15;
            int var17 = var2.method2096((byte) -122);
            if ((var17 & 0x1) == 0) {
                for (int var18 = 0; var18 < var13; var18++) {
                    var14[var18] = var2.method2104(105);
                }
                if ((var17 & 0x2) != 0) {
                    for (int var19 = 0; var19 < var13; var19++) {
                        byte var20 = var15[var19] = var2.method2104(107);
                        var16 |= var20 != -1;
                    }
                }
            } else {
                int var21 = 0;
                label98: while (true) {
                    if (var21 >= var11) {
                        if ((var17 & 0x2) == 0) {
                            break;
                        }
                        int var23 = 0;
                        while (true) {
                            if (var23 >= var11) {
                                break label98;
                            }
                            for (int var24 = 0; var24 < var12; var24++) {
                                byte var25 = var15[var11 * var24 + var23] = var2.method2104(126);
                                var16 |= var25 != -1;
                            }
                            var23++;
                        }
                    }
                    for (int var22 = 0; var22 < var12; var22++) {
                        var14[var21 + (var11 * var22)] = var2.method2104(122);
                    }
                    var21++;
                }
            }
            class104.field1356[var10] = var16;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZII)V", line = 209)
    public static final void method437(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method440(92, (class299) null);
        }
        class208.field2956[arg1] = arg2;
        field737++;
        class132 var3 = (class132) class322.field4726.method2279((long) arg1, 118);
        if (var3 == null) {
            class132 var4 = new class132(class6.method37(10828) + 500L);
            class322.field4726.method2275(var4, 97, (long) arg1);
        } else {
            var3.field1794 = class6.method37(10828) + 500L;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(B)Lni;", line = 232)
    public final class26 method438(byte arg0) {
        field747++;
        if (this.field738 > 0 && this.field741.field4819[this.field738 - 1] != this.field746) {
            class26 var2 = this.field746;
            this.field746 = var2.field301;
            return var2;
        }
        class26 var3;
        do {
            if (this.field738 >= this.field741.field4820) {
                if (arg0 != 101) {
                    field739 = true;
                }
                return null;
            }
            var3 = this.field741.field4819[this.field738++].field301;
        } while (this.field741.field4819[this.field738 - 1] == var3);
        this.field746 = var3.field301;
        return var3;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lic;)V", line = 286)
    public class58(class329 arg0) {
        this.field741 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "(B)V", line = 273)
    public static void method439(byte arg0) {
        field740 = null;
        int var1 = -78 % ((56 - arg0) / 37);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILfd;)V", line = 300)
    public static final void method440(int arg0, class299 arg1) {
        for (int var2 = arg0; var2 < class44.field546; var2++) {
            int var3 = arg1.method2046((byte) 98);
            int var4 = arg1.method2083((byte) -93);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class49.field651[var3] != null) {
                class49.field651[var3].field1334 = var4;
            }
        }
        field742++;
    }
}
