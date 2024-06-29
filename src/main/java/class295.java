import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class295 {

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    private int field4910 = 0;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lsc;")
    private class259 field4912;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Ln;")
    public static class282 field4909 = new class282(5);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lna;")
    public static class26 field4911 = class69.method505(")4j", (byte) -127);

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Ln;")
    public static class282 field4913 = new class282(4);

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field4918 = 2;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "Lab;")
    private class147 field4908;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "[I")
    public static int[] field4919;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "[Lqf;")
    public static class148[] field4917;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)Lab;", line = 4)
    public final class147 method2072(int arg0) {
        if (arg0 != 0) {
            method2076(-100);
        }
        field4916++;
        if (this.field4910 > 0 && this.field4912.field4216[this.field4910 - 1] != this.field4908) {
            class147 var2 = this.field4908;
            this.field4908 = var2.field2296;
            return var2;
        }
        class147 var3;
        do {
            if (this.field4912.field4221 <= this.field4910) {
                return null;
            }
            var3 = this.field4912.field4216[this.field4910++].field2296;
        } while (this.field4912.field4216[this.field4910 - 1] == var3);
        this.field4908 = var3.field2296;
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)Lab;", line = 41)
    public final class147 method2073(byte arg0) {
        field4914++;
        if (arg0 < 79) {
            this.field4910 = 78;
        }
        this.field4910 = 0;
        return this.method2072(0);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)V", line = 65)
    public static void method2074(byte arg0) {
        field4919 = null;
        int var1 = 118 / ((-arg0 - 33) / 45);
        field4909 = null;
        field4911 = null;
        field4913 = null;
        field4917 = null;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lsc;)V", line = 156)
    public class295(class259 arg0) {
        this.field4912 = arg0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)J", line = 86)
    public static final long method2075(int arg0, int arg1, int arg2) {
        class55 var3 = class36.field585[arg0][arg1][arg2];
        return var3 == null || var3.field889 == null ? 0L : var3.field889.field2549;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)V", line = 94)
    public static final void method2076(int arg0) {
        field4915++;
        int var1 = class25.field362;
        int var2 = class124.field1928;
        int var3 = class267.field4407 - var1 - class141.field2153;
        int var4 = class224.field3562 - var2 - class38.field622;
        if (~var2 >= arg0 && var4 <= 0 && var1 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class198.field3075 != null) {
                var5 = class198.field3075;
            } else if (class142.field2172 == null) {
                var5 = class45.field712.field2431;
            } else {
                var5 = class142.field2172;
            }
            int var6 = 0;
            int var7 = 0;
            if (class142.field2172 == var5) {
                Insets var8 = class142.field2172.getInsets();
                var7 = var8.left;
                var6 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var2 > 0) {
                var9.fillRect(var7, var6, var2, class267.field4407);
            }
            if (var1 > 0) {
                var9.fillRect(var7, var6, class224.field3562, var1);
            }
            if (var4 > 0) {
                var9.fillRect(var7 + class224.field3562 - var4, var6, var4, class267.field4407);
            }
            if (var3 > 0) {
                var9.fillRect(var7, var6 + class267.field4407 - var3, class224.field3562, var3);
            }
        } catch (Exception var11) {
        }
    }
}
