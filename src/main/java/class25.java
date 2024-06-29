import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class25 extends class12 {

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Ltg;")
    private static class184 field445 = class135.method812("wave2:", 3);

    @OriginalMember(owner = "client!ce", name = "Q", descriptor = "Ltg;")
    private static class184 field447 = class135.method812("Checking for updates )2 ", 3);

    @OriginalMember(owner = "client!ce", name = "T", descriptor = "Ltg;")
    public static class184 field450 = class135.method812("Art", 3);

    @OriginalMember(owner = "client!ce", name = "W", descriptor = "I")
    public static int field453 = -1;

    @OriginalMember(owner = "client!ce", name = "Y", descriptor = "Ltg;")
    public static class184 field455 = field445;

    @OriginalMember(owner = "client!ce", name = "X", descriptor = "Ltg;")
    public static class184 field454 = class135.method812("Die Adresse dieses Computers wurde gesperrt)1", 3);

    @OriginalMember(owner = "client!ce", name = "V", descriptor = "Ltg;")
    public static class184 field452 = field447;

    @OriginalMember(owner = "client!ce", name = "ab", descriptor = "Ltg;")
    public static class184 field457 = field445;

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "[I")
    public static int[] field444 = new int[500];

    @OriginalMember(owner = "client!ce", name = "P", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!ce", name = "R", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!ce", name = "S", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!ce", name = "U", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!ce", name = "Z", descriptor = "I")
    public static int field456;

    @OriginalMember(owner = "client!ce", name = "bb", descriptor = "[Llb;")
    private class107[] field458;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIII)V")
    public static final void method166(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 == 21157) {
            for (int var5 = 0; class11.field199 > var5; ++var5) {
                if (arg2 < class55.field984[var5] + class198.field3859[var5] && ~class198.field3859[var5] > ~(arg0 + arg2) && ~arg3 > ~(class194.field3767[var5] - -class133.field2411[var5]) && class194.field3767[var5] < arg1 + arg3) {
                    class134.field2427[var5] = true;
                }
            }
            ++field451;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)[[I")
    public final int[][] method80(int arg0, int arg1) {
        ++field449;
        int[][] var3 = super.field232.method673(arg0, -77);
        if (super.field232.field1962) {
            int var4 = class201.field3889;
            int var5 = class114.field2074;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field232.method670(-17514);
            this.method168(true, var6);
            for (int var8 = 0; ~var8 > ~class114.field2074; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class201.field3889; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class10.method61(255, var15) << 4;
                    var12[var14] = class10.method61(65280, var15) >> 4;
                    var11[var14] = class10.method61(4080, var15 >> 12);
                }
            }
        }
        int var16 = 61 % ((arg1 - -58) / 34);
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(B)V")
    public static void method167(byte arg0) {
        field444 = null;
        field447 = null;
        field450 = null;
        field445 = null;
        field454 = null;
        field452 = null;
        if (arg0 != 60) {
            method166(-12, 48, 56, -6, 66);
        }
        field455 = null;
        field457 = null;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "()V")
    public class25() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)[I")
    public final int[] method62(int arg0, byte arg1) {
        if (arg1 != 17) {
            field455 = null;
        }
        ++field446;
        int[] var3 = super.field224.method7((byte) -109, arg0);
        if (super.field224.field53) {
            this.method168(true, super.field224.method6(11083));
        }
        return var3;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Z[[I)V")
    private final void method168(boolean arg0, int[][] arg1) {
        if (!arg0) {
            this.method168(false, (int[][]) null);
        }
        int var3 = class114.field2074;
        ++field448;
        int var4 = class201.field3889;
        class136.method818((byte) -16, arg1);
        class177.method1085(class173.field3274, (byte) 106, class51.field937, 0, 0);
        if (this.field458 != null) {
            for (int var5 = 0; var5 < this.field458.length; ++var5) {
                class107 var6 = this.field458[var5];
                int var7 = var6.field1934;
                int var8 = var6.field1943;
                if (~var7 <= -1) {
                    if (var8 < 0) {
                        var6.method667((byte) 81, var4, var3);
                    } else {
                        var6.method665(var3, var4, true);
                    }
                } else if (var8 >= 0) {
                    var6.method664(var4, var3, 116);
                }
            }
        }
    }
}
