import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class143 {

    @OriginalMember(owner = "client!qm", name = "h", descriptor = "[B")
    private byte[] field2040;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!qm", name = "p", descriptor = "[[B")
    private byte[][] field2048;

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public int field2039;

    @OriginalMember(owner = "client!qm", name = "o", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!qm", name = "r", descriptor = "I")
    public static int field2050 = 0;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field2034;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!qm", name = "i", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!qm", name = "j", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!qm", name = "k", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!qm", name = "l", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!qm", name = "m", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!qm", name = "n", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!qm", name = "q", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "([Loia;ILjava/lang/String;)I")
    public final int method991(class88[] arg0, int arg1, String arg2) {
        field2038++;
        if (arg2 == null) {
            return 0;
        }
        int var4 = -1;
        int var5 = -1;
        int var6 = 0;
        int var7 = arg2.length();
        if (arg1 < 7) {
            this.method996(-3, null, 90, -27, null);
        }
        for (int var8 = 0; var8 < var7; var8++) {
            char var9 = arg2.charAt(var8);
            if (var9 == '<') {
                var4 = var8;
            } else {
                if (var9 == '>' && var4 != -1) {
                    String var10 = arg2.substring(var4 + 1, var8);
                    var4 = -1;
                    if (var10.equals("lt")) {
                        var9 = '<';
                    } else if (var10.equals("gt")) {
                        var9 = '>';
                    } else if (var10.equals("nbsp")) {
                        var9 = ' ';
                    } else if (var10.equals("shy")) {
                        var9 = '\u00AD';
                    } else if (var10.equals("times")) {
                        var9 = '×';
                    } else if (var10.equals("euro")) {
                        var9 = '€';
                    } else if (var10.equals("copy")) {
                        var9 = '©';
                    } else {
                        if (!var10.equals("reg")) {
                            if (var10.startsWith("img=") && arg0 != null) {
                                try {
                                    int var11 = class325.method2121(var10.substring(4), -23213);
                                    var5 = -1;
                                    var6 += arg0[var11].method656();
                                } catch (Exception var12) {
                                }
                            }
                            continue;
                        }
                        var9 = '®';
                    }
                }
                if (var4 == -1) {
                    var6 += this.field2040[class272.method1774(var9, -8910) & 0xFF] & 0xFF;
                    if (this.field2048 != null && var5 != -1) {
                        var6 += this.field2048[var5][var9];
                    }
                    var5 = var9;
                }
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public final int method992(String arg0, byte arg1) {
        field2042++;
        if (arg1 >= -1) {
            this.field2035 = 0;
        }
        return this.method991(null, 106, arg0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/lang/String;[Ljava/lang/String;[II[Loia;)I")
    public final int method993(String arg0, String[] arg1, int[] arg2, int arg3, class88[] arg4) {
        field2033++;
        if (arg3 != 60) {
            return 101;
        } else if (arg0 == null) {
            return 0;
        } else {
            int var6 = 0;
            int var7 = 0;
            int var8 = -1;
            int var9 = 0;
            byte var10 = 0;
            int var11 = -1;
            int var12 = -1;
            int var13 = 0;
            int var14 = arg0.length();
            for (int var15 = 0; var15 < var14; var15++) {
                int var16 = class272.method1774(arg0.charAt(var15), -8910) & 0xFF;
                int var17 = 0;
                if (var16 == 60) {
                    var11 = var15;
                } else {
                    int var18;
                    if (var11 == -1) {
                        var18 = var15;
                        var17 += this.method997(var16, arg3 ^ 0x1BE9);
                        if (this.field2048 != null && var12 != -1) {
                            var17 += this.field2048[var12][var16];
                        }
                        var12 = var16;
                    } else {
                        if (var16 != 62) {
                            continue;
                        }
                        var18 = var11;
                        String var19 = arg0.substring(var11 + 1, var15);
                        var11 = -1;
                        if (var19.equals("br")) {
                            arg1[var13] = arg0.substring(var7, var15 + 1);
                            var13++;
                            if (var13 >= arg1.length) {
                                return 0;
                            }
                            var8 = -1;
                            var6 = 0;
                            var7 = var15 + 1;
                            var12 = -1;
                            continue;
                        }
                        if (var19.equals("lt")) {
                            var17 += this.method997(60, 7125);
                            if (this.field2048 != null && var12 != -1) {
                                var17 += this.field2048[var12][60];
                            }
                            var12 = 60;
                        } else if (var19.equals("gt")) {
                            var17 += this.method997(62, 7125);
                            if (this.field2048 != null && var12 != -1) {
                                var17 += this.field2048[var12][62];
                            }
                            var12 = 62;
                        } else if (var19.equals("nbsp")) {
                            var17 += this.method997(160, 7125);
                            if (this.field2048 != null && var12 != -1) {
                                var17 += this.field2048[var12][160];
                            }
                            var12 = 160;
                        } else if (var19.equals("shy")) {
                            var17 += this.method997(173, 7125);
                            if (this.field2048 != null && var12 != -1) {
                                var17 += this.field2048[var12][173];
                            }
                            var12 = 173;
                        } else if (var19.equals("times")) {
                            var17 += this.method997(215, 7125);
                            if (this.field2048 != null && var12 != -1) {
                                var17 += this.field2048[var12][215];
                            }
                            var12 = 215;
                        } else if (var19.equals("euro")) {
                            var17 += this.method997(8364, 7125);
                            if (this.field2048 != null && var12 != -1) {
                                var17 += this.field2048[var12][8364];
                            }
                            var12 = 8364;
                        } else if (var19.equals("copy")) {
                            var17 += this.method997(169, 7125);
                            if (this.field2048 != null && var12 != -1) {
                                var17 += this.field2048[var12][169];
                            }
                            var12 = 169;
                        } else if (var19.equals("reg")) {
                            var17 += this.method997(174, 7125);
                            if (this.field2048 != null && var12 != -1) {
                                var17 += this.field2048[var12][174];
                            }
                            var12 = 174;
                        } else if (var19.startsWith("img=") && arg4 != null) {
                            try {
                                int var20 = class325.method2121(var19.substring(4), arg3 ^ 0xFFFFA56F);
                                var17 += arg4[var20].method656();
                                var12 = -1;
                            } catch (Exception var21) {
                            }
                        }
                        var16 = -1;
                    }
                    if (var17 > 0) {
                        var6 += var17;
                        if (arg2 != null) {
                            if (var16 == 32) {
                                var10 = 1;
                                var9 = var6;
                                var8 = var15;
                            }
                            if (var6 > arg2[var13 < arg2.length ? var13 : arg2.length - 1]) {
                                if (var8 >= 0) {
                                    arg1[var13] = arg0.substring(var7, var8 + 1 - var10);
                                    var13++;
                                    if (var13 >= arg1.length) {
                                        return 0;
                                    }
                                    var7 = var8 + 1;
                                    var12 = -1;
                                    var6 -= var9;
                                    var8 = -1;
                                } else {
                                    arg1[var13] = arg0.substring(var7, var18);
                                    var13++;
                                    if (arg1.length <= var13) {
                                        return 0;
                                    }
                                    var8 = -1;
                                    var6 = var17;
                                    var12 = -1;
                                    var7 = var18;
                                }
                            }
                            if (var16 == 45) {
                                var9 = var6;
                                var10 = 0;
                                var8 = var15;
                            }
                        }
                    }
                }
            }
            if (arg0.length() > var7) {
                arg1[var13] = arg0.substring(var7, arg0.length());
                var13++;
            }
            return var13;
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(Ljava/awt/Component;I)Ltea;")
    public static final class237 method994(Component arg0, int arg1) {
        field2046++;
        if (arg1 != 13764) {
            field2050 = -80;
        }
        return new class741(arg0);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZC)I")
    public final int method995(int arg0, boolean arg1, char arg2) {
        field2049++;
        if (arg1) {
            return 20;
        } else if (this.field2048 == null) {
            return 0;
        } else {
            return this.field2048[arg0][arg2];
        }
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILjava/lang/String;II[Loia;)I")
    public final int method996(int arg0, String arg1, int arg2, int arg3, class88[] arg4) {
        field2034++;
        if (arg0 == arg3) {
            arg3 = this.field2035;
        }
        int var6 = this.method993(arg1, class357.field5088, new int[] { arg2 }, 60, arg4);
        int var7 = (var6 - 1) * arg3;
        return this.field2047 + this.field2039 + var7;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(II)I")
    public final int method997(int arg0, int arg1) {
        field2037++;
        return arg1 == 7125 ? this.field2040[arg0] & 0xFF : 94;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IILjava/lang/String;[Loia;)I")
    public final int method998(int arg0, int arg1, String arg2, class88[] arg3) {
        field2036++;
        if (arg0 != 174) {
            this.method993(null, null, null, -120, null);
        }
        int var5 = this.method993(arg2, class357.field5088, new int[] { arg1 }, 60, arg3);
        int var6 = 0;
        for (int var7 = 0; var7 < var5; var7++) {
            int var8 = this.method991(arg3, 84, class357.field5088[var7]);
            if (var8 > var6) {
                var6 = var8;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILjava/lang/String;I[Loia;)Ljava/lang/String;")
    public final String method999(int arg0, String arg1, int arg2, class88[] arg3) {
        field2045++;
        if (this.method991(arg3, 37, arg1) <= arg2) {
            return arg1;
        }
        int var5 = arg2 - this.method991(null, 105, "...");
        int var6 = -1;
        int var7 = -1;
        int var8 = 0;
        int var9 = -29 / ((-arg0 - 65) / 33);
        int var10 = arg1.length();
        String var11 = "";
        for (int var12 = 0; var12 < var10; var12++) {
            char var13 = arg1.charAt(var12);
            if (var13 == '<') {
                var6 = var12;
            } else {
                if (var13 == '>' && var6 != -1) {
                    String var14 = arg1.substring(var6 + 1, var12);
                    var6 = -1;
                    if (var14.equals("lt")) {
                        var13 = '<';
                    } else if (var14.equals("gt")) {
                        var13 = '>';
                    } else if (var14.equals("nbsp")) {
                        var13 = ' ';
                    } else if (var14.equals("shy")) {
                        var13 = '\u00AD';
                    } else if (var14.equals("times")) {
                        var13 = '×';
                    } else if (var14.equals("euro")) {
                        var13 = '€';
                    } else if (var14.equals("copy")) {
                        var13 = '©';
                    } else {
                        if (!var14.equals("reg")) {
                            if (var14.startsWith("img=") && arg3 != null) {
                                try {
                                    int var15 = class325.method2121(var14.substring(4), -23213);
                                    var7 = -1;
                                    var8 += arg3[var15].method656();
                                    if (var8 > var5) {
                                        return var11 + "...";
                                    }
                                    var11 = arg1.substring(0, var12 + 1);
                                } catch (Exception var17) {
                                }
                            }
                            continue;
                        }
                        var13 = '®';
                    }
                }
                if (var6 == -1) {
                    var8 += this.field2040[class272.method1774(var13, -8910) & 0xFF] & 0xFF;
                    if (this.field2048 != null && var7 != -1) {
                        var8 += this.field2048[var7][var13];
                    }
                    var7 = var13;
                    int var16 = var8;
                    if (this.field2048 != null) {
                        var16 = this.field2048[var13][46] + var8;
                    }
                    if (var5 < var16) {
                        return var11 + "...";
                    }
                    var11 = arg1.substring(0, var12 + 1);
                }
            }
        }
        return arg1;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "([B)V")
    public class143(byte[] arg0) {
        class675 var2 = new class675(arg0);
        int var3 = var2.method3750((byte) 35);
        if (var3 != 0) {
            throw new RuntimeException("");
        }
        boolean var4 = var2.method3750((byte) 35) == 1;
        this.field2040 = new byte[256];
        var2.method3723(this.field2040, 4, 256, 0);
        if (var4) {
            int[] var5 = new int[256];
            int[] var6 = new int[256];
            for (int var7 = 0; var7 < 256; var7++) {
                var5[var7] = var2.method3750((byte) 35);
            }
            for (int var8 = 0; var8 < 256; var8++) {
                var6[var8] = var2.method3750((byte) 35);
            }
            byte[][] var9 = new byte[256][];
            for (int var10 = 0; var10 < 256; var10++) {
                var9[var10] = new byte[var5[var10]];
                byte var17 = 0;
                for (int var18 = 0; var18 < var9[var10].length; var18++) {
                    var17 += var2.method3719(1854307120);
                    var9[var10][var18] = var17;
                }
            }
            byte[][] var11 = new byte[256][];
            for (int var12 = 0; var12 < 256; var12++) {
                var11[var12] = new byte[var5[var12]];
                byte var15 = 0;
                for (int var16 = 0; var16 < var11[var12].length; var16++) {
                    var15 += var2.method3719(1854307120);
                    var11[var12][var16] = var15;
                }
            }
            this.field2048 = new byte[256][256];
            for (int var13 = 0; var13 < 256; var13++) {
                if (var13 != 32 && var13 != 160) {
                    for (int var14 = 0; var14 < 256; var14++) {
                        if (var14 != 32 && var14 != 160) {
                            this.field2048[var13][var14] = (byte) class358.method2300(var9, this.field2040, var6, 255, var13, var11, var14, var5);
                        }
                    }
                }
            }
            this.field2035 = var5[32] + var6[32];
        } else {
            this.field2035 = var2.method3750((byte) 35);
        }
        var2.method3750((byte) 35);
        var2.method3750((byte) 35);
        this.field2039 = var2.method3750((byte) 35);
        this.field2047 = var2.method3750((byte) 35);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(BLjava/lang/String;[Loia;I)I")
    public final int method1000(byte arg0, String arg1, class88[] arg2, int arg3) {
        int var5 = 113 % ((8 - arg0) / 50);
        field2044++;
        return this.method993(arg1, class357.field5088, new int[] { arg3 }, 60, arg2);
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ILhha;)[I")
    public static final int[] method1001(int arg0, class519 arg1) {
        field2041++;
        class675 var2 = new class675(518);
        int[] var3 = new int[4];
        for (int var4 = 0; var4 < 4; var4++) {
            var3[var4] = (int) (Math.random() * 9.9999999E7D);
        }
        var2.method3694(10, arg0 - 1528080564);
        var2.method3733(-49, var3[0]);
        var2.method3733(-49, var3[1]);
        var2.method3733(-49, var3[2]);
        var2.method3733(-49, var3[3]);
        if (arg0 != 9108) {
            method994(null, 107);
        }
        for (int var5 = 0; var5 < 10; var5++) {
            var2.method3733(-49, (int) (Math.random() * 9.9999999E7D));
        }
        var2.method3745(-120, (int) (Math.random() * 9.9999999E7D));
        var2.method3705(class614.field8591, 22832, class465.field6586);
        arg1.field7384.method3748(true, var2.field9154, var2.field9146, 0);
        return var3;
    }
}
