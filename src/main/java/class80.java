import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class80 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
    public static boolean field1000 = false;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field1003 = 104;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1002 = -1;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1004 = "wave:";

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IIIIII)V", line = 26)
    public static final void method503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class396.field5925 >= arg1 && arg2 >= class99.field1378) {
            boolean var6;
            if (class406.field6033 > arg5) {
                arg5 = class406.field6033;
                var6 = false;
            } else if (arg5 > class185.field3005) {
                var6 = false;
                arg5 = class185.field3005;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class406.field6033 > arg3) {
                arg3 = class406.field6033;
                var7 = false;
            } else if (arg3 > class185.field3005) {
                var7 = false;
                arg3 = class185.field3005;
            } else {
                var7 = true;
            }
            if (arg1 < class99.field1378) {
                arg1 = class99.field1378;
            } else {
                class256.method1769(arg3, class277.field4414[arg1++], (byte) 51, arg0, arg5);
            }
            if (class396.field5925 < arg2) {
                arg2 = class396.field5925;
            } else {
                class256.method1769(arg3, class277.field4414[arg2--], (byte) 92, arg0, arg5);
            }
            if (var6 && var7) {
                for (int var8 = arg1; var8 <= arg2; var8++) {
                    int[] var9 = class277.field4414[var8];
                    var9[arg5] = var9[arg3] = arg0;
                }
            } else if (var6) {
                for (int var10 = arg1; var10 <= arg2; var10++) {
                    class277.field4414[var10][arg5] = arg0;
                }
            } else if (var7) {
                for (int var11 = arg1; var11 <= arg2; var11++) {
                    class277.field4414[var11][arg3] = arg0;
                }
            }
        }
        if (arg4 != 24935) {
            field1002 = -9;
        }
        field1001++;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 131)
    public static void method504(int arg0) {
        field1004 = null;
        if (arg0 > -64) {
            method503(-86, -49, -51, 17, 46, -109);
        }
    }
}
