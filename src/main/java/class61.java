import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tt")
public class class61 extends class243 {

    @OriginalMember(owner = "client!tt", name = "l", descriptor = "I")
    public int field755 = -1;

    @OriginalMember(owner = "client!tt", name = "t", descriptor = "Z")
    public static boolean field763 = false;

    @OriginalMember(owner = "client!tt", name = "r", descriptor = "Lwj;")
    public static class270 field761 = new class270(98, 2);

    @OriginalMember(owner = "client!tt", name = "m", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!tt", name = "n", descriptor = "I")
    public static int field757;

    @OriginalMember(owner = "client!tt", name = "p", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!tt", name = "q", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!tt", name = "u", descriptor = "Lom;")
    public static class252 field764;

    @OriginalMember(owner = "client!tt", name = "o", descriptor = "Ljava/lang/String;")
    public String field758;

    @OriginalMember(owner = "client!tt", name = "s", descriptor = "Ljava/lang/String;")
    public String field762;

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(III)Z", line = 6)
    public static final boolean method501(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class405.field5948; ++var3) {
            class310 var4 = class59.field718[var3];
            if (var4.field4224 == 1) {
                int var5 = var4.field4211 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4230 * var5 >> 8) + var4.field4216;
                    int var7 = (var4.field4220 * var5 >> 8) + var4.field4233;
                    int var8 = (var4.field4219 * var5 >> 8) + var4.field4227;
                    int var9 = (var4.field4215 * var5 >> 8) + var4.field4213;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4224 == 2) {
                int var10 = arg0 - var4.field4211;
                if (var10 > 0) {
                    int var11 = (var4.field4230 * var10 >> 8) + var4.field4216;
                    int var12 = (var4.field4220 * var10 >> 8) + var4.field4233;
                    int var13 = (var4.field4219 * var10 >> 8) + var4.field4227;
                    int var14 = (var4.field4215 * var10 >> 8) + var4.field4213;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4224 == 3) {
                int var15 = var4.field4216 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4212 * var15 >> 8) + var4.field4211;
                    int var17 = (var4.field4235 * var15 >> 8) + var4.field4232;
                    int var18 = (var4.field4219 * var15 >> 8) + var4.field4227;
                    int var19 = (var4.field4215 * var15 >> 8) + var4.field4213;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4224 == 4) {
                int var20 = arg2 - var4.field4216;
                if (var20 > 0) {
                    int var21 = (var4.field4212 * var20 >> 8) + var4.field4211;
                    int var22 = (var4.field4235 * var20 >> 8) + var4.field4232;
                    int var23 = (var4.field4219 * var20 >> 8) + var4.field4227;
                    int var24 = (var4.field4215 * var20 >> 8) + var4.field4213;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4224 == 5) {
                int var25 = arg1 - var4.field4227;
                if (var25 > 0) {
                    int var26 = (var4.field4212 * var25 >> 8) + var4.field4211;
                    int var27 = (var4.field4235 * var25 >> 8) + var4.field4232;
                    int var28 = (var4.field4230 * var25 >> 8) + var4.field4216;
                    int var29 = (var4.field4220 * var25 >> 8) + var4.field4233;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(III)Lvr;", line = 132)
    public static final class90 method502(int arg0, int arg1, int arg2) {
        class486 var3 = class89.field1305[arg0][arg1][arg2];
        return var3 == null ? null : var3.field7118;
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lef;I)V", line = 141)
    public static final void method503(class338 arg0, int arg1) {
        ++field756;
        if (class440.field6508 == null) {
            class480 var2 = new class480();
            byte[] var3 = var2.method2822(16, 128, 128, arg1 + 111);
            class440.field6508 = class407.method2439((byte) 99, false, var3);
        }
        if (class467.field6841 == null) {
            class129 var4 = new class129();
            byte[] var5 = var4.method891(128, -86, 128, 16);
            class467.field6841 = class407.method2439((byte) 116, false, var5);
        }
        if (arg1 == 16) {
            class19 var6 = arg0.field4748;
            if (var6.method116((byte) -96) && class143.field2056 == null) {
                byte[] var7 = class233.method1438(new class78(419684), 128, 0.5F, 4.0F, 16, 8, arg1 ^ 23547, 4.0F, 128, 16.0F, 0.6F);
                class143.field2056 = class407.method2439((byte) 90, false, var7);
            }
        }
    }

    @OriginalMember(owner = "client!tt", name = "c", descriptor = "(I)Ltk;", line = 179)
    public final class229 method504(int arg0) {
        ++field759;
        if (arg0 != 24857) {
            method501(-72, -25, -15);
        }
        return class296.field4077[super.field3397];
    }

    @OriginalMember(owner = "client!tt", name = "b", descriptor = "(Z)V", line = 191)
    public static void method505(boolean arg0) {
        field761 = null;
        field764 = null;
        if (arg0) {
            field764 = null;
        }
    }

    @OriginalMember(owner = "client!tt", name = "a", descriptor = "(Lsk;I)V", line = 210)
    public static final void method506(class438 arg0, int arg1) {
        ++field757;
        class365 var2 = (class365) class315.field4315.method1492((long) arg0.field1035, 6340);
        if (var2 != null) {
            if (var2.field5356 != null) {
                class361.field5267.method582(var2.field5356);
                var2.field5356 = null;
            }
            var2.method1565(0);
        }
        if (arg1 != 16) {
            method501(34, 57, -95);
        }
    }
}
