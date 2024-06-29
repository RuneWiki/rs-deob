import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class32 extends class196 {

    @OriginalMember(owner = "client!ie", name = "R", descriptor = "I")
    private int field460 = 4;

    @OriginalMember(owner = "client!ie", name = "cb", descriptor = "I")
    private int field471 = 4;

    @OriginalMember(owner = "client!ie", name = "S", descriptor = "Ldf;")
    private static class51 field461 = class46.method233("Location", 100);

    @OriginalMember(owner = "client!ie", name = "T", descriptor = "Ldf;")
    public static class51 field462 = field461;

    @OriginalMember(owner = "client!ie", name = "U", descriptor = "I")
    public static int field463 = 0;

    @OriginalMember(owner = "client!ie", name = "X", descriptor = "I")
    public static int field466 = 0;

    @OriginalMember(owner = "client!ie", name = "eb", descriptor = "[I")
    public static int[] field473 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ie", name = "Q", descriptor = "I")
    public static int field459;

    @OriginalMember(owner = "client!ie", name = "V", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!ie", name = "W", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!ie", name = "Y", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!ie", name = "Z", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!ie", name = "ab", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!ie", name = "bb", descriptor = "I")
    public static int field470;

    @OriginalMember(owner = "client!ie", name = "db", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "(II)[I")
    public final int[] method45(int arg0, int arg1) {
        ++field470;
        if (arg1 != 10565) {
            return null;
        } else {
            int[] var3 = super.field3274.method1476(true, arg0);
            if (super.field3274.field3741) {
                int var4 = class234.field4079 / this.field460;
                int var5 = class49.field767 / this.field471;
                int[] var6;
                if (~var4 >= -1) {
                    var6 = this.method1390(0, 0, -89);
                } else {
                    int var7 = arg0 % var4;
                    var6 = this.method1390(class234.field4079 * var7 / var4, 0, -99);
                }
                for (int var8 = 0; var8 < class49.field767; ++var8) {
                    if (var5 <= 0) {
                        var3[var8] = var6[0];
                    } else {
                        int var9 = var8 % var5;
                        var3[var8] = var6[class49.field767 * var9 / var5];
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ie", name = "<init>", descriptor = "()V")
    public class32() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "(I)V")
    public static void method161(int arg0) {
        if (arg0 < -48) {
            field462 = null;
            field461 = null;
            field473 = null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILwc;)Lwc;")
    public static final class213 method162(int arg0, class213 arg1) {
        ++field472;
        if (~arg1.field3689 != arg0) {
            return class198.method1392(arg0 ^ 11823, arg1.field3689);
        } else {
            int var2 = arg1.field3703 >>> 16;
            for (class42 var3 = (class42) class79.field1265.method1451(-64); var3 != null; var3 = (class42) class79.field1265.method1449(-1)) {
                if (var3.field668 == var2) {
                    return class198.method1392(11823, (int) var3.field1760);
                }
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(Ldf;Lu;B)Lgb;")
    public static final class139 method163(class51 arg0, class111 arg1, byte arg2) {
        if (arg2 != 102) {
            field466 = -1;
        }
        int var3 = arg1.method810(arg0, arg2 + -103);
        ++field465;
        if (~var3 == 0) {
            return new class139(0);
        } else {
            int[] var4 = arg1.method831(-126, var3);
            class139 var5 = new class139(var4.length);
            for (int var6 = 0; ~var6 > ~var5.field2337; ++var6) {
                class121 var7 = new class121(arg1.method828(var3, (byte) 94, var4[var6]));
                var5.field2342[var6] = var7.method903((byte) 108);
                var5.field2329[var6] = var7.method912((byte) -90);
                var5.field2341[var6] = (short) var7.method876(false);
                var5.field2338[var6] = (short) var7.method876(false);
                var5.field2328[var6] = var7.method865((byte) 8);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILlb;B)V")
    public final void method44(int arg0, class121 arg1, byte arg2) {
        ++field467;
        if (arg2 == 82) {
            if (~arg0 != -1) {
                if (arg0 == 1) {
                    this.field460 = arg1.method897(127);
                }
            } else {
                this.field471 = arg1.method897(arg2 + 42);
            }
        }
    }

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "(I)Ldf;")
    public static final class51 method164(int arg0) {
        if (arg0 != -3850) {
            method164(-73);
        }
        ++field469;
        class51 var1 = class115.field1960;
        if (class239.field4155 != 0) {
            var1 = class172.field2814;
        }
        return class20.method104(3, new class51[] { class215.field3738, var1, class243.field4211, class51.method311(class196.field3290, arg0 ^ -3844), class70.field1133, class51.method311(class5.field40, arg0 ^ -3844), class70.field1122 });
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(BI)[[I")
    public final int[][] method46(byte arg0, int arg1) {
        int[][] var3 = super.field3285.method1548(arg1, (byte) -53);
        if (super.field3285.field3963) {
            int var4 = class49.field767 / this.field471;
            int var5 = class234.field4079 / this.field460;
            int[][] var7;
            if (~var5 < -1) {
                int var6 = arg1 % var5;
                var7 = this.method1387(arg0 ^ 104, 0, class234.field4079 * var6 / var5);
            } else {
                var7 = this.method1387(37, 0, 0);
            }
            int[] var8 = var7[0];
            int[] var9 = var7[1];
            int[] var10 = var7[2];
            int[] var11 = var3[2];
            int[] var12 = var3[0];
            int[] var13 = var3[1];
            for (int var14 = 0; ~class49.field767 < ~var14; ++var14) {
                int var15;
                if (var4 <= 0) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class49.field767 * var16 / var4;
                }
                var12[var14] = var8[var15];
                var13[var14] = var9[var15];
                var11[var14] = var10[var15];
            }
        }
        if (arg0 != 11) {
            return null;
        } else {
            ++field468;
            return var3;
        }
    }
}
