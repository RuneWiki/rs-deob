import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class450 {

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "F")
    public float field6208 = 1.0F;

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "F")
    public float field6210 = 0.25F;

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "F")
    public float field6218 = 1.0F;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public int field6220;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public int field6223;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "F")
    public float field6212;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "Lja;")
    public class167 field6213;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public int field6219;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "F")
    public float field6211;

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "I")
    public int field6209;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "I")
    public int field6215;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "I")
    public int field6224;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "F")
    public float field6225;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Ldk;")
    public static class326 field6221 = new class326("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Ldk;")
    public static class326 field6226 = new class326(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field6217;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field6222;

    @OriginalMember(owner = "client!hg", name = "t", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!hg", name = "u", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V")
    public static void method2623(int arg0) {
        field6221 = null;
        if (arg0 != 4022) {
            field6228 = -125;
        }
        field6226 = null;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lcj;B)I")
    public static final int method2624(class451 arg0, byte arg1) {
        field6217++;
        String var2 = class179.method1093((byte) -120, arg0);
        int[] var3 = null;
        if (class242.method1532((byte) -125, arg0.field6245)) {
            var3 = class64.field834.method2129((int) arg0.field6235, false).field537;
        } else if (arg0.field6247 != -1) {
            var3 = class64.field834.method2129(arg0.field6247, false).field537;
        } else if (class128.method804(arg0.field6245, true)) {
            class216 var6 = class139.field1851[(int) arg0.field6235];
            if (var6 != null) {
                class466 var7 = var6.field3232;
                if (var7.field6526 != null) {
                    var7 = var7.method2742(-58, class140.field1859);
                }
                if (var7 != null) {
                    var3 = var7.field6546;
                }
            }
        } else if (class424.method2490(arg0.field6245, arg1 ^ 0xFFFFFFEF)) {
            Object var4 = null;
            class453 var5;
            if (arg0.field6245 == 1007) {
                var5 = class156.field2325.method808((int) arg0.field6235, 0);
            } else {
                var5 = class156.field2325.method808((int) (arg0.field6235 >>> 32 & 0x7FFFFFFFL), 0);
            }
            if (var5.field6306 != null) {
                var5 = var5.method2655(103, class140.field1859);
            }
            if (var5 != null) {
                var3 = var5.field6315;
            }
        }
        if (var3 != null) {
            var2 = var2 + class229.method1462(var3, (byte) -83);
        }
        int var8 = class37.field488.method858(class11.field120, -17498, var2);
        if (arg0.field6233) {
            var8 += class190.field2816.method518() + 4;
        }
        if (arg1 != 75) {
            method2627(12, -126);
        }
        return var8;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(ILhg;)Z")
    public final boolean method2625(int arg0, class450 arg1) {
        if (arg0 != -3694) {
            this.field6212 = 1.6862217F;
        }
        field6222++;
        return this.field6219 == arg1.field6219 && this.field6211 == arg1.field6211 && this.field6212 == arg1.field6212 && this.field6225 == arg1.field6225 && this.field6210 == arg1.field6210 && this.field6208 == arg1.field6208 && this.field6218 == arg1.field6218 && this.field6209 == arg1.field6209 && this.field6215 == arg1.field6215 && this.field6213 == arg1.field6213;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(Lrp;I)V")
    public final void method2626(class276 arg0, int arg1) {
        field6216++;
        this.field6208 = (float) (arg0.method1701(-23121) * 8) / 255.0F;
        this.field6210 = (float) (arg0.method1701(arg1 - 23129) * 8) / 255.0F;
        this.field6218 = (float) (arg1 * arg0.method1701(-23121)) / 255.0F;
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(II)V")
    public static final void method2627(int arg0, int arg1) {
        if (arg0 == 0) {
            field6214++;
            class489 var2 = class116.method731(arg0 - 625541408, 8, arg1);
            var2.method2861(-229012000);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V")
    public static final void method2628(int arg0) {
        field6227++;
        class393 var1 = (class393) class34.field445.method2843(1123227612);
        if (arg0 != 0) {
            method2623(-123);
        }
        while (var1 != null) {
            if (var1.field5570 == -1) {
                var1.field5575 = 0;
                class187.method1152((byte) 83, var1);
            } else {
                var1.method1510((byte) -13);
            }
            var1 = (class393) class34.field445.method2842(1673506446);
        }
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "()V")
    public class450() {
        this.field6220 = -50;
        this.field6223 = -60;
        this.field6212 = 0.69921875F;
        this.field6213 = class305.field4340;
        this.field6219 = class360.field5186;
        this.field6211 = 1.1523438F;
        this.field6209 = class349.field5055;
        this.field6215 = 0;
        this.field6224 = -50;
        this.field6225 = 1.2F;
    }

    @OriginalMember(owner = "client!hg", name = "<init>", descriptor = "(Lrp;)V")
    public class450(class276 arg0) {
        int var2 = arg0.method1701(-23121);
        if (class314.field4438.field5779 && class135.field1783.method606() > 0) {
            if ((var2 & 0x1) == 0) {
                this.field6219 = class360.field5186;
            } else {
                this.field6219 = arg0.method1688(20402);
            }
            if ((var2 & 0x2) == 0) {
                this.field6211 = 1.1523438F;
            } else {
                this.field6211 = (float) arg0.method1729(65280) / 256.0F;
            }
            if ((var2 & 0x4) == 0) {
                this.field6212 = 0.69921875F;
            } else {
                this.field6212 = (float) arg0.method1729(65280) / 256.0F;
            }
            if ((var2 & 0x8) == 0) {
                this.field6225 = 1.2F;
            } else {
                this.field6225 = (float) arg0.method1729(65280) / 256.0F;
            }
        } else {
            if ((var2 & 0x1) != 0) {
                arg0.method1688(20402);
            }
            if ((var2 & 0x2) != 0) {
                arg0.method1729(65280);
            }
            if ((var2 & 0x4) != 0) {
                arg0.method1729(65280);
            }
            if ((var2 & 0x8) != 0) {
                arg0.method1729(65280);
            }
            this.field6225 = 1.2F;
            this.field6212 = 0.69921875F;
            this.field6211 = 1.1523438F;
            this.field6219 = class360.field5186;
        }
        if ((var2 & 0x10) == 0) {
            this.field6224 = -50;
            this.field6223 = -60;
            this.field6220 = -50;
        } else {
            this.field6224 = arg0.method1702(-79);
            this.field6223 = arg0.method1702(-59);
            this.field6220 = arg0.method1702(-82);
        }
        if ((var2 & 0x20) == 0) {
            this.field6209 = class349.field5055;
        } else {
            this.field6209 = arg0.method1688(20402);
        }
        if ((var2 & 0x40) == 0) {
            this.field6215 = 0;
        } else {
            this.field6215 = arg0.method1729(65280);
        }
        if ((var2 & 0x80) == 0) {
            this.field6213 = class305.field4340;
        } else {
            this.field6213 = class24.method170(arg0.method1729(65280), arg0.method1729(65280), arg0.method1729(65280), arg0.method1729(65280), arg0.method1729(65280), (byte) 35, arg0.method1729(65280));
        }
    }
}
