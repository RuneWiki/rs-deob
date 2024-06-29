import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class716 extends Canvas {

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "Ljava/awt/Component;")
    private Component field10001;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Ljw;")
    public static class581 field9998 = new class581(0, 4);

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "[Lvq;")
    public static class489[] field10002 = new class489[14];

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field10000;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "I")
    public static int field9996;

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field9997;

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field9999;

    @OriginalMember(owner = "client!vm", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field9997++;
        this.field10001.update(arg0);
    }

    @OriginalMember(owner = "client!vm", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field10001.paint(arg0);
        field9996++;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IBIII)V")
    public static final void method4001(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field10000++;
        if (class669.field9399 != 1) {
            return;
        }
        int var5 = arg4 / class639.field8876;
        int var6 = arg0 / class639.field8876;
        int var7 = arg3 / class462.field6403;
        int var8 = arg2 / class462.field6403;
        if (class704.field9863 <= var5 || var6 < 0 || var7 >= class40.field637 || var8 < 0) {
            return;
        }
        if (arg1 != -102) {
            field10002 = null;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class704.field9863 <= var6) {
            var6 = class704.field9863 - 1;
        }
        if (var8 >= class40.field637) {
            var8 = class40.field637 - 1;
        }
        for (int var9 = var7; var9 <= var8; var9++) {
            int var10 = class402.method2505(class40.field637, class781.field10707 + var9, -127) * class704.field9863;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = class402.method2505(class704.field9863, class405.field5877 + var11, -128) + var10;
                class462.field6396[var12] = class37.field575;
            }
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class716(Component arg0) {
        this.field10001 = arg0;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V")
    public static void method4002(int arg0) {
        field9998 = null;
        field10002 = null;
        if (arg0 != -1) {
            field9998 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(ILor;)Lor;")
    public static final class668 method4003(int arg0, class668 arg1) {
        field9999++;
        int var2 = -90 % ((-arg0 - 17) / 59);
        class668 var3 = client.method2021(arg1);
        if (var3 == null) {
            var3 = arg1.field9369;
        }
        return var3;
    }
}
