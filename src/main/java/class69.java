import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class69 extends class182 {

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "[I")
    private int[] field1319 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "I")
    public int field1314 = -1;

    @OriginalMember(owner = "client!gb", name = "lb", descriptor = "Z")
    public boolean field1338 = false;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "Lkh;")
    private static class117 field1311 = class224.method1450((byte) 22, "Nov");

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "Lkh;")
    private static class117 field1310 = class224.method1450((byte) 105, "Oct");

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "Lkh;")
    private static class117 field1315 = class224.method1450((byte) -84, "Aug");

    @OriginalMember(owner = "client!gb", name = "U", descriptor = "Lkh;")
    private static class117 field1321 = class224.method1450((byte) -62, "Jan");

    @OriginalMember(owner = "client!gb", name = "Y", descriptor = "Lkh;")
    private static class117 field1325 = class224.method1450((byte) 117, "Jul");

    @OriginalMember(owner = "client!gb", name = "ab", descriptor = "Lkh;")
    private static class117 field1327 = class224.method1450((byte) 106, "Dec");

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "Lkh;")
    private static class117 field1309 = class224.method1450((byte) -62, "Feb");

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "Lkh;")
    private static class117 field1312 = class224.method1450((byte) -46, "May");

    @OriginalMember(owner = "client!gb", name = "Z", descriptor = "Lkh;")
    private static class117 field1326 = class224.method1450((byte) -17, "Sep");

    @OriginalMember(owner = "client!gb", name = "V", descriptor = "Lkh;")
    private static class117 field1322 = class224.method1450((byte) -101, "Jun");

    @OriginalMember(owner = "client!gb", name = "ib", descriptor = "Lkh;")
    public static class117 field1335 = class224.method1450((byte) -51, "Wir vermuten)1 dass jemand Ihr Passwort kennt)3");

    @OriginalMember(owner = "client!gb", name = "db", descriptor = "Lkh;")
    private static class117 field1330 = class224.method1450((byte) 107, "Mar");

    @OriginalMember(owner = "client!gb", name = "kb", descriptor = "Lkh;")
    private static class117 field1337 = class224.method1450((byte) 6, "Apr");

    @OriginalMember(owner = "client!gb", name = "T", descriptor = "[Lkh;")
    public static class117[] field1320 = new class117[] { field1321, field1309, field1330, field1337, field1312, field1322, field1325, field1315, field1326, field1310, field1311, field1327 };

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field1317;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!gb", name = "eb", descriptor = "I")
    public static int field1331;

    @OriginalMember(owner = "client!gb", name = "fb", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!gb", name = "hb", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!gb", name = "jb", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!gb", name = "mb", descriptor = "I")
    public static int field1339;

    @OriginalMember(owner = "client!gb", name = "nb", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "Lvb;")
    public static class232 field1313;

    @OriginalMember(owner = "client!gb", name = "bb", descriptor = "Z")
    public static boolean field1328;

    @OriginalMember(owner = "client!gb", name = "X", descriptor = "[I")
    private int[] field1324;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[S")
    private short[] field1316;

    @OriginalMember(owner = "client!gb", name = "W", descriptor = "[S")
    private short[] field1323;

    @OriginalMember(owner = "client!gb", name = "cb", descriptor = "[S")
    private short[] field1329;

    @OriginalMember(owner = "client!gb", name = "gb", descriptor = "[S")
    private short[] field1333;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "(I)Lbc;")
    public final class15 method481(int arg0) {
        field1334++;
        class15[] var2 = new class15[5];
        int var3 = 0;
        for (int var4 = arg0; var4 < 5; var4++) {
            if (this.field1319[var4] != -1) {
                var2[var3++] = class15.method143(class27.field671, this.field1319[var4], 0);
            }
        }
        class15 var5 = new class15(var2, var3);
        if (this.field1329 != null) {
            for (int var6 = 0; var6 < this.field1329.length; var6++) {
                var5.method144(this.field1329[var6], this.field1333[var6]);
            }
        }
        if (this.field1323 != null) {
            for (int var7 = 0; var7 < this.field1323.length; var7++) {
                var5.method151(this.field1323[var7], this.field1316[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILnc;I)V")
    private final void method482(int arg0, class145 arg1, int arg2) {
        if (arg0 != 3) {
            field1312 = null;
        }
        field1318++;
        if (arg2 == 1) {
            this.field1314 = arg1.method998(91);
        } else if (arg2 == 2) {
            int var8 = arg1.method998(78);
            this.field1324 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field1324[var9] = arg1.method1049((byte) 96);
            }
        } else if (arg2 == 3) {
            this.field1338 = true;
        } else if (arg2 == 40) {
            int var6 = arg1.method998(arg0 ^ 0x5D);
            this.field1329 = new short[var6];
            this.field1333 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1329[var7] = (short) arg1.method1049((byte) 122);
                this.field1333[var7] = (short) arg1.method1049((byte) 123);
            }
        } else if (arg2 == 41) {
            int var4 = arg1.method998(94);
            this.field1316 = new short[var4];
            this.field1323 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1323[var5] = (short) arg1.method1049((byte) 112);
                this.field1316[var5] = (short) arg1.method1049((byte) 116);
            }
            return;
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field1319[arg2 - 60] = arg1.method1049((byte) 91);
            return;
        }
    }

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "(B)Z")
    public final boolean method483(byte arg0) {
        boolean var2 = true;
        if (arg0 != -19) {
            this.field1323 = null;
        }
        field1331++;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1319[var3] != -1 && !class27.field671.method109(12769, this.field1319[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lnc;I)V")
    public final void method484(class145 arg0, int arg1) {
        if (arg1 != -6398) {
            this.field1314 = -6;
        }
        while (true) {
            int var3 = arg0.method998(arg1 ^ 0xFFFFE761);
            if (var3 == 0) {
                field1336++;
                return;
            }
            this.method482(arg1 ^ 0xFFFFE701, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "([IIIIII)V")
    public static final void method485(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class170 var6 = class109.field2063[arg3][arg4][arg5];
        if (var6 == null) {
            return;
        }
        class13 var7 = var6.field3057;
        if (var7 != null) {
            int var8 = var7.field406;
            if (var8 != 0) {
                for (int var9 = 0; var9 < 4; var9++) {
                    arg0[arg1] = var8;
                    arg0[arg1 + 1] = var8;
                    arg0[arg1 + 2] = var8;
                    arg0[arg1 + 3] = var8;
                    arg1 += arg2;
                }
            }
            return;
        }
        class238 var10 = var6.field3070;
        if (var10 == null) {
            return;
        }
        int var11 = var10.field4300;
        int var12 = var10.field4295;
        int var13 = var10.field4301;
        int var14 = var10.field4299;
        int[] var15 = class133.field2406[var11];
        int[] var16 = class105.field1917[var12];
        int var17 = 0;
        if (var13 != 0) {
            for (int var18 = 0; var18 < 4; var18++) {
                arg0[arg1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 1] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 2] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg0[arg1 + 3] = var15[var16[var17++]] == 0 ? var13 : var14;
                arg1 += arg2;
            }
            return;
        }
        for (int var19 = 0; var19 < 4; var19++) {
            if (var15[var16[var17++]] != 0) {
                arg0[arg1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 1] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 2] = var14;
            }
            if (var15[var16[var17++]] != 0) {
                arg0[arg1 + 3] = var14;
            }
            arg1 += arg2;
        }
    }

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "(I)V")
    public static void method486(int arg0) {
        field1335 = null;
        field1325 = null;
        field1313 = null;
        field1327 = null;
        field1310 = null;
        field1311 = null;
        field1312 = null;
        field1315 = null;
        field1337 = null;
        field1309 = null;
        if (arg0 != 20626) {
            method487((byte) 37, null);
        }
        field1330 = null;
        field1326 = null;
        field1321 = null;
        field1322 = null;
        field1320 = null;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BLkh;)V")
    public static final void method487(byte arg0, class117 arg1) {
        field1339++;
        if (class39.field898 == null) {
            return;
        }
        long var2 = arg1.method813((byte) 93);
        int var4 = 0;
        if (var2 == 0L || arg0 != 81) {
            return;
        }
        while (class39.field898.length > var4 && class39.field898[var4].field389 != var2) {
            var4++;
        }
        if (var4 < class39.field898.length && class39.field898[var4] != null) {
            class158.field2881++;
            class105.field1911.method400(49, 8);
            class105.field1911.method1000((byte) 39, class39.field898[var4].field389);
        }
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(B)Z")
    public final boolean method488(byte arg0) {
        field1332++;
        if (this.field1324 == null) {
            return true;
        }
        if (arg0 < 55) {
            this.method489((byte) 99);
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1324.length; var3++) {
            if (!class27.field671.method109(12769, this.field1324[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(B)Lbc;")
    public final class15 method489(byte arg0) {
        field1340++;
        if (this.field1324 == null) {
            return null;
        }
        class15[] var2 = new class15[this.field1324.length];
        for (int var3 = 0; var3 < this.field1324.length; var3++) {
            var2[var3] = class15.method143(class27.field671, this.field1324[var3], 0);
        }
        if (arg0 != -116) {
            this.method484(null, 53);
        }
        class15 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class15(var2, var2.length);
        }
        if (this.field1329 != null) {
            for (int var5 = 0; var5 < this.field1329.length; var5++) {
                var4.method144(this.field1329[var5], this.field1333[var5]);
            }
        }
        if (this.field1323 != null) {
            for (int var6 = 0; var6 < this.field1323.length; var6++) {
                var4.method151(this.field1323[var6], this.field1316[var6]);
            }
        }
        return var4;
    }
}
