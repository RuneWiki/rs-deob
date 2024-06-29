import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class186 {

    @OriginalMember(owner = "client!ek", name = "l", descriptor = "I")
    public int field3421;

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!ek", name = "h", descriptor = "I")
    public int field3417;

    @OriginalMember(owner = "client!ek", name = "e", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "F")
    public float field3415;

    @OriginalMember(owner = "client!ek", name = "k", descriptor = "F")
    public float field3420;

    @OriginalMember(owner = "client!ek", name = "i", descriptor = "F")
    public float field3418;

    @OriginalMember(owner = "client!ek", name = "j", descriptor = "I")
    public int field3419;

    @OriginalMember(owner = "client!ek", name = "m", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "[I")
    public static int[] field3410 = new int[] { 0, 0, 0, 0, 0, 0, 0, 5, 0, 10, 2, 0, 0, 9, 0, 0, 6, 0, 5, 0, 0, 5, 14, 0, -2, 0, 0, -1, 10, 0, 0, -1, 0, 0, -2, 0, 0, 8, 7, 0, 0, 4, 6, 14, 1, 8, 0, 6, 0, 5, 0, 0, 0, 0, 6, 0, 10, 0, 0, 0, 0, 7, 0, 20, 0, -1, 0, 6, 3, 0, 0, 0, 0, 0, 8, 0, 6, 0, -2, 0, 0, 0, 0, -2, 0, 0, 0, 6, 0, 2, 1, 0, 0, -1, 0, -1, 0, 0, 0, 7, 6, -2, 5, 4, 5, 3, -2, 0, 0, 0, 0, 6, 0, 0, 7, 12, 0, 0, 0, 0, 0, 0, -2, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, -2, 8, 0, 10, 0, 0, 5, -1, 0, 1, 0, 0, 0, 12, 0, 0, 0, 0, 0, 24, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, -1, 0, 0, 0, -2, 0, 0, 0, -2, 0, 0, 0, 10, 0, 15, 0, 0, 8, 0, -2, 0, 1, -1, 0, 0, 0, 0, -1, 0, 0, -2, -1, 0, 0, 4, 0, -1, 0, 3, 0, 3, 0, 2, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 8, -2, 15, 0, 2, 2, 0, -1, 2, 0, 1, 6, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0 };

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "[Lsf;")
    public static class108[] field3411 = new class108[500];

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "Lsf;")
    public static class108 field3412 = class140.method973(255, ")1o");

    @OriginalMember(owner = "client!ek", name = "n", descriptor = "I")
    public static int field3423 = 0;

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "Laj;")
    public static class1 field3416 = new class1();

    @OriginalMember(owner = "client!ek", name = "o", descriptor = "I")
    public static int field3424;

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "[I")
    public static int[] field3425;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 39)
    public static void method1334(boolean arg0) {
        field3416 = null;
        field3410 = null;
        field3425 = null;
        field3412 = null;
        if (arg0) {
            method1335(116, (byte) 33);
        }
        field3411 = null;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V", line = 55)
    public static final void method1335(int arg0, byte arg1) {
        if (arg1 <= 105) {
            field3416 = (class1) null;
        }
        class117 var2 = (class117) class98.field1620.method1676((long) arg0, (byte) -97);
        field3424++;
        if (var2 != null) {
            var2.method1325(0);
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 71)
    public class186() {
        this.field3421 = -60;
        this.field3413 = class217.field3868;
        this.field3417 = -50;
        this.field3414 = class217.field3861;
        this.field3415 = 1.1523438F;
        this.field3420 = 0.69921875F;
        this.field3418 = 1.2F;
        this.field3419 = -50;
        this.field3422 = 0;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(Lrm;)V", line = 91)
    public class186(class249 arg0) {
        int var2 = arg0.method1731(true);
        if ((var2 & 0x1) == 0) {
            this.field3414 = class217.field3861;
        } else {
            this.field3414 = arg0.method1738(-1756395344);
        }
        if ((var2 & 0x2) == 0) {
            this.field3415 = 1.1523438F;
        } else {
            this.field3415 = (float) arg0.method1712(-1) / 256.0F;
        }
        if ((var2 & 0x4) == 0) {
            this.field3420 = 0.69921875F;
        } else {
            this.field3420 = (float) arg0.method1712(-1) / 256.0F;
        }
        if ((var2 & 0x8) == 0) {
            this.field3418 = 1.2F;
        } else {
            this.field3418 = (float) arg0.method1712(-1) / 256.0F;
        }
        if ((var2 & 0x10) == 0) {
            this.field3417 = -50;
            this.field3421 = -60;
            this.field3419 = -50;
        } else {
            this.field3419 = arg0.method1728(true);
            this.field3421 = arg0.method1728(true);
            this.field3417 = arg0.method1728(true);
        }
        if ((var2 & 0x20) == 0) {
            this.field3413 = class217.field3868;
        } else {
            this.field3413 = arg0.method1738(-1756395344);
        }
        if ((var2 & 0x40) == 0) {
            this.field3422 = 0;
        } else {
            this.field3422 = arg0.method1712(-1);
        }
    }
}
