import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class260 extends class30 {

    @OriginalMember(owner = "client!ga", name = "A", descriptor = "[I")
    public int[] field4512 = new int[] { -1 };

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "[I")
    public int[] field4518 = new int[1];

    @OriginalMember(owner = "client!ga", name = "B", descriptor = "Lia;")
    public static class257 field4513 = class28.method234(-38, "<col=00ffff>");

    @OriginalMember(owner = "client!ga", name = "v", descriptor = "D")
    public static double field4507 = -1.0D;

    @OriginalMember(owner = "client!ga", name = "F", descriptor = "Lia;")
    public static class257 field4517 = class28.method234(117, "event_opbase");

    @OriginalMember(owner = "client!ga", name = "u", descriptor = "I")
    public static int field4506;

    @OriginalMember(owner = "client!ga", name = "y", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "I")
    public static int field4511;

    @OriginalMember(owner = "client!ga", name = "C", descriptor = "I")
    public static int field4514;

    @OriginalMember(owner = "client!ga", name = "D", descriptor = "I")
    public static int field4515;

    @OriginalMember(owner = "client!ga", name = "E", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ga", name = "x", descriptor = "[I")
    public static int[] field4509;

    @OriginalMember(owner = "client!ga", name = "w", descriptor = "[Llc;")
    public static class90[] field4508;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lmb;III)[Lfe;")
    public static final class155[] method1730(class178 arg0, int arg1, int arg2, int arg3) {
        field4515++;
        if (arg3 <= 91) {
            return null;
        } else if (class156.method1093(arg1, 108, arg2, arg0)) {
            return class243.method1597(true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILmb;)V")
    public static final void method1731(int arg0, class178 arg1) {
        if (arg0 == 25128) {
            field4506++;
            class164.field2871 = arg1.method1211(class5.field132, (byte) -124);
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lad;I)V")
    public static final void method1732(class241 arg0, int arg1) {
        field4516++;
        arg0.field4133 = 0;
        if (arg0.field4130 == 0) {
            arg0.field4125 = 1024;
        }
        if (arg0.field4130 == 1) {
            arg0.field4125 = 1536;
        }
        if (arg0.field4130 == 2) {
            arg0.field4125 = 0;
        }
        int var2 = arg0.field4155 - class7.field153;
        int var3 = arg0.field4134 * 128 + arg0.field4128 * 64;
        int var4 = arg0.field4161 * arg1 + arg0.field4128 * 64;
        arg0.field4143 += (var3 - arg0.field4143) / var2;
        arg0.field4177 += (var4 - arg0.field4177) / var2;
        if (arg0.field4130 == 3) {
            arg0.field4125 = 512;
        }
    }

    @OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)V")
    public static void method1733(int arg0) {
        field4509 = null;
        if (arg0 != 1) {
            field4507 = 0.42457307379311254D;
        }
        field4513 = null;
        field4508 = null;
        field4517 = null;
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)I")
    public static final int method1734(int arg0, int arg1, int arg2) {
        if (arg1 != -13398) {
            method1731(95, (class178) null);
        }
        field4510++;
        long var3 = (long) ((arg2 << 16) + arg0);
        return class132.field2358 != null && class132.field2358.field573 == var3 ? (class125.field2232.field2677 * 99 / (class125.field2232.field2638.length - class132.field2358.field2450)) + 1 : 0;
    }
}
