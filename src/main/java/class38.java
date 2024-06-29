import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class38 extends class224 {

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    private int field512 = -1;

    @OriginalMember(owner = "client!uc", name = "Q", descriptor = "I")
    public static int field513 = 0;

    @OriginalMember(owner = "client!uc", name = "ab", descriptor = "I")
    public static int field523 = 0;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field506;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field508;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "I")
    private int field509;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!uc", name = "R", descriptor = "I")
    public static int field514;

    @OriginalMember(owner = "client!uc", name = "S", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!uc", name = "T", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!uc", name = "U", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!uc", name = "V", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!uc", name = "W", descriptor = "I")
    public static int field519;

    @OriginalMember(owner = "client!uc", name = "X", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!uc", name = "Y", descriptor = "I")
    private int field521;

    @OriginalMember(owner = "client!uc", name = "bb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!uc", name = "Z", descriptor = "Lcg;")
    public static class166 field522;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "[I")
    private int[] field511;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BLef;)Z")
    public static final boolean method298(byte arg0, class214 arg1) {
        ++field508;
        if (arg1.field3416 == null) {
            return false;
        } else {
            for (int var2 = 0; ~var2 > ~arg1.field3416.length; ++var2) {
                int var3 = class204.method1399((byte) -61, var2, arg1);
                int var4 = arg1.field3371[var2];
                if (arg1.field3416[var2] == 2) {
                    if (var3 >= var4) {
                        return false;
                    }
                } else if (arg1.field3416[var2] == 3) {
                    if (~var3 >= ~var4) {
                        return false;
                    }
                } else if (arg1.field3416[var2] == 4) {
                    if (~var3 == ~var4) {
                        return false;
                    }
                } else if (~var3 != ~var4) {
                    return false;
                }
            }
            if (arg0 != -113) {
                return true;
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "f", descriptor = "(I)Z")
    private final boolean method299(int arg0) {
        if (arg0 != 2201) {
            return false;
        } else {
            ++field516;
            if (this.field511 != null) {
                return true;
            } else if (this.field512 >= 0) {
                int var2 = class78.field1108;
                int var3 = class36.field471;
                int var4 = class117.field1726.method262(this.field512, -16) ? 64 : 128;
                this.field511 = class117.field1726.method260((byte) -110, this.field512);
                this.field509 = var4;
                this.field521 = var4;
                method303(true, var3, var2);
                return this.field511 != null;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Llj;IB)V")
    public final void method16(class25 arg0, int arg1, byte arg2) {
        ++field520;
        if (arg2 <= -46) {
            if (arg1 == 0) {
                this.field512 = arg0.method190(-3);
            }
        }
    }

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field515;
        if (arg1 != 1) {
            this.field512 = -109;
        }
        int[][] var3 = super.field3616.method1341(false, arg0);
        if (super.field3616.field3042 && this.method299(2201)) {
            int var4 = (~class36.field471 == ~this.field509 ? arg0 : this.field509 * arg0 / class36.field471) * this.field521;
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class78.field1108 == this.field521) {
                for (int var8 = 0; class78.field1108 > var8; ++var8) {
                    int var9 = this.field511[var4++];
                    var7[var8] = class224.method1526(var9 << 4, 4080);
                    var6[var8] = class224.method1526(65280, var9) >> 4;
                    var5[var8] = class224.method1526(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~var10 > ~class78.field1108; ++var10) {
                    int var11 = this.field521 * var10 / class78.field1108;
                    int var12 = this.field511[var4 - -var11];
                    var7[var10] = class224.method1526(255, var12) << 4;
                    var6[var10] = class224.method1526(65280, var12) >> 4;
                    var5[var10] = class224.method1526(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(Z)V")
    public final void method300(boolean arg0) {
        ++field519;
        super.method300(arg0);
        this.field511 = null;
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(III)I")
    public static final int method301(int arg0, int arg1, int arg2) {
        ++field510;
        class33 var3 = (class33) class82.field1233.method665((byte) -104, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (~arg1 == 0) {
            return 0;
        } else {
            int var4 = 0;
            int var5 = 0;
            if (arg2 != 21603) {
                method303(false, -35, 124);
            }
            while (var5 < var3.field428.length) {
                if (var3.field426[var5] == arg1) {
                    var4 += var3.field428[var5];
                }
                ++var5;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
    public static void method302(byte arg0) {
        field522 = null;
        if (arg0 <= 91) {
            method301(91, 113, -110);
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZII)V")
    public static final void method303(boolean arg0, int arg1, int arg2) {
        ++field514;
        if (!arg0) {
            field522 = null;
        }
        if (class78.field1108 != arg2) {
            class243.field3893 = new int[arg2];
            for (int var3 = 0; ~arg2 < ~var3; ++var3) {
                class243.field3893[var3] = (var3 << 12) / arg2;
            }
            class78.field1108 = arg2;
            class206.field3220 = arg2 - 1;
            class52.field721 = arg2 == 64 ? 2048 : 4096;
        }
        if (~class36.field471 != ~arg1) {
            if (class78.field1108 == arg1) {
                class251.field4018 = class243.field3893;
            } else {
                class251.field4018 = new int[arg1];
                for (int var4 = 0; ~var4 > ~arg1; ++var4) {
                    class251.field4018[var4] = (var4 << 12) / arg1;
                }
            }
            class261.field4217 = arg1 + -1;
            class36.field471 = arg1;
        }
    }

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "(I)I")
    public final int method304(int arg0) {
        if (arg0 != -11055) {
            this.method16((class25) null, -66, (byte) -122);
        }
        ++field507;
        return this.field512;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V")
    public class38() {
        super(0, false);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIIIIZI)V")
    public static final void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        int var9 = -arg0 + arg6;
        int var10 = -arg2 + arg3;
        ++field524;
        if (arg7) {
            field513 = 17;
        }
        int var11 = (-arg5 + arg4 << 16) / var9;
        int var12 = (-arg8 + arg1 << 16) / var10;
        class67.method457(var11, arg3, 0, -31784, arg8, arg0, arg6, arg5, 0, arg2, var12);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(ZLlj;)V")
    public static final void method306(boolean arg0, class25 arg1) {
        ++field517;
        if (arg0) {
            method303(false, 4, 72);
        }
        while (true) {
            while (~arg1.field339.length < ~arg1.field349) {
                int var2 = 0;
                int var3 = 0;
                boolean var4 = false;
                if (arg1.method201(255) == 1) {
                    var4 = true;
                    var2 = arg1.method201(255);
                    var3 = arg1.method201(255);
                }
                int var5 = arg1.method201(255);
                int var6 = arg1.method201(255);
                int var7 = -(var6 * 64) + class120.field1751 + class104.field1611 + -1;
                int var8 = var5 * 64 + -class47.field599;
                if (~var8 <= -1 && ~(var7 - 63) <= -1 && class165.field2565 > var8 + 63 && class104.field1611 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; ++var11) {
                        for (int var12 = 0; var12 < 64; ++var12) {
                            if (!var4 || var2 * 8 <= var11 && var2 * 8 + 8 > var11 && var12 >= var3 * 8 && var3 * 8 + 8 > var12) {
                                byte var13 = arg1.method188(29);
                                if (~var13 != -1) {
                                    if (class232.field3735[var9][var10] == null) {
                                        class232.field3735[var9][var10] = new byte[4096];
                                    }
                                    class232.field3735[var9][var10][(-var12 + 63 << 6) + var11] = var13;
                                    byte var14 = arg1.method188(58);
                                    if (class178.field2787[var9][var10] == null) {
                                        class178.field2787[var9][var10] = new byte[4096];
                                    }
                                    class178.field2787[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; ~var15 > ~(var4 ? 64 : 4096); ++var15) {
                        byte var16 = arg1.method188(-112);
                        if (var16 != 0) {
                            ++arg1.field349;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Z[BI)Ljava/lang/Object;")
    public static final Object method307(boolean arg0, byte[] arg1, int arg2) {
        ++field506;
        if (arg1 == null) {
            return null;
        } else {
            if (~arg1.length < arg2 && !class69.field974) {
                try {
                    class51 var3 = (class51) Class.forName("ue").newInstance();
                    var3.method377(9104, arg1);
                    return var3;
                } catch (Throwable var4) {
                    class69.field974 = true;
                }
            }
            return !arg0 ? arg1 : class165.method1134(arg1, -32698);
        }
    }
}
