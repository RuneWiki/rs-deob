import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class440 {

    @OriginalMember(owner = "client!ss", name = "l", descriptor = "Ljava/lang/String;")
    private String field5488 = "null";

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "Lrga;")
    public static class280 field5479 = new class280(12, 3);

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "C")
    public char field5478;

    @OriginalMember(owner = "client!ss", name = "s", descriptor = "C")
    public char field5495;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    private int field5482;

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!ss", name = "j", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!ss", name = "k", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!ss", name = "m", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!ss", name = "n", descriptor = "I")
    public static int field5490;

    @OriginalMember(owner = "client!ss", name = "o", descriptor = "I")
    public static int field5491;

    @OriginalMember(owner = "client!ss", name = "p", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!ss", name = "q", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!ss", name = "t", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!ss", name = "u", descriptor = "I")
    public static int field5497;

    @OriginalMember(owner = "client!ss", name = "v", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Lil;")
    public class68 field5481;

    @OriginalMember(owner = "client!ss", name = "r", descriptor = "Lil;")
    private class68 field5494;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public final boolean method2334(String arg0, int arg1) {
        field5477++;
        if (this.field5481 == null) {
            return false;
        }
        if (this.field5494 == null) {
            this.method2341((byte) 33);
        }
        for (class163 var3 = (class163) this.field5494.method399(-32748, class4.method34((byte) -116, arg0)); var3 != null; var3 = (class163) this.field5494.method408((byte) 112)) {
            if (var3.field2140.equals(arg0)) {
                return true;
            }
        }
        if (arg1 != 5) {
            this.method2347(-110, 86);
        }
        return false;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lpl;B)V")
    public static final void method2335(class612 arg0, byte arg1) {
        class11.field195 = 0;
        field5490++;
        class642.field9044 = 0;
        class290.field3620 = new class139();
        class508.field6875 = new class202[1024];
        if (arg1 != 57) {
            field5479 = null;
        }
        class474.field6012 = new class93[class573.field7995[class608.field8541] + 1];
        class475.field6032 = 0;
        class704.field9936 = 0;
        class400.method2132(arg1 + 36104, arg0);
        class124.method660(arg0, -128);
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILr;Lae;II)V")
    public static final void method2336(int arg0, class566 arg1, class40 arg2, int arg3, int arg4) {
        field5489++;
        class373.field4705.method247(2);
        if (class493.field6504) {
            return;
        }
        if (arg3 != 0) {
            method2345(false);
        }
        for (class316 var5 = (class316) arg2.method237(104); var5 != null; var5 = (class316) arg2.method245((byte) 114)) {
            class647 var6 = class656.field9234.method3771(var5.field4057, -119);
            if (class455.method2434(var6, (byte) -54)) {
                boolean var7 = class195.method1174(arg3, var5, arg1, arg0, var6, arg4);
                if (var7) {
                    class33.method217(arg1, 32993, var5, var6);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V")
    public static final void method2337(int arg0, int arg1) {
        class119 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class272 var4 = class256.field3127[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class37.field508; var5++) {
                    for (int var6 = 0; var6 < class429.field5383; var6++) {
                        var2 = var4.method1285(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class52.field775;
                            int var8 = var5 << class52.field775;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class272 var10 = class256.field3127[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1562(var5, (byte) 51, var6) - var10.method1562(var5, (byte) 51, var6);
                                    int var12 = var4.method1562(var5, (byte) 51, var6 + 1) - var10.method1562(var5, (byte) 51, var6 + 1);
                                    int var13 = var4.method1562(var5 + 1, (byte) 51, var6 + 1) - var10.method1562(var5 + 1, (byte) 51, var6 + 1);
                                    int var14 = var4.method1562(var5 + 1, (byte) 51, var6) - var10.method1562(var5 + 1, (byte) 51, var6);
                                    var10.method1284(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IIIIB)V")
    public static final void method2338(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class376.field4744 = arg0;
        if (arg4 != 50) {
            field5479 = null;
        }
        class516.field7045 = arg2;
        class167.field2195 = arg1;
        field5480++;
        class285.field3539 = arg3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZI)Z")
    public static final boolean method2339(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            return true;
        } else {
            field5497++;
            return (arg0 & 0x60000) != 0 | class167.method956((byte) 108, arg0, arg2) || class512.method2762(arg0, 55, arg2) || class214.method1269(0, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(ILes;I)V")
    private final void method2340(int arg0, class630 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5495 = class670.method3763((byte) 61, arg1.method3480(-20933));
        } else if (arg2 == 2) {
            this.field5478 = class670.method3763((byte) 68, arg1.method3480(-20933));
        } else if (arg2 == 3) {
            this.field5488 = arg1.method3500((byte) 126);
        } else if (arg2 == 4) {
            this.field5482 = arg1.method3483(62);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method3470(13111);
            this.field5481 = new class68(class391.method2101(var4, 128));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method3483(68);
                class329 var7;
                if (arg2 == 5) {
                    var7 = new class103(arg1.method3500((byte) 119));
                } else {
                    var7 = new class262(arg1.method3483(57));
                }
                this.field5481.method402(var7, (byte) -60, (long) var6);
            }
        }
        if (arg0 < 45) {
            this.field5488 = null;
        }
        field5493++;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(B)V")
    private final void method2341(byte arg0) {
        this.field5494 = new class68(this.field5481.method406(-1));
        field5483++;
        class103 var2 = (class103) this.field5481.method407((byte) 124);
        int var3 = -65 % ((-arg0 - 21) / 53);
        while (var2 != null) {
            class163 var4 = new class163(var2.field1388, (int) var2.field4199);
            this.field5494.method402(var4, (byte) -60, class4.method34((byte) -120, var2.field1388));
            var2 = (class103) this.field5481.method403(12561);
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZIIIII)V")
    public static final void method2342(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5492++;
        class600.method3293(arg1, arg6);
        int var7 = 0;
        int var8 = arg6 - arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = -arg6;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class550.field7650[arg4];
        int var16 = arg2 - var8;
        class57.method362(arg2 - arg6, var15, arg3, var16, 77);
        int var17 = arg2 + var8;
        class57.method362(var16, var15, arg5, var17, 55);
        class57.method362(var17, var15, arg3, arg2 + arg6, -115);
        while (var7 < var9) {
            var13 += 2;
            var14 += 2;
            var12 += var14;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                class469.field5963[var11] = var7;
                var11--;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                if (var8 > var9) {
                    int[] var18 = class550.field7650[arg4 + var9];
                    int[] var19 = class550.field7650[arg4 - var9];
                    int var20 = class469.field5963[var9];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var20;
                    int var24 = arg2 - var20;
                    class57.method362(var22, var18, arg3, var24, 107);
                    class57.method362(var24, var18, arg5, var23, 11);
                    class57.method362(var23, var18, arg3, var21, 123);
                    class57.method362(var22, var19, arg3, var24, -121);
                    class57.method362(var24, var19, arg5, var23, -125);
                    class57.method362(var23, var19, arg3, var21, -113);
                } else {
                    int[] var25 = class550.field7650[arg4 + var9];
                    int[] var26 = class550.field7650[arg4 - var9];
                    int var27 = arg2 + var7;
                    int var28 = arg2 - var7;
                    class57.method362(var28, var25, arg3, var27, 20);
                    class57.method362(var28, var26, arg3, var27, -106);
                }
                var10 -= var9 << 1;
            }
            int[] var29 = class550.field7650[arg4 + var7];
            int[] var30 = class550.field7650[arg4 - var7];
            int var31 = arg2 + var9;
            int var32 = arg2 - var9;
            if (var8 <= var7) {
                class57.method362(var32, var29, arg3, var31, 52);
                class57.method362(var32, var30, arg3, var31, -106);
            } else {
                int var33 = var7 > var11 ? class469.field5963[var7] : var11;
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class57.method362(var32, var29, arg3, var35, -125);
                class57.method362(var35, var29, arg5, var34, 116);
                class57.method362(var34, var29, arg3, var31, -106);
                class57.method362(var32, var30, arg3, var35, 38);
                class57.method362(var35, var30, arg5, var34, 58);
                class57.method362(var34, var30, arg3, var31, -119);
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IILr;IIIB)Lda;")
    public static final class474 method2343(int arg0, int arg1, class566 arg2, int arg3, int arg4, int arg5, byte arg6) {
        field5486++;
        long var7 = (long) arg0;
        class474 var9 = (class474) class577.field8054.method2418(var7, (byte) 100);
        if (arg6 >= -122) {
            field5479 = null;
        }
        short var10 = 2055;
        if (var9 == null) {
            class47 var11 = class156.method893(arg0, class324.field4170, 0, false);
            if (var11 == null) {
                return null;
            }
            if (var11.field667 < 13) {
                var11.method296((byte) -107, 2);
            }
            var9 = arg2.method1019(var11, var10, class486.field6442, 64, 768);
            class577.field8054.method2409(var7, var9, 1);
        }
        class474 var12 = var9.method711((byte) 2, var10, true);
        if (arg4 != 0) {
            var12.method722(arg4);
        }
        if (arg1 != 0) {
            var12.method762(arg1);
        }
        if (arg3 != 0) {
            var12.method715(arg3);
        }
        if (arg5 != 0) {
            var12.method710(0, arg5, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)Z")
    public final boolean method2344(int arg0, int arg1) {
        field5484++;
        if (this.field5481 == null) {
            return false;
        }
        if (this.field5494 == null) {
            this.method2346(-15321);
        }
        class262 var3 = (class262) this.field5494.method399(-32748, (long) arg0);
        if (arg1 >= -93) {
            this.method2349(-4, 80);
        }
        return var3 != null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Z)V")
    public static final void method2345(boolean arg0) {
        field5487++;
        class294.method1649(false);
        class83.field1173 = null;
        class395.field4968 = null;
        class337.field4338 = null;
        class683.field9599 = null;
        class474.field6009 = null;
        if (!arg0) {
            field5479 = null;
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V")
    private final void method2346(int arg0) {
        if (arg0 != -15321) {
            this.field5495 = '\u001E';
        }
        this.field5494 = new class68(this.field5481.method406(-1));
        field5491++;
        for (class262 var2 = (class262) this.field5481.method407((byte) 124); var2 != null; var2 = (class262) this.field5481.method403(arg0 + 27882)) {
            class262 var3 = new class262((int) var2.field4199);
            this.field5494.method402(var3, (byte) -76, (long) var2.field3229);
        }
    }

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "(II)I")
    public final int method2347(int arg0, int arg1) {
        field5498++;
        if (this.field5481 == null) {
            return this.field5482;
        }
        if (arg1 != 438412161) {
            this.field5482 = -56;
        }
        class262 var3 = (class262) this.field5481.method399(arg1 ^ 0xE5DE2395, (long) arg0);
        return var3 == null ? this.field5482 : var3.field3229;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Les;B)V")
    public final void method2348(class630 arg0, byte arg1) {
        if (arg1 != -67) {
            this.method2347(38, -56);
        }
        while (true) {
            int var3 = arg0.method3501(-9268);
            if (var3 == 0) {
                field5485++;
                return;
            }
            this.method2340(65, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "(II)Ljava/lang/String;")
    public final String method2349(int arg0, int arg1) {
        if (arg0 != -24908) {
            this.field5495 = 'e';
        }
        field5496++;
        if (this.field5481 == null) {
            return this.field5488;
        } else {
            class103 var3 = (class103) this.field5481.method399(-32748, (long) arg1);
            return var3 == null ? this.field5488 : var3.field1388;
        }
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V")
    public static void method2350(int arg0) {
        if (arg0 == -1) {
            field5479 = null;
        }
    }
}
