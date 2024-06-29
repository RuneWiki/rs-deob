import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class248 {

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "Lg;")
    public class67 field4536 = new class67();

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field4537 = 0;

    @OriginalMember(owner = "client!wi", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4547 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "Li;")
    public static class88 field4549 = class208.method1425(105, "::fpson");

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "Li;")
    public static class88 field4548 = class208.method1425(105, "leuchten1:");

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "Li;")
    public static class88 field4550 = class208.method1425(105, " )2> ");

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "Z")
    public static boolean field4551 = false;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "I")
    public static int field4543;

    @OriginalMember(owner = "client!wi", name = "l", descriptor = "I")
    public static int field4544;

    @OriginalMember(owner = "client!wi", name = "m", descriptor = "I")
    public static int field4545;

    @OriginalMember(owner = "client!wi", name = "n", descriptor = "I")
    public static int field4546;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field4553;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "Lnj;")
    public static class151 field4554;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "Lbj;")
    public static class22 field4552;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "Lg;")
    private class67 field4540;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)Lg;")
    public final class67 method1612(boolean arg0) {
        if (arg0) {
            return null;
        }
        field4541++;
        class67 var2 = this.field4536.field1220;
        if (this.field4536 == var2) {
            this.field4540 = null;
            return null;
        } else {
            this.field4540 = var2.field1220;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I[I[III)V")
    public static final void method1613(int arg0, int[] arg1, int[] arg2, int arg3, int arg4) {
        field4534++;
        int var5 = arg3;
        if (arg3 > 25) {
            var5 = 25;
        }
        arg3--;
        int var6 = arg2[arg3];
        int var7 = arg1[arg3];
        if (arg0 == 0) {
            class146.field2749.method30((byte) -70, 200);
            class146.field2749.method346(255, var5 + var5 + 3);
            class57.field1087++;
        }
        if (arg0 == 1) {
            class146.field2749.method30((byte) -92, 199);
            class146.field2749.method346(255, var5 + var5 + 17);
            class134.field2496++;
        }
        if (arg0 == 2) {
            class146.field2749.method30((byte) -98, 159);
            class146.field2749.method346(255, var5 + var5 + 3);
            class24.field383++;
        }
        if (arg4 <= 16) {
            field4550 = null;
        }
        class146.field2749.method305(103, var6 + class190.field3681);
        class146.field2749.method297(class247.field4513[82] ? 1 : 0, 0);
        class116.field2104 = arg1[0];
        class140.field2596 = arg2[0];
        for (int var8 = 1; var8 < var5; var8++) {
            arg3--;
            class146.field2749.method327(59, arg1[arg3] - var7);
            class146.field2749.method297(arg2[arg3] - var6, 0);
        }
        class146.field2749.method331(var7 + class223.field4214, 18975);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(B)Lg;")
    public final class67 method1614(byte arg0) {
        class67 var2 = this.field4536.field1212;
        if (arg0 != -25) {
            this.method1621(91);
        }
        field4538++;
        if (this.field4536 == var2) {
            this.field4540 = null;
            return null;
        } else {
            this.field4540 = var2.field1212;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)Lg;")
    public final class67 method1615(int arg0) {
        int var2 = 92 % ((62 - arg0) / 62);
        field4542++;
        class67 var3 = this.field4536.field1220;
        if (this.field4536 == var3) {
            return null;
        } else {
            var3.method460(true);
            return var3;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(B)V")
    public static void method1616(byte arg0) {
        int var1 = -60 / ((-arg0 - 75) / 42);
        field4554 = null;
        field4548 = null;
        field4549 = null;
        field4550 = null;
        field4547 = null;
        field4552 = null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILg;)V")
    public final void method1617(int arg0, class67 arg1) {
        if (arg0 != 24290) {
            field4550 = null;
        }
        if (arg1.field1212 != null) {
            arg1.method460(true);
        }
        arg1.field1220 = this.field4536.field1220;
        field4533++;
        arg1.field1212 = this.field4536;
        arg1.field1212.field1220 = arg1;
        arg1.field1220.field1212 = arg1;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public final void method1618(int arg0) {
        if (arg0 != -3) {
            return;
        }
        field4539++;
        while (true) {
            class67 var2 = this.field4536.field1220;
            if (this.field4536 == var2) {
                return;
            }
            var2.method460(true);
        }
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(B)Lg;")
    public final class67 method1619(byte arg0) {
        if (arg0 > -4) {
            return null;
        }
        class67 var2 = this.field4540;
        field4544++;
        if (this.field4536 == var2) {
            this.field4540 = null;
            return null;
        } else {
            this.field4540 = var2.field1212;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "(B)V")
    public static final void method1620(byte arg0) {
        if (arg0 <= 43) {
            field4550 = null;
        }
        field4545++;
        class216.field4049.method671(43);
    }

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "(I)Lg;")
    public final class67 method1621(int arg0) {
        if (arg0 != 82) {
            this.method1618(89);
        }
        field4546++;
        class67 var2 = this.field4540;
        if (this.field4536 == var2) {
            this.field4540 = null;
            return null;
        } else {
            this.field4540 = var2.field1220;
            return var2;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lg;BLg;)V")
    public final void method1622(class67 arg0, byte arg1, class67 arg2) {
        field4535++;
        if (arg0.field1212 != null) {
            arg0.method460(true);
        }
        arg0.field1212 = arg2.field1212;
        arg0.field1220 = arg2;
        arg0.field1212.field1220 = arg0;
        arg0.field1220.field1212 = arg0;
        int var4 = -124 % ((-arg1 - 48) / 42);
    }

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "(B)V")
    public static final void method1623(byte arg0) {
        class146.field2749.method30((byte) -80, 58);
        class210.field3988++;
        field4553++;
        class146.field2749.method328(0L, (byte) -120);
        if (arg0 != -113) {
            method1623((byte) -12);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V")
    public class248() {
        this.field4536.field1220 = this.field4536;
        this.field4536.field1212 = this.field4536;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lg;I)V")
    public final void method1624(class67 arg0, int arg1) {
        field4543++;
        if (arg0.field1212 != null) {
            arg0.method460(true);
        }
        arg0.field1212 = this.field4536.field1212;
        arg0.field1220 = this.field4536;
        if (arg1 <= 35) {
            field4552 = null;
        }
        arg0.field1212.field1220 = arg0;
        arg0.field1220.field1212 = arg0;
    }
}
