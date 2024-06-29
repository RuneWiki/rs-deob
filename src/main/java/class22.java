import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class22 extends class47 {

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "Z")
    private volatile boolean field364 = false;

    @OriginalMember(owner = "client!cb", name = "mb", descriptor = "I")
    private int field377 = -1;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "Z")
    private boolean field368 = false;

    @OriginalMember(owner = "client!cb", name = "jb", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "Lje;")
    private class86 field370;

    @OriginalMember(owner = "client!cb", name = "nb", descriptor = "Lje;")
    private class86 field378;

    @OriginalMember(owner = "client!cb", name = "pb", descriptor = "[[S")
    public static short[][] field380 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!cb", name = "sb", descriptor = "Lff;")
    public static class53 field383 = new class53(8);

    @OriginalMember(owner = "client!cb", name = "tb", descriptor = "I")
    public static int field384 = 500;

    @OriginalMember(owner = "client!cb", name = "vb", descriptor = "Lsd;")
    private static class166 field386 = class135.method935("Loaded update list", 0);

    @OriginalMember(owner = "client!cb", name = "xb", descriptor = "[I")
    public static int[] field388 = new int[100];

    @OriginalMember(owner = "client!cb", name = "wb", descriptor = "Lsd;")
    public static class166 field387 = field386;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    private int field367;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!cb", name = "kb", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!cb", name = "lb", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!cb", name = "ob", descriptor = "I")
    public static int field379;

    @OriginalMember(owner = "client!cb", name = "qb", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client!cb", name = "rb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!cb", name = "ub", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "[Z")
    private volatile boolean[] field373;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(II)V")
    public final void method143(int arg0, int arg1) {
        ++field381;
        if (arg0 >= 93) {
            if (this.field378 != null && this.field373 != null && this.field373[arg1]) {
                class6.method44(arg1, this, (byte) -88, this.field378);
            } else {
                class139.method951(this.field374, true, true, super.field851[arg1], (byte) 2, this, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ZZ[BIZ)V")
    public final void method144(boolean arg0, boolean arg1, byte[] arg2, int arg3, boolean arg4) {
        ++field376;
        if (!arg1) {
            arg2[arg2.length + -2] = (byte) (super.field847[arg3] >> 8);
            arg2[arg2.length + -1] = (byte) super.field847[arg3];
            if (this.field378 != null) {
                class46.method348(this.field378, arg2, arg3, (byte) 41);
                this.field373[arg3] = true;
            }
            if (arg0) {
                super.field842[arg3] = class69.method558(false, arg2, false);
            }
        } else {
            if (this.field364) {
                throw new RuntimeException();
            }
            if (this.field370 != null) {
                class46.method348(this.field370, arg2, this.field374, (byte) -82);
            }
            this.method360(true, arg2);
            this.method146((byte) 92);
        }
        if (arg4) {
            this.field378 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IB)V")
    public final void method145(int arg0, byte arg1) {
        class128.method909(this.field374, 0, arg0);
        int var3 = 90 % ((-76 - arg1) / 50);
        ++field375;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(B)V")
    private final void method146(byte arg0) {
        ++field366;
        this.field373 = new boolean[super.field842.length];
        for (int var2 = 0; this.field373.length > var2; ++var2) {
            this.field373[var2] = false;
        }
        if (this.field378 == null) {
            this.field364 = true;
        } else {
            this.field377 = -1;
            for (int var3 = 0; ~var3 > ~this.field373.length; ++var3) {
                if (super.field838[var3] > 0) {
                    class90.method712(var3, -128, this, this.field378);
                    this.field377 = var3;
                }
            }
            if (this.field377 == -1) {
                this.field364 = true;
            }
            if (arg0 < 46) {
                this.field374 = -57;
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(BI)I")
    private final int method147(byte arg0, int arg1) {
        ++field382;
        if (arg0 <= 25) {
            field388 = null;
        }
        if (super.field842[arg1] != null) {
            return 100;
        } else {
            return this.field373[arg1] ? 100 : class193.method1285(17608, arg1, this.field374);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "([Lsd;I)Lsd;")
    public static final class166 method148(class166[] arg0, int arg1) {
        ++field365;
        if (arg1 != 0) {
            method148((class166[]) null, 13);
        }
        if (~arg0.length > -3) {
            throw new IllegalArgumentException();
        } else {
            return class69.method560(arg0, -119, 0, arg0.length);
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IZLje;[BI)V")
    public final void method149(int arg0, boolean arg1, class86 arg2, byte[] arg3, int arg4) {
        ++field372;
        if (arg0 != 3673) {
            this.field364 = true;
        }
        if (this.field370 == arg2) {
            if (this.field364) {
                throw new RuntimeException();
            } else if (arg3 == null) {
                class139.method951(255, true, true, this.field369, (byte) 0, this, this.field374);
            } else {
                class156.field2983.reset();
                class156.field2983.update(arg3, 0, arg3.length);
                int var6 = (int) class156.field2983.getValue();
                class53 var7 = new class53(class29.method219(arg3, (byte) 49));
                int var8 = var7.method400(255);
                if (var8 != 5 && var8 != 6) {
                    throw new RuntimeException("Incorrect JS5 protocol number: " + var8);
                } else {
                    int var9 = 0;
                    if (~var8 <= -7) {
                        var9 = var7.method419(-4);
                    }
                    if (this.field369 == var6 && this.field367 == var9) {
                        this.method360(true, arg3);
                        this.method146((byte) 89);
                    } else {
                        class139.method951(255, true, true, this.field369, (byte) 0, this, this.field374);
                    }
                }
            }
        } else {
            if (!arg1 && this.field377 == arg4) {
                this.field364 = true;
            }
            if (arg3 != null && arg3.length > 2) {
                class156.field2983.reset();
                class156.field2983.update(arg3, 0, arg3.length + -2);
                int var10 = (int) class156.field2983.getValue();
                int var11 = ((arg3[arg3.length + -2] & 255) << 8) + (255 & arg3[arg3.length + -1]);
                if (~super.field851[arg4] == ~var10 && ~super.field847[arg4] == ~var11) {
                    this.field373[arg4] = true;
                    if (arg1) {
                        super.field842[arg4] = class69.method558(false, arg3, false);
                    }
                } else {
                    this.field373[arg4] = false;
                    if (this.field368 || arg1) {
                        class139.method951(this.field374, true, arg1, super.field851[arg4], (byte) 2, this, arg4);
                    }
                }
            } else {
                this.field373[arg4] = false;
                if (this.field368 || arg1) {
                    class139.method951(this.field374, true, arg1, super.field851[arg4], (byte) 2, this, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(Z)I")
    public final int method150(boolean arg0) {
        ++field379;
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < super.field842.length; ++var4) {
            if (~super.field838[var4] < -1) {
                var3 += this.method147((byte) 78, var4);
                var2 += 100;
            }
        }
        if (~var2 == -1) {
            return 100;
        } else {
            int var5 = var3 * 100 / var2;
            if (arg0) {
                this.method154((byte) -54);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(II)I")
    public static int method151(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(III)V")
    public final void method152(int arg0, int arg1, int arg2) {
        this.field369 = arg2;
        this.field367 = arg1;
        if (arg0 != 255) {
            field386 = null;
        }
        ++field362;
        if (this.field370 != null) {
            class6.method44(this.field374, this, (byte) -108, this.field370);
        } else {
            class139.method951(255, true, true, this.field369, (byte) 0, this, this.field374);
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(B)V")
    public static final void method153(byte arg0) {
        ++field363;
        class37.method258((byte) 34);
        class75.method629((byte) -10);
        class10.method61((byte) 20);
        class150.method1022(arg0 ^ -30994);
        class38.method265(arg0 + -118);
        class82.method669(true);
        class37.method261(true);
        class32.method235(29491);
        class57.method493(-6523);
        class92.method719((byte) -48);
        class184.method1246(32768);
        class64.method534(5);
        ((class112) class40.field721).method816(0);
        class121.field2371.method71(500);
        class169.field3272.method366((byte) -70);
        class172.field3298.method366((byte) -106);
        if (arg0 != 118) {
            field387 = null;
        }
        class63.field1301.method366((byte) -119);
        class142.field2764.method366((byte) -103);
        class138.field2693.method366((byte) -73);
        class11.field213.method366((byte) -74);
        class98.field1866.method366((byte) -90);
        class3.field33.method366((byte) -65);
        class64.field1337.method366((byte) -110);
        class18.field303.method366((byte) -92);
        class129.field2529.method366((byte) -80);
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Lje;Lje;IZZZ)V")
    public class22(class86 arg0, class86 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field374 = arg2;
        this.field368 = arg5;
        this.field370 = arg1;
        this.field378 = arg0;
        class60.method508(this, (byte) 57, this.field374);
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(B)I")
    public final int method154(byte arg0) {
        ++field371;
        if (this.field364) {
            return 100;
        } else if (super.field842 != null) {
            return 99;
        } else {
            int var2 = class193.method1285(17608, this.field374, 255);
            int var3 = -106 / ((82 - arg0) / 43);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(B)V")
    public static void method155(byte arg0) {
        field380 = null;
        field387 = null;
        int var1 = 62 / ((arg0 - 23) / 42);
        field386 = null;
        field388 = null;
        field383 = null;
    }
}
