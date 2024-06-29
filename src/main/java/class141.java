import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public class class141 extends class285 {

    @OriginalMember(owner = "client!r", name = "U", descriptor = "I")
    private int field2207 = 204;

    @OriginalMember(owner = "client!r", name = "V", descriptor = "I")
    private int field2208 = 1;

    @OriginalMember(owner = "client!r", name = "O", descriptor = "I")
    private int field2201 = 1;

    @OriginalMember(owner = "client!r", name = "R", descriptor = "Ljava/lang/String;")
    public static String field2204 = null;

    @OriginalMember(owner = "client!r", name = "P", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!r", name = "Q", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!r", name = "S", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!r", name = "T", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!r", name = "W", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!r", name = "X", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!r", name = "<init>", descriptor = "()V", line = 4)
    public class141() {
        super(0, true);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZLjj;I)V", line = 18)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (arg2 == 0) {
            this.field2208 = arg1.method286((byte) -82);
        } else if (arg2 == 1) {
            this.field2201 = arg1.method286((byte) -64);
        } else if (arg2 == 2) {
            this.field2207 = arg1.method271(21081);
        }
        field2209++;
        if (!arg0) {
            method1042((byte) -26, true);
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BZ)V", line = 60)
    public static final void method1042(byte arg0, boolean arg1) {
        field2210++;
        if (class5.field82 == arg1) {
            return;
        }
        if (arg0 >= -81) {
            method1045(-108, 75, -103);
        }
        class5.field82 = arg1;
        class74.method495((byte) -97);
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(Lak;I)V", line = 76)
    public static final void method1043(class172 arg0, int arg1) {
        class49.field688 = class180.method1348(arg0, 0, (byte) -126, class208.field3426);
        field2206++;
        class150.field2319 = class265.method1888(true, class311.field4848, arg0, 0);
        class234.field3760 = class265.method1888(true, class45.field628, arg0, 0);
        class100.field1463 = class265.method1888(true, class102.field1492, arg0, 0);
        class48.field675 = class265.method1888(true, class229.field3651, arg0, 0);
        class147.field2288 = class265.method1888(true, class284.field4554, arg0, 0);
        class42.field536 = class265.method1888(true, class231.field3670, arg0, 0);
        class279.field4499 = class276.method2002(arg0, false, class60.field843, 0);
        class60.field837 = class210.method1520(class139.field2189, arg0, 14738, 0);
        class263.field4182 = class210.method1520(class158.field2621, arg0, 14738, 0);
        class146.field2271 = class67.method447(0, class156.field2412, arg0, true);
        class99.field1416 = class67.method447(0, class81.field1137, arg0, true);
        class2.field30.method1806(class99.field1416, (int[]) null);
        class296.field4688.method1806(class99.field1416, (int[]) null);
        class282.field4538.method1806(class99.field1416, (int[]) null);
        if (class232.field3690) {
            class241.field3820 = class175.method1324(class274.field4419, 0, -118, arg0);
            for (int var2 = 0; var2 < class241.field3820.length; var2++) {
                class241.field3820[var2].method2288();
            }
        }
        class220 var3 = class151.method1100(class7.field105, arg0, 0, false);
        var3.method1562();
        if (class232.field3690) {
            class133.field2093 = new class314(var3);
        } else {
            class133.field2093 = var3;
        }
        class220[] var4 = class180.method1348(arg0, 0, (byte) -120, class53.field756);
        for (int var5 = 0; var5 < var4.length; var5++) {
            var4[var5].method1562();
        }
        if (class232.field3690) {
            class204.field3358 = new class58[var4.length];
            for (int var6 = 0; var6 < var4.length; var6++) {
                class204.field3358[var6] = new class314(var4[var6]);
            }
        } else {
            class204.field3358 = var4;
        }
        if (arg1 != -27431) {
            return;
        }
        int var7 = (int) (Math.random() * 21.0D) - 10;
        int var8 = (int) (Math.random() * 21.0D) - 10;
        int var9 = (int) (Math.random() * 21.0D) - 10;
        int var10 = (int) (Math.random() * 41.0D) - 20;
        for (int var11 = 0; var11 < class49.field688.length; var11++) {
            class49.field688[var11].method1564(var8 + var10, var7 + var10, var9 + var10);
        }
        if (class232.field3690) {
            class320.field4970 = new class58[class49.field688.length];
            for (int var12 = 0; var12 < class49.field688.length; var12++) {
                class320.field4970[var12] = new class314(class49.field688[var12]);
            }
        } else {
            class320.field4970 = class49.field688;
        }
    }

    @OriginalMember(owner = "client!r", name = "j", descriptor = "(I)V", line = 173)
    public static void method1044(int arg0) {
        if (arg0 == 19076) {
            field2204 = null;
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(ZI)[I", line = 210)
    public final int[] method60(boolean arg0, int arg1) {
        field2202++;
        int[] var3 = this.field4573.method1116(115, arg1);
        if (this.field4573.field2420) {
            for (int var4 = 0; var4 < class287.field4599; var4++) {
                int var5 = class48.field669[var4];
                int var6 = this.field2208 * var5 >> 12;
                int var7 = class27.field382[arg1];
                int var8 = this.field2201 * var7 >> 12;
                int var9 = var5 % (4096 / this.field2208) * this.field2208;
                int var10 = var7 % (4096 / this.field2201) * this.field2201;
                if (this.field2207 > var10) {
                    for (var6 -= var8; var6 < 0; var6 += 4) {
                    }
                    while (var6 > 3) {
                        var6 -= 4;
                    }
                    if (var6 != 1) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (var9 < this.field2207) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (this.field2207 > var9) {
                    int var11;
                    for (var11 = var6 - var8; var11 < 0; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (!arg0) {
            method1042((byte) 61, false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(III)V", line = 291)
    public static final void method1045(int arg0, int arg1, int arg2) {
        field2205++;
        class50.field707 = class93.field1276 + class74.field1048 - arg0 - 1;
        class88.field1218 = arg2 - class27.field377;
        if (arg1 != -25697) {
            field2204 = (String) null;
        }
    }
}
