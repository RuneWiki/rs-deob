import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class84 extends class105 {

    @OriginalMember(owner = "client!jc", name = "ab", descriptor = "I")
    private int field1781 = 0;

    @OriginalMember(owner = "client!jc", name = "lb", descriptor = "I")
    private int field1792 = 1;

    @OriginalMember(owner = "client!jc", name = "mb", descriptor = "I")
    private int field1793 = 0;

    @OriginalMember(owner = "client!jc", name = "db", descriptor = "Leh;")
    public static class47 field1784 = class195.method1282((byte) -4, "me");

    @OriginalMember(owner = "client!jc", name = "hb", descriptor = "I")
    public static int field1788 = 0;

    @OriginalMember(owner = "client!jc", name = "bb", descriptor = "Leh;")
    public static class47 field1782 = class195.method1282((byte) -4, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!jc", name = "fb", descriptor = "I")
    public static volatile int field1786 = 0;

    @OriginalMember(owner = "client!jc", name = "kb", descriptor = "[Leh;")
    public static class47[] field1791 = new class47[1000];

    @OriginalMember(owner = "client!jc", name = "jb", descriptor = "Leh;")
    public static class47 field1790 = class195.method1282((byte) -4, "Mem:");

    @OriginalMember(owner = "client!jc", name = "Y", descriptor = "I")
    public static int field1779;

    @OriginalMember(owner = "client!jc", name = "Z", descriptor = "I")
    public static int field1780;

    @OriginalMember(owner = "client!jc", name = "cb", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!jc", name = "eb", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!jc", name = "gb", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!jc", name = "ib", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V")
    public final void method13(int arg0) {
        ++field1780;
        if (arg0 != -1) {
            this.method17(-126, (class68) null, 71);
        }
        class185.method1227((byte) -75);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILhd;I)V")
    public final void method17(int arg0, class68 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field1792 = arg1.method604((byte) -25);
                }
            } else {
                this.field1793 = arg1.method604((byte) -124);
            }
        } else {
            this.field1781 = arg1.method604((byte) -124);
        }
        if (arg2 != -256) {
            field1782 = null;
        }
        ++field1785;
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V")
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(B)V")
    public static final void method697(byte arg0) {
        ++field1779;
        int var1 = class52.field1014.method116(class196.field3813);
        for (int var2 = 0; class95.field1971 > var2; ++var2) {
            int var6 = class52.field1014.method116(class100.method810(var2, false));
            if (~var6 < ~var1) {
                var1 = var6;
            }
        }
        if (arg0 < 90) {
            field1787 = 121;
        }
        var1 += 8;
        class80.field1726 = true;
        class79.field1694 = class95.field1971 * 15 + 22;
        class152.field2967 = var1;
        int var3 = class95.field1971 * 15 + 21;
        int var4 = class3.field29 - var1 / 2;
        int var5 = class185.field3546;
        if (var3 + var5 > 503) {
            var5 = -var3 + 503;
        }
        if (~(var1 + var4) < -766) {
            var4 = -var1 + 765;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        if (~var5 > -1) {
            var5 = 0;
        }
        class105.field2182 = var4;
        class76.field1648 = var5;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ILeh;Lah;Leh;)Lfb;")
    public static final class50 method698(int arg0, class47 arg1, class9 arg2, class47 arg3) {
        int var4 = arg2.method75(arg1, 31499);
        int var5 = arg2.method77(arg3, var4, true);
        ++field1789;
        return arg0 > -92 ? null : class22.method219(var4, arg2, var5, (byte) 127);
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(Z)V")
    public static void method699(boolean arg0) {
        field1784 = null;
        field1791 = null;
        field1782 = null;
        if (!arg0) {
            method699(true);
        }
        field1790 = null;
    }

    @OriginalMember(owner = "client!jc", name = "c", descriptor = "(III)V")
    public static final void method700(int arg0, int arg1, int arg2) {
        class152 var3 = class173.field3351[arg0][arg1][arg2];
        if (var3 != null) {
            for (int var4 = 0; var4 < var3.field2975; ++var4) {
                class60 var5 = var3.field2979[var4];
                if ((var5.field1157 >> 29 & 3L) == 2L && var5.field1172 == arg1 && var5.field1170 == arg2) {
                    class99.method805(var5);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)[I")
    public final int[] method92(int arg0, byte arg1) {
        int[] var3 = super.field2192.method336(-56, arg0);
        if (arg1 < 78) {
            return null;
        } else {
            if (super.field2192.field770) {
                int var4 = class26.field500[arg0];
                int var5 = var4 - 2048 >> 1;
                for (int var6 = 0; class149.field2928 > var6; ++var6) {
                    int var7 = class167.field3237[var6];
                    int var8 = var7 + -2048 >> 1;
                    int var11;
                    if (~this.field1781 != -1) {
                        int var9 = var8 * var8 - -(var5 * var5) >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) (var9 / 4096)));
                        var11 = (int) ((double) (this.field1792 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (-var4 + var7) * this.field1792;
                    }
                    int var12 = var11 - (-4096 & var11);
                    if (this.field1793 != 0) {
                        if (~this.field1793 == -3) {
                            var12 -= 2048;
                            if (var12 < 0) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class192.field3717[(4089 & var12) >> 4] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            ++field1783;
            return var3;
        }
    }
}
