import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class295 {

    @OriginalMember(owner = "client!hi", name = "e", descriptor = "I")
    public static int field5043 = 10;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "Ljf;")
    public static class229 field5053 = class212.method1457((byte) 114, "scrollen:");

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "Ljf;")
    private static class229 field5057 = class212.method1457((byte) 70, " from your friend list first)3");

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    public static int field5049 = 0;

    @OriginalMember(owner = "client!hi", name = "d", descriptor = "Ljf;")
    public static class229 field5042 = field5057;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "I")
    public static int field5039;

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "I")
    public static int field5040;

    @OriginalMember(owner = "client!hi", name = "c", descriptor = "I")
    public int field5041;

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!hi", name = "g", descriptor = "I")
    public int field5045;

    @OriginalMember(owner = "client!hi", name = "h", descriptor = "I")
    public static int field5046;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "I")
    public int field5047;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "I")
    public int field5050;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "I")
    public int field5051;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "I")
    public int field5054;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    public int field5055;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "[B")
    public byte[] field5052;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "[B")
    public byte[] field5056;

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)V", line = 11)
    public static void method2042(int arg0) {
        field5053 = null;
        if (arg0 < 122) {
            method2044((byte) -52);
        }
        field5042 = null;
        field5057 = null;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(B)V", line = 31)
    public static final void method2043(byte arg0) {
        field5058++;
        int var1 = class89.field1627.length;
        int var2 = 0;
        if (arg0 != -37) {
            return;
        }
        while (var1 > var2) {
            if (class89.field1627[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class320.field5419; var4++) {
                    if (class61.field1041[var4] == class29.field511[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class61.field1041[class320.field5419] = class29.field511[var2];
                    var3 = class320.field5419++;
                }
                class14 var5 = new class14(class89.field1627[var2]);
                int var6 = 0;
                while (class89.field1627[var2].length > var5.field195 && var6 < 511) {
                    int var7 = var6++ << 6 | var3;
                    int var8 = var5.method116(-1);
                    int var9 = var8 & 0x3F;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 >> 14;
                    int var12 = (class29.field511[var2] >> 8) * 64 + var10 - class258.field4503;
                    int var13 = (class29.field511[var2] & 0xFF) * 64 + (var9 - class213.field3649);
                    class169 var14 = class224.method1541((byte) 20, var5.method116(-1));
                    if (class331.field5637[var7] == null && (var14.field2891 & 0x1) > 0 && class225.field3852 == var11 && var12 >= 0 && (var14.field2952 + var12) < 104 && var13 >= 0 && (var14.field2952 + var13) < 104) {
                        class331.field5637[var7] = new class331();
                        class331 var15 = class331.field5637[var7];
                        class283.field4858[class126.field2238++] = var7;
                        var15.field1962 = class199.field3475;
                        var15.method2256((byte) -45, var14);
                        var15.method792(var15.field5631.field2952, -21715);
                        var15.field1964 = var15.field1987 = class329.field5584[var15.field5631.field2946];
                        var15.field2008 = var15.field5631.field2949;
                        var15.field1981 = var15.field5631.field2929;
                        var15.field1994 = var15.field5631.field2942;
                        var15.field2026 = var15.field5631.field2932;
                        var15.field2004 = var15.field5631.field2899;
                        if (var15.field2004 == 0) {
                            var15.field1987 = 0;
                        }
                        var15.field2030 = var15.field5631.field2918;
                        var15.field1986 = var15.field5631.field2913;
                        var15.field2027 = var15.field5631.field2959;
                        var15.method795(true, (byte) 120, var13, var12, var15.method299(true));
                    }
                }
            }
            var2++;
        }
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(B)V", line = 132)
    public static final void method2044(byte arg0) {
        field5046++;
        class99.method677();
        class15.field228 = new class210[7];
        class15.field228[1] = new class310();
        class15.field228[2] = new class262();
        class15.field228[3] = new class154();
        if (arg0 != 79) {
            method2044((byte) -20);
        }
        class15.field228[4] = new class65();
        class15.field228[5] = new class302();
        class15.field228[6] = new class300();
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lek;ZI)Lkb;", line = 175)
    public static final class35 method2045(class185 arg0, boolean arg1, int arg2) {
        field5048++;
        if (class50.method414(arg0, -87, arg2)) {
            if (!arg1) {
                field5040 = -102;
            }
            return class158.method1061((byte) -95);
        } else {
            return null;
        }
    }
}
