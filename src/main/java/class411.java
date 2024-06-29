import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public class class411 extends class63 implements class303 {

    @OriginalMember(owner = "client!ku", name = "bb", descriptor = "Z")
    private boolean field5858;

    @OriginalMember(owner = "client!ku", name = "Z", descriptor = "B")
    private byte field5856;

    @OriginalMember(owner = "client!ku", name = "U", descriptor = "B")
    private byte field5851;

    @OriginalMember(owner = "client!ku", name = "Q", descriptor = "S")
    private short field5847;

    @OriginalMember(owner = "client!ku", name = "O", descriptor = "B")
    private byte field5845;

    @OriginalMember(owner = "client!ku", name = "F", descriptor = "Z")
    private boolean field5836;

    @OriginalMember(owner = "client!ku", name = "T", descriptor = "Z")
    private boolean field5850;

    @OriginalMember(owner = "client!ku", name = "D", descriptor = "Li;")
    private class197 field5834;

    @OriginalMember(owner = "client!ku", name = "L", descriptor = "Le;")
    private class285 field5842;

    @OriginalMember(owner = "client!ku", name = "cb", descriptor = "[Ljp;")
    public static class55[] field5859 = new class55[14];

    @OriginalMember(owner = "client!ku", name = "W", descriptor = "Lrb;")
    public static class283 field5853 = new class283(29, 7);

    @OriginalMember(owner = "client!ku", name = "y", descriptor = "I")
    public static int field5829;

    @OriginalMember(owner = "client!ku", name = "z", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!ku", name = "B", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!ku", name = "C", descriptor = "I")
    public static int field5833;

    @OriginalMember(owner = "client!ku", name = "E", descriptor = "I")
    public static int field5835;

    @OriginalMember(owner = "client!ku", name = "G", descriptor = "I")
    public static int field5837;

    @OriginalMember(owner = "client!ku", name = "I", descriptor = "I")
    public static int field5839;

    @OriginalMember(owner = "client!ku", name = "J", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!ku", name = "K", descriptor = "I")
    public static int field5841;

    @OriginalMember(owner = "client!ku", name = "M", descriptor = "I")
    public static int field5843;

    @OriginalMember(owner = "client!ku", name = "N", descriptor = "I")
    public static int field5844;

    @OriginalMember(owner = "client!ku", name = "P", descriptor = "I")
    public static int field5846;

    @OriginalMember(owner = "client!ku", name = "R", descriptor = "I")
    public static int field5848;

    @OriginalMember(owner = "client!ku", name = "S", descriptor = "I")
    public static int field5849;

    @OriginalMember(owner = "client!ku", name = "V", descriptor = "I")
    public static int field5852;

    @OriginalMember(owner = "client!ku", name = "X", descriptor = "I")
    public static int field5854;

    @OriginalMember(owner = "client!ku", name = "Y", descriptor = "I")
    public static int field5855;

    @OriginalMember(owner = "client!ku", name = "ab", descriptor = "I")
    public static int field5857;

    @OriginalMember(owner = "client!ku", name = "A", descriptor = "Lvu;")
    public static class155 field5831;

    @OriginalMember(owner = "client!ku", name = "H", descriptor = "Ldk;")
    public static class421 field5838;

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBI)Z", line = 5)
    public static final boolean method2413(int arg0, byte arg1, int arg2) {
        if (arg1 != -19) {
            method2414(-57);
        }
        ++field5837;
        return ~(2048 & arg0) != -1;
    }

    @OriginalMember(owner = "client!ku", name = "g", descriptor = "(I)V", line = 20)
    public static void method2414(int arg0) {
        field5838 = null;
        field5831 = null;
        field5853 = null;
        int var1 = -102 % ((58 - arg0) / 54);
        field5859 = null;
    }

    @OriginalMember(owner = "client!ku", name = "<init>", descriptor = "(Lza;Lpm;IIIIZIIIII)V", line = 32)
    public class411(class295 arg0, class103 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg3, arg4, arg5, arg7, arg8, arg9, class326.method1934(arg10, -127, arg11));
        super.field906 = arg3;
        this.field5858 = arg6;
        this.field5856 = (byte) arg10;
        super.field910 = arg5;
        this.field5851 = (byte) arg11;
        this.field5847 = (short) arg1.field1646;
        this.field5845 = (byte) arg2;
        this.field5836 = arg1.field1697 != 0 && !arg6;
        this.field5850 = arg0.method498() && arg1.field1614 && !this.field5858 && ~class76.field1075.method1593(class195.field2849, 82) != -1;
        class135 var13 = this.method2416(this.field5850, -1, arg0, 2048);
        if (var13 != null) {
            this.field5834 = var13.field2053;
            this.field5842 = var13.field2051;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lza;BI)Le;", line = 56)
    private final class285 method2415(class295 arg0, byte arg1, int arg2) {
        ++field5855;
        if (this.field5842 != null && arg0.method459(this.field5842.method671(), arg2) == 0) {
            return this.field5842;
        } else {
            int var4 = -111 / ((arg1 - -61) / 60);
            class135 var5 = this.method2416(false, -1, arg0, arg2);
            return var5 != null ? var5.field2051 : null;
        }
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)V", line = 76)
    public final void method165(int arg0) {
        ++field5848;
        if (arg0 != -8698) {
            this.method166((class295) null, -70);
        }
        if (this.field5842 != null) {
            this.field5842.method687();
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(BLza;)Lql;", line = 89)
    public final class121 method171(byte arg0, class295 arg1) {
        ++field5841;
        if (this.field5842 == null) {
            return null;
        } else {
            class512 var3 = arg1.method541();
            if (arg0 != -96) {
                return null;
            } else {
                var3.method955(super.field915 + super.field906, super.field911, super.field910 + super.field908);
                class121 var4 = null;
                if (this.field5836) {
                    var4 = class399.method2364(1, -29752);
                }
                this.field5842.method701(var3, var4 != null ? var4.field1878[0] : null, 0);
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "f", descriptor = "(I)I", line = 114)
    public final int method419(int arg0) {
        if (arg0 > -89) {
            this.method2416(false, 122, (class295) null, -67);
        }
        ++field5849;
        return this.field5842 != null ? this.field5842.method670() : 0;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(Lza;I)V", line = 134)
    public final void method156(class295 arg0, int arg1) {
        ++field5840;
        Object var3 = null;
        class197 var5;
        if (this.field5834 == null && this.field5850) {
            class135 var4 = this.method2416(true, -1, arg0, 262144);
            var5 = var4 == null ? null : var4.field2053;
        } else {
            var5 = this.field5834;
            this.field5834 = null;
        }
        if (arg1 < -109) {
            if (var5 != null) {
                class161.method1135(var5, this.field5845, super.field906, super.field910, (boolean[]) null);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ZILza;I)Luo;", line = 162)
    private final class135 method2416(boolean arg0, int arg1, class295 arg2, int arg3) {
        ++field5833;
        if (arg1 != -1) {
            this.field5847 = 89;
        }
        class103 var5 = class452.field6629.method603((byte) 97, this.field5847 & 65535);
        class11 var6;
        class11 var7;
        if (this.field5858) {
            var6 = class348.field5000[0];
            var7 = class36.field554[this.field5845];
        } else {
            if (~this.field5845 <= -4) {
                var6 = null;
            } else {
                var6 = class348.field5000[this.field5845 - -1];
            }
            var7 = class348.field5000[this.field5845];
        }
        return var5.method801(this.field5856, arg3, super.field906, false, super.field911, var6, arg2, var7, super.field910, this.field5851, arg0);
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(Lza;I)V", line = 192)
    public final void method164(class295 arg0, int arg1) {
        ++field5829;
        Object var3 = null;
        class197 var5;
        if (this.field5834 == null && this.field5850) {
            class135 var4 = this.method2416(true, -1, arg0, 262144);
            var5 = var4 != null ? var4.field2053 : null;
        } else {
            var5 = this.field5834;
            this.field5834 = null;
        }
        if (var5 != null) {
            class125.method903(var5, this.field5845, super.field906, super.field910, (boolean[]) null);
        }
        if (arg1 != 1907) {
            this.field5847 = 74;
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(ILza;B)Le;", line = 220)
    public final class285 method162(int arg0, class295 arg1, byte arg2) {
        if (arg2 != -14) {
            this.method419(-47);
        }
        ++field5852;
        return this.method2415(arg1, (byte) 104, arg0);
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(Lza;I)V", line = 231)
    public final void method166(class295 arg0, int arg1) {
        if (arg1 < 7) {
            field5859 = null;
        }
        ++field5854;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)I", line = 248)
    public final int method159(int arg0) {
        ++field5839;
        int var2 = -66 / ((78 - arg0) / 46);
        return this.field5856;
    }

    @OriginalMember(owner = "client!ku", name = "b", descriptor = "(B)Z", line = 261)
    public final boolean method160(byte arg0) {
        ++field5843;
        if (arg0 != 112) {
            this.field5842 = null;
        }
        return this.field5850;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IBILza;)Z", line = 273)
    public final boolean method158(int arg0, byte arg1, int arg2, class295 arg3) {
        ++field5830;
        class285 var5 = this.method2415(arg3, (byte) -124, 131072);
        if (var5 != null) {
            class512 var6 = arg3.method541();
            var6.method955(super.field906, super.field911, super.field910);
            return var5.method684(arg2, arg0, var6, false);
        } else {
            if (arg1 < 58) {
                this.method165(37);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ku", name = "e", descriptor = "(B)V", line = 300)
    public static final void method2417(byte arg0) {
        ++field5835;
        class379.field5448 = new String[500];
        class392.field5655 = class44.field638.field896 + 2 + class44.field638.field883;
        class147.field2261 = class80.field1127.field896 + class80.field1127.field883 - -2;
        if (arg0 == 41) {
            for (int var1 = 0; class379.field5448.length > var1; ++var1) {
                class379.field5448[var1] = "";
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(B)I", line = 322)
    public final int method170(byte arg0) {
        int var2 = -85 % ((arg0 - -11) / 47);
        ++field5857;
        return this.field5847 & 65535;
    }

    @OriginalMember(owner = "client!ku", name = "a", descriptor = "(IZLat;II)V", line = 334)
    public static final void method2418(int arg0, boolean arg1, class444 arg2, int arg3, int arg4) {
        if (arg4 > -124) {
            field5831 = null;
        }
        ++field5844;
        int var5 = arg2.field6470;
        if (arg2.field6398 == 0) {
            arg2.field6470 = arg2.field6426;
        } else if (arg2.field6398 == 1) {
            arg2.field6470 = arg3 - arg2.field6426;
        } else if (~arg2.field6398 == -3) {
            arg2.field6470 = arg2.field6426 * arg3 >> 14;
        }
        int var6 = arg2.field6453;
        if (~arg2.field6452 != -1) {
            if (arg2.field6452 == 1) {
                arg2.field6453 = -arg2.field6399 + arg0;
            } else if (arg2.field6452 == 2) {
                arg2.field6453 = arg2.field6399 * arg0 >> 14;
            }
        } else {
            arg2.field6453 = arg2.field6399;
        }
        if (~arg2.field6398 == -5) {
            arg2.field6470 = arg2.field6453 * arg2.field6386 / arg2.field6534;
        }
        if (~arg2.field6452 == -5) {
            arg2.field6453 = arg2.field6534 * arg2.field6470 / arg2.field6386;
        }
        if (class181.field2693 && (client.method3067(arg2).field6217 != 0 || arg2.field6477 == 0)) {
            if (arg2.field6453 < 5 && arg2.field6470 < 5) {
                arg2.field6453 = 5;
                arg2.field6470 = 5;
            } else {
                if (arg2.field6470 <= 0) {
                    arg2.field6470 = 5;
                }
                if (arg2.field6453 <= 0) {
                    arg2.field6453 = 5;
                }
            }
        }
        if (class454.field6634 == arg2.field6384) {
            class302.field4126 = arg2;
        }
        if (arg1 && arg2.field6509 != null) {
            if (~arg2.field6470 != ~var5 || ~arg2.field6453 != ~var6) {
                class414 var7 = new class414();
                var7.field5896 = arg2;
                var7.field5900 = arg2.field6509;
                class63.field922.method3139(0, var7);
            }
        }
    }

    @OriginalMember(owner = "client!ku", name = "c", descriptor = "(B)I", line = 413)
    public final int method157(byte arg0) {
        if (arg0 != -22) {
            return -85;
        } else {
            ++field5832;
            return this.field5851;
        }
    }
}
