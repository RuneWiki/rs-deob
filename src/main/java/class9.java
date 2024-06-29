import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class9 extends class151 {

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "[B")
    public byte[] field113;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field105 = 0;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "[Lbd;")
    public static class162[] field108 = new class162[100];

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lbd;")
    public static class162 field109 = class17.method142(0, "null");

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Lbd;")
    private static class162 field111 = class17.method142(0, "Choose Option");

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "Lbd;")
    public static class162 field106 = field111;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field107;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "I")
    public static int field110;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field114;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field115;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "Ld;")
    public static class32 field112;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z", line = 12)
    public static final boolean method54(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class204.field3457; var3++) {
            class22 var4 = class3.field23[var3];
            if (var4.field335 == 1) {
                int var5 = var4.field345 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field334 * var5 >> 8) + var4.field350;
                    int var7 = (var4.field341 * var5 >> 8) + var4.field340;
                    int var8 = (var4.field342 * var5 >> 8) + var4.field338;
                    int var9 = (var4.field343 * var5 >> 8) + var4.field353;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field335 == 2) {
                int var10 = arg0 - var4.field345;
                if (var10 > 0) {
                    int var11 = (var4.field334 * var10 >> 8) + var4.field350;
                    int var12 = (var4.field341 * var10 >> 8) + var4.field340;
                    int var13 = (var4.field342 * var10 >> 8) + var4.field338;
                    int var14 = (var4.field343 * var10 >> 8) + var4.field353;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field335 == 3) {
                int var15 = var4.field350 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field354 * var15 >> 8) + var4.field345;
                    int var17 = (var4.field349 * var15 >> 8) + var4.field355;
                    int var18 = (var4.field342 * var15 >> 8) + var4.field338;
                    int var19 = (var4.field343 * var15 >> 8) + var4.field353;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field335 == 4) {
                int var20 = arg2 - var4.field350;
                if (var20 > 0) {
                    int var21 = (var4.field354 * var20 >> 8) + var4.field345;
                    int var22 = (var4.field349 * var20 >> 8) + var4.field355;
                    int var23 = (var4.field342 * var20 >> 8) + var4.field338;
                    int var24 = (var4.field343 * var20 >> 8) + var4.field353;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field335 == 5) {
                int var25 = arg1 - var4.field338;
                if (var25 > 0) {
                    int var26 = (var4.field354 * var25 >> 8) + var4.field345;
                    int var27 = (var4.field349 * var25 >> 8) + var4.field355;
                    int var28 = (var4.field334 * var25 >> 8) + var4.field350;
                    int var29 = (var4.field341 * var25 >> 8) + var4.field340;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 149)
    public static void method55(int arg0) {
        field112 = null;
        field106 = null;
        field109 = null;
        if (arg0 != 0) {
            field108 = (class162[]) null;
        }
        field111 = null;
        field108 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIBI)V", line = 163)
    public static final void method56(int arg0, int arg1, byte arg2, int arg3) {
        field110++;
        class63 var4 = class46.method332(4, arg3, -12770);
        if (arg2 != -75) {
            method56(-43, 100, (byte) -10, -27);
        }
        var4.method430(false);
        var4.field971 = arg0;
        var4.field980 = arg1;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLqi;Lqi;)V", line = 182)
    public static final void method57(byte arg0, class216 arg1, class216 arg2) {
        field107++;
        if (arg2.field3611 != null) {
            arg2.method1573(-9728);
        }
        arg2.field3607 = arg1.field3607;
        arg2.field3611 = arg1;
        arg2.field3611.field3607 = arg2;
        int var3 = -17 % ((57 - arg0) / 46);
        arg2.field3607.field3611 = arg2;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 204)
    public static final void method58(byte arg0, Component arg1) {
        arg1.removeMouseListener(class240.field3998);
        arg1.removeMouseMotionListener(class240.field3998);
        arg1.removeFocusListener(class240.field3998);
        field115++;
        class297.field4972 = 0;
        if (arg0 > -99) {
            field111 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "([B)V", line = 216)
    public class9(byte[] arg0) {
        this.field113 = arg0;
    }
}
