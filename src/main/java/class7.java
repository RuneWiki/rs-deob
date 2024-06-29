import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public class class7 implements class236 {

    @OriginalMember(owner = "client!bh", name = "e", descriptor = "I")
    private int field74 = 50;

    @OriginalMember(owner = "client!bh", name = "H", descriptor = "Z")
    private boolean field103 = false;

    @OriginalMember(owner = "client!bh", name = "j", descriptor = "Lfa;")
    private class239 field79;

    @OriginalMember(owner = "client!bh", name = "I", descriptor = "Lfa;")
    private class239 field104;

    @OriginalMember(owner = "client!bh", name = "d", descriptor = "Lci;")
    private class233 field73;

    @OriginalMember(owner = "client!bh", name = "G", descriptor = "Lci;")
    private class233 field102;

    @OriginalMember(owner = "client!bh", name = "n", descriptor = "[B")
    private byte[] field83;

    @OriginalMember(owner = "client!bh", name = "B", descriptor = "[Z")
    private boolean[] field97;

    @OriginalMember(owner = "client!bh", name = "h", descriptor = "[B")
    private byte[] field77;

    @OriginalMember(owner = "client!bh", name = "l", descriptor = "[B")
    private byte[] field81;

    @OriginalMember(owner = "client!bh", name = "E", descriptor = "[Z")
    private boolean[] field100;

    @OriginalMember(owner = "client!bh", name = "o", descriptor = "[Z")
    private boolean[] field84;

    @OriginalMember(owner = "client!bh", name = "s", descriptor = "[S")
    private short[] field88;

    @OriginalMember(owner = "client!bh", name = "A", descriptor = "[B")
    private byte[] field96;

    @OriginalMember(owner = "client!bh", name = "K", descriptor = "[Z")
    private boolean[] field106;

    @OriginalMember(owner = "client!bh", name = "v", descriptor = "[Z")
    private boolean[] field91;

    @OriginalMember(owner = "client!bh", name = "r", descriptor = "Lpj;")
    private static class237 field87 = class33.method353("Hidden", 126);

    @OriginalMember(owner = "client!bh", name = "x", descriptor = "I")
    public static int field93 = 0;

    @OriginalMember(owner = "client!bh", name = "t", descriptor = "Lpj;")
    public static class237 field89 = class33.method353("Untersuchen", 24);

    @OriginalMember(owner = "client!bh", name = "m", descriptor = "Lpj;")
    public static class237 field82 = field87;

    @OriginalMember(owner = "client!bh", name = "F", descriptor = "Lpj;")
    public static class237 field101 = class33.method353("mapdots", 91);

    @OriginalMember(owner = "client!bh", name = "z", descriptor = "[I")
    public static int[] field95 = new int[64];

    @OriginalMember(owner = "client!bh", name = "J", descriptor = "I")
    public static int field105 = -1;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "I")
    public static int field70;

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "I")
    public static int field71;

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "I")
    public static int field72;

    @OriginalMember(owner = "client!bh", name = "f", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!bh", name = "g", descriptor = "I")
    public static int field76;

    @OriginalMember(owner = "client!bh", name = "i", descriptor = "I")
    public static int field78;

    @OriginalMember(owner = "client!bh", name = "k", descriptor = "I")
    public static int field80;

    @OriginalMember(owner = "client!bh", name = "p", descriptor = "I")
    public static int field85;

    @OriginalMember(owner = "client!bh", name = "q", descriptor = "I")
    public static int field86;

    @OriginalMember(owner = "client!bh", name = "u", descriptor = "I")
    public static int field90;

    @OriginalMember(owner = "client!bh", name = "w", descriptor = "I")
    public static int field92;

    @OriginalMember(owner = "client!bh", name = "y", descriptor = "I")
    public static int field94;

    @OriginalMember(owner = "client!bh", name = "C", descriptor = "I")
    public static int field98;

    @OriginalMember(owner = "client!bh", name = "D", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(II)V")
    public final void method76(int arg0, int arg1) {
        for (class273 var3 = (class273) this.field73.method1548(true); var3 != null; var3 = (class273) this.field73.method1547(false)) {
            if (var3.field4722) {
                var3.method1824(arg1, -1);
                var3.field4722 = false;
            }
        }
        field75++;
        if (arg0 < 4) {
            this.method86((byte) -59, -39);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)V")
    public final void method77(int arg0) {
        this.field73.method1550((byte) 106);
        field90++;
        if (this.field102 != null) {
            this.field102.method1550((byte) -36);
        }
        if (arg0 != 0) {
            this.method80((byte) 5, -45);
        }
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(BI)Z")
    public final boolean method78(byte arg0, int arg1) {
        if (arg0 < 90) {
            this.method84(-12, (byte) -82);
        }
        field85++;
        return this.field97[arg1];
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "([Llj;ZIBII[BIIII)V")
    public static final void method79(class25[] arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8, int arg9, int arg10) {
        field70++;
        byte var11;
        if (arg1) {
            var11 = 1;
        } else {
            var11 = 4;
        }
        if (!arg1) {
            for (int var12 = 0; var12 < 8; var12++) {
                for (int var13 = 0; var13 < 8; var13++) {
                    if ((arg10 + var12) > 0 && arg10 + var12 < 103 && arg2 + var13 > 0 && (arg2 + var13) < 103) {
                        arg0[arg7].field470[arg10 + var12][arg2 + var13] = class272.method1817(arg0[arg7].field470[arg10 + var12][arg2 + var13], -16777217);
                    }
                }
            }
        }
        class32 var14 = new class32(arg6);
        if (arg3 != 62) {
            return;
        }
        for (int var15 = 0; var15 < var11; var15++) {
            for (int var16 = 0; var16 < 64; var16++) {
                for (int var17 = 0; var17 < 64; var17++) {
                    if (arg4 == var15 && var16 >= arg5 && var16 < (arg5 + 8) && arg8 <= var17 && (arg8 + 8) > var17) {
                        class6.method72(0, 0, arg3 + 42, class61.method521(var16 & 0x7, var17 & 0x7, arg9, 0) + arg2, arg7, arg1, class269.method1792(arg9, (byte) -120, var17 & 0x7, var16 & 0x7) + arg10, var14, arg9);
                    } else {
                        class6.method72(0, 0, arg3 ^ 0x67, -1, 0, arg1, -1, var14, 0);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BI)I")
    public final int method80(byte arg0, int arg1) {
        field78++;
        if (arg0 >= -58) {
            this.method80((byte) 79, 4);
        }
        return this.field88[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IBI)I")
    public static final int method81(int arg0, byte arg1, int arg2) {
        field99++;
        class44 var3 = (class44) class64.field1280.method568((long) arg0, -1);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field958.length) {
            return arg1 <= 69 ? 90 : var3.field958[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(ZI)Lpf;")
    private final class273 method82(boolean arg0, int arg1) {
        class273 var3 = (class273) this.field73.method1549((long) arg1, 9447);
        field98++;
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = this.field79.method1645(arg0, 0, arg1);
        if (var4 == null) {
            return null;
        } else {
            class32 var5 = new class32(var4);
            class273 var6 = new class273(var5);
            this.field73.method1552((byte) -86, var6, (long) arg1);
            return var6;
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IB)Z")
    public final boolean method83(int arg0, byte arg1) {
        field94++;
        if (arg1 < 56) {
            this.field79 = null;
        }
        return this.field91[arg0];
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(IB)[I")
    public final int[] method84(int arg0, byte arg1) {
        field92++;
        class273 var3 = this.method82(true, arg0);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 < 55) {
                this.field97 = null;
            }
            return var3.method1829(this.field104, 64, this, this.field103 || this.field106[arg0]);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)V")
    public static void method85(byte arg0) {
        field101 = null;
        field89 = null;
        field95 = null;
        if (arg0 != 96) {
            field95 = null;
        }
        field87 = null;
        field82 = null;
    }

    @OriginalMember(owner = "client!bh", name = "c", descriptor = "(BI)Z")
    public final boolean method86(byte arg0, int arg1) {
        if (arg0 >= -103) {
            return false;
        } else {
            field80++;
            return this.field103 || this.field106[arg1];
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(BZ)V")
    public final void method87(byte arg0, boolean arg1) {
        field71++;
        this.field103 = arg1;
        if (arg0 != -42) {
            this.method82(true, -31);
        }
        this.method77(0);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(IB)Z")
    public final boolean method88(int arg0, byte arg1) {
        int var3 = 17 / ((61 - arg1) / 44);
        field86++;
        class273 var4 = this.method82(true, arg0);
        return var4 == null ? false : var4.method1826(this, this.field104, (byte) 60);
    }

    @OriginalMember(owner = "client!bh", name = "b", descriptor = "(II)V")
    public static final void method89(int arg0, int arg1) {
        field76++;
        class44 var2 = (class44) class64.field1280.method568((long) arg0, arg1);
        if (var2 != null) {
            var2.method629(0);
        }
    }

    @OriginalMember(owner = "client!bh", name = "a", descriptor = "(IFB)[I")
    public final int[] method90(int arg0, float arg1, byte arg2) {
        if (arg2 < 15) {
            this.field79 = null;
        }
        field72++;
        class273 var4 = this.method82(true, arg0);
        if (var4 == null) {
            return null;
        } else {
            var4.field4722 = true;
            return var4.method1830((byte) -97, this.field103 || this.field106[arg0], arg1, this.field104, this);
        }
    }

    @OriginalMember(owner = "client!bh", name = "<init>", descriptor = "(Lfa;Lfa;Lfa;IZ)V")
    public class7(class239 arg0, class239 arg1, class239 arg2, int arg3, boolean arg4) {
        this.field79 = arg0;
        this.field74 = arg3;
        this.field103 = arg4;
        this.field104 = arg2;
        this.field73 = new class233(this.field74);
        this.field102 = null;
        class32 var6 = new class32(arg1.method1645(true, 0, 0));
        int var7 = var6.method339(-16777216);
        this.field83 = new byte[var7];
        this.field97 = new boolean[var7];
        this.field77 = new byte[var7];
        this.field81 = new byte[var7];
        this.field100 = new boolean[var7];
        this.field84 = new boolean[var7];
        this.field88 = new short[var7];
        this.field96 = new byte[var7];
        this.field106 = new boolean[var7];
        this.field91 = new boolean[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field84[var8] = var6.method316((byte) -2) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field84[var9]) {
                this.field91[var9] = var6.method316((byte) -32) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field84[var10]) {
                this.field97[var10] = var6.method316((byte) 116) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field84[var11]) {
                this.field106[var11] = var6.method316((byte) 120) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field84[var12]) {
                this.field100[var12] = var6.method316((byte) -106) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field84[var13]) {
                this.field96[var13] = var6.method325(-121);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field84[var14]) {
                this.field77[var14] = var6.method325(74);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field84[var15]) {
                this.field81[var15] = var6.method325(-111);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field84[var16]) {
                this.field83[var16] = var6.method325(-126);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field84[var17]) {
                this.field88[var17] = (short) var6.method339(-16777216);
            }
        }
    }
}
