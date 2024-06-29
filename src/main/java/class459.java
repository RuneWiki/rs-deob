import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class459 {

    @OriginalMember(owner = "client!ed", name = "h", descriptor = "I")
    public static int field6432 = -1;

    @OriginalMember(owner = "client!ed", name = "j", descriptor = "[I")
    public static int[] field6434 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ed", name = "k", descriptor = "Lus;")
    public static class1 field6435;

    @OriginalMember(owner = "client!ed", name = "m", descriptor = "Z")
    public static boolean field6437;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field6425;

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "I")
    public int field6427;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
    public int field6429;

    @OriginalMember(owner = "client!ed", name = "f", descriptor = "I")
    public int field6430;

    @OriginalMember(owner = "client!ed", name = "g", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!ed", name = "i", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "Lb;")
    public static class201 field6426;

    @OriginalMember(owner = "client!ed", name = "l", descriptor = "Ljj;")
    public static class67 field6436;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
    public static final void method2684(boolean arg0) {
        field6428++;
        class135.field1783.method680(((float) class314.field4438.field5802 * 0.1F + 0.7F) * 1.1523438F);
        class135.field1783.method695(class360.field5186, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        if (arg0) {
            method2684(true);
        }
        class135.field1783.method682(class349.field5055, -1);
        class135.field1783.method685(class305.field4340);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Lrp;B)V")
    public final void method2685(class276 arg0, byte arg1) {
        field6433++;
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                if (arg1 > -105) {
                    method2688(-106, 16, -27);
                    return;
                } else {
                    return;
                }
            }
            this.method2689(var3, arg0, (byte) -111);
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
    public static void method2686(byte arg0) {
        field6434 = null;
        if (arg0 <= 66) {
            method2688(75, 46, -79);
        }
        field6426 = null;
        field6436 = null;
        field6435 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class67.field857 = arg4;
        class79.field973 = arg5;
        if (arg6 != -8028) {
            method2684(true);
        }
        class492.field6934 = arg3;
        field6431++;
        class329.field4767 = arg0;
        class327.field4740 = arg1;
        class349.field5056 = arg2;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z")
    public static final boolean method2688(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class382.field5458; var3++) {
            class9 var4 = class279.field4118[var3];
            if (var4.field101 == 1) {
                int var5 = var4.field85 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field103 * var5 >> 8) + var4.field92;
                    int var7 = (var4.field86 * var5 >> 8) + var4.field91;
                    int var8 = (var4.field90 * var5 >> 8) + var4.field97;
                    int var9 = (var4.field83 * var5 >> 8) + var4.field88;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field101 == 2) {
                int var10 = arg0 - var4.field85;
                if (var10 > 0) {
                    int var11 = (var4.field103 * var10 >> 8) + var4.field92;
                    int var12 = (var4.field86 * var10 >> 8) + var4.field91;
                    int var13 = (var4.field90 * var10 >> 8) + var4.field97;
                    int var14 = (var4.field83 * var10 >> 8) + var4.field88;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field101 == 3) {
                int var15 = var4.field92 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field99 * var15 >> 8) + var4.field85;
                    int var17 = (var4.field98 * var15 >> 8) + var4.field102;
                    int var18 = (var4.field90 * var15 >> 8) + var4.field97;
                    int var19 = (var4.field83 * var15 >> 8) + var4.field88;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field101 == 4) {
                int var20 = arg2 - var4.field92;
                if (var20 > 0) {
                    int var21 = (var4.field99 * var20 >> 8) + var4.field85;
                    int var22 = (var4.field98 * var20 >> 8) + var4.field102;
                    int var23 = (var4.field90 * var20 >> 8) + var4.field97;
                    int var24 = (var4.field83 * var20 >> 8) + var4.field88;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field101 == 5) {
                int var25 = arg1 - var4.field97;
                if (var25 > 0) {
                    int var26 = (var4.field99 * var25 >> 8) + var4.field85;
                    int var27 = (var4.field98 * var25 >> 8) + var4.field102;
                    int var28 = (var4.field103 * var25 >> 8) + var4.field92;
                    int var29 = (var4.field86 * var25 >> 8) + var4.field91;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILrp;B)V")
    private final void method2689(int arg0, class276 arg1, byte arg2) {
        if (arg2 != -111) {
            method2687(-55, -109, 9, -84, -14, -14, -75);
        }
        if (arg0 == 1) {
            this.field6427 = arg1.method1729(65280);
            this.field6430 = arg1.method1701(-23121);
            this.field6429 = arg1.method1701(-23121);
        }
        field6425++;
    }

    static {
        new class326("You have been removed from this channel.", "Du wurdest aus dem Chatraum entfernt.", "Vous avez été supprimé de ce canal.", "Você foi retirado desse canal.");
        field6435 = new class1(14, 4);
        field6437 = true;
    }
}
