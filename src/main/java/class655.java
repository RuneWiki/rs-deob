import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class655 {

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "Lda;")
    public class59 field8991 = null;

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "Lqm;")
    public class143 field8990 = null;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "I")
    public static int field8987;

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "I")
    public static int field8989;

    @OriginalMember(owner = "client!fj", name = "f", descriptor = "I")
    public static int field8992;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "[I")
    public static int[] field8988;

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(Ljava/lang/String;IC)I", line = 5)
    public static final int method3601(String arg0, int arg1, char arg2) {
        field8989++;
        int var3 = 0;
        int var4 = arg0.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0.charAt(var5) == arg2) {
                var3++;
            }
        }
        if (arg1 != -8657) {
            field8988 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(B)V", line = 31)
    public static void method3602(byte arg0) {
        if (arg0 >= 48) {
            field8988 = null;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(I)V", line = 43)
    public static final void method3603(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class400.field5668 != null) {
            class708[] var1 = class400.field5668;
            for (int var2 = 0; var2 < var1.length; var2++) {
                class708 var3 = var1[var2];
                var3.method183(-60);
            }
        }
        field8992++;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lda;)V", line = 74)
    public class655(class59 arg0) {
        this.field8991 = arg0;
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lda;Lqm;)V", line = 82)
    public class655(class59 arg0, class143 arg1) {
        this.field8990 = arg1;
        this.field8991 = arg0;
    }
}
