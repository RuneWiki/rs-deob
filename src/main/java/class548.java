import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class548 {

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public int field7244;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Lkg;")
    public static class275 field7241 = new class275(4, 1, 1, 1);

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field7237;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field7238;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "I")
    public static int field7239;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field7240;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field7242;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field7243;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "I")
    public static int field7245;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Z")
    public static final boolean method3062(int arg0, int arg1, int arg2) {
        if (arg1 != 55) {
            return false;
        }
        field7240++;
        if (class593.method3224(arg2, arg0, 22926)) {
            return (arg2 & 0x9000) != 0 | class506.method2843((byte) -73, arg0, arg2) | class536.method2973(arg2, arg0, false) ? true : ((arg2 & 0x2000) != 0 | class672.method3713(arg1 - 123, arg2, arg0) | class598.method3260(arg0, 4, arg2)) & (arg0 & 0x37) == 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method3063(int arg0) {
        field7241 = null;
        if (arg0 <= 34) {
            method3063(-96);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ldg;Ldg;B)V")
    public static final void method3064(class416 arg0, class416 arg1, byte arg2) {
        if (arg1.field5744 != null) {
            arg1.method2414((byte) -26);
        }
        field7238++;
        arg1.field5748 = arg0.field5748;
        arg1.field5744 = arg0;
        arg1.field5744.field5748 = arg1;
        if (arg2 <= -87) {
            arg1.field5748.field5744 = arg1;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BZI)I")
    public static final int method3065(byte arg0, boolean arg1, int arg2) {
        field7242++;
        if (arg1) {
            return 0;
        }
        class287 var3 = class271.method1629(arg1, arg2, (byte) -60);
        if (var3 == null) {
            return class520.field6929.method3343(arg2, -4).field6188;
        }
        int var4 = 0;
        for (int var5 = 0; var5 < var3.field4061.length; var5++) {
            if (var3.field4061[var5] == -1) {
                var4++;
            }
        }
        if (arg0 < 55) {
            field7241 = null;
        }
        return var4 + class520.field6929.method3343(arg2, -4).field6188 - var3.field4061.length;
    }

    @OriginalMember(owner = "client!el", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field7245++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(BLva;Lva;)V")
    public static final void method3066(byte arg0, class499 arg1, class499 arg2) {
        field7239++;
        if (arg2.field6720 != null) {
            arg2.method2815(-125);
        }
        arg2.field6716 = arg1;
        if (arg0 > -86) {
            field7241 = null;
        }
        arg2.field6720 = arg1.field6720;
        arg2.field6720.field6716 = arg2;
        arg2.field6716.field6720 = arg2;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILha;BIIII)Lka;")
    public static final class475 method3067(int arg0, class59 arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field7237++;
        if (arg2 != 63) {
            method3065((byte) -96, true, 39);
        }
        long var7 = (long) arg4;
        class475 var9 = (class475) class362.field5097.method552(4, var7);
        short var10 = 2055;
        if (var9 == null) {
            class538 var11 = class47.method333(0, class13.field205, arg2 - 169, arg4);
            if (var11 == null) {
                return null;
            }
            if (var11.field7109 < 13) {
                var11.method2982((byte) 1, 2);
            }
            var9 = arg1.method401(var11, var10, class500.field6724, 64, 768);
            class362.field5097.method556((byte) 0, var7, var9);
        }
        class475 var12 = var9.method171((byte) 2, var10, true);
        if (arg6 != 0) {
            var12.method146(arg6);
        }
        if (arg3 != 0) {
            var12.method143(arg3);
        }
        if (arg0 != 0) {
            var12.method210(arg0);
        }
        if (arg5 != 0) {
            var12.method188(0, arg5, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)I")
    public final int method3068(int arg0) {
        field7243++;
        if (arg0 != -183) {
            field7241 = null;
        }
        return this.field7244;
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class548(String arg0, int arg1) {
        this.field7244 = arg1;
    }
}
