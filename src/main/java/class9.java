import java.awt.Canvas;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public abstract class class9 {

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "[Lqp;")
    public static class278[] field161 = new class278[29];

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public int field152;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field153;

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field159;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public int field160;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Llm;")
    public static class347 field157;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "[I")
    public int[] field155;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIB)Ljava/lang/String;", line = 4)
    public static final String method68(int arg0, int arg1, byte arg2) {
        field158++;
        if (arg2 != -26) {
            return null;
        }
        int var3 = arg1 - arg0;
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
        } else if (var3 > 0) {
            return "<col=c0ff00>";
        } else {
            return "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IBI)V", line = 48)
    public static final void method71(int arg0, byte arg1, int arg2) {
        field154++;
        class263 var3 = class47.method337(7, 0, arg0);
        var3.method1807((byte) -126);
        int var4 = 63 % ((27 - arg1) / 37);
        var3.field3813 = arg2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 64)
    public static final void method72(int arg0) {
        field159++;
        if (class103.field1428 != null || arg0 != 1024) {
            return;
        }
        Container var1;
        if (class374.field5447 == null) {
            var1 = class76.field1085.field519;
        } else {
            var1 = class374.field5447;
        }
        class273.field3956 = var1.getSize().width;
        class180.field2384 = var1.getSize().height;
        if (class374.field5447 == var1) {
            Insets var2 = class374.field5447.getInsets();
            class273.field3956 -= var2.right + var2.left;
            class180.field2384 -= var2.top + var2.bottom;
        }
        if (class215.method1266(2) == 1) {
            class308.field4535 = 0;
            class159.field2145 = (class273.field3956 - 765) / 2;
            class138.field1907 = 765;
            class92.field1294 = 503;
        } else if (class134.field1867 < 96 && class373.field5422 == 0) {
            int var3 = class273.field3956 > 1024 ? 1024 : class273.field3956;
            class159.field2145 = (class273.field3956 - var3) / 2;
            int var4 = class180.field2384 <= 768 ? class180.field2384 : 768;
            class138.field1907 = var3;
            class92.field1294 = var4;
            class308.field4535 = 0;
        } else {
            class159.field2145 = 0;
            class308.field4535 = 0;
            class138.field1907 = class273.field3956;
            class92.field1294 = class180.field2384;
        }
        if (class61.field803 != 0) {
            boolean var10000;
            if (class138.field1907 < 1024 && class92.field1294 < 768) {
                var10000 = true;
            } else {
                var10000 = false;
            }
        }
        class202.field2708.setSize(class138.field1907, class92.field1294);
        if (class61.field807 != null) {
            class61.field807.method1670();
        }
        if (class374.field5447 == var1) {
            Insets var5 = class374.field5447.getInsets();
            class202.field2708.setLocation(var5.left + class159.field2145, class308.field4535 + var5.top);
        } else {
            class202.field2708.setLocation(class159.field2145, class308.field4535);
        }
        if (class329.field4790 != -1) {
            class110.method720((byte) 121, true);
        }
        class329.method2189((byte) -42);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IB)Li;", line = 168)
    public static final class83 method74(int arg0, byte arg1) {
        field156++;
        class189 var2 = class304.field4463;
        class83 var3;
        synchronized (class304.field4463) {
            var3 = (class83) class304.field4463.method1137((long) arg0, 2108653711);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class152.field2065.method2261(class262.method1802(arg0, (byte) -23), class117.method761(arg0, (byte) 52), 91);
        int var5 = -49 % ((arg1 - 10) / 45);
        class83 var6 = new class83();
        var6.field1128 = arg0;
        if (var4 != null) {
            var6.method580(new class228(var4), 3);
        }
        var6.method593(-97);
        if (var6.field1144 != -1) {
            var6.method590(method74(var6.field1144, (byte) -41), 1, method74(var6.field1161, (byte) 66));
        }
        if (var6.field1188 != -1) {
            var6.method589(false, method74(var6.field1163, (byte) 69), method74(var6.field1188, (byte) -53));
        }
        if (!class211.field2800 && var6.field1166) {
            var6.field1193 = class347.field5030;
            var6.field1150 = class143.field1951;
            var6.field1140 = null;
            var6.field1182 = class276.field3995;
            var6.field1160 = false;
            var6.field1137 = 0;
        }
        class189 var7 = class304.field4463;
        synchronized (class304.field4463) {
            class304.field4463.method1144((long) arg0, var6, -3480);
            return var6;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Z)V", line = 214)
    public static void method75(boolean arg0) {
        field157 = null;
        if (!arg0) {
            field161 = null;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIBLjava/awt/Graphics;II)V")
    public abstract void method69(int arg0, int arg1, byte arg2, Graphics arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method70(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method73(int arg0, int arg1, int arg2, Graphics arg3);
}
