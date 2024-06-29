import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class329 {

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public int field5150;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public int field5148;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public int field5153;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public int field5147;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field5152 = null;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5154 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "[I")
    public static int[] field5151;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "()V", line = 8)
    public static final void method2304() {
        for (int var0 = 0; var0 < class277.field4269; var0++) {
            class263 var1 = class125.field1815[var0];
            class326.method2290(var1);
            class125.field1815[var0] = null;
        }
        class277.field4269 = 0;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "()V", line = 27)
    public class329() {
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 34)
    public static void method2305(int arg0) {
        field5154 = null;
        if (arg0 > -91) {
            method2305(75);
        }
        field5152 = null;
        field5151 = null;
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Lrl;)V", line = 45)
    public class329(class329 arg0) {
        this.field5150 = arg0.field5150;
        this.field5148 = arg0.field5148;
        this.field5153 = arg0.field5153;
        this.field5147 = arg0.field5147;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIZIIZII)V", line = 57)
    public static final void method2306(int arg0, int arg1, boolean arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field5149++;
        if (!arg5 && class78.field1052 == arg6 && class257.field4057 == arg7 && class130.field1925 == arg1 || class154.method1119((byte) 16)) {
            return;
        }
        class257.field4057 = arg7;
        class78.field1052 = arg6;
        class130.field1925 = arg1;
        if (class154.method1119((byte) 16)) {
            class130.field1925 = 0;
        }
        if (arg2) {
            class68.method538(-97, 28);
        } else {
            class68.method538(-120, 25);
        }
        class36.method312((byte) 107, true, class126.field1819);
        int var8 = class326.field5108;
        class326.field5108 = arg6 * 8 - 48;
        int var9 = class198.field3168;
        class198.field3168 = (arg7 - 6) * 8;
        class48.field630 = class133.method978(class257.field4057 * 8, class78.field1052 * 8, (byte) -46);
        int var10 = class198.field3168 - var9;
        int var11 = class198.field3168;
        class84.field1151 = null;
        int var12 = class326.field5108 - var8;
        if (arg3 <= 63) {
            field5152 = (String[]) null;
        }
        int var13 = class326.field5108;
        if (arg2) {
            class79.field1083 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class212 var15 = class59.field870[var14];
                if (var15 != null) {
                    var15.field4698 -= var12 * 128;
                    var15.field4731 -= var10 * 128;
                    if (var15.field4698 >= 0 && var15.field4698 <= 13184 && var15.field4731 >= 0 && var15.field4731 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field4708[var16] -= var12;
                            var15.field4675[var16] -= var10;
                        }
                        class85.field1157[class79.field1083++] = var14;
                    } else {
                        class59.field870[var14].method1541(88, (class161) null);
                        class59.field870[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class212 var18 = class59.field870[var17];
                if (var18 != null) {
                    for (int var19 = 0; var19 < 10; var19++) {
                        var18.field4708[var19] -= var12;
                        var18.field4675[var19] -= var10;
                    }
                    var18.field4698 -= var12 * 128;
                    var18.field4731 -= var10 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class337 var21 = class284.field4403[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field4708[var22] -= var12;
                    var21.field4675[var22] -= var10;
                }
                var21.field4731 -= var10 * 128;
                var21.field4698 -= var12 * 128;
            }
        }
        byte var23 = 0;
        class154.field2392 = arg1;
        byte var24 = 104;
        class146.field2310.method2339(arg0, true, false, arg4);
        byte var25 = 1;
        if (var12 < 0) {
            var24 = -1;
            var23 = 103;
            var25 = -1;
        }
        byte var26 = 104;
        byte var27 = 0;
        byte var28 = 1;
        if (var10 < 0) {
            var26 = -1;
            var28 = -1;
            var27 = 103;
        }
        for (int var29 = var23; var29 != var24; var29 += var25) {
            for (int var30 = var27; var30 != var26; var30 += var28) {
                int var31 = var10 + var30;
                int var32 = var29 + var12;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var32 >= 0 && var31 >= 0 && var32 < 104 && var31 < 104) {
                        class304.field4750[var33][var29][var30] = class304.field4750[var33][var32][var31];
                    } else {
                        class304.field4750[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class197 var34 = (class197) class68.field959.method22((byte) 126); var34 != null; var34 = (class197) class68.field959.method26((byte) -113)) {
            var34.field3149 -= var10;
            var34.field3158 -= var12;
            if (var34.field3158 < 0 || var34.field3149 < 0 || var34.field3158 >= 104 || var34.field3149 >= 104) {
                var34.method2028(13329);
            }
        }
        if (arg2) {
            class135.field1987 -= var12;
            class295.field4572 -= var12 * 128;
            class78.field1047 -= var10;
            class21.field313 -= var12;
            class6.field122 -= var10;
            class317.field5018 -= var10 * 128;
        } else {
            class166.field2715 = 1;
        }
        class43.field600 = 0;
        if (class121.field1751 != 0) {
            class121.field1751 -= var12;
            class18.field292 -= var10;
        }
        if (class109.field1458 && arg2 && (Math.abs(var12) > 104 || Math.abs(var10) > 104)) {
            class113.method806((byte) -46);
        }
        class33.field492 = -1;
        class244.field3809.method27((byte) 65);
        class314.field4913.method27((byte) 80);
    }
}
