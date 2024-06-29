import java.awt.Canvas;
import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lfa")
public class class114 extends class623 {

    @OriginalMember(owner = "client!lfa", name = "z", descriptor = "Ltca;")
    public class172 field1196;

    @OriginalMember(owner = "client!lfa", name = "B", descriptor = "Z")
    public static boolean field1198 = true;

    @OriginalMember(owner = "client!lfa", name = "w", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!lfa", name = "x", descriptor = "I")
    public static int field1194;

    @OriginalMember(owner = "client!lfa", name = "y", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!lfa", name = "A", descriptor = "I")
    public static int field1197;

    @OriginalMember(owner = "client!lfa", name = "D", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!lfa", name = "v", descriptor = "Lrc;")
    public static class536 field1192;

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(III)Z")
    public static final boolean method755(int arg0, int arg1, int arg2) {
        field1194++;
        if (arg2 == -1) {
            return (arg0 & 0xC580) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(I)V")
    public static void method756(int arg0) {
        if (arg0 != 50560) {
            method757(null, -43);
        }
        field1192 = null;
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lig;I)Lor;")
    public static final class638 method757(class244 arg0, int arg1) {
        field1195++;
        if (arg1 != 28090) {
            method755(108, 99, -56);
        }
        return new class638(arg0.method1466((byte) 31), arg0.method1466((byte) 31), arg0.method1466((byte) 31), arg0.method1466((byte) 31), arg0.method1458((byte) -116), arg0.method1458((byte) -97), arg0.method1423(-67));
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(Lcs;Z)V")
    public static final void method758(class340 arg0, boolean arg1) {
        for (int var2 = arg0.field4395; var2 <= arg0.field4390; var2++) {
            for (int var3 = arg0.field4387; var3 <= arg0.field4402; var3++) {
                class691 var4 = class638.field9170[arg0.field4628][var2][var3];
                if (var4 != null) {
                    class398 var5 = var4.field9739;
                    class398 var6 = null;
                    while (var5 != null) {
                        if (var5.field5449 == arg0) {
                            if (var6 == null) {
                                var4.field9739 = var5.field5451;
                            } else {
                                var6.field5451 = var5.field5451;
                            }
                            var5.method2439((byte) 44);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field5451;
                    }
                }
            }
        }
        if (!arg1) {
            class334.method1997(arg0);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public static final void method759(int arg0, Canvas arg1) {
        field1193++;
        Dimension var2 = arg1.getSize();
        class85.method598(var2.height, arg0, var2.width);
        if (class3.field27 == 1) {
            class574.field8144.method369(arg1, class233.field2723, class2.field9);
        } else {
            class574.field8144.method369(arg1, class415.field5687, class627.field9011);
        }
    }

    @OriginalMember(owner = "client!lfa", name = "<init>", descriptor = "(Ltca;)V")
    public class114(class172 arg0) {
        this.field1196 = arg0;
    }
}
