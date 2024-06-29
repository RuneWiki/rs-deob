import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class84 {

    @OriginalMember(owner = "client!hc", name = "d", descriptor = "I")
    public int field1023 = 8;

    @OriginalMember(owner = "client!hc", name = "e", descriptor = "I")
    public int field1024 = 16;

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "I")
    public int field1021 = 128;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "I")
    public int field1025 = -1;

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "I")
    public int field1028 = 1190717;

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "I")
    public int field1027 = 0;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "Z")
    public boolean field1020 = true;

    @OriginalMember(owner = "client!hc", name = "n", descriptor = "I")
    public int field1033 = 127;

    @OriginalMember(owner = "client!hc", name = "r", descriptor = "Z")
    public boolean field1037 = false;

    @OriginalMember(owner = "client!hc", name = "o", descriptor = "Z")
    public boolean field1034 = true;

    @OriginalMember(owner = "client!hc", name = "p", descriptor = "I")
    public int field1035 = -1;

    @OriginalMember(owner = "client!hc", name = "s", descriptor = "I")
    public int field1038 = -1;

    @OriginalMember(owner = "client!hc", name = "m", descriptor = "I")
    public static int field1032 = 0;

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!hc", name = "j", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!hc", name = "l", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!hc", name = "q", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!hc", name = "c", descriptor = "Lkl;")
    public class51 field1022;

    @OriginalMember(owner = "client!hc", name = "k", descriptor = "[I")
    public static int[] field1030;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Z)V")
    public static void method475(boolean arg0) {
        field1030 = null;
        if (arg0) {
            method475(false);
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILrp;)V")
    public final void method476(int arg0, class276 arg1) {
        if (arg0 != 21542) {
            method475(false);
        }
        while (true) {
            int var3 = arg1.method1701(arg0 - 44663);
            if (var3 == 0) {
                field1036++;
                return;
            }
            this.method478(var3, arg1, 112);
        }
    }

    @OriginalMember(owner = "client!hc", name = "b", descriptor = "(Z)V")
    public final void method477(boolean arg0) {
        if (!arg0) {
            this.field1023 = 5;
        }
        if (this.field1038 == -1) {
            this.field1038 = this.field1035;
        }
        this.field1023 = this.field1029 | this.field1023 << 8;
        field1026++;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILrp;I)V")
    private final void method478(int arg0, class276 arg1, int arg2) {
        if (arg0 == 1) {
            this.field1027 = class19.method134(65535, arg1.method1748(false));
        } else if (arg0 == 2) {
            this.field1035 = arg1.method1701(-23121);
        } else if (arg0 == 3) {
            this.field1035 = arg1.method1729(65280);
            if (this.field1035 == 65535) {
                this.field1035 = -1;
            }
        } else if (arg0 == 5) {
            this.field1034 = false;
        } else if (arg0 == 7) {
            this.field1025 = class19.method134(65535, arg1.method1748(false));
        } else if (arg0 == 8) {
            this.field1022.field708 = this.field1029;
        } else if (arg0 == 9) {
            this.field1021 = arg1.method1729(65280);
        } else if (arg0 == 10) {
            this.field1020 = false;
        } else if (arg0 == 11) {
            this.field1023 = arg1.method1701(-23121);
        } else if (arg0 == 12) {
            this.field1037 = true;
        } else if (arg0 == 13) {
            this.field1028 = arg1.method1748(false);
        } else if (arg0 == 14) {
            this.field1024 = arg1.method1701(-23121);
        } else if (arg0 == 15) {
            this.field1038 = arg1.method1729(65280);
            if (this.field1038 == 65535) {
                this.field1038 = -1;
            }
        } else if (arg0 == 16) {
            this.field1033 = arg1.method1701(-23121);
        }
        field1031++;
        if (arg2 < 102) {
            this.field1027 = 6;
        }
    }
}
