import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public abstract class class593 extends class189 {

    @OriginalMember(owner = "client!kq", name = "k", descriptor = "I")
    public static int field8350;

    @OriginalMember(owner = "client!kq", name = "l", descriptor = "I")
    public int field8351;

    @OriginalMember(owner = "client!kq", name = "n", descriptor = "I")
    public static int field8353;

    @OriginalMember(owner = "client!kq", name = "o", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!kq", name = "p", descriptor = "I")
    public int field8355;

    @OriginalMember(owner = "client!kq", name = "j", descriptor = "[I")
    public int[] field8349;

    @OriginalMember(owner = "client!kq", name = "m", descriptor = "[Ljb;")
    public static class493[] field8352;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(ILjava/lang/String;)J", line = 4)
    public static final long method3352(int arg0, String arg1) {
        if (arg0 != 57) {
            method3352(-31, null);
        }
        field8354++;
        long var2 = 0L;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (1 - (65 - var6));
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 - 21);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(I)V", line = 48)
    public static void method3353(int arg0) {
        field8352 = null;
        if (arg0 > -122) {
            method3352(58, null);
        }
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIIIIIILjava/awt/Graphics;)V")
    public abstract void method1280(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, Graphics arg7);

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIZLjava/awt/Canvas;)V")
    public abstract void method1281(int arg0, int arg1, boolean arg2, Canvas arg3);
}
