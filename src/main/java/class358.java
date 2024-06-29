import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class358 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
    public int field5677 = 16777215;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public int field5683 = 8;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "[I")
    public static int[] field5685 = new int[100];

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field5682 = "cyan:";

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Z")
    public static boolean field5687 = false;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field5674;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public int field5676;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public int field5679;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field5680;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field5681;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public int field5684;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "I")
    public int field5686;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public int field5688;

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Lth;")
    public static class57 field5675;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "Z")
    public boolean field5678;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lwf;IB)Ljava/lang/String;", line = 6)
    public static final String method2520(class250 arg0, int arg1, byte arg2) {
        field5681++;
        if (!client.method336(arg0).method810((byte) 96, arg1) && arg0.field4166 == null) {
            return null;
        } else if (arg0.field4159 == null || arg1 >= arg0.field4159.length || arg0.field4159[arg1] == null || arg0.field4159[arg1].trim().length() == 0) {
            return class178.field2857 ? "Hidden-" + arg1 : null;
        } else if (arg2 >= -109) {
            return (String) null;
        } else {
            return arg0.field4159[arg1];
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lqm;ZI)V", line = 42)
    public final void method2521(class227 arg0, boolean arg1, int arg2) {
        while (true) {
            int var4 = arg0.method1720((byte) -78);
            if (var4 == 0) {
                field5674++;
                if (arg1) {
                    this.field5676 = 65;
                }
                return;
            }
            this.method2523(arg0, var4, arg2, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 66)
    public static void method2522(byte arg0) {
        field5685 = null;
        field5682 = null;
        int var1 = 118 % ((arg0 - 4) / 42);
        field5675 = null;
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(Lqm;IIB)V", line = 77)
    private final void method2523(class227 arg0, int arg1, int arg2, byte arg3) {
        if (arg3 > -93) {
            this.field5684 = 71;
        }
        if (arg1 == 1) {
            this.field5683 = arg0.method1765(true);
        } else if (arg1 == 2) {
            this.field5678 = true;
        } else if (arg1 == 3) {
            this.field5684 = arg0.method1769(-30726);
            this.field5686 = arg0.method1769(-30726);
            this.field5676 = arg0.method1769(-30726);
        } else if (arg1 == 4) {
            this.field5688 = arg0.method1720((byte) -95);
        } else if (arg1 == 5) {
            this.field5679 = arg0.method1765(true);
        } else if (arg1 == 6) {
            this.field5677 = arg0.method1736(255);
        }
        field5680++;
    }
}
