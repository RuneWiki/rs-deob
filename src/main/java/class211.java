import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class211 extends class276 {

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    private int field3184 = 0;

    @OriginalMember(owner = "client!ka", name = "y", descriptor = "Lqb;")
    private class117 field3188 = new class117(16);

    @OriginalMember(owner = "client!ka", name = "M", descriptor = "I")
    private int field3202 = 0;

    @OriginalMember(owner = "client!ka", name = "Q", descriptor = "Lgj;")
    private class257 field3206 = new class257();

    @OriginalMember(owner = "client!ka", name = "R", descriptor = "J")
    private long field3207 = 0L;

    @OriginalMember(owner = "client!ka", name = "o", descriptor = "Lpj;")
    private class205 field3178;

    @OriginalMember(owner = "client!ka", name = "F", descriptor = "I")
    private int field3195;

    @OriginalMember(owner = "client!ka", name = "P", descriptor = "Z")
    private boolean field3205;

    @OriginalMember(owner = "client!ka", name = "O", descriptor = "Lgj;")
    private class257 field3204;

    @OriginalMember(owner = "client!ka", name = "l", descriptor = "Lpj;")
    private class205 field3175;

    @OriginalMember(owner = "client!ka", name = "E", descriptor = "I")
    private int field3194;

    @OriginalMember(owner = "client!ka", name = "S", descriptor = "Z")
    private boolean field3208;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    private int field3173;

    @OriginalMember(owner = "client!ka", name = "L", descriptor = "Lcd;")
    private class78 field3201;

    @OriginalMember(owner = "client!ka", name = "v", descriptor = "Ldb;")
    private class207 field3185;

    @OriginalMember(owner = "client!ka", name = "z", descriptor = "Lej;")
    private class179 field3189;

    @OriginalMember(owner = "client!ka", name = "A", descriptor = "[Z")
    public static boolean[] field3190 = new boolean[8];

    @OriginalMember(owner = "client!ka", name = "x", descriptor = "I")
    public static int field3187 = 0;

    @OriginalMember(owner = "client!ka", name = "B", descriptor = "[I")
    public static int[] field3191 = new int[14];

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "I")
    public static int field3172;

    @OriginalMember(owner = "client!ka", name = "k", descriptor = "I")
    public static int field3174;

    @OriginalMember(owner = "client!ka", name = "m", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!ka", name = "n", descriptor = "I")
    public static int field3177;

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public static int field3179;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "I")
    public static int field3180;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "I")
    public static int field3181;

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field3182;

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "I")
    public static int field3183;

    @OriginalMember(owner = "client!ka", name = "C", descriptor = "I")
    public static int field3192;

    @OriginalMember(owner = "client!ka", name = "D", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!ka", name = "G", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!ka", name = "H", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!ka", name = "I", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!ka", name = "J", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!ka", name = "w", descriptor = "Lfc;")
    private class250 field3186;

    @OriginalMember(owner = "client!ka", name = "N", descriptor = "Z")
    private boolean field3203;

    @OriginalMember(owner = "client!ka", name = "K", descriptor = "[B")
    private byte[] field3200;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V", line = 7)
    public final void method1464(int arg0, int arg1) {
        field3179++;
        if (this.field3178 == null) {
            return;
        }
        if (arg0 >= -119) {
            this.method1478(-30);
        }
        for (class188 var3 = this.field3206.method1812(1); var3 != null; var3 = this.field3206.method1809(128)) {
            if ((long) arg1 == var3.field2834) {
                return;
            }
        }
        class188 var4 = new class188();
        var4.field2834 = (long) arg1;
        this.field3206.method1814(var4, true);
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(I)V", line = 38)
    public static void method1465(int arg0) {
        field3191 = null;
        field3190 = null;
        if (arg0 != 0) {
            method1465(95);
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IBI)Lej;", line = 52)
    private final class179 method1466(int arg0, byte arg1, int arg2) {
        class179 var4 = (class179) this.field3188.method770((long) arg0, 74);
        if (var4 != null && arg2 == 0 && !var4.field2688 && var4.field2683) {
            var4.method1290(-16);
            var4 = null;
        }
        field3183++;
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3178 == null || this.field3200[arg0] == -1) {
                    if (this.field3201.method510(arg1 ^ 0xFFFFFFA6)) {
                        return null;
                    }
                    var4 = this.field3201.method511(true, 27702, (byte) 2, arg0, this.field3195);
                } else {
                    var4 = this.field3185.method1446(this.field3178, 103, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field3178 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3185.method1447(this.field3178, arg0, 120);
            } else if (arg2 == 2) {
                if (this.field3178 == null) {
                    throw new RuntimeException();
                }
                if (this.field3200[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3201.method505((byte) -126)) {
                    return null;
                }
                var4 = this.field3201.method511(false, arg1 + 27703, (byte) 2, arg0, this.field3195);
            } else {
                throw new RuntimeException();
            }
            this.field3188.method764(24369, var4, (long) arg0);
        }
        if (arg1 != -1) {
            this.field3200 = (byte[]) null;
        }
        if (var4.field2683) {
            return null;
        }
        byte[] var5 = var4.method1238((byte) -107);
        if (!var4 instanceof class315) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class245.field3858.reset();
                class245.field3858.update(var5, 0, var5.length - 2);
                int var6 = (int) class245.field3858.getValue();
                if (this.field3186.field3963[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field3201.field1042 = 0;
                this.field3201.field1041 = 0;
            } catch (RuntimeException var14) {
                this.field3201.method506(true);
                var4.method1290(109);
                if (var4.field2688 && !this.field3201.method510(arg1 ^ 0x78)) {
                    class331 var8 = this.field3201.method511(true, arg1 ^ 0xFFFF93C9, (byte) 2, arg0, this.field3195);
                    this.field3188.method764(24369, var8, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3186.field3953[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field3186.field3953[arg0];
            if (this.field3178 != null) {
                this.field3185.method1445((byte) 95, this.field3178, var5, arg0);
                if (this.field3200[arg0] != 1) {
                    this.field3184++;
                    this.field3200[arg0] = 1;
                }
            }
            if (!var4.field2688) {
                var4.method1290(104);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class245.field3858.reset();
            class245.field3858.update(var5, 0, var5.length - 2);
            int var9 = (int) class245.field3858.getValue();
            if (this.field3186.field3963[arg0] != var9) {
                throw new RuntimeException();
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3186.field3953[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field3200[arg0] != 1) {
                if (this.field3200[arg0] != 0) {
                }
                this.field3184++;
                this.field3200[arg0] = 1;
            }
            if (!var4.field2688) {
                var4.method1290(arg1 ^ 0xFFFFFF84);
            }
            return var4;
        } catch (Exception var13) {
            this.field3200[arg0] = -1;
            var4.method1290(arg1 ^ 0xFFFFFF80);
            if (var4.field2688 && !this.field3201.method510(82)) {
                class331 var12 = this.field3201.method511(true, arg1 ^ 0xFFFF93C9, (byte) 2, arg0, this.field3195);
                this.field3188.method764(24369, var12, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)I", line = 268)
    public final int method1467(int arg0) {
        if (arg0 != -2) {
            this.field3205 = true;
        }
        field3182++;
        return this.field3184;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(B)I", line = 281)
    public final int method1468(byte arg0) {
        field3181++;
        if (arg0 != -78) {
            this.method1477(56);
        }
        return this.field3186 == null ? 0 : this.field3186.field3965;
    }

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "(I)V", line = 295)
    public final void method1469(int arg0) {
        field3176++;
        if (arg0 != -2) {
            this.method1477(-50);
        }
        if (this.field3178 != null) {
            this.field3203 = true;
            if (this.field3204 == null) {
                this.field3204 = new class257();
            }
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(II)I", line = 314)
    public final int method1470(int arg0, int arg1) {
        field3177++;
        class179 var3 = (class179) this.field3188.method770((long) arg1, -123);
        if (arg0 != 8) {
            this.method1472(false);
        }
        return var3 == null ? 0 : var3.method1235(false);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(IZ)V", line = 339)
    public static final void method1471(int arg0, boolean arg1) {
        field3193++;
        byte[][] var2;
        byte var3;
        if (class272.field4317 && arg1) {
            var2 = class108.field1490;
            var3 = 1;
        } else {
            var3 = 4;
            var2 = class316.field4951;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var3; var5++) {
            class108.method698(arg0 + 6057);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class184.field2766[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg1 || var10 == 0) {
                            int var11 = (var9 & 0x7) >> 1;
                            int var12 = (var9 & 0xFFDEE2) >> 14;
                            int var13 = var9 >> 3 & 0x7FF;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class218.field3277.length; var15++) {
                                if (class218.field3277[var15] == var14 && var2[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class210.method1461(var2[var15], var5, var10, var11, var13, class247.field3914, var7 * 8, arg1, var6 * 8, var12, arg0 ^ 0xFFFF85A9);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class303.method2134(var5, 8, var6 * 8, var7 * 8, 8, arg0 ^ 0xFFFFE7FB);
                    }
                }
            }
        }
        if (var4 == null) {
            class325.field5214 = -1;
        } else {
            class256.field4045 = var4[1];
            class67.field843 = var4[3];
            class292.field4600 = var4[4];
            class277.field4356 = var4[2];
            class325.field5214 = var4[0];
        }
        if (arg0 != -6150) {
            field3196 = -33;
        }
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(Z)I", line = 454)
    public final int method1472(boolean arg0) {
        field3199++;
        if (this.method1474(arg0) == null) {
            return this.field3189 == null ? 0 : this.field3189.method1235(false);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(B)V", line = 470)
    public final void method1473(byte arg0) {
        field3192++;
        if (this.field3204 != null) {
            if (this.method1474(false) == null) {
                return;
            }
            if (this.field3205) {
                boolean var2 = true;
                for (class188 var3 = this.field3204.method1812(1); var3 != null; var3 = this.field3204.method1809(128)) {
                    int var4 = (int) var3.field2834;
                    if (this.field3200[var4] == 0) {
                        this.method1466(var4, (byte) -1, 1);
                    }
                    if (this.field3200[var4] == 0) {
                        var2 = false;
                    } else {
                        var3.method1290(-70);
                    }
                }
                while (this.field3202 < this.field3186.field3960.length) {
                    if (this.field3186.field3960[this.field3202] == 0) {
                        this.field3202++;
                    } else {
                        if (this.field3185.field3142 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3200[this.field3202] == 0) {
                            this.method1466(this.field3202, (byte) -1, 1);
                        }
                        if (this.field3200[this.field3202] == 0) {
                            var2 = false;
                            class188 var5 = new class188();
                            var5.field2834 = (long) this.field3202;
                            this.field3204.method1814(var5, true);
                        }
                        this.field3202++;
                    }
                }
                if (var2) {
                    this.field3202 = 0;
                    this.field3205 = false;
                }
            } else if (this.field3203) {
                boolean var6 = true;
                for (class188 var7 = this.field3204.method1812(1); var7 != null; var7 = this.field3204.method1809(128)) {
                    int var8 = (int) var7.field2834;
                    if (this.field3200[var8] != 1) {
                        this.method1466(var8, (byte) -1, 2);
                    }
                    if (this.field3200[var8] == 1) {
                        var7.method1290(116);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3186.field3960.length > this.field3202) {
                    if (this.field3186.field3960[this.field3202] == 0) {
                        this.field3202++;
                    } else {
                        if (this.field3201.method505((byte) -126)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3200[this.field3202] != 1) {
                            this.method1466(this.field3202, (byte) -1, 2);
                        }
                        if (this.field3200[this.field3202] != 1) {
                            class188 var9 = new class188();
                            var6 = false;
                            var9.field2834 = (long) this.field3202;
                            this.field3204.method1814(var9, true);
                        }
                        this.field3202++;
                    }
                }
                if (var6) {
                    this.field3202 = 0;
                    this.field3203 = false;
                }
            } else {
                this.field3204 = null;
            }
        }
        if (arg0 >= -46) {
            this.field3206 = (class257) null;
        }
        if (!this.field3208 || class9.method57(-14133) < this.field3207) {
            return;
        }
        for (class179 var10 = (class179) this.field3188.method761(12); var10 != null; var10 = (class179) this.field3188.method757(-1)) {
            if (!var10.field2683) {
                if (var10.field2691) {
                    if (!var10.field2688) {
                        throw new RuntimeException();
                    }
                    var10.method1290(93);
                } else {
                    var10.field2691 = true;
                }
            }
        }
        this.field3207 = class9.method57(-14133) + 1000L;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(Z)Lfc;", line = 648)
    public final class250 method1474(boolean arg0) {
        field3180++;
        if (this.field3186 != null) {
            return this.field3186;
        }
        if (this.field3189 == null) {
            if (this.field3201.method510(17)) {
                return null;
            }
            this.field3189 = this.field3201.method511(true, 27702, (byte) 0, this.field3195, 255);
        }
        if (arg0) {
            return (class250) null;
        } else if (this.field3189.field2683) {
            return null;
        } else {
            byte[] var2 = this.field3189.method1238((byte) -107);
            if (this.field3189 instanceof class315) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field3186 = new class250(var2, this.field3173);
                    if (this.field3186.field3962 != this.field3194) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var5) {
                    this.field3186 = null;
                    if (this.field3201.method510(125)) {
                        this.field3189 = null;
                    } else {
                        this.field3189 = this.field3201.method511(true, 27702, (byte) 0, this.field3195, 255);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field3186 = new class250(var2, this.field3173);
                } catch (RuntimeException var6) {
                    this.field3201.method506(true);
                    this.field3186 = null;
                    if (this.field3201.method510(44)) {
                        this.field3189 = null;
                    } else {
                        this.field3189 = this.field3201.method511(true, 27702, (byte) 0, this.field3195, 255);
                    }
                    return null;
                }
                if (this.field3175 != null) {
                    this.field3185.method1445((byte) 79, this.field3175, var2, this.field3195);
                }
            }
            this.field3189 = null;
            if (this.field3178 != null) {
                this.field3200 = new byte[this.field3186.field3970];
                this.field3184 = 0;
            }
            return this.field3186;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILnk;)V", line = 748)
    public static final void method1475(int arg0, class16 arg1) {
        if (arg0 != -2677) {
            field3196 = -65;
        }
        class123.field1699 = arg1;
        field3198++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)[B", line = 761)
    public final byte[] method1476(boolean arg0, int arg1) {
        field3197++;
        class179 var3 = this.method1466(arg1, (byte) -1, 0);
        if (var3 == null) {
            return null;
        } else if (arg0) {
            byte[] var4 = var3.method1238((byte) -107);
            var3.method1290(122);
            return var4;
        } else {
            return (byte[]) null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "(I)I", line = 786)
    public final int method1477(int arg0) {
        field3172++;
        if (this.field3186 == null) {
            return 0;
        } else if (this.field3205) {
            if (arg0 != 1779) {
                this.method1478(36);
            }
            class188 var2 = this.field3204.method1812(1);
            return var2 == null ? 0 : (int) var2.field2834;
        } else {
            return this.field3186.field3965;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(ILpj;Lpj;Lcd;Ldb;IIZ)V", line = 899)
    public class211(int arg0, class205 arg1, class205 arg2, class78 arg3, class207 arg4, int arg5, int arg6, boolean arg7) {
        this.field3178 = arg1;
        this.field3195 = arg0;
        if (this.field3178 == null) {
            this.field3205 = false;
        } else {
            this.field3205 = true;
            this.field3204 = new class257();
        }
        this.field3175 = arg2;
        this.field3194 = arg6;
        this.field3208 = arg7;
        this.field3173 = arg5;
        this.field3201 = arg3;
        this.field3185 = arg4;
        if (this.field3175 != null) {
            this.field3189 = this.field3185.method1446(this.field3175, 100, this.field3195);
        }
    }

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "(I)V", line = 832)
    public final void method1478(int arg0) {
        field3174++;
        if (this.field3204 == null || this.method1474(false) == null) {
            return;
        }
        if (arg0 != 0) {
            this.method1468((byte) -31);
        }
        for (class188 var2 = this.field3206.method1812(1); var2 != null; var2 = this.field3206.method1809(128)) {
            int var3 = (int) var2.field2834;
            if (var3 < 0 || this.field3186.field3970 <= var3 || this.field3186.field3960[var3] == 0) {
                var2.method1290(121);
            } else {
                if (this.field3200[var3] == 0) {
                    this.method1466(var3, (byte) -1, 1);
                }
                if (this.field3200[var3] == -1) {
                    this.method1466(var3, (byte) -1, 2);
                }
                if (this.field3200[var3] == 1) {
                    var2.method1290(arg0 ^ 0xFFFFFFA3);
                }
            }
        }
    }
}
