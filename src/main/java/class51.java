import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class51 {

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "I")
    private int field691 = 0;

    @OriginalMember(owner = "client!qh", name = "g", descriptor = "Lru;")
    private class177 field694;

    @OriginalMember(owner = "client!qh", name = "f", descriptor = "Z")
    public static boolean field693 = false;

    @OriginalMember(owner = "client!qh", name = "i", descriptor = "[[I")
    public static int[][] field696 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 }, { -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "[Z")
    public static boolean[] field689 = new boolean[5];

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!qh", name = "c", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!qh", name = "h", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!qh", name = "j", descriptor = "J")
    public static long field697;

    @OriginalMember(owner = "client!qh", name = "e", descriptor = "Lwh;")
    private class529 field692;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(I)V")
    public static void method361(int arg0) {
        field689 = null;
        field696 = null;
        int var1 = 70 / ((arg0 + 54) / 45);
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(ILza;BIII)V")
    public static final void method362(int arg0, class497 arg1, byte arg2, int arg3, int arg4, int arg5) {
        arg1.method1307(arg3, arg0, arg3 + arg4, arg0 + arg5);
        field688++;
        arg1.method3042(arg5, (byte) -107, arg0, -16777216, arg3, arg4);
        if (class213.field3643 < 100) {
            return;
        }
        float var6 = (float) class194.field2894 / (float) class194.field2891;
        int var7 = arg4;
        int var8 = arg5;
        int var9 = 75 / ((arg2 + 16) / 53);
        if ((var6 < 1.0F)) {
            var8 = (int) ((float) arg4 * var6);
        } else {
            var7 = (int) ((float) arg5 / var6);
        }
        int var10 = (arg5 - var8) / 2 + arg0;
        int var11 = (arg4 - var7) / 2 + arg3;
        if (class143.field1929 == null || arg4 != class143.field1929.method626() || arg5 != class143.field1929.method622()) {
            class194.method1224(class194.field2883, class194.field2900 + class194.field2894, class194.field2891 + class194.field2883, class194.field2900, var11, var10, var7 + var11, var10 - -var8);
            class194.method1216(arg1);
            class143.field1929 = arg1.method1311(var11, var10, var7, var8, false);
        }
        class143.field1929.method852(var11, var10);
        int var12 = class331.field5189 * var7 / class194.field2891;
        int var13 = class325.field5109 * var8 / class194.field2894;
        int var14 = class336.field5254 * var7 / class194.field2891 + var11;
        int var15 = var10 + var8 - class291.field4595 * var8 / class194.field2894 - var13;
        int var16 = -1996554240;
        if (class516.field7674 == class261.field4216) {
            var16 = -1996488705;
        }
        arg1.method1260(var14, var15, var12, var13, var16, 1);
        arg1.method1284(var14, var15, var12, var13, var16, 0);
        if (class52.field707 <= 0) {
            return;
        }
        int var17;
        if (class388.field5920 <= 50) {
            var17 = class388.field5920 * 5;
        } else {
            var17 = (100 - class388.field5920) * 5;
        }
        for (class224 var18 = (class224) class194.field2876.method2123(-15); var18 != null; var18 = (class224) class194.field2876.method2126((byte) 61)) {
            class210 var19 = class194.field2866.method662(var18.field3759, true);
            if (class299.method2002((byte) -84, var19)) {
                if (class501.field7516 == var18.field3759) {
                    int var22 = var18.field3758 * var7 / class194.field2891 + var11;
                    int var23 = (class194.field2894 - var18.field3763) * var8 / class194.field2894 + var10;
                    arg1.method3042(4, (byte) -116, var23 - 2, var17 << 24 | 0xFFFF00, var22 - 2, 4);
                } else if (class136.field1877 != -1 && class136.field1877 == var19.field3272) {
                    int var20 = var11 + (var18.field3758 * var7 / class194.field2891);
                    int var21 = (class194.field2894 - var18.field3763) * var8 / class194.field2894 + var10;
                    arg1.method3042(4, (byte) -102, var21 - 2, var17 << 24 | 0xFFFF00, var20 - 2, 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)Lwh;")
    public final class529 method363(int arg0) {
        field690++;
        if (arg0 != 18098) {
            return null;
        } else if (this.field691 <= 0 || this.field694.field2599[this.field691 - 1] == this.field692) {
            while (this.field691 < this.field694.field2585) {
                class529 var3 = this.field694.field2599[this.field691++].field7779;
                if (this.field694.field2599[this.field691 - 1] != var3) {
                    this.field692 = var3.field7779;
                    return var3;
                }
            }
            return null;
        } else {
            class529 var2 = this.field692;
            this.field692 = var2.field7779;
            return var2;
        }
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lru;)V")
    public class51(class177 arg0) {
        this.field694 = arg0;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(B)Lwh;")
    public final class529 method364(byte arg0) {
        this.field691 = 0;
        int var2 = -128 % ((arg0 - 56) / 41);
        field695++;
        return this.method363(18098);
    }
}
