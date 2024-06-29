import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class459 {

    @OriginalMember(owner = "client!av", name = "b", descriptor = "I")
    public int field6865 = 127;

    @OriginalMember(owner = "client!av", name = "f", descriptor = "I")
    public int field6869 = -1;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "I")
    public int field6864 = 0;

    @OriginalMember(owner = "client!av", name = "g", descriptor = "I")
    public int field6870 = 1190717;

    @OriginalMember(owner = "client!av", name = "e", descriptor = "I")
    public int field6868 = 128;

    @OriginalMember(owner = "client!av", name = "h", descriptor = "I")
    public int field6871 = -1;

    @OriginalMember(owner = "client!av", name = "m", descriptor = "Z")
    public boolean field6876 = true;

    @OriginalMember(owner = "client!av", name = "o", descriptor = "I")
    public int field6878 = -1;

    @OriginalMember(owner = "client!av", name = "q", descriptor = "Z")
    public boolean field6880 = true;

    @OriginalMember(owner = "client!av", name = "j", descriptor = "Z")
    public boolean field6873 = false;

    @OriginalMember(owner = "client!av", name = "t", descriptor = "I")
    public int field6883 = 8;

    @OriginalMember(owner = "client!av", name = "r", descriptor = "I")
    public int field6881 = 16;

    @OriginalMember(owner = "client!av", name = "c", descriptor = "Lni;")
    public static class367 field6866 = new class367(13, 7);

    @OriginalMember(owner = "client!av", name = "s", descriptor = "I")
    public static int field6882 = -50;

    @OriginalMember(owner = "client!av", name = "p", descriptor = "F")
    public static float field6879;

    @OriginalMember(owner = "client!av", name = "d", descriptor = "I")
    public static int field6867;

    @OriginalMember(owner = "client!av", name = "i", descriptor = "I")
    public int field6872;

    @OriginalMember(owner = "client!av", name = "k", descriptor = "I")
    public static int field6874;

    @OriginalMember(owner = "client!av", name = "l", descriptor = "I")
    public static int field6875;

    @OriginalMember(owner = "client!av", name = "n", descriptor = "I")
    public static int field6877;

    @OriginalMember(owner = "client!av", name = "u", descriptor = "Ltj;")
    public class134 field6884;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lnj;II)V")
    private final void method2779(class164 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field6864 = class57.method426((byte) -103, arg0.method1090(-1));
        } else if (arg2 == 2) {
            this.field6871 = arg0.method1087(false);
        } else if (arg2 == 3) {
            this.field6871 = arg0.method1074(arg1 ^ 0x25E85E74);
            if (this.field6871 == 65535) {
                this.field6871 = -1;
            }
        } else if (arg2 == 5) {
            this.field6880 = false;
        } else if (arg2 == 7) {
            this.field6878 = class57.method426((byte) -103, arg0.method1090(arg1 + 13035));
        } else if (arg2 == 8) {
            this.field6884.field1801 = this.field6872;
        } else if (arg2 == 9) {
            this.field6868 = arg0.method1074(arg1 ^ 0x25E85E74) << 0;
        } else if (arg2 == 10) {
            this.field6876 = false;
        } else if (arg2 == 11) {
            this.field6883 = arg0.method1087(false);
        } else if (arg2 == 12) {
            this.field6873 = true;
        } else if (arg2 == 13) {
            this.field6870 = arg0.method1090(-1);
        } else if (arg2 == 14) {
            this.field6881 = arg0.method1087(false) << 0;
        } else if (arg2 == 15) {
            this.field6869 = arg0.method1074(-635989152);
            if (this.field6869 == 65535) {
                this.field6869 = -1;
            }
        } else if (arg2 == 16) {
            this.field6865 = arg0.method1087(false);
        }
        field6867++;
        if (arg1 != -13036) {
            this.field6870 = 2;
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(B)V")
    public final void method2780(byte arg0) {
        this.field6883 = this.field6883 << 8 | this.field6872;
        if (arg0 < -73) {
            field6874++;
            if (this.field6869 == -1) {
                this.field6869 = this.field6871;
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(Lnj;I)V")
    public final void method2781(class164 arg0, int arg1) {
        if (arg1 < 71) {
            this.field6876 = false;
        }
        while (true) {
            int var3 = arg0.method1087(false);
            if (var3 == 0) {
                field6875++;
                return;
            }
            this.method2779(arg0, -13036, var3);
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public static void method2782(int arg0) {
        field6866 = null;
        if (arg0 != 8836) {
            method2783(-123);
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
    public static final void method2783(int arg0) {
        field6877++;
        if (class500.field7379 != 3) {
            class139.field1851 = class529.field7752;
        }
        if (arg0 != -4185) {
            method2782(-20);
        }
    }
}
