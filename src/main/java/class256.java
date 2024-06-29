import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class256 {

    @OriginalMember(owner = "client!id", name = "f", descriptor = "Lud;")
    public class17 field4401 = new class17();

    @OriginalMember(owner = "client!id", name = "d", descriptor = "Lhn;")
    public static class317 field4399 = new class317(50);

    @OriginalMember(owner = "client!id", name = "i", descriptor = "Lhi;")
    public static class82 field4404 = class95.method664((byte) -57, "Fertigkeit: ");

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Z")
    public static boolean field4406 = false;

    @OriginalMember(owner = "client!id", name = "n", descriptor = "Z")
    public static boolean field4409 = true;

    @OriginalMember(owner = "client!id", name = "h", descriptor = "B")
    public static byte field4403;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!id", name = "m", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    public static int field4410;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field4412;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lud;")
    private class17 field4407;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Lum;")
    public static class222 field4411;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "[[[B")
    public static byte[][][] field4405;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1828(byte arg0) {
        field4397++;
        class249.field4298++;
        class61.field957.method1504(1, -1);
        class61.field957.method1102((byte) -41, class27.field359);
        if (arg0 != -13) {
            method1832((byte) 15, 24);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IBLsm;Ljava/awt/Component;I)Lrh;", line = 21)
    public static final class110 method1829(int arg0, byte arg1, class120 arg2, Component arg3, int arg4) {
        field4400++;
        if (class307.field5236 == 0) {
            throw new IllegalStateException();
        } else if (arg4 < 0 || arg4 >= 2) {
            throw new IllegalArgumentException();
        } else if (arg1 == 28) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class110 var5 = (class110) Class.forName("kb").getDeclaredConstructor().newInstance();
                var5.field1989 = arg0;
                var5.field1971 = new int[(class219.field3799 ? 2 : 1) * 256];
                var5.method755(arg3);
                var5.field1988 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field1988 > 16384) {
                    var5.field1988 = 16384;
                }
                var5.method762(var5.field1988);
                if (class238.field4145 > 0 && class122.field2132 == null) {
                    class122.field2132 = new class177();
                    class122.field2132.field3041 = arg2;
                    arg2.method821(class122.field2132, class238.field4145, (byte) -34);
                }
                if (class122.field2132 != null) {
                    if (class122.field2132.field3043[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class122.field2132.field3043[arg4] = var5;
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class128 var7 = new class128(arg2, arg4);
                    var7.field1971 = new int[(class219.field3799 ? 2 : 1) * 256];
                    var7.field1989 = arg0;
                    var7.method755(arg3);
                    var7.field1988 = 16384;
                    var7.method762(var7.field1988);
                    if (class238.field4145 > 0 && class122.field2132 == null) {
                        class122.field2132 = new class177();
                        class122.field2132.field3041 = arg2;
                        arg2.method821(class122.field2132, class238.field4145, (byte) -34);
                    }
                    if (class122.field2132 != null) {
                        if (class122.field2132.field3043[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class122.field2132.field3043[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class110();
                }
            }
        } else {
            return (class110) null;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lud;I)V", line = 105)
    public final void method1830(class17 arg0, int arg1) {
        if (arg0.field176 != null) {
            arg0.method98(412);
        }
        arg0.field178 = this.field4401;
        arg0.field176 = this.field4401.field176;
        field4402++;
        arg0.field176.field178 = arg0;
        arg0.field178.field176 = arg0;
        if (arg1 != 1) {
            field4403 = -114;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lrm;IIIII)V", line = 134)
    public static final void method1831(class175 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class62.field974 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class89.field1605) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class38.field658 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class16 var14 = class15.field120[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class245.field4255[var11][var12 + 1][var13] + class245.field4255[var11][var12][var13] + class245.field4255[var11][var12][var13 + 1] + class245.field4255[var11][var12 + 1][var13 + 1]) / 4 - (class245.field4255[arg1][arg2 + 1][arg3] + class245.field4255[arg1][arg2][arg3] + class245.field4255[arg1][arg2][arg3 + 1] + class245.field4255[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class90 var16 = var14.field171;
                                    if (var16 != null) {
                                        if (var16.field1626.method234()) {
                                            arg0.method192(var16.field1626, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1617 != null && var16.field1617.method234()) {
                                            arg0.method192(var16.field1617, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field165; var17++) {
                                        class69 var18 = var14.field158[var17];
                                        if (var18 != null && var18.field1075.method234() && (var18.field1076 == var12 || var7 == var12) && (var18.field1080 == var13 || var9 == var13)) {
                                            int var19 = var18.field1068 + 1 - var18.field1076;
                                            int var20 = var18.field1083 + 1 - var18.field1080;
                                            arg0.method192(var18.field1075, (var18.field1076 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1080 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)I", line = 234)
    public static final int method1832(byte arg0, int arg1) {
        if (arg0 == -101) {
            field4398++;
            return arg1 >>> 8;
        } else {
            return -120;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V", line = 363)
    public class256() {
        this.field4401.field178 = this.field4401;
        this.field4401.field176 = this.field4401;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)Lud;", line = 258)
    public final class17 method1833(byte arg0) {
        class17 var2 = this.field4401.field178;
        field4412++;
        if (this.field4401 == var2) {
            this.field4407 = null;
            return null;
        }
        this.field4407 = var2.field178;
        if (arg0 >= -9) {
            field4405 = (byte[][][]) ((byte[][][]) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V", line = 282)
    public final void method1834(int arg0) {
        while (true) {
            class17 var2 = this.field4401.field178;
            if (this.field4401 == var2) {
                if (arg0 < 26) {
                    method1831((class175) null, -25, 75, -39, 22, 106);
                }
                field4396++;
                this.field4407 = null;
                return;
            }
            var2.method98(412);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V", line = 302)
    public static final void method1835(int arg0) {
        field4413++;
        if (arg0 < 95) {
            field4399 = (class317) null;
        }
        class42.field738.method2172(false);
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)Lud;", line = 317)
    public final class17 method1836(int arg0) {
        field4408++;
        class17 var2 = this.field4407;
        int var3 = 78 % ((-arg0 - 9) / 48);
        if (this.field4401 == var2) {
            this.field4407 = null;
            return null;
        } else {
            this.field4407 = var2.field178;
            return var2;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BLum;)V", line = 335)
    public static final void method1837(byte arg0, class222 arg1) {
        if (arg0 != 57) {
            method1829(88, (byte) -40, (class120) null, (Component) null, -83);
        }
        class29.field390 = arg1;
        field4410++;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(B)V", line = 352)
    public static void method1838(byte arg0) {
        field4399 = null;
        field4405 = (byte[][][]) null;
        if (arg0 > -93) {
            field4411 = (class222) null;
        }
        field4404 = null;
        field4411 = null;
    }
}
