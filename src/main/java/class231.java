import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class231 extends class119 {

    @OriginalMember(owner = "client!vn", name = "k", descriptor = "I")
    private int field3035;

    @OriginalMember(owner = "client!vn", name = "q", descriptor = "I")
    private int field3041;

    @OriginalMember(owner = "client!vn", name = "o", descriptor = "I")
    private int field3039;

    @OriginalMember(owner = "client!vn", name = "i", descriptor = "I")
    private int field3033;

    @OriginalMember(owner = "client!vn", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field3037 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!vn", name = "l", descriptor = "Lhq;")
    public static class365 field3036 = new class365(100);

    @OriginalMember(owner = "client!vn", name = "s", descriptor = "I")
    public static int field3043 = 0;

    @OriginalMember(owner = "client!vn", name = "t", descriptor = "Z")
    public static boolean field3044 = false;

    @OriginalMember(owner = "client!vn", name = "j", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!vn", name = "n", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!vn", name = "p", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!vn", name = "r", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!vn", name = "<init>", descriptor = "(IIIIIII)V", line = 6)
    public class231(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field3035 = arg1;
        this.field3041 = arg2;
        this.field3039 = arg3;
        this.field3033 = arg0;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(III)V", line = 18)
    public final void method793(int arg0, int arg1, int arg2) {
        ++field3040;
        int var4 = this.field3033 * arg2 >> 12;
        if (arg0 != -1) {
            this.method793(112, 122, 122);
        }
        int var5 = this.field3041 * arg2 >> 12;
        int var6 = this.field3035 * arg1 >> 12;
        int var7 = this.field3039 * arg1 >> 12;
        class286.method1825(var4, (byte) 40, super.field1376, var6, super.field1375, var7, var5);
    }

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(I)V", line = 48)
    public static void method1493(int arg0) {
        if (arg0 == -7130) {
            field3036 = null;
            field3037 = null;
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(BII)V", line = 60)
    public final void method795(byte arg0, int arg1, int arg2) {
        ++field3034;
        int var4 = this.field3033 * arg2 >> 12;
        int var5 = this.field3041 * arg2 >> 12;
        int var6 = this.field3035 * arg1 >> 12;
        int var7 = this.field3039 * arg1 >> 12;
        if (arg0 != -33) {
            this.method796(-42, (byte) -82, -34);
        }
        class272.method1716(var6, var5, super.field1378, var7, var4, true);
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IBI)V", line = 80)
    public final void method796(int arg0, byte arg1, int arg2) {
        if (arg1 != -74) {
            field3044 = true;
        }
        ++field3038;
        int var4 = this.field3033 * arg0 >> 12;
        int var5 = this.field3041 * arg0 >> 12;
        int var6 = this.field3035 * arg2 >> 12;
        int var7 = this.field3039 * arg2 >> 12;
        class181.method1133(super.field1376, (byte) -122, var6, var7, super.field1375, var5, var4, super.field1378);
    }
}
