import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eka")
public class class489 extends class577 {

    @OriginalMember(owner = "client!eka", name = "l", descriptor = "I")
    public int field6926;

    @OriginalMember(owner = "client!eka", name = "n", descriptor = "[[I")
    public static int[][] field6928 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!eka", name = "m", descriptor = "I")
    public static int field6927;

    @OriginalMember(owner = "client!eka", name = "o", descriptor = "I")
    public static int field6929;

    @OriginalMember(owner = "client!eka", name = "p", descriptor = "I")
    public static int field6930;

    @OriginalMember(owner = "client!eka", name = "c", descriptor = "(B)V", line = 5)
    public static final void method2915(byte arg0) {
        if (class472.field6621 == 1 || class472.field6621 == 3 || class589.field8315 != class472.field6621 && (class472.field6621 == 0 || class589.field8315 == 0)) {
            class36.field483 = 0;
            class235.field3545 = 0;
            class645.field9014.method2240(113);
        }
        field6927++;
        class589.field8315 = class472.field6621;
        if (arg0 >= -37) {
            method2916(null, (byte) -72, -47, -26, true, -82);
        }
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "([Lmea;BIIZI)V", line = 24)
    public static final void method2916(class451[] arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field6929++;
        for (int var6 = 0; var6 < arg0.length; var6++) {
            class451 var7 = arg0[var6];
            if (var7 != null && var7.field6233 == arg3) {
                class656.method3750(arg4, var7, arg2, arg5, (byte) 114);
                class472.method2809((byte) -127, arg2, var7, arg5);
                if (var7.field6292 > (var7.field6301 - var7.field6290)) {
                    var7.field6292 = var7.field6301 - var7.field6290;
                }
                if (var7.field6292 < 0) {
                    var7.field6292 = 0;
                }
                if ((var7.field6169 - var7.field6288) < var7.field6173) {
                    var7.field6173 = var7.field6169 - var7.field6288;
                }
                if (var7.field6173 < 0) {
                    var7.field6173 = 0;
                }
                if (var7.field6210 == 0) {
                    class679.method3849(76, var7, arg4);
                }
            }
        }
        if (arg1 != -11) {
            method2917(null, -37, null);
        }
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "()V", line = 71)
    public class489() {
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lha;ILjp;)I", line = 74)
    public static final int method2917(class65 arg0, int arg1, class374 arg2) {
        field6930++;
        if (arg1 >= -48) {
            return -76;
        } else if (arg2.field5167 == -1) {
            if (arg2.field5164 != -1) {
                class467 var3 = arg0.field774.method1208((byte) 47, arg2.field5164);
                if (!var3.field6570) {
                    return var3.field6571;
                }
            }
            return arg2.field5158;
        } else {
            return arg2.field5167;
        }
    }

    @OriginalMember(owner = "client!eka", name = "<init>", descriptor = "(I)V", line = 98)
    public class489(int arg0) {
        this.field6926 = arg0;
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(Lje;[Lqm;)V", line = 107)
    public static final void method2918(class421 arg0, class154[] arg1) {
        if (class434.field5879) {
            int var2 = arg0.method2458(48, arg1);
            class228.field3494.method461(var2, arg1);
        }
        if (class774.field10642 == class208.field3219) {
            boolean var3 = false;
            boolean var4 = false;
            int var5;
            int var6;
            if (arg0 instanceof class672) {
                var5 = ((class672) arg0).field9368;
                var6 = ((class672) arg0).field9364;
            } else {
                var5 = arg0.field5742 >> class645.field9018;
                var6 = arg0.field5746 >> class645.field9018;
            }
            class228.field3494.method526(class411.field5572[0].method1918(arg0.field5742, (byte) 127, arg0.field5746), class422.method2558(var5, var6), class60.method403(var5, var6), class465.method2783(var5, var6));
        }
        class495 var7 = arg0.method918(class228.field3494, -30514);
        if (var7 == null) {
            return;
        }
        if (arg0.field5750) {
            class711[] var8 = var7.field7067;
            for (int var9 = 0; var9 < var8.length; var9++) {
                class711 var10 = var8[var9];
                if (var10.field9875) {
                    class33.method272(var10.field9872 - var10.field9873, var10.field9876 - var10.field9873, var10.field9874 + var10.field9873, false, var10.field9877 + var10.field9873);
                }
            }
        }
        if (var7.field7062) {
            var7.field7063 = arg0;
            if (class712.field9883) {
                class397 var11 = class510.field7211;
                synchronized (class510.field7211) {
                    class510.field7211.method2448(var7, 0);
                    return;
                }
            }
            class510.field7211.method2448(var7, 0);
            return;
        }
        class121.method919(var7, (byte) -20);
    }

    @OriginalMember(owner = "client!eka", name = "a", descriptor = "(I)V", line = 176)
    public static void method2919(int arg0) {
        field6928 = null;
        int var1 = 63 / ((5 - arg0) / 42);
    }
}
