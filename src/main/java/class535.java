import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rba")
public class class535 implements class318 {

    @OriginalMember(owner = "client!rba", name = "d", descriptor = "Lla;")
    private class423 field7782;

    @OriginalMember(owner = "client!rba", name = "f", descriptor = "Lfk;")
    private class313 field7784;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "Lmr;")
    public static class611 field7779 = new class611();

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "I")
    public static int field7780;

    @OriginalMember(owner = "client!rba", name = "c", descriptor = "I")
    public static int field7781;

    @OriginalMember(owner = "client!rba", name = "e", descriptor = "I")
    public static int field7783;

    @OriginalMember(owner = "client!rba", name = "h", descriptor = "I")
    public static int field7786;

    @OriginalMember(owner = "client!rba", name = "i", descriptor = "I")
    public static int field7787;

    @OriginalMember(owner = "client!rba", name = "j", descriptor = "I")
    public static int field7788;

    @OriginalMember(owner = "client!rba", name = "k", descriptor = "Lsh;")
    public static class404 field7789;

    @OriginalMember(owner = "client!rba", name = "g", descriptor = "Ltd;")
    private class515 field7785;

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ILjava/lang/String;ILkw;)Ltn;")
    public static final class716 method3235(int arg0, String arg1, int arg2, class346 arg3) {
        field7786++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class644.field9261, 0);
        if (arg2 != 221) {
            field7779 = null;
        }
        if (class644.field9261[0] == 0) {
            if (class644.field9261[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class644.field9261, 1);
            if (class644.field9261[1] > 1) {
                byte[] var6 = new byte[class644.field9261[1]];
                OpenGL.glGetInfoLogARB(var4, class644.field9261[1], class644.field9261, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class644.field9261[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class716(arg3, var4, arg0);
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(B)V")
    public static final void method3236(byte arg0) {
        if (arg0 != 2) {
            method3237(true);
        }
        field7787++;
        if (class300.field4086.toLowerCase().indexOf("microsoft") != -1) {
            class43.field725[192] = 58;
            class43.field725[222] = 59;
            class43.field725[221] = 43;
            class43.field725[219] = 42;
            class43.field725[189] = 26;
            class43.field725[190] = 72;
            class43.field725[223] = 28;
            class43.field725[188] = 71;
            class43.field725[220] = 74;
            class43.field725[187] = 27;
            class43.field725[186] = 57;
            class43.field725[191] = 73;
            return;
        }
        class43.field725[44] = 71;
        class43.field725[91] = 42;
        class43.field725[45] = 26;
        class43.field725[59] = 57;
        class43.field725[46] = 72;
        class43.field725[92] = 74;
        class43.field725[47] = 73;
        class43.field725[61] = 27;
        if (class300.field4109 == null) {
            class43.field725[222] = 59;
            class43.field725[192] = 58;
        } else {
            class43.field725[222] = 58;
            class43.field725[520] = 59;
            class43.field725[192] = 28;
        }
        class43.field725[93] = 43;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(B)V")
    public final void method414(byte arg0) {
        if (arg0 <= 126) {
            this.method414((byte) 31);
        }
        this.field7785 = class181.method1279(this.field7782, 0, this.field7784.field4238);
        field7788++;
    }

    @OriginalMember(owner = "client!rba", name = "b", descriptor = "(Z)V")
    public static void method3237(boolean arg0) {
        field7789 = null;
        if (arg0) {
            method3237(false);
        }
        field7779 = null;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(IZLjava/lang/Object;)[B")
    public static final byte[] method3238(int arg0, boolean arg1, Object arg2) {
        field7783++;
        if (arg2 == null) {
            return null;
        }
        if (arg0 != 26) {
            field7779 = null;
        }
        if (arg2 instanceof byte[]) {
            byte[] var3 = (byte[]) arg2;
            return arg1 ? class67.method591(var3, false) : var3;
        } else if (arg2 instanceof class234) {
            class234 var4 = (class234) arg2;
            return var4.method1637(108);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!rba", name = "<init>", descriptor = "(Lla;Lfk;)V")
    public class535(class423 arg0, class313 arg1) {
        this.field7782 = arg0;
        this.field7784 = arg1;
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(Z)Z")
    public final boolean method418(boolean arg0) {
        if (!arg0) {
            field7779 = null;
        }
        field7781++;
        return this.field7782.method2609(0, this.field7784.field4238);
    }

    @OriginalMember(owner = "client!rba", name = "a", descriptor = "(ZB)V")
    public final void method678(boolean arg0, byte arg1) {
        field7780++;
        if (arg0) {
            int var3 = class68.field1042 > class758.field10546 ? class68.field1042 : class758.field10546;
            int var4 = class565.field8187 > class544.field7915 ? class565.field8187 : class544.field7915;
            int var5 = this.field7785.method784();
            int var6 = this.field7785.method780();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var4 < var9) {
                var9 = var4;
                var10 = 0;
                var8 = var4 * var5 / var6;
                var7 = (var3 - var8) / 2;
            }
            this.field7785.method3132(var7, var10, var8, var9);
        }
        if (arg1 != -53) {
            method3235(-79, null, 36, null);
        }
    }
}
