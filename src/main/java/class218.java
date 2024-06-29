import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class218 {

    @OriginalMember(owner = "client!li", name = "c", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "F")
    public float field3488;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "I")
    public int field3475;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "F")
    public float field3485;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "I")
    public int field3472;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public int field3478;

    @OriginalMember(owner = "client!li", name = "s", descriptor = "F")
    public float field3490;

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    public int field3481;

    @OriginalMember(owner = "client!li", name = "k", descriptor = "I")
    public int field3482;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lna;")
    public static class26 field3476 = class69.method505("Veuillez patienter)3)3)3", (byte) -118);

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lna;")
    private static class26 field3473 = class69.method505("Loading wordpack )2 ", (byte) -120);

    @OriginalMember(owner = "client!li", name = "h", descriptor = "[Lmj;")
    public static class228[] field3479 = new class228[4];

    @OriginalMember(owner = "client!li", name = "i", descriptor = "Lna;")
    public static class26 field3480 = field3473;

    @OriginalMember(owner = "client!li", name = "u", descriptor = "Lna;")
    private static class26 field3492 = class69.method505("Examine", (byte) -121);

    @OriginalMember(owner = "client!li", name = "f", descriptor = "Lna;")
    public static class26 field3477 = field3492;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "Lna;")
    public static class26 field3487 = class69.method505("::rebuild", (byte) -124);

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!li", name = "r", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!li", name = "t", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!li", name = "v", descriptor = "Lva;")
    public static class146 field3493;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Lge;")
    public static class153 field3483;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "Lsc;")
    public static class259 field3494;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ZI)V", line = 11)
    public static final void method1471(boolean arg0, int arg1) {
        if (arg1 == -1 && !class243.field4003) {
            class86.method678(false);
        } else if (arg1 != -1 && (class271.field4528 != arg1 || !class232.method1565(-1)) && class92.field1499 != 0 && !class243.field4003) {
            class73.method526(true, arg1, 0, class36.field593, false, class92.field1499, 2);
        }
        if (!arg0) {
            field3492 = (class26) null;
        }
        class271.field4528 = arg1;
        field3484++;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(III)V", line = 43)
    public static final void method1472(int arg0, int arg1, int arg2) {
        if (arg1 < 21) {
            method1474(34, -13);
        }
        field3489++;
        class205.field3201[arg0] = arg2;
        class116 var3 = (class116) class4.field32.method1827((long) arg0, 0);
        if (var3 == null) {
            class116 var4 = new class116(class128.method869((byte) -55) + 500L);
            class4.field32.method1826(1, var4, (long) arg0);
        } else {
            var3.field1830 = class128.method869((byte) -55) + 500L;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)V", line = 71)
    public static void method1473(byte arg0) {
        field3493 = null;
        field3487 = null;
        field3479 = null;
        field3492 = null;
        field3480 = null;
        field3476 = null;
        field3473 = null;
        field3483 = null;
        field3494 = null;
        field3477 = null;
        if (arg0 != 53) {
            field3493 = (class146) null;
        }
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(II)Ldd;", line = 107)
    public static final class248 method1474(int arg0, int arg1) {
        if (arg0 != -28922) {
            return (class248) null;
        }
        field3486++;
        class248 var2 = (class248) class295.field4913.method1989((long) arg1, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class266.field4374.method1889(arg1, (byte) -122, 0);
        class248 var4 = new class248(var3);
        var4.method1214(class268.field4428, (int[]) null);
        class295.field4913.method1978((byte) -96, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "()V", line = 132)
    public class218() {
        this.field3474 = class289.field4822;
        this.field3488 = 1.2F;
        this.field3475 = -50;
        this.field3485 = 1.1523438F;
        this.field3472 = class289.field4816;
        this.field3478 = -60;
        this.field3490 = 0.69921875F;
        this.field3481 = 0;
        this.field3482 = -50;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lwa;)V", line = 151)
    public class218(class82 arg0) {
        int var2 = arg0.method642((byte) -92);
        if ((var2 & 0x1) == 0) {
            this.field3474 = class289.field4822;
        } else {
            this.field3474 = arg0.method587(-502942936);
        }
        if ((var2 & 0x2) == 0) {
            this.field3485 = 1.1523438F;
        } else {
            this.field3485 = (float) arg0.method576(1) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field3490 = 0.69921875F;
        } else {
            this.field3490 = (float) arg0.method576(1) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field3488 = 1.2F;
        } else {
            this.field3488 = (float) arg0.method576(1) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3475 = -50;
            this.field3482 = -50;
            this.field3478 = -60;
        } else {
            this.field3482 = arg0.method626((byte) 53);
            this.field3478 = arg0.method626((byte) 15);
            this.field3475 = arg0.method626((byte) 50);
        }
        if ((var2 & 0x20) == 0) {
            this.field3472 = class289.field4816;
        } else {
            this.field3472 = arg0.method587(-502942936);
        }
        if ((var2 & 0x40) == 0) {
            this.field3481 = 0;
        } else {
            this.field3481 = arg0.method576(1);
        }
    }
}
