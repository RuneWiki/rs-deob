import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class218 {

    @OriginalMember(owner = "client!el", name = "s", descriptor = "Lql;")
    public class297 field3525 = new class297();

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Lma;")
    public static class5 field3509 = class12.method119("Nehmen", (byte) 126);

    @OriginalMember(owner = "client!el", name = "i", descriptor = "[I")
    public static int[] field3515 = new int[1000];

    @OriginalMember(owner = "client!el", name = "d", descriptor = "[I")
    public static int[] field3510 = new int[100];

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public static int field3526 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "Lma;")
    public static class5 field3514 = class12.method119("loginscreen", (byte) 114);

    @OriginalMember(owner = "client!el", name = "q", descriptor = "Lma;")
    public static class5 field3523 = class12.method119("blaugr-Un:", (byte) 117);

    @OriginalMember(owner = "client!el", name = "v", descriptor = "I")
    public static int field3528 = -1;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "I")
    public static int field3508;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field3513;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "I")
    public static int field3520;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!el", name = "u", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!el", name = "w", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!el", name = "x", descriptor = "Lql;")
    private class297 field3530;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "Ljava/awt/Font;")
    public static Font field3507;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[I")
    public static int[] field3517;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)I", line = 6)
    public final int method1473(int arg0) {
        field3512++;
        class297 var2 = this.field3525.field5005;
        int var3 = arg0;
        while (this.field3525 != var2) {
            var2 = var2.field5005;
            var3++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V", line = 29)
    public final void method1474(byte arg0) {
        if (arg0 <= 7) {
            this.method1473(-89);
        }
        field3519++;
        while (true) {
            class297 var2 = this.field3525.field5005;
            if (this.field3525 == var2) {
                this.field3530 = null;
                return;
            }
            var2.method1997(-27381);
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(I)Lql;", line = 52)
    public final class297 method1475(int arg0) {
        field3527++;
        if (arg0 != 14) {
            return (class297) null;
        }
        class297 var2 = this.field3525.field5005;
        if (this.field3525 == var2) {
            this.field3530 = null;
            return null;
        } else {
            this.field3530 = var2.field5005;
            return var2;
        }
    }

    @OriginalMember(owner = "client!el", name = "b", descriptor = "(B)Lql;", line = 73)
    public final class297 method1476(byte arg0) {
        field3516++;
        class297 var2 = this.field3530;
        if (arg0 != -104) {
            return (class297) null;
        } else if (this.field3525 == var2) {
            this.field3530 = null;
            return null;
        } else {
            this.field3530 = var2.field4998;
            return var2;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ZLql;)V", line = 95)
    public final void method1477(boolean arg0, class297 arg1) {
        if (arg0) {
            return;
        }
        field3529++;
        if (arg1.field4998 != null) {
            arg1.method1997(-27381);
        }
        arg1.field5005 = this.field3525.field5005;
        arg1.field4998 = this.field3525;
        arg1.field4998.field5005 = arg1;
        arg1.field5005.field4998 = arg1;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(B)Lod;", line = 122)
    public static final class197 method1478(byte arg0) {
        field3518++;
        try {
            return arg0 < 33 ? (class197) null : (class197) Class.forName("vh").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(B)Lql;", line = 137)
    public final class297 method1479(byte arg0) {
        field3511++;
        class297 var2 = this.field3525.field4998;
        if (this.field3525 == var2) {
            this.field3530 = null;
            return null;
        } else {
            this.field3530 = var2.field4998;
            return arg0 > -95 ? (class297) null : var2;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILii;)V", line = 168)
    public static final void method1480(int arg0, class221 arg1) {
        field3508++;
        if (class113.field1689 != null) {
            try {
                class113.field1689.method198((byte) -83, 0L);
                class113.field1689.method197(arg1.field3617, arg1.field3610, 24, arg0 - 25);
            } catch (Exception var3) {
            }
        }
        arg1.field3610 += arg0;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)Lql;", line = 186)
    public final class297 method1481(boolean arg0) {
        field3520++;
        if (!arg0) {
            method1482(6, (class202) null, 50, (byte) -119);
        }
        class297 var2 = this.field3525.field5005;
        if (this.field3525 == var2) {
            return null;
        } else {
            var2.method1997(-27381);
            return var2;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILni;IB)[Lla;", line = 208)
    public static final class178[] method1482(int arg0, class202 arg1, int arg2, byte arg3) {
        field3522++;
        if (arg3 != -44) {
            method1478((byte) 40);
        }
        return class180.method1171(arg2, arg0, arg1, (byte) -128) ? class104.method662(121) : null;
    }

    @OriginalMember(owner = "client!el", name = "c", descriptor = "(I)V", line = 229)
    public static void method1483(int arg0) {
        field3514 = null;
        field3517 = null;
        field3510 = null;
        field3507 = null;
        field3515 = null;
        if (arg0 != -20046) {
            field3510 = (int[]) null;
        }
        field3523 = null;
        field3509 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(II)I", line = 248)
    public static final int method1484(int arg0, int arg1) {
        field3521++;
        if (class211.field3361 == 1) {
            return 7;
        } else if (class211.field3361 == 2) {
            return 20;
        } else if (arg0 == 15) {
            return 13;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 22) {
            return 8;
        } else if (arg0 == 31) {
            return 14;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 43) {
            return 15;
        } else if (arg0 == 48) {
            return 17;
        } else if (arg0 == 58) {
            return 11;
        } else if (arg0 == 69) {
            return 6;
        } else if (arg0 == 74) {
            return 20;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 101) {
            return 12;
        } else if (arg0 == 103) {
            return 19;
        } else if (arg0 == 152) {
            return 16;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 162) {
            return 9;
        } else if (arg0 == 166) {
            return 10;
        } else if (arg0 == 179) {
            return 18;
        } else if (arg0 == 191) {
            return 5;
        } else {
            if (arg1 > -126) {
                method1478((byte) -11);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(ILql;)V", line = 432)
    public final void method1485(int arg0, class297 arg1) {
        field3524++;
        if (arg1.field4998 != null) {
            arg1.method1997(-27381);
        }
        arg1.field5005 = this.field3525;
        arg1.field4998 = this.field3525.field4998;
        if (arg0 != -8564) {
            this.field3525 = (class297) null;
        }
        arg1.field4998.field5005 = arg1;
        arg1.field5005.field4998 = arg1;
    }

    @OriginalMember(owner = "client!el", name = "d", descriptor = "(I)Lql;", line = 452)
    public final class297 method1486(int arg0) {
        if (arg0 != 38) {
            this.method1479((byte) 10);
        }
        field3513++;
        class297 var2 = this.field3530;
        if (this.field3525 == var2) {
            this.field3530 = null;
            return null;
        } else {
            this.field3530 = var2.field5005;
            return var2;
        }
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "()V", line = 502)
    public class218() {
        this.field3525.field4998 = this.field3525;
        this.field3525.field5005 = this.field3525;
    }
}
