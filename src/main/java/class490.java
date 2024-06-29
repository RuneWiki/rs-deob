import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class490 {

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "[I")
    private int[] field6912 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "Z")
    public static boolean field6899 = false;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "F")
    public static float field6914;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field6896;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field6897;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field6898;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "I")
    public static int field6901;

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "I")
    public static int field6911;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "Lti;")
    public class280 field6902;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "[I")
    private int[] field6900;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "[I")
    public static int[] field6909;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "[S")
    private short[] field6905;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "[S")
    private short[] field6908;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "[S")
    private short[] field6910;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "[S")
    private short[] field6913;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)Z")
    public final boolean method2867(boolean arg0) {
        field6907++;
        boolean var2 = true;
        if (arg0) {
            return false;
        }
        class201 var3 = this.field6902.field4131;
        synchronized (this.field6902.field4131) {
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field6912[var4] != -1 && !this.field6902.field4131.method1237(this.field6912[var4], 0, 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILbj;ZIIIIILbj;)V")
    public static final void method2868(int arg0, int arg1, class146 arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class146 arg9) {
        field6898++;
        int var10 = arg9.method923(0);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class176 var12 = (class176) class414.field5819.method1479(0, (long) var10);
        if (var12 == null) {
            class72[] var13 = class72.method432(class407.field5716, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class141.field1878.method644(var13[0], true);
            class414.field5819.method1473(var12, (long) var10, 127);
        }
        class161.method1005(arg0 >> 1, arg2.method918(arg3) * 64, arg4 >> 1, arg8, 0, true, arg2.field4319, arg2.field4317, arg2.field4331, arg1);
        int var14 = arg5 + class421.field5882[0] - 18;
        int var15 = class421.field5882[1] + arg6 - 16 - 54;
        int var16 = arg7 / 4 * 18 + var14;
        int var17 = arg7 % 4 * 18 + var15;
        var12.method1079(var16, var17);
        if (arg2 == arg9) {
            class141.field1878.method1933(18, -256, 18, var17 - 1, (byte) -124, var16 - 1);
        }
        class260 var18 = class115.method724(4);
        var18.field3806 = var17 + 16;
        var18.field3808 = arg9;
        var18.field3811 = var16 + 16;
        var18.field3807 = var17;
        var18.field3805 = var16;
        class345.field5017.method1444(var18, (byte) 101);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILb;ZIBI)V")
    public static final void method2869(int arg0, int arg1, class201 arg2, boolean arg3, int arg4, byte arg5, int arg6) {
        class206.field3157 = arg0;
        client.field2623 = arg2;
        class405.field5701 = arg4;
        if (arg5 <= 78) {
            return;
        }
        class256.field3761 = arg3;
        class222.field3376 = arg6;
        class327.field4741 = 1;
        class70.field883 = arg1;
        field6897++;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)V")
    public static void method2870(int arg0) {
        if (arg0 == 0) {
            field6909 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)Z")
    public final boolean method2871(byte arg0) {
        field6903++;
        if (this.field6900 == null) {
            return true;
        }
        boolean var2 = true;
        class201 var3 = this.field6902.field4131;
        synchronized (this.field6902.field4131) {
            for (int var4 = 0; var4 < this.field6900.length; var4++) {
                if (!this.field6902.field4131.method1237(this.field6900[var4], 0, 0)) {
                    var2 = false;
                }
            }
            if (arg0 < 12) {
                this.field6905 = null;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Z)Lvn;")
    public final class187 method2872(boolean arg0) {
        field6896++;
        if (!arg0) {
            return null;
        } else if (this.field6900 == null) {
            return null;
        } else {
            class187[] var2 = new class187[this.field6900.length];
            class201 var3 = this.field6902.field4131;
            synchronized (this.field6902.field4131) {
                int var4 = 0;
                while (true) {
                    if (var4 >= this.field6900.length) {
                        break;
                    }
                    var2[var4] = class264.method1629(this.field6902.field4131, this.field6900[var4], (byte) -42, 0);
                    var4++;
                }
            }
            class187 var5;
            if (var2.length == 1) {
                var5 = var2[0];
            } else {
                var5 = new class187(var2, var2.length);
            }
            if (var5 == null) {
                return null;
            }
            if (this.field6910 != null) {
                for (int var6 = 0; var6 < this.field6910.length; var6++) {
                    var5.method1157(2, this.field6910[var6], this.field6908[var6]);
                }
            }
            if (this.field6905 != null) {
                for (int var7 = 0; var7 < this.field6905.length; var7++) {
                    var5.method1167(this.field6905[var7], this.field6913[var7], 0);
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BLrp;)V")
    public final void method2873(byte arg0, class276 arg1) {
        while (true) {
            int var3 = arg1.method1701(-23121);
            if (var3 == 0) {
                if (arg0 != 3) {
                    this.method2872(false);
                }
                field6901++;
                return;
            }
            this.method2875(-4, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(I)Lvn;")
    public final class187 method2874(int arg0) {
        field6911++;
        class187[] var2 = new class187[5];
        int var3 = 0;
        class201 var4 = this.field6902.field4131;
        synchronized (this.field6902.field4131) {
            for (int var5 = arg0; var5 < 5; var5++) {
                if (this.field6912[var5] != -1) {
                    var2[var3++] = class264.method1629(this.field6902.field4131, this.field6912[var5], (byte) -42, 0);
                }
            }
        }
        class187 var6 = new class187(var2, var3);
        if (this.field6910 != null) {
            for (int var7 = 0; var7 < this.field6910.length; var7++) {
                var6.method1157(2, this.field6910[var7], this.field6908[var7]);
            }
        }
        if (this.field6905 != null) {
            for (int var8 = 0; var8 < this.field6905.length; var8++) {
                var6.method1167(this.field6905[var8], this.field6913[var8], 0);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IILrp;)V")
    private final void method2875(int arg0, int arg1, class276 arg2) {
        field6906++;
        if (arg1 == 1) {
            arg2.method1701(-23121);
        } else if (arg1 == 2) {
            int var4 = arg2.method1701(-23121);
            this.field6900 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6900[var5] = arg2.method1729(class125.method786(arg0, -65284));
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var6 = arg2.method1701(-23121);
                this.field6910 = new short[var6];
                this.field6908 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field6910[var7] = (short) arg2.method1729(65280);
                    this.field6908[var7] = (short) arg2.method1729(65280);
                }
            } else if (arg1 == 41) {
                int var8 = arg2.method1701(-23121);
                this.field6913 = new short[var8];
                this.field6905 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6905[var9] = (short) arg2.method1729(65280);
                    this.field6913[var9] = (short) arg2.method1729(65280);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field6912[arg1 - 60] = arg2.method1729(65280);
            }
        }
        if (arg0 != -4) {
            this.field6910 = null;
        }
    }
}
