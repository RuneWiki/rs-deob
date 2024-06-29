import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class103 extends class7 {

    @OriginalMember(owner = "client!kd", name = "T", descriptor = "I")
    private int field1990 = 0;

    @OriginalMember(owner = "client!kd", name = "db", descriptor = "I")
    private int field2000 = 4096;

    @OriginalMember(owner = "client!kd", name = "U", descriptor = "I")
    public static int field1991 = 99;

    @OriginalMember(owner = "client!kd", name = "W", descriptor = "[I")
    public static int[] field1993 = new int[200];

    @OriginalMember(owner = "client!kd", name = "Y", descriptor = "Lob;")
    public static class141 field1995 = class175.method1195(40, "Ung-Ultiger Benutzername");

    @OriginalMember(owner = "client!kd", name = "V", descriptor = "Lob;")
    private static class141 field1992 = class175.method1195(40, "Continue");

    @OriginalMember(owner = "client!kd", name = "X", descriptor = "Lob;")
    public static class141 field1994 = class175.method1195(40, "0(U");

    @OriginalMember(owner = "client!kd", name = "gb", descriptor = "Lob;")
    public static class141 field2003 = field1992;

    @OriginalMember(owner = "client!kd", name = "R", descriptor = "I")
    public static int field1988;

    @OriginalMember(owner = "client!kd", name = "S", descriptor = "I")
    public static int field1989;

    @OriginalMember(owner = "client!kd", name = "ab", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!kd", name = "bb", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!kd", name = "cb", descriptor = "I")
    public static int field1999;

    @OriginalMember(owner = "client!kd", name = "eb", descriptor = "I")
    public static int field2001;

    @OriginalMember(owner = "client!kd", name = "fb", descriptor = "I")
    public static int field2002;

    @OriginalMember(owner = "client!kd", name = "Z", descriptor = "[S")
    public static short[] field1996;

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)V")
    public static void method688(byte arg0) {
        field1992 = null;
        field1996 = null;
        field1994 = null;
        field2003 = null;
        field1995 = null;
        if (arg0 != -37) {
            method692(-68);
        }
        field1993 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIIIIIB)V")
    public static final void method689(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (~class68.field1323 >= ~arg5 && class136.field2590 >= arg2 && class35.field698 <= arg3 && arg4 <= class130.field2470) {
            if (~arg0 != -2) {
                class200.method1335(arg1, arg3, arg5, 3963, arg4, arg0, arg2);
            } else {
                class139.method895(arg3, arg2, arg4, 4243, arg1, arg5);
            }
        } else if (~arg0 == -2) {
            class50.method325(arg2, 1, arg1, arg4, arg3, arg5);
        } else {
            class152.method1052(arg5, arg3, arg1, 0, arg0, arg4, arg2);
        }
        ++field1999;
        int var7 = -43 % ((arg6 - 63) / 47);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lud;I)V")
    public static final void method690(class203 arg0, int arg1) {
        ++field2001;
        arg0.field3828 = arg0.field3874;
        if (arg0.field3832 == 0) {
            arg0.field3856 = 0;
        } else {
            if (arg0.field3851 != -1 && arg0.field3861 == 0) {
                class26 var2 = class114.method736(15619, arg0.field3851);
                if (~arg0.field3893 < -1 && ~var2.field495 == -1) {
                    ++arg0.field3856;
                    return;
                }
                if (arg0.field3893 <= 0 && var2.field498 == 0) {
                    ++arg0.field3856;
                    return;
                }
            }
            int var3 = arg0.field3889;
            int var4 = arg0.field3854;
            int var5 = arg0.field3892[arg0.field3832 + -1] * 128 + arg0.field3871 * 64;
            int var6 = arg0.field3870[arg0.field3832 + -1] * 128 + arg0.field3871 * 64;
            if (var6 - var3 <= 256 && ~(-var3 + var6) <= 255 && ~(-var4 + var5) >= -257 && -var4 + var5 >= -256) {
                if (~var6 < ~var3) {
                    if (~var4 > ~var5) {
                        arg0.field3833 = 1280;
                    } else if (var4 > var5) {
                        arg0.field3833 = 1792;
                    } else {
                        arg0.field3833 = 1536;
                    }
                } else if (~var6 <= ~var3) {
                    if (~var5 >= ~var4) {
                        if (~var4 < ~var5) {
                            arg0.field3833 = 0;
                        }
                    } else {
                        arg0.field3833 = 1024;
                    }
                } else if (var5 <= var4) {
                    if (var5 >= var4) {
                        arg0.field3833 = 512;
                    } else {
                        arg0.field3833 = 256;
                    }
                } else {
                    arg0.field3833 = 768;
                }
                int var7 = -arg0.field3845 + arg0.field3833 & 2047;
                if (~var7 < -1025) {
                    var7 -= 2048;
                }
                int var8 = 4;
                int var9 = arg0.field3859;
                if (var7 >= -256 && ~var7 >= -257) {
                    var9 = arg0.field3837;
                } else if (var7 >= 256 && ~var7 > -769) {
                    var9 = arg0.field3848;
                } else if (var7 >= -768 && ~var7 >= 255) {
                    var9 = arg0.field3860;
                }
                boolean var10 = true;
                if (var9 == -1) {
                    var9 = arg0.field3837;
                }
                arg0.field3828 = var9;
                if (arg0 instanceof class131) {
                    var10 = ((class131) arg0).field2507.field186;
                }
                if (var10) {
                    if (arg0.field3845 != arg0.field3833 && arg0.field3877 == -1 && arg0.field3839 != 0) {
                        var8 = 2;
                    }
                    if (arg0.field3832 > 2) {
                        var8 = 6;
                    }
                    if (~arg0.field3832 < -4) {
                        var8 = 8;
                    }
                    if (~arg0.field3856 < -1 && ~arg0.field3832 < -2) {
                        --arg0.field3856;
                        var8 = 8;
                    }
                } else {
                    if (arg0.field3832 > 1) {
                        var8 = 6;
                    }
                    if (~arg0.field3832 < -3) {
                        var8 = 8;
                    }
                    if (arg0.field3856 > 0 && ~arg0.field3832 < -2) {
                        --arg0.field3856;
                        var8 = 8;
                    }
                }
                if (arg0.field3869[arg0.field3832 + -1]) {
                    var8 <<= 1;
                }
                if (~var5 < ~var4) {
                    arg0.field3854 += var8;
                    if (var5 < arg0.field3854) {
                        arg0.field3854 = var5;
                    }
                } else if (~var5 > ~var4) {
                    arg0.field3854 -= var8;
                    if (~arg0.field3854 > ~var5) {
                        arg0.field3854 = var5;
                    }
                }
                if (~var8 <= -9 && arg0.field3837 == arg0.field3828 && ~arg0.field3858 != 0) {
                    arg0.field3828 = arg0.field3858;
                }
                if (arg1 < -3) {
                    if (var3 >= var6) {
                        if (~var6 > ~var3) {
                            arg0.field3889 -= var8;
                            if (arg0.field3889 < var6) {
                                arg0.field3889 = var6;
                            }
                        }
                    } else {
                        arg0.field3889 += var8;
                        if (~var6 > ~arg0.field3889) {
                            arg0.field3889 = var6;
                        }
                    }
                    if (arg0.field3889 == var6 && ~arg0.field3854 == ~var5) {
                        if (~arg0.field3893 < -1) {
                            --arg0.field3893;
                        }
                        --arg0.field3832;
                    }
                }
            } else {
                arg0.field3889 = var6;
                arg0.field3854 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Lt;Ljava/lang/Object;B)V")
    public static final void method691(class189 arg0, Object arg1, byte arg2) {
        ++field2002;
        if (arg0.field3667 != null) {
            if (arg2 != 2) {
                field1993 = null;
            }
            for (int var3 = 0; ~var3 > -51 && arg0.field3667.peekEvent() != null; ++var3) {
                class93.method638(1L, (byte) -8);
            }
            if (arg1 != null) {
                arg0.field3667.postEvent(new ActionEvent(arg1, 1001, "dummy"));
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "()V")
    public class103() {
        super(1, true);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        ++field1988;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field2000 = arg2.method1007(34);
            }
        } else {
            this.field1990 = arg2.method1007(76);
        }
        int var5 = -40 % ((arg1 - 66) / 57);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        ++field1998;
        if (arg0 < 13) {
            method688((byte) 12);
        }
        int[] var3 = super.field100.method842(arg1, 12);
        if (super.field100.field2534) {
            int[] var4 = this.method52(arg1, 0, 25);
            for (int var5 = 0; ~class117.field2272 < ~var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = this.field1990 <= var6 && ~this.field2000 <= ~var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "(I)V")
    public static final void method692(int arg0) {
        ++field1997;
        int var1 = class156.field3014.method34(8, 11339);
        if (~var1 > ~class184.field3587) {
            for (int var2 = var1; ~var2 > ~class184.field3587; ++var2) {
                class204.field3913[class135.field2561++] = class188.field3647[var2];
            }
        }
        if (~class184.field3587 > ~var1) {
            throw new RuntimeException("gppov1");
        } else {
            class184.field3587 = 0;
            for (int var3 = 0; var1 > var3; ++var3) {
                int var4 = class188.field3647[var3];
                class38 var5 = class116.field2231[var4];
                int var6 = class156.field3014.method34(1, 11339);
                if (~var6 == -1) {
                    class188.field3647[class184.field3587++] = var4;
                    var5.field3885 = class20.field344;
                } else {
                    int var7 = class156.field3014.method34(2, 11339);
                    if (var7 == 0) {
                        class188.field3647[class184.field3587++] = var4;
                        var5.field3885 = class20.field344;
                        class125.field2416[class165.field3199++] = var4;
                    } else if (var7 == 1) {
                        class188.field3647[class184.field3587++] = var4;
                        var5.field3885 = class20.field344;
                        int var8 = class156.field3014.method34(3, 11339);
                        var5.method1348(true, var8, false);
                        int var9 = class156.field3014.method34(1, 11339);
                        if (var9 == 1) {
                            class125.field2416[class165.field3199++] = var4;
                        }
                    } else if (~var7 == -3) {
                        class188.field3647[class184.field3587++] = var4;
                        var5.field3885 = class20.field344;
                        int var10 = class156.field3014.method34(3, 11339);
                        var5.method1348(true, var10, true);
                        int var11 = class156.field3014.method34(3, 11339);
                        var5.method1348(true, var11, true);
                        int var12 = class156.field3014.method34(1, 11339);
                        if (~var12 == -2) {
                            class125.field2416[class165.field3199++] = var4;
                        }
                    } else if (~var7 == -4) {
                        class204.field3913[class135.field2561++] = var4;
                    }
                }
            }
            if (arg0 < 90) {
                field1995 = null;
            }
        }
    }
}
