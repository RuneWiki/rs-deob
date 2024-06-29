import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class27 implements Runnable {

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[Lae;")
    public volatile class39[] field403 = new class39[2];

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Z")
    public volatile boolean field408 = false;

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "Z")
    public volatile boolean field402 = false;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field397 = 0;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "Lck;")
    public static class119 field400 = class298.method1987((byte) 89, ")4a=");

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "Lck;")
    public static class119 field409 = class298.method1987((byte) 91, "sch-Utteln:");

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field407 = 0;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "Z")
    public static boolean field405 = false;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Lck;")
    private static class119 field410 = class298.method1987((byte) 88, "Loaded config");

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "Lck;")
    public static class119 field401 = field410;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "Llh;")
    public class282 field411;

    @OriginalMember(owner = "client!tj", name = "run", descriptor = "()V", line = 5)
    public final void run() {
        this.field402 = true;
        field406++;
        try {
            while (!this.field408) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class39 var2 = this.field403[var1];
                    if (var2 != null) {
                        var2.method300(false);
                    }
                }
                class232.method1493(10L, (byte) -51);
                class257.method1646((Object) null, this.field411, (byte) -109);
            }
        } catch (Exception var7) {
            class87.method591((String) null, var7, 58);
        } finally {
            this.field402 = false;
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IIIILvc;IJIIII)Z", line = 41)
    public static final boolean method196(int arg0, int arg1, int arg2, int arg3, class293 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class42.method325(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lba;Z)V", line = 54)
    public static final void method197(class292 arg0, boolean arg1) {
        field404++;
        if (arg1) {
            field410 = (class119) null;
        }
        class32 var2 = (class32) class272.field4469.method1329((byte) 90, arg0.field4861.method786((byte) 112));
        if (var2 == null) {
            class279.method1853(arg0.field4963[0], (byte) 9, 0, class10.field189, arg0.field4973[0], arg0, (class163) null, (class291) null);
        } else {
            var2.method239((byte) -128);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(II)V", line = 76)
    public static final void method198(int arg0, int arg1) {
        class19.field242 = arg0;
        field398++;
        class11.field195 = -1;
        class257.field4133 = arg1;
        class212.method1337((byte) 116);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(BLeb;)V", line = 110)
    public static final void method199(byte arg0, class297 arg1) {
        if (arg1.field4942 == 0) {
            arg1.field4946 = 1024;
        }
        arg1.field4947 = 0;
        int var2 = arg1.field4954 - class1.field15;
        if (arg0 > -114) {
            return;
        }
        int var3 = arg1.field4974 * 128 + arg1.field4956 * 64;
        arg1.field4991 += (var3 - arg1.field4991) / var2;
        int var4 = arg1.field4987 * 128 + arg1.field4956 * 64;
        arg1.field4949 += (var4 - arg1.field4949) / var2;
        if (arg1.field4942 == 1) {
            arg1.field4946 = 1536;
        }
        if (arg1.field4942 == 2) {
            arg1.field4946 = 0;
        }
        if (arg1.field4942 == 3) {
            arg1.field4946 = 512;
        }
        field399++;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V", line = 155)
    public static void method200(int arg0) {
        field401 = null;
        if (arg0 == 1024) {
            field409 = null;
            field410 = null;
            field400 = null;
        }
    }
}
