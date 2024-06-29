import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class210 extends class192 {

    @OriginalMember(owner = "client!og", name = "B", descriptor = "Loh;")
    private class258 field3614 = class301.field5152;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "Loh;")
    public static class258 field3616 = class153.method1046("(R", 125);

    @OriginalMember(owner = "client!og", name = "L", descriptor = "Loh;")
    public static class258 field3624 = class153.method1046("blaugr-Un:", 95);

    @OriginalMember(owner = "client!og", name = "M", descriptor = "Z")
    public static boolean field3625 = true;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!og", name = "E", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field3618;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field3621;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public int field3622;

    @OriginalMember(owner = "client!og", name = "N", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field3627;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public int field3629;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    private int field3632;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "Lfk;")
    public class144 field3623;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "Lfk;")
    private class144 field3633;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "[Lkl;")
    public static class65[] field3619;

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(I)V", line = 5)
    private final void method1381(int arg0) {
        this.field3633 = new class144(this.field3623.method987(-109));
        field3627++;
        if (arg0 == -6) {
            for (class48 var2 = (class48) this.field3623.method985(117); var2 != null; var2 = (class48) this.field3623.method983(-1)) {
                class16 var3 = new class16(var2.field717, (int) var2.field2642);
                this.field3633.method984((byte) 74, var3, var2.field717.method1803(-9598));
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)Z", line = 27)
    public final boolean method1382(int arg0, int arg1) {
        field3615++;
        if (arg0 != 5) {
            return false;
        } else if (this.field3623 == null) {
            return false;
        } else {
            if (this.field3633 == null) {
                this.method1385(false);
            }
            class119 var3 = (class119) this.field3633.method986((long) arg1, 0);
            return var3 != null;
        }
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)Loh;", line = 50)
    public final class258 method1383(int arg0, int arg1) {
        field3621++;
        if (this.field3623 == null) {
            return this.field3614;
        } else {
            class48 var3 = (class48) this.field3623.method986((long) arg1, arg0 ^ arg0);
            return var3 == null ? this.field3614 : var3.field717;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ZI)Z", line = 69)
    public static final boolean method1384(boolean arg0, int arg1) {
        field3617++;
        if (!arg0) {
            field3616 = (class258) null;
        }
        return (arg1 & -arg1) == arg1;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(Z)V", line = 88)
    private final void method1385(boolean arg0) {
        if (arg0) {
            return;
        }
        this.field3633 = new class144(this.field3623.method987(-122));
        for (class119 var2 = (class119) this.field3623.method985(118); var2 != null; var2 = (class119) this.field3623.method983(-1)) {
            class119 var3 = new class119((int) var2.field2642);
            this.field3633.method984((byte) -121, var3, (long) var2.field2107);
        }
        field3620++;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILva;)V", line = 115)
    public final void method1386(int arg0, class235 arg1) {
        field3628++;
        if (arg0 != -1) {
            return;
        }
        while (true) {
            int var3 = arg1.method1589(55);
            if (var3 == 0) {
                return;
            }
            this.method1391(var3, arg1, false);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BI)I", line = 154)
    public final int method1387(byte arg0, int arg1) {
        if (arg0 > -124) {
            this.field3614 = (class258) null;
        }
        field3630++;
        if (this.field3623 == null) {
            return this.field3632;
        } else {
            class119 var3 = (class119) this.field3623.method986((long) arg1, 0);
            return var3 == null ? this.field3632 : var3.field2107;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILoh;)Z", line = 183)
    public final boolean method1388(int arg0, class258 arg1) {
        field3618++;
        if (this.field3623 == null) {
            return false;
        }
        if (this.field3633 == null) {
            this.method1381(arg0 - 8);
        }
        for (class16 var3 = (class16) this.field3633.method986(arg1.method1803(arg0 - 9600), arg0 ^ arg0); var3 != null; var3 = (class16) this.field3633.method982((byte) 123)) {
            if (var3.field211.method1821(arg0 ^ 0xFFFFFFFD, arg1)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(I)Lvi;", line = 209)
    public static final class129 method1389(int arg0) {
        class129 var1 = new class129(class108.field1919, class23.field279, class279.field4795[arg0], class280.field4819[0], class113.field1958[0], class301.field5149[0], class37.field497[0], class121.field2143);
        class290.method2038(arg0 ^ 0x70);
        field3626++;
        return var1;
    }

    @OriginalMember(owner = "client!og", name = "d", descriptor = "(I)V", line = 219)
    public static void method1390(int arg0) {
        field3616 = null;
        field3624 = null;
        if (arg0 == 0) {
            field3619 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILva;Z)V", line = 233)
    private final void method1391(int arg0, class235 arg1, boolean arg2) {
        field3631++;
        if (arg0 == 1) {
            this.field3622 = arg1.method1589(58);
        } else if (arg0 == 2) {
            this.field3629 = arg1.method1589(100);
        } else if (arg0 == 3) {
            this.field3614 = arg1.method1620(81);
        } else if (arg0 == 4) {
            this.field3632 = arg1.method1611(28);
        } else if (arg0 == 5 || arg0 == 6) {
            int var4 = arg1.method1615(16);
            this.field3623 = new class144(class286.method2014(var4, 783135696));
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method1611(-117);
                class154 var7;
                if (arg0 == 5) {
                    var7 = new class48(arg1.method1620(83));
                } else {
                    var7 = new class119(arg1.method1611(75));
                }
                this.field3623.method984((byte) 91, var7, (long) var6);
            }
        }
        if (arg2) {
            field3624 = (class258) null;
        }
    }
}
