import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class391 extends class394 implements class68 {

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "Ljw;")
    public class394 field5964;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "[Lnj;")
    public static class164[] field5980;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "Lla;")
    public static class319 field5976;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field5961;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field5963;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field5965;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field5966;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field5967;

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!nl", name = "C", descriptor = "I")
    public static int field5970;

    @OriginalMember(owner = "client!nl", name = "D", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field5973;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "I")
    public static int field5974;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field5975;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    public static int field5977;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "I")
    public static int field5978;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    public static int field5979;

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "I")
    public static int field5981;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "Laa;")
    public static class341 field5962;

    static {
        new class446("You do not have permission to kick users in this channel.", "Du darfst keine Benutzer aus diesem Chatraum rauswerfen.", "Vous n'êtes pas autorisé à expulser des utilisateurs de ce canal.", "Você não tem permissão para expulsar usuários neste canal.");
        field5980 = new class164[2048];
        field5976 = new class319(31, 8);
    }

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "(I)V", line = 6)
    public static final void method2440(int arg0) {
        class283.field4160.method2127((byte) 121);
        if (arg0 < -98) {
            field5971++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILqa;)Lou;", line = 18)
    public final class437 method136(int arg0, class165 arg1) {
        field5970++;
        if (arg0 != 0) {
            this.method333(true, null);
        }
        return null;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)I", line = 30)
    public final int method332(int arg0) {
        if (arg0 != 6359) {
            method2442((byte) 126);
        }
        field5966++;
        return 0;
    }

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "(I)V", line = 45)
    public final void method175(int arg0) {
        field5979++;
        if (arg0 != 0) {
            field5962 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(B)V", line = 56)
    public static final void method2441(byte arg0) {
        if (arg0 != -111) {
            field5962 = null;
        }
        for (int var1 = 0; var1 < class333.field5187; var1++) {
            int var2 = class224.field3114[var1];
            class24 var3 = (class24) class406.field6158.method1747((long) var2, false);
            if (var3 != null) {
                class17 var4 = var3.field348;
                class215.method1478(var4.field274.field3586, var4, (byte) -125);
            }
        }
        field5974++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lqa;I)V", line = 86)
    public final void method330(class165 arg0, int arg1) {
        field5965++;
        if (arg1 != 14470) {
            this.method332(126);
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)I", line = 98)
    public final int method336(int arg0) {
        field5961++;
        if (arg0 != -6130) {
            field5962 = null;
        }
        return 0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)Z", line = 110)
    public final boolean method339(int arg0) {
        if (arg0 != 3583) {
            field5976 = null;
        }
        field5975++;
        return false;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(Z)Z", line = 121)
    public final boolean method176(boolean arg0) {
        field5977++;
        if (!arg0) {
            this.method135(true, null);
        }
        return false;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BIILqa;)Z", line = 132)
    public final boolean method138(byte arg0, int arg1, int arg2, class165 arg3) {
        if (arg0 <= 121) {
            field5980 = null;
        }
        field5963++;
        return false;
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(ZLqa;)V", line = 149)
    public final void method135(boolean arg0, class165 arg1) {
        field5978++;
        if (arg0) {
            method2440(49);
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(IIILjw;)V", line = 159)
    public class391(int arg0, int arg1, int arg2, class394 arg3) {
        super(arg0, arg1, arg2, arg3.field6029, false, false);
        this.field5964 = arg3;
    }

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "(I)V", line = 169)
    public final void method334(int arg0) {
        field5969++;
        if (arg0 != 29893) {
            field5976 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)I", line = 183)
    public final int method338(int arg0) {
        if (arg0 <= 75) {
            return 24;
        } else {
            field5972++;
            return 0;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILqa;I)Lka;", line = 194)
    public final class334 method337(int arg0, class165 arg1, int arg2) {
        field5968++;
        return arg2 == 14221 ? null : null;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(B)V", line = 206)
    public static void method2442(byte arg0) {
        field5976 = null;
        field5980 = null;
        if (arg0 <= -78) {
            field5962 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ILa;IIILqa;Z)V", line = 219)
    public final void method166(int arg0, class444 arg1, int arg2, int arg3, int arg4, class165 arg5, boolean arg6) {
        field5973++;
        if (arg2 >= -4) {
            field5962 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Lga;III)V", line = 229)
    public static final void method2443(class282 arg0, int arg1, int arg2, int arg3) {
        field5967++;
        if (class466.field6949 != null || class139.field1850 || arg0 == null || class360.method2301(arg1 - 91, arg0) == null) {
            return;
        }
        class466.field6949 = arg0;
        class269.field3744 = class360.method2301(-51, arg0);
        class290.field4238 = arg2;
        class350.field5395 = arg3;
        class163.field2147 = false;
        class132.field1787 = arg1;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZLqa;)V", line = 252)
    public final void method333(boolean arg0, class165 arg1) {
        field5981++;
        if (!arg0) {
            this.method334(-18);
        }
    }
}
