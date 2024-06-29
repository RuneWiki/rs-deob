import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class223 extends class222 {

    @OriginalMember(owner = "client!eb", name = "Y", descriptor = "I")
    private int field3848 = 585;

    @OriginalMember(owner = "client!eb", name = "X", descriptor = "Lsb;")
    public static class98 field3847 = class47.method368("www", 0);

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "I")
    public static int field3854 = 0;

    @OriginalMember(owner = "client!eb", name = "Z", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!eb", name = "gb", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "[[B")
    public static byte[][] field3846;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Llj;ZI)V")
    public final void method3(class216 arg0, boolean arg1, int arg2) {
        if (!arg1) {
            if (~arg2 == -1) {
                this.field3848 = arg0.method1487(94);
            }
            ++field3856;
        }
    }

    @OriginalMember(owner = "client!eb", name = "c", descriptor = "(III)I")
    public static final int method1538(int arg0, int arg1, int arg2) {
        if (arg2 != 99) {
            method1538(11, -128, -27);
        }
        ++field3850;
        long var3 = (long) ((arg1 << 16) + arg0);
        return class78.field1397 != null && ~class78.field1397.field4061 == ~var3 ? class26.field511.field3728 * 99 / (class26.field511.field3706.length + -class78.field1397.field581) + 1 : 0;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V")
    public static final void method1539(int arg0) {
        ++field3853;
        class106.field1882.method1554((byte) -109);
        class6.field89.method1554((byte) -109);
        if (arg0 != 0) {
            field3851 = -44;
        }
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "()V")
    public class223() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method1540(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3849;
        if (class141.method1056(arg7, (byte) -59)) {
            if (arg2 > 107) {
                class167.field2979 = null;
                class245.method1703(arg8, arg0, arg4, arg3, (byte) 68, -1, arg5, arg1, class33.field585[arg7], arg6);
                if (class167.field2979 != null) {
                    class245.method1703(arg8, class100.field1758, arg4, arg3, (byte) 68, -1412584499, class121.field2228, arg1, class167.field2979, arg6);
                    class167.field2979 = null;
                }
            }
        } else if (arg3 != -1) {
            class208.field3563[arg3] = true;
        } else {
            for (int var9 = 0; ~var9 > -101; ++var9) {
                class208.field3563[var9] = true;
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(BI)[I")
    public final int[] method7(byte arg0, int arg1) {
        ++field3852;
        if (arg0 < 35) {
            field3846 = null;
        }
        int[] var3 = super.field3844.method22(0, arg1);
        if (super.field3844.field61) {
            int var4 = class214.field3639[arg1];
            for (int var5 = 0; ~class13.field253 < ~var5; ++var5) {
                int var6 = class261.field4577[var5];
                if (var6 > this.field3848 && var6 < -this.field3848 + 4096 && var4 > -this.field3848 + 2048 && ~(this.field3848 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field3848 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (var6 > -this.field3848 + 2048 && ~var6 > ~(this.field3848 + 2048)) {
                    int var11 = var4 + -2048;
                    int var12 = var11 < 0 ? -var11 : var11;
                    int var13 = var12 - this.field3848;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field3848);
                } else if (~var4 <= ~this.field3848 && -this.field3848 + 4096 >= var4) {
                    if (~this.field3848 >= ~var6 && var6 <= -this.field3848 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field3848 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = var19 < 0 ? -var19 : var19;
                    int var21 = var20 - this.field3848;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (-this.field3848 + 2048);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "f", descriptor = "(I)V")
    public static final void method1541(int arg0) {
        class224.field3867 = arg0;
        for (int var1 = 0; var1 < class211.field3610; ++var1) {
            for (int var2 = 0; var2 < class72.field1194; ++var2) {
                if (class31.field553[arg0][var1][var2] == null) {
                    class31.field553[arg0][var1][var2] = new class71(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(B)V")
    public static void method1542(byte arg0) {
        field3847 = null;
        if (arg0 != -74) {
            method1543(121);
        }
        field3846 = null;
    }

    @OriginalMember(owner = "client!eb", name = "g", descriptor = "(I)[Lnj;")
    public static final class82[] method1543(int arg0) {
        class82[] var1 = new class82[class110.field1956];
        ++field3855;
        for (int var2 = arg0; class110.field1956 > var2; ++var2) {
            int var3 = class245.field4326[var2] * class164.field2958[var2];
            int[] var4 = new int[var3];
            byte[] var5 = class204.field3491[var2];
            for (int var6 = 0; var3 > var6; ++var6) {
                var4[var6] = class33.field572[class214.method1427(255, var5[var6])];
            }
            var1[var2] = new class247(class144.field2538, class101.field1790, class253.field4422[var2], class9.field207[var2], class245.field4326[var2], class164.field2958[var2], var4);
        }
        class125.method932(true);
        return var1;
    }
}
