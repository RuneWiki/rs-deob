import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class108 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "Lck;")
    public static class119 field1642 = class298.method1987((byte) 42, "::fps ");

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lck;")
    public static class119 field1646 = class298.method1987((byte) 102, "welle:");

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
    public static int field1650 = 0;

    @OriginalMember(owner = "client!wg", name = "o", descriptor = "Lck;")
    public static class119 field1656 = class298.method1987((byte) 102, "event_opbase");

    @OriginalMember(owner = "client!wg", name = "q", descriptor = "Lck;")
    public static class119 field1658 = class298.method1987((byte) 41, "Fps:");

    @OriginalMember(owner = "client!wg", name = "n", descriptor = "Lck;")
    public static class119 field1655 = class298.method1987((byte) 21, "(U1");

    @OriginalMember(owner = "client!wg", name = "l", descriptor = "[I")
    public static int[] field1653 = new int[2];

    @OriginalMember(owner = "client!wg", name = "m", descriptor = "Lck;")
    public static class119 field1654 = class298.method1987((byte) 40, " <col=ffff00>");

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
    public static int[] field1644 = new int[128];

    @OriginalMember(owner = "client!wg", name = "p", descriptor = "[Z")
    public static boolean[] field1657 = new boolean[100];

    @OriginalMember(owner = "client!wg", name = "j", descriptor = "D")
    public static double field1651;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field1645;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!wg", name = "k", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!wg", name = "r", descriptor = "I")
    public static int field1659;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "Lva;")
    public static class36 field1648;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BJ)V", line = 7)
    public static final void method695(byte arg0, long arg1) {
        if (arg0 != -70) {
            return;
        }
        field1659++;
        try {
            Thread.sleep(arg1);
        } catch (InterruptedException var4) {
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Z)V", line = 24)
    public static void method696(boolean arg0) {
        field1648 = null;
        field1655 = null;
        field1658 = null;
        field1653 = null;
        field1646 = null;
        field1642 = null;
        field1657 = null;
        field1656 = null;
        if (arg0) {
            field1656 = (class119) null;
        }
        field1644 = null;
        field1654 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V", line = 43)
    public static final void method697(int arg0) {
        field1647++;
        class254.field4085.method486((byte) 93);
        class91.field1416.method486((byte) 93);
        class277.field4550.method486((byte) 93);
        if (arg0 != -2693) {
            method698(false, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ZB)V", line = 68)
    public static final void method698(boolean arg0, byte arg1) {
        field1645++;
        class91.method624(4096);
        if (class214.field3407 == 28) {
            return;
        }
        class44.field665++;
        if (class44.field665 < 50 && !arg0 || arg1 <= 57) {
            return;
        }
        class44.field665 = 0;
        if (class63.field1003 || class44.field660 == null) {
            return;
        }
        class6.field149.method966(0, 138);
        class49.field764++;
        try {
            class44.field660.method1630(0, class6.field149.field44, (byte) -70, class6.field149.field101);
            class6.field149.field44 = 0;
        } catch (IOException var3) {
            class63.field1003 = true;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BI)V", line = 105)
    public static final void method699(byte arg0, int arg1) {
        field1652++;
        if (arg1 == -1 || !class234.field3786[arg1]) {
            return;
        }
        class216.field3487.method264((byte) 84, arg1);
        if (class135.field2189[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class135.field2189[arg1].length; var3++) {
            if (class135.field2189[arg1][var3] != null) {
                if (class135.field2189[arg1][var3].field2135 == 2) {
                    var2 = false;
                } else {
                    class135.field2189[arg1][var3] = null;
                }
            }
        }
        if (arg0 != 103) {
            method695((byte) 25, 23L);
        }
        if (var2) {
            class135.field2189[arg1] = null;
        }
        class234.field3786[arg1] = false;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Leb;I)V", line = 161)
    public static final void method700(class297 arg0, int arg1) {
        field1643++;
        arg0.field4948 = arg0.field4976;
        if (arg0.field4990 == 0) {
            arg0.field4947 = 0;
            return;
        }
        if (arg0.field4993 != -1 && arg0.field4941 == 0) {
            class56 var2 = class276.method1818(-20682, arg0.field4993);
            if (arg0.field4996 > 0 && var2.field910 == 0) {
                arg0.field4947++;
                return;
            }
            if (arg0.field4996 <= 0 && var2.field904 == 0) {
                arg0.field4947++;
                return;
            }
        }
        int var3 = arg0.field4949;
        int var4 = arg0.field4991;
        int var5 = arg0.field4963[arg0.field4990 - 1] * 128 + arg0.field4956 * 64;
        int var6 = arg0.field4973[arg0.field4990 - 1] * 128 + arg0.field4956 * 64;
        if ((var5 - var3) > 256 || (var5 - var3) < -256 || (var6 - var4) > 256 || var6 - var4 < -256) {
            arg0.field4949 = var5;
            arg0.field4991 = var6;
            return;
        }
        if (var5 <= var3) {
            if (var3 <= var5) {
                if (var4 < var6) {
                    arg0.field4946 = 1024;
                } else if (var6 < var4) {
                    arg0.field4946 = 0;
                }
            } else if (var6 > var4) {
                arg0.field4946 = 768;
            } else if (var6 >= var4) {
                arg0.field4946 = 512;
            } else {
                arg0.field4946 = 256;
            }
        } else if (var6 > var4) {
            arg0.field4946 = 1280;
        } else if (var4 <= var6) {
            arg0.field4946 = 1536;
        } else {
            arg0.field4946 = 1792;
        }
        int var7 = arg0.field4946 - arg0.field5007 & 0x7FF;
        int var8 = arg0.field4964;
        if (arg1 != 24185) {
            return;
        }
        int var9 = 4;
        if (var7 > 1024) {
            var7 -= 2048;
        }
        boolean var10 = true;
        if (var7 >= -256 && var7 <= 256) {
            var8 = arg0.field4982;
        } else if (var7 >= 256 && var7 < 768) {
            var8 = arg0.field4945;
        } else if (var7 >= -768 && var7 <= -256) {
            var8 = arg0.field4953;
        }
        if (var8 == -1) {
            var8 = arg0.field4982;
        }
        arg0.field4948 = var8;
        if (arg0 instanceof class163) {
            var10 = ((class163) arg0).field2575.field830;
        }
        if (var10) {
            if (arg0.field5007 != arg0.field4946 && arg0.field4952 == -1 && arg0.field4979 != 0) {
                var9 = 2;
            }
            if (arg0.field4990 > 2) {
                var9 = 6;
            }
            if (arg0.field4990 > 3) {
                var9 = 8;
            }
            if (arg0.field4947 > 0 && arg0.field4990 > 1) {
                arg0.field4947--;
                var9 = 8;
            }
        } else {
            if (arg0.field4990 > 1) {
                var9 = 6;
            }
            if (arg0.field4990 > 2) {
                var9 = 8;
            }
            if (arg0.field4947 > 0 && arg0.field4990 > 1) {
                arg0.field4947--;
                var9 = 8;
            }
        }
        if (arg0.field4983[arg0.field4990 - 1]) {
            var9 <<= 0x1;
        }
        if (var9 >= 8 && arg0.field4982 == arg0.field4948 && arg0.field4958 != -1) {
            arg0.field4948 = arg0.field4958;
        }
        if (var4 < var6) {
            arg0.field4991 += var9;
            if (arg0.field4991 > var6) {
                arg0.field4991 = var6;
            }
        } else if (var6 < var4) {
            arg0.field4991 -= var9;
            if (arg0.field4991 < var6) {
                arg0.field4991 = var6;
            }
        }
        if (var3 < var5) {
            arg0.field4949 += var9;
            if (var5 < arg0.field4949) {
                arg0.field4949 = var5;
            }
        } else if (var5 < var3) {
            arg0.field4949 -= var9;
            if (var5 > arg0.field4949) {
                arg0.field4949 = var5;
            }
        }
        if (arg0.field4949 == var5 && arg0.field4991 == var6) {
            if (arg0.field4996 > 0) {
                arg0.field4996--;
            }
            arg0.field4990--;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILva;)V", line = 379)
    public static final void method701(int arg0, class36 arg1) {
        class6.field148 = arg1.method285(class132.field2009, true);
        class113.field1719 = arg1.method285(class94.field1451, true);
        field1649++;
        class62.field982 = arg1.method285(class276.field4532, true);
        if (arg0 == 8) {
            class144.field2295 = arg1.method285(class147.field2368, true);
        }
    }
}
