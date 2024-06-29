import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class274 {

    @OriginalMember(owner = "client!re", name = "c", descriptor = "I")
    public static int field3921 = 0;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "[I")
    public static int[] field3926 = new int[4096];

    @OriginalMember(owner = "client!re", name = "d", descriptor = "I")
    public static int field3922 = 0;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "Ljava/lang/String;")
    public static String field3930 = null;

    @OriginalMember(owner = "client!re", name = "b", descriptor = "I")
    public int field3920;

    @OriginalMember(owner = "client!re", name = "e", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public int field3924;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "I")
    public int field3925;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "I")
    public int field3927;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public int field3929;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public int field3931;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "I")
    public static int field3933;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "[I")
    public static int[] field3919;

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)V", line = 6)
    public static void method1859(int arg0) {
        field3930 = null;
        field3919 = null;
        if (arg0 == -23191) {
            field3926 = null;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Lpm;Ljava/awt/Frame;Z)V", line = 21)
    public static final void method1860(class69 arg0, Frame arg1, boolean arg2) {
        field3933++;
        while (true) {
            class188 var3 = arg0.method493(arg1, false);
            while (var3.field2608 == 0) {
                class177.method1299((byte) 64, 10L);
            }
            if (var3.field2608 == 1) {
                arg1.setVisible(false);
                arg1.dispose();
                if (!arg2) {
                    method1861(52, (short) 56);
                }
                return;
            }
            class177.method1299((byte) 64, 100L);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IS)Z", line = 65)
    public static final boolean method1861(int arg0, short arg1) {
        field3928++;
        if (arg1 == 58 || arg1 == 35 || arg1 == 17 || arg1 == 10 || arg1 == 51 || arg1 == 9 || arg1 == 15 || arg1 == 50) {
            return true;
        } else if (arg1 == 23 || arg1 == 1 || arg1 == 1001 || arg1 == 1009) {
            return true;
        } else {
            if (arg0 < 69) {
                method1860((class69) null, (Frame) null, false);
            }
            if (arg1 == 30 || arg1 == 20 || arg1 == 13 || arg1 == 2 || arg1 == 49) {
                return true;
            } else {
                return arg1 == 57 || arg1 == 34 || arg1 == 7 || arg1 == 18 || arg1 == 11 || arg1 == 3;
            }
        }
    }
}
