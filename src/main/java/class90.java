import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public class class90 extends class258 {

    @OriginalMember(owner = "client!hn", name = "q", descriptor = "Ljava/lang/String;")
    private String field1235 = null;

    @OriginalMember(owner = "client!hn", name = "s", descriptor = "J")
    private long field1237 = -1L;

    @OriginalMember(owner = "client!hn", name = "m", descriptor = "I")
    public static int field1231;

    @OriginalMember(owner = "client!hn", name = "n", descriptor = "I")
    public static int field1232;

    @OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!hn", name = "r", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(B)V")
    public static final void method544(byte arg0) {
        field1236++;
        if (arg0 >= -20 || class9.field80 != null) {
            return;
        }
        int var1 = class483.field6237;
        int var2 = class257.field3477;
        int var3 = class773.field10518 - class372.field4550 - var1;
        int var4 = class310.field3886 - class463.field6021 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class340.field4176 != null) {
                var5 = class340.field4176;
            } else if (class80.field1134 == null) {
                var5 = class29.field265;
            } else {
                var5 = class80.field1134;
            }
            int var6 = 0;
            int var7 = 0;
            if (class340.field4176 == var5) {
                Insets var8 = class340.field4176.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class310.field3886);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class773.field10518, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class773.field10518 + var6 - var3, var7, var3, class310.field3886);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class310.field3886 - var4, class773.field10518, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(I)V")
    public static final void method545(int arg0) {
        class773.field10527 = null;
        field1234++;
        if (arg0 >= -54) {
            method544((byte) -17);
        }
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(BLmc;)V")
    public final void method546(byte arg0, class234 arg1) {
        int var3 = -37 / ((arg0 - 7) / 41);
        if (arg1.method1509(true) != 255) {
            arg1.field3133--;
            this.field1237 = arg1.method1516(-11290);
        }
        field1231++;
        this.field1235 = arg1.method1508(8);
    }

    @OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lim;B)V")
    public final void method547(class652 arg0, byte arg1) {
        field1233++;
        if (arg1 < 123) {
            method544((byte) -21);
        }
        arg0.method3526(-94, this.field1235, this.field1237);
    }
}
