import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class119 extends class264 {

    @OriginalMember(owner = "client!u", name = "J", descriptor = "Lcf;")
    public static class93 field2113 = class147.method1066("_labels", -48);

    @OriginalMember(owner = "client!u", name = "N", descriptor = "Z")
    public static boolean field2117 = true;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "I")
    public static int field2121 = 0;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!u", name = "S", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!u", name = "T", descriptor = "Z")
    public static boolean field2123;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "[Ltb;")
    private class69[] field2115;

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(II)Lcf;")
    public static final class93 method885(int arg0, int arg1) {
        if (arg1 > -59) {
            return null;
        } else {
            ++field2122;
            class93 var2 = new class93();
            var2.field1629 = 0;
            var2.field1683 = new byte[arg0];
            return var2;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field2119;
        int[] var3 = super.field4716.method532((byte) 77, arg0);
        if (super.field4716.field1424) {
            this.method888(51, super.field4716.method534(1));
        }
        if (arg1 >= -83) {
            method887(-122);
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        if (arg0 < 11) {
            method885(-58, -29);
        }
        ++field2120;
        if (arg1 == 0) {
            this.field2115 = new class69[arg2.method1907(16832)];
            for (int var4 = 0; ~this.field2115.length < ~var4; ++var4) {
                int var5 = arg2.method1907(16832);
                if (var5 != 0) {
                    if (~var5 != -2) {
                        if (~var5 != -3) {
                            if (~var5 == -4) {
                                this.field2115[var4] = class214.method1511(arg2, (byte) 96);
                            }
                        } else {
                            this.field2115[var4] = class110.method789((byte) -125, arg2);
                        }
                    } else {
                        this.field2115[var4] = class73.method496(arg2, -88);
                    }
                } else {
                    this.field2115[var4] = class199.method1429(-117, arg2);
                }
            }
        } else if (arg1 == 1) {
            super.field4698 = ~arg2.method1907(16832) == -2;
        }
    }

    @OriginalMember(owner = "client!u", name = "f", descriptor = "(I)V")
    public static final void method886(int arg0) {
        int var1 = class213.method1503(126);
        if (~var1 != -1) {
            if (var1 == 1) {
                class214.method1510((byte) 0, arg0 + 13962);
                class249.method1691(512, arg0 ^ 13857);
                class233.method1592(arg0 ^ -13858);
            } else {
                class214.method1510((byte) (class278.field4975 - 4 & 255), 104);
                class249.method1691(2, -1);
            }
        } else {
            class42.field659 = null;
            class249.method1691(0, arg0 + 13857);
        }
        if (arg0 != -13858) {
            field2121 = -126;
        }
        ++field2116;
    }

    @OriginalMember(owner = "client!u", name = "g", descriptor = "(I)V")
    public static void method887(int arg0) {
        field2113 = null;
        if (arg0 <= 79) {
            field2123 = false;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "()V")
    public class119() {
        super(0, true);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        ++field2118;
        int[][] var3 = super.field4705.method1089(arg0, 49);
        if (super.field4705.field2670) {
            int var4 = class176.field3060;
            int var5 = class67.field1231;
            int[][][] var6 = super.field4705.method1090((byte) 95);
            int[][] var7 = new int[var5][var4];
            this.method888(51, var7);
            for (int var8 = 0; ~var8 > ~class67.field1231; ++var8) {
                int[] var9 = var7[var8];
                int[][] var10 = var6[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[2];
                int[] var13 = var10[0];
                for (int var14 = 0; ~var14 > ~class176.field3060; ++var14) {
                    int var15 = var9[var14];
                    var12[var14] = class58.method333(var15, 255) << 4;
                    var11[var14] = class58.method333(var15, 65280) >> 4;
                    var13[var14] = class58.method333(var15 >> 12, 4080);
                }
            }
        }
        if (arg1) {
            field2117 = true;
        }
        return var3;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I[[I)V")
    private final void method888(int arg0, int[][] arg1) {
        ++field2114;
        int var3 = class176.field3060;
        if (arg0 < 39) {
            method886(32);
        }
        int var4 = class67.field1231;
        class141.method1023(arg1, (byte) -123);
        class97.method711(0, class55.field910, class53.field881, (byte) -94, 0);
        if (this.field2115 != null) {
            for (int var5 = 0; this.field2115.length > var5; ++var5) {
                class69 var6 = this.field2115[var5];
                int var7 = var6.field1253;
                int var8 = var6.field1254;
                if (var8 < 0) {
                    if (var7 >= 0) {
                        var6.method470(var3, var4, 8);
                    }
                } else if (~var7 <= -1) {
                    var6.method467((byte) -101, var4, var3);
                } else {
                    var6.method465(var4, -124, var3);
                }
            }
        }
    }
}
