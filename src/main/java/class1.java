import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!us")
public class class1 {

    @OriginalMember(owner = "client!us", name = "i", descriptor = "Ljk;")
    private class449 field9 = new class449(128);

    @OriginalMember(owner = "client!us", name = "d", descriptor = "Lqn;")
    private class47 field4;

    @OriginalMember(owner = "client!us", name = "h", descriptor = "Z")
    public static boolean field8 = false;

    @OriginalMember(owner = "client!us", name = "f", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6 = new Rectangle[100];

    @OriginalMember(owner = "client!us", name = "a", descriptor = "Lkg;")
    public static class179 field1 = new class179(11, 16);

    @OriginalMember(owner = "client!us", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!us", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!us", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!us", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!us", name = "j", descriptor = "Lqc;")
    public static class524 field10;

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(II)Lst;", line = 3)
    public final class299 method1(int arg0, int arg1) {
        if (arg1 != 16) {
            this.method1(-57, -30);
        }
        field7++;
        class449 var3 = this.field9;
        class299 var4;
        synchronized (this.field9) {
            var4 = (class299) this.field9.method2647(-107, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        byte[] var5 = this.field4.method481(class474.method2857(-82, arg0), class274.method1618((byte) -90, arg0), -120);
        class299 var6 = new class299();
        if (var5 != null) {
            var6.method1770(new class463(var5), false);
        }
        class449 var7 = this.field9;
        synchronized (this.field9) {
            this.field9.method2635((long) arg0, -26591, var6);
            return var6;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(IIB)I", line = 36)
    public static final int method2(int arg0, int arg1, byte arg2) {
        field2++;
        if (arg1 == -2) {
            return 12345678;
        } else if (arg1 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg1 & 0x7F) * arg0 >> 7;
            if (arg2 >= -99) {
                field1 = null;
            }
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg1 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(Lqn;IIZII)V", line = 73)
    public static final void method3(class47 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        class176.field2324 = 1;
        field3++;
        class498.field7216 = arg3;
        class534.field7859 = arg0;
        field5 = arg4;
        int var6 = -128 % ((arg1 + 32) / 53);
        class76.field985 = arg5;
        class156.field1978 = arg2;
        class9.field148 = 10000;
    }

    @OriginalMember(owner = "client!us", name = "a", descriptor = "(I)V", line = 97)
    public static void method4(int arg0) {
        if (arg0 <= 115) {
            method2(-115, -111, (byte) 10);
        }
        field10 = null;
        field1 = null;
        field6 = null;
    }

    @OriginalMember(owner = "client!us", name = "<init>", descriptor = "(Lae;ILqn;)V", line = 124)
    public class1(class165 arg0, int arg1, class47 arg2) {
        this.field4 = arg2;
        if (this.field4 != null) {
            int var4 = this.field4.method472((byte) -82) - 1;
            this.field4.method469(30322, var4);
        }
    }
}
