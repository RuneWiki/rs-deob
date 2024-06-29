import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class708 extends class154 implements class349 {

    @OriginalMember(owner = "client!nfa", name = "q", descriptor = "C")
    public char field9738;

    @OriginalMember(owner = "client!nfa", name = "i", descriptor = "I")
    public static int field9730;

    @OriginalMember(owner = "client!nfa", name = "j", descriptor = "I")
    public int field9731;

    @OriginalMember(owner = "client!nfa", name = "k", descriptor = "I")
    public static int field9732;

    @OriginalMember(owner = "client!nfa", name = "l", descriptor = "I")
    public static int field9733;

    @OriginalMember(owner = "client!nfa", name = "m", descriptor = "I")
    public int field9734;

    @OriginalMember(owner = "client!nfa", name = "o", descriptor = "I")
    public int field9736;

    @OriginalMember(owner = "client!nfa", name = "p", descriptor = "I")
    public static int field9737;

    @OriginalMember(owner = "client!nfa", name = "r", descriptor = "I")
    public static int field9739;

    @OriginalMember(owner = "client!nfa", name = "s", descriptor = "I")
    public static int field9740;

    @OriginalMember(owner = "client!nfa", name = "t", descriptor = "I")
    public static int field9741;

    @OriginalMember(owner = "client!nfa", name = "n", descriptor = "J")
    public long field9735;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(B)I")
    public final int method2151(byte arg0) {
        if (arg0 == -50) {
            field9737++;
            return this.field9731;
        } else {
            return 45;
        }
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(B)Lcl;")
    public static final class281 method3951(byte arg0) {
        field9733++;
        class281 var1 = (class281) class38.field639.method1951(-723780560);
        if (var1 != null) {
            var1.method1207(122);
            var1.method2942(false);
            return var1;
        }
        if (arg0 >= -115) {
            method3952((byte) -80, null, true, 30, -36);
        }
        class281 var2;
        do {
            var2 = (class281) class191.field2934.method1951(-723780560);
            if (var2 == null) {
                return null;
            }
            if (var2.method1817((byte) -10) > class197.method1423(1)) {
                return null;
            }
            var2.method1207(125);
            var2.method2942(false);
        } while ((Long.MIN_VALUE & var2.field7008) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "(I)I")
    public final int method2152(int arg0) {
        field9732++;
        int var2 = 46 % ((arg0 + 8) / 40);
        return this.field9736;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)I")
    public final int method2153(boolean arg0) {
        field9741++;
        if (arg0) {
            method3952((byte) -92, null, true, -84, -75);
        }
        return this.field9734;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(I)J")
    public final long method2150(int arg0) {
        if (arg0 != 11419) {
            this.field9734 = 92;
        }
        field9739++;
        return this.field9735;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(BLkh;ZII)V")
    public static final void method3952(byte arg0, class17 arg1, boolean arg2, int arg3, int arg4) {
        field9740++;
        int var5 = arg1.field347;
        if (arg1.field388 == 0) {
            arg1.field347 = arg1.field376;
        } else if (arg1.field388 == 1) {
            arg1.field347 = arg3 - arg1.field376;
        } else if (arg1.field388 == 2) {
            arg1.field347 = arg1.field376 * arg3 >> 14;
        }
        int var6 = arg1.field330;
        if (arg1.field266 == 0) {
            arg1.field330 = arg1.field335;
        } else if (arg1.field266 == 1) {
            arg1.field330 = arg4 - arg1.field335;
        } else if (arg1.field266 == 2) {
            arg1.field330 = arg1.field335 * arg4 >> 14;
        }
        if (arg1.field388 == 4) {
            arg1.field347 = arg1.field330 * arg1.field299 / arg1.field243;
        }
        if (arg1.field266 == 4) {
            arg1.field330 = arg1.field347 * arg1.field243 / arg1.field299;
        }
        if (class178.field2814 && (client.method2010(arg1).field9638 != 0 || arg1.field352 == 0)) {
            if (arg1.field330 < 5 && arg1.field347 < 5) {
                arg1.field347 = 5;
                arg1.field330 = 5;
            } else {
                if (arg1.field347 <= 0) {
                    arg1.field347 = 5;
                }
                if (arg1.field330 <= 0) {
                    arg1.field330 = 5;
                }
            }
        }
        if (class323.field4424 == arg1.field379) {
            class450.field6174 = arg1;
        }
        if (arg0 <= -56 && arg2 && arg1.field380 != null && arg1.field347 != var5 || arg1.field330 != var6) {
            class255 var7 = new class255();
            var7.field3583 = arg1;
            var7.field3586 = arg1.field380;
            class7.field124.method3594((byte) -70, var7);
        }
    }

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "(I)C")
    public final char method2154(int arg0) {
        field9730++;
        int var2 = 47 % ((48 - arg0) / 55);
        return this.field9738;
    }
}
