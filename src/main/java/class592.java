import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class592 extends class211 {

    @OriginalMember(owner = "client!kj", name = "F", descriptor = "I")
    private int field8701 = -1;

    @OriginalMember(owner = "client!kj", name = "E", descriptor = "[Ljava/lang/String;")
    private static final String[] field8703 = new String[] { method4415(method4414("(X:E\u000f")), method4415(method4414("(X:Y\u000f")), method4415(method4414("(X:\\\u000f")), method4415(method4414("(X:[\u000f")), method4415(method4414("(X:]\u000f")), method4415(method4414("(X:X\u000f")), method4415(method4414("(X:_\u000f")), method4415(method4414("(X:Z\u000f")), method4415(method4414("8\u001c:\"Z")), method4415(method4414("(X:O\u000f")), method4415(method4414("-Gx`")), method4415(method4414("(X:^\u000f")), method4415(method4414("(X:C\u000f")) };

    @OriginalMember(owner = "client!kj", name = "C", descriptor = "Lel;")
    public static class573 field8691 = new class573(8, -2);

    @OriginalMember(owner = "client!kj", name = "H", descriptor = "I")
    private int field8688;

    @OriginalMember(owner = "client!kj", name = "M", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!kj", name = "G", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!kj", name = "K", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!kj", name = "Q", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!kj", name = "O", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!kj", name = "D", descriptor = "I")
    public static int field8695;

    @OriginalMember(owner = "client!kj", name = "I", descriptor = "I")
    public static int field8696;

    @OriginalMember(owner = "client!kj", name = "L", descriptor = "I")
    public static int field8697;

    @OriginalMember(owner = "client!kj", name = "P", descriptor = "I")
    public static int field8698;

    @OriginalMember(owner = "client!kj", name = "J", descriptor = "I")
    private int field8699;

    @OriginalMember(owner = "client!kj", name = "N", descriptor = "I")
    public static int field8702;

    @OriginalMember(owner = "client!kj", name = "R", descriptor = "[I")
    private int[] field8700;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(I)I")
    public final int method1857(int arg0) {
        try {
            int var2 = 24 % ((-30 - arg0) / 41);
            ++field8693;
            return this.field8701;
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8703[3] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III)V")
    public final void method1858(int arg0, int arg1, int arg2) {
        try {
            ++field8697;
            super.method1858(126, arg1, arg2);
            if (arg0 >= 12) {
                if (this.field8701 >= 0 && class560.field8337 != null) {
                    int var4 = !class560.field8337.method1366((byte) -118, this.field8701).field6481 ? 128 : 64;
                    this.field8700 = class560.field8337.method1364(-25656, false, this.field8701, var4, var4, 1.0F);
                    this.field8688 = var4;
                    this.field8699 = var4;
                }
            }
        } catch (RuntimeException var6) {
            throw class759.method5498(var6, field8703[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(BILib;)V")
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            if (arg0 <= 67) {
                method4410(78);
            }
            if (~arg1 == -1) {
                this.field8701 = arg2.method1445((byte) 126);
            }
            ++field8695;
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field8703[9] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8703[8] : field8703[10]) + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(B)V")
    public static void method4408(byte arg0) {
        try {
            field8691 = null;
            int var1 = -35 % ((arg0 - 7) / 60);
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8703[12] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "(III)Z")
    public static final boolean method4409(int arg0, int arg1, int arg2) {
        try {
            if (arg1 <= 110) {
                return true;
            } else {
                ++field8692;
                return class660.method4842((byte) -87, arg0, arg2) | (458752 & arg2) != 0 || class531.method4018(3, arg0, arg2);
            }
        } catch (RuntimeException var4) {
            throw class759.method5498(var4, field8703[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "(I)V")
    public static final void method4410(int arg0) {
        try {
            if (arg0 >= -60) {
                method4409(-117, 47, 112);
            }
            if (class752.field10946 != null) {
                class761.method5506(80);
            } else if (~class472.field6852 == 0) {
                class574.method4284((byte) -114, class122.field1439, class489.field7027);
            } else {
                class634.method4674((byte) -79);
            }
            ++field8702;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8703[7] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
    public final void method679(byte arg0) {
        try {
            ++field8694;
            super.method679(arg0);
            this.field8700 = null;
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field8703[4] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "()V")
    public class592() {
        super(0, false);
    }

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "(I)I")
    public static final int method4411(int arg0) {
        try {
            if (arg0 != -732) {
                field8691 = null;
            }
            ++field8689;
            return class195.field2612++;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field8703[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)[[I")
    public final int[][] method234(int arg0, int arg1) {
        try {
            if (arg1 > -38) {
                field8691 = null;
            }
            ++field8696;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int var4 = (~class463.field6744 == ~this.field8699 ? arg0 : this.field8699 * arg0 / class463.field6744) * this.field8688;
                int[] var5 = var3[0];
                int[] var6 = var3[1];
                int[] var7 = var3[2];
                if (~class343.field5332 == ~this.field8688) {
                    for (int var8 = 0; ~class343.field5332 < ~var8; ++var8) {
                        int var9 = this.field8700[var4++];
                        var7[var8] = class291.method2359(var9, 255) << 4;
                        var6[var8] = class291.method2359(var9 >> 4, 4080);
                        var5[var8] = class291.method2359(var9 >> 12, 4080);
                    }
                } else {
                    for (int var10 = 0; var10 < class343.field5332; ++var10) {
                        int var11 = this.field8688 * var10 / class343.field5332;
                        int var12 = this.field8700[var4 + var11];
                        var7[var10] = class291.method2359(var12 << 4, 4080);
                        var6[var10] = class291.method2359(var12 >> 4, 4080);
                        var5[var10] = class291.method2359(var12 >> 12, 4080);
                    }
                }
            }
            return var3;
        } catch (RuntimeException var14) {
            throw class759.method5498(var14, field8703[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIZI)V")
    public static final void method4412(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        try {
            ++field8698;
            int var6 = 0;
            if (!arg4) {
                method4409(-91, -30, -123);
            }
            int var7 = arg0;
            int var8 = arg5 * arg5;
            int var9 = arg0 * arg0;
            int var10 = var9 << 1;
            int var11 = var8 << 1;
            int var12 = arg0 << 1;
            int var13 = (-var12 + 1) * var8 + var10;
            int var14 = var9 - (var12 - 1) * var11;
            int var15 = var8 << 2;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) + 3) * var10;
            int var18 = ((arg0 << 1) + -3) * var11;
            int var19 = (var6 + 1) * var16;
            int var20 = (arg0 + -1) * var15;
            if (arg2 >= class676.field9807 && ~arg2 >= ~class381.field5786) {
                int var21 = class541.method4089(class200.field3119, class676.field9797, arg3 - -arg5, 18286);
                int var22 = class541.method4089(class200.field3119, class676.field9797, -arg5 + arg3, 18286);
                class319.method2702(class243.field3731[arg2], var22, var21, true, arg1);
            }
            while (~var7 < -1) {
                if (~var13 > -1) {
                    while (~var13 > -1) {
                        var14 += var19;
                        var13 += var17;
                        var17 += var16;
                        var19 += var16;
                        ++var6;
                    }
                }
                if (var14 < 0) {
                    var13 += var17;
                    var14 += var19;
                    ++var6;
                    var17 += var16;
                    var19 += var16;
                }
                var13 += -var20;
                var14 += -var18;
                var18 -= var15;
                var20 -= var15;
                --var7;
                int var23 = -var7 + arg2;
                int var24 = arg2 + var7;
                if (~var24 <= ~class676.field9807 && ~class381.field5786 <= ~var23) {
                    int var25 = class541.method4089(class200.field3119, class676.field9797, arg3 + var6, 18286);
                    int var26 = class541.method4089(class200.field3119, class676.field9797, -var6 + arg3, 18286);
                    if (class676.field9807 <= var23) {
                        class319.method2702(class243.field3731[var23], var26, var25, true, arg1);
                    }
                    if (~class381.field5786 <= ~var24) {
                        class319.method2702(class243.field3731[var24], var26, var25, true, arg1);
                    }
                }
            }
        } catch (RuntimeException var28) {
            throw class759.method5498(var28, field8703[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IIIIIII)Lol;")
    public static final class299 method4413(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field8690;
            long var7 = (long) arg5 * 67481L ^ (long) arg2 * 97549L ^ (long) arg6 * 475427L ^ (long) arg4 * 986053L ^ (long) arg0 * 32147369L ^ (long) arg3 * 76724863L;
            class299 var9 = (class299) class616.field9022.method1558((byte) 96, var7);
            if (arg1 <= 9) {
                return null;
            } else if (var9 != null) {
                return var9;
            } else {
                class299 var10 = class198.field3097.method505(arg5, arg2, arg6, arg4, arg0, arg3);
                class616.field9022.method1556(var7, var10, 1);
                return var10;
            }
        } catch (RuntimeException var12) {
            throw class759.method5498(var12, field8703[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method4414(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 39);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!kj", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method4415(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 67;
                    break;
                case 1:
                    var10005 = 50;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 12;
                    break;
                default:
                    var10005 = 39;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
