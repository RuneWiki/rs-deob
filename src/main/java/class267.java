import java.awt.Rectangle;
import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class267 extends class139 {

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    private int field3895 = 32768;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "Lus;")
    public static class1 field3904 = new class1(62, -2);

    @OriginalMember(owner = "client!un", name = "W", descriptor = "I")
    public static int field3909 = -1;

    @OriginalMember(owner = "client!un", name = "U", descriptor = "Ldk;")
    public static class326 field3907 = new class326("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "I")
    public static int field3902;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    public static int field3905;

    @OriginalMember(owner = "client!un", name = "T", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!un", name = "V", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIIIB)V")
    public static final void method1640(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != -119) {
            field3909 = -57;
        }
        for (int var5 = 0; var5 < class420.field5872; ++var5) {
            Rectangle var6 = class40.field526[var5];
            if (~(var6.x + var6.width) < ~arg0 && arg0 + arg3 > var6.x && var6.y + var6.height > arg2 && ~var6.y > ~(arg1 + arg2)) {
                class422.field5917[var5] = true;
            }
        }
        ++field3902;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/Throwable;B)V")
    public static final void method1641(String arg0, Throwable arg1, byte arg2) {
        ++field3900;
        try {
            String var3 = "";
            if (arg1 != null) {
                var3 = class138.method872(-7671, arg1);
            }
            if (arg0 != null) {
                if (arg1 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg0;
            }
            class330.method2091(var3, (byte) -104);
            String var4 = class105.method592(var3, 0, ":", "%3a");
            String var5 = class105.method592(var4, 0, "@", "%40");
            if (arg2 != -87) {
                method1642(15, -40, (byte) -13, -64, -21);
            }
            String var6 = class105.method592(var5, 0, "&", "%26");
            String var7 = class105.method592(var6, arg2 + 87, "#", "%23");
            if (class116.field1480.field6021 != null) {
                class366 var8 = class116.field1480.method2523(-99, new URL(class116.field1480.field6021.getCodeBase(), "clienterror.ws?c=" + class475.field6666 + "&u=" + class276.field4055 + "&v1=" + class430.field6025 + "&v2=" + class430.field6009 + "&e=" + var7));
                while (~var8.field5253 == -1) {
                    class111.method713(-66, 1L);
                }
                if (~var8.field5253 == -2) {
                    DataInputStream var9 = (DataInputStream) var8.field5255;
                    var9.read();
                    var9.close();
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
    public final void method23(int arg0) {
        if (arg0 == 7) {
            ++field3896;
            class224.method1439(-100);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IIBII)V")
    public static final void method1642(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        ++field3903;
        float var5 = (float) class395.field5628 / (float) class395.field5625;
        int var6 = arg0;
        if (arg2 >= 69) {
            int var7 = arg4;
            if (var5 < 1.0F) {
                var7 = (int) ((float) arg0 * var5);
            } else {
                var6 = (int) ((float) arg4 / var5);
            }
            int var8 = arg3 - (-var7 + arg4) / 2;
            int var9 = arg1 - (arg0 - var6) / 2;
            class230.field3474 = -1;
            class128.field1666 = class395.field5625 * var9 / var6;
            class377.field5427 = -1;
            class220.field3280 = -(class395.field5628 * var8 / var7) + class395.field5628;
            class81.method459((byte) -118);
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
    public class267() {
        super(3, false);
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(Z)V")
    public static void method1643(boolean arg0) {
        field3907 = null;
        if (arg0) {
            field3904 = null;
        }
        field3904 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ZIIIII)V")
    public static final void method1644(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3898;
        if (arg4 != 255) {
            field3907 = null;
        }
        long var6 = (long) (arg5 | (!arg0 ? 0 : Integer.MIN_VALUE));
        class456 var8 = (class456) class364.field5236.method2761(var6, (byte) -112);
        if (var8 == null) {
            var8 = new class456();
            class364.field5236.method2767(-1, var6, var8);
        }
        if (var8.field6410.length <= arg1) {
            int[] var9 = new int[arg1 + 1];
            int[] var10 = new int[arg1 + 1];
            for (int var11 = 0; ~var11 > ~var8.field6410.length; ++var11) {
                var9[var11] = var8.field6410[var11];
                var10[var11] = var8.field6415[var11];
            }
            for (int var12 = var8.field6410.length; ~var12 > ~arg1; ++var12) {
                var9[var12] = -1;
                var10[var12] = 0;
            }
            var8.field6410 = var9;
            var8.field6415 = var10;
        }
        var8.field6410[arg1] = arg3;
        var8.field6415[arg1] = arg2;
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(II)[I")
    public final int[] method22(int arg0, int arg1) {
        ++field3901;
        int[] var3 = super.field1844.method2176(arg0, 0);
        if (arg1 != 27782) {
            this.field3895 = 26;
        }
        if (super.field1844.field5045) {
            int[] var4 = this.method879((byte) -29, arg0, 1);
            int[] var5 = this.method879((byte) -29, arg0, 2);
            for (int var6 = 0; ~class356.field5147 < ~var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field3895 >> 12;
                int var9 = class311.field4401[var7] * var8 >> 12;
                int var10 = class253.field3720[var7] * var8 >> 12;
                int var11 = (var9 >> 12) + var6 & class414.field5822;
                int var12 = class388.field5511 & arg0 - -(var10 >> 12);
                int[] var13 = this.method879((byte) -29, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lrp;BI)V")
    public final void method21(class276 arg0, byte arg1, int arg2) {
        ++field3899;
        if (arg1 != -45) {
            this.field3895 = 78;
        }
        if (arg2 != 0) {
            if (arg2 == 1) {
                super.field1841 = arg0.method1701(-23121) == 1;
            }
        } else {
            this.field3895 = arg0.method1729(arg1 + 65325) << 4;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[[I")
    public final int[][] method33(int arg0, int arg1) {
        ++field3908;
        int[][] var3 = super.field1835.method999((byte) 104, arg1);
        if (arg0 > -67) {
            method1642(12, 23, (byte) -1, 57, -123);
        }
        if (super.field1835.field2395) {
            int[] var4 = this.method879((byte) -29, arg1, 1);
            int[] var5 = this.method879((byte) -29, arg1, 2);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            for (int var9 = 0; var9 < class356.field5147; ++var9) {
                int var10 = 255 & var4[var9] * 255 >> 12;
                int var11 = var5[var9] * this.field3895 >> 12;
                int var12 = class311.field4401[var10] * var11 >> 12;
                int var13 = class253.field3720[var10] * var11 >> 12;
                int var14 = (var12 >> 12) + var9 & class414.field5822;
                int var15 = (var13 >> 12) + arg1 & class388.field5511;
                int[][] var16 = this.method882(0, var15, 1);
                var6[var9] = var16[0][var14];
                var7[var9] = var16[1][var14];
                var8[var9] = var16[2][var14];
            }
        }
        return var3;
    }
}
