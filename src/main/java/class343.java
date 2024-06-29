import java.applet.Applet;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class343 extends class766 {

    @OriginalMember(owner = "client!vja", name = "o", descriptor = "I")
    public int field4869 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vja", name = "q", descriptor = "I")
    public int field4871 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vja", name = "r", descriptor = "I")
    public int field4872 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vja", name = "n", descriptor = "I")
    public int field4868 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vja", name = "s", descriptor = "I")
    public int field4873 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vja", name = "w", descriptor = "I")
    public int field4877 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!vja", name = "y", descriptor = "I")
    public int field4879 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vja", name = "x", descriptor = "I")
    public int field4878 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!vja", name = "u", descriptor = "Ljg;")
    public class770 field4875;

    @OriginalMember(owner = "client!vja", name = "t", descriptor = "Lhk;")
    public static class153 field4874 = new class153(4, 1, 1, 1);

    @OriginalMember(owner = "client!vja", name = "B", descriptor = "[I")
    public static int[] field4882 = new int[120];

    @OriginalMember(owner = "client!vja", name = "p", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!vja", name = "v", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!vja", name = "z", descriptor = "I")
    public static int field4880;

    @OriginalMember(owner = "client!vja", name = "C", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!vja", name = "A", descriptor = "Ljava/applet/Applet;")
    public static Applet field4881;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 120; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field4882[var1] = var0 / 4;
        }
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(I)V", line = 8)
    public static void method2103(int arg0) {
        field4882 = null;
        field4881 = null;
        int var1 = 122 % (-arg0 / 61);
        field4874 = null;
    }

    @OriginalMember(owner = "client!vja", name = "a", descriptor = "(III)Z", line = 20)
    public final boolean method2104(int arg0, int arg1, int arg2) {
        field4870++;
        if (this.field4868 <= arg0 && this.field4872 >= arg0 && arg1 >= this.field4877 && this.field4878 >= arg1) {
            return true;
        } else if (arg2 >= -118) {
            return false;
        } else {
            return this.field4873 <= arg0 && arg0 <= this.field4879 && this.field4871 <= arg1 && arg1 <= this.field4869;
        }
    }

    @OriginalMember(owner = "client!vja", name = "<init>", descriptor = "(Ljg;)V", line = 98)
    public class343(class770 arg0) {
        this.field4875 = arg0;
    }

    @OriginalMember(owner = "client!vja", name = "b", descriptor = "(I)V", line = 46)
    public static final void method2105(int arg0) {
        if (arg0 != 4) {
            method2103(-22);
        }
        field4876++;
        if (class501.field6873 > 1) {
            class420.field5820.method3781(class420.field5820.field9470, 126, 4);
        } else {
            class420.field5820.method3781(class420.field5820.field9470, arg0 ^ 0x41, 2);
        }
    }
}
