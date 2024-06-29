import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class231 extends class136 {

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "Z")
    public boolean field4339 = false;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "[I")
    private int[] field4341 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!vb", name = "X", descriptor = "I")
    public int field4343 = -1;

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "[I")
    public static int[] field4330 = new int[32];

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "Li;")
    public static class88 field4340 = class208.method1425(105, "<col=80ff00>");

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public static int field4335 = 0;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "Lid;")
    public static class92 field4333 = new class92(64);

    @OriginalMember(owner = "client!vb", name = "Y", descriptor = "Li;")
    public static class88 field4344 = class208.method1425(105, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!vb", name = "ab", descriptor = "Li;")
    private static class88 field4346 = class208.method1425(105, "Take");

    @OriginalMember(owner = "client!vb", name = "Z", descriptor = "Li;")
    public static class88 field4345 = field4346;

    @OriginalMember(owner = "client!vb", name = "E", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!vb", name = "W", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "Lgi;")
    public static class75 field4327;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "[I")
    private int[] field4326;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "[S")
    private short[] field4323;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "[S")
    private short[] field4329;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "[S")
    private short[] field4332;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "[S")
    private short[] field4338;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(I)Lhe;")
    public final class82 method1542(int arg0) {
        field4328++;
        if (this.field4326 == null) {
            return null;
        }
        class82[] var2 = new class82[this.field4326.length];
        if (arg0 != 255) {
            field4340 = null;
        }
        for (int var3 = 0; var3 < this.field4326.length; var3++) {
            var2[var3] = class82.method568(class43.field733, this.field4326[var3], 0);
        }
        class82 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class82(var2, var2.length);
        }
        if (this.field4338 != null) {
            for (int var5 = 0; var5 < this.field4338.length; var5++) {
                var4.method564(this.field4338[var5], this.field4329[var5]);
            }
        }
        if (this.field4332 != null) {
            for (int var6 = 0; var6 < this.field4332.length; var6++) {
                var4.method553(this.field4332[var6], this.field4323[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Lea;ZI)V")
    private final void method1543(class46 arg0, boolean arg1, int arg2) {
        field4324++;
        if (!arg1) {
            method1546(-123);
        }
        if (arg2 == 1) {
            this.field4343 = arg0.method347(26119);
        } else if (arg2 == 2) {
            int var4 = arg0.method347(26119);
            this.field4326 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4326[var5] = arg0.method301(79);
            }
        } else if (arg2 == 3) {
            this.field4339 = true;
        } else if (arg2 == 40) {
            int var8 = arg0.method347(26119);
            this.field4329 = new short[var8];
            this.field4338 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4338[var9] = (short) arg0.method301(87);
                this.field4329[var9] = (short) arg0.method301(82);
            }
        } else if (arg2 == 41) {
            int var6 = arg0.method347(26119);
            this.field4323 = new short[var6];
            this.field4332 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4332[var7] = (short) arg0.method301(107);
                this.field4323[var7] = (short) arg0.method301(89);
            }
            return;
        } else if (arg2 >= 60 && arg2 < 70) {
            this.field4341[arg2 - 60] = arg0.method301(45);
            return;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BI[BI)I")
    public static final int method1544(byte arg0, int arg1, byte[] arg2, int arg3) {
        int var4 = -1;
        field4342++;
        for (int var5 = arg1; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class216.field4047[(var4 ^ arg2[var5]) & 0xFF];
        }
        int var6 = -72 / ((64 - arg0) / 46);
        return ~var4;
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(Z)Lhe;")
    public final class82 method1545(boolean arg0) {
        field4325++;
        if (!arg0) {
            return null;
        }
        int var2 = 0;
        class82[] var3 = new class82[5];
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4341[var4] != -1) {
                var3[var2++] = class82.method568(class43.field733, this.field4341[var4], 0);
            }
        }
        class82 var5 = new class82(var3, var2);
        if (this.field4338 != null) {
            for (int var6 = 0; var6 < this.field4338.length; var6++) {
                var5.method564(this.field4338[var6], this.field4329[var6]);
            }
        }
        if (this.field4332 != null) {
            for (int var7 = 0; var7 < this.field4332.length; var7++) {
                var5.method553(this.field4332[var7], this.field4323[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(I)V")
    public static void method1546(int arg0) {
        field4345 = null;
        field4327 = null;
        field4344 = null;
        field4346 = null;
        field4333 = null;
        field4330 = null;
        if (arg0 != -27162) {
            field4340 = null;
        }
        field4340 = null;
    }

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "(B)Z")
    public final boolean method1547(byte arg0) {
        boolean var2 = true;
        int var3 = 0;
        if (arg0 != -122) {
            this.field4341 = null;
        }
        while (var3 < 5) {
            if (this.field4341[var3] != -1 && !class43.field733.method961(this.field4341[var3], 0, (byte) 62)) {
                var2 = false;
            }
            var3++;
        }
        field4337++;
        return var2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILea;)V")
    public final void method1548(int arg0, class46 arg1) {
        field4331++;
        if (arg0 != -1) {
            this.field4338 = null;
        }
        while (true) {
            int var3 = arg1.method347(arg0 ^ 0xFFFF99F8);
            if (var3 == 0) {
                return;
            }
            this.method1543(arg1, true, var3);
        }
    }

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "(B)Z")
    public final boolean method1549(byte arg0) {
        field4334++;
        if (this.field4326 == null) {
            return true;
        }
        boolean var2 = true;
        int var3 = 40 % ((arg0 + 56) / 37);
        for (int var4 = 0; var4 < this.field4326.length; var4++) {
            if (!class43.field733.method961(this.field4326[var4], 0, (byte) 96)) {
                var2 = false;
            }
        }
        return var2;
    }
}
