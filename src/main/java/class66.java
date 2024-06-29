import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class66 extends class179 {

    @OriginalMember(owner = "client!ld", name = "R", descriptor = "Lke;")
    public static class256 field1169 = class316.method2202("Card:", 27626);

    @OriginalMember(owner = "client!ld", name = "S", descriptor = "Lke;")
    public static class256 field1170 = class316.method2202("<col=ff3000>", 27626);

    @OriginalMember(owner = "client!ld", name = "W", descriptor = "Lke;")
    public static class256 field1174 = class316.method2202("vert:", 27626);

    @OriginalMember(owner = "client!ld", name = "V", descriptor = "Lke;")
    public static class256 field1173 = class316.method2202("Liste des mises -9 jour charg-Be", 27626);

    @OriginalMember(owner = "client!ld", name = "ab", descriptor = "[Z")
    public static boolean[] field1178 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

    @OriginalMember(owner = "client!ld", name = "db", descriptor = "Lke;")
    public static class256 field1181 = class316.method2202("Schlie-8en", 27626);

    @OriginalMember(owner = "client!ld", name = "cb", descriptor = "[I")
    public static int[] field1180 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ld", name = "Y", descriptor = "Z")
    public static boolean field1176 = false;

    @OriginalMember(owner = "client!ld", name = "bb", descriptor = "Lke;")
    public static class256 field1179 = class316.method2202("Connexion perdue)3", 27626);

    @OriginalMember(owner = "client!ld", name = "Q", descriptor = "I")
    public static int field1168;

    @OriginalMember(owner = "client!ld", name = "T", descriptor = "I")
    public static int field1171;

    @OriginalMember(owner = "client!ld", name = "U", descriptor = "I")
    public static int field1172;

    @OriginalMember(owner = "client!ld", name = "X", descriptor = "I")
    public static int field1175;

    @OriginalMember(owner = "client!ld", name = "Z", descriptor = "I")
    public static int field1177;

    @OriginalMember(owner = "client!ld", name = "eb", descriptor = "[Lel;")
    public static class232[] field1182;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(II)Lud;", line = 6)
    public static final class17 method507(int arg0, int arg1) {
        field1177++;
        class17 var2 = (class17) class303.field5239.method1260(arg1 ^ 0xE000007F, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class19.field258.method1016(1, arg1 - 536870811, arg0);
        } else {
            var3 = class138.field2436.method1016(1, 100, arg0 & 0x7FFF);
        }
        class17 var4 = new class17();
        if (arg1 != 536870911) {
            return (class17) null;
        }
        if (var3 != null) {
            var4.method100((byte) -118, new class41(var3));
        }
        if (arg0 >= 32768) {
            var4.method99(-1);
        }
        class303.field5239.method1259(var4, (long) arg0, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[BII)I", line = 41)
    public static final int method508(int arg0, byte[] arg1, int arg2, int arg3) {
        field1168++;
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = class50.field901[(arg1[var5] ^ var4) & 0xFF] ^ var4 >>> 8;
        }
        return var4 ^ arg2;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(II)[I", line = 75)
    public final int[] method41(int arg0, int arg1) {
        int[] var3 = this.field3157.method1258(arg1 ^ 0x7B39, arg0);
        field1171++;
        if (arg1 != -31598) {
            field1181 = (class256) null;
        }
        if (this.field3157.field3081) {
            class299.method2088(var3, 0, class161.field2858, class292.field5049[arg0]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V", line = 102)
    public class66() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "(I)V", line = 120)
    public static void method509(int arg0) {
        field1181 = null;
        field1182 = null;
        field1180 = null;
        field1178 = null;
        field1173 = null;
        field1170 = null;
        field1169 = null;
        field1174 = null;
        field1179 = null;
        if (arg0 != 268435455) {
            field1182 = (class232[]) null;
        }
    }
}
