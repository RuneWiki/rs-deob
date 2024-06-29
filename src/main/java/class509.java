import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class509 extends class567 implements class310 {

    @OriginalMember(owner = "client!md", name = "w", descriptor = "Las;")
    public class142 field6369;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "Z")
    private boolean field6368;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "Lcga;")
    public static class449 field6373 = new class449(28, 4);

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Ltl;")
    public static class580 field6375 = new class580();

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    public static int field6376 = 0;

    @OriginalMember(owner = "client!md", name = "i", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!md", name = "j", descriptor = "I")
    public static int field6356;

    @OriginalMember(owner = "client!md", name = "k", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!md", name = "l", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!md", name = "m", descriptor = "I")
    public static int field6359;

    @OriginalMember(owner = "client!md", name = "o", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!md", name = "p", descriptor = "I")
    public static int field6362;

    @OriginalMember(owner = "client!md", name = "q", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!md", name = "r", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!md", name = "s", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!md", name = "t", descriptor = "I")
    public static int field6366;

    @OriginalMember(owner = "client!md", name = "u", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    public static int field6370;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "I")
    public static int field6371;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    public static int field6372;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "I")
    public static int field6377;

    @OriginalMember(owner = "client!md", name = "n", descriptor = "Lqt;")
    private class595 field6360;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Lps;")
    public static class86 field6374;

    // $FF: synthetic field
    @OriginalMember(owner = "client!md", name = "F", descriptor = "Ljava/lang/Class;")
    public static Class field6378;

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(I)V")
    public final void method132(int arg0) {
        if (arg0 != -13968) {
            this.method137(53);
        }
        ++field6355;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Loa;B)V")
    public final void method130(class650 arg0, byte arg1) {
        if (arg1 < -27) {
            ++field6367;
            this.field6369.method890(arg0, -110);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ZLoa;Lnt;IIII)V")
    public final void method135(boolean arg0, class650 arg1, class209 arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg6 != 12137) {
            this.field6369 = null;
        }
        ++field6361;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lsn;B)V")
    public static final void method2774(class589 arg0, byte arg1) {
        ++field6377;
        if (class407.field5237 != null) {
            class310 var2 = null;
            if (~arg0.field7915 == -1) {
                var2 = (class310) class593.method3281(arg0.field7906, arg0.field7904, arg0.field7910);
            }
            if (arg1 <= -72) {
                if (arg0.field7915 == 1) {
                    var2 = (class310) class546.method2924(arg0.field7906, arg0.field7904, arg0.field7910);
                }
                if (~arg0.field7915 == -3) {
                    var2 = (class310) class513.method2796(arg0.field7906, arg0.field7904, arg0.field7910, field6378 != null ? field6378 : (field6378 = method2777("pba")));
                }
                if (arg0.field7915 == 3) {
                    var2 = (class310) class618.method3444(arg0.field7906, arg0.field7904, arg0.field7910);
                }
                if (var2 != null) {
                    arg0.field7913 = var2.method131((byte) -97);
                    arg0.field7918 = var2.method138(8470);
                    arg0.field7909 = var2.method139((byte) 69);
                } else {
                    arg0.field7918 = 0;
                    arg0.field7913 = -1;
                    arg0.field7909 = 0;
                }
            }
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIII)V")
    public static final void method2775(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class612.field8321 != null) {
            class612.field8321[arg0][arg1] = -16777216 | arg2;
        }
        if (class493.field6143 != null) {
            class493.field6143[arg0][arg1] = (short) arg3;
        }
        if (class29.field349 != null) {
            class29.field349[arg0][arg1] = (byte) arg4;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(B)I")
    public final int method139(byte arg0) {
        if (arg0 <= 13) {
            return 28;
        } else {
            ++field6362;
            return this.field6369.field1705;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Loa;B)V")
    public final void method7(class650 arg0, byte arg1) {
        ++field6363;
        class359 var3 = this.field6369.method891(262144, arg0, (byte) -56, super.field7104, true, super.field7102, true);
        if (var3 != null) {
            int var4 = super.field7102 >> 9;
            int var5 = super.field7104 >> 9;
            class396 var6 = arg0.method470();
            var6.method591(super.field7102, super.field7101, super.field7104);
            this.field6369.method896(var6, false, var4, var3, var4, arg0, (byte) -93, var5, var5);
        }
        if (arg1 != 98) {
            field6376 = 78;
        }
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Loa;Lpg;IIIIIZIII)V")
    public class509(class650 arg0, class687 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class197.method1157(arg9, 3, arg8));
        this.field6369 = new class142(arg0, arg1, arg8, arg9, arg2, arg3, super.field7102, super.field7104, arg7, arg10);
        this.field6368 = ~arg1.field9382 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Loa;I)V")
    public final void method136(class650 arg0, int arg1) {
        this.field6369.method893(false, arg0);
        ++field6359;
        int var3 = -65 / ((arg1 - -78) / 37);
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(I)Z")
    public final boolean method137(int arg0) {
        if (arg0 >= -30) {
            this.method135(true, (class650) null, (class209) null, 61, 19, -1, -38);
        }
        ++field6356;
        return false;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Loa;BI)Lba;")
    public final class359 method134(class650 arg0, byte arg1, int arg2) {
        if (arg1 < 80) {
            this.method135(true, (class650) null, (class209) null, 33, -14, 64, -42);
        }
        ++field6358;
        return this.field6369.method891(arg2, arg0, (byte) -68, 0, false, 0, false);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(BILoa;I)Z")
    public final boolean method8(byte arg0, int arg1, class650 arg2, int arg3) {
        ++field6365;
        class359 var5 = this.field6369.method891(131072, arg2, (byte) 114, super.field7104, false, super.field7102, false);
        if (var5 == null) {
            return false;
        } else {
            int var6 = -43 % ((arg0 - 77) / 40);
            class396 var7 = arg2.method470();
            var7.method591(super.field7102, super.field7101, super.field7104);
            return var5.method2074(arg3, arg1, var7, false);
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(B)I")
    public final int method131(byte arg0) {
        ++field6372;
        if (arg0 != -97) {
            this.field6369 = null;
        }
        return this.field6369.field1727;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(ILoa;)Lww;")
    public final class686 method11(int arg0, class650 arg1) {
        ++field6366;
        class359 var3 = this.field6369.method891(2048, arg1, (byte) -117, super.field7104, false, super.field7102, true);
        if (var3 == null) {
            return null;
        } else {
            class396 var4 = arg1.method470();
            var4.method591(super.field7102, super.field7101, super.field7104);
            if (arg0 > -89) {
                this.method140((byte) -102);
            }
            class686 var5 = null;
            if (this.field6368) {
                var5 = class458.method2520(0, 1);
            }
            int var6 = super.field7102 >> 9;
            int var7 = super.field7104 >> 9;
            this.field6369.method896(var4, true, var6, var3, var6, arg1, (byte) -93, var7, var7);
            if (this.field6369.field1722 != null) {
                class228 var8 = this.field6369.field1722.method105();
                arg1.method427(var3, var8, var4, var5 == null ? null : var5.field9361[0], 0);
            } else {
                var3.method2049(var4, var5 == null ? null : var5.field9361[0], 0);
            }
            if (this.field6360 == null) {
                this.field6360 = class280.method1688(var3, super.field7104, -1, super.field7101, super.field7102);
            } else {
                class236.method1423(var3, false, super.field7104, super.field7101, this.field6360, super.field7102);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(I)I")
    public final int method138(int arg0) {
        if (arg0 != 8470) {
            method2775(8, 117, -98, 109, 37);
        }
        ++field6370;
        return this.field6369.field1719;
    }

    @OriginalMember(owner = "client!md", name = "e", descriptor = "(I)V")
    public static void method2776(int arg0) {
        field6374 = null;
        field6375 = null;
        field6373 = null;
        int var1 = 98 / ((arg0 - 33) / 35);
    }

    @OriginalMember(owner = "client!md", name = "b", descriptor = "(Loa;I)Lqt;")
    public final class595 method6(class650 arg0, int arg1) {
        if (arg1 != -7459) {
            method2775(75, -4, 91, 3, 28);
        }
        ++field6371;
        return this.field6360;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Z)Z")
    public final boolean method133(boolean arg0) {
        if (arg0) {
            return false;
        } else {
            ++field6357;
            return this.field6369.method899(-1);
        }
    }

    @OriginalMember(owner = "client!md", name = "c", descriptor = "(B)V")
    public final void method140(byte arg0) {
        int var2 = -10 / ((-16 - arg0) / 40);
        ++field6364;
        throw new IllegalStateException();
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2777(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
