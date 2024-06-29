import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!t")
public class class307 {

    @OriginalMember(owner = "client!t", name = "f", descriptor = "[I")
    public static int[] field4594 = new int[2500];

    @OriginalMember(owner = "client!t", name = "a", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!t", name = "c", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!t", name = "d", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!t", name = "e", descriptor = "I")
    public static int field4593;

    @OriginalMember(owner = "client!t", name = "g", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!t", name = "h", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!t", name = "b", descriptor = "Lph;")
    public static class361 field4590;

    @OriginalMember(owner = "client!t", name = "i", descriptor = "Lph;")
    public static class361 field4597;

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(B)[Lin;", line = 7)
    public static final class177[] method2155(byte arg0) {
        class177[] var1 = new class177[class220.field3285];
        field4592++;
        for (int var2 = 0; var2 < class220.field3285; var2++) {
            int var3 = class59.field871[var2] * class225.field3397[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class225.field3385[var2];
            for (int var6 = 0; var6 < var3; var6++) {
                var4[var6] = class206.field3015[class287.method2076(255, var5[var6])];
            }
            if (class141.field2031) {
                var1[var2] = new class325(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], var4);
            } else {
                var1[var2] = new class118(class255.field3816, class22.field336, class199.field2896[var2], class160.field2319[var2], class59.field871[var2], class225.field3397[var2], var4);
            }
        }
        if (arg0 >= -124) {
            return (class177[]) null;
        } else {
            class321.method2235(-2182);
            return var1;
        }
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(I)V", line = 48)
    public static final void method2156(int arg0) {
        if (arg0 != -8600) {
            method2155((byte) -14);
        }
        field4596++;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class264.field4043 - 1); var2++) {
                if (class216.field3186[var2] < 1000 && class216.field3186[var2 + 1] > 1000) {
                    String var3 = class281.field4267[var2];
                    var1 = false;
                    class281.field4267[var2] = class281.field4267[var2 + 1];
                    class281.field4267[var2 + 1] = var3;
                    String var4 = class158.field2274[var2];
                    class158.field2274[var2] = class158.field2274[var2 + 1];
                    class158.field2274[var2 + 1] = var4;
                    int var5 = class286.field4313[var2];
                    class286.field4313[var2] = class286.field4313[var2 + 1];
                    class286.field4313[var2 + 1] = var5;
                    int var6 = class172.field2489[var2];
                    class172.field2489[var2] = class172.field2489[var2 + 1];
                    class172.field2489[var2 + 1] = var6;
                    int var7 = class324.field4886[var2];
                    class324.field4886[var2] = class324.field4886[var2 + 1];
                    class324.field4886[var2 + 1] = var7;
                    short var8 = class216.field3186[var2];
                    class216.field3186[var2] = class216.field3186[var2 + 1];
                    class216.field3186[var2 + 1] = var8;
                    long var9 = class117.field1664[var2];
                    class117.field1664[var2] = class117.field1664[var2 + 1];
                    class117.field1664[var2 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!t", name = "b", descriptor = "(I)V", line = 106)
    public static final void method2157(int arg0) {
        class247.field3658.method458((byte) -50);
        class59.field866.method458((byte) 115);
        int var1 = -57 % ((71 - arg0) / 52);
        field4591++;
    }

    @OriginalMember(owner = "client!t", name = "c", descriptor = "(I)V", line = 121)
    public static void method2158(int arg0) {
        field4590 = null;
        field4597 = null;
        if (arg0 != 1) {
            field4597 = (class361) null;
        }
        field4594 = null;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZI)V", line = 133)
    public static final void method2159(int arg0, boolean arg1, int arg2) {
        class36.field535 = (float) arg2;
        if (class86.field1208 == 2) {
            class335.field5216 = arg2;
            class362.field5746 = arg0;
        }
        field4593++;
        if (arg1) {
            method2155((byte) -54);
        }
        class103.field1476 = (float) arg0;
        class32.method226(-122);
        class71.field1010 = true;
    }

    @OriginalMember(owner = "client!t", name = "a", descriptor = "(IZIIII[BII[Lo;I)V", line = 158)
    public static final void method2160(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, class96[] arg9, int arg10) {
        field4595++;
        int var11 = -1;
        if (arg10 != 8) {
            method2160(-30, true, -55, 12, -66, 30, (byte[]) null, 48, -102, (class96[]) null, 12);
        }
        class190 var12 = new class190(arg6);
        while (true) {
            int var13 = var12.method1332(32767);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var11 += var13;
            while (true) {
                int var15 = var12.method1372(-102);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 12;
                int var18 = (var14 & 0xFD3) >> 6;
                int var19 = var12.method1319(arg10 ^ 0xF7);
                int var20 = var19 >> 2;
                int var21 = var19 & 0x3;
                if (arg3 == var17 && arg4 <= var18 && var18 < arg4 + 8 && var16 >= arg5 && var16 < (arg5 + 8)) {
                    class261 var22 = class30.method212(arg10 - 8, var11);
                    int var23 = arg2 + class112.method854(arg0, var16 & 0x7, var22.field3907, -1, var21, var22.field3962, var18 & 0x7);
                    int var24 = arg7 + class252.method1851(arg0, var16 & 0x7, var21, var22.field3962, var22.field3907, var18 & 0x7, (byte) 106);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        class96 var25 = null;
                        if (!arg1) {
                            int var26 = arg8;
                            if ((class230.field3491[1][var23][var24] & 0x2) == 2) {
                                var26 = arg8 - 1;
                            }
                            if (var26 >= 0) {
                                var25 = arg9[var26];
                            }
                        }
                        class77.method633(arg1, var11, arg8, var25, var24, !arg1, (byte) -120, var23, arg8, arg0 + var21 & 0x3, var20);
                    }
                }
            }
        }
    }
}
