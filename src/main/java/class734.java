import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class734 extends class119 implements class721 {

    @OriginalMember(owner = "client!ww", name = "ib", descriptor = "Z")
    private boolean field10283 = false;

    @OriginalMember(owner = "client!ww", name = "cb", descriptor = "Lqea;")
    public class128 field10277;

    @OriginalMember(owner = "client!ww", name = "O", descriptor = "Z")
    private boolean field10263;

    @OriginalMember(owner = "client!ww", name = "S", descriptor = "I")
    public static int field10267 = -1;

    @OriginalMember(owner = "client!ww", name = "V", descriptor = "I")
    public static int field10270 = -1;

    @OriginalMember(owner = "client!ww", name = "K", descriptor = "I")
    public static int field10259;

    @OriginalMember(owner = "client!ww", name = "L", descriptor = "I")
    public static int field10260;

    @OriginalMember(owner = "client!ww", name = "M", descriptor = "I")
    public static int field10261;

    @OriginalMember(owner = "client!ww", name = "N", descriptor = "I")
    public static int field10262;

    @OriginalMember(owner = "client!ww", name = "Q", descriptor = "I")
    public static int field10265;

    @OriginalMember(owner = "client!ww", name = "R", descriptor = "I")
    public static int field10266;

    @OriginalMember(owner = "client!ww", name = "T", descriptor = "I")
    public static int field10268;

    @OriginalMember(owner = "client!ww", name = "U", descriptor = "I")
    public static int field10269;

    @OriginalMember(owner = "client!ww", name = "W", descriptor = "I")
    public static int field10271;

    @OriginalMember(owner = "client!ww", name = "X", descriptor = "I")
    public static int field10272;

    @OriginalMember(owner = "client!ww", name = "Y", descriptor = "I")
    public static int field10273;

    @OriginalMember(owner = "client!ww", name = "Z", descriptor = "I")
    public static int field10274;

    @OriginalMember(owner = "client!ww", name = "ab", descriptor = "I")
    public static int field10275;

    @OriginalMember(owner = "client!ww", name = "bb", descriptor = "I")
    public static int field10276;

    @OriginalMember(owner = "client!ww", name = "eb", descriptor = "I")
    public static int field10279;

    @OriginalMember(owner = "client!ww", name = "fb", descriptor = "I")
    public static int field10280;

    @OriginalMember(owner = "client!ww", name = "gb", descriptor = "I")
    public static int field10281;

    @OriginalMember(owner = "client!ww", name = "hb", descriptor = "I")
    public static int field10282;

    @OriginalMember(owner = "client!ww", name = "jb", descriptor = "I")
    public static int field10284;

    @OriginalMember(owner = "client!ww", name = "kb", descriptor = "I")
    public static int field10285;

    @OriginalMember(owner = "client!ww", name = "lb", descriptor = "I")
    public static int field10286;

    @OriginalMember(owner = "client!ww", name = "mb", descriptor = "I")
    public static int field10287;

    @OriginalMember(owner = "client!ww", name = "nb", descriptor = "I")
    public static int field10288;

    @OriginalMember(owner = "client!ww", name = "P", descriptor = "Lria;")
    private class286 field10264;

    @OriginalMember(owner = "client!ww", name = "db", descriptor = "Lvd;")
    public static class39 field10278;

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "(I)V")
    public final void method741(int arg0) {
        if (arg0 <= -93) {
            ++field10268;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(B)V")
    public final void method316(byte arg0) {
        ++field10266;
        if (arg0 != -66) {
            this.method738((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)Z")
    public final boolean method321(byte arg0) {
        ++field10285;
        if (arg0 > -125) {
            this.method313((byte) -92);
        }
        return this.field10277.method900(124);
    }

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "(B)Z")
    public final boolean method738(byte arg0) {
        if (arg0 != 88) {
            this.method313((byte) -112);
        }
        ++field10284;
        return false;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lha;I)Lria;")
    public final class286 method325(class60 arg0, int arg1) {
        if (arg1 != 92160000) {
            method4130(10);
        }
        ++field10280;
        return this.field10264;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(III)I")
    public static final int method4128(int arg0, int arg1, int arg2) {
        if (arg0 <= 7) {
            return -67;
        } else {
            ++field10274;
            byte var3;
            if (arg2 <= 20000) {
                if (~arg2 >= -10001) {
                    if (~arg2 >= -5001) {
                        var3 = 1;
                        class645.method3699(true, false);
                    } else {
                        var3 = 2;
                        class242.method1608(0);
                    }
                } else {
                    class505.method2999(0);
                    var3 = 3;
                }
            } else {
                class647.method3761(-28280);
                var3 = 4;
            }
            if (~arg1 != ~class63.field916.field10200.method3848(17503)) {
                class63.field916.method4111(73, arg1, class63.field916.field10177);
                class134.method950(0, arg1, false);
            }
            class585.method3384(-76);
            return var3;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(IBLha;I)Z")
    public final boolean method312(int arg0, byte arg1, class60 arg2, int arg3) {
        ++field10272;
        class473 var5 = this.field10277.method903(arg2, 131072, 91, false, false);
        if (var5 == null) {
            return false;
        } else {
            class738 var6 = arg2.method442();
            if (arg1 >= -44) {
                return true;
            } else {
                var6.method774(super.field8423, super.field8421, super.field8428);
                return class418.field6258 ? var5.method283(arg0, arg3, var6, false, 0, class188.field2859) : var5.method277(arg0, arg3, var6, false, 0);
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "h", descriptor = "(B)I")
    public final int method315(byte arg0) {
        ++field10265;
        if (arg0 != 106) {
            this.method314((class60) null, true);
        }
        return this.field10277.method898(98);
    }

    @OriginalMember(owner = "client!ww", name = "j", descriptor = "(B)I")
    public final int method313(byte arg0) {
        ++field10288;
        if (arg0 != 3) {
            this.field10264 = null;
        }
        return this.field10277.method899(124);
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(Lha;B)Lc;")
    public final class187 method319(class60 arg0, byte arg1) {
        ++field10282;
        class473 var3 = this.field10277.method903(arg0, 2048, 110, false, true);
        int var4 = 29 % ((-25 - arg1) / 60);
        if (var3 == null) {
            return null;
        } else {
            class738 var5 = arg0.method442();
            var5.method774(super.field8423, super.field8421, super.field8428);
            class187 var6 = class650.method3774(95, this.field10263, 1);
            this.field10277.method906(super.field1624, true, super.field1626, var5, -57, arg0, super.field1628, var3, super.field1632);
            if (!class418.field6258) {
                var3.method265(var5, var6.field2851[0], 0);
            } else {
                var3.method235(var5, var6.field2851[0], class188.field2859, 0);
            }
            if (this.field10277.field1690 != null) {
                class624 var7 = this.field10277.field1690.method3603();
                if (class418.field6258) {
                    arg0.method505(var7, class188.field2859);
                } else {
                    arg0.method523(var7);
                }
            }
            this.field10283 = var3.method275() || this.field10277.field1690 != null;
            if (this.field10264 == null) {
                this.field10264 = class60.method527(var3, super.field8428, super.field8423, super.field8421, -22060);
            } else {
                class240.method1604(super.field8428, var3, super.field8421, true, this.field10264, super.field8423);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILfe;)V")
    public final void method4129(int arg0, class572 arg1) {
        if (arg0 != 0) {
            this.method315((byte) -63);
        }
        this.field10277.method896(arg1, 6706);
        ++field10286;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILha;)V")
    public final void method318(int arg0, class60 arg1) {
        int var3 = 120 % ((arg0 - 8) / 57);
        ++field10259;
        this.field10277.method905(16, arg1);
    }

    @OriginalMember(owner = "client!ww", name = "k", descriptor = "(B)Z")
    public final boolean method329(byte arg0) {
        ++field10269;
        int var2 = 75 % ((arg0 - -33) / 42);
        return this.field10283;
    }

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "(I)V")
    public static void method4130(int arg0) {
        field10278 = null;
        if (arg0 > -32) {
            field10278 = null;
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(ILvs;ZILha;II)V")
    public final void method737(int arg0, class593 arg1, boolean arg2, int arg3, class60 arg4, int arg5, int arg6) {
        ++field10287;
        if (arg0 != 8616) {
            field10278 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lha;B)V")
    public final void method310(class60 arg0, byte arg1) {
        this.field10277.method907(12898, arg0);
        ++field10262;
        if (arg1 != -88) {
            this.field10263 = true;
        }
    }

    @OriginalMember(owner = "client!ww", name = "i", descriptor = "(B)Z")
    public final boolean method320(byte arg0) {
        if (arg0 != 84) {
            return false;
        } else {
            ++field10279;
            return false;
        }
    }

    @OriginalMember(owner = "client!ww", name = "<init>", descriptor = "(Lha;Lsu;IIIIIZIIIIIII)V")
    public class734(class60 arg0, class211 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field3123 == 1, class221.method1481(-22029, arg12, arg13));
        this.field10277 = new class128(arg0, arg1, arg12, arg13, super.field8429, arg3, this, arg7, arg14);
        this.field10263 = arg1.field3113 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)I")
    public final int method327(int arg0) {
        ++field10273;
        return arg0 > -116 ? -11 : this.field10277.field1696;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)I")
    public final int method317(int arg0) {
        ++field10276;
        return arg0 < 112 ? 34 : this.field10277.field1709;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lkd;Z)V")
    public static final void method4131(class282 arg0, boolean arg1) {
        ++field10261;
        if (arg1) {
            method4131((class282) null, false);
        }
        for (class449 var2 = (class449) class478.field6929.method1195(0); var2 != null; var2 = (class449) class478.field6929.method1201(2)) {
            if (var2.field6646 == arg0) {
                if (var2.field6659 != null) {
                    class171.field2666.method3834(var2.field6659);
                    var2.field6659 = null;
                }
                var2.method1304((byte) 7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Lha;Z)V")
    public final void method314(class60 arg0, boolean arg1) {
        if (arg1) {
            field10260 = -73;
        }
        ++field10271;
        class473 var3 = this.field10277.method903(arg0, 262144, 87, true, true);
        if (var3 != null) {
            class738 var4 = arg0.method442();
            var4.method774(super.field8423, super.field8421, super.field8428);
            this.field10277.method906(super.field1624, false, super.field1626, var4, -91, arg0, super.field1628, var3, super.field1632);
        }
    }

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "(B)I")
    public final int method309(byte arg0) {
        if (arg0 > -16) {
            this.method319((class60) null, (byte) 79);
        }
        ++field10275;
        return this.field10277.field1697;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "([Lwj;Lwh;I)Lrv;")
    public static final class111 method4132(class396[] arg0, class148 arg1, int arg2) {
        ++field10281;
        for (int var3 = 0; ~arg0.length < ~var3; ++var3) {
            if (arg0[var3] == null || ~arg0[var3].field5944 >= -1L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        if (arg2 != 14964) {
            return null;
        } else {
            for (int var6 = 0; var6 < arg0.length; ++var6) {
                OpenGL.glAttachObjectARB(var4, arg0[var6].field5944);
            }
            OpenGL.glLinkProgramARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35714, class396.field5943, 0);
            if (~class396.field5943[0] == -1) {
                if (~class396.field5943[0] == -1) {
                    System.out.println("Shader linking failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class396.field5943, 1);
                if (~class396.field5943[1] < -2) {
                    byte[] var7 = new byte[class396.field5943[1]];
                    OpenGL.glGetInfoLogARB(var4, class396.field5943[1], class396.field5943, 0, var7, 0);
                    System.out.println(new String(var7));
                }
                if (~class396.field5943[0] == -1) {
                    for (int var8 = 0; ~var8 > ~arg0.length; ++var8) {
                        OpenGL.glDetachObjectARB(var4, arg0[var8].field5944);
                    }
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class111(arg1, var4, arg0);
        }
    }
}
