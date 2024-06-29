import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class425 {

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "I")
    public int field5723 = 0;

    @OriginalMember(owner = "client!sv", name = "g", descriptor = "I")
    public int field5729 = -1;

    @OriginalMember(owner = "client!sv", name = "j", descriptor = "Z")
    public boolean field5732 = true;

    @OriginalMember(owner = "client!sv", name = "e", descriptor = "I")
    public int field5727 = 127;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "I")
    public int field5737 = 512;

    @OriginalMember(owner = "client!sv", name = "n", descriptor = "Z")
    public boolean field5736 = false;

    @OriginalMember(owner = "client!sv", name = "k", descriptor = "I")
    public int field5733 = 64;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public int field5739 = -1;

    @OriginalMember(owner = "client!sv", name = "v", descriptor = "Z")
    public boolean field5744 = true;

    @OriginalMember(owner = "client!sv", name = "u", descriptor = "I")
    public int field5743 = 8;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public int field5741 = 1190717;

    @OriginalMember(owner = "client!sv", name = "h", descriptor = "S")
    public static short field5730 = 1;

    @OriginalMember(owner = "client!sv", name = "f", descriptor = "Ljw;")
    public static class259 field5728 = new class259(10, 5);

    @OriginalMember(owner = "client!sv", name = "b", descriptor = "I")
    public static int field5724;

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "I")
    public static int field5725;

    @OriginalMember(owner = "client!sv", name = "d", descriptor = "I")
    public static int field5726;

    @OriginalMember(owner = "client!sv", name = "i", descriptor = "I")
    public int field5731;

    @OriginalMember(owner = "client!sv", name = "l", descriptor = "I")
    public static int field5734;

    @OriginalMember(owner = "client!sv", name = "m", descriptor = "I")
    public static int field5735;

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public static int field5740;

    @OriginalMember(owner = "client!sv", name = "t", descriptor = "I")
    public static int field5742;

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "Llp;")
    public class202 field5738;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)V", line = 13)
    public static void method2407(int arg0) {
        if (arg0 > -110) {
            field5728 = null;
        }
        field5728 = null;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BII)Z", line = 23)
    public static final boolean method2408(byte arg0, int arg1, int arg2) {
        if (arg0 != -120) {
            field5728 = null;
        }
        field5734++;
        return (arg2 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(ILio;I)V", line = 34)
    private final void method2409(int arg0, class157 arg1, int arg2) {
        if (arg2 == 1) {
            this.field5723 = class68.method381(-1, arg1.method933((byte) 1));
        } else if (arg2 == 2) {
            this.field5739 = arg1.method930(255);
        } else if (arg2 == 3) {
            this.field5739 = arg1.method963(-121);
            if (this.field5739 == 65535) {
                this.field5739 = -1;
            }
        } else if (arg2 == 5) {
            this.field5744 = false;
        } else if (arg2 == 7) {
            this.field5729 = class68.method381(arg0 ^ 0xFFFF0000, arg1.method933((byte) 1));
        } else if (arg2 == 8) {
            this.field5738.field2722 = this.field5731;
        } else if (arg2 == 9) {
            this.field5737 = arg1.method963(-127) << 2;
        } else if (arg2 == 10) {
            this.field5732 = false;
        } else if (arg2 == 11) {
            this.field5743 = arg1.method930(255);
        } else if (arg2 == 12) {
            this.field5736 = true;
        } else if (arg2 == 13) {
            this.field5741 = arg1.method933((byte) 1);
        } else if (arg2 == 14) {
            this.field5733 = arg1.method930(255) << 2;
        } else if (arg2 == 16) {
            this.field5727 = arg1.method930(255);
        }
        field5740++;
        if (arg0 != 65535) {
            this.field5723 = -99;
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BLio;)V", line = 115)
    public final void method2410(byte arg0, class157 arg1) {
        if (arg0 != -106) {
            return;
        }
        while (true) {
            int var3 = arg1.method930(255);
            if (var3 == 0) {
                field5735++;
                return;
            }
            this.method2409(65535, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(Z)V", line = 139)
    public final void method2411(boolean arg0) {
        if (!arg0) {
            method2412((byte) 71, 102);
        }
        field5724++;
        this.field5743 = this.field5731 | this.field5743 << 8;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)V", line = 151)
    public static final void method2412(byte arg0, int arg1) {
        field5725++;
        class10.field102 = -1;
        class158.field2276 = 3;
        if (arg0 >= -70) {
            method2412((byte) 80, 73);
        }
        class321.field4289 = 100;
        class619.field8600 = arg1;
    }
}
