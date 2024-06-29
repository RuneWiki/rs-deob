import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public class class165 implements class682 {

    @OriginalMember(owner = "client!cc", name = "g", descriptor = "Lpe;")
    private class615 field2058;

    @OriginalMember(owner = "client!cc", name = "f", descriptor = "Ldv;")
    private class112 field2057;

    @OriginalMember(owner = "client!cc", name = "h", descriptor = "Lpe;")
    private class615 field2059;

    @OriginalMember(owner = "client!cc", name = "d", descriptor = "I")
    public static int field2055 = -1;

    @OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
    public static int[] field2056 = new int[500];

    @OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
    public static int field2061 = 0;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "Lrba;")
    public static class101 field2053 = new class101("", 15);

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!cc", name = "c", descriptor = "I")
    public static int field2054;

    @OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!cc", name = "k", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!cc", name = "n", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!cc", name = "o", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!cc", name = "m", descriptor = "Lta;")
    private class597 field2064;

    @OriginalMember(owner = "client!cc", name = "l", descriptor = "Z")
    public static boolean field2063;

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)Z")
    public static final boolean method1151(int arg0) {
        if (arg0 < 114) {
            return false;
        }
        field2060++;
        boolean var1 = true;
        if (class290.field3752 == null) {
            if (class90.field1186.method3362(class526.field6857, -100)) {
                class290.field3752 = class506.method2724(class90.field1186, class526.field6857);
            } else {
                var1 = false;
            }
        }
        if (class463.field6064 == null) {
            if (class90.field1186.method3362(class663.field9217, -100)) {
                class463.field6064 = class506.method2724(class90.field1186, class663.field9217);
            } else {
                var1 = false;
            }
        }
        if (class419.field5430 == null) {
            if (class90.field1186.method3362(class138.field1814, -100)) {
                class419.field5430 = class506.method2724(class90.field1186, class138.field1814);
            } else {
                var1 = false;
            }
        }
        if (class81.field1110 == null) {
            if (class261.field3511.method3362(class392.field5007, -102)) {
                class81.field1110 = class155.method1116(class261.field3511, true, class392.field5007);
            } else {
                var1 = false;
            }
        }
        if (class30.field459 == null) {
            if (class90.field1186.method3362(class392.field5007, -126)) {
                class30.field459 = class506.method2737(class90.field1186, class392.field5007);
            } else {
                var1 = false;
            }
        }
        return var1;
    }

    @OriginalMember(owner = "client!cc", name = "b", descriptor = "(B)V")
    public static void method1152(byte arg0) {
        field2056 = null;
        field2053 = null;
        int var1 = -95 / ((arg0 - 54) / 36);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IZ)V")
    public final void method448(int arg0, boolean arg1) {
        field2054++;
        if (arg0 != -207) {
            method1153(-13, -49, -98, 38, 88, 17, -47, null);
        }
        if (arg1) {
            int var3 = this.field2057.field1462.method3005(class94.field1240, (byte) -125, this.field2057.field1461) + this.field2057.field1464;
            int var4 = this.field2057.field1458.method3059(this.field2057.field1472, class535.field6968, -100) + this.field2057.field1469;
            this.field2064.method3256(0, this.field2057.field1470, this.field2057.field1472, var4, var3, this.field2057.field1471, this.field2057.field1465, null, arg0 ^ 0xB6, null, this.field2057.field1468, null, 0, this.field2057.field1461, this.field2057.field1467, this.field2057.field1474);
        }
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)V")
    public final void method449(int arg0) {
        field2065++;
        int var2 = -94 / ((65 - arg0) / 45);
        class547 var3 = class155.method1116(this.field2058, true, this.field2057.field1459);
        this.field2064 = class520.field6799.method405(var3, class506.method2737(this.field2059, this.field2057.field1459), true);
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(B)Z")
    public final boolean method444(byte arg0) {
        field2062++;
        if (arg0 > -10) {
            this.field2058 = null;
        }
        boolean var2 = true;
        if (!this.field2059.method3362(this.field2057.field1459, -126)) {
            var2 = false;
        }
        if (!this.field2058.method3362(this.field2057.field1459, -97)) {
            var2 = false;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIIIIIILjava/lang/String;)V")
    public static final void method1153(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, String arg7) {
        field2066++;
        class586 var8 = new class586();
        var8.field7949 = arg5;
        var8.field7950 = arg6;
        var8.field7946 = arg1;
        var8.field7948 = arg7;
        var8.field7942 = arg3;
        if (arg0 == 0) {
            var8.field7941 = arg4;
            var8.field7943 = class424.field5503 + arg2;
            class686.field9407.method2104((byte) -22, var8);
        }
    }

    @OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(Lpe;Lpe;Ldv;)V")
    public class165(class615 arg0, class615 arg1, class112 arg2) {
        this.field2058 = arg1;
        this.field2057 = arg2;
        this.field2059 = arg0;
    }

    @OriginalMember(owner = "client!cc", name = "a", descriptor = "(I[BILia;)Lne;")
    public static final class176 method1154(int arg0, byte[] arg1, int arg2, class27 arg3) {
        field2052++;
        if (arg1 == null) {
            return null;
        }
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramRawARB(arg0, 34933, arg1);
        OpenGL.glGetIntegerv(arg2, class44.field625, 0);
        if (class44.field625[0] == -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class176(arg3, arg0, var4);
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        }
    }
}
