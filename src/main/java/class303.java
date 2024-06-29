import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class303 extends class13 {

    @OriginalMember(owner = "client!fo", name = "D", descriptor = "I")
    private int field4172 = 12288;

    @OriginalMember(owner = "client!fo", name = "H", descriptor = "I")
    private int field4176 = 4096;

    @OriginalMember(owner = "client!fo", name = "J", descriptor = "I")
    private int field4178 = 2048;

    @OriginalMember(owner = "client!fo", name = "T", descriptor = "I")
    private int field4187 = 0;

    @OriginalMember(owner = "client!fo", name = "U", descriptor = "I")
    private int field4188 = 8192;

    @OriginalMember(owner = "client!fo", name = "R", descriptor = "I")
    private int field4185 = 2048;

    @OriginalMember(owner = "client!fo", name = "O", descriptor = "I")
    private int field4183 = 0;

    @OriginalMember(owner = "client!fo", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field4182 = new String[100];

    @OriginalMember(owner = "client!fo", name = "V", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!fo", name = "E", descriptor = "I")
    public static int field4173;

    @OriginalMember(owner = "client!fo", name = "F", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!fo", name = "G", descriptor = "I")
    public static int field4175;

    @OriginalMember(owner = "client!fo", name = "I", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!fo", name = "K", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!fo", name = "L", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!fo", name = "M", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!fo", name = "P", descriptor = "I")
    public static int field4184;

    @OriginalMember(owner = "client!fo", name = "S", descriptor = "I")
    public static int field4186;

    static {
        new class442("Your friendlist is full, max of 100 for free users, and 200 for members.", "Ihre Freunde-Liste ist voll!", "Votre liste d'amis est pleine (100 noms maximum pour la version gratuite et 200 pour les abonnés).", "Sua lista de amigos está cheia. O limite é 100 para usuários não pagantes, e 200 para membros.");
        field4189 = 0;
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "()V", line = 22)
    public class303() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(I)V", line = 13)
    public static void method1952(int arg0) {
        int var1 = 0 / ((68 - arg0) / 32);
        field4182 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I[B)[B", line = 30)
    public static final byte[] method1953(int arg0, byte[] arg1) {
        ++field4180;
        if (arg0 != -5) {
            return null;
        } else {
            class11 var2 = new class11(arg1);
            int var3 = var2.method172((byte) 52);
            int var4 = var2.method185(25239);
            if (var4 < 0 || ~class150.field2131 != -1 && ~var4 < ~class150.field2131) {
                throw new RuntimeException();
            } else if (~var3 == -1) {
                byte[] var5 = new byte[var4];
                var2.method196(var5, var4, 255, 0);
                return var5;
            } else {
                int var6 = var2.method185(25239);
                if (var6 >= 0 && (~class150.field2131 == -1 || ~var6 >= ~class150.field2131)) {
                    byte[] var7 = new byte[var6];
                    if (var3 != 1) {
                        class126.field1774.method2169(var2, var7, 10);
                    } else {
                        class201.method1312(var7, var6, arg1, var4, 9);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(ZI)[I", line = 86)
    public final int[] method29(boolean arg0, int arg1) {
        if (!arg0) {
            method1956(-36, -7);
        }
        ++field4177;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int var4 = class277.field3873[arg1] + -2048;
            for (int var5 = 0; ~class269.field3751 < ~var5; ++var5) {
                int var6 = class296.field4148[var5] + -2048;
                int var7 = this.field4178 + var6;
                int var8 = ~var7 > 2047 ? var7 + 4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field4187 + var4;
                int var11 = var10 >= -2048 ? var10 : var10 + 4096;
                int var12 = ~var11 >= -2049 ? var11 : var11 - 4096;
                int var13 = this.field4183 + var6;
                int var14 = ~var13 <= 2047 ? var13 : var13 + 4096;
                int var15 = ~var14 < -2049 ? var14 + -4096 : var14;
                int var16 = var4 - -this.field4185;
                int var17 = ~var16 > 2047 ? var16 + 4096 : var16;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = !this.method1957(-112, var12, var9) && !this.method1954(886089260, var15, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(III)Z", line = 139)
    private final boolean method1954(int arg0, int arg1, int arg2) {
        ++field4184;
        int var4 = (arg1 + arg2) * this.field4172 >> 12;
        int var5 = class33.field521[var4 * 255 >> 12 & 255];
        int var6 = (var5 << 12) / this.field4172;
        if (arg0 != 886089260) {
            return false;
        } else {
            int var7 = (var6 << 12) / this.field4188;
            int var8 = this.field4176 * var7 >> 12;
            return ~(-arg1 + arg2) > ~var8 && -arg1 + arg2 > -var8;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIII)V", line = 157)
    public static final void method1955(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        for (class293 var7 = (class293) class62.field855.method1005(-1); var7 != null; var7 = (class293) class62.field855.method1012((byte) 85)) {
            if (~class276.field3837 <= ~var7.field4101) {
                var7.method1235((byte) -126);
            } else {
                class381.method2429(-124, arg1 >> 1, arg4, (var7.field4105 << 7) - -64, var7.field4099 * 2, arg5 >> 1, arg3, (var7.field4100 << 7) + 64);
                class279.field3915.method2283((byte) -31, arg2 - -class48.field682[0], class48.field682[1] + arg6, 0, var7.field4107, -16777216 | var7.field4103);
            }
        }
        if (arg0 != -74672569) {
            field4189 = -21;
        }
        ++field4173;
    }

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "(II)I", line = 184)
    public static final int method1956(int arg0, int arg1) {
        ++field4179;
        return arg1 != 1 ? 85 : arg0 & 127;
    }

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "(I)V", line = 207)
    public final void method33(int arg0) {
        int var2 = 53 % ((2 - arg0) / 51);
        ++field4174;
        class282.method1845(-42);
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Lkh;BI)V", line = 226)
    public final void method31(class11 arg0, byte arg1, int arg2) {
        ++field4181;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field4188 = arg0.method174(255);
                                }
                            } else {
                                this.field4176 = arg0.method174(255);
                            }
                        } else {
                            this.field4172 = arg0.method174(255);
                        }
                    } else {
                        this.field4185 = arg0.method174(255);
                    }
                } else {
                    this.field4183 = arg0.method174(255);
                }
            } else {
                this.field4187 = arg0.method174(255);
            }
        } else {
            this.field4178 = arg0.method174(255);
        }
        if (arg1 <= 50) {
            field4182 = null;
        }
    }

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "(III)Z", line = 305)
    private final boolean method1957(int arg0, int arg1, int arg2) {
        ++field4186;
        int var4 = (-arg2 + arg1) * this.field4172 >> 12;
        if (arg0 >= -105) {
            this.method31((class11) null, (byte) 83, 105);
        }
        int var5 = class33.field521[(var4 * 255 & 1044843) >> 12];
        int var6 = (var5 << 12) / this.field4172;
        int var7 = (var6 << 12) / this.field4188;
        int var8 = this.field4176 * var7 >> 12;
        return ~(arg1 + arg2) > ~var8 && -var8 < arg1 + arg2;
    }

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "(B)V", line = 326)
    public static final void method1958(byte arg0) {
        class373.field5243 = null;
        ++field4175;
        class161.field2246 = null;
        class297.field4158 = null;
        class164.field2267 = null;
        class280.field3939 = null;
        if (arg0 >= -113) {
            field4182 = null;
        }
        class240.field3421 = null;
        class436.field6138 = null;
        class255.field3588 = null;
    }
}
