import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class219 {

    @OriginalMember(owner = "client!ch", name = "h", descriptor = "I")
    public int field3284 = -1;

    @OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
    public int field3283 = -1;

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public int field3289 = 512;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public int field3290 = 0;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "Z")
    public boolean field3291 = false;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public int field3292 = 64;

    @OriginalMember(owner = "client!ch", name = "k", descriptor = "I")
    public int field3287 = 8;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "Z")
    public boolean field3293 = true;

    @OriginalMember(owner = "client!ch", name = "l", descriptor = "I")
    public int field3288 = 1190717;

    @OriginalMember(owner = "client!ch", name = "i", descriptor = "Z")
    public boolean field3285 = true;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public int field3295 = 127;

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "I")
    public static int field3281 = 0;

    @OriginalMember(owner = "client!ch", name = "j", descriptor = "J")
    public static long field3286 = 0L;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
    public static int field3278 = -1;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field3277;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "I")
    public static int field3279;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "I")
    public static int field3282;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public int field3294;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field3296;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "Lud;")
    public class86 field3280;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lvo;I)V")
    public static final void method1471(class345 arg0, int arg1) {
        class693.field9819 = arg0;
        field3296++;
        if (arg1 != 1190717) {
            field3281 = -31;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Lek;I)V")
    public final void method1472(class465 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method2705(-83);
            if (var3 == 0) {
                field3277++;
                if (arg1 < 43) {
                    this.method1474((byte) -79);
                    return;
                }
                return;
            }
            this.method1473(var3, 12653, arg0);
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IILek;)V")
    private final void method1473(int arg0, int arg1, class465 arg2) {
        if (arg1 != 12653) {
            field3278 = 92;
        }
        field3282++;
        if (arg0 == 1) {
            this.field3290 = class412.method2461((byte) 52, arg2.method2714(true));
        } else if (arg0 == 2) {
            this.field3284 = arg2.method2705(-20);
        } else if (arg0 == 3) {
            this.field3284 = arg2.method2755((byte) -70);
            if (this.field3284 == 65535) {
                this.field3284 = -1;
            }
        } else if (arg0 == 5) {
            this.field3293 = false;
        } else if (arg0 == 7) {
            this.field3283 = class412.method2461((byte) 92, arg2.method2714(true));
        } else if (arg0 == 8) {
            this.field3280.field1291 = this.field3294;
        } else if (arg0 == 9) {
            this.field3289 = arg2.method2755((byte) -42) << 2;
        } else if (arg0 == 10) {
            this.field3285 = false;
        } else if (arg0 == 11) {
            this.field3287 = arg2.method2705(-55);
        } else if (arg0 == 12) {
            this.field3291 = true;
        } else if (arg0 == 13) {
            this.field3288 = arg2.method2714(true);
            return;
        } else if (arg0 == 14) {
            this.field3292 = arg2.method2705(-87) << 2;
            return;
        } else if (arg0 == 16) {
            this.field3295 = arg2.method2705(arg1 ^ 0xFFFFCEA3);
            return;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(B)V")
    public final void method1474(byte arg0) {
        field3279++;
        if (arg0 > -117) {
            this.field3285 = false;
        }
        this.field3287 = this.field3294 | this.field3287 << 8;
    }
}
