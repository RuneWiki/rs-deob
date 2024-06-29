import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class122 extends class508 {

    @OriginalMember(owner = "client!ud", name = "v", descriptor = "Lod;")
    public class622 field1544;

    @OriginalMember(owner = "client!ud", name = "s", descriptor = "[I")
    public static int[] field1541 = new int[14];

    @OriginalMember(owner = "client!ud", name = "t", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!ud", name = "u", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lqfa;III)Lit;", line = 3)
    public static final class517 method651(class372 arg0, int arg1, int arg2, int arg3) {
        field1543++;
        if (arg3 != -6162) {
            method652();
        }
        int var4 = arg2 << 10 | arg0.field4702;
        class517 var5 = (class517) class150.field1923.method684((byte) 119, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class689.field9770.method3344(113, class689.field9770.method3346((byte) -126, var4));
        if (var6 == null) {
            int var9 = arg0.field4702 | arg1 + 65536 << 10;
            class517 var10 = (class517) class150.field1923.method684((byte) 93, (long) var9 << 16);
            if (var10 != null) {
                return var10;
            }
            byte[] var11 = class689.field9770.method3344(arg3 ^ 0xFFFFE794, class689.field9770.method3346((byte) -126, var9));
            if (var11 == null) {
                int var14 = arg0.field4702 | 0x3FFFC00;
                class517 var15 = (class517) class150.field1923.method684((byte) 83, (long) var14 << 16);
                if (var15 != null) {
                    return var15;
                }
                byte[] var16 = class689.field9770.method3344(arg3 ^ 0xFFFFE78E, class689.field9770.method3346((byte) -126, var14));
                if (var16 == null) {
                    return null;
                } else if (var16.length <= 1) {
                    return null;
                } else {
                    class517 var17;
                    try {
                        var17 = class671.method3768(var16, -102);
                    } catch (Exception var21) {
                        throw new RuntimeException(var21.getMessage() + " S: " + var14);
                    }
                    var17.field7061 = arg0;
                    class150.field1923.method681(var17, false, (long) var14 << 16);
                    return var17;
                }
            } else if (var11.length <= 1) {
                return null;
            } else {
                class517 var12;
                try {
                    var12 = class671.method3768(var11, -15);
                } catch (Exception var20) {
                    throw new RuntimeException(var20.getMessage() + " S: " + var9);
                }
                var12.field7061 = arg0;
                class150.field1923.method681(var12, false, (long) var9 << 16);
                return var12;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class517 var7;
            try {
                var7 = class671.method3768(var6, -63);
            } catch (Exception var19) {
                throw new RuntimeException(var19.getMessage() + " S: " + var4);
            }
            var7.field7061 = arg0;
            class150.field1923.method681(var7, false, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "()V", line = 84)
    public static final void method652() {
        byte var0 = 10;
        byte var1 = 30;
        if (class571.field7980 == null) {
            return;
        }
        class590.field8291.method1060(class262.field3232);
        for (int var2 = 0; var2 < class678.field9517.length; var2++) {
            class590.field8291.method3109(class678.field9517[var2] + class204.field2596[var2], (byte) 4, -256, class262.field3232[3] - class262.field3232[1], class262.field3232[1]);
        }
        for (int var3 = 0; var3 < class145.field1881; var3++) {
            class199 var11 = class484.field6435[var3];
            class590.field8291.method991(var11.field2523[0], var11.field2511[0], var11.field2515[0], class670.field9443);
            class590.field8291.method991(var11.field2523[1], var11.field2511[1], var11.field2515[1], class579.field8116);
            class590.field8291.method991(var11.field2523[2], var11.field2511[2], var11.field2515[2], class232.field2898);
            class590.field8291.method991(var11.field2523[3], var11.field2511[3], var11.field2515[3], class410.field5133);
            if (class670.field9443[2] != -1 && class579.field8116[2] != -1 && class232.field2898[2] != -1 && class410.field5133[2] != -1) {
                int var12 = -65536;
                if (var11.field2518 == 4) {
                    var12 = -16776961;
                }
                class590.field8291.method3113(1, class670.field9443[1], var12, class579.field8116[1], class670.field9443[0], class579.field8116[0]);
                class590.field8291.method3113(1, class579.field8116[1], var12, class232.field2898[1], class579.field8116[0], class232.field2898[0]);
                class590.field8291.method3113(1, class232.field2898[1], var12, class410.field5133[1], class232.field2898[0], class410.field5133[0]);
                class590.field8291.method3113(1, class410.field5133[1], var12, class670.field9443[1], class410.field5133[0], class670.field9443[0]);
                class590.field8291.method3113(1, class670.field9443[1], var12, class232.field2898[1], class670.field9443[0], class232.field2898[0]);
            }
        }
        class571.field7980.method2192(-256, true, var0, "Static Opaque: OW: " + class593.field8335[0] + "/" + class540.field7232[0] + " UW: " + class593.field8335[1] + "/" + class540.field7232[1], -16777216, var1);
        class571.field7980.method2192(-256, true, var0, "Static Trans: OW: " + class173.field2256[0] + "/" + class653.field9210[0] + " UW: " + class173.field2256[1] + "/" + class653.field9210[1], -16777216, var1 + 15);
        class571.field7980.method2192(-256, true, var0, "Static Anim: OW: " + class469.field5960[0] + "/" + class546.field7271[0] + " UW: " + class469.field5960[1] + "/" + class546.field7271[1], -16777216, var1 + 30);
        class571.field7980.method2192(-256, true, var0, "Dynamic: " + class103.field1389 + "/" + 5000, -16777216, var1 + 45);
        class571.field7980.method2192(-256, true, var0, "Total Opaque Onscreen: " + class518.field7075 + "/" + 10000, -16777216, var1 + 60);
        class571.field7980.method2192(-256, true, var0, "Total Trans Onscreen: " + class467.field5939 + "/" + 5000, -16777216, var1 + 75);
        class571.field7980.method2192(-256, true, var0, "Occluders: " + (class430.field5385 + class207.field2629) + " Active: " + class145.field1881, -16777216, var1 + 90);
        class571.field7980.method2192(-256, true, var0, "Occluded: Ground:" + class352.field4496 + " Walls: " + class463.field5901 + " CPs: " + class613.field8621 + " Pixels: " + class160.field2109, -16777216, var1 + 105);
        class571.field7980.method2192(-256, true, var0, "Occlude Calc Took: " + class560.field7788 / 1000L + "us", -16777216, var1 + 120);
        if (class169.field2211 == null) {
            return;
        }
        for (int var4 = 0; var4 < class169.field2211.length; var4++) {
            float var6 = (float) class169.field2211[var4];
            float var7 = var6 / 4194304.0F;
            if (var7 > 1.0F) {
                var7 = 1.0F;
            }
            float var8 = var7 * 255.0F;
            float var9 = 255.0F - var8;
            int var10 = (int) var9;
            class169.field2211[var4] = var10 | var10 << 8 | var10 << 16 | 0xFF000000;
        }
        class536 var5 = class590.field8291.method1025(class169.field2211, 0, class278.field3478, class278.field3478, class294.field3635);
        var5.method155(var0, 170, 1, 0, 0);
    }

    @OriginalMember(owner = "client!ud", name = "b", descriptor = "(B)V", line = 166)
    public static void method653(byte arg0) {
        field1541 = null;
        if (arg0 <= 64) {
            field1541 = null;
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ltba;B)V", line = 182)
    public static final void method654(class704 arg0, byte arg1) {
        field1542++;
        if (arg1 != -36) {
            method653((byte) 127);
        }
        class227.field2830.method239(arg0, (byte) 93);
        arg0.field9931 = arg0.field9929.field8812;
        arg0.field9929.field8812 = 0;
        class403.field5052 += arg0.field9931;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Lod;)V", line = 195)
    public class122(class622 arg0) {
        this.field1544 = arg0;
    }
}
