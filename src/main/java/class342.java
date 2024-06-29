import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class342 extends Canvas {

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Ljava/awt/Component;")
    private Component field5300;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "[[I")
    public static int[][] field5291 = new int[5][5000];

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "Ltk;")
    public static class266 field5302 = null;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
    public static boolean field5301 = false;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "F")
    public static float field5298;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "I")
    public static int field5295;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "Lpk;")
    public static class120 field5299;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "Lhm;")
    public static class22 field5293;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5303;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ[Ltk;III)V", line = 6)
    public static final void method2373(int arg0, boolean arg1, class266[] arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 0; var6 < arg2.length; var6++) {
            class266 var7 = arg2[var6];
            if (var7 != null && var7.field3926 == arg4) {
                class220.method1600(var7, arg5, (byte) -102, arg0, arg1);
                class303.method2157(arg0, -1, var7, arg5);
                if ((var7.field4019 - var7.field3941) < var7.field3951) {
                    var7.field3951 = var7.field4019 - var7.field3941;
                }
                if (var7.field3951 < 0) {
                    var7.field3951 = 0;
                }
                if (var7.field4045 > (var7.field4097 - var7.field3939)) {
                    var7.field4045 = var7.field4097 - var7.field3939;
                }
                if (var7.field4045 < 0) {
                    var7.field4045 = 0;
                }
                if (var7.field4084 == 0) {
                    class76.method602(arg1, 0, var7);
                }
            }
        }
        if (arg3 == -28434) {
            field5296++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(CI)Z", line = 59)
    public static final boolean method2374(char arg0, int arg1) {
        if (arg1 == 57) {
            field5295++;
            return arg0 >= '0' && arg0 <= '9';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 76)
    public final void paint(Graphics arg0) {
        field5297++;
        this.field5300.paint(arg0);
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(II)V", line = 88)
    public static final void method2375(int arg0, int arg1) {
        for (class60 var2 = class233.field3545.method71((byte) -93); var2 != null; var2 = class233.field3545.method84(1)) {
            if ((var2.field879 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method489(false);
            }
        }
        int var3 = 41 / ((arg0 - 24) / 46);
        field5292++;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 107)
    public class342(Component arg0) {
        this.field5300 = arg0;
    }

    @OriginalMember(owner = "client!rc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 119)
    public final void update(Graphics arg0) {
        this.field5300.update(arg0);
        field5290++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 133)
    public static void method2376(int arg0) {
        field5293 = null;
        field5291 = (int[][]) null;
        field5299 = null;
        field5302 = null;
        if (arg0 < 110) {
            field5298 = -1.0804291F;
        }
        field5303 = null;
    }
}
