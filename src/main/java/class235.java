import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class235 {

    @OriginalMember(owner = "client!he", name = "c", descriptor = "[I")
    private int[] field2875 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!he", name = "i", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Lau;")
    public class519 field2887;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "Llj;")
    public static class60 field2879;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "[I")
    private int[] field2884;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "[S")
    private short[] field2878;

    @OriginalMember(owner = "client!he", name = "h", descriptor = "[S")
    private short[] field2880;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "[S")
    private short[] field2886;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "[S")
    private short[] field2888;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BII)Z")
    public static final boolean method1394(byte arg0, int arg1, int arg2) {
        field2874++;
        if (arg0 != -74) {
            method1396(-51);
        }
        return (arg2 & 0x20) != 0;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lnp;II)V")
    private final void method1395(class115 arg0, int arg1, int arg2) {
        field2877++;
        if (arg2 != -3) {
            method1397(-75);
        }
        if (arg1 == 1) {
            arg0.method620((byte) -127);
        } else if (arg1 == 2) {
            int var8 = arg0.method620((byte) -127);
            this.field2884 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2884[var9] = arg0.method643((byte) -77);
            }
        } else if (arg1 != 3) {
            if (arg1 == 40) {
                int var4 = arg0.method620((byte) 111);
                this.field2886 = new short[var4];
                this.field2880 = new short[var4];
                for (int var5 = 0; var5 < var4; var5++) {
                    this.field2886[var5] = (short) arg0.method643((byte) -77);
                    this.field2880[var5] = (short) arg0.method643((byte) -77);
                }
                return;
            }
            if (arg1 == 41) {
                int var6 = arg0.method620((byte) -16);
                this.field2878 = new short[var6];
                this.field2888 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field2878[var7] = (short) arg0.method643((byte) -77);
                    this.field2888[var7] = (short) arg0.method643((byte) -77);
                }
            } else if (arg1 >= 60 && arg1 < 70) {
                this.field2875[arg1 - 60] = arg0.method643((byte) -77);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method1396(int arg0) {
        if (arg0 <= 86) {
            field2879 = null;
        }
        field2879 = null;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V")
    public static final void method1397(int arg0) {
        int var1 = -89 % ((-arg0 - 48) / 46);
        for (class273 var2 = (class273) class139.field1529.method3434((byte) 2); var2 != null; var2 = (class273) class139.field1529.method3430(true)) {
            if (var2.field3399) {
                var2.method1606(106);
            }
        }
        field2882++;
        for (class273 var3 = (class273) class689.field9697.method3434((byte) 2); var3 != null; var3 = (class273) class689.field9697.method3430(true)) {
            if (var3.field3399) {
                var3.method1606(-71);
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(I)Z")
    public final boolean method1398(int arg0) {
        field2885++;
        boolean var2 = true;
        class701 var3 = this.field2887.field7383;
        synchronized (this.field2887.field7383) {
            if (arg0 != -1116) {
                field2879 = null;
            }
            for (int var4 = 0; var4 < 5; var4++) {
                if (this.field2875[var4] != -1 && !this.field2887.field7383.method3860(0, (byte) -99, this.field2875[var4])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BLnp;)V")
    public final void method1399(byte arg0, class115 arg1) {
        while (true) {
            int var3 = arg1.method620((byte) 113);
            if (var3 == 0) {
                if (arg0 >= -62) {
                    return;
                }
                field2881++;
                return;
            }
            this.method1395(arg1, var3, -3);
        }
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)Lef;")
    public final class581 method1400(int arg0) {
        field2883++;
        if (this.field2884 == null) {
            return null;
        }
        class581[] var2 = new class581[this.field2884.length];
        class701 var3 = this.field2887.field7383;
        synchronized (this.field2887.field7383) {
            int var4 = 0;
            while (true) {
                if (var4 >= this.field2884.length) {
                    break;
                }
                var2[var4] = class331.method1919(0, (byte) -43, this.field2887.field7383, this.field2884[var4]);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field2884.length; var5++) {
            if (var2[var5].field8264 < 13) {
                var2[var5].method3289(2, -83);
            }
        }
        class581 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class581(var2, var2.length);
        }
        if (arg0 > -113) {
            this.field2880 = null;
        }
        if (var6 == null) {
            return null;
        }
        if (this.field2886 != null) {
            for (int var7 = 0; var7 < this.field2886.length; var7++) {
                var6.method3288(this.field2886[var7], this.field2880[var7], 11580);
            }
        }
        if (this.field2878 != null) {
            for (int var8 = 0; var8 < this.field2878.length; var8++) {
                var6.method3298(this.field2878[var8], (byte) -18, this.field2888[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!he", name = "e", descriptor = "(I)Lef;")
    public final class581 method1401(int arg0) {
        field2876++;
        class581[] var2 = new class581[5];
        int var3 = 0;
        class701 var4 = this.field2887.field7383;
        synchronized (this.field2887.field7383) {
            int var5 = 0;
            while (true) {
                if (var5 >= 5) {
                    break;
                }
                if (this.field2875[var5] != -1) {
                    var2[var3++] = class331.method1919(0, (byte) -43, this.field2887.field7383, this.field2875[var5]);
                }
                var5++;
            }
        }
        int var6 = 0;
        int var7 = 88 / ((arg0 - 35) / 61);
        while (var6 < 5) {
            if (var2[var6] != null && var2[var6].field8264 < 13) {
                var2[var6].method3289(2, -115);
            }
            var6++;
        }
        class581 var8 = new class581(var2, var3);
        if (this.field2886 != null) {
            for (int var9 = 0; var9 < this.field2886.length; var9++) {
                var8.method3288(this.field2886[var9], this.field2880[var9], 11580);
            }
        }
        if (this.field2878 != null) {
            for (int var10 = 0; var10 < this.field2878.length; var10++) {
                var8.method3298(this.field2878[var10], (byte) -18, this.field2888[var10]);
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!he", name = "f", descriptor = "(I)Z")
    public final boolean method1402(int arg0) {
        field2873++;
        if (this.field2884 == null) {
            return true;
        }
        boolean var2 = true;
        class701 var3 = this.field2887.field7383;
        synchronized (this.field2887.field7383) {
            int var4 = 0;
            int var5 = -11 / ((33 - arg0) / 45);
            while (this.field2884.length > var4) {
                if (!this.field2887.field7383.method3860(0, (byte) -99, this.field2884[var4])) {
                    var2 = false;
                }
                var4++;
            }
            return var2;
        }
    }
}
