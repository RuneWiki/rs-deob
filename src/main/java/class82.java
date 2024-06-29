import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class82 extends class220 {

    @OriginalMember(owner = "client!df", name = "ab", descriptor = "I")
    private int field1160 = 0;

    @OriginalMember(owner = "client!df", name = "V", descriptor = "I")
    private int field1155 = 0;

    @OriginalMember(owner = "client!df", name = "R", descriptor = "I")
    private int field1151 = 2000;

    @OriginalMember(owner = "client!df", name = "cb", descriptor = "I")
    private int field1162 = 16;

    @OriginalMember(owner = "client!df", name = "db", descriptor = "I")
    private int field1163 = 4096;

    @OriginalMember(owner = "client!df", name = "U", descriptor = "I")
    public static int field1154 = -1;

    @OriginalMember(owner = "client!df", name = "bb", descriptor = "[I")
    public static int[] field1161 = new int[3];

    @OriginalMember(owner = "client!df", name = "P", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!df", name = "S", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!df", name = "T", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!df", name = "W", descriptor = "I")
    public static int field1156;

    @OriginalMember(owner = "client!df", name = "X", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!df", name = "Y", descriptor = "I")
    public static int field1158;

    @OriginalMember(owner = "client!df", name = "Z", descriptor = "I")
    public static int field1159;

    @OriginalMember(owner = "client!df", name = "Q", descriptor = "Lrs;")
    public static class239 field1150;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(B)V", line = 5)
    public static void method518(byte arg0) {
        field1150 = null;
        if (arg0 == -127) {
            field1161 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Ltr;", line = 19)
    public static final class139 method519(Throwable arg0, String arg1) {
        ++field1156;
        class139 var2;
        if (arg0 instanceof class139) {
            var2 = (class139) arg0;
            var2.field1860 = var2.field1860 + ' ' + arg1;
        } else {
            var2 = new class139(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!df", name = "d", descriptor = "(I)V", line = 42)
    public final void method440(int arg0) {
        class261.method1638(arg0);
        ++field1149;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(IBLil;)V", line = 51)
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field1159;
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 == -5) {
                            this.field1163 = arg2.method1685(arg1 + 8153);
                        }
                    } else {
                        this.field1155 = arg2.method1685(arg1 ^ -8089);
                    }
                } else {
                    this.field1162 = arg2.method1697(arg1 + -46);
                }
            } else {
                this.field1151 = arg2.method1685(8104);
            }
        } else {
            this.field1160 = arg2.method1697(114);
        }
        if (arg1 != -49) {
            method521(-60);
        }
    }

    @OriginalMember(owner = "client!df", name = "<init>", descriptor = "()V", line = 113)
    public class82() {
        super(0, true);
    }

    @OriginalMember(owner = "client!df", name = "c", descriptor = "(II)[I", line = 116)
    public final int[] method43(int arg0, int arg1) {
        ++field1153;
        if (arg0 != -11543) {
            field1150 = null;
        }
        int[] var3 = super.field3125.method2005(arg1, (byte) -101);
        if (super.field3125.field4676) {
            int var4 = this.field1163 >> 1;
            int[][] var5 = super.field3125.method2006((byte) 46);
            Random var6 = new Random((long) this.field1160);
            for (int var7 = 0; ~var7 > ~this.field1151; ++var7) {
                int var8 = this.field1163 <= 0 ? this.field1155 : -var4 + this.field1155 + class205.method1296(2044605728, var6, this.field1163);
                int var9 = var8 >> 4 & 255;
                int var10 = class205.method1296(2044605728, var6, class344.field5043);
                int var11 = class205.method1296(arg0 ^ -2044598327, var6, class110.field1518);
                int var12 = (class30.field520[var9] * this.field1162 >> 12) + var10;
                int var13 = var11 - -(class442.field6459[var9] * this.field1162 >> 12);
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (var15 != 0 || var14 != 0) {
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (~var12 > ~var10) {
                        int var19 = var10;
                        var10 = var12;
                        int var20 = var11;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class205.method1296(arg0 ^ -2044598327, var6, 4096) >> 2) + 1024;
                    if (var23 < 0) {
                        var23 = -var23;
                    }
                    int var27 = var11 >= var13 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + 1024 + var26;
                        int var30 = var28 & class392.field5887;
                        int var31 = class315.field4510 & var21;
                        var24 += var23;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        if (~var24 < -1) {
                            var21 -= -var27;
                            var24 += -var22;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!df", name = "g", descriptor = "(B)[Ldk;", line = 262)
    public static final class432[] method520(byte arg0) {
        if (class247.field3442 == null) {
            class432[] var1 = class442.method2794(class361.field5285, -31353);
            class432[] var2 = new class432[var1.length];
            int var3 = 0;
            label67: for (int var4 = 0; ~var4 > ~var1.length; ++var4) {
                class432 var8 = var1[var4];
                if ((var8.field6376 <= 0 || var8.field6376 >= 24) && var8.field6371 >= 800 && var8.field6374 >= 600 && (~class160.field2099 <= -97 || class265.field3854 != 0 || ~var8.field6371 >= -1025 && var8.field6374 <= 768)) {
                    for (int var9 = 0; var9 < var3; ++var9) {
                        class432 var10 = var2[var9];
                        if (~var8.field6371 == ~var10.field6371 && var8.field6374 == var10.field6374) {
                            if (~var8.field6376 < ~var10.field6376) {
                                var2[var9] = var8;
                            }
                            continue label67;
                        }
                    }
                    var2[var3] = var8;
                    ++var3;
                }
            }
            class247.field3442 = new class432[var3];
            class111.method772(var2, 0, class247.field3442, 0, var3);
            int[] var5 = new int[class247.field3442.length];
            for (int var6 = 0; ~class247.field3442.length < ~var6; ++var6) {
                class432 var7 = class247.field3442[var6];
                var5[var6] = var7.field6374 * var7.field6371;
            }
            class281.method1800(2175, var5, class247.field3442);
        }
        if (arg0 < 61) {
            field1161 = null;
        }
        ++field1152;
        return class247.field3442;
    }

    @OriginalMember(owner = "client!df", name = "e", descriptor = "(I)V", line = 342)
    public static final void method521(int arg0) {
        if (arg0 != 2) {
            field1150 = null;
        }
        ++field1158;
        class24 var1 = class353.field5183;
        synchronized (class353.field5183) {
            class353.field5183.method204((byte) 56);
        }
        class24 var2 = class280.field4116;
        synchronized (class280.field4116) {
            class280.field4116.method204((byte) 56);
        }
    }

    @OriginalMember(owner = "client!df", name = "f", descriptor = "(I)V", line = 362)
    public static final void method522(int arg0) {
        class79.field1084 = null;
        class451.field6578 = null;
        class40.field639 = null;
        if (arg0 >= -14) {
            field1150 = null;
        }
        class128.field1703 = null;
        class436.field6402 = null;
        class269.field3934 = null;
        class300.field4296 = null;
        class176.field2310 = null;
        class405.field6089 = null;
        class370.field5512 = null;
        ++field1157;
        class327.field4702 = null;
        class31.field527 = null;
    }
}
