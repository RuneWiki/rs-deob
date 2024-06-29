import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class578 {

    @OriginalMember(owner = "client!kga", name = "h", descriptor = "J")
    public long field7331;

    @OriginalMember(owner = "client!kga", name = "b", descriptor = "Ljc;")
    private class179 field7325;

    @OriginalMember(owner = "client!kga", name = "c", descriptor = "Lrn;")
    public static class633 field7326 = new class633(82, 3);

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!kga", name = "d", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!kga", name = "e", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!kga", name = "f", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!kga", name = "g", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIIIZ)Z", line = 4)
    public static final boolean method3100(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field7328++;
        if (!class750.field10229 || !class141.field1854) {
            return false;
        } else if (class430.field5647 < 100) {
            return false;
        } else if (class334.method1928(arg0, (byte) -98, arg3, arg1)) {
            int var5 = arg3 << class88.field1221;
            int var6 = arg1 << class88.field1221;
            if (!arg4) {
                method3104(-86, false, 96, 94, 62);
            }
            if (class726.method3884(arg2, class722.field9480, var5, var6, class116.field1542[arg0].method2060(arg1, -108, arg3), -1, class722.field9480)) {
                class6.field64++;
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(Loq;Ljava/awt/Frame;I)V", line = 35)
    public static final void method3101(class775 arg0, Frame arg1, int arg2) {
        if (arg2 >= -29) {
            field7326 = null;
        }
        while (true) {
            class339 var3 = arg0.method4241(104, arg1);
            while (var3.field4144 == 0) {
                class591.method3181(10L, 0);
            }
            if (var3.field4144 == 1) {
                field7329++;
                arg1.setVisible(false);
                arg1.dispose();
                return;
            }
            class591.method3181(100L, 0);
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IIB)Z", line = 61)
    public static final boolean method3102(int arg0, int arg1, byte arg2) {
        if (arg2 != 105) {
            method3101(null, null, -77);
        }
        field7330++;
        return (arg1 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(I)V", line = 73)
    public static void method3103(int arg0) {
        field7326 = null;
        if (arg0 != 22203) {
            field7326 = null;
        }
    }

    @OriginalMember(owner = "client!kga", name = "a", descriptor = "(IZIII)V", line = 87)
    public static final void method3104(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (!arg1) {
            return;
        }
        if (class498.field6390 <= arg2 && arg2 <= class30.field274) {
            int var5 = class774.method4226(class80.field1131, (byte) -33, class405.field5375, arg3);
            int var6 = class774.method4226(class80.field1131, (byte) -120, class405.field5375, arg4);
            class179.method1148(arg0, arg2, var6, var5, (byte) -123);
        }
        field7324++;
    }

    @OriginalMember(owner = "client!kga", name = "finalize", descriptor = "()V", line = 104)
    protected final void finalize() throws Throwable {
        this.field7325.method1178((byte) -77, this.field7331);
        field7327++;
        super.finalize();
    }

    @OriginalMember(owner = "client!kga", name = "<init>", descriptor = "(Ljc;JI)V", line = 119)
    public class578(class179 arg0, long arg1, int arg2) {
        this.field7331 = arg1;
        this.field7325 = arg0;
    }
}
