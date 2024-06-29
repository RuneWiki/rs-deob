import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class54 {

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "I")
    public int field846;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[S")
    public short[] field837;

    @OriginalMember(owner = "client!fb", name = "r", descriptor = "[Lve;")
    public class255[] field854;

    @OriginalMember(owner = "client!fb", name = "n", descriptor = "[B")
    public byte[] field850;

    @OriginalMember(owner = "client!fb", name = "s", descriptor = "[S")
    public short[] field855;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "[I")
    public int[] field843;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "Lve;")
    public static class255 field842 = class87.method607(107, "<col=40ff00>");

    @OriginalMember(owner = "client!fb", name = "k", descriptor = "Lve;")
    public static class255 field847 = class87.method607(123, "Sprites geladen)3");

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "Lve;")
    private static class255 field844 = class87.method607(61, "Prepared sound engine");

    @OriginalMember(owner = "client!fb", name = "m", descriptor = "Lve;")
    public static class255 field849 = field844;

    @OriginalMember(owner = "client!fb", name = "o", descriptor = "Lve;")
    public static class255 field851 = class87.method607(92, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!fb", name = "p", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field852 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!fb", name = "v", descriptor = "Lve;")
    private static class255 field858 = class87.method607(52, "Discard");

    @OriginalMember(owner = "client!fb", name = "x", descriptor = "Lve;")
    public static class255 field860 = field858;

    @OriginalMember(owner = "client!fb", name = "y", descriptor = "Lve;")
    public static class255 field861 = class87.method607(110, ")3");

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field841;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "I")
    public static int field845;

    @OriginalMember(owner = "client!fb", name = "l", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!fb", name = "q", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fb", name = "t", descriptor = "I")
    public static int field856;

    @OriginalMember(owner = "client!fb", name = "u", descriptor = "I")
    public static int field857;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "Lch;")
    public static class131 field838;

    @OriginalMember(owner = "client!fb", name = "w", descriptor = "Lvi;")
    public static class5 field859;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lve;B)I", line = 6)
    public static final int method334(class255 arg0, byte arg1) {
        field839++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class33.field529; var2++) {
            if (arg0.method1779(117, class32.field519[var2])) {
                return var2;
            }
        }
        if (arg1 == 54) {
            return -1;
        } else {
            return 23;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)I", line = 46)
    public final int method335(int arg0, int arg1) {
        field845++;
        if (arg0 != 3) {
            field860 = (class255) null;
        }
        return this.field850[arg1] & 0x3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 57)
    public static void method336(int arg0) {
        field849 = null;
        field851 = null;
        field861 = null;
        field842 = null;
        field858 = null;
        field847 = null;
        field838 = null;
        field852 = null;
        if (arg0 == 2) {
            field844 = null;
            field860 = null;
            field859 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 86)
    public static final void method337(byte arg0) {
        class148.field2502.method553(116);
        field848++;
        if (arg0 >= -7) {
            method340(-126, -37);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IB)Z", line = 100)
    public final boolean method338(int arg0, byte arg1) {
        field841++;
        if (arg1 != -20) {
            method340(-71, 8);
        }
        return (this.field850[arg0] & 0x4) != 0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILhc;IBIII)V", line = 113)
    public static final void method339(int arg0, class163 arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        field853++;
        boolean var7 = true;
        if (arg3 != 68) {
            return;
        }
        boolean var8 = false;
        long var9 = 0L;
        boolean var11 = false;
        if (arg4 == 0) {
            var9 = class252.method1727(arg2, arg6, arg0);
        } else if (arg4 == 1) {
            var9 = class90.method648(arg2, arg6, arg0);
        } else if (arg4 == 2) {
            var9 = class53.method324(arg2, arg6, arg0);
        } else if (arg4 == 3) {
            var9 = class56.method347(arg2, arg6, arg0);
        }
        int var12 = ((int) var9 & 0x37F1BC) >> 20;
        int var13 = ((int) var9 & 0x7F8DB) >> 14;
        int var14 = (int) (var9 >>> 32) & Integer.MAX_VALUE;
        class145 var15 = class289.method2046(-12453, var14);
        if (var15.method1075(true)) {
            class264.method1834(arg6, arg0, false, arg2, var15);
        }
        if (var9 == 0L) {
            return;
        }
        class177 var16 = null;
        class177 var17 = null;
        if (arg4 == 0) {
            class216 var18 = class294.method2076(arg2, arg6, arg0);
            if (var18 != null) {
                var16 = var18.field3668;
                var17 = var18.field3663;
            }
            if (var15.field2446 != 0) {
                arg1.method1181(var13, arg6, arg0, var15.field2472, -1, var12);
            }
        } else if (arg4 == 1) {
            class213 var19 = class212.method1521(arg2, arg6, arg0);
            if (var19 != null) {
                var17 = var19.field3634;
                var16 = var19.field3637;
            }
        } else if (arg4 == 2) {
            class250 var21 = class280.method1945(arg2, arg6, arg0);
            if (var21 != null) {
                var17 = var21.field4215;
            }
            if (var15.field2446 != 0 && arg6 + var15.field2442 < 104 && var15.field2442 + arg0 < 104 && var15.field2444 + arg6 < 104 && var15.field2444 + arg0 < 104) {
                arg1.method1186(var15.field2444, arg0, var15.field2442, var12, arg6, var15.field2472, false);
            }
        } else if (arg4 == 3) {
            class304 var20 = class211.method1511(arg2, arg6, arg0);
            if (var20 != null) {
                var17 = var20.field5194;
            }
            if (var15.field2446 == 1) {
                arg1.method1187(false, arg0, arg6);
            }
        }
        if (!class281.field4827 || !var15.field2480) {
            return;
        }
        if (var13 == 2) {
            if ((var17 instanceof class72)) {
                ((class72) var17).method517((byte) 95);
            } else {
                class9.method48(0, 0, arg0, true, var12 + 4, arg5, arg6, var15, var13);
            }
            if (var16 instanceof class72) {
                ((class72) var16).method517((byte) 95);
            } else {
                class9.method48(0, 0, arg0, true, var12 + 1 & 0x3, arg5, arg6, var15, var13);
            }
        } else if (var13 == 5) {
            if (var17 instanceof class72) {
                ((class72) var17).method517((byte) 95);
            } else {
                class9.method48(class264.field4475[var12] * 8, class253.field4260[var12] * 8, arg0, true, var12, arg5, arg6, var15, 4);
            }
        } else if (var13 == 6) {
            if (var17 instanceof class72) {
                ((class72) var17).method517((byte) 95);
            } else {
                class9.method48(class14.field197[var12] * 8, class24.field374[var12] * 8, arg0, true, var12 + 4, arg5, arg6, var15, 4);
            }
        } else if (var13 == 7) {
            if ((var17 instanceof class72)) {
                ((class72) var17).method517((byte) 95);
            } else {
                class9.method48(0, 0, arg0, true, (var12 + 2 & 0x3) + 4, arg5, arg6, var15, 4);
            }
        } else if (var13 == 8) {
            if ((var17 instanceof class72)) {
                ((class72) var17).method517((byte) 95);
            } else {
                class9.method48(class14.field197[var12] * 8, class24.field374[var12] * 8, arg0, true, var12 + 4, arg5, arg6, var15, 4);
            }
            if ((var16 instanceof class72)) {
                ((class72) var16).method517((byte) 95);
            } else {
                class9.method48(class14.field197[var12] * 8, class24.field374[var12] * 8, arg0, true, (var12 + 2 & 0x3) + 4, arg5, arg6, var15, 4);
            }
        } else if (var13 == 11) {
            if ((var17 instanceof class72)) {
                ((class72) var17).method517((byte) 95);
            } else {
                class9.method48(0, 0, arg0, true, var12 + 4, arg5, arg6, var15, 10);
            }
        } else if ((var17 instanceof class72)) {
            ((class72) var17).method517((byte) 95);
        } else {
            class9.method48(0, 0, arg0, true, var12, arg5, arg6, var15, var13);
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(I)V", line = 313)
    public class54(int arg0) {
        this.field846 = arg0;
        this.field837 = new short[this.field846];
        this.field854 = new class255[this.field846];
        this.field850 = new byte[this.field846];
        this.field855 = new short[this.field846];
        this.field843 = new int[this.field846];
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(II)V", line = 333)
    public static final void method340(int arg0, int arg1) {
        class297.field5088 = 50;
        field856++;
        if (arg0 >= -98) {
            method341(93, 79, -22, -102, -39, -63, 99);
        }
        class150.field2549 = arg1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIII)I", line = 354)
    public static final int method341(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg0 & 0x1) == 1) {
            int var7 = arg1;
            arg1 = arg5;
            arg5 = var7;
        }
        if (arg3 != 7) {
            method334((class255) null, (byte) 105);
        }
        int var8 = arg2 & 0x3;
        field840++;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg6;
        } else if (var8 == 2) {
            return 8 - arg1 - arg4;
        } else {
            return 7 + 1 - (arg5 + arg6);
        }
    }
}
