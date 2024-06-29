import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class701 extends Exception {

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Z")
    public static volatile boolean field9847 = true;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lek;")
    public static class505 field9845 = new class505();

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field9842;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field9843;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field9848;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "I")
    public static int field9849;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "Lfw;")
    public static class55 field9850;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BLha;IZ)Lio;")
    public static final class435 method3939(byte arg0, class58 arg1, int arg2, boolean arg3) {
        field9842++;
        if (arg2 == -1) {
            return null;
        }
        if (class417.field5862 != null) {
            for (int var4 = 0; var4 < class417.field5862.length; var4++) {
                if (class417.field5862[var4] == arg2) {
                    return class478.field6826[var4];
                }
            }
        }
        class435 var5 = (class435) class118.field1855.method3054((byte) -108, (long) arg2);
        if (var5 != null) {
            if (arg3 && var5.field6085 == null) {
                class323 var6 = class251.method1709(class19.field244, 1, arg2);
                if (var6 == null) {
                    return null;
                }
                var5.field6085 = var6;
            }
            return var5;
        }
        class55[] var7 = class55.method505(class571.field8117, arg2);
        if (var7 == null) {
            return null;
        }
        if (arg0 != -21) {
            method3941(-110);
        }
        class323 var8 = class251.method1709(class19.field244, 1, arg2);
        if (var8 == null) {
            return null;
        }
        class435 var9;
        if (arg3) {
            var9 = new class435(arg1.method632(var8, var7, true), var8);
        } else {
            var9 = new class435(arg1.method632(var8, var7, true));
        }
        class118.field1855.method3047(false, var9, (long) arg2);
        return var9;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)[Ljha;")
    public static final class692[] method3940(int arg0) {
        if (arg0 != 1) {
            method3941(115);
        }
        field9846++;
        return new class692[] { class505.field7210, class556.field7784, class633.field9062 };
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)V")
    public static void method3941(int arg0) {
        field9845 = null;
        field9850 = null;
        if (arg0 > -96) {
            field9847 = true;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "([Lgn;Loea;I)Las;")
    public static final class151 method3942(class698[] arg0, class594 arg1, int arg2) {
        field9848++;
        for (int var3 = 0; var3 < arg0.length; var3++) {
            if (arg0[var3] == null || arg0[var3].field9812 <= 0L) {
                return null;
            }
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; var6 < arg0.length; var6++) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field9812);
        }
        int var7 = -89 % (arg2 / 42);
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class242.field3394, 0);
        if (class242.field3394[0] == 0) {
            if (class242.field3394[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class242.field3394, 1);
            if (class242.field3394[1] > 1) {
                byte[] var8 = new byte[class242.field3394[1]];
                OpenGL.glGetInfoLogARB(var4, class242.field3394[1], class242.field3394, 0, var8, 0);
                System.out.println(new String(var8));
            }
            if (class242.field3394[0] == 0) {
                for (int var9 = 0; var9 < arg0.length; var9++) {
                    OpenGL.glDetachObjectARB(var4, arg0[var9].field9812);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class151(arg1, var4, arg0);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Ljp;")
    public static final class354 method3943(boolean arg0) {
        if (arg0) {
            method3941(-53);
        }
        field9844++;
        class354 var1 = (class354) class146.field2237.method1196(-121);
        if (var1 != null) {
            var1.method3617(1);
            var1.method1553(84);
            return var1;
        }
        class354 var2;
        do {
            var2 = (class354) class322.field4579.method1196(-123);
            if (var2 == null) {
                return null;
            }
            if (var2.method2215((byte) 103) > class742.method4128(1)) {
                return null;
            }
            var2.method3617(1);
            var2.method1553(-116);
        } while ((var2.field3211 & Long.MIN_VALUE) == 0L);
        return var2;
    }
}
