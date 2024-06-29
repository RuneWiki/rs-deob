import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class300 extends class154 {

    @OriginalMember(owner = "client!sm", name = "k", descriptor = "Z")
    public boolean field4122 = true;

    @OriginalMember(owner = "client!sm", name = "p", descriptor = "Z")
    public boolean field4127 = false;

    @OriginalMember(owner = "client!sm", name = "y", descriptor = "I")
    public static int field4136 = -1;

    @OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
    public static int field4120;

    @OriginalMember(owner = "client!sm", name = "j", descriptor = "I")
    public static int field4121;

    @OriginalMember(owner = "client!sm", name = "l", descriptor = "I")
    public int field4123;

    @OriginalMember(owner = "client!sm", name = "m", descriptor = "I")
    public int field4124;

    @OriginalMember(owner = "client!sm", name = "n", descriptor = "I")
    public int field4125;

    @OriginalMember(owner = "client!sm", name = "o", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!sm", name = "r", descriptor = "I")
    public int field4129;

    @OriginalMember(owner = "client!sm", name = "s", descriptor = "I")
    public int field4130;

    @OriginalMember(owner = "client!sm", name = "t", descriptor = "I")
    public int field4131;

    @OriginalMember(owner = "client!sm", name = "u", descriptor = "I")
    public int field4132;

    @OriginalMember(owner = "client!sm", name = "v", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!sm", name = "w", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!sm", name = "x", descriptor = "I")
    public int field4135;

    @OriginalMember(owner = "client!sm", name = "z", descriptor = "I")
    public int field4137;

    @OriginalMember(owner = "client!sm", name = "q", descriptor = "Ldja;")
    public class326 field4128;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lhk;[Lhv;B)Lag;")
    public static final class712 method1927(class111 arg0, class546[] arg1, byte arg2) {
        field4133++;
        for (int var3 = 0; var3 < arg1.length; var3++) {
            if (arg1[var3] == null || arg1[var3].field7421 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg1.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg1[var6].field7421);
        }
        OpenGL.glLinkProgramARB(var4);
        if (arg2 != 31) {
            return null;
        }
        OpenGL.glGetObjectParameterivARB(var4, 35714, class27.field515, 0);
        if (class27.field515[0] == 0) {
            if (class27.field515[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class27.field515, 1);
            if (class27.field515[1] > 1) {
                byte[] var7 = new byte[class27.field515[1]];
                OpenGL.glGetInfoLogARB(var4, class27.field515[1], class27.field515, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class27.field515[0] == 0) {
                for (int var8 = 0; var8 < arg1.length; var8++) {
                    OpenGL.glDetachObjectARB(var4, arg1[var8].field7421);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class712(arg0, var4, arg1);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
    public static final void method1928(int arg0, int arg1) {
        class549 var2 = class325.field4448[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class549 var4 = class325.field4448[var3][arg0][arg1] = class325.field4448[var3 + 1][arg0][arg1];
            if (var4 != null) {
                for (class58 var5 = var4.field7466; var5 != null; var5 = var5.field811) {
                    class597 var6 = var5.field815;
                    if (var6.field8368 == arg0 && var6.field8369 == arg1) {
                        var6.field7391--;
                    }
                }
                if (var4.field7471 != null) {
                    var4.field7471.field7391--;
                }
                if (var4.field7462 != null) {
                    var4.field7462.field7391--;
                }
                if (var4.field7463 != null) {
                    var4.field7463.field7391--;
                }
                if (var4.field7464 != null) {
                    var4.field7464.field7391--;
                }
                if (var4.field7467 != null) {
                    var4.field7467.field7391--;
                }
            }
        }
        if (class325.field4448[0][arg0][arg1] == null) {
            class325.field4448[0][arg0][arg1] = new class549(0);
            class325.field4448[0][arg0][arg1].field7459 = 1;
        }
        class325.field4448[0][arg0][arg1].field7465 = var2;
        class325.field4448[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(III)Z")
    public static final boolean method1929(int arg0, int arg1, int arg2) {
        field4120++;
        if (!class611.field8532) {
            return false;
        }
        int var3 = arg1 >> 16;
        int var4 = arg1 & 0xFFFF;
        if (arg0 != -9) {
            return false;
        } else if (class431.field5870[var3] == null || class431.field5870[var3][var4] == null) {
            return false;
        } else {
            class17 var5 = class431.field5870[var3][var4];
            if (arg2 == -1 && var5.field352 == 0) {
                for (class534 var6 = (class534) class208.field3119.method3589((byte) -127); var6 != null; var6 = (class534) class208.field3119.method3591(arg0 ^ 0xFFFFFFF7)) {
                    if (var6.field7229 == 2 || var6.field7229 == 1001 || var6.field7229 == 8 || var6.field7229 == 23 || var6.field7229 == 6) {
                        for (class17 var7 = class379.method2309(var6.field7223, 192); var7 != null; var7 = class533.method3020(var7, (byte) -50)) {
                            if (var5.field372 == var7.field372) {
                                return true;
                            }
                        }
                    }
                }
            } else {
                for (class534 var8 = (class534) class208.field3119.method3589((byte) -127); var8 != null; var8 = (class534) class208.field3119.method3591(0)) {
                    if (var8.field7236 == arg2 && var5.field372 == var8.field7223 && (var8.field7229 == 2 || var8.field7229 == 1001 || var8.field7229 == 8 || var8.field7229 == 23 || var8.field7229 == 6)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IIIIIIZII)V")
    public static final void method1930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, int arg8) {
        field4121++;
        if (arg3 >= 1 && arg5 >= 1 && arg3 <= (class483.field6515 - 2) && (class65.field926 - 2) >= arg5) {
            int var9 = arg4;
            if (arg4 < 3 && class61.method425(arg5, 16340, arg3)) {
                var9 = arg4 + 1;
            }
            if (class111.field1911.field6734.method3639((byte) 79) == 0 && !class652.method3654(18334, arg3, arg5, var9, class426.field5820)) {
                return;
            }
            if (class325.field4448 == null) {
                return;
            }
            class707.field9716.method1214(arg2, arg3, arg5, 106, class711.field9798[arg4], arg4, class95.field1472);
            if (arg8 >= 0) {
                int var10 = class111.field1911.field6716.method3547((byte) 50);
                class111.field1911.method2823(true, class111.field1911.field6716, 1);
                class707.field9716.method1220(arg1, arg7, var9, arg5, class95.field1472, arg8, class711.field9798[arg4], arg0, arg3, arg4, arg6);
                class111.field1911.method2823(true, class111.field1911.field6716, var10);
            }
        }
        if (arg6) {
            field4136 = -1;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(B)V")
    public static final void method1931(byte arg0) {
        field4134++;
        for (class606 var1 = (class606) class142.field2405.method1951(-723780560); var1 != null; var1 = (class606) class142.field2405.method1946(-6974)) {
            if (var1.field8457 > 1) {
                var1.field8457 = 0;
                class668.field9294.method270(var1, ((class534) var1.field8460.field4189.field7006).field7235, -122);
                var1.field8460.method1950(0);
            }
        }
        class690.field9574 = 0;
        class430.field5861 = 0;
        class208.field3119.method3590((byte) -115);
        int var2 = -39 / ((arg0 - 13) / 60);
        class732.field10102.method338((byte) -70);
        class142.field2405.method1950(0);
        class14.method78(class139.field2364, 116);
    }
}
