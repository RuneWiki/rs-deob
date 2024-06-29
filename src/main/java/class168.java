import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class168 {

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    private int field3342 = 0;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "I")
    private int field3348 = -1;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "Lcf;")
    private class25 field3341 = new class25();

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "Z")
    public boolean field3368 = false;

    @OriginalMember(owner = "client!sg", name = "n", descriptor = "I")
    private int field3352;

    @OriginalMember(owner = "client!sg", name = "p", descriptor = "[Lt;")
    private class170[] field3354;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "[[I")
    private int[][] field3366;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    private int field3346;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Lcd;")
    private static class23 field3343 = class54.method414("Starting game engine)3)3)3", -1);

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Lcd;")
    public static class23 field3358 = class54.method414("rot:", -1);

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "I")
    public static int field3350 = 0;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Lcd;")
    public static class23 field3361 = field3343;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Lcd;")
    private static class23 field3359 = class54.method414("This world is running a closed Beta)3", -1);

    @OriginalMember(owner = "client!sg", name = "o", descriptor = "Lcd;")
    private static class23 field3353 = class54.method414("Login server offline)3", -1);

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "I")
    public static int field3365 = 0;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "Lcd;")
    public static class23 field3364 = class54.method414("Fertigkeit)2", -1);

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "Lcd;")
    public static class23 field3363 = field3359;

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "Lcd;")
    public static class23 field3349 = field3353;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3339;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field3340;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3344;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public static int field3345;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field3351;

    @OriginalMember(owner = "client!sg", name = "q", descriptor = "I")
    public static int field3355;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "I")
    public static int field3356;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Loe;")
    public static class130 field3357;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "Lkh;")
    public static class97 field3360;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public final void method1028(int arg0) {
        field3356++;
        for (int var2 = 0; var2 < this.field3352; var2++) {
            this.field3366[var2] = null;
        }
        this.field3354 = null;
        this.field3366 = null;
        this.field3341.method190((byte) 101);
        this.field3341 = null;
        int var3 = -91 / ((arg0 + 72) / 40);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(III)V")
    public static final void method1029(int arg0, int arg1, int arg2) {
        class25 var3 = class150.field3006[class59.field1385][arg1][arg0];
        field3344++;
        if (var3 == null) {
            class205.field4041.method807(class59.field1385, arg1, arg0);
            return;
        }
        if (arg2 != -1) {
            method1031(null, 94);
        }
        int var4 = -99999999;
        class52 var5 = (class52) var3.method188((byte) 54);
        class52 var6 = null;
        while (var5 != null) {
            class63 var11 = class85.method565(var5.field1241, (byte) -40);
            int var12 = var11.field1488;
            if (var11.field1471 == 1) {
                var12 = (var5.field1233 + 1) * var12;
            }
            if (var12 > var4) {
                var6 = var5;
                var4 = var12;
            }
            var5 = (class52) var3.method185((byte) -102);
        }
        if (var6 == null) {
            class205.field4041.method807(class59.field1385, arg1, arg0);
            return;
        }
        var3.method192(1, var6);
        class52 var7 = (class52) var3.method188((byte) 54);
        class52 var8 = null;
        int var9 = (arg0 << 7) + arg1 + 1610612736;
        class52 var10 = null;
        while (var7 != null) {
            if (var6.field1241 != var7.field1241) {
                if (var8 == null) {
                    var8 = var7;
                }
                if (var7.field1241 != var8.field1241 && var10 == null) {
                    var10 = var7;
                }
            }
            var7 = (class52) var3.method185((byte) -102);
        }
        class205.field4041.method787(class59.field1385, arg1, arg0, class203.method1330((byte) -88, arg0 * 128 + 64, arg1 * 128 - -64, class59.field1385), var6, var9, var8, var10);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IZLkh;)Lea;")
    public static final class38 method1030(int arg0, boolean arg1, class97 arg2) {
        field3345++;
        if (!arg1) {
            method1032(79, 118);
        }
        return class180.method1117(-10267, arg2, arg0) ? class60.method455(false) : null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method1031(Component arg0, int arg1) {
        arg0.addMouseListener(class160.field3194);
        field3339++;
        arg0.addMouseMotionListener(class160.field3194);
        if (arg1 == -2129534860) {
            arg0.addFocusListener(class160.field3194);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)Z")
    public static final boolean method1032(int arg0, int arg1) {
        field3347++;
        int var2 = 59 / ((27 - arg0) / 42);
        return (arg1 >> 20 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(II)[I")
    public final int[] method1033(int arg0, int arg1) {
        if (arg0 >= -61) {
            field3343 = null;
        }
        field3355++;
        if (this.field3352 == this.field3346) {
            this.field3368 = this.field3354[arg1] == null;
            this.field3354[arg1] = class134.field2778;
            return this.field3366[arg1];
        } else if (this.field3352 == 1) {
            this.field3368 = this.field3348 != arg1;
            this.field3348 = arg1;
            return this.field3366[0];
        } else {
            class170 var3 = this.field3354[arg1];
            if (this.field3368 = var3 == null) {
                if (this.field3352 <= this.field3342) {
                    class170 var4 = (class170) this.field3341.method184(-1001);
                    var3 = new class170(arg1, var4.field3386);
                    this.field3354[var4.field3388] = null;
                    var4.method1018(15789);
                } else {
                    var3 = new class170(arg1, this.field3342);
                    this.field3342++;
                }
                this.field3354[arg1] = var3;
            }
            this.field3341.method192(1, var3);
            return this.field3366[var3.field3386];
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)[[I")
    public final int[][] method1034(int arg0) {
        field3340++;
        if (arg0 <= 22) {
            return null;
        } else if (this.field3352 == this.field3346) {
            for (int var2 = 0; var2 < this.field3352; var2++) {
                this.field3354[var2] = class134.field2778;
            }
            return this.field3366;
        } else {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
    }

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "(I)V")
    public static void method1035(int arg0) {
        field3360 = null;
        field3363 = null;
        field3361 = null;
        field3357 = null;
        field3349 = null;
        field3343 = null;
        field3359 = null;
        if (arg0 < 94) {
            method1029(119, -100, 20);
        }
        field3353 = null;
        field3364 = null;
        field3358 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(III)V")
    public class168(int arg0, int arg1, int arg2) {
        this.field3352 = arg0;
        this.field3354 = new class170[arg1];
        this.field3366 = new int[arg0][arg2];
        this.field3346 = arg1;
    }
}
