import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class319 {

    @OriginalMember(owner = "client!tu", name = "j", descriptor = "Z")
    public boolean field5004;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field5000 = 0;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "I")
    public static int field4995;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field4996;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field4997;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field4998;

    @OriginalMember(owner = "client!tu", name = "i", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!tu", name = "k", descriptor = "I")
    public static int field5005;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "Lbo;")
    public class679 field4999;

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "Lbo;")
    public class679 field5001;

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "Z")
    public boolean field5002;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V", line = 9)
    public final void method2169(boolean arg0) {
        if (this.field4999 != null) {
            this.field4999.method431(-5517);
        }
        field4998++;
        this.field5002 = false;
        if (!arg0) {
            method2171(27, -15, null);
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(ILjava/lang/String;Ler;B)Ljf;", line = 32)
    public static final class199 method2170(int arg0, String arg1, class92 arg2, byte arg3) {
        field5003++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg0);
        if (arg3 < 64) {
            field5005 = -67;
        }
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class677.field9524, 0);
        if (class677.field9524[0] == 0) {
            if (class677.field9524[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class677.field9524, 1);
            if (class677.field9524[1] > 1) {
                byte[] var6 = new byte[class677.field9524[1]];
                OpenGL.glGetInfoLogARB(var4, class677.field9524[1], class677.field9524, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class677.field9524[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class199(arg2, var4, arg0);
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II[Lpca;)V", line = 70)
    public static final void method2171(int arg0, int arg1, class665[] arg2) {
        field4995++;
        for (int var3 = arg1; var3 < arg2.length; var3++) {
            class665 var4 = arg2[var3];
            if (var4 != null && var4.field9401 == arg0 && !client.method1949(var4)) {
                if (var4.field9309 == 0) {
                    method2171(var4.field9400, arg1, arg2);
                    if (var4.field9296 != null) {
                        method2171(var4.field9400, arg1, var4.field9296);
                    }
                    class102 var5 = (class102) class486.field7115.method1558((long) var4.field9400, (byte) -93);
                    if (var5 != null) {
                        class149.method1249(-46, var5.field1687);
                    }
                }
                if (var4.field9309 == 6 && var4.field9376 != -1) {
                    class428 var6 = class636.field8942.method2872((byte) 11, var4.field9376);
                    if (var6 != null) {
                        var4.field9299 += class116.field1805;
                        int var7 = var4.field9387;
                        while (var6.field6532[var4.field9387] < var4.field9299) {
                            var4.field9299 -= var6.field6532[var4.field9387];
                            var4.field9387++;
                            if (var6.field6521.length <= var4.field9387) {
                                var4.field9387 -= var6.field6510;
                                if (var4.field9387 < 0 || var4.field9387 >= var6.field6521.length) {
                                    var4.field9387 = 0;
                                }
                            }
                            var4.field9383 = var4.field9387 + 1;
                            if (var6.field6521.length <= var4.field9383) {
                                var4.field9383 -= var6.field6510;
                                if (var4.field9383 < 0 || var6.field6521.length <= var4.field9383) {
                                    var4.field9383 = -1;
                                }
                            }
                            class362.method2415(-121, var4);
                        }
                        if (var4.field9387 != var7) {
                            class204.method1577(var4.field9387, var6, -100);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)Z", line = 164)
    public final boolean method2172(int arg0) {
        if (arg0 != 0) {
            this.field5001 = null;
        }
        field4997++;
        return this.field5002 && !this.field5004;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I[Ljava/lang/String;[S)V", line = 175)
    public static final void method2173(int arg0, String[] arg1, short[] arg2) {
        field4996++;
        if (arg0 >= -22) {
            field5000 = -115;
        }
        class324.method2186(arg1.length - 1, -1, arg2, 0, arg1);
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(Z)V", line = 185)
    public class319(boolean arg0) {
        this.field5004 = arg0;
    }
}
