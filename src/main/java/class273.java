import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class273 {

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "I")
    public int field4379;

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "I")
    public int field4380;

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "I")
    public static int field4381;

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "I")
    public static int field4382;

    @OriginalMember(owner = "client!rd", name = "e", descriptor = "I")
    public static int field4383;

    @OriginalMember(owner = "client!rd", name = "f", descriptor = "I")
    public static int field4384;

    @OriginalMember(owner = "client!rd", name = "g", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!rd", name = "h", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!rd", name = "j", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!rd", name = "k", descriptor = "I")
    private int field4389;

    @OriginalMember(owner = "client!rd", name = "l", descriptor = "I")
    public static int field4390;

    @OriginalMember(owner = "client!rd", name = "i", descriptor = "[I")
    public static int[] field4387;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)V")
    public static void method1887(boolean arg0) {
        field4387 = null;
        if (arg0) {
            field4387 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(II)V")
    public static final void method1888(int arg0, int arg1) {
        class44.method331(false);
        field4384++;
        class256.method1812((byte) 112);
        if (arg1 > -111) {
            method1892(78, (byte) 125);
        }
        int var2 = class184.method1366(16, arg0).field3051;
        if (var2 == 0) {
            return;
        }
        int var3 = class243.field3904[arg0];
        if (var2 == 6) {
            class121.field1766 = var3;
        }
        if (var2 == 9) {
            class64.field949 = var3;
        }
        if (var2 == 5) {
            class247.field4125 = var3;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I)Lak;")
    public final class140 method1889(int arg0) {
        field4383++;
        class140 var2 = (class140) class155.field2555.method1553((long) this.field4389, (byte) -79);
        if (arg0 != -17964) {
            return null;
        } else if (var2 == null) {
            class140 var3 = class169.method1243((byte) -106, this.field4389, 0, class148.field2413);
            if (var3 != null) {
                class155.field2555.method1551(var3, 0, (long) this.field4389);
            }
            return var3;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZB)V")
    public static final void method1890(boolean arg0, byte arg1) {
        if (arg0) {
            if (class211.field3384 != -1) {
                class48.method370(class211.field3384, (byte) 85);
            }
            for (class17 var2 = (class17) class124.field1806.method1033(-9843); var2 != null; var2 = (class17) class124.field1806.method1031((byte) -7)) {
                class159.method1187((byte) 101, true, var2);
            }
            class211.field3384 = -1;
            class124.field1806 = new class144(8);
            class293.method1986(0);
            class211.field3384 = class11.field117;
            class152.method1115(false, -105);
            class23.method172(false);
            class59.method428((byte) 12, class211.field3384);
        }
        class221.field3536 = -1;
        field4382++;
        class257.method1817(false, class185.field2987);
        class186.field2993 = new class29();
        class186.field2993.field1910 = 3000;
        if (arg1 != 72) {
            field4387 = null;
        }
        class186.field2993.field1979 = 3000;
        if (class175.field2850 == 0) {
            class38.method296(false, class90.field1337);
            class256.method1811(10, true);
            return;
        }
        if (class176.field2853 == 2) {
            class50.field736 = class146.field2384 << 7;
            class196.field3177 = class77.field1105 << 7;
        } else {
            class111.method814((byte) -70);
        }
        class55.method415((byte) -114);
        class256.method1811(28, true);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([BI)Lba;")
    public static final class170 method1891(byte[] arg0, int arg1) {
        field4381++;
        if (arg0 == null) {
            return null;
        }
        class35 var2 = new class35(arg0, class217.field3457, class272.field4377, class19.field214, class201.field3220, class152.field2505);
        if (arg1 != -3) {
            method1893((byte) -13, (byte[]) null);
        }
        class188.method1398((byte) 117);
        return var2;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)I")
    public static final int method1892(int arg0, byte arg1) {
        field4386++;
        if (arg1 > -12) {
            field4387 = null;
        }
        return arg0 >>> 8;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B[B)[B")
    public static final byte[] method1893(byte arg0, byte[] arg1) {
        field4390++;
        int var2 = arg1.length;
        byte[] var3 = new byte[var2];
        if (arg0 < 102) {
            field4387 = null;
        }
        class158.method1177(arg1, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(BILv;I)V")
    private final void method1894(byte arg0, int arg1, class152 arg2, int arg3) {
        if (arg0 != -87) {
            return;
        }
        if (arg3 == 1) {
            this.field4389 = arg2.method1126(false);
        } else if (arg3 == 2) {
            this.field4379 = arg2.method1111(255);
            this.field4380 = arg2.method1111(255);
        }
        field4388++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(ILv;I)V")
    public final void method1895(int arg0, class152 arg1, int arg2) {
        field4385++;
        while (true) {
            int var4 = arg1.method1111(255);
            if (var4 == 0) {
                if (arg2 == -1) {
                    return;
                } else {
                    this.field4380 = 122;
                    return;
                }
            }
            this.method1894((byte) -87, arg0, arg1, var4);
        }
    }
}
