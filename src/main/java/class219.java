import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class219 extends class110 implements class207 {

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Z")
    private boolean field3283 = false;

    @OriginalMember(owner = "client!pa", name = "z", descriptor = "I")
    private int field3293 = 50;

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lpf;")
    private class294 field3282;

    @OriginalMember(owner = "client!pa", name = "C", descriptor = "Lpf;")
    private class294 field3296;

    @OriginalMember(owner = "client!pa", name = "H", descriptor = "Ldb;")
    private class17 field3301;

    @OriginalMember(owner = "client!pa", name = "w", descriptor = "Ldb;")
    private class17 field3290;

    @OriginalMember(owner = "client!pa", name = "F", descriptor = "Lik;")
    public static class267 field3299 = new class267(4);

    @OriginalMember(owner = "client!pa", name = "I", descriptor = "I")
    public static volatile int field3302 = 0;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!pa", name = "u", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!pa", name = "v", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!pa", name = "x", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!pa", name = "y", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!pa", name = "A", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!pa", name = "B", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!pa", name = "D", descriptor = "I")
    public static int field3297;

    @OriginalMember(owner = "client!pa", name = "E", descriptor = "I")
    public static int field3298;

    @OriginalMember(owner = "client!pa", name = "G", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!pa", name = "J", descriptor = "Lrf;")
    public static class289 field3303;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)Z")
    public final boolean method1306(int arg0, int arg1) {
        field3288++;
        if (arg0 != 65535) {
            this.field3301 = null;
        }
        return this.method661(arg0 - 65477, arg1).field4102;
    }

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "(II)Lnc;")
    private final class87 method1403(int arg0, int arg1) {
        field3297++;
        class87 var3 = (class87) this.field3301.method122((long) arg1, (byte) -110);
        if (var3 != null) {
            return var3;
        }
        if (arg0 != 28321) {
            this.field3290 = null;
        }
        byte[] var4 = this.field3282.method1973(1, arg1, 0);
        if (var4 == null) {
            return null;
        } else {
            class87 var5 = new class87(new class248(var4));
            this.field3301.method119((long) arg1, var5, 0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lfl;B)Lmf;")
    public static final class10 method1404(class248 arg0, byte arg1) {
        if (arg1 != -102) {
            method1404((class248) null, (byte) -21);
        }
        field3287++;
        return new class10(arg0.method1606((byte) 77), arg0.method1606((byte) 77), arg0.method1606((byte) 77), arg0.method1606((byte) 77), arg0.method1587(arg1 - 20), arg0.method1587(-122), arg0.method1593((byte) 27));
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(II)I")
    public final int method1308(int arg0, int arg1) {
        field3295++;
        if (arg1 != -8604) {
            field3303 = null;
        }
        return this.method661(116, arg0).field4105 & 0xFFFF;
    }

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "(II)Z")
    public final boolean method1310(int arg0, int arg1) {
        field3289++;
        if (arg0 == -16194) {
            return this.field3283 || this.method661(66, arg1).field4099;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "(II)Lwh;")
    public final class198 method699(int arg0, int arg1) {
        if (arg0 != -1) {
            field3302 = 58;
        }
        field3284++;
        class87 var3 = this.method1403(28321, arg1);
        return var3 == null ? null : var3.field1386;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)Z")
    public final boolean method1307(int arg0, int arg1) {
        if (arg0 != 255) {
            this.method1406(false, (byte) -93);
        }
        field3294++;
        return !this.method661(103, arg1).field4106;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V")
    public static void method1405(int arg0) {
        field3303 = null;
        if (arg0 != 1186) {
            field3299 = null;
        }
        field3299 = null;
    }

    @OriginalMember(owner = "client!pa", name = "<init>", descriptor = "(Lpf;Lpf;Lpf;IZ)V")
    public class219(class294 arg0, class294 arg1, class294 arg2, int arg3, boolean arg4) {
        super(arg1, arg0, arg2);
        this.field3282 = arg0;
        this.field3296 = arg2;
        this.field3283 = arg4;
        this.field3293 = arg3;
        this.field3301 = new class17(this.field3293);
        this.field3290 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZB)V")
    public final void method1406(boolean arg0, byte arg1) {
        this.field3283 = arg0;
        field3286++;
        this.method1407(76);
        int var3 = -108 % ((-arg1 - 64) / 44);
    }

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)V")
    public final void method1407(int arg0) {
        this.field3301.method118((byte) -26);
        if (this.field3290 != null) {
            this.field3290.method118((byte) -102);
        }
        class87.field1388 = null;
        field3292++;
        if (arg0 <= 74) {
            field3303 = null;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIF)[I")
    public final int[] method1309(int arg0, int arg1, float arg2) {
        if (arg0 != 255) {
            this.method1310(72, 118);
        }
        class87 var4 = this.method1403(28321, arg1);
        field3291++;
        if (var4 == null) {
            return null;
        } else {
            var4.field1387 = true;
            return var4.method570(this, this.field3296, arg2, this.field3283 || this.method661(66, arg1).field4099);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1408(String arg0, int arg1) {
        field3285++;
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = arg1; var2 < class150.field2164; var2++) {
            if (arg0.equalsIgnoreCase(class7.field114[var2])) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(BI)V")
    public final void method1409(byte arg0, int arg1) {
        if (arg0 != 45) {
            return;
        }
        for (class87 var3 = (class87) this.field3301.method117((byte) -17); var3 != null; var3 = (class87) this.field3301.method123((byte) 96)) {
            if (var3.field1387) {
                var3.method567(arg1);
                var3.field1387 = false;
            }
        }
        field3298++;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIFIZ)Lmc;")
    public final class201 method1311(int arg0, int arg1, float arg2, int arg3, boolean arg4) {
        field3300++;
        class87 var6 = this.method1403(28321, arg3);
        if (var6 != null && var6.method568(this, this.field3296)) {
            if (arg0 >= -96) {
                this.field3293 = 40;
            }
            return arg4 ? var6.field1386.method1246(this, -122, arg1, this.field3296, false, (double) arg2, arg1) : var6.field1386.method1241(arg1, this.field3296, arg1, (double) arg2, false, 109, this);
        } else {
            return null;
        }
    }
}
