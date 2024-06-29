import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class200 extends class140 implements class68 {

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Lhi;")
    public class140 field2690;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "[[[I")
    public static int[][][] field2687 = new int[2][][];

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "[I")
    public static int[] field2698 = new int[64];

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field2683;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "Laa;")
    public static class341 field2697;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIILbb;Lbb;)V", line = 5)
    public static final void method1356(int arg0, int arg1, int arg2, class222 arg3, class222 arg4) {
        class452 var5 = class2.method8(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field6809 = arg3;
            var5.field6815 = arg4;
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(I)V", line = 17)
    public final void method334(int arg0) {
        if (arg0 == 29893) {
            field2691++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 29)
    public static final void method1357(int arg0, String arg1, boolean arg2) {
        class502.field7407.field2559 = 1;
        field2693++;
        String var3 = arg1.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        for (int var6 = 0; var6 < class103.field1489.field3419; var6++) {
            class74 var9 = class103.field1489.method1603((byte) -99, var6);
            if ((!arg2 || var9.field1022) && var9.field1091 == -1 && var9.field1026 == -1 && var9.field1017 == 0 && var9.field1077.toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 250) {
                    class92.field1365 = -1;
                    class66.field943 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        if (arg0 != -23922) {
            method1358(-71);
        }
        class48.field693 = 0;
        class92.field1365 = var5;
        class66.field943 = var4;
        String[] var7 = new String[class92.field1365];
        for (int var8 = 0; var8 < class92.field1365; var8++) {
            var7[var8] = class103.field1489.method1603((byte) -99, var4[var8]).field1077;
        }
        class168.method1135(var7, false, class66.field943);
        class502.field7407.method1269(121);
        class502.field7407.field2559 = 2;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)I", line = 107)
    public final int method336(int arg0) {
        field2688++;
        if (arg0 != -6130) {
            field2687 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lqa;I)V", line = 118)
    public final void method330(class165 arg0, int arg1) {
        field2702++;
        if (arg1 != 14470) {
            this.field2690 = null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILqa;I)Lka;", line = 132)
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        if (arg2 == 14221) {
            field2696++;
            return null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)I", line = 143)
    public final int method338(int arg0) {
        field2686++;
        if (arg0 <= 75) {
            this.field2690 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(ZLqa;)V", line = 154)
    public final void method135(boolean arg0, class165 arg1) {
        field2684++;
        if (arg0) {
            this.method339(-28);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BIILqa;)Z", line = 164)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        field2694++;
        if (arg0 <= 121) {
            field2687 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)I", line = 179)
    public final int method332(int arg0) {
        if (arg0 == 6359) {
            field2692++;
            return 0;
        } else {
            return 95;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILa;IIILqa;Z)V", line = 190)
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        field2701++;
        if (arg2 >= -4) {
            this.method337(-58, null, 41);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)Z", line = 200)
    public final boolean method339(int arg0) {
        field2699++;
        return arg0 != 3583;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)I", line = 211)
    public final int method174(byte arg0) {
        if (arg0 > -126) {
            this.method135(false, null);
        }
        field2685++;
        return 0;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(IIIIIIIIIILhi;)V", line = 225)
    public class200(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class140 arg10) {
        super(arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, false, class452.method2754((byte) -2, arg0, arg1));
        this.field2690 = arg10;
    }

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "(I)V", line = 235)
    public final void method175(int arg0) {
        if (arg0 == 0) {
            field2703++;
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(Z)Z", line = 245)
    public final boolean method176(boolean arg0) {
        if (!arg0) {
            method1359(null, (byte) -47);
        }
        field2683++;
        return false;
    }

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "(I)V", line = 263)
    public static void method1358(int arg0) {
        field2687 = null;
        field2698 = null;
        field2697 = null;
        if (arg0 != -1) {
            method1357(17, null, true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([IB)Ljava/lang/String;", line = 275)
    public static final String method1359(int[] arg0, byte arg1) {
        field2695++;
        if (arg1 != 116) {
            method1357(-5, null, false);
        }
        StringBuffer var2 = new StringBuffer();
        int var3 = class267.field3713;
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class347 var5 = class529.field7758.method1580(arg1 - 16, arg0[var4]);
            if (var5.field5347 != -1) {
                class341 var6 = (class341) class10.field177.method2133((long) var5.field5347, (byte) 110);
                if (var6 == null) {
                    class252 var7 = class252.method1630(class266.field3709, var5.field5347, 0);
                    if (var7 != null) {
                        var6 = class400.field6090.method774(var7, true);
                        class10.field177.method2131(var6, (long) var5.field5347, false);
                    }
                }
                if (var6 != null) {
                    class311.field4548[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    var3++;
                }
            }
        }
        return var2.toString();
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILqa;)Lou;", line = 326)
    public final class437 method136(int arg0, class165 arg1) {
        field2700++;
        if (arg0 != 0) {
            this.method138((byte) 72, -40, -114, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ZLqa;)V", line = 337)
    public final void method333(boolean arg0, class165 arg1) {
        if (!arg0) {
            method1356(111, -115, -45, null, null);
        }
        field2689++;
    }
}
