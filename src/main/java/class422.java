import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class422 extends class309 {

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "I")
    public int field6104;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public int field6098;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public int field6100;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public int field6099;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "[[I")
    public static int[][] field6102 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "Leb;")
    public static class395 field6101 = new class395();

    @OriginalMember(owner = "client!ik", name = "m", descriptor = "Z")
    public static boolean field6106 = false;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "I")
    public static int field6103;

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "I")
    public static int field6105;

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)V", line = 3)
    public static final void method2602(boolean arg0) {
        field6105++;
        if (arg0) {
            field6101 = null;
        }
        if (class359.field5222 != null) {
            return;
        }
        int var1 = class31.field433;
        int var2 = class263.field3898;
        int var3 = class266.field3946 - var1 - class214.field3016;
        int var4 = class252.field3699 - (class375.field5473 + var2);
        if (var1 <= 0 && var3 <= 0 && var2 <= 0 && var4 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class279.field4116 == null) {
                var5 = class267.field3963.field5023;
            } else {
                var5 = class279.field4116;
            }
            int var6 = 0;
            int var7 = 0;
            if (class279.field4116 == var5) {
                Insets var8 = class279.field4116.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class252.field3699);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class266.field3946, var2);
            }
            if (var3 > 0) {
                var9.fillRect(class266.field3946 + var6 - var3, var7, var3, class252.field3699);
            }
            if (var4 > 0) {
                var9.fillRect(var6, class252.field3699 + var7 - var4, class266.field3946, var4);
                return;
            }
        } catch (Exception var10) {
            return;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(III)V", line = 76)
    public static final void method2603(int arg0, int arg1, int arg2) {
        class369 var3 = class178.field2530[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field5327 != null) {
            var3.field5327 = null;
        }
        if (var3.field5334 != null) {
            var3.field5334 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I[B)Lhg;", line = 90)
    public static final class299 method2604(int arg0, byte[] arg1) {
        field6103++;
        class299 var2 = new class299();
        int var3 = 77 / ((arg0 + 53) / 38);
        class256 var4 = new class256(arg1);
        var4.field3762 = var4.field3764.length - 2;
        int var5 = var4.method1767(1930493576);
        int var6 = var4.field3764.length - var5 - 2 - 12;
        var4.field3762 = var6;
        int var7 = var4.method1746(20972);
        var2.field4346 = var4.method1767(1930493576);
        var2.field4354 = var4.method1767(1930493576);
        var2.field4353 = var4.method1767(1930493576);
        var2.field4358 = var4.method1767(1930493576);
        int var8 = var4.method1738((byte) -45);
        if (var8 > 0) {
            var2.field4347 = new class90[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                int var10 = var4.method1767(1930493576);
                class90 var11 = new class90(class289.method1938((byte) 23, var10));
                var2.field4347[var9] = var11;
                while ((var10--) > 0) {
                    int var12 = var4.method1746(20972);
                    int var13 = var4.method1746(20972);
                    var11.method606(1, new class13(var13), (long) var12);
                }
            }
        }
        var4.field3762 = 0;
        var2.field4348 = var4.method1726(true);
        var2.field4356 = new int[var7];
        var2.field4349 = new int[var7];
        var2.field4357 = new String[var7];
        int var14 = 0;
        while (var6 > var4.field3762) {
            int var15 = var4.method1767(1930493576);
            if (var15 == 3) {
                var2.field4357[var14] = var4.method1715(true).intern();
            } else if (var15 >= 100 || var15 == 21 || var15 == 38 || var15 == 39) {
                var2.field4356[var14] = var4.method1738((byte) 60);
            } else {
                var2.field4356[var14] = var4.method1746(20972);
            }
            var2.field4349[var14++] = var15;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(IIII)V", line = 171)
    public class422(int arg0, int arg1, int arg2, int arg3) {
        this.field6104 = arg3;
        this.field6098 = arg0;
        this.field6100 = arg1;
        this.field6099 = arg2;
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(Z)V", line = 183)
    public static void method2605(boolean arg0) {
        field6101 = null;
        field6102 = null;
        if (!arg0) {
            field6101 = null;
        }
    }
}
