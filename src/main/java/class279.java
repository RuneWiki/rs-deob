import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class279 implements class232 {

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "Z")
    private boolean field4921 = false;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    private int field4918 = 50;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "Lsj;")
    private class49 field4914;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "Lsj;")
    private class49 field4905;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "Lbd;")
    private class185 field4917;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Lbd;")
    private class185 field4916;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "[B")
    private byte[] field4926;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "[S")
    private short[] field4925;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "[Z")
    private boolean[] field4898;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "[Z")
    private boolean[] field4920;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "[Z")
    private boolean[] field4923;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "[Z")
    private boolean[] field4895;

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "[B")
    private byte[] field4910;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "[Z")
    private boolean[] field4894;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "[B")
    private byte[] field4909;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "[B")
    private byte[] field4911;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "Lcc;")
    public static class209 field4899 = class95.method669(123, "www)2wtqa");

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "Lcc;")
    public static class209 field4896 = class95.method669(123, "<col=ffb000>");

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "Lcc;")
    public static class209 field4901 = class95.method669(118, " zuerst von Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "I")
    public static int field4919 = -1;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "I")
    public static int field4893;

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field4897;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field4907;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field4908;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field4912;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field4924;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "I")
    public static int field4927;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "Lsj;")
    public static class49 field4902;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ZZ)V")
    public final void method1884(boolean arg0, boolean arg1) {
        field4913++;
        this.field4921 = arg1;
        this.method1888(arg0);
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(II)Z")
    public final boolean method1619(int arg0, int arg1) {
        field4927++;
        if (arg0 <= 35) {
            this.field4911 = null;
        }
        return this.field4921 || this.field4923[arg1];
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)Z")
    public final boolean method1614(int arg0, byte arg1) {
        if (arg1 < 21) {
            return true;
        } else {
            field4924++;
            return this.field4895[arg0];
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)Z")
    public final boolean method1618(int arg0, int arg1) {
        field4912++;
        class86 var3 = this.method1890(arg1, -8774);
        if (var3 == null) {
            return false;
        } else {
            if (arg0 < 0) {
                this.field4894 = null;
            }
            return var3.method621(this.field4905, true, this);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)[I")
    public final int[] method1615(int arg0, int arg1) {
        class86 var3 = this.method1890(arg1, -8774);
        field4900++;
        if (arg0 != 5350) {
            this.field4925 = null;
        }
        return var3 == null ? null : var3.method619(this, this.field4921 || this.field4923[arg1], 18922, this.field4905);
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(II)Lch;")
    public static final class283 method1885(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        }
        field4907++;
        class283 var2 = (class283) class129.field2485.method1257((long) arg0, -117);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class103.field1982.method353(arg0, -104, 0);
        } else {
            var3 = class130.field2495.method353(arg0 & 0x7FFF, arg1 ^ 0x68, 0);
        }
        class283 var4 = new class283();
        if (var3 != null) {
            var4.method1899(8296, new class106(var3));
        }
        if (arg0 >= 32768) {
            var4.method1901((byte) -58);
        }
        class129.field2485.method1259((long) arg0, var4, false);
        return var4;
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(II)V")
    public final void method1886(int arg0, int arg1) {
        for (class86 var3 = (class86) this.field4917.method1263((byte) 40); var3 != null; var3 = (class86) this.field4917.method1264(-36)) {
            if (var3.field1708) {
                var3.method622(arg0, false);
                var3.field1708 = false;
            }
        }
        field4904++;
        if (arg1 != 2) {
            this.method1615(47, 5);
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lal;IBIIILji;)V")
    public static final void method1887(class231 arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class42 arg6) {
        field4906++;
        if (arg0 == null || arg2 < 80) {
            return;
        }
        int var7 = class253.field4565 + class54.field1066 & 0x7FF;
        int var8 = Math.max(arg6.field789 / 2, arg6.field758 / 2) + 10;
        int var9 = arg3 * arg3 + arg5 * arg5;
        if (var9 > (var8 * var8)) {
            return;
        }
        int var10 = class15.field278[var7];
        int var11 = class15.field280[var7];
        int var12 = var11 * 256 / (class132.field2523 + 256);
        int var13 = var10 * 256 / (class132.field2523 + 256);
        int var14 = arg3 * var12 - (arg5 * var13) >> 16;
        int var15 = arg3 * var13 + arg5 * var12 >> 16;
        ((class269) arg0).method1830(arg6.field789 / 2 + var15 + arg4 - (arg0.field4198 / 2), arg6.field758 / 2 + (arg1 - arg0.field4201 / 2) + -var14, arg6.field838, arg6.field757);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IB)I")
    public final int method1620(int arg0, byte arg1) {
        if (arg1 != -69) {
            this.method1618(-102, -102);
        }
        field4903++;
        return this.field4925[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Z)V")
    public final void method1888(boolean arg0) {
        this.field4917.method1260(arg0);
        field4908++;
        if (this.field4916 != null) {
            this.field4916.method1260(arg0);
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(Z)V")
    public static void method1889(boolean arg0) {
        if (arg0) {
            method1887((class231) null, 71, (byte) -95, -117, 29, -74, (class42) null);
        }
        field4902 = null;
        field4899 = null;
        field4901 = null;
        field4896 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IFB)[I")
    public final int[] method1617(int arg0, float arg1, byte arg2) {
        if (arg2 != 63) {
            field4922 = 78;
        }
        field4897++;
        class86 var4 = this.method1890(arg0, -8774);
        if (var4 == null) {
            return null;
        } else {
            var4.field1708 = true;
            return var4.method616(arg1, (byte) -114, this.field4921 || this.field4923[arg0], this, this.field4905);
        }
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(II)Ljd;")
    private final class86 method1890(int arg0, int arg1) {
        class86 var3 = (class86) this.field4917.method1257((long) arg0, -66);
        field4893++;
        if (arg1 != -8774) {
            this.method1884(true, true);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4914.method353(0, arg1 + 8892, arg0);
        if (var4 == null) {
            return null;
        } else {
            class106 var5 = new class106(var4);
            class86 var6 = new class86(var5);
            this.field4917.method1259((long) arg0, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IZ)Z")
    public final boolean method1616(int arg0, boolean arg1) {
        field4915++;
        if (!arg1) {
            this.field4917 = null;
        }
        return this.field4920[arg0];
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(Lsj;Lsj;Lsj;IZ)V")
    public class279(class49 arg0, class49 arg1, class49 arg2, int arg3, boolean arg4) {
        this.field4914 = arg0;
        this.field4921 = arg4;
        this.field4905 = arg2;
        this.field4918 = arg3;
        this.field4917 = new class185(this.field4918);
        this.field4916 = null;
        class106 var6 = new class106(arg1.method353(0, -52, 0));
        int var7 = var6.method736(125);
        this.field4926 = new byte[var7];
        this.field4925 = new short[var7];
        this.field4898 = new boolean[var7];
        this.field4920 = new boolean[var7];
        this.field4923 = new boolean[var7];
        this.field4895 = new boolean[var7];
        this.field4910 = new byte[var7];
        this.field4894 = new boolean[var7];
        this.field4909 = new byte[var7];
        this.field4911 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field4894[var8] = var6.method774((byte) 106) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field4894[var9]) {
                this.field4895[var9] = var6.method774((byte) 100) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field4894[var10]) {
                this.field4920[var10] = var6.method774((byte) 101) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field4894[var11]) {
                this.field4923[var11] = var6.method774((byte) 105) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field4894[var12]) {
                this.field4898[var12] = var6.method774((byte) 111) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field4894[var13]) {
                this.field4909[var13] = var6.method777(83);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field4894[var14]) {
                this.field4926[var14] = var6.method777(96);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field4894[var15]) {
                this.field4911[var15] = var6.method777(71);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field4894[var16]) {
                this.field4910[var16] = var6.method777(113);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field4894[var17]) {
                this.field4925[var17] = (short) var6.method736(123);
            }
        }
    }
}
