import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aca")
public class class727 extends class243 {

    @OriginalMember(owner = "client!aca", name = "E", descriptor = "I")
    private int field10141 = 4096;

    @OriginalMember(owner = "client!aca", name = "D", descriptor = "I")
    public static int field10140;

    @OriginalMember(owner = "client!aca", name = "H", descriptor = "I")
    public static int field10143;

    @OriginalMember(owner = "client!aca", name = "J", descriptor = "I")
    public static int field10144;

    @OriginalMember(owner = "client!aca", name = "K", descriptor = "I")
    public static int field10145;

    @OriginalMember(owner = "client!aca", name = "L", descriptor = "I")
    public static int field10146;

    @OriginalMember(owner = "client!aca", name = "M", descriptor = "I")
    public static int field10147;

    @OriginalMember(owner = "client!aca", name = "N", descriptor = "I")
    public static int field10148;

    @OriginalMember(owner = "client!aca", name = "O", descriptor = "Lni;")
    public static class522 field10149;

    @OriginalMember(owner = "client!aca", name = "G", descriptor = "[Les;")
    public static class386[] field10142;

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method5(int arg0, int arg1) {
        ++field10148;
        int[] var3 = super.field3164.method3742((byte) 98, arg1);
        if (arg0 != 255) {
            field10146 = 92;
        }
        if (super.field3164.field9250) {
            int[] var4 = this.method1462(arg1 + -1 & class625.field8744, 0, arg0 ^ 255);
            int[] var5 = this.method1462(arg1, 0, 0);
            int[] var6 = this.method1462(class625.field8744 & arg1 + 1, 0, 0);
            for (int var7 = 0; ~var7 > ~class687.field9628; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field10141;
                int var9 = (var5[var7 - -1 & class28.field206] - var5[class28.field206 & var7 + -1]) * this.field10141;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var12 - -var13 + 4096) / 4096.0F)));
                int var15 = ~var14 != -1 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aca", name = "<init>", descriptor = "()V", line = 58)
    public class727() {
        super(1, true);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(Z)V", line = 64)
    public static final void method4075(boolean arg0) {
        class301.field4067.method983((byte) 30, 5);
        ++field10143;
        class130.field1685.method1522(5, 1);
        class135.field1723.method1552((byte) -63, 5);
        class707.field9894.method4111(5, (byte) 85);
        class51.field540.method4085(5, (byte) 123);
        class761.field10628.method4175(5, 1);
        class460.field6365.method1088(5, 3);
        class303.field4090.method3523((byte) -53, 5);
        class465.field6445.method1840((byte) 126, 5);
        class684.field9522.method787((byte) -120, 5);
        class137.field1743.method1344((byte) 30, 5);
        class224.field2894.method1646(5, false);
        class593.field8266.method1366(56, 5);
        class482.field6654.method299(5, false);
        class461.field6378.method2227(32, 5);
        class147.field1893.method2799((byte) -32, 5);
        class278.field3718.method825(5, (byte) -125);
        class537.field7293.method2679(119, 5);
        class360.field4768.method960(arg0, 5);
        class758.field10568.method3197(5, -112);
        class142.field1830.method2856(5, (byte) 126);
        class61.method469(5, 2974);
        class476.method2673(50, (byte) -50);
        class103.method705(50, (byte) 78);
        class266.method1596((byte) 110, 5);
        class364.method2081((byte) 118, 5);
        class539.field7308.method1569((byte) 62, 5);
        class302.field4084.method1569((byte) 62, 5);
        class375.field5217.method1569((byte) 62, 5);
        class317.field4276.method1569((byte) 62, 5);
        class498.field6790.method1569((byte) 62, 5);
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ILji;B)V", line = 102)
    public final void method1(int arg0, class611 arg1, byte arg2) {
        if (arg2 >= -92) {
            field10149 = null;
        }
        ++field10147;
        if (~arg0 == -1) {
            this.field10141 = arg1.method3402((byte) 127);
        }
    }

    @OriginalMember(owner = "client!aca", name = "a", descriptor = "(ZZ)V", line = 117)
    public static final void method4076(boolean arg0, boolean arg1) {
        ++field10145;
        if (class582.field8161 != null) {
            class582.field8161.method1439(-14);
            class582.field8161 = null;
        }
        class421.field5893 = 0;
        class586.method3266((byte) 97);
        class440.method2489();
        for (int var2 = 0; var2 < 4; ++var2) {
            class171.field2130[var2].method1788((byte) -99);
        }
        class104.method712(false, -7);
        System.gc();
        class123.method790(127, 2);
        class31.field270 = arg0;
        class555.field7831 = -1;
        class444.method2492((byte) 111);
        class755.method4200(true, 121);
        class99.field1313 = 0;
        class505.field6855 = 0;
        class539.field7309 = 0;
        class133.field1704 = 0;
        class361.field4790 = 0;
        class104.field1393 = 0;
        for (int var3 = 0; class475.field6572.length > var3; ++var3) {
            class475.field6572[var3] = null;
        }
        class519.method2860(30574);
        for (int var4 = 0; var4 < 2048; ++var4) {
            class361.field4793[var4] = null;
        }
        class84.field1169 = 0;
        class681.field9475.method2556(-96);
        class12.field79 = 0;
        class472.field6537.method2556(-126);
        class271.method1622(9268);
        class386.field5452 = 0;
        class386.field5455.method3556((byte) -103);
        class180.method1027(true);
        class554.method3146(5134);
        class162.field2035 = 0L;
        class271.field3586 = null;
        if (arg1) {
            class237.method1429(12, false);
        } else {
            class237.method1429(3, false);
            try {
                class679.method3851("loggedout", class144.field1868, -26978);
            } catch (Throwable var5) {
            }
        }
    }

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(II)V", line = 191)
    public static final void method4077(int arg0, int arg1) {
        if (~arg1 > -1 || ~arg1 < -3) {
            arg1 = 0;
        }
        if (arg0 > -41) {
            field10142 = null;
        }
        ++field10140;
        class658.field9179 = arg1;
        class147.field1892 = new class550[class182.field2229[class658.field9179] + 1];
        class743.field10335 = 0;
        class447.field6242 = 0;
    }

    @OriginalMember(owner = "client!aca", name = "b", descriptor = "(IIB)Z", line = 215)
    public static final boolean method4078(int arg0, int arg1, byte arg2) {
        ++field10144;
        if (arg2 != -23) {
            field10149 = null;
        }
        return ~(2048 & arg0) != -1 && ~(arg1 & 55) != -1;
    }

    @OriginalMember(owner = "client!aca", name = "c", descriptor = "(I)V", line = 226)
    public static void method4079(int arg0) {
        if (arg0 == -1) {
            field10142 = null;
            field10149 = null;
        }
    }
}
