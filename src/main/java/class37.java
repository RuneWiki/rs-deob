import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class37 {

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "Ltf;")
    public class161 field459 = new class161();

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "Lal;")
    public static class52 field464 = new class52(500);

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field471 = -1;

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public static int field460;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public static int field463;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field465;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public static int field466;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "I")
    public static int field467;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "I")
    public static int field468;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field472;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public static int field473;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field474;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "I")
    public static int field475;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "I")
    public static int field476;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "Ltf;")
    private class161 field469;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "Lmo;")
    public static class447 field470;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)I", line = 4)
    public final int method241(byte arg0) {
        field461++;
        int var2 = 0;
        if (arg0 < 91) {
            return -95;
        } else {
            for (class161 var3 = this.field459.field2537; var3 != this.field459; var3 = var3.field2537) {
                var2++;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)I", line = 25)
    public static int method242(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V", line = 34)
    public static void method243(int arg0) {
        field470 = null;
        if (arg0 != 500) {
            field464 = null;
        }
        field464 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZIZB)Lmo;", line = 53)
    public static final class447 method244(int arg0, boolean arg1, int arg2, boolean arg3, byte arg4) {
        if (arg4 != -108) {
            field470 = null;
        }
        field474++;
        class333 var5 = null;
        if (class107.field1504 != null) {
            var5 = new class333(arg2, class107.field1504, class126.field1934[arg2], 1000000);
        }
        class106.field1495[arg2] = class362.field5528.method2191(class272.field4372, (byte) 85, arg2, var5);
        if (arg1) {
            class106.field1495[arg2].method1968((byte) 109);
        }
        return new class447(class106.field1495[arg2], arg3, arg0);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILtf;)V", line = 77)
    public final void method245(int arg0, class161 arg1) {
        field475++;
        if (arg1.field2536 != null) {
            arg1.method1120(arg0 - 426);
        }
        arg1.field2537 = this.field459;
        if (arg0 == 500) {
            arg1.field2536 = this.field459.field2536;
            arg1.field2536.field2537 = arg1;
            arg1.field2537.field2536 = arg1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Z", line = 96)
    public final boolean method246(byte arg0) {
        field478++;
        if (arg0 != 75) {
            field464 = null;
        }
        return this.field459.field2537 == this.field459;
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(B)Ltf;", line = 110)
    public final class161 method247(byte arg0) {
        field467++;
        class161 var2 = this.field469;
        int var3 = -2 / ((-arg0 - 59) / 58);
        if (this.field459 == var2) {
            this.field469 = null;
            return null;
        } else {
            this.field469 = var2.field2537;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "(I)Ltf;", line = 131)
    public final class161 method248(int arg0) {
        field473++;
        class161 var2 = this.field459.field2537;
        if (arg0 != -24951) {
            return null;
        } else if (this.field459 == var2) {
            return null;
        } else {
            var2.method1120(45);
            return var2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIILjava/lang/String;I)V", line = 150)
    public static final void method249(int arg0, int arg1, int arg2, int arg3, int arg4, String arg5, int arg6) {
        if (arg6 != 500) {
            return;
        }
        field466++;
        class32 var7 = new class32();
        var7.field403 = arg1;
        var7.field399 = arg0;
        var7.field401 = arg5;
        var7.field396 = class183.field2987 + arg4;
        var7.field397 = arg3;
        var7.field394 = arg2;
        class139.field2161.method2442(var7, (byte) 120);
    }

    @OriginalMember(owner = "client!bd", name = "<init>", descriptor = "()V", line = 240)
    public class37() {
        this.field459.field2536 = this.field459;
        this.field459.field2537 = this.field459;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ltf;I)V", line = 173)
    public final void method250(class161 arg0, int arg1) {
        field476++;
        if (arg0.field2536 != null) {
            arg0.method1120(95);
        }
        arg0.field2537 = this.field459.field2537;
        arg0.field2536 = this.field459;
        arg0.field2536.field2537 = arg0;
        arg0.field2537.field2536 = arg0;
        if (arg1 <= 20) {
            this.method245(85, (class161) null);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ltf;ILbd;)V", line = 193)
    private final void method251(class161 arg0, int arg1, class37 arg2) {
        field460++;
        class161 var4 = this.field459.field2536;
        this.field459.field2536 = arg0.field2536;
        arg0.field2536.field2537 = this.field459;
        if (arg1 == 0 && this.field459 != arg0) {
            arg0.field2536 = arg2.field459.field2536;
            arg0.field2536.field2537 = arg0;
            var4.field2537 = arg2.field459;
            arg2.field459.field2536 = var4;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 225)
    public static final String method252(String arg0, int arg1) {
        field468++;
        if (arg1 != 1000000) {
            return null;
        }
        String var2 = class133.method977(class158.method1112(arg0, (byte) -57), -101);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(B)Ltf;", line = 250)
    public final class161 method253(byte arg0) {
        field472++;
        class161 var2 = this.field459.field2537;
        if (arg0 != -6) {
            return null;
        } else if (this.field459 == var2) {
            this.field469 = null;
            return null;
        } else {
            this.field469 = var2.field2537;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "(I)Ltf;", line = 275)
    public final class161 method254(int arg0) {
        field462++;
        class161 var2 = this.field469;
        int var3 = -51 % ((arg0 - 69) / 44);
        if (this.field459 == var2) {
            this.field469 = null;
            return null;
        } else {
            this.field469 = var2.field2536;
            return var2;
        }
    }

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "(I)V", line = 300)
    public final void method255(int arg0) {
        if (arg0 != -20994) {
            return;
        }
        while (true) {
            class161 var2 = this.field459.field2537;
            if (this.field459 == var2) {
                field463++;
                this.field469 = null;
                return;
            }
            var2.method1120(-89);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ZLbd;)V", line = 325)
    public final void method256(boolean arg0, class37 arg1) {
        if (!arg0) {
            field465++;
            this.method251(this.field459.field2537, 0, arg1);
        }
    }

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "(I)Ltf;", line = 337)
    public final class161 method257(int arg0) {
        field477++;
        class161 var2 = this.field459.field2536;
        if (this.field459 == var2) {
            this.field469 = null;
            return null;
        } else {
            this.field469 = var2.field2536;
            return arg0 >= -91 ? null : var2;
        }
    }
}
