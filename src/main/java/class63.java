import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class63 {

    @OriginalMember(owner = "client!qn", name = "g", descriptor = "Z")
    public static boolean field780 = false;

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "F")
    public static float field778;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "I")
    public int field774;

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!qn", name = "c", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!qn", name = "d", descriptor = "I")
    public int field777;

    @OriginalMember(owner = "client!qn", name = "f", descriptor = "I")
    public static int field779;

    @OriginalMember(owner = "client!qn", name = "h", descriptor = "I")
    public int field781;

    @OriginalMember(owner = "client!qn", name = "i", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(III)I", line = 10)
    public static final int method536(int arg0, int arg1, int arg2) {
        int var3 = -56 % ((arg0 - 78) / 38);
        field779++;
        byte var4;
        if (arg2 > 20000) {
            var4 = 4;
            class643.method3555(-1);
        } else if (arg2 > 10000) {
            class262.method1713(1);
            var4 = 3;
        } else if (arg2 > 5000) {
            class493.method2941(-65536);
            var4 = 2;
        } else {
            var4 = 1;
            class546.method3170(76, true);
        }
        if (class557.field7812.field6521.method2556(false) != arg1) {
            class557.field7812.method2755(249682952, arg1, class557.field7812.field6555);
            class759.method4212(false, 0, arg1);
        }
        class90.method681(10343);
        return var4;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(ZB)V", line = 62)
    public static final void method537(boolean arg0, byte arg1) {
        field775++;
        if (class185.field2500.length() == 0) {
            return;
        }
        class559.method3221("--> " + class185.field2500, (byte) 59);
        class150.method1022(class185.field2500, false, arg0, -123);
        class614.field8601 = 0;
        class185.field2500 = "";
        if (arg1 <= 24) {
            method538(null, null, (byte) 122, -70);
        }
        class115.field1387 = 0;
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "([BLfha;BI)Lwba;", line = 80)
    public static final class48 method538(byte[] arg0, class378 arg1, byte arg2, int arg3) {
        field782++;
        if (arg0 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg3, var4);
        OpenGL.glProgramRawARB(arg3, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class64.field790, 0);
        if (class64.field790[0] == -1) {
            OpenGL.glBindProgramARB(arg3, 0);
            int var5 = -52 / ((-arg2 - 62) / 40);
            return new class48(arg1, arg3, var4);
        } else {
            OpenGL.glBindProgramARB(arg3, 0);
            return null;
        }
    }
}
