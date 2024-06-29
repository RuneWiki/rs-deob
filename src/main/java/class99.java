import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class99 extends class51 {

    @OriginalMember(owner = "client!kh", name = "gb", descriptor = "Led;")
    private static class43 field1908 = class191.method1219(" from your ignore list first)3", false);

    @OriginalMember(owner = "client!kh", name = "db", descriptor = "I")
    public static int field1905 = 0;

    @OriginalMember(owner = "client!kh", name = "bb", descriptor = "Led;")
    public static class43 field1903 = field1908;

    @OriginalMember(owner = "client!kh", name = "cb", descriptor = "I")
    public static int field1904 = 0;

    @OriginalMember(owner = "client!kh", name = "Z", descriptor = "I")
    public static int field1901 = 0;

    @OriginalMember(owner = "client!kh", name = "ab", descriptor = "I")
    public static int field1902;

    @OriginalMember(owner = "client!kh", name = "eb", descriptor = "I")
    public static int field1906;

    @OriginalMember(owner = "client!kh", name = "fb", descriptor = "I")
    public static int field1907;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BILob;)Led;")
    public static final class43 method616(byte arg0, int arg1, class129 arg2) {
        ++field1902;
        if (!class145.method919(class193.method1231((byte) -42, arg2), arg1, false) && arg2.field2700 == null) {
            return null;
        } else {
            if (arg0 != 85) {
                field1901 = 57;
            }
            if (arg2.field2645 != null && ~arg1 > ~arg2.field2645.length && arg2.field2645[arg1] != null && arg2.field2645[arg1].method247((byte) -115).method248((byte) 60) != 0) {
                return arg2.field2645[arg1];
            } else {
                return class121.field2415 ? class167.method1036(new class43[] { class32.field584, class30.method161(arg1, 10) }, true) : null;
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)[I")
    public final int[] method27(int arg0, int arg1) {
        int[] var3 = super.field1025.method39(arg1, (byte) 39);
        if (arg0 != 16) {
            method617(-115);
        }
        ++field1906;
        if (super.field1025.field154) {
            int[][] var4 = this.method306(0, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class122.field2442 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] + var7[var8]) / 3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
    public class99() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)V")
    public static final void method617(int arg0) {
        class171.field3429 = new int[33];
        class83.field1628 = new int[33];
        if (arg0 >= -5) {
            method618(-57);
        }
        ++field1907;
        class188.field3685 = new int[151];
        class90.field1801 = new int[151];
        for (int var1 = 0; ~var1 > -34; ++var1) {
            int var6 = 0;
            int var7 = 999;
            for (int var8 = 0; var8 < 34; ++var8) {
                if (~class142.field2931.field3577[class142.field2931.field3574 * var1 + var8] != -1) {
                    if (var7 != 999) {
                        var6 = var8;
                        break;
                    }
                } else if (var7 == 999) {
                    var7 = var8;
                }
            }
            class83.field1628[var1] = var7;
            class171.field3429[var1] = -var7 + var6;
        }
        for (int var2 = 5; ~var2 > -157; ++var2) {
            int var3 = 999;
            int var4 = 0;
            for (int var5 = 25; ~var5 > -173; ++var5) {
                if (class142.field2931.field3577[var5 - -(class142.field2931.field3574 * var2)] != 0 || var5 <= 34 && ~var2 >= -35) {
                    if (~var3 != -1000) {
                        var4 = var5;
                        break;
                    }
                } else if (var3 == 999) {
                    var3 = var5;
                }
            }
            class188.field3685[var2 + -5] = var3 + -25;
            class90.field1801[var2 + -5] = var4 - var3;
        }
    }

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "(I)V")
    public static void method618(int arg0) {
        field1903 = null;
        field1908 = null;
        if (arg0 != -173) {
            method616((byte) 117, -97, (class129) null);
        }
    }
}
