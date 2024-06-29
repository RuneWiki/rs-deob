import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class350 extends class535 {

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "Z")
    public static boolean field5134 = false;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "[Ljava/lang/String;")
    public static String[] field5133 = new String[100];

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "I")
    public static int field5136;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field5138;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[[I")
    public final int[][] method61(int arg0, int arg1) {
        ++field5137;
        int[][] var3 = super.field7879.method733(arg1, -16963);
        if (super.field7879.field1528) {
            int[][] var4 = this.method3157((byte) 67, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class174.field2597; ++var11) {
                var8[var11] = -var5[var11] + 4096;
                var9[var11] = -var6[var11] + 4096;
                var10[var11] = -var7[var11] + 4096;
            }
        }
        if (arg0 >= -116) {
            field5133 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(ILwn;I)V")
    public final void method60(int arg0, class519 arg1, int arg2) {
        if (~arg0 == -1) {
            super.field7878 = ~arg1.method3072((byte) -127) == -2;
        }
        ++field5136;
        if (arg2 != -6232) {
            field5133 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(III)Z")
    public static final boolean method2203(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return false;
        } else {
            ++field5135;
            return (544 & arg2) == 544 | (arg2 & 24) != 0;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(II)[I")
    public final int[] method65(int arg0, int arg1) {
        ++field5138;
        if (arg1 != 1) {
            method2205(-125);
        }
        int[] var3 = super.field7885.method974(-30531, arg0);
        if (super.field7885.field2086) {
            int[] var4 = this.method3158(-121, 0, arg0);
            for (int var5 = 0; class174.field2597 > var5; ++var5) {
                var3[var5] = -var4[var5] + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "()V")
    public class350() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(II)V")
    public static final void method2204(int arg0, int arg1) {
        ++field5139;
        class275 var2 = class213.method1433((byte) 103, arg0, arg1);
        var2.method1774((byte) 110);
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)V")
    public static void method2205(int arg0) {
        if (arg0 != -1) {
            field5133 = null;
        }
        field5133 = null;
    }
}
