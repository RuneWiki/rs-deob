import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class91 extends class29 {

    @OriginalMember(owner = "client!hp", name = "K", descriptor = "[I")
    private int[] field1127;

    @OriginalMember(owner = "client!hp", name = "P", descriptor = "[I")
    private int[] field1131;

    @OriginalMember(owner = "client!hp", name = "L", descriptor = "Lpo;")
    private class210 field1128;

    @OriginalMember(owner = "client!hp", name = "C", descriptor = "Lpo;")
    private class210 field1119;

    @OriginalMember(owner = "client!hp", name = "J", descriptor = "Lpo;")
    private class210 field1126;

    @OriginalMember(owner = "client!hp", name = "H", descriptor = "[Lpo;")
    private class210[] field1124;

    @OriginalMember(owner = "client!hp", name = "D", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!hp", name = "E", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!hp", name = "F", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!hp", name = "G", descriptor = "I")
    public static int field1123;

    @OriginalMember(owner = "client!hp", name = "I", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!hp", name = "N", descriptor = "I")
    public static int field1129;

    @OriginalMember(owner = "client!hp", name = "O", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!hp", name = "Q", descriptor = "I")
    public static int field1132;

    @OriginalMember(owner = "client!hp", name = "R", descriptor = "I")
    public static int field1133;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLnr;Lct;Lct;Lct;)Z")
    public static final boolean method614(byte arg0, class450 arg1, class104 arg2, class104 arg3, class104 arg4) {
        field1129++;
        class346.field5096 = arg4;
        class456.field6750 = arg1;
        class269.field3996 = arg2;
        class154.field2077 = arg3;
        int var5 = -32 % ((arg0 - 34) / 62);
        return true;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lic;Lct;I)Z")
    public final boolean method615(class235 arg0, class104 arg1, int arg2) {
        field1123++;
        if (class62.field822 >= arg2) {
            for (int var4 = 0; var4 < this.field1131.length; var4++) {
                if (!arg1.method716(arg2 ^ 0xFFFF82A0, this.field1131[var4], class62.field822)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field1131.length; var5++) {
                if (!arg1.method708(this.field1131[var5], (byte) -125)) {
                    return false;
                }
            }
        }
        for (int var6 = 0; var6 < this.field1127.length; var6++) {
            if (!arg0.method463(this.field1127[var6], -26564)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "(B)V")
    public static final void method616(byte arg0) {
        field1132++;
        class443.field6436.method2313(93);
        if (arg0 != -71) {
            method614((byte) -115, (class450) null, (class104) null, (class104) null, (class104) null);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLat;)Lpo;")
    private static final class210 method617(byte arg0, class256 arg1) {
        arg1.method1738((byte) -99);
        field1120++;
        int var2 = arg1.method1738((byte) 115);
        class210 var3 = class228.method1560(2, var2);
        var3.field2962 = arg1.method1738((byte) -118);
        int var4 = arg1.method1738((byte) 75);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg1.method1738((byte) 120);
            var3.method56(var6, -11941, arg1);
        }
        if (arg0 > -27) {
            return null;
        } else {
            var3.method363(0);
            return var3;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(BLbf;I)Lrr;")
    public static final class206 method618(byte arg0, class336 arg1, int arg2) {
        field1133++;
        class206 var3;
        if (class230.field3450 == null) {
            var3 = new class206();
        } else {
            var3 = class230.field3450;
            class230.field3450 = class230.field3450.field2882;
            var3.field2882 = null;
            class37.field525--;
        }
        if (arg0 < 113) {
            method619(63, (String) null);
        }
        var3.field2890 = arg2;
        var3.field2880 = arg1;
        return var3;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILjava/lang/String;)J")
    public static final long method619(int arg0, String arg1) {
        field1121++;
        long var2 = 0L;
        int var4 = 73 % ((arg0 - 55) / 37);
        int var5 = arg1.length();
        for (int var6 = 0; var6 < var5; var6++) {
            var2 *= 37L;
            char var7 = arg1.charAt(var6);
            if (var7 >= 'A' && var7 <= 'Z') {
                var2 += (long) (var7 + 1 - 65);
            } else if (var7 >= 'a' && var7 <= 'z') {
                var2 += (long) (var7 + 1 - 97);
            } else if (var7 >= '0' && var7 <= '9') {
                var2 += (long) (var7 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Lic;ILct;ZIDI)[I")
    public final int[] method620(class235 arg0, int arg1, class104 arg2, boolean arg3, int arg4, double arg5, int arg6) {
        class133.field1825 = arg0;
        class154.field2076 = arg2;
        field1125++;
        for (int var9 = 0; var9 < this.field1124.length; var9++) {
            this.field1124[var9].method230(arg1, arg4, 255);
        }
        class318.method2097(arg5, (byte) -3);
        class131.method879(false, arg4, arg1);
        int[] var10 = new int[arg4 * 4 * arg1];
        int var11 = arg6;
        for (int var12 = 0; var12 < arg4; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field1119.field2956) {
                int[] var14 = this.field1119.method361(var12, (byte) -38);
                var15 = var14;
                var16 = var14;
                var17 = var14;
            } else {
                int[][] var18 = this.field1119.method58(var12, arg6 + 99);
                var16 = var18[0];
                var17 = var18[2];
                var15 = var18[1];
            }
            if (arg3) {
                var11 = var12;
            }
            int[] var19;
            if (this.field1126.field2956) {
                var19 = this.field1126.method361(var12, (byte) -38);
            } else {
                var19 = this.field1126.method58(var12, arg6 ^ 0x62)[0];
            }
            for (int var20 = arg1 - 1; var20 >= 0; var20--) {
                int var21 = var16[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var15[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var17[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class90.field1112[var22];
                int var25 = class90.field1112[var21];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var26 = class90.field1112[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                if (arg3) {
                    var11 += arg1 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field1124.length; var13++) {
            this.field1124[var13].method226(true);
        }
        return var10;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(ZIIDLct;ZBLic;)[I")
    public final int[] method621(boolean arg0, int arg1, int arg2, double arg3, class104 arg4, boolean arg5, byte arg6, class235 arg7) {
        class133.field1825 = arg7;
        field1130++;
        class154.field2076 = arg4;
        for (int var10 = 0; var10 < this.field1124.length; var10++) {
            this.field1124[var10].method230(arg2, arg1, 255);
        }
        class318.method2097(arg3, (byte) -3);
        class131.method879(false, arg1, arg2);
        int[] var11 = new int[arg1 * arg2];
        if (arg6 <= 7) {
            return null;
        }
        byte var12;
        int var13;
        int var14;
        if (arg5) {
            var12 = -1;
            var13 = arg2 - 1;
            var14 = -1;
        } else {
            var14 = arg2;
            var13 = 0;
            var12 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg0) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field1119.field2956) {
                int[] var18 = this.field1119.method361(var16, (byte) -38);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field1119.method58(var16, 103);
                var19 = var22[1];
                var21 = var22[0];
                var20 = var22[2];
            }
            for (int var23 = var13; var23 != var14; var23 += var12) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var19[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var20[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class90.field1112[var25];
                int var28 = class90.field1112[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class90.field1112[var26];
                int var30 = (var27 << 8) + (var28 << 16) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg0) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field1124.length; var17++) {
            this.field1124[var17].method226(true);
        }
        return var11;
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "()V")
    public class91() {
        this.field1127 = new int[0];
        this.field1131 = new int[0];
        this.field1128 = new class249(0);
        this.field1128.field2962 = 1;
        this.field1119 = new class249();
        this.field1119.field2962 = 1;
        this.field1126 = new class249();
        this.field1126.field2962 = 1;
        this.field1124 = new class210[] { this.field1119, this.field1126, this.field1128 };
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Lat;)V")
    public class91(class256 arg0) {
        int var2 = arg0.method1738((byte) -19);
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        this.field1124 = new class210[var2];
        for (int var6 = 0; var6 < var2; var6++) {
            class210 var16 = method617((byte) -79, arg0);
            if (var16.method1442(8216) >= 0) {
                var3++;
            }
            if (var16.method227((byte) 105) >= 0) {
                var4++;
            }
            int var17 = var16.field2963.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1738((byte) -19);
            }
            this.field1124[var6] = var16;
        }
        this.field1131 = new int[var3];
        int var7 = 0;
        this.field1127 = new int[var4];
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class210 var11 = this.field1124[var9];
            int var12 = var11.field2963.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2963[var13] = this.field1124[var5[var9][var13]];
            }
            int var14 = var11.method1442(8216);
            int var15 = var11.method227((byte) 55);
            if (var14 > 0) {
                this.field1131[var7++] = var14;
            }
            if (var15 > 0) {
                this.field1127[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field1119 = this.field1124[arg0.method1738((byte) -50)];
        this.field1126 = this.field1124[arg0.method1738((byte) -95)];
        this.field1128 = this.field1124[arg0.method1738((byte) 53)];
        Object var10 = null;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZILct;Lic;B)[F")
    public final float[] method622(int arg0, boolean arg1, int arg2, class104 arg3, class235 arg4, byte arg5) {
        field1122++;
        class133.field1825 = arg4;
        class154.field2076 = arg3;
        for (int var7 = 0; var7 < this.field1124.length; var7++) {
            this.field1124[var7].method230(arg0, arg2, 255);
        }
        class131.method879(false, arg2, arg0);
        float[] var8 = new float[arg2 * 4 * arg0];
        if (arg5 != -55) {
            method617((byte) 38, (class256) null);
        }
        int var9 = 0;
        for (int var10 = 0; var10 < arg2; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field1119.field2956) {
                int[] var12 = this.field1119.method361(var10, (byte) -38);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field1119.method58(var10, 116);
                var15 = var16[1];
                var13 = var16[0];
                var14 = var16[2];
            }
            int[] var17;
            if (this.field1126.field2956) {
                var17 = this.field1126.method361(var10, (byte) -38);
            } else {
                var17 = this.field1126.method58(var10, 127)[0];
            }
            int[] var18;
            if (this.field1128.field2956) {
                var18 = this.field1128.method361(var10, (byte) -38);
            } else {
                var18 = this.field1128.method58(var10, 96)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            for (int var19 = arg0 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if ((var20 < 0.0F)) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg0 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field1124.length; var11++) {
            this.field1124[var11].method226(true);
        }
        return var8;
    }

    static {
        new class409("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        new class409("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
