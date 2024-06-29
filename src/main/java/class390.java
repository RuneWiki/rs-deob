import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class390 extends class307 {

    @OriginalMember(owner = "client!bfa", name = "E", descriptor = "[I")
    public static int[] field5351 = new int[3];

    @OriginalMember(owner = "client!bfa", name = "B", descriptor = "I")
    public static int field5348;

    @OriginalMember(owner = "client!bfa", name = "C", descriptor = "I")
    public static int field5349;

    @OriginalMember(owner = "client!bfa", name = "D", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!bfa", name = "F", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIILlg;)V", line = 6)
    public static final void method2363(int arg0, int arg1, int arg2, class436 arg3) {
        class549 var4 = class663.method3754(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field7471 = arg3;
            int var5 = class745.field10286 == class178.field2805 ? 1 : 0;
            if (arg3.method902(0)) {
                if (arg3.method910(false)) {
                    arg3.field7407 = class684.field9523[var5];
                    class684.field9523[var5] = arg3;
                    return;
                }
                arg3.field7407 = class451.field6179[var5];
                class451.field6179[var5] = arg3;
                class180.field2828 = true;
                return;
            }
            arg3.field7407 = class265.field3738[var5];
            class265.field3738[var5] = arg3;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIII)V", line = 37)
    public final void method1399(int arg0, int arg1, int arg2, int arg3) {
        ++field5350;
        if (arg2 != -27297) {
            method2365(-26);
        }
        super.field4200 = arg1;
        super.field4213 = arg3;
        super.field4197 = arg0;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(III)V", line = 53)
    public static final void method2364(int arg0, int arg1, int arg2) {
        ++field5349;
        class281 var3 = class54.method395((byte) -53, (long) arg1, 1);
        var3.method1821((byte) 20);
        if (arg0 != 835) {
            field5351 = null;
        }
        var3.field3910 = arg2;
    }

    @OriginalMember(owner = "client!bfa", name = "g", descriptor = "(I)V", line = 68)
    public static void method2365(int arg0) {
        if (arg0 != 31778) {
            field5351 = null;
        }
        field5351 = null;
    }

    @OriginalMember(owner = "client!bfa", name = "<init>", descriptor = "(IIIIIF)V", line = 82)
    public class390(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(BF)V", line = 85)
    public final void method1398(byte arg0, float arg1) {
        ++field5348;
        super.field4209 = arg1;
        if (arg0 < 103) {
            field5351 = null;
        }
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(Ljava/io/File;I)[B", line = 97)
    public static final byte[] method2366(File arg0, int arg1) {
        if (arg1 != 22946) {
            field5351 = null;
        }
        ++field5352;
        return class141.method1149(arg0, (byte) -127, (int) arg0.length());
    }
}
