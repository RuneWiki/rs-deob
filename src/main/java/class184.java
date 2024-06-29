import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public abstract class class184 {

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "Loea;")
    public class594 field2626;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
    public static int field2625 = -1;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "F")
    public static float field2627;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!ffa", name = "g", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!ffa", name = "f", descriptor = "Lvj;")
    public static class439 field2629;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Liia;ZI)V")
    public abstract void method700(class87 arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)Z")
    public abstract boolean method698(int arg0);

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(ZI)V")
    public abstract void method704(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Z)V")
    public abstract void method702(boolean arg0);

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IILha;III)V")
    public static final void method1314(int arg0, int arg1, class58 arg2, int arg3, int arg4, int arg5) {
        field2624++;
        arg2.method584(arg5, arg1, arg3 + arg5, arg1 - -arg0);
        arg2.method542(arg0, arg3, 3854, -16777216, arg1, arg5);
        if (class442.field6163 < 100) {
            return;
        }
        float var6 = (float) class542.field7636 / (float) class542.field7639;
        int var7 = arg3;
        int var8 = arg0;
        if (var6 < 1.0F) {
            var8 = (int) ((float) arg3 * var6);
        } else {
            var7 = (int) ((float) arg0 / var6);
        }
        int var9 = (arg3 - var7) / 2 + arg5;
        int var10 = (arg0 - var8) / 2 + arg1;
        if (class107.field1765 == null || class107.field1765.method93() != arg3 || arg0 != class107.field1765.method95()) {
            class542.method3198(class542.field7632, class542.field7644 + class542.field7636, class542.field7639 + class542.field7632, class542.field7644, var9, var10, var7 + var9, var10 - -var8);
            class542.method3189(arg2);
            class107.field1765 = arg2.method576(var9, var10, var7, var8, false);
        }
        class107.field1765.method4135(var9, var10);
        int var11 = class618.field8928 * var7 / class542.field7639;
        int var12 = class189.field2728 * var8 / class542.field7636;
        if (arg4 != 4) {
            field2629 = null;
        }
        int var13 = class158.field2366 * var7 / class542.field7639 + var9;
        int var14 = var8 + var10 - var12 - (class478.field6823 * var8 / class542.field7636);
        int var15 = -1996554240;
        if (class696.field9784 == class649.field9170) {
            var15 = -1996488705;
        }
        arg2.method630(var13, var14, var11, var12, var15, 1);
        arg2.method616(var13, var14, var11, var12, var15, 0);
        if (class613.field8875 <= 0) {
            return;
        }
        int var16;
        if (class170.field2485 <= 50) {
            var16 = class170.field2485 * 5;
        } else {
            var16 = (100 - class170.field2485) * 5;
        }
        for (class541 var17 = (class541) class542.field7626.method1522(true); var17 != null; var17 = (class541) class542.field7626.method1527((byte) 121)) {
            class524 var18 = class542.field7614.method2641(var17.field7608, arg4 ^ 0x6E);
            if (class612.method3524((byte) 112, var18)) {
                if (class495.field7063 == var17.field7608) {
                    int var21 = var17.field7597 * var7 / class542.field7639 + var9;
                    int var22 = (class542.field7636 - var17.field7601) * var8 / class542.field7636 + var10;
                    arg2.method542(4, 4, arg4 + 3850, var16 << 24 | 0xFFFF00, var22 - 2, var21 + -2);
                } else if (class617.field8922 != -1 && class617.field8922 == var18.field7414) {
                    int var19 = var17.field7597 * var7 / class542.field7639 + var9;
                    int var20 = (class542.field7636 - var17.field7601) * var8 / class542.field7636 + var10;
                    arg2.method542(4, 4, 3854, var16 << 24 | 0xFFFF00, var20 - 2, var19 - 2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IIZ)V")
    public abstract void method705(int arg0, int arg1, boolean arg2);

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(BLae;)Lae;")
    public static final class250 method1315(byte arg0, class250 arg1) {
        if (arg0 == 10) {
            field2630++;
            class250 var2 = arg1 == null ? new class250() : new class250(arg1);
            var2.method1706(128, 9, 2769);
            return var2;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IZ)V")
    public abstract void method699(int arg0, boolean arg1);

    @OriginalMember(owner = "client!ffa", name = "<init>", descriptor = "(Loea;)V")
    public class184(class594 arg0) {
        this.field2626 = arg0;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IILoea;Ljava/lang/String;)Lpp;")
    public static final class390 method1316(int arg0, int arg1, class594 arg2, String arg3) {
        field2628++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg0, var4);
        OpenGL.glProgramStringARB(arg0, 34933, arg3);
        OpenGL.glGetIntegerv(34379, class405.field5638, 0);
        if (class405.field5638[0] != -1) {
            OpenGL.glBindProgramARB(arg0, 0);
            return null;
        } else if (arg1 < 5) {
            return null;
        } else {
            OpenGL.glBindProgramARB(arg0, 0);
            return new class390(arg2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(B)V")
    public static void method1317(byte arg0) {
        field2629 = null;
        int var1 = -101 % ((arg0 - 10) / 56);
    }
}
