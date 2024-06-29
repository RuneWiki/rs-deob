import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jb")
public class class268 {

    @OriginalMember(owner = "client!jb", name = "m", descriptor = "Lcf;")
    public static class93 field4780 = class147.method1066(")4p=", -48);

    @OriginalMember(owner = "client!jb", name = "r", descriptor = "Lcf;")
    public static class93 field4785 = class147.method1066("D-Bmarrage de la librairie 3D", -48);

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "I")
    public static int field4769 = 0;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "Lcf;")
    public static class93 field4768 = class147.method1066("T", -48);

    @OriginalMember(owner = "client!jb", name = "v", descriptor = "Lcf;")
    public static class93 field4789 = class147.method1066("logo", -48);

    @OriginalMember(owner = "client!jb", name = "t", descriptor = "[I")
    public static int[] field4787 = new int[2];

    @OriginalMember(owner = "client!jb", name = "c", descriptor = "I")
    public int field4770;

    @OriginalMember(owner = "client!jb", name = "d", descriptor = "I")
    public int field4771;

    @OriginalMember(owner = "client!jb", name = "e", descriptor = "I")
    public int field4772;

    @OriginalMember(owner = "client!jb", name = "f", descriptor = "I")
    public int field4773;

    @OriginalMember(owner = "client!jb", name = "g", descriptor = "I")
    public int field4774;

    @OriginalMember(owner = "client!jb", name = "h", descriptor = "I")
    public int field4775;

    @OriginalMember(owner = "client!jb", name = "i", descriptor = "I")
    public int field4776;

    @OriginalMember(owner = "client!jb", name = "j", descriptor = "I")
    public int field4777;

    @OriginalMember(owner = "client!jb", name = "k", descriptor = "I")
    public int field4778;

    @OriginalMember(owner = "client!jb", name = "l", descriptor = "I")
    public int field4779;

    @OriginalMember(owner = "client!jb", name = "n", descriptor = "I")
    public int field4781;

    @OriginalMember(owner = "client!jb", name = "o", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!jb", name = "p", descriptor = "I")
    public static int field4783;

    @OriginalMember(owner = "client!jb", name = "q", descriptor = "I")
    public int field4784;

    @OriginalMember(owner = "client!jb", name = "u", descriptor = "I")
    public int field4788;

    @OriginalMember(owner = "client!jb", name = "w", descriptor = "I")
    public int field4790;

    @OriginalMember(owner = "client!jb", name = "x", descriptor = "I")
    public int field4791;

    @OriginalMember(owner = "client!jb", name = "y", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!jb", name = "z", descriptor = "I")
    public int field4793;

    @OriginalMember(owner = "client!jb", name = "A", descriptor = "I")
    public int field4794;

    @OriginalMember(owner = "client!jb", name = "B", descriptor = "I")
    public int field4795;

    @OriginalMember(owner = "client!jb", name = "s", descriptor = "[Ltg;")
    public static class181[] field4786;

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
    public static void method1790(int arg0) {
        field4785 = null;
        if (arg0 != 2) {
            field4792 = 100;
        }
        field4789 = null;
        field4786 = null;
        field4768 = null;
        field4780 = null;
        field4787 = null;
    }

    @OriginalMember(owner = "client!jb", name = "b", descriptor = "(I)[Lnf;")
    public static final class158[] method1791(int arg0) {
        field4783++;
        class158[] var1 = new class158[class245.field4415];
        for (int var2 = arg0; var2 < class245.field4415; var2++) {
            byte[] var3 = class255.field4614[var2];
            int var4 = class42.field663[var2] * class246.field4435[var2];
            int[] var5 = new int[var4];
            for (int var6 = 0; var6 < var4; var6++) {
                var5[var6] = class248.field4475[class58.method333(var3[var6], 255)];
            }
            var1[var2] = new class158(class153.field2693, class226.field4044, class169.field2974[var2], class67.field1230[var2], class246.field4435[var2], class42.field663[var2], var5);
        }
        class50.method276((byte) 120);
        return var1;
    }

    @OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)Z")
    public static final boolean method1792(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class246.field4429; var3++) {
            class268 var4 = class258.field4642[var3];
            if (var4.field4775 == 1) {
                int var5 = var4.field4778 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4781 * var5 >> 8) + var4.field4793;
                    int var7 = (var4.field4771 * var5 >> 8) + var4.field4779;
                    int var8 = (var4.field4774 * var5 >> 8) + var4.field4770;
                    int var9 = (var4.field4777 * var5 >> 8) + var4.field4784;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4775 == 2) {
                int var10 = arg0 - var4.field4778;
                if (var10 > 0) {
                    int var11 = (var4.field4781 * var10 >> 8) + var4.field4793;
                    int var12 = (var4.field4771 * var10 >> 8) + var4.field4779;
                    int var13 = (var4.field4774 * var10 >> 8) + var4.field4770;
                    int var14 = (var4.field4777 * var10 >> 8) + var4.field4784;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4775 == 3) {
                int var15 = var4.field4793 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4773 * var15 >> 8) + var4.field4778;
                    int var17 = (var4.field4776 * var15 >> 8) + var4.field4788;
                    int var18 = (var4.field4774 * var15 >> 8) + var4.field4770;
                    int var19 = (var4.field4777 * var15 >> 8) + var4.field4784;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4775 == 4) {
                int var20 = arg2 - var4.field4793;
                if (var20 > 0) {
                    int var21 = (var4.field4773 * var20 >> 8) + var4.field4778;
                    int var22 = (var4.field4776 * var20 >> 8) + var4.field4788;
                    int var23 = (var4.field4774 * var20 >> 8) + var4.field4770;
                    int var24 = (var4.field4777 * var20 >> 8) + var4.field4784;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4775 == 5) {
                int var25 = arg1 - var4.field4770;
                if (var25 > 0) {
                    int var26 = (var4.field4773 * var25 >> 8) + var4.field4778;
                    int var27 = (var4.field4776 * var25 >> 8) + var4.field4788;
                    int var28 = (var4.field4781 * var25 >> 8) + var4.field4793;
                    int var29 = (var4.field4771 * var25 >> 8) + var4.field4779;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
