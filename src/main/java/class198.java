import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class198 implements class194 {

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Z")
    public static boolean field3038 = false;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "F")
    public static float field3035;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field3032;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field3033;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field3034;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "I")
    public static int field3036;

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "[Ljn;")
    public static class327[] field3037;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILjava/awt/Component;I)Ljb;", line = 4)
    public static final class218 method1440(int arg0, int arg1, Component arg2, int arg3) {
        field3032++;
        try {
            if (arg3 == 6) {
                Class var4 = Class.forName("bb");
                class218 var5 = (class218) var4.getDeclaredConstructor().newInstance();
                var5.method1090(arg0, (byte) 124, arg2, arg1);
                return var5;
            } else {
                return (class218) null;
            }
        } catch (Throwable var8) {
            class225 var7 = new class225();
            var7.method1090(arg0, (byte) 127, arg2, arg1);
            return var7;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V", line = 28)
    public static final void method1441(byte arg0) {
        if (arg0 < 119) {
            field3038 = true;
        }
        field3033++;
        class189.field2972.method750((byte) 100);
        class240.field3655.method750((byte) 119);
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(JII[I)Ljava/lang/String;", line = 49)
    public final String method1416(long arg0, int arg1, int arg2, int[] arg3) {
        field3036++;
        if (arg1 == arg2) {
            class320 var7 = class325.method2258(25494, arg3[0]);
            return var7.method2225((int) arg0, false);
        } else if (arg2 == 1 || arg2 == 10) {
            class108 var6 = class222.method1576((int) arg0, (byte) 92);
            return var6.field1630;
        } else if (arg2 == 6 || arg2 == 7 || arg2 == 11) {
            return class325.method2258(25494, arg3[0]).method2225((int) arg0, false);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 86)
    public static void method1442(int arg0) {
        field3037 = null;
        if (arg0 != 0) {
            field3038 = false;
        }
    }
}
