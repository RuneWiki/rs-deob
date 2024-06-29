import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sn")
public class class263 extends class509 {

    @OriginalMember(owner = "client!sn", name = "z", descriptor = "I")
    public static int field3900 = 0;

    @OriginalMember(owner = "client!sn", name = "q", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!sn", name = "r", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!sn", name = "s", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!sn", name = "t", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!sn", name = "u", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!sn", name = "v", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!sn", name = "w", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!sn", name = "x", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!sn", name = "y", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IBI)V")
    public final void method43(int arg0, byte arg1, int arg2) {
        ++field3897;
        if (arg1 != -60) {
            this.method40(121);
        }
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(III)Z")
    public static final boolean method1684(int arg0, int arg1, int arg2) {
        if (arg0 != -2736) {
            return true;
        } else {
            ++field3893;
            if (!(~(arg1 & 65536) != -1 | class587.method3425(arg2, arg1, 112)) && !class229.method1497((byte) -110, arg1, arg2)) {
                return (55 & arg2) == 0 && class133.method812(arg1, 5, arg2);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZB)V")
    public final void method35(boolean arg0, byte arg1) {
        int var3 = -104 / ((40 - arg1) / 36);
        ++field3894;
    }

    @OriginalMember(owner = "client!sn", name = "e", descriptor = "(I)V")
    public static final void method1685(int arg0) {
        if (arg0 != 0) {
            method1685(-30);
        }
        class49.field573.method2037(true);
        ++field3898;
    }

    @OriginalMember(owner = "client!sn", name = "<init>", descriptor = "(Lkw;)V")
    public class263(class174 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(B)V")
    public final void method38(byte arg0) {
        if (arg0 != 59) {
            field3900 = -98;
        }
        ++field3896;
    }

    @OriginalMember(owner = "client!sn", name = "b", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        ++field3892;
        return arg0 < 44;
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(ZILmn;)V")
    public final void method42(boolean arg0, int arg1, class60 arg2) {
        super.field7558.method1152(arg2, arg0);
        ++field3895;
        super.field7558.method1142(192, arg1);
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(IZ)V")
    public final void method39(int arg0, boolean arg1) {
        ++field3891;
        if (arg0 != 0) {
            field3900 = -69;
        }
    }

    @OriginalMember(owner = "client!sn", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1686(String arg0, int arg1) {
        ++field3899;
        if (!arg0.equals("")) {
            class165.method1046(-3466, class40.field444);
            ++class622.field9110;
            class221.field3268.method2563(-13021, class83.method488(-127, arg0));
            class221.field3268.method2580(arg0, 30127);
            if (arg1 > -65) {
                field3900 = -118;
            }
        }
    }
}
