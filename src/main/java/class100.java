import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class100 {

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "Ldd;")
    private static class35 field2194 = class180.method1196((byte) 127, "Username: ");

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "Ldd;")
    public static class35 field2196 = class180.method1196((byte) 126, "M");

    @OriginalMember(owner = "client!kb", name = "j", descriptor = "Ldd;")
    public static class35 field2199 = field2194;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "Ldd;")
    public static class35 field2190 = class180.method1196((byte) -74, "Art");

    @OriginalMember(owner = "client!kb", name = "q", descriptor = "Ldd;")
    private static class35 field2206 = class180.method1196((byte) -31, "Could not complete login)3");

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "[I")
    public static int[] field2192 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "Ldd;")
    public static class35 field2201 = field2206;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field2208 = 0;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field2197;

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "J")
    public long field2198;

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "Llc;")
    public class110 field2191;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "Llc;")
    public class110 field2195;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "Llc;")
    public class110 field2213;

    @OriginalMember(owner = "client!kb", name = "n", descriptor = "Lag;")
    public static class8 field2203;

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "[Lba;")
    public static class12[] field2211;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(III)Lpg;")
    public static final class150 method749(int arg0, int arg1, int arg2) {
        class54 var3 = class191.field3853[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1231;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
    public static final void method750(byte arg0) {
        class175.field3579 = 0;
        field2197++;
        class8.field140 = 0;
        class69.method560((byte) 84);
        class22.method199(0);
        class42.method399(18);
        for (int var1 = 0; var1 < class8.field140; var1++) {
            int var3 = class138.field2950[var1];
            if (class89.field1988 != class204.field4058[var3].field1665) {
                class204.field4058[var3].field377 = null;
                class204.field4058[var3] = null;
            }
        }
        if (class101.field2224 != class172.field3441.field527) {
            throw new RuntimeException("gnp1 pos:" + class172.field3441.field527 + " psize:" + class101.field2224);
        }
        for (int var2 = 0; var2 < class83.field1921; var2++) {
            if (class204.field4058[class73.field1738[var2]] == null) {
                throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class83.field1921);
            }
        }
        if (arg0 <= 116) {
            field2201 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLag;I)Z")
    public static final boolean method751(byte arg0, class8 arg1, int arg2) {
        field2205++;
        byte[] var3 = arg1.method41(arg2, (byte) -126);
        if (var3 == null) {
            return false;
        }
        if (arg0 < 103) {
            method750((byte) 104);
        }
        class148.method1012(var3, (byte) -111);
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIB[Ld;I[BI)V")
    public static final void method752(int arg0, int arg1, byte arg2, class31[] arg3, int arg4, byte[] arg5, int arg6) {
        field2212++;
        int var7 = 0;
        if (arg2 != 23) {
            field2201 = null;
        }
        while (var7 < 4) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg4 + var12 > 0 && arg4 + var12 < 103 && arg0 + var13 > 0 && arg0 + var13 < 103) {
                        arg3[var7].field656[arg4 + var12][arg0 + var13] = class208.method1372(arg3[var7].field656[arg4 + var12][arg0 + var13], -16777217);
                    }
                }
            }
            var7++;
        }
        class26 var8 = new class26(arg5);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class44.method404(var11 + arg0, 0, arg6, arg4 + var10, var8, var9, arg2 ^ 0x42, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
    public static void method753(int arg0) {
        field2201 = null;
        field2196 = null;
        field2199 = null;
        field2190 = null;
        field2194 = null;
        field2211 = null;
        field2206 = null;
        if (arg0 == 0) {
            field2203 = null;
            field2192 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)Lug;")
    public static final class195 method754(int arg0, int arg1, int arg2, int arg3) {
        class195 var4 = new class195();
        var4.field3884 = arg2;
        var4.field3886 = arg3;
        int var5 = 14 / ((23 - arg0) / 40);
        field2200++;
        class22.field445.method789(var4, true, (long) arg1);
        class28.method273(arg2, (byte) 73);
        class207.method1367(arg2, -1);
        class55 var6 = class131.method903(609074640, arg1);
        if (var6 != null) {
            class137.method937(var6, (byte) -85);
        }
        if (class101.field2218 != null) {
            class137.method937(class101.field2218, (byte) -85);
            class101.field2218 = null;
        }
        class59.field1469 = 0;
        class52.field1166 = false;
        class209.method1377(class183.field3767, class57.field1436, 5488, class97.field2146, class113.field2533);
        if (class93.field2062 != -1) {
            class82.method623(class93.field2062, 1, (byte) -112);
        }
        return var4;
    }
}
