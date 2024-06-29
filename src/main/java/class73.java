import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class73 extends class128 {

    @OriginalMember(owner = "client!nf", name = "P", descriptor = "I")
    private int field931 = 2000;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "I")
    private int field932 = 0;

    @OriginalMember(owner = "client!nf", name = "U", descriptor = "I")
    private int field936 = 0;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "I")
    private int field929 = 4096;

    @OriginalMember(owner = "client!nf", name = "R", descriptor = "I")
    private int field933 = 16;

    @OriginalMember(owner = "client!nf", name = "S", descriptor = "Ljava/lang/String;")
    public static String field934 = "scroll:";

    @OriginalMember(owner = "client!nf", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field942 = "Take";

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!nf", name = "T", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!nf", name = "V", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!nf", name = "W", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!nf", name = "Y", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!nf", name = "Z", descriptor = "I")
    public static int field941;

    @OriginalMember(owner = "client!nf", name = "bb", descriptor = "I")
    public static int field943;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "Lbh;")
    public static class288 field928;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "[I")
    public static int[] field930;

    @OriginalMember(owner = "client!nf", name = "X", descriptor = "[Ljava/lang/String;")
    public static String[] field939;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "(I)V", line = 5)
    public static void method440(int arg0) {
        field942 = null;
        field934 = null;
        if (arg0 <= 37) {
            method446((byte) -23, -77);
        }
        field939 = null;
        field928 = null;
        field930 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Ljava/lang/String;II)V", line = 19)
    public static final void method441(String arg0, int arg1, int arg2) {
        field926++;
        if (arg2 != 18269) {
            field943 = 4;
        }
        boolean var3 = false;
        String var4 = class154.method1025(class69.method430(false, arg0), -127);
        for (int var5 = 0; var5 < class204.field2864; var5++) {
            class109 var6 = class328.field5009[class180.field2612[var5]];
            if (var6 != null && var6.field1496 != null && var6.field1496.equalsIgnoreCase(var4)) {
                if (arg1 == 1) {
                    class147.field2039++;
                    class140.field1954.method573(124, 102);
                    class140.field1954.method642(arg2 ^ 0xFFFFB8C4, class180.field2612[var5]);
                    class140.field1954.method671(0, 255);
                } else if (arg1 == 4) {
                    class140.field1954.method573(122, 19);
                    class140.field1954.method648(0, (byte) 38);
                    class158.field2183++;
                    class140.field1954.method684(class180.field2612[var5], false);
                } else if (arg1 == 5) {
                    class140.field1954.method573(120, 158);
                    class140.field1954.method671(0, 255);
                    class264.field4166++;
                    class140.field1954.method663(class180.field2612[var5], 128);
                } else if (arg1 == 6) {
                    class140.field1954.method573(115, 212);
                    class19.field246++;
                    class140.field1954.method642(-114, class180.field2612[var5]);
                    class140.field1954.method671(0, 255);
                } else if (arg1 == 7) {
                    class298.field4648++;
                    class140.field1954.method573(arg2 ^ 0x4725, 216);
                    class140.field1954.method642(arg2 - 18386, class180.field2612[var5]);
                    class140.field1954.method648(0, (byte) 38);
                }
                var3 = true;
                break;
            }
        }
        if (!var3) {
            class150.method1010(class58.field701 + var4, 0, (byte) -59, "");
        }
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "()V", line = 100)
    public class73() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lp;II)V", line = 108)
    public final void method107(class107 arg0, int arg1, int arg2) {
        if (arg2 >= -85) {
            method442(82, -36);
        }
        field927++;
        if (arg1 == 0) {
            this.field932 = arg0.method661(-1);
        } else if (arg1 == 1) {
            this.field931 = arg0.method624(14612);
        } else if (arg1 == 2) {
            this.field933 = arg0.method661(-1);
        } else if (arg1 == 3) {
            this.field936 = arg0.method624(14612);
        } else if (arg1 == 4) {
            this.field929 = arg0.method624(14612);
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)Ljava/lang/String;", line = 174)
    public static final String method442(int arg0, int arg1) {
        field925++;
        return arg0 < ~arg1 ? Integer.toString(arg1) : "*";
    }

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "(I)V", line = 185)
    public static final void method443(int arg0) {
        if (arg0 != 2048) {
            method445(-39, 21, -71, 9, (class47) null, -18, -57L, 80, -24, -34, -94);
        }
        field937++;
        class292.field4579.method1241(121);
        class19.field248.method1241(118);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)V", line = 203)
    public final void method130(boolean arg0) {
        field940++;
        class78.method462(-1);
        if (arg0) {
            field942 = (String) null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B[J[I)V", line = 214)
    public static final void method444(byte arg0, long[] arg1, int[] arg2) {
        if (arg0 != -12) {
            field928 = (class288) null;
        }
        field941++;
        class232.method1639(arg1, -32239, 0, arg1.length - 1, arg2);
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(BI)[I", line = 231)
    public final int[] method126(byte arg0, int arg1) {
        int[] var3 = this.field1748.method902(arg1, true);
        if (this.field1748.field1878) {
            int var4 = this.field929 >> 1;
            int[][] var5 = this.field1748.method894(false);
            Random var6 = new Random((long) this.field932);
            for (int var7 = 0; var7 < this.field931; var7++) {
                int var8 = this.field929 <= 0 ? this.field936 : this.field936 + class31.method189(this.field929, 87, var6) - var4;
                int var9 = (var8 & 0xFF8) >> 4;
                int var10 = class31.method189(class10.field141, -111, var6);
                int var11 = class31.method189(class322.field4940, 112, var6);
                int var12 = (class276.field4298[var9] * this.field933 >> 12) + var10;
                int var13 = (class43.field503[var9] * this.field933 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = var12 - var10;
                if (var15 != 0 || var14 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var15 < var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        var10 = var12;
                        var12 = var19;
                        int var20 = var11;
                        var11 = var13;
                        var13 = var20;
                    }
                    int var21 = var12 - var10;
                    int var22 = var11;
                    int var23 = var13 - var11;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var24 = -var21 / 2;
                    int var25 = 2048 / var21;
                    int var26 = 1024 - (class31.method189(4096, 115, var6) >> 2);
                    int var27 = var13 > var11 ? 1 : -1;
                    for (int var28 = var10; var28 < var12; var28++) {
                        var24 += var23;
                        int var29 = var26 + ((-var10 + var28) * var25) + 1024;
                        int var30 = class244.field3664 & var28;
                        int var31 = var22 & class237.field3486;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (var24 > 0) {
                            var22 -= -var27;
                            var24 += -var21;
                        }
                    }
                }
            }
        }
        if (arg0 <= 100) {
            method444((byte) 112, (long[]) null, (int[]) null);
        }
        field938++;
        return var3;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIILen;IJIIII)Z", line = 362)
    public static final boolean method445(int arg0, int arg1, int arg2, int arg3, class47 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class331.method2282(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(BI)Lgg;", line = 369)
    public static final class79 method446(byte arg0, int arg1) {
        if (arg0 <= 38) {
            method441((String) null, -69, 32);
        }
        field924++;
        return (class79) class335.field5171.method1537((long) arg1, -22708);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(III)V", line = 384)
    public static final void method447(int arg0, int arg1, int arg2) {
        short var3 = 256;
        if (arg1 >= -114) {
            return;
        }
        field935++;
        if (class103.field1334 > 0) {
            class216.method1492(0, class103.field1334);
            class103.field1334 = 0;
        }
        int var4 = 0;
        int var5 = class144.field2009 * arg2;
        int var6 = 0;
        for (int var7 = 1; var7 < (var3 - 1); var7++) {
            int var8 = (var3 - var7) * class50.field626[var7] / var3;
            if (var8 < 0) {
                var8 = 0;
            }
            var4 += var8;
            for (int var9 = var8; var9 < 128; var9++) {
                int var10 = class165.field2285[var4++];
                int var11 = class144.field2005[var5++ + arg0];
                if (var10 == 0) {
                    class244.field3682.field2717[var6++] = var11;
                } else {
                    int var12 = 238 - var10;
                    if (var12 > 255) {
                        var12 = 255;
                    }
                    int var13 = var10 + 18;
                    int var14 = class242.field3643[var10];
                    if (var13 > 255) {
                        var13 = 255;
                    }
                    class244.field3682.field2717[var6++] = class229.method1613(class229.method1613(var11, 16711935) * var12 + class229.method1613(var14, 16711935) * var13, -16711936) + class229.method1613(16711680, class229.method1613(65280, var11) * var12 + class229.method1613(var14, 65280) * var13) >> 8;
                }
            }
            for (int var15 = 0; var15 < var8; var15++) {
                class244.field3682.field2717[var6++] = class144.field2005[var5++ + arg0];
            }
            var5 += class144.field2009 - 128;
        }
        if (class250.field3787) {
            class306.method2139(class244.field3682.field2717, arg0, arg2, class244.field3682.field1136, class244.field3682.field1144);
        } else {
            class244.field3682.method538(arg0, arg2);
        }
    }
}
