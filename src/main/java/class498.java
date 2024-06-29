import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class498 extends class49 {

    @OriginalMember(owner = "client!laa", name = "y", descriptor = "Ljava/lang/String;")
    public String field6827;

    @OriginalMember(owner = "client!laa", name = "x", descriptor = "Lwd;")
    public class179 field6826;

    @OriginalMember(owner = "client!laa", name = "A", descriptor = "Ljn;")
    public static class134 field6829 = new class134(115, 3);

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "[I")
    public static int[] field6834 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!laa", name = "w", descriptor = "I")
    public static int field6825;

    @OriginalMember(owner = "client!laa", name = "z", descriptor = "I")
    public static int field6828;

    @OriginalMember(owner = "client!laa", name = "B", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!laa", name = "D", descriptor = "I")
    public static int field6831;

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "I")
    public int field6833;

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "Lee;")
    public static class506 field6832;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(B)V", line = 3)
    public static void method2925(byte arg0) {
        field6829 = null;
        field6832 = null;
        field6834 = null;
        if (arg0 != 25) {
            field6829 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BLpja;)Z", line = 22)
    public final boolean method2926(byte arg0, class171 arg1) {
        field6825++;
        if (arg0 >= -87) {
            method2929((byte) 110, -85, null, null);
        }
        int var3 = this.method2928(79);
        arg1.method416(9867);
        this.field6833--;
        if (this.field6833 != 0) {
            return this.method2928(82) != var3;
        }
        this.method527(-11229);
        this.method416(9867);
        class367.field5278--;
        class577.field8108.method305(this, arg1.field2183, 18320);
        return false;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(ILpja;)Z", line = 48)
    public final boolean method2927(int arg0, class171 arg1) {
        field6828++;
        arg1.method416(arg0 + 9768);
        boolean var3 = true;
        class171 var4 = (class171) this.field6826.method1140(-85);
        while (var4 != null) {
            if (class611.method3536(false, arg1.field2174, var4.field2174)) {
                class409.method2501(var4, arg1, arg0 - 23);
                this.field6833++;
                if (var3) {
                    return false;
                }
                return true;
            }
            var4 = (class171) this.field6826.method1138(122);
            var3 = false;
        }
        if (arg0 == 99) {
            this.field6826.method1139((byte) -84, arg1);
            this.field6833++;
            return var3;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)I", line = 80)
    public final int method2928(int arg0) {
        if (arg0 <= 22) {
            method2925((byte) -81);
        }
        field6830++;
        return this.field6826.field2266.field591 == this.field6826.field2266 ? -1 : ((class171) this.field6826.field2266.field591).field2174;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(BILoaa;[B)Lsu;", line = 96)
    public static final class544 method2929(byte arg0, int arg1, class556 arg2, byte[] arg3) {
        if (arg0 < 95) {
            field6832 = null;
        }
        field6831++;
        if (arg3 == null || arg3.length == 0) {
            return null;
        }
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        OpenGL.glShaderSourceRawARB(var4, arg3);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class333.field4774, 0);
        if (class333.field4774[0] == 0) {
            if (class333.field4774[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class333.field4774, 1);
            if (class333.field4774[1] > 1) {
                byte[] var6 = new byte[class333.field4774[1]];
                OpenGL.glGetInfoLogARB(var4, class333.field4774[1], class333.field4774, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class333.field4774[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class544(arg2, var4, arg1);
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 140)
    public class498(String arg0) {
        this.field6827 = arg0;
        this.field6826 = new class179();
    }
}
