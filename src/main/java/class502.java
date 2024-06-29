import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class502 {

    @OriginalMember(owner = "client!j", name = "d", descriptor = "I")
    public int field7350;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lrl;")
    public static class672 field7348 = new class672(75, 16);

    @OriginalMember(owner = "client!j", name = "k", descriptor = "[I")
    public static int[] field7357 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Lraa;")
    public static class564 field7356 = new class564();

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field7347;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field7349;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field7352;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "I")
    public static int field7353;

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field7354;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "Lka;")
    public static class437 field7351;

    @OriginalMember(owner = "client!j", name = "i", descriptor = "Z")
    public static boolean field7355;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)V", line = 6)
    public static final void method3054(byte arg0, int arg1, int arg2) {
        int var3 = -73 / ((3 - arg0) / 36);
        field7352++;
        class413 var4 = class674.method3852(7, arg2, 126);
        var4.method2633(16777215);
        var4.field6337 = arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Ljava/lang/String;", line = 22)
    public static final String method3055(int arg0, int arg1, int arg2) {
        field7349++;
        int var3 = arg0 - arg1;
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
        } else if (var3 > 3) {
            return "<col=80ff00>";
        } else if (arg2 < var3) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V", line = 59)
    public static void method3056(int arg0) {
        if (arg0 != 55) {
            field7357 = null;
        }
        field7351 = null;
        field7357 = null;
        field7356 = null;
        field7348 = null;
    }

    @OriginalMember(owner = "client!j", name = "toString", descriptor = "()Ljava/lang/String;", line = 72)
    public final String toString() {
        field7354++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)V", line = 84)
    public static final void method3057(int arg0) {
        field7353++;
        if (class476.field7061 != null) {
            return;
        }
        int var1 = class290.field4596;
        int var2 = class425.field6468;
        if (arg0 != -9629) {
            method3055(-57, 42, -46);
        }
        int var3 = class235.field3727 - class56.field732 - var1;
        int var4 = class101.field1659 - class259.field4147 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class598.field8470 != null) {
                var5 = class598.field8470;
            } else if (class450.field6772 == null) {
                var5 = class64.field825;
            } else {
                var5 = class450.field6772;
            }
            int var6 = 0;
            int var7 = 0;
            if (class598.field8470 == var5) {
                Insets var8 = class598.field8470.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class101.field1659);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class235.field3727, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class235.field3727 + var6 - var3, var7, var3, class101.field1659);
            }
            if (var4 > 0) {
                var9.fillRect(var6, var7 + class101.field1659 - var4, class235.field3727, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 156)
    public class502(String arg0, int arg1) {
        this.field7350 = arg1;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)I", line = 166)
    public final int method3058(byte arg0) {
        if (arg0 != 18) {
            field7348 = null;
        }
        field7347++;
        return this.field7350;
    }
}
