import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class46 extends class283 {

    @OriginalMember(owner = "client!fm", name = "W", descriptor = "Lna;")
    public static class26 field725 = class69.method505(")2", (byte) -125);

    @OriginalMember(owner = "client!fm", name = "T", descriptor = "Lna;")
    public static class26 field722 = class69.method505(" ", (byte) -123);

    @OriginalMember(owner = "client!fm", name = "S", descriptor = "Ln;")
    public static class282 field721 = new class282(4);

    @OriginalMember(owner = "client!fm", name = "db", descriptor = "Lgn;")
    public static class5 field732 = new class5(64);

    @OriginalMember(owner = "client!fm", name = "gb", descriptor = "Lna;")
    public static class26 field735 = class69.method505("overlay2", (byte) -128);

    @OriginalMember(owner = "client!fm", name = "fb", descriptor = "[I")
    public static int[] field734 = new int[14];

    @OriginalMember(owner = "client!fm", name = "eb", descriptor = "Lna;")
    public static class26 field733 = class69.method505("b12_full", (byte) -128);

    @OriginalMember(owner = "client!fm", name = "P", descriptor = "I")
    private int field718;

    @OriginalMember(owner = "client!fm", name = "Q", descriptor = "I")
    public static int field719;

    @OriginalMember(owner = "client!fm", name = "R", descriptor = "I")
    public static int field720;

    @OriginalMember(owner = "client!fm", name = "U", descriptor = "I")
    public static int field723;

    @OriginalMember(owner = "client!fm", name = "V", descriptor = "I")
    public static int field724;

    @OriginalMember(owner = "client!fm", name = "X", descriptor = "I")
    private int field726;

    @OriginalMember(owner = "client!fm", name = "Y", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!fm", name = "Z", descriptor = "I")
    private int field728;

    @OriginalMember(owner = "client!fm", name = "ab", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!fm", name = "bb", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!fm", name = "cb", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(I)V", line = 4)
    private class46(int arg0) {
        super(0, false);
        this.method349((byte) 75, arg0);
    }

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "(I)V", line = 13)
    public static void method348(int arg0) {
        field733 = null;
        field725 = null;
        field735 = null;
        field721 = null;
        field734 = null;
        field722 = null;
        if (arg0 != 1) {
            field733 = (class26) null;
        }
        field732 = null;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "()V", line = 29)
    public class46() {
        this(0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)V", line = 34)
    private final void method349(byte arg0, int arg1) {
        this.field726 = arg1 >> 4 & 0xFF0;
        this.field728 = arg1 & 0xFF << 4;
        if (arg0 == 75) {
            this.field718 = (arg1 & 0xFF0000) >> 12;
            field719++;
        }
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)[[I", line = 52)
    public final int[][] method3(int arg0, int arg1) {
        field720++;
        if (arg0 != -1) {
            method353(-87, 26, 75, -56, 22, -68);
        }
        int[][] var3 = this.field4719.method2182((byte) -123, arg1);
        if (this.field4719.field5381) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class101.field1632; var7++) {
                var4[var7] = this.field718;
                var5[var7] = this.field726;
                var6[var7] = this.field728;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)V", line = 103)
    public static final void method350(boolean arg0, int arg1) {
        if (arg0) {
            if (class250.field4095 != -1) {
                class177.method1224((byte) -128, class250.field4095);
            }
            for (class174 var2 = (class174) class74.field1132.method1823(arg1 - 2908); var2 != null; var2 = (class174) class74.field1132.method1825(-122)) {
                class113.method786(true, var2, false);
            }
            class250.field4095 = -1;
            class74.field1132 = new class259(8);
            class116.method808(arg1 - 2918);
            class250.field4095 = class47.field770;
            class220.method1480(false, (byte) -36);
            class5.method29(false);
            class31.method248(class250.field4095, arg1 ^ 0xB90);
        }
        field723++;
        class132.field2013 = -1;
        class72.method513(class154.field2401, 20827);
        class13.field221 = new class159();
        class13.field221.field3972 = 3000;
        class13.field221.field3962 = arg1;
        if (!class255.field4184) {
            class124.method848(-110, class319.field5464);
            class193.method1302(10, 5);
            return;
        }
        if (class37.field614 == 2) {
            class324.field5589 = class71.field1091 << 7;
            class14.field231 = class189.field2972 << 7;
        } else {
            class120.method824(arg1 ^ 0xF447);
        }
        class292.method2053((byte) 64);
        class98.method728(arg1 + 17479);
        class193.method1302(28, 5);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZII)V", line = 174)
    public static final void method351(boolean arg0, int arg1, int arg2) {
        class191.field2994 = class79.field1248[arg2][arg1].field3482;
        class268.field4434 = class79.field1248[arg2][arg1].field3478;
        if (!arg0) {
            field734 = (int[]) null;
        }
        class218.field3491 = class79.field1248[arg2][arg1].field3475;
        class289.method2034((float) class191.field2994, (float) class268.field4434, (float) class218.field3491);
        field731++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILna;Lna;Lna;I)V", line = 188)
    public static final void method352(int arg0, class26 arg1, class26 arg2, class26 arg3, int arg4) {
        class250.method1718(arg0, arg4, arg1, arg3, (byte) 50, arg2);
        field727++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILwa;Z)V", line = 205)
    public final void method1(int arg0, class82 arg1, boolean arg2) {
        if (!arg2) {
            method352(-64, (class26) null, (class26) null, (class26) null, 34);
        }
        if (arg0 == 0) {
            this.method349((byte) 75, arg1.method633((byte) 82));
        }
        field729++;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIIII)Z", line = 237)
    public static final boolean method353(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var9 = arg3; var9 <= arg4; var9++) {
                    if (class138.field2117[arg0][var8][var9] == -class118.field1863) {
                        return false;
                    }
                }
            }
            int var10 = (arg1 << 7) + 1;
            int var11 = (arg3 << 7) + 2;
            int var12 = class229.field3635[arg0][arg1][arg3] + arg5;
            if (!class144.method959(var10, var12, var11)) {
                return false;
            }
            int var13 = (arg2 << 7) - 1;
            if (!class144.method959(var13, var12, var11)) {
                return false;
            }
            int var14 = (arg4 << 7) - 1;
            if (!class144.method959(var10, var12, var14)) {
                return false;
            } else if (class144.method959(var13, var12, var14)) {
                return true;
            } else {
                return false;
            }
        } else if (class321.method2239(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class144.method959(var6 + 1, class229.field3635[arg0][arg1][arg3] + arg5, var7 + 1) && class144.method959(var6 + 128 - 1, class229.field3635[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class144.method959(var6 + 128 - 1, class229.field3635[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class144.method959(var6 + 1, class229.field3635[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }
}
