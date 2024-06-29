import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class532 {

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "Z")
    public static boolean field7386 = false;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "Ljv;")
    public static class81 field7387 = new class81();

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public static int field7382;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public static int field7389;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "J")
    public static long field7384;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method3054(int arg0, String arg1) {
        field7383++;
        if (arg0 != 1453887525) {
            method3057(-89);
        }
        int var2 = arg1.length();
        int var3 = 0;
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = (var3 << 5) + class518.method3007(true, arg1.charAt(var4)) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IZI)Z")
    public static final boolean method3055(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method3056(96, -18L);
        }
        field7385++;
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method3056(int arg0, long arg1) {
        field7382++;
        if (arg1 <= 0L || arg1 >= 6582952005840035281L) {
            return null;
        } else if ((arg1 % 37L) == 0L) {
            return null;
        } else {
            int var3 = 0;
            long var4 = arg1;
            while (var4 != 0L) {
                var4 /= 37L;
                var3++;
            }
            if (arg0 != 3) {
                field7387 = null;
            }
            StringBuffer var6 = new StringBuffer(var3);
            while (arg1 != 0L) {
                long var7 = arg1;
                arg1 /= 37L;
                var6.append(class751.field10495[(int) (var7 - arg1 * 37L)]);
            }
            return var6.reverse().toString();
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public static final void method3057(int arg0) {
        class590.field8272 = null;
        class209.field2764 = null;
        class744.field10371 = null;
        class724.field10107 = null;
        field7381++;
        class402.field5098 = null;
        if (arg0 == -18788) {
            class180.field2524 = null;
            class584.field8170 = null;
            class120.field1751 = null;
            class450.field5958 = null;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Z)I")
    public static final int method3058(boolean arg0) {
        if (arg0) {
            method3056(-13, -126L);
        }
        field7389++;
        if (class617.field8508 == null) {
            if (!class14.field276 && class438.field5836 != null) {
                return class438.field5836.field3477;
            }
            int var1 = class680.field9495.method1118((byte) 127);
            int var2 = class680.field9495.method1115(4);
            if (class517.field7240) {
                if (var1 > class652.field9070 && var1 < (class91.field1249 + class652.field9070)) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class512.field7203; var11++) {
                        if (class697.field9709) {
                            int var15 = class648.field8969 - (-var11 * 16 - 33);
                            if (var2 > (var15 - 13) && (var15 + 3) >= var2) {
                                var10 = var11;
                            }
                        } else {
                            int var16 = var11 * 16 + class648.field8969 + 31;
                            if (var2 > var16 - 13 && var16 + 3 >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class414 var13 = new class414(class330.field4215);
                        for (class184 var14 = (class184) var13.method2323((byte) -75); var14 != null; var14 = (class184) var13.method2324(0)) {
                            if (var12++ == var10) {
                                return ((class277) var14.field2556.field313.field8921).field3477;
                            }
                        }
                    }
                } else if (class717.field9982 != null && class175.field2455 < var1 && class175.field2455 + class161.field2218 > var1) {
                    int var17 = -1;
                    for (int var18 = 0; var18 < class717.field9982.field2555; var18++) {
                        if (class697.field9709) {
                            int var22 = var18 * 16 + class454.field6068 + 33;
                            if (var22 - 13 < var2 && var2 <= var22 + 3) {
                                var17 = var18;
                            }
                        } else {
                            int var23 = var18 * 16 + class454.field6068 + 31;
                            if (var2 > var23 - 13 && var2 <= var23 + 3) {
                                var17 = var18;
                            }
                        }
                    }
                    if (var17 != -1) {
                        int var19 = 0;
                        class414 var20 = new class414(class717.field9982.field2556);
                        for (class277 var21 = (class277) var20.method2323((byte) -93); var21 != null; var21 = (class277) var20.method2324(0)) {
                            if (var17 == var19++) {
                                return var21.field3477;
                            }
                        }
                    }
                }
            } else if (var1 > class652.field9070 && var1 < class91.field1249 + class652.field9070) {
                int var3 = -1;
                for (int var4 = 0; var4 < class159.field2181; var4++) {
                    if (class697.field9709) {
                        int var9 = class648.field8969 + ((-var4 + -1 + class159.field2181) * 16) + 33;
                        if (var9 - 13 < var2 && (var9 + 3) >= var2) {
                            var3 = var4;
                        }
                    } else {
                        int var8 = (class159.field2181 - var4 - 1) * 16 + class648.field8969 + 31;
                        if (var2 > var8 - 13 && var8 + 3 >= var2) {
                            var3 = var4;
                        }
                    }
                }
                if (var3 != -1) {
                    int var5 = 0;
                    class593 var6 = new class593(class343.field4334);
                    for (class277 var7 = (class277) var6.method3363(-128); var7 != null; var7 = (class277) var6.method3360(false)) {
                        if (var3 == (var5++)) {
                            return var7.field3477;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "(I)V")
    public static void method3059(int arg0) {
        field7387 = null;
        if (arg0 >= -36) {
            field7386 = false;
        }
    }
}
