import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class724 extends class13 {

    @OriginalMember(owner = "client!rl", name = "pd", descriptor = "I")
    public int field10067 = 255;

    @OriginalMember(owner = "client!rl", name = "Cd", descriptor = "I")
    public int field10080 = 0;

    @OriginalMember(owner = "client!rl", name = "zd", descriptor = "I")
    public int field10077 = -1;

    @OriginalMember(owner = "client!rl", name = "yd", descriptor = "I")
    public int field10076 = 0;

    @OriginalMember(owner = "client!rl", name = "Gd", descriptor = "Z")
    public boolean field10084 = false;

    @OriginalMember(owner = "client!rl", name = "Qd", descriptor = "I")
    public int field10094 = 0;

    @OriginalMember(owner = "client!rl", name = "sd", descriptor = "I")
    public int field10070 = 0;

    @OriginalMember(owner = "client!rl", name = "Md", descriptor = "B")
    private byte field10090 = 0;

    @OriginalMember(owner = "client!rl", name = "od", descriptor = "B")
    private byte field10066 = 0;

    @OriginalMember(owner = "client!rl", name = "wd", descriptor = "Z")
    public boolean field10074 = false;

    @OriginalMember(owner = "client!rl", name = "rd", descriptor = "I")
    public int field10069 = -1;

    @OriginalMember(owner = "client!rl", name = "Kd", descriptor = "I")
    public int field10088 = -1;

    @OriginalMember(owner = "client!rl", name = "ld", descriptor = "B")
    private byte field10063 = 0;

    @OriginalMember(owner = "client!rl", name = "Rd", descriptor = "I")
    public int field10095 = -1;

    @OriginalMember(owner = "client!rl", name = "Sd", descriptor = "I")
    public int field10096 = 0;

    @OriginalMember(owner = "client!rl", name = "gd", descriptor = "Z")
    public boolean field10058 = false;

    @OriginalMember(owner = "client!rl", name = "Yd", descriptor = "Z")
    public boolean field10102 = false;

    @OriginalMember(owner = "client!rl", name = "Pd", descriptor = "I")
    public int field10093 = -1;

    @OriginalMember(owner = "client!rl", name = "Xd", descriptor = "I")
    public int field10101 = -1;

    @OriginalMember(owner = "client!rl", name = "be", descriptor = "I")
    public int field10105 = -1;

    @OriginalMember(owner = "client!rl", name = "Jd", descriptor = "Z")
    public boolean field10087 = false;

    @OriginalMember(owner = "client!rl", name = "ce", descriptor = "I")
    public int field10106 = -1;

    @OriginalMember(owner = "client!rl", name = "hd", descriptor = "I")
    public static int field10059;

    @OriginalMember(owner = "client!rl", name = "id", descriptor = "I")
    public static int field10060;

    @OriginalMember(owner = "client!rl", name = "jd", descriptor = "I")
    public static int field10061;

    @OriginalMember(owner = "client!rl", name = "nd", descriptor = "I")
    public static int field10065;

    @OriginalMember(owner = "client!rl", name = "qd", descriptor = "I")
    public static int field10068;

    @OriginalMember(owner = "client!rl", name = "td", descriptor = "I")
    public static int field10071;

    @OriginalMember(owner = "client!rl", name = "ud", descriptor = "I")
    public static int field10072;

    @OriginalMember(owner = "client!rl", name = "vd", descriptor = "I")
    public static int field10073;

    @OriginalMember(owner = "client!rl", name = "xd", descriptor = "I")
    public static int field10075;

    @OriginalMember(owner = "client!rl", name = "Ad", descriptor = "I")
    public int field10078;

    @OriginalMember(owner = "client!rl", name = "Bd", descriptor = "I")
    public static int field10079;

    @OriginalMember(owner = "client!rl", name = "Ed", descriptor = "I")
    public static int field10082;

    @OriginalMember(owner = "client!rl", name = "Fd", descriptor = "I")
    public int field10083;

    @OriginalMember(owner = "client!rl", name = "Hd", descriptor = "I")
    public static int field10085;

    @OriginalMember(owner = "client!rl", name = "Id", descriptor = "I")
    public static int field10086;

    @OriginalMember(owner = "client!rl", name = "Ld", descriptor = "I")
    private int field10089;

    @OriginalMember(owner = "client!rl", name = "Nd", descriptor = "I")
    public static int field10091;

    @OriginalMember(owner = "client!rl", name = "Od", descriptor = "I")
    public static int field10092;

    @OriginalMember(owner = "client!rl", name = "Td", descriptor = "I")
    public static int field10097;

    @OriginalMember(owner = "client!rl", name = "Ud", descriptor = "I")
    public static int field10098;

    @OriginalMember(owner = "client!rl", name = "Vd", descriptor = "I")
    public static int field10099;

    @OriginalMember(owner = "client!rl", name = "Wd", descriptor = "I")
    public static int field10100;

    @OriginalMember(owner = "client!rl", name = "Zd", descriptor = "I")
    public static int field10103;

    @OriginalMember(owner = "client!rl", name = "ae", descriptor = "I")
    public static int field10104;

    @OriginalMember(owner = "client!rl", name = "Dd", descriptor = "Lqe;")
    public class470 field10081;

    @OriginalMember(owner = "client!rl", name = "de", descriptor = "Liea;")
    public static class481 field10107;

    @OriginalMember(owner = "client!rl", name = "kd", descriptor = "Ljava/lang/String;")
    public String field10062;

    @OriginalMember(owner = "client!rl", name = "md", descriptor = "Ljava/lang/String;")
    public String field10064;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BLha;I)Z")
    private final boolean method4036(byte arg0, class60 arg1, int arg2) {
        ++field10075;
        int var4 = arg2;
        class738 var5 = this.method94((byte) -113);
        class56 var6 = super.field153 != -1 && super.field171 == 0 ? class66.field941.method1299((byte) -110, super.field153) : null;
        class56 var7 = super.field215 == -1 || this.field10084 || super.field239 && var6 != null ? null : class66.field941.method1299((byte) -97, super.field215);
        int var8 = var5.field10270;
        int var9 = var5.field10272;
        if (var8 != 0 || ~var9 != -1 || var5.field10274 != 0 || ~var5.field10269 != -1) {
            arg2 |= 7;
        }
        int var10 = -28 / ((-1 - arg0) / 56);
        int var11 = super.field256.method1044((byte) 19);
        boolean var12 = super.field219 != 0 && class463.field6224 >= super.field217 && ~class463.field6224 > ~super.field222;
        if (var12) {
            arg2 |= 524288;
        }
        class474 var13 = super.field267[0] = this.field10081.method2677(class679.field9486, arg2, super.field216, super.field243, var6, super.field198, super.field248, class300.field3941, super.field168, class729.field10151, var7, 12, super.field251, class66.field941, super.field207, var11, class21.field381, class516.field7236, arg1, super.field202, true);
        int var14 = class162.method1134((byte) 96);
        if (client.field3992 < 96 && var14 > 50) {
            class84.method696(-122);
        }
        if (class7.field75 != class225.field2991 && ~var14 > -51) {
            int var15 = 50 - var14;
            while (~var15 < ~class473.field6352) {
                class130.field1842[class473.field6352] = new byte[102400];
                ++class473.field6352;
            }
            while (class473.field6352 > var15) {
                --class473.field6352;
                class130.field1842[class473.field6352] = null;
            }
        } else if (class7.field75 != class225.field2991) {
            class473.field6352 = 0;
            class130.field1842 = new byte[50][];
        }
        if (var13 == null) {
            return false;
        } else {
            super.field245 = var13.method286();
            super.field218 = var13.method248();
            this.method89(var13, -74);
            if (~var8 == -1 && var9 == 0) {
                this.method91(0, var11, -309283474, this.method82((byte) 49) << 9, 0, this.method82((byte) 49) << 9);
            } else {
                this.method91(var5.field10263, var11, -309283474, var8, var5.field10260, var9);
                if (~super.field205 != -1) {
                    var13.method257(super.field205);
                }
                if (super.field244 != 0) {
                    var13.method276(super.field244);
                }
                if (~super.field200 != -1) {
                    var13.method281(0, super.field200, 0);
                }
            }
            if (var12) {
                var13.method260(super.field156, super.field161, super.field151, 255 & super.field219);
            }
            if (!this.field10084 && super.field160 != -1 && ~super.field220 != 0) {
                class164 var16 = class234.field3057.method2095(super.field160, (byte) 98);
                boolean var17 = var16.field2269 == 3 && (~var8 != -1 || ~var9 != -1);
                int var18 = var4;
                if (var17) {
                    var18 = var4 | 7;
                } else {
                    if (~super.field158 != -1) {
                        var18 = var4 | 5;
                    }
                    if (super.field163 != 0) {
                        var18 |= 2;
                    }
                    if (~super.field175 <= -1) {
                        var18 |= 7;
                    }
                }
                class474 var19 = super.field267[1] = var16.method1145(super.field220, -8013, var18, super.field255, arg1, class66.field941, super.field178);
                if (var19 != null) {
                    if (~super.field175 <= -1 && var5.field10290 != null && var5.field10290[super.field175] != null) {
                        int var20 = 0;
                        int var21 = 0;
                        int var22 = 0;
                        if (var5.field10290 != null && var5.field10290[super.field175] != null) {
                            var22 += var5.field10290[super.field175][2];
                            var21 += var5.field10290[super.field175][1];
                            var20 += var5.field10290[super.field175][0];
                        }
                        if (var5.field10240 != null && var5.field10240[super.field175] != null) {
                            var20 += var5.field10240[super.field175][0];
                            var21 += var5.field10240[super.field175][1];
                            var22 += var5.field10240[super.field175][2];
                        }
                        if (var22 != 0 || ~var20 != -1) {
                            int var23 = var11;
                            if (super.field207 != null && super.field207[super.field175] != -1) {
                                var23 = super.field207[super.field175];
                            }
                            int var24 = super.field158 * 2048 + var23 + -var11 & 16383;
                            if (~var24 != -1) {
                                var19.method270(var24);
                            }
                            int var25 = class16.field320[var24];
                            int var26 = class16.field322[var24];
                            int var27 = var22 * var25 - -(var20 * var26) >> 14;
                            var22 = var22 * var26 + -(var20 * var25) >> 14;
                            var20 = var27;
                        }
                        var19.method281(var20, var21, var22);
                    } else if (super.field158 != 0) {
                        var19.method270(super.field158 * 2048);
                    }
                    if (super.field163 != 0) {
                        var19.method281(0, -super.field163 << 2, 0);
                    }
                    if (var17) {
                        if (~super.field205 != -1) {
                            var19.method257(super.field205);
                        }
                        if (~super.field244 != -1) {
                            var19.method276(super.field244);
                        }
                        if (~super.field200 != -1) {
                            var19.method281(0, super.field200, 0);
                        }
                    }
                }
            } else {
                super.field267[1] = null;
            }
            if (!this.field10084 && super.field199 != -1 && ~super.field167 != 0) {
                class164 var28 = class234.field3057.method2095(super.field199, (byte) -126);
                boolean var29 = ~var28.field2269 == -4 && (~var8 != -1 || ~var9 != -1);
                int var30 = var4;
                if (var29) {
                    var30 = var4 | 7;
                } else {
                    if (super.field173 != 0) {
                        var30 = var4 | 5;
                    }
                    if (~super.field212 != -1) {
                        var30 |= 2;
                    }
                    if (~super.field184 <= -1) {
                        var30 |= 7;
                    }
                }
                class474 var31 = super.field267[2] = var28.method1144((byte) 5, super.field193, super.field167, class66.field941, super.field252, var30, arg1);
                if (var31 != null) {
                    if (~super.field184 <= -1 && var5.field10290 != null && var5.field10290[super.field184] != null) {
                        int var32 = 0;
                        int var33 = 0;
                        int var34 = 0;
                        if (var5.field10290 != null && var5.field10290[super.field184] != null) {
                            var34 += var5.field10290[super.field184][2];
                            var32 += var5.field10290[super.field184][0];
                            var33 += var5.field10290[super.field184][1];
                        }
                        if (var5.field10240 != null && var5.field10240[super.field184] != null) {
                            var32 += var5.field10240[super.field184][0];
                            var33 += var5.field10240[super.field184][1];
                            var34 += var5.field10240[super.field184][2];
                        }
                        if (~var34 != -1 || var32 != 0) {
                            int var35 = var11;
                            if (super.field207 != null && ~super.field207[super.field184] != 0) {
                                var35 = super.field207[super.field184];
                            }
                            int var36 = 16383 & super.field173 * 2048 - -var35 + -var11;
                            if (var36 != 0) {
                                var31.method270(var36);
                            }
                            int var37 = class16.field320[var36];
                            int var38 = class16.field322[var36];
                            int var39 = var32 * var38 + var34 * var37 >> 14;
                            var34 = var34 * var38 + -(var32 * var37) >> 14;
                            var32 = var39;
                        }
                        var31.method281(var32, var33, var34);
                    } else if (~super.field173 != -1) {
                        var31.method270(super.field173 * 2048);
                    }
                    if (super.field212 != 0) {
                        var31.method281(0, -super.field212 << 2, 0);
                    }
                    if (var29) {
                        if (~super.field205 != -1) {
                            var31.method257(super.field205);
                        }
                        if (~super.field244 != -1) {
                            var31.method276(super.field244);
                        }
                        if (super.field200 != 0) {
                            var31.method281(0, super.field200, 0);
                        }
                    }
                }
            } else {
                super.field267[2] = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BIII)V")
    public final void method4037(byte arg0, int arg1, int arg2, int arg3) {
        ++field10085;
        if (super.field263 < 9) {
            ++super.field263;
        }
        for (int var5 = super.field263; ~var5 < -1; --var5) {
            super.field264[var5] = super.field264[var5 + -1];
            super.field260[var5] = super.field260[var5 + -1];
            super.field259[var5] = super.field259[var5 + -1];
        }
        super.field264[0] = arg3;
        if (arg2 != 255) {
            this.field10093 = 15;
        }
        super.field260[0] = arg1;
        super.field259[0] = arg0;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILrba;Lha;ZII)V")
    public final void method754(int arg0, int arg1, class435 arg2, class60 arg3, boolean arg4, int arg5, int arg6) {
        ++field10103;
        if (arg0 != 30558) {
            this.field10063 = 87;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
    public final String method4038(boolean arg0, boolean arg1) {
        if (arg0) {
            method4047(106);
        }
        ++field10073;
        String var3 = "";
        if (class589.field8253 != null) {
            var3 = var3 + class589.field8253[this.field10090];
        }
        int[] var4;
        if (~this.field10066 == -2 && class759.field10593 != null) {
            var4 = class759.field10593;
        } else {
            var4 = class273.field3429;
        }
        if (var4 != null && var4[this.field10090] != -1) {
            class111 var5 = class180.field2529.method4027(-52, var4[this.field10090]);
            if (~var5.field1611 != -116) {
                class684.method3842(1, new Throwable(), "gdn1");
                var4[this.field10090] = -1;
            } else {
                var3 = var3 + var5.method878((byte) -125, this.field10063 & 255);
            }
        }
        String var6;
        if (arg1) {
            var6 = var3 + this.field10064;
        } else {
            var6 = var3 + this.field10062;
        }
        if (class522.field7320 != null) {
            var6 = var6 + class522.field7320[this.field10090];
        }
        return var6;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Z)I")
    public final int method96(boolean arg0) {
        ++field10100;
        return !arg0 ? 11 : this.field10089;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lha;Lka;IIIIILpda;)V")
    private final void method4039(class60 arg0, class474 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class631 arg7) {
        ++field10104;
        if (arg4 != 4541) {
            this.field10081 = null;
        }
        int var9 = arg3 * arg3 + arg6 * arg6;
        if (var9 >= 262144 && var9 <= arg2) {
            int var10 = (int) (Math.atan2((double) arg6, (double) arg3) * 2607.5945876176133D) & 16383;
            class474 var11 = class489.method2891(arg0, super.field200, (byte) 127, super.field205, var10, arg5, super.field244);
            if (var11 != null) {
                arg0.method504(false);
                var11.method250(arg7, (class314) null, 0);
                arg0.method504(true);
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(III)V")
    public final void method4040(int arg0, int arg1, int arg2) {
        if (arg1 > -85) {
            this.method4037((byte) 23, -87, 83, -94);
        }
        super.field263 = 0;
        super.field268 = 0;
        super.field264[0] = arg0;
        super.field266 = 0;
        ++field10072;
        super.field260[0] = arg2;
        int var4 = this.method82((byte) 49);
        super.field5801 = super.field264[0] * 512 + var4 * 256;
        super.field5797 = super.field260[0] * 512 + var4 * 256;
        if (class380.field4847 == this) {
            class421.method2347((byte) -47);
        }
        if (super.field261 != null) {
            super.field261.method2976();
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    public final String method4041(int arg0, boolean arg1) {
        if (arg0 != -1) {
            this.field10080 = 1;
        }
        ++field10098;
        return !arg1 ? this.field10062 : this.field10064;
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(B)V")
    public final void method749(byte arg0) {
        ++field10099;
        if (arg0 > -41) {
            this.method4043(79, -41, (class474) null, -95, 114, (class60) null, -21, (class631) null, 67);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "(I)Z")
    public final boolean method759(int arg0) {
        ++field10061;
        return arg0 != 0 ? false : false;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIBB)V")
    public final void method4042(int arg0, int arg1, byte arg2, byte arg3) {
        if (arg2 >= -96) {
            this.method4040(106, 13, -93);
        }
        if (~super.field153 != 0 && class66.field941.method1299((byte) -102, super.field153).field778 == 1) {
            super.field165 = null;
            super.field153 = -1;
        }
        ++field10086;
        if (~super.field160 != 0) {
            class164 var5 = class234.field3057.method2095(super.field160, (byte) -125);
            if (var5.field2267 && var5.field2276 != -1 && class66.field941.method1299((byte) -126, var5.field2276).field778 == 1) {
                super.field160 = -1;
            }
        }
        if (~super.field199 != 0) {
            class164 var6 = class234.field3057.method2095(super.field199, (byte) -125);
            if (var6.field2267 && ~var6.field2276 != 0 && ~class66.field941.method1299((byte) -81, var6.field2276).field778 == -2) {
                super.field199 = -1;
            }
        }
        this.field10101 = -1;
        if (~arg0 <= -1 && arg0 < class409.field5183 && ~arg1 <= -1 && ~arg1 > ~class543.field7597) {
            if (~super.field264[0] <= -1 && super.field264[0] < class409.field5183 && super.field260[0] >= 0 && ~super.field260[0] > ~class543.field7597) {
                if (arg3 == 2) {
                    class275.method1629(arg0, arg1, this, (byte) 2, (byte) 127);
                }
                this.method4037(arg3, arg1, 255, arg0);
            } else {
                this.method4040(arg0, -91, arg1);
            }
        } else {
            this.method4040(arg0, -101, arg1);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lha;I)V")
    public final void method744(class60 arg0, int arg1) {
        ++field10071;
        if (this.field10081 != null) {
            if (super.field262 || this.method4036((byte) 103, arg0, 0)) {
                class631 var3 = arg0.method531();
                var3.method598(super.field256.method1044((byte) 19));
                var3.method600(super.field5801, super.field5800 + -5, super.field5797);
                this.method93(arg0, arg1 ^ arg1, super.field267, super.field262, var3);
                super.field267[0] = super.field267[1] = super.field267[2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(B)I")
    public final int method82(byte arg0) {
        if (arg0 != 49) {
            field10107 = null;
        }
        ++field10059;
        return this.field10081 != null && ~this.field10081.field6310 != 0 ? class300.field3941.method3859(this.field10081.field6310, (byte) 124).field1918 : super.method82((byte) 49);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IILka;IILha;ILpda;I)V")
    private final void method4043(int arg0, int arg1, class474 arg2, int arg3, int arg4, class60 arg5, int arg6, class631 arg7, int arg8) {
        ++field10091;
        int var10 = arg1 * arg1 + arg3 * arg3;
        if (var10 >= 262144 && arg4 >= var10) {
            int var11 = 16383 & (int) (Math.atan2((double) arg3, (double) arg1) * 2607.5945876176133D);
            if (arg6 == 15964) {
                class474 var12 = class489.method2891(arg5, super.field200, (byte) 127, super.field205, var11, arg8, super.field244);
                if (var12 != null) {
                    arg5.method504(false);
                    var12.method255(arg7, (class314) null, arg0, 0);
                    arg5.method504(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "(B)Z")
    public final boolean method4044(byte arg0) {
        ++field10097;
        if (this.field10081 == null) {
            return false;
        } else {
            return arg0 == 114;
        }
    }

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "(I)V")
    public static final void method4045(int arg0) {
        ++field10092;
        int var1 = 51 / ((-17 - arg0) / 48);
        if (class573.field8046 < 102) {
            class573.field8046 += 6;
        }
        if (~class354.field4550 != 0 && class446.method2525(500) > class532.field7384) {
            for (int var2 = class354.field4550; var2 < class216.field2925.length; ++var2) {
                if (class216.field2925[var2].startsWith("pause")) {
                    int var3 = 5;
                    try {
                        var3 = Integer.parseInt(class216.field2925[var2].substring(6));
                    } catch (Exception var14) {
                    }
                    class320.method1883((byte) -60, "Pausing for " + var3 + " seconds...");
                    class354.field4550 = var2 + 1;
                    class532.field7384 = (long) (var3 * 1000) + class446.method2525(500);
                    return;
                }
                class482.field6539 = class216.field2925[var2];
                class538.method3091(false, 0);
            }
            class354.field4550 = -1;
        }
        if (~class688.field9584 != -1) {
            class71.field997 -= class688.field9584 * 5;
            if (~class71.field997 <= ~class5.field47) {
                class71.field997 = class5.field47 + -1;
            }
            if (~class71.field997 > -1) {
                class71.field997 = 0;
            }
            class688.field9584 = 0;
        }
        for (int var4 = 0; class426.field5715 > var4; ++var4) {
            class704 var5 = class26.field472[var4];
            int var6 = var5.method2108((byte) 115);
            char var7 = var5.method2106(-3733);
            int var8 = var5.method2107((byte) -74);
            if (~var6 == -85) {
                class538.method3091(false, 0);
            }
            if (~var6 == -81) {
                class538.method3091(true, 0);
            } else if (~var6 == -67 && (4 & var8) != 0) {
                if (client.field3991 != null) {
                    String var12 = "";
                    for (int var13 = class404.field5114.length + -1; ~var13 <= -1; --var13) {
                        if (class404.field5114[var13] != null && class404.field5114[var13].length() > 0) {
                            var12 = var12 + class404.field5114[var13] + '\n';
                        }
                    }
                    client.field3991.setContents(new StringSelection(var12), (ClipboardOwner) null);
                }
            } else if (~var6 == -68 && (4 & var8) != 0) {
                if (client.field3991 != null) {
                    Transferable var9 = client.field3991.getContents((Object) null);
                    if (var9 != null) {
                        try {
                            String var10 = (String) var9.getTransferData(DataFlavor.stringFlavor);
                            if (var10 != null) {
                                String[] var11 = class249.method1538('\n', 0, var10);
                                class414.method2325(48000, var11);
                            }
                        } catch (Exception var15) {
                        }
                    }
                }
            } else if (var6 == 85 && ~class298.field3915 < -1) {
                class482.field6539 = class482.field6539.substring(0, class298.field3915 + -1) + class482.field6539.substring(class298.field3915);
                --class298.field3915;
            } else if (var6 == 101 && ~class298.field3915 > ~class482.field6539.length()) {
                class482.field6539 = class482.field6539.substring(0, class298.field3915) + class482.field6539.substring(class298.field3915 - -1);
            } else if (~var6 == -97 && ~class298.field3915 < -1) {
                --class298.field3915;
            } else if (~var6 == -98 && class298.field3915 < class482.field6539.length()) {
                ++class298.field3915;
            } else if (~var6 != -103) {
                if (~var6 == -104) {
                    class298.field3915 = class482.field6539.length();
                } else if (var6 == 104 && ~class665.field9359 > ~class404.field5114.length) {
                    ++class665.field9359;
                    class582.method3314(10749);
                    class298.field3915 = class482.field6539.length();
                } else if (~var6 == -106 && ~class665.field9359 < -1) {
                    --class665.field9359;
                    class582.method3314(10749);
                    class298.field3915 = class482.field6539.length();
                } else if (class530.method3048(var7, true) || var7 == '\\' || var7 == '/' || var7 == '.' || ~var7 == -59 || ~var7 == -45 || ~var7 == -33 || ~var7 == -96 || var7 == '-' || ~var7 == -44 || var7 == '[' || ~var7 == -94) {
                    class482.field6539 = class482.field6539.substring(0, class298.field3915) + class26.field472[var4].method2106(-3733) + class482.field6539.substring(class298.field3915);
                    ++class298.field3915;
                }
            } else {
                class298.field3915 = 0;
            }
        }
        class383.field4860 = 0;
        class426.field5715 = 0;
        class433.method2476(31);
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(Lha;I)Ljk;")
    public final class635 method755(class60 arg0, int arg1) {
        ++field10065;
        if (this.field10081 != null && this.method4036((byte) -71, arg0, 2048)) {
            class631 var3 = arg0.method531();
            int var4 = super.field256.method1044((byte) 19);
            var3.method598(var4);
            class14 var5 = class197.field2689[super.field5796][super.field5801 >> class480.field6531][super.field5797 >> class480.field6531];
            if (var5 != null && var5.field279 != null) {
                int var6 = -var5.field279.field1737 + super.field191;
                super.field191 = (int) ((float) super.field191 - (float) var6 / 10.0F);
            } else {
                super.field191 = (int) ((float) super.field191 - (float) super.field191 / 10.0F);
            }
            var3.method600(super.field5801, super.field5800 - 20 - super.field191, super.field5797);
            class635 var7 = null;
            super.field269 = false;
            if (~class748.field10451.field10406.method3611((byte) 114) == -2) {
                class738 var8 = this.method94((byte) 45);
                if (var8.field10281 && (this.field10081.field6310 == -1 || class300.field3941.method3859(this.field10081.field6310, (byte) -92).field1869)) {
                    class56 var9 = super.field153 != -1 && ~super.field171 == -1 ? class66.field941.method1299((byte) -76, super.field153) : null;
                    class56 var10 = ~super.field215 == 0 || this.field10084 || super.field239 && var9 != null ? null : class66.field941.method1299((byte) -83, super.field215);
                    class474 var11 = class694.method3885(super.field267[0], var4, 0, super.field205, 240, var10 != null ? var10 : var9, var10 == null ? super.field198 : super.field168, super.field244, arg0, false, 1, 160, 0, super.field200);
                    if (var11 != null) {
                        var7 = class510.method2982(true, 0, super.field267.length + 1);
                        super.field269 = true;
                        arg0.method504(false);
                        if (!class232.field3053) {
                            var11.method250(var3, var7.field8760[super.field267.length], 0);
                        } else {
                            var11.method255(var3, var7.field8760[super.field267.length], class286.field3600, 0);
                        }
                        arg0.method504(true);
                    }
                }
            }
            if (class380.field4847 == this) {
                var3.method596(super.field5801, super.field5800, super.field5797);
                for (int var12 = class98.field1369.length + -1; var12 >= 0; --var12) {
                    class323 var13 = class98.field1369[var12];
                    if (var13 != null && var13.field4160 != -1) {
                        if (var13.field4163 == 1) {
                            class592 var14 = (class592) class207.field2745.method1160((long) var13.field4156, 119);
                            if (var14 != null) {
                                class733 var15 = var14.field8280;
                                int var16 = -class380.field4847.field5801 + var15.field5801;
                                int var17 = -class380.field4847.field5797 + var15.field5797;
                                if (!class232.field3053) {
                                    this.method4039(arg0, super.field267[0], 92160000, var17, 4541, var13.field4160, var16, var3);
                                } else {
                                    this.method4043(class286.field3600, var17, super.field267[0], var16, 92160000, arg0, 15964, var3, var13.field4160);
                                }
                            }
                        }
                        if (var13.field4163 == 2) {
                            int var18 = var13.field4159 - class380.field4847.field5801 + 256;
                            int var19 = -class380.field4847.field5797 + var13.field4164 + 256;
                            int var20 = var13.field4166 << 9;
                            int var21 = var20 * var20;
                            if (class232.field3053) {
                                this.method4043(class286.field3600, var19, super.field267[0], var18, var21, arg0, 15964, var3, var13.field4160);
                            } else {
                                this.method4039(arg0, super.field267[0], var21, var19, 4541, var13.field4160, var18, var3);
                            }
                        }
                        if (var13.field4163 == 10 && var13.field4156 >= 0 && var13.field4156 < class5.field49.length) {
                            class724 var22 = class5.field49[var13.field4156];
                            if (var22 != null) {
                                int var23 = var22.field5801 - class380.field4847.field5801;
                                int var24 = var22.field5797 - class380.field4847.field5797;
                                if (!class232.field3053) {
                                    this.method4039(arg0, super.field267[0], 92160000, var24, 4541, var13.field4160, var23, var3);
                                } else {
                                    this.method4043(class286.field3600, var24, super.field267[0], var23, 92160000, arg0, 15964, var3, var13.field4160);
                                }
                            }
                        }
                    }
                }
                var3.method598(var4);
                var3.method600(super.field5801, super.field5800, super.field5797);
            }
            var3.method598(var4);
            int var25 = -19 / ((-39 - arg1) / 55);
            var3.method600(super.field5801, super.field5800 + -5 - super.field191, super.field5797);
            if (var7 == null) {
                var7 = class510.method2982(true, 0, super.field267.length);
            }
            this.method93(arg0, 0, super.field267, false, var3);
            if (!class232.field3053) {
                for (int var26 = 0; ~var26 > ~super.field267.length; ++var26) {
                    if (super.field267[var26] != null) {
                        super.field267[var26].method250(var3, var7.field8760[var26], class380.field4847 != this ? 0 : 1);
                    }
                }
            } else {
                for (int var27 = 0; ~var27 > ~super.field267.length; ++var27) {
                    if (super.field267[var27] != null) {
                        super.field267[var27].method255(var3, var7.field8760[var27], class286.field3600, class380.field4847 != this ? 0 : 1);
                    }
                }
            }
            if (super.field261 != null) {
                class741 var28 = super.field261.method2969();
                if (class232.field3053) {
                    arg0.method545(var28, class286.field3600);
                } else {
                    arg0.method455(var28);
                }
            }
            for (int var29 = 0; super.field267.length > var29; ++var29) {
                if (super.field267[var29] != null) {
                    super.field269 |= super.field267[var29].method287();
                }
            }
            super.field267[0] = super.field267[1] = super.field267[2] = null;
            super.field230 = class762.field10618;
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)I")
    public final int method79(int arg0) {
        if (arg0 != -1) {
            return 100;
        } else {
            ++field10068;
            return -1;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lsl;Z)V")
    public final void method4046(class461 arg0, boolean arg1) {
        arg0.field6193 = 0;
        ++field10060;
        int var3 = arg0.method2600((byte) -127);
        this.field10066 = (byte) (1 & var3);
        boolean var4 = this.field10087;
        this.field10087 = ~(var3 & 2) != -1;
        boolean var5 = (4 & var3) != 0;
        int var6 = super.method82((byte) 49);
        this.method92(((62 & var3) >> 3) - -1, -80);
        this.field10090 = (byte) (var3 >> 6 & 3);
        super.field5801 += -var6 + this.method82((byte) 49) << 8;
        super.field5797 += -var6 + this.method82((byte) 49) << 8;
        this.field10063 = arg0.method2601(0);
        this.field10106 = arg0.method2601(0);
        this.field10105 = arg0.method2601(0);
        this.field10102 = arg0.method2601(0) == 1;
        if (class7.field75 == class225.field2991 && ~class683.field9525 <= -3) {
            this.field10102 = false;
        }
        this.field10094 = 0;
        int var7 = -1;
        int[] var8 = new int[12];
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg0.method2600((byte) -126);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method2600((byte) -127);
                int var12 = (var10 << 8) + var11;
                if (~var9 == -1 && ~var12 == -65536) {
                    var7 = arg0.method2566(-2);
                    this.field10094 = arg0.method2600((byte) -127);
                    break;
                }
                if (~var12 <= -32769) {
                    int var26 = class453.field5996[var12 - 32768];
                    var8[var9] = class683.method3840(var26, 1073741824);
                    int var27 = class21.field381.method1583(-57, var26).field8870;
                    if (~var27 != -1) {
                        this.field10094 = var27;
                    }
                } else {
                    var8[var9] = class683.method3840(Integer.MIN_VALUE, var12 + -256);
                }
            }
        }
        int[] var13 = new int[5];
        int var14 = 0;
        if (!arg1) {
            while (var14 < 5) {
                int var25 = arg0.method2600((byte) -124);
                if (class453.field5994.length < 1 || var25 < 0 || ~var25 <= ~class453.field5994[0][var14].length) {
                    var25 = 0;
                }
                var13[var14] = var25;
                ++var14;
            }
            this.field10089 = arg0.method2566(-2);
            this.field10064 = arg0.method2574(-1);
            if (class380.field4847 == this) {
                class126.field1806 = this.field10064;
            }
            this.field10062 = this.field10064;
            this.field10070 = arg0.method2600((byte) -123);
            if (!var5) {
                this.field10076 = 0;
                this.field10096 = arg0.method2600((byte) -126);
                this.field10077 = arg0.method2600((byte) -124);
                if (this.field10077 == 255) {
                    this.field10077 = -1;
                }
            } else {
                this.field10076 = arg0.method2566(-2);
                this.field10096 = this.field10070;
                if (this.field10076 == 65535) {
                    this.field10076 = -1;
                }
                this.field10077 = -1;
            }
            int var15 = this.field10080;
            this.field10080 = arg0.method2600((byte) -128);
            if (this.field10080 == 0) {
                class332.method1920(108, this);
            } else {
                int var16 = this.field10095;
                int var17 = this.field10093;
                int var18 = this.field10088;
                int var19 = this.field10069;
                int var20 = this.field10067;
                this.field10095 = arg0.method2566(-2);
                this.field10093 = arg0.method2566(-2);
                this.field10088 = arg0.method2566(-2);
                this.field10069 = arg0.method2566(-2);
                this.field10067 = arg0.method2600((byte) -124);
                if (!this.field10087 != !var4 || ~this.field10080 != ~var15 || this.field10095 != var16 || ~this.field10093 != ~var17 || ~this.field10088 != ~var18 || this.field10069 != var19 || this.field10067 != var20) {
                    class119.method923(-120, this);
                }
            }
            if (this.field10081 == null) {
                this.field10081 = new class470();
            }
            int var21 = this.field10081.field6310;
            int[] var22 = this.field10081.field6297;
            this.field10081.method2671(~this.field10066 == -2, var13, var8, this.method96(!arg1), 0, var7);
            if (~var7 != ~var21) {
                super.field5801 = (super.field264[0] << 9) - -(this.method82((byte) 49) << 8);
                super.field5797 = (super.field260[0] << 9) + (this.method82((byte) 49) << 8);
            }
            if (class54.field755 == super.field189 && var22 != null) {
                for (int var23 = 0; var23 < var13.length; ++var23) {
                    if (~var13[var23] != ~var22[var23]) {
                        class21.field381.method1582((byte) -123);
                        break;
                    }
                }
            }
            if (super.field261 != null) {
                super.field261.method2976();
            }
            if (~super.field215 != 0 && super.field239) {
                class738 var24 = this.method94((byte) -114);
                if (!var24.method4111(super.field215, (byte) 96)) {
                    super.field239 = false;
                    super.field215 = -1;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "(I)V")
    public static void method4047(int arg0) {
        field10107 = null;
        if (arg0 != -67) {
            field10107 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(ILha;)Lwg;")
    public final class428 method750(int arg0, class60 arg1) {
        ++field10082;
        return arg0 >= -22 ? null : null;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BILha;I)Z")
    public final boolean method752(byte arg0, int arg1, class60 arg2, int arg3) {
        ++field10079;
        if (this.field10081 != null && this.method4036((byte) -107, arg2, 131072)) {
            class631 var5 = arg2.method531();
            int var6 = super.field256.method1044((byte) 19);
            var5.method598(var6);
            var5.method600(super.field5801, super.field5800, super.field5797);
            boolean var7 = false;
            for (int var8 = 0; ~super.field267.length < ~var8; ++var8) {
                if (super.field267[var8] != null && (class232.field3053 ? super.field267[var8].method275(arg1, arg3, var5, true, 0, class286.field3600) : super.field267[var8].method258(arg1, arg3, var5, true, 0))) {
                    var7 = true;
                    break;
                }
            }
            super.field267[0] = super.field267[1] = super.field267[2] = null;
            if (arg0 > -41) {
                this.method82((byte) -31);
            }
            return var7;
        } else {
            return false;
        }
    }
}
