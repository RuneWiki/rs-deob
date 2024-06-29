import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class165 extends Canvas {

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field2260;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "Z")
    public static boolean field2261 = false;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Ljava/lang/String;")
    public static String field2262 = null;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lwa;")
    public static class80 field2258;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "[Lin;")
    public static class344[] field2259;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIIIIII)Z", line = 6)
    public static final boolean method1179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 39)
    public static void method1180(int arg0) {
        field2262 = null;
        field2259 = null;
        field2258 = null;
        if (arg0 >= -86) {
            method1180(-82);
        }
    }

    @OriginalMember(owner = "client!tf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 51)
    public final void paint(Graphics arg0) {
        this.field2260.paint(arg0);
        field2257++;
    }

    @OriginalMember(owner = "client!tf", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 67)
    public final void update(Graphics arg0) {
        field2264++;
        this.field2260.update(arg0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIIZII)V", line = 79)
    public static final void method1181(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        if (arg2 < 1) {
            arg2 = 1;
        }
        field2263++;
        if (arg4 < 1) {
            arg4 = 1;
        }
        if (class67.field908) {
            int var6 = arg4 - 334;
            if (var6 < 0) {
                var6 = 0;
            } else if (var6 > 100) {
                var6 = 100;
            }
            int var7 = (class210.field3042 - class65.field850) * var6 / 100 + class65.field850;
            if (var7 < class154.field2138) {
                var7 = class154.field2138;
            } else if (var7 > class55.field738) {
                var7 = class55.field738;
            }
            int var8 = arg4 * var7 * 512 / (arg2 * 334);
            if (var8 < class239.field3396) {
                short var12 = class239.field3396;
                var7 = var12 * 334 * arg2 / (arg4 * 512);
                if (class55.field738 < var7) {
                    var7 = class55.field738;
                    int var13 = var7 * 512 * arg4 / (var12 * 334);
                    int var14 = (arg2 - var13) / 2;
                    if (arg3) {
                        class102.method748();
                        class102.method738(arg5, arg0, var14, arg4, 0);
                        class102.method738(arg2 + arg5 - var14, arg0, var14, arg4, 0);
                    }
                    arg2 -= var14 * 2;
                    arg5 += var14;
                }
            } else if (class116.field1568 < var8) {
                short var9 = class116.field1568;
                var7 = var9 * 334 * arg2 / (arg4 * 512);
                if (var7 < class154.field2138) {
                    var7 = class154.field2138;
                    int var10 = arg2 * var9 * 334 / (var7 * 512);
                    int var11 = (arg4 - var10) / 2;
                    if (arg3) {
                        class102.method748();
                        class102.method738(arg5, arg0, arg2, var11, 0);
                        class102.method738(arg5, arg0 + arg4 - var11, arg2, var11, 0);
                    }
                    arg4 -= var11 * 2;
                    arg0 += var11;
                }
            }
            class77.field1065 = arg4 * var7 / 334;
        }
        if (arg1 == 25824) {
            class293.field4362 = arg5;
            class17.field224 = arg0;
            class280.field4202 = (short) arg4;
            class97.field1312 = (short) arg2;
        }
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 178)
    public class165(Component arg0) {
        this.field2260 = arg0;
    }
}
