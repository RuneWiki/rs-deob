import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class116 {

    @OriginalMember(owner = "client!so", name = "k", descriptor = "I")
    private int field1986 = -1;

    @OriginalMember(owner = "client!so", name = "l", descriptor = "I")
    private int field1987 = 0;

    @OriginalMember(owner = "client!so", name = "f", descriptor = "Low;")
    private class665 field1981 = new class665();

    @OriginalMember(owner = "client!so", name = "r", descriptor = "Z")
    public boolean field1993 = false;

    @OriginalMember(owner = "client!so", name = "b", descriptor = "I")
    private int field1977;

    @OriginalMember(owner = "client!so", name = "c", descriptor = "I")
    private int field1978;

    @OriginalMember(owner = "client!so", name = "m", descriptor = "[[I")
    private int[][] field1988;

    @OriginalMember(owner = "client!so", name = "j", descriptor = "[Ltl;")
    private class141[] field1985;

    @OriginalMember(owner = "client!so", name = "g", descriptor = "Lhl;")
    public static class353 field1982 = new class353(1, 2);

    @OriginalMember(owner = "client!so", name = "q", descriptor = "S")
    public static short field1992 = 1;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "I")
    public static int field1976;

    @OriginalMember(owner = "client!so", name = "d", descriptor = "I")
    public static int field1979;

    @OriginalMember(owner = "client!so", name = "e", descriptor = "I")
    public static int field1980;

    @OriginalMember(owner = "client!so", name = "h", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!so", name = "i", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!so", name = "n", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!so", name = "o", descriptor = "I")
    public static int field1990;

    @OriginalMember(owner = "client!so", name = "p", descriptor = "[I")
    public static int[] field1991;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(B)[[I")
    public final int[][] method1024(byte arg0) {
        field1984++;
        if (this.field1978 != this.field1977) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        if (arg0 < 107) {
            return null;
        }
        while (this.field1978 > var2) {
            this.field1985[var2] = class626.field8885;
            var2++;
        }
        return this.field1988;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(I)V")
    public static final void method1025(int arg0) {
        class613.field8701.method162(5, (byte) -125);
        field1979++;
        class452.field6197.method3206((byte) 83, 5);
        class38.field451.method2912(-32227, 5);
        class312.field4418.method364(5, arg0 ^ 0x5FBF);
        class677.field9511.method3697(5, (byte) 89);
        class422.field5873.method2943(4854, 5);
        class168.field2552.method3286(5, (byte) 36);
        class620.field8760.method1829(true, 5);
        class600.field8552.method3551(5, 0);
        class4.field60.method3714(5, -31353);
        class662.field9323.method1707(5, (byte) -94);
        class150.field2404.method1772(5, -9480);
        class451.field6195.method4108((byte) 107, 5);
        class309.field4401.method650(5, 34);
        class498.field6854.method3435(5, arg0 ^ 0x57);
        class523.field7326.method2674(5, (byte) -97);
        class648.field9192.method2361(5, 29);
        class606.field8616.method1220(5, 69);
        class402.field5547.method1474(5, true);
        class422.field5876.method3122(2, 5);
        class233.field3382.method3418(5, arg0 ^ 0x4);
        class153.field2446.method2734(2869, 5);
        class290.method1827(arg0 ^ 0x39, 5);
        class88.method775(50, 32127);
        class766.method4236((byte) 111, 50);
        class667.method3736(5, (byte) -82);
        class758.method4192(-128, 5);
        class5.field69.method2888(5, 123);
        class126.field2150.method2888(5, 123);
        class267.field3772.method2888(5, arg0 + 119);
        class356.field5053.method2888(5, 120);
        class46.field621.method2888(arg0, 120);
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(I)V")
    public static void method1026(int arg0) {
        field1982 = null;
        field1991 = null;
        if (arg0 != 5) {
            field1982 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(BI)[I")
    public final int[] method1027(byte arg0, int arg1) {
        field1976++;
        if (arg0 >= -66) {
            this.field1985 = null;
        }
        if (this.field1978 == this.field1977) {
            this.field1993 = this.field1985[arg1] == null;
            this.field1985[arg1] = class626.field8885;
            return this.field1988[arg1];
        } else if (this.field1978 == 1) {
            this.field1993 = this.field1986 != arg1;
            this.field1986 = arg1;
            return this.field1988[0];
        } else {
            class141 var3 = this.field1985[arg1];
            if (var3 == null) {
                this.field1993 = true;
                if (this.field1978 > this.field1987) {
                    var3 = new class141(arg1, this.field1987);
                    this.field1987++;
                } else {
                    class141 var4 = (class141) this.field1981.method3724((byte) -60);
                    var3 = new class141(arg1, var4.field2310);
                    this.field1985[var4.field2307] = null;
                    var4.method4237(-1);
                }
                this.field1985[arg1] = var3;
            } else {
                this.field1993 = false;
            }
            this.field1981.method3725(var3, (byte) -101);
            return this.field1988[var3.field2310];
        }
    }

    @OriginalMember(owner = "client!so", name = "b", descriptor = "(B)V")
    public final void method1028(byte arg0) {
        for (int var2 = 0; var2 < this.field1978; var2++) {
            this.field1988[var2] = null;
        }
        field1990++;
        this.field1985 = null;
        if (arg0 >= 11) {
            this.field1988 = null;
            this.field1981.method3735(-4676);
            this.field1981 = null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(ZLjava/lang/String;B)V")
    public static final void method1029(boolean arg0, String arg1, byte arg2) {
        field1983++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        if (arg2 != 93) {
            field1991 = null;
        }
        int var6 = arg0 ? 32768 : 0;
        int var7 = var6 + (arg0 ? class502.field6884.field5551 : class502.field6884.field5539);
        for (int var8 = var6; var8 < var7; var8++) {
            class118 var11 = class502.field6884.method2392(var8, 32767);
            if (var11.field2008 && var11.method1036(arg2 - 94).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class217.field3162 = -1;
                    class781.field10703 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class781.field10703 = var4;
        class144.field2334 = 0;
        class217.field3162 = var5;
        String[] var9 = new String[class217.field3162];
        for (int var10 = 0; var10 < class217.field3162; var10++) {
            var9[var10] = class502.field6884.method2392(var4[var10], 32767).method1036(-1);
        }
        class636.method3623(arg2 - 94, var9, class781.field10703);
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(III)V")
    public class116(int arg0, int arg1, int arg2) {
        this.field1977 = arg1;
        this.field1978 = arg0;
        this.field1988 = new int[this.field1978][arg2];
        this.field1985 = new class141[this.field1977];
    }
}
