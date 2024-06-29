import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class172 extends class332 {

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "Z")
    public static boolean field2481 = true;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "Ldh;")
    public static class179 field2479 = new class179(64);

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field2484 = 0;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "I")
    public static int field2480;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "I")
    public static int field2482;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(IIIILen;Len;IIJ)V", line = 11)
    public static final void method1130(int arg0, int arg1, int arg2, int arg3, class47 arg4, class47 arg5, int arg6, int arg7, long arg8) {
        if (arg4 == null && arg5 == null) {
            return;
        }
        class168 var10 = new class168();
        var10.field2339 = arg8;
        var10.field2338 = arg1 * 128 + 64;
        var10.field2330 = arg2 * 128 + 64;
        var10.field2329 = arg3;
        var10.field2335 = arg4;
        var10.field2331 = arg5;
        var10.field2333 = arg6;
        var10.field2340 = arg7;
        for (int var11 = arg0; var11 >= 0; var11--) {
            if (class158.field2184[var11][arg1][arg2] == null) {
                class158.field2184[var11][arg1][arg2] = new class225(var11, arg1, arg2);
            }
        }
        class158.field2184[arg0][arg1][arg2].field3196 = var10;
    }

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "(I)V", line = 37)
    public static void method1131(int arg0) {
        field2479 = null;
        if (arg0 != 64) {
            method1130(-70, -76, 63, 89, (class47) null, (class47) null, -2, -63, -124L);
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lqb;III)V", line = 48)
    public static final void method1132(class109 arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1566) {
            field2479 = (class179) null;
        }
        if (arg0.field2435 == arg2 && arg2 != -1) {
            class247 var4 = class185.method1289(arg2, (byte) 119);
            int var5 = var4.field3729;
            if (var5 == 1) {
                arg0.field2425 = 0;
                arg0.field2405 = 1;
                arg0.field2356 = 0;
                arg0.field2365 = arg1;
                arg0.field2366 = 0;
                class337.method2329(class118.field1664 == arg0, var4, (byte) -97, arg0.field2392, arg0.field2357, arg0.field2425);
            }
            if (var5 == 2) {
                arg0.field2356 = 0;
            }
        } else if (arg2 == -1 || arg0.field2435 == -1 || class185.method1289(arg2, (byte) 113).field3740 >= class185.method1289(arg0.field2435, (byte) 120).field3740) {
            arg0.field2425 = 0;
            arg0.field2405 = 1;
            arg0.field2366 = 0;
            arg0.field2365 = arg1;
            arg0.field2435 = arg2;
            arg0.field2450 = arg0.field2411;
            arg0.field2356 = 0;
            if (arg0.field2435 != -1) {
                class337.method2329(class118.field1664 == arg0, class185.method1289(arg0.field2435, (byte) 118), (byte) -97, arg0.field2392, arg0.field2357, arg0.field2425);
            }
        }
        field2482++;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "()V", line = 98)
    public class172() {
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(I)V", line = 107)
    public class172(int arg0) {
        this.field2483 = arg0;
    }
}
