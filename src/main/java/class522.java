import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class522 extends class96 {

    @OriginalMember(owner = "client!gn", name = "O", descriptor = "Ltu;")
    public static class7 field7742 = new class7();

    @OriginalMember(owner = "client!gn", name = "K", descriptor = "I")
    public static int field7738;

    @OriginalMember(owner = "client!gn", name = "L", descriptor = "I")
    public static int field7739;

    @OriginalMember(owner = "client!gn", name = "M", descriptor = "I")
    public static int field7740;

    @OriginalMember(owner = "client!gn", name = "N", descriptor = "I")
    private int field7741;

    @OriginalMember(owner = "client!gn", name = "P", descriptor = "I")
    private int field7743;

    @OriginalMember(owner = "client!gn", name = "Q", descriptor = "I")
    private int field7744;

    @OriginalMember(owner = "client!gn", name = "S", descriptor = "I")
    public static int field7746;

    @OriginalMember(owner = "client!gn", name = "T", descriptor = "I")
    public static int field7747;

    @OriginalMember(owner = "client!gn", name = "R", descriptor = "Ldn;")
    public static class201 field7745;

    @OriginalMember(owner = "client!gn", name = "U", descriptor = "Lwv;")
    public static class315 field7748;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(Z)V", line = 3)
    public static void method3104(boolean arg0) {
        field7742 = null;
        if (arg0) {
            field7742 = null;
        }
        field7748 = null;
        field7745 = null;
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "(I)V", line = 18)
    private class522(int arg0) {
        super(0, false);
        this.method3105(arg0, 865596228);
    }

    @OriginalMember(owner = "client!gn", name = "<init>", descriptor = "()V", line = 27)
    public class522() {
        this(0);
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)[[I", line = 31)
    public final int[][] method36(int arg0, int arg1) {
        ++field7739;
        int[][] var3 = super.field1333.method694(arg1, arg0);
        if (super.field1333.field1423) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            for (int var7 = 0; var7 < class269.field3403; ++var7) {
                var4[var7] = this.field7741;
                var5[var7] = this.field7743;
                var6[var7] = this.field7744;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILbt;)V", line = 69)
    public final void method31(int arg0, int arg1, class88 arg2) {
        if (arg1 != -1) {
            field7747 = -45;
        }
        if (~arg0 == -1) {
            this.method3105(arg2.method584(255), arg1 + 865596229);
        }
        ++field7746;
    }

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "(II)V", line = 103)
    private final void method3105(int arg0, int arg1) {
        this.field7743 = 4080 & arg0 >> 4;
        ++field7738;
        this.field7741 = 4080 & arg0 >> 12;
        if (arg1 != 865596228) {
            method3104(false);
        }
        this.field7744 = (255 & arg0) << 4;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 119)
    public static final String method3106(String arg0, int arg1, String arg2, String arg3) {
        ++field7740;
        for (int var4 = arg2.indexOf(arg3); ~var4 != 0; var4 = arg2.indexOf(arg3, var4 - -arg0.length())) {
            arg2 = arg2.substring(0, var4) + arg0 + arg2.substring(arg3.length() + var4);
        }
        return arg1 != 1856881676 ? null : arg2;
    }
}
