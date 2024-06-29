import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class283 extends Canvas {

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field3685;

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "Lra;")
    public static class361 field3687 = new class361(95, 10);

    @OriginalMember(owner = "client!kg", name = "h", descriptor = "Lra;")
    public static class361 field3688 = new class361(81, 8);

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field3681;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!kg", name = "i", descriptor = "[[[J")
    public static long[][][] field3689;

    @OriginalMember(owner = "client!kg", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void paint(Graphics arg0) {
        field3684++;
        this.field3685.paint(arg0);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIIB)V", line = 13)
    public static final void method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        if (class265.field3552 <= arg2 && class641.field8924 >= arg6 && arg5 >= class165.field2061 && class99.field1309 >= arg1) {
            class90.method682(arg6, arg4, -62, arg1, arg0, arg5, arg2, arg3);
        } else {
            class467.method2597(arg6, arg5, arg1, -87, arg3, arg4, arg2, arg0);
        }
        field3681++;
        int var8 = -54 / ((-arg7 - 14) / 52);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(II[S)[S", line = 30)
    public static final short[] method1692(int arg0, int arg1, short[] arg2) {
        field3686++;
        short[] var3 = new short[arg1];
        int var4 = 43 % (arg0 / 56);
        class443.method2516(arg2, 0, var3, 0, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 46)
    public final void update(Graphics arg0) {
        this.field3685.update(arg0);
        field3683++;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(B)V", line = 55)
    public static void method1693(byte arg0) {
        int var1 = -49 % ((42 - arg0) / 58);
        field3689 = null;
        field3688 = null;
        field3687 = null;
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 67)
    public class283(Component arg0) {
        this.field3685 = arg0;
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IJ)Ljava/lang/String;", line = 81)
    public static final String method1694(int arg0, long arg1) {
        field3682++;
        if ((long) arg0 >= arg1 || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            for (long var4 = arg1; var4 != 0L; var4 /= 37L) {
                var3++;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                char var9 = class555.field7269[(int) (var7 - (arg1 * 37L))];
                if (var9 == '_') {
                    int var10 = var6.length() - 1;
                    var9 = ' ';
                    var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                }
                var6.append(var9);
            }
            var6.reverse();
            var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
            return var6.toString();
        }
    }
}
