import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class519 {

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "Lnj;")
    private class162 field7686 = new class162(64);

    @OriginalMember(owner = "client!kn", name = "v", descriptor = "Lnj;")
    public class162 field7695 = new class162(50);

    @OriginalMember(owner = "client!kn", name = "w", descriptor = "Lcc;")
    public class512 field7696 = new class512(250);

    @OriginalMember(owner = "client!kn", name = "x", descriptor = "Lcl;")
    private class174 field7697 = new class174();

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "Z")
    private boolean field7683;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "Lmg;")
    private class101 field7684;

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "Lmg;")
    public class101 field7677;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public int field7680;

    @OriginalMember(owner = "client!kn", name = "z", descriptor = "Lmi;")
    private class342 field7699;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    public int field7676;

    @OriginalMember(owner = "client!kn", name = "y", descriptor = "[Ljava/lang/String;")
    private String[] field7698;

    @OriginalMember(owner = "client!kn", name = "B", descriptor = "[Ljava/lang/String;")
    private String[] field7701;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field7674;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field7675;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field7678;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field7679;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field7681;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "I")
    public static int field7682;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "I")
    public static int field7687;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field7688;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public static int field7691;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "I")
    public static int field7693;

    @OriginalMember(owner = "client!kn", name = "u", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!kn", name = "A", descriptor = "I")
    public int field7700;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "Lmg;")
    public static class101 field7685;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)Z", line = 8)
    public static final boolean method3087(int arg0, int arg1, int arg2) {
        if (arg1 <= 81) {
            return false;
        } else {
            field7693++;
            return (arg2 & 0x800) != 0;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V", line = 19)
    public static void method3088(byte arg0) {
        if (arg0 != -41) {
            method3088((byte) 48);
        }
        field7685 = null;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(B)V", line = 29)
    public final void method3089(byte arg0) {
        class162 var2 = this.field7686;
        synchronized (this.field7686) {
            this.field7686.method1066(4080);
        }
        field7691++;
        class162 var3 = this.field7695;
        synchronized (this.field7695) {
            this.field7695.method1066(4080);
        }
        if (arg0 >= -106) {
            this.method3097(-12);
        }
        class512 var4 = this.field7696;
        synchronized (this.field7696) {
            this.field7696.method3065(false);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V", line = 49)
    public final void method3090(int arg0) {
        field7678++;
        int var2 = 63 / ((61 - arg0) / 46);
        class162 var3 = this.field7695;
        synchronized (this.field7695) {
            this.field7695.method1068(0);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(II)Lcp;", line = 64)
    public final class508 method3091(int arg0, int arg1) {
        field7692++;
        class162 var3 = this.field7686;
        class508 var4;
        synchronized (this.field7686) {
            var4 = (class508) this.field7686.method1073((long) arg1, false);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field7684.method727(class343.method2037(false, arg1), class49.method428(arg1, 872959912), 58);
        class508 var6 = new class508();
        if (arg0 <= 38) {
            return null;
        }
        var6.field7510 = arg1;
        var6.field7496 = this;
        var6.field7502 = new String[] { null, null, class351.field5155.method2731(62, this.field7680), null, null };
        var6.field7483 = new String[] { null, null, null, null, class521.field7723.method2731(62, this.field7680) };
        if (var5 != null) {
            var6.method3038(new class391(var5), true);
        }
        var6.method3033((byte) 114);
        if (var6.field7530 != -1) {
            var6.method3027(-28132, this.method3091(115, var6.field7487), this.method3091(88, var6.field7530));
        }
        if (var6.field7540 != -1) {
            var6.method3042(-108, this.method3091(76, var6.field7482), this.method3091(46, var6.field7540));
        }
        if (!this.field7683 && var6.field7472) {
            var6.field7506 = class146.field2116.method2731(62, this.field7680);
            var6.field7483 = this.field7701;
            var6.field7502 = this.field7698;
            var6.field7552 = null;
            var6.field7542 = false;
            var6.field7485 = 0;
            if (var6.field7469 != null) {
                boolean var7 = false;
                for (class260 var8 = var6.field7469.method1494(0); var8 != null; var8 = var6.field7469.method1493((byte) 124)) {
                    class177 var9 = this.field7699.method2033((byte) -83, (int) var8.field3615);
                    if (var9.field2624) {
                        var8.method1565(0);
                    } else {
                        var7 = true;
                    }
                }
                if (!var7) {
                    var6.field7469 = null;
                }
            }
        }
        class162 var10 = this.field7686;
        synchronized (this.field7686) {
            this.field7686.method1072((long) arg1, var6, false);
            return var6;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLcu;)Z", line = 142)
    public static final boolean method3092(boolean arg0, class146 arg1) {
        if (arg0) {
            return true;
        }
        field7682++;
        if (arg1 == null) {
            return false;
        } else if (!arg1.field2114) {
            return false;
        } else if (!arg1.method985((byte) -119, class350.field5104)) {
            return false;
        } else if (class268.field3704.method1492((long) arg1.field2107, 6340) == null) {
            return class250.field3451.method1492((long) arg1.field2070, 6340) == null;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILgo;ZLla;ZLya;IZLya;II)Ll;", line = 176)
    public final class16 method3093(int arg0, int arg1, class441 arg2, boolean arg3, class315 arg4, boolean arg5, class38 arg6, int arg7, boolean arg8, class38 arg9, int arg10, int arg11) {
        field7689++;
        if (!arg5) {
            return null;
        }
        class16 var13 = this.method3099(arg2, 36, arg9, arg1, arg10, arg11, arg7, arg0);
        if (var13 != null) {
            return var13;
        }
        class508 var14 = this.method3091(81, arg10);
        if (arg11 > 1 && var14.field7528 != null) {
            int var15 = -1;
            for (int var16 = 0; var16 < 10; var16++) {
                if (var14.field7480[var16] <= arg11 && var14.field7480[var16] != 0) {
                    var15 = var14.field7528[var16];
                }
            }
            if (var15 != -1) {
                var14 = this.method3091(95, var15);
            }
        }
        int[] var17 = var14.method3025(arg1, arg11, -14, arg7, arg9, arg0, arg8, arg6, arg4, arg2);
        if (var17 == null) {
            return null;
        }
        class16 var18;
        if (arg3) {
            var18 = arg6.method244(var17, 0, 36, 36, 32);
        } else {
            var18 = arg9.method244(var17, 0, 36, 36, 32);
        }
        if (!arg3) {
            class174 var19 = new class174();
            var19.field2586 = arg9.field468;
            var19.field2580 = arg10;
            var19.field2581 = arg2 != null;
            var19.field2582 = arg1;
            var19.field2577 = arg7;
            var19.field2583 = arg11;
            var19.field2589 = arg0;
            this.field7696.method3064(var19, var18, -34);
        }
        return var18;
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)V", line = 247)
    public final void method3094(int arg0, int arg1) {
        field7688++;
        this.field7700 = arg1;
        class162 var3 = this.field7695;
        synchronized (this.field7695) {
            this.field7695.method1068(0);
        }
        if (arg0 != 8) {
            method3087(25, 106, 63);
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)V", line = 261)
    public final void method3095(int arg0) {
        class162 var2 = this.field7686;
        synchronized (this.field7686) {
            this.field7686.method1068(0);
        }
        field7687++;
        class162 var3 = this.field7695;
        synchronized (this.field7695) {
            this.field7695.method1068(0);
            if (arg0 >= -69) {
                this.method3094(-124, 90);
            }
        }
        class512 var4 = this.field7696;
        synchronized (this.field7696) {
            this.field7696.method3061((byte) 0);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "()V", line = 281)
    public static final void method3096() {
        class405.field5948 = 0;
        label212: for (int var0 = 0; var0 < class273.field3759; var0++) {
            class310 var1 = class271.field3736[var0];
            if (class86.field1267 != null) {
                for (int var2 = 0; var2 < class86.field1267.length; var2++) {
                    if (class86.field1267[var2] != -1000000 && (var1.field4227 <= class86.field1267[var2] || var1.field4213 <= class86.field1267[var2]) && (var1.field4211 <= class312.field4257[var2] || var1.field4232 <= class312.field4257[var2]) && (var1.field4211 >= class224.field3196[var2] || var1.field4232 >= class224.field3196[var2]) && (var1.field4216 <= class459.field6736[var2] || var1.field4233 <= class459.field6736[var2]) && (var1.field4216 >= class485.field7080[var2] || var1.field4233 >= class485.field7080[var2])) {
                        continue label212;
                    }
                }
            }
            if (var1.field4221 == 1) {
                int var3 = var1.field4222 + class110.field1656 - class368.field5398;
                if (var3 >= 0 && var3 <= class110.field1656 + class110.field1656) {
                    int var4 = var1.field4217 + class110.field1656 - class403.field5916;
                    if (var4 < 0) {
                        var4 = 0;
                    } else if (var4 > class110.field1656 + class110.field1656) {
                        continue;
                    }
                    int var5 = var1.field4236 + class110.field1656 - class403.field5916;
                    if (var5 > class110.field1656 + class110.field1656) {
                        var5 = class110.field1656 + class110.field1656;
                    } else if (var5 < 0) {
                        continue;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class457.field6712[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class181.field2671 - var1.field4211;
                        if (var7 > class297.field4082) {
                            var1.field4224 = 1;
                        } else {
                            if (var7 >= -class297.field4082) {
                                continue;
                            }
                            var1.field4224 = 2;
                            var7 = -var7;
                        }
                        var1.field4230 = (var1.field4216 - class13.field201 << 8) / var7;
                        var1.field4220 = (var1.field4233 - class13.field201 << 8) / var7;
                        var1.field4219 = (var1.field4227 - class384.field5598 << 8) / var7;
                        var1.field4215 = (var1.field4213 - class384.field5598 << 8) / var7;
                        class59.field718[class405.field5948++] = var1;
                    }
                }
            } else if (var1.field4221 == 2) {
                int var8 = var1.field4217 + class110.field1656 - class403.field5916;
                if (var8 >= 0 && var8 <= class110.field1656 + class110.field1656) {
                    int var9 = var1.field4222 + class110.field1656 - class368.field5398;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > class110.field1656 + class110.field1656) {
                        continue;
                    }
                    int var10 = var1.field4229 + class110.field1656 - class368.field5398;
                    if (var10 > class110.field1656 + class110.field1656) {
                        var10 = class110.field1656 + class110.field1656;
                    } else if (var10 < 0) {
                        continue;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class457.field6712[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class13.field201 - var1.field4216;
                        if (var12 > class297.field4082) {
                            var1.field4224 = 3;
                        } else {
                            if (var12 >= -class297.field4082) {
                                continue;
                            }
                            var1.field4224 = 4;
                            var12 = -var12;
                        }
                        var1.field4212 = (var1.field4211 - class181.field2671 << 8) / var12;
                        var1.field4235 = (var1.field4232 - class181.field2671 << 8) / var12;
                        var1.field4219 = (var1.field4227 - class384.field5598 << 8) / var12;
                        var1.field4215 = (var1.field4213 - class384.field5598 << 8) / var12;
                        class59.field718[class405.field5948++] = var1;
                    }
                }
            } else if (var1.field4221 == 4) {
                int var13 = var1.field4227 - class384.field5598;
                if (var13 > class295.field4054) {
                    int var14 = var1.field4217 + class110.field1656 - class403.field5916;
                    if (var14 < 0) {
                        var14 = 0;
                    } else if (var14 > class110.field1656 + class110.field1656) {
                        continue;
                    }
                    int var15 = var1.field4236 + class110.field1656 - class403.field5916;
                    if (var15 > class110.field1656 + class110.field1656) {
                        var15 = class110.field1656 + class110.field1656;
                    } else if (var15 < 0) {
                        continue;
                    }
                    int var16 = var1.field4222 + class110.field1656 - class368.field5398;
                    if (var16 < 0) {
                        var16 = 0;
                    } else if (var16 > class110.field1656 + class110.field1656) {
                        continue;
                    }
                    int var17 = var1.field4229 + class110.field1656 - class368.field5398;
                    if (var17 > class110.field1656 + class110.field1656) {
                        var17 = class110.field1656 + class110.field1656;
                    } else if (var17 < 0) {
                        continue;
                    }
                    boolean var18 = false;
                    label184: for (int var19 = var16; var19 <= var17; var19++) {
                        for (int var20 = var14; var20 <= var15; var20++) {
                            if (class457.field6712[var19][var20]) {
                                var18 = true;
                                break label184;
                            }
                        }
                    }
                    if (var18) {
                        var1.field4224 = 5;
                        var1.field4212 = (var1.field4211 - class181.field2671 << 8) / var13;
                        var1.field4235 = (var1.field4232 - class181.field2671 << 8) / var13;
                        var1.field4230 = (var1.field4216 - class13.field201 << 8) / var13;
                        var1.field4220 = (var1.field4233 - class13.field201 << 8) / var13;
                        class59.field718[class405.field5948++] = var1;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)V", line = 536)
    public final void method3097(int arg0) {
        if (arg0 != 8) {
            this.field7686 = null;
        }
        class512 var2 = this.field7696;
        synchronized (this.field7696) {
            this.field7696.method3061((byte) 0);
        }
        field7694++;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIII)V", line = 549)
    public static final void method3098(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg3 >= arg1) {
            class210.method1300(arg1, class437.field6400[arg2], (byte) 115, arg3, arg0);
        } else {
            class210.method1300(arg3, class437.field6400[arg2], (byte) 110, arg1, arg0);
        }
        if (arg4 < -62) {
            field7679++;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lgo;ILya;IIIII)Ll;", line = 568)
    public final class16 method3099(class441 arg0, int arg1, class38 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field7697.field2583 = arg5;
        this.field7697.field2577 = arg6;
        this.field7697.field2589 = arg7;
        if (arg1 != 36) {
            this.field7700 = -124;
        }
        this.field7697.field2586 = arg2.field468;
        this.field7697.field2580 = arg4;
        this.field7697.field2581 = arg0 != null;
        this.field7697.field2582 = arg3;
        field7690++;
        return (class16) this.field7696.method3062(arg1 ^ 0x24, this.field7697);
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "(Lal;IZLmi;Lmg;Lmg;)V", line = 642)
    public class519(class66 arg0, int arg1, boolean arg2, class342 arg3, class101 arg4, class101 arg5) {
        this.field7683 = arg2;
        this.field7684 = arg4;
        this.field7677 = arg5;
        this.field7680 = arg1;
        this.field7699 = arg3;
        if (this.field7684 == null) {
            this.field7676 = 0;
        } else {
            int var7 = this.field7684.method746(112) - 1;
            this.field7676 = var7 * 256 + this.field7684.method753(var7, -97);
        }
        this.field7698 = new String[] { null, null, class351.field5155.method2731(62, this.field7680), null, null };
        this.field7701 = new String[] { null, null, null, null, class521.field7723.method2731(62, this.field7680) };
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(II)V", line = 592)
    public final void method3100(int arg0, int arg1) {
        class162 var3 = this.field7686;
        synchronized (this.field7686) {
            this.field7686.method1065((byte) -95, arg0);
        }
        field7681++;
        class162 var4 = this.field7695;
        synchronized (this.field7695) {
            this.field7695.method1065((byte) -95, arg0);
        }
        int var5 = -46 / ((arg1 + 32) / 48);
        class512 var6 = this.field7696;
        synchronized (this.field7696) {
            this.field7696.method3058((byte) -127, arg0);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IZ)V", line = 616)
    public final void method3101(int arg0, boolean arg1) {
        field7675++;
        if (this.field7683 != arg1 && arg0 == 0) {
            this.field7683 = arg1;
            this.method3095(-95);
        }
    }
}
