import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class213 extends class333 implements class142 {

    @OriginalMember(owner = "client!en", name = "j", descriptor = "I")
    private int field3079;

    @OriginalMember(owner = "client!en", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field3081 = new String[100];

    @OriginalMember(owner = "client!en", name = "c", descriptor = "[I")
    public static int[] field3072 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!en", name = "m", descriptor = "I")
    public static int field3082 = 0;

    @OriginalMember(owner = "client!en", name = "d", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!en", name = "e", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!en", name = "f", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!en", name = "g", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!en", name = "h", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!en", name = "i", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!en", name = "k", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!en", name = "n", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I)I")
    public final int method455(int arg0) {
        if (arg0 != -31267) {
            return -95;
        } else {
            ++field3083;
            return this.field3079;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(B)J")
    public final long method452(byte arg0) {
        if (arg0 != 104) {
            field3078 = -112;
        }
        ++field3075;
        return super.field4834.method2610();
    }

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "(Lih;I[BI)V")
    public class213(class503 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field3079 = arg1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(ILhm;II)V")
    public static final void method1338(int arg0, class150 arg1, int arg2, int arg3) {
        if (arg1.field1994 != 0) {
            if (~arg1.field1994 != -2) {
                if (arg1.field1994 == 2) {
                    arg1.field2015 = arg2 - arg1.field2113 + -arg1.field2045;
                } else if (arg1.field1994 != 3) {
                    if (arg1.field1994 != 4) {
                        arg1.field2015 = -arg1.field2113 + arg2 - (arg1.field2045 * arg2 >> 14);
                    } else {
                        arg1.field2015 = (-arg1.field2113 + arg2) / 2 - -(arg1.field2045 * arg2 >> 14);
                    }
                } else {
                    arg1.field2015 = arg1.field2045 * arg2 >> 14;
                }
            } else {
                arg1.field2015 = (-arg1.field2113 + arg2) / 2 + arg1.field2045;
            }
        } else {
            arg1.field2015 = arg1.field2045;
        }
        if (arg1.field2073 != 0) {
            if (arg1.field2073 == 1) {
                arg1.field2058 = (arg3 - arg1.field2033) / 2 + arg1.field1989;
            } else if (arg1.field2073 != 2) {
                if (arg1.field2073 != 3) {
                    if (~arg1.field2073 != -5) {
                        arg1.field2058 = -arg1.field2033 + arg3 + -(arg1.field1989 * arg3 >> 14);
                    } else {
                        arg1.field2058 = (-arg1.field2033 + arg3) / 2 - -(arg1.field1989 * arg3 >> 14);
                    }
                } else {
                    arg1.field2058 = arg1.field1989 * arg3 >> 14;
                }
            } else {
                arg1.field2058 = arg3 - arg1.field2033 + -arg1.field1989;
            }
        } else {
            arg1.field2058 = arg1.field1989;
        }
        ++field3074;
        if (arg0 != 191) {
            method1339(42, (byte[]) null);
        }
        if (class126.field1700) {
            if (~client.method1291(arg1).field7033 == -1 && ~arg1.field2022 != -1) {
                return;
            }
            if (~arg1.field2015 <= -1) {
                if (~(arg1.field2015 - -arg1.field2113) < ~arg2) {
                    arg1.field2015 = -arg1.field2113 + arg2;
                }
            } else {
                arg1.field2015 = 0;
            }
            if (arg1.field2058 < 0) {
                arg1.field2058 = 0;
                return;
            }
            if (~arg3 > ~(arg1.field2058 + arg1.field2033)) {
                arg1.field2058 = -arg1.field2033 + arg3;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(I[B)Ljava/lang/String;")
    public static final String method1339(int arg0, byte[] arg1) {
        ++field3073;
        int var2 = arg1.length;
        char[] var3 = new char[var2];
        int var4 = 0;
        for (int var5 = 0; ~var2 < ~var5; ++var5) {
            int var6 = 255 & arg1[var5];
            if (var6 < 128) {
                var3[var4++] = (char) var6;
            } else {
                if (~var6 > -195) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var6);
                }
                if (~var6 <= -225) {
                    if (var6 >= 240) {
                        if (var6 >= 244) {
                            throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var6);
                        }
                        throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                    }
                    if (var5 + 2 >= var2) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    ++var5;
                    int var7 = arg1[var5] & 255;
                    if (var7 < 128 || ~var7 < -192) {
                        throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                    }
                    ++var5;
                    int var8 = 255 & arg1[var5];
                    if (var8 < 128 || var8 > 191) {
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class170.method1067(class239.method1507(-129, var8), class170.method1067(class239.method1507(-921600, var6 << 12), class239.method1507(-129, var7) << 6));
                } else {
                    if (~var2 >= ~(var5 + 1)) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    ++var5;
                    int var9 = arg1[var5] & 255;
                    if (~var9 > -129 || ~var9 < -192) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var3[var4++] = (char) class170.method1067(class239.method1507(-193, var6) << 6, class239.method1507(var9, -129));
                }
            }
        }
        if (arg0 != -921600) {
            method1338(87, (class150) null, 127, -32);
        }
        return new String(var3, 0, var4);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(Z)I")
    public final int method456(boolean arg0) {
        if (arg0) {
            return -99;
        } else {
            ++field3077;
            return 0;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
    public static void method1340(byte arg0) {
        field3081 = null;
        field3072 = null;
        if (arg0 != 104) {
            method1338(111, (class150) null, 115, -124);
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IB[BI)V")
    public final void method454(int arg0, byte arg1, byte[] arg2, int arg3) {
        ++field3080;
        this.method1991(arg2, arg0);
        if (arg1 == 60) {
            this.field3079 = arg3;
        }
    }
}
