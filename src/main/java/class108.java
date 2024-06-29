import java.awt.Canvas;
import java.awt.Container;
import java.awt.Insets;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class108 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!sf", name = "e", descriptor = "Lwm;")
    public static class152 field1540 = class157.method1048("Textures charg-Bes", 99);

    @OriginalMember(owner = "client!sf", name = "d", descriptor = "J")
    public static long field1539 = 0L;

    @OriginalMember(owner = "client!sf", name = "m", descriptor = "I")
    public static int field1548 = 0;

    @OriginalMember(owner = "client!sf", name = "l", descriptor = "Lwm;")
    public static class152 field1547 = class157.method1048("", 126);

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field1551 = 0;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!sf", name = "f", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!sf", name = "h", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!sf", name = "i", descriptor = "I")
    public static int field1544;

    @OriginalMember(owner = "client!sf", name = "j", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!sf", name = "k", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!sf", name = "n", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!sf", name = "o", descriptor = "I")
    public static int field1550;

    @OriginalMember(owner = "client!sf", name = "g", descriptor = "Loe;")
    public static class127 field1542;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(B)V", line = 4)
    public static final void method716(byte arg0) {
        class123.field1727.method1613(-22696);
        field1541++;
        if (arg0 != 102) {
            method718(-69, 122, 53, -49, 124, -118, 33, 66);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(III)Led;", line = 18)
    public static final class294 method717(int arg0, int arg1, int arg2) {
        class34 var3 = class287.field4857[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class294 var4 = var3.field573;
            var3.field573 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIIIII)V", line = 32)
    public static final void method718(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 != 22441) {
            field1546 = 58;
        }
        field1545++;
        if (arg3 == arg4) {
            class213.method1439(arg7, 10663, arg2, arg5, arg1, arg4, arg0);
        } else if (class308.field5283 <= (arg7 - arg4) && class238.field3902 >= (arg7 + arg4) && arg1 - arg3 >= class157.field2505 && arg1 + arg3 <= class110.field1553) {
            class215.method1447(arg6 - 22546, arg7, arg2, arg0, arg5, arg4, arg3, arg1);
        } else {
            class262.method1808(arg3, arg0, false, arg7, arg5, arg1, arg4, arg2);
        }
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)V", line = 79)
    public static final void method719(int arg0) {
        Container var1;
        if (class23.field397 != null) {
            var1 = class23.field397;
        } else if (class85.field1201 == null) {
            var1 = class34.field572.field2359;
        } else {
            var1 = class85.field1201;
        }
        class205.field3350 = var1.getSize().width;
        class81.field1137 = var1.getSize().height;
        field1538++;
        if (class85.field1201 == var1) {
            Insets var2 = class85.field1201.getInsets();
            class81.field1137 -= var2.top + var2.bottom;
            class205.field3350 -= var2.right + var2.left;
        }
        if (class89.method586(1) >= 2) {
            class137.field2100 = 0;
            class172.field2757 = class205.field3350;
            class227.field3709 = class81.field1137;
            class172.field2739 = 0;
        } else {
            class227.field3709 = 503;
            class137.field2100 = (class205.field3350 - 765) / 2;
            class172.field2757 = 765;
            class172.field2739 = 0;
        }
        if (class217.field3516) {
            class217.method1470(class172.field2757, class227.field3709);
        }
        if (arg0 < 105) {
            field1548 = -5;
        }
        class224.field3648.setSize(class172.field2757, class227.field3709);
        if (class85.field1201 == var1) {
            Insets var3 = class85.field1201.getInsets();
            class224.field3648.setLocation(class137.field2100 + var3.left, var3.top - -class172.field2739);
        } else {
            class224.field3648.setLocation(class137.field2100, class172.field2739);
        }
        if (class253.field4387 != -1) {
            class198.method1321(false, true);
        }
        class304.method2124(false);
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLwm;I)V", line = 151)
    public static final void method720(boolean arg0, class152 arg1, int arg2) {
        int var3 = 125 % ((arg2 - 2) / 54);
        field1544++;
        if (!arg0) {
            try {
                class286.field4846.getAppletContext().showDocument(arg1.method985(class286.field4846.getCodeBase(), (byte) 18), "_top");
            } catch (Exception var8) {
            }
            return;
        }
        if (class217.field3516 && class72.field1052) {
            try {
                class67.method423("openjs", class34.field572.field2359, -113, new Object[] { arg1.method985(class286.field4846.getCodeBase(), (byte) 18).toString() });
                return;
            } catch (Throwable var9) {
            }
        }
        try {
            class286.field4846.getAppletContext().showDocument(arg1.method985(class286.field4846.getCodeBase(), (byte) 18), "_blank");
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)V", line = 190)
    public static final void method721(int arg0) {
        class195 var1 = class91.field1268;
        synchronized (class91.field1268) {
            class93.field1330 = class85.field1198;
            class278.field4763 = class317.field5498;
            class254.field4397 = class28.field486;
            class61.field921 = class3.field50;
            class162.field2569++;
            class193.field3066 = class268.field4524;
            class62.field944 = class283.field4812;
            class111.field1572 = class267.field4505;
            class3.field50 = arg0;
        }
        field1543++;
    }

    @OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V", line = 237)
    public static void method722(byte arg0) {
        field1540 = null;
        if (arg0 != -82) {
            method717(25, 114, -53);
        }
        field1542 = null;
        field1547 = null;
    }
}
