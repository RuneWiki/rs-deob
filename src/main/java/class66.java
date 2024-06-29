import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class66 extends class32 {

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field1262 = 0;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field1260 = 255;

    @OriginalMember(owner = "client!rc", name = "w", descriptor = "Lij;")
    public static class50 field1270 = class78.method578(125, "slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!rc", name = "x", descriptor = "Z")
    public static boolean field1271 = false;

    @OriginalMember(owner = "client!rc", name = "y", descriptor = "Lij;")
    public static class50 field1272 = class78.method578(124, "p11_full");

    @OriginalMember(owner = "client!rc", name = "u", descriptor = "B")
    public byte field1268;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "I")
    public int field1258;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field1259;

    @OriginalMember(owner = "client!rc", name = "p", descriptor = "I")
    public static int field1263;

    @OriginalMember(owner = "client!rc", name = "s", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!rc", name = "q", descriptor = "Lwi;")
    public static class21 field1264;

    @OriginalMember(owner = "client!rc", name = "r", descriptor = "Lij;")
    public class50 field1265;

    @OriginalMember(owner = "client!rc", name = "t", descriptor = "Lij;")
    public class50 field1267;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "[I")
    public static int[] field1261;

    @OriginalMember(owner = "client!rc", name = "v", descriptor = "[I")
    public static int[] field1269;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI)Lof;")
    public static final class119 method506(byte arg0, int arg1) {
        class119 var2 = (class119) class235.field3929.method764((byte) 70, (long) arg1);
        field1266++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 >= -88) {
            field1270 = null;
        }
        byte[] var3 = class173.field2903.method190((byte) -92, arg1, 3);
        class119 var4 = new class119();
        if (var3 != null) {
            var4.method867(new class217(var3), (byte) -127);
        }
        class235.field3929.method765((byte) -124, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static void method507(int arg0) {
        field1264 = null;
        field1272 = null;
        field1270 = null;
        int var1 = -41 / ((arg0 + 63) / 59);
        field1269 = null;
        field1261 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(ZZ)V")
    public static final void method508(boolean arg0, boolean arg1) {
        if (!arg1) {
            field1262 = 62;
        }
        for (int var2 = 0; var2 < class6.field77; var2++) {
            class53 var3 = class41.field764[class153.field2678[var2]];
            long var4 = (long) class153.field2678[var2] << 32 | 0x20000000L;
            if (var3 != null && var3.method428((byte) 20) && var3.field959.field1153 == arg0 && var3.field959.method477(false)) {
                int var6 = var3.field3990 >> 7;
                int var7 = var3.field4027 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var3.field3976 == 1 && (var3.field3990 & 0x7F) == 64 && (var3.field4027 & 0x7F) == 64) {
                        if (class144.field2504[var6][var7] == class6.field79) {
                            continue;
                        }
                        class144.field2504[var6][var7] = class6.field79;
                    }
                    if (!var3.field959.field1185) {
                        var4 |= Long.MIN_VALUE;
                    }
                    var3.field4018 = class187.method1260((byte) 41, var3.field3990 + ((var3.field3976 - 1) * 64), var3.field3976 * 64 + var3.field4027 + -64, class201.field3312);
                    class61.method470(class201.field3312, var3.field3990, var3.field4027, var3.field4018, (var3.field3976 - 1) * 64 + 60, var3, var3.field3993, var4, var3.field4028);
                }
            }
        }
        field1259++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V")
    public static final void method509(int arg0, int arg1) {
        class126.field2205 = arg0;
        field1263++;
        class206.field3410 = arg1;
    }
}
