import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class210 extends class237 {

    @OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
    public int field3373 = 0;

    @OriginalMember(owner = "client!lb", name = "t", descriptor = "I")
    public static int field3355 = 0;

    @OriginalMember(owner = "client!lb", name = "p", descriptor = "Ljava/lang/String;")
    public static String field3351 = "green:";

    @OriginalMember(owner = "client!lb", name = "M", descriptor = "I")
    public static int field3374 = 0;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!lb", name = "q", descriptor = "I")
    public int field3352;

    @OriginalMember(owner = "client!lb", name = "s", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!lb", name = "u", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!lb", name = "v", descriptor = "I")
    public int field3357;

    @OriginalMember(owner = "client!lb", name = "x", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!lb", name = "z", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
    public int field3362;

    @OriginalMember(owner = "client!lb", name = "B", descriptor = "I")
    public int field3363;

    @OriginalMember(owner = "client!lb", name = "C", descriptor = "I")
    public int field3364;

    @OriginalMember(owner = "client!lb", name = "D", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!lb", name = "E", descriptor = "I")
    public int field3366;

    @OriginalMember(owner = "client!lb", name = "F", descriptor = "I")
    public int field3367;

    @OriginalMember(owner = "client!lb", name = "H", descriptor = "I")
    public int field3369;

    @OriginalMember(owner = "client!lb", name = "J", descriptor = "I")
    public int field3371;

    @OriginalMember(owner = "client!lb", name = "O", descriptor = "I")
    public int field3376;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    public int field3379;

    @OriginalMember(owner = "client!lb", name = "N", descriptor = "Leh;")
    public static class137 field3375;

    @OriginalMember(owner = "client!lb", name = "r", descriptor = "Lod;")
    public class193 field3353;

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "Lod;")
    public class193 field3377;

    @OriginalMember(owner = "client!lb", name = "K", descriptor = "Llh;")
    public class200 field3372;

    @OriginalMember(owner = "client!lb", name = "G", descriptor = "Lv;")
    public class228 field3368;

    @OriginalMember(owner = "client!lb", name = "w", descriptor = "Lbl;")
    public class259 field3358;

    @OriginalMember(owner = "client!lb", name = "y", descriptor = "Z")
    public boolean field3360;

    @OriginalMember(owner = "client!lb", name = "I", descriptor = "[I")
    public int[] field3370;

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "[[[B")
    public static byte[][][] field3349;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(B)V")
    public static void method1474(byte arg0) {
        field3351 = null;
        field3375 = null;
        if (arg0 == -110) {
            field3349 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IBJZI)Ljava/lang/String;")
    public static final String method1475(int arg0, byte arg1, long arg2, boolean arg3, int arg4) {
        field3361++;
        char var6 = ',';
        char var7 = '.';
        boolean var8 = false;
        if (arg4 == 0) {
            var6 = '.';
            var7 = ',';
        }
        if (arg4 == 2) {
            var7 = ' ';
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg2 < 0L) {
            var8 = true;
            arg2 = -arg2;
        }
        if (arg0 > 0) {
            for (int var10 = 0; var10 < arg0; var10++) {
                int var11 = (int) arg2;
                arg2 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg2 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        if (arg1 != -96) {
            method1476((String) null, (byte) -75);
        }
        while (true) {
            int var13 = (int) arg2;
            arg2 /= 10L;
            var9.append((char) (var13 + 48 - ((int) arg2 * 10)));
            if (arg2 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg3) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Ljava/lang/String;B)[B")
    public static final byte[] method1476(String arg0, byte arg1) {
        field3365++;
        if (arg1 != 2) {
            method1476((String) null, (byte) -93);
        }
        int var2 = arg0.length();
        byte[] var3 = new byte[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            char var5 = arg0.charAt(var4);
            if (var5 > '\u0000' && var5 < '\u0080' || var5 >= ' ' && var5 <= 'ÿ') {
                var3[var4] = (byte) var5;
            } else if (var5 == '€') {
                var3[var4] = -128;
            } else if (var5 == '‚') {
                var3[var4] = -126;
            } else if (var5 == 'ƒ') {
                var3[var4] = -125;
            } else if (var5 == '„') {
                var3[var4] = -124;
            } else if (var5 == '…') {
                var3[var4] = -123;
            } else if (var5 == '†') {
                var3[var4] = -122;
            } else if (var5 == '‡') {
                var3[var4] = -121;
            } else if (var5 == 'ˆ') {
                var3[var4] = -120;
            } else if (var5 == '‰') {
                var3[var4] = -119;
            } else if (var5 == 'Š') {
                var3[var4] = -118;
            } else if (var5 == '‹') {
                var3[var4] = -117;
            } else if (var5 == 'Œ') {
                var3[var4] = -116;
            } else if (var5 == 'Ž') {
                var3[var4] = -114;
            } else if (var5 == '‘') {
                var3[var4] = -111;
            } else if (var5 == '’') {
                var3[var4] = -110;
            } else if (var5 == '“') {
                var3[var4] = -109;
            } else if (var5 == '”') {
                var3[var4] = -108;
            } else if (var5 == '•') {
                var3[var4] = -107;
            } else if (var5 == '–') {
                var3[var4] = -106;
            } else if (var5 == '—') {
                var3[var4] = -105;
            } else if (var5 == '˜') {
                var3[var4] = -104;
            } else if (var5 == '™') {
                var3[var4] = -103;
            } else if (var5 == 'š') {
                var3[var4] = -102;
            } else if (var5 == '›') {
                var3[var4] = -101;
            } else if (var5 == 'œ') {
                var3[var4] = -100;
            } else if (var5 == 'ž') {
                var3[var4] = -98;
            } else if (var5 == 'Ÿ') {
                var3[var4] = -97;
            } else {
                var3[var4] = 63;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)Z")
    public static final boolean method1477(byte arg0, int arg1) {
        field3359++;
        if (class181.field2888[arg1]) {
            return true;
        } else if (class18.field224.method955(0, arg1)) {
            int var2 = class18.field224.method926(26899, arg1);
            if (var2 == 0) {
                class181.field2888[arg1] = true;
                return true;
            }
            if (class75.field937[arg1] == null) {
                class75.field937[arg1] = new class123[var2];
            }
            int var3 = 0;
            if (arg0 <= 50) {
                return false;
            }
            while (var3 < var2) {
                if (class75.field937[arg1][var3] == null) {
                    byte[] var4 = class18.field224.method928(arg1, (byte) 124, var3);
                    if (var4 != null) {
                        class123 var5 = class75.field937[arg1][var3] = new class123();
                        var5.field1844 = (arg1 << 16) + var3;
                        if (var4[0] == -1) {
                            var5.method808(false, new class96(var4));
                        } else {
                            var5.method805(new class96(var4), (byte) 115);
                        }
                    }
                }
                var3++;
            }
            class181.field2888[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method1478(boolean arg0, String arg1, byte arg2) {
        field3350++;
        byte var3 = 4;
        int var4 = -73 / ((22 - arg2) / 61);
        int var5 = var3 + 6;
        int var6 = class166.field2664.method688(arg1, 250);
        int var7 = var3 + 6;
        int var8 = class166.field2664.method673(arg1, 250) * 13;
        class217.method1526(var7 - var3, -var3 + var5, var3 + var6 + var3, var3 + var3 + var8, 0);
        class217.method1528(var7 - var3, -var3 + var5, var6 + var3 + var3, var8 - -var3 + var3, 16777215);
        class166.field2664.method694(arg1, var7, var5, var6, var8, 16777215, -1, 1, 1, 0);
        class225.method1589(var5 - var3, var8 - (-var3 - var3), var7 - var3, 0, var6 - (-var3 - var3));
        if (!arg0) {
            class176.method1223(var8, var5, var7, var6, 26597);
            return;
        }
        try {
            Graphics var9 = class221.field3551.getGraphics();
            class52.field673.method49(0, var9, -129, 0);
        } catch (Exception var10) {
            class221.field3551.repaint();
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(JI)V")
    public static final void method1479(long arg0, int arg1) {
        field3356++;
        if (arg0 == 0L) {
            return;
        }
        int var3 = 0;
        int var4 = 72 % ((arg1 + 10) / 37);
        while (var3 < class198.field3141) {
            if (class53.field684[var3] == arg0) {
                class198.field3141--;
                for (int var5 = var3; var5 < class198.field3141; var5++) {
                    class53.field684[var5] = class53.field684[var5 + 1];
                    class40.field496[var5] = class40.field496[var5 + 1];
                    class71.field893[var5] = class71.field893[var5 + 1];
                }
                class273.field4354++;
                class68.field856 = class162.field2582;
                class4.field57.method1932(false, 68);
                class4.field57.method590(arg0, 1027669520);
                return;
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(B)V")
    public final void method1480(byte arg0) {
        if (arg0 >= -60) {
            return;
        }
        field3378++;
        int var2 = this.field3376;
        if (this.field3368 != null) {
            class228 var3 = this.field3368.method1629(-125);
            if (var3 == null) {
                this.field3352 = 0;
                this.field3367 = 0;
                this.field3376 = -1;
                this.field3363 = 0;
                this.field3370 = null;
                this.field3369 = 0;
            } else {
                this.field3376 = var3.field3707;
                this.field3369 = var3.field3672 * 128;
                this.field3352 = var3.field3664;
                this.field3367 = var3.field3709;
                this.field3363 = var3.field3702;
                this.field3370 = var3.field3657;
            }
        } else if (this.field3372 != null) {
            int var4 = class98.method608((byte) 62, this.field3372);
            if (var2 != var4) {
                this.field3376 = var4;
                class188 var5 = this.field3372.field3166;
                if (var5.field3004 != null) {
                    var5 = var5.method1314(-1);
                }
                if (var5 == null) {
                    this.field3352 = this.field3369 = 0;
                } else {
                    this.field3369 = var5.field3009 * 128;
                    this.field3352 = var5.field3036;
                }
            }
        } else if (this.field3358 != null) {
            this.field3376 = class30.method174(19058, this.field3358);
            this.field3369 = this.field3358.field4194 * 128;
            this.field3352 = this.field3358.field4192;
        }
        if (this.field3376 != var2 && this.field3353 != null) {
            class191.field3082.method1951(this.field3353);
            this.field3353 = null;
        }
    }
}
