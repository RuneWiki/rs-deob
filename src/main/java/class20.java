import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class20 extends class457 implements class526 {

    @OriginalMember(owner = "client!ub", name = "db", descriptor = "Z")
    private boolean field224 = false;

    @OriginalMember(owner = "client!ub", name = "S", descriptor = "Lvi;")
    public class500 field213;

    @OriginalMember(owner = "client!ub", name = "W", descriptor = "Z")
    private boolean field217;

    @OriginalMember(owner = "client!ub", name = "fb", descriptor = "[S")
    private static short[] field226 = new short[] { 962, 20423, -21582, 11214, -10295 };

    @OriginalMember(owner = "client!ub", name = "cb", descriptor = "[S")
    private static short[] field223 = new short[] { 967, 20428, -21577, 11219, -10290 };

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "[S")
    private static short[] field207 = new short[] { 952, 20413, -21592, 11204, -10305 };

    @OriginalMember(owner = "client!ub", name = "jb", descriptor = "[S")
    private static short[] field230 = new short[] { 957, 20418, -21587, 11209, -10300 };

    @OriginalMember(owner = "client!ub", name = "ob", descriptor = "Z")
    public static boolean field235 = false;

    @OriginalMember(owner = "client!ub", name = "pb", descriptor = "[[S")
    public static short[][] field236 = new short[][] { field223, field226, field230, field207 };

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field206;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field208;

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "I")
    public static int field209;

    @OriginalMember(owner = "client!ub", name = "P", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!ub", name = "Q", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!ub", name = "R", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!ub", name = "T", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!ub", name = "U", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!ub", name = "V", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!ub", name = "X", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!ub", name = "Y", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!ub", name = "ab", descriptor = "I")
    public static int field221;

    @OriginalMember(owner = "client!ub", name = "bb", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!ub", name = "eb", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!ub", name = "gb", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!ub", name = "hb", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!ub", name = "ib", descriptor = "I")
    public static int field229;

    @OriginalMember(owner = "client!ub", name = "kb", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!ub", name = "lb", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!ub", name = "mb", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!ub", name = "nb", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!ub", name = "Z", descriptor = "Lcr;")
    private class533 field220;

    @OriginalMember(owner = "client!ub", name = "k", descriptor = "(I)V", line = 3)
    public static void method207(int arg0) {
        field223 = null;
        if (arg0 > -65) {
            field207 = null;
        }
        field230 = null;
        field236 = null;
        field226 = null;
        field207 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 18)
    public final void method208(int arg0) {
        if (arg0 != -18279) {
            field207 = null;
        }
        ++field222;
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)Z", line = 37)
    public final boolean method209(byte arg0) {
        ++field214;
        int var2 = 47 % ((arg0 - 31) / 42);
        return this.field224;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BLr;)V", line = 48)
    public final void method210(byte arg0, class166 arg1) {
        ++field211;
        if (arg0 != 12) {
            this.field217 = false;
        }
        this.field213.method2805(arg1, -125);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(B)I", line = 61)
    public final int method211(byte arg0) {
        ++field206;
        int var2 = -108 % ((38 - arg0) / 41);
        return this.field213.field6800;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lr;Ljs;IIIIIZII)V", line = 71)
    public class20(class166 arg0, class301 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field4182);
        this.field213 = new class500(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field217 = arg1.field4164 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ub", name = "l", descriptor = "(I)[Lgo;", line = 85)
    public static final class581[] method212(int arg0) {
        ++field215;
        if (arg0 != -1960882586) {
            field235 = true;
        }
        return new class581[] { class78.field1185, class436.field6064, class700.field9926, class9.field86, class375.field5027, class301.field4166, class12.field117, class488.field6699, class607.field8441, class316.field4351, class238.field3277, class528.field7155, class534.field7225, class134.field1905 };
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(B)I", line = 98)
    public final int method213(byte arg0) {
        ++field209;
        return arg0 < 39 ? 111 : this.field213.field6804;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILr;)Lcr;", line = 112)
    public final class533 method214(int arg0, class166 arg1) {
        int var3 = 111 % ((81 - arg0) / 43);
        ++field233;
        return this.field220;
    }

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "(I)Z", line = 126)
    public final boolean method215(int arg0) {
        if (arg0 <= 49) {
            this.field213 = null;
        }
        ++field208;
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Z)Z", line = 137)
    public final boolean method216(boolean arg0) {
        if (!arg0) {
            this.method220((class166) null, true);
        }
        ++field219;
        return false;
    }

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "(I)I", line = 149)
    public final int method217(int arg0) {
        ++field221;
        if (arg0 < 29) {
            this.field217 = false;
        }
        return this.field213.method2806(-124);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III[B)Ljava/lang/String;", line = 163)
    public static final String method218(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field216;
        char[] var4 = new char[arg2];
        int var5 = 0;
        if (arg0 != 1385181641) {
            field235 = true;
        }
        int var6 = arg1;
        int var7 = arg1 + arg2;
        while (var6 < var7) {
            int var8 = 255 & arg3[var6++];
            int var9;
            if (~var8 <= -129) {
                if (var8 < 192) {
                    var9 = 65533;
                } else if (~var8 <= -225) {
                    if (var8 < 240) {
                        if (var6 + 1 < var7 && ~(arg3[var6] & 192) == -129 && ~(arg3[var6 - -1] & 192) == -129) {
                            var9 = (63 & arg3[var6++]) << 6 | (var8 & 15) << 12 | arg3[var6++] & 63;
                            if (var9 < 2048) {
                                var9 = 65533;
                            }
                        } else {
                            var9 = 65533;
                        }
                    } else if (var8 >= 248) {
                        var9 = 65533;
                    } else if (var7 > var6 - -2 && ~(arg3[var6] & 192) == -129 && ~(192 & arg3[var6 + 1]) == -129 && ~(192 & arg3[var6 + 2]) == -129) {
                        int var10 = (7 & var8) << 18 | (63 & arg3[var6++]) << 12 | (arg3[var6++] & 63) << 6 | 63 & arg3[var6++];
                        if (~var10 <= -65537 && ~var10 >= -1114112) {
                            var9 = 65533;
                        } else {
                            var9 = 65533;
                        }
                    } else {
                        var9 = 65533;
                    }
                } else if (var7 > var6 && ~(arg3[var6] & 192) == -129) {
                    var9 = (31 & var8) << 6 | 63 & arg3[var6++];
                    if (var9 < 128) {
                        var9 = 65533;
                    }
                } else {
                    var9 = 65533;
                }
            } else if (~var8 != -1) {
                var9 = var8;
            } else {
                var9 = 65533;
            }
            var4[var5++] = (char) var9;
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)Z", line = 254)
    public final boolean method219(int arg0) {
        int var2 = -87 % ((28 - arg0) / 40);
        ++field212;
        return this.field213.method2810(256);
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lr;Z)V", line = 268)
    public final void method220(class166 arg0, boolean arg1) {
        ++field231;
        class55 var3 = this.field213.method2804(arg1, 121, 262144, arg0, true);
        if (var3 != null) {
            int var4 = super.field4042 >> 9;
            int var5 = super.field4047 >> 9;
            class392 var6 = arg0.method166();
            var6.method689(super.field4042, super.field4052, super.field4047);
            this.field213.method2803(false, var5, var3, arg0, var4, var4, var6, var5, false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(Lr;I)Lbca;", line = 290)
    public final class614 method221(class166 arg0, int arg1) {
        ++field229;
        class55 var3 = this.field213.method2804(true, arg1 ^ -122, 2048, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            class392 var4 = arg0.method166();
            var4.method689(super.field4042, super.field4052, super.field4047);
            class614 var5 = null;
            if (this.field217) {
                var5 = class524.method2987(arg1 ^ -6262, 1);
            }
            int var6 = super.field4042 >> 9;
            int var7 = super.field4047 >> 9;
            this.field213.method2803(true, var7, var3, arg0, var6, var6, var4, var7, false);
            if (arg1 != -5) {
                return null;
            } else {
                if (class340.field4563) {
                    var3.method453(var4, var5 == null ? null : var5.field8572[0], class22.field250, 0);
                } else {
                    var3.method465(var4, var5 != null ? var5.field8572[0] : null, 0);
                }
                if (this.field213.field6790 != null) {
                    class472 var8 = this.field213.field6790.method3598();
                    if (class340.field4563) {
                        arg0.method167(var8, class22.field250);
                    } else {
                        arg0.method163(var8);
                    }
                }
                this.field224 = var3.method430() || this.field213.field6790 != null;
                if (this.field220 == null) {
                    this.field220 = class333.method1966(super.field4042, 16, super.field4052, var3, super.field4047);
                } else {
                    class222.method1406(this.field220, super.field4042, super.field4052, false, super.field4047, var3);
                }
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)I", line = 345)
    public final int method222(boolean arg0) {
        ++field210;
        if (!arg0) {
            field235 = false;
        }
        return this.field213.field6799;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lvv;IIZLr;II)V", line = 360)
    public final void method223(class295 arg0, int arg1, int arg2, boolean arg3, class166 arg4, int arg5, int arg6) {
        if (arg6 == 0) {
            ++field228;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIILr;)Z", line = 377)
    public final boolean method224(int arg0, int arg1, int arg2, class166 arg3) {
        ++field218;
        class55 var5 = this.field213.method2804(false, arg1 + 121, 131072, arg3, false);
        if (var5 == null) {
            return false;
        } else {
            class392 var6 = arg3.method166();
            if (arg1 != 0) {
                field226 = null;
            }
            var6.method689(super.field4042, super.field4052, super.field4047);
            return class340.field4563 ? var5.method419(arg2, arg0, var6, false, class22.field250) : var5.method448(arg2, arg0, var6, false);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Lr;I)V", line = 396)
    public final void method225(class166 arg0, int arg1) {
        ++field225;
        this.field213.method2801(arg0, (byte) 124);
        if (arg1 != -32013) {
            this.method223((class295) null, -17, -104, true, (class166) null, 18, -67);
        }
    }

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "(I)I", line = 407)
    public final int method226(int arg0) {
        ++field232;
        if (arg0 != 6329) {
            field230 = null;
        }
        return this.field213.method2802(0);
    }

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "(I)V", line = 418)
    public final void method227(int arg0) {
        ++field227;
        if (arg0 > -115) {
            this.field220 = null;
        }
        throw new IllegalStateException();
    }
}
