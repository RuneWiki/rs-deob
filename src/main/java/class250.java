import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class250 extends class16 {

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    private int field3973 = 4;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    private int field3971 = 4;

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "I")
    public static int field3968 = 0;

    @OriginalMember(owner = "client!ne", name = "Y", descriptor = "I")
    public static int field3976 = -2;

    @OriginalMember(owner = "client!ne", name = "bb", descriptor = "[I")
    public static int[] field3979 = new int[14];

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "[J")
    public static long[] field3974 = new long[1000];

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "[Lle;")
    public static class259[] field3969 = new class259[4];

    @OriginalMember(owner = "client!ne", name = "ab", descriptor = "Lbk;")
    public static class69 field3978 = new class69();

    @OriginalMember(owner = "client!ne", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field3983 = "Please remove ";

    @OriginalMember(owner = "client!ne", name = "eb", descriptor = "S")
    public static short field3982 = 205;

    @OriginalMember(owner = "client!ne", name = "cb", descriptor = "F")
    public static float field3980;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field3970;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!ne", name = "Z", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ne", name = "db", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!ne", name = "gb", descriptor = "Lrg;")
    public static class104 field3984;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 5)
    public class250() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLim;I)V", line = 17)
    public final void method52(byte arg0, class192 arg1, int arg2) {
        if (arg0 != -7) {
            return;
        }
        field3975++;
        if (arg2 == 0) {
            this.field3971 = arg1.method1399(-1172389784);
        } else if (arg2 == 1) {
            this.field3973 = arg1.method1399(arg0 - 1172389777);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ICB)I", line = 68)
    public static final int method1767(int arg0, char arg1, byte arg2) {
        int var3 = arg1 << 4;
        if (Character.isUpperCase(arg1) || Character.isTitleCase(arg1)) {
            arg1 = Character.toLowerCase(arg1);
            var3 = (arg1 << 4) + 1;
        }
        if (arg2 != -123) {
            method1767(-4, 'w', (byte) 7);
        }
        if (arg1 == 'ñ' && arg0 == 0) {
            var3 = 1762;
        }
        field3972++;
        return var3;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)[[I", line = 93)
    public final int[][] method54(int arg0, byte arg1) {
        int var3 = -76 % ((arg1 - 40) / 41);
        int[][] var4 = this.field197.method715(true, arg0);
        field3970++;
        if (this.field197.field1548) {
            int var5 = class276.field4376 / this.field3971;
            int var6 = class294.field4619 / this.field3973;
            int[][] var8;
            if (var6 > 0) {
                int var7 = arg0 % var6;
                var8 = this.method111(0, (byte) 122, class294.field4619 * var7 / var6);
            } else {
                var8 = this.method111(0, (byte) 122, 0);
            }
            int[] var9 = var8[0];
            int[] var10 = var8[1];
            int[] var11 = var4[0];
            int[] var12 = var4[1];
            int[] var13 = var8[2];
            int[] var14 = var4[2];
            for (int var15 = 0; var15 < class276.field4376; var15++) {
                int var16;
                if (var5 <= 0) {
                    var16 = 0;
                } else {
                    int var17 = var15 % var5;
                    var16 = class276.field4376 * var17 / var5;
                }
                var11[var15] = var9[var16];
                var12[var15] = var10[var16];
                var14[var15] = var13[var16];
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)V", line = 158)
    public static void method1768(byte arg0) {
        field3969 = null;
        field3983 = null;
        field3978 = null;
        field3984 = null;
        field3979 = null;
        field3974 = null;
        if (arg0 != -13) {
            field3979 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(ZI)[I", line = 179)
    public final int[] method8(boolean arg0, int arg1) {
        if (!arg0) {
            field3978 = (class69) null;
        }
        field3977++;
        int[] var3 = this.field207.method1784(arg1, (byte) 102);
        if (this.field207.field4024) {
            int var4 = class276.field4376 / this.field3971;
            int var5 = class294.field4619 / this.field3973;
            int[] var6;
            if (var5 <= 0) {
                var6 = this.method103(0, 4389, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method103(0, 4389, class294.field4619 * var7 / var5);
            }
            for (int var8 = 0; var8 < class276.field4376; var8++) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class276.field4376 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }
}
