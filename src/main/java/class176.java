import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public class class176 extends class181 {

    @OriginalMember(owner = "client!hh", name = "V", descriptor = "Lhd;")
    public class102 field3223;

    @OriginalMember(owner = "client!hh", name = "O", descriptor = "Lli;")
    public static class185 field3216 = class245.method1649("headicons_prayer", 127);

    @OriginalMember(owner = "client!hh", name = "M", descriptor = "I")
    public static int field3214 = 7759444;

    @OriginalMember(owner = "client!hh", name = "J", descriptor = "Lli;")
    public static class185 field3211 = class245.method1649(" <col=00ff80>", -25);

    @OriginalMember(owner = "client!hh", name = "Q", descriptor = "Z")
    public static boolean field3218 = false;

    @OriginalMember(owner = "client!hh", name = "R", descriptor = "I")
    public static int field3219 = 20;

    @OriginalMember(owner = "client!hh", name = "L", descriptor = "I")
    public static int field3213 = 1;

    @OriginalMember(owner = "client!hh", name = "K", descriptor = "Lli;")
    public static class185 field3212 = class245.method1649("Connect-B au serveur de mise -9 jour", -110);

    @OriginalMember(owner = "client!hh", name = "U", descriptor = "[I")
    public static int[] field3222 = new int[5];

    @OriginalMember(owner = "client!hh", name = "S", descriptor = "I")
    public static int field3220 = 0;

    @OriginalMember(owner = "client!hh", name = "I", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!hh", name = "N", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!hh", name = "P", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
    public static int field3221;

    @OriginalMember(owner = "client!hh", name = "W", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)I")
    public static final int method1244(int arg0, int arg1, int arg2, int arg3) {
        field3210++;
        if ((class239.field4262[arg2][arg0][arg1] & 0x8) == 0) {
            if (arg3 >= -102) {
                method1244(55, 71, 33, 126);
            }
            return arg2 <= 0 || (class239.field4262[1][arg0][arg1] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZI)V")
    public static final void method1245(boolean arg0, int arg1) {
        field3215++;
        if (arg1 != -1) {
            field3212 = null;
        }
        class25.method168(25079, class204.field3738, arg0, class148.field2796, class275.field4877);
    }

    @OriginalMember(owner = "client!hh", name = "b", descriptor = "(B)V")
    public static final void method1246(byte arg0) {
        field3217++;
        int var1 = -65 % ((arg0 - 18) / 55);
        for (int var2 = -1; var2 < class17.field281; var2++) {
            int var6;
            if (var2 == -1) {
                var6 = 2047;
            } else {
                var6 = class174.field3187[var2];
            }
            class188 var7 = class93.field1774[var6];
            if (var7 != null && var7.field2657 > 0) {
                var7.field2657--;
                if (var7.field2657 == 0) {
                    var7.field2713 = null;
                }
            }
        }
        for (int var3 = 0; var3 < class108.field1943; var3++) {
            int var4 = class97.field1811[var3];
            class71 var5 = class87.field1712[var4];
            if (var5 != null && var5.field2657 > 0) {
                var5.field2657--;
                if (var5.field2657 == 0) {
                    var5.field2713 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(B)V")
    public static final void method1247(byte arg0) {
        field3221++;
        class249.field4413.method80(-14113);
        class5.field126.method80(-14113);
        if (arg0 == 78) {
            class38.field589.method80(-14113);
        }
    }

    @OriginalMember(owner = "client!hh", name = "c", descriptor = "(Z)V")
    public static final void method1248(boolean arg0) {
        if (arg0) {
            field3224++;
            class80.field1395.method86(0);
            class63.field1103.method86(0);
            class198.field3619.method86(0);
        }
    }

    @OriginalMember(owner = "client!hh", name = "d", descriptor = "(I)V")
    public static void method1249(int arg0) {
        field3216 = null;
        field3211 = null;
        field3212 = null;
        field3222 = null;
        if (arg0 != 0) {
            method1245(true, 115);
        }
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(Lhd;)V")
    public class176(class102 arg0) {
        this.field3223 = arg0;
    }
}
