import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class323 {

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "Z")
    public static boolean field4297 = false;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "Lao;")
    public static class191 field4300 = new class191(15, 3);

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "Lho;")
    public static class103 field4301 = new class103(40, 7);

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "Z")
    public static boolean field4302 = false;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field4294;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "Lkr;")
    public static class528 field4296;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IB)[B", line = 4)
    public static final synchronized byte[] method1908(int arg0, byte arg1) {
        field4299++;
        if (arg0 == 100 && class14.field148 > 0) {
            byte[] var2 = class474.field7031[--class14.field148];
            class474.field7031[class14.field148] = null;
            return var2;
        } else if (arg0 == 5000 && class261.field3500 > 0) {
            byte[] var3 = class21.field197[--class261.field3500];
            class21.field197[class261.field3500] = null;
            return var3;
        } else {
            if (arg1 < 59) {
                field4301 = null;
            }
            if (arg0 == 30000 && class106.field1447 > 0) {
                byte[] var4 = class272.field3623[--class106.field1447];
                class272.field3623[class106.field1447] = null;
                return var4;
            } else {
                return new byte[arg0];
            }
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IILjava/lang/String;IIIII)V", line = 41)
    public static final void method1909(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4294++;
        class75 var8 = new class75();
        var8.field940 = arg0;
        var8.field948 = arg1;
        int var9 = 43 % ((23 - arg5) / 40);
        var8.field942 = arg3;
        var8.field939 = arg4;
        var8.field949 = arg6;
        var8.field946 = arg2;
        var8.field952 = class532.field7836 + arg7;
        class292.field3862.method286((byte) -93, var8);
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V", line = 63)
    public static void method1910(int arg0) {
        field4301 = null;
        field4300 = null;
        if (arg0 == 10656) {
            field4296 = null;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V", line = 87)
    public static final void method1911(byte arg0) {
        field4295++;
        if (arg0 >= -17) {
            method1909(-29, 21, null, -71, -33, 75, 8, 23);
        }
        if (class343.field4596.method1199()) {
            class343.field4596.method1205(class60.field701);
            class20.method114(-1);
            class343.field4596.method1217(class60.field701);
            class343.field4596.method1161(class60.field701);
        } else {
            class142.method874(class20.field183, (byte) -25);
        }
        class104.method628(-114);
    }
}
