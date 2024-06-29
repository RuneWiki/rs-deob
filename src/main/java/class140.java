import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class140 extends class138 {

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "Ljava/lang/Object;")
    private Object field2134;

    @OriginalMember(owner = "client!pd", name = "O", descriptor = "I")
    public static int field2138 = 0;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "Lpm;")
    public static class349 field2131 = new class349("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

    @OriginalMember(owner = "client!pd", name = "R", descriptor = "Z")
    public static boolean field2141 = false;

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field2136;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field2137;

    @OriginalMember(owner = "client!pd", name = "Q", descriptor = "I")
    public static int field2140;

    @OriginalMember(owner = "client!pd", name = "P", descriptor = "Ltj;")
    public static class108 field2139;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IIILml;II)Ljava/awt/Frame;")
    public static final Frame method1060(int arg0, int arg1, int arg2, class219 arg3, int arg4, int arg5) {
        field2133++;
        if (!arg3.method1539(0)) {
            return null;
        }
        if (arg1 == 0) {
            class321[] var6 = class226.method1584(arg3, (byte) -21);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4698 == arg2 && var6[var8].field4693 == arg0 && (arg5 == 0 || var6[var8].field4694 == arg5) && (!var7 || var6[var8].field4695 > arg1)) {
                    var7 = true;
                    arg1 = var6[var8].field4695;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class156 var9 = arg3.method1523(arg2, arg1, 2089629072, arg0, arg5);
        while (var9.field2298 == 0) {
            class259.method1790((byte) -107, 10L);
        }
        Frame var10 = (Frame) var9.field2295;
        if (var10 == null) {
            return null;
        } else if (var9.field2298 == 2) {
            class314.method2102(var10, arg3, 124);
            return null;
        } else {
            if (arg4 < 50) {
                method1062((byte) -24);
            }
            return var10;
        }
    }

    @OriginalMember(owner = "client!pd", name = "e", descriptor = "(B)Ljava/lang/Object;")
    public final Object method1051(byte arg0) {
        field2137++;
        int var2 = -125 / ((arg0 + 17) / 45);
        return this.field2134;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILtj;)V")
    public static final void method1061(int arg0, class108 arg1) {
        if (arg0 == -28303) {
            class282.field4089 = arg1;
            field2132++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(B)V")
    public static void method1062(byte arg0) {
        int var1 = -40 / ((3 - arg0) / 47);
        field2139 = null;
        field2131 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)Ljava/lang/String;")
    public static final String method1063(int arg0, int arg1, int arg2) {
        field2135++;
        int var3 = arg0 - arg2;
        if (var3 < -9) {
            return "<col=ff0000>";
        } else if (var3 < -6) {
            return "<col=ff3000>";
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (var3 > 9) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else {
            int var4 = -37 / ((62 - arg1) / 39);
            if (var3 > 3) {
                return "<col=80ff00>";
            } else if (var3 > 0) {
                return "<col=c0ff00>";
            } else {
                return "<col=ffff00>";
            }
        }
    }

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "(B)Z")
    public final boolean method1050(byte arg0) {
        if (arg0 == -40) {
            field2136++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pd", name = "<init>", descriptor = "(Laa;Ljava/lang/Object;)V")
    public class140(class283 arg0, Object arg1) {
        super(arg0);
        this.field2134 = arg1;
    }
}
