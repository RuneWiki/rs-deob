import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class197 extends class1 {

    @OriginalMember(owner = "client!gg", name = "U", descriptor = "Z")
    public static volatile boolean field3001 = true;

    @OriginalMember(owner = "client!gg", name = "H", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!gg", name = "I", descriptor = "I")
    public static int field2991;

    @OriginalMember(owner = "client!gg", name = "J", descriptor = "I")
    public static int field2992;

    @OriginalMember(owner = "client!gg", name = "K", descriptor = "I")
    public static int field2993;

    @OriginalMember(owner = "client!gg", name = "M", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!gg", name = "N", descriptor = "I")
    public static int field2996;

    @OriginalMember(owner = "client!gg", name = "O", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!gg", name = "P", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!gg", name = "Q", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!gg", name = "S", descriptor = "I")
    public static int field3000;

    @OriginalMember(owner = "client!gg", name = "V", descriptor = "I")
    public static int field3002;

    @OriginalMember(owner = "client!gg", name = "G", descriptor = "Ljl;")
    private class253 field2989;

    @OriginalMember(owner = "client!gg", name = "L", descriptor = "Lpf;")
    public static class294 field2994;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(III)I")
    public final int method1228(int arg0, int arg1, int arg2) {
        field2992++;
        if (this.field2989 == null) {
            return arg1;
        }
        class251 var4 = (class251) this.field2989.method1666((long) arg0, (byte) -118);
        if (var4 == null) {
            return arg1;
        } else if (arg2 > -97) {
            return -61;
        } else {
            return var4.field3822;
        }
    }

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "(B)V")
    public static void method1229(byte arg0) {
        field2994 = null;
        if (arg0 <= 69) {
            method1236((String) null, (byte) -67, (String) null, (String) null);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;")
    public final String method1230(String arg0, int arg1, int arg2) {
        field2993++;
        if (this.field2989 == null) {
            return arg0;
        }
        class130 var4 = (class130) this.field2989.method1666((long) arg1, (byte) -111);
        if (arg2 == 24770) {
            return var4 == null ? arg0 : var4.field1934;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1231(String arg0, int arg1) {
        if (arg1 == 10) {
            field2996++;
            return class243.method1533(10, true, false, arg0);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2991++;
        int var8 = class86.method565(class243.field3635, arg1, class118.field1782, arg7 + 20636);
        int var9 = class86.method565(class243.field3635, arg6, class118.field1782, arg7 ^ 0xFFFFD0FC);
        int var10 = class86.method565(class248.field3765, arg0, class163.field2505, 8142);
        int var11 = class86.method565(class248.field3765, arg5, class163.field2505, 8142);
        int var12 = class86.method565(class243.field3635, arg1 + arg2, class118.field1782, 8142);
        int var13 = class86.method565(class243.field3635, arg6 - arg2, class118.field1782, 8142);
        for (int var14 = var8; var14 < var12; var14++) {
            class64.method429(class23.field284[var14], var10, (byte) 120, arg4, var11);
        }
        if (arg7 != -12494) {
            field2994 = null;
        }
        for (int var15 = var9; var15 > var13; var15--) {
            class64.method429(class23.field284[var15], var10, (byte) 125, arg4, var11);
        }
        int var16 = class86.method565(class248.field3765, arg0 + arg2, class163.field2505, 8142);
        int var17 = class86.method565(class248.field3765, arg5 - arg2, class163.field2505, 8142);
        for (int var18 = var12; var18 <= var13; var18++) {
            int[] var19 = class23.field284[var18];
            class64.method429(var19, var10, (byte) 92, arg4, var16);
            class64.method429(var19, var16, (byte) 115, arg3, var17);
            class64.method429(var19, var17, (byte) 123, arg4, var11);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lpf;I)V")
    public static final void method1233(class294 arg0, int arg1) {
        class242.field3630 = arg0;
        int var2 = -32 % ((arg1 + 70) / 42);
        field2999++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZI)V")
    public static final void method1234(boolean arg0, int arg1) {
        class58.field914 = arg0;
        class236.field3557 = !class266.method1772(97);
        field3002++;
        if (arg1 != 8398) {
            field2994 = null;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lfl;II)V")
    private final void method1235(class248 arg0, int arg1, int arg2) {
        if (arg2 != -29294) {
            field2994 = null;
        }
        if (arg1 == 249) {
            int var4 = arg0.method1593((byte) 27);
            if (this.field2989 == null) {
                int var5 = class214.method1368(-120, var4);
                this.field2989 = new class253(var5);
            }
            for (int var6 = 0; var6 < var4; var6++) {
                boolean var7 = arg0.method1593((byte) 27) == 1;
                int var8 = arg0.method1587(arg2 + 29172);
                class82 var9;
                if (var7) {
                    var9 = new class130(arg0.method1597((byte) -28));
                } else {
                    var9 = new class251(arg0.method1576(-17672));
                }
                this.field2989.method1663((long) var8, var9, -103);
            }
        }
        field3000++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method1236(String arg0, byte arg1, String arg2, String arg3) {
        field2998++;
        for (int var4 = arg2.indexOf(arg0); var4 != -1; var4 = arg2.indexOf(arg0, arg3.length() + var4)) {
            arg2 = arg2.substring(0, var4) + arg3 + arg2.substring(var4 + arg0.length());
        }
        if (arg1 <= 23) {
            method1236((String) null, (byte) 94, (String) null, (String) null);
        }
        return arg2;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILfl;)V")
    public final void method1237(int arg0, class248 arg1) {
        if (arg0 >= -9) {
            this.method1235((class248) null, 64, -125);
        }
        field2990++;
        while (true) {
            int var3 = arg1.method1593((byte) 27);
            if (var3 == 0) {
                return;
            }
            this.method1235(arg1, var3, -29294);
        }
    }
}
