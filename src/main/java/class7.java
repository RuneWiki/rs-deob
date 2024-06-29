import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hb")
public abstract class class7 extends class28 {

    @OriginalMember(owner = "client!hb", name = "j", descriptor = "Lcb;")
    public static class318 field61 = new class318(5, 4);

    @OriginalMember(owner = "client!hb", name = "k", descriptor = "Ljj;")
    public static class398 field62 = new class398(37, -1);

    @OriginalMember(owner = "client!hb", name = "l", descriptor = "I")
    public static int field63;

    @OriginalMember(owner = "client!hb", name = "n", descriptor = "I")
    public int field65;

    @OriginalMember(owner = "client!hb", name = "o", descriptor = "I")
    public int field66;

    @OriginalMember(owner = "client!hb", name = "m", descriptor = "[I")
    public int[] field64;

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(III)Lbg;", line = 13)
    public static final class249 method44(int arg0, int arg1, int arg2) {
        class651 var3 = class145.field1841[arg0][arg1][arg2];
        return var3 == null ? null : var3.field9238;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Z)V", line = 20)
    public static void method45(boolean arg0) {
        if (arg0) {
            method45(false);
        }
        field61 = null;
        field62 = null;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(IBI)V", line = 37)
    public static final void method46(int arg0, byte arg1, int arg2) {
        field63++;
        int var3 = class446.field6129.method3312(-23728, class243.field3235.method1491(class350.field5121, (byte) 127));
        class69 var4 = (class69) class37.field371.method374((byte) 67);
        if (arg1 != -52) {
            return;
        }
        while (var4 != null) {
            int var8 = class301.method1807(var4, -32441);
            if (var3 < var8) {
                var3 = var8;
            }
            var4 = (class69) class37.field371.method372(-20740);
        }
        var3 += 8;
        int var5 = class179.field2242 * 16 + 21;
        int var6 = arg0 - (var3 / 2);
        if (class303.field4059 < var6 + var3) {
            var6 = class303.field4059 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg2;
        if ((var5 + arg2) > class211.field2763) {
            var7 = class211.field2763 - var5;
        }
        class544.field7454 = var6;
        if (var7 < 0) {
            var7 = 0;
        }
        class169.field2116 = class179.field2242 * 16 + (class565.field7842 ? 26 : 22);
        class353.field5151 = var3;
        class326.field4744 = var7;
        class483.field6542 = true;
    }

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Graphics;IIIII)V")
    public abstract void method42(Graphics arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(BILjava/awt/Graphics;I)V")
    public abstract void method43(byte arg0, int arg1, Graphics arg2, int arg3);

    @OriginalMember(owner = "client!hb", name = "a", descriptor = "(Ljava/awt/Canvas;I)V")
    public abstract void method47(Canvas arg0, int arg1);
}
