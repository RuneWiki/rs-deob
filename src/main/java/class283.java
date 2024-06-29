import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class283 extends class94 {

    @OriginalMember(owner = "client!wq", name = "L", descriptor = "I")
    public int field4277;

    @OriginalMember(owner = "client!wq", name = "H", descriptor = "I")
    public int field4273;

    @OriginalMember(owner = "client!wq", name = "K", descriptor = "Z")
    public boolean field4276;

    @OriginalMember(owner = "client!wq", name = "G", descriptor = "F")
    public float field4272;

    @OriginalMember(owner = "client!wq", name = "S", descriptor = "F")
    public float field4283;

    @OriginalMember(owner = "client!wq", name = "F", descriptor = "[I")
    public static int[] field4271 = new int[100];

    @OriginalMember(owner = "client!wq", name = "I", descriptor = "I")
    public static int field4274;

    @OriginalMember(owner = "client!wq", name = "J", descriptor = "I")
    public static int field4275;

    @OriginalMember(owner = "client!wq", name = "P", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!wq", name = "Q", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!wq", name = "R", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!wq", name = "O", descriptor = "Ll;")
    public static class127 field4279;

    @OriginalMember(owner = "client!wq", name = "N", descriptor = "[[Z")
    public static boolean[][] field4278;

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(II[BB)Ljava/lang/String;")
    public static final String method1760(int arg0, int arg1, byte[] arg2, byte arg3) {
        ++field4281;
        char[] var4 = new char[arg1];
        int var5 = 0;
        if (arg3 <= 69) {
            field4271 = null;
        }
        int var6 = arg0 + arg1;
        for (int var7 = arg0; ~var7 > ~var6; ++var7) {
            int var8 = 255 & arg2[var7];
            if (var8 < 128) {
                var4[var5++] = (char) var8;
            } else {
                if (var8 < 194) {
                    throw new IllegalArgumentException("Overlong encoding in UTF-8 encoding " + var8);
                }
                if (var8 < 224) {
                    if (var6 <= var7 - -1) {
                        throw new IllegalArgumentException("Incomplete two-byte sequence at end of UTF-8 encoding");
                    }
                    ++var7;
                    int var9 = arg2[var7] & 255;
                    if (~var9 > -129 || ~var9 < -192) {
                        throw new IllegalArgumentException("Illegal second byte in two-byte sequence in UTF-8 encoding");
                    }
                    var4[var5++] = (char) class390.method2340(class140.method1023(var9, -129), class140.method1023(-12352, var8 << 6));
                } else {
                    if (~var8 <= -241) {
                        if (var8 < 244) {
                            throw new IllegalArgumentException("Unsupported four-byte sequence in UTF-8 encoding");
                        }
                        throw new IllegalArgumentException("Illegal first sequence byte in UTF-8 encoding " + var8);
                    }
                    if (var7 + 2 >= var6) {
                        throw new IllegalArgumentException("Incomplete three-byte sequence at end of UTF-8 encoding");
                    }
                    ++var7;
                    int var10 = 255 & arg2[var7];
                    if (var10 >= 128 && var10 <= 191) {
                        ++var7;
                        int var11 = 255 & arg2[var7];
                        if (var11 >= 128 && var11 <= 191) {
                            var4[var5++] = (char) class390.method2340(class140.method1023(-129, var11), class390.method2340(class140.method1023(var8, -225) << 12, class140.method1023(-8256, var10 << 6)));
                            continue;
                        }
                        throw new IllegalArgumentException("Illegal third byte in three-byte sequence in UTF-8 encoding");
                    }
                    throw new IllegalArgumentException("Illegal second byte in three-byte sequence in UTF-8 encoding");
                }
            }
        }
        return new String(var4, 0, var5);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(Llc;ZIIIII)V")
    public static final void method1761(class520 arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4275;
        if (class187.field2744 < 50) {
            if (arg0 != null && arg0.field7625 != null && ~arg0.field7625.length < ~arg6 && arg0.field7625[arg6] != null) {
                int var7 = arg0.field7625[arg6][0];
                int var8 = var7 >> 8;
                int var9 = var7 >> 5 & 7;
                if (arg0.field7625[arg6].length > 1) {
                    int var10 = (int) ((double) arg0.field7625[arg6].length * Math.random());
                    if (var10 > 0) {
                        var8 = arg0.field7625[arg6][var10];
                    }
                }
                int var11 = 31 & var7;
                if (var11 == 0) {
                    if (arg1) {
                        class264.method1651(0, 255, var8, var9, (byte) 1);
                    }
                } else if (~class454.field6661.field1000 != -1) {
                    int var12 = arg5 + -64 >> 7;
                    int var13 = arg2 + -64 >> 7;
                    class158.field2387[class187.field2744++] = new class425((byte) 1, var8, var9, 0, 255, (arg4 << 24) + (var12 << 16) + (var13 << 8) + var11);
                    if (arg3 > -12) {
                        method1761((class520) null, true, 29, -114, -110, 64, 7);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lvd;IIIZ[I)V")
    public class283(class258 arg0, int arg1, int arg2, int arg3, boolean arg4, int[] arg5) {
        super(arg0, arg1, 6408, arg2, arg3, arg4, arg5, true);
        this.field4277 = arg3;
        this.field4273 = arg2;
        if (super.field4033 == 34037) {
            this.field4276 = false;
            this.field4272 = (float) arg2;
            this.field4283 = (float) arg3;
        } else {
            this.field4272 = this.field4283 = 1.0F;
            this.field4276 = true;
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lvd;IIIIIZ)V")
    public class283(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
        this.field4277 = arg5;
        if (super.field4033 == 34037) {
            this.field4276 = false;
            this.field4283 = (float) arg5;
            this.field4272 = (float) arg4;
        } else {
            this.field4272 = this.field4283 = 1.0F;
            this.field4276 = true;
        }
        this.field4273 = arg4;
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lvd;IIIII[BI)V")
    public class283(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7) {
        super(arg0, 3553, arg1, arg4, arg5);
        this.field4277 = arg3;
        this.field4273 = arg2;
        this.method735(arg7, 3317, 0, arg6, 0, 0, arg2, 0, true, arg3);
        this.field4283 = (float) arg3 / (float) arg5;
        this.field4272 = (float) arg2 / (float) arg4;
        this.field4276 = false;
        this.method741(false, false, (byte) -93);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BILgo;I)V")
    public static final void method1762(byte arg0, int arg1, class310 arg2, int arg3) {
        ++field4280;
        if (class251.field3435 == null && !class495.field7350) {
            if (arg2 != null && class320.method2002(128, arg2) != null) {
                class251.field3435 = arg2;
                class146.field2193 = class320.method2002(128, arg2);
                int var4 = 46 % ((62 - arg0) / 58);
                class65.field885 = arg3;
                class508.field7470 = arg1;
                class450.field6620 = 0;
                class521.field7659 = false;
            }
        }
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lvd;IIIIIIZ)V")
    public class283(class258 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        super(arg0, 3553, arg1, arg2, arg5, arg6);
        this.field4283 = (float) arg4 / (float) arg6;
        this.field4276 = false;
        this.field4272 = (float) arg3 / (float) arg5;
        this.field4277 = arg4;
        this.field4273 = arg3;
        this.method741(false, false, (byte) -119);
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(B)V")
    public static void method1763(byte arg0) {
        field4278 = null;
        int var1 = -114 % ((arg0 - -2) / 36);
        field4279 = null;
        field4271 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)V")
    public static final void method1764(byte arg0, int arg1) {
        ++field4274;
        if (arg0 != -120) {
            method1761((class520) null, false, 114, 8, 107, 106, 73);
        }
        class506 var2 = class14.method185(-1304589728, arg1, 1);
        var2.method2986(99);
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lvd;IIII[I)V")
    public class283(class258 arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5) {
        super(arg0, 3553, 6408, arg3, arg4);
        this.field4273 = arg1;
        this.field4277 = arg2;
        this.method734(0, arg2, arg5, 0, 0, 0, arg1, (byte) -109, true);
        this.field4283 = (float) arg2 / (float) arg4;
        this.field4272 = (float) arg1 / (float) arg3;
        this.field4276 = false;
        this.method741(false, false, (byte) -110);
    }

    @OriginalMember(owner = "client!wq", name = "<init>", descriptor = "(Lvd;IIIIZ[BI)V")
    public class283(class258 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, byte[] arg6, int arg7) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, true);
        if (super.field4033 != 34037) {
            this.field4272 = this.field4283 = 1.0F;
            this.field4276 = true;
        } else {
            this.field4276 = false;
            this.field4283 = (float) arg4;
            this.field4272 = (float) arg3;
        }
        this.field4273 = arg3;
        this.field4277 = arg4;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4282;
        int var7 = class375.method2223(false, arg0, class286.field4290, class305.field4555);
        if (arg3 != 6408) {
            method1762((byte) -37, 97, (class310) null, -114);
        }
        int var8 = class375.method2223(false, arg4, class286.field4290, class305.field4555);
        int var9 = class375.method2223(false, arg2, class102.field1544, class297.field4427);
        int var10 = class375.method2223(false, arg6, class102.field1544, class297.field4427);
        int var11 = class375.method2223(false, arg0 + arg1, class286.field4290, class305.field4555);
        int var12 = class375.method2223(false, -arg1 + arg4, class286.field4290, class305.field4555);
        for (int var13 = var7; var13 < var11; ++var13) {
            class94.method740(class306.field4574[var13], var9, var10, arg5, false);
        }
        for (int var14 = var8; var14 > var12; --var14) {
            class94.method740(class306.field4574[var14], var9, var10, arg5, false);
        }
        int var15 = class375.method2223(false, arg1 + arg2, class102.field1544, class297.field4427);
        int var16 = class375.method2223(false, -arg1 + arg6, class102.field1544, class297.field4427);
        for (int var17 = var11; ~var17 >= ~var12; ++var17) {
            int[] var18 = class306.field4574[var17];
            class94.method740(var18, var9, var15, arg5, false);
            class94.method740(var18, var16, var10, arg5, false);
        }
    }
}
