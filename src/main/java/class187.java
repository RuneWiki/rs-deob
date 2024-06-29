import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class187 implements class15 {

    @OriginalMember(owner = "client!dc", name = "w", descriptor = "I")
    private int field3203 = 50;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "Z")
    private boolean field3214 = false;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "Lma;")
    private class105 field3189;

    @OriginalMember(owner = "client!dc", name = "x", descriptor = "Lma;")
    private class105 field3204;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lqe;")
    private class42 field3188;

    @OriginalMember(owner = "client!dc", name = "v", descriptor = "Lqe;")
    private class42 field3202;

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "[Z")
    private boolean[] field3190;

    @OriginalMember(owner = "client!dc", name = "D", descriptor = "[Z")
    private boolean[] field3210;

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "[B")
    private byte[] field3198;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "[B")
    private byte[] field3197;

    @OriginalMember(owner = "client!dc", name = "u", descriptor = "[Z")
    private boolean[] field3201;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "[B")
    private byte[] field3186;

    @OriginalMember(owner = "client!dc", name = "G", descriptor = "[Z")
    private boolean[] field3213;

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "[Z")
    private boolean[] field3215;

    @OriginalMember(owner = "client!dc", name = "F", descriptor = "[B")
    private byte[] field3212;

    @OriginalMember(owner = "client!dc", name = "E", descriptor = "[S")
    private short[] field3211;

    @OriginalMember(owner = "client!dc", name = "A", descriptor = "Lda;")
    public static class275 field3207 = class255.method1672(113, "<col=ffff00>");

    @OriginalMember(owner = "client!dc", name = "C", descriptor = "Lda;")
    private static class275 field3209 = class255.method1672(114, "scroll:");

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lda;")
    public static class275 field3192 = field3209;

    @OriginalMember(owner = "client!dc", name = "B", descriptor = "Lda;")
    public static class275 field3208 = field3209;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "I")
    public static int field3184;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field3194;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!dc", name = "y", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!dc", name = "z", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lff;")
    public static class269 field3191;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "[[[I")
    public static int[][][] field3181;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "(II)[I")
    public final int[] method76(int arg0, int arg1) {
        field3194++;
        class252 var3 = this.method1242((byte) -64, arg0);
        if (arg1 == -25649) {
            return var3 == null ? null : var3.method1662(this.field3189, (byte) 96, this.field3214 || this.field3213[arg0], this);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IZ)V")
    public final void method1236(int arg0, boolean arg1) {
        field3195++;
        if (arg1) {
            this.method79(-119, -11);
        }
        for (class252 var3 = (class252) this.field3188.method250((byte) -95); var3 != null; var3 = (class252) this.field3188.method242((byte) 116)) {
            if (var3.field4463) {
                var3.method1660(arg0, -115);
                var3.field4463 = false;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Z")
    public final boolean method75(int arg0, byte arg1) {
        if (arg1 != 8) {
            this.method76(81, -119);
        }
        field3200++;
        return this.field3201[arg0];
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(II)Z")
    public final boolean method77(int arg0, int arg1) {
        class252 var3 = this.method1242((byte) -64, arg0);
        field3187++;
        if (var3 == null) {
            return false;
        } else {
            if (arg1 > -55) {
                this.method73(30, 23);
            }
            return var3.method1664(this, this.field3189, 0);
        }
    }

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "(II)I")
    public final int method74(int arg0, int arg1) {
        field3199++;
        if (arg1 != 65535) {
            field3181 = null;
        }
        return this.field3211[arg0] & 0xFFFF;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZIZIZ)Lma;")
    public static final class105 method1237(boolean arg0, int arg1, boolean arg2, int arg3, boolean arg4) {
        class117 var5 = null;
        if (class273.field4724 != null) {
            var5 = new class117(arg3, class273.field4724, class103.field1708[arg3], 1000000);
        }
        if (arg1 != 1) {
            return null;
        }
        class59.field994[arg3] = class46.field772.method87(8361, class249.field4405, var5, arg3);
        if (arg0) {
            class59.field994[arg3].method344(64);
        }
        field3193++;
        return new class105(class59.field994[arg3], arg4, arg2);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(FIB)[I")
    public final int[] method78(float arg0, int arg1, byte arg2) {
        field3206++;
        if (arg2 != -20) {
            return null;
        }
        class252 var4 = this.method1242((byte) -64, arg1);
        if (var4 == null) {
            return null;
        } else {
            var4.field4463 = true;
            return var4.method1661(arg0, false, this, this.field3214 || this.field3213[arg1], this.field3189);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)Z")
    public final boolean method73(int arg0, int arg1) {
        if (arg1 == 0) {
            field3196++;
            return this.field3215[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(II)Z")
    public final boolean method79(int arg0, int arg1) {
        field3185++;
        if (arg1 == 13335) {
            return this.field3214 || this.field3213[arg0];
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lfd;I)V")
    public static final void method1238(class229 arg0, int arg1) {
        field3184++;
        class229 var2 = class127.method915(arg0, 792285968);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class212.field3587;
            var4 = class249.field4391;
        } else {
            var3 = var2.field3980;
            var4 = var2.field3885;
        }
        class118.method870((byte) -31, var4, false, var3, arg0);
        if (arg1 != 0) {
            method1237(false, -115, true, 127, false);
        }
        class168.method1151(var4, var3, arg0, arg1 ^ 0x2F);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(ZI)V")
    public final void method1239(boolean arg0, int arg1) {
        field3205++;
        this.field3214 = arg0;
        if (arg1 == 0) {
            this.method1241((byte) -121);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method1240(int arg0) {
        field3208 = null;
        if (arg0 != 9568) {
            method1240(82);
        }
        field3191 = null;
        field3207 = null;
        field3209 = null;
        field3181 = null;
        field3192 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public final void method1241(byte arg0) {
        field3183++;
        this.field3188.method246((byte) 74);
        if (this.field3202 != null) {
            this.field3202.method246((byte) 74);
        }
        if (arg0 > -97) {
            this.field3215 = null;
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(BI)Lsc;")
    private final class252 method1242(byte arg0, int arg1) {
        class252 var3 = (class252) this.field3188.method252(true, (long) arg1);
        if (arg0 != -64) {
            this.field3186 = null;
        }
        field3182++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field3204.method775(arg1, 0, -24799);
        if (var4 == null) {
            return null;
        } else {
            class85 var5 = new class85(var4);
            class252 var6 = new class252(var5);
            this.field3188.method251(var6, (byte) -45, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lma;Lma;Lma;IZ)V")
    public class187(class105 arg0, class105 arg1, class105 arg2, int arg3, boolean arg4) {
        this.field3189 = arg2;
        this.field3214 = arg4;
        this.field3204 = arg0;
        this.field3203 = arg3;
        this.field3188 = new class42(this.field3203);
        this.field3202 = null;
        class85 var6 = new class85(arg1.method775(0, 0, -24799));
        int var7 = var6.method608(68);
        this.field3190 = new boolean[var7];
        this.field3210 = new boolean[var7];
        this.field3198 = new byte[var7];
        this.field3197 = new byte[var7];
        this.field3201 = new boolean[var7];
        this.field3186 = new byte[var7];
        this.field3213 = new boolean[var7];
        this.field3215 = new boolean[var7];
        this.field3212 = new byte[var7];
        this.field3211 = new short[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field3210[var8] = var6.method564((byte) 125) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field3210[var9]) {
                this.field3215[var9] = var6.method564((byte) 84) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field3210[var10]) {
                this.field3201[var10] = var6.method564((byte) 50) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field3210[var11]) {
                this.field3213[var11] = var6.method564((byte) 104) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field3210[var12]) {
                this.field3190[var12] = var6.method564((byte) 86) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field3210[var13]) {
                this.field3186[var13] = var6.method581(8);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field3210[var14]) {
                this.field3197[var14] = var6.method581(8);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field3210[var15]) {
                this.field3198[var15] = var6.method581(8);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field3210[var16]) {
                this.field3212[var16] = var6.method581(8);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field3210[var17]) {
                this.field3211[var17] = (short) var6.method608(32);
            }
        }
    }
}
