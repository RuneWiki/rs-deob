import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class45 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field539;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "Ltk;")
    public static class265 field536;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Z)I", line = 13)
    public static final int method266(boolean arg0) {
        field538++;
        if (class270.field4254 == 0) {
            return 0;
        } else if (arg0) {
            return class275.field4286[class270.field4254].method16();
        } else {
            return -57;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 33)
    public static final void method267(byte arg0) {
        int var1 = -93 / ((-arg0 - 13) / 60);
        field540++;
        class186.field2681 = new class337();
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Ltb;", line = 43)
    public static final class234 method268(byte arg0) {
        if (arg0 == -111) {
            class234 var1 = new class234(class99.field1288, class78.field988, class120.field1681[0], class223.field3150[0], class54.field664[0], class264.field4159[0], class153.field2105[0], class134.field1854);
            field541++;
            class321.method2238(121);
            return var1;
        } else {
            return (class234) null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)V", line = 59)
    public static final void method269(byte arg0) {
        int var1 = class148.field2056;
        if (arg0 != 13) {
            field539 = 32;
        }
        int var2 = class73.field943 - var1 - class188.field2712;
        field537++;
        int var3 = class81.field1043;
        int var4 = class138.field1938 - class314.field4847 - var3;
        if (var1 <= 0 && var2 <= 0 && var3 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class243.field3659 != null) {
                var5 = class243.field3659;
            } else if (class329.field5029 == null) {
                var5 = class9.field131.field4179;
            } else {
                var5 = class329.field5029;
            }
            int var6 = 0;
            int var7 = 0;
            if (class329.field5029 == var5) {
                Insets var8 = class329.field5029.getInsets();
                var6 = var8.top;
                var7 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var7, var6, var1, class138.field1938);
            }
            if (var3 > 0) {
                var9.fillRect(var7, var6, class73.field943, var3);
            }
            if (var2 > 0) {
                var9.fillRect(class73.field943 + var7 - var2, var6, var2, class138.field1938);
            }
            if (var4 > 0) {
                var9.fillRect(var7, var6 + class138.field1938 - var4, class73.field943, var4);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V", line = 123)
    public static void method270(byte arg0) {
        field536 = null;
        if (arg0 != -104) {
            method268((byte) -36);
        }
    }
}
