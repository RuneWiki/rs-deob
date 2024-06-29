import java.awt.Canvas;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public abstract class class47 extends class496 {

    @OriginalMember(owner = "client!fea", name = "l", descriptor = "[I")
    public static int[] field557 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!fea", name = "i", descriptor = "I")
    public int field554;

    @OriginalMember(owner = "client!fea", name = "j", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!fea", name = "k", descriptor = "[I")
    public int[] field556;

    @OriginalMember(owner = "client!fea", name = "m", descriptor = "[[I")
    public static int[][] field558;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/awt/Canvas;)V")
    public abstract void method240(int arg0, Canvas arg1);

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method241(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class273.field4040[arg0][var8][var14] == -class490.field7410) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class179.field2726) + 1;
            int var10 = (arg3 << class179.field2726) + 2;
            int var11 = class235.field3455[arg0].method1319(arg1, arg3) + arg5;
            if (!class313.method1924(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class179.field2726) - 1;
            if (!class313.method1924(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class179.field2726) - 1;
            if (!class313.method1924(var9, var11, var13)) {
                return false;
            } else if (class313.method1924(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class239.method1539(arg0, arg1, arg3)) {
            int var6 = arg1 << class179.field2726;
            int var7 = arg3 << class179.field2726;
            return class313.method1924(var6 + 1, class235.field3455[arg0].method1319(arg1, arg3) + arg5, var7 + 1) && class313.method1924(class177.field2692 + var6 - 1, class235.field3455[arg0].method1319(arg1 + 1, arg3) + arg5, var7 + 1) && class313.method1924(class177.field2692 + var6 - 1, class235.field3455[arg0].method1319(arg1 + 1, arg3 + 1) + arg5, class177.field2692 + var7 - 1) && class313.method1924(var6 + 1, class235.field3455[arg0].method1319(arg1, arg3 + 1) + arg5, class177.field2692 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method242(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method243(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
    public static void method244(int arg0) {
        if (arg0 != -7038) {
            field558 = null;
        }
        field558 = null;
        field557 = null;
    }
}
