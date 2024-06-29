import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class157 extends class504 {

    @OriginalMember(owner = "client!qa", name = "v", descriptor = "J")
    private long field2035 = -1L;

    @OriginalMember(owner = "client!qa", name = "w", descriptor = "Ljava/lang/String;")
    private String field2036 = null;

    @OriginalMember(owner = "client!qa", name = "y", descriptor = "[I")
    public static int[] field2038 = new int[1];

    @OriginalMember(owner = "client!qa", name = "x", descriptor = "B")
    private byte field2037;

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!qa", name = "u", descriptor = "I")
    private int field2034;

    @OriginalMember(owner = "client!qa", name = "z", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!qa", name = "A", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "Lmha;")
    public static class731 field2033;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lqc;Z)V")
    public final void method1003(class400 arg0, boolean arg1) {
        field2040++;
        if (arg1) {
            return;
        }
        class746 var3 = new class746();
        var3.field10194 = this.field2036;
        var3.field10192 = this.field2037;
        var3.field10201 = this.field2034;
        arg0.method2316(var3, 117);
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "([Lkga;Ljc;Z)Lhia;")
    public static final class595 method1004(class578[] arg0, class179 arg1, boolean arg2) {
        field2032++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field7331 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        int var6 = 0;
        if (arg2) {
            field2033 = null;
        }
        while (arg0.length > var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field7331);
            var6++;
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class499.field6402, 0);
        if (class499.field6402[0] == 0) {
            if (class499.field6402[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class499.field6402, 1);
            if (class499.field6402[1] > 1) {
                byte[] var7 = new byte[class499.field6402[1]];
                OpenGL.glGetInfoLogARB(var4, class499.field6402[1], class499.field6402, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class499.field6402[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field7331);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class595(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)V")
    public static void method1005(byte arg0) {
        if (arg0 != -61) {
            method1005((byte) 86);
        }
        field2038 = null;
        field2033 = null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILmc;)V")
    public final void method1006(int arg0, class234 arg1) {
        if (arg0 != 1243) {
            this.method1003(null, true);
        }
        field2039++;
        if (arg1.method1509(true) != 255) {
            arg1.field3133--;
            this.field2035 = arg1.method1516(arg0 ^ 0xFFFFD73D);
        }
        this.field2036 = arg1.method1508(8);
        this.field2034 = arg1.method1553((byte) 99);
        this.field2037 = arg1.method1554(27806);
        arg1.method1516(-11290);
        if (class162.field2164) {
            System.out.println("memberhash:" + this.field2035 + " membername:" + this.field2036);
        }
    }
}
