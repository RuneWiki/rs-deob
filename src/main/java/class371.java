import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class371 {

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public int field5431 = -1;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field5432 = 0;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public int field5422;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public int field5423;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public int field5424;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public int field5425;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public int field5428;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public int field5430;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public int field5433;

    @OriginalMember(owner = "client!tp", name = "n", descriptor = "I")
    public static int field5434;

    @OriginalMember(owner = "client!tp", name = "o", descriptor = "I")
    public int field5435;

    @OriginalMember(owner = "client!tp", name = "p", descriptor = "I")
    public static int field5436;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "[[[I")
    public static int[][][] field5429;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lod;[[BZ)V")
    public static final void method2225(class349 arg0, byte[][] arg1, boolean arg2) {
        field5426++;
        for (int var3 = 0; var3 < arg0.field4430; var3++) {
            class358.method2144((byte) 84);
            for (int var4 = 0; var4 < class527.field7799 >> 3; var4++) {
                for (int var5 = 0; var5 < class422.field6182 >> 3; var5++) {
                    int var6 = class18.field237[var3][var4][var5];
                    if (var6 != -1) {
                        int var7 = (var6 & 0x3295FD3) >> 24;
                        if (!arg0.field4433 || var7 == 0) {
                            int var8 = (var6 & 0x7) >> 1;
                            int var9 = var6 >> 14 & 0x3FF;
                            int var10 = (var6 & 0x3FFD) >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class310.field4218.length; var12++) {
                                if (class310.field4218[var12] == var11 && arg1[var12] != null) {
                                    arg0.method2070(var4 * 8, var7, arg1[var12], var5 * 8, class82.field1229, var8, var3, (var9 & 0x7) * 8, class269.field3721, (var10 & 0x7) * 8, false);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (!arg2) {
            field5427 = 37;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZI)V")
    public static final void method2226(boolean arg0, int arg1) {
        if (arg1 > -35) {
            method2225(null, null, true);
        }
        for (class365 var2 = (class365) class490.field7151.method2818((byte) 108); var2 != null; var2 = (class365) class490.field7151.method2820((byte) -58)) {
            if (var2.field5356 != null) {
                class361.field5267.method582(var2.field5356);
                var2.field5356 = null;
            }
            if (var2.field5342 != null) {
                class361.field5267.method582(var2.field5342);
                var2.field5342 = null;
            }
            var2.method1565(0);
        }
        field5434++;
        if (!arg0) {
            return;
        }
        for (class365 var3 = (class365) class281.field3860.method2818((byte) -20); var3 != null; var3 = (class365) class281.field3860.method2820((byte) -58)) {
            if (var3.field5356 != null) {
                class361.field5267.method582(var3.field5356);
                var3.field5356 = null;
            }
            var3.method1565(0);
        }
        for (class365 var4 = (class365) class315.field4315.method1494(0); var4 != null; var4 = (class365) class315.field4315.method1493((byte) 119)) {
            if (var4.field5356 != null) {
                class361.field5267.method582(var4.field5356);
                var4.field5356 = null;
            }
            var4.method1565(0);
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method2227(int arg0, String arg1) {
        field5436++;
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = arg0; var4 < var2; var4++) {
            var3 = class80.method649(arg0 ^ 0x7C, arg1.charAt(var4)) + ((var3 << 5) - var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V")
    public static void method2228(int arg0) {
        field5429 = null;
        int var1 = 88 % ((-arg0 - 49) / 63);
    }
}
