import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class185 extends class30 {

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Lsc;")
    public static class56 field3210 = new class56(32);

    @OriginalMember(owner = "client!l", name = "B", descriptor = "Z")
    public static boolean field3213 = false;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field3215 = 0;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "[Lia;")
    public static class257[] field3218 = new class257[200];

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Lia;")
    public static class257 field3221 = class28.method234(-32, "scape main");

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Lia;")
    public static class257 field3219 = class28.method234(100, "Spieler");

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Lia;")
    public static class257 field3214 = class28.method234(-61, "<col=ffb000>");

    @OriginalMember(owner = "client!l", name = "K", descriptor = "Lia;")
    public static class257 field3222 = class28.method234(127, "::gc");

    @OriginalMember(owner = "client!l", name = "M", descriptor = "Lia;")
    public static class257 field3224 = class28.method234(-126, "mapfunction");

    @OriginalMember(owner = "client!l", name = "L", descriptor = "[[I")
    public static int[][] field3223 = new int[104][104];

    @OriginalMember(owner = "client!l", name = "A", descriptor = "B")
    public byte field3212;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "I")
    public int field3208;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field3211;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "Lia;")
    public class257 field3207;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Lia;")
    public class257 field3209;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "[[I")
    public static int[][] field3220;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "[[[B")
    public static byte[][][] field3216;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "(I)V")
    public static void method1259(int arg0) {
        field3214 = null;
        field3218 = null;
        field3216 = null;
        field3223 = null;
        field3219 = null;
        if (arg0 != 23065) {
            method1260(13);
        }
        field3221 = null;
        field3210 = null;
        field3220 = null;
        field3222 = null;
        field3224 = null;
    }

    @OriginalMember(owner = "client!l", name = "f", descriptor = "(I)V")
    public static final void method1260(int arg0) {
        Object var1 = class189.field3254;
        synchronized (class189.field3254) {
            if (class159.field2786 != arg0) {
                class159.field2786 = 1;
                try {
                    class189.field3254.wait();
                } catch (InterruptedException var2) {
                }
            }
        }
        field3211++;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIBIIIII)V")
    public static final void method1261(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class123.field2211 <= arg0 && class145.field2540 >= arg0 && class123.field2211 <= arg5 && class145.field2540 >= arg5 && class123.field2211 <= arg1 && class145.field2540 >= arg1 && class123.field2211 <= arg9 && class145.field2540 >= arg9 && class40.field834 <= arg6 && arg6 <= class255.field4371 && arg7 >= class40.field834 && class255.field4371 >= arg7 && class40.field834 <= arg3 && arg3 <= class255.field4371 && class40.field834 <= arg8 && class255.field4371 >= arg8) {
            class171.method1172(arg7, arg6, (byte) 11, arg5, arg1, arg3, arg9, arg2, arg0, arg8);
        } else {
            class257.method1675(arg3, arg7, arg4 - 21, arg9, arg2, arg8, arg5, arg1, arg0, arg6);
        }
        if (arg4 == 90) {
            field3206++;
        }
    }
}
