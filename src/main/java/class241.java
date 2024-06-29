import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class241 {

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "[I")
    private int[] field3686 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public int field3706 = -1;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Z")
    public boolean field3703 = false;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field3697;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field3698;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field3699;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "I")
    public static int field3700;

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "I")
    public static int field3707;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lhc;")
    public static class235 field3694;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "[I")
    private int[] field3710;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[S")
    private short[] field3696;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "[S")
    private short[] field3701;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "[S")
    private short[] field3704;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "[S")
    private short[] field3708;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)Lca;")
    public final class271 method1610(byte arg0) {
        field3705++;
        class271[] var2 = new class271[5];
        int var3 = 0;
        if (arg0 != -90) {
            this.method1621(25, (class224) null);
        }
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field3686[var4] != -1) {
                var2[var3++] = class271.method1813(class228.field3456, this.field3686[var4], 0);
            }
        }
        class271 var5 = new class271(var2, var3);
        if (this.field3701 != null) {
            for (int var6 = 0; var6 < this.field3701.length; var6++) {
                var5.method1796(this.field3701[var6], this.field3704[var6]);
            }
        }
        if (this.field3708 != null) {
            for (int var7 = 0; var7 < this.field3708.length; var7++) {
                var5.method1797(this.field3708[var7], this.field3696[var7]);
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
    public final boolean method1611(int arg0) {
        field3693++;
        if (arg0 >= -35) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field3686[var3] != -1 && !class228.field3456.method1564(2, this.field3686[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILmi;)V")
    public static final void method1612(int arg0, class266 arg1) {
        field3709++;
        arg1.field4003 = false;
        if (arg1.field4050 != -1) {
            class240 var2 = class132.method905(true, arg1.field4050);
            if (var2 == null || var2.field3665 == null) {
                arg1.field4050 = -1;
            } else {
                arg1.field4013++;
                if (arg1.field4066 < var2.field3665.length && var2.field3673[arg1.field4066] < arg1.field4013) {
                    arg1.field4048++;
                    arg1.field4066++;
                    arg1.field4013 = 1;
                    class116.method781(arg1.field4085, 236, arg1.field4019, class217.field3280 == arg1, arg1.field4066, var2);
                }
                if (arg1.field4066 >= var2.field3665.length) {
                    arg1.field4013 = 0;
                    arg1.field4066 = 0;
                    class116.method781(arg1.field4085, 236, arg1.field4019, class217.field3280 == arg1, arg1.field4066, var2);
                }
                arg1.field4048 = arg1.field4066 + 1;
                if (var2.field3665.length <= arg1.field4048) {
                    arg1.field4048 = 0;
                }
            }
        }
        if (arg1.field4046 != -1 && arg1.field4041 <= class52.field740) {
            class191 var3 = class82.method512(arg1.field4046, (byte) 75);
            int var4 = var3.field2638;
            if (var4 == -1) {
                arg1.field4046 = -1;
            } else {
                label292: {
                    class240 var5 = class132.method905(true, var4);
                    if (var3.field2630) {
                        if (var5.field3657 == 3) {
                            if (arg1.field4027 > 0 && class52.field740 >= arg1.field4012 && arg1.field3996 < class52.field740) {
                                arg1.field4046 = -1;
                                break label292;
                            }
                        } else if (var5.field3657 == 1 && arg1.field4027 > 0 && arg1.field4012 <= class52.field740 && class52.field740 > arg1.field3996) {
                            arg1.field4041 = class52.field740 + 1;
                            break label292;
                        }
                    }
                    if (var5 == null || var5.field3665 == null) {
                        arg1.field4046 = -1;
                    } else {
                        if (arg1.field4077 < 0) {
                            arg1.field4077 = 0;
                            class116.method781(arg1.field4085, 236, arg1.field4019, class217.field3280 == arg1, 0, var5);
                        }
                        arg1.field4061++;
                        if (var5.field3665.length > arg1.field4077 && arg1.field4061 > var5.field3673[arg1.field4077]) {
                            arg1.field4077++;
                            arg1.field4061 = 1;
                            class116.method781(arg1.field4085, 236, arg1.field4019, class217.field3280 == arg1, arg1.field4077, var5);
                        }
                        if (arg1.field4077 >= var5.field3665.length) {
                            if (var3.field2630) {
                                arg1.field4077 -= var5.field3682;
                                arg1.field3999++;
                                if (var5.field3669 <= arg1.field3999) {
                                    arg1.field4046 = -1;
                                } else if (arg1.field4077 >= 0 && arg1.field4077 < var5.field3665.length) {
                                    class116.method781(arg1.field4085, 236, arg1.field4019, class217.field3280 == arg1, arg1.field4077, var5);
                                } else {
                                    arg1.field4046 = -1;
                                }
                            } else {
                                arg1.field4046 = -1;
                            }
                        }
                        arg1.field4062 = arg1.field4077 + 1;
                        if (arg1.field4062 >= var5.field3665.length) {
                            if (var3.field2630) {
                                arg1.field4062 -= var5.field3682;
                                if (var5.field3669 <= (arg1.field3999 + 1)) {
                                    arg1.field4062 = -1;
                                } else if (arg1.field4062 < 0 || arg1.field4062 >= var5.field3665.length) {
                                    arg1.field4062 = -1;
                                }
                            } else {
                                arg1.field4062 = -1;
                            }
                        }
                    }
                }
            }
        }
        if (arg1.field4040 != -1 && arg1.field3985 <= 1) {
            class240 var6 = class132.method905(true, arg1.field4040);
            if (var6.field3657 == 3) {
                if (arg1.field4027 > 0 && class52.field740 >= arg1.field4012 && class52.field740 > arg1.field3996) {
                    arg1.field4040 = -1;
                }
            } else if (var6.field3657 == 1 && arg1.field4027 > 0 && arg1.field4012 <= class52.field740 && arg1.field3996 < class52.field740) {
                arg1.field3985 = 1;
            }
        }
        if (arg1.field4040 != -1 && arg1.field3985 == 0) {
            class240 var7 = class132.method905(true, arg1.field4040);
            if (var7 == null || var7.field3665 == null) {
                arg1.field4040 = -1;
            } else {
                arg1.field4080++;
                if (var7.field3665.length > arg1.field4024 && var7.field3673[arg1.field4024] < arg1.field4080) {
                    arg1.field4024++;
                    arg1.field4080 = 1;
                    class116.method781(arg1.field4085, 236, arg1.field4019, class217.field3280 == arg1, arg1.field4024, var7);
                }
                if (arg1.field4024 >= var7.field3665.length) {
                    arg1.field4024 -= var7.field3682;
                    arg1.field4002++;
                    if (var7.field3669 <= arg1.field4002) {
                        arg1.field4040 = -1;
                    } else if (arg1.field4024 >= 0 && arg1.field4024 < var7.field3665.length) {
                        class116.method781(arg1.field4085, 236, arg1.field4019, class217.field3280 == arg1, arg1.field4024, var7);
                    } else {
                        arg1.field4040 = -1;
                    }
                }
                arg1.field3994 = arg1.field4024 + 1;
                if (arg1.field3994 >= var7.field3665.length) {
                    arg1.field3994 -= var7.field3682;
                    if (var7.field3669 <= (arg1.field4002 + 1)) {
                        arg1.field3994 = -1;
                    } else if (arg1.field3994 < 0 || var7.field3665.length <= arg1.field3994) {
                        arg1.field3994 = -1;
                    }
                }
                arg1.field4003 = var7.field3658;
            }
        }
        if (arg1.field3985 > 0) {
            arg1.field3985--;
        }
        int var8 = -38 / ((arg0 - 18) / 34);
        for (int var9 = 0; var9 < arg1.field4022.length; var9++) {
            class212 var10 = arg1.field4022[var9];
            if (var10 != null) {
                if (var10.field3197 > 0) {
                    var10.field3197--;
                } else {
                    class240 var11 = class132.method905(true, var10.field3195);
                    if (var11 == null || var11.field3665 == null) {
                        arg1.field4022[var9] = null;
                    } else {
                        var10.field3189++;
                        if (var11.field3665.length > var10.field3190 && var10.field3189 > var11.field3673[var10.field3190]) {
                            var10.field3190++;
                            var10.field3189 = 1;
                            class116.method781(arg1.field4085, 236, arg1.field4019, class217.field3280 == arg1, var10.field3190, var11);
                        }
                        if (var11.field3665.length <= var10.field3190) {
                            var10.field3190 -= var11.field3682;
                            var10.field3191++;
                            if (var11.field3669 <= var10.field3191) {
                                arg1.field4022[var9] = null;
                            } else if (var10.field3190 >= 0 && var10.field3190 < var11.field3665.length) {
                                class116.method781(arg1.field4085, 236, arg1.field4019, class217.field3280 == arg1, var10.field3190, var11);
                            } else {
                                arg1.field4022[var9] = null;
                            }
                        }
                        var10.field3196 = var10.field3190 + 1;
                        if (var10.field3196 >= var11.field3665.length) {
                            var10.field3196 -= var11.field3682;
                            if (var10.field3191 + 1 >= var11.field3669) {
                                var10.field3196 = -1;
                            } else if (var10.field3196 < 0 || var10.field3196 >= var11.field3665.length) {
                                var10.field3196 = -1;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method1613(int arg0) {
        if (arg0 != -1) {
            method1622(true);
        }
        class158.field2208 = new class211[class221.field3323.method1561(arg0 - 24366)][];
        class191.field2650 = new boolean[class221.field3323.method1561(-24367)];
        field3699++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Ljava/lang/Throwable;I)Ljava/lang/String;")
    public static final String method1614(Throwable arg0, int arg1) throws IOException {
        field3690++;
        if (arg1 != 0) {
            field3694 = null;
        }
        String var3;
        if (arg0 instanceof class33) {
            class33 var2 = (class33) arg0;
            arg0 = var2.field504;
            var3 = var2.field508 + " | ";
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg0.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(II)V")
    public static final void method1615(int arg0, int arg1) {
        field3707++;
        class172.field2398.method536(121, arg1);
        if (arg0 > -68) {
            field3692 = 12;
        }
        class71.field991.method536(95, arg1);
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)V")
    public static final void method1616(byte arg0) {
        class6.field48.method544(false);
        class236.field3594.method544(false);
        if (arg0 != 66) {
            field3702 = -19;
        }
        field3687++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)I")
    public static final int method1617(int arg0, int arg1, int arg2) {
        int var3 = class273.method1826(Integer.MAX_VALUE, arg0 - 1, arg2 + -1) - (-class273.method1826(Integer.MAX_VALUE, arg0 - 1, arg2 + 1) - class273.method1826(Integer.MAX_VALUE, arg0 + 1, arg2 + -1)) + class273.method1826(arg1 + -2147453443, arg0 + 1, arg2 + 1);
        field3700++;
        int var4 = class273.method1826(Integer.MAX_VALUE, arg0, arg2 - 1) + class273.method1826(arg1 - 2147453443, arg0, arg2 + 1) + class273.method1826(Integer.MAX_VALUE, arg0 - 1, arg2) + class273.method1826(Integer.MAX_VALUE, arg0 + 1, arg2);
        int var5 = class273.method1826(Integer.MAX_VALUE, arg0, arg2);
        if (arg1 != -30206) {
            method1613(-44);
        }
        return var3 / 16 - (-(var4 / 8) - (var5 / 4));
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static void method1618(int arg0) {
        field3694 = null;
        if (arg0 != -6986) {
            field3694 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Lca;")
    public final class271 method1619(int arg0) {
        field3698++;
        if (this.field3710 == null) {
            return null;
        }
        class271[] var2 = new class271[this.field3710.length];
        for (int var3 = 0; var3 < this.field3710.length; var3++) {
            var2[var3] = class271.method1813(class228.field3456, this.field3710[var3], 0);
        }
        class271 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class271(var2, var2.length);
        }
        int var5 = 66 % ((50 - arg0) / 58);
        if (this.field3701 != null) {
            for (int var6 = 0; var6 < this.field3701.length; var6++) {
                var4.method1796(this.field3701[var6], this.field3704[var6]);
            }
        }
        if (this.field3708 != null) {
            for (int var7 = 0; var7 < this.field3708.length; var7++) {
                var4.method1797(this.field3708[var7], this.field3696[var7]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(III)V")
    public static final void method1620(int arg0, int arg1, int arg2) {
        int var3 = class168.field2312 * arg2 >> 8;
        if (arg0 == -1 && !class49.field709) {
            class159.method1059(arg1 - 13706);
        } else if (arg0 != -1 && (class28.field373 != arg0 || !class94.method618(arg1 - 13872)) && var3 != 0 && !class49.field709) {
            class212.method1385(false, arg1 - 13892, 2, class23.field324, arg0, var3, 0);
        }
        class28.field373 = arg0;
        if (arg1 != 13799) {
            method1618(77);
        }
        field3697++;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(ILql;)V")
    public final void method1621(int arg0, class224 arg1) {
        if (arg0 > -34) {
            this.method1611(98);
        }
        field3695++;
        while (true) {
            int var3 = arg1.method1453((byte) -128);
            if (var3 == 0) {
                return;
            }
            this.method1624((byte) -76, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)Lo;")
    public static final class254 method1622(boolean arg0) {
        field3689++;
        if (!arg0) {
            field3692 = 20;
        }
        return class210.field3000;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(B)Z")
    public final boolean method1623(byte arg0) {
        field3688++;
        if (this.field3710 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 41) {
            return true;
        }
        for (int var3 = 0; var3 < this.field3710.length; var3++) {
            if (!class228.field3456.method1564(2, this.field3710[var3], 0)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BILql;)V")
    private final void method1624(byte arg0, int arg1, class224 arg2) {
        int var4 = -111 % ((51 - arg0) / 51);
        field3685++;
        if (arg1 == 1) {
            this.field3706 = arg2.method1453((byte) -127);
        } else if (arg1 == 2) {
            int var9 = arg2.method1453((byte) -128);
            this.field3710 = new int[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                this.field3710[var10] = arg2.method1445(false);
            }
        } else if (arg1 == 3) {
            this.field3703 = true;
        } else if (arg1 == 40) {
            int var5 = arg2.method1453((byte) -128);
            this.field3701 = new short[var5];
            this.field3704 = new short[var5];
            for (int var6 = 0; var6 < var5; var6++) {
                this.field3701[var6] = (short) arg2.method1445(false);
                this.field3704[var6] = (short) arg2.method1445(false);
            }
        } else if (arg1 == 41) {
            int var7 = arg2.method1453((byte) -127);
            this.field3708 = new short[var7];
            this.field3696 = new short[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field3708[var8] = (short) arg2.method1445(false);
                this.field3696[var8] = (short) arg2.method1445(false);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field3686[arg1 - 60] = arg2.method1445(false);
            return;
        }
    }
}
