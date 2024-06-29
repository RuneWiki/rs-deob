import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class308 {

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "Ljava/lang/String;")
    private String field4482 = "null";

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "Lkp;")
    public static class464 field4477 = new class464();

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field4490 = -2;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "C")
    public char field4487;

    @OriginalMember(owner = "client!rn", name = "p", descriptor = "C")
    public char field4491;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "I")
    private int field4481;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "I")
    public static int field4486;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!rn", name = "q", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Lica;")
    public class205 field4479;

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "Lica;")
    private class205 field4489;

    @OriginalMember(owner = "client!rn", name = "r", descriptor = "Ldda;")
    public static class597 field4493;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(B)V")
    private final void method1887(byte arg0) {
        field4492++;
        this.field4489 = new class205(this.field4479.method1334(-52));
        if (arg0 < 119) {
            this.method1895(-47, true);
        }
        for (class269 var2 = (class269) this.field4479.method1331(-1925); var2 != null; var2 = (class269) this.field4479.method1340((byte) 94)) {
            class269 var3 = new class269((int) var2.field7465);
            this.field4489.method1341(var3, (byte) 50, (long) var2.field3986);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(II)Ljava/lang/String;")
    public final String method1888(int arg0, int arg1) {
        field4480++;
        if (this.field4479 == null) {
            return this.field4482;
        }
        if (arg1 > -71) {
            this.method1888(-27, 121);
        }
        class647 var3 = (class647) this.field4479.method1333((long) arg0, false);
        return var3 == null ? this.field4482 : var3.field9387;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IB)I")
    public final int method1889(int arg0, byte arg1) {
        field4476++;
        if (this.field4479 == null) {
            return this.field4481;
        }
        class269 var3 = (class269) this.field4479.method1333((long) arg0, false);
        if (var3 == null) {
            return this.field4481;
        } else if (arg1 == -121) {
            return var3.field3986;
        } else {
            return -77;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public final boolean method1890(String arg0, byte arg1) {
        field4485++;
        if (this.field4479 == null) {
            return false;
        }
        if (this.field4489 == null) {
            this.method1891(-3);
        }
        for (class412 var3 = (class412) this.field4489.method1333(class74.method433((byte) 99, arg0), false); var3 != null; var3 = (class412) this.field4489.method1338(-1)) {
            if (var3.field5865.equals(arg0)) {
                return true;
            }
        }
        if (arg1 != -9) {
            this.field4487 = 'v';
        }
        return false;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(I)V")
    private final void method1891(int arg0) {
        field4488++;
        this.field4489 = new class205(this.field4479.method1334(-50));
        class647 var2 = (class647) this.field4479.method1331(-1925);
        if (arg0 != -3) {
            return;
        }
        while (var2 != null) {
            class412 var3 = new class412(var2.field9387, (int) var2.field7465);
            this.field4489.method1341(var3, (byte) -124, class74.method433((byte) 99, var2.field9387));
            var2 = (class647) this.field4479.method1340((byte) 77);
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILps;I)V")
    private final void method1892(int arg0, class428 arg1, int arg2) {
        if (~arg2 == arg0) {
            this.field4487 = class281.method1772(true, arg1.method2570((byte) 57));
        } else if (arg2 == 2) {
            this.field4491 = class281.method1772(true, arg1.method2570((byte) 57));
        } else if (arg2 == 3) {
            this.field4482 = arg1.method2585(-13);
        } else if (arg2 == 4) {
            this.field4481 = arg1.method2589(arg0 ^ 0x2BAB);
        } else if (arg2 == 5 || arg2 == 6) {
            int var4 = arg1.method2620(62);
            this.field4479 = new class205(class479.method2908((byte) -99, var4));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method2589(-11179);
                class496 var7;
                if (arg2 == 5) {
                    var7 = new class647(arg1.method2585(122));
                } else {
                    var7 = new class269(arg1.method2589(-11179));
                }
                this.field4479.method1341(var7, (byte) 125, (long) var6);
            }
        }
        field4478++;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILps;)V")
    public final void method1893(int arg0, class428 arg1) {
        field4483++;
        if (arg0 >= -1) {
            field4490 = 114;
        }
        while (true) {
            int var3 = arg1.method2561((byte) 127);
            if (var3 == 0) {
                return;
            }
            this.method1892(-2, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(I)V")
    public static void method1894(int arg0) {
        if (arg0 <= 42) {
            method1894(-65);
        }
        field4493 = null;
        field4477 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IZ)Z")
    public final boolean method1895(int arg0, boolean arg1) {
        field4484++;
        if (this.field4479 == null) {
            return false;
        }
        if (this.field4489 == null) {
            this.method1887((byte) 127);
        }
        class269 var3 = (class269) this.field4489.method1333((long) arg0, arg1);
        return var3 != null;
    }
}
