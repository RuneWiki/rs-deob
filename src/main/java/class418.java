import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class418 extends class348 implements class147 {

    @OriginalMember(owner = "client!rca", name = "K", descriptor = "Ls;")
    public class253 field5899;

    @OriginalMember(owner = "client!rca", name = "L", descriptor = "Z")
    private boolean field5900;

    @OriginalMember(owner = "client!rca", name = "M", descriptor = "[I")
    public static int[] field5901 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!rca", name = "Q", descriptor = "[Lhn;")
    public static class661[] field5905 = new class661[4];

    @OriginalMember(owner = "client!rca", name = "y", descriptor = "Lfc;")
    public static class235 field5888 = new class235(79, 6);

    @OriginalMember(owner = "client!rca", name = "t", descriptor = "I")
    public static int field5883;

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
    public static int field5884;

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "I")
    public static int field5885;

    @OriginalMember(owner = "client!rca", name = "w", descriptor = "I")
    public static int field5886;

    @OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
    public static int field5887;

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "I")
    public static int field5889;

    @OriginalMember(owner = "client!rca", name = "B", descriptor = "I")
    public static int field5891;

    @OriginalMember(owner = "client!rca", name = "C", descriptor = "I")
    public static int field5892;

    @OriginalMember(owner = "client!rca", name = "D", descriptor = "I")
    public static int field5893;

    @OriginalMember(owner = "client!rca", name = "E", descriptor = "I")
    public static int field5894;

    @OriginalMember(owner = "client!rca", name = "F", descriptor = "I")
    public static int field5895;

    @OriginalMember(owner = "client!rca", name = "G", descriptor = "I")
    public static int field5896;

    @OriginalMember(owner = "client!rca", name = "H", descriptor = "I")
    public static int field5897;

    @OriginalMember(owner = "client!rca", name = "J", descriptor = "I")
    public static int field5898;

    @OriginalMember(owner = "client!rca", name = "N", descriptor = "I")
    public static int field5902;

    @OriginalMember(owner = "client!rca", name = "P", descriptor = "I")
    public static int field5904;

    @OriginalMember(owner = "client!rca", name = "R", descriptor = "I")
    public static int field5906;

    @OriginalMember(owner = "client!rca", name = "S", descriptor = "I")
    public static int field5907;

    @OriginalMember(owner = "client!rca", name = "T", descriptor = "I")
    public static int field5908;

    @OriginalMember(owner = "client!rca", name = "O", descriptor = "Lpj;")
    public static class132 field5903;

    @OriginalMember(owner = "client!rca", name = "A", descriptor = "Lac;")
    private class496 field5890;

    @OriginalMember(owner = "client!rca", name = "k", descriptor = "(I)V", line = 3)
    public static final void method2384(int arg0) {
        ++field5887;
        if (!class417.field5880) {
            if (arg0 < 55) {
                method2387(-1);
            }
            class586.field8200 = true;
            if (class274.field3872.field874) {
                class646.field9167 = (float) (-128 & (int) class646.field9167 - -191);
            } else {
                class149.field2221 += (-class149.field2221 + 24.0F) / 2.0F;
            }
            class417.field5880 = true;
        }
    }

    @OriginalMember(owner = "client!rca", name = "e", descriptor = "(I)I", line = 30)
    public final int method549(int arg0) {
        if (arg0 != 12352) {
            this.method555(-113, (class638) null);
        }
        ++field5894;
        return this.field5899.field3548;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILuea;I)V", line = 42)
    public static final void method2385(int arg0, int arg1, class286 arg2, int arg3) {
        ++field5892;
        if (~arg2.field6398 == ~arg1 && arg1 != -1) {
            class131 var4 = class301.field4465.method2763(arg1, 31696);
            int var5 = var4.field1801;
            if (~var5 == -2) {
                arg2.field6393 = 1;
                arg2.field6427 = arg0;
                arg2.field6444 = 0;
                arg2.field6413 = 0;
                arg2.field6450 = 0;
                class99.method769(class253.field3576 == arg2, arg2.field509, arg2.field520, var4, arg2.field514, 50, arg2.field6450);
            }
            if (~var5 == -3) {
                arg2.field6444 = 0;
            }
        } else if (arg1 == -1 || ~arg2.field6398 == 0 || class301.field4465.method2763(arg1, 31696).field1799 >= class301.field4465.method2763(arg2.field6398, 31696).field1799) {
            arg2.field6398 = arg1;
            arg2.field6427 = arg0;
            arg2.field6450 = 0;
            arg2.field6413 = 0;
            arg2.field6393 = 1;
            arg2.field6444 = 0;
            arg2.field6484 = arg2.field6485;
            if (~arg2.field6398 != 0) {
                class99.method769(class253.field3576 == arg2, arg2.field509, arg2.field520, class301.field4465.method2763(arg2.field6398, 31696), arg2.field514, 50, arg2.field6450);
            }
        }
        if (arg3 <= 88) {
            method2386(119, -111);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I)I", line = 93)
    public final int method554(int arg0) {
        if (arg0 != -18971) {
            return -11;
        } else {
            ++field5895;
            return this.field5899.field3569;
        }
    }

    @OriginalMember(owner = "client!rca", name = "g", descriptor = "(I)Z", line = 107)
    public final boolean method140(int arg0) {
        if (arg0 != 0) {
            this.method561((byte) 8, (class638) null);
        }
        ++field5897;
        return false;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "(Loa;Llt;IIIIIZII)V", line = 122)
    public class418(class638 arg0, class620 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field8583, arg1.field8584, arg1.field8586);
        this.field5899 = new class253(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field5900 = ~arg1.field8592 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILoa;)Lwc;", line = 131)
    public final class60 method555(int arg0, class638 arg1) {
        ++field5884;
        class352 var3 = this.field5899.method1563(true, arg1, super.field5015, false, super.field5009, 2048, true);
        if (var3 == null) {
            return null;
        } else {
            class391 var4 = arg1.method401();
            var4.method1288(super.field5015, super.field5010, super.field5009);
            class60 var5 = null;
            if (this.field5900) {
                var5 = class450.method2583(1, false);
            }
            int var6 = super.field5015 >> 9;
            int var7 = super.field5009 >> 9;
            this.field5899.method1565(var6, var4, arg1, var7, arg0, var7, var6, true, var3);
            if (this.field5899.field3574 == null) {
                var3.method205(var4, var5 != null ? var5.field818[0] : null, 0);
            } else {
                class281 var8 = this.field5899.field3574.method2288();
                arg1.method434(var3, var8, var4, var5 != null ? var5.field818[0] : null, 0);
            }
            if (this.field5890 != null) {
                class403.method2302(super.field5009, false, super.field5010, super.field5015, this.field5890, var3);
            } else {
                this.field5890 = class687.method3783(super.field5015, super.field5010, var3, super.field5009, arg0 ^ -98);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(II)I", line = 178)
    public static final int method2386(int arg0, int arg1) {
        ++field5891;
        if (~arg1 != arg0) {
            if (arg1 != 6409) {
                if (arg1 == 32841) {
                    return 1;
                } else if (arg1 != 6410) {
                    if (~arg1 == -6408) {
                        return 3;
                    } else if (~arg1 == -6409) {
                        return 4;
                    } else {
                        throw new IllegalArgumentException("");
                    }
                } else {
                    return 2;
                }
            } else {
                return 1;
            }
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILgfa;IIZLoa;)V", line = 210)
    public final void method143(int arg0, int arg1, class687 arg2, int arg3, int arg4, boolean arg5, class638 arg6) {
        int var8 = -57 / (-arg3 / 54);
        ++field5904;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)V", line = 222)
    public final void method550(int arg0) {
        if (arg0 > -4) {
            this.method551((class638) null, (byte) -114);
        }
        ++field5883;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILoa;I)Z", line = 235)
    public final boolean method559(int arg0, int arg1, class638 arg2, int arg3) {
        ++field5886;
        class352 var5 = this.field5899.method1563(true, arg2, super.field5015, false, super.field5009, 131072, false);
        if (var5 == null) {
            return false;
        } else {
            class391 var6 = arg2.method401();
            if (arg1 != -8003) {
                field5888 = null;
            }
            var6.method1288(super.field5015, super.field5010, super.field5009);
            return var5.method237(arg0, arg3, var6, false);
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(BLoa;)V", line = 254)
    public final void method561(byte arg0, class638 arg1) {
        this.field5899.method1557(arg1, 28393);
        ++field5907;
        if (arg0 != 111) {
            this.field5890 = null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z)V", line = 265)
    public final void method142(boolean arg0) {
        ++field5902;
        if (arg0) {
            this.method554(78);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(BLoa;)V", line = 277)
    public final void method556(byte arg0, class638 arg1) {
        ++field5885;
        if (arg0 < 5) {
            field5903 = null;
        }
        this.field5899.method1568(true, arg1);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(IILoa;)Lba;", line = 288)
    public final class352 method548(int arg0, int arg1, class638 arg2) {
        ++field5896;
        return arg0 != -585 ? null : this.field5899.method1563(true, arg2, 0, false, 0, arg1, false);
    }

    @OriginalMember(owner = "client!rca", name = "l", descriptor = "(I)V", line = 299)
    public static void method2387(int arg0) {
        field5888 = null;
        field5903 = null;
        field5901 = null;
        int var1 = 51 % ((arg0 - 60) / 54);
        field5905 = null;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(I[I[I[ILuea;)V", line = 313)
    public static final void method2388(int arg0, int[] arg1, int[] arg2, int[] arg3, class286 arg4) {
        for (int var5 = 0; ~arg2.length < ~var5; ++var5) {
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            int var9 = arg1[var5];
            for (int var10 = 0; var8 != 0 && arg4.field6400.length > var10; ++var10) {
                if ((1 & var8) != 0) {
                    if (~var7 != 0) {
                        class131 var11 = class301.field4465.method2763(var7, 31696);
                        int var12 = var11.field1801;
                        class535 var13 = arg4.field6400[var10];
                        if (var13 != null) {
                            if (var13.field7288 != var7) {
                                if (~var11.field1799 <= ~class301.field4465.method2763(var13.field7288, 31696).field1799) {
                                    var13 = arg4.field6400[var10] = null;
                                }
                            } else if (~var12 != -1) {
                                if (var12 != 1) {
                                    if (~var12 == -3) {
                                        var13.field7280 = 0;
                                    }
                                } else {
                                    var13.field7280 = 0;
                                    var13.field7287 = 0;
                                    var13.field7284 = 0;
                                    var13.field7283 = var9;
                                    var13.field7278 = 1;
                                    class99.method769(class253.field3576 == arg4, arg4.field509, arg4.field520, var11, arg4.field514, 50, 0);
                                }
                            } else {
                                var13 = arg4.field6400[var10] = null;
                            }
                        }
                        if (var13 == null) {
                            class535 var14 = arg4.field6400[var10] = new class535();
                            var14.field7287 = 0;
                            var14.field7278 = 1;
                            var14.field7280 = 0;
                            var14.field7288 = var7;
                            var14.field7284 = 0;
                            var14.field7283 = var9;
                            class99.method769(class253.field3576 == arg4, arg4.field509, arg4.field520, var11, arg4.field514, 50, 0);
                        }
                    } else {
                        arg4.field6400[var10] = null;
                    }
                }
                var8 >>>= 1;
            }
        }
        int var6 = -64 % ((arg0 - -83) / 38);
        ++field5898;
    }

    @OriginalMember(owner = "client!rca", name = "d", descriptor = "(I)I", line = 412)
    public final int method560(int arg0) {
        ++field5906;
        return arg0 != 15654 ? 20 : this.field5899.field3562;
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)Z", line = 428)
    public final boolean method562(int arg0) {
        if (arg0 != 29008) {
            field5903 = null;
        }
        ++field5908;
        return this.field5899.method1567((byte) -98);
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ZLoa;)V", line = 439)
    public final void method552(boolean arg0, class638 arg1) {
        ++field5889;
        class352 var3 = this.field5899.method1563(arg0, arg1, super.field5015, true, super.field5009, 262144, arg0);
        if (var3 != null) {
            int var4 = super.field5015 >> 9;
            int var5 = super.field5009 >> 9;
            class391 var6 = arg1.method401();
            var6.method1288(super.field5015, super.field5010, super.field5009);
            this.field5899.method1565(var4, var6, arg1, var5, 0, var5, var4, false, var3);
        }
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(Loa;B)Lac;", line = 463)
    public final class496 method551(class638 arg0, byte arg1) {
        ++field5893;
        if (arg1 >= -62) {
            field5903 = null;
        }
        return this.field5890;
    }
}
