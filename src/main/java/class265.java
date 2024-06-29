import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class265 {

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "Lnv;")
    private class44 field4237;

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field4229 = new String[200];

    @OriginalMember(owner = "client!kr", name = "h", descriptor = "[I")
    public static int[] field4233 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!kr", name = "g", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!kr", name = "i", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "I")
    public static int field4235;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Ldd;")
    private class130 field4226;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(I)Ldd;")
    public final class130 method1840(int arg0) {
        field4230++;
        if (arg0 >= -28) {
            field4229 = null;
        }
        class130 var2 = this.field4237.field690.field1934;
        if (this.field4237.field690 == var2) {
            this.field4226 = null;
            return null;
        } else {
            this.field4226 = var2.field1934;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public static final void method1841(byte arg0) {
        class234.field3515.method1637((byte) 13);
        int var1 = 62 / ((arg0 - 37) / 35);
        field4228++;
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V")
    public static void method1842(int arg0) {
        field4229 = null;
        if (arg0 == -24283) {
            field4233 = null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILms;)V")
    public static final void method1843(int arg0, class82 arg1) {
        if (arg0 != 0) {
            return;
        }
        arg1.field1334 = false;
        if (arg1.field1336 != null) {
            arg1.field1336.field6952 = 0;
        }
        field4238++;
        for (class82 var2 = arg1.method720(); var2 != null; var2 = arg1.method719()) {
            method1843(0, var2);
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)Ldd;")
    public final class130 method1844(int arg0) {
        if (arg0 <= 65) {
            field4229 = null;
        }
        field4234++;
        class130 var2 = this.field4226;
        if (this.field4237.field690 == var2) {
            this.field4226 = null;
            return null;
        } else {
            this.field4226 = var2.field1934;
            return var2;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIII)V")
    public static final void method1845(int arg0, int arg1, int arg2, int arg3, int arg4) {
        class232.field3492 = arg1;
        field4227++;
        class487.field7124 = arg2;
        class36.field453 = arg3;
        int var5 = -52 / ((arg0 + 54) / 47);
        class232.field3493 = arg4;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILfi;)V")
    public static final void method1846(int arg0, class38 arg1) {
        field4232++;
        class38 var2 = class184.method1284(arg1, (byte) -51);
        int var3;
        int var4;
        if (var2 == null) {
            var4 = class360.field5313;
            var3 = class169.field2570;
        } else {
            var3 = var2.field629;
            var4 = var2.field591;
        }
        class290.method1945(var3, arg1, var4, -5, false);
        if (arg0 != -22413) {
            field4233 = null;
        }
        class425.method2657(119, arg1, var4, var3);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(ILnv;)V")
    public final void method1847(int arg0, class44 arg1) {
        if (arg0 == 422661894) {
            field4236++;
            this.field4237 = arg1;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(IIIII)V")
    public static final void method1848(int arg0, int arg1, int arg2, int arg3, int arg4) {
        for (class491 var5 = (class491) class410.field6066.method295((byte) 110); var5 != null; var5 = (class491) class410.field6066.method296(true)) {
            class85.method762(arg1, arg0, var5, 123, arg2, arg3);
        }
        field4231++;
        for (class491 var6 = (class491) class351.field5231.method295((byte) 116); var6 != null; var6 = (class491) class351.field5231.method296(true)) {
            byte var11 = 1;
            class477 var12 = var6.field7180.method3101(-1);
            if (var6.field7180.field7596) {
                var11 = 0;
            } else if (var6.field7180.field7590 == var12.field6978 || var6.field7180.field7590 == var12.field6983 || var6.field7180.field7590 == var12.field6997 || var6.field7180.field7590 == var12.field7019) {
                var11 = 2;
            } else if (var6.field7180.field7590 == var12.field6975 || var6.field7180.field7590 == var12.field7017 || var6.field7180.field7590 == var12.field6981 || var6.field7180.field7590 == var12.field7004) {
                var11 = 3;
            }
            if (var6.field7183 != var11) {
                int var13 = class150.method1081((byte) -72, var6.field7180);
                if (var6.field7172 != var13) {
                    if (var6.field7182 != null) {
                        class503.field7313.method1802(var6.field7182);
                        var6.field7182 = null;
                    }
                    var6.field7172 = var13;
                }
                var6.field7183 = var11;
            }
            var6.field7169 = var6.field7180.field1275;
            var6.field7174 = var6.field7180.field1275 + (var6.field7180.method3045(0) << 6);
            var6.field7165 = var6.field7180.field1279;
            var6.field7185 = var6.field7180.field1279 + (var6.field7180.method3045(0) << 6);
            class85.method762(arg1, arg0, var6, 124, arg2, arg3);
        }
        if (arg4 != 0) {
            method1843(-114, null);
        }
        for (class491 var7 = (class491) class299.field4604.method359(true); var7 != null; var7 = (class491) class299.field4604.method365(-88)) {
            byte var8 = 1;
            class477 var9 = var7.field7167.method3101(-1);
            if (var7.field7167.field7596) {
                var8 = 0;
            } else if (var7.field7167.field7590 == var9.field6978 || var7.field7167.field7590 == var9.field6983 || var7.field7167.field7590 == var9.field6997 || var7.field7167.field7590 == var9.field7019) {
                var8 = 2;
            } else if (var7.field7167.field7590 == var9.field6975 || var7.field7167.field7590 == var9.field7017 || var7.field7167.field7590 == var9.field6981 || var7.field7167.field7590 == var9.field7004) {
                var8 = 3;
            }
            if (var7.field7183 != var8) {
                int var10 = class199.method1412(var7.field7167, 26582);
                if (var7.field7172 != var10) {
                    if (var7.field7182 != null) {
                        class503.field7313.method1802(var7.field7182);
                        var7.field7182 = null;
                    }
                    var7.field7172 = var10;
                }
                var7.field7183 = var8;
            }
            var7.field7169 = var7.field7167.field1275;
            var7.field7174 = var7.field7167.field1275 + (var7.field7167.method3045(arg4) << 6);
            var7.field7165 = var7.field7167.field1279;
            var7.field7185 = var7.field7167.field1279 + (var7.field7167.method3045(0) << 6);
            class85.method762(arg1, arg0, var7, arg4 ^ 0x69, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "()V")
    public class265() {
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(Lnv;)V")
    public class265(class44 arg0) {
        this.field4237 = arg0;
    }
}
