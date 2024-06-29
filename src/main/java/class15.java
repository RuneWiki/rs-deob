import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class15 extends Canvas {

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field193;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field192 = 0;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lok;")
    public static class41 field194 = class137.method956("Angreifen", 45);

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "Lok;")
    public static class41 field197 = class137.method956("scrollen:", 45);

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "Lok;")
    public static class41 field196 = null;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Lok;")
    public static class41 field191 = class137.method956("(U", 45);

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "Lok;")
    public static class41 field200 = class137.method956("", 45);

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Lok;")
    public static class41 field199 = class137.method956("k", 45);

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "Lok;")
    public static class41 field202 = class137.method956("Starte 3D)2Softwarebibliothek)3", 45);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "I")
    public static int field201;

    @OriginalMember(owner = "client!nf", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 5)
    public final void paint(Graphics arg0) {
        this.field193.paint(arg0);
        field201++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(III)V", line = 12)
    public static final void method67(int arg0, int arg1, int arg2) {
        class272.field4429 = true;
        class286.field4655 = arg0;
        class48.field750 = arg1;
        class95.field1407 = arg2;
        class159.field2493 = -1;
        class307.field5181 = -1;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)V", line = 22)
    public static void method68(boolean arg0) {
        if (!arg0) {
            return;
        }
        field194 = null;
        field199 = null;
        field191 = null;
        field200 = null;
        field202 = null;
        field196 = null;
        field197 = null;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(III)V", line = 40)
    public static final void method69(int arg0, int arg1, int arg2) {
        class60.field885[arg0] = arg1;
        field190++;
        if (arg2 != -10) {
            method69(-3, -121, -46);
        }
        class248 var3 = (class248) class16.field206.method617((long) arg0, false);
        if (var3 == null) {
            class248 var4 = new class248(class247.method1762(19166) + 500L);
            class16.field206.method610(108, var4, (long) arg0);
        } else {
            var3.field3961 = class247.method1762(19166) + 500L;
        }
    }

    @OriginalMember(owner = "client!nf", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 68)
    public final void update(Graphics arg0) {
        field198++;
        this.field193.update(arg0);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ZIILjc;III)Ljc;", line = 98)
    public static final class287 method70(boolean arg0, int arg1, int arg2, class287 arg3, int arg4, int arg5, int arg6) {
        field195++;
        long var7 = (long) arg6;
        class287 var9 = (class287) class306.field5131.method136(var7, true);
        if (var9 == null) {
            class233 var10 = class233.method1661(class45.field711, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1664(64, 768, -50, -10, -50);
            class306.field5131.method132(var7, var9, -1);
        }
        int var11 = arg3.method119();
        int var12 = arg3.method103();
        int var13 = arg3.method99();
        int var14 = arg3.method93();
        class287 var15 = var9.method113(true, true);
        if (arg1 != 0) {
            var15.method109(arg1);
        }
        if (class166.field2625) {
            class183 var16 = (class183) var15;
            if (class140.method983((byte) 126, class55.field807, arg4 + var11, arg2 + var13) != arg5 || arg5 != class140.method983((byte) 80, class55.field807, arg4 + var12, arg2 + var14)) {
                for (int var17 = 0; var17 < var16.field2954; var17++) {
                    var16.field2955[var17] += class140.method983((byte) 92, class55.field807, var16.field2966[var17] + arg4, var16.field2951[var17] + arg2) - arg5;
                }
                var16.field2976.field898 = false;
                var16.field2964.field3778 = false;
            }
        } else {
            class19 var18 = (class19) var15;
            if (arg5 != class140.method983((byte) 76, class55.field807, arg4 + var11, arg2 + var13) || arg5 != class140.method983((byte) -103, class55.field807, arg4 + var12, arg2 - -var14)) {
                for (int var19 = 0; var19 < var18.field252; var19++) {
                    var18.field260[var19] += class140.method983((byte) 87, class55.field807, var18.field242[var19] + arg4, var18.field254[var19] + arg2) - arg5;
                }
                var18.field248 = false;
            }
        }
        return arg0 ? (class287) null : var15;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 196)
    public class15(Component arg0) {
        this.field193 = arg0;
    }
}
