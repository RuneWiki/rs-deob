import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class245 extends class287 {

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public int field4089 = 0;

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "[I")
    public int[] field4094 = new int[5];

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "[Lsb;")
    public class165[] field4107 = new class165[5];

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    public int field4090;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    public int field4088;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "Ltl;")
    public static class59 field4080 = class85.method639("welle2:", 9588);

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "Ltl;")
    public static class59 field4100 = class85.method639("m", 9588);

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field4075;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field4076;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field4078;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field4079;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field4082;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public static int field4083;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public int field4091;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public int field4092;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "I")
    public int field4093;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public static int field4102;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "I")
    public int field4106;

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "Lih;")
    public class133 field4103;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "Lsk;")
    public class201 field4098;

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "Lnh;")
    public class222 field4104;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "Lcd;")
    public class245 field4084;

    @OriginalMember(owner = "client!cd", name = "J", descriptor = "Lme;")
    public static class295 field4099;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Ljb;")
    public class296 field4085;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "Lhh;")
    public class79 field4105;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Lb;")
    public class83 field4097;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Z")
    public boolean field4081;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "Z")
    public boolean field4087;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "Z")
    public boolean field4095;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "[I")
    public static int[] field4077;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 12)
    public static void method1732(byte arg0) {
        field4099 = null;
        field4100 = null;
        field4077 = null;
        if (arg0 == 6) {
            field4080 = null;
        }
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "(I)V", line = 25)
    public static final void method1733(int arg0) {
        class288.field4942 = (int[][][]) null;
        class306.field5195 = (short[][][]) null;
        class78.field1248 = arg0;
        class248.field4134 = (byte[][][]) null;
        class14.field202 = null;
        class262.field4366 = (byte[][][]) null;
        field4076++;
        class183.field3062 = (byte[][][]) null;
        class11.field148 = (byte[][][]) null;
        class162.field2647 = (int[][][]) null;
        class53.field788 = null;
        class213.field3495 = null;
        class131.field2169 = (byte[][][]) null;
        class36.field529.method530(arg0 - 15068);
        class40.field606 = null;
        class45.field741 = null;
        class97.field1559 = null;
        class23.field310 = null;
        class228.field3679 = null;
        class100.field1609 = null;
        class178.field2921 = null;
        class102.field1673 = null;
        class209.field3413 = null;
        class306.field5192 = null;
        class296.field5080 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILs;Ltl;)I", line = 59)
    public static final int method1734(int arg0, class170 arg1, class59 arg2) {
        field4079++;
        int var3 = arg1.field2787;
        arg1.method1212(arg0, arg2.field863);
        arg1.field2787 += class303.field5159.method131(arg2.field889, 0, arg1.field2787, arg1.field2758, (byte) 127, arg2.field863);
        return arg1.field2787 - var3;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(III)V", line = 70)
    public class245(int arg0, int arg1, int arg2) {
        this.field4090 = arg2;
        this.field4101 = this.field4088 = arg0;
        this.field4086 = arg1;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ls;I)Lwc;", line = 109)
    public static final class161 method1735(class170 arg0, int arg1) {
        field4102++;
        if (arg1 != 0) {
            field4099 = (class295) null;
        }
        return new class161(arg0.method1210(arg1 ^ 0xFFFFFF85), arg0.method1210(arg1 ^ 0xFFFFFFAD), arg0.method1210(arg1 - 95), arg0.method1210(arg1 ^ 0xFFFFFFAF), arg0.method1208((byte) -113), arg0.method1208((byte) -117), arg0.method1221(88));
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BI)V", line = 123)
    public static final void method1736(byte arg0, int arg1) {
        if (arg0 != 116) {
            method1735((class170) null, -6);
        }
        field4078++;
        if (class147.field2401 == null || arg1 > class147.field2401.length) {
            class147.field2401 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V", line = 159)
    public static final void method1737(int arg0) {
        field4083++;
        for (class286 var1 = (class286) class173.field2839.method536(2); var1 != null; var1 = (class286) class173.field2839.method533(24)) {
            if (var1.field4928 > 0) {
                var1.field4928--;
            }
            if (var1.field4928 != 0) {
                if (var1.field4925 > 0) {
                    var1.field4925--;
                }
                if (var1.field4925 == 0 && var1.field4921 >= 1 && var1.field4910 >= 1 && var1.field4921 <= 102 && var1.field4910 <= 102 && (var1.field4922 < 0 || class86.method646(var1.field4911, var1.field4922, (byte) -113))) {
                    class14.method98(var1.field4913, false, var1.field4910, var1.field4911, var1.field4922, var1.field4926, var1.field4921, var1.field4929);
                    var1.field4925 = -1;
                    if (var1.field4922 == var1.field4909 && var1.field4909 == -1) {
                        var1.method2000(40);
                    } else if (var1.field4922 == var1.field4909 && var1.field4929 == var1.field4919 && var1.field4915 == var1.field4911) {
                        var1.method2000(-51);
                    }
                }
            } else if (var1.field4909 < 0 || class86.method646(var1.field4915, var1.field4909, (byte) -113)) {
                class14.method98(var1.field4913, false, var1.field4910, var1.field4915, var1.field4909, var1.field4926, var1.field4921, var1.field4919);
                var1.method2000(arg0 ^ 0xFFFFAE74);
            }
        }
        if (arg0 != 20933) {
            method1733(35);
        }
    }
}
