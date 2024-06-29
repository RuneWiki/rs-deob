import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class179 extends class252 {

    @OriginalMember(owner = "client!aa", name = "v", descriptor = "[B")
    public byte[] field2961;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "Ljava/lang/String;")
    public static String field2966 = null;

    @OriginalMember(owner = "client!aa", name = "y", descriptor = "Lad;")
    public static class275 field2964 = new class275(5);

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "I")
    public static int field2967 = -1;

    @OriginalMember(owner = "client!aa", name = "u", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!aa", name = "w", descriptor = "I")
    public static int field2962;

    @OriginalMember(owner = "client!aa", name = "x", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([B)V")
    public class179(byte[] arg0) {
        this.field2961 = arg0;
    }

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "(I)V")
    public static void method1259(int arg0) {
        if (arg0 > 34) {
            field2966 = null;
            field2964 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method1260(String arg0, int arg1) {
        String var2 = class125.method857(class162.method1114((byte) -128, arg0), (byte) -91);
        field2963++;
        if (var2 == null) {
            var2 = "";
        }
        return arg1 == 0 ? var2 : null;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZI[Lrg;III)V")
    public static final void method1261(boolean arg0, int arg1, class248[] arg2, int arg3, int arg4, int arg5) {
        int var6 = 0;
        if (arg3 < 121) {
            method1259(15);
        }
        while (arg2.length > var6) {
            class248 var7 = arg2[var6];
            if (var7 != null && var7.field3974 == arg1) {
                class161.method1104(arg4, var7, 58, arg5, arg0);
                class28.method216(var7, arg5, arg4, -108);
                if (var7.field3953 > var7.field3994 - var7.field4057) {
                    var7.field3953 = var7.field3994 - var7.field4057;
                }
                if (var7.field3944 > (var7.field3914 - var7.field4016)) {
                    var7.field3944 = var7.field3914 - var7.field4016;
                }
                if (var7.field3953 < 0) {
                    var7.field3953 = 0;
                }
                if (var7.field3944 < 0) {
                    var7.field3944 = 0;
                }
                if (var7.field4038 == 0) {
                    class255.method1725((byte) -10, var7, arg0);
                }
            }
            var6++;
        }
        field2960++;
    }
}
