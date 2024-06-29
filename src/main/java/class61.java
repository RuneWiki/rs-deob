import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class61 extends class51 {

    @OriginalMember(owner = "client!mg", name = "I", descriptor = "Lsd;")
    public class38 field958;

    @OriginalMember(owner = "client!mg", name = "F", descriptor = "Lhi;")
    public static class82 field955 = class95.method664((byte) -100, "Lade)3)3)3");

    @OriginalMember(owner = "client!mg", name = "H", descriptor = "Lva;")
    public static class209 field957 = new class209(5000);

    @OriginalMember(owner = "client!mg", name = "J", descriptor = "I")
    public static int field959 = 0;

    @OriginalMember(owner = "client!mg", name = "K", descriptor = "I")
    public static int field960 = 0;

    @OriginalMember(owner = "client!mg", name = "L", descriptor = "I")
    public static int field961 = 0;

    @OriginalMember(owner = "client!mg", name = "N", descriptor = "I")
    public static int field963 = 1;

    @OriginalMember(owner = "client!mg", name = "M", descriptor = "[[[I")
    public static int[][][] field962 = new int[2][][];

    @OriginalMember(owner = "client!mg", name = "E", descriptor = "I")
    public static int field954;

    @OriginalMember(owner = "client!mg", name = "G", descriptor = "I")
    public static int field956;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "(I)V", line = 6)
    public static final void method399(int arg0) {
        if (arg0 != -14358) {
            field955 = (class82) null;
        }
        int var1 = class179.field3066;
        field954++;
        int var2 = class48.field798;
        int var3 = class166.field2902 - var2 - class180.field3078;
        int var4 = class196.field3337 - var1 - class260.field4462;
        if (var1 <= 0 && var4 <= 0 && var2 <= 0 && var3 <= 0) {
            return;
        }
        try {
            Container var5;
            if (class48.field795 != null) {
                var5 = class48.field795;
            } else if (class261.field4468 == null) {
                var5 = class55.field881.field2109;
            } else {
                var5 = class261.field4468;
            }
            int var6 = 0;
            int var7 = 0;
            if (class261.field4468 == var5) {
                Insets var8 = class261.field4468.getInsets();
                var7 = var8.top;
                var6 = var8.left;
            }
            Graphics var9 = var5.getGraphics();
            var9.setColor(Color.black);
            if (var1 > 0) {
                var9.fillRect(var6, var7, var1, class166.field2902);
            }
            if (var2 > 0) {
                var9.fillRect(var6, var7, class196.field3337, var2);
            }
            if (var4 > 0) {
                var9.fillRect(class196.field3337 + var6 - var4, var7, var4, class166.field2902);
            }
            if (var3 > 0) {
                var9.fillRect(var6, var7 + class166.field2902 - var3, class196.field3337, var3);
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)Lhi;", line = 78)
    public static final class82 method400(int arg0, int arg1, int arg2) {
        field956++;
        int var3 = arg2 - arg0;
        if (var3 < -9) {
            return class267.field4537;
        } else if (var3 < -6) {
            return class3.field31;
        } else {
            if (arg1 != 10874) {
                method399(-48);
            }
            if (var3 < -3) {
                return class164.field2865;
            } else if (var3 < 0) {
                return class331.field5639;
            } else if (var3 > 9) {
                return class159.field2766;
            } else if (var3 > 6) {
                return class15.field128;
            } else if (var3 <= 3) {
                return var3 > 0 ? class297.field5055 : class269.field4553;
            } else {
                return class197.field3379;
            }
        }
    }

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "(I)V", line = 146)
    public static void method401(int arg0) {
        field957 = null;
        field962 = (int[][][]) null;
        if (arg0 == -1) {
            field955 = null;
        }
    }

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "(II)V", line = 159)
    public static final void method402(int arg0, int arg1) {
        class16 var2 = class15.field120[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class16 var4 = class15.field120[var3][arg0][arg1] = class15.field120[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field163--;
                for (int var5 = 0; var5 < var4.field165; var5++) {
                    class69 var6 = var4.field158[var5];
                    if ((var6.field1064 >> 29 & 0x3L) == 2L && var6.field1076 == arg0 && var6.field1080 == arg1) {
                        var6.field1071--;
                    }
                }
            }
        }
        if (class15.field120[0][arg0][arg1] == null) {
            class15.field120[0][arg0][arg1] = new class16(0, arg0, arg1);
        }
        class15.field120[0][arg0][arg1].field170 = var2;
        class15.field120[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "(Lsd;)V", line = 195)
    public class61(class38 arg0) {
        this.field958 = arg0;
    }
}
