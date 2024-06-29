import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class423 extends class786 {

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public static int field5567 = 0;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public static int field5576 = 0;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "[I")
    public static int[] field5571 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    public static int field5569;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "I")
    public static int field5570;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public static int field5572;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "I")
    public int field5574;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    public static int field5575;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
    public static int field5577;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "Lcr;")
    public class310 field5573;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5566;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "[B")
    public byte[] field5568;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)I", line = 6)
    public final int method630(boolean arg0) {
        if (!arg0) {
            this.field5574 = -122;
        }
        ++field5575;
        return super.field10779 ? 0 : 100;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)Z", line = 21)
    public static final boolean method2441(int arg0, int arg1, int arg2) {
        if (arg1 != 2365) {
            return true;
        } else {
            ++field5569;
            return class645.method3490(arg0, arg2, -69) || class336.method1940(arg0, 8192, arg2);
        }
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)V", line = 33)
    public static void method2442(int arg0) {
        int var1 = 46 / ((arg0 - 48) / 43);
        field5566 = null;
        field5571 = null;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(ILjava/lang/String;)I", line = 45)
    public static final int method2443(int arg0, String arg1) {
        if (arg0 != 2) {
            field5571 = null;
        }
        ++field5570;
        return 2 + arg1.length();
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)[B", line = 60)
    public final byte[] method629(int arg0) {
        if (arg0 != 0) {
            method2444(-54, 63, -91);
        }
        ++field5577;
        if (super.field10779) {
            throw new RuntimeException();
        } else {
            return this.field5568;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(III)Z", line = 92)
    public static final boolean method2444(int arg0, int arg1, int arg2) {
        ++field5572;
        if (arg1 != 10544) {
            return false;
        } else {
            return ~(55 & arg2) != -1;
        }
    }
}
