import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class165 extends class76 {

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "I")
    private int field2872 = 2048;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "I")
    private int field2878 = 10;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
    private int field2882 = 0;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "Lia;")
    public static class257 field2873 = class28.method234(115, "<br>");

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    public static int field2879 = 0;

    @OriginalMember(owner = "client!og", name = "lb", descriptor = "Lia;")
    public static class257 field2885 = class28.method234(100, "sl_flags");

    @OriginalMember(owner = "client!og", name = "ob", descriptor = "Lia;")
    public static class257 field2888 = class28.method234(-59, "Lade Benutzeroberfl-=che )2 ");

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    public static int field2875;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!og", name = "jb", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!og", name = "mb", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!og", name = "nb", descriptor = "I")
    public static int field2887;

    @OriginalMember(owner = "client!og", name = "pb", descriptor = "I")
    public static int field2889;

    @OriginalMember(owner = "client!og", name = "qb", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "[I")
    private int[] field2876;

    @OriginalMember(owner = "client!og", name = "kb", descriptor = "[I")
    private int[] field2884;

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class165() {
        super(0, true);
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I[I[BIIIIIIZI)V")
    public static final void method1127(int arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, int arg10) {
        ++field2883;
        int var11 = ((16711935 & arg10) * arg4 & -16711936) + ((65280 & arg10) * arg4 & 16711680) >> 8;
        int var12 = -arg4 + 256;
        if (!arg9) {
            field2873 = null;
        }
        for (int var13 = -arg0; ~var13 > -1; ++var13) {
            for (int var14 = -arg5; var14 < 0; ++var14) {
                if (~arg2[arg3++] == -1) {
                    ++arg7;
                } else {
                    int var15 = arg1[arg7];
                    arg1[arg7++] = var11 + (class30.method252(16711680, class30.method252(65280, var15) * var12) + class30.method252(-16711936, var12 * class30.method252(var15, 16711935)) >> 8);
                }
            }
            arg7 += arg6;
            arg3 += arg8;
        }
    }

    @OriginalMember(owner = "client!og", name = "i", descriptor = "(I)V")
    public static void method1128(int arg0) {
        if (arg0 > 19) {
            field2885 = null;
            field2873 = null;
            field2888 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(B)V")
    public static final void method1129(byte arg0) {
        ++field2881;
        int var1 = class250.field4308.method278((byte) -128);
        if (var1 != 0) {
            ++class233.field3999;
            class205.field3524.method908(false, 78);
            if (arg0 >= -68) {
                method1130(70, -95, 67, 35, 62, -22, (byte) 87, 118);
            }
            class205.field3524.method1023(13195, 0);
            int var2 = class205.field3524.field2677;
            class220 var3 = (class220) class250.field4308.method285(0);
            class205.field3524.method1065(var3.field3726, 1210792072);
            int var4 = var3.field3726;
            int var5 = 0;
            class220 var6;
            while ((var6 = (class220) class250.field4308.method285(0)) != null) {
                if (var5 < 255 && var4 + 1 == var6.field3726) {
                    ++var5;
                } else {
                    class205.field3524.method1023(13195, var5);
                    class205.field3524.method1065(var6.field3726, 1210792072);
                    var5 = 0;
                }
                var4 = var6.field3726;
            }
            class205.field3524.method1023(13195, var5);
            class205.field3524.method1074(-99, -var2 + class205.field3524.field2677);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method1130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        ++field2874;
        if (class31.method258(arg1, 0)) {
            client.method581(class28.field539[arg1], -1, arg0, arg7, arg2, arg5, arg3, arg4);
            if (arg6 <= 56) {
                method1127(-4, (int[]) null, (byte[]) null, 17, 52, -112, 25, 90, -83, false, -14);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        ++field2889;
        this.method1131(false);
        if (arg0 != 111) {
            field2886 = -34;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        ++field2890;
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (arg0 != -9351) {
            return null;
        } else {
            if (super.field1467.field2980) {
                int var4 = class10.field197[arg1];
                if (~this.field2882 != -1) {
                    for (int var5 = 0; class96.field1807 > var5; ++var5) {
                        int var6 = 0;
                        int var7 = class137.field2457[var5];
                        short var8 = 0;
                        int var9 = this.field2882;
                        if (var9 != 1) {
                            if (~var9 != -3) {
                                if (~var9 == -4) {
                                    var6 = (-var4 + var7 >> 1) + 2048;
                                }
                            } else {
                                var6 = (var7 - (4096 - var4) >> 1) + 2048;
                            }
                        } else {
                            var6 = var7;
                        }
                        for (int var10 = 0; ~this.field2878 < ~var10; ++var10) {
                            if (var6 >= this.field2876[var10] && ~this.field2876[var10 + 1] < ~var6) {
                                if (~var6 > ~this.field2884[var10]) {
                                    var8 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var5] = var8;
                    }
                } else {
                    short var11 = 0;
                    for (int var12 = 0; this.field2878 > var12; ++var12) {
                        if (var4 >= this.field2876[var12] && ~this.field2876[var12 + 1] < ~var4) {
                            if (~var4 > ~this.field2884[var12]) {
                                var11 = 4096;
                            }
                            break;
                        }
                    }
                    class86.method645(var3, 0, class96.field1807, var11);
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        if (arg1 > -86) {
            this.field2872 = -103;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    this.field2882 = arg0.method1051((byte) 100);
                }
            } else {
                this.field2872 = arg0.method1063(-17162);
            }
        } else {
            this.field2878 = arg0.method1051((byte) 117);
        }
        ++field2877;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Z)V")
    private final void method1131(boolean arg0) {
        if (arg0) {
            this.field2878 = -104;
        }
        this.field2876 = new int[this.field2878 + 1];
        int var2 = 0;
        this.field2884 = new int[this.field2878 + 1];
        ++field2880;
        int var3 = 4096 / this.field2878;
        int var4 = this.field2872 * var3 >> 12;
        for (int var5 = 0; ~var5 > ~this.field2878; ++var5) {
            this.field2876[var5] = var2;
            this.field2884[var5] = var2 + var4;
            var2 += var3;
        }
        this.field2876[this.field2878] = 4096;
        this.field2884[this.field2878] = this.field2884[0] + 4096;
    }
}
