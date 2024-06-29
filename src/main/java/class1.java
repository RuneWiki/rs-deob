import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 extends class471 implements class381 {

    @OriginalMember(owner = "client!us", name = "J", descriptor = "Lql;")
    public class477 field14;

    @OriginalMember(owner = "client!us", name = "E", descriptor = "Z")
    private boolean field9;

    @OriginalMember(owner = "client!us", name = "y", descriptor = "Lgd;")
    public static class206 field3 = new class206(" has logged out.", " loggt sich aus.", " s'est déconnecté.", " saiu do jogo.");

    @OriginalMember(owner = "client!us", name = "R", descriptor = "Ls;")
    public static class169 field22 = new class169(14, 14);

    @OriginalMember(owner = "client!us", name = "T", descriptor = "Lrt;")
    public static class137 field24 = new class137("WIP", 2);

    @OriginalMember(owner = "client!us", name = "w", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!us", name = "F", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!us", name = "G", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!us", name = "H", descriptor = "I")
    public static int field12;

    @OriginalMember(owner = "client!us", name = "I", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!us", name = "K", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!us", name = "L", descriptor = "I")
    public static int field16;

    @OriginalMember(owner = "client!us", name = "M", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!us", name = "N", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!us", name = "O", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!us", name = "x", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "P", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!us", name = "Q", descriptor = "I")
    public static int field21;

    @OriginalMember(owner = "client!us", name = "U", descriptor = "I")
    public static int field25;

    @OriginalMember(owner = "client!us", name = "z", descriptor = "I")
    public static int field4;

    @OriginalMember(owner = "client!us", name = "A", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "B", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!us", name = "C", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "D", descriptor = "I")
    public static int field8;

    @OriginalMember(owner = "client!us", name = "S", descriptor = "Lrh;")
    public static class159 field23;

    @OriginalMember(owner = "client!us", name = "V", descriptor = "[[[B")
    public static byte[][][] field26;

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(I)V")
    public final void method1(int arg0) {
        ++field16;
        if (arg0 > -105) {
            this.field14 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIILwm;ZLhp;Z)V")
    public final void method2(int arg0, int arg1, int arg2, class364 arg3, boolean arg4, class197 arg5, boolean arg6) {
        ++field20;
        if (arg6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Lwm;B)Lnf;")
    public final class374 method3(class364 arg0, byte arg1) {
        ++field18;
        class456 var3 = this.field14.method2796(true, false, arg0, 1024, super.field6507, super.field6501, (byte) -119);
        if (var3 == null) {
            return null;
        } else {
            class203 var4 = arg0.method1960();
            if (arg1 < 99) {
                return null;
            } else {
                var4.method1029(super.field6501, super.field6503, super.field6507);
                class374 var5 = null;
                if (this.field9) {
                    var5 = class358.method2196(1, (byte) -120);
                }
                if (this.field14.field6610 != null) {
                    class342 var6 = this.field14.field6610.method1441();
                    arg0.method2051(var3, var6, var4, var5 != null ? var5.field5156[0] : null, 0);
                } else {
                    var3.method1880(var4, var5 != null ? var5.field5156[0] : null, 0);
                }
                this.field14.method2790(arg0, super.field6491, var3, super.field6500, super.field6497, true, (byte) 101, super.field6505);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)I")
    public final int method4(int arg0) {
        ++field17;
        return arg0 != -10666 ? -118 : this.field14.field6596;
    }

    @OriginalMember(owner = "client!us", name = "b", descriptor = "(Z)V")
    public static final void method5(boolean arg0) {
        ++field15;
        if (arg0) {
            class106 var1 = class250.method1400(15, 123, 0);
            var1.method659(-84);
        }
    }

    @OriginalMember(owner = "client!us", name = "h", descriptor = "(I)I")
    public final int method6(int arg0) {
        ++field19;
        return arg0 != 0 ? -14 : this.field14.method2791((byte) -38);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Z)Z")
    public final boolean method7(boolean arg0) {
        if (arg0) {
            return true;
        } else {
            ++field1;
            return this.field14.method2793(97);
        }
    }

    @OriginalMember(owner = "client!us", name = "e", descriptor = "(I)V")
    public final void method8(int arg0) {
        ++field2;
        if (arg0 > -74) {
            this.method10((class364) null, (byte) -15);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!us", name = "c", descriptor = "(I)I")
    public final int method9(int arg0) {
        ++field21;
        if (arg0 != -769) {
            this.method12((byte) 1, (class364) null);
        }
        return this.field14.field6590;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lwm;B)V")
    public final void method10(class364 arg0, byte arg1) {
        ++field8;
        class456 var3 = this.field14.method2796(true, true, arg0, 131072, super.field6507, super.field6501, (byte) -128);
        if (arg1 <= -48) {
            if (var3 != null) {
                this.field14.method2790(arg0, super.field6491, var3, super.field6500, super.field6497, false, (byte) 58, super.field6505);
            }
        }
    }

    @OriginalMember(owner = "client!us", name = "i", descriptor = "(I)V")
    public static void method11(int arg0) {
        if (arg0 == 1) {
            field23 = null;
            field22 = null;
            field24 = null;
            field26 = null;
            field3 = null;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(BLwm;)V")
    public final void method12(byte arg0, class364 arg1) {
        if (arg0 < 27) {
            this.field9 = false;
        }
        this.field14.method2785(arg1, -27576);
        ++field5;
    }

    @OriginalMember(owner = "client!us", name = "d", descriptor = "(I)I")
    public final int method13(int arg0) {
        if (arg0 < 51) {
            return -99;
        } else {
            ++field13;
            return this.field14.field6595;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIBLwm;)Z")
    public final boolean method14(int arg0, int arg1, byte arg2, class364 arg3) {
        if (arg2 > -107) {
            this.method4(44);
        }
        ++field25;
        class456 var5 = this.field14.method2796(false, false, arg3, 65536, super.field6507, super.field6501, (byte) -118);
        if (var5 == null) {
            return false;
        } else {
            class203 var6 = arg3.method1960();
            var6.method1029(super.field6501, super.field6503, super.field6507);
            return var5.method1882(arg0, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(ILwm;I)Lgn;")
    public final class456 method15(int arg0, class364 arg1, int arg2) {
        if (arg2 != -28045) {
            this.method17(86);
        }
        ++field10;
        return this.field14.method2796(false, false, arg1, arg0, 0, 0, (byte) -114);
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lwm;I)V")
    public final void method16(class364 arg0, int arg1) {
        if (arg1 != 31591) {
            this.method6(21);
        }
        this.field14.method2795(74, arg0);
        ++field11;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lwm;Lct;IIIIIZIIIIIII)V")
    public class1(class364 arg0, class88 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg4, arg5, arg6, arg8, arg9, arg10, arg11, ~arg1.field1302 == -2, class289.method1630(arg13, arg12, false));
        this.field14 = new class477(arg0, arg1, arg12, arg13, super.field6502, arg3, arg4, arg6, arg7, arg14);
        this.field9 = ~arg1.field1265 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!us", name = "g", descriptor = "(I)Z")
    public final boolean method17(int arg0) {
        if (arg0 != 7) {
            this.method17(-8);
        }
        ++field7;
        return false;
    }
}
