import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class341 extends class308 {

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "Ljava/lang/String;")
    private String field5499 = "null";

    @OriginalMember(owner = "client!nk", name = "K", descriptor = "I")
    public static int field5494 = 0;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "I")
    public static int field5502 = -1;

    @OriginalMember(owner = "client!nk", name = "A", descriptor = "C")
    public char field5485;

    @OriginalMember(owner = "client!nk", name = "G", descriptor = "C")
    public char field5491;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!nk", name = "C", descriptor = "I")
    public static int field5487;

    @OriginalMember(owner = "client!nk", name = "D", descriptor = "I")
    public static int field5488;

    @OriginalMember(owner = "client!nk", name = "E", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!nk", name = "H", descriptor = "I")
    public static int field5492;

    @OriginalMember(owner = "client!nk", name = "J", descriptor = "I")
    public static int field5493;

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    public static int field5496;

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    private int field5497;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field5498;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    public static int field5500;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field5501;

    @OriginalMember(owner = "client!nk", name = "F", descriptor = "Lnm;")
    public static class221 field5490;

    @OriginalMember(owner = "client!nk", name = "B", descriptor = "Lil;")
    public class4 field5486;

    @OriginalMember(owner = "client!nk", name = "L", descriptor = "Lil;")
    private class4 field5495;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lfh;IB)V", line = 4)
    private final void method2403(class313 arg0, int arg1, byte arg2) {
        field5501++;
        if (arg1 == 1) {
            this.field5485 = class121.method782(false, arg0.method2200(45));
        } else if (arg1 == 2) {
            this.field5491 = class121.method782(false, arg0.method2200(92));
        } else if (arg1 == 3) {
            this.field5499 = arg0.method2198(-430);
        } else if (arg1 == 4) {
            this.field5497 = arg0.method2231((byte) -124);
        } else if (arg1 == 5 || arg1 == 6) {
            int var4 = arg0.method2250(-1613178296);
            this.field5486 = new class4(class329.method2347(var4, (byte) -96));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg0.method2231((byte) -128);
                class159 var7;
                if (arg1 == 5) {
                    var7 = new class182(arg0.method2198(-430));
                } else {
                    var7 = new class94(arg0.method2231((byte) -127));
                }
                this.field5486.method37(false, var7, (long) var6);
            }
        }
        if (arg2 != 67) {
            field5490 = (class221) null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "(I)V", line = 60)
    private final void method2404(int arg0) {
        field5493++;
        if (arg0 != 4) {
            this.field5486 = (class4) null;
        }
        this.field5495 = new class4(this.field5486.method32(-3));
        for (class182 var2 = (class182) this.field5486.method27(127); var2 != null; var2 = (class182) this.field5486.method34(8)) {
            class107 var3 = new class107(var2.field2826, (int) var2.field2549);
            this.field5495.method37(false, var3, class192.method1325(var2.field2826, arg0 - 97));
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(B)I", line = 84)
    public static final int method2405(byte arg0) {
        field5487++;
        if (arg0 == -18) {
            return class58.field873 == 0 ? 0 : class207.field3153[class58.field873].method121();
        } else {
            return 55;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 108)
    public final boolean method2406(int arg0, String arg1) {
        field5489++;
        if (this.field5486 == null) {
            return false;
        }
        int var3 = -47 % ((-arg0 - 54) / 57);
        if (this.field5495 == null) {
            this.method2404(4);
        }
        for (class107 var4 = (class107) this.field5495.method29(class192.method1325(arg1, -86), 103); var4 != null; var4 = (class107) this.field5495.method39(-414)) {
            if (var4.field1536.equals(arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Z)V", line = 137)
    public static void method2407(boolean arg0) {
        if (arg0) {
            method2405((byte) 53);
        }
        field5490 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)Z", line = 151)
    public final boolean method2408(int arg0, int arg1) {
        field5500++;
        if (this.field5486 == null) {
            return false;
        }
        if (this.field5495 == null) {
            this.method2412(true);
        }
        if (arg0 > -21) {
            this.method2411((class313) null, false);
        }
        class94 var3 = (class94) this.field5495.method29((long) arg1, 103);
        return var3 != null;
    }

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "(I)V", line = 175)
    public static final void method2409(int arg0) {
        class39.field583.method651(0);
        class23.field342.method651(0);
        if (arg0 == -15193) {
            class268.field4422.method651(0);
            field5488++;
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(ZI)I", line = 189)
    public final int method2410(boolean arg0, int arg1) {
        field5498++;
        if (this.field5486 == null) {
            return this.field5497;
        }
        class94 var3 = (class94) this.field5486.method29((long) arg1, 103);
        if (var3 == null) {
            return this.field5497;
        } else {
            if (arg0) {
                this.method2412(false);
            }
            return var3.field1373;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lfh;Z)V", line = 213)
    public final void method2411(class313 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method2224(-121);
            if (var3 == 0) {
                field5492++;
                if (arg1) {
                    this.method2413(117, -113);
                }
                return;
            }
            this.method2403(arg0, var3, (byte) 67);
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V", line = 231)
    private final void method2412(boolean arg0) {
        this.field5495 = new class4(this.field5486.method32(-3));
        field5484++;
        if (arg0) {
            for (class94 var2 = (class94) this.field5486.method27(125); var2 != null; var2 = (class94) this.field5486.method34(8)) {
                class94 var3 = new class94((int) var2.field2549);
                this.field5495.method37(false, var3, (long) var2.field1373);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(II)Ljava/lang/String;", line = 266)
    public final String method2413(int arg0, int arg1) {
        field5496++;
        if (this.field5486 == null) {
            return this.field5499;
        }
        class182 var3 = (class182) this.field5486.method29((long) arg0, 103);
        if (arg1 != 4) {
            this.field5495 = (class4) null;
        }
        return var3 == null ? this.field5499 : var3.field2826;
    }
}
