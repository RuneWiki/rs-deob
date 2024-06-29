import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!en")
public class class310 extends class194 {

    @OriginalMember(owner = "client!en", name = "L", descriptor = "I")
    private int field4190 = 0;

    @OriginalMember(owner = "client!en", name = "P", descriptor = "I")
    private int field4194 = 1;

    @OriginalMember(owner = "client!en", name = "R", descriptor = "I")
    private int field4195 = 0;

    @OriginalMember(owner = "client!en", name = "I", descriptor = "[Z")
    public static boolean[] field4187 = new boolean[5];

    @OriginalMember(owner = "client!en", name = "Y", descriptor = "Z")
    public static boolean field4202;

    @OriginalMember(owner = "client!en", name = "Z", descriptor = "[S")
    public static short[] field4203;

    @OriginalMember(owner = "client!en", name = "J", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!en", name = "K", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!en", name = "M", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!en", name = "O", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!en", name = "T", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!en", name = "U", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!en", name = "V", descriptor = "I")
    public static int field4199;

    @OriginalMember(owner = "client!en", name = "ab", descriptor = "I")
    public static int field4204;

    @OriginalMember(owner = "client!en", name = "N", descriptor = "Lwo;")
    public static class285 field4192;

    @OriginalMember(owner = "client!en", name = "S", descriptor = "Lwo;")
    public static class285 field4196;

    @OriginalMember(owner = "client!en", name = "X", descriptor = "Lwo;")
    public static class285 field4201;

    @OriginalMember(owner = "client!en", name = "W", descriptor = "Laq;")
    public static class453 field4200;

    @OriginalMember(owner = "client!en", name = "<init>", descriptor = "()V")
    public class310() {
        super(0, true);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        ++field4191;
        int var3 = -2 / ((57 - arg1) / 46);
        int[] var4 = super.field2292.method1781(arg0, false);
        if (super.field2292.field3708) {
            int var5 = class249.field3283[arg0];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; ~var7 > ~class138.field1579; ++var7) {
                int var8 = class277.field3585[var7];
                int var9 = var8 + -2048 >> 1;
                int var10;
                if (~this.field4190 == -1) {
                    var10 = (-var5 + var8) * this.field4194;
                } else {
                    int var11 = var6 * var6 + var9 * var9 >> 12;
                    int var12 = (int) (Math.sqrt((double) ((float) var11 / 4096.0F)) * 4096.0D);
                    var10 = (int) ((double) (this.field4194 * var12) * 3.141592653589793D);
                }
                int var13 = var10 - (-4096 & var10);
                if (~this.field4195 == -1) {
                    var13 = class298.field3977[var13 >> 4 & 255] + 4096 >> 1;
                } else if (~this.field4195 == -3) {
                    var13 -= 2048;
                    if (var13 < 0) {
                        var13 = -var13;
                    }
                    var13 = -var13 + 2048 << 1;
                }
                var4[var7] = var13;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!en", name = "f", descriptor = "(I)V")
    public final void method280(int arg0) {
        ++field4198;
        class141.method911(-7448);
        int var2 = 66 / ((28 - arg0) / 63);
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IZLuo;I[[I)V")
    public static final void method1962(int arg0, boolean arg1, class118 arg2, int arg3, int[][] arg4) {
        for (int var5 = 0; ~var5 > ~arg0; ++var5) {
            int[][] var6;
            if (arg4 == null) {
                var6 = null;
            } else {
                var6 = new int[class22.field232 + 1][class196.field2329 + 1];
                for (int var7 = 0; ~var7 >= ~class196.field2329; ++var7) {
                    for (int var8 = 0; var8 <= class22.field232; ++var8) {
                        var6[var8][var7] = class226.field2868[var5][var8][var7] - arg4[var8][var7];
                    }
                }
            }
            int var9 = 0;
            int var10 = 0;
            if (!arg1) {
                if (class252.field3298) {
                    var9 |= 2;
                }
                if (class183.field2125) {
                    var10 |= 8;
                }
                if (class333.field4548 != 0) {
                    if (var5 == 0 || class105.field1254 >= 96) {
                        var10 |= 16;
                    }
                    var9 |= 1;
                }
            }
            if (class252.field3298) {
                var10 |= 7;
            }
            class279 var11 = arg2.method715(class22.field232, class196.field2329, class226.field2868[var5], var6, 128, var9, var10);
            class318.method1990(var5, var11);
        }
        if (arg3 != -29271) {
            field4192 = null;
        }
        ++field4189;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IILaq;B)V")
    public static final void method1963(int arg0, int arg1, class453 arg2, byte arg3) {
        if (arg3 == 102) {
            ++field4193;
            class423 var4 = arg2.method2808(class267.field3454, false);
            if (var4 != null) {
                class267.field3454.method774(arg0, arg1, arg2.field6377 + arg0, arg2.field6432 + arg1);
                if (~class184.field2133 > -4) {
                    class17.field189.method2660((float) arg2.field6377 / 2.0F + (float) arg0, (float) arg2.field6432 / 2.0F + (float) arg1, 4096, (int) (-class434.field5929) << 2 & 65532, var4, arg0, arg1);
                } else {
                    class267.field3454.method704(-16777216, var4, arg0, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IIILqc;Lqc;)V")
    public static final void method1964(int arg0, int arg1, int arg2, class226 arg3, class226 arg4) {
        if (class347.field4722[arg0][arg1][arg2] == null) {
            class75.method443(arg0, arg1, arg2);
        }
        class347.field4722[arg0][arg1][arg2].field4268 = arg3;
        class347.field4722[arg0][arg1][arg2].field4269 = arg4;
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(B)V")
    public static void method1965(byte arg0) {
        field4200 = null;
        field4187 = null;
        if (arg0 < -112) {
            field4196 = null;
            field4201 = null;
            field4203 = null;
            field4192 = null;
        }
    }

    @OriginalMember(owner = "client!en", name = "b", descriptor = "(Z)Z")
    public static final boolean method1966(boolean arg0) {
        ++field4197;
        if (!arg0) {
            field4187 = null;
        }
        return ~class57.field660 < -1;
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(CB)Z")
    public static final boolean method1967(char arg0, byte arg1) {
        ++field4188;
        if ((arg0 <= 0 || arg0 >= 128) && (arg0 < 160 || arg0 > 255)) {
            if (arg1 != -43) {
                return true;
            } else {
                if (arg0 != 0) {
                    char[] var2 = class296.field3953;
                    for (int var3 = 0; var2.length > var3; ++var3) {
                        char var4 = var2[var3];
                        if (arg0 == var4) {
                            return true;
                        }
                    }
                }
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!en", name = "a", descriptor = "(IILbg;)V")
    public final void method54(int arg0, int arg1, class242 arg2) {
        ++field4199;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -4) {
                    this.field4194 = arg2.method1563(-128);
                }
            } else {
                this.field4195 = arg2.method1563(-128);
            }
        } else {
            this.field4190 = arg2.method1563(-128);
        }
        int var5 = -88 / ((arg1 - 52) / 61);
    }

    static {
        new class72("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
        field4202 = false;
        field4203 = new short[] { 960, 957, -21568, -21571, 22464 };
    }
}
