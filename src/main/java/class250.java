import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class250 extends class152 {

    @OriginalMember(owner = "client!pm", name = "U", descriptor = "I")
    public static int field4182 = 0;

    @OriginalMember(owner = "client!pm", name = "W", descriptor = "Lce;")
    public static class126 field4184 = class206.method1445(-7923, "lila:");

    @OriginalMember(owner = "client!pm", name = "V", descriptor = "Lce;")
    public static class126 field4183 = class206.method1445(-7923, "Shift)2click disabled)3");

    @OriginalMember(owner = "client!pm", name = "Y", descriptor = "[Z")
    public static boolean[] field4186 = new boolean[100];

    @OriginalMember(owner = "client!pm", name = "R", descriptor = "I")
    public static int field4179;

    @OriginalMember(owner = "client!pm", name = "T", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!pm", name = "X", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!pm", name = "Z", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!pm", name = "ab", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!pm", name = "bb", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!pm", name = "cb", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!pm", name = "S", descriptor = "[Lie;")
    public static class2[] field4180;

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZLce;Z)V", line = 11)
    public static final void method1693(boolean arg0, class126 arg1, boolean arg2) {
        if (!arg2) {
            method1694(-40);
        }
        byte var3 = 4;
        field4187++;
        int var4 = var3 + 6;
        int var5 = class174.field3077.method2149(arg1, 250);
        int var6 = var3 + 6;
        int var7 = class174.field3077.method2133(arg1, 250) * 13;
        if (class56.field846) {
            class101.method689(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 + var3, 0);
            class101.method681(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 + var3, 16777215);
        } else {
            class276.method1844(var4 - var3, -var3 + var6, var3 + var5 + var3, var7 - -var3 + var3, 0);
            class276.method1842(var4 - var3, -var3 + var6, var3 + var5 + var3, var3 + var7 - -var3, 16777215);
        }
        class174.field3077.method2153(arg1, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class182.method1303(var3 + var5 + var3, -1048576, var6 - var3, var3 + var3 + var7, -var3 + var4);
        if (!arg0) {
            class182.method1307(var6, var4, var5, 121, var7);
        } else if (class56.field846) {
            class56.method371();
        } else {
            try {
                Graphics var8 = class24.field342.getGraphics();
                class106.field1668.method135(0, 0, (byte) 108, var8);
            } catch (Exception var10) {
                class24.field342.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "(I)Lem;", line = 67)
    public static final class88 method1694(int arg0) {
        field4190++;
        class283.field4715 = 0;
        if (arg0 <= 84) {
            method1694(55);
        }
        return class17.method94(67);
    }

    @OriginalMember(owner = "client!pm", name = "d", descriptor = "(II)[[I", line = 81)
    public final int[][] method26(int arg0, int arg1) {
        field4189++;
        if (arg0 != 0) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field2775.method319(-115, arg1);
        if (this.field2775.field775) {
            int[] var4 = this.method1132(arg1, 88, 2);
            int[][] var5 = this.method1133(arg1, 0, true);
            int[][] var6 = this.method1133(arg1, 1, true);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[1];
            int[] var14 = var6[2];
            int[] var15 = var6[0];
            for (int var16 = 0; var16 < class244.field4133; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var15[var16];
                    var8[var16] = var13[var16];
                    var9[var16] = var14[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var15[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var13[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var14[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IILbb;)V", line = 167)
    public final void method5(int arg0, int arg1, class134 arg2) {
        if (arg0 != 8) {
            method1693(false, (class126) null, true);
        }
        field4185++;
        if (arg1 == 0) {
            this.field2781 = arg2.method948(-123) == 1;
        }
    }

    @OriginalMember(owner = "client!pm", name = "e", descriptor = "(B)V", line = 181)
    public static void method1695(byte arg0) {
        field4186 = null;
        field4184 = null;
        int var1 = -95 % ((arg0 - 7) / 40);
        field4180 = null;
        field4183 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZJ)Lce;", line = 202)
    public static final class126 method1696(boolean arg0, long arg1) {
        field4181++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            long var3 = arg1;
            int var5 = 0;
            while (var3 != 0L) {
                var5++;
                var3 /= 37L;
            }
            byte[] var6 = new byte[var5];
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var5--;
                var6[var5] = class99.field1600[(int) (var7 - (arg1 * 37L))];
            }
            if (arg0) {
                method1693(false, (class126) null, true);
            }
            class126 var9 = new class126();
            var9.field2158 = var6;
            var9.field2140 = var6.length;
            return var9;
        }
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "()V", line = 244)
    public class250() {
        super(3, false);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(ZI)[I", line = 259)
    public final int[] method6(boolean arg0, int arg1) {
        field4188++;
        if (!arg0) {
            method1693(true, (class126) null, false);
        }
        int[] var3 = this.field2776.method1799((byte) 107, arg1);
        if (this.field2776.field4516) {
            int[] var4 = this.method1132(arg1, -94, 0);
            int[] var5 = this.method1132(arg1, -81, 1);
            int[] var6 = this.method1132(arg1, -72, 2);
            for (int var7 = 0; var7 < class244.field4133; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }
}
