import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class499 {

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "B")
    private byte field7367;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public int field7366;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public int field7363;

    @OriginalMember(owner = "client!ge", name = "o", descriptor = "I")
    public int field7376;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public int field7370;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public int field7373;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "[I")
    public static int[] field7371 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lpi;")
    public static class342 field7369 = new class342("Face here", "Hierhin drehen", "Regarder dans cette direction", "Virar para cá");

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field7362;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field7374;

    @OriginalMember(owner = "client!ge", name = "n", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Lcq;")
    public static class324 field7368;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)I", line = 9)
    public final int method2988(int arg0) {
        if (arg0 != -9) {
            field7368 = null;
        }
        field7362++;
        return (this.field7367 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BIILqa;IZLoa;)V", line = 20)
    public static final void method2989(byte arg0, int arg1, int arg2, class162 arg3, int arg4, boolean arg5, class489 arg6) {
        if (arg5) {
            class275.field3980.method3137((class466.field6952 - class275.field3980.method100()) / 2, (class77.field1297 - class275.field3980.method104()) / 2);
            class416.field6214.method3137((class466.field6952 - class416.field6214.method100()) / 2, 18);
        }
        field7374++;
        arg6.method2900((class403.field6054 == class168.field2608 ? class87.field1523 : class4.field108).method2180(client.field2870, 29491), arg4, -63, -1, class77.field1297 / 2 - 26, class466.field6952 / 2);
        int var7 = class77.field1297 / 2 - 18;
        arg3.method239(class466.field6952 / 2 - 152, var7, 304, 34, arg1, 0);
        arg3.method239(class466.field6952 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg3.method253(class466.field6952 / 2 - 150, var7 - -2, class35.field672 * 3, 30, arg2, 0);
        arg3.method253(class35.field672 * 3 + class466.field6952 / 2 - 150, var7 + 2, 300 - (class35.field672 * 3), 30, 0, 0);
        if (arg0 == 80) {
            arg6.method2900(class12.field207, arg4, arg0 - 196, -1, class77.field1297 / 2 - -4, class466.field6952 / 2);
        }
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V", line = 46)
    public static void method2990(int arg0) {
        field7369 = null;
        field7368 = null;
        if (arg0 != -12039) {
            method2989((byte) -86, 51, -80, null, 127, false, null);
        }
        field7371 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)I", line = 65)
    public final int method2991(byte arg0) {
        if (arg0 == -57) {
            field7365++;
            return this.field7367 & 0x7;
        } else {
            return -19;
        }
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "()V", line = 86)
    public class499() {
    }

    @OriginalMember(owner = "client!ge", name = "<init>", descriptor = "(Lcu;)V", line = 88)
    public class499(class145 arg0) {
        this.field7367 = arg0.method1093(15);
        this.field7366 = arg0.method1069((byte) -100);
        this.field7363 = arg0.method1070(-32387);
        this.field7376 = arg0.method1070(-32387);
        this.field7370 = arg0.method1070(-32387);
        this.field7373 = arg0.method1070(-32387);
    }
}
