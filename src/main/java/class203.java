import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class203 extends class252 {

    @OriginalMember(owner = "client!ve", name = "t", descriptor = "I")
    public static int field3279 = -1;

    @OriginalMember(owner = "client!ve", name = "u", descriptor = "F")
    public static float field3280;

    @OriginalMember(owner = "client!ve", name = "r", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ve", name = "s", descriptor = "I")
    public int field3278;

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ve", name = "q", descriptor = "Ljava/lang/String;")
    public String field3276;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "Ljava/lang/String;")
    public String field3283;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Lq;Lq;Z)V")
    public static final void method1459(class134 arg0, class134 arg1, boolean arg2) {
        if (arg0.field2108 != null) {
            arg0.method900(90);
        }
        arg0.field2104 = arg1;
        arg0.field2108 = arg1.field2108;
        arg0.field2108.field2104 = arg0;
        arg0.field2104.field2108 = arg0;
        if (arg2) {
            ++field3281;
        }
    }

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(B)Lmh;")
    public final class160 method1460(byte arg0) {
        ++field3277;
        if (arg0 != 12) {
            this.field3278 = -110;
        }
        return class126.field1957[super.field4003];
    }

    @OriginalMember(owner = "client!ve", name = "f", descriptor = "(I)V")
    public static final void method1461(int arg0) {
        ++field3282;
        int var1 = -79 / ((arg0 - 36) / 51);
        int var2 = class35.field438;
        int var3 = class187.field2896;
        int var4 = class131.field2013 - var2 + -class79.field1254;
        int var5 = class143.field2233 - var3 + -class169.field2644;
        if (var3 > 0 || var5 > 0 || ~var2 < -1 || ~var4 < -1) {
            try {
                int var6 = 0;
                Container var7;
                if (class180.field2797 == null) {
                    if (class224.field3565 == null) {
                        var7 = class259.field4254.field4211;
                    } else {
                        var7 = class224.field3565;
                    }
                } else {
                    var7 = class180.field2797;
                }
                int var8 = 0;
                if (class224.field3565 == var7) {
                    Insets var9 = class224.field3565.getInsets();
                    var6 = var9.left;
                    var8 = var9.top;
                }
                Graphics var10 = var7.getGraphics();
                var10.setColor(Color.black);
                if (var3 > 0) {
                    var10.fillRect(var6, var8, var3, class131.field2013);
                }
                if (~var2 < -1) {
                    var10.fillRect(var6, var8, class143.field2233, var2);
                }
                if (~var5 < -1) {
                    var10.fillRect(-var5 + var6 + class143.field2233, var8, var5, class131.field2013);
                }
                if (var4 > 0) {
                    var10.fillRect(var6, class131.field2013 + var8 + -var4, class143.field2233, var4);
                    return;
                }
            } catch (Exception var11) {
                return;
            }
        }
    }
}
