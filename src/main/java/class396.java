import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class396 extends class381 {

    @OriginalMember(owner = "client!sc", name = "r", descriptor = "Lfi;")
    public class166 field5549 = new class166();

    @OriginalMember(owner = "client!sc", name = "n", descriptor = "I")
    public static int field5545 = 0;

    @OriginalMember(owner = "client!sc", name = "l", descriptor = "I")
    public static int field5543;

    @OriginalMember(owner = "client!sc", name = "o", descriptor = "I")
    public static int field5546;

    @OriginalMember(owner = "client!sc", name = "p", descriptor = "I")
    public static int field5547;

    @OriginalMember(owner = "client!sc", name = "q", descriptor = "Lrk;")
    public static class427 field5548;

    @OriginalMember(owner = "client!sc", name = "m", descriptor = "[Lfo;")
    public static class228[] field5544;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III[II)V")
    public static final void method2436(int arg0, int arg1, int arg2, int[] arg3, int arg4) {
        field5546++;
        if (arg0 != -1070) {
            method2437(false);
        }
        arg2--;
        int var11 = arg4 - 1;
        int var5 = var11 - 7;
        while (var5 > arg2) {
            int var6 = arg2 + 1;
            arg3[var6] = arg1;
            int var7 = var6 + 1;
            arg3[var7] = arg1;
            int var8 = var7 + 1;
            arg3[var8] = arg1;
            int var9 = var8 + 1;
            arg3[var9] = arg1;
            int var10 = var9 + 1;
            arg3[var10] = arg1;
            int var12 = var10 + 1;
            arg3[var12] = arg1;
            int var13 = var12 + 1;
            arg3[var13] = arg1;
            arg2 = var13 + 1;
            arg3[arg2] = arg1;
        }
        while (arg2 < var11) {
            arg2++;
            arg3[arg2] = arg1;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Z)V")
    public static void method2437(boolean arg0) {
        if (arg0) {
            field5548 = null;
            field5544 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "(I)V")
    public static final void method2438(int arg0) {
        field5543++;
        if (class416.field5820 != null) {
            return;
        }
        int var1 = class172.field2520;
        if (arg0 <= 90) {
            field5547 = -19;
        }
        int var2 = class134.field1915;
        int var3 = class417.field5853 - class249.field3414 - var1;
        int var4 = class135.field1927 - class258.field3488 - var2;
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class414.field5781 == null) {
                var5 = class30.field502.field4117;
            } else {
                var5 = class414.field5781;
            }
            int var6 = 0;
            int var7 = 0;
            if (class414.field5781 == var5) {
                Insets var8 = class414.field5781.getInsets();
                var6 = var8.left;
                var7 = var8.top;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class135.field1927);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class417.field5853, var2);
            }
            if (var3 > 0) {
                var9.fillRect(var6 + class417.field5853 - var3, var7, var3, class135.field1927);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class135.field1927 + var7 - var4, class417.field5853, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }
}
