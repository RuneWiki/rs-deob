import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class144 extends Canvas {

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "Ljava/awt/Component;")
    private Component field2581;

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "I")
    public static int field2580 = 0;

    @OriginalMember(owner = "client!qj", name = "j", descriptor = "Leb;")
    public static class230 field2583 = class68.method589(0, "rot:");

    @OriginalMember(owner = "client!qj", name = "p", descriptor = "Leb;")
    public static class230 field2589 = class68.method589(0, "Benutzen");

    @OriginalMember(owner = "client!qj", name = "k", descriptor = "Leb;")
    public static class230 field2584 = class68.method589(0, "p12_full");

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field2576;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "I")
    public static int field2578;

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "I")
    public static int field2579;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!qj", name = "l", descriptor = "I")
    public static int field2585;

    @OriginalMember(owner = "client!qj", name = "m", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!qj", name = "n", descriptor = "I")
    public static int field2587;

    @OriginalMember(owner = "client!qj", name = "q", descriptor = "I")
    public static int field2590;

    @OriginalMember(owner = "client!qj", name = "o", descriptor = "Lkk;")
    public static class223 field2588;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(III)V")
    public static final void method1096(int arg0, int arg1, int arg2) {
        field2576++;
        class98 var3 = class237.field4090[class124.field2174][arg0][arg2];
        if (var3 == null) {
            class127.method994(class124.field2174, arg0, arg2);
            return;
        }
        int var4 = arg1;
        class196 var5 = null;
        for (class196 var6 = (class196) var3.method839(128); var6 != null; var6 = (class196) var3.method834((byte) 82)) {
            class12 var13 = class214.method1484(var6.field3516.field1528, -1);
            int var14 = var13.field211;
            if (var13.field213 == 1) {
                var14 = (var6.field3516.field1536 + 1) * var14;
            }
            if (var4 < var14) {
                var4 = var14;
                var5 = var6;
            }
        }
        if (var5 == null) {
            class127.method994(class124.field2174, arg0, arg2);
            return;
        }
        var3.method833(arg1 + 99999998, var5);
        class88 var7 = null;
        class196 var8 = (class196) var3.method839(128);
        class88 var9 = null;
        while (var8 != null) {
            class88 var12 = var8.field3516;
            if (var5.field3516.field1528 != var12.field1528) {
                if (var7 == null) {
                    var7 = var12;
                }
                if (var7.field1528 != var12.field1528 && var9 == null) {
                    var9 = var12;
                }
            }
            var8 = (class196) var3.method834((byte) 82);
        }
        long var10 = (long) (arg0 - (-(arg2 << 7) - 1610612736));
        class269.method1849(class124.field2174, arg0, arg2, class37.method333(arg2 * 128 + 64, 1637367879, class124.field2174, arg0 * 128 + 64), var5.field3516, var10, var7, var9);
    }

    @OriginalMember(owner = "client!qj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        this.field2581.paint(arg0);
        field2578++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(Lob;IIBIII)V")
    public static final void method1097(class128 arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 > 123) {
            class27.method264(arg0.field2300, arg6, arg1, arg0.field2274, arg4, arg2, arg5, -105);
            field2575++;
        }
    }

    @OriginalMember(owner = "client!qj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field2581.update(arg0);
        field2579++;
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(B)V")
    public static final void method1098(byte arg0) {
        class1.field3++;
        field2585++;
        if (arg0 < 126) {
            method1096(30, -122, -95);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(II)Z")
    public static final boolean method1099(int arg0, int arg1) {
        field2586++;
        if (arg1 == 0) {
            return (arg0 & 0x743C3F) >> 22 != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(B)V")
    public static void method1100(byte arg0) {
        field2589 = null;
        field2583 = null;
        field2584 = null;
        field2588 = null;
        if (arg0 != 24) {
            method1097((class128) null, 42, -26, (byte) -92, -39, -1, 69);
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(IB)I")
    public static final int method1101(int arg0, byte arg1) {
        if (arg1 <= 98) {
            method1098((byte) 105);
        }
        field2577++;
        if (arg0 >= 97 && arg0 <= 122 || arg0 >= 224 && arg0 <= 254 && arg0 != 247) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class144(Component arg0) {
        this.field2581 = arg0;
    }
}
