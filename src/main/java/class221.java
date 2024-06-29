import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class221 extends class253 {

    @OriginalMember(owner = "client!ra", name = "y", descriptor = "Lve;")
    public static class184 field3875 = new class184(5);

    @OriginalMember(owner = "client!ra", name = "D", descriptor = "I")
    public static int field3879 = 0;

    @OriginalMember(owner = "client!ra", name = "I", descriptor = "[I")
    public static int[] field3883 = new int[64];

    @OriginalMember(owner = "client!ra", name = "B", descriptor = "Ljd;")
    public static class85 field3878 = method1499("welle2:", (byte) 114);

    @OriginalMember(owner = "client!ra", name = "G", descriptor = "[[I")
    public static int[][] field3881 = new int[5][5000];

    @OriginalMember(owner = "client!ra", name = "K", descriptor = "Ljd;")
    public static class85 field3885 = method1499(":duelfriend:", (byte) -56);

    @OriginalMember(owner = "client!ra", name = "v", descriptor = "B")
    public byte field3872;

    @OriginalMember(owner = "client!ra", name = "t", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ra", name = "u", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!ra", name = "x", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!ra", name = "z", descriptor = "I")
    public int field3876;

    @OriginalMember(owner = "client!ra", name = "A", descriptor = "I")
    public static int field3877;

    @OriginalMember(owner = "client!ra", name = "H", descriptor = "Lpb;")
    public static class123 field3882;

    @OriginalMember(owner = "client!ra", name = "J", descriptor = "Lge;")
    public static class68 field3884;

    @OriginalMember(owner = "client!ra", name = "s", descriptor = "Ljd;")
    public class85 field3869;

    @OriginalMember(owner = "client!ra", name = "w", descriptor = "Ljd;")
    public class85 field3873;

    @OriginalMember(owner = "client!ra", name = "F", descriptor = "[I")
    public static int[] field3880;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Ljava/lang/String;B)Ljd;")
    public static final class85 method1499(String arg0, byte arg1) {
        int var2 = -30 / ((22 - arg1) / 63);
        field3870++;
        byte[] var3 = arg0.getBytes();
        int var4 = 0;
        int var5 = var3.length;
        class85 var6 = new class85();
        var6.field1548 = new byte[var5];
        while (var5 > var4) {
            int var7 = var3[var4++] & 0xFF;
            if (var7 <= 45 && var7 >= 40) {
                if (var4 >= var5) {
                    break;
                }
                int var8 = var3[var4++] & 0xFF;
                var6.field1548[var6.field1538++] = (byte) (var7 * 43 + var8 - 48 - 1720);
            } else if (var7 != 0) {
                var6.field1548[var6.field1538++] = (byte) var7;
            }
        }
        var6.method609(-120);
        return var6.method600(-117);
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static void method1500(byte arg0) {
        field3878 = null;
        field3880 = null;
        field3875 = null;
        field3885 = null;
        field3882 = null;
        field3881 = null;
        field3883 = null;
        field3884 = null;
        if (arg0 != 47) {
            method1501((int[]) null, (byte) 91);
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "([IB)[I")
    public static final int[] method1501(int[] arg0, byte arg1) {
        field3874++;
        if (arg0 == null) {
            return null;
        } else if (arg1 == -55) {
            int[] var2 = new int[arg0.length];
            class248.method1725(arg0, 0, var2, 0, arg0.length);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "(B)Ljd;")
    public static final class85 method1502(byte arg0) {
        class85 var1 = class68.field1283;
        field3871++;
        if (class133.field2312 != 0) {
            var1 = class254.field4391;
        }
        if (arg0 > -7) {
            field3884 = null;
        }
        return class172.method1150(new class85[] { class75.field1401, var1, class106.field1864, class68.method451(class128.field2249, -12572), class251.field4319, class68.method451(class245.field4191, -12572), class38.field592 }, 0);
    }
}
