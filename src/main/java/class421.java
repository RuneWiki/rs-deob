import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uda")
public class class421 {

    @OriginalMember(owner = "client!uda", name = "f", descriptor = "Lmga;")
    private class666 field5829 = new class666(256);

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "Le;")
    private class498 field5825;

    @OriginalMember(owner = "client!uda", name = "c", descriptor = "Lej;")
    private class111 field5826;

    @OriginalMember(owner = "client!uda", name = "j", descriptor = "[F")
    public static float[] field5833 = new float[4];

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "I")
    public static int field5824;

    @OriginalMember(owner = "client!uda", name = "d", descriptor = "I")
    public static int field5827;

    @OriginalMember(owner = "client!uda", name = "e", descriptor = "I")
    public static int field5828;

    @OriginalMember(owner = "client!uda", name = "g", descriptor = "I")
    public static int field5830;

    @OriginalMember(owner = "client!uda", name = "h", descriptor = "I")
    public static int field5831;

    @OriginalMember(owner = "client!uda", name = "i", descriptor = "I")
    public static int field5832;

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(ZI)V")
    public static final void method2418(boolean arg0, int arg1) {
        field5824++;
        class597 var2 = (class597) class6.field182.method3257(arg1 ^ 0x6947);
        if (arg1 != -26907) {
            field5833 = null;
        }
        while (var2 != null) {
            if (var2.field7914 != null) {
                class639.field8604.method164(var2.field7914);
                var2.field7914 = null;
            }
            if (var2.field7919 != null) {
                class639.field8604.method164(var2.field7919);
                var2.field7919 = null;
            }
            var2.method2797(123);
            var2 = (class597) class6.field182.method3263((byte) -124);
        }
        if (!arg0) {
            return;
        }
        for (class597 var3 = (class597) class665.field9431.method3257(arg1 + 26794); var3 != null; var3 = (class597) class665.field9431.method3263((byte) -91)) {
            if (var3.field7914 != null) {
                class639.field8604.method164(var3.field7914);
                var3.field7914 = null;
            }
            var3.method2797(47);
        }
        for (class597 var4 = (class597) class526.field7004.method2915(90); var4 != null; var4 = (class597) class526.field7004.method2912((byte) 95)) {
            if (var4.field7914 != null) {
                class639.field8604.method164(var4.field7914);
                var4.field7914 = null;
            }
            var4.method2797(-111);
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(I)Z")
    public static final boolean method2419(int arg0) {
        if (arg0 != 5) {
            method2419(-90);
        }
        field5828++;
        if (class292.field4152) {
            try {
                if ((Boolean) class594.method3267("showingVideoAd", arg0 ^ 0xFFFFBAFF, class486.field6574)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Z)V")
    public static void method2420(boolean arg0) {
        if (!arg0) {
            field5833 = null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(II)Lak;")
    public final class324 method2421(int arg0, int arg1) {
        field5827++;
        Object var3 = this.field5829.method3750((long) arg0, false);
        if (var3 != null) {
            return (class324) var3;
        } else if (this.field5825.method2759(32700, arg0)) {
            class364 var4 = this.field5825.method2760(arg0, 21351);
            if (arg1 <= 120) {
                method2419(64);
            }
            int var5 = var4.field4933 ? 64 : this.field5826.field1846;
            class324 var7;
            if (var4.field4939 && this.field5826.method96()) {
                float[] var6 = this.field5825.method2764(var5, arg0, var5, 0.7F, false, (byte) -126);
                var7 = this.field5826.method887(class5.field100, var4.field4942 != 0, var5, var6, 30230, var5);
            } else {
                int[] var8 = var4.field4931 ? this.field5825.method2762(0.7F, var5, false, arg0, 7814, var5) : this.field5825.method2761((byte) 120, var5, true, arg0, 0.7F, var5);
                var7 = this.field5826.method878(var4.field4942 != 0, var5, var5, var8, (byte) -22);
            }
            var7.method947((byte) -65, var4.field4938, var4.field4936);
            this.field5829.method3745(1, (long) arg0, var7);
            return var7;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(Lno;Ljava/lang/String;II)Lte;")
    public static final class575 method2422(class658 arg0, String arg1, int arg2, int arg3) {
        field5830++;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class243.field3404, arg2);
        if (class243.field3404[0] == 0) {
            if (class243.field3404[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class243.field3404, 1);
            if (class243.field3404[1] > 1) {
                byte[] var6 = new byte[class243.field3404[1]];
                OpenGL.glGetInfoLogARB(var4, class243.field3404[1], class243.field3404, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (class243.field3404[0] == 0) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class575(arg0, var4, arg3);
    }

    @OriginalMember(owner = "client!uda", name = "b", descriptor = "(I)V")
    public final void method2423(int arg0) {
        field5832++;
        int var2 = -34 / ((-arg0 - 86) / 39);
        this.field5829.method3740((byte) 60, 5);
    }

    @OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
    public final void method2424(byte arg0) {
        field5831++;
        int var2 = -76 / ((arg0 + 30) / 63);
        this.field5829.method3739(0);
    }

    @OriginalMember(owner = "client!uda", name = "<init>", descriptor = "(Lej;Le;)V")
    public class421(class111 arg0, class498 arg1) {
        this.field5825 = arg1;
        this.field5826 = arg0;
    }
}
