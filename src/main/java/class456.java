import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class456 extends class107 {

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "Lri;")
    public static class73 field6748 = new class73(80, -1);

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public static int field6743;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "I")
    public static int field6744;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field6746;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field6747;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "I")
    public static int field6751;

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "I")
    public static int field6753;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "Lic;")
    public static class491 field6749;

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "Ljt;")
    public static class67 field6745;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "[I")
    public static int[] field6752;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILdh;)Ldp;")
    public static final class3 method2736(int arg0, class209 arg1) {
        ++field6746;
        class3 var2 = new class3();
        if (arg0 != 499) {
            method2736(-106, (class209) null);
        }
        var2.field37 = arg1.method1450((byte) 116);
        var2.field39 = class169.field2507.method2821((byte) 42, var2.field37);
        return var2;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIII)V")
    public final void method657(int arg0, int arg1, int arg2, int arg3) {
        super.field1541 = arg2;
        super.field1542 = arg3;
        ++field6751;
        super.field1537 = arg1;
        int var5 = 2 / ((arg0 - 64) / 62);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IJ)V")
    public static final void method2737(int arg0, long arg1) {
        ++field6743;
        int var3 = class52.field817 + class500.field7365.field1763;
        int var4 = class339.field4777 + class500.field7365.field1769;
        if (~(-var3 + class48.field774) > 499 || class48.field774 - var3 > 500 || -var4 + class366.field5598 < -500 || ~(-var4 + class366.field5598) < -501) {
            class366.field5598 = var4;
            class48.field774 = var3;
        }
        if (~class48.field774 != ~var3) {
            int var5 = var3 - class48.field774;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 > 0) {
                if (~var6 == -1) {
                    var6 = 1;
                } else if (var5 < var6) {
                    var6 = var5;
                }
            } else if (~var6 == -1) {
                var6 = -1;
            } else if (~var5 < ~var6) {
                var6 = var5;
            }
            class48.field774 += var6;
        }
        if (class366.field5598 != var4) {
            int var7 = -class366.field5598 + var4;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (~var7 >= -1) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (~var8 > ~var7) {
                    var8 = var7;
                }
            } else if (var8 != 0) {
                if (var8 > var7) {
                    var8 = var7;
                }
            } else {
                var8 = 1;
            }
            class366.field5598 += var8;
        }
        if (!class426.field6401.field1013) {
            class24.field262 += (float) arg1 * class244.field3608 / 6.0F;
            class382.field5792 += (float) arg1 * class450.field6707 / 6.0F;
        }
        class11.method75(arg0 + -110);
        if (arg0 != -1) {
            field6752 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZLmv;)V")
    public static final void method2738(int arg0, boolean arg1, class252 arg2) {
        ++field6747;
        class310.field4450 = 0;
        class205.field2949 = false;
        if (!arg1) {
            field6752 = null;
        }
        class192.method1302(arg2, -23000);
        class129.method844(arg2, (byte) -121);
        if (class205.field2949) {
            System.out.println("---endgpp---");
        }
        if (arg2.field3037 != arg0) {
            throw new RuntimeException("gpi1 pos:" + arg2.field3037 + " psize:" + arg0);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2739(byte arg0, String arg1) {
        ++field6750;
        int var2 = 40 % ((65 - arg0) / 51);
        return arg1.length() + 1;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(FB)V")
    public final void method659(float arg0, byte arg1) {
        if (arg1 != -9) {
            field6752 = null;
        }
        ++field6753;
        super.field1534 = arg0;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(IIIIIF)V")
    public class456(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "(I)V")
    public static void method2740(int arg0) {
        field6745 = null;
        if (arg0 != -1) {
            method2737(-79, -47L);
        }
        field6748 = null;
        field6752 = null;
        field6749 = null;
    }
}
