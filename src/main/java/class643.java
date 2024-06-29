import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jia")
public class class643 {

    @OriginalMember(owner = "client!jia", name = "e", descriptor = "[I")
    public int[] field8995;

    @OriginalMember(owner = "client!jia", name = "b", descriptor = "I")
    public static int field8992 = 1408;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "I")
    public static int field8991;

    @OriginalMember(owner = "client!jia", name = "d", descriptor = "I")
    public static int field8994;

    @OriginalMember(owner = "client!jia", name = "f", descriptor = "I")
    public static int field8996;

    @OriginalMember(owner = "client!jia", name = "c", descriptor = "Ljava/lang/Thread;")
    public static Thread field8993;

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILso;)V", line = 4)
    private final void method3662(int arg0, class494 arg1) {
        while (true) {
            int var3 = arg1.method2964((byte) 61);
            if (var3 == 0) {
                field8991++;
                int var4 = -39 / ((arg0 - 44) / 47);
                return;
            }
            if (var3 == 1) {
                int var5 = arg1.method2964((byte) 70);
                this.field8995 = new int[var5];
                for (int var6 = 0; var6 < this.field8995.length; var6++) {
                    this.field8995[var6] = arg1.method2964((byte) 79);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)V", line = 59)
    public static void method3663(byte arg0) {
        if (arg0 <= 4) {
            method3663((byte) 48);
        }
        field8993 = null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)[Lvk;", line = 71)
    public static final class387[] method3664(int arg0) {
        field8996++;
        return arg0 == 0 ? new class387[] { class195.field2998, class581.field8213, class245.field3645 } : null;
    }

    @OriginalMember(owner = "client!jia", name = "a", descriptor = "(IIIIIIB)V", line = 82)
    public static final void method3665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        field8994++;
        int var7 = arg1 + arg5;
        int var8 = arg3 - arg1;
        for (int var9 = arg5; var9 < var7; var9++) {
            class434.method2601(class746.field10330[var9], arg0, arg2, (byte) -62, arg4);
        }
        int var10 = arg0 + arg1;
        for (int var11 = arg3; var11 > var8; var11--) {
            class434.method2601(class746.field10330[var11], arg0, arg2, (byte) -62, arg4);
        }
        int var12 = arg4 - arg1;
        if (arg6 != -65) {
            return;
        }
        for (int var13 = var7; var13 <= var8; var13++) {
            int[] var14 = class746.field10330[var13];
            class434.method2601(var14, arg0, arg2, (byte) -62, var10);
            class434.method2601(var14, var12, arg2, (byte) -62, arg4);
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "(Lwia;)V", line = 129)
    public class643(class791 arg0) {
        byte[] var2 = arg0.method4335(6, 0);
        this.method3662(-76, new class494(var2));
        if (this.field8995 == null) {
            throw new RuntimeException("");
        }
    }

    @OriginalMember(owner = "client!jia", name = "<init>", descriptor = "()V", line = 141)
    protected class643() {
        this.field8995 = new int[0];
    }
}
