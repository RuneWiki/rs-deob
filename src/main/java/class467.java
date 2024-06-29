import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class467 extends class1 {

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field6375 = 0;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "Lju;")
    public static class102 field6376 = new class102(81, 2);

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field6373;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "I")
    public static int field6374;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field6378;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "Lfp;")
    public class467 field6370;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "Lfp;")
    public class467 field6371;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;B)I")
    public static final int method2782(String arg0, byte arg1) {
        field6374++;
        if (arg1 >= -44) {
            field6375 = -49;
        }
        if (!class548.field7717.field8732) {
            return -1;
        } else if (class408.field5664.containsKey(arg0)) {
            return 100;
        } else {
            String var2 = class233.method1498(arg0, 118);
            if (var2 == null) {
                return -1;
            }
            String var3 = class271.field3662 + var2;
            if (!class61.field828.method3312("", -1, var3)) {
                return -1;
            } else if (class61.field828.method3343(-24230, var3)) {
                byte[] var4 = class61.field828.method3330((byte) 67, "", var3);
                Object var5 = null;
                File var6;
                try {
                    var6 = class681.method3897(var2, (byte) -123);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class704.method3957(64, var6);
                if (var8 != null && var4.length == var8.length) {
                    for (int var9 = 0; var9 < var8.length; var9++) {
                        if (var4[var9] != var8[var9]) {
                            var7 = false;
                            break;
                        }
                    }
                } else {
                    var7 = false;
                }
                try {
                    if (!var7) {
                        class548.field7717.method3585(var4, 105, var6);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class604.method3541(var6, arg0, 0);
                return 100;
            } else {
                return class61.field828.method3308(var3, 123);
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Z)V")
    public static void method2783(boolean arg0) {
        if (!arg0) {
            method2787(false, -21, null);
        }
        field6376 = null;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V")
    public final void method2784(int arg0) {
        field6373++;
        if (this.field6371 != null && arg0 == 1670470983) {
            this.field6371.field6370 = this.field6370;
            this.field6370.field6371 = this.field6371;
            this.field6370 = null;
            this.field6371 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)V")
    public static final void method2785(int arg0) {
        field6378++;
        if (class673.field9471 != null) {
            return;
        }
        class673.field9471 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != 6) {
            field6375 = -110;
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) ((var3 & 0xFC07) >> 10) / 64.0D + 0.0078125D;
            double var6 = (double) ((var3 & 0x3D0) >> 7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if ((var8 < 0.5D)) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if ((var4 * 6.0D < 1.0D)) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if (var4 * 2.0D < 1.0D) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if ((var20 * 6.0D < 1.0D)) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if (var24 * 2.0D < 1.0D) {
                    var14 = var16;
                } else if (var24 * 3.0D < 2.0D) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class673.field9471[var3] = var35;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLkc;)V")
    public static final void method2786(byte arg0, class655 arg1) {
        field6372++;
        int var2 = 107 % ((-arg0 - 27) / 44);
        class67 var3 = (class67) class393.field5473.method1381(true, (long) arg1.field8344);
        if (var3 == null) {
            return;
        }
        if (var3.field927 != null) {
            class237.field3299.method3761(var3.field927);
            var3.field927 = null;
        }
        var3.method3065(-17363);
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZILjava/lang/String;)V")
    public static final void method2787(boolean arg0, int arg1, String arg2) {
        field6377++;
        int var3 = class147.field2030;
        int[] var4 = class351.field4456;
        boolean var5 = false;
        int var6 = 0;
        if (!arg0) {
            field6375 = -43;
        }
        while (var3 > var6) {
            class655 var7 = class40.field563[var4[var6]];
            if (var7 != null && class473.field6483 != var7 && var7.field9272 != null && var7.field9272.equalsIgnoreCase(arg2)) {
                if (arg1 == 1) {
                    class87.field1202++;
                    class120 var12 = class292.method1716(class608.field8668, true, class554.field7819);
                    var12.field1653.method154(false, var4[var6]);
                    var12.field1653.method188(0, -16305);
                    class471.method2805(103, var12);
                } else if (arg1 == 4) {
                    class248.field3436++;
                    class120 var11 = class292.method1716(class608.field8668, true, class245.field3421);
                    var11.field1653.method162((byte) -86, 0);
                    var11.field1653.method147((byte) 53, var4[var6]);
                    class471.method2805(120, var11);
                } else if (arg1 == 5) {
                    class498.field6976++;
                    class120 var10 = class292.method1716(class608.field8668, arg0, class112.field1595);
                    var10.field1653.method175(var4[var6], -16904);
                    var10.field1653.method188(0, -16305);
                    class471.method2805(94, var10);
                } else if (arg1 == 6) {
                    class638.field9069++;
                    class120 var8 = class292.method1716(class608.field8668, true, class659.field9304);
                    var8.field1653.method154(false, var4[var6]);
                    var8.field1653.method148(0, -127);
                    class471.method2805(93, var8);
                } else if (arg1 == 7) {
                    class391.field5437++;
                    class120 var9 = class292.method1716(class608.field8668, true, class586.field8432);
                    var9.field1653.method184(0, -53);
                    var9.field1653.method175(var4[var6], -16904);
                    class471.method2805(119, var9);
                }
                var5 = true;
                break;
            }
            var6++;
        }
        if (!var5) {
            class216.method1417(class138.field1857.method891(-2041650704, class369.field4721) + arg2, (byte) 118, 4);
        }
    }
}
