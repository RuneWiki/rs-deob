import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class220 extends class185 {

    @OriginalMember(owner = "client!su", name = "ob", descriptor = "I")
    private int field3441 = 0;

    @OriginalMember(owner = "client!su", name = "Q", descriptor = "Z")
    private boolean field3445 = true;

    @OriginalMember(owner = "client!su", name = "kb", descriptor = "Z")
    public boolean field3458 = false;

    @OriginalMember(owner = "client!su", name = "ib", descriptor = "I")
    private int field3460 = 0;

    @OriginalMember(owner = "client!su", name = "V", descriptor = "I")
    private int field3467 = 0;

    @OriginalMember(owner = "client!su", name = "tb", descriptor = "I")
    private int field3466 = -1;

    @OriginalMember(owner = "client!su", name = "eb", descriptor = "I")
    private int field3450 = 0;

    @OriginalMember(owner = "client!su", name = "lb", descriptor = "I")
    private int field3464 = 0;

    @OriginalMember(owner = "client!su", name = "Z", descriptor = "I")
    public int field3468;

    @OriginalMember(owner = "client!su", name = "hb", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!su", name = "rb", descriptor = "Loe;")
    private class210 field3461;

    @OriginalMember(owner = "client!su", name = "ub", descriptor = "[Ljava/lang/String;")
    private static final String[] field3473 = new String[] { method1950(method1949("Nd\u000f:\r")), method1950(method1949("Nd\u000f*\r")), method1950(method1949("F?\u000fWX")), method1950(method1949("SdM\u0015")), method1950(method1949("Nd\u000f1\r")), method1950(method1949("Nd\u000f(\r")), method1950(method1949("Nd\u000f\u001fLSpM\u0010_X9")), method1950(method1949("Nd\u000fELSxUG\r")), method1950(method1949("Nd\u000f0\r")), method1950(method1949("Nd\u000f)\r")), method1950(method1949("Nd\u000f>\r")), method1950(method1949("Nd\u000f:d\u0015")), method1950(method1949("Nd\u000f?\r")), method1950(method1949("Nd\u000f/\r")), method1950(method1949("Nd\u000f;d\u0015")), method1950(method1949("Nd\u000f<d\u0015")), method1950(method1949("Nd\u000f8\r")), method1950(method1949("Nd\u000f7\r")), method1950(method1949("Nd\u000f-\r")), method1950(method1949("Nd\u000f8d\u0015")), method1950(method1949("Nd\u000f=d\u0015")) };

    @OriginalMember(owner = "client!su", name = "R", descriptor = "J")
    public static long field3444 = 0L;

    @OriginalMember(owner = "client!su", name = "fb", descriptor = "Z")
    public static boolean field3442 = false;

    @OriginalMember(owner = "client!su", name = "U", descriptor = "I")
    public static int field3443;

    @OriginalMember(owner = "client!su", name = "W", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!su", name = "Y", descriptor = "I")
    public static int field3447;

    @OriginalMember(owner = "client!su", name = "jb", descriptor = "I")
    public static int field3448;

    @OriginalMember(owner = "client!su", name = "ab", descriptor = "I")
    public static int field3451;

    @OriginalMember(owner = "client!su", name = "nb", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!su", name = "O", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!su", name = "P", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!su", name = "bb", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!su", name = "qb", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!su", name = "cb", descriptor = "I")
    public static int field3459;

    @OriginalMember(owner = "client!su", name = "T", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!su", name = "S", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!su", name = "X", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!su", name = "mb", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!su", name = "db", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!su", name = "pb", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!su", name = "sb", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!su", name = "gb", descriptor = "Ltn;")
    private class92 field3453;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ZI)V")
    public final void method1943(boolean arg0, int arg1) {
        try {
            ++field3447;
            if (!this.field3458) {
                this.field3464 += arg1;
                while (this.field3461.field3334[this.field3450] < this.field3464) {
                    this.field3464 -= this.field3461.field3334[this.field3450];
                    ++this.field3450;
                    if (~this.field3461.field3327.length >= ~this.field3450) {
                        this.field3458 = true;
                        break;
                    }
                }
                if (!this.field3458) {
                    class531.method3967(-76, this.field3461, this.field3450, this);
                }
                if (!arg0) {
                    this.method1947(-112, 102, (class63) null, true);
                }
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3473[8] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIILha;)Z")
    public final boolean method46(int arg0, int arg1, int arg2, class63 arg3) {
        try {
            ++field3469;
            if (arg0 != 131072) {
                this.field3466 = -114;
            }
            return false;
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3473[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3473[2] : field3473[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public final void method1944(int arg0) {
        try {
            int var2 = 58 % ((arg0 - -42) / 58);
            if (this.field3453 != null) {
                this.field3453.method891();
            }
            ++field3451;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3473[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        try {
            if (this.field3453 != null) {
                this.field3453.method891();
            }
            ++field3463;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field3473[6] + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Lha;B)Lkv;")
    public final class281 method52(class63 arg0, byte arg1) {
        try {
            ++field3472;
            class499 var3 = this.method1947(2048 | (this.field3467 == 0 ? 0 : 5), this.field3449, arg0, true);
            if (var3 == null) {
                return null;
            } else {
                if (this.field3467 != 0) {
                    var3.method413(this.field3467 * 2048);
                }
                class486 var4 = arg0.method251();
                if (arg1 != 122) {
                    return null;
                } else {
                    var4.method2465(super.field9985, super.field9972, super.field9983);
                    this.method1946(arg1 + -122, var4, arg0, var3);
                    class281 var5 = class349.method2910(false, 1, (byte) -126);
                    if (class200.field3163) {
                        var3.method423(var4, var5.field4578[0], class547.field8042, 0);
                    } else {
                        var3.method426(var4, var5.field4578[0], 0);
                    }
                    if (this.field3453 != null) {
                        class659 var6 = this.field3453.method893();
                        if (class200.field3163) {
                            arg0.method172(var6, class547.field8042);
                        } else {
                            arg0.method191(var6);
                        }
                    }
                    this.field3445 = var3.method407();
                    this.field3460 = var3.method438();
                    this.field3441 = var3.method390();
                    return var5;
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3473[15] + (arg0 != null ? field3473[2] : field3473[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1945(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        try {
            ++field3457;
            int var7 = arg0 + arg5;
            int var8 = arg1 - arg5;
            if (arg6 != 0) {
                field3442 = false;
            }
            for (int var9 = arg0; ~var7 < ~var9; ++var9) {
                class545.method4051(arg2, arg4, arg3, class193.field3047[var9], -127);
            }
            for (int var10 = arg1; var10 > var8; --var10) {
                class545.method4051(arg2, arg4, arg3, class193.field3047[var10], -107);
            }
            int var11 = arg2 - -arg5;
            int var12 = -arg5 + arg3;
            for (int var13 = var7; var8 >= var13; ++var13) {
                int[] var14 = class193.field3047[var13];
                class545.method4051(arg2, arg4, var11, var14, arg6 + -112);
                class545.method4051(var12, arg4, arg3, var14, -110);
            }
        } catch (RuntimeException var16) {
            throw class590.method4333(var16, field3473[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(IIIIIIIIIIIII)V")
    public class220(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, false, (byte) 0);
        try {
            this.field3467 = arg12;
            this.field3468 = arg1 + arg2;
            this.field3449 = arg0;
            class75 var14 = class779.field11366.method1859((byte) -102, this.field3449);
            int var15 = var14.field1072;
            if (~var15 != 0) {
                this.field3461 = class397.field6293.method2058(var15, (byte) 126);
                this.field3458 = false;
            } else {
                this.field3458 = true;
            }
            if (~this.field3468 == ~arg2) {
                class531.method3967(-99, this.field3461, this.field3450, this);
            }
        } catch (RuntimeException var17) {
            throw class590.method4333(var17, field3473[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "b", descriptor = "(Lha;B)Lrga;")
    public final class250 method47(class63 arg0, byte arg1) {
        try {
            if (arg1 != -118) {
                return null;
            } else {
                ++field3455;
                return null;
            }
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field3473[20] + (arg0 != null ? field3473[2] : field3473[3]) + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ILsj;Lha;Lka;)V")
    private final void method1946(int arg0, class486 arg1, class63 arg2, class499 arg3) {
        try {
            ++field3446;
            if (arg0 == 0) {
                arg3.method418(arg1);
                class239[] var5 = arg3.method392();
                class265[] var6 = arg3.method408();
                if ((this.field3453 == null || this.field3453.field1354) && (var5 != null || var6 != null)) {
                    this.field3453 = class92.method905(class431.field6776, true);
                }
                if (this.field3453 != null) {
                    this.field3453.method896(arg2, (long) class431.field6776, var5, var6, false);
                    this.field3453.method904(super.field9975, super.field2945, super.field2940, super.field2946, super.field2939);
                }
            }
        } catch (RuntimeException var8) {
            throw class590.method4333(var8, field3473[4] + arg0 + ',' + (arg1 != null ? field3473[2] : field3473[3]) + ',' + (arg2 != null ? field3473[2] : field3473[3]) + ',' + (arg3 != null ? field3473[2] : field3473[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "g", descriptor = "(I)I")
    public final int method43(int arg0) {
        try {
            if (arg0 != 0) {
                this.method41((byte) 60);
            }
            ++field3470;
            return this.field3460;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3473[11] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IILha;Z)Lka;")
    private final class499 method1947(int arg0, int arg1, class63 arg2, boolean arg3) {
        try {
            if (!arg3) {
                this.finalize();
            }
            ++field3456;
            class75 var5 = class779.field11366.method1859((byte) -63, arg1);
            class293 var6 = class493.field7420[super.field9975];
            class293 var7 = ~super.field9974 > -4 ? class493.field7420[super.field9974 + 1] : null;
            return this.field3458 ? var5.method779(arg0, var6, -1, super.field9972, var7, arg2, class397.field6293, super.field9983, 0, 15, super.field9985, true, -1) : var5.method779(arg0, var6, this.field3466, super.field9972, var7, arg2, class397.field6293, super.field9983, this.field3464, 15, super.field9985, true, this.field3450);
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3473[12] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3473[2] : field3473[3]) + ',' + arg3 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(B)I")
    public final int method54(byte arg0) {
        try {
            if (arg0 >= -112) {
                this.field3460 = -65;
            }
            ++field3465;
            return this.field3441;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3473[19] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIB[B)V")
    public static final void method1948(int arg0, int arg1, int arg2, int arg3, byte arg4, byte[] arg5) {
        try {
            ++field3462;
            if (arg4 >= -94) {
                method1948(-51, 79, 66, 107, (byte) 106, (byte[]) null);
            }
            if (~arg0 > ~arg3) {
                int var14 = arg3 - arg0 >> 2;
                arg2 += arg0;
                while (true) {
                    --var14;
                    if (var14 < 0) {
                        var14 = 3 & -arg0 + arg3;
                        while (true) {
                            --var14;
                            if (var14 < 0) {
                                return;
                            }
                            arg5[arg2++] = 1;
                        }
                    }
                    int var8 = arg2 + 1;
                    arg5[arg2] = 1;
                    int var9 = var8 + 1;
                    arg5[var8] = 1;
                    int var10 = var9 + 1;
                    arg5[var9] = 1;
                    arg2 = var10 + 1;
                    arg5[var10] = 1;
                }
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field3473[16] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field3473[2] : field3473[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(ZILha;ILrda;II)V")
    public final void method48(boolean arg0, int arg1, class63 arg2, int arg3, class693 arg4, int arg5, int arg6) {
        try {
            ++field3454;
            if (arg5 > -10) {
                this.field3461 = null;
            }
            throw new IllegalStateException();
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field3473[18] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3473[2] : field3473[3]) + ',' + arg3 + ',' + (arg4 != null ? field3473[2] : field3473[3]) + ',' + arg5 + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "d", descriptor = "(B)V")
    public final void method50(byte arg0) {
        try {
            if (arg0 < -41) {
                ++field3452;
                throw new IllegalStateException();
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3473[9] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "f", descriptor = "(I)Z")
    public final boolean method45(int arg0) {
        try {
            ++field3459;
            return arg0 != -32768 ? true : this.field3445;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3473[13] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "e", descriptor = "(I)Z")
    public final boolean method53(int arg0) {
        try {
            if (arg0 != 47) {
                return false;
            } else {
                ++field3471;
                return false;
            }
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3473[1] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BLha;)V")
    public final void method40(byte arg0, class63 arg1) {
        try {
            ++field3448;
            if (arg0 != -108) {
                this.method53(4);
            }
            class499 var3 = this.method1947(0, this.field3449, arg1, true);
            if (var3 != null) {
                class486 var4 = arg1.method251();
                var4.method2465(super.field9985, super.field9972, super.field9983);
                this.method1946(arg0 + 108, var4, arg1, var3);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field3473[14] + arg0 + ',' + (arg1 != null ? field3473[2] : field3473[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "f", descriptor = "(B)Z")
    public final boolean method41(byte arg0) {
        try {
            if (arg0 < 54) {
                this.field3464 = 93;
            }
            ++field3443;
            return false;
        } catch (RuntimeException var3) {
            throw class590.method4333(var3, field3473[17] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!su", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1949(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 37);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!su", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1950(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 61;
                    break;
                case 1:
                    var10005 = 17;
                    break;
                case 2:
                    var10005 = 33;
                    break;
                case 3:
                    var10005 = 121;
                    break;
                default:
                    var10005 = 37;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
