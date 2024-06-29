import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!me")
public class class294 extends class472 {

    @OriginalMember(owner = "client!me", name = "i", descriptor = "Z")
    private boolean field4025 = false;

    @OriginalMember(owner = "client!me", name = "x", descriptor = "I")
    private int field4040 = 0;

    @OriginalMember(owner = "client!me", name = "D", descriptor = "Z")
    public boolean field4046 = false;

    @OriginalMember(owner = "client!me", name = "o", descriptor = "J")
    private long field4031;

    @OriginalMember(owner = "client!me", name = "I", descriptor = "Lm;")
    public class83 field4050;

    @OriginalMember(owner = "client!me", name = "N", descriptor = "Lqm;")
    public class356 field4055;

    @OriginalMember(owner = "client!me", name = "V", descriptor = "Lq;")
    public class152 field4063;

    @OriginalMember(owner = "client!me", name = "J", descriptor = "Ldu;")
    public class479 field4051;

    @OriginalMember(owner = "client!me", name = "Q", descriptor = "Llm;")
    public static class84 field4058;

    @OriginalMember(owner = "client!me", name = "S", descriptor = "Ltm;")
    public static class112 field4060;

    @OriginalMember(owner = "client!me", name = "j", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!me", name = "k", descriptor = "I")
    public static int field4027;

    @OriginalMember(owner = "client!me", name = "l", descriptor = "I")
    private int field4028;

    @OriginalMember(owner = "client!me", name = "m", descriptor = "I")
    private int field4029;

    @OriginalMember(owner = "client!me", name = "n", descriptor = "I")
    public int field4030;

    @OriginalMember(owner = "client!me", name = "p", descriptor = "I")
    public int field4032;

    @OriginalMember(owner = "client!me", name = "q", descriptor = "I")
    public int field4033;

    @OriginalMember(owner = "client!me", name = "r", descriptor = "I")
    public static int field4034;

    @OriginalMember(owner = "client!me", name = "s", descriptor = "I")
    private int field4035;

    @OriginalMember(owner = "client!me", name = "t", descriptor = "I")
    private int field4036;

    @OriginalMember(owner = "client!me", name = "u", descriptor = "I")
    public static int field4037;

    @OriginalMember(owner = "client!me", name = "v", descriptor = "I")
    public static int field4038;

    @OriginalMember(owner = "client!me", name = "w", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!me", name = "y", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!me", name = "z", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!me", name = "A", descriptor = "I")
    private int field4043;

    @OriginalMember(owner = "client!me", name = "B", descriptor = "I")
    private int field4044;

    @OriginalMember(owner = "client!me", name = "C", descriptor = "I")
    private int field4045;

    @OriginalMember(owner = "client!me", name = "E", descriptor = "I")
    public static int field4047;

    @OriginalMember(owner = "client!me", name = "F", descriptor = "I")
    private int field4048;

    @OriginalMember(owner = "client!me", name = "H", descriptor = "I")
    private int field4049;

    @OriginalMember(owner = "client!me", name = "K", descriptor = "I")
    private int field4052;

    @OriginalMember(owner = "client!me", name = "L", descriptor = "I")
    private int field4053;

    @OriginalMember(owner = "client!me", name = "M", descriptor = "I")
    private int field4054;

    @OriginalMember(owner = "client!me", name = "O", descriptor = "I")
    private int field4056;

    @OriginalMember(owner = "client!me", name = "P", descriptor = "I")
    public static int field4057;

    @OriginalMember(owner = "client!me", name = "R", descriptor = "I")
    private int field4059;

    @OriginalMember(owner = "client!me", name = "T", descriptor = "I")
    private int field4061;

    @OriginalMember(owner = "client!me", name = "U", descriptor = "I")
    private int field4062;

    @OriginalMember(owner = "client!me", name = "W", descriptor = "I")
    public int field4064;

    @OriginalMember(owner = "client!me", name = "X", descriptor = "[I")
    public static int[] field4065;

    static {
        new class112("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field4058 = new class84("", 16);
        field4060 = new class112("M", "M", "M", "M");
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(B)V", line = 13)
    public static final void method1814(byte arg0) {
        field4041++;
        if (arg0 <= 51) {
            method1820(-46, (class196) null, (int[]) null, (int[]) null, (int[]) null);
        }
        if (class214.field3034 < 102) {
            class214.field3034 += 6;
        }
        if (class109.field1545 != 0) {
            class240.field3381 -= class109.field1545 * 5;
            if (class389.field5490 <= class240.field3381) {
                class240.field3381 = class389.field5490 - 1;
            }
            class109.field1545 = 0;
            if (class240.field3381 < 0) {
                class240.field3381 = 0;
            }
        }
        for (int var1 = 0; var1 < class2.field17; var1++) {
            int var2 = class374.field5291[var1].method990(0);
            char var3 = class374.field5291[var1].method987(-60);
            if (var2 == 84) {
                class119.method745((byte) 96);
            } else if (class194.field2757.method531(82, 117) && var2 == 66) {
                if (class268.field3721 != null) {
                    String var8 = "";
                    for (int var9 = class345.field4714.length - 1; var9 >= 0; var9--) {
                        if (class345.field4714[var9] != null && class345.field4714[var9].length() > 0) {
                            var8 = var8 + class345.field4714[var9] + '\n';
                        }
                    }
                    class268.field3721.setContents(new StringSelection(var8), (ClipboardOwner) null);
                }
            } else if (class194.field2757.method531(82, 47) && var2 == 67) {
                if (class268.field3721 != null) {
                    Transferable var4 = class268.field3721.getContents((Object) null);
                    if (var4 != null) {
                        try {
                            String var5 = (String) var4.getTransferData(DataFlavor.stringFlavor);
                            if (var5 != null) {
                                String[] var6 = class326.method1958((byte) 126, var5, '\n');
                                if (var6.length > 1) {
                                    for (int var7 = 0; var7 < var6.length; var7++) {
                                        class228.field3232 = var6[var7];
                                        class119.method745((byte) 96);
                                    }
                                } else {
                                    class228.field3232 = class228.field3232 + var5;
                                }
                            }
                        } catch (Exception var11) {
                        }
                    }
                }
            } else if (var2 == 85 && class327.field4510 > 0) {
                class228.field3232 = class228.field3232.substring(0, class327.field4510 - 1) + class228.field3232.substring(class327.field4510);
                class327.field4510--;
            } else if (var2 == 101 && class327.field4510 < class228.field3232.length()) {
                class228.field3232 = class228.field3232.substring(0, class327.field4510) + class228.field3232.substring(class327.field4510 + 1);
            } else if (var2 == 96 && class327.field4510 > 0) {
                class327.field4510--;
            } else if (var2 == 97 && class327.field4510 < class228.field3232.length()) {
                class327.field4510++;
            } else if (var2 == 102) {
                class327.field4510 = 0;
            } else if (var2 == 103) {
                class327.field4510 = class228.field3232.length();
            } else if (var2 == 104 && class168.field2494 < class345.field4714.length) {
                class168.field2494++;
                class42.method352((byte) -75);
                class327.field4510 = class228.field3232.length();
            } else if (var2 == 105 && class168.field2494 > 0) {
                class168.field2494--;
                class42.method352((byte) -75);
                class327.field4510 = class228.field3232.length();
            } else if (class54.method420(35, var3) || var3 == ':' || var3 == ',' || var3 == ' ' || var3 == '_' || var3 == '-' || var3 == '+' || var3 == '[' || var3 == ']') {
                class228.field3232 = class228.field3232.substring(0, class327.field4510) + class374.field5291[var1].method987(-116) + class228.field3232.substring(class327.field4510);
                class327.field4510++;
            }
        }
        class2.field17 = 0;
        for (int var10 = 0; var10 < 100; var10++) {
            int var10002;
            if (class442.field6101[var10]) {
                var10002 = class347.field4754[var10]++;
                if (class347.field4754[var10] > 102) {
                    class442.field6101[var10] = false;
                }
            } else {
                var10002 = class347.field4754[var10]--;
                if (class347.field4754[var10] < 0) {
                    class77.field1168[var10] = (int) ((double) class67.field987 * Math.random());
                    class456.field6318[var10] = (int) (Math.random() * 350.0D);
                    class347.field4754[var10] = 0;
                    class442.field6101[var10] = true;
                }
            }
        }
        class480.method2825(9742);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lsm;IIILkm;)V", line = 212)
    public static final void method1815(class249 arg0, int arg1, int arg2, int arg3, class487 arg4) {
        class52.field863.method1552((byte) 117);
        field4039++;
        if (class7.field132) {
            return;
        }
        if (arg3 > -31) {
            field4060 = null;
        }
        for (class163 var5 = (class163) arg0.method1544(-117); var5 != null; var5 = (class163) arg0.method1546((byte) -42)) {
            class442 var6 = class379.field5358.method85(var5.field2342, true);
            if (class153.method922((byte) 99, var6)) {
                boolean var7 = class147.method909(arg1, var6, 0, arg2, var5, arg4);
                if (var7) {
                    class400.method2373(var5, -128, var6, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!me", name = "<init>", descriptor = "(Lkm;Lqm;Lm;J)V", line = 798)
    public class294(class487 arg0, class356 arg1, class83 arg2, long arg3) {
        this.field4031 = arg3;
        this.field4050 = arg2;
        this.field4055 = arg1;
        this.field4063 = class336.method2000(0, this.field4055.field4956);
        if (!arg0.method1142() && this.field4063.field2149 != -1) {
            this.field4063 = class336.method2000(0, this.field4063.field2149);
        }
        this.field4051 = new class479();
        this.field4040 = (int) ((double) this.field4040 + Math.random() * 64.0D);
        this.method1818(false);
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(B)V", line = 257)
    public static void method1816(byte arg0) {
        field4065 = null;
        if (arg0 <= -3) {
            field4058 = null;
            field4060 = null;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lwj;Lwj;IZI)I", line = 270)
    public static final int method1817(class334 arg0, class334 arg1, int arg2, boolean arg3, int arg4) {
        field4026++;
        if (arg4 == 1) {
            int var5 = arg1.field759;
            int var6 = arg0.field759;
            if (!arg3) {
                if (var6 == -1) {
                    var6 = 2001;
                }
                if (var5 == -1) {
                    var5 = 2001;
                }
            }
            return var5 - var6;
        } else if (arg4 == 2) {
            return class376.method2247(arg0.method1988(-104).field6854, -28609, arg1.method1988(-114).field6854, class487.field6867);
        } else if (arg4 == 3) {
            if (arg1.field4575.equals("-")) {
                if (arg0.field4575.equals("-")) {
                    return 0;
                } else if (arg3) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg0.field4575.equals("-")) {
                return arg3 ? 1 : -1;
            } else {
                return class376.method2247(arg0.field4575, -28609, arg1.field4575, class487.field6867);
            }
        } else if (arg4 == 4) {
            if (arg1.method368(arg2 ^ 0xFFFFE905)) {
                return arg0.method368(-5395) ? 0 : 1;
            } else if (arg0.method368(arg2 - 6395)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 5) {
            if (arg1.method367(0)) {
                return arg0.method367(0) ? 0 : 1;
            } else if (arg0.method367(0)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 6) {
            if (arg1.method370(arg2 ^ 0xFFFFFC70)) {
                return arg0.method370(81) ? 0 : 1;
            } else if (arg0.method370(-119)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 7) {
            if (arg1.method369(-14242)) {
                return arg0.method369(-14242) ? 0 : 1;
            } else if (arg0.method369(-14242)) {
                return -1;
            } else {
                return 0;
            }
        } else if (arg4 == 8) {
            int var7 = arg1.field4577;
            int var8 = arg0.field4577;
            if (arg3) {
                if (var7 == 1000) {
                    var7 = -1;
                }
                if (var8 == 1000) {
                    var8 = -1;
                }
            } else {
                if (var7 == -1) {
                    var7 = 1000;
                }
                if (var8 == -1) {
                    var8 = 1000;
                }
            }
            return var7 - var8;
        } else if (arg2 == 1000) {
            return arg1.field4576 - arg0.field4576;
        } else {
            return -93;
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Z)V", line = 363)
    public final void method1818(boolean arg0) {
        this.field4036 = this.field4055.field4970;
        this.field4044 = this.field4055.field4974;
        this.field4035 = this.field4055.field4975;
        this.field4028 = this.field4055.field4971;
        this.field4043 = this.field4055.field4966;
        this.field4045 = this.field4055.field4973;
        this.field4061 = this.field4055.field4968;
        field4034++;
        this.field4052 = this.field4055.field4957;
        this.field4049 = this.field4055.field4964;
        if (this.field4043 == this.field4028 && this.field4049 == this.field4043 && this.field4052 == this.field4044 && this.field4052 == this.field4036 && this.field4061 == this.field4045 && this.field4061 == this.field4035) {
            this.field4025 = true;
            return;
        }
        this.field4025 = false;
        int var2 = (this.field4028 - (-this.field4043 - this.field4049)) / 3;
        int var3 = (this.field4052 + this.field4044 + this.field4036) / 3;
        if (arg0) {
            method1820(-126, (class196) null, (int[]) null, (int[]) null, (int[]) null);
        }
        int var4 = (this.field4061 + this.field4035 + this.field4045) / 3;
        if (this.field4064 == var2 && this.field4032 == var3 && this.field4030 == var4) {
            return;
        }
        this.field4030 = var4;
        this.field4032 = var3;
        this.field4064 = var2;
        int var5 = this.field4043 - this.field4028;
        int var6 = this.field4052 - this.field4044;
        int var7 = this.field4061 - this.field4045;
        int var8 = this.field4049 - this.field4028;
        int var9 = this.field4036 - this.field4044;
        int var10 = this.field4035 - this.field4045;
        this.field4056 = var7 * var8 - (var5 * var10);
        this.field4029 = var6 * var10 - (var7 * var9);
        this.field4053 = var5 * var9 - var6 * var8;
        while (this.field4029 > 32767 || this.field4056 > 32767 || this.field4053 > 32767 || this.field4029 < -32767 || this.field4056 < -32767 || this.field4053 < -32767) {
            this.field4053 >>= 0x1;
            this.field4056 >>= 0x1;
            this.field4029 >>= 0x1;
        }
        int var11 = (int) Math.sqrt((double) (this.field4056 * this.field4056 + this.field4053 * this.field4053 + this.field4029 * this.field4029));
        if (var11 <= 0) {
            var11 = 1;
        }
        this.field4053 = this.field4053 * 32767 / var11;
        this.field4056 = this.field4056 * 32767 / var11;
        this.field4029 = this.field4029 * 32767 / var11;
        if (this.field4063.field2162 <= 0 && this.field4063.field2147 <= 0) {
            return;
        }
        int var12 = (int) (Math.atan2((double) this.field4053, (double) this.field4029) * 2607.5945876176133D);
        int var13 = (int) (Math.atan2((double) this.field4056, Math.sqrt((double) (this.field4029 * this.field4029 + (this.field4053 * this.field4053)))) * 2607.5945876176133D);
        this.field4059 = this.field4063.field2162 - this.field4063.field2117;
        this.field4048 = this.field4063.field2147 - this.field4063.field2138;
        this.field4062 = this.field4063.field2117 + var12 - (this.field4059 >> 1);
        this.field4054 = var13 + this.field4063.field2138 - (this.field4048 >> 1);
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ZJ)V", line = 449)
    public final void method1819(boolean arg0, long arg1) {
        field4047++;
        if (!arg0) {
            field4057 = -111;
        }
        for (class217 var4 = (class217) this.field4051.method2823(53); var4 != null; var4 = (class217) this.field4051.method2818(0)) {
            var4.method1372(arg1);
        }
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(ILld;[I[I[I)V", line = 476)
    public static final void method1820(int arg0, class196 arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (arg0 != -3721) {
            field4065 = null;
        }
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            int var9 = 0;
            while (var7 != 0 && arg1.field1086.length > var9) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field1086[var9] = null;
                    } else {
                        class372 var10 = class31.field505.method950(true, var6);
                        int var11 = var10.field5271;
                        class60 var12 = arg1.field1086[var9];
                        if (var12 != null) {
                            if (var12.field941 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field1086[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field939 = 0;
                                    var12.field937 = 0;
                                    var12.field934 = 0;
                                    var12.field932 = var8;
                                    var12.field938 = 1;
                                    class272.method1706(arg1.field6766, var10, false, (byte) 31, arg1.field6765, arg1.field6746, 0);
                                } else if (var11 == 2) {
                                    var12.field934 = 0;
                                }
                            } else if (var10.field5260 >= class31.field505.method950(true, var12.field941).field5260) {
                                var12 = arg1.field1086[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class60 var13 = arg1.field1086[var9] = new class60();
                            var13.field932 = var8;
                            var13.field937 = 0;
                            var13.field938 = 1;
                            var13.field939 = 0;
                            var13.field941 = var6;
                            var13.field934 = 0;
                            class272.method1706(arg1.field6766, var10, false, (byte) 31, arg1.field6765, arg1.field6746, 0);
                        }
                    }
                }
                var9++;
                var7 >>>= 0x1;
            }
        }
        field4042++;
    }

    @OriginalMember(owner = "client!me", name = "b", descriptor = "(Z)V", line = 574)
    public static final void method1821(boolean arg0) {
        if (!arg0) {
            field4060 = null;
        }
        if (class338.field4636.method1121()) {
            class110.method681((byte) -116);
            class338.field4636.method1054(class138.field1965);
            class480.method2825(9742);
        } else {
            class336.method2003(5, class221.field3118);
        }
        field4037++;
    }

    @OriginalMember(owner = "client!me", name = "a", descriptor = "(Lkm;JIZI)V", line = 594)
    public final void method1822(class487 arg0, long arg1, int arg2, boolean arg3, int arg4) {
        field4027++;
        if (arg2 != 20689) {
            field4058 = null;
        }
        if (this.field4046) {
            arg3 = false;
        } else if (class478.field6757 < this.field4063.field2128) {
            arg3 = false;
        } else if (class274.field3801[class478.field6757] < class466.field6541) {
            arg3 = false;
        } else if (this.field4025) {
            arg3 = false;
        } else if (this.field4063.field2156 != -1) {
            int var7 = (int) (arg1 - this.field4031);
            if (this.field4063.field2174 || var7 <= this.field4063.field2156) {
                var7 %= this.field4063.field2156;
            } else {
                arg3 = false;
            }
            if (!this.field4063.field2115 && this.field4063.field2152 > var7) {
                arg3 = false;
            }
            if (this.field4063.field2115 && var7 >= this.field4063.field2152) {
                arg3 = false;
            }
        }
        if (arg3) {
            this.field4040 += (int) ((double) arg4 * ((double) this.field4063.field2121 + Math.random() * (double) (this.field4063.field2159 - this.field4063.field2121)));
            if (this.field4040 > 63) {
                int var8 = this.field4040 >> 6;
                this.field4040 &= 0x3F;
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10;
                    int var11;
                    int var12;
                    if (this.field4063.field2162 <= 0 && this.field4063.field2147 <= 0) {
                        var10 = this.field4053;
                        var11 = this.field4029;
                        var12 = this.field4056;
                    } else {
                        int var13 = (int) (Math.random() * (double) this.field4059) + this.field4062;
                        int var14 = var13 & 0x3FFF;
                        int var15 = class432.field5955[var14];
                        int var16 = class432.field5957[var14];
                        int var17 = this.field4054 + (int) ((double) this.field4048 * Math.random());
                        int var18 = var17 & 0x1FFF;
                        int var19 = class432.field5955[var18];
                        var11 = var16 * var19 >> 15;
                        int var20 = class432.field5957[var18];
                        var10 = var15 * var19 >> 15;
                        var12 = var20 * -1;
                    }
                    int var21 = (int) (Math.random() * 65535.0D);
                    int var22 = (int) (Math.random() * 65535.0D);
                    if (var21 + var22 > 65535) {
                        var22 = 65535 - var22;
                        var21 = 65535 - var21;
                    }
                    int var23 = 65535 - var21 - var22;
                    int var24 = this.field4028 * var21 - (-(this.field4043 * var22) - this.field4049 * var23) >> 16;
                    int var25 = this.field4036 * var23 + this.field4052 * var22 + this.field4044 * var21 >> 16;
                    int var26 = this.field4035 * var23 + this.field4061 * var22 + this.field4045 * var21 >> 16;
                    int var27 = this.field4063.field2151 + ((int) (Math.random() * (double) (this.field4063.field2137 - this.field4063.field2151)));
                    int var28 = this.field4063.field2175 + ((int) ((double) (this.field4063.field2163 - this.field4063.field2175) * Math.random()));
                    int var29 = this.field4063.field2157 + (int) ((double) (this.field4063.field2165 - this.field4063.field2157) * Math.random());
                    int var30;
                    if (this.field4063.field2150) {
                        double var31 = Math.random();
                        var30 = (int) ((double) this.field4063.field2132 * var31 + (double) this.field4063.field2180) | (int) ((double) this.field4063.field2172 * var31 + (double) this.field4063.field2124) << 8 | (int) ((double) this.field4063.field2125 * var31 + (double) this.field4063.field2153) << 16 | (int) ((double) this.field4063.field2183 + (double) this.field4063.field2164 * Math.random()) << 24;
                    } else {
                        var30 = (int) ((double) this.field4063.field2183 + Math.random() * (double) this.field4063.field2164) << 24 | (int) ((double) this.field4063.field2180 + Math.random() * (double) this.field4063.field2132) | (int) ((double) this.field4063.field2125 * Math.random() + (double) this.field4063.field2153) << 16 | (int) (Math.random() * (double) this.field4063.field2172 + (double) this.field4063.field2124) << 8;
                    }
                    int var33 = this.field4063.field2184;
                    if (!arg0.method1142() && !this.field4063.field2178) {
                        var33 = -1;
                    }
                    if (class466.field6537 == class261.field3640) {
                        new class217(this, var24, var25, var26, var11, var12, var10, var27, var28, var30, var29, var33, this.field4063.field2170);
                    } else {
                        class217 var34 = class351.field4797[class466.field6537];
                        class466.field6537 = class466.field6537 + 1 & 0x3FF;
                        var34.method1369(this, var24, var25, var26, var11, var12, var10, var27, var28, var30, var29, var33, this.field4063.field2170);
                    }
                }
            }
        }
        this.field4033 = 0;
        for (class217 var36 = (class217) this.field4051.method2823(54); var36 != null; var36 = (class217) this.field4051.method2818(0)) {
            var36.method1371(arg1, arg4);
            this.field4033++;
        }
        class197.field2833 += this.field4033;
    }

    @OriginalMember(owner = "client!me", name = "c", descriptor = "(I)Ls;", line = 767)
    public static final class417 method1823(int arg0) {
        field4038++;
        if (arg0 != 940) {
            field4065 = null;
        }
        try {
            return new class252();
        } catch (Throwable var2) {
            try {
                return (class417) Class.forName("ho").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class342();
            }
        }
    }
}
