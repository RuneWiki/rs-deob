import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class210 extends class124 {

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "[I")
    private final int[] field3415 = new int[this.field2051];

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "Ltl;")
    private static class59 field3418 = class85.method639(")3fr", 9588);

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "Ltl;")
    private static class59 field3429 = class85.method639(")3de", 9588);

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "Ltl;")
    private static class59 field3424 = class85.method639(")3en", 9588);

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "Ltl;")
    private static class59 field3421 = class85.method639("en", 9588);

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "Ltl;")
    private static class59 field3419 = class85.method639("de", 9588);

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Ltl;")
    private static class59 field3431 = class85.method639("fr", 9588);

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "[Ltl;")
    public static class59[] field3414 = new class59[] { field3421, field3419, field3431 };

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "[Ltl;")
    private static class59[] field3420 = new class59[] { field3424, field3429, field3418 };

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "I")
    public static int field3422;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    private int field3423;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field3425;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field3427;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    private int field3430;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "[B")
    private byte[] field3416;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V", line = 22)
    public void method354(int arg0, byte arg1) {
        this.field3416[this.field3423++] = (byte) ((class93.method680(arg1, 255) >> 1) + 127);
        field3428++;
    }

    @OriginalMember(owner = "client!ek", name = "f", descriptor = "(I)V", line = 31)
    public static void method1475(int arg0) {
        field3424 = null;
        field3421 = null;
        field3431 = null;
        field3420 = null;
        field3418 = null;
        field3429 = null;
        field3419 = null;
        field3414 = null;
        if (arg0 != 127) {
            field3431 = (class59) null;
        }
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(IIIIIF)V", line = 60)
    public class210(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field2051; var7++) {
            this.field3415[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BII)V", line = 78)
    public final void method513(byte arg0, int arg1, int arg2) {
        field3417++;
        if (arg0 >= -92) {
            field3414 = (class59[]) null;
        }
        this.field3430 += this.field3415[arg2] * arg1 >> 12;
    }

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 95)
    public final void method510(int arg0) {
        field3425++;
        this.field3430 = 0;
        if (arg0 == 204) {
            this.field3423 = 0;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(I)V", line = 107)
    public final void method511(int arg0) {
        this.field3430 = Math.abs(this.field3430);
        if (this.field3430 >= 4096) {
            this.field3430 = 4095;
        }
        this.method354(this.field3423++, (byte) (this.field3430 >> 4));
        field3422++;
        if (arg0 != 24170) {
            method1475(68);
        }
        this.field3430 = 0;
    }

    @OriginalMember(owner = "client!ek", name = "g", descriptor = "(I)V", line = 127)
    public static final void method1476(int arg0) {
        field3427++;
        if (class53.field788 == null) {
            return;
        }
        if (class78.field1248 < 10) {
            if (!class254.field4217.method2044(class53.field788.field4692, -11)) {
                class78.field1248 = class45.field740.method2049(22590, class53.field788.field4692) / 10;
                return;
            }
            class209.method1470((byte) 110);
            class78.field1248 = 10;
        }
        if (class78.field1248 == 10) {
            class140.field2304 = class53.field788.field4681 >> 6 << 6;
            class62.field966 = (class53.field788.field4689 >> 6 << 6) + 64 - class140.field2304;
            class293.field4998 = 8.0F;
            class254.field4211 = 8.0F;
            class155.field2540 = class53.field788.field4686 >> 6 << 6;
            class216.field3532 = (class53.field788.field4690 >> 6 << 6) + 64 - class155.field2540;
            int var1 = (class286.field4920.field1774 >> 7) + (class197.field3249 - class140.field2304);
            int var2 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var3 = class216.field3532 + class155.field2540 - (class286.field4920.field1769 >> 7) - class187.field3135 - 1;
            int var4 = var3 + (int) (Math.random() * 10.0D) - 5;
            if (var2 >= 0 && var2 < class62.field966 && var4 >= 0 && class216.field3532 > var4) {
                class100.field1624 = var4;
                class120.field2005 = var2;
            } else {
                class100.field1624 = class155.field2540 + class216.field3532 - (class53.field788.field4687 * 64) - 1;
                class120.field2005 = class53.field788.field4694 * 64 - class140.field2304;
            }
            class64.method528(-11);
            class213.field3495 = new int[class90.field1424 + 1];
            int var5 = class62.field966 >> 6;
            int var6 = class169.field2725 >> 2 << 10;
            int var7 = class33.field472 >> 1;
            int var8 = class216.field3532 >> 6;
            class248.field4134 = new byte[var5][var8][];
            class306.field5195 = new short[var5][var8][];
            class162.field2647 = new int[var5][var8][];
            class262.field4366 = new byte[var5][var8][];
            class183.field3062 = new byte[var5][var8][];
            class11.field148 = new byte[var5][var8][];
            class131.field2169 = new byte[var5][var8][];
            class288.field4942 = new int[var5][var8][];
            class163.method1158(var7, var6, -20755);
            class78.field1248 = 20;
        } else if (class78.field1248 == 20) {
            class308.method2134(-123, new class170(class254.field4217.method2059((byte) 12, class295.field5059, class53.field788.field4692)));
            class78.field1248 = 30;
            class308.method2135(true, 78);
            class239.method1672((byte) -121);
        } else if (class78.field1248 == 30) {
            class202.method1444(new class170(class254.field4217.method2059((byte) 12, class8.field94, class53.field788.field4692)), -92);
            class78.field1248 = 40;
            class239.method1672((byte) -105);
        } else if (class78.field1248 == 40) {
            class131.method964(new class170(class254.field4217.method2059((byte) 12, class41.field609, class53.field788.field4692)), 66);
            class78.field1248 = 50;
            class239.method1672((byte) -89);
        } else if (class78.field1248 == 50) {
            class162.method1153(new class170(class254.field4217.method2059((byte) 12, class229.field3702, class53.field788.field4692)), (byte) 96);
            class78.field1248 = 60;
            class308.method2135(true, 78);
            class239.method1672((byte) -128);
        } else if (class78.field1248 == 60) {
            if (class254.field4217.method2033(class233.method1630(new class59[] { class53.field788.field4692, class237.field3944 }, -2883), (byte) -113)) {
                if (!class254.field4217.method2044(class233.method1630(new class59[] { class53.field788.field4692, class237.field3944 }, -2883), -11)) {
                    return;
                }
                class23.field310 = class13.method91(class233.method1630(new class59[] { class53.field788.field4692, class237.field3944 }, -2883), 0, class254.field4217);
            } else {
                class23.field310 = new class9(0);
            }
            class78.field1248 = 70;
            class239.method1672((byte) -87);
        } else if (class78.field1248 == 70) {
            class296.field5080 = new class166(11, true, class160.field2607);
            class78.field1248 = 73;
            class308.method2135(true, 78);
            class239.method1672((byte) -121);
        } else if (class78.field1248 == 73) {
            class45.field741 = new class166(12, true, class160.field2607);
            class78.field1248 = 76;
            class308.method2135(true, 78);
            class239.method1672((byte) -102);
        } else if (class78.field1248 == 76) {
            class209.field3413 = new class166(14, true, class160.field2607);
            class78.field1248 = 79;
            class308.method2135(true, arg0 ^ 0x44);
            class239.method1672((byte) -114);
        } else if (class78.field1248 == 79) {
            class102.field1673 = new class166(17, true, class160.field2607);
            class78.field1248 = 82;
            class308.method2135(true, arg0 ^ 0x44);
            class239.method1672((byte) -95);
        } else if (class78.field1248 == 82) {
            class100.field1609 = new class166(19, true, class160.field2607);
            class78.field1248 = 85;
            class308.method2135(true, 78);
            class239.method1672((byte) -106);
        } else if (class78.field1248 == 85) {
            class97.field1559 = new class166(22, true, class160.field2607);
            class78.field1248 = 88;
            class308.method2135(true, 78);
            class239.method1672((byte) -112);
        } else if (class78.field1248 == 88) {
            class306.field5192 = new class166(26, true, class160.field2607);
            class78.field1248 = 91;
            class308.method2135(true, 78);
            class239.method1672((byte) -121);
        } else {
            class178.field2921 = new class166(30, true, class160.field2607);
            class78.field1248 = 100;
            class308.method2135(true, 78);
            class239.method1672((byte) -106);
            if (arg0 == 10) {
                class69.field1065 = -1;
                class119.field1942 = -1;
                System.gc();
            }
        }
    }
}
