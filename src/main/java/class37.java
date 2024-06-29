import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class37 extends class222 {

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "[I")
    public static int[] field564 = new int[5];

    @OriginalMember(owner = "client!cg", name = "W", descriptor = "Lve;")
    public static class255 field568 = class87.method607(56, "n");

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "Lve;")
    public static class255 field563 = class87.method607(124, "(Z");

    @OriginalMember(owner = "client!cg", name = "Y", descriptor = "Z")
    public static volatile boolean field570 = false;

    @OriginalMember(owner = "client!cg", name = "bb", descriptor = "Lve;")
    public static class255 field573 = class87.method607(86, "Eingabeprozedur geladen)3");

    @OriginalMember(owner = "client!cg", name = "ib", descriptor = "Lve;")
    private static class255 field580 = class87.method607(72, "cyan:");

    @OriginalMember(owner = "client!cg", name = "db", descriptor = "Lve;")
    public static class255 field575 = field580;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "Lve;")
    public static class255 field565 = field580;

    @OriginalMember(owner = "client!cg", name = "Z", descriptor = "B")
    public byte field571;

    @OriginalMember(owner = "client!cg", name = "T", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!cg", name = "ab", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!cg", name = "cb", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!cg", name = "eb", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!cg", name = "fb", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!cg", name = "gb", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!cg", name = "hb", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "Ldf;")
    public static class154 field562;

    @OriginalMember(owner = "client!cg", name = "V", descriptor = "Lpb;")
    public class70 field567;

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "Ljava/awt/Frame;")
    public static Frame field561;

    @OriginalMember(owner = "client!cg", name = "X", descriptor = "[Lud;")
    public static class269[] field569;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(B)V", line = 5)
    public static void method220(byte arg0) {
        field568 = null;
        field569 = null;
        field562 = null;
        field565 = null;
        field564 = null;
        field561 = null;
        if (arg0 != 81) {
            method221(-70, -6, -116, -12, -3, 104, -67, (byte) 91);
        }
        field563 = null;
        field580 = null;
        field573 = null;
        field575 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIIIIB)V", line = 36)
    public static final void method221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field566++;
        int var8 = arg3 + arg2;
        int var9 = arg0 + arg2;
        int var10 = arg1 - arg2;
        for (int var11 = arg3; var11 < var8; var11++) {
            class30.method170(arg6, class250.field4213[var11], arg0, arg4, -30310);
        }
        int var12 = arg1;
        int var13 = -84 / ((arg7 - 46) / 39);
        while (var12 > var10) {
            class30.method170(arg6, class250.field4213[var12], arg0, arg4, -30310);
            var12--;
        }
        int var14 = arg6 - arg2;
        for (int var15 = var8; var15 <= var10; var15++) {
            int[] var16 = class250.field4213[var15];
            class30.method170(var9, var16, arg0, arg4, -30310);
            class30.method170(var14, var16, var9, arg5, -30310);
            class30.method170(arg6, var16, var14, arg4, -30310);
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(B)[B", line = 98)
    public final byte[] method82(byte arg0) {
        field576++;
        if (arg0 != -16) {
            field561 = (Frame) null;
        }
        if (this.field3742 || this.field567.field1068 < (this.field567.field1066.length - this.field571)) {
            throw new RuntimeException();
        }
        return this.field567.field1066;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 123)
    public static final void method222(int arg0) {
        field578++;
        if (arg0 == 0) {
            class168.field2819.method553(-50);
            class259.field4392.method553(arg0 + 126);
        }
    }

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(B)I", line = 136)
    public final int method80(byte arg0) {
        field574++;
        if (this.field567 == null) {
            return 0;
        } else if (arg0 == 60) {
            return this.field567.field1068 * 100 / (this.field567.field1066.length - this.field571);
        } else {
            return 74;
        }
    }

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "(I)Lwf;", line = 159)
    public static final class53 method223(int arg0) {
        field572++;
        class53 var1 = (class53) class127.field2092.method1919(false);
        if (var1 != null) {
            var1.method1502((byte) -82);
            var1.method2024((byte) 90);
            return var1;
        } else if (arg0 == 0) {
            class53 var2;
            do {
                var2 = (class53) class90.field1525.method1919(false);
                if (var2 == null) {
                    return null;
                }
                if (var2.method327((byte) -52) > class218.method1541(arg0 + 92)) {
                    return null;
                }
                var2.method1502((byte) -82);
                var2.method2024((byte) 97);
            } while ((var2.field4903 & Long.MIN_VALUE) == 0L);
            return var2;
        } else {
            return (class53) null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "([JII[II)V", line = 218)
    public static final void method224(long[] arg0, int arg1, int arg2, int[] arg3, int arg4) {
        if (arg2 < 20) {
            field561 = (Frame) null;
        }
        if (arg4 < arg1) {
            int var5 = arg4;
            int var6 = (arg1 + arg4) / 2;
            long var7 = arg0[var6];
            arg0[var6] = arg0[arg1];
            arg0[arg1] = var7;
            int var9 = arg3[var6];
            arg3[var6] = arg3[arg1];
            arg3[arg1] = var9;
            for (int var10 = arg4; var10 < arg1; var10++) {
                if (arg0[var10] < (long) (var10 & 0x1) + var7) {
                    long var11 = arg0[var10];
                    arg0[var10] = arg0[var5];
                    arg0[var5] = var11;
                    int var13 = arg3[var10];
                    arg3[var10] = arg3[var5];
                    arg3[var5++] = var13;
                }
            }
            arg0[arg1] = arg0[var5];
            arg0[var5] = var7;
            arg3[arg1] = arg3[var5];
            arg3[var5] = var9;
            method224(arg0, var5 - 1, 69, arg3, arg4);
            method224(arg0, arg1, 100, arg3, var5 + 1);
        }
        field577++;
    }
}
