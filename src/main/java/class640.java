import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class640 {

    @OriginalMember(owner = "client!lo", name = "h", descriptor = "Z")
    private boolean field9208 = false;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    private int field9202 = -1;

    @OriginalMember(owner = "client!lo", name = "r", descriptor = "I")
    private int field9218 = -1;

    @OriginalMember(owner = "client!lo", name = "w", descriptor = "Z")
    private boolean field9223 = false;

    @OriginalMember(owner = "client!lo", name = "J", descriptor = "I")
    private int field9235 = -32768;

    @OriginalMember(owner = "client!lo", name = "p", descriptor = "B")
    private byte field9216;

    @OriginalMember(owner = "client!lo", name = "x", descriptor = "B")
    private byte field9224;

    @OriginalMember(owner = "client!lo", name = "H", descriptor = "I")
    private int field9233;

    @OriginalMember(owner = "client!lo", name = "g", descriptor = "I")
    public int field9207;

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "I")
    private int field9205;

    @OriginalMember(owner = "client!lo", name = "L", descriptor = "I")
    public int field9237;

    @OriginalMember(owner = "client!lo", name = "B", descriptor = "I")
    public int field9228;

    @OriginalMember(owner = "client!lo", name = "F", descriptor = "Z")
    private boolean field9231;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    private int field9201;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field9203;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field9204;

    @OriginalMember(owner = "client!lo", name = "j", descriptor = "I")
    public static int field9210;

    @OriginalMember(owner = "client!lo", name = "k", descriptor = "I")
    public static int field9211;

    @OriginalMember(owner = "client!lo", name = "l", descriptor = "I")
    private int field9212;

    @OriginalMember(owner = "client!lo", name = "n", descriptor = "I")
    public static int field9214;

    @OriginalMember(owner = "client!lo", name = "o", descriptor = "I")
    public static int field9215;

    @OriginalMember(owner = "client!lo", name = "s", descriptor = "I")
    private int field9219;

    @OriginalMember(owner = "client!lo", name = "t", descriptor = "I")
    public static int field9220;

    @OriginalMember(owner = "client!lo", name = "u", descriptor = "I")
    public static int field9221;

    @OriginalMember(owner = "client!lo", name = "y", descriptor = "I")
    public static int field9225;

    @OriginalMember(owner = "client!lo", name = "z", descriptor = "I")
    public static int field9226;

    @OriginalMember(owner = "client!lo", name = "A", descriptor = "I")
    private int field9227;

    @OriginalMember(owner = "client!lo", name = "E", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!lo", name = "G", descriptor = "I")
    public static int field9232;

    @OriginalMember(owner = "client!lo", name = "I", descriptor = "I")
    public static int field9234;

    @OriginalMember(owner = "client!lo", name = "K", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!lo", name = "m", descriptor = "Lr;")
    private class157 field9213;

    @OriginalMember(owner = "client!lo", name = "D", descriptor = "Lts;")
    public class455 field9229;

    @OriginalMember(owner = "client!lo", name = "i", descriptor = "Lk;")
    private class483 field9209;

    @OriginalMember(owner = "client!lo", name = "v", descriptor = "Llk;")
    private class502 field9222;

    @OriginalMember(owner = "client!lo", name = "f", descriptor = "[Z")
    private boolean[] field9206;

    @OriginalMember(owner = "client!lo", name = "q", descriptor = "[[B")
    public static byte[][] field9217;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BI)V")
    public final void method3666(byte arg0, int arg1) {
        if (arg0 != 112) {
            method3672(true);
        }
        this.field9208 = true;
        field9220++;
        this.method3673(arg1, -10);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(III)V")
    public static final void method3667(int arg0, int arg1, int arg2) {
        if (arg0 != 10) {
            method3670((byte) -88, 106, -52);
        }
        field9203++;
        class557 var3 = class93.method564(1, -14073, arg1);
        var3.method3257(arg0 ^ 0x796);
        var3.field8207 = arg2;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZZIILqa;II)Lr;")
    public final class157 method3668(boolean arg0, boolean arg1, int arg2, int arg3, class206 arg4, int arg5, int arg6) {
        field9210++;
        class437 var8 = class16.field126.method1759(false, this.field9237);
        if (var8.field6004 != null) {
            var8 = var8.method2545(-1, class281.field3700);
        }
        if (arg6 != -3) {
            this.method3668(true, true, 92, 56, null, -49, -123);
        }
        if (var8 == null) {
            this.method3677(false, arg4);
            this.field9202 = this.field9227;
            this.field9218 = -1;
            return null;
        }
        if (!this.field9208 && this.field9218 != var8.field5996) {
            this.field9213 = null;
            this.method3673(-1, -40);
        }
        this.method3676(arg3, arg5, -109);
        boolean var9 = arg1 & this.field9231 & class565.field8299.method990(class529.field7429, -1) != 0;
        boolean var10 = var9 & (this.field9218 != var8.field5996 || (this.field9227 != this.field9202 || this.field9222 != null && (this.field9222.field6967 || class166.field2034) && this.field9227 != this.field9212) && class565.field8299.method990(class529.field7429, -1) >= 2);
        if (arg0 && !var10) {
            this.field9218 = var8.field5996;
            this.field9202 = this.field9227;
            return null;
        }
        if (var10) {
            class131.method738(this.field9209, this.field9224, this.field9233, this.field9205, this.field9206);
        }
        class174 var11 = class128.field1574[this.field9224];
        class174 var12;
        if (this.field9223) {
            var12 = class90.field1114[0];
        } else {
            var12 = this.field9224 >= 3 ? null : class128.field1574[this.field9224 + 1];
        }
        class157 var13 = null;
        if (this.field9222 != null) {
            if (var10) {
                arg2 |= 0x40000;
            }
            var13 = var8.method2537(this.field9233, arg2, this.field9227, var12, (byte) -59, var11, this.field9228 == 11 ? this.field9207 + 4 : this.field9207, this.field9205, this.field9212, arg4, this.field9201, this.field9228 == 11 ? 10 : this.field9228, this.field9222, var11.method847(this.field9233, this.field9205));
            if (var13 == null) {
                this.field9209 = null;
                this.field9235 = 0;
                this.field9206 = null;
            } else {
                if (var10) {
                    if (this.field9206 == null) {
                        this.field9206 = new boolean[4];
                    }
                    this.field9209 = var13.method81(this.field9209);
                    class644.method3721(this.field9209, this.field9224, arg5, arg3, this.field9206);
                }
                this.field9235 = var13.method74();
            }
            this.field9213 = null;
        } else if (this.field9213 != null && (arg2 & this.field9213.method77()) == arg2 && this.field9218 == var8.field5996) {
            var13 = this.field9213;
        } else {
            if (this.field9213 != null) {
                arg2 |= this.field9213.method77();
            }
            class372 var14 = var8.method2541(var11, var10, arg2, var12, arg4, this.field9233, this.field9205, arg6 + 7, var11.method847(this.field9233, this.field9205), this.field9228 == 11 ? this.field9207 + 4 : this.field9207, this.field9228 == 11 ? 10 : this.field9228);
            if (var14 == null) {
                this.field9206 = null;
                this.field9209 = null;
                this.field9235 = 0;
                this.field9213 = null;
            } else {
                var13 = var14.field4894;
                this.field9213 = var14.field4894;
                if (var10) {
                    this.field9209 = var14.field4893;
                    this.field9206 = null;
                    class644.method3721(this.field9209, this.field9224, arg5, arg3, null);
                }
                this.field9235 = var13.method74();
            }
        }
        this.field9218 = var8.field5996;
        this.field9202 = this.field9227;
        this.field9205 = arg3;
        this.field9233 = arg5;
        return var13;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Lqa;I)V")
    public final void method3669(class206 arg0, int arg1) {
        field9226++;
        this.method3668(true, true, arg1, this.field9205, arg0, this.field9233, -3);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(BII)Z")
    public static final boolean method3670(byte arg0, int arg1, int arg2) {
        field9204++;
        if (arg0 != 98) {
            field9217 = null;
        }
        return (arg2 & 0x800) != 0 | class629.method3601((byte) -53, arg1, arg2) || class548.method3214(arg1, arg2, 45056);
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(I)I")
    public final int method3671(int arg0) {
        field9230++;
        if (arg0 != -29019) {
            field9217 = null;
        }
        return this.field9235;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)V")
    public static void method3672(boolean arg0) {
        if (!arg0) {
            field9217 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field9221++;
        if (this.field9229 != null) {
            this.field9229.method2654();
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(II)V")
    private final void method3673(int arg0, int arg1) {
        int var3 = 15 % ((37 - arg1) / 43);
        field9234++;
        int var4 = arg0;
        boolean var5 = false;
        if (arg0 == -1) {
            class437 var6 = class16.field126.method1759(false, this.field9237);
            class437 var7 = var6;
            if (var6.field6004 != null) {
                var6 = var6.method2545(-1, class281.field3700);
            }
            if (var6 == null) {
                return;
            }
            if (var6 == var7) {
                var7 = null;
            }
            if (var6.field5976 != null) {
                if (this.field9222 != null && var6.method2544(-31, this.field9222.field6963)) {
                    return;
                }
                var4 = var6.method2536((byte) 122);
                if (this.field9218 != var6.field5996) {
                    var5 = var6.field6009;
                }
            } else if (var6.field5969 == -1) {
                if (var7 != null && var7.field5976 != null) {
                    if (this.field9222 != null && var7.method2544(-31, this.field9222.field6963)) {
                        return;
                    }
                    var4 = var7.method2536((byte) 125);
                    if (this.field9218 != var7.field5996) {
                        var5 = var7.field6009;
                    }
                } else if (var7 != null && var7.field5969 != -1 && this.field9218 != var7.field5996) {
                    var5 = var7.field6009;
                    var4 = var7.field5969;
                }
            } else if (this.field9218 != var6.field5996) {
                var5 = var6.field6009;
                var4 = var6.field5969;
            }
        }
        if (var4 == -1) {
            this.field9222 = null;
            return;
        }
        this.field9213 = null;
        if (this.field9222 == null || this.field9222.field6963 != var4) {
            this.field9222 = class393.field5190.method770(var4, -128);
        } else if (this.field9222.field6940 == 0) {
            return;
        }
        if (this.field9222.field6944 == null) {
            this.field9222 = null;
            return;
        }
        if (var5) {
            this.field9227 = (int) (Math.random() * (double) this.field9222.field6944.length);
            this.field9201 = ((int) ((double) this.field9222.field6952[this.field9227] * Math.random())) + 1;
        } else {
            this.field9227 = 0;
            this.field9201 = 1;
        }
        this.field9212 = this.field9227 + 1;
        if (this.field9212 < 0 || this.field9222.field6944.length <= this.field9212) {
            this.field9212 = -1;
        }
        this.field9219 = class335.field4358 - this.field9201;
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ILr;ILqa;IZII)V")
    public final void method3674(int arg0, class157 arg1, int arg2, class206 arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field9232++;
        class55[] var9 = arg1.method59();
        class348[] var10 = arg1.method78();
        if (arg2 != 4441) {
            this.field9218 = 108;
        }
        if ((this.field9229 == null || this.field9229.field6266) && (var9 != null || var10 != null)) {
            class437 var11 = class16.field126.method1759(false, this.field9237);
            if (var11.field6004 != null) {
                var11 = var11.method2545(-1, class281.field3700);
            }
            if (var11 != null) {
                this.field9229 = class455.method2652(class335.field4358);
            }
        }
        if (this.field9229 == null) {
            return;
        }
        if (arg5) {
            this.field9229.method2656(arg3, (long) class335.field4358, var9, var10, false);
        } else {
            this.field9229.method2658((long) class335.field4358);
        }
        this.field9229.method2662(this.field9216, arg7, arg0, arg6, arg4);
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(Z)Z")
    public final boolean method3675(boolean arg0) {
        if (arg0) {
            this.field9237 = -16;
        }
        field9236++;
        return this.field9231;
    }

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "(III)V")
    private final void method3676(int arg0, int arg1, int arg2) {
        int var4 = 10 % ((arg2 + 33) / 58);
        field9225++;
        label88: while (true) {
            if (this.field9222 == null) {
                if (this.field9208) {
                    return;
                }
                this.method3673(-1, -86);
                if (this.field9222 == null) {
                    return;
                }
            }
            int var5 = class335.field4358 - this.field9219;
            if (var5 > 100 && this.field9222.field6966 > 0) {
                int var6 = this.field9222.field6944.length - this.field9222.field6966;
                while (this.field9227 < var6 && this.field9222.field6952[this.field9227] < var5) {
                    var5 -= this.field9222.field6952[this.field9227];
                    this.field9227++;
                }
                if (var6 <= this.field9227) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field9222.field6944.length; var8++) {
                        var7 += this.field9222.field6952[var8];
                    }
                    var5 %= var7;
                }
                this.field9212 = this.field9227 + 1;
                if (this.field9222.field6944.length <= this.field9212) {
                    this.field9212 -= this.field9222.field6966;
                    if (this.field9212 < 0 || this.field9212 >= this.field9222.field6944.length) {
                        this.field9212 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field9222.field6952[this.field9227] >= var5) {
                            this.field9201 = var5;
                            this.field9219 = class335.field4358 - var5;
                            return;
                        }
                        class614.method3532(this.field9216, this.field9222, true, arg0, this.field9227, false, arg1);
                        var5 -= this.field9222.field6952[this.field9227];
                        this.field9227++;
                        if (this.field9227 >= this.field9222.field6944.length) {
                            this.field9227 -= this.field9222.field6966;
                            if (this.field9227 < 0 || this.field9222.field6944.length <= this.field9227) {
                                this.field9222 = null;
                                continue label88;
                            }
                        }
                        this.field9212 = this.field9227 + 1;
                    } while (this.field9212 < this.field9222.field6944.length);
                    this.field9212 -= this.field9222.field6966;
                } while (this.field9212 >= 0 && this.field9222.field6944.length > this.field9212);
                this.field9212 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZLqa;)V")
    public final void method3677(boolean arg0, class206 arg1) {
        field9214++;
        if (this.field9209 != null) {
            class131.method738(this.field9209, this.field9224, this.field9233, this.field9205, this.field9206);
            this.field9206 = null;
            this.field9209 = null;
        }
        if (arg0) {
            this.method3669(null, -20);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3678(boolean arg0, int arg1) {
        field9211++;
        if (class565.field8292[arg1]) {
            return true;
        } else if (class267.field3487.method2581(arg1, arg0)) {
            int var2 = class267.field3487.method2554(arg1, 124);
            if (var2 == 0) {
                class565.field8292[arg1] = true;
                return true;
            }
            if (class459.field6326[arg1] == null) {
                class459.field6326[arg1] = new class509[var2];
            }
            if (arg0) {
                method3667(68, 60, -27);
            }
            for (int var3 = 0; var3 < var2; var3++) {
                if (class459.field6326[arg1][var3] == null) {
                    byte[] var4 = class267.field3487.method2558(100, var3, arg1);
                    if (var4 != null) {
                        class509 var5 = class459.field6326[arg1][var3] = new class509();
                        var5.field7045 = (arg1 << 16) + var3;
                        if (var4[0] != -1) {
                            throw new IllegalStateException("if1");
                        }
                        var5.method2920((byte) 123, new class374(var4));
                    }
                }
            }
            class565.field8292[arg1] = true;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IJ)V")
    public static final void method3679(int arg0, long arg1) {
        field9215++;
        if (class383.field5070 != null) {
            if (class617.field8931 == 1 || class617.field8931 == 5) {
                class441.method2586(arg1, (byte) -26);
            } else if (class617.field8931 == 4) {
                class219.method1261((byte) -109, arg1);
            }
        }
        class529.method3010((long) class335.field4358, (byte) 91, class210.field2560);
        if (class599.field8668 != -1) {
            class104.method616(class599.field8668, -1);
        }
        if (arg0 != -11922) {
            field9217 = null;
        }
        for (int var3 = 0; var3 < class315.field4023; var3++) {
            if (class371.field4888[var3]) {
                class468.field6543[var3] = true;
            }
            class200.field2400[var3] = class371.field4888[var3];
            class371.field4888[var3] = false;
        }
        class636.field9146 = class335.field4358;
        if (class210.field2560.method271()) {
            class95.field1167 = true;
        }
        if (class599.field8668 != -1) {
            class315.field4023 = 0;
            class309.method1714(906);
        }
        class210.field2560.method1182();
        class356.method2002(class210.field2560, 17276);
        int var4 = class171.method955((byte) -79);
        if (var4 == -1) {
            var4 = class71.field684;
        }
        if (var4 == -1) {
            var4 = class529.field7434;
        }
        class205.method1097((byte) 113, var4);
        class191.method1032((byte) 119, class590.field8557, class103.field1265.field8660, class103.field1265.field8661, class103.field1265.field8652);
        class590.field8557 = 0;
    }

    @OriginalMember(owner = "client!lo", name = "<init>", descriptor = "(Lqa;Lcn;IIIIIIZI)V")
    public class640(class206 arg0, class437 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field9216 = (byte) arg4;
        this.field9224 = (byte) arg5;
        this.field9233 = arg6;
        this.field9207 = arg3;
        this.field9223 = arg8;
        this.field9205 = arg7;
        this.field9237 = arg1.field5996;
        this.field9228 = arg2;
        this.field9231 = arg0.method1108() && arg1.field5978 && !this.field9223;
        if (arg9 != -1) {
            this.field9208 = true;
        }
        this.method3673(arg9, -27);
    }
}
