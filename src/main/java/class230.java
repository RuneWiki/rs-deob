import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class230 {

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "I")
    private int field3445 = -1;

    @OriginalMember(owner = "client!dg", name = "j", descriptor = "I")
    private int field3448 = 0;

    @OriginalMember(owner = "client!dg", name = "i", descriptor = "Leb;")
    private class395 field3447 = new class395();

    @OriginalMember(owner = "client!dg", name = "p", descriptor = "Z")
    public boolean field3454 = false;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    private int field3441;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "I")
    private int field3443;

    @OriginalMember(owner = "client!dg", name = "o", descriptor = "[Lmi;")
    private class421[] field3453;

    @OriginalMember(owner = "client!dg", name = "k", descriptor = "[[[I")
    private int[][][] field3449;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public static int field3444 = 0;

    @OriginalMember(owner = "client!dg", name = "m", descriptor = "Z")
    public static boolean field3451 = false;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public static int field3439;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "I")
    public static int field3440;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "I")
    public static int field3446;

    @OriginalMember(owner = "client!dg", name = "n", descriptor = "I")
    public static int field3452;

    @OriginalMember(owner = "client!dg", name = "q", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "Lct;")
    public static class104 field3442;

    @OriginalMember(owner = "client!dg", name = "l", descriptor = "Lrr;")
    public static class206 field3450;

    // $FF: synthetic field
    @OriginalMember(owner = "client!dg", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field3456;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lhn;Z)V")
    public static final void method1567(class265 arg0, boolean arg1) {
        if (!arg1) {
            method1567((class265) null, true);
        }
        field3452++;
        if (class178.field2530 == null) {
            return;
        }
        class438 var2 = null;
        if (arg0.field3929 == 0) {
            var2 = (class438) class319.method2098(arg0.field3927, arg0.field3937, arg0.field3915);
        }
        if (arg0.field3929 == 1) {
            var2 = (class438) class77.method538(arg0.field3927, arg0.field3937, arg0.field3915);
        }
        if (arg0.field3929 == 2) {
            var2 = (class438) class188.method1287(arg0.field3927, arg0.field3937, arg0.field3915, field3456 == null ? (field3456 = method1573("jb")) : field3456);
        }
        if (arg0.field3929 == 3) {
            var2 = (class438) class137.method913(arg0.field3927, arg0.field3937, arg0.field3915);
        }
        if (var2 == null) {
            arg0.field3920 = 0;
            arg0.field3922 = -1;
            arg0.field3932 = 0;
        } else {
            arg0.field3922 = var2.method9((byte) 120);
            arg0.field3920 = var2.method6(-20839);
            arg0.field3932 = var2.method1(-76);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V")
    public static final void method1568(int arg0) {
        class256.field3747.method2313(127);
        if (arg0 != 2) {
            method1568(-29);
        }
        field3440++;
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method1569(int arg0) {
        field3446++;
        if (arg0 != 23745) {
            this.method1572(-111, -74);
        }
        if (this.field3443 != this.field3441) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field3441; var2++) {
            this.field3453[var2] = class244.field3614;
        }
        return this.field3449;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(B)V")
    public static void method1570(byte arg0) {
        field3442 = null;
        field3450 = null;
        if (arg0 > -87) {
            method1568(35);
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V")
    public final void method1571(byte arg0) {
        for (int var2 = 0; var2 < this.field3441; var2++) {
            this.field3449[var2][0] = null;
            this.field3449[var2][1] = null;
            this.field3449[var2][2] = null;
            this.field3449[var2] = null;
        }
        if (arg0 >= -87) {
            this.field3441 = -19;
        }
        field3455++;
        this.field3449 = null;
        this.field3453 = null;
        this.field3447.method2477(-14221);
        this.field3447 = null;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[[I")
    public final int[][] method1572(int arg0, int arg1) {
        field3439++;
        if (arg0 <= 120) {
            method1568(-117);
        }
        if (this.field3443 == this.field3441) {
            this.field3454 = this.field3453[arg1] == null;
            this.field3453[arg1] = class244.field3614;
            return this.field3449[arg1];
        } else if (this.field3441 == 1) {
            this.field3454 = this.field3445 != arg1;
            this.field3445 = arg1;
            return this.field3449[0];
        } else {
            class421 var3 = this.field3453[arg1];
            if (var3 == null) {
                this.field3454 = true;
                if (this.field3441 > this.field3448) {
                    var3 = new class421(arg1, this.field3448);
                    this.field3448++;
                } else {
                    class421 var4 = (class421) this.field3447.method2479(-1);
                    var3 = new class421(arg1, var4.field6092);
                    this.field3453[var4.field6091] = null;
                    var4.method1820(-25246);
                }
                this.field3453[arg1] = var3;
            } else {
                this.field3454 = false;
            }
            this.field3447.method2474(-11725, var3);
            return this.field3449[var3.field6092];
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(III)V")
    public class230(int arg0, int arg1, int arg2) {
        this.field3441 = arg0;
        this.field3443 = arg1;
        this.field3453 = new class421[this.field3443];
        this.field3449 = new int[this.field3441][3][arg2];
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1573(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
