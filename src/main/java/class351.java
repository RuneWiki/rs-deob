import jaggl.OpenGL;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class351 extends class719 {

    @OriginalMember(owner = "client!bb", name = "x", descriptor = "Lgaa;")
    private class314 field5116;

    @OriginalMember(owner = "client!bb", name = "C", descriptor = "Lsha;")
    private class757 field5120;

    @OriginalMember(owner = "client!bb", name = "u", descriptor = "Lkfa;")
    private class627 field5113;

    @OriginalMember(owner = "client!bb", name = "A", descriptor = "J")
    public static long field5119 = 0L;

    @OriginalMember(owner = "client!bb", name = "s", descriptor = "Ljea;")
    public static class474 field5111 = new class474(0, -1);

    @OriginalMember(owner = "client!bb", name = "E", descriptor = "[I")
    public static int[] field5122 = new int[14];

    @OriginalMember(owner = "client!bb", name = "o", descriptor = "I")
    public static int field5107;

    @OriginalMember(owner = "client!bb", name = "p", descriptor = "I")
    public static int field5108;

    @OriginalMember(owner = "client!bb", name = "q", descriptor = "I")
    public static int field5109;

    @OriginalMember(owner = "client!bb", name = "r", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!bb", name = "t", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!bb", name = "v", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!bb", name = "w", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!bb", name = "y", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!bb", name = "z", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!bb", name = "F", descriptor = "I")
    public static int field5123;

    @OriginalMember(owner = "client!bb", name = "G", descriptor = "Lvf;")
    public static class162 field5124;

    @OriginalMember(owner = "client!bb", name = "D", descriptor = "Lhp;")
    public static class346 field5121;

    // $FF: synthetic field
    @OriginalMember(owner = "client!bb", name = "H", descriptor = "Ljava/lang/Class;")
    public static Class field5125;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(III)V")
    public final void method219(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            this.method218((byte) -7);
        }
        ++field5107;
        if (!this.field5116.field4433) {
            int var4 = super.field9776.field9602 % 4000 * 16 / 4000;
            super.field9776.method3882(0, this.field5116.field4429[var4]);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, 0.0F, 0.0F, 0.0F, 1.0F);
        } else {
            float var5 = (float) (super.field9776.field9602 % 4000) / 4000.0F;
            super.field9776.method3882(0, this.field5116.field4426);
            OpenGL.glProgramLocalParameter4fARB(34336, 0, var5, 0.0F, 0.0F, 1.0F);
        }
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(B)V")
    public static void method2240(byte arg0) {
        field5124 = null;
        field5122 = null;
        field5111 = null;
        if (arg0 != -14) {
            method2241(82);
        }
        field5121 = null;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(B)Z")
    public final boolean method218(byte arg0) {
        if (arg0 < 16) {
            return true;
        } else {
            ++field5117;
            return this.field5113 != null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "(I)V")
    public static final void method2241(int arg0) {
        ++field5115;
        if (arg0 == 14) {
            try {
                Method var1 = (field5125 != null ? field5125 : (field5125 = method2243("java.lang.Runtime"))).getMethod("availableProcessors");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                        class683.field9123 = var3;
                    } catch (Throwable var4) {
                    }
                }
            } catch (Exception var5) {
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "(I)V")
    public final void method220(int arg0) {
        ++field5110;
        if (arg0 != 23363) {
            field5111 = null;
        }
        super.field9776.method3859(117, 0, class790.field10851);
        OpenGL.glBindProgramARB(34336, 0);
        OpenGL.glDisable(34820);
        OpenGL.glDisable(34336);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZZ)V")
    public final void method225(boolean arg0, boolean arg1) {
        super.field9776.method3911(22228, class175.field2307, class117.field1574);
        if (!arg0) {
            this.field5113 = null;
        }
        ++field5112;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
    public final void method222(int arg0, boolean arg1) {
        OpenGL.glBindProgramARB(34336, this.field5113.field8490);
        ++field5114;
        if (arg0 >= -126) {
            field5124 = null;
        }
        OpenGL.glEnable(34336);
        super.field9776.method3859(123, 0, class417.field6010);
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ZLb;I)V")
    public final void method221(boolean arg0, class352 arg1, int arg2) {
        if (!arg0) {
            field5124 = null;
        }
        ++field5108;
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(Lsha;Luq;Lgaa;)V")
    public class351(class757 arg0, class172 arg1, class314 arg2) {
        super(arg0);
        this.field5116 = arg2;
        this.field5120 = arg0;
        if (arg1 != null && this.field5116.method2011(false) && this.field5120.field10340) {
            this.field5113 = class521.method3033((byte) 23, arg1.method1189("transparent_water", 0, "gl"), this.field5120, 34336);
        } else {
            this.field5113 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(B)V")
    public static final void method2242(byte arg0) {
        if (arg0 >= 46) {
            ++field5109;
            if (class552.field7624 != null) {
                try {
                    String var1 = class552.field7624.getParameter("cookiehost");
                    int var2 = -11745 + (int) (class401.method2440(false) / 86400000L);
                    String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
                    class376.method2359("document.cookie=\"" + var3 + "\"", class552.field7624, (byte) 101);
                } catch (Throwable var4) {
                }
            }
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2243(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
