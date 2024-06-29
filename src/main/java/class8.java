import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class8 extends class82 {

    @OriginalMember(owner = "client!ag", name = "P", descriptor = "I")
    private int field154 = 0;

    @OriginalMember(owner = "client!ag", name = "Y", descriptor = "I")
    private int field163 = 2048;

    @OriginalMember(owner = "client!ag", name = "U", descriptor = "I")
    private int field159 = 12288;

    @OriginalMember(owner = "client!ag", name = "gb", descriptor = "I")
    private int field171 = 2048;

    @OriginalMember(owner = "client!ag", name = "Z", descriptor = "I")
    private int field164 = 0;

    @OriginalMember(owner = "client!ag", name = "pb", descriptor = "I")
    private int field180 = 8192;

    @OriginalMember(owner = "client!ag", name = "V", descriptor = "I")
    private int field160 = 4096;

    @OriginalMember(owner = "client!ag", name = "S", descriptor = "I")
    public static int field157 = 0;

    @OriginalMember(owner = "client!ag", name = "R", descriptor = "Ldj;")
    private static class44 field156 = class89.method650(255, "May");

    @OriginalMember(owner = "client!ag", name = "bb", descriptor = "[Ldj;")
    public static class44[] field166 = new class44[100];

    @OriginalMember(owner = "client!ag", name = "ab", descriptor = "Ldj;")
    public static class44 field165 = class89.method650(255, "Hidden)2");

    @OriginalMember(owner = "client!ag", name = "Q", descriptor = "Ldj;")
    private static class44 field155 = class89.method650(255, "Oct");

    @OriginalMember(owner = "client!ag", name = "db", descriptor = "Ldj;")
    private static class44 field168 = class89.method650(255, "Jul");

    @OriginalMember(owner = "client!ag", name = "ib", descriptor = "Ldj;")
    private static class44 field173 = class89.method650(255, "Nov");

    @OriginalMember(owner = "client!ag", name = "kb", descriptor = "Ldj;")
    private static class44 field175 = class89.method650(255, "Mar");

    @OriginalMember(owner = "client!ag", name = "fb", descriptor = "Ldj;")
    private static class44 field170 = class89.method650(255, "Sep");

    @OriginalMember(owner = "client!ag", name = "cb", descriptor = "Ldj;")
    private static class44 field167 = class89.method650(255, "Feb");

    @OriginalMember(owner = "client!ag", name = "rb", descriptor = "I")
    public static int field182 = 2;

    @OriginalMember(owner = "client!ag", name = "mb", descriptor = "Ldj;")
    private static class44 field177 = class89.method650(255, "Dec");

    @OriginalMember(owner = "client!ag", name = "qb", descriptor = "Ldj;")
    private static class44 field181 = class89.method650(255, "Jun");

    @OriginalMember(owner = "client!ag", name = "ob", descriptor = "Ldj;")
    private static class44 field179 = class89.method650(255, "Aug");

    @OriginalMember(owner = "client!ag", name = "tb", descriptor = "Ldj;")
    private static class44 field184 = class89.method650(255, "Jan");

    @OriginalMember(owner = "client!ag", name = "T", descriptor = "Ldj;")
    private static class44 field158 = class89.method650(255, "Apr");

    @OriginalMember(owner = "client!ag", name = "eb", descriptor = "[Ldj;")
    public static class44[] field169 = new class44[] { field184, field167, field175, field158, field156, field181, field168, field179, field170, field155, field173, field177 };

    @OriginalMember(owner = "client!ag", name = "W", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!ag", name = "X", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!ag", name = "jb", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ag", name = "lb", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ag", name = "nb", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ag", name = "sb", descriptor = "I")
    public static int field183;

    @OriginalMember(owner = "client!ag", name = "ub", descriptor = "I")
    public static int field185;

    @OriginalMember(owner = "client!ag", name = "hb", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field172;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(B)V")
    public final void method78(byte arg0) {
        class71.method558(4096);
        if (arg0 <= 95) {
            this.method2((class66) null, -85, (byte) -42);
        }
        ++field176;
    }

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "(I)Z")
    public static final boolean method79(int arg0) {
        ++field178;
        if (arg0 != -2049) {
            field167 = null;
        }
        try {
            if (~class101.field1851 == -3) {
                if (class187.field3223 == null) {
                    class187.field3223 = class149.method970(class134.field2399, class130.field2320, class52.field940);
                    if (class187.field3223 == null) {
                        return false;
                    }
                }
                if (class200.field3537 == null) {
                    class200.field3537 = new class23(class140.field2508, class50.field920);
                }
                if (class119.field2125.method1228(-1749, class7.field153, 22050, class200.field3537, class187.field3223)) {
                    class119.field2125.method1208(16384);
                    class119.field2125.method1213(-35, class19.field322);
                    class119.field2125.method1211(class174.field3027, 0, class187.field3223);
                    class101.field1851 = 0;
                    class200.field3537 = null;
                    class134.field2399 = null;
                    class187.field3223 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class119.field2125.method1229(1);
            class200.field3537 = null;
            class187.field3223 = null;
            class134.field2399 = null;
            class101.field1851 = 0;
        }
        return false;
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(III)Z")
    private final boolean method80(int arg0, int arg1, int arg2) {
        int var4 = (-arg0 + arg1) * this.field159 >> 12;
        if (arg2 >= -31) {
            this.method2((class66) null, 103, (byte) -28);
        }
        ++field174;
        int var5 = class214.field3863[(1046071 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field159;
        int var7 = (var6 << 12) / this.field180;
        int var8 = this.field160 * var7 >> 12;
        return ~(arg0 + arg1) > ~var8 && ~(arg0 + arg1) < ~(-var8);
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(II)[I")
    public final int[] method3(int arg0, int arg1) {
        ++field162;
        if (arg0 != 25238) {
            this.field171 = 46;
        }
        int[] var3 = super.field1595.method603(true, arg1);
        if (super.field1595.field1538) {
            int var4 = class212.field3809[arg1] + -2048;
            for (int var5 = 0; var5 < class129.field2287; ++var5) {
                int var6 = class49.field912[var5] + -2048;
                int var7 = this.field171 + var6;
                int var8 = var7 < -2048 ? var7 + 4096 : var7;
                int var9 = this.field164 + var4;
                int var10 = ~var9 > 2047 ? var9 - -4096 : var9;
                int var11 = this.field154 + var6;
                int var12 = this.field163 + var4;
                int var13 = ~var8 < -2049 ? var8 - 4096 : var8;
                int var14 = ~var11 <= 2047 ? var11 : var11 + 4096;
                int var15 = var10 <= 2048 ? var10 : var10 + -4096;
                int var16 = ~var12 > 2047 ? var12 + 4096 : var12;
                int var17 = var14 > 2048 ? var14 + -4096 : var14;
                int var18 = ~var16 >= -2049 ? var16 : var16 + -4096;
                var3[var5] = !this.method80(var13, var15, -33) && !this.method83(var17, arg0 + -12160, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "(I)V")
    public static void method81(int arg0) {
        field158 = null;
        field170 = null;
        field172 = null;
        field169 = null;
        field167 = null;
        field181 = null;
        field166 = null;
        field173 = null;
        field177 = null;
        field155 = null;
        field179 = null;
        field168 = null;
        field184 = null;
        field156 = null;
        if (arg0 != -2048) {
            field165 = null;
        }
        field165 = null;
        field175 = null;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method82(boolean arg0, byte[] arg1) {
        ++field161;
        if (!arg0) {
            field167 = null;
        }
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        class18.method146(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "()V")
    public class8() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lfj;IB)V")
    public final void method2(class66 arg0, int arg1, byte arg2) {
        ++field183;
        if (arg2 != 68) {
            method79(37);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field180 = arg0.method500(111);
                                }
                            } else {
                                this.field160 = arg0.method500(107);
                            }
                        } else {
                            this.field159 = arg0.method500(89);
                        }
                    } else {
                        this.field163 = arg0.method500(101);
                    }
                } else {
                    this.field154 = arg0.method500(arg2 + -4);
                }
            } else {
                this.field164 = arg0.method500(104);
            }
        } else {
            this.field171 = arg0.method500(59);
        }
    }

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "(III)Z")
    private final boolean method83(int arg0, int arg1, int arg2) {
        int var4 = (arg2 - -arg0) * this.field159 >> 12;
        ++field185;
        int var5 = class214.field3863[(1045778 & var4 * 255) >> 12];
        if (arg1 != 13078) {
            this.field160 = -126;
        }
        int var6 = (var5 << 12) / this.field159;
        int var7 = (var6 << 12) / this.field180;
        int var8 = this.field160 * var7 >> 12;
        return var8 > -arg0 + arg2 && ~(-arg0 + arg2) < ~(-var8);
    }
}
