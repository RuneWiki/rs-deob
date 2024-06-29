import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class320 extends class252 {

    @OriginalMember(owner = "client!si", name = "v", descriptor = "I")
    private int field4284;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    private int field4274;

    @OriginalMember(owner = "client!si", name = "o", descriptor = "I")
    private int field4277;

    @OriginalMember(owner = "client!si", name = "w", descriptor = "I")
    private int field4285;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[I")
    public static int[] field4275 = new int[32];

    @OriginalMember(owner = "client!si", name = "t", descriptor = "Z")
    public static boolean field4282 = false;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "Lu;")
    public static class185 field4273 = class89.method489(32);

    @OriginalMember(owner = "client!si", name = "x", descriptor = "Ljava/lang/String;")
    public static String field4286 = "Choose Option";

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field4271;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field4272;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field4278;

    @OriginalMember(owner = "client!si", name = "q", descriptor = "I")
    public static int field4279;

    @OriginalMember(owner = "client!si", name = "r", descriptor = "I")
    public static int field4280;

    @OriginalMember(owner = "client!si", name = "s", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!si", name = "u", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIIIIIII)V", line = 3)
    public static final void method1844(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4281;
        int var8 = class104.method556(class335.field4462, 2048, arg3, class6.field42);
        int var9 = class104.method556(class335.field4462, 2048, arg2, class6.field42);
        int var10 = class104.method556(class322.field4306, 2048, arg5, class310.field4183);
        int var11 = class104.method556(class322.field4306, 2048, arg0, class310.field4183);
        if (arg7 > -50) {
            method1846(-44, -109);
        }
        int var12 = class104.method556(class335.field4462, 2048, arg3 + arg4, class6.field42);
        int var13 = class104.method556(class335.field4462, 2048, arg2 - arg4, class6.field42);
        for (int var14 = var8; var12 > var14; ++var14) {
            class296.method1740(var10, class153.field1932[var14], (byte) 81, arg1, var11);
        }
        for (int var15 = var9; ~var13 > ~var15; --var15) {
            class296.method1740(var10, class153.field1932[var15], (byte) 81, arg1, var11);
        }
        int var16 = class104.method556(class322.field4306, 2048, arg5 - -arg4, class310.field4183);
        int var17 = class104.method556(class322.field4306, 2048, arg0 - arg4, class310.field4183);
        for (int var18 = var12; ~var18 >= ~var13; ++var18) {
            int[] var19 = class153.field1932[var18];
            class296.method1740(var10, var19, (byte) 81, arg1, var16);
            class296.method1740(var16, var19, (byte) 81, arg6, var17);
            class296.method1740(var17, var19, (byte) 81, arg1, var11);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZII)V", line = 62)
    public final void method380(boolean arg0, int arg1, int arg2) {
        ++field4271;
        int var4 = this.field4274 * arg2 >> 12;
        int var5 = this.field4277 * arg2 >> 12;
        int var6 = this.field4285 * arg1 >> 12;
        int var7 = this.field4284 * arg1 >> 12;
        if (arg0) {
            class176.method930(super.field3447, var7, var4, var5, var6, false);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 82)
    public static void method1845(int arg0) {
        field4286 = null;
        field4273 = null;
        if (arg0 <= -41) {
            field4275 = null;
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(III)V", line = 94)
    public final void method377(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method1846(-69, 90);
        }
        ++field4272;
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "(IIIIII)V", line = 107)
    public class320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field4284 = arg3;
        this.field4274 = arg0;
        this.field4277 = arg2;
        this.field4285 = arg1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V", line = 124)
    public static final void method1846(int arg0, int arg1) {
        class307 var2 = null;
        for (int var3 = arg0; var3 < arg1; ++var3) {
            class54 var4 = class272.field3682[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class209.field2840; ++var5) {
                    for (int var6 = 0; var6 < class231.field3184; ++var6) {
                        var2 = var4.method274(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << 7;
                            int var8 = var5 << 7;
                            for (int var9 = var3 - 1; var9 >= 0; --var9) {
                                class54 var10 = class272.field3682[var9];
                                if (var10 != null) {
                                    int var11 = var4.method271(var6, var5) - var10.method271(var6, var5);
                                    int var12 = var4.method271(var6 + 1, var5) - var10.method271(var6 + 1, var5);
                                    int var13 = var4.method271(var6 + 1, var5 + 1) - var10.method271(var6 + 1, var5 + 1);
                                    int var14 = var4.method271(var6, var5 + 1) - var10.method271(var6, var5 + 1);
                                    var10.method266(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lam;Lam;ZB)V", line = 188)
    public static final void method1847(class286 arg0, class286 arg1, boolean arg2, byte arg3) {
        class169.field2131 = arg2;
        ++field4283;
        class38.field390 = arg0;
        int var4 = 18 / ((42 - arg3) / 60);
        class229.field3161 = arg1;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(ZILlb;III)V", line = 204)
    public static final void method1848(boolean arg0, int arg1, class208 arg2, int arg3, int arg4, int arg5) {
        ++field4278;
        if (~class119.field1487 > -51) {
            if (arg2 != null && arg2.field2826 != null && ~arg3 > ~arg2.field2826.length && arg2.field2826[arg3] != null) {
                int var6 = arg2.field2826[arg3][0];
                int var7 = var6 >> 8;
                int var8 = 7 & var6 >> 5;
                int var9 = var6 & 31;
                if (~arg2.field2826[arg3].length < -2) {
                    int var10 = (int) (Math.random() * (double) arg2.field2826[arg3].length);
                    if (var10 > 0) {
                        var7 = arg2.field2826[arg3][var10];
                    }
                }
                if (~var9 == -1) {
                    if (arg0) {
                        class166.method884(var7, 0, -109, 255, var8);
                    }
                } else if (~class295.field4002 != -1) {
                    class195.field2633[class119.field1487] = var7;
                    class289.field3935[class119.field1487] = var8;
                    class208.field2836[class119.field1487] = 0;
                    class438.field6421[class119.field1487] = null;
                    class312.field4196[class119.field1487] = 255;
                    int var11 = 48 / ((-3 - arg1) / 60);
                    int var12 = (arg4 + -64) / 128;
                    int var13 = (arg5 - 64) / 128;
                    class344.field4619[class119.field1487] = (var12 << 16) - -(var13 << 8) + var9;
                    ++class119.field1487;
                }
            }
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(III)V", line = 265)
    public final void method378(int arg0, int arg1, int arg2) {
        ++field4280;
        if (arg0 != 16136) {
            this.field4277 = -45;
        }
    }
}
