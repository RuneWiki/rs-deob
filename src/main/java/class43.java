import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class43 extends class128 {

    @OriginalMember(owner = "client!aa", name = "B", descriptor = "[I")
    public static int[] field638 = new int[14];

    @OriginalMember(owner = "client!aa", name = "J", descriptor = "I")
    public static int field646 = -1;

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "I")
    public static int field645 = -1;

    @OriginalMember(owner = "client!aa", name = "G", descriptor = "I")
    public static int field643 = 0;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "Z")
    public static boolean field657 = false;

    @OriginalMember(owner = "client!aa", name = "C", descriptor = "I")
    public static int field639;

    @OriginalMember(owner = "client!aa", name = "F", descriptor = "I")
    public int field642;

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "I")
    public int field644;

    @OriginalMember(owner = "client!aa", name = "K", descriptor = "I")
    public static int field647;

    @OriginalMember(owner = "client!aa", name = "L", descriptor = "I")
    public int field648;

    @OriginalMember(owner = "client!aa", name = "M", descriptor = "I")
    public int field649;

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public int field656;

    @OriginalMember(owner = "client!aa", name = "A", descriptor = "Lbf;")
    public static class108 field637;

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "Lnh;")
    public static class305 field641;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "Ljava/awt/Frame;")
    public static Frame field653;

    @OriginalMember(owner = "client!aa", name = "D", descriptor = "Ljava/lang/String;")
    public String field640;

    @OriginalMember(owner = "client!aa", name = "N", descriptor = "[I")
    public int[] field650;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "[I")
    public int[] field652;

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "[Lue;")
    public class222[] field655;

    @OriginalMember(owner = "client!aa", name = "z", descriptor = "[Ljava/lang/String;")
    public String[] field636;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)I")
    public static final int method285(byte arg0, int arg1) {
        field647++;
        if (arg0 != -32) {
            field653 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZIIZIII)V")
    public static final void method286(boolean arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -1) {
            field643 = 21;
        }
        field639++;
        if (arg1 <= arg5) {
            return;
        }
        int var7 = arg5;
        int var8 = (arg1 + arg5) / 2;
        class248 var9 = class306.field4924[var8];
        class306.field4924[var8] = class306.field4924[arg1];
        class306.field4924[arg1] = var9;
        for (int var10 = arg5; var10 < arg1; var10++) {
            if (class250.method1629(arg0, arg4, var9, arg2, arg3, (byte) -3, class306.field4924[var10]) <= 0) {
                class248 var11 = class306.field4924[var10];
                class306.field4924[var10] = class306.field4924[var7];
                class306.field4924[var7++] = var11;
            }
        }
        class306.field4924[arg1] = class306.field4924[var7];
        class306.field4924[var7] = var9;
        method286(arg0, var7 - 1, arg2, arg3, arg4, arg5, -1);
        method286(arg0, arg1, arg2, arg3, arg4, var7 + 1, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method287(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field651++;
        int var8 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg4);
        int var9 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg0);
        int var10 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg7);
        int var11 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg2);
        int var12 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg4 + arg6);
        int var13 = class179.method1146(class271.field4322, class311.field5001, (byte) 31, arg0 - arg6);
        for (int var14 = var8; var14 < var12; var14++) {
            class129.method822(class247.field3876[var14], var10, -2426, arg1, var11);
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class129.method822(class247.field3876[var15], var10, -2426, arg1, var11);
        }
        int var16 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg6 + arg7);
        int var17 = class179.method1146(class261.field4204, class18.field310, (byte) 31, arg2 - arg6);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class247.field3876[var18];
            class129.method822(var19, var10, -2426, arg1, var16);
            class129.method822(var19, var16, arg5 - 2425, arg3, var17);
            class129.method822(var19, var17, -2426, arg1, var11);
        }
        if (arg5 != -1) {
            field646 = 10;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)V")
    public static void method288(boolean arg0) {
        field637 = null;
        field638 = null;
        if (arg0) {
            field641 = null;
        }
        field641 = null;
        field653 = null;
    }
}
