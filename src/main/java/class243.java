import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class243 {

    @OriginalMember(owner = "client!gb", name = "d", descriptor = "I")
    public int field3612 = 128;

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "I")
    public int field3614 = -1;

    @OriginalMember(owner = "client!gb", name = "h", descriptor = "I")
    public int field3616 = 1190717;

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "I")
    public int field3615 = 8;

    @OriginalMember(owner = "client!gb", name = "e", descriptor = "Z")
    public boolean field3613 = true;

    @OriginalMember(owner = "client!gb", name = "k", descriptor = "I")
    public int field3619 = 16;

    @OriginalMember(owner = "client!gb", name = "p", descriptor = "Z")
    public boolean field3624 = false;

    @OriginalMember(owner = "client!gb", name = "q", descriptor = "Z")
    public boolean field3625 = true;

    @OriginalMember(owner = "client!gb", name = "j", descriptor = "I")
    public int field3618 = -1;

    @OriginalMember(owner = "client!gb", name = "s", descriptor = "I")
    public int field3627 = 0;

    @OriginalMember(owner = "client!gb", name = "l", descriptor = "I")
    public static int field3620 = 64;

    @OriginalMember(owner = "client!gb", name = "b", descriptor = "I")
    public static int field3610 = -1;

    @OriginalMember(owner = "client!gb", name = "r", descriptor = "J")
    public static long field3626 = 0L;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!gb", name = "i", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!gb", name = "m", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!gb", name = "n", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!gb", name = "o", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILsb;I)V", line = 22)
    public final void method1784(int arg0, class190 arg1, int arg2) {
        if (arg2 > -30) {
            this.field3616 = -40;
        }
        field3622++;
        while (true) {
            int var4 = arg1.method1319(255);
            if (var4 == 0) {
                return;
            }
            this.method1788(arg1, 8939, var4, arg0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ZI)I", line = 46)
    public static final int method1785(boolean arg0, int arg1) {
        long var2 = class176.method1234(5574);
        field3623++;
        for (class28 var4 = arg0 ? (class28) class64.field918.method1406(0) : (class28) class64.field918.method1404(-76); var4 != null; var4 = (class28) class64.field918.method1404(-62)) {
            if ((var4.field387 & 0x3FFFFFFFFFFFFFFFL) < var2) {
                if ((var4.field387 & 0x4000000000000000L) != 0L) {
                    int var5 = (int) var4.field1656;
                    class227.field3423[var5] = class307.field4594[var5];
                    var4.method876(8);
                    return var5;
                }
                var4.method876(8);
            }
        }
        if (arg1 < 58) {
            method1785(false, 120);
        }
        return -1;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IB)V", line = 94)
    public static final void method1786(int arg0, byte arg1) {
        class40.field586 = arg0;
        class225.method1647(30750, 3);
        if (arg1 != 76) {
            field3626 = 15L;
        }
        class225.method1647(30750, 4);
        field3611++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V", line = 109)
    public static final void method1787(int arg0, int arg1) {
        if (arg0 != 279311792) {
            method1785(true, -48);
        }
        for (class117 var2 = class144.field2081.method1406(arg0 - 279311792); var2 != null; var2 = class144.field2081.method1404(arg0 - 279311913)) {
            if ((var2.field1656 >> 48 & 0xFFFFL) == (long) arg1) {
                var2.method876(8);
            }
        }
        field3609++;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lsb;III)V", line = 159)
    private final void method1788(class190 arg0, int arg1, int arg2, int arg3) {
        field3617++;
        if (arg1 != 8939) {
            this.field3618 = -22;
        }
        if (arg2 == 1) {
            this.field3627 = class251.method1841(arg0.method1312(96), -124);
        } else if (arg2 == 2) {
            this.field3618 = arg0.method1319(255);
        } else if (arg2 == 3) {
            this.field3618 = arg0.method1317((byte) 125);
            if (this.field3618 == 65535) {
                this.field3618 = -1;
            }
        } else if (arg2 == 5) {
            this.field3625 = false;
        } else if (arg2 == 7) {
            this.field3614 = class251.method1841(arg0.method1312(124), -122);
        } else if (arg2 == 8) {
            class186.field2669 = arg3;
        } else if (arg2 == 9) {
            this.field3612 = arg0.method1317((byte) 24);
        } else if (arg2 == 10) {
            this.field3613 = false;
        } else if (arg2 == 11) {
            this.field3615 = arg0.method1319(255);
        } else if (arg2 == 12) {
            this.field3624 = true;
        } else if (arg2 == 13) {
            this.field3616 = arg0.method1312(58);
        } else if (arg2 == 14) {
            this.field3619 = arg0.method1319(255);
        }
    }
}
