import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lk")
public class class279 {

    @OriginalMember(owner = "client!lk", name = "e", descriptor = "I")
    public int field4279 = -1;

    @OriginalMember(owner = "client!lk", name = "g", descriptor = "Z")
    public boolean field4281 = false;

    @OriginalMember(owner = "client!lk", name = "n", descriptor = "[I")
    private int[] field4288 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!lk", name = "f", descriptor = "Ljava/lang/String;")
    public static String field4280 = "glow3:";

    @OriginalMember(owner = "client!lk", name = "p", descriptor = "[I")
    public static int[] field4290 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!lk", name = "m", descriptor = "Lta;")
    public static class197 field4287 = new class197(5);

    @OriginalMember(owner = "client!lk", name = "v", descriptor = "Ljava/lang/String;")
    public static String field4296 = "Discard";

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "I")
    public static int field4277;

    @OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!lk", name = "j", descriptor = "I")
    public static int field4284;

    @OriginalMember(owner = "client!lk", name = "k", descriptor = "I")
    public static int field4285;

    @OriginalMember(owner = "client!lk", name = "q", descriptor = "I")
    public static int field4291;

    @OriginalMember(owner = "client!lk", name = "r", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!lk", name = "s", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!lk", name = "u", descriptor = "Llb;")
    public static class211 field4295;

    @OriginalMember(owner = "client!lk", name = "o", descriptor = "[I")
    private int[] field4289;

    @OriginalMember(owner = "client!lk", name = "t", descriptor = "[I")
    public static int[] field4294;

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "[S")
    private short[] field4276;

    @OriginalMember(owner = "client!lk", name = "h", descriptor = "[S")
    private short[] field4282;

    @OriginalMember(owner = "client!lk", name = "i", descriptor = "[S")
    private short[] field4283;

    @OriginalMember(owner = "client!lk", name = "l", descriptor = "[S")
    private short[] field4286;

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lhb;I)V", line = 6)
    public final void method1958(class35 arg0, int arg1) {
        if (arg1 != 18808) {
            return;
        }
        field4291++;
        while (true) {
            int var3 = arg0.method273(65280);
            if (var3 == 0) {
                return;
            }
            this.method1962(arg0, var3, (byte) 57);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(B)Lcg;", line = 29)
    public final class42 method1959(byte arg0) {
        field4284++;
        class42[] var2 = new class42[5];
        if (arg0 != -89) {
            return (class42) null;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field4288[var4] != -1) {
                var2[var3++] = class42.method404(class41.field601, this.field4288[var4], 0);
            }
        }
        class42 var5 = new class42(var2, var3);
        if (this.field4276 != null) {
            for (int var6 = 0; var6 < this.field4276.length; var6++) {
                var5.method383(this.field4276[var6], this.field4286[var6]);
            }
        }
        if (this.field4283 != null) {
            for (int var7 = 0; var7 < this.field4283.length; var7++) {
                var5.method377(this.field4283[var7], this.field4282[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(ILek;)Ljava/lang/String;", line = 91)
    public static final String method1960(int arg0, class184 arg1) {
        field4293++;
        if (arg0 >= -40) {
            method1963(28);
        }
        if (client.method1764(arg1).method1932(-1) == 0) {
            return null;
        } else if (arg1.field2832 == null || arg1.field2832.trim().length() == 0) {
            return class199.field3147 ? "Hidden-use" : null;
        } else {
            return arg1.field2832;
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(II)I", line = 115)
    public static final int method1961(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0xD5555555) + (arg0 & 0x55555555);
        field4277++;
        int var3 = (var2 >>> 2 & 0xB3333333) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & arg1;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(Lhb;IB)V", line = 129)
    private final void method1962(class35 arg0, int arg1, byte arg2) {
        field4278++;
        if (arg1 == 1) {
            this.field4279 = arg0.method273(65280);
        } else if (arg1 == 2) {
            int var4 = arg0.method273(65280);
            this.field4289 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4289[var5] = arg0.method300(-1394191632);
            }
        } else if (arg1 == 3) {
            this.field4281 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method273(65280);
            this.field4276 = new short[var6];
            this.field4286 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field4276[var7] = (short) arg0.method300(-1394191632);
                this.field4286[var7] = (short) arg0.method300(-1394191632);
            }
        } else if (arg1 == 41) {
            int var8 = arg0.method273(65280);
            this.field4282 = new short[var8];
            this.field4283 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field4283[var9] = (short) arg0.method300(-1394191632);
                this.field4282[var9] = (short) arg0.method300(-1394191632);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field4288[arg1 - 60] = arg0.method300(-1394191632);
        }
        if (arg2 < 9) {
            this.method1959((byte) 45);
        }
    }

    @OriginalMember(owner = "client!lk", name = "a", descriptor = "(I)V", line = 214)
    public static void method1963(int arg0) {
        field4294 = null;
        field4290 = null;
        field4296 = null;
        field4287 = null;
        if (arg0 < 62) {
            field4294 = (int[]) null;
        }
        field4280 = null;
        field4295 = null;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(I)Lcg;", line = 235)
    public final class42 method1964(int arg0) {
        field4275++;
        if (this.field4289 == null) {
            return null;
        }
        class42[] var2 = new class42[this.field4289.length];
        for (int var3 = 0; var3 < this.field4289.length; var3++) {
            var2[var3] = class42.method404(class41.field601, this.field4289[var3], 0);
        }
        if (arg0 != 40) {
            this.field4281 = true;
        }
        class42 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class42(var2, var2.length);
        }
        if (this.field4276 != null) {
            for (int var5 = 0; var5 < this.field4276.length; var5++) {
                var4.method383(this.field4276[var5], this.field4286[var5]);
            }
        }
        if (this.field4283 != null) {
            for (int var6 = 0; var6 < this.field4283.length; var6++) {
                var4.method377(this.field4283[var6], this.field4282[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!lk", name = "b", descriptor = "(B)Z", line = 299)
    public final boolean method1965(byte arg0) {
        field4292++;
        if (this.field4289 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 87) {
            return false;
        }
        for (int var3 = 0; var3 < this.field4289.length; var3++) {
            if (!class41.field601.method1506(-125, this.field4289[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lk", name = "c", descriptor = "(B)Z", line = 325)
    public final boolean method1966(byte arg0) {
        field4285++;
        boolean var2 = true;
        int var3 = 0;
        if (arg0 < 46) {
            field4295 = (class211) null;
        }
        while (var3 < 5) {
            if (this.field4288[var3] != -1 && !class41.field601.method1506(-104, this.field4288[var3], 0)) {
                var2 = false;
            }
            var3++;
        }
        return var2;
    }
}
