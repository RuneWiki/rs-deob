import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class24 {

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[I")
    public static int[] field341 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "F")
    public static float field343;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "I")
    public static int field342;

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "Lcg;")
    public static class49 field344;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(Z)V", line = 4)
    public static void method230(boolean arg0) {
        field344 = null;
        if (!arg0) {
            field341 = null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(III)I", line = 18)
    public static final int method231(int arg0, int arg1, int arg2) {
        field346++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg1 != -3) {
            return -126;
        } else if (arg2 == -1) {
            if (arg0 < 2) {
                arg0 = 2;
            } else if (arg0 > 126) {
                arg0 = 126;
            }
            return arg0;
        } else {
            int var3 = (arg2 & 0x7F) * arg0 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)V", line = 59)
    public static final void method232(int arg0, int arg1) {
        field340++;
        class30 var2 = class99.method857((byte) 117, arg1, 9);
        var2.method276(0);
        if (arg0 != -5583) {
            method230(true);
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V", line = 81)
    public static final void method233(int arg0, String arg1, String arg2, int arg3) {
        class52.field818 = arg0;
        field342++;
        class58.field902 = arg1;
        class276.field4388 = arg2;
        if (class58.field902.equals("") || class276.field4388.equals("")) {
            class86.field1378 = 3;
        } else if (class120.field2082 == -1) {
            class30.field445 = 1;
            class197.field3368 = 0;
            if (arg3 == 23869) {
                class154.field2745 = 0;
                class86.field1378 = -3;
                class336 var4 = new class336(128);
                var4.method2370(10, (byte) -20);
                var4.method2320(-6128, (int) (Math.random() * 9.9999999E7D));
                var4.method2333(class142.method1151(class58.field902, arg3 ^ 0xFFFFA2B5), arg3 - 23787);
                var4.method2320(-6128, (int) (Math.random() * 9.9999999E7D));
                var4.method2349(true, class276.field4388);
                var4.method2320(-6128, (int) (Math.random() * 9.9999999E7D));
                var4.method2330(class226.field3809, class137.field2545, 0);
                class341.field5443.field5353 = 0;
                class341.field5443.method2370(24, (byte) -20);
                class341.field5443.method2370(var4.field5353 + 2, (byte) -20);
                class341.field5443.method2359(-805606200, 546);
                class341.field5443.method2345((byte) -53, var4.field5353, var4.field5342, 0);
            }
        } else {
            class21.method207(-98);
        }
    }
}
