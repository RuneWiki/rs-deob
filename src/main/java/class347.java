import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class347 implements class528 {

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "I")
    public static int field4822;

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "I")
    public static int field4826;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(JB[ILho;)Ljava/lang/String;")
    public final String method2097(long arg0, byte arg1, int[] arg2, class102 arg3) {
        field4822++;
        if (class252.field3710 == arg3) {
            class64 var6 = class342.field4735.method1535(arg2[0], arg1 - 186);
            return var6.method574(111, (int) arg0);
        }
        if (arg1 != 85) {
            method2098(-122, 28);
        }
        if (class280.field4095 == arg3 || class58.field670 == arg3) {
            class72 var7 = class270.field3995.method6(22883, (int) arg0);
            return var7.field929;
        } else if (class512.field7553 == arg3 || class118.field1645 == arg3 || class200.field2923 == arg3) {
            return class342.field4735.method1535(arg2[0], arg1 ^ 0xFFFFFFF5).method574(115, (int) arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I")
    public static final int method2098(int arg0, int arg1) {
        if (arg1 != -1886501846) {
            field4824 = -116;
        }
        field4826++;
        return arg0 >>> 10;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIIIZIILjava/lang/String;)V")
    public static final void method2099(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, String arg7) {
        field4823++;
        class251 var8 = new class251();
        var8.field3705 = arg0;
        if (arg4) {
            method2099(-18, -44, -55, -74, false, 16, 0, null);
        }
        var8.field3701 = arg2;
        var8.field3695 = class263.field3867 + arg1;
        var8.field3703 = arg5;
        var8.field3692 = arg7;
        var8.field3694 = arg3;
        var8.field3704 = arg6;
        class24.field272.method2948(-120, var8);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IB)Lsb;")
    public static final class191 method2100(int arg0, byte arg1) {
        if (arg1 != -117) {
            method2099(-115, -30, -77, 33, false, -89, 40, null);
        }
        field4825++;
        if (arg0 == 0) {
            if ((double) class399.field5902 == 3.0D) {
                return class21.field238;
            }
            if ((double) class399.field5902 == 4.0D) {
                return class297.field4264;
            }
            if ((double) class399.field5902 == 6.0D) {
                return class88.field1194;
            }
            if ((double) class399.field5902 >= 8.0D) {
                return class460.field6746;
            }
        } else if (arg0 == 1) {
            if ((double) class399.field5902 == 3.0D) {
                return class88.field1194;
            }
            if ((double) class399.field5902 == 4.0D) {
                return class460.field6746;
            }
            if ((double) class399.field5902 == 6.0D) {
                return class227.field3309;
            }
            if ((double) class399.field5902 >= 8.0D) {
                return class502.field7449;
            }
        } else if (arg0 == 2) {
            if ((double) class399.field5902 == 3.0D) {
                return class227.field3309;
            }
            if ((double) class399.field5902 == 4.0D) {
                return class502.field7449;
            }
            if ((double) class399.field5902 == 6.0D) {
                return class403.field5975;
            }
            if ((double) class399.field5902 >= 8.0D) {
                return class282.field4108;
            }
        }
        return null;
    }

    static {
        new class331("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
        field4824 = 0;
    }
}
