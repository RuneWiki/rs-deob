import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class113 extends class152 {

    @OriginalMember(owner = "client!mj", name = "H", descriptor = "Lhc;")
    public static class177 field2117 = class178.method1314((byte) -125);

    @OriginalMember(owner = "client!mj", name = "S", descriptor = "I")
    public static int field2128 = 0;

    @OriginalMember(owner = "client!mj", name = "P", descriptor = "I")
    public static int field2125 = 0;

    @OriginalMember(owner = "client!mj", name = "E", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!mj", name = "F", descriptor = "I")
    public static int field2115;

    @OriginalMember(owner = "client!mj", name = "G", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!mj", name = "I", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!mj", name = "J", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!mj", name = "K", descriptor = "I")
    public static int field2120;

    @OriginalMember(owner = "client!mj", name = "L", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!mj", name = "N", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!mj", name = "O", descriptor = "I")
    public static int field2124;

    @OriginalMember(owner = "client!mj", name = "R", descriptor = "I")
    public int field2127;

    @OriginalMember(owner = "client!mj", name = "Q", descriptor = "Lpa;")
    public static class123 field2126;

    @OriginalMember(owner = "client!mj", name = "M", descriptor = "Lhh;")
    public class163 field2122;

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public static void method894(byte arg0) {
        field2126 = null;
        field2117 = null;
        int var1 = -72 % ((-63 - arg0) / 39);
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(B)I")
    public final int method895(byte arg0) {
        ++field2118;
        int var2 = -61 % ((24 - arg0) / 34);
        return (int) (255L & super.field2641 >>> 32);
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)I")
    public final int method896(int arg0) {
        ++field2115;
        return arg0 != 2 ? 35 : (int) super.field2641;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Z)V")
    public final void method897(boolean arg0) {
        ++field2114;
        super.field2853 = super.field2853 & Long.MIN_VALUE | class7.method55(0) - -500L;
        class229.field4128.method471((byte) -100, this);
        if (!arg0) {
            this.field2122 = null;
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
    public final void method898(int arg0) {
        if (arg0 < -108) {
            super.field2853 |= Long.MIN_VALUE;
            if (this.method902((byte) 122) == 0L) {
                class209.field3791.method471((byte) -72, this);
            }
            ++field2120;
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(II)V")
    public static final void method899(int arg0, int arg1) {
        if (arg0 != -15921) {
            field2117 = null;
        }
        ++field2124;
        client.field2001.method112(arg1, 119);
    }

    @OriginalMember(owner = "client!mj", name = "f", descriptor = "(B)V")
    public static final void method900(byte arg0) {
        ++field2119;
        class95.field1789 = 0;
        class222.field4040 = 0;
        class6.method45(524287);
        class2.method26(-7921);
        class247.method1701(true);
        class216.method1535((byte) 122);
        if (arg0 != -18) {
            method901(26, -105, 53, -52, -31, (byte) 65, -38);
        }
        for (int var1 = 0; ~var1 > ~class95.field1789; ++var1) {
            int var3 = class257.field4494[var1];
            if (class227.field4092 != class106.field2029[var3].field3628) {
                if (~class106.field2029[var3].field2440 < -1) {
                    class22.method150(-80, class106.field2029[var3]);
                }
                class106.field2029[var3] = null;
            }
        }
        if (class125.field2415 != class33.field502.field1541) {
            throw new RuntimeException("gpp1 pos:" + class33.field502.field1541 + " psize:" + class125.field2415);
        } else {
            for (int var2 = 0; ~var2 > ~class95.field1791; ++var2) {
                if (class106.field2029[class246.field4340[var2]] == null) {
                    throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class95.field1791);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method901(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        int var7 = arg2 & 3;
        ++field2121;
        if ((arg1 & 1) == 1) {
            int var8 = arg0;
            arg0 = arg4;
            arg4 = var8;
        }
        if (~var7 == -1) {
            return arg3;
        } else if (~var7 == -2) {
            return -arg6 + 7 + 1 + -arg0;
        } else if (~var7 == -3) {
            return 1 - arg4 + -arg3 + 7;
        } else {
            if (arg5 != 106) {
                field2125 = -21;
            }
            return arg6;
        }
    }

    @OriginalMember(owner = "client!mj", name = "g", descriptor = "(B)J")
    public final long method902(byte arg0) {
        ++field2116;
        if (arg0 <= 114) {
            this.field2122 = null;
        }
        return Long.MAX_VALUE & super.field2853;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lhh;ILqh;)Lhh;")
    public static final class163 method903(class163 arg0, int arg1, class69 arg2) {
        if (~arg0.method1229((byte) 126, class215.field3927) != 0) {
            label62: while (true) {
                int var3 = arg0.method1229((byte) 122, class254.field4443);
                if (~var3 == 0) {
                    while (true) {
                        int var4 = arg0.method1229((byte) 96, class95.field1790);
                        if (~var4 == 0) {
                            while (true) {
                                int var5 = arg0.method1229((byte) 106, class201.field3613);
                                if (~var5 == 0) {
                                    while (true) {
                                        int var6 = arg0.method1229((byte) 94, class196.field3534);
                                        if (~var6 == 0) {
                                            while (true) {
                                                int var7 = arg0.method1229((byte) 97, class175.field3193);
                                                if (~var7 == 0) {
                                                    while (true) {
                                                        int var8 = arg0.method1229((byte) 121, class37.field623);
                                                        if (var8 == -1) {
                                                            break label62;
                                                        }
                                                        class163 var9 = class170.field3120;
                                                        if (class7.field120 != null) {
                                                            var9 = class210.method1502(false, class7.field120.field3561);
                                                            try {
                                                                if (class7.field120.field3563 != null) {
                                                                    byte[] var10 = ((String) class7.field120.field3563).getBytes("ISO-8859-1");
                                                                    var9 = class129.method1025(var10.length, 70, 0, var10);
                                                                }
                                                            } catch (UnsupportedEncodingException var11) {
                                                            }
                                                        }
                                                        arg0 = class145.method1101(0, new class163[] { arg0.method1188(true, var8, 0), var9, arg0.method1216(var8 + 4, (byte) -125) });
                                                    }
                                                }
                                                arg0 = class145.method1101(0, new class163[] { arg0.method1188(true, var7, 0), class130.method1032(class239.method1656(arg1 ^ -31847, arg2, 4), false), arg0.method1216(var7 + 2, (byte) -128) });
                                            }
                                        }
                                        arg0 = class145.method1101(arg1 + -8572, new class163[] { arg0.method1188(true, var6, 0), class130.method1032(class239.method1656(-23835, arg2, 3), false), arg0.method1216(var6 + 2, (byte) -126) });
                                    }
                                }
                                arg0 = class145.method1101(arg1 ^ 8572, new class163[] { arg0.method1188(true, var5, 0), class130.method1032(class239.method1656(-23835, arg2, 2), false), arg0.method1216(var5 - -2, (byte) -126) });
                            }
                        }
                        arg0 = class145.method1101(arg1 ^ 8572, new class163[] { arg0.method1188(true, var4, 0), class130.method1032(class239.method1656(arg1 ^ -31847, arg2, 1), false), arg0.method1216(var4 + 2, (byte) -125) });
                    }
                }
                arg0 = class145.method1101(0, new class163[] { arg0.method1188(true, var3, 0), class130.method1032(class239.method1656(-23835, arg2, 0), false), arg0.method1216(var3 + 2, (byte) -128) });
            }
        }
        if (arg1 != 8572) {
            method899(88, 82);
        }
        ++field2123;
        return arg0;
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "(II)V")
    public class113(int arg0, int arg1) {
        super.field2641 = (long) arg0 << 32 | (long) arg1;
    }
}
