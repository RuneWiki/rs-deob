import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public abstract class class84 {

    @OriginalMember(owner = "client!id", name = "h", descriptor = "Ljd;")
    public static class92 field1688 = class202.method1325((byte) 90, "document)3cookie=(R");

    @OriginalMember(owner = "client!id", name = "k", descriptor = "Ljd;")
    public static class92 field1691 = class202.method1325((byte) 90, ":assist:");

    @OriginalMember(owner = "client!id", name = "c", descriptor = "I")
    public static int field1683;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field1684;

    @OriginalMember(owner = "client!id", name = "e", descriptor = "I")
    public static int field1685;

    @OriginalMember(owner = "client!id", name = "f", descriptor = "I")
    public static int field1686;

    @OriginalMember(owner = "client!id", name = "g", descriptor = "I")
    public int field1687;

    @OriginalMember(owner = "client!id", name = "i", descriptor = "I")
    public int field1689;

    @OriginalMember(owner = "client!id", name = "j", descriptor = "Lud;")
    public static class192 field1690;

    @OriginalMember(owner = "client!id", name = "l", descriptor = "Lud;")
    public static class192 field1692;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "Ljava/awt/Image;")
    public Image field1682;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "[I")
    public int[] field1681;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(I)V")
    public static final void method562(int arg0) {
        int var1 = class10.field362;
        int var2 = class166.field3264;
        int var3 = class211.field4084;
        if (arg0 < 36) {
            return;
        }
        field1685++;
        int var4 = 6116423;
        int var5 = class186.field3513;
        class163.method1049(var1, var2, var3, var5, var4);
        class163.method1049(var1 + 1, var2 - -1, var3 - 2, 16, 0);
        class163.method1053(var1 + 1, var2 - -18, var3 - 2, var5 + -19, 0);
        class4.field242.method987(class68.field1365, var1 + 3, var2 + 14, var4, -1);
        int var6 = class29.field641;
        int var7 = class192.field3756;
        for (int var8 = 0; var8 < class3.field182; var8++) {
            int var9 = (class3.field182 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var1 < var6 && var6 < var1 + var3 && var7 > var9 - 13 && var9 + 3 > var7) {
                var10 = 16776960;
            }
            class4.field242.method987(class206.method1340(false, var8), var1 + 3, var9, var10, 0);
        }
        class130.method858(class186.field3513, class166.field3264, class211.field4084, false, class10.field362);
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public final void method563(int arg0) {
        class163.method1044(this.field1681, this.field1687, this.field1689);
        field1683++;
        if (arg0 != 2) {
            method568(95);
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IB)I")
    public static final int method564(int arg0, byte arg1) {
        field1684++;
        return arg1 <= 105 ? -16 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIILjava/awt/Component;)V")
    public abstract void method565(int arg0, int arg1, int arg2, Component arg3);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method566(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(BI)V")
    public static final void method567(byte arg0, int arg1) {
        field1686++;
        if (arg1 == -1 || !class155.field3089[arg1]) {
            return;
        }
        class190.field3673.method901(arg1, -26431);
        if (class60.field1256[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class60.field1256[arg1].length; var3++) {
            if (class60.field1256[arg1][var3] != null) {
                if (class60.field1256[arg1][var3].field10 == 2) {
                    var2 = false;
                } else {
                    class60.field1256[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class60.field1256[arg1] = null;
        }
        if (arg0 > -21) {
            method567((byte) 55, -95);
        }
        class155.field3089[arg1] = false;
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public static void method568(int arg0) {
        field1692 = null;
        field1688 = null;
        field1690 = null;
        int var1 = -99 % ((-arg0 - 10) / 55);
        field1691 = null;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    protected class84() {
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IILjava/awt/Graphics;IBI)V")
    public abstract void method569(int arg0, int arg1, Graphics arg2, int arg3, byte arg4, int arg5);
}
