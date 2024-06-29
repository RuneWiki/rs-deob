import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class130 {

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "[I")
    public static int[] field2200 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "F")
    public static float field2203;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field2204;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "Lsi;")
    public static class351 field2195;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIIIIILhd;IZJ)Z", line = 5)
    public static final boolean method993(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class161 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class27.field332 == class101.field1656;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                if (var15 < 0 || var16 < 0 || var15 >= class273.field4526 || var16 >= class162.field2574) {
                    return false;
                }
                class36 var17 = class129.field2184[arg0][var15][var16];
                if (var17 != null && var17.field531 >= 5) {
                    return false;
                }
            }
        }
        class209 var18 = new class209();
        var18.field3279 = arg11;
        var18.field3293 = arg0;
        var18.field3288 = arg5;
        var18.field3290 = arg6;
        var18.field3286 = arg7;
        var18.field3287 = arg8;
        var18.field3295 = arg9;
        var18.field3283 = arg1;
        var18.field3291 = arg2;
        var18.field3289 = arg1 + arg3 - 1;
        var18.field3280 = arg2 + arg4 - 1;
        for (int var19 = arg1; var19 < arg1 + arg3; var19++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                int var21 = 0;
                if (var19 > arg1) {
                    var21++;
                }
                if (var19 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; var22--) {
                    if (class129.field2184[var22][var19][var20] == null) {
                        class129.field2184[var22][var19][var20] = new class36(var22, var19, var20);
                    }
                }
                class36 var23 = class129.field2184[arg0][var19][var20];
                var23.field544[var23.field531] = var18;
                var23.field523[var23.field531] = var21;
                var23.field552 |= var21;
                var23.field531++;
                if (var13 && class128.field2168[var19][var20] != 0) {
                    var14 = class128.field2168[var19][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var24 = arg1; var24 < arg1 + arg3; var24++) {
                for (int var25 = arg2; var25 < arg2 + arg4; var25++) {
                    if (class128.field2168[var24][var25] == 0) {
                        class128.field2168[var24][var25] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class335.field5299[class301.field4847++] = var18;
        }
        return true;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 124)
    public static final void method994(int arg0) {
        class356.field5645 = 0;
        class309.field4925 = 0;
        class183.method1444(31267);
        class213.method1612((byte) -89);
        if (arg0 != 30925) {
            field2203 = 0.14952782F;
        }
        field2204++;
        class274.method2047(5);
        class105.method814(122);
        for (int var1 = 0; var1 < class309.field4925; var1++) {
            int var2 = class211.field3379[var1];
            if (class332.field5261 != class56.field924[var2].field3550) {
                if (class56.field924[var2].field4351 > 0) {
                    class179.method1407(class56.field924[var2], (byte) 117, var2);
                }
                class56.field924[var2] = null;
            }
        }
        if (class223.field3706 != class29.field383.field3760) {
            throw new RuntimeException("gpp1 pos:" + class29.field383.field3760 + " psize:" + class223.field3706);
        }
        for (int var3 = 0; var3 < class345.field5501; var3++) {
            if (class56.field924[class306.field4895[var3]] == null) {
                throw new RuntimeException("gpp2 pos:" + var3 + " size:" + class345.field5501);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(I)V", line = 177)
    public static void method995(int arg0) {
        field2195 = null;
        field2200 = null;
        if (arg0 != 8) {
            method995(66);
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 192)
    public static final int method996(String arg0, int arg1) {
        if (arg1 != 30958) {
            method1000(6, (byte[]) null);
        }
        field2194++;
        return class200.method1536(true, 10, 119, arg0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IB)Lbh;", line = 209)
    public static final class210 method997(int arg0, byte arg1) {
        field2205++;
        class210 var2 = (class210) class7.field73.method2329((byte) 107, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class101.field1654.method472(arg0, 92, 0);
        class210 var4 = new class210();
        if (var3 != null) {
            var4.method1584(new class227(var3), (byte) 124);
        }
        var4.method1588(-117);
        if (arg1 != 100) {
            method994(8);
        }
        class7.field73.method2333((long) arg0, 0, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lth;Z)V", line = 234)
    public static final void method998(class57 arg0, boolean arg1) {
        field2201++;
        class226.field3725 = class49.method387(class40.field586, arg0, (byte) 120);
        class184.field2967 = new int[256];
        for (int var2 = 0; var2 < 3; var2++) {
            float var3 = (float) ((class297.field4772[var2] & 0xFF0000) >> 16);
            int var4 = (class297.field4772[var2 + 1] & 0xFF0000) >> 16;
            int var5 = (class297.field4772[var2 + 1] & 0xFF00) >> 8;
            float var6 = ((float) var4 - var3) / 64.0F;
            float var7 = (float) (class297.field4772[var2] >> 8 & 0xFF);
            float var8 = (float) (class297.field4772[var2] & 0xFF);
            int var9 = class297.field4772[var2 + 1] & 0xFF;
            float var10 = ((float) var5 - var7) / 64.0F;
            float var11 = ((float) var9 - var8) / 64.0F;
            for (int var12 = 0; var12 < 64; var12++) {
                class184.field2967[var2 * 64 + var12] = class75.method624(class75.method624((int) var3 << 16, (int) var7 << 8), (int) var8);
                var7 += var10;
                var3 += var6;
                var8 += var11;
            }
        }
        for (int var13 = 192; var13 < 255; var13++) {
            class184.field2967[var13] = class297.field4772[3];
        }
        class196.field3131 = new int[32768];
        class121.field2091 = new int[32768];
        class129.method992((class341) null, arg1);
        class350.field5566 = new int[32768];
        class223.field3708 = new int[32768];
        field2195 = new class351(128, 254);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(I)V", line = 306)
    public static final void method999(int arg0) {
        class150.method1157();
        class308.field4917 = new class5[8];
        class308.field4917[1] = new class99();
        field2202++;
        if (arg0 != 0) {
            return;
        }
        class308.field4917[2] = new class289();
        class308.field4917[3] = new class269();
        class308.field4917[4] = new class136();
        class308.field4917[5] = new class326();
        class308.field4917[6] = new class9();
        class308.field4917[7] = new class133();
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I[B)[B", line = 327)
    public static final byte[] method1000(int arg0, byte[] arg1) {
        field2197++;
        class227 var2 = new class227(arg1);
        int var3 = var2.method1720((byte) -41);
        int var4 = var2.method1715((byte) 92);
        if (arg0 != 9) {
            method994(85);
        }
        if (var4 < 0 || !(class143.field2334 == 0 || var4 <= class143.field2334)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method1753(var4, -8988, 0, var7);
            return var7;
        } else {
            int var5 = var2.method1715((byte) -110);
            if (var5 < 0 || class143.field2334 != 0 && class143.field2334 < var5) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class263.method2001(var6, var5, arg1, var4, 9);
            } else {
                class327.field5211.method366((byte) -49, var6, var2);
            }
            return var6;
        }
    }
}
