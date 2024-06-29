import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class212 implements Runnable {

    @OriginalMember(owner = "client!jm", name = "k", descriptor = "Z")
    public boolean field3000 = true;

    @OriginalMember(owner = "client!jm", name = "j", descriptor = "Ljava/lang/Object;")
    public Object field2999 = new Object();

    @OriginalMember(owner = "client!jm", name = "o", descriptor = "[I")
    public int[] field3004 = new int[500];

    @OriginalMember(owner = "client!jm", name = "n", descriptor = "[I")
    public int[] field3003 = new int[500];

    @OriginalMember(owner = "client!jm", name = "m", descriptor = "I")
    public int field3002 = 0;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field2991 = 0;

    @OriginalMember(owner = "client!jm", name = "d", descriptor = "Ljava/lang/String;")
    public static String field2993 = "Allocating memory";

    @OriginalMember(owner = "client!jm", name = "g", descriptor = "Z")
    public static boolean field2996 = false;

    @OriginalMember(owner = "client!jm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field2994 = "K";

    @OriginalMember(owner = "client!jm", name = "i", descriptor = "F")
    public static float field2998;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!jm", name = "f", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!jm", name = "h", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!jm", name = "l", descriptor = "I")
    public static int field3001;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIII)V", line = 4)
    public static final void method1550(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 <= 65) {
            return;
        }
        field3001++;
        class163.field2311 = arg3;
        class348.field5456 = arg5;
        class30.field357 = arg2;
        class338.field5272 = arg0;
        class255.field3738 = arg1;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IILjava/lang/String;)V", line = 22)
    public static final void method1551(int arg0, int arg1, String arg2) {
        if (arg0 < 113) {
            field2991 = -59;
        }
        field2995++;
        class42 var3 = class166.method1242(3, arg1, -1249071392);
        var3.method307((byte) -86);
        var3.field539 = arg2;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(B)V", line = 41)
    public static void method1552(byte arg0) {
        field2993 = null;
        if (arg0 == -59) {
            field2994 = null;
        }
    }

    @OriginalMember(owner = "client!jm", name = "run", descriptor = "()V", line = 58)
    public final void run() {
        while (this.field3000) {
            Object var1 = this.field2999;
            synchronized (this.field2999) {
                if (this.field3002 < 500) {
                    this.field3004[this.field3002] = class105.field1361;
                    this.field3003[this.field3002] = class80.field1028;
                    this.field3002++;
                }
            }
            class177.method1299((byte) 64, 50L);
        }
        field2992++;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIII)V", line = 85)
    public static final void method1553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class333 var7 = class283.method1926(arg5, (byte) 82, arg3);
        if (var7 != null && var7.field5090 != null) {
            class135 var8 = new class135();
            var8.field1836 = var7.field5090;
            var8.field1831 = var7;
            class276.method1869(true, var8);
        }
        class276.field3954 = true;
        field2997++;
        if (arg6 != 500) {
            method1554(-118, 20);
        }
        class99.field1300 = arg2;
        class25.field283 = arg1;
        class71.field936 = arg3;
        class274.field3932 = arg4;
        class315.field4649 = arg5;
        class119.field1579 = arg0;
        class142.method1097(-128, var7);
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(II)V", line = 127)
    public static final void method1554(int arg0, int arg1) {
        field2990++;
        if (arg1 != 3) {
            method1552((byte) 113);
        }
        class225.field3238.method2264((byte) 32, arg0);
    }
}
