import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wt")
public class class14 extends class355 {

    @OriginalMember(owner = "client!wt", name = "F", descriptor = "I")
    public static int field200 = 16777215;

    @OriginalMember(owner = "client!wt", name = "C", descriptor = "I")
    public static int field197 = 0;

    @OriginalMember(owner = "client!wt", name = "B", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!wt", name = "D", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!wt", name = "E", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!wt", name = "G", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!wt", name = "H", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!wt", name = "I", descriptor = "I")
    public static int field203;

    @OriginalMember(owner = "client!wt", name = "M", descriptor = "I")
    public static int field207;

    @OriginalMember(owner = "client!wt", name = "J", descriptor = "Lce;")
    public class302 field204;

    @OriginalMember(owner = "client!wt", name = "N", descriptor = "Lui;")
    public static class451 field208;

    @OriginalMember(owner = "client!wt", name = "K", descriptor = "[B")
    public byte[] field205;

    @OriginalMember(owner = "client!wt", name = "L", descriptor = "[I")
    public static int[] field206;

    @OriginalMember(owner = "client!wt", name = "g", descriptor = "(I)[B", line = 5)
    public final byte[] method133(int arg0) {
        ++field196;
        if (arg0 != -1) {
            method135((class319[]) null, -65);
        }
        if (super.field5386) {
            throw new RuntimeException();
        } else {
            return this.field205;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(Lvg;I)V", line = 29)
    public static final void method134(class51 arg0, int arg1) {
        ++field199;
        for (int var2 = 0; class270.field3998 > var2; ++var2) {
            int var3 = class392.field5789[var2];
            class257 var4 = class40.field565[var3];
            int var5 = arg0.method2628(49152);
            if (~(var5 & 16) != -1) {
                var5 += arg0.method2628(49152) << 8;
            }
            class226.method1468(arg0, var4, arg1 + 20883, var5, var3);
        }
        if (arg1 != -20733) {
            field200 = 106;
        }
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "([Ldp;I)V", line = 66)
    public static final void method135(class319[] arg0, int arg1) {
        ++field207;
        class82.field1160 = arg0.length;
        class163.field2265 = new class319[class82.field1160 + 10];
        class288.field4395 = new int[class82.field1160 - -10];
        class149.method1008(arg0, 0, class163.field2265, 0, class82.field1160);
        for (int var2 = 0; ~class82.field1160 < ~var2; ++var2) {
            class288.field4395[var2] = class163.field2265[var2].method789();
        }
        int var3 = class82.field1160;
        if (arg1 > -111) {
            method136(-47);
        }
        while (~class163.field2265.length < ~var3) {
            class288.field4395[var3] = 12;
            ++var3;
        }
    }

    @OriginalMember(owner = "client!wt", name = "i", descriptor = "(I)V", line = 94)
    public static void method136(int arg0) {
        field206 = null;
        if (arg0 != 0) {
            field208 = null;
        }
        field208 = null;
    }

    @OriginalMember(owner = "client!wt", name = "a", descriptor = "(IJ)V", line = 106)
    public static final void method137(int arg0, long arg1) {
        ++field203;
        int var3 = class423.field6058 + class472.field6622.field4543;
        int var4 = class324.field4869 + class472.field6622.field4538;
        if (~(-var3 + class312.field4705) > arg0 || ~(-var3 + class312.field4705) < -501 || ~(-var4 + class379.field5641) > 499 || class379.field5641 - var4 > 500) {
            class312.field4705 = var3;
            class379.field5641 = var4;
        }
        if (class312.field4705 != var3) {
            int var5 = -class312.field4705 + var3;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (~var5 >= -1) {
                if (~var6 == -1) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (~var6 == -1) {
                var6 = 1;
            } else if (~var6 < ~var5) {
                var6 = var5;
            }
            class312.field4705 += var6;
        }
        if (!class337.field5038.field3942) {
            class384.field5682 += (float) arg1 * class266.field3955 / 6.0F;
            class412.field5953 += (float) arg1 * class83.field1182 / 6.0F;
        }
        if (class379.field5641 != var4) {
            int var7 = -class379.field5641 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 < -1) {
                if (~var8 != -1) {
                    if (var8 > var7) {
                        var8 = var7;
                    }
                } else {
                    var8 = 1;
                }
            } else if (var8 != 0) {
                if (var8 < var7) {
                    var8 = var7;
                }
            } else {
                var8 = -1;
            }
            class379.field5641 += var8;
        }
        class100.method770(true);
    }

    @OriginalMember(owner = "client!wt", name = "f", descriptor = "(I)I", line = 198)
    public final int method138(int arg0) {
        int var2 = -111 % ((arg0 - 53) / 40);
        ++field201;
        return super.field5386 ? 0 : 100;
    }
}
