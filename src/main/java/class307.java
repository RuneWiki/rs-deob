import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class307 {

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "I")
    public static int field5338 = 1;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field5339 = 2;

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Lsf;")
    public static class108 field5342 = class140.method973(255, "Connexion au serveur de mise -9 jour en cours");

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "I")
    public static int field5344 = 0;

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "Lsf;")
    public static class108 field5341 = class140.method973(255, "event_opbase");

    @OriginalMember(owner = "client!ha", name = "k", descriptor = "[I")
    public static int[] field5345 = new int[25];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field5336;

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field5340;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field5343;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(II)Z", line = 5)
    public static final boolean method2150(int arg0, int arg1) {
        field5340++;
        int var2 = 51 / ((arg0 - 3) / 55);
        return (arg1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIIIII)V", line = 41)
    public static final void method2151(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 != -31585) {
            field5344 = 124;
        }
        class249.field4305 = arg2;
        class149.field2722 = arg1;
        class58.field871 = arg4;
        class86.field1366 = arg0;
        class151.field2744 = arg3;
        field5335++;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V", line = 59)
    public static final void method2152(int arg0) {
        field5343++;
        if (!class172.field3132) {
            return;
        }
        class98 var1 = class45.method324(class218.field3873, class163.field2927, (byte) 77);
        if (var1 != null && var1.field1562 != null) {
            class286 var2 = new class286();
            var2.field4993 = var1.field1562;
            var2.field5006 = var1;
            class287.method2053(var2, 85);
        }
        class172.field3132 = false;
        if (arg0 != 1) {
            field5339 = 47;
        }
        class195.method1388(-82, var1);
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 92)
    public static final void method2153(int arg0) {
        field5337++;
        if (arg0 != -1) {
            method2153(54);
        }
        int var1 = class81.field1266;
        int var2 = class87.field1379;
        int var3 = class9.field104 - class73.field1110 - var1;
        int var4 = class297.field5176 - (class21.field331 + var2);
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class168.field3026 != null) {
                var5 = class168.field3026;
            } else if (class273.field4805 == null) {
                var5 = class289.field5052.field2441;
            } else {
                var5 = class273.field4805;
            }
            int var6 = 0;
            int var7 = 0;
            if (class273.field4805 == var5) {
                Insets var8 = class273.field4805.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class297.field5176);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class9.field104, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class9.field104 + var6 - var3, var7, var3, class297.field5176);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class297.field5176 - var4, class9.field104, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "(I)V", line = 165)
    public static void method2154(int arg0) {
        if (arg0 == -1) {
            field5342 = null;
            field5345 = null;
            field5341 = null;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V", line = 178)
    public static final void method2155(byte arg0) {
        field5336++;
        class285.field4986.method1679(true);
        class232.field4095.method1785(0);
        class249.field4339.method1785(0);
        if (arg0 != -113) {
            field5342 = (class108) null;
        }
    }
}
