import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class441 {

    @OriginalMember(owner = "client!go", name = "e", descriptor = "I")
    public int field6589;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "I")
    public int field6586;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "I")
    public int field6588;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "I")
    public int field6590;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "Lri;")
    public static class73 field6591 = new class73(15, -1);

    @OriginalMember(owner = "client!go", name = "h", descriptor = "[I")
    public static int[] field6592 = new int[5];

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field6587;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)V", line = 4)
    public static void method2661(int arg0) {
        field6592 = null;
        if (arg0 != 0) {
            field6592 = null;
        }
        field6591 = null;
    }

    @OriginalMember(owner = "client!go", name = "toString", descriptor = "()Ljava/lang/String;", line = 16)
    public final String toString() {
        field6585++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(I)V", line = 30)
    public static final void method2662(int arg0) {
        field6587++;
        if (class426.field6401.method2524(class170.field2529, -14120) != 2) {
            return;
        }
        byte var1 = (byte) (class465.field6883 - 4 & 0xFF);
        int var2 = class465.field6883 % class30.field323;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < class182.field2661; var16++) {
                class1.field5[var3][var2][var16] = var1;
            }
        }
        if (class79.field1192 == 3) {
            return;
        }
        for (int var4 = arg0; var4 < 2; var4++) {
            class461.field6850[var4] = -1000000;
            class515.field7519[var4] = 1000000;
            class30.field322[var4] = 0;
            class265.field3875[var4] = 1000000;
            class438.field6538[var4] = 0;
        }
        if (class140.field2103 != 1) {
            int var5 = class377.method2316(class260.field3827, false, class24.field258, class79.field1192);
            if ((var5 - class291.field4175) < 800 && (class183.field2684[class79.field1192][class24.field258 >> 7][class260.field3827 >> 7] & 0x4) != 0) {
                class425.method2548(1, 256, class24.field258 >> 7, class108.field1553, false, class260.field3827 >> 7);
            }
            return;
        }
        if ((class183.field2684[class79.field1192][class500.field7365.field1763 >> 7][class500.field7365.field1769 >> 7] & 0x4) != 0) {
            class425.method2548(0, 256, class500.field7365.field1763 >> 7, class108.field1553, false, class500.field7365.field1769 >> 7);
        }
        if (class18.field195 >= 2560) {
            return;
        }
        int var6 = class24.field258 >> 7;
        int var7 = class260.field3827 >> 7;
        int var8 = class500.field7365.field1763 >> 7;
        int var9 = class500.field7365.field1769 >> 7;
        int var10;
        if (var6 < var8) {
            var10 = var8 - var6;
        } else {
            var10 = var6 - var8;
        }
        int var11;
        if (var9 <= var7) {
            var11 = var7 - var9;
        } else {
            var11 = var9 - var7;
        }
        if (!(var10 != 0 || var11 != 0) || var10 <= -class30.field323 || var10 >= class30.field323 || -class182.field2661 >= var11 || class182.field2661 <= var11) {
            class235.method1598(null, "RC: " + var6 + "," + var7 + " " + var8 + "," + var9 + " " + class68.field1038 + "," + class24.field259, (byte) 109);
        } else if (var10 > var11) {
            int var12 = var11 * 65536 / var10;
            int var13 = 32768;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class183.field2684[class79.field1192][var6][var7] & 0x4) != 0) {
                    class425.method2548(1, 256, var6, class108.field1553, false, var7);
                    return;
                }
                var13 += var12;
                if (var13 >= 65536) {
                    var13 -= 65536;
                    if (var7 < var9) {
                        var7++;
                    } else if (var7 > var9) {
                        var7--;
                    }
                    if ((class183.field2684[class79.field1192][var6][var7] & 0x4) != 0) {
                        class425.method2548(1, 256, var6, class108.field1553, false, var7);
                        return;
                    }
                }
            }
        } else {
            int var14 = var10 * 65536 / var11;
            int var15 = 32768;
            while (var7 != var9) {
                if (var7 < var9) {
                    var7++;
                } else if (var9 < var7) {
                    var7--;
                }
                if ((class183.field2684[class79.field1192][var6][var7] & 0x4) != 0) {
                    class425.method2548(1, 256, var6, class108.field1553, false, var7);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var6 < var8) {
                        var6++;
                    } else if (var8 < var6) {
                        var6--;
                    }
                    if ((class183.field2684[class79.field1192][var6][var7] & 0x4) != 0) {
                        class425.method2548(1, 256, var6, class108.field1553, false, var7);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!go", name = "<init>", descriptor = "(IIII)V", line = 222)
    public class441(int arg0, int arg1, int arg2, int arg3) {
        this.field6589 = arg1;
        this.field6586 = arg2;
        this.field6588 = arg0;
        this.field6590 = arg3;
    }
}
