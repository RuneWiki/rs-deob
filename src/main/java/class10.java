import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class10 implements class233 {

    @OriginalMember(owner = "client!ce", name = "C", descriptor = "Z")
    private boolean field203 = false;

    @OriginalMember(owner = "client!ce", name = "x", descriptor = "I")
    private int field198 = 50;

    @OriginalMember(owner = "client!ce", name = "v", descriptor = "Ln;")
    private class138 field196;

    @OriginalMember(owner = "client!ce", name = "w", descriptor = "Ln;")
    private class138 field197;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Lpf;")
    private class168 field211;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[B")
    private byte[] field180;

    @OriginalMember(owner = "client!ce", name = "I", descriptor = "[Z")
    private boolean[] field209;

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "[B")
    private byte[] field210;

    @OriginalMember(owner = "client!ce", name = "k", descriptor = "[Z")
    private boolean[] field185;

    @OriginalMember(owner = "client!ce", name = "q", descriptor = "[Z")
    private boolean[] field191;

    @OriginalMember(owner = "client!ce", name = "G", descriptor = "[S")
    private short[] field207;

    @OriginalMember(owner = "client!ce", name = "u", descriptor = "[Z")
    private boolean[] field195;

    @OriginalMember(owner = "client!ce", name = "F", descriptor = "[B")
    private byte[] field206;

    @OriginalMember(owner = "client!ce", name = "z", descriptor = "[Z")
    private boolean[] field200;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[B")
    private byte[] field179;

    @OriginalMember(owner = "client!ce", name = "o", descriptor = "[I")
    public static int[] field189 = new int[2000];

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "Lub;")
    public static class227 field181 = class257.method1749("l", 17263);

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "Lub;")
    public static class227 field178 = class257.method1749("hitbar_default", 17263);

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lub;")
    public static class227 field176 = class257.method1749("::fpson", 17263);

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "[Z")
    public static boolean[] field182 = new boolean[100];

    @OriginalMember(owner = "client!ce", name = "t", descriptor = "Lta;")
    public static class105 field194 = null;

    @OriginalMember(owner = "client!ce", name = "l", descriptor = "Lub;")
    public static class227 field186 = class257.method1749(" loggt sich ein)3", 17263);

    @OriginalMember(owner = "client!ce", name = "N", descriptor = "Lub;")
    private static class227 field214 = class257.method1749("Continue", 17263);

    @OriginalMember(owner = "client!ce", name = "O", descriptor = "Lub;")
    public static class227 field215 = field214;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ce", name = "m", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ce", name = "n", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ce", name = "p", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ce", name = "r", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!ce", name = "s", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!ce", name = "y", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ce", name = "A", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!ce", name = "B", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!ce", name = "E", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ce", name = "H", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ce", name = "L", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ce", name = "M", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Ln;")
    public static class138 field175;

    @OriginalMember(owner = "client!ce", name = "D", descriptor = "[Lnf;")
    public static class213[] field204;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(II)Z")
    public final boolean method37(int arg0, int arg1) {
        field187++;
        if (arg0 < 83) {
            this.field185 = null;
        }
        return this.field195[arg1];
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method38(byte arg0) {
        field176 = null;
        field189 = null;
        field204 = null;
        field182 = null;
        field181 = null;
        field214 = null;
        field175 = null;
        field178 = null;
        field194 = null;
        if (arg0 > -9) {
            method44(-119);
        }
        field215 = null;
        field186 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        class191 var3 = this.method43(false, arg1);
        if (arg0 < 100) {
            return null;
        } else {
            field177++;
            return var3 == null ? null : var3.method1211(this.field203 || this.field200[arg1], this.field197, this, 128);
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(B)V")
    public final void method40(byte arg0) {
        this.field211.method1039((byte) -49);
        field201++;
        if (arg0 != -98) {
            this.method46((byte) -45, 58);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZFI)[I")
    public final int[] method41(boolean arg0, float arg1, int arg2) {
        field213++;
        class191 var4 = this.method43(false, arg2);
        if (var4 == null) {
            return null;
        } else {
            var4.field3235 = arg0;
            return var4.method1216(this.field197, this, 124, arg1, this.field203 || this.field200[arg2]);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IB)Z")
    public final boolean method42(int arg0, byte arg1) {
        if (arg1 <= 42) {
            this.method50((byte) 4, 95);
        }
        field190++;
        return this.field203 || this.field200[arg0];
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(ZI)Lab;")
    private final class191 method43(boolean arg0, int arg1) {
        field208++;
        class191 var3 = (class191) this.field211.method1037(104, (long) arg1);
        if (arg0) {
            return null;
        } else if (var3 == null) {
            byte[] var4 = this.field196.method884(0, 121, arg1);
            if (var4 == null) {
                return null;
            } else {
                class226 var5 = new class226(var4);
                class191 var6 = new class191(var5);
                this.field211.method1032(-810, var6, (long) arg1);
                return var6;
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static final void method44(int arg0) {
        field183++;
        if (arg0 != 4339) {
            return;
        }
        class83.method508();
        for (int var1 = 0; var1 < 4; var1++) {
            class78.field1370[var1].method835(-127);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BZ)V")
    public final void method45(byte arg0, boolean arg1) {
        field192++;
        this.field203 = arg1;
        this.method40((byte) -98);
        if (arg0 <= 95) {
            this.field206 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(BI)Z")
    public final boolean method46(byte arg0, int arg1) {
        if (arg0 != 24) {
            field181 = null;
        }
        field199++;
        class191 var3 = this.method43(false, arg1);
        return var3 == null ? false : var3.method1214(64, this, this.field197);
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(IB)I")
    public static final int method47(int arg0, byte arg1) {
        field205++;
        if (arg1 != 109) {
            field184 = -109;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(IB)Z")
    public final boolean method48(int arg0, byte arg1) {
        field193++;
        int var3 = 118 % ((68 - arg1) / 38);
        return this.field185[arg0];
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "(II)V")
    public final void method49(int arg0, int arg1) {
        class191 var3 = (class191) this.field211.method1033(-27791);
        if (arg1 != -7710) {
            return;
        }
        while (var3 != null) {
            if (var3.field3235) {
                var3.method1212(false, arg0);
                var3.field3235 = false;
            }
            var3 = (class191) this.field211.method1035(1);
        }
        field188++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(BI)I")
    public final int method50(byte arg0, int arg1) {
        field202++;
        if (arg0 >= -65) {
            this.field207 = null;
        }
        return this.field207[arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Ln;Ln;Ln;IZ)V")
    public class10(class138 arg0, class138 arg1, class138 arg2, int arg3, boolean arg4) {
        this.field196 = arg0;
        this.field203 = arg4;
        this.field197 = arg2;
        this.field198 = arg3;
        this.field211 = new class168(this.field198);
        class226 var6 = new class226(arg1.method884(0, 113, 0));
        int var7 = var6.method1447(0);
        this.field180 = new byte[var7];
        this.field209 = new boolean[var7];
        this.field210 = new byte[var7];
        this.field185 = new boolean[var7];
        this.field191 = new boolean[var7];
        this.field207 = new short[var7];
        this.field195 = new boolean[var7];
        this.field206 = new byte[var7];
        this.field200 = new boolean[var7];
        this.field179 = new byte[var7];
        for (int var8 = 0; var8 < var7; var8++) {
            this.field209[var8] = var6.method1471(255) == 1;
        }
        for (int var9 = 0; var9 < var7; var9++) {
            if (this.field209[var9]) {
                this.field195[var9] = var6.method1471(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var7; var10++) {
            if (this.field209[var10]) {
                this.field185[var10] = var6.method1471(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var7; var11++) {
            if (this.field209[var11]) {
                this.field200[var11] = var6.method1471(255) == 1;
            }
        }
        for (int var12 = 0; var12 < var7; var12++) {
            if (this.field209[var12]) {
                this.field191[var12] = var6.method1471(255) == 1;
            }
        }
        for (int var13 = 0; var13 < var7; var13++) {
            if (this.field209[var13]) {
                this.field206[var13] = var6.method1428(false);
            }
        }
        for (int var14 = 0; var14 < var7; var14++) {
            if (this.field209[var14]) {
                this.field210[var14] = var6.method1428(false);
            }
        }
        for (int var15 = 0; var15 < var7; var15++) {
            if (this.field209[var15]) {
                this.field179[var15] = var6.method1428(false);
            }
        }
        for (int var16 = 0; var16 < var7; var16++) {
            if (this.field209[var16]) {
                this.field180[var16] = var6.method1428(false);
            }
        }
        for (int var17 = 0; var17 < var7; var17++) {
            if (this.field209[var17]) {
                this.field207[var17] = (short) var6.method1447(0);
            }
        }
    }
}
