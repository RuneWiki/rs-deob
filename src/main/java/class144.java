import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class144 implements class32 {

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    private int field2119 = 50;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "Z")
    private boolean field2127 = false;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "Ldl;")
    private class123 field2117;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "Ldl;")
    private class123 field2114;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "Lvj;")
    private class115 field2110;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "Lvj;")
    private class115 field2125;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "[Z")
    private boolean[] field2106;

    @OriginalMember(owner = "client!w", name = "E", descriptor = "[S")
    private short[] field2133;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "[B")
    private byte[] field2128;

    @OriginalMember(owner = "client!w", name = "B", descriptor = "[Z")
    private boolean[] field2130;

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[Z")
    private boolean[] field2113;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "[B")
    private byte[] field2123;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "[Z")
    private boolean[] field2111;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "[B")
    private byte[] field2124;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "[Z")
    private boolean[] field2116;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "[B")
    private byte[] field2115;

    @OriginalMember(owner = "client!w", name = "A", descriptor = "[Lcl;")
    public static class194[] field2129 = new class194[4];

    @OriginalMember(owner = "client!w", name = "D", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field2126;

    @OriginalMember(owner = "client!w", name = "C", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!w", name = "F", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "Lma;")
    public static class188 field2118;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Llj;Ljava/lang/String;Z)I")
    public static final int method956(class25 arg0, String arg1, boolean arg2) {
        field2112++;
        int var3 = arg0.field349;
        byte[] var4 = class63.method437((byte) -120, arg1);
        arg0.method170((byte) 77, var4.length);
        if (!arg2) {
            field2118 = null;
        }
        arg0.field349 += class151.field2242.method1121(arg0.field349, var4, 1, 0, var4.length, arg0.field339);
        return arg0.field349 - var3;
    }

    @OriginalMember(owner = "client!w", name = "d", descriptor = "(II)Lf;")
    private final class36 method957(int arg0, int arg1) {
        field2120++;
        class36 var3 = (class36) this.field2110.method765((long) arg1, 0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field2114.method807((byte) 85, arg0, arg1);
        if (var4 == null) {
            return null;
        } else {
            class25 var5 = new class25(var4);
            class36 var6 = new class36(var5);
            this.field2110.method763(-43, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ZI)V")
    public final void method958(boolean arg0, int arg1) {
        if (arg1 == -15345) {
            this.field2127 = arg0;
            field2122++;
            this.method960((byte) -105);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIZII)I")
    public static final int method959(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            method959(-98, 113, true, -3, 114);
        }
        field2105++;
        int var5 = 65536 - class171.field2680[arg4 * 1024 / arg1] >> 1;
        return ((65536 - var5) * arg3 >> 16) + (arg0 * var5 >> 16);
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(BI)[I")
    public final int[] method260(byte arg0, int arg1) {
        field2109++;
        class36 var3 = this.method957(0, arg1);
        if (var3 == null) {
            return null;
        } else if (arg0 == -110) {
            return var3.method283(this, this.field2127 || this.field2111[arg1], (byte) 78, this.field2117);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!w", name = "b", descriptor = "(II)Z")
    public final boolean method261(int arg0, int arg1) {
        if (arg1 >= -26) {
            method956((class25) null, (String) null, false);
        }
        field2107++;
        return this.field2116[arg0];
    }

    @OriginalMember(owner = "client!w", name = "c", descriptor = "(II)Z")
    public final boolean method262(int arg0, int arg1) {
        field2126++;
        int var3 = -123 / ((46 - arg1) / 41);
        return this.field2127 || this.field2111[arg0];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BIF)[I")
    public final int[] method257(byte arg0, int arg1, float arg2) {
        if (arg0 != 112) {
            this.field2117 = null;
        }
        class36 var4 = this.method957(0, arg1);
        field2103++;
        if (var4 == null) {
            return null;
        } else {
            var4.field475 = true;
            return var4.method286(false, arg2, this, this.field2127 || this.field2111[arg1], this.field2117);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(B)V")
    public final void method960(byte arg0) {
        field2104++;
        this.field2110.method767(18345);
        if (this.field2125 != null) {
            this.field2125.method767(18345);
        }
        if (arg0 != -105) {
            this.method957(93, 70);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(I)V")
    public static void method961(int arg0) {
        field2118 = null;
        if (arg0 != 0) {
            field2129 = null;
        }
        field2129 = null;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(II)Z")
    public final boolean method258(int arg0, int arg1) {
        field2121++;
        class36 var3 = this.method957(0, arg0);
        if (arg1 != -7786) {
            this.field2128 = null;
        }
        return var3 == null ? false : var3.method289((byte) 117, this, this.field2117);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)Z")
    public final boolean method263(int arg0, byte arg1) {
        int var3 = -89 / ((20 - arg1) / 58);
        field2134++;
        return this.field2130[arg0];
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(BI)I")
    public final int method259(byte arg0, int arg1) {
        field2131++;
        int var3 = 8 % ((arg0 + 23) / 37);
        return this.field2133[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!w", name = "e", descriptor = "(II)V")
    public final void method962(int arg0, int arg1) {
        field2108++;
        class36 var3 = (class36) this.field2110.method761(2);
        if (arg1 >= -18) {
            this.method263(-111, (byte) 25);
        }
        while (var3 != null) {
            if (var3.field475) {
                var3.method279((byte) -62, arg0);
                var3.field475 = false;
            }
            var3 = (class36) this.field2110.method762(1);
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "(Ldl;Ldl;Ldl;IZ)V")
    public class144(class123 arg0, class123 arg1, class123 arg2, int arg3, boolean arg4) {
        this.field2117 = arg2;
        this.field2114 = arg0;
        this.field2119 = arg3;
        this.field2127 = arg4;
        this.field2110 = new class115(this.field2119);
        this.field2125 = null;
        class25 var6 = new class25(arg1.method807((byte) 124, 0, 0));
        int var7 = var6.method190(-3);
        this.field2106 = new boolean[var7];
        this.field2133 = new short[var7];
        this.field2128 = new byte[var7];
        this.field2130 = new boolean[var7];
        this.field2113 = new boolean[var7];
        this.field2123 = new byte[var7];
        this.field2111 = new boolean[var7];
        this.field2124 = new byte[var7];
        this.field2116 = new boolean[var7];
        this.field2115 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field2106[var8] = var6.method201(255) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field2106[var9]) {
                this.field2116[var9] = var6.method201(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field2106[var10]) {
                this.field2130[var10] = var6.method201(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field2106[var11]) {
                this.field2111[var11] = var6.method201(255) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field2106[var12]) {
                this.field2113[var12] = var6.method201(255) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field2106[var13]) {
                this.field2128[var13] = var6.method188(76);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field2106[var14]) {
                this.field2124[var14] = var6.method188(53);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field2106[var15]) {
                this.field2115[var15] = var6.method188(107);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field2106[var16]) {
                this.field2123[var16] = var6.method188(114);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field2106[var17]) {
                this.field2133[var17] = (short) var6.method190(-3);
            }
        }
    }
}
