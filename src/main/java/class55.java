import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class55 {

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    private int field912 = 0;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Z")
    public boolean field910 = false;

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "I")
    private int field907 = 0;

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public int field908 = -1;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "I")
    private int field926 = 128;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field923 = 0;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "I")
    private int field918 = 128;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "Z")
    public boolean field919 = false;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "I")
    public static int field905 = 99;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Ljava/lang/String;")
    public static String field916 = "wave:";

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field904 = 0;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field900;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field901;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field906;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    public static int field911;

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    public static int field914;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field915;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "I")
    private int field920;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "I")
    public int field922;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "[S")
    private short[] field909;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "[S")
    private short[] field913;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "[S")
    private short[] field917;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "[S")
    private short[] field924;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "[[S")
    public static short[][] field903;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V")
    public static void method376(int arg0) {
        if (arg0 != -29783) {
            method380(-81, -53, 60, -10, -18, 5);
        }
        field916 = null;
        field903 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lwd;BI)V")
    private final void method377(class162 arg0, byte arg1, int arg2) {
        if (arg2 == 1) {
            this.field920 = arg0.method1142(-18970);
        } else if (arg2 == 2) {
            this.field908 = arg0.method1142(-18970);
        } else if (arg2 == 4) {
            this.field926 = arg0.method1142(-18970);
        } else if (arg2 == 5) {
            this.field918 = arg0.method1142(-18970);
        } else if (arg2 == 6) {
            this.field907 = arg0.method1142(arg1 ^ 0xFFFFB5AF);
        } else if (arg2 == 7) {
            this.field923 = arg0.method1133((byte) 53);
        } else if (arg2 == 8) {
            this.field912 = arg0.method1133((byte) 53);
        } else if (arg2 == 9) {
            this.field910 = true;
        } else if (arg2 == 10) {
            this.field919 = true;
        } else if (arg2 == 40) {
            int var6 = arg0.method1133((byte) 53);
            this.field924 = new short[var6];
            this.field909 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field924[var7] = (short) arg0.method1142(-18970);
                this.field909[var7] = (short) arg0.method1142(-18970);
            }
        } else if (arg2 == 41) {
            int var4 = arg0.method1133((byte) 53);
            this.field917 = new short[var4];
            this.field913 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field917[var5] = (short) arg0.method1142(-18970);
                this.field913[var5] = (short) arg0.method1142(-18970);
            }
        }
        field900++;
        if (arg1 != 73) {
            this.method378((byte) -119, (class162) null);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BLwd;)V")
    public final void method378(byte arg0, class162 arg1) {
        field921++;
        while (true) {
            int var3 = arg1.method1133((byte) 53);
            if (var3 == 0) {
                if (arg0 > -103) {
                    method382(73, 8, (byte) 78, -70, 31);
                    return;
                } else {
                    return;
                }
            }
            this.method377(arg1, (byte) 73, var3);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIII)Lk;")
    public final class37 method379(int arg0, int arg1, int arg2, int arg3) {
        class37 var5 = (class37) class230.field3726.method1261(0, (long) this.field922);
        field925++;
        if (var5 == null) {
            class166 var6 = class166.method1200(class195.field3162, this.field920, 0);
            if (var6 == null) {
                return null;
            }
            if (this.field924 != null) {
                for (int var7 = 0; var7 < this.field924.length; var7++) {
                    var6.method1203(this.field924[var7], this.field909[var7]);
                }
            }
            if (this.field917 != null) {
                for (int var8 = 0; var8 < this.field917.length; var8++) {
                    var6.method1197(this.field917[var8], this.field913[var8]);
                }
            }
            var5 = var6.method1205(this.field923 + 64, this.field912 + 850, -30, -50, -30);
            class230.field3726.method1264(-1, (long) this.field922, var5);
        }
        if (arg1 != -18882) {
            field906 = 77;
        }
        class37 var9;
        if (this.field908 == -1 || arg2 == -1) {
            var9 = var5.method177(true, true, true);
        } else {
            var9 = class22.method121(this.field908, true).method2055(arg3, arg0, -74, var5, arg2);
        }
        if (this.field926 != 128 || this.field918 != 128) {
            var9.method191(this.field926, this.field918, this.field926);
        }
        if (this.field907 != 0) {
            if (this.field907 == 90) {
                var9.method196();
            }
            if (this.field907 == 180) {
                var9.method189();
            }
            if (this.field907 == 270) {
                var9.method188();
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIII)V")
    public static final void method380(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != 100) {
            method380(-6, 62, 0, 103, 60, 72);
        }
        field911++;
        if (class82.field1374 <= arg2 && class259.field4188 >= arg4 && class85.field1409 <= arg3 && class234.field3774 >= arg5) {
            class48.method341(arg4, arg3, arg2, 255, arg5, arg0);
        } else {
            class175.method1277(false, arg5, arg2, arg3, arg4, arg0);
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Z")
    public static final boolean method381(int arg0, int arg1) {
        field901++;
        if (class14.field157 == arg1) {
            return false;
        }
        class308.field4922 = new int[104][104];
        if (arg0 <= 86) {
            method376(47);
        }
        class117.field1887 = new int[104][104];
        class83.field1379 = new int[4][13][13];
        class193.field3135 = new int[104][104];
        class15.field165 = new int[104][104];
        for (int var2 = 0; var2 < 4; var2++) {
            class131.field2065[var2] = new class44(104, 104);
        }
        class14.field157 = arg1;
        class301.field4818 = new byte[4][104][104];
        class151.field2369 = new byte[4][104][104];
        class192.field3113 = new class246[4][104][104];
        return true;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIBII)V")
    public static final void method382(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        class127.method904(arg4, arg1, arg0 + arg4, arg1 - -arg3);
        class127.method886(arg4, arg1, arg0, arg3, 0);
        field914++;
        if (class90.field1468 < 100) {
            return;
        }
        float var5 = (float) class275.field4416 / (float) class275.field4408;
        int var6 = arg0;
        int var7 = arg3;
        if ((var5 < 1.0F)) {
            var7 = (int) ((float) arg0 * var5);
        } else {
            var6 = (int) ((float) arg3 / var5);
        }
        int var8 = (arg3 - var7) / 2 + arg1;
        if (class296.field4734 == null || class296.field4734.field2303 != arg0 || class296.field4734.field2297 != arg3) {
            class232 var9 = new class232(arg0, arg3);
            class127.method894(var9.field3733, arg0, arg3);
            if (class275.field4417.field1269 != -1) {
                class127.method886(0, 0, arg0, arg3, class275.field4417.field1269);
            }
            class275.method1848(0, 0, class275.field4408, class275.field4416, 0, 0, var6, var7);
            class275.method1844();
            class296.field4734 = var9;
            class112.field1757.method497((byte) -106);
        }
        if (arg2 > -66) {
            return;
        }
        int var10 = (arg0 - var6) / 2 + arg4;
        class296.field4734.method1023(var10, var8);
        int var11 = class22.field287 * var6 / class275.field4408;
        int var12 = var10 + (class206.field3285 * var6 / class275.field4408);
        int var13 = class62.field1029 * var7 / class275.field4416 + var8;
        int var14 = class28.field343 * var7 / class275.field4416;
        int var15 = 16711680;
        if (class299.field4792 == 1) {
            var15 = 16777215;
        }
        class127.method881(var12, var13, var11, var14, var15, 128);
        class127.method898(var12, var13, var11, var14, var15);
        if (class274.field4401 <= 0) {
            return;
        }
        int var16;
        if (class98.field1584 > 50) {
            var16 = (100 - class98.field1584) * 5;
        } else {
            var16 = class98.field1584 * 5;
        }
        for (class269 var17 = (class269) class275.field4411.method389(0); var17 != null; var17 = (class269) class275.field4411.method396(0)) {
            class50 var18 = class49.method346(var17.field4333, (byte) 59);
            if (class25.method141(true, var18)) {
                if (class119.field1907 == var17.field4333) {
                    int var19 = var8 + (var17.field4328 * var7 / class275.field4416);
                    int var20 = var17.field4334 * var6 / class275.field4408 + var10;
                    class127.method881(var20 - 2, var19 + -2, 4, 4, 16776960, var16);
                } else if (class26.field331 != -1 && class26.field331 == var18.field845) {
                    int var21 = var17.field4334 * var6 / class275.field4408 + var10;
                    int var22 = var17.field4328 * var7 / class275.field4416 + var8;
                    class127.method881(var21 - 2, var22 + -2, 4, 4, 16776960, var16);
                }
            }
        }
    }
}
