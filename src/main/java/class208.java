import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public abstract class class208 {

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "[I")
    public static int[] field2917 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "Lnea;")
    public static class664 field2923 = new class664(62, 12);

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "[B")
    public static byte[] field2924 = new byte[2048];

    @OriginalMember(owner = "client!tg", name = "k", descriptor = "Lli;")
    public static class392 field2926 = new class392();

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field2918;

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!tg", name = "e", descriptor = "I")
    public int field2920;

    @OriginalMember(owner = "client!tg", name = "f", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!tg", name = "j", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public int field2927;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public int field2928;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "Lpu;")
    public static class522 field2929;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lvg;IB)I")
    public static final int method1374(class49 arg0, int arg1, byte arg2) {
        field2919++;
        if (arg2 != 7) {
            return -106;
        } else if (!client.method1767(arg0).method972(arg1, -22640) && arg0.field953 == null) {
            return -1;
        } else if (arg0.field910 == null || arg0.field910.length <= arg1) {
            return -1;
        } else {
            return arg0.field910[arg1];
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(I)Z")
    public final boolean method1375(int arg0) {
        if (arg0 == -1) {
            field2922++;
            return (this.field2920 & 0x4) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B)Z")
    public final boolean method1376(byte arg0) {
        int var2 = 77 / ((11 - arg0) / 59);
        field2921++;
        return (this.field2920 & 0x2) != 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(CBLjava/lang/String;)[Ljava/lang/String;")
    public static final String[] method1377(char arg0, byte arg1, String arg2) {
        field2918++;
        int var3 = class376.method2263(arg2, arg0, 125);
        if (arg1 >= -105) {
            field2929 = null;
        }
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0 != arg2.charAt(var8); var8++) {
            }
            var4[var5++] = arg2.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg2.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)Z")
    public final boolean method1378(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            field2925++;
            return (this.field2920 & 0x8) != 0;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(B)Z")
    public final boolean method1379(byte arg0) {
        int var2 = 51 % ((-arg0 - 4) / 60);
        field2916++;
        return (this.field2920 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static void method1380(int arg0) {
        int var1 = -102 % ((arg0 + 56) / 60);
        field2929 = null;
        field2923 = null;
        field2926 = null;
        field2924 = null;
        field2917 = null;
    }
}
