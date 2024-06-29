import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class352 {

    @OriginalMember(owner = "client!b", name = "i", descriptor = "[Lah;")
    public class406[] field5681 = null;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Lfd;")
    public class555 field5686 = null;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "Lfd;")
    public class555 field5687 = null;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "[Lah;")
    private class406[] field5684 = null;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "Lgca;")
    private class261 field5690;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "Z")
    public boolean field5689;

    @OriginalMember(owner = "client!b", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field5693 = new String[] { method2931(method2930("R\u0019ATh")), method2931(method2930("GB\u0003\u0016")), method2931(method2930("K\u0019S\u0013{@CQR")), method2931(method2930("K\u0019)R")), method2931(method2930("dR\u0002@")), method2931(method2930("K\u0019+R")), method2931(method2930("oG\u001c@")), method2931(method2930("K\u0019*R")), method2931(method2930("K\u0019.R")), method2931(method2930("K\u0019-R")), method2931(method2930("K\u0019,R")) };

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field5682;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field5688;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field5692;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Z")
    public final boolean method2924(int arg0) {
        try {
            field5682++;
            if (arg0 != 20) {
                return true;
            } else if (this.field5689) {
                return this.field5687 != null;
            } else {
                return this.field5681 != null;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field5693[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)[I")
    public static final int[] method2925(byte arg0) {
        try {
            field5683++;
            if (arg0 >= -104) {
                method2926(-17, null, null, false, (byte) 103);
            }
            return new int[] { class45.field506, class685.field9908, class103.field1519 };
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5693[8] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;ZB)V")
    public static final void method2926(int arg0, String arg1, String arg2, boolean arg3, byte arg4) {
        try {
            field5692++;
            if (arg4 <= 124) {
                method2925((byte) -18);
            }
            class487 var5 = class411.method3295(false);
            var5.field7362.method1678(class245.field3784.field3568, 65280);
            var5.field7362.method1650((byte) -95, 0);
            int var6 = var5.field7362.field2799;
            var5.field7362.method1650((byte) -95, 656);
            int[] var7 = class50.method518(52, var5);
            int var8 = var5.field7362.field2799;
            var5.field7362.method1681(arg2, 23137);
            var5.field7362.method1650((byte) -95, class734.field10757);
            var5.field7362.method1681(arg1, 23137);
            var5.field7362.method1683(class596.field8629, -90);
            var5.field7362.method1678(class795.field11624, 65280);
            var5.field7362.method1678(class305.field4924.field8482, 65280);
            class647.method4712(24359, var5.field7362);
            String var9 = class595.field8593;
            var5.field7362.method1678(var9 == null ? 0 : 1, 65280);
            if (var9 != null) {
                var5.field7362.method1681(var9, 23137);
            }
            var5.field7362.method1678(arg0, 65280);
            var5.field7362.method1678(arg3 ? 1 : 0, 65280);
            var5.field7362.field2799 += 7;
            var5.field7362.method1679(var7, var8, var5.field7362.field2799, -612867131);
            var5.field7362.method1662(8, var5.field7362.field2799 - var6);
            class185.field2943.method1546(var5, 1);
            class268.field4323 = -3;
            class494.field7431 = 1;
            class232.field3607 = 0;
            class667.field9488 = 0;
            if (arg0 < 13) {
                class755.field11106 = true;
                class338.method2849(false);
            }
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field5693[9] + arg0 + ',' + (arg1 == null ? field5693[1] : field5693[0]) + ',' + (arg2 == null ? field5693[1] : field5693[0]) + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IILd;IILha;I)V")
    public static final void method2927(int arg0, int arg1, class158 arg2, int arg3, int arg4, class63 arg5, int arg6) {
        try {
            if (class672.field9539 < 100) {
                class325.method2766(true, arg5, arg2);
            }
            field5685++;
            arg5.method221(arg4, arg6, arg3 + arg4, arg1 + arg6);
            if (class672.field9539 < 100) {
                byte var7 = 20;
                int var8 = arg3 / 2 + arg4;
                int var9 = arg1 / 2 + arg6 - var7 - 18;
                arg5.method242(arg4, arg6, arg3, arg1, -16777216, 0);
                arg5.method208(var8 - 152, var9, 304, 34, class266.field4310[class393.field6250].getRGB(), 0);
                arg5.method242(var8 - 150, var9 + 2, class672.field9539 * 3, 30, class494.field7425[class393.field6250].getRGB(), 0);
                class461.field7108.method680(var7 + var9, (byte) -78, -1, var8, class428.field6750[class393.field6250].getRGB(), class709.field10220.method5154(class795.field11624, (byte) 65));
            } else {
                int var10 = class95.field1383 - ((int) ((float) arg3 / class770.field11259));
                int var11 = class317.field5174 + ((int) ((float) arg1 / class770.field11259));
                int var12 = (int) ((float) arg3 / class770.field11259) + class95.field1383;
                int var13 = class317.field5174 - ((int) ((float) arg1 / class770.field11259));
                class361.field5824 = (int) ((float) (arg1 * 2) / class770.field11259);
                class672.field9544 = class95.field1383 - (int) ((float) arg3 / class770.field11259);
                class184.field2933 = (int) ((float) (arg3 * 2) / class770.field11259);
                class404.field6361 = class317.field5174 - ((int) ((float) arg1 / class770.field11259));
                class770.method5559(class770.field11276 + var10, class770.field11270 + var11, class770.field11276 + var12, class770.field11270 + var13, arg4, arg6, arg4 + arg3, arg6 - -1 + arg1);
                class770.method5542(arg5);
                class398 var14 = class770.method5544(arg5);
                class576.method4227(0, var14, 100, 0, arg5);
                if (~class750.field11052 < arg0) {
                    class153.field2137--;
                    if (class153.field2137 == 0) {
                        class153.field2137 = 20;
                        class750.field11052--;
                    }
                }
                if (class712.field10300) {
                    int var15 = arg3 + arg4 - 5;
                    int var16 = arg1 + arg6 - 8;
                    class213.field3367.method674(field5693[6] + class43.field481, 16776960, var16, -1, var15, 10475);
                    int var22 = var16 - 15;
                    Runtime var17 = Runtime.getRuntime();
                    int var18 = (int) ((var17.totalMemory() - var17.freeMemory()) / 1024L);
                    int var19 = 16776960;
                    if (var18 > 65536) {
                        var19 = 16711680;
                    }
                    class213.field3367.method674(field5693[4] + var18 + "k", var19, var22, -1, var15, 10475);
                    var16 = var22 - 15;
                }
            }
        } catch (RuntimeException var21) {
            throw class590.method4333(var21, field5693[5] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field5693[1] : field5693[0]) + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field5693[1] : field5693[0]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Z")
    public final boolean method2928(byte arg0) {
        try {
            field5688++;
            if (this.field5686 == null) {
                if (class54.field690 == null) {
                    byte[] var2 = class774.method5574(false, 0.6F, 4.0F, new class479(419684), 4.0F, 16, 128, 128, 16.0F, 8, 0.5F);
                    class54.field690 = class277.method2374(var2, 1, false);
                }
                byte[] var3 = class297.method2559(true, class54.field690, false);
                byte[] var4 = new byte[var3.length * 4];
                int var5 = 0;
                for (int var6 = 0; var6 < 16; var6++) {
                    int var7 = var6 * 128 * 128;
                    int var8 = var7;
                    for (int var9 = 0; var9 < 128; var9++) {
                        int var10 = var8 + (var9 * 128);
                        int var11 = (var9 - 1 & 0x7F) * 128 + var8;
                        int var12 = var8 + ((var9 + 1 & 0x7F) * 128);
                        for (int var13 = 0; var13 < 128; var13++) {
                            float var14 = (float) ((var3[var11 + var13] & 0xFF) - (var3[var12 + var13] & 0xFF));
                            float var15 = (float) ((var3[(var13 - 1 & 0x7F) + var10] & 0xFF) - (var3[(var13 + 1 & 0x7F) + var10] & 0xFF));
                            float var16 = (float) (128.0D / Math.sqrt((double) (var14 * var14 + var15 * var15 + 16384.0F)));
                            var4[var5++] = (byte) ((int) (var15 * var16 + 127.0F));
                            var4[var5++] = (byte) ((int) (var16 * 128.0F + 127.0F));
                            var4[var5++] = (byte) ((int) (var14 * var16 + 127.0F));
                            var4[var5++] = var3[var7++];
                        }
                    }
                }
                this.field5686 = this.field5690.method1080(var4, 128, 16, class313.field5120, (byte) 103, 128);
            }
            int var17 = 60 / ((arg0 + 10) / 48);
            return this.field5686 != null;
        } catch (RuntimeException var19) {
            throw class590.method4333(var19, field5693[10] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "(Lgca;)V")
    public class352(class261 arg0) {
        try {
            this.field5690 = arg0;
            this.field5689 = this.field5690.field4140;
            if (this.field5689 && !this.field5690.method1034((byte) -103, class225.field3529, class544.field8004)) {
                this.field5689 = false;
            }
            if (this.field5689 || this.field5690.method1058(6, class544.field8004, class225.field3529)) {
                class100.method947(18724);
                if (this.field5689) {
                    byte[] var6 = class297.method2559(true, class317.field5179, false);
                    this.field5687 = this.field5690.method1080(var6, 128, 16, class225.field3529, (byte) 95, 128);
                    byte[] var7 = class297.method2559(true, class52.field640, false);
                    this.field5690.method1080(var7, 128, 16, class225.field3529, (byte) 88, 128);
                } else {
                    this.field5681 = new class406[16];
                    for (int var2 = 0; var2 < 16; var2++) {
                        byte[] var3 = class466.method3602(var2 * 256 * 128, class317.field5179, 32768, (byte) 51);
                        this.field5681[var2] = this.field5690.method2246(var3, 128, class225.field3529, 128, -103, true);
                    }
                    this.field5684 = new class406[16];
                    for (int var4 = 0; var4 < 16; var4++) {
                        byte[] var5 = class466.method3602(var4 * 256 * 128, class52.field640, 32768, (byte) 51);
                        this.field5684[var4] = this.field5690.method2246(var5, 128, class225.field3529, 128, -123, true);
                    }
                }
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field5693[2] + (arg0 == null ? field5693[1] : field5693[0]) + ')');
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static final void method2929(byte arg0) {
        try {
            field5691++;
            if (arg0 == 47) {
                class152.field2126.method730(true);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field5693[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!b", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2930(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x15);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!b", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2931(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 41;
                    break;
                case 1:
                    var10005 = 55;
                    break;
                case 2:
                    var10005 = 111;
                    break;
                case 3:
                    var10005 = 122;
                    break;
                default:
                    var10005 = 21;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
