import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class112 extends class288 {

    @OriginalMember(owner = "client!ai", name = "F", descriptor = "I")
    private int field1927 = 0;

    @OriginalMember(owner = "client!ai", name = "K", descriptor = "I")
    private int field1932 = 0;

    @OriginalMember(owner = "client!ai", name = "D", descriptor = "I")
    private int field1925 = 20;

    @OriginalMember(owner = "client!ai", name = "C", descriptor = "I")
    private int field1924 = 1365;

    @OriginalMember(owner = "client!ai", name = "E", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!ai", name = "G", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!ai", name = "H", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!ai", name = "I", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!ai", name = "J", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!ai", name = "L", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method807(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1930;
        int var8 = -23 % ((-17 - arg3) / 35);
        if (class280.method1870(115, arg2)) {
            client.method1503(class133.field2204[arg2], -1, arg0, arg4, arg7, arg5, arg1, arg6);
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(II)[I")
    public final int[] method26(int arg0, int arg1) {
        ++field1933;
        if (arg0 != 0) {
            return null;
        } else {
            int[] var3 = super.field4609.method579((byte) -62, arg1);
            if (super.field4609.field1059) {
                for (int var4 = 0; ~class186.field2986 < ~var4; ++var4) {
                    int var5 = (class246.field3958[var4] << 12) / this.field1924 + this.field1932;
                    int var6 = var5;
                    int var7 = var5;
                    int var8 = (class1.field15[arg1] << 12) / this.field1924 + this.field1927;
                    int var9 = var8;
                    int var10 = var8;
                    int var11 = var5 * var5 >> 12;
                    int var12 = var8 * var8 >> 12;
                    int var13 = 0;
                    while (~(var11 - -var12) > -16385 && var13 < this.field1925) {
                        var10 = (var7 * var10 >> 12) * 2 + var9;
                        var7 = -var12 + var6 + var11;
                        ++var13;
                        var12 = var10 * var10 >> 12;
                        var11 = var7 * var7 >> 12;
                    }
                    var3[var4] = ~(this.field1925 + -1) >= ~var13 ? 0 : (var13 << 12) / this.field1925;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(Lhi;BI)V")
    public final void method20(class264 arg0, byte arg1, int arg2) {
        ++field1928;
        if (arg1 == -19) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 != 2) {
                        if (~arg2 == -4) {
                            this.field1927 = arg0.method1777(-114);
                        }
                    } else {
                        this.field1932 = arg0.method1777(-99);
                    }
                } else {
                    this.field1925 = arg0.method1777(-62);
                }
            } else {
                this.field1924 = arg0.method1777(arg1 + -38);
            }
        }
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class112() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ai", name = "f", descriptor = "(I)I")
    public static final int method808(int arg0) {
        if (arg0 != 0) {
            return 41;
        } else {
            ++field1931;
            return class76.field1044;
        }
    }

    @OriginalMember(owner = "client!ai", name = "b", descriptor = "(BII)V")
    public static final void method809(byte arg0, int arg1, int arg2) {
        if (arg0 != -29) {
            method807(68, -33, 101, 91, 78, 0, 80, 96);
        }
        ++field1926;
        for (int var3 = 0; ~class94.field1356 < ~var3; ++var3) {
            class244 var4 = class184.method1260((byte) -121, var3);
            if (var4 != null) {
                int var5 = var4.field3909;
                if (var5 >= 0 && !class145.field2350.method308((byte) 115, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field3906 < 0) {
                    if (var5 >= 0) {
                        var6 = class145.field2347[class6.method41(class145.field2350.method310(64, var5), arg0 + -83, 96)];
                    } else if (~var4.field3911 == 0) {
                        var6 = -1;
                    } else {
                        int var7 = var4.field3911;
                        int var8 = (127 & var7) + arg2;
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (~var8 < -128) {
                            var8 = 127;
                        }
                        int var9 = (64512 & arg1 + var7) + (896 & var7) + var8;
                        var6 = class145.field2347[class6.method41(var9, -125, 96)];
                    }
                } else {
                    int var10 = var4.field3906;
                    int var11 = (var10 & 127) - -arg2;
                    if (~var11 > -1) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (896 & var10) + ((arg1 + var10 & 64512) - -var11);
                    var6 = class145.field2347[class6.method41(var12, -92, 96)];
                }
                class280.field4479[var3 + 1] = var6;
            }
        }
    }
}
