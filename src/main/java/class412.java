import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class412 extends class59 {

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "[I")
    public static int[] field5970 = new int[13];

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
    public static int[] field5974 = new int[4096];

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field5968;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field5969;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field5971;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public static int field5972;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public int field5973;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public int field5975;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public int field5977;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Z")
    public boolean field5976;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 4)
    public static void method2430(int arg0) {
        field5970 = null;
        field5974 = null;
        int var1 = 77 % ((arg0 - 73) / 46);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)Z", line = 14)
    public static final boolean method2431(byte arg0) {
        field5968++;
        if (arg0 != 61) {
            field5974 = null;
        }
        try {
            if (class322.field4842 == 2) {
                if (class490.field7455 == null) {
                    class490.field7455 = class125.method853(class107.field1871, class232.field3525, class275.field4169);
                    if (class490.field7455 == null) {
                        return false;
                    }
                }
                if (class466.field7143 == null) {
                    class466.field7143 = new class61(class254.field3878, class324.field4868);
                }
                if (class194.field3056.method653(-19862, class466.field7143, class348.field5137, 22050, class490.field7455)) {
                    class194.field3056.method626(true);
                    class194.field3056.method621(class15.field207, 96);
                    class194.field3056.method648(class93.field1656, 16059, class490.field7455);
                    class107.field1871 = null;
                    class490.field7455 = null;
                    class322.field4842 = 0;
                    class466.field7143 = null;
                    return true;
                }
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class194.field3056.method660((byte) 63);
            class107.field1871 = null;
            class322.field4842 = 0;
            class466.field7143 = null;
            class490.field7455 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)Z", line = 69)
    public final boolean method164(int arg0) {
        if (arg0 == 0) {
            field5972++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V", line = 94)
    public final void method168(int arg0) {
        int var2 = 28 / ((arg0 + 53) / 62);
        field5969++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILqq;Lps;ZZII)V", line = 105)
    public final void method165(int arg0, class318 arg1, class59 arg2, boolean arg3, boolean arg4, int arg5, int arg6) {
        field5971++;
        if (!arg4) {
            this.field5977 = -13;
        }
        throw new IllegalStateException();
    }
}
