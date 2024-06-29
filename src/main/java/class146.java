import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class146 extends class555 {

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "Z")
    private boolean field1964 = false;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "I")
    public static int field1960;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Lr;")
    public static class562 field1963;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IJ)V", line = 4)
    public static final void method832(int arg0, long arg1) {
        if (class153.field2168 != null) {
            if (class311.field4200 != 1 && ~class311.field4200 != -6) {
                if (~class311.field4200 == -5) {
                    class134.method777(arg1, false);
                }
            } else {
                class310.method1826(arg1, 0);
            }
        }
        ++field1958;
        int var3 = 67 % ((-4 - arg0) / 34);
        class315.method1841((byte) -78, field1963, (long) class327.field4404);
        if (class164.field2349 != -1) {
            class327.method1904(class164.field2349, -1);
        }
        for (int var4 = 0; ~var4 > ~class629.field8707; ++var4) {
            if (class325.field4383[var4]) {
                class13.field166[var4] = true;
            }
            class14.field174[var4] = class325.field4383[var4];
            class325.field4383[var4] = false;
        }
        class297.field3932 = class327.field4404;
        if (~class164.field2349 != 0) {
            class629.field8707 = 0;
            class688.method3890(29326);
        }
        field1963.method1044();
        class317.method1849((byte) -115, field1963);
        int var5 = class368.method2136(true);
        if (var5 == -1) {
            var5 = class689.field9739;
        }
        if (var5 == -1) {
            var5 = class420.field5510;
        }
        class665.method3790((byte) -112, var5);
        class368.method2137(class408.field5369.field385, class408.field5369.field398, false, class498.field6849, class408.field5369.field397);
        class498.field6849 = 0;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZZ)V", line = 66)
    public final void method124(boolean arg0, boolean arg1) {
        ++field1957;
        class530 var3 = super.field7580.method3645((byte) 124);
        if (!arg0) {
            this.method126(-109, -7, 30);
        }
        if (var3 != null && arg1) {
            super.field7580.method3635(true, 1);
            super.field7580.method3613((byte) 102, var3);
            super.field7580.method2034((byte) -17, class112.field1431);
            super.field7580.method3635(arg0, 1);
            super.field7580.method3672((byte) 37, class298.field3941, class305.field4076);
            super.field7580.method2011(2, class533.field7324, 12080, false, true);
            super.field7580.method3666(0, class502.field6912, (byte) -83);
            class149 var4 = super.field7580.method3682(74);
            var4.method854(true, super.field7580.method3625((byte) 70));
            super.field7580.method3616(class254.field3330, false);
            super.field7580.method3635(true, 0);
            this.field1964 = true;
        } else {
            super.field7580.method3666(0, class502.field6912, (byte) -83);
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZI)V", line = 97)
    public final void method117(boolean arg0, int arg1) {
        ++field1962;
        if (arg1 == -13443) {
            super.field7580.method3672((byte) -78, class298.field3941, class274.field3642);
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(I)Z", line = 109)
    public final boolean method125(int arg0) {
        if (arg0 != -20112) {
            this.field1964 = true;
        }
        ++field1960;
        return true;
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lqq;)V", line = 121)
    public class146(class651 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(III)V", line = 128)
    public static final void method833(int arg0, int arg1, int arg2) {
        class207 var3 = class153.field2168[arg0][arg1][arg2];
        if (var3 != null) {
            class454.method2557(var3.field2763);
            class454.method2557(var3.field2764);
            if (var3.field2763 != null) {
                var3.field2763 = null;
            }
            if (var3.field2764 != null) {
                var3.field2764 = null;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(B)V", line = 143)
    public static void method834(byte arg0) {
        if (arg0 > 49) {
            field1963 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lot;BI)V", line = 154)
    public final void method127(class222 arg0, byte arg1, int arg2) {
        if (arg1 > -93) {
            this.field1964 = false;
        }
        ++field1966;
        super.field7580.method3613((byte) 99, arg0);
        super.field7580.method3676(arg2, (byte) -84);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(III)V", line = 166)
    public final void method126(int arg0, int arg1, int arg2) {
        ++field1961;
        if (arg0 < 81) {
            this.field1964 = false;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Ljava/awt/Canvas;IILfa;)Lr;", line = 176)
    public static final class562 method835(Canvas arg0, int arg1, int arg2, class522 arg3) {
        if (arg1 != 0) {
            method833(11, -103, 100);
        }
        ++field1967;
        return new class469(arg0, arg3, arg2);
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)V", line = 187)
    public static final void method836(int arg0) {
        class328.method1911(22050, class602.field8408.field4339, 2, (byte) -116);
        ++field1965;
        class335.field4536 = new class51();
        class335.field4536.method296(128, -8280, 9);
        class546.field7467 = class685.method3879(0, class583.field7996, class312.field4206, 22050, -1024);
        class546.field7467.method3086(class335.field4536, 50);
        class436.method2469((byte) 109, class335.field4536, class56.field728, class3.field8, class537.field7372);
        class62.field781 = class685.method3879(1, class583.field7996, class312.field4206, 2048, -1024);
        class126.field1759 = new class212();
        class62.field781.method3086(class126.field1759, 50);
        class383.field5057 = new class112(22050, class169.field2422);
        class436.field5812 = class654.field9309.method1959(5743, "scape main");
        if (arg0 < 27) {
            field1963 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V", line = 212)
    public final void method121(byte arg0) {
        if (arg0 > 45) {
            if (this.field1964) {
                super.field7580.method3635(true, 1);
                super.field7580.method2034((byte) -17, class583.field7982);
                super.field7580.method3672((byte) 61, class274.field3642, class274.field3642);
                super.field7580.method3624(class137.field1869, -128, 2);
                super.field7580.method3666(0, class630.field8719, (byte) -83);
                super.field7580.method3668(0);
                super.field7580.method3613((byte) 101, (class222) null);
                super.field7580.method3635(true, 0);
                this.field1964 = false;
            } else {
                super.field7580.method3666(0, class630.field8719, (byte) -83);
            }
            ++field1959;
            super.field7580.method3672((byte) 64, class274.field3642, class274.field3642);
        }
    }
}
