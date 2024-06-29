import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!du")
public class class261 {

    @OriginalMember(owner = "client!du", name = "e", descriptor = "I")
    public int field3742 = 8;

    @OriginalMember(owner = "client!du", name = "n", descriptor = "I")
    public int field3751 = -1;

    @OriginalMember(owner = "client!du", name = "f", descriptor = "Z")
    public boolean field3743 = false;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "I")
    public int field3738 = 1190717;

    @OriginalMember(owner = "client!du", name = "c", descriptor = "Z")
    public boolean field3740 = true;

    @OriginalMember(owner = "client!du", name = "d", descriptor = "I")
    public int field3741 = -1;

    @OriginalMember(owner = "client!du", name = "s", descriptor = "I")
    public int field3756 = 128;

    @OriginalMember(owner = "client!du", name = "t", descriptor = "I")
    public int field3757 = 16;

    @OriginalMember(owner = "client!du", name = "u", descriptor = "I")
    public int field3758 = 0;

    @OriginalMember(owner = "client!du", name = "k", descriptor = "Z")
    public boolean field3748 = true;

    @OriginalMember(owner = "client!du", name = "o", descriptor = "I")
    public int field3752 = -1;

    @OriginalMember(owner = "client!du", name = "v", descriptor = "I")
    public int field3759 = 127;

    @OriginalMember(owner = "client!du", name = "j", descriptor = "[[B")
    public static byte[][] field3747 = new byte[250][];

    @OriginalMember(owner = "client!du", name = "q", descriptor = "Z")
    public static boolean field3754 = true;

    @OriginalMember(owner = "client!du", name = "i", descriptor = "[I")
    public static int[] field3746 = new int[50];

    @OriginalMember(owner = "client!du", name = "b", descriptor = "I")
    public static int field3739;

    @OriginalMember(owner = "client!du", name = "g", descriptor = "I")
    public static int field3744;

    @OriginalMember(owner = "client!du", name = "h", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!du", name = "l", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!du", name = "p", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!du", name = "r", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!du", name = "w", descriptor = "I")
    public static int field3760;

    @OriginalMember(owner = "client!du", name = "x", descriptor = "I")
    public static int field3761;

    @OriginalMember(owner = "client!du", name = "y", descriptor = "Laf;")
    public class22 field3762;

    @OriginalMember(owner = "client!du", name = "m", descriptor = "Lnl;")
    public static class435 field3750;

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(ILjf;I)V", line = 5)
    public static final void method1754(int arg0, class483 arg1, int arg2) {
        field3753++;
        if (class389.field5381) {
            class389.field5381 = false;
            arg2 = 0;
        }
        if (arg0 != 13 || class46.field707 != null && class46.field707.method2844(22137, arg1)) {
            return;
        }
        class46.field707 = arg1;
        class221.field3190 = class10.method51(arg0 - 3196);
        class135.field1885 = arg2;
        class95.field1337 = arg2;
        if (class95.field1337 == 0) {
            class344.method2142(false);
            return;
        }
        class67.field979 = class227.field3266;
        class238.field3489 = class475.field6701;
        class30.field311 = class249.field3595;
        class466.field6568 = class318.field4498;
        class137.field1913 = class469.field6612;
        class25.field269 = class95.field1338;
        class236.field3435 = class352.field4845;
        class130.field1780 = class491.field6929;
        class61.field888 = class31.field331;
        class329.field4560 = class174.field2653;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(BILkk;)V", line = 47)
    private final void method1755(byte arg0, int arg1, class161 arg2) {
        if (arg1 == 1) {
            this.field3758 = class8.method46(arg2.method1178((byte) 63), -109);
        } else if (arg1 == 2) {
            this.field3751 = arg2.method1172((byte) -127);
        } else if (arg1 == 3) {
            this.field3751 = arg2.method1134(-16848);
            if (this.field3751 == 65535) {
                this.field3751 = -1;
            }
        } else if (arg1 == 5) {
            this.field3748 = false;
        } else if (arg1 == 7) {
            this.field3741 = class8.method46(arg2.method1178((byte) 63), -117);
        } else if (arg1 == 8) {
            this.field3762.field249 = this.field3749;
        } else if (arg1 == 9) {
            this.field3756 = arg2.method1134(-16848);
        } else if (arg1 == 10) {
            this.field3740 = false;
        } else if (arg1 == 11) {
            this.field3742 = arg2.method1172((byte) 94);
        } else if (arg1 == 12) {
            this.field3743 = true;
        } else if (arg1 == 13) {
            this.field3738 = arg2.method1178((byte) 63);
        } else if (arg1 == 14) {
            this.field3757 = arg2.method1172((byte) -22);
        } else if (arg1 == 15) {
            this.field3752 = arg2.method1134(-16848);
            if (this.field3752 == 65535) {
                this.field3752 = -1;
            }
        } else if (arg1 == 16) {
            this.field3759 = arg2.method1172((byte) -19);
        }
        field3744++;
        int var4 = 62 / ((-arg0 - 31) / 39);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 134)
    public static final boolean method1756(String arg0, int arg1) {
        field3760++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class222.field3201; var2++) {
            if (arg0.equalsIgnoreCase(class318.field4494[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class41.field542[var2])) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lkk;B)V", line = 161)
    public final void method1757(class161 arg0, byte arg1) {
        field3739++;
        if (arg1 != -93) {
            field3755 = -99;
        }
        while (true) {
            int var3 = arg0.method1172((byte) 16);
            if (var3 == 0) {
                return;
            }
            this.method1755((byte) -128, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Lnl;B)V", line = 186)
    public static final void method1758(class435 arg0, byte arg1) {
        class167.field2423 = arg0.method2657("p11_full", (byte) 15);
        field3745++;
        if (arg1 >= -97) {
            method1760(false);
        }
        class282.field4059 = arg0.method2657("p12_full", (byte) 15);
        class68.field1000 = arg0.method2657("b12_full", (byte) 15);
        class278.field3997 = arg0.method2657("hitmarks", (byte) 15);
        class345.field4775 = arg0.method2657("hitbar_default", (byte) 15);
        class182.field2747 = arg0.method2657("timerbar_default", (byte) 15);
        class161.field2330 = arg0.method2657("headicons_pk", (byte) 15);
        class369.field5088 = arg0.method2657("headicons_prayer", (byte) 15);
        class138.field1922 = arg0.method2657("hint_headicons", (byte) 15);
        class161.field2329 = arg0.method2657("hint_mapmarkers", (byte) 15);
        class165.field2405 = arg0.method2657("mapflag", (byte) 15);
        class48.field731 = arg0.method2657("cross", (byte) 15);
        class4.field34 = arg0.method2657("mapdots", (byte) 15);
        class201.field2973 = arg0.method2657("scrollbar", (byte) 15);
        class133.field1865 = arg0.method2657("name_icons", (byte) 15);
        class128.field1755 = arg0.method2657("floorshadows", (byte) 15);
        class437.field6217 = arg0.method2657("compass", (byte) 15);
        class487.field6895 = arg0.method2657("otherlevel", (byte) 15);
        class161.field2333 = arg0.method2657("hint_mapedge", (byte) 15);
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(I)V", line = 237)
    public final void method1759(int arg0) {
        field3761++;
        this.field3742 = this.field3749 | this.field3742 << 8;
        if (this.field3752 == -1) {
            this.field3752 = this.field3751;
        }
        if (arg0 > -68) {
            field3755 = -79;
        }
    }

    @OriginalMember(owner = "client!du", name = "a", descriptor = "(Z)V", line = 254)
    public static void method1760(boolean arg0) {
        field3750 = null;
        if (!arg0) {
            field3754 = true;
        }
        field3746 = null;
        field3747 = null;
    }
}
