import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class204 extends class218 implements class86 {

    @OriginalMember(owner = "client!kb", name = "v", descriptor = "Z")
    private boolean field2912 = false;

    @OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
    private int field2918 = 50;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "Lkm;")
    private class133 field2936;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "Lkm;")
    private class133 field2940;

    @OriginalMember(owner = "client!kb", name = "y", descriptor = "Lfm;")
    private class53 field2915;

    @OriginalMember(owner = "client!kb", name = "P", descriptor = "Lfm;")
    private class53 field2932;

    @OriginalMember(owner = "client!kb", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2923 = " has logged out.";

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field2938 = 0;

    @OriginalMember(owner = "client!kb", name = "u", descriptor = "Z")
    public static boolean field2911 = false;

    @OriginalMember(owner = "client!kb", name = "O", descriptor = "Lhi;")
    public static class192 field2931 = new class192();

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "F")
    public static float field2937;

    @OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
    public static int field2909;

    @OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
    public static int field2910;

    @OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
    public static int field2913;

    @OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!kb", name = "C", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!kb", name = "D", descriptor = "I")
    public static int field2920;

    @OriginalMember(owner = "client!kb", name = "E", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!kb", name = "F", descriptor = "I")
    public static int field2922;

    @OriginalMember(owner = "client!kb", name = "I", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!kb", name = "J", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!kb", name = "K", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!kb", name = "L", descriptor = "I")
    public static int field2928;

    @OriginalMember(owner = "client!kb", name = "M", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!kb", name = "N", descriptor = "I")
    public static int field2930;

    @OriginalMember(owner = "client!kb", name = "Q", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!kb", name = "R", descriptor = "I")
    public static int field2934;

    @OriginalMember(owner = "client!kb", name = "S", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "I")
    public static int field2939;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "I")
    public static int field2942;

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    public static int field2944;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    public static int field2945;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!kb", name = "H", descriptor = "Lkm;")
    public static class133 field2924;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "Lkm;")
    public static class133 field2948;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "Lrk;")
    public static class277 field2946;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIII)V", line = 4)
    public static final void method1442(int arg0, int arg1, int arg2, int arg3) {
        class176.method1219(-28376, false);
        field2947++;
        class22.field290 = arg3;
        class334.field5048 = arg2;
        class311.method2134(arg1, 121);
        if (arg0 != -8724) {
            method1451(81, 30, 86, 65, (class302) null, -105, -83);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)Z", line = 18)
    public final boolean method676(int arg0, boolean arg1) {
        if (!arg1) {
            field2924 = (class133) null;
        }
        field2943++;
        return this.method1504(arg0, 23925).field3307;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I", line = 30)
    public final int method667(int arg0, int arg1) {
        int var3 = -21 % ((arg0 - 37) / 59);
        field2925++;
        return this.method1504(arg1, 23925).field3301 & 0xFF;
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(BI)V", line = 46)
    public final void method1443(byte arg0, int arg1) {
        field2928++;
        int var3 = 100 / ((39 - arg0) / 50);
        for (class81 var4 = (class81) this.field2915.method368(113); var4 != null; var4 = (class81) this.field2915.method366(1)) {
            if (var4.field1174) {
                var4.method634(arg1);
                var4.field1174 = false;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)I", line = 69)
    public final int method669(int arg0, int arg1) {
        field2930++;
        return arg1 == 64 ? this.method1504(arg0, 23925).field3299 & 0xFFFF : -57;
    }

    @OriginalMember(owner = "client!kb", name = "i", descriptor = "(II)Lwb;", line = 81)
    public final class274 method1444(int arg0, int arg1) {
        if (arg0 != 1) {
            field2931 = (class192) null;
        }
        class81 var3 = this.method1452((byte) 15, arg1);
        field2921++;
        return var3 == null ? null : var3.field1181;
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(II)I", line = 96)
    public final int method674(int arg0, int arg1) {
        field2920++;
        if (arg0 != 255) {
            this.method1443((byte) -98, 44);
        }
        return this.method1504(arg1, arg0 ^ 0x5D8A).field3312 & 0xFF;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V", line = 107)
    public static void method1445(int arg0) {
        field2931 = null;
        field2924 = null;
        field2923 = null;
        field2946 = null;
        if (arg0 != 104) {
            field2937 = -0.8039598F;
        }
        field2948 = null;
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(II)V", line = 127)
    public final void method672(int arg0, int arg1) {
        this.method668(this.field2912 || this.method1504(arg0, arg1 + 23670).field3315 ? 64 : 128, (byte) -70, arg0);
        field2919++;
        if (arg1 != 255) {
            field2924 = (class133) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(BI)I", line = 141)
    public final int method677(byte arg0, int arg1) {
        if (arg0 < 68) {
            this.method1446((byte) -26, true);
        }
        field2916++;
        return this.method1504(arg1, 23925).field3306 & 0xFF;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BZ)V", line = 152)
    public final void method1446(byte arg0, boolean arg1) {
        field2927++;
        if (arg0 == -102) {
            this.field2912 = arg1;
            this.method1450((byte) 124);
        }
    }

    @OriginalMember(owner = "client!kb", name = "k", descriptor = "(II)Lai;", line = 164)
    private final class282 method1447(int arg0, int arg1) {
        field2935++;
        class282 var3 = (class282) this.field2932.method365((long) arg0, 35);
        if (var3 == null) {
            class282 var4 = new class282(arg1 & this.method1504(arg0, 23925).field3299);
            this.field2932.method369(0, var4, (long) arg0);
            return var4;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Z", line = 181)
    public final boolean method665(byte arg0, int arg1) {
        if (arg0 >= -50) {
            this.method1443((byte) 54, 63);
        }
        class81 var3 = this.method1452((byte) 15, arg1);
        field2945++;
        return var3 == null ? false : var3.method632(this, this.field2940);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Lkm;Lkm;Lkm;IZ)V", line = 213)
    public class204(class133 arg0, class133 arg1, class133 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field2936 = arg0;
        this.field2940 = arg2;
        this.field2912 = arg4;
        this.field2918 = arg3;
        this.field2915 = new class53(this.field2918);
        if (class67.field908) {
            this.field2932 = new class53(this.field2918);
        } else {
            this.field2932 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V", line = 236)
    public static final void method1448(int arg0) {
        class334.field5051 = (int[][][]) null;
        field2933++;
        class230.field3259 = null;
        class201.field2862 = null;
        class221.field3164 = (byte[][][]) null;
        if (arg0 != 18128) {
            method1451(26, 3, 0, 93, (class302) null, 126, 62);
        }
        class82.field1196 = null;
        class256.field3680 = null;
        class247.field3565 = (byte[][][]) null;
        class134.field1857 = null;
        class44.field542 = null;
        class108.field1463 = (byte[][][]) null;
        class232.field3277 = (byte[][][]) null;
        class242.field3458 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(BI)Z", line = 261)
    public final boolean method675(byte arg0, int arg1) {
        if (arg0 < 94) {
            return false;
        } else {
            field2910++;
            return this.method1504(arg1, 23925).field3322;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)I", line = 272)
    public final int method666(int arg0, int arg1) {
        field2942++;
        int var3 = 119 % ((-arg1 - 33) / 43);
        return this.method1504(arg0, 23925).field3309 & 0xFF;
    }

    @OriginalMember(owner = "client!kb", name = "l", descriptor = "(II)V", line = 282)
    public final void method1449(int arg0, int arg1) {
        field2929++;
        this.field2918 = arg1;
        this.field2915 = new class53(this.field2918);
        if (class67.field908) {
            this.field2932 = new class53(this.field2918);
        } else {
            this.field2932 = null;
        }
        if (arg0 != 1) {
            this.method668(-89, (byte) 0, -107);
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V", line = 299)
    public final void method1450(byte arg0) {
        if (arg0 < 115) {
            field2924 = (class133) null;
        }
        this.field2915.method363(-51);
        if (this.field2932 != null) {
            this.field2932.method363(-51);
        }
        field2914++;
        class81.field1175 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIIILwj;II)Z", line = 318)
    public static final boolean method1451(int arg0, int arg1, int arg2, int arg3, class302 arg4, int arg5, int arg6) {
        field2913++;
        class187 var7 = class344.method2375((byte) -52, arg4.field4486);
        if (var7.field2586 == -1) {
            return true;
        }
        int var9;
        if (arg4.field4510) {
            int var8 = arg4.field4502 + arg5;
            var9 = var8 & 0x3;
        } else {
            var9 = 0;
        }
        class258 var10 = var7.method1315(948979152, arg4.field4477, var9);
        if (var10 == null) {
            return false;
        }
        int var11 = arg4.field4520;
        int var12 = arg4.field4479;
        if ((var9 & 0x1) == 1) {
            var11 = arg4.field4479;
            var12 = arg4.field4520;
        }
        int var13 = var10.field31;
        int var14 = var10.field30;
        if (var7.field2584) {
            var13 = var11 * 4;
            var14 = var12 * 4;
        }
        if (var7.field2582 == 0) {
            var10.method1781(arg6 * 4 + 48, (-arg1 + -var12 + 104) * 4 + 48, var13, var14);
        } else {
            var10.method1773(arg6 * 4 + 48, (104 - (arg1 - -var12)) * 4 + 48, var13, var14, var7.field2582);
        }
        if (arg2 < 13) {
            method1442(95, 52, 12, 38);
        }
        return true;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IFB)[I", line = 374)
    public final int[] method673(int arg0, float arg1, byte arg2) {
        field2939++;
        if (arg2 <= 24) {
            field2938 = 13;
        }
        class81 var4 = this.method1452((byte) 15, arg0);
        if (var4 == null) {
            return null;
        } else {
            var4.field1174 = true;
            return var4.method636(this, this.field2940, arg1, this.field2912 || this.method1504(arg0, 23925).field3315);
        }
    }

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)[I", line = 394)
    public final int[] method670(int arg0, int arg1) {
        field2917++;
        if (arg1 <= 52) {
            this.field2932 = (class53) null;
        }
        class81 var3 = this.method1452((byte) 15, arg0);
        return var3 == null ? null : var3.method637(this, this.field2940, this.field2912 || this.method1504(arg0, 23925).field3315);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZIFI)Lkn;", line = 416)
    public final class178 method679(int arg0, boolean arg1, int arg2, float arg3, int arg4) {
        field2926++;
        class81 var6 = this.method1452((byte) 15, arg2);
        if (var6 == null || !var6.method632(this, this.field2940)) {
            return null;
        } else if (arg4 == 64) {
            return arg1 ? var6.field1181.method1885(this.field2940, this, (double) arg3, arg0, false, arg0, -125) : var6.field1181.method1884(arg0, arg0, false, (byte) 53, (double) arg3, this.field2940, this);
        } else {
            return (class178) null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(BI)Lnd;", line = 438)
    private final class81 method1452(byte arg0, int arg1) {
        field2941++;
        class81 var3 = (class81) this.field2915.method365((long) arg1, 35);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2936.method955(arg1, 0, arg0 ^ 0xFFFFAAAC);
        if (var4 == null) {
            return null;
        }
        class81 var5 = new class81(new class316(var4));
        if (arg0 != 15) {
            this.method674(98, 2);
        }
        this.field2915.method369(0, var5, (long) arg1);
        return var5;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IBI)V", line = 468)
    public final void method668(int arg0, byte arg1, int arg2) {
        field2922++;
        class123.method884(this.method1504(arg2, 23925).field3306 & 0xFF, this.method1504(arg2, 23925).field3301 & 0xFF, -76);
        boolean var4 = false;
        if (arg1 > -12) {
            this.field2918 = -14;
        }
        class81 var5 = this.method1452((byte) 15, arg2);
        if (var5 != null) {
            var4 = var5.method638(this, this.field2940, arg0);
        }
        if (!var4) {
            class282 var6 = this.method1447(arg2, 65535);
            var6.method1946((byte) 112);
        }
    }

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "(II)Z", line = 501)
    public final boolean method678(int arg0, int arg1) {
        if (arg0 != -4402) {
            this.method1447(13, 105);
        }
        field2909++;
        return !this.method1504(arg1, 23925).field3314;
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(BI)Z", line = 515)
    public final boolean method671(byte arg0, int arg1) {
        if (arg0 != 105) {
            field2938 = 8;
        }
        field2934++;
        return this.field2912 || this.method1504(arg1, 23925).field3315;
    }
}
