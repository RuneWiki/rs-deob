import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class240 implements class6 {

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "Lj;")
    private class209 field3962 = new class209(256);

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "Leh;")
    private class137 field3955;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "Leh;")
    private class137 field3964;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[Lui;")
    private class81[] field3952;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "Ljava/lang/String;")
    public static String field3950 = " has logged in.";

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "[B")
    public static byte[] field3951 = new byte[520];

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "[I")
    public static int[] field3959 = new int[4096];

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field3948;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field3953;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field3956;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field3957;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field3958;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "I")
    public static int field3960;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field3961;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Leh;")
    public static class137 field3954;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Leh;")
    public static class137 field3963;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(II)Lui;")
    public final class81 method34(int arg0, int arg1) {
        field3948++;
        if (arg0 != 25412) {
            field3959 = null;
        }
        return this.field3952[arg1];
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)Lsa;")
    public class73 method774(int arg0, boolean arg1) {
        if (arg1) {
            method1688((byte) -97);
        }
        field3949++;
        class88 var3 = this.field3962.method1469(8288, (long) arg0);
        if (var3 != null) {
            return (class73) var3;
        }
        byte[] var4 = this.field3955.method935(arg0, 104);
        if (var4 == null) {
            return null;
        } else {
            class73 var5 = new class73(new class96(var4));
            this.field3962.method1467((byte) -119, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(II)Z")
    public final boolean method36(int arg0, int arg1) {
        field3960++;
        if (arg0 != 520) {
            field3957 = 9;
        }
        class73 var3 = this.method774(arg1, false);
        return var3 != null && var3.method410(this, this.field3964, arg0 - 520);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)V")
    public static void method1687(byte arg0) {
        field3959 = null;
        if (arg0 >= -60) {
            method1687((byte) 42);
        }
        field3963 = null;
        field3954 = null;
        field3950 = null;
        field3951 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public static final void method1688(byte arg0) {
        if (arg0 < 83) {
            return;
        }
        field3953++;
        class182 var1 = class118.field1671;
        synchronized (class118.field1671) {
            class147.field2312++;
            class157.field2533 = class242.field3985;
            if (class275.field4389 < 0) {
                for (int var2 = 0; var2 < 112; var2++) {
                    class36.field467[var2] = false;
                }
                class275.field4389 = class252.field4113;
            } else {
                while (class275.field4389 != class252.field4113) {
                    int var3 = class88.field1092[class252.field4113];
                    class252.field4113 = class252.field4113 + 1 & 0x7F;
                    if (var3 >= 0) {
                        class36.field467[var3] = true;
                    } else {
                        class36.field467[~var3] = false;
                    }
                }
            }
            class242.field3985 = class157.field2532;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIIZF)[I")
    public final int[] method35(int arg0, int arg1, int arg2, int arg3, boolean arg4, float arg5) {
        field3961++;
        return arg0 < 47 ? null : this.method774(arg1, false).method411(arg3, this.field3952[arg1].field1001, this.field3964, this, arg2, arg4, (double) arg5, 122);
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Leh;Leh;Leh;)V")
    public class240(class137 arg0, class137 arg1, class137 arg2) {
        this.field3955 = arg1;
        this.field3964 = arg2;
        class96 var4 = new class96(arg0.method928(0, (byte) 112, 0));
        int var5 = var4.method549(255);
        this.field3952 = new class81[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method584(255) == 1) {
                this.field3952[var6] = new class81();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3952[var7] != null) {
                this.field3952[var7].field1003 = var4.method584(255) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3952[var8] != null) {
                this.field3952[var8].field1002 = var4.method584(255) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3952[var9] != null) {
                this.field3952[var9].field1005 = var4.method584(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3952[var10] != null) {
                var4.method584(255);
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3952[var11] != null) {
                var4.method587(-1);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3952[var12] != null) {
                var4.method587(124);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3952[var13] != null) {
                var4.method587(36);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3952[var14] != null) {
                var4.method587(123);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3952[var15] != null) {
                this.field3952[var15].field1006 = (short) var4.method549(255);
            }
        }
        if (var4.field1218.length > var4.field1228) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field3952[var16] != null) {
                    var4.method587(118);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field3952[var17] != null) {
                    var4.method587(-61);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field3952[var18] != null) {
                    var4.method584(255);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field3952[var19] != null) {
                    this.field3952[var19].field1001 = var4.method584(255) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field3952[var20] != null) {
                    var4.method587(124);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field3952[var21] != null) {
                    var4.method584(255);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field3952[var22] != null) {
                    var4.method584(255);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field3952[var23] != null) {
                    var4.method584(255);
                }
            }
        }
    }
}
