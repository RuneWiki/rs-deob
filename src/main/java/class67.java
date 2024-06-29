import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class67 extends class219 {

    @OriginalMember(owner = "client!kk", name = "U", descriptor = "I")
    private int field1075 = 2048;

    @OriginalMember(owner = "client!kk", name = "P", descriptor = "I")
    private int field1071 = 0;

    @OriginalMember(owner = "client!kk", name = "Q", descriptor = "I")
    private int field1072 = 10;

    @OriginalMember(owner = "client!kk", name = "M", descriptor = "Z")
    public static boolean field1068 = false;

    @OriginalMember(owner = "client!kk", name = "V", descriptor = "Lbd;")
    public static class162 field1076 = class17.method142(0, "(U3");

    @OriginalMember(owner = "client!kk", name = "X", descriptor = "Lbd;")
    public static class162 field1078 = class17.method142(0, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!kk", name = "Z", descriptor = "Lbd;")
    public static class162 field1080 = class17.method142(0, "Suche nach Updates )2 ");

    @OriginalMember(owner = "client!kk", name = "bb", descriptor = "Lbd;")
    private static class162 field1082 = class17.method142(0, " has logged out)3");

    @OriginalMember(owner = "client!kk", name = "eb", descriptor = "Lbd;")
    public static class162 field1085 = field1082;

    @OriginalMember(owner = "client!kk", name = "J", descriptor = "I")
    public static int field1066;

    @OriginalMember(owner = "client!kk", name = "K", descriptor = "I")
    public static int field1067;

    @OriginalMember(owner = "client!kk", name = "N", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!kk", name = "S", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!kk", name = "T", descriptor = "I")
    public static int field1074;

    @OriginalMember(owner = "client!kk", name = "Y", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!kk", name = "cb", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!kk", name = "db", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!kk", name = "fb", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!kk", name = "gb", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!kk", name = "hb", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!kk", name = "ab", descriptor = "Lda;")
    public static class143 field1081;

    @OriginalMember(owner = "client!kk", name = "O", descriptor = "[I")
    private int[] field1070;

    @OriginalMember(owner = "client!kk", name = "W", descriptor = "[I")
    private int[] field1077;

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "()V", line = 13)
    public class67() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZI)[I", line = 19)
    public final int[] method41(boolean arg0, int arg1) {
        field1079++;
        int[] var3 = this.field3654.method2032(3, arg1);
        if (!arg0) {
            field1080 = (class162) null;
        }
        if (this.field3654.field4967) {
            int var4 = class53.field842[arg1];
            if (this.field1071 == 0) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field1072; var6++) {
                    if (this.field1070[var6] <= var4 && var4 < this.field1070[var6 + 1]) {
                        if (this.field1077[var6] > var4) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class161.method1230(var3, 0, class128.field2326, var5);
            } else {
                for (int var7 = 0; var7 < class128.field2326; var7++) {
                    int var8 = 0;
                    int var9 = class280.field4762[var7];
                    int var10 = this.field1071;
                    if (var10 == 1) {
                        var8 = var9;
                    } else if (var10 == 2) {
                        var8 = (var4 + var9 - 4096 >> 1) + 2048;
                    } else if (var10 == 3) {
                        var8 = (var9 - var4 >> 1) + 2048;
                    }
                    short var11 = 0;
                    for (int var12 = 0; var12 < this.field1072; var12++) {
                        if (var8 >= this.field1070[var12] && var8 < this.field1070[var12 + 1]) {
                            if (var8 < this.field1077[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var11;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "(B)V", line = 134)
    public static final void method475(byte arg0) {
        field1087++;
        class153.field2717.method1529(false);
        class17.field281.method1529(false);
        if (arg0 >= -66) {
            field1068 = true;
        }
        class223.field3718.method1529(false);
    }

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "(B)V", line = 150)
    public static final void method476(byte arg0) {
        field1073++;
        int var1 = 98 % ((arg0 + 31) / 48);
        for (int var2 = 0; var2 < class31.field520; var2++) {
            int var3 = class278.field4674[var2];
            class60 var4 = class204.field3446[var3];
            if (var4 != null) {
                class73.method529(var4, -117, var4.field926.field1485);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(B)V", line = 177)
    public final void method39(byte arg0) {
        this.method483(0);
        field1074++;
        if (arg0 != 22) {
            method480(-35, 37);
        }
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(III)Lf;", line = 191)
    public static final class184 method477(int arg0, int arg1, int arg2) {
        class225 var3 = class288.field4856[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class184 var4 = var3.field3755;
            var3.field3755 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIIII)V", line = 202)
    public static final void method478(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1066++;
        if (arg1 > arg4) {
            for (int var5 = arg4; var5 < arg1; var5++) {
                class184.field3180[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg1; var6 < arg4; var6++) {
                class184.field3180[var6][arg0] = arg2;
            }
        }
        if (arg3 != 29436) {
            method479((byte) -19);
        }
    }

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "(B)V", line = 243)
    public static final void method479(byte arg0) {
        class80.field1388.method1533(true);
        field1067++;
        if (arg0 != -66) {
            field1082 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)V", line = 254)
    public static final void method480(int arg0, int arg1) {
        field1086++;
        if (arg0 == arg1) {
            return;
        }
        if (arg1 == 1) {
            class91.method688((byte) -48);
        } else if (arg1 == 2) {
            class95.method770(0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 279)
    public static void method481(int arg0) {
        field1080 = null;
        field1081 = null;
        field1078 = null;
        field1085 = null;
        field1082 = null;
        if (arg0 < 62) {
            field1076 = (class162) null;
        }
        field1076 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IJ)Lbd;", line = 303)
    public static final class162 method482(int arg0, long arg1) {
        field1084++;
        return arg0 >= -45 ? (class162) null : class201.method1503(10, arg1, false, 65);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILb;)V", line = 314)
    public final void method42(int arg0, int arg1, class94 arg2) {
        field1088++;
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            this.field1072 = arg2.method756(arg1 ^ 0x36979D60);
        } else if (arg0 == 1) {
            this.field1075 = arg2.method761((byte) 108);
        } else if (arg0 == 2) {
            this.field1071 = arg2.method756(arg1 + 915905888);
        }
    }

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "(I)V", line = 361)
    private final void method483(int arg0) {
        int var2 = 4096 / this.field1072;
        int var3 = arg0;
        field1069++;
        this.field1077 = new int[this.field1072 + 1];
        int var4 = this.field1075 * var2 >> 12;
        this.field1070 = new int[this.field1072 + 1];
        for (int var5 = 0; var5 < this.field1072; var5++) {
            this.field1070[var5] = var3;
            this.field1077[var5] = var3 + var4;
            var3 += var2;
        }
        this.field1070[this.field1072] = 4096;
        this.field1077[this.field1072] = this.field1077[0] + 4096;
    }
}
