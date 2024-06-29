import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public abstract class class383 extends class49 {

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "Z")
    public boolean field5839 = false;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "Z")
    public boolean field5836 = false;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public int field5837;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public int field5838;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public int field5835;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field5833 = 0;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5834 = new Rectangle[100];

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field5840;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIIIBILap;ILap;)V")
    public static final void method2374(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, class337 arg7, int arg8, class337 arg9) {
        field5840++;
        int var10 = arg9.method1375(7);
        if (var10 == -1) {
            return;
        }
        if (arg5 <= 121) {
            method2375(6);
        }
        Object var11 = null;
        class191 var12 = (class191) class209.field2947.method1013((long) var10, (byte) -106);
        if (var12 == null) {
            class476[] var13 = class476.method2847(class113.field1576, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class337.field5242.method1117(var13[0], true);
            class209.field2947.method1012(-61, (long) var10, var12);
        }
        class192.method1353(arg0 >> 1, arg7.field2215, arg2 >> 1, arg6, arg7.method2091(-15245) * 64, 14631, 0, arg7.field2217, arg1, arg7.field2210);
        int var14 = arg8 + class470.field6872[0] - 18;
        int var15 = arg4 / 4 * 18 + var14;
        int var16 = arg3 - (54 - class470.field6872[1]) - 16;
        int var17 = arg4 % 4 * 18 + var16;
        var12.method1332(var15, var17);
        if (arg7 == arg9) {
            class337.field5242.method2956(var15 - 1, -20293, -256, 18, 18, var17 - 1);
        }
        class231 var18 = class517.method3077(true);
        var18.field3284 = var15;
        var18.field3288 = arg9;
        var18.field3286 = var17 + 16;
        var18.field3290 = var15 + 16;
        var18.field3291 = var17;
        class27.field446.method2353(var18, -9798);
    }

    @OriginalMember(owner = "client!lf", name = "<init>", descriptor = "(IIIZZ)V")
    public class383(int arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
        this.field5836 = arg4;
        this.field5837 = arg1;
        this.field5838 = arg0;
        this.field5839 = arg3;
        this.field5835 = arg2;
    }

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "(I)V")
    public static void method2375(int arg0) {
        if (arg0 != 4) {
            field5833 = -49;
        }
        field5834 = null;
    }

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field5834[var0] = new Rectangle();
        }
    }
}
