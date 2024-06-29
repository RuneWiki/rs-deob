import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class173 extends class60 {

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "J")
    public long field2771;

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "I")
    public static int field2770 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "Z")
    public static boolean field2768 = false;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!ki", name = "t", descriptor = "Ljava/lang/String;")
    public static String field2774 = "yellow:";

    @OriginalMember(owner = "client!ki", name = "r", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!ki", name = "s", descriptor = "Lrn;")
    public static class36 field2773;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "([III[IB)V", line = 4)
    public static final void method1281(int[] arg0, int arg1, int arg2, int[] arg3, byte arg4) {
        if (arg4 >= -54) {
            field2774 = (String) null;
        }
        field2772++;
        if (arg1 <= arg2) {
            return;
        }
        int var5 = (arg1 + arg2) / 2;
        int var6 = arg2;
        int var7 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var7;
        int var8 = arg3[var5];
        arg3[var5] = arg3[arg1];
        arg3[arg1] = var8;
        for (int var9 = arg2; var9 < arg1; var9++) {
            if (arg0[var9] > (var7 + (var9 & 0x1))) {
                int var10 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6] = var10;
                int var11 = arg3[var9];
                arg3[var9] = arg3[var6];
                arg3[var6++] = var11;
            }
        }
        arg0[arg1] = arg0[var6];
        arg0[var6] = var7;
        arg3[arg1] = arg3[var6];
        arg3[var6] = var8;
        method1281(arg0, var6 - 1, arg2, arg3, (byte) -120);
        method1281(arg0, arg1, var6 + 1, arg3, (byte) -75);
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 58)
    public static void method1282(int arg0) {
        field2773 = null;
        field2774 = null;
        if (arg0 != -1) {
            method1282(58);
        }
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 74)
    public class173() {
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(J)V", line = 88)
    public class173(long arg0) {
        this.field2771 = arg0;
    }
}
