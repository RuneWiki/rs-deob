import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class359 extends class478 {

    @OriginalMember(owner = "client!mq", name = "G", descriptor = "I")
    private int field5213 = 0;

    @OriginalMember(owner = "client!mq", name = "B", descriptor = "I")
    private int field5208 = 0;

    @OriginalMember(owner = "client!mq", name = "I", descriptor = "I")
    private int field5215 = 0;

    @OriginalMember(owner = "client!mq", name = "z", descriptor = "I")
    private int field5206 = -1;

    @OriginalMember(owner = "client!mq", name = "O", descriptor = "I")
    private int field5221 = -32768;

    @OriginalMember(owner = "client!mq", name = "R", descriptor = "Z")
    public boolean field5224 = false;

    @OriginalMember(owner = "client!mq", name = "J", descriptor = "I")
    public int field5216;

    @OriginalMember(owner = "client!mq", name = "D", descriptor = "I")
    private int field5210;

    @OriginalMember(owner = "client!mq", name = "Z", descriptor = "I")
    private int field5232;

    @OriginalMember(owner = "client!mq", name = "Q", descriptor = "Lkg;")
    private class183 field5223;

    @OriginalMember(owner = "client!mq", name = "S", descriptor = "[I")
    public static int[] field5225 = new int[13];

    @OriginalMember(owner = "client!mq", name = "y", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!mq", name = "A", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!mq", name = "C", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!mq", name = "E", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!mq", name = "F", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!mq", name = "H", descriptor = "I")
    public static int field5214;

    @OriginalMember(owner = "client!mq", name = "K", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!mq", name = "L", descriptor = "I")
    public static int field5218;

    @OriginalMember(owner = "client!mq", name = "M", descriptor = "I")
    public static int field5219;

    @OriginalMember(owner = "client!mq", name = "N", descriptor = "I")
    public static int field5220;

    @OriginalMember(owner = "client!mq", name = "P", descriptor = "I")
    public static int field5222;

    @OriginalMember(owner = "client!mq", name = "T", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!mq", name = "V", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!mq", name = "W", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!mq", name = "X", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!mq", name = "Y", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!mq", name = "ab", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!mq", name = "U", descriptor = "Luh;")
    private class115 field5227;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BLka;Lqa;)V")
    private final void method2224(byte arg0, class336 arg1, class167 arg2) {
        ++field5233;
        int var4 = 63 % ((-11 - arg0) / 39);
        class248[] var5 = arg1.method1172();
        class280[] var6 = arg1.method1144();
        if ((this.field5227 == null || this.field5227.field1706) && (var5 != null || var6 != null)) {
            this.field5227 = class115.method810(class24.field349);
        }
        if (this.field5227 != null) {
            this.field5227.method817(arg2, (long) class24.field349, var5, var6, false);
            this.field5227.method814(super.field6956, super.field6971, super.field6970, super.field6962, super.field6959);
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILqa;)Lnj;")
    public final class166 method554(int arg0, class167 arg1) {
        ++field5228;
        class336 var3 = this.method2230(this.field5210, arg1, (~this.field5215 == -1 ? 0 : 5) | 2048, (byte) -80);
        if (var3 == null) {
            return null;
        } else {
            if (this.field5215 != arg0) {
                var3.method1151(this.field5215 * 2048);
            }
            class15 var4 = arg1.method312();
            var4.method47(super.field6961, super.field6954, super.field6965);
            if (this.field5227 == null) {
                var3.method1142(var4, (class48) null, 0);
            } else {
                class300 var5 = this.field5227.method819();
                arg1.method332(var3, var5, var4, (class48) null, 0);
            }
            this.field5221 = var3.method1130();
            this.method2224((byte) 94, var3, arg1);
            return null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIILqa;ZLee;Z)V")
    public final void method558(int arg0, int arg1, int arg2, class167 arg3, boolean arg4, class487 arg5, boolean arg6) {
        if (!arg4) {
            ++field5217;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static void method2225(byte arg0) {
        int var1 = -76 / ((43 - arg0) / 47);
        field5225 = null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Z)V")
    public final void method549(boolean arg0) {
        if (arg0) {
            this.field5232 = 69;
        }
        ++field5231;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)V")
    public final void method2226(int arg0) {
        if (this.field5227 != null) {
            this.field5227.method813();
        }
        if (arg0 < 91) {
            method2227(-102, (byte) 62);
        }
        ++field5209;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IB)Z")
    public static final boolean method2227(int arg0, byte arg1) {
        ++field5211;
        if (arg1 != -40) {
            return true;
        } else {
            return ~arg0 == -3 || ~arg0 == -4 || ~arg0 == -5 || ~arg0 == -6;
        }
    }

    @OriginalMember(owner = "client!mq", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        this.field5216 = arg1 + arg2;
        this.field5215 = arg12;
        this.field5210 = arg0;
        this.field5232 = arg4;
        class394 var14 = class69.field1133.method1312(this.field5210, (byte) -39);
        int var15 = var14.field5596;
        if (var15 == -1) {
            this.field5224 = true;
        } else {
            this.field5223 = class96.field1526.method2717(-102, var15);
            this.field5224 = false;
        }
        if (this.field5216 == arg2) {
            class511.method2983(super.field6961, this.field5213, super.field6965, -64, false, this.field5223, super.field6956);
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(Z)I")
    public final int method1792(boolean arg0) {
        if (arg0) {
            this.field5232 = 110;
        }
        ++field5229;
        return this.field5221;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method553(int arg0, int arg1, int arg2, class167 arg3) {
        ++field5219;
        if (arg2 <= 42) {
            this.method552((class167) null, (byte) 114);
        }
        return false;
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(Lqa;B)Lem;")
    public final class154 method562(class167 arg0, byte arg1) {
        if (arg1 > -117) {
            return null;
        } else {
            ++field5207;
            return null;
        }
    }

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "(II)V")
    public final void method2228(int arg0, int arg1) {
        int var3 = -81 % ((arg0 - 36) / 62);
        ++field5205;
        if (!this.field5224) {
            this.field5208 += arg1;
            while (this.field5208 > this.field5223.field2713[this.field5213]) {
                this.field5208 -= this.field5223.field2713[this.field5213];
                ++this.field5213;
                if (this.field5213 >= this.field5223.field2692.length) {
                    this.field5224 = true;
                    break;
                }
            }
            if (!this.field5224) {
                class511.method2983(super.field6961, this.field5213, super.field6965, -64, false, this.field5223, super.field6956);
            }
        }
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B[Ljava/lang/Object;[I)V")
    public static final void method2229(byte arg0, Object[] arg1, int[] arg2) {
        class178.method1245(arg1, arg2, 1, arg2.length + -1, 0);
        if (arg0 >= -114) {
            field5225 = null;
        }
        ++field5226;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lqa;B)V")
    public final void method552(class167 arg0, byte arg1) {
        ++field5230;
        class336 var3 = this.method2230(this.field5210, arg0, 0, (byte) -34);
        if (var3 != null) {
            this.method2224((byte) -112, var3, arg0);
        }
        if (arg1 > -119) {
            this.method1792(false);
        }
    }

    @OriginalMember(owner = "client!mq", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field5218;
        if (this.field5227 != null) {
            this.field5227.method813();
        }
    }

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)Z")
    public final boolean method556(int arg0) {
        if (arg0 != -1) {
            this.field5208 = -21;
        }
        ++field5214;
        return false;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(ILqa;IB)Lka;")
    private final class336 method2230(int arg0, class167 arg1, int arg2, byte arg3) {
        ++field5212;
        class394 var5 = class69.field1133.method1312(arg0, (byte) -39);
        int var6 = 1 / ((arg3 - 35) / 33);
        class24 var7 = class393.field5594[super.field6956];
        class24 var8 = ~this.field5232 > -4 ? class393.field5594[this.field5232 + 1] : null;
        return !this.field5224 ? var5.method2379(arg2, super.field6961, 0, this.field5208, super.field6954, arg1, var7, class96.field1526, var8, true, super.field6965, this.field5213, this.field5206) : var5.method2379(arg2, super.field6961, 0, 0, super.field6954, arg1, var7, class96.field1526, var8, true, super.field6965, -1, -1);
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(Lia;III[Z)Z")
    public static final boolean method2231(class424 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class477.field6942 != class146.field2262) {
            int var6 = class393.field5594[arg1].method143(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; ++var7) {
                class24 var8 = class393.field5594[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method143(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method154(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method150(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }
}
