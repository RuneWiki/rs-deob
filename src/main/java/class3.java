import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class3 {

    @OriginalMember(owner = "client!pd", name = "g", descriptor = "I")
    public static int field55 = 0;

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "I")
    public static int field53;

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "I")
    public static int field54;

    @OriginalMember(owner = "client!pd", name = "h", descriptor = "I")
    public static int field56;

    @OriginalMember(owner = "client!pd", name = "i", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!pd", name = "j", descriptor = "I")
    public static int field58;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lik;")
    public static class262 field49;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 4)
    public static void method23(int arg0) {
        if (arg0 != 18) {
            method28(-23, (class98) null, -90, -125, (class135) null, (byte) 121, -81);
        }
        field49 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BIIIZLik;I)V", line = 15)
    public static final void method24(byte arg0, int arg1, int arg2, int arg3, boolean arg4, class262 arg5, int arg6) {
        class1.field23 = arg5;
        if (arg0 != -79) {
            field55 = 2;
        }
        class269.field4724 = arg1;
        class305.field5312 = 1;
        class220.field3913 = arg4;
        class331.field5655 = arg3;
        class271.field4738 = arg2;
        class223.field3951 = arg6;
        field53++;
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V", line = 53)
    public static final void method25(int arg0) {
        field56++;
        int var1 = (class305.field5295 >> 3) + (class15.field193 >> 10);
        int var2 = (class255.field4443 >> 10) + (class137.field2421 >> 3);
        byte var3 = 0;
        byte var4 = 18;
        client.field4529 = new byte[var4][];
        class242.field4214 = new int[var4][4];
        class242.field4208 = new int[var4];
        class237.field4152 = new int[var4];
        byte var5 = 8;
        class251.field4376 = new byte[var4][];
        class322.field5513 = new byte[var4][];
        class144.field2539 = new byte[var4][];
        int var6 = -79 / ((arg0 - 62) / 51);
        class57.field838 = new int[var4];
        class183.field3359 = new int[var4];
        class186.field3425 = new int[var4];
        byte var7 = 8;
        class322.field5505 = new int[var4];
        class129.field2216 = new byte[var4][];
        int var8 = 0;
        for (int var9 = (var1 - 6) / 8; var9 <= ((var1 + 6) / 8); var9++) {
            for (int var10 = (var2 - 6) / 8; var10 <= (var2 + 6) / 8; var10++) {
                int var11 = (var9 << 8) + var10;
                class57.field838[var8] = var11;
                class322.field5505[var8] = class247.field4277.method1887(-1, class117.method833(new class108[] { class45.field652, class79.method518(false, var9), class131.field2247, class79.method518(false, var10) }, false));
                class237.field4152[var8] = class247.field4277.method1887(-1, class117.method833(new class108[] { class141.field2479, class79.method518(false, var9), class131.field2247, class79.method518(false, var10) }, false));
                class186.field3425[var8] = class247.field4277.method1887(-1, class117.method833(new class108[] { class143.field2521, class79.method518(false, var9), class131.field2247, class79.method518(false, var10) }, false));
                class242.field4208[var8] = class247.field4277.method1887(-1, class117.method833(new class108[] { class135.field2334, class79.method518(false, var9), class131.field2247, class79.method518(false, var10) }, false));
                class183.field3359[var8] = class247.field4277.method1887(-1, class117.method833(new class108[] { class233.field4131, class79.method518(false, var9), class131.field2247, class79.method518(false, var10) }, false));
                if (class186.field3425[var8] == -1) {
                    class322.field5505[var8] = -1;
                    class237.field4152[var8] = -1;
                    class242.field4208[var8] = -1;
                    class183.field3359[var8] = -1;
                }
                var8++;
            }
        }
        for (int var12 = var8; var12 < class186.field3425.length; var12++) {
            class186.field3425[var12] = -1;
            class322.field5505[var12] = -1;
            class237.field4152[var12] = -1;
            class242.field4208[var12] = -1;
            class183.field3359[var12] = -1;
        }
        class229.method1538(true, var1, 28353, var2, var5, var7, var3);
    }

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "(I)V", line = 140)
    public static final void method26(int arg0) {
        if (arg0 != -6) {
            method25(33);
        }
        field52++;
        class145.field2619.method639(arg0 ^ 0x3F);
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BLrm;)V", line = 151)
    public static final void method27(byte arg0, class249 arg1) {
        field50++;
        if (class290.field5078 != null) {
            try {
                class290.field5078.method655(0, 0L);
                class290.field5078.method661(24, 56, arg1.field4314, arg1.field4338);
            } catch (Exception var3) {
            }
        }
        if (arg0 != 56) {
            field49 = (class262) null;
        }
        arg1.field4314 += 24;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILca;IILvd;BI)V", line = 172)
    public static final void method28(int arg0, class98 arg1, int arg2, int arg3, class135 arg4, byte arg5, int arg6) {
        field58++;
        if (arg4 == null) {
            return;
        }
        int var7 = -30 % ((arg5 - 78) / 47);
        int var8 = arg2 * arg2 + arg3 * arg3;
        int var9 = class328.field5609 + class186.field3423 & 0x7FF;
        int var10 = Math.max(arg1.field1673 / 2, arg1.field1688 / 2) + 10;
        if (var8 > var10 * var10) {
            return;
        }
        int var11 = class263.field4649[var9];
        int var12 = class263.field4653[var9];
        int var13 = var11 * 256 / (class272.field4775 + 256);
        int var14 = var12 * 256 / (class272.field4775 + 256);
        int var15 = arg2 * var13 + arg3 * var14 >> 16;
        int var16 = arg3 * var13 - (arg2 * var14) >> 16;
        if (class231.field4051) {
            ((class49) arg4).method338(arg1.field1673 / 2 + arg6 + var15 - (arg4.field2342 / 2), arg1.field1688 / 2 + -(arg4.field2336 / 2) + arg0 + -var16, (class49) arg1.method665(false, (byte) 53));
        } else {
            ((class12) arg4).method79(arg1.field1673 / 2 + var15 + arg6 - (arg4.field2342 / 2), -var16 + arg0 + -(arg4.field2336 / 2) - -(arg1.field1688 / 2), arg1.field1618, arg1.field1709);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)I", line = 209)
    public static final int method29(int arg0, int arg1, int arg2) {
        field54++;
        class117 var3 = (class117) class98.field1620.method1676((long) arg1, (byte) -89);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg0 != 2) {
                method28(-17, (class98) null, 40, -120, (class135) null, (byte) -106, 37);
            }
            while (var3.field2036.length > var5) {
                if (var3.field2028[var5] == arg2) {
                    var4 += var3.field2036[var5];
                }
                var5++;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "(III)Lal;", line = 251)
    public static final class326 method30(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1119; var4++) {
            class326 var5 = var3.field1118[var4];
            if ((var5.field5563 >> 29 & 0x3L) == 2L && var5.field5575 == arg1 && var5.field5576 == arg2) {
                class268.method1941(var5);
                return var5;
            }
        }
        return null;
    }
}
