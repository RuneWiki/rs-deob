import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class342 extends RuntimeException {

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4755;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "Ljava/lang/String;")
    public String field4752;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    public static int field4756 = 0;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "Ljj;")
    public static class66 field4758 = new class66(5000);

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "Lov;")
    public static class346 field4757;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)V")
    public static final void method2152(int arg0) {
        int var1 = -61 / (arg0 / 43);
        field4754++;
        if (class558.field7815 != null) {
            return;
        }
        int var2 = class223.field2857;
        int var3 = class221.field2819;
        int var4 = class611.field8788 - class502.field6955 - var2;
        int var5 = class322.field4443 - class604.field8711 - var3;
        if (var2 <= 0 && var4 <= 0 && var3 <= 0 && var5 <= 0) {
            return;
        }
        try {
            Container var6;
            if (class247.field3111 == null) {
                var6 = class31.field488.field3644;
            } else {
                var6 = class247.field3111;
            }
            int var7 = 0;
            int var8 = 0;
            if (class247.field3111 == var6) {
                Insets var9 = class247.field3111.getInsets();
                var8 = var9.top;
                var7 = var9.left;
            }
            Graphics var10 = var6.getGraphics();
            var10.setColor(Color.black);
            if (var2 > 0) {
                var10.fillRect(var7, var8, var2, class322.field4443);
            }
            if (var3 > 0) {
                var10.fillRect(var7, var8, class611.field8788, var3);
            }
            if (var4 > 0) {
                var10.fillRect(var7 + class611.field8788 - var4, var8, var4, class322.field4443);
            }
            if (var5 > 0) {
                var10.fillRect(var7, class322.field4443 + var8 - var5, class611.field8788, var5);
                return;
            }
        } catch (Exception var11) {
            return;
        }
    }

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "(I)V")
    public static void method2153(int arg0) {
        if (arg0 < -49) {
            field4758 = null;
            field4757 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V")
    public class342(Throwable arg0, String arg1) {
        this.field4755 = arg0;
        this.field4752 = arg1;
    }
}
