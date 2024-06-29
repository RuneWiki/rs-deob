import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class18 {

    @OriginalMember(owner = "client!rn", name = "B", descriptor = "Lfd;")
    private class319 field289 = null;

    @OriginalMember(owner = "client!rn", name = "F", descriptor = "Z")
    private boolean field293;

    @OriginalMember(owner = "client!rn", name = "D", descriptor = "Lac;")
    private class115 field291;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "Z")
    private boolean field270;

    @OriginalMember(owner = "client!rn", name = "L", descriptor = "I")
    public static int field299 = -1;

    @OriginalMember(owner = "client!rn", name = "E", descriptor = "I")
    public static int field292 = -1;

    @OriginalMember(owner = "client!rn", name = "C", descriptor = "Z")
    public static boolean field290 = false;

    @OriginalMember(owner = "client!rn", name = "R", descriptor = "[Ljava/lang/String;")
    public static String[] field305 = new String[100];

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!rn", name = "s", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!rn", name = "t", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!rn", name = "u", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!rn", name = "v", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!rn", name = "w", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!rn", name = "x", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!rn", name = "y", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!rn", name = "z", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!rn", name = "A", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!rn", name = "G", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!rn", name = "I", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!rn", name = "K", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!rn", name = "M", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!rn", name = "N", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!rn", name = "O", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!rn", name = "P", descriptor = "I")
    public static int field303;

    @OriginalMember(owner = "client!rn", name = "Q", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!rn", name = "S", descriptor = "I")
    public static int field306;

    @OriginalMember(owner = "client!rn", name = "T", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!rn", name = "U", descriptor = "I")
    public static int field308;

    @OriginalMember(owner = "client!rn", name = "V", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!rn", name = "W", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!rn", name = "H", descriptor = "Lho;")
    public static class215 field295;

    @OriginalMember(owner = "client!rn", name = "J", descriptor = "[Ljava/lang/Object;")
    private Object[] field297;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field279;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZI)[I", line = 4)
    public final int[] method183(boolean arg0, int arg1) {
        field309++;
        if (arg0) {
            field299 = -83;
        }
        if (!this.method198((byte) 68, arg1)) {
            return null;
        }
        int[] var3 = this.field289.field4920[arg1];
        if (var3 == null) {
            var3 = new int[this.field289.field4919[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)V", line = 37)
    private final void method184(int arg0, byte arg1) {
        if (this.field270) {
            this.field297[arg0] = this.field291.method992(arg0, 30286);
        } else {
            this.field297[arg0] = class263.method1929(class226.method1691(arg1, -62), this.field291.method992(arg0, 30286), false);
        }
        if (arg1 == 61) {
            field283++;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)I", line = 52)
    public final int method185(boolean arg0) {
        field274++;
        if (arg0) {
            field292 = -28;
        }
        return this.method189(1623) ? this.field289.field4921.length : -1;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZLjava/lang/String;)I", line = 74)
    public final int method186(boolean arg0, String arg1) {
        field264++;
        if (!this.method189(1623)) {
            return -1;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field289.field4913.method1255(-20168, class296.method2135(var3, 560166149));
        if (this.method198((byte) 72, var4)) {
            if (arg0) {
                this.method216(-92, true);
            }
            return var4;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III)[B", line = 97)
    public final byte[] method187(int arg0, int arg1, int arg2) {
        field285++;
        return arg2 == -1 ? this.method192(arg1, 1, arg0, (int[]) null) : (byte[]) null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)I", line = 109)
    public final int method188(byte arg0, int arg1) {
        field269++;
        if (!this.method189(1623)) {
            return -1;
        }
        int var3 = this.field289.field4913.method1255(-20168, arg1);
        if (this.method198((byte) 118, var3)) {
            if (arg0 != -72) {
                this.field289 = (class319) null;
            }
            return var3;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)Z", line = 130)
    private final boolean method189(int arg0) {
        if (arg0 != 1623) {
            field295 = (class215) null;
        }
        field287++;
        if (this.field289 == null) {
            this.field289 = this.field291.method993(-119);
            if (this.field289 == null) {
                return false;
            }
            this.field279 = new Object[this.field289.field4925][];
            this.field297 = new Object[this.field289.field4925];
        }
        return true;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)I", line = 155)
    public final int method190(byte arg0) {
        field308++;
        if (!this.method189(1623)) {
            return 0;
        }
        int var2 = 0;
        if (arg0 != -106) {
            field275 = -82;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < this.field297.length; var4++) {
            if (this.field289.field4919[var4] > 0) {
                var2 += 100;
                var3 += this.method196(var4, 0);
            }
        }
        if (var2 == 0) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II[I)Z", line = 197)
    private final boolean method191(int arg0, int arg1, int[] arg2) {
        field265++;
        if (!this.method198((byte) 122, arg1)) {
            return false;
        } else if (this.field297[arg1] == null) {
            return false;
        } else {
            int var4 = this.field289.field4919[arg1];
            int[] var5 = this.field289.field4920[arg1];
            if (this.field279[arg1] == null) {
                this.field279[arg1] = new Object[this.field289.field4921[arg1]];
            }
            boolean var6 = true;
            Object[] var7 = this.field279[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
                var10 = class334.method2354((byte) 112, false, this.field297[arg1]);
            } else {
                var10 = class334.method2354((byte) 120, true, this.field297[arg1]);
                class25 var11 = new class25(var10);
                var11.method267(var11.field448.length, arg2, 5, (byte) -85);
            }
            if (arg0 != 2) {
                this.method193((String) null, (byte) 70);
            }
            byte[] var12;
            try {
                var12 = class143.method1187(9, var10);
            } catch (RuntimeException var31) {
                throw class244.method1842(var31, "T3 - " + (arg2 != null) + "," + arg1 + "," + var10.length + "," + class34.method355(var10, var10.length, 0) + "," + class34.method355(var10, var10.length - 2, 0) + "," + this.field289.field4915[arg1] + "," + this.field289.field4914);
            }
            if (this.field270) {
                this.field297[arg1] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var15 * 4 * var4;
                class25 var17 = new class25(var12);
                var17.field397 = var16;
                int[] var18 = new int[var4];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        if (var5 == null) {
                        }
                        var20 += var17.method262((byte) 76);
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                var17.field397 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var17.method262((byte) 37);
                        class65.method642(var12, var24, var22[var27], var18[var27], var26);
                        var18[var27] += var26;
                        var24 += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field293) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class263.method1929(-1, var22[var28], false);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field293) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class263.method1929(arg0 - 3, var12, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(III[I)[B", line = 395)
    public final byte[] method192(int arg0, int arg1, int arg2, int[] arg3) {
        field300++;
        if (!this.method218(arg1, arg0, arg2)) {
            return null;
        }
        if (this.field279[arg2] == null || this.field279[arg2][arg0] == null) {
            boolean var5 = this.method191(2, arg2, arg3);
            if (!var5) {
                this.method184(arg2, (byte) 61);
                boolean var6 = this.method191(2, arg2, arg3);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class334.method2354((byte) 102, false, this.field279[arg2][arg0]);
        if (this.field293) {
            this.field279[arg2][arg0] = null;
            if (this.field289.field4921[arg2] == 1) {
                this.field279[arg2] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 436)
    public final boolean method193(String arg0, byte arg1) {
        field268++;
        if (!this.method189(1623)) {
            return false;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 != 99) {
            field295 = (class215) null;
        }
        int var4 = this.field289.field4913.method1255(arg1 ^ 0xFFFFB15B, class296.method2135(var3, 560166149));
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V", line = 457)
    public static void method194(int arg0) {
        field305 = null;
        if (arg0 > 109) {
            field295 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Ljava/lang/String;", line = 470)
    public static final String method195(int arg0, int arg1) {
        if (arg1 != -1) {
            method207(112, -76, true);
        }
        field302++;
        String var2 = Integer.toString(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (var2.length() > 9) {
            return " <col=00ff80>" + var2.substring(0, var2.length() - 8) + class310.field4798 + " (" + var2 + ")</col>";
        } else if (var2.length() <= 6) {
            return " <col=ffff00>" + var2 + "</col>";
        } else {
            return " <col=ffffff>" + var2.substring(0, var2.length() - 4) + class287.field4457 + " (" + var2 + ")</col>";
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(II)I", line = 500)
    private final int method196(int arg0, int arg1) {
        field301++;
        if (arg1 != 0) {
            method208(-52, (byte[]) null, 10, -66);
        }
        if (this.method198((byte) 113, arg0)) {
            return this.field297[arg0] == null ? this.field291.method990(-13609, arg0) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(BI)I", line = 519)
    public final int method197(byte arg0, int arg1) {
        int var3 = 108 / ((arg0 - 72) / 51);
        field304++;
        return this.method198((byte) 62, arg1) ? this.field289.field4921[arg1] : 0;
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(BI)Z", line = 534)
    private final boolean method198(byte arg0, int arg1) {
        if (arg0 <= 57) {
            method201((char) 65482, (byte) -45);
        }
        field278++;
        if (!this.method189(1623)) {
            return false;
        } else if (arg1 >= 0 && this.field289.field4921.length > arg1 && this.field289.field4921[arg1] != 0) {
            return true;
        } else if (class123.field1972) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(II)Z", line = 557)
    public final boolean method199(int arg0, int arg1) {
        field298++;
        if (!this.method189(1623)) {
            return false;
        } else if (this.field289.field4921.length == 1) {
            return this.method210(arg1, true, 0);
        } else if (!this.method198((byte) 121, arg1)) {
            return false;
        } else if (this.field289.field4921[arg1] == 1) {
            return this.method210(0, true, arg1);
        } else {
            if (arg0 != 2209) {
                this.method200((byte) 116);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(B)Z", line = 583)
    public final boolean method200(byte arg0) {
        field262++;
        if (!this.method189(1623)) {
            return false;
        }
        boolean var2 = true;
        if (arg0 >= -115) {
            this.field291 = (class115) null;
        }
        for (int var3 = 0; var3 < this.field289.field4912.length; var3++) {
            int var4 = this.field289.field4912[var3];
            if (this.field297[var4] == null) {
                this.method184(var4, (byte) 61);
                if (this.field297[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(CB)Z", line = 622)
    public static final boolean method201(char arg0, byte arg1) {
        field284++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class194.method1480((byte) 5, arg0)) {
            return true;
        } else {
            char[] var2 = class164.field2602;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var4 = var2[var3];
                if (arg0 == var4) {
                    return true;
                }
            }
            if (arg1 != 33) {
                field290 = false;
            }
            char[] var5 = class277.field4279;
            for (int var6 = 0; var6 < var5.length; var6++) {
                char var7 = var5[var6];
                if (arg0 == var7) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 669)
    public final void method202(String arg0, int arg1) {
        field272++;
        if (!this.method189(1623)) {
            return;
        }
        String var3 = arg0.toLowerCase();
        int var4 = this.field289.field4913.method1255(-20168, class296.method2135(var3, 560166149));
        if (arg1 == -1) {
            this.method213(var4, 4);
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(IB)[B", line = 686)
    public final byte[] method203(int arg0, byte arg1) {
        field288++;
        if (arg1 != 47) {
            field275 = -102;
        }
        if (!this.method189(1623)) {
            return null;
        } else if (this.field289.field4921.length == 1) {
            return this.method187(0, arg0, -1);
        } else if (!this.method198((byte) 87, arg0)) {
            return null;
        } else if (this.field289.field4921[arg0] == 1) {
            return this.method187(arg0, 0, -1);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IBI)[B", line = 720)
    public final byte[] method204(int arg0, byte arg1, int arg2) {
        int var4 = 32 / ((arg1 - 77) / 43);
        field266++;
        if (!this.method218(1, arg2, arg0)) {
            return null;
        }
        if (this.field279[arg0] == null || this.field279[arg0][arg2] == null) {
            boolean var5 = this.method191(2, arg0, (int[]) null);
            if (!var5) {
                this.method184(arg0, (byte) 61);
                boolean var6 = this.method191(2, arg0, (int[]) null);
                if (!var6) {
                    return null;
                }
            }
        }
        return class334.method2354((byte) 110, false, this.field279[arg0][arg2]);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Z)I", line = 753)
    public final int method205(boolean arg0) {
        field282++;
        if (!arg0) {
            field295 = (class215) null;
        }
        if (!this.method189(1623)) {
            throw new IllegalStateException("");
        }
        return this.field289.field4914;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 773)
    public final boolean method206(String arg0, int arg1, String arg2) {
        field271++;
        if (!this.method189(1623)) {
            return false;
        }
        String var4 = arg2.toLowerCase();
        if (arg1 != 16721) {
            return true;
        }
        String var5 = arg0.toLowerCase();
        int var6 = this.field289.field4913.method1255(-20168, class296.method2135(var4, 560166149));
        if (this.method198((byte) 61, var6)) {
            int var7 = this.field289.field4918[var6].method1255(arg1 - 36889, class296.method2135(var5, 560166149));
            return this.method210(var7, true, var6);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIZ)V", line = 798)
    public static final void method207(int arg0, int arg1, boolean arg2) {
        field303++;
        class317 var3 = class349.field5540[class119.field1826][arg1][arg0];
        if (var3 == null) {
            class327.method2317(class119.field1826, arg1, arg0);
            return;
        }
        class236 var4 = null;
        int var5 = -99999999;
        for (class236 var6 = (class236) var3.method2244((byte) -127); var6 != null; var6 = (class236) var3.method2241(-1)) {
            class263 var7 = class48.method469(10, var6.field3669.field51);
            int var8 = var7.field4063;
            if (var7.field4030 == 1) {
                var8 = (var6.field3669.field55 + 1) * var8;
            }
            if (var8 > var5) {
                var4 = var6;
                var5 = var8;
            }
        }
        if (var4 == null) {
            class327.method2317(class119.field1826, arg1, arg0);
            return;
        }
        var3.method2237(arg2, var4);
        class236 var9 = (class236) var3.method2244((byte) -126);
        class4 var10 = null;
        class4 var11 = null;
        while (var9 != null) {
            class4 var12 = var9.field3669;
            if (var4.field3669.field51 != var12.field51) {
                if (var10 == null) {
                    var10 = var12;
                }
                if (var10.field51 != var12.field51 && var11 == null) {
                    var11 = var12;
                }
            }
            var9 = (class236) var3.method2241(-1);
        }
        long var13 = (long) ((arg0 << 7) + arg1 + 1610612736);
        class362.method2545(class119.field1826, arg1, arg0, class193.method1469(arg0 * 128 + 64, arg1 * 128 - -64, (byte) -47, class119.field1826), var4.field3669, var13, var10, var11);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I[BII)I", line = 872)
    public static final int method208(int arg0, byte[] arg1, int arg2, int arg3) {
        if (arg0 != -14621) {
            return 111;
        }
        int var4 = -1;
        field310++;
        for (int var5 = arg3; var5 < arg2; var5++) {
            var4 = class106.field1591[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BLjava/lang/String;)I", line = 894)
    public final int method209(byte arg0, String arg1) {
        field276++;
        if (this.method189(1623)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field289.field4913.method1255(-20168, class296.method2135(var3, 560166149));
            return arg0 < 96 ? 36 : this.method196(var4, 0);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lac;ZZ)V", line = 1151)
    public class18(class115 arg0, boolean arg1, boolean arg2) {
        this.field293 = arg2;
        this.field291 = arg0;
        this.field270 = arg1;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZI)Z", line = 918)
    public final boolean method210(int arg0, boolean arg1, int arg2) {
        field267++;
        if (!this.method218(1, arg0, arg2)) {
            return false;
        } else if (this.field279[arg2] == null || this.field279[arg2][arg0] == null) {
            if (!arg1) {
                this.method214(false);
            }
            if (this.field297[arg2] == null) {
                this.method184(arg2, (byte) 61);
                return this.field297[arg2] != null;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(Ljava/lang/String;I)Z", line = 946)
    public final boolean method211(String arg0, int arg1) {
        field281++;
        if (this.method189(1623)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field289.field4913.method1255(-20168, class296.method2135(var3, 560166149));
            int var5 = -2 / ((arg1 - 49) / 34);
            return this.method212(var4, 25345);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(II)Z", line = 967)
    public final boolean method212(int arg0, int arg1) {
        field294++;
        if (!this.method198((byte) 101, arg0)) {
            return false;
        }
        if (arg1 != 25345) {
            this.method200((byte) 67);
        }
        if (this.field297[arg0] == null) {
            this.method184(arg0, (byte) 61);
            return this.field297[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "(II)V", line = 996)
    private final void method213(int arg0, int arg1) {
        field277++;
        if (arg1 == 4) {
            this.field291.method988(arg0, (byte) 98);
        }
    }

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(Z)V", line = 1010)
    public final void method214(boolean arg0) {
        field296++;
        if (this.field279 != null) {
            for (int var2 = 0; var2 < this.field279.length; var2++) {
                this.field279[var2] = null;
            }
        }
        if (arg0) {
            field295 = (class215) null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)[B", line = 1036)
    public final byte[] method215(String arg0, boolean arg1, String arg2) {
        field307++;
        if (!this.method189(1623)) {
            return null;
        }
        if (arg1) {
            field280 = 10;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field289.field4913.method1255(-20168, class296.method2135(var4, 560166149));
        if (this.method198((byte) 113, var6)) {
            int var7 = this.field289.field4918[var6].method1255(-20168, class296.method2135(var5, 560166149));
            return this.method187(var6, var7, -1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)V", line = 1061)
    public final void method216(int arg0, boolean arg1) {
        if (!arg1) {
            field286++;
            if (this.method198((byte) 102, arg0) && this.field279 != null) {
                this.field279[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZZ)V", line = 1098)
    public final void method217(int arg0, boolean arg1, boolean arg2) {
        field306++;
        if (!this.method189(arg0 ^ 0x656)) {
            return;
        }
        if (arg0 != 1) {
            this.method186(false, (String) null);
        }
        if (arg2) {
            this.field289.field4911 = (int[][]) null;
            this.field289.field4918 = null;
        }
        if (arg1) {
            this.field289.field4913 = null;
            this.field289.field4924 = null;
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(III)Z", line = 1129)
    private final boolean method218(int arg0, int arg1, int arg2) {
        field263++;
        if (arg0 != 1) {
            return false;
        } else if (!this.method189(1623)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && this.field289.field4921.length > arg2 && arg1 < this.field289.field4921[arg2]) {
            return true;
        } else if (class123.field1972) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }
}
