import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class308 {

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public int field4955 = -1;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public int field4965 = -1;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public int field4962 = 0;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Z")
    public boolean field4961 = true;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field4956 = -1;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Ljava/lang/String;")
    public static String field4964 = " has logged in.";

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "[I")
    public static int[] field4957 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field4963 = 1;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "Z")
    public static boolean field4959 = false;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field4958;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field4967;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "I")
    public static int field4970;

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Llf;")
    public static class94 field4968;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lhc;III)V")
    private final void method2084(class53 arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 2) {
            return;
        }
        field4967++;
        if (arg3 == 1) {
            this.field4962 = class270.method1871(true, arg0.method362(-4));
        } else if (arg3 == 2) {
            this.field4955 = arg0.method366(-16505);
        } else if (arg3 == 3) {
            this.field4955 = arg0.method331(-51);
            if (this.field4955 == 65535) {
                this.field4955 = -1;
                return;
            }
        } else if (arg3 == 5) {
            this.field4961 = false;
        } else if (arg3 == 7) {
            this.field4965 = class270.method1871(true, arg0.method362(-4));
            return;
        } else if (arg3 == 8) {
            class160.field2484 = arg2;
            return;
        } else if (arg3 == 9) {
            arg0.method331(-42);
            return;
        } else if (arg3 != 10) {
            if (arg3 == 11) {
                arg0.method366(-16505);
                return;
            }
            if (arg3 != 12) {
                if (arg3 == 13) {
                    arg0.method362(-4);
                    return;
                }
                if (arg3 == 14) {
                    arg0.method366(-16505);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)V")
    public static void method2085(boolean arg0) {
        field4964 = null;
        field4968 = null;
        field4957 = null;
        if (arg0) {
            method2086(117, -119, -116, -73, 43, 82, -25, 21);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2086(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4971++;
        if (arg7 < 128 || arg0 < 128 || arg7 > 13056 || arg0 > 13056) {
            class147.field2354 = -1;
            class8.field94 = -1;
            return;
        }
        int var8 = class113.method851(class37.field474, -101, arg0, arg7) - arg4;
        int var9 = class244.field3590[class115.field1906];
        int var10 = arg0 - class260.field4024;
        int var11 = class244.field3592[class115.field1906];
        int var12 = var8 - class226.field3324;
        int var13 = arg7 - class93.field1533;
        int var14 = class244.field3592[class268.field4303];
        if (arg1 != -15) {
            method2088(52);
        }
        int var15 = class244.field3590[class268.field4303];
        int var16 = var10 * var15 + var13 * var14 >> 16;
        int var17 = var10 * var14 - (var13 * var15) >> 16;
        int var19 = var11 * var12 - (var9 * var17) >> 16;
        int var20 = var9 * var12 + var11 * var17 >> 16;
        if (var20 < 50) {
            class8.field94 = -1;
            class147.field2354 = -1;
        } else {
            class147.field2354 = (var19 << 9) / var20 + arg2;
            class8.field94 = (var16 << 9) / var20 + arg3;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IILhc;)V")
    public final void method2087(int arg0, int arg1, class53 arg2) {
        field4958++;
        while (true) {
            int var4 = arg2.method366(-16505);
            if (var4 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    method2085(true);
                    return;
                }
            }
            this.method2084(arg2, 2, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static final void method2088(int arg0) {
        field4970++;
        if (!class6.field57) {
            return;
        }
        class263 var1 = class34.method219(class295.field4741, arg0 + 31, class309.field4981);
        if (var1 != null && var1.field4176 != null) {
            class234 var2 = new class234();
            var2.field3419 = var1.field4176;
            var2.field3423 = var1;
            class224.method1557((byte) 103, var2);
        }
        class212.field3119 = arg0;
        class6.field57 = false;
        class63.method476(var1, 14105);
    }
}
