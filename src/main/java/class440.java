import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class440 extends class526 implements class706 {

    @OriginalMember(owner = "client!ti", name = "X", descriptor = "Z")
    private boolean field6272 = false;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "Lwca;")
    public class676 field6256;

    @OriginalMember(owner = "client!ti", name = "gb", descriptor = "Z")
    private boolean field6281;

    @OriginalMember(owner = "client!ti", name = "ab", descriptor = "[I")
    public static int[] field6275 = new int[14];

    @OriginalMember(owner = "client!ti", name = "L", descriptor = "Z")
    public static boolean field6260 = false;

    @OriginalMember(owner = "client!ti", name = "W", descriptor = "[I")
    public static int[] field6271 = new int[14];

    @OriginalMember(owner = "client!ti", name = "H", descriptor = "Lvl;")
    public static class13 field6257 = new class13("WTWIP", 3);

    @OriginalMember(owner = "client!ti", name = "J", descriptor = "I")
    public static int field6258;

    @OriginalMember(owner = "client!ti", name = "K", descriptor = "I")
    public static int field6259;

    @OriginalMember(owner = "client!ti", name = "M", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!ti", name = "N", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!ti", name = "O", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ti", name = "P", descriptor = "I")
    public static int field6264;

    @OriginalMember(owner = "client!ti", name = "Q", descriptor = "I")
    public static int field6265;

    @OriginalMember(owner = "client!ti", name = "R", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!ti", name = "S", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!ti", name = "U", descriptor = "I")
    public static int field6269;

    @OriginalMember(owner = "client!ti", name = "V", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!ti", name = "Y", descriptor = "I")
    public static int field6273;

    @OriginalMember(owner = "client!ti", name = "Z", descriptor = "I")
    public static int field6274;

    @OriginalMember(owner = "client!ti", name = "bb", descriptor = "I")
    public static int field6276;

    @OriginalMember(owner = "client!ti", name = "cb", descriptor = "I")
    public static int field6277;

    @OriginalMember(owner = "client!ti", name = "db", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!ti", name = "eb", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!ti", name = "fb", descriptor = "I")
    public static int field6280;

    @OriginalMember(owner = "client!ti", name = "hb", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!ti", name = "ib", descriptor = "I")
    public static int field6283;

    @OriginalMember(owner = "client!ti", name = "T", descriptor = "Lkj;")
    private class566 field6268;

    @OriginalMember(owner = "client!ti", name = "jb", descriptor = "[I")
    public static int[] field6284;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "(I)Z")
    public final boolean method746(int arg0) {
        ++field6258;
        if (arg0 > -106) {
            method2656((class58) null, 93);
        }
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ZLha;IILkba;II)V")
    public final void method615(boolean arg0, class58 arg1, int arg2, int arg3, class105 arg4, int arg5, int arg6) {
        ++field6262;
        if (arg5 != 22501) {
            method2657(18);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lha;Lhba;IIIIIZII)V")
    public class440(class58 arg0, class10 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg2, arg3, arg1.field150);
        this.field6256 = new class676(arg0, arg1, 22, arg8, arg2, arg3, this, arg7, arg9);
        this.field6281 = arg1.field207 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILha;)V")
    public final void method860(int arg0, class58 arg1) {
        if (arg0 >= 15) {
            ++field6279;
            this.field6256.method3763(-1, arg1);
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)Z")
    public final boolean method751(boolean arg0) {
        if (arg0) {
            this.method749(4);
        }
        ++field6259;
        return this.field6272;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(BLha;)Lml;")
    public final class387 method755(byte arg0, class58 arg1) {
        ++field6278;
        class471 var3 = this.field6256.method3765(false, -16386, true, arg1, 2048);
        if (var3 == null) {
            return null;
        } else {
            class513 var4 = arg1.method439();
            var4.method339(super.field1264, super.field1255, super.field1250);
            class387 var5 = class65.method544(this.field6281, 1, 24824);
            if (arg0 != -127) {
                this.method866((byte) 25);
            }
            int var6 = super.field1264 >> 9;
            int var7 = super.field1250 >> 9;
            this.field6256.method3768(var3, var6, true, arg1, (byte) 76, var4, var7, var6, var7);
            if (class180.field2409) {
                var3.method262(var4, var5.field5482[0], class516.field7361, 0);
            } else {
                var3.method221(var4, var5.field5482[0], 0);
            }
            if (this.field6256.field9231 != null) {
                class50 var8 = this.field6256.field9231.method3116();
                if (class180.field2409) {
                    arg1.method379(var8, class516.field7361);
                } else {
                    arg1.method381(var8);
                }
            }
            this.field6272 = var3.method224() || this.field6256.field9231 != null;
            if (this.field6268 != null) {
                class555.method3208(this.field6268, super.field1255, super.field1250, super.field1264, (byte) -83, var3);
            } else {
                this.field6268 = class654.method3596(super.field1255, var3, super.field1264, super.field1250, (byte) 14);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)Z")
    public final boolean method867(byte arg0) {
        if (arg0 < 82) {
            method2656((class58) null, 21);
        }
        ++field6267;
        return this.field6256.method3758(-67);
    }

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "(I)I")
    public final int method749(int arg0) {
        if (arg0 != 32767) {
            this.method749(-117);
        }
        ++field6263;
        return this.field6256.method3760((byte) -1);
    }

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "(B)I")
    public final int method750(byte arg0) {
        if (arg0 != 14) {
            this.field6268 = null;
        }
        ++field6277;
        return this.field6256.method3766(-112);
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(B)V")
    public final void method866(byte arg0) {
        ++field6264;
        if (arg0 != -62) {
            field6257 = null;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(B)I")
    public final int method868(byte arg0) {
        ++field6261;
        if (arg0 != -10) {
            this.method615(false, (class58) null, 4, 13, (class105) null, -8, -50);
        }
        return this.field6256.field9227;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(BLha;)V")
    public final void method753(byte arg0, class58 arg1) {
        ++field6274;
        class471 var3 = this.field6256.method3765(true, -16386, true, arg1, 262144);
        if (var3 != null) {
            int var4 = super.field1264 >> 9;
            int var5 = super.field1250 >> 9;
            class513 var6 = arg1.method439();
            var6.method339(super.field1264, super.field1255, super.field1250);
            this.field6256.method3768(var3, var4, false, arg1, (byte) -125, var6, var5, var4, var5);
        }
        int var7 = 51 % ((arg0 - 18) / 40);
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(B)I")
    public final int method861(byte arg0) {
        if (arg0 != -17) {
            field6276 = -22;
        }
        ++field6270;
        return this.field6256.field9228;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)I")
    public final int method865(int arg0) {
        ++field6283;
        if (arg0 != 30374) {
            this.method621(-62);
        }
        return this.field6256.field9223;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lha;I)V")
    public static final void method2656(class58 arg0, int arg1) {
        ++field6273;
        if (arg1 != 18975) {
            field6260 = false;
        }
        if (class591.field8332.method2764(arg1 + -18952) != 0) {
            if (~class557.field7812.field6521.method2556(false) == -1) {
                for (class712 var2 = (class712) class591.field8332.method2765(arg1 ^ -26108); var2 != null; var2 = (class712) class591.field8332.method2759(arg1 ^ -30240)) {
                    class682.field9361.method3420(var2.field9899, var2.field9901, false, var2.field9903, arg0, class352.field4974, !var2.field9897 ? null : class660.field9039.field3983, var2.field9904, var2.field9906, false, arg0, false);
                    var2.method1185(-62);
                }
                class350.method2257(-101);
            } else {
                if (class90.field1075 == null) {
                    Canvas var3 = new Canvas();
                    var3.setSize(36, 32);
                    class90.field1075 = class353.method2283(class452.field6395, class665.field9066, 0, var3, 0, (byte) -72);
                    class609.field8571 = class90.field1075.method459(class439.method2651((byte) -117, 0, class405.field5725, class508.field7273), class204.method1235(class374.field5245, class508.field7273, 0), true);
                }
                for (class712 var4 = (class712) class591.field8332.method2765(-12261); var4 != null; var4 = (class712) class591.field8332.method2759(-15361)) {
                    class682.field9361.method3420(var4.field9899, var4.field9901, false, var4.field9903, arg0, class609.field8571, var4.field9897 ? class660.field9039.field3983 : null, var4.field9904, var4.field9906, false, class90.field1075, false);
                    var4.method1185(-94);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Z")
    public final boolean method621(int arg0) {
        ++field6269;
        if (arg0 > -103) {
            this.method755((byte) -62, (class58) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(ILha;)Lkj;")
    public final class566 method744(int arg0, class58 arg1) {
        ++field6282;
        return arg0 != 0 ? null : this.field6268;
    }

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "(I)V")
    public static void method2657(int arg0) {
        field6275 = null;
        field6284 = null;
        field6257 = null;
        field6271 = null;
        if (arg0 > -113) {
            field6276 = -45;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lha;III)Z")
    public final boolean method752(class58 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            return true;
        } else {
            ++field6266;
            class471 var5 = this.field6256.method3765(false, -16386, false, arg0, 131072);
            if (var5 == null) {
                return false;
            } else {
                class513 var6 = arg0.method439();
                var6.method339(super.field1264, super.field1255, super.field1250);
                return !class180.field2409 ? var5.method233(arg3, arg2, var6, false, 0) : var5.method229(arg3, arg2, var6, false, 0, class516.field7361);
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Lha;B)V")
    public final void method864(class58 arg0, byte arg1) {
        ++field6280;
        if (arg1 == -73) {
            this.field6256.method3764(arg1 ^ -76, arg0);
        }
    }

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "(I)V")
    public final void method614(int arg0) {
        ++field6265;
        if (arg0 == 26062) {
            throw new IllegalStateException();
        }
    }
}
