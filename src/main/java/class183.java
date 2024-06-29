import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class183 extends class95 {

    @OriginalMember(owner = "client!im", name = "O", descriptor = "[B")
    public byte[] field3363;

    @OriginalMember(owner = "client!im", name = "Q", descriptor = "I")
    public static int field3365 = -1;

    @OriginalMember(owner = "client!im", name = "R", descriptor = "[Z")
    public static boolean[] field3366 = new boolean[100];

    @OriginalMember(owner = "client!im", name = "S", descriptor = "Z")
    public static boolean field3367 = true;

    @OriginalMember(owner = "client!im", name = "U", descriptor = "Lsf;")
    public static class108 field3369 = null;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "Lsf;")
    public static class108 field3361 = class140.method973(255, ")3)3)3");

    @OriginalMember(owner = "client!im", name = "H", descriptor = "I")
    public static int field3358;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!im", name = "T", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "[I")
    public static int[] field3359;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "[[[B")
    public static byte[][][] field3360;

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(B)V", line = 8)
    public static final void method1321(byte arg0) {
        field3368++;
        if (class295.field5151 != null || class272.field4776 != null) {
            return;
        }
        int var1 = class331.field5645;
        if (arg0 <= 45) {
            method1322(31);
        }
        if (class62.field989) {
            if (var1 != 1) {
                int var2 = class317.field5456;
                int var3 = class171.field3116;
                if (var2 < (class203.field3665 - 10) || var2 > (class167.field2998 + class203.field3665 + 10) || class296.field5167 - 10 > var3 || var3 > (class296.field5167 + class190.field3453 + 10)) {
                    class62.field989 = false;
                    class101.method702(-1, class203.field3665, class167.field2998, class296.field5167, class190.field3453);
                }
            }
            if (var1 == 1) {
                int var4 = class296.field5167;
                int var5 = class203.field3665;
                int var6 = class167.field2998;
                int var7 = class87.field1382;
                int var8 = class170.field3041;
                int var9 = -1;
                for (int var10 = 0; var10 < class311.field5374; var10++) {
                    int var11 = (class311.field5374 - var10 - 1) * 15 + (var4 + 31);
                    if (var5 < var7 && var7 < var5 + var6 && var8 > var11 - 13 && var11 + 3 > var8) {
                        var9 = var10;
                    }
                }
                if (var9 != -1) {
                    class92.method616(10, var9);
                }
                class62.field989 = false;
                class101.method702(-1, class203.field3665, class167.field2998, class296.field5167, class190.field3453);
            }
            return;
        }
        if (var1 == 1 && class311.field5374 > 0) {
            short var12 = class305.field5299[class311.field5374 - 1];
            if (var12 == 43 || var12 == 38 || var12 == 50 || var12 == 18 || var12 == 37 || var12 == 16 || var12 == 14 || var12 == 8 || var12 == 59 || var12 == 20 || var12 == 39 || var12 == 1006) {
                int var13 = class313.field5405[class311.field5374 - 1];
                int var14 = class94.field1506[class311.field5374 - 1];
                class98 var15 = class168.method1173(var14, -1456948048);
                if (class256.method1807(true, client.method1815(var15)) || class159.method1104(client.method1815(var15), (byte) -120)) {
                    class136.field2411 = 0;
                    class26.field401 = false;
                    if (class295.field5151 != null) {
                        class195.method1388(-82, class295.field5151);
                    }
                    class295.field5151 = class168.method1173(var14, -1456948048);
                    class29.field441 = class170.field3041;
                    class236.field4141 = var13;
                    class129.field2194 = class87.field1382;
                    class195.method1388(-82, class295.field5151);
                    return;
                }
            }
        }
        if (var1 == 1 && (class155.field2798 == 1 && class311.field5374 > 2 || class274.method1980(class311.field5374 - 1, 121))) {
            var1 = 2;
        }
        if (var1 == 2 && class311.field5374 > 0 || class324.field5528 == 1) {
            class90.method612(-19775);
        }
        if (var1 == 1 && class311.field5374 > 0 || class324.field5528 == 2) {
            class1.method6(0);
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V", line = 135)
    public static void method1322(int arg0) {
        if (arg0 != -1823443115) {
            field3366 = (boolean[]) null;
        }
        field3359 = null;
        field3361 = null;
        field3366 = null;
        field3369 = null;
        field3360 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(BI)Z", line = 156)
    public static final boolean method1323(byte arg0, int arg1) {
        field3362++;
        if (arg0 >= -7) {
            method1323((byte) 125, -100);
        }
        return ((arg1 & 0x39032A) >> 21) != 0;
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "([B)V", line = 203)
    public class183(byte[] arg0) {
        this.field3363 = arg0;
    }
}
