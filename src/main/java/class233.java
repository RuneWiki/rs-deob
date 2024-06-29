import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class233 {

    @OriginalMember(owner = "client!kg", name = "k", descriptor = "[I")
    private int[] field3233 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!kg", name = "p", descriptor = "Lec;")
    public static class40 field3238 = new class40("Hidden", "Versteckt", "Caché", "Oculto");

    @OriginalMember(owner = "client!kg", name = "r", descriptor = "Lsd;")
    public static class74 field3240 = null;

    @OriginalMember(owner = "client!kg", name = "u", descriptor = "I")
    public static int field3243 = 0;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field3226;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "I")
    public static int field3229;

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "I")
    public static int field3230;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!kg", name = "l", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!kg", name = "n", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!kg", name = "s", descriptor = "I")
    public static int field3241;

    @OriginalMember(owner = "client!kg", name = "t", descriptor = "Lct;")
    public static class108 field3242;

    @OriginalMember(owner = "client!kg", name = "m", descriptor = "Loi;")
    public class129 field3235;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "[I")
    private int[] field3228;

    @OriginalMember(owner = "client!kg", name = "q", descriptor = "[Lrg;")
    public static class395[] field3239;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "[S")
    private short[] field3223;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "[S")
    private short[] field3225;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "[S")
    private short[] field3227;

    @OriginalMember(owner = "client!kg", name = "o", descriptor = "[S")
    private short[] field3237;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(I)V", line = 3)
    public static void method1281(int arg0) {
        field3238 = null;
        field3240 = null;
        field3239 = null;
        int var1 = 81 / ((28 - arg0) / 37);
        field3242 = null;
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(I)Z", line = 15)
    public final boolean method1282(int arg0) {
        field3231++;
        boolean var2 = true;
        class470 var3 = this.field3235.field1592;
        synchronized (this.field3235.field1592) {
            int var4 = 0;
            while (true) {
                if (var4 >= 5) {
                    break;
                }
                if (this.field3233[var4] != -1 && !this.field3235.field1592.method2749(0, 18406, this.field3233[var4])) {
                    var2 = false;
                }
                var4++;
            }
        }
        if (arg0 != -17116) {
            this.method1286((byte) 90);
        }
        return var2;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLjava/awt/Component;)Lhn;", line = 41)
    public static final class278 method1283(boolean arg0, Component arg1) {
        field3226++;
        if (arg0) {
            method1287(48, 102, (byte) 49, (byte[]) null);
        }
        return new class427(arg1);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)Lkp;", line = 60)
    public final class10 method1284(byte arg0) {
        field3234++;
        if (this.field3228 == null) {
            return null;
        }
        class10[] var2 = new class10[this.field3228.length];
        class470 var3 = this.field3235.field1592;
        synchronized (this.field3235.field1592) {
            int var4 = 0;
            while (true) {
                if (this.field3228.length <= var4) {
                    break;
                }
                var2[var4] = class85.method430(0, this.field3235.field1592, -111, this.field3228[var4]);
                var4++;
            }
        }
        class10 var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new class10(var2, var2.length);
        }
        if (arg0 != -87) {
            this.method1288(6);
        }
        if (var5 == null) {
            return null;
        }
        if (this.field3227 != null) {
            for (int var6 = 0; var6 < this.field3227.length; var6++) {
                var5.method74(this.field3227[var6], arg0 ^ 0x26, this.field3237[var6]);
            }
        }
        if (this.field3225 != null) {
            for (int var7 = 0; var7 < this.field3225.length; var7++) {
                var5.method82(true, this.field3225[var7], this.field3223[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILvt;)V", line = 126)
    public final void method1285(int arg0, class179 arg1) {
        if (arg0 != -26793) {
            method1283(false, (Component) null);
        }
        while (true) {
            int var3 = arg1.method895((byte) -98);
            if (var3 == 0) {
                field3232++;
                return;
            }
            this.method1289(arg1, var3, (byte) 12);
        }
    }

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "(B)Z", line = 151)
    public final boolean method1286(byte arg0) {
        field3236++;
        if (this.field3228 == null) {
            return true;
        }
        boolean var2 = true;
        class470 var3 = this.field3235.field1592;
        synchronized (this.field3235.field1592) {
            for (int var4 = 0; var4 < this.field3228.length; var4++) {
                if (!this.field3235.field1592.method2749(0, 18406, this.field3228[var4])) {
                    var2 = false;
                }
            }
            if (arg0 != 63) {
                this.method1282(126);
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIB[B)I", line = 180)
    public static final int method1287(int arg0, int arg1, byte arg2, byte[] arg3) {
        field3230++;
        int var4 = -1;
        if (arg2 == -13) {
            for (int var5 = arg1; var5 < arg0; var5++) {
                var4 = var4 >>> 8 ^ class94.field1176[(arg3[var5] ^ var4) & 0xFF];
            }
            return ~var4;
        } else {
            return 2;
        }
    }

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "(I)Lkp;", line = 208)
    public final class10 method1288(int arg0) {
        field3224++;
        class10[] var2 = new class10[5];
        int var3 = 0;
        class470 var4 = this.field3235.field1592;
        synchronized (this.field3235.field1592) {
            int var5 = 0;
            if (arg0 != -16988) {
                return null;
            }
            while (var5 < 5) {
                if (this.field3233[var5] != -1) {
                    var2[var3++] = class85.method430(0, this.field3235.field1592, -77, this.field3233[var5]);
                }
                var5++;
            }
        }
        class10 var7 = new class10(var2, var3);
        if (this.field3227 != null) {
            for (int var8 = 0; var8 < this.field3227.length; var8++) {
                var7.method74(this.field3227[var8], -71, this.field3237[var8]);
            }
        }
        if (this.field3225 != null) {
            for (int var9 = 0; var9 < this.field3225.length; var9++) {
                var7.method82(true, this.field3225[var9], this.field3223[var9]);
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lvt;IB)V", line = 274)
    private final void method1289(class179 arg0, int arg1, byte arg2) {
        int var4 = 21 / ((-arg2 - 35) / 44);
        field3229++;
        if (arg1 == 1) {
            arg0.method895((byte) -111);
        } else if (arg1 == 2) {
            int var9 = arg0.method895((byte) -86);
            this.field3228 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3228[var10] = arg0.method916(21933);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var5 = arg0.method895((byte) -75);
                this.field3237 = new short[var5];
                this.field3227 = new short[var5];
                for (int var6 = 0; var6 < var5; var6++) {
                    this.field3227[var6] = (short) arg0.method916(21933);
                    this.field3237[var6] = (short) arg0.method916(21933);
                }
                return;
            }
            if (arg1 == 41) {
                int var7 = arg0.method895((byte) -82);
                this.field3223 = new short[var7];
                this.field3225 = new short[var7];
                for (int var8 = 0; var8 < var7; var8++) {
                    this.field3225[var8] = (short) arg0.method916(21933);
                    this.field3223[var8] = (short) arg0.method916(21933);
                }
                return;
            }
            if (arg1 >= 60 && arg1 < 70) {
                this.field3233[arg1 - 60] = arg0.method916(21933);
                return;
            }
        }
    }
}
