import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class273 implements class159 {

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "Z")
    private boolean field4302 = false;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    private int field4315 = 50;

    @OriginalMember(owner = "client!tj", name = "C", descriptor = "Lqh;")
    private class201 field4329;

    @OriginalMember(owner = "client!tj", name = "L", descriptor = "Lqh;")
    private class201 field4338;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "Lrk;")
    private class270 field4311;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "Lrk;")
    private class270 field4323;

    @OriginalMember(owner = "client!tj", name = "F", descriptor = "[Z")
    private boolean[] field4332;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "[Z")
    private boolean[] field4313;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "[B")
    private byte[] field4314;

    @OriginalMember(owner = "client!tj", name = "K", descriptor = "[Z")
    private boolean[] field4337;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "[B")
    private byte[] field4303;

    @OriginalMember(owner = "client!tj", name = "E", descriptor = "[B")
    private byte[] field4331;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "[Z")
    private boolean[] field4319;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[S")
    private short[] field4307;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "[Z")
    private boolean[] field4317;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "[B")
    private byte[] field4305;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4301 = "K";

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field4310 = 0;

    @OriginalMember(owner = "client!tj", name = "J", descriptor = "I")
    public static int field4336 = 0;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "I")
    public static int field4312;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "I")
    public static int field4320;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "I")
    public static int field4322;

    @OriginalMember(owner = "client!tj", name = "x", descriptor = "I")
    public static int field4324;

    @OriginalMember(owner = "client!tj", name = "y", descriptor = "I")
    public static int field4325;

    @OriginalMember(owner = "client!tj", name = "z", descriptor = "I")
    public static int field4326;

    @OriginalMember(owner = "client!tj", name = "A", descriptor = "I")
    public static int field4327;

    @OriginalMember(owner = "client!tj", name = "B", descriptor = "I")
    public static int field4328;

    @OriginalMember(owner = "client!tj", name = "D", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!tj", name = "G", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!tj", name = "H", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!tj", name = "I", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "[I")
    public static int[] field4321;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "[[[B")
    public static byte[][][] field4306;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(BI)Z")
    public final boolean method1115(byte arg0, int arg1) {
        if (arg0 != 83) {
            method1842(-109, true, -52, 33, -78, -18, true);
        }
        field4318++;
        return this.field4332[arg1];
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Z)V")
    public final void method1839(boolean arg0) {
        this.field4311.method1827((byte) 117);
        if (this.field4323 != null) {
            this.field4323.method1827((byte) 117);
        }
        field4326++;
        if (!arg0) {
            this.field4307 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZI)Lbk;")
    private final class20 method1840(boolean arg0, int arg1) {
        field4322++;
        class20 var3 = (class20) this.field4311.method1832((long) arg1, (byte) 126);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field4338.method1357(0, arg1, -1);
        if (var4 == null) {
            return null;
        }
        class221 var5 = new class221(var4);
        if (arg0) {
            class20 var6 = new class20(var5);
            this.field4311.method1831((long) arg1, var6, 128);
            return var6;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "(II)Z")
    public final boolean method1114(int arg0, int arg1) {
        field4309++;
        class20 var3 = this.method1840(true, arg0);
        if (arg1 == 0) {
            return var3 == null ? false : var3.method192((byte) 119, this, this.field4329);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(FIB)[I")
    public final int[] method1110(float arg0, int arg1, byte arg2) {
        field4308++;
        class20 var4 = this.method1840(true, arg1);
        if (var4 == null) {
            return null;
        }
        var4.field345 = true;
        if (arg2 != 36) {
            this.method1109(-9, -22);
        }
        return var4.method195(this.field4329, arg0, -7942, this, this.field4302 || this.field4317[arg1]);
    }

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "(II)I")
    public final int method1113(int arg0, int arg1) {
        field4304++;
        if (arg1 != 65535) {
            this.method1112(76, -34);
        }
        return this.field4307[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "(II)I")
    public static final int method1841(int arg0, int arg1) {
        field4320++;
        if (arg1 > -111) {
            field4306 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(II)Z")
    public final boolean method1112(int arg0, int arg1) {
        int var3 = 73 % ((arg0 - 2) / 37);
        field4312++;
        return this.field4319[arg1];
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IZIIIIZ)V")
    public static final void method1842(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        if (arg0 > arg5) {
            int var7 = arg5;
            int var8 = (arg0 + arg5) / 2;
            class78 var9 = class286.field4527[var8];
            class286.field4527[var8] = class286.field4527[arg0];
            class286.field4527[arg0] = var9;
            for (int var10 = arg5; var10 < arg0; var10++) {
                if (class279.method1882(class286.field4527[var10], arg1, arg6, 255, arg4, arg3, var9) <= 0) {
                    class78 var11 = class286.field4527[var10];
                    class286.field4527[var10] = class286.field4527[var7];
                    class286.field4527[var7++] = var11;
                }
            }
            class286.field4527[arg0] = class286.field4527[var7];
            class286.field4527[var7] = var9;
            method1842(var7 - 1, arg1, -1, arg3, arg4, arg5, arg6);
            method1842(arg0, arg1, -1, arg3, arg4, var7 + 1, arg6);
        }
        if (arg2 == -1) {
            field4316++;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lqh;ILqh;)V")
    public static final void method1843(class201 arg0, int arg1, class201 arg2) {
        class27.field429 = arg2;
        class36.field694 = arg0;
        field4324++;
        if (arg1 != 18781) {
            method1844(-61);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    public static void method1844(int arg0) {
        if (arg0 <= 4) {
            method1842(-89, false, -52, 114, 71, -111, true);
        }
        field4301 = null;
        field4321 = null;
        field4306 = null;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static final void method1845(byte arg0) {
        class230.field3794++;
        class68.field1113.method534((byte) -95, 238);
        for (class258 var1 = (class258) class128.field2062.method1404(106); var1 != null; var1 = (class258) class128.field2062.method1412(-100)) {
            if (var1.field4109 == 0) {
                class66.method461(-27002, true, var1);
            }
        }
        if (arg0 > -70) {
            field4321 = null;
        }
        if (class207.field3333 != null) {
            class280.method1886(class207.field3333, 32);
            class207.field3333 = null;
        }
        field4333++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BI)Z")
    public final boolean method1111(byte arg0, int arg1) {
        if (arg0 < 75) {
            this.field4315 = 16;
        }
        field4327++;
        return this.field4302 || this.field4317[arg1];
    }

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "(ZI)V")
    public final void method1846(boolean arg0, int arg1) {
        int var3 = 85 / ((arg1 + 39) / 41);
        field4330++;
        this.field4302 = arg0;
        this.method1839(true);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)[I")
    public final int[] method1109(int arg0, int arg1) {
        field4334++;
        if (arg1 == 65535) {
            class20 var3 = this.method1840(true, arg0);
            return var3 == null ? null : var3.method193(this, 0, this.field4302 || this.field4317[arg0], this.field4329);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "(II)V")
    public final void method1847(int arg0, int arg1) {
        field4335++;
        for (class20 var3 = (class20) this.field4311.method1825((byte) -49); var3 != null; var3 = (class20) this.field4311.method1826(true)) {
            if (var3.field345) {
                var3.method196(arg0, -10414);
                var3.field345 = false;
            }
        }
        if (arg1 < 122) {
            this.field4329 = null;
        }
    }

    @OriginalMember(owner = "client!tj", name = "<init>", descriptor = "(Lqh;Lqh;Lqh;IZ)V")
    public class273(class201 arg0, class201 arg1, class201 arg2, int arg3, boolean arg4) {
        this.field4302 = arg4;
        this.field4329 = arg2;
        this.field4315 = arg3;
        this.field4338 = arg0;
        this.field4311 = new class270(this.field4315);
        this.field4323 = null;
        class221 var6 = new class221(arg1.method1357(0, 0, -1));
        int var7 = var6.method1521((byte) 113);
        this.field4332 = new boolean[var7];
        this.field4313 = new boolean[var7];
        this.field4314 = new byte[var7];
        this.field4337 = new boolean[var7];
        this.field4303 = new byte[var7];
        this.field4331 = new byte[var7];
        this.field4319 = new boolean[var7];
        this.field4307 = new short[var7];
        this.field4317 = new boolean[var7];
        this.field4305 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field4313[var8] = var6.method1517((byte) -96) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field4313[var9]) {
                this.field4332[var9] = var6.method1517((byte) -96) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field4313[var10]) {
                this.field4319[var10] = var6.method1517((byte) -96) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field4313[var11]) {
                this.field4317[var11] = var6.method1517((byte) -96) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field4313[var12]) {
                this.field4337[var12] = var6.method1517((byte) -96) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field4313[var13]) {
                this.field4331[var13] = var6.method1535((byte) -100);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field4313[var14]) {
                this.field4314[var14] = var6.method1535((byte) -126);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field4313[var15]) {
                this.field4303[var15] = var6.method1535((byte) -94);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field4313[var16]) {
                this.field4305[var16] = var6.method1535((byte) -103);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field4313[var17]) {
                this.field4307[var17] = (short) var6.method1521((byte) 113);
            }
        }
    }
}
