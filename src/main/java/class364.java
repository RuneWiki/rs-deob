import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class364 {

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "Luq;")
    private class111 field5464 = new class111();

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "I")
    private int field5466;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "I")
    private int field5457;

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "Lcv;")
    private class398 field5461;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field5474;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static int field5458;

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "I")
    public static int field5460;

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "I")
    public static int field5462;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "I")
    public static int field5463;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field5465;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field5467;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "I")
    public static int field5468;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field5469;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field5470;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field5471;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field5472;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "I")
    public static int field5476;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field5477;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field5478;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "[I")
    public static int[] field5473;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "[Lf;")
    public static class528[] field5482;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "[[[B")
    public static byte[][][] field5475;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIIII)V")
    public static final void method2333(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5460++;
        int var6 = arg2 - arg3;
        int var7 = arg5 - arg1;
        if (var7 == 0) {
            if (var6 != 0) {
                class148.method1060(arg2, arg1, (byte) -66, arg3, arg4);
            }
        } else if (var6 == 0) {
            class53.method387(arg4, 0, arg5, arg1, arg3);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg3;
                int var10 = arg5;
                arg5 = arg2;
                arg3 = var9;
                arg2 = var10;
            }
            if (arg5 < arg1) {
                int var11 = arg1;
                int var12 = arg3;
                arg1 = arg5;
                arg3 = arg2;
                arg5 = var11;
                arg2 = var12;
            }
            int var13 = arg3;
            int var14 = arg5 - arg1;
            int var15 = arg2 - arg3;
            if (arg0 <= 61) {
                field5480 = 116;
            }
            int var16 = -(var14 >> 1);
            int var17 = arg3 >= arg2 ? -1 : 1;
            if (var15 < 0) {
                var15 = -var15;
            }
            if (var8) {
                for (int var19 = arg1; var19 <= arg5; var19++) {
                    var16 += var15;
                    class436.field6332[var19][var13] = arg4;
                    if (var16 > 0) {
                        var13 += var17;
                        var16 -= var14;
                    }
                }
            } else {
                for (int var18 = arg1; var18 <= arg5; var18++) {
                    class436.field6332[var13][var18] = arg4;
                    var16 += var15;
                    if (var16 > 0) {
                        var16 -= var14;
                        var13 += var17;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(B)[Lsv;")
    public static final class467[] method2334(byte arg0) {
        field5467++;
        if (arg0 <= 60) {
            method2341((byte) 75, -111, -41, 35);
        }
        return new class467[] { class441.field6471, class323.field4953, class156.field2380, class204.field2947, class177.field2690, class192.field2819, class231.field3373, class231.field3374, class310.field4444, class390.field5778, class97.field1569, class448.field6558, class200.field2914, class457.field6752 };
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)I")
    public final int method2335(int arg0) {
        field5477++;
        return arg0 < 56 ? -63 : this.field5466;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(JI)V")
    private final void method2336(long arg0, int arg1) {
        if (arg1 >= 37) {
            field5471++;
            class90 var4 = (class90) this.field5461.method2485(99, arg0);
            this.method2343(64, var4);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2337(int arg0) {
        if (arg0 <= 82) {
            this.method2350((byte) -10);
        }
        field5459++;
        class90 var2 = (class90) this.field5461.method2481((byte) -27);
        while (var2 != null) {
            Object var3 = var2.method731(174);
            if (var3 != null) {
                return var3;
            }
            class90 var4 = var2;
            var2 = (class90) this.field5461.method2481((byte) -27);
            var4.method2663(-118);
            var4.method855(51);
            this.field5466 += var2.field1498;
        }
        return null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBLjava/lang/Object;J)V")
    private final void method2338(int arg0, byte arg1, Object arg2, long arg3) {
        field5472++;
        if (this.field5457 < arg0) {
            throw new IllegalStateException("s>cs");
        }
        if (arg1 != -81) {
            this.method2350((byte) 105);
        }
        this.method2336(arg3, arg1 + 157);
        this.field5466 -= arg0;
        while (this.field5466 < 0) {
            class90 var7 = (class90) this.field5464.method814(0);
            this.method2343(64, var7);
        }
        class358 var6 = new class358(arg2, arg0);
        this.field5461.method2486(105, var6, arg3);
        this.field5464.method819(var6, 1431655765);
        var6.field1844 = 0L;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IJ)Ljava/lang/Object;")
    public final Object method2339(int arg0, long arg1) {
        field5468++;
        class90 var4 = (class90) this.field5461.method2485(42, arg1);
        if (var4 == null) {
            return null;
        }
        Object var5 = var4.method731(174);
        if (var5 == null) {
            var4.method2663(-117);
            var4.method855(51);
            this.field5466 += var4.field1498;
            return null;
        }
        if (var4.method733((byte) -7)) {
            class358 var6 = new class358(var5, var4.field1498);
            this.field5461.method2486(-115, var6, var4.field6399);
            this.field5464.method819(var6, 1431655765);
            var6.field1844 = 0L;
            var4.method2663(-117);
            var4.method855(51);
        } else {
            this.field5464.method819(var4, 1431655765);
            var4.field1844 = 0L;
        }
        if (arg0 > -58) {
            this.method2343(70, null);
        }
        return var5;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public static void method2340(int arg0) {
        field5473 = null;
        if (arg0 != -1) {
            method2334((byte) 6);
        }
        field5482 = null;
        field5475 = null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BIII)V")
    public static final void method2341(byte arg0, int arg1, int arg2, int arg3) {
        field5479++;
        int var4 = -24 / ((arg0 - 9) / 49);
        String var5 = "tele " + arg3 + "," + (arg2 >> 6) + "," + (arg1 >> 6) + "," + (arg2 & 0x3F) + "," + (arg1 & 0x3F);
        System.out.println(var5);
        class92.method745(true, (byte) -95, var5);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(JLjava/lang/Object;I)V")
    public final void method2342(long arg0, Object arg1, int arg2) {
        field5463++;
        int var5 = -126 / ((arg2 + 20) / 32);
        this.method2338(1, (byte) -81, arg1, arg0);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ILcg;)V")
    private final void method2343(int arg0, class90 arg1) {
        field5476++;
        if (arg0 == 64 && arg1 != null) {
            arg1.method2663(-126);
            arg1.method855(51);
            this.field5466 += arg1.field1498;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)I")
    public final int method2344(int arg0) {
        if (arg0 != -12868) {
            method2334((byte) -55);
        }
        field5465++;
        return this.field5457;
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)I")
    public final int method2345(int arg0) {
        field5458++;
        int var2 = 0;
        if (arg0 >= -84) {
            this.method2346(-76);
        }
        for (class90 var3 = (class90) this.field5464.method820(true); var3 != null; var3 = (class90) this.field5464.method816(126)) {
            if (!var3.method733((byte) -126)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method2346(int arg0) {
        field5470++;
        class90 var2 = (class90) this.field5461.method2483(119);
        if (arg0 >= -56) {
            this.method2339(-89, 110L);
        }
        while (var2 != null) {
            Object var3 = var2.method731(174);
            if (var3 != null) {
                return var3;
            }
            class90 var4 = var2;
            var2 = (class90) this.field5461.method2481((byte) -27);
            var4.method2663(-115);
            var4.method855(51);
            this.field5466 += var2.field1498;
        }
        return null;
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLir;)V")
    public static final void method2347(byte arg0, class22 arg1) {
        field5481++;
        boolean var2 = false;
        if (class180.field2734 == arg1.field358 || arg1.field320 == -1 || arg1.field345 != 0) {
            var2 = true;
        } else {
            class357 var3 = class311.field4455.method1233(true, arg1.field320);
            if (var3.field5411 || var3.field5408[arg1.field322] < arg1.field383 + 1) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg1.field358 - arg1.field314;
            int var5 = class180.field2734 - arg1.field314;
            int var6 = arg1.field374 * 128 + arg1.method184(1) * 64;
            int var7 = arg1.field312 * 128 + arg1.method184(1) * 64;
            int var8 = arg1.field386 * 128 + (arg1.method184(1) * 64);
            int var9 = arg1.field399 * 128 + (arg1.method184(1) * 64);
            arg1.field5539 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field5529 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
        }
        arg1.field408 = 0;
        if (arg1.field328 == 0) {
            arg1.method186(15505, 8192);
        }
        if (arg1.field328 == 1) {
            arg1.method186(15505, 12288);
        }
        if (arg1.field328 == 2) {
            arg1.method186(15505, 0);
        }
        if (arg1.field328 == 3) {
            arg1.method186(15505, 4096);
        }
        if (arg0 >= -47) {
            field5475 = null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)V")
    public final void method2348(int arg0, int arg1) {
        int var3 = 21 % ((-arg1 - 82) / 44);
        field5462++;
        if (class84.field1404 == null) {
            return;
        }
        for (class90 var4 = (class90) this.field5464.method820(true); var4 != null; var4 = (class90) this.field5464.method816(124)) {
            if (var4.method733((byte) -74)) {
                if (var4.method731(174) == null) {
                    var4.method2663(-121);
                    var4.method855(51);
                    this.field5466++;
                }
            } else if ((++var4.field1844) > ((long) arg0)) {
                class90 var5 = class84.field1404.method1790(var4, 1758888200);
                this.field5461.method2486(-2, var5, var4.field6399);
                class452.method2719(-3, var5, var4);
                var4.method2663(-114);
                var4.method855(51);
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)V")
    public final void method2349(int arg0) {
        field5478++;
        this.field5464.method815(1690797447);
        this.field5461.method2476(arg0);
        this.field5466 = this.field5457;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V")
    public final void method2350(byte arg0) {
        field5469++;
        if (arg0 != 112) {
            return;
        }
        for (class90 var2 = (class90) this.field5464.method820(true); var2 != null; var2 = (class90) this.field5464.method816(117)) {
            if (var2.method733((byte) -112)) {
                var2.method2663(-109);
                var2.method855(51);
                this.field5466 += var2.field1498;
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(I)V")
    public class364(int arg0) {
        this.field5466 = arg0;
        this.field5457 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field5461 = new class398(var2);
    }

    static {
        new class180("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
        field5474 = 0;
    }
}
