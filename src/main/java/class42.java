import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class42 extends class64 {

    @OriginalMember(owner = "client!ed", name = "eb", descriptor = "I")
    private int field783 = 1;

    @OriginalMember(owner = "client!ed", name = "lb", descriptor = "I")
    private int field790 = 0;

    @OriginalMember(owner = "client!ed", name = "hb", descriptor = "I")
    private int field786 = 0;

    @OriginalMember(owner = "client!ed", name = "db", descriptor = "Lsg;")
    public static class169 field782 = class165.method1060("Bitte geben Sie Ihr Passwort ein)3", 1536);

    @OriginalMember(owner = "client!ed", name = "gb", descriptor = "I")
    public static int field785 = 0;

    @OriginalMember(owner = "client!ed", name = "mb", descriptor = "I")
    public static int field791 = 0;

    @OriginalMember(owner = "client!ed", name = "ib", descriptor = "Lsg;")
    public static class169 field787 = class165.method1060("null", 1536);

    @OriginalMember(owner = "client!ed", name = "ob", descriptor = "Lsg;")
    public static class169 field793 = class165.method1060("Anmelde)2Zeitlimit -Uberschritten)3", 1536);

    @OriginalMember(owner = "client!ed", name = "kb", descriptor = "Lsg;")
    private static class169 field789 = class165.method1060("Error connecting to server)3", 1536);

    @OriginalMember(owner = "client!ed", name = "cb", descriptor = "Lsg;")
    public static class169 field781 = field789;

    @OriginalMember(owner = "client!ed", name = "tb", descriptor = "[Lsg;")
    public static class169[] field798 = new class169[8];

    @OriginalMember(owner = "client!ed", name = "rb", descriptor = "I")
    public static int field796 = 0;

    @OriginalMember(owner = "client!ed", name = "ub", descriptor = "Lsg;")
    private static class169 field799 = class165.method1060("No reply from loginserver)3", 1536);

    @OriginalMember(owner = "client!ed", name = "bb", descriptor = "Lsg;")
    public static class169 field780 = field799;

    @OriginalMember(owner = "client!ed", name = "fb", descriptor = "I")
    public static int field784;

    @OriginalMember(owner = "client!ed", name = "jb", descriptor = "I")
    public static int field788;

    @OriginalMember(owner = "client!ed", name = "nb", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!ed", name = "pb", descriptor = "I")
    public static int field794;

    @OriginalMember(owner = "client!ed", name = "qb", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!ed", name = "sb", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IB)[I")
    public final int[] method16(int arg0, byte arg1) {
        int[] var3 = super.field1192.method19((byte) 126, arg0);
        if (super.field1192.field75) {
            int var4 = class189.field3699[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; class147.field2715 > var6; ++var6) {
                int var7 = class185.field3607[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (~this.field786 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) (var9 / 4096)));
                    var11 = (int) ((double) (this.field783 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field783;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field790 != -1) {
                    if (this.field790 == 2) {
                        var12 -= 2048;
                        if (~var12 > -1) {
                            var12 = -var12;
                        }
                        var12 = -var12 + 2048 << 1;
                    }
                } else {
                    var12 = class148.field2719[255 & var12 >> 4] + 4096 >> 1;
                }
                var3[var6] = var12;
            }
        }
        ++field797;
        if (arg1 != 19) {
            field791 = 102;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLoa;I)V")
    public final void method14(byte arg0, class127 arg1, int arg2) {
        int var4 = -66 / ((-60 - arg0) / 36);
        ++field794;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 3) {
                    this.field783 = arg1.method819((byte) 22);
                }
            } else {
                this.field790 = arg1.method819((byte) 22);
            }
        } else {
            this.field786 = arg1.method819((byte) 22);
        }
    }

    @OriginalMember(owner = "client!ed", name = "<init>", descriptor = "()V")
    public class42() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "(I)V")
    public static void method271(int arg0) {
        field793 = null;
        field798 = null;
        field781 = null;
        field787 = null;
        if (arg0 < -47) {
            field782 = null;
            field789 = null;
            field780 = null;
            field799 = null;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(II)V")
    public static final void method272(int arg0, int arg1) {
        ++field784;
        if (class44.method280(arg1, true)) {
            if (arg0 < -80) {
                class178.method1186(class142.field2647[arg1], -8043, -1);
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILv;)V")
    public static final void method273(int arg0, class189 arg1) {
        arg1.field3683 = arg1.field3716;
        ++field795;
        if (arg1.field3702 == 0) {
            arg1.field3670 = 0;
        } else {
            if (arg1.field3697 != -1 && ~arg1.field3668 == -1) {
                class174 var2 = class159.method1021((byte) 94, arg1.field3697);
                if (arg1.field3725 > 0 && var2.field3359 == 0) {
                    ++arg1.field3670;
                    return;
                }
                if (arg1.field3725 <= 0 && ~var2.field3365 == -1) {
                    ++arg1.field3670;
                    return;
                }
            }
            int var3 = arg1.field3698;
            int var4 = arg1.field3679;
            int var5 = arg1.field3729[arg1.field3702 + -1] * 128 + arg1.field3711 * 64;
            int var6 = arg1.field3734[arg1.field3702 - 1] * 128 + arg1.field3711 * 64;
            if (~(var6 - var3) >= -257 && -var3 + var6 >= -256 && -var4 + var5 <= 256 && -var4 + var5 >= -256) {
                if (~var6 >= ~var3) {
                    if (~var6 > ~var3) {
                        if (~var5 >= ~var4) {
                            if (var4 > var5) {
                                arg1.field3681 = 256;
                            } else {
                                arg1.field3681 = 512;
                            }
                        } else {
                            arg1.field3681 = 768;
                        }
                    } else if (~var4 <= ~var5) {
                        if (var5 < var4) {
                            arg1.field3681 = 0;
                        }
                    } else {
                        arg1.field3681 = 1024;
                    }
                } else if (~var4 > ~var5) {
                    arg1.field3681 = 1280;
                } else if (~var4 < ~var5) {
                    arg1.field3681 = 1792;
                } else {
                    arg1.field3681 = 1536;
                }
                int var7 = arg1.field3682;
                int var8 = -arg1.field3719 + arg1.field3681 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                if (~var8 <= 255 && ~var8 >= -257) {
                    var7 = arg1.field3673;
                } else if (~var8 <= -257 && ~var8 > -769) {
                    var7 = arg1.field3732;
                } else if (~var8 <= 767 && var8 <= -256) {
                    var7 = arg1.field3708;
                }
                int var9 = 4;
                if (var7 == -1) {
                    var7 = arg1.field3673;
                }
                arg1.field3683 = var7;
                boolean var10 = true;
                if (arg1 instanceof class197) {
                    var10 = ((class197) arg1).field3872.field3393;
                }
                if (!var10) {
                    if (arg1.field3702 > 1) {
                        var9 = 6;
                    }
                    if (arg1.field3702 > 2) {
                        var9 = 8;
                    }
                    if (~arg1.field3670 < -1 && arg1.field3702 > 1) {
                        var9 = 8;
                        --arg1.field3670;
                    }
                } else {
                    if (arg1.field3719 != arg1.field3681 && ~arg1.field3701 == 0 && arg1.field3695 != 0) {
                        var9 = 2;
                    }
                    if (arg1.field3702 > 2) {
                        var9 = 6;
                    }
                    if (arg1.field3702 > 3) {
                        var9 = 8;
                    }
                    if (arg1.field3670 > 0 && ~arg1.field3702 < -2) {
                        --arg1.field3670;
                        var9 = 8;
                    }
                }
                if (arg1.field3709[arg1.field3702 + -1]) {
                    var9 <<= 1;
                }
                if (var3 >= var6) {
                    if (var3 > var6) {
                        arg1.field3698 -= var9;
                        if (arg1.field3698 < var6) {
                            arg1.field3698 = var6;
                        }
                    }
                } else {
                    arg1.field3698 += var9;
                    if (~arg1.field3698 < ~var6) {
                        arg1.field3698 = var6;
                    }
                }
                if (var4 < var5) {
                    arg1.field3679 += var9;
                    if (var5 < arg1.field3679) {
                        arg1.field3679 = var5;
                    }
                } else if (var5 < var4) {
                    arg1.field3679 -= var9;
                    if (~arg1.field3679 > ~var5) {
                        arg1.field3679 = var5;
                    }
                }
                if (~arg1.field3698 == ~var6 && arg1.field3679 == var5) {
                    --arg1.field3702;
                    if (arg1.field3725 > 0) {
                        --arg1.field3725;
                    }
                }
                int var11 = -34 / ((-40 - arg0) / 55);
                if (var9 >= 8 && arg1.field3683 == arg1.field3673 && ~arg1.field3689 != 0) {
                    arg1.field3683 = arg1.field3689;
                }
            } else {
                arg1.field3698 = var6;
                arg1.field3679 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(BI)Z")
    public static final boolean method274(byte arg0, int arg1) {
        ++field792;
        if (arg0 >= -110) {
            method272(97, 125);
        }
        return (333488271 & arg1) >> 28 != 0;
    }

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)V")
    public final void method17(boolean arg0) {
        ++field788;
        if (arg0) {
            method273(-68, (class189) null);
        }
        class145.method956((byte) -10);
    }
}
