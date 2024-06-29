import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class49 {

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "I")
    public static int field678 = 1;

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "I")
    public static int field676;

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "I")
    public static int field679;

    @OriginalMember(owner = "client!kc", name = "g", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!kc", name = "h", descriptor = "I")
    public static int field681;

    @OriginalMember(owner = "client!kc", name = "i", descriptor = "I")
    public int field682;

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field684;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "Llc;")
    public static class270 field675;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "Ljava/awt/Image;")
    public Image field674;

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "[I")
    public int[] field677;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "[[[I")
    public static int[][][] field683;

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILlc;Llc;Ld;Llc;)Z")
    public static final boolean method298(int arg0, class270 arg1, class270 arg2, class59 arg3, class270 arg4) {
        if (arg0 != -12517) {
            field675 = null;
        }
        class138.field2244 = arg4;
        class303.field4896 = arg2;
        class284.field4575 = arg3;
        field679++;
        class204.field3011 = arg1;
        return true;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/awt/Graphics;II)V")
    public abstract void method178(int arg0, Graphics arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(ILjava/awt/Component;II)V")
    public abstract void method179(int arg0, Component arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V")
    public final void method299(int arg0) {
        class130.method992(this.field677, this.field682, this.field680);
        if (arg0 != 0) {
            field683 = null;
        }
        field684++;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IIIIILjava/awt/Graphics;)V")
    public abstract void method180(int arg0, int arg1, int arg2, int arg3, int arg4, Graphics arg5);

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Llc;Llc;I)V")
    public static final void method300(class270 arg0, class270 arg1, int arg2) {
        field676++;
        if (arg2 != -17681) {
            method302(48, 107, -83);
        }
        class84.field1336 = class114.method856(0, arg1, 2, class222.field3261, arg0);
        class284.field4569 = (class83) class84.field1336;
        class124.field2073 = class114.method856(0, arg1, 2, class9.field102, arg0);
        class208.field3084 = class114.method856(0, arg1, 2, class291.field4634, arg0);
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static void method301(int arg0) {
        field683 = null;
        field675 = null;
        if (arg0 != 5) {
            method301(34);
        }
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "()V")
    protected class49() {
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(III)Z")
    public static final boolean method302(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class71.field1117; var3++) {
            class57 var4 = class199.field2934[var3];
            if (var4.field840 == 1) {
                int var5 = var4.field844 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field850 * var5 >> 8) + var4.field847;
                    int var7 = (var4.field837 * var5 >> 8) + var4.field834;
                    int var8 = (var4.field829 * var5 >> 8) + var4.field849;
                    int var9 = (var4.field832 * var5 >> 8) + var4.field839;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field840 == 2) {
                int var10 = arg0 - var4.field844;
                if (var10 > 0) {
                    int var11 = (var4.field850 * var10 >> 8) + var4.field847;
                    int var12 = (var4.field837 * var10 >> 8) + var4.field834;
                    int var13 = (var4.field829 * var10 >> 8) + var4.field849;
                    int var14 = (var4.field832 * var10 >> 8) + var4.field839;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field840 == 3) {
                int var15 = var4.field847 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field852 * var15 >> 8) + var4.field844;
                    int var17 = (var4.field833 * var15 >> 8) + var4.field846;
                    int var18 = (var4.field829 * var15 >> 8) + var4.field849;
                    int var19 = (var4.field832 * var15 >> 8) + var4.field839;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field840 == 4) {
                int var20 = arg2 - var4.field847;
                if (var20 > 0) {
                    int var21 = (var4.field852 * var20 >> 8) + var4.field844;
                    int var22 = (var4.field833 * var20 >> 8) + var4.field846;
                    int var23 = (var4.field829 * var20 >> 8) + var4.field849;
                    int var24 = (var4.field832 * var20 >> 8) + var4.field839;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field840 == 5) {
                int var25 = arg1 - var4.field849;
                if (var25 > 0) {
                    int var26 = (var4.field852 * var25 >> 8) + var4.field844;
                    int var27 = (var4.field833 * var25 >> 8) + var4.field846;
                    int var28 = (var4.field850 * var25 >> 8) + var4.field847;
                    int var29 = (var4.field837 * var25 >> 8) + var4.field834;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
