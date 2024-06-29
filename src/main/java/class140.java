import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class140 {

    @OriginalMember(owner = "client!un", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2301 = "Loaded config";

    @OriginalMember(owner = "client!un", name = "g", descriptor = "[Ld;")
    public static class43[] field2305 = new class43[14];

    @OriginalMember(owner = "client!un", name = "i", descriptor = "[F")
    public static float[] field2307 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

    @OriginalMember(owner = "client!un", name = "d", descriptor = "I")
    public static int field2302 = 0;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "[I")
    public static int[] field2303 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field2299;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field2300;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V", line = 12)
    public static void method1083(byte arg0) {
        int var1 = -85 / ((3 - arg0) / 32);
        field2301 = null;
        field2305 = null;
        field2307 = null;
        field2303 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(ILth;)Z", line = 43)
    public static final boolean method1084(int arg0, class57 arg1) {
        field2300++;
        if (arg0 > -20) {
            field2303 = (int[]) null;
        }
        return arg1.method452(class40.field586, (byte) 7);
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(III)I", line = 68)
    public static final int method1085(int arg0, int arg1, int arg2) {
        field2306++;
        if (arg2 != 14136) {
            method1086(-18);
        }
        class354 var3 = (class354) class329.field5229.method1268(-70, (long) arg0);
        if (var3 == null) {
            return 0;
        } else if (arg1 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field5622.length; var5++) {
                if (var3.field5617[var5] == arg1) {
                    var4 += var3.field5622[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V", line = 137)
    public static final void method1086(int arg0) {
        class29.field383.method2231(124);
        field2299++;
        int var1 = class29.field383.method2227(-27542, 8);
        if (class35.field508 > var1) {
            for (int var2 = var1; var2 < class35.field508; var2++) {
                class211.field3379[class309.field4925++] = class330.field5253[var2];
            }
        }
        if (class35.field508 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class35.field508 = 0;
        if (arg0 > -85) {
            method1083((byte) -124);
        }
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class330.field5253[var3];
            class288 var5 = class165.field2621[var4];
            int var6 = class29.field383.method2227(-27542, 1);
            if (var6 == 0) {
                class330.field5253[class35.field508++] = var4;
                var5.field3550 = class332.field5261;
            } else {
                int var7 = class29.field383.method2227(-27542, 2);
                if (var7 == 0) {
                    class330.field5253[class35.field508++] = var4;
                    var5.field3550 = class332.field5261;
                    class330.field5248[class356.field5645++] = var4;
                } else if (var7 == 1) {
                    class330.field5253[class35.field508++] = var4;
                    var5.field3550 = class332.field5261;
                    int var12 = class29.field383.method2227(-27542, 3);
                    var5.method1639(true, 1, var12);
                    int var13 = class29.field383.method2227(-27542, 1);
                    if (var13 == 1) {
                        class330.field5248[class356.field5645++] = var4;
                    }
                } else if (var7 == 2) {
                    class330.field5253[class35.field508++] = var4;
                    var5.field3550 = class332.field5261;
                    if (class29.field383.method2227(-27542, 1) == 1) {
                        int var8 = class29.field383.method2227(-27542, 3);
                        var5.method1639(true, 2, var8);
                        int var9 = class29.field383.method2227(-27542, 3);
                        var5.method1639(true, 2, var9);
                    } else {
                        int var10 = class29.field383.method2227(-27542, 3);
                        var5.method1639(true, 0, var10);
                    }
                    int var11 = class29.field383.method2227(-27542, 1);
                    if (var11 == 1) {
                        class330.field5248[class356.field5645++] = var4;
                    }
                } else if (var7 == 3) {
                    class211.field3379[class309.field4925++] = var4;
                }
            }
        }
    }
}
