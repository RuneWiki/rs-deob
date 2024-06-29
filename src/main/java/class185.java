import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class185 extends class243 {

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "[I")
    private int[] field3142 = new int[3];

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "I")
    private int field3141 = 4096;

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "I")
    private int field3150 = 4096;

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
    private int field3146 = 4096;

    @OriginalMember(owner = "client!mj", name = "jb", descriptor = "I")
    private int field3151 = 409;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "Lub;")
    public static class227 field3143 = class257.method1749("Spielwelt erstellt)3", 17263);

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "I")
    public static int field3144 = 0;

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "Lub;")
    public static class227 field3149 = class257.method1749("Gegenstand f-Ur Mitglieder", 17263);

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "Luh;")
    public static class198 field3140 = new class198();

    @OriginalMember(owner = "client!mj", name = "nb", descriptor = "I")
    public static int field3155 = 0;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    public static int field3145;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    public static int field3147;

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "I")
    public static int field3148;

    @OriginalMember(owner = "client!mj", name = "kb", descriptor = "I")
    public static int field3152;

    @OriginalMember(owner = "client!mj", name = "lb", descriptor = "I")
    public static int field3153;

    @OriginalMember(owner = "client!mj", name = "mb", descriptor = "I")
    public static int field3154;

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(I)V")
    public static void method1177(int arg0) {
        if (arg0 <= 7) {
            field3155 = 66;
        }
        field3143 = null;
        field3149 = null;
        field3140 = null;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class185() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(BLub;)Z")
    public static final boolean method1178(byte arg0, class227 arg1) {
        ++field3154;
        try {
            int var2 = arg1.method1528(44, 19681);
            if (var2 == -1) {
                return false;
            } else {
                if (arg0 != 28) {
                    field3143 = null;
                }
                class227 var3 = arg1.method1532((byte) 99, 0, var2);
                class227 var4 = arg1.method1517((byte) 15, var2 + 1);
                MessageDigest var5 = MessageDigest.getInstance("SHA");
                var5.reset();
                var5.update(var3.method1502((byte) 44));
                byte[] var6 = var5.digest();
                byte[] var7 = var4.method1484(102);
                class226 var8 = new class226(5000);
                var8.method1460(var7.length, 0, true, var7);
                var8.field3879 = 0;
                var8.method1431(class132.field2299, class30.field488, 0);
                if (~var8.field3901[0] != -2) {
                    return false;
                } else {
                    for (int var9 = 0; var9 < 20; ++var9) {
                        if (var8.field3901[var9 + 1] != var6[var9]) {
                            return false;
                        }
                    }
                    return true;
                }
            }
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!mj", name = "h", descriptor = "(I)V")
    public static final void method1179(int arg0) {
        ++field3152;
        int var1 = class218.field3673.method1273((byte) -126);
        if (var1 != 0) {
            ++class43.field717;
            int var2 = 0;
            class176.field2935.method664((byte) -120, 32);
            class176.field2935.method1443(0, 0);
            int var3 = class176.field2935.field3879;
            class216 var4 = (class216) class218.field3673.method1269((byte) -107);
            class176.field2935.method1451(var4.field3637, (byte) -125);
            int var5 = var4.field3637;
            class216 var6;
            while ((var6 = (class216) class218.field3673.method1269((byte) -19)) != null) {
                if (~var2 > -256 && var5 + 1 == var6.field3637) {
                    ++var2;
                } else {
                    class176.field2935.method1443(var2, 0);
                    var2 = 0;
                    class176.field2935.method1451(var6.field3637, (byte) -124);
                }
                var5 = var6.field3637;
            }
            class176.field2935.method1443(var2, 0);
            class176.field2935.method1464(class176.field2935.field3879 - var3, 0);
            if (arg0 < 107) {
                field3155 = -9;
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field3145;
        if (arg0 != 230) {
            return null;
        } else {
            int[][] var3 = super.field4213.method1406(arg1, 0);
            if (super.field4213.field3771) {
                int[][] var4 = this.method1616(-1, arg1, 0);
                int[] var5 = var4[1];
                int[] var6 = var4[2];
                int[] var7 = var4[0];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; class212.field3586 > var11; ++var11) {
                    int var12 = var7[var11];
                    int var13 = -this.field3142[0] + var12;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    if (~var13 < ~this.field3151) {
                        var8[var11] = var12;
                        var9[var11] = var5[var11];
                        var10[var11] = var6[var11];
                    } else {
                        int var14 = var5[var11];
                        int var15 = -this.field3142[1] + var14;
                        if (~var15 > -1) {
                            var15 = -var15;
                        }
                        if (this.field3151 < var15) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var6[var11];
                        } else {
                            int var16 = var6[var11];
                            int var17 = -this.field3142[2] + var16;
                            if (var17 < 0) {
                                var17 = -var17;
                            }
                            if (~var17 < ~this.field3151) {
                                var8[var11] = var12;
                                var9[var11] = var14;
                                var10[var11] = var16;
                            } else {
                                var8[var11] = this.field3146 * var12 >> 12;
                                var9[var11] = this.field3141 * var14 >> 12;
                                var10[var11] = this.field3150 * var16 >> 12;
                            }
                        }
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg0.method1444(171285352);
                            this.field3142[2] = class76.method446(var5, 255) >> 12;
                            this.field3142[1] = class76.method446(var5, 65280) >> 4;
                            this.field3142[0] = class76.method446(16711680, var5) << 4;
                        }
                    } else {
                        this.field3146 = arg0.method1447(0);
                    }
                } else {
                    this.field3141 = arg0.method1447(0);
                }
            } else {
                this.field3150 = arg0.method1447(0);
            }
        } else {
            this.field3151 = arg0.method1447(0);
        }
        ++field3147;
        if (arg1) {
            field3155 = 20;
        }
    }
}
