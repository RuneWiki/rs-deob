import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public abstract class class341 {

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field4817;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "I")
    public int field4814;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public int field4818;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "I")
    public int field4822;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "[[I")
    public int[][] field4821;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "Lmga;")
    public static class30 field4815 = new class30("LIVE", "", "", 0);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field4813;

    @OriginalMember(owner = "client!s", name = "d", descriptor = "I")
    public static int field4816;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field4819;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field4823;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "Lrea;")
    public static class121 field4820;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;Ljava/awt/Color;BLjava/awt/Color;)V", line = 6)
    public static final void method2168(String arg0, int arg1, Color arg2, Color arg3, byte arg4, Color arg5) {
        field4823++;
        try {
            Graphics var6 = class570.field7875.getGraphics();
            if (class334.field4717 == null) {
                class334.field4717 = new Font("Helvetica", 1, 13);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class90.field1261 == null) {
                    class90.field1261 = class570.field7875.createImage(class118.field1561, class553.field7716);
                }
                Graphics var7 = class90.field1261.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class118.field1561, class553.field7716);
                int var8 = class118.field1561 / 2 - 152;
                int var9 = class553.field7716 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - arg1 * 3, 30);
                var7.setFont(class334.field4717);
                if (arg4 <= -48) {
                    var7.setColor(arg2);
                    var7.drawString(arg0, var8 + (304 - arg0.length() * 6) / 2, var9 + 22);
                    if (class8.field81 != null) {
                        var7.setFont(class334.field4717);
                        var7.setColor(arg2);
                        var7.drawString(class8.field81, class118.field1561 / 2 - (class8.field81.length() * 6 / 2), class553.field7716 / 2 + -26);
                    }
                    var6.drawImage(class90.field1261, 0, 0, null);
                }
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class118.field1561, class553.field7716);
                int var10 = class118.field1561 / 2 - 152;
                int var11 = class553.field7716 / 2 - 18;
                var6.setColor(arg5);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg3);
                var6.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(arg1 * 3 + var10 + 2, var11 + 2, 300 - (arg1 * 3), 30);
                var6.setFont(class334.field4717);
                var6.setColor(arg2);
                if (class8.field81 != null) {
                    var6.setFont(class334.field4717);
                    var6.setColor(arg2);
                    var6.drawString(class8.field81, class118.field1561 / 2 - class8.field81.length() * 6 / 2, class553.field7716 / 2 + -26);
                }
                var6.drawString(arg0, var10 + (304 - arg0.length() * 6) / 2, var11 + 22);
            }
        } catch (Exception var13) {
            class570.field7875.repaint();
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 107)
    public static final int method2169(String arg0, int arg1) {
        int var2 = 70 / ((arg1 + 25) / 47);
        field4813++;
        return class493.method2984(10, true, arg0, (byte) 48);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V", line = 123)
    public static void method2170(int arg0) {
        field4820 = null;
        int var1 = -95 / ((50 - arg0) / 42);
        field4815 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)I", line = 138)
    public final int method2171(int arg0, int arg1, int arg2) {
        field4819++;
        if (arg2 != 31) {
            field4815 = null;
        }
        return this.field4821[arg1][arg0];
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(III)I", line = 149)
    public final int method2172(int arg0, int arg1, int arg2) {
        field4816++;
        int var4 = arg0 >> this.field4822;
        int var5 = arg2 >> this.field4822;
        if (var4 < 0 || var5 < 0 || var4 > (this.field4814 - 1) || this.field4817 - 1 < var5) {
            return 0;
        }
        int var6 = arg0 & this.field4818 - 1;
        int var7 = this.field4818 + arg1 & arg2;
        int var8 = (this.field4818 - var6) * this.field4821[var4][var5] + (this.field4821[var4 + 1][var5] * var6) >> this.field4822;
        int var9 = (this.field4818 - var6) * this.field4821[var4][var5 + 1] + this.field4821[var4 + 1][var5 + 1] * var6 >> this.field4822;
        return (this.field4818 - var7) * var8 + var7 * var9 >> this.field4822;
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "(III[[I)V", line = 174)
    public class341(int arg0, int arg1, int arg2, int[][] arg3) {
        this.field4817 = arg1;
        this.field4814 = arg0;
        int var5 = 0;
        while (arg2 > 1) {
            var5++;
            arg2 >>= 0x1;
        }
        this.field4818 = 0x1 << var5;
        this.field4822 = var5;
        this.field4821 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "ka", descriptor = "(III)V")
    public abstract void method1037(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZII)V")
    public abstract void method1043(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lr;IIIIZ)Z")
    public abstract boolean method1041(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public abstract void method1026(int arg0, int arg1);

    @OriginalMember(owner = "client!s", name = "fa", descriptor = "(IILr;)Lr;")
    public abstract class709 method1032(int arg0, int arg1, class709 arg2);

    @OriginalMember(owner = "client!s", name = "U", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1040(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method1034(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III[[ZZI)V")
    public abstract void method1027(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!s", name = "CA", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1042(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Ltj;[I)V")
    public abstract void method1036(class687 arg0, int[] arg1);

    @OriginalMember(owner = "client!s", name = "YA", descriptor = "()V")
    public abstract void method1028();

    @OriginalMember(owner = "client!s", name = "wa", descriptor = "(Lr;IIIIZ)V")
    public abstract void method1025(class709 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);
}
