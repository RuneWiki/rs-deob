import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class217 extends class49 implements class395 {

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "Z")
    private boolean field3214;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "Z")
    private boolean field3213;

    @OriginalMember(owner = "client!hf", name = "E", descriptor = "S")
    private short field3202;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "B")
    private byte field3215;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "Z")
    private boolean field3212;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "B")
    private byte field3210;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "Z")
    private boolean field3218;

    @OriginalMember(owner = "client!hf", name = "Y", descriptor = "Lsr;")
    private class135 field3221;

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "Lrc;")
    private class100 field3207;

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "I")
    public static int field3205 = -1;

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "[I")
    public static int[] field3194 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "I")
    public static int field3193;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field3196;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "I")
    public static int field3199;

    @OriginalMember(owner = "client!hf", name = "C", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!hf", name = "D", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!hf", name = "F", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "I")
    public static int field3209;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "I")
    public static int field3219;

    @OriginalMember(owner = "client!hf", name = "X", descriptor = "I")
    public static int field3220;

    @OriginalMember(owner = "client!hf", name = "Z", descriptor = "Ldp;")
    public static class174 field3222;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)Z", line = 3)
    public final boolean method1018(byte arg0) {
        ++field3199;
        if (arg0 >= -16) {
            this.field3213 = true;
        }
        return this.field3218;
    }

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "(I)V", line = 14)
    public static void method1640(int arg0) {
        field3222 = null;
        field3194 = null;
        if (arg0 > -107) {
            method1640(99);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BILja;)Lrc;", line = 26)
    public final class100 method1025(byte arg0, int arg1, class90 arg2) {
        if (arg0 != -84) {
            this.method53((byte) -115);
        }
        ++field3198;
        return this.method1643(109, arg1, arg2);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILja;)V", line = 39)
    public final void method137(int arg0, class90 arg1) {
        ++field3217;
        int var3 = 44 / ((-31 - arg0) / 51);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)I", line = 48)
    public final int method1020(int arg0) {
        ++field3195;
        if (arg0 != 15829) {
            this.method132(114, (class90) null, -49, -75);
        }
        return this.field3210;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZIILja;)Lob;", line = 60)
    private final class209 method1641(boolean arg0, int arg1, int arg2, class90 arg3) {
        ++field3206;
        class45 var5 = class451.method2812(43, 65535 & this.field3202);
        class126 var6;
        class126 var7;
        if (this.field3213) {
            var6 = class311.field4527[0];
            var7 = class18.field262[this.field3215];
        } else {
            if (~this.field3215 <= -4) {
                var6 = null;
            } else {
                var6 = class311.field4527[this.field3215 + 1];
            }
            var7 = class311.field4527[this.field3215];
        }
        if (arg2 <= 114) {
            this.method53((byte) 115);
        }
        return var5.method361(-183837885, 22, arg3, arg0, super.field784, var6, super.field795, this.field3210, arg1, var7, super.field787);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZLja;)V", line = 92)
    public final void method1022(boolean arg0, class90 arg1) {
        ++field3208;
        Object var3 = null;
        class135 var5;
        if (this.field3221 == null && this.field3218) {
            class209 var4 = this.method1641(true, 131072, 119, arg1);
            var5 = var4 != null ? var4.field3046 : null;
        } else {
            var5 = this.field3221;
            this.field3221 = null;
        }
        if (!arg0) {
            this.field3215 = -101;
        }
        if (var5 != null) {
            class365.method2332(var5, this.field3215, super.field795, super.field787, (boolean[]) null);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ZI)V", line = 120)
    public static final void method1642(boolean arg0, int arg1) {
        ++field3203;
        byte[][] var2;
        if (arg0) {
            var2 = class347.field4906;
        } else {
            var2 = class403.field5895;
        }
        int var3 = class79.field1343.length;
        if (arg1 >= 15) {
            for (int var4 = 0; var3 > var4; ++var4) {
                byte[] var5 = var2[var4];
                if (var5 != null) {
                    int var6 = (class79.field1336[var4] >> 8) * 64 - class379.field5384;
                    int var7 = (class79.field1336[var4] & 255) * 64 + -class294.field4362;
                    class11.method65((byte) -53);
                    class346.method2231(class73.field1235, arg0, var6, var5, (byte) -108, var7, class322.field4646);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)Z", line = 159)
    public final boolean method53(byte arg0) {
        ++field3196;
        if (arg0 <= 58) {
            this.field3207 = null;
        }
        return this.field3214;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IBZIILnf;Lja;)V", line = 170)
    public final void method47(int arg0, byte arg1, boolean arg2, int arg3, int arg4, class256 arg5, class90 arg6) {
        if (arg5 instanceof class217) {
            class217 var8 = (class217) arg5;
            if (this.field3207 != null && var8.field3207 != null) {
                this.field3207.method552(var8.field3207, arg3, arg0, arg4, arg2);
            }
        }
        if (arg1 != 47) {
            method1644(false);
        }
        ++field3200;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "(Lja;Lfb;IIIIZIZ)V", line = 191)
    public class217(class90 arg0, class45 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, boolean arg8) {
        super(arg3, arg4, arg5, arg1.field702, arg1.field738);
        super.field795 = (short) arg3;
        this.field3214 = arg8;
        this.field3213 = arg6;
        super.field787 = (short) arg5;
        this.field3202 = (short) arg1.field733;
        this.field3215 = (byte) arg2;
        this.field3212 = arg1.field697 != 0;
        this.field3210 = (byte) arg7;
        this.field3218 = arg0.method730() && arg1.field728 && !this.field3213 && ~class238.field3438 != -1;
        int var10 = 1024;
        if (this.field3214) {
            var10 |= 32768;
        }
        class209 var11 = this.method1641(this.field3218, var10, 116, arg0);
        if (var11 != null) {
            this.field3221 = var11.field3046;
            this.field3207 = var11.field3048;
            if (this.field3214) {
                this.field3207 = this.field3207.method518((byte) 0, var10, false);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "(I)V", line = 231)
    public final void method54(int arg0) {
        ++field3211;
        this.field3214 = false;
        if (arg0 != 0) {
            this.field3210 = 48;
        }
        if (this.field3207 != null) {
            this.field3207.method525(this.field3207.method560() & -32769);
        }
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(I)V", line = 246)
    public final void method1023(int arg0) {
        if (this.field3207 != null) {
            this.field3207.method520();
        }
        ++field3220;
        if (arg0 <= 40) {
            this.method1023(-101);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lja;I)V", line = 261)
    public final void method1021(class90 arg0, int arg1) {
        ++field3193;
        Object var3 = null;
        class135 var5;
        if (this.field3221 == null && this.field3218) {
            class209 var4 = this.method1641(true, 131072, 125, arg0);
            var5 = var4 == null ? null : var4.field3046;
        } else {
            var5 = this.field3221;
            this.field3221 = null;
        }
        if (var5 != null) {
            class50.method395(var5, this.field3215, super.field795, super.field787, (boolean[]) null);
        }
        int var6 = 62 / ((arg1 - -58) / 56);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILja;)Lrc;", line = 289)
    private final class100 method1643(int arg0, int arg1, class90 arg2) {
        ++field3209;
        if (this.field3207 != null && ~arg2.method677(this.field3207.method560(), arg1) == -1) {
            return this.field3207;
        } else {
            class209 var4 = this.method1641(false, arg1, 126, arg2);
            if (arg0 < 42) {
                return null;
            } else {
                return var4 == null ? null : var4.field3048;
            }
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(I)I", line = 313)
    public final int method1024(int arg0) {
        if (arg0 != 20691) {
            field3194 = null;
        }
        ++field3216;
        return 22;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)I", line = 330)
    public final int method1013(boolean arg0) {
        ++field3197;
        if (arg0) {
            this.method1020(17);
        }
        return 65535 & this.field3202;
    }

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "(Z)V", line = 343)
    public static final void method1644(boolean arg0) {
        if (arg0) {
            method1640(11);
        }
        ++field3201;
        class122.field1928.method699(((float) class354.field5039 * 0.1F + 0.7F) * class376.field5328);
        class122.field1928.method712(class52.field852, class37.field545, class435.field6343, (float) class249.field3604, (float) class243.field3537, (float) class402.field5886);
        class122.field1928.method678(class84.field1369);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLja;)Lkh;", line = 361)
    public final class69 method134(byte arg0, class90 arg1) {
        ++field3204;
        if (this.field3207 == null) {
            return null;
        } else {
            class202 var3 = arg1.method709();
            var3.method1527(super.field795, super.field784, super.field787);
            if (arg0 <= 90) {
                this.field3221 = null;
            }
            class69 var4 = null;
            if (this.field3212) {
                var4 = class256.method1849(1, 66);
            }
            this.field3207.method530(var3, var4 != null ? var4.field1128[0] : null, 0);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILja;II)Z", line = 391)
    public final boolean method132(int arg0, class90 arg1, int arg2, int arg3) {
        if (arg2 != 28033) {
            return true;
        } else {
            ++field3219;
            class100 var5 = this.method1643(118, 65536, arg1);
            if (var5 != null) {
                class202 var6 = arg1.method709();
                var6.method1527(super.field795, super.field784, super.field787);
                return var5.method574(arg3, arg0, var6, false);
            } else {
                return false;
            }
        }
    }
}
