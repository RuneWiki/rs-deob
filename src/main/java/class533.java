import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class533 extends class466 {

    @OriginalMember(owner = "client!sk", name = "J", descriptor = "Ldv;")
    public static class566 field7457 = new class566(3, 3);

    @OriginalMember(owner = "client!sk", name = "P", descriptor = "[C")
    private static char[] field7462 = new char[64];

    @OriginalMember(owner = "client!sk", name = "Q", descriptor = "Lcba;")
    public static class471 field7463;

    @OriginalMember(owner = "client!sk", name = "E", descriptor = "I")
    public static int field7453;

    @OriginalMember(owner = "client!sk", name = "F", descriptor = "I")
    public static int field7454;

    @OriginalMember(owner = "client!sk", name = "I", descriptor = "I")
    public static int field7456;

    @OriginalMember(owner = "client!sk", name = "L", descriptor = "I")
    public static int field7458;

    @OriginalMember(owner = "client!sk", name = "M", descriptor = "I")
    public static int field7459;

    @OriginalMember(owner = "client!sk", name = "O", descriptor = "I")
    public static int field7461;

    @OriginalMember(owner = "client!sk", name = "N", descriptor = "Lan;")
    public static class21 field7460;

    @OriginalMember(owner = "client!sk", name = "H", descriptor = "Lqt;")
    public static class546 field7455;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        if (arg1 == -5062) {
            if (arg2 == 0) {
                super.field6565 = ~arg0.method110((byte) 91) == -2;
            }
            ++field7456;
        }
    }

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "(III)V")
    private final void method3062(int arg0, int arg1, int arg2) {
        ++field7461;
        int var4 = class431.field6129[arg2];
        int var5 = class63.field1085[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class590.field8424 = arg2;
            class328.field4398 = arg0;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class590.field8424 = arg0;
            class328.field4398 = arg2;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class328.field4398 = arg2;
            class590.field8424 = class312.field4207 - arg0;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class590.field8424 = arg2;
            class328.field4398 = class564.field7814 - arg0;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class590.field8424 = class312.field4207 - arg2;
            class328.field4398 = -arg0 + class564.field7814;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class590.field8424 = class312.field4207 - arg0;
            class328.field4398 = -arg2 + class564.field7814;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class328.field4398 = -arg2 + class564.field7814;
            class590.field8424 = arg0;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class328.field4398 = arg0;
            class590.field8424 = -arg2 + class312.field4207;
        }
        class328.field4398 &= class105.field1581;
        if (arg1 != 52) {
            this.method2(-26, 83);
        }
        class590.field8424 &= class340.field4582;
    }

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "(I)V")
    public static void method3063(int arg0) {
        field7462 = null;
        if (arg0 != 63) {
            method3063(81);
        }
        field7455 = null;
        field7463 = null;
        field7460 = null;
        field7457 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method33(int arg0, boolean arg1) {
        ++field7454;
        int[][] var3 = super.field6569.method828((byte) 127, arg0);
        if (arg1) {
            field7457 = null;
        }
        if (super.field6569.field1934) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; ~class312.field4207 < ~var7; ++var7) {
                this.method3062(arg0, 52, var7);
                int[][] var8 = this.method2719(0, class328.field4398, 5);
                var4[var7] = var8[0][class590.field8424];
                var5[var7] = var8[1][class590.field8424];
                var6[var7] = var8[2][class590.field8424];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "()V")
    public class533() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field7453;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            field7457 = null;
        }
        if (super.field6557.field1163) {
            for (int var4 = 0; ~var4 > ~class312.field4207; ++var4) {
                this.method3062(arg0, 52, var4);
                int[] var5 = this.method2721(0, class328.field4398, arg1 ^ 2);
                var3[var4] = var5[class590.field8424];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IILdaa;)V")
    public static final void method3064(int arg0, int arg1, class11 arg2) {
        if (class69.field1168 != null) {
            try {
                class69.field1168.method2005(0, 0L);
                class69.field1168.method2007(false, arg2.field138, 24, arg1);
            } catch (Exception var4) {
            }
        }
        ++field7459;
        int var3 = -83 % ((arg0 - 10) / 51);
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V")
    public static final void method3065(byte arg0) {
        class100.method712(-114, class69.field1165, (long) class405.field5763);
        ++field7458;
        int var1 = -20 % ((67 - arg0) / 51);
        if (~class56.field1005 != 0) {
            class112.method779(class56.field1005, true);
        }
        for (int var2 = 0; ~class628.field9187 < ~var2; ++var2) {
            if (class48.field940[var2]) {
                class18.field226[var2] = true;
            }
            class201.field2818[var2] = class48.field940[var2];
            class48.field940[var2] = false;
        }
        class233.field3287 = class405.field5763;
        if (class69.field1165.method1340()) {
            class374.field5039 = true;
        }
        if (~class56.field1005 != 0) {
            class628.field9187 = 0;
            class192.method1191((byte) 97);
        }
        class69.field1165.method1269();
        class525.method3027(false, class69.field1165);
        int var3 = class64.method544((byte) -116);
        if (~var3 == 0) {
            var3 = class575.field7926;
        }
        if (~var3 == 0) {
            var3 = class644.field9360;
        }
        class464.method2715((byte) 100, var3);
        class64.field1097 = 0;
    }

    static {
        for (int var0 = 0; ~var0 > -27; ++var0) {
            field7462[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; ~var1 > -53; ++var1) {
            field7462[var1] = (char) (var1 + 97 + -26);
        }
        for (int var2 = 52; ~var2 > -63; ++var2) {
            field7462[var2] = (char) (var2 + 48 + -52);
        }
        field7462[62] = '+';
        field7462[63] = '/';
        field7463 = new class471(3, -1);
    }
}
