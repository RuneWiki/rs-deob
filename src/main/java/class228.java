import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class class228 {

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public int field3002;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "I")
    public int field3001;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public int field2999;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lmc;")
    public static class78 field2995;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lgd;")
    public static class206 field3000;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field3003;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field3004;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field3005;

    static {
        new class206("You have been temporarily muted due to breaking a rule.", "Aufgrund eines Regelverstoßes wurdest du vorübergehend stumm geschaltet.", "La messagerie instantanée a été temporairement bloquée suite à une infraction.", "Você foi temporariamente vetado por ter violado uma regra.");
        field2995 = new class78(72, 7);
        field3000 = new class206("Continue", "Weiter", "Continuer", "Continuar");
        field3003 = 2;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIILnk;Lkf;IB)V", line = 18)
    public static final void method1276(int arg0, int arg1, int arg2, int arg3, int arg4, class464 arg5, class152 arg6, int arg7, byte arg8) {
        field2997++;
        if (arg8 < 40) {
            method1278((Throwable) null, (String) null, -109);
        }
        int var9 = arg2 * arg2 + (arg3 * arg3);
        if (var9 > arg1) {
            return;
        }
        int var10 = Math.min(arg5.field6308 / 2, arg5.field6340 / 2);
        if (var10 * var10 >= var9) {
            class182.method1070(arg6, arg2, arg7, arg3, class40.field575[arg0], arg4, arg5, (byte) -115);
            return;
        }
        var10 -= 10;
        int var11;
        if (class56.field772 == 4) {
            var11 = (int) class270.field3610 & 0x3FFF;
        } else {
            var11 = (int) class270.field3610 + class150.field2119 & 0x3FFF;
        }
        int var12 = class364.field4994[var11];
        int var13 = class364.field4992[var11];
        if (class56.field772 != 4) {
            var12 = var12 * 256 / (class429.field5795 + 256);
            var13 = var13 * 256 / (class429.field5795 + 256);
        }
        int var14 = arg2 * var13 + arg3 * var12 >> 15;
        int var15 = arg3 * var13 - (arg2 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) (Math.sin(var16) * (double) var10);
        int var19 = (int) ((double) var10 * Math.cos(var16));
        class409.field5610[arg0].method837((float) arg5.field6308 / 2.0F + (float) arg7 + (float) var18, (float) arg5.field6340 / 2.0F + (float) arg4 + (float) (-var19), 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ILqg;)V", line = 76)
    public static final void method1277(int arg0, class296 arg1) {
        field2998++;
        int var2 = 22 / ((arg0 - 46) / 36);
        for (int var3 = 0; var3 < class151.field2133; var3++) {
            int var4 = class93.field1364[var3];
            class487 var5 = class413.field5644[var4];
            int var6 = arg1.method201((byte) -107);
            if ((var6 & 0x2) != 0) {
                var6 += arg1.method201((byte) -113) << 8;
            }
            class259.method1461(arg1, (byte) -100, var4, var5, var6);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;I)V", line = 105)
    public static final void method1278(Throwable arg0, String arg1, int arg2) {
        field3005++;
        try {
            String var3 = "";
            if (arg0 != null) {
                var3 = class449.method2643(arg2 + 30115, arg0);
            }
            if (arg1 != null) {
                if (arg0 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class176.method1012(arg2 + 30118, var3);
            String var4 = class490.method2856(var3, (byte) -56, "%3a", ":");
            String var5 = class490.method2856(var4, (byte) -76, "%40", "@");
            String var6 = class490.method2856(var5, (byte) -103, "%26", "&");
            String var7 = class490.method2856(var6, (byte) -54, "%23", "#");
            if (class291.field3909.field3209 != null) {
                class474 var8 = class291.field3909.method1348(true, new URL(class291.field3909.field3209.getCodeBase(), "clienterror.ws?c=" + class270.field3609 + "&u=" + class294.field3933 + "&v1=" + class241.field3213 + "&v2=" + class241.field3216 + "&e=" + var7));
                while (var8.field6534 == 0) {
                    class374.method2298(-28114, 1L);
                }
                if (var8.field6534 == 1) {
                    DataInputStream var9 = (DataInputStream) var8.field6529;
                    var9.read();
                    var9.close();
                }
                if (arg2 != -30116) {
                    field2995 = null;
                }
            }
        } catch (Exception var10) {
        }
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(III)V", line = 157)
    public class228(int arg0, int arg1, int arg2) {
        this.field3002 = arg2;
        this.field3001 = arg0;
        this.field2999 = arg1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Z)V", line = 167)
    public static final void method1279(boolean arg0) {
        field3004++;
        class226.method1271(-995568477, class488.field6789.field6674);
        int var1 = (class197.field2680 >> 10) + (class162.field2260 >> 3);
        int var2 = (class412.field5637 >> 10) + (class266.field3511 >> 3);
        class373.field5104 = class233.field3103.field6502 = 0;
        class233.field3103.method2827(8, 8, true);
        byte var3 = 18;
        class132.field1934 = new int[var3];
        class243.field3238 = new byte[var3][];
        class208.field2813 = new byte[var3][];
        class136.field1976 = new byte[var3][];
        class36.field545 = new int[var3];
        class316.field4174 = new byte[var3][];
        class98.field1430 = new int[var3];
        class86.field1164 = new int[var3];
        class91.field1343 = new byte[var3][];
        class80.field1078 = new int[var3];
        class306.field4050 = new int[var3];
        class270.field3605 = new int[var3][4];
        int var4 = 0;
        for (int var5 = (var1 - (class295.field3947 >> 4)) / 8; var5 <= (((class295.field3947 >> 4) + var1) / 8); var5++) {
            for (int var7 = (var2 - (class39.field567 >> 4)) / 8; var7 <= ((class39.field567 >> 4) + var2) / 8; var7++) {
                int var8 = (var5 << 8) + var7;
                class306.field4050[var4] = var8;
                class86.field1164[var4] = class87.field1219.method688((byte) 87, "m" + var5 + "_" + var7);
                class80.field1078[var4] = class87.field1219.method688((byte) 87, "l" + var5 + "_" + var7);
                class98.field1430[var4] = class87.field1219.method688((byte) 87, "n" + var5 + "_" + var7);
                class132.field1934[var4] = class87.field1219.method688((byte) 87, "um" + var5 + "_" + var7);
                class36.field545[var4] = class87.field1219.method688((byte) 87, "ul" + var5 + "_" + var7);
                if (class98.field1430[var4] == -1) {
                    class86.field1164[var4] = -1;
                    class80.field1078[var4] = -1;
                    class132.field1934[var4] = -1;
                    class36.field545[var4] = -1;
                }
                var4++;
            }
        }
        for (int var6 = var4; var6 < class98.field1430.length; var6++) {
            class98.field1430[var6] = -1;
            class86.field1164[var6] = -1;
            class80.field1078[var6] = -1;
            class132.field1934[var6] = -1;
            class36.field545[var6] = -1;
        }
        class295.method1654(true, var1, arg0, var2, true);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 247)
    public static void method1280(int arg0) {
        int var1 = -56 % ((arg0 - 52) / 55);
        field3000 = null;
        field2995 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IBI)V")
    public abstract void method181(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)V")
    public abstract void method180(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(III)V")
    public abstract void method178(int arg0, int arg1, int arg2);
}
