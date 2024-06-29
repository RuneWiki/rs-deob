import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class430 {

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "Z")
    public static boolean field6225;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "Lpn;")
    public static class72 field6223;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "[I")
    public static int[] field6226;

    @OriginalMember(owner = "client!sc", name = "h", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "I")
    public static int field6220;

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field6221;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "I")
    public static int field6224;

    @OriginalMember(owner = "client!sc", name = "i", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "[Lrg;")
    public static class395[] field6222;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method2576(int arg0, int arg1) {
        field6224++;
        if (arg1 == 100 && class207.field2868 > 0) {
            byte[] var2 = class89.field1104[--class207.field2868];
            class89.field1104[class207.field2868] = null;
            return var2;
        } else if (arg1 == 5000 && class414.field5911 > 0) {
            byte[] var3 = class159.field1907[--class414.field5911];
            class159.field1907[class414.field5911] = null;
            return var3;
        } else {
            int var4 = 35 / ((arg0 + 20) / 47);
            if (arg1 == 30000 && class331.field4772 > 0) {
                byte[] var5 = class409.field5799[--class331.field4772];
                class409.field5799[class331.field4772] = null;
                return var5;
            } else {
                return new byte[arg1];
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIILab;)V")
    public static final void method2577(int arg0, int arg1, int arg2, class256 arg3) {
        class352.field5063 = arg2;
        field6220++;
        class477.field6751 = arg0;
        class251.field3527 = arg3;
        if (arg1 <= 70) {
            field6228 = 32;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (class75.field912 <= arg3 && arg3 <= class453.field6396 && arg4 >= class75.field912 && class453.field6396 >= arg4 && arg1 >= class75.field912 && arg1 <= class453.field6396 && arg2 >= class75.field912 && class453.field6396 >= arg2 && arg5 >= class357.field5123 && arg5 <= class328.field4729 && class357.field5123 <= arg8 && class328.field4729 >= arg8 && class357.field5123 <= arg9 && arg9 <= class328.field4729 && class357.field5123 <= arg6 && class328.field4729 >= arg6) {
            class156.method751(arg2, arg4, 3, arg5, arg1, arg9, arg3, arg8, arg6, arg7);
        } else {
            class390.method2350(arg6, arg4, arg3, arg7, arg8, arg2, true, arg5, arg9, arg1);
        }
        field6221++;
        int var10 = 71 % ((arg0 - 26) / 41);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V")
    public static void method2579(byte arg0) {
        if (arg0 <= 98) {
            method2576(-53, 109);
        }
        field6226 = null;
        field6223 = null;
        field6222 = null;
    }

    static {
        new class40("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
        field6225 = false;
        field6223 = new class72(44, 3);
        field6226 = new int[500];
        field6227 = 0;
    }
}
