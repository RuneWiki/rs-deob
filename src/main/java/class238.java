import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class238 {

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Ljn;")
    private class117 field3516 = new class117(64);

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "Lvo;")
    private class345 field3509;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "Leda;")
    public static class116 field3508 = new class116(23, -1);

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field3511 = 0;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field3515 = 0;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)V", line = 4)
    public static void method1550(int arg0) {
        field3508 = null;
        if (arg0 != 10) {
            field3515 = 113;
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ILjava/lang/String;I)V", line = 16)
    public static final void method1551(int arg0, String arg1, int arg2) {
        field3507++;
        class255.method1625(false);
        class67.method560(-114);
        class265.method1684(6);
        class122.method982(false, arg2, arg1);
        class173.method1276(19566);
        class303.method1856((byte) 124, class637.field9048);
        if (arg0 > -93) {
            method1550(107);
        }
        class9.method53(-1, class637.field9048);
        class163.method1239(class468.field6754, true, class637.field9048);
        class521.method3073((byte) -108);
        class616.method3476(class541.field7948, (byte) 117);
        class498.method2983(56);
        class69.method566((byte) -122);
        if (class515.field7636 == 3) {
            class595.method3408((byte) 84, 4);
        } else if (class515.field7636 == 7) {
            class595.method3408((byte) 25, 8);
        } else if (class515.field7636 == 10) {
            class595.method3408((byte) 72, 11);
        } else if (class515.field7636 == 1 || class515.field7636 == 2) {
            class343.method2057((byte) -71);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(I)V", line = 59)
    public final void method1552(int arg0) {
        if (arg0 != -26061) {
            this.field3516 = null;
        }
        class117 var2 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method950((byte) -128);
        }
        field3510++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II)V", line = 73)
    public final void method1553(int arg0, int arg1) {
        field3514++;
        class117 var3 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method939(28093, arg0);
        }
        if (arg1 <= 69) {
            method1550(5);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZI)Lqfa;", line = 88)
    public final class349 method1554(boolean arg0, int arg1) {
        field3512++;
        class117 var3 = this.field3516;
        class349 var4;
        synchronized (this.field3516) {
            var4 = (class349) this.field3516.method941((long) arg1, 0);
        }
        if (var4 != null) {
            return var4;
        }
        class345 var5 = this.field3509;
        byte[] var6;
        synchronized (this.field3509) {
            var6 = this.field3509.method2081(21, arg1, 11);
            if (arg0) {
                this.method1555(15);
            }
        }
        class349 var7 = new class349();
        if (var6 != null) {
            var7.method2124((byte) 106, new class465(var6));
        }
        class117 var8 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method949((long) arg1, true, var7);
            return var7;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V", line = 128)
    public final void method1555(int arg0) {
        if (arg0 != 11) {
            return;
        }
        class117 var2 = this.field3516;
        synchronized (this.field3516) {
            this.field3516.method936(-68);
        }
        field3513++;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lgn;ILvo;)V", line = 144)
    public class238(class529 arg0, int arg1, class345 arg2) {
        this.field3509 = arg2;
        if (this.field3509 != null) {
            this.field3509.method2098(0, 11);
        }
    }
}
