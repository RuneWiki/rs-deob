import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class552 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "I")
    public int field7800 = -1;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "Z")
    public boolean field7805 = true;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
    public int field7806 = 127;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "I")
    public int field7803 = 0;

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Z")
    public boolean field7807 = true;

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Z")
    public boolean field7815 = false;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public int field7809 = 1190717;

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public int field7810 = 512;

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "I")
    public int field7813 = 64;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public int field7812 = 8;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public int field7814 = -1;

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Ljava/lang/String;")
    public static String field7816 = "";

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public int field7799;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "I")
    public static int field7802;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field7804;

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "I")
    public static int field7811;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field7817;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "Leq;")
    public class140 field7801;

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Lfg;")
    public static class436 field7808;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
    public final void method3294(byte arg0) {
        if (arg0 < -13) {
            this.field7812 = this.field7799 | this.field7812 << 8;
            field7802++;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Ljava/lang/String;Z)J")
    public static final long method3295(String arg0, boolean arg1) {
        field7817++;
        int var2 = arg0.length();
        long var3 = 0L;
        int var5 = 0;
        if (!arg1) {
            return -115L;
        }
        while (var2 > var5) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
            var5++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(ILvj;I)V")
    private final void method3296(int arg0, class26 arg1, int arg2) {
        if (arg2 == 1) {
            this.field7803 = class344.method1977(arg1.method186((byte) 116), (byte) 88);
        } else if (arg2 == 2) {
            this.field7814 = arg1.method194((byte) 119);
        } else if (arg2 == 3) {
            this.field7814 = arg1.method193(2);
            if (this.field7814 == 65535) {
                this.field7814 = -1;
            }
        } else if (arg2 == 5) {
            this.field7807 = false;
        } else if (arg2 == 7) {
            this.field7800 = class344.method1977(arg1.method186((byte) 109), (byte) 88);
        } else if (arg2 == 8) {
            this.field7801.field1937 = this.field7799;
        } else if (arg2 == 9) {
            this.field7810 = arg1.method193(2) << 2;
        } else if (arg2 == 10) {
            this.field7805 = false;
        } else if (arg2 == 11) {
            this.field7812 = arg1.method194((byte) 119);
        } else if (arg2 == 12) {
            this.field7815 = true;
        } else if (arg2 == 13) {
            this.field7809 = arg1.method186((byte) 112);
        } else if (arg2 == 14) {
            this.field7813 = arg1.method194((byte) 119) << 2;
        } else if (arg2 == 16) {
            this.field7806 = arg1.method194((byte) 119);
        }
        field7811++;
        if (arg0 != 9039) {
            method3295(null, false);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method3297(int arg0) {
        if (arg0 != -10316) {
            method3295(null, true);
        }
        field7808 = null;
        field7816 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lvj;I)V")
    public final void method3298(class26 arg0, int arg1) {
        field7804++;
        while (true) {
            int var3 = arg0.method194((byte) 119);
            if (var3 == 0) {
                if (arg1 == 0) {
                    return;
                } else {
                    this.method3294((byte) 52);
                    return;
                }
            }
            this.method3296(9039, arg0, var3);
        }
    }
}
