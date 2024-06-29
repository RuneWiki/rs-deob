import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class534 {

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Z")
    public boolean field7855 = false;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public int field7856 = -1;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public int field7859 = 127;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public int field7853 = -1;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "I")
    public int field7862 = 8;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field7857 = 0;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public int field7865 = 16;

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "I")
    public int field7867 = 1190717;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public int field7863 = -1;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "Z")
    public boolean field7864 = true;

    @OriginalMember(owner = "client!tf", name = "s", descriptor = "Z")
    public boolean field7871 = true;

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "I")
    public int field7870 = 128;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field7854 = 0;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Lrb;")
    public static class283 field7866 = new class283(13, -1);

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public int field7858;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field7860;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field7861;

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field7869;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "Lrq;")
    public class39 field7868;

    @OriginalMember(owner = "client!tf", name = "t", descriptor = "Lmt;")
    public static class518 field7872;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lsv;I)V", line = 7)
    public final void method3161(class319 arg0, int arg1) {
        if (arg1 != 127) {
            return;
        }
        while (true) {
            int var3 = arg0.method1869(arg1 - 222);
            if (var3 == 0) {
                field7869++;
                return;
            }
            this.method3162((byte) 124, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BLsv;I)V", line = 33)
    private final void method3162(byte arg0, class319 arg1, int arg2) {
        if (arg0 < 122) {
            this.method3162((byte) 81, null, 107);
        }
        if (arg2 == 1) {
            this.field7857 = class279.method1617(arg1.method1852(1086280488), (byte) 111);
        } else if (arg2 == 2) {
            this.field7853 = arg1.method1869(-68);
        } else if (arg2 == 3) {
            this.field7853 = arg1.method1844(-122);
            if (this.field7853 == 65535) {
                this.field7853 = -1;
            }
        } else if (arg2 == 5) {
            this.field7864 = false;
        } else if (arg2 == 7) {
            this.field7856 = class279.method1617(arg1.method1852(1086280488), (byte) 127);
        } else if (arg2 == 8) {
            this.field7868.field588 = this.field7858;
        } else if (arg2 == 9) {
            this.field7870 = arg1.method1844(-105) << 0;
        } else if (arg2 == 10) {
            this.field7871 = false;
        } else if (arg2 == 11) {
            this.field7862 = arg1.method1869(-118);
        } else if (arg2 == 12) {
            this.field7855 = true;
        } else if (arg2 == 13) {
            this.field7867 = arg1.method1852(1086280488);
        } else if (arg2 == 14) {
            this.field7865 = arg1.method1869(-116) << 0;
        } else if (arg2 == 15) {
            this.field7863 = arg1.method1844(-115);
            if (this.field7863 == 65535) {
                this.field7863 = -1;
            }
        } else if (arg2 == 16) {
            this.field7859 = arg1.method1869(-107);
        }
        field7861++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V", line = 116)
    public final void method3163(int arg0) {
        if (this.field7863 == -1) {
            this.field7863 = this.field7853;
        }
        if (arg0 != -30668) {
            this.method3163(-97);
        }
        this.field7862 = this.field7862 << 8 | this.field7858;
        field7860++;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 133)
    public static void method3164(int arg0) {
        field7866 = null;
        field7872 = null;
        if (arg0 > -34) {
            method3164(-87);
        }
    }
}
