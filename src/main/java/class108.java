import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public abstract class class108 extends class115 {

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "Laa;")
    public static class76 field1606 = new class76(61, 1);

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "Luv;")
    public static class2 field1607 = new class2(31, -1);

    @OriginalMember(owner = "client!gw", name = "i", descriptor = "I")
    public int field1601;

    @OriginalMember(owner = "client!gw", name = "j", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public int field1604;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "[I")
    public int[] field1605;

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(B)V")
    public static final void method809(byte arg0) {
        if (arg0 <= 30) {
            field1607 = null;
        }
        for (int var1 = 0; var1 < class164.field2446.length; var1++) {
            for (int var2 = 0; var2 < class164.field2446[var1].length; var2++) {
                class164.field2446[var1][var2] = class418.field6268;
            }
        }
        field1602++;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IILjava/awt/Graphics;I)V")
    public abstract void method810(int arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IZ)V")
    public static final void method811(int arg0, boolean arg1) {
        field1603++;
        class97.method758(class150.field2278, false);
        class83.field1309++;
        if (arg0 != -21032) {
            field1607 = null;
        }
        for (class313 var2 = (class313) class312.field4840.method3061(arg0 ^ 0x1397); var2 != null; var2 = (class313) class312.field4840.method3066((byte) 120)) {
            if (!var2.method875(arg0 ^ 0xFFFFADD8)) {
                var2 = (class313) class312.field4840.method3061(arg0 + 4215);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field4851 == 0) {
                class43.method336(true, var2, false, arg1);
            }
        }
        if (class16.field263 != null) {
            class292.method1812(-14307, class16.field263);
            class16.field263 = null;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method812(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)V")
    public static void method813(int arg0) {
        field1607 = null;
        field1606 = null;
        if (arg0 != -1) {
            method811(-64, false);
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method814(int arg0, Canvas arg1);
}
