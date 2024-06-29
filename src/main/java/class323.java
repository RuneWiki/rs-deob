import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public class class323 {

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    public int field4767 = 0;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public int field4770 = 512;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public int field4769 = -1;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "I")
    public int field4761 = 8;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "Z")
    public boolean field4774 = false;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "Z")
    public boolean field4776 = true;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public int field4765 = 1190717;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public int field4775 = -1;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "Z")
    public boolean field4764 = true;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public int field4768 = 127;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public int field4780 = -1;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "I")
    public int field4781 = 64;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field4766 = 0;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field4777 = 4;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "Loj;")
    public static class346 field4762 = new class346(64);

    @OriginalMember(owner = "client!jp", name = "w", descriptor = "[I")
    public static int[] field4783 = new int[1];

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "I")
    public static int field4771;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    public static int field4772;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field4773;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public static int field4778;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public int field4779;

    @OriginalMember(owner = "client!jp", name = "v", descriptor = "Lada;")
    public class149 field4782;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IILjr;)V", line = 4)
    private final void method1959(int arg0, int arg1, class96 arg2) {
        field4763++;
        if (arg1 != -13) {
            this.method1959(-54, 17, null);
        }
        if (arg0 == 1) {
            this.field4767 = class590.method3278(arg2.method736(-126), (byte) -97);
        } else if (arg0 == 2) {
            this.field4775 = arg2.method718(arg1 ^ 0x53);
        } else if (arg0 == 3) {
            this.field4775 = arg2.method743((byte) -34);
            if (this.field4775 == 65535) {
                this.field4775 = -1;
                return;
            }
        } else if (arg0 == 5) {
            this.field4776 = false;
        } else if (arg0 == 7) {
            this.field4780 = class590.method3278(arg2.method736(arg1 - 106), (byte) -97);
            return;
        } else if (arg0 == 8) {
            this.field4782.field2227 = this.field4779;
            return;
        } else if (arg0 == 9) {
            this.field4770 = arg2.method743((byte) -19) << 2;
            return;
        } else if (arg0 == 10) {
            this.field4764 = false;
            return;
        } else if (arg0 == 11) {
            this.field4761 = arg2.method718(arg1 - 67);
            return;
        } else if (arg0 == 12) {
            this.field4774 = true;
            return;
        } else if (arg0 == 13) {
            this.field4765 = arg2.method736(-126);
            return;
        } else {
            if (arg0 == 14) {
                this.field4781 = arg2.method718(arg1 + 134) << 2;
            } else if (arg0 == 15) {
                this.field4769 = arg2.method743((byte) -93);
                if (this.field4769 == 65535) {
                    this.field4769 = -1;
                    return;
                }
                return;
            } else if (arg0 == 16) {
                this.field4768 = arg2.method718(-70);
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V", line = 85)
    public static void method1960(byte arg0) {
        if (arg0 >= 118) {
            field4783 = null;
            field4762 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILjr;)V", line = 108)
    public final void method1961(int arg0, class96 arg1) {
        while (true) {
            int var3 = arg1.method718(103);
            if (var3 == 0) {
                int var4 = -58 % ((arg0 + 84) / 40);
                field4771++;
                return;
            }
            this.method1959(var3, -13, arg1);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(Z)V", line = 151)
    public static final void method1962(boolean arg0) {
        field4773++;
        if (arg0) {
            field4766 = 85;
        }
        if (class646.field9175 == null) {
            class646.field9175 = class675.method3739(30);
            class120.field1650 = class646.field9175[0];
        }
        class675 var1 = class120.field1650;
        int var2 = class473.method2687(121);
        if (class120.field1650 == var1) {
            class463.field6522 = class120.field1650.field9504.method42(class666.field9377, 19572);
            class514.field7031 = class120.field1650.field9499;
            if (class120.field1650.field9500) {
                class463.field6522 = class463.field6522 + var2 + "%";
            }
        } else if (class675.field9540 == class120.field1650) {
            class94.method690(3, (byte) 125);
        } else {
            class463.field6522 = var1.field9509.method42(class666.field9377, 19572);
            class514.field7031 = var1.field9503;
        }
        if (class433.field6132 == null) {
            return;
        }
        for (int var3 = class159.field2379 + 1; var3 < class433.field6132.length; var3++) {
            if (class433.field6132[var3].method1854((byte) -87) >= 100 && (var3 - 1) == class159.field2379 && class340.field4947 >= 1 && class433.field6132[var3].method1855(20709)) {
                class433.field6132[var3].method1857(-128);
                class477.method2710(true, class433.field6132[var3]);
                class159.field2379++;
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)V", line = 231)
    public final void method1963(byte arg0) {
        int var2 = 82 / ((-arg0 - 41) / 36);
        this.field4761 = this.field4761 << 8 | this.field4779;
        if (this.field4769 == -1) {
            this.field4769 = this.field4775;
        }
        field4778++;
    }
}
