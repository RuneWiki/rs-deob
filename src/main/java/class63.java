import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class63 extends class243 {

    @OriginalMember(owner = "client!ng", name = "bb", descriptor = "I")
    private int field1150 = 0;

    @OriginalMember(owner = "client!ng", name = "Y", descriptor = "I")
    private int field1147 = 0;

    @OriginalMember(owner = "client!ng", name = "hb", descriptor = "I")
    private int field1156 = 2048;

    @OriginalMember(owner = "client!ng", name = "jb", descriptor = "I")
    private int field1158 = 12288;

    @OriginalMember(owner = "client!ng", name = "lb", descriptor = "I")
    private int field1160 = 2048;

    @OriginalMember(owner = "client!ng", name = "qb", descriptor = "I")
    private int field1165 = 8192;

    @OriginalMember(owner = "client!ng", name = "pb", descriptor = "I")
    private int field1164 = 4096;

    @OriginalMember(owner = "client!ng", name = "cb", descriptor = "Lub;")
    public static class227 field1151 = class257.method1749(" zuerst von Ihrer Ignorieren)2Liste(Q", 17263);

    @OriginalMember(owner = "client!ng", name = "kb", descriptor = "I")
    public static int field1159 = 0;

    @OriginalMember(owner = "client!ng", name = "nb", descriptor = "Lub;")
    public static class227 field1162 = class257.method1749("underlay)3dat", 17263);

    @OriginalMember(owner = "client!ng", name = "ab", descriptor = "[I")
    public static int[] field1149 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!ng", name = "Z", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!ng", name = "db", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!ng", name = "fb", descriptor = "I")
    public static int field1154;

    @OriginalMember(owner = "client!ng", name = "gb", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!ng", name = "ib", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!ng", name = "mb", descriptor = "I")
    public static int field1161;

    @OriginalMember(owner = "client!ng", name = "ob", descriptor = "I")
    public static int field1163;

    @OriginalMember(owner = "client!ng", name = "eb", descriptor = "[I")
    public static int[] field1153;

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(II)I")
    public static final int method397(int arg0, int arg1) {
        ++field1154;
        int var2 = 123 / ((55 - arg1) / 41);
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V")
    public final void method170(boolean arg0) {
        ++field1155;
        if (arg0) {
            this.method170(false);
        }
        class87.method522(56);
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(IBI)Z")
    private final boolean method398(int arg0, byte arg1, int arg2) {
        if (arg1 != 11) {
            return true;
        } else {
            ++field1148;
            int var4 = (-arg2 + arg0) * this.field1158 >> 12;
            int var5 = class43.field716[var4 * 255 >> 12 & 255];
            int var6 = (var5 << 12) / this.field1158;
            int var7 = (var6 << 12) / this.field1165;
            int var8 = this.field1164 * var7 >> 12;
            return ~(arg0 + arg2) > ~var8 && -var8 < arg2 - -arg0;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(ILqa;)I")
    public static final int method399(int arg0, class225 arg1) {
        ++field1161;
        int var2 = arg1.field3828;
        int var3 = -111 / ((arg0 - -23) / 39);
        if (~arg1.field82 == ~arg1.field61) {
            var2 = arg1.field3803;
        } else if (~arg1.field96 == ~arg1.field82) {
            var2 = arg1.field3804;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ng", name = "<init>", descriptor = "()V")
    public class63() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "(III)Z")
    private final boolean method400(int arg0, int arg1, int arg2) {
        ++field1157;
        int var4 = (arg0 + arg1) * this.field1158 >> 12;
        int var5 = class43.field716[var4 * 255 >> 12 & 255];
        int var6 = 113 % ((arg2 - 2) / 52);
        int var7 = (var5 << 12) / this.field1158;
        int var8 = (var7 << 12) / this.field1165;
        int var9 = this.field1164 * var8 >> 12;
        return ~var9 < ~(-arg1 + arg0) && -var9 < -arg1 + arg0;
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(II)[I")
    public final int[] method77(int arg0, int arg1) {
        int var3 = 120 % ((arg0 - -15) / 51);
        ++field1163;
        int[] var4 = super.field4215.method984(arg1, 0);
        if (super.field4215.field2707) {
            int var5 = class148.field2582[arg1] - 2048;
            for (int var6 = 0; class212.field3586 > var6; ++var6) {
                int var7 = class212.field3585[var6] - 2048;
                int var8 = this.field1150 + var5;
                int var9 = ~var8 > 2047 ? var8 + 4096 : var8;
                int var10 = this.field1147 + var7;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var9 >= -2049 ? var9 : var9 + -4096;
                int var13 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var14 = this.field1156 + var5;
                int var15 = var14 < -2048 ? var14 + 4096 : var14;
                int var16 = this.field1160 + var7;
                int var17 = var16 >= -2048 ? var16 : var16 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 + -4096;
                int var19 = ~var15 < -2049 ? var15 + -4096 : var15;
                var4[var6] = !this.method398(var12, (byte) 11, var18) && !this.method400(var19, var13, -74) ? 0 : 4096;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Lnj;ZI)V")
    public final void method81(class226 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field1165 = arg0.method1447(0);
                                }
                            } else {
                                this.field1164 = arg0.method1447(0);
                            }
                        } else {
                            this.field1158 = arg0.method1447(0);
                        }
                    } else {
                        this.field1156 = arg0.method1447(0);
                    }
                } else {
                    this.field1147 = arg0.method1447(0);
                }
            } else {
                this.field1150 = arg0.method1447(0);
            }
        } else {
            this.field1160 = arg0.method1447(0);
        }
        if (arg1) {
            field1149 = null;
        }
        ++field1152;
    }

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "(B)V")
    public static void method401(byte arg0) {
        field1153 = null;
        field1149 = null;
        field1162 = null;
        field1151 = null;
        if (arg0 != -78) {
            method397(-83, -42);
        }
    }
}
