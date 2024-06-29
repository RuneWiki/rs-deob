import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public abstract class class293 extends class538 {

    @OriginalMember(owner = "client!wo", name = "G", descriptor = "S")
    public short field4305;

    @OriginalMember(owner = "client!wo", name = "B", descriptor = "S")
    public short field4300;

    @OriginalMember(owner = "client!wo", name = "D", descriptor = "B")
    public byte field4302;

    @OriginalMember(owner = "client!wo", name = "A", descriptor = "S")
    public short field4299;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "Z")
    public boolean field4295;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "S")
    public short field4294;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!wo", name = "z", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!wo", name = "C", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!wo", name = "E", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!wo", name = "F", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(B)V", line = 4)
    public void method1803(byte arg0) {
        ++field4301;
        if (arg0 != -76) {
            this.field4302 = -90;
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IB)V", line = 17)
    public static final void method1804(int arg0, byte arg1) {
        ++field4296;
        if (class122.field1817 != arg0) {
            class72.field1144 = class668.field9444 = class426.field6224[arg0];
            class42.method240((byte) 30);
            class81.field1310 = new int[4][class72.field1144 >> 3][class668.field9444 >> 3];
            class668.field9446 = new int[class72.field1144][class668.field9444];
            if (arg1 == 70) {
                class607.field8780 = new int[class72.field1144][class668.field9444];
                for (int var2 = 0; var2 < 4; ++var2) {
                    class629.field9104[var2] = class14.method95((byte) 114, class72.field1144, class668.field9444);
                }
                class603.field8703 = new byte[4][class72.field1144][class668.field9444];
                class600.method3416(class668.field9444, 4, 5951, class72.field1144);
                class505.method2874(false, class72.field1144 >> 3, class668.field9444 >> 3, class332.field4821);
                class122.field1817 = arg0;
            }
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(IILvea;IIILtca;IBIII)V", line = 49)
    public static final void method1805(int arg0, int arg1, class305 arg2, int arg3, int arg4, int arg5, class545 arg6, int arg7, byte arg8, int arg9, int arg10, int arg11) {
        class300.field4446 = arg10;
        class175.field2454 = arg7;
        class607.field8765 = null;
        class635.field9153 = null;
        class451.field6510 = arg11;
        class474.field6808 = arg4;
        class591.field8591 = arg5;
        class82.field1319 = arg9;
        class361.field5298 = arg6;
        ++field4293;
        class43.field646 = arg3;
        class501.field7082 = arg1;
        class544.field8038 = arg2;
        class528.field7665 = null;
        int var12 = 102 % ((48 - arg8) / 41);
        class553.field8132 = arg0;
        class677.method3809(-127);
        class115.field1728 = true;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(Z)Ljava/lang/String;", line = 74)
    public static final String method1806(boolean arg0) {
        ++field4298;
        String var1 = "www";
        if (class564.field8247 == class215.field2882) {
            var1 = "www-wtrc";
        } else if (class353.field5240 == class215.field2882) {
            var1 = "www-wtqa";
        } else if (class448.field6497 == class215.field2882) {
            var1 = "www-wtwip";
        }
        String var2 = "";
        if (!arg0) {
            method1804(34, (byte) 72);
        }
        if (class433.field6283 != null) {
            var2 = "/p=" + class433.field6283;
        }
        return "http://" + var1 + "." + class478.field6840.field5511 + ".com/l=" + class262.field3401 + "/a=" + class122.field1815 + var2 + "/";
    }

    @OriginalMember(owner = "client!wo", name = "c", descriptor = "(Z)Z", line = 105)
    public final boolean method1807(boolean arg0) {
        ++field4304;
        return arg0 ? false : class631.method3627(super.field7900, this.field4305, this.field4299, this.method271(arg0), this.field4294, 0, this.field4300);
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I[Ltg;)I", line = 119)
    public final int method1808(int arg0, class334[] arg1) {
        ++field4303;
        int var3 = 0;
        label118: for (int var4 = this.field4299; this.field4294 >= var4; ++var4) {
            label116: for (int var5 = this.field4300; this.field4305 >= var5; ++var5) {
                long var6 = class267.field3487[super.field7905][var4][var5];
                long var8 = 0L;
                while (true) {
                    label111: while (true) {
                        if (var8 > 48L) {
                            continue label116;
                        }
                        int var10 = (int) (var6 >>> (int) var8 & 65535L);
                        if (var10 <= 0) {
                            continue label116;
                        }
                        class471 var11 = class324.field4707[var10 - 1];
                        for (int var12 = 0; var12 < var3; ++var12) {
                            if (arg1[var12] == var11.field6773) {
                                var8 += 16L;
                                continue label111;
                            }
                        }
                        arg1[var3++] = var11.field6773;
                        if (~var3 == -5) {
                            break label118;
                        }
                        var8 += 16L;
                    }
                }
            }
        }
        for (int var13 = var3; ~var13 > -5; ++var13) {
            arg1[var13] = null;
        }
        if (arg0 != 16) {
            return 62;
        } else {
            if (this.field4302 != 0) {
                int var14 = -class361.field5293 + this.field4299;
                int var15 = -class545.field8045 + this.field4300;
                short var16;
                short var17;
                int var18;
                int var19;
                if (~this.field4302 == -2) {
                    if (var14 < var15) {
                        var16 = this.field4300;
                        var17 = this.field4299;
                        var18 = this.field4300 - 1;
                        var19 = this.field4299 + 1;
                    } else {
                        var17 = this.field4299;
                        var16 = this.field4300;
                        var19 = this.field4299 + -1;
                        var18 = this.field4300 + 1;
                    }
                } else if (var15 <= -var14) {
                    var19 = this.field4299 + 1;
                    var18 = this.field4300 + 1;
                    var16 = this.field4300;
                    var17 = this.field4299;
                } else {
                    var17 = this.field4299;
                    var18 = this.field4300 + -1;
                    var16 = this.field4300;
                    var19 = this.field4299 - 1;
                }
                label81: for (int var20 = 0; var3 > var20; ++var20) {
                    long var21 = class267.field3487[super.field7905][var17][var18];
                    while (var21 != 0L) {
                        class471 var27 = class324.field4707[(int) ((65535L & var21) + -1L)];
                        var21 >>>= 16;
                        if (arg1[var20] == var27.field6773) {
                            continue label81;
                        }
                    }
                    long var23 = class267.field3487[super.field7905][var19][var16];
                    while (var23 != 0L) {
                        class471 var26 = class324.field4707[(int) ((65535L & var23) - 1L)];
                        var23 >>>= 16;
                        if (arg1[var20] == var26.field6773) {
                            continue label81;
                        }
                    }
                    for (int var25 = var20; var3 + -1 > var25; ++var25) {
                        arg1[var25] = arg1[var25 - -1];
                    }
                    --var3;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wo", name = "d", descriptor = "(I)Z", line = 286)
    public final boolean method1809(int arg0) {
        ++field4297;
        if (arg0 != 0) {
            method1806(true);
        }
        for (int var2 = this.field4299; ~var2 >= ~this.field4294; ++var2) {
            for (int var3 = this.field4300; ~var3 >= ~this.field4305; ++var3) {
                int var4 = -class361.field5293 + var2 + class176.field2466;
                if (~var4 <= -1 && var4 < class406.field6066.length) {
                    int var5 = class176.field2466 + var3 - class545.field8045;
                    if (~var5 <= -1 && ~var5 > ~class406.field6066.length && class406.field6066[var4][var5]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(IIIIIIIIIZB)V", line = 330)
    public class293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, byte arg10) {
        super.field7895 = arg2;
        this.field4305 = (short) arg8;
        this.field4300 = (short) arg7;
        super.field7900 = (byte) arg1;
        this.field4302 = arg10;
        this.field4299 = (short) arg5;
        this.field4295 = arg9;
        super.field7896 = arg4;
        super.field7894 = arg3;
        super.field7905 = (byte) arg0;
        this.field4294 = (short) arg6;
    }
}
