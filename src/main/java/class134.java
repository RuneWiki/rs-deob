import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class134 extends class124 {

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "I")
    private int field2241 = 0;

    @OriginalMember(owner = "client!bk", name = "Z", descriptor = "I")
    private int field2251 = 1365;

    @OriginalMember(owner = "client!bk", name = "V", descriptor = "I")
    private int field2247 = 0;

    @OriginalMember(owner = "client!bk", name = "ab", descriptor = "I")
    private int field2252 = 20;

    @OriginalMember(owner = "client!bk", name = "U", descriptor = "Le;")
    private static class191 field2246 = class54.method368("", 2047);

    @OriginalMember(owner = "client!bk", name = "T", descriptor = "Le;")
    public static class191 field2245 = field2246;

    @OriginalMember(owner = "client!bk", name = "W", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2248 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!bk", name = "cb", descriptor = "[Lji;")
    public static class225[] field2254 = new class225[2048];

    @OriginalMember(owner = "client!bk", name = "eb", descriptor = "Le;")
    public static class191 field2256 = class54.method368("m-Ochte mit Ihnen handeln)3", 2047);

    @OriginalMember(owner = "client!bk", name = "db", descriptor = "Le;")
    public static class191 field2255 = class54.method368("::clientdrop", 2047);

    @OriginalMember(owner = "client!bk", name = "fb", descriptor = "I")
    public static int field2257 = -1;

    @OriginalMember(owner = "client!bk", name = "hb", descriptor = "Le;")
    public static class191 field2259 = class54.method368("rot:", 2047);

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!bk", name = "S", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!bk", name = "X", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!bk", name = "Y", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!bk", name = "bb", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!bk", name = "gb", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIIIIZII)V")
    public static final void method899(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        ++field2250;
        if (~arg6 <= -2 && arg0 >= 1 && arg6 <= 102 && arg0 <= 102) {
            if (!class188.method1298(10) && (class270.field4755[0][arg6][arg0] & 2) == 0) {
                int var8 = arg4;
                if (~(class270.field4755[arg4][arg6][arg0] & 8) != -1) {
                    var8 = 0;
                }
                if (class252.field4461 != var8) {
                    return;
                }
            }
            int var9 = arg4;
            if (arg4 < 3 && (2 & class270.field4755[1][arg6][arg0]) == 2) {
                var9 = arg4 + 1;
            }
            class164.method1109(arg6, var9, arg4, class82.field1383[arg4], (byte) -115, arg1, arg0);
            if (~arg7 <= -1) {
                boolean var10 = class225.field4029;
                class225.field4029 = true;
                class228.method1630(var9, arg0, arg4, 46, false, arg6, arg2, class82.field1383[arg4], false, arg7, arg3);
                class225.field4029 = var10;
            }
        }
        if (!arg5) {
            field2246 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class134() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I[Le;II)Le;")
    public static final class191 method900(int arg0, class191[] arg1, int arg2, int arg3) {
        int var4 = 0;
        for (int var5 = arg2; arg3 > var5; ++var5) {
            if (arg1[arg0 - -var5] == null) {
                arg1[arg0 - -var5] = class222.field3973;
            }
            var4 += arg1[arg0 - -var5].field3379;
        }
        ++field2242;
        int var6 = 0;
        byte[] var7 = new byte[var4];
        for (int var8 = 0; ~arg3 < ~var8; ++var8) {
            class191 var10 = arg1[arg0 + var8];
            class58.method390(var10.field3392, 0, var7, var6, var10.field3379);
            var6 += var10.field3379;
        }
        class191 var9 = new class191();
        var9.field3379 = var4;
        var9.field3392 = var7;
        return var9;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILji;Z)V")
    public final void method136(int arg0, class225 arg1, boolean arg2) {
        ++field2253;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (arg0 == 3) {
                        this.field2247 = arg1.method1593(true);
                    }
                } else {
                    this.field2241 = arg1.method1593(true);
                }
            } else {
                this.field2252 = arg1.method1593(true);
            }
        } else {
            this.field2251 = arg1.method1593(true);
        }
        if (!arg2) {
            method902(false, true);
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(B)V")
    public static void method901(byte arg0) {
        field2246 = null;
        field2259 = null;
        field2248 = null;
        field2255 = null;
        field2254 = null;
        field2245 = null;
        if (arg0 != -71) {
            method903((class121) null, false, -71, -70, (byte) -124, 24, 9);
        }
        field2256 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ZZ)I")
    public static final int method902(boolean arg0, boolean arg1) {
        ++field2249;
        long var2 = class27.method198((byte) -119);
        for (class240 var4 = arg0 ? (class240) class156.field2666.method609(!arg1) : (class240) class156.field2666.method610(-100); var4 != null; var4 = (class240) class156.field2666.method610(-113)) {
            if ((var4.field4272 & 4611686018427387903L) < var2) {
                if ((4611686018427387904L & var4.field4272) != 0L) {
                    int var5 = (int) var4.field1713;
                    class164.field2778[var5] = class158.field2680[var5];
                    var4.method655(63);
                    return var5;
                }
                var4.method655(63);
            }
        }
        if (!arg1) {
            field2254 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lng;ZIIBII)V")
    public static final void method903(class121 arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        class141.field2344 = arg5;
        class207.field3690 = arg2;
        class49.field884 = arg1;
        class273.field4825 = 1;
        ++field2243;
        class5.field42 = arg3;
        class170.field2878 = arg0;
        int var7 = -45 / ((-44 - arg4) / 40);
        class114.field1888 = arg6;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)[I")
    public final int[] method131(byte arg0, int arg1) {
        if (arg0 < 68) {
            this.method131((byte) 110, -77);
        }
        ++field2244;
        int[] var3 = super.field2064.method378(arg1, 0);
        if (super.field2064.field1035) {
            for (int var4 = 0; class64.field1132 > var4; ++var4) {
                int var5 = (class236.field4202[arg1] << 12) / this.field2251 + this.field2247;
                int var6 = (class257.field4559[var4] << 12) / this.field2251 - -this.field2241;
                int var7 = var6;
                int var8 = var6;
                int var9 = var5;
                int var10 = var5;
                int var11 = var6 * var6 >> 12;
                int var12 = var5 * var5 >> 12;
                int var13 = 0;
                while (~(var11 + var12) > -16385 && this.field2252 > var13) {
                    ++var13;
                    var10 = (var8 * var10 >> 12) * 2 + var9;
                    var8 = -var12 + var7 + var11;
                    var11 = var8 * var8 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = this.field2252 - 1 <= var13 ? 0 : (var13 << 12) / this.field2252;
            }
        }
        return var3;
    }
}
