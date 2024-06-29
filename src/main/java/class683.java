import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ew")
public class class683 {

    @OriginalMember(owner = "client!ew", name = "c", descriptor = "I")
    public static int field9696 = 0;

    @OriginalMember(owner = "client!ew", name = "g", descriptor = "Ljava/lang/String;")
    public static String field9700 = "";

    @OriginalMember(owner = "client!ew", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field9699 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!ew", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field9695 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "Ldj;")
    public static class703 field9694 = new class703(6, 0, 4, 2);

    @OriginalMember(owner = "client!ew", name = "j", descriptor = "[I")
    public static int[] field9703 = new int[14];

    @OriginalMember(owner = "client!ew", name = "i", descriptor = "Z")
    public static boolean field9702 = false;

    @OriginalMember(owner = "client!ew", name = "k", descriptor = "Ldj;")
    public static class703 field9704 = new class703(0, 2, 2, 1);

    @OriginalMember(owner = "client!ew", name = "d", descriptor = "I")
    public static int field9697;

    @OriginalMember(owner = "client!ew", name = "e", descriptor = "I")
    public static int field9698;

    @OriginalMember(owner = "client!ew", name = "h", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!ew", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9698++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(I)I")
    public static final int method3877(int arg0) {
        field9701++;
        if (arg0 <= 119) {
            field9702 = false;
        }
        if (class131.field1810 == null) {
            if (!class147.field2154 && class242.field3576 != null) {
                return class242.field3576.field4150;
            }
            int var1 = class535.field7789.method2459(-32213);
            int var2 = class535.field7789.method2452(-71);
            if (class34.field311) {
                if (class132.field1820 < var1 && var1 < (class314.field4246 + class132.field1820)) {
                    int var3 = -1;
                    for (int var4 = 0; var4 < class654.field9376; var4++) {
                        if (class404.field5765) {
                            int var9 = class388.field5606 + (var4 * 16) + 33;
                            if (var9 - 13 < var2 && var2 <= (var9 + 3)) {
                                var3 = var4;
                            }
                        } else {
                            int var8 = var4 * 16 + class388.field5606 + 31;
                            if (var2 > (var8 - 13) && var8 + 3 >= var2) {
                                var3 = var4;
                            }
                        }
                    }
                    if (var3 != -1) {
                        int var5 = 0;
                        class139 var6 = new class139(class225.field3348);
                        for (class194 var7 = (class194) var6.method983(122); var7 != null; var7 = (class194) var6.method982(82)) {
                            if (var3 == (var5++)) {
                                if (var7.field2845 == 1) {
                                    return ((class304) var7.field2841.field7165.field5596).field4150;
                                }
                                return -1;
                            }
                        }
                    }
                } else if (class537.field7799 != null && var1 > class327.field4441 && var1 < class666.field9521 + class327.field4441) {
                    int var10 = -1;
                    for (int var11 = 0; var11 < class537.field7799.field2845; var11++) {
                        if (class404.field5765) {
                            int var15 = class90.field1279 + (var11 * 16) + 33;
                            if (var15 - 13 < var2 && var15 + 3 >= var2) {
                                var10 = var11;
                            }
                        } else {
                            int var16 = var11 * 16 + class90.field1279 + 31;
                            if ((var16 - 13) < var2 && var16 + 3 >= var2) {
                                var10 = var11;
                            }
                        }
                    }
                    if (var10 != -1) {
                        int var12 = 0;
                        class139 var13 = new class139(class537.field7799.field2841);
                        for (class304 var14 = (class304) var13.method983(78); var14 != null; var14 = (class304) var13.method982(82)) {
                            if (var12++ == var10) {
                                return var14.field4150;
                            }
                        }
                    }
                }
            } else if (var1 > class132.field1820 && (class314.field4246 + class132.field1820) > var1) {
                int var17 = -1;
                for (int var18 = 0; var18 < class456.field6499; var18++) {
                    if (class404.field5765) {
                        int var23 = (class456.field6499 - var18 - 1) * 16 + class388.field5606 + 33;
                        if (var23 - 13 < var2 && var2 <= (var23 + 3)) {
                            var17 = var18;
                        }
                    } else {
                        int var22 = (class456.field6499 - (var18 + 1)) * 16 + (class388.field5606 + 31);
                        if (var2 > (var22 - 13) && var2 <= var22 + 3) {
                            var17 = var18;
                        }
                    }
                }
                if (var17 != -1) {
                    int var19 = 0;
                    class587 var20 = new class587(class303.field4137);
                    for (class304 var21 = (class304) var20.method3454(81); var21 != null; var21 = (class304) var20.method3452(61)) {
                        if ((var19++) == var17) {
                            return var21.field4150;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ew", name = "a", descriptor = "(B)V")
    public static void method3878(byte arg0) {
        field9695 = null;
        field9694 = null;
        field9699 = null;
        field9700 = null;
        field9703 = null;
        if (arg0 == -21) {
            field9704 = null;
        }
    }
}
