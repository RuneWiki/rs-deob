import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class308 extends class227 {

    @OriginalMember(owner = "client!os", name = "G", descriptor = "I")
    public static int field4121 = -1;

    @OriginalMember(owner = "client!os", name = "N", descriptor = "I")
    public static int field4128 = 104;

    @OriginalMember(owner = "client!os", name = "P", descriptor = "Lao;")
    public static class191 field4130;

    @OriginalMember(owner = "client!os", name = "H", descriptor = "I")
    public static int field4122;

    @OriginalMember(owner = "client!os", name = "I", descriptor = "I")
    public static int field4123;

    @OriginalMember(owner = "client!os", name = "J", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!os", name = "K", descriptor = "I")
    public static int field4125;

    @OriginalMember(owner = "client!os", name = "L", descriptor = "I")
    public static int field4126;

    @OriginalMember(owner = "client!os", name = "O", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!os", name = "M", descriptor = "[Lvf;")
    private class105[] field4127;

    static {
        new class305("Already attempting to join a channel - please wait...", "Du versuchst bereits, einem Chatraum beizutreten - bitte warte.", "Tentative de connexion au canal déjà en cours - veuillez patienter...", "Já há uma tentativa de entrar em um canal. Aguarde...");
        field4130 = new class191(56, 8);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(II)[I", line = 12)
    public final int[] method62(int arg0, int arg1) {
        ++field4124;
        int[] var3 = super.field3068.method1970(arg1, (byte) 121);
        if (super.field3068.field4480) {
            this.method1838(13019, super.field3068.method1973(-112));
        }
        if (arg0 != 15811) {
            this.field4127 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZIIII)V", line = 35)
    public static final void method1835(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field4126;
        if (!arg1) {
            method1839((byte) 42);
        }
        if (~class386.field5620 <= ~arg4 && ~arg3 <= ~class169.field2184) {
            boolean var6;
            if (arg2 < class307.field4111) {
                arg2 = class307.field4111;
                var6 = false;
            } else if (~arg2 >= ~class91.field1086) {
                var6 = true;
            } else {
                var6 = false;
                arg2 = class91.field1086;
            }
            boolean var7;
            if (~arg0 > ~class307.field4111) {
                var7 = false;
                arg0 = class307.field4111;
            } else if (~arg0 >= ~class91.field1086) {
                var7 = true;
            } else {
                var7 = false;
                arg0 = class91.field1086;
            }
            if (arg4 < class169.field2184) {
                arg4 = class169.field2184;
            } else {
                class476.method2907(arg0, 120, arg5, class5.field54[arg4++], arg2);
            }
            if (class386.field5620 < arg3) {
                arg3 = class386.field5620;
            } else {
                class476.method2907(arg0, 82, arg5, class5.field54[arg3--], arg2);
            }
            if (var6 && var7) {
                for (int var8 = arg4; arg3 >= var8; ++var8) {
                    int[] var9 = class5.field54[var8];
                    var9[arg2] = var9[arg0] = arg5;
                }
            } else {
                if (!var6) {
                    if (var7) {
                        for (int var10 = arg4; var10 <= arg3; ++var10) {
                            class5.field54[var10][arg0] = arg5;
                        }
                        return;
                    }
                } else {
                    for (int var11 = arg4; ~var11 >= ~arg3; ++var11) {
                        class5.field54[var11][arg2] = arg5;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IZ)[[I", line = 138)
    public final int[][] method112(int arg0, boolean arg1) {
        ++field4129;
        int[][] var3 = super.field3059.method28((byte) 87, arg0);
        if (super.field3059.field57) {
            int var4 = class446.field6486;
            int var5 = class305.field4055;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field3059.method27(0);
            this.method1838(13019, var6);
            for (int var8 = 0; ~var8 > ~class305.field4055; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; var14 < class446.field6486; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class95.method534(255, var15) << 4;
                    var12[var14] = class95.method534(var15, 65280) >> 4;
                    var11[var14] = class95.method534(var15 >> 12, 4080);
                }
            }
        }
        if (!arg1) {
            field4128 = 80;
        }
        return var3;
    }

    @OriginalMember(owner = "client!os", name = "j", descriptor = "(I)Lsc;", line = 203)
    public static final class232 method1836(int arg0) {
        ++field4123;
        if (arg0 != 255) {
            return null;
        } else {
            try {
                return (class232) Class.forName("du").newInstance();
            } catch (Throwable var1) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIIIII)Z", line = 221)
    public static final boolean method1837(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 == arg2 && arg3 == arg4) {
            if (!class413.method2524(arg0, arg1, arg3)) {
                return false;
            } else {
                int var6 = arg1 << class351.field4688;
                int var7 = arg3 << class351.field4688;
                return class154.method917(var6 + 1, class152.field1993[arg0].method217(arg1, arg3) + arg5, var7 + 1) && class154.method917(class166.field2152 + var6 - 1, class152.field1993[arg0].method217(arg1 + 1, arg3) + arg5, var7 + 1) && class154.method917(class166.field2152 + var6 - 1, class152.field1993[arg0].method217(arg1 + 1, arg3 + 1) + arg5, class166.field2152 + var7 - 1) && class154.method917(var6 + 1, class152.field1993[arg0].method217(arg1, arg3 + 1) + arg5, class166.field2152 + var7 - 1);
            }
        } else {
            for (int var8 = arg1; var8 <= arg2; ++var8) {
                for (int var14 = arg3; var14 <= arg4; ++var14) {
                    if (class505.field7340[arg0][var8][var14] == -class292.field3861) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class351.field4688) + 1;
            int var10 = (arg3 << class351.field4688) + 2;
            int var11 = class152.field1993[arg0].method217(arg1, arg3) + arg5;
            if (!class154.method917(var9, var11, var10)) {
                return false;
            } else {
                int var12 = (arg2 << class351.field4688) - 1;
                if (!class154.method917(var12, var11, var10)) {
                    return false;
                } else {
                    int var13 = (arg4 << class351.field4688) - 1;
                    if (!class154.method917(var9, var11, var13)) {
                        return false;
                    } else if (!class154.method917(var12, var11, var13)) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(I[[I)V", line = 281)
    private final void method1838(int arg0, int[][] arg1) {
        ++field4122;
        int var3 = class446.field6486;
        int var4 = class305.field4055;
        class265.method1626(arg1, 1);
        if (arg0 != 13019) {
            field4130 = null;
        }
        class397.method2451(class102.field1388, 0, 0, 0, class115.field1508);
        if (this.field4127 != null) {
            for (int var5 = 0; var5 < this.field4127.length; ++var5) {
                class105 var6 = this.field4127[var5];
                int var7 = var6.field1412;
                int var8 = var6.field1411;
                if (var7 < 0) {
                    if (var8 >= 0) {
                        var6.method638(27, var3, var4);
                    }
                } else if (~var8 <= -1) {
                    var6.method640(var4, -3686, var3);
                } else {
                    var6.method637(var4, var3, true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "()V", line = 331)
    public class308() {
        super(0, true);
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Lug;II)V", line = 335)
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            this.field4127 = new class105[arg0.method2388((byte) -117)];
            for (int var4 = 0; var4 < this.field4127.length; ++var4) {
                int var5 = arg0.method2388((byte) -127);
                if (~var5 != -1) {
                    if (var5 != 1) {
                        if (~var5 != -3) {
                            if (var5 == 3) {
                                this.field4127[var4] = class307.method1834(arg0, (byte) 92);
                            }
                        } else {
                            this.field4127[var4] = class293.method1762(-119, arg0);
                        }
                    } else {
                        this.field4127[var4] = class211.method1343(8661, arg0);
                    }
                } else {
                    this.field4127[var4] = class463.method2840(arg0, (byte) -123);
                }
            }
        } else if (~arg2 == -2) {
            super.field3066 = ~arg0.method2388((byte) -120) == -2;
        }
        if (arg1 != 487215116) {
            field4130 = null;
        }
        ++field4125;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 408)
    public static void method1839(byte arg0) {
        if (arg0 == 37) {
            field4130 = null;
        }
    }
}
