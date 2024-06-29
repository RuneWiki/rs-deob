import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class259 {

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public int field3605 = 0;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Z")
    private boolean field3607 = false;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public int field3619 = 0;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "[I")
    public static int[] field3621 = new int[3];

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public int field3602;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3603;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public int field3606;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public int field3608;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    private int field3609;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "I")
    public static int field3612;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public int field3613;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public int field3614;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public int field3615;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public int field3617;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "I")
    public int field3620;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "J")
    public long field3610;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lwu;")
    public static class376 field3616;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V")
    public static void method1571(boolean arg0) {
        if (arg0) {
            field3616 = null;
        }
        field3621 = null;
        field3616 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lee;I)V")
    public final void method1572(class677 arg0, int arg1) {
        if (arg1 != -1) {
            this.field3615 = -113;
        }
        field3611++;
        while (true) {
            int var3 = arg0.method3821((byte) -109);
            if (var3 == 0) {
                return;
            }
            this.method1576(var3, arg1 ^ 0xFFFFFFFE, arg0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public final void method1573(int arg0) {
        this.field3615 = class451.field6177[this.field3609 << 3];
        field3603++;
        long var2 = (long) this.field3613;
        long var4 = (long) this.field3606;
        long var6 = (long) this.field3617;
        if (arg0 != 14143) {
            method1575(-95);
        }
        this.field3608 = (int) Math.sqrt((double) (var2 * var2 + var4 * var4 + var6 * var6));
        if (this.field3622 == 0) {
            this.field3622 = 1;
        }
        if (this.field3602 == 0) {
            this.field3610 = 2147483647L;
        } else if (this.field3602 == 1) {
            this.field3610 = (this.field3608 * 8 / this.field3622);
            this.field3610 *= this.field3610;
        } else if (this.field3602 == 2) {
            this.field3610 = (this.field3608 * 8 / this.field3622);
        }
        if (this.field3607) {
            this.field3608 *= -1;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Ljava/lang/String;I)Z")
    public static final boolean method1574(String arg0, int arg1) {
        if (arg1 != 10) {
            field3616 = null;
        }
        field3604++;
        return class475.method2681(arg0, 48, true, 10);
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static final void method1575(int arg0) {
        for (class107 var1 = (class107) class1.field12.method2144(true); var1 != null; var1 = (class107) class1.field12.method2146(false)) {
            class501.method2820(arg0 ^ 0x7218, var1.field1459);
        }
        if (arg0 != 20502) {
            method1575(-95);
        }
        field3612++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IILee;)V")
    private final void method1576(int arg0, int arg1, class677 arg2) {
        if (arg0 == arg1) {
            this.field3609 = arg2.method3807(-1);
        } else if (arg0 == 2) {
            arg2.method3821((byte) -93);
        } else if (arg0 == 3) {
            this.field3613 = arg2.method3799(false);
            this.field3606 = arg2.method3799(false);
            this.field3617 = arg2.method3799(false);
        } else if (arg0 == 4) {
            this.field3602 = arg2.method3821((byte) -16);
            this.field3622 = arg2.method3799(false);
        } else if (arg0 == 6) {
            this.field3614 = arg2.method3821((byte) 93);
        } else if (arg0 == 8) {
            this.field3619 = 1;
        } else if (arg0 == 9) {
            this.field3605 = 1;
        } else if (arg0 == 10) {
            this.field3607 = true;
        }
        field3618++;
    }
}
