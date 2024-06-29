import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class206 extends class34 {

    @OriginalMember(owner = "client!fb", name = "W", descriptor = "Ljava/lang/String;")
    public static String field3088 = "flash3:";

    @OriginalMember(owner = "client!fb", name = "T", descriptor = "Lca;")
    public static class54 field3085 = new class54(new byte[5000]);

    @OriginalMember(owner = "client!fb", name = "Y", descriptor = "I")
    public static int field3090 = 0;

    @OriginalMember(owner = "client!fb", name = "Z", descriptor = "I")
    public static int field3091 = 0;

    @OriginalMember(owner = "client!fb", name = "P", descriptor = "I")
    public static int field3081;

    @OriginalMember(owner = "client!fb", name = "Q", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!fb", name = "R", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!fb", name = "S", descriptor = "I")
    public static int field3084;

    @OriginalMember(owner = "client!fb", name = "V", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!fb", name = "X", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!fb", name = "ab", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!fb", name = "U", descriptor = "[[S")
    public static short[][] field3086;

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "()V")
    public class206() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(IBI)V")
    private final void method1361(int arg0, byte arg1, int arg2) {
        ++field3081;
        int var4 = class199.field2985[arg2];
        int var5 = class112.field1716[arg0];
        float var6 = (float) Math.atan2((double) (var5 + -2048), (double) (var4 - 2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class20.field341 = arg0;
            class244.field3789 = arg2;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class244.field3789 = arg0;
            class20.field341 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class20.field341 = class226.field3527 - arg2;
            class244.field3789 = arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class244.field3789 = -arg2 + class259.field3965;
            class20.field341 = arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class244.field3789 = -arg2 + class259.field3965;
            class20.field341 = -arg0 + class226.field3527;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class20.field341 = class226.field3527 - arg2;
            class244.field3789 = -arg0 + class259.field3965;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class244.field3789 = class259.field3965 - arg0;
            class20.field341 = arg2;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class20.field341 = -arg0 + class226.field3527;
            class244.field3789 = arg2;
        }
        class244.field3789 &= class201.field3014;
        if (arg1 >= -98) {
            this.method43(64, -53);
        }
        class20.field341 &= class167.field2457;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method52(byte arg0, int arg1) {
        ++field3087;
        int[][] var3 = super.field618.method91(-125, arg1);
        int var4 = 33 / ((arg0 - -54) / 44);
        if (super.field618.field211) {
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; ~class226.field3527 < ~var8; ++var8) {
                this.method1361(var8, (byte) -115, arg1);
                int[][] var9 = this.method231(class244.field3789, (byte) 116, 0);
                var5[var8] = var9[0][class20.field341];
                var7[var8] = var9[1][class20.field341];
                var6[var8] = var9[2][class20.field341];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILca;)V")
    public final void method50(int arg0, int arg1, class54 arg2) {
        if (arg1 == 0) {
            super.field604 = ~arg2.method407(255) == -2;
        }
        ++field3083;
        if (arg0 != 6) {
            method1362((byte) -123, true);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(BZ)V")
    public static final void method1362(byte arg0, boolean arg1) {
        ++field3084;
        if (arg0 < -90) {
            class14.field207 = arg1;
            class150.field2187 = !class101.method741(-6425);
        }
    }

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "(B)V")
    public static void method1363(byte arg0) {
        field3088 = null;
        field3085 = null;
        if (arg0 > -31) {
            field3085 = null;
        }
        field3086 = null;
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field3082;
        int[] var3 = super.field610.method228(24856, arg1);
        if (arg0 < 75) {
            field3091 = 115;
        }
        if (super.field610.field597) {
            for (int var4 = 0; ~var4 > ~class226.field3527; ++var4) {
                this.method1361(var4, (byte) -120, arg1);
                int[] var5 = this.method230(class244.field3789, -15337, 0);
                var3[var4] = var5[class20.field341];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
    public static final void method1364(byte arg0) {
        class81.field1261.method944(65535);
        int var1 = -60 / ((arg0 - -62) / 32);
        class15.field219.method944(65535);
        ++field3089;
    }
}
