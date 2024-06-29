import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class171 {

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lqe;")
    public static class168 field2974 = class66.method448("blinken3:", -126);

    @OriginalMember(owner = "client!b", name = "a", descriptor = "Lqe;")
    public static class168 field2968 = class66.method448(")3", -120);

    @OriginalMember(owner = "client!b", name = "m", descriptor = "Lqe;")
    public static class168 field2980 = class66.method448("; Expires=", -128);

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!b", name = "c", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!b", name = "f", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public int field2976;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!b", name = "n", descriptor = "I")
    public int field2981;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "I")
    public static int field2982;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "Lqe;")
    public class168 field2971;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "Ljb;")
    public static class175 field2975;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "Z")
    public boolean field2972;

    @OriginalMember(owner = "client!b", name = "k", descriptor = "[[I")
    public static int[][] field2978;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)V")
    public static void method1132(byte arg0) {
        field2978 = null;
        field2968 = null;
        field2975 = null;
        field2974 = null;
        int var1 = -9 / ((arg0 - 75) / 38);
        field2980 = null;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Lqb;")
    public static final class194 method1133(int arg0, byte arg1) {
        field2973++;
        int var2 = 126 / ((62 - arg1) / 45);
        class194 var3 = (class194) class168.field2863.method1499(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class94.field1477.method1712(class204.method1327(-121, arg0), class120.method819(-545939608, arg0), -1);
        class194 var5 = new class194();
        if (var4 != null) {
            var5.method1256(new class112(var4), -25335);
        }
        class168.field2863.method1502((byte) -18, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)V")
    public static final void method1134(int arg0) {
        if (class71.field1093 < 128) {
            class71.field1093 = 128;
        }
        field2982++;
        int var1 = class127.field2109 >> 7;
        class103.field1665 &= 0x7FF;
        if (arg0 <= 92) {
            return;
        }
        int var2 = class126.field2101 >> 7;
        int var3 = 0;
        if (class71.field1093 > 383) {
            class71.field1093 = 383;
        }
        int var4 = class236.method1535(class126.field2101, class196.field3401, class127.field2109, 0);
        if (var2 > 3 && var1 > 3 && var2 < 100 && var1 < 100) {
            for (int var5 = var2 - 4; var5 <= var2 + 4; var5++) {
                for (int var6 = var1 - 4; var6 <= var1 + 4; var6++) {
                    int var7 = class196.field3401;
                    if (var7 < 3 && (class205.field3561[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = var4 - class23.field275[var7][var5][var6];
                    if (var8 > var3) {
                        var3 = var8;
                    }
                }
            }
        }
        int var9 = var3 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (class211.field3656 < var9) {
            class211.field3656 += (var9 - class211.field3656) / 24;
        } else if (var9 < class211.field3656) {
            class211.field3656 += (var9 - class211.field3656) / 80;
            return;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(ZLoe;Lsb;Loe;)V")
    public static final void method1135(boolean arg0, class256 arg1, class12 arg2, class256 arg3) {
        class91.field1411 = arg2;
        field2969++;
        class114.field1867 = arg1;
        if (arg0) {
            field2977 = 51;
        }
        class153.field2653 = arg3;
    }
}
