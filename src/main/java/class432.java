import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class432 {

    @OriginalMember(owner = "client!cp", name = "g", descriptor = "[I")
    public static int[] field6183;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "I")
    public static int field6177;

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "I")
    public static int field6178;

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "I")
    public static int field6179;

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "I")
    public static int field6180;

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "I")
    public static int field6181;

    @OriginalMember(owner = "client!cp", name = "f", descriptor = "I")
    public static int field6182;

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field6184;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field6185;

    static {
        new class349("For that rule you can only report players who have spoken or traded recently.", "Mit dieser Option können nur Spieler gemeldet werden,", "Cette règle n'est invocable que pour les discussions ou échanges récents.", "Para essa regra, você só pode denunciar jogadores com quem tenha falado ou negociado recentemente.");
        field6183 = new int[4096];
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILjava/lang/String;Z)V", line = 6)
    public static final void method2696(int arg0, String arg1, boolean arg2) {
        if (!arg2) {
            field6182 = 62;
        }
        field6177++;
        class276 var3 = class264.method1816((byte) -120, arg0, 2);
        var3.method1876((byte) -128);
        var3.field3981 = arg1;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(Z)V", line = 23)
    public static void method2697(boolean arg0) {
        if (!arg0) {
            field6183 = null;
        }
        field6183 = null;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BI)Z", line = 35)
    public static final boolean method2698(byte arg0, int arg1) {
        field6181++;
        int var2 = -117 % ((87 - arg0) / 33);
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILtj;IB)Lbb;", line = 47)
    public static final class182 method2699(int arg0, class108 arg1, int arg2, byte arg3) {
        field6179++;
        if (arg3 != -90) {
            method2699(108, (class108) null, 11, (byte) -49);
        }
        byte[] var4 = arg1.method643(arg2, arg0, true);
        return var4 == null ? null : new class182(var4);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(III)V", line = 69)
    public static final void method2700(int arg0, int arg1, int arg2) {
        field6184++;
        class276 var3 = class264.method1816((byte) -125, arg0, 1);
        var3.method1876((byte) -119);
        var3.field3986 = arg1;
        if (arg2 >= -6) {
            field6185 = 18;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BLlf;Ljava/lang/String;)I", line = 83)
    public static final int method2701(byte arg0, class130 arg1, String arg2) {
        field6178++;
        int var3 = arg1.field1880;
        byte[] var4 = class79.method466(0, arg2);
        arg1.method796(1, var4.length);
        int var5 = 90 % ((27 - arg0) / 61);
        arg1.field1880 += class266.field3911.method155(0, (byte) -123, var4.length, arg1.field1851, arg1.field1880, var4);
        return arg1.field1880 - var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)V", line = 110)
    public static final void method2702(int arg0, int arg1) {
        if (class439.field6279 == 0) {
            class213.field3014.method1440(arg1, -102);
        } else {
            class85.field1094 = arg1;
        }
        field6180++;
        if (arg0 < 67) {
            method2698((byte) 109, 2);
        }
    }
}
