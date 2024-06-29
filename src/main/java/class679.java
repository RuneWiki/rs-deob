import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class679 implements class630 {

    @OriginalMember(owner = "client!wia", name = "m", descriptor = "I")
    public int field9572;

    @OriginalMember(owner = "client!wia", name = "l", descriptor = "I")
    public int field9571;

    @OriginalMember(owner = "client!wia", name = "i", descriptor = "I")
    public int field9568;

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "Lrq;")
    public class482 field9563;

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    public int field9561;

    @OriginalMember(owner = "client!wia", name = "p", descriptor = "I")
    public int field9575;

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "Lvfa;")
    public class92 field9569;

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
    public int field9562;

    @OriginalMember(owner = "client!wia", name = "k", descriptor = "I")
    public int field9570;

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "I")
    public static int field9565 = -1;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
    public static int field9560;

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "I")
    public static int field9564;

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "I")
    public static int field9566;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "I")
    public static int field9567;

    @OriginalMember(owner = "client!wia", name = "n", descriptor = "I")
    public static int field9573;

    @OriginalMember(owner = "client!wia", name = "o", descriptor = "I")
    public static int field9574;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(I)Lag;")
    public class214 method210(int arg0) {
        if (arg0 != 7288) {
            this.field9562 = 54;
        }
        field9574++;
        return null;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIIIILjava/lang/String;II)V")
    public static final void method3890(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        field9564++;
        class746 var8 = new class746();
        var8.field10389 = arg5;
        var8.field10398 = arg2;
        var8.field10390 = arg0;
        var8.field10395 = arg4;
        if (arg6 < 15) {
            field9565 = -99;
        }
        var8.field10399 = class245.field3409 + arg7;
        var8.field10386 = arg3;
        var8.field10391 = arg1;
        class184.field2669.method1946(-115, var8);
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(BLww;Lww;)V")
    public static final void method3891(byte arg0, class287 arg1, class287 arg2) {
        field9566++;
        if (arg2.field3775 != null) {
            arg2.method1706((byte) 79);
        }
        arg2.field3781 = arg1.field3781;
        if (arg0 != 65) {
            field9573 = 80;
        }
        arg2.field3775 = arg1;
        arg2.field3775.field3781 = arg2;
        arg2.field3781.field3775 = arg2;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(II)I")
    public static final int method3892(int arg0, int arg1) {
        if (arg1 == -7309) {
            field9567++;
            return arg0 >>> 8;
        } else {
            return -115;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(IIB)Ljava/lang/String;")
    public static final String method3893(int arg0, int arg1, byte arg2) {
        field9560++;
        int var3 = arg0 - arg1;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (arg2 < 89) {
            return null;
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!wia", name = "<init>", descriptor = "(Lvfa;Lrq;IIIIIII)V")
    public class679(class92 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field9572 = arg7;
        this.field9571 = arg8;
        this.field9568 = arg6;
        this.field9563 = arg1;
        this.field9561 = arg5;
        this.field9575 = arg4;
        this.field9569 = arg0;
        this.field9562 = arg2;
        this.field9570 = arg3;
    }
}
