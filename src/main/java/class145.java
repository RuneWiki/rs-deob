import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public abstract class class145 {

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "[S")
    public static short[] field2292 = new short[] { 32, 10, 42, 33, 2, 21, 30, 23 };

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "I")
    public static int field2293 = 0;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "Z")
    public static boolean field2294 = false;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2289;

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method999(Component arg0, byte arg1);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lji;IIIIIIZ)V")
    public static final void method1012(class154 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field2408.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var22 = arg0.field2408[var9] - class100.field1626;
            int var23 = arg0.field2394[var9] - class241.field3841;
            int var24 = arg0.field2404[var9] - class238.field3823;
            int var25 = arg3 * var24 + arg4 * var22 >> 16;
            int var26 = arg4 * var24 - arg3 * var22 >> 16;
            int var28 = arg2 * var23 - arg1 * var26 >> 16;
            int var29 = arg1 * var23 + arg2 * var26 >> 16;
            if (var29 < 50) {
                return;
            }
            if (arg0.field2409 != null) {
                class154.field2410[var9] = var25;
                class154.field2407[var9] = var28;
                class154.field2401[var9] = var29;
            }
            class154.field2398[var9] = (var25 << 9) / var29 + class302.field4825;
            class154.field2403[var9] = (var28 << 9) / var29 + class302.field4835;
        }
        class302.field4832 = 0;
        int var10 = arg0.field2400.length;
        for (int var11 = 0; var11 < var10; var11++) {
            int var12 = arg0.field2400[var11];
            int var13 = arg0.field2395[var11];
            int var14 = arg0.field2406[var11];
            int var15 = class154.field2398[var12];
            int var16 = class154.field2398[var13];
            int var17 = class154.field2398[var14];
            int var18 = class154.field2403[var12];
            int var19 = class154.field2403[var13];
            int var20 = class154.field2403[var14];
            if ((var15 - var16) * (var20 - var19) - (var17 - var16) * (var18 - var19) > 0) {
                if (class148.field2313 && class214.method1488(class302.field4825 + class237.field3808, class302.field4835 + class214.field3539, var18, var19, var20, var15, var16, var17)) {
                    class272.field4364 = arg5;
                    class298.field4746 = arg6;
                }
                if (!arg7) {
                    class302.field4831 = false;
                    if (var15 < 0 || var16 < 0 || var17 < 0 || var15 > class302.field4834 || var16 > class302.field4834 || var17 > class302.field4834) {
                        class302.field4831 = true;
                    }
                    if (arg0.field2409 == null || arg0.field2409[var11] == -1) {
                        if (arg0.field2399[var11] != 12345678) {
                            class302.method1997(var18, var19, var20, var15, var16, var17, arg0.field2399[var11], arg0.field2402[var11], arg0.field2396[var11]);
                        }
                    } else if (!class262.field4210) {
                        int var21 = class302.field4828.method113(arg0.field2409[var11], (byte) -112);
                        class302.method1997(var18, var19, var20, var15, var16, var17, class23.method131(var21, arg0.field2399[var11]), class23.method131(var21, arg0.field2402[var11]), class23.method131(var21, arg0.field2396[var11]));
                    } else if (arg0.field2391) {
                        class302.method2006(var18, var19, var20, var15, var16, var17, arg0.field2399[var11], arg0.field2402[var11], arg0.field2396[var11], class154.field2410[0], class154.field2410[1], class154.field2410[3], class154.field2407[0], class154.field2407[1], class154.field2407[3], class154.field2401[0], class154.field2401[1], class154.field2401[3], arg0.field2409[var11]);
                    } else {
                        class302.method2006(var18, var19, var20, var15, var16, var17, arg0.field2399[var11], arg0.field2402[var11], arg0.field2396[var11], class154.field2410[var12], class154.field2410[var13], class154.field2410[var14], class154.field2407[var12], class154.field2407[var13], class154.field2407[var14], class154.field2401[var12], class154.field2401[var13], class154.field2401[var14], arg0.field2409[var11]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(BLjava/lang/String;ILjava/lang/String;)I")
    public static final int method1013(byte arg0, String arg1, int arg2, String arg3) {
        field2291++;
        int var4 = arg1.length();
        int var5 = arg3.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while ((var7 - var8) < var4 || var6 - var9 < var5) {
            if (var7 - var8 >= var4) {
                return -1;
            }
            if (var6 - var9 >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg1.charAt(var7++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg3.charAt(var6++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class23.method129(true, var22);
            var9 = class23.method129(true, var24);
            char var26 = class182.method1318(arg2, var22, arg0 - 30);
            char var27 = class182.method1318(arg2, var24, 96);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class66.method462(arg2, (byte) 94, var28) - class66.method462(arg2, (byte) 94, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        if (arg0 != -88) {
            return 108;
        }
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var17 = var4 - var11 - 1;
                var16 = var5 - (var11 + 1);
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg1.charAt(var17);
            char var19 = arg3.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class66.method462(arg2, (byte) 94, var20) - class66.method462(arg2, (byte) 94, var21);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg1.charAt(var13);
            char var15 = arg3.charAt(var13);
            if (var14 != var15) {
                return class66.method462(arg2, (byte) 94, var14) - class66.method462(arg2, (byte) 94, var15);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method1000(Component arg0, byte arg1);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
    public abstract int method998(byte arg0);

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public static final void method1014(int arg0) {
        int var1 = 0;
        if (arg0 != 0) {
            field2292 = null;
        }
        while (var1 < 100) {
            class73.field1227[var1] = true;
            var1++;
        }
        field2290++;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V")
    public static void method1015(int arg0) {
        field2292 = null;
        if (arg0 != 0) {
            method1014(-64);
        }
        field2289 = null;
    }
}
