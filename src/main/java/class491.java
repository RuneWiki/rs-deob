import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class491 {

    @OriginalMember(owner = "client!ts", name = "f", descriptor = "I")
    public int field6786 = -1;

    @OriginalMember(owner = "client!ts", name = "e", descriptor = "I")
    public int field6785 = -1;

    @OriginalMember(owner = "client!ts", name = "b", descriptor = "[B")
    public static byte[] field6782 = new byte[2048];

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "I")
    public static int field6781;

    @OriginalMember(owner = "client!ts", name = "g", descriptor = "I")
    public static int field6787;

    @OriginalMember(owner = "client!ts", name = "i", descriptor = "I")
    public static int field6789;

    @OriginalMember(owner = "client!ts", name = "h", descriptor = "Lxa;")
    public static class461 field6788;

    @OriginalMember(owner = "client!ts", name = "c", descriptor = "[I")
    public int[] field6783;

    @OriginalMember(owner = "client!ts", name = "d", descriptor = "[I")
    public static int[] field6784;

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(JJ)J", line = 14)
    public static long method2749(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljr;B)V", line = 22)
    public final void method2750(class96 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method718(-92);
            if (var3 == 0) {
                int var4 = 30 % ((65 - arg1) / 51);
                field6787++;
                return;
            }
            this.method2753(arg0, var3, 121);
        }
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V", line = 42)
    public static final void method2751(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        if (arg3 != 27590) {
            field6788 = null;
        }
        field6789++;
        class250 var8 = new class250();
        var8.field3522 = arg6;
        var8.field3533 = arg5;
        var8.field3521 = arg2;
        var8.field3530 = arg7;
        var8.field3527 = arg0;
        var8.field3532 = class239.field3440 + arg4;
        var8.field3524 = arg1;
        class179.field2655.method3679(var8, 0);
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(I)V", line = 67)
    public static void method2752(int arg0) {
        if (arg0 != -1) {
            field6782 = null;
        }
        field6782 = null;
        field6784 = null;
        field6788 = null;
    }

    @OriginalMember(owner = "client!ts", name = "a", descriptor = "(Ljr;II)V", line = 79)
    private final void method2753(class96 arg0, int arg1, int arg2) {
        if (arg2 <= 116) {
            this.field6783 = null;
        }
        field6781++;
        if (arg1 == 1) {
            this.field6785 = arg0.method743((byte) -56);
        } else if (arg1 == 2) {
            this.field6783 = new int[arg0.method718(105)];
            for (int var4 = 0; var4 < this.field6783.length; var4++) {
                this.field6783[var4] = arg0.method743((byte) -110);
            }
        } else if (arg1 == 3) {
            this.field6786 = arg0.method718(-86);
        }
    }
}
