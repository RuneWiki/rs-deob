import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public abstract class class272 extends class435 {

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "Lur;")
    public class377 field3627;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[[B")
    public static byte[][] field3623 = new byte[50][];

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public static int field3624 = 0;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "I")
    public static int field3634;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field3635;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field3637;

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lc;")
    public static class124 field3633;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "Lao;")
    public static class191 field3626;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Z")
    public boolean field3628;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "[Z")
    public static boolean[] field3636;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 9)
    public static final void method1647(int arg0) {
        field3625++;
        class216.field2949.method1812(true);
        class106.field1443.field5729 = 0;
        class93.field1117 = null;
        class384.field5586 = 0;
        class430.field6246 = 0;
        class434.field6334 = null;
        class334.field4414.field5729 = 0;
        class188.field2437 = null;
        field3626 = null;
        class447.field6519 = 0;
        for (int var1 = 0; var1 < 100; var1++) {
            class7.field100[var1] = null;
        }
        class436.field6359 = null;
        class140.field1862 = 0;
        class479.field7092 = 0;
        class54.field623 = null;
        if (arg0 == 512) {
            class198.field2557 = 0;
            class85.field1014 = 0;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Z", line = 42)
    public final boolean method1648(byte arg0) {
        if (arg0 <= 63) {
            return true;
        } else {
            field3629++;
            return this.field3628;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(III)Lpj;", line = 54)
    public static final class100 method1649(int arg0, int arg1, int arg2) {
        class498 var3 = class186.field2421[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7271;
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V", line = 61)
    public static void method1650(int arg0) {
        field3633 = null;
        if (arg0 > -125) {
            method1649(-2, -26, -52);
        }
        field3626 = null;
        field3623 = null;
        field3636 = null;
    }

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "(I)I", line = 74)
    public int method1651(int arg0) {
        field3631++;
        if (arg0 > -92) {
            this.method1656((byte) -13);
        }
        return 0;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lur;)V", line = 85)
    public class272(class377 arg0) {
        this.field3627 = arg0;
    }

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "(I)I", line = 96)
    public final int method1653(int arg0) {
        field3630++;
        return arg0 > -108 ? -56 : 1;
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Z", line = 120)
    public final boolean method1656(byte arg0) {
        field3634++;
        int var2 = 85 / ((26 - arg0) / 44);
        return false;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZIIIZ)V", line = 135)
    public static final void method1658(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field3632++;
        if (arg2 < 1) {
            arg2 = 1;
        }
        if (arg0 < 1) {
            arg0 = 1;
        }
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class458.field6835 - class479.field7101) * var6 / 100 + class479.field7101;
        if (var7 < class258.field3449) {
            var7 = class258.field3449;
        } else if (var7 > class470.field6979) {
            var7 = class470.field6979;
        }
        int var8 = var7 * 512 * arg0 / (arg2 * 334);
        if (var8 < class316.field4231) {
            short var12 = class316.field4231;
            var7 = arg2 * var12 * 334 / (arg0 * 512);
            if (var7 > class470.field6979) {
                var7 = class470.field6979;
                int var13 = var7 * 512 * arg0 / (var12 * 334);
                int var14 = (arg2 - var13) / 2;
                if (arg1) {
                    class343.field4596.method1206();
                    class343.field4596.method1717(var14, arg3, arg0, -16777216, -22794, arg4);
                    class343.field4596.method1717(var14, arg3 + arg2 - var14, arg0, -16777216, -22794, arg4);
                }
                arg3 += var14;
                arg2 -= var14 * 2;
            }
        } else if (class365.field4986 < var8) {
            short var9 = class365.field4986;
            var7 = arg2 * var9 * 334 / (arg0 * 512);
            if (var7 < class258.field3449) {
                var7 = class258.field3449;
                int var10 = arg2 * var9 * 334 / (var7 * 512);
                int var11 = (arg0 - var10) / 2;
                if (arg1) {
                    class343.field4596.method1206();
                    class343.field4596.method1717(arg2, arg3, var11, -16777216, -22794, arg4);
                    class343.field4596.method1717(arg2, arg3, var11, -16777216, -22794, arg4 + arg0 - var11);
                }
                arg0 -= var11 * 2;
                arg4 += var11;
            }
        }
        class74.field932 = arg0 * var7 / 334;
        class527.field7739 = (short) arg0;
        class75.field951 = arg3;
        if (arg5) {
            class444.field6461 = (short) arg2;
            class151.field1970 = arg4;
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(Z)Z")
    public abstract boolean method1646(boolean arg0);

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "(I)Z")
    public abstract boolean method1652(int arg0);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBI)V")
    public abstract void method1654(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IZ)V")
    public abstract void method1655(int arg0, boolean arg1);

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLkm;Lkm;I)V")
    public abstract void method1657(boolean arg0, class238 arg1, class238 arg2, int arg3);

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)V")
    public abstract void method1659(int arg0);
}
