import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class308 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "[I")
    public static int[] field4796 = new int[256];

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field4800 = 0;

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[S")
    public static short[] field4802 = new short[256];

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field4794;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field4797;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field4798;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field4799;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field4801;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;I)I", line = 9)
    public static final int method2128(String arg0, int arg1, String arg2, int arg3) {
        field4795++;
        int var4 = arg0.length();
        int var5 = arg2.length();
        int var6 = 0;
        int var7 = arg1;
        char var8 = 0;
        char var9 = 0;
        while ((var6 - var9) < var4 || var7 - var8 < var5) {
            if ((var6 - var9) >= var4) {
                return -1;
            }
            if (var5 <= var7 - var8) {
                return 1;
            }
            char var22;
            if (var9 == '\u0000') {
                var22 = arg0.charAt(var6++);
            } else {
                var22 = var9;
                boolean var23 = false;
            }
            char var24;
            if (var8 == '\u0000') {
                var24 = arg2.charAt(var7++);
            } else {
                var24 = var8;
                boolean var25 = false;
            }
            var9 = class159.method1153(198, var22);
            var8 = class159.method1153(198, var24);
            char var26 = class37.method315((byte) -82, arg3, var22);
            char var27 = class37.method315((byte) 120, arg3, var24);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class47.method361(arg3, (byte) 127, var28) - class47.method361(arg3, (byte) 127, var29);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var12;
            int var13;
            if (arg3 == 2) {
                var12 = var5 - var11 - 1;
                var13 = var4 - var11 - 1;
            } else {
                var12 = var11;
                var13 = var11;
            }
            char var14 = arg0.charAt(var13);
            char var15 = arg2.charAt(var12);
            if (var14 != var15 && Character.toUpperCase(var14) != Character.toUpperCase(var15)) {
                char var16 = Character.toLowerCase(var14);
                char var17 = Character.toLowerCase(var15);
                if (var16 != var17) {
                    return class47.method361(arg3, (byte) 125, var16) - class47.method361(arg3, (byte) 125, var17);
                }
            }
        }
        int var18 = var4 - var5;
        if (var18 != 0) {
            return var18;
        }
        for (int var19 = 0; var19 < var10; var19++) {
            char var20 = arg0.charAt(var19);
            char var21 = arg2.charAt(var19);
            if (var20 != var21) {
                return class47.method361(arg3, (byte) 125, var20) - class47.method361(arg3, (byte) 127, var21);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 129)
    public static void method2129(int arg0) {
        field4796 = null;
        if (arg0 == -1) {
            field4802 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lwa;BLwa;)V", line = 144)
    public static final void method2130(class279 arg0, byte arg1, class279 arg2) {
        if (arg2.field4295 != null) {
            arg2.method1960(arg1 - 27730);
        }
        arg2.field4295 = arg0;
        arg2.field4299 = arg0.field4299;
        arg2.field4295.field4299 = arg2;
        field4798++;
        if (arg1 == 109) {
            arg2.field4299.field4295 = arg2;
        }
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 163)
    public static final void method2131(int arg0) {
        for (int var1 = arg0; var1 < class79.field1083; var1++) {
            int var2 = class85.field1157[var1];
            class212 var3 = class59.field870[var2];
            if (var3 != null) {
                class224.method1639((byte) 112, var3.field3346.field2555, var3);
            }
        }
        field4797++;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZBIII)V", line = 185)
    public static final void method2132(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        field4801++;
        class225.field3569 = 0L;
        int var5 = class113.method800((byte) -72);
        if (arg1 != 13) {
            method2128((String) null, 118, (String) null, 63);
        }
        if (arg2 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class137.field2193.startsWith("mac") && arg2 > 0) {
            arg0 = true;
        }
        boolean var6 = false;
        if (arg2 > 0 != var5 > 0) {
            var6 = true;
        }
        if (arg0 && arg2 > 0) {
            var6 = true;
        }
        class315.method2194(-1, var6, arg4, arg2, arg0, var5, arg3);
    }
}
