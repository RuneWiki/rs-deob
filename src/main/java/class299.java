import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class299 extends class242 {

    @OriginalMember(owner = "client!l", name = "w", descriptor = "Ljf;")
    public class229 field5098;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "[I")
    public static int[] field5091 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!l", name = "r", descriptor = "Ljf;")
    private static class229 field5093 = class212.method1457((byte) 100, "en");

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Ljf;")
    public static class229 field5090 = class212.method1457((byte) 74, " )2>");

    @OriginalMember(owner = "client!l", name = "s", descriptor = "Ljf;")
    private static class229 field5094 = class212.method1457((byte) 115, "pt");

    @OriginalMember(owner = "client!l", name = "x", descriptor = "Ljf;")
    public static class229 field5099 = class212.method1457((byte) 97, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!l", name = "z", descriptor = "Ljf;")
    private static class229 field5101 = class212.method1457((byte) 100, "de");

    @OriginalMember(owner = "client!l", name = "A", descriptor = "Ljf;")
    private static class229 field5102 = class212.method1457((byte) 105, "fr");

    @OriginalMember(owner = "client!l", name = "u", descriptor = "Ljf;")
    private static class229 field5096 = class212.method1457((byte) 101, ")3fr");

    @OriginalMember(owner = "client!l", name = "F", descriptor = "Ljf;")
    public static class229 field5106 = class212.method1457((byte) 106, "(R");

    @OriginalMember(owner = "client!l", name = "G", descriptor = "Ljf;")
    private static class229 field5107 = class212.method1457((byte) 97, ")3de");

    @OriginalMember(owner = "client!l", name = "C", descriptor = "Ljf;")
    private static class229 field5104 = class212.method1457((byte) 86, ")3pt");

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Ljf;")
    private static class229 field5108 = class212.method1457((byte) 76, ")3en");

    @OriginalMember(owner = "client!l", name = "q", descriptor = "[Ljf;")
    private static class229[] field5092 = new class229[] { field5108, field5107, field5096, field5104 };

    @OriginalMember(owner = "client!l", name = "v", descriptor = "[Ljf;")
    public static class229[] field5097 = new class229[] { field5093, field5101, field5102, field5094 };

    @OriginalMember(owner = "client!l", name = "B", descriptor = "I")
    public static int field5103;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field5100;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "[[I")
    public static int[][] field5095;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)V", line = 26)
    public static void method2058(byte arg0) {
        field5093 = null;
        if (arg0 != -106) {
            field5107 = (class229) null;
        }
        field5094 = null;
        field5092 = null;
        field5100 = null;
        field5099 = null;
        field5091 = null;
        field5095 = (int[][]) null;
        field5097 = null;
        field5107 = null;
        field5106 = null;
        field5096 = null;
        field5102 = null;
        field5090 = null;
        field5104 = null;
        field5101 = null;
        field5108 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIIIIII)V", line = 70)
    public static final void method2059(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = arg5 - arg7;
        field5105++;
        int var10 = arg4 - arg3;
        int var11 = (arg2 - arg1 << 16) / var10;
        if (arg0 != 2) {
            field5092 = (class229[]) null;
        }
        int var12 = (arg8 - arg6 << 16) / var9;
        class329.method2240(0, arg6, arg3, var12, arg1, arg4, (byte) -127, 0, var11, arg5, arg7);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V", line = 90)
    public class299() {
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ[B)I", line = 100)
    public static final int method2060(int arg0, boolean arg1, byte[] arg2) {
        field5103++;
        if (!arg1) {
            method2060(80, false, (byte[]) null);
        }
        return class73.method534(0, arg0, arg2, -1);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Ljf;I)V", line = 118)
    public class299(class229 arg0, int arg1) {
        this.field5098 = arg0;
    }
}
