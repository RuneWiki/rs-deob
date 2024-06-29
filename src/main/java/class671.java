import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class671 extends class152 {

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "Z")
    public boolean field9211 = true;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field9194;

    @OriginalMember(owner = "client!ph", name = "w", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!ph", name = "x", descriptor = "I")
    public static int field9196;

    @OriginalMember(owner = "client!ph", name = "A", descriptor = "I")
    public static int field9199;

    @OriginalMember(owner = "client!ph", name = "B", descriptor = "I")
    public static int field9200;

    @OriginalMember(owner = "client!ph", name = "C", descriptor = "I")
    public static int field9201;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field9202;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public static int field9206;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field9207;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field9208;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field9212;

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "I")
    public static int field9213;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "Lqca;")
    public class127 field9204;

    @OriginalMember(owner = "client!ph", name = "z", descriptor = "[I")
    private int[] field9198;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "[I")
    public int[] field9209;

    @OriginalMember(owner = "client!ph", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field9197;

    @OriginalMember(owner = "client!ph", name = "G", descriptor = "[[I")
    private int[][] field9205;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)I", line = 5)
    public final int method3762(int arg0) {
        field9214++;
        if (arg0 != 0) {
            this.field9197 = null;
        }
        return this.field9198 == null ? 0 : this.field9198.length;
    }

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(I)Ljava/lang/String;", line = 19)
    public final String method3763(int arg0) {
        field9199++;
        if (arg0 != 8211) {
            return null;
        }
        StringBuffer var2 = new StringBuffer(80);
        if (this.field9197 == null) {
            return "";
        }
        var2.append(this.field9197[0]);
        for (int var3 = 1; var3 < this.field9197.length; var3++) {
            var2.append("...");
            var2.append(this.field9197[var3]);
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILjava/lang/String;Lbq;Lha;ZLda;)V", line = 47)
    public static final void method3764(int arg0, String arg1, class307 arg2, class66 arg3, boolean arg4, class67 arg5) {
        field9194++;
        boolean var6 = !class83.field1124 || class674.method3784((byte) -124);
        if (!var6) {
            return;
        }
        if (arg0 > -33) {
            field9213 = 6;
        }
        if (class83.field1124 && var6) {
            class307 var7 = class145.field1824;
            class67 var8 = arg3.method579(var7, class330.field4085, true);
            int var9 = var7.method1815(false, null, arg1, 250);
            int var10 = var7.method1816(null, var7.field3782, 250, (byte) -110, arg1);
            int var11 = class212.field2505.field8123;
            int var12 = var11 + 4;
            int var13 = var12 * 2 + var10;
            int var14 = var12 * 2 + var9;
            if (class117.field1483 > var14) {
                var14 = class117.field1483;
            }
            if (class150.field1878 > var13) {
                var13 = class150.field1878;
            }
            int var15 = class192.field2294.method860((byte) -62, class243.field2870, var14) + class194.field2308;
            int var16 = class431.field5680.method102(var13, (byte) 69, class412.field5381) + class512.field7233;
            if (class769.field10572) {
                var15 += class793.method4373((byte) 87);
                var16 += class719.method4070((byte) 124);
            }
            arg3.method640(class662.field9093, false).method1635(class386.field4974.field8123 + var15, class386.field4974.field8116 + var16, var14 - class386.field4974.field8123 * 2, -(class386.field4974.field8116 * 2) + var13, 1, 0, 0);
            arg3.method640(class386.field4974, true).method1838(var15, var16);
            class386.field4974.method3423();
            arg3.method640(class386.field4974, true).method1838(var14 + var15 - var11, var16);
            class386.field4974.method3432();
            arg3.method640(class386.field4974, true).method1838(var14 + var15 - var11, var13 + var16 + -var11);
            class386.field4974.method3423();
            arg3.method640(class386.field4974, true).method1838(var15, var13 + var16 - var11);
            class386.field4974.method3432();
            arg3.method640(class212.field2505, true).method1844(var15, class386.field4974.field8116 + var16, var11, var13 - (class386.field4974.field8116 * 2));
            class212.field2505.method3428();
            arg3.method640(class212.field2505, true).method1844(class386.field4974.field8123 + var15, var16, var14 - (class386.field4974.field8123 * 2), var11);
            class212.field2505.method3428();
            arg3.method640(class212.field2505, true).method1844(var15 + var14 - var11, class386.field4974.field8116 + var16, var11, var13 - (class386.field4974.field8116 * 2));
            class212.field2505.method3428();
            arg3.method640(class212.field2505, true).method1844(class386.field4974.field8123 + var15, var16 - -var13 + -var11, var14 - (class386.field4974.field8123 * 2), var11);
            class212.field2505.method3428();
            var8.method668(0, -1, false, 1, 0, var12 + var16, 1, arg1, 0, var13 - (var12 * 2), null, null, var14 - (var12 * 2), null, var12 + var15, class441.field5922 | 0xFF000000);
            class181.method1214(2740, var13, var15, var16, var14);
        } else {
            int var17 = arg2.method1815(false, null, arg1, 250);
            int var18 = arg2.method1812(null, arg1, -14563, 250) * 13;
            byte var19 = 4;
            int var20 = var19 + 6;
            int var21 = var19 + 6;
            arg3.method645(var20 - var19, var21 - var19, var17 + var19 + var19, var18 - -var19 + var19, -16777216, 0);
            arg3.method633(var20 - var19, var21 - var19, var17 + var19 + var19, var19 + var19 + var18, -1, 0);
            arg5.method668(0, -1, false, 1, 0, var21, 1, arg1, 0, var18, null, null, var17, null, var20, -1);
            class181.method1214(2740, var18 + var19 + var19, -var19 + var20, var21 - var19, var17 - -var19 + var19);
        }
        if (!arg4) {
            return;
        }
        try {
            if (class769.field10572) {
                class505.method3027(-61);
            } else {
                arg3.method591((byte) -76);
            }
        } catch (class677 var22) {
        }
    }

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "(I)V", line = 147)
    public static final void method3765(int arg0) throws IOException {
        if (class436.field5748 != null && class535.field7533 > 0) {
            class595.field8084.field5262 = 0;
            while (true) {
                class336 var1 = (class336) class266.field3145.method2725(arg0 - 8240);
                if (var1 == null || (class595.field8084.field5275.length - class595.field8084.field5262) < var1.field4153) {
                    class436.field5748.method769(class595.field8084.field5262, arg0 - 36863, 0, class595.field8084.field5275);
                    class541.field7603 += class595.field8084.field5262;
                    class566.field7797 = 0;
                    break;
                }
                class595.field8084.method2355(var1.field4150.field5275, var1.field4153, (byte) 74, 0);
                class535.field7533 -= var1.field4153;
                var1.method2219(13630);
                var1.field4150.method2395(false);
                var1.method1992((byte) 104);
            }
        }
        if (arg0 != 8277) {
            method3767(69, -104, -13);
        }
        field9195++;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZLes;)Ljava/lang/String;", line = 184)
    public final String method3766(boolean arg0, class403 arg1) {
        field9208++;
        if (arg0) {
            this.method3770(null, -72, -61);
        }
        StringBuffer var3 = new StringBuffer(80);
        if (this.field9198 != null) {
            for (int var4 = 0; var4 < this.field9198.length; var4++) {
                var3.append(this.field9197[var4]);
                var3.append(this.field9204.method970(arg1.method2419(false, method3775(this.field9198[var4], true).field527), this.field9205[var4], -120, this.method3768(-21079, var4)));
            }
        }
        var3.append(this.field9197[this.field9197.length - 1]);
        return var3.toString();
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(III)I", line = 213)
    public static final int method3767(int arg0, int arg1, int arg2) {
        if (arg2 != 8250) {
            return -74;
        }
        field9206++;
        int var3 = arg0 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg0 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg0 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return (((arg1 & 0xFF00FF) * var4 & 0xFF00FF00 | (arg1 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(II)Lbja;", line = 229)
    public final class34 method3768(int arg0, int arg1) {
        field9202++;
        if (this.field9198 == null || arg1 < 0 || arg1 > this.field9198.length) {
            return null;
        } else if (arg0 == -21079) {
            return method3775(this.field9198[arg1], true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Lkq;B)V", line = 245)
    public static final void method3769(class620 arg0, byte arg1) {
        field9212++;
        if (arg1 >= -10 || class411.field5378 != arg0.field8351) {
            return;
        }
        if (class300.field3596.field7399 == null) {
            arg0.field8354 = 0;
            arg0.field8401 = 0;
            return;
        }
        arg0.field8382 = 150;
        arg0.field8446 = (int) (Math.sin((double) class228.field2707 / 40.0D) * 256.0D) & 0x7FF;
        arg0.field8354 = class782.field10790;
        arg0.field8512 = 5;
        arg0.field8401 = class569.method3289(class300.field3596.field7399, (byte) -87);
        arg0.field8337 = class300.field3596.field3399;
        arg0.field8460 = class300.field3596.field3407;
        arg0.field8362 = 0;
        arg0.field8404 = class300.field3596.field3409;
        class582 var2 = arg0.field8337 == -1 ? null : class362.field4504.method3600(-114, arg0.field8337);
        if (var2 != null) {
            class514.method3080(arg0.field8404, 641545256, var2);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Les;II)V", line = 287)
    private final void method3770(class403 arg0, int arg1, int arg2) {
        field9215++;
        if (arg1 != 2) {
            this.field9204 = null;
        }
        if (arg2 == 1) {
            this.field9197 = class708.method4017('<', (byte) 32, arg0.method2384(arg1 ^ 0xFFFFE6DF));
        } else if (arg2 == 2) {
            int var4 = arg0.method2396((byte) -113);
            this.field9209 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field9209[var5] = arg0.method2390((byte) -120);
            }
            return;
        } else if (arg2 == 3) {
            int var6 = arg0.method2396((byte) -118);
            this.field9198 = new int[var6];
            this.field9205 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg0.method2390((byte) 112);
                class34 var9 = method3775(var8, true);
                if (var9 != null) {
                    this.field9198[var7] = var8;
                    this.field9205[var7] = new int[var9.field522];
                    for (int var10 = 0; var10 < var9.field522; var10++) {
                        this.field9205[var7][var10] = arg0.method2390((byte) -115);
                    }
                }
            }
            return;
        } else if (arg2 == 4) {
            this.field9211 = false;
            return;
        }
    }

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "(I)V", line = 363)
    public final void method3771(int arg0) {
        field9196++;
        if (arg0 == 0 && this.field9209 != null) {
            for (int var2 = 0; var2 < this.field9209.length; var2++) {
                this.field9209[var2] = class5.method105(this.field9209[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "([ILes;I)V", line = 385)
    public final void method3772(int[] arg0, class403 arg1, int arg2) {
        field9210++;
        if (this.field9198 == null) {
            return;
        }
        int var4 = 0;
        if (arg2 < 8) {
            this.method3773(-68, -122, 32);
        }
        while (this.field9198.length > var4) {
            if (arg0.length <= var4) {
                return;
            }
            int var5 = this.method3768(-21079, var4).field524;
            if (var5 > 0) {
                arg1.method2410(var5, (long) arg0[var4], 5994);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(III)I", line = 414)
    public final int method3773(int arg0, int arg1, int arg2) {
        field9201++;
        if (this.field9198 == null || arg0 < 0 || this.field9198.length < arg0) {
            return -1;
        } else if (this.field9205[arg0] == null || arg1 < 0 || this.field9205[arg0].length < arg1) {
            return -1;
        } else if (arg2 == 8217) {
            return this.field9205[arg0][arg1];
        } else {
            return -102;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[BIIZLjava/lang/String;)I", line = 435)
    public static final int method3774(int arg0, byte[] arg1, int arg2, int arg3, boolean arg4, String arg5) {
        field9200++;
        int var6 = arg2 - arg3;
        if (!arg4) {
            field9213 = 7;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg5.charAt(arg3 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg0 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg0 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg0 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg0 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg0 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg0 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg0 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg0 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg0 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg0 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg0 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg0 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg0 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg0 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg0 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg0 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg0 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg0 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg0 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg0 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg0 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg0 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg0 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg0 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg0 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg0 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg0 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg0 + var7] = -97;
            } else {
                arg1[arg0 + var7] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)Lbja;", line = 575)
    private static final class34 method3775(int arg0, boolean arg1) {
        field9207++;
        class34[] var2 = class666.method3743((byte) 124);
        int var3 = 0;
        if (!arg1) {
            return null;
        }
        while (var3 < var2.length) {
            if (var2[var3].field526 == arg0) {
                return var2[var3];
            }
            var3++;
        }
        return null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(BLes;)V", line = 611)
    public final void method3776(byte arg0, class403 arg1) {
        if (arg0 != 44) {
            this.field9205 = null;
        }
        field9203++;
        while (true) {
            int var3 = arg1.method2396((byte) -104);
            if (var3 == 0) {
                return;
            }
            this.method3770(arg1, 2, var3);
        }
    }
}
