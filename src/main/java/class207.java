import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class207 extends class27 {

    @OriginalMember(owner = "client!wh", name = "bb", descriptor = "I")
    private int field4051 = 0;

    @OriginalMember(owner = "client!wh", name = "jb", descriptor = "I")
    private int field4059 = 0;

    @OriginalMember(owner = "client!wh", name = "db", descriptor = "I")
    private int field4053 = 0;

    @OriginalMember(owner = "client!wh", name = "S", descriptor = "[I")
    public static int[] field4042 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!wh", name = "P", descriptor = "Lkb;")
    private static class93 field4039 = class76.method390("Please check your message)2centre for details)3", 0);

    @OriginalMember(owner = "client!wh", name = "O", descriptor = "I")
    public static int field4038 = 0;

    @OriginalMember(owner = "client!wh", name = "Q", descriptor = "Lkb;")
    public static class93 field4040 = null;

    @OriginalMember(owner = "client!wh", name = "Z", descriptor = "Lkb;")
    public static class93 field4049 = field4039;

    @OriginalMember(owner = "client!wh", name = "W", descriptor = "Lkb;")
    public static class93 field4046 = class76.method390("Spieler kann nicht gefunden werden: ", 0);

    @OriginalMember(owner = "client!wh", name = "V", descriptor = "Lmd;")
    public static class113 field4045 = new class113(4096);

    @OriginalMember(owner = "client!wh", name = "gb", descriptor = "I")
    public static int field4056 = 0;

    @OriginalMember(owner = "client!wh", name = "mb", descriptor = "[[S")
    public static short[][] field4062 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!wh", name = "lb", descriptor = "Lkb;")
    public static class93 field4061 = class76.method390(" steht bereits auf Ihrer Freunde)2Liste(Q", 0);

    @OriginalMember(owner = "client!wh", name = "nb", descriptor = "I")
    public static int field4063 = 0;

    @OriginalMember(owner = "client!wh", name = "M", descriptor = "I")
    public static int field4036;

    @OriginalMember(owner = "client!wh", name = "N", descriptor = "I")
    private int field4037;

    @OriginalMember(owner = "client!wh", name = "R", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!wh", name = "T", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!wh", name = "U", descriptor = "I")
    private int field4044;

    @OriginalMember(owner = "client!wh", name = "X", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!wh", name = "Y", descriptor = "I")
    public static int field4048;

    @OriginalMember(owner = "client!wh", name = "ab", descriptor = "I")
    public static int field4050;

    @OriginalMember(owner = "client!wh", name = "cb", descriptor = "I")
    public static int field4052;

    @OriginalMember(owner = "client!wh", name = "eb", descriptor = "I")
    private int field4054;

    @OriginalMember(owner = "client!wh", name = "fb", descriptor = "I")
    private int field4055;

    @OriginalMember(owner = "client!wh", name = "hb", descriptor = "I")
    private int field4057;

    @OriginalMember(owner = "client!wh", name = "ib", descriptor = "I")
    private int field4058;

    @OriginalMember(owner = "client!wh", name = "kb", descriptor = "I")
    public static int field4060;

    @OriginalMember(owner = "client!wh", name = "ob", descriptor = "I")
    public static int field4064;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(II)[[I")
    public final int[][] method19(int arg0, int arg1) {
        int var3 = -84 / ((42 - arg0) / 54);
        ++field4041;
        int[][] var4 = super.field436.method537(0, arg1);
        if (super.field436.field1771) {
            int[][] var5 = this.method152(arg1, 0, 122);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var4[0];
            int[] var9 = var5[2];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            for (int var12 = 0; ~var12 > ~class159.field3209; ++var12) {
                this.method1346(var6[var12], (byte) 53, var9[var12], var7[var12]);
                this.field4054 += this.field4059;
                this.field4055 += this.field4051;
                if (~this.field4054 > -1) {
                    this.field4054 = 0;
                }
                while (this.field4055 < 0) {
                    this.field4055 += 4096;
                }
                if (this.field4054 > 4096) {
                    this.field4054 = 4096;
                }
                this.field4057 += this.field4053;
                if (this.field4057 < 0) {
                    this.field4057 = 0;
                }
                if (~this.field4057 < -4097) {
                    this.field4057 = 4096;
                }
                while (this.field4055 > 4096) {
                    this.field4055 -= 4096;
                }
                this.method1345(this.field4055, this.field4054, -6513, this.field4057);
                var8[var12] = this.field4058;
                var10[var12] = this.field4037;
                var11[var12] = this.field4044;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
    public static final void method1343(byte arg0) {
        class59.field942.method41(false);
        if (arg0 > -44) {
            method1343((byte) 2);
        }
        int var1 = class59.field942.method42(8, -54);
        ++field4048;
        if (~var1 > ~class195.field3788) {
            for (int var2 = var1; ~class195.field3788 < ~var2; ++var2) {
                class171.field3397[class161.field3222++] = class49.field794[var2];
            }
        }
        if (~class195.field3788 > ~var1) {
            throw new RuntimeException("gnpov1");
        } else {
            class195.field3788 = 0;
            for (int var3 = 0; ~var1 < ~var3; ++var3) {
                int var4 = class49.field794[var3];
                class76 var5 = class143.field2791[var4];
                int var6 = class59.field942.method42(1, -111);
                if (~var6 == -1) {
                    class49.field794[class195.field3788++] = var4;
                    var5.field2073 = class21.field338;
                } else {
                    int var7 = class59.field942.method42(2, -106);
                    if (var7 == 0) {
                        class49.field794[class195.field3788++] = var4;
                        var5.field2073 = class21.field338;
                        class14.field243[class124.field2313++] = var4;
                    } else if (~var7 == -2) {
                        class49.field794[class195.field3788++] = var4;
                        var5.field2073 = class21.field338;
                        int var8 = class59.field942.method42(3, -92);
                        var5.method604(false, true, var8);
                        int var9 = class59.field942.method42(1, -101);
                        if (var9 == 1) {
                            class14.field243[class124.field2313++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class49.field794[class195.field3788++] = var4;
                        var5.field2073 = class21.field338;
                        int var10 = class59.field942.method42(3, -96);
                        var5.method604(true, true, var10);
                        int var11 = class59.field942.method42(3, -48);
                        var5.method604(true, true, var11);
                        int var12 = class59.field942.method42(1, -84);
                        if (~var12 == -2) {
                            class14.field243[class124.field2313++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class171.field3397[class161.field3222++] = var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "(I)V")
    public static void method1344(int arg0) {
        field4039 = null;
        field4045 = null;
        field4040 = null;
        field4046 = null;
        field4042 = null;
        field4062 = null;
        if (arg0 != 14035) {
            method1349((byte[]) null, (byte) 89);
        }
        field4061 = null;
        field4049 = null;
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IIII)V")
    private final void method1345(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -6513) {
            field4040 = null;
        }
        ++field4064;
        int var5 = arg1 > 2048 ? arg1 - (arg1 * arg3 >> 12) + arg3 : (arg3 + 4096) * arg1 >> 12;
        if (~var5 < -1) {
            int var6 = arg0 * 6;
            int var7 = arg1 - var5 + arg1;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var11 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var11 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 == 0) {
                this.field4058 = var5;
                this.field4044 = var7;
                this.field4037 = var14;
                return;
            }
            if (var9 == 1) {
                this.field4044 = var7;
                this.field4037 = var5;
                this.field4058 = var15;
                return;
            }
            if (var9 == 2) {
                this.field4058 = var7;
                this.field4044 = var14;
                this.field4037 = var5;
                return;
            }
            if (var9 == 3) {
                this.field4044 = var5;
                this.field4037 = var15;
                this.field4058 = var7;
                return;
            }
            if (~var9 == -5) {
                this.field4044 = var5;
                this.field4058 = var14;
                this.field4037 = var7;
                return;
            }
            if (~var9 == -6) {
                this.field4037 = var7;
                this.field4044 = var15;
                this.field4058 = var5;
                return;
            }
        } else {
            this.field4058 = this.field4037 = this.field4044 = arg1;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBII)V")
    private final void method1346(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = ~arg0 >= ~arg3 ? arg3 : arg0;
        int var6 = arg2 <= var5 ? var5 : arg2;
        ++field4047;
        if (arg1 <= 20) {
            this.method1345(-92, -99, -98, -124);
        }
        int var7 = arg3 > arg0 ? arg0 : arg3;
        int var8 = ~var7 >= ~arg2 ? var7 : arg2;
        int var9 = -var8 + var6;
        this.field4054 = (var6 + var8) / 2;
        if (var9 > 0) {
            int var10 = (var6 - arg0 << 12) / var9;
            if (this.field4054 > 0 && this.field4054 < 4096) {
                this.field4057 = (var9 << 12) / (this.field4054 > 2048 ? 8192 - this.field4054 * 2 : this.field4054 * 2);
            }
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg3 + var6 << 12) / var9;
            if (arg0 == var6) {
                this.field4055 = arg3 == var8 ? var11 + 20480 : -var12 + 4096;
            } else if (arg3 != var6) {
                this.field4055 = arg0 == var8 ? var12 + 12288 : 20480 - var10;
            } else {
                this.field4055 = ~arg2 == ~var8 ? var10 + 4096 : -var11 + 12288;
            }
            this.field4055 /= 6;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BII)Lkb;")
    public static final class93 method1347(byte arg0, int arg1, int arg2) {
        ++field4043;
        int var3 = arg1 - arg2;
        if (var3 < -9) {
            return class154.field3042;
        } else if (~var3 > 5) {
            return class36.field583;
        } else if (var3 < -3) {
            return class95.field1761;
        } else if (var3 < 0) {
            return class200.field3879;
        } else if (~var3 < -10) {
            return class57.field933;
        } else if (~var3 < -7) {
            return class171.field3387;
        } else if (arg0 != -68) {
            return null;
        } else if (var3 > 3) {
            return class80.field1425;
        } else {
            return var3 > 0 ? class68.field1248 : class174.field3447;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "()V")
    public class207() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BILrd;)V")
    public final void method15(byte arg0, int arg1, class158 arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    this.field4059 = (arg2.method1066(true) << 12) / 100;
                }
            } else {
                this.field4053 = (arg2.method1066(true) << 12) / 100;
            }
        } else {
            this.field4051 = arg2.method1083(true);
        }
        ++field4060;
        if (arg0 < 106) {
            method1343((byte) 34);
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(IB)V")
    public static final void method1348(int arg0, byte arg1) {
        class36 var2 = (class36) client.field496.method616((long) arg0, -1);
        ++field4036;
        if (var2 != null) {
            if (arg1 >= 107) {
                for (int var3 = 0; var3 < var2.field595.length; ++var3) {
                    var2.field595[var3] = -1;
                    var2.field594[var3] = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "([BB)[B")
    public static final byte[] method1349(byte[] arg0, byte arg1) {
        if (arg1 != 81) {
            field4056 = 64;
        }
        ++field4050;
        int var2 = arg0.length;
        byte[] var3 = new byte[var2];
        class90.method475(arg0, 0, var3, 0, var2);
        return var3;
    }
}
