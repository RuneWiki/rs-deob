import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class74 extends class141 {

    @OriginalMember(owner = "client!ms", name = "A", descriptor = "I")
    private int field968 = 0;

    @OriginalMember(owner = "client!ms", name = "X", descriptor = "Z")
    private boolean field990 = false;

    @OriginalMember(owner = "client!ms", name = "V", descriptor = "I")
    private int field988 = -1;

    @OriginalMember(owner = "client!ms", name = "cb", descriptor = "I")
    private int field995 = -32768;

    @OriginalMember(owner = "client!ms", name = "sb", descriptor = "I")
    private int field1011 = 0;

    @OriginalMember(owner = "client!ms", name = "Z", descriptor = "I")
    public int field992;

    @OriginalMember(owner = "client!ms", name = "J", descriptor = "I")
    public int field976;

    @OriginalMember(owner = "client!ms", name = "Y", descriptor = "I")
    private int field991;

    @OriginalMember(owner = "client!ms", name = "rb", descriptor = "I")
    public int field1010;

    @OriginalMember(owner = "client!ms", name = "pb", descriptor = "I")
    private int field1008;

    @OriginalMember(owner = "client!ms", name = "W", descriptor = "I")
    public int field989;

    @OriginalMember(owner = "client!ms", name = "B", descriptor = "I")
    private int field969;

    @OriginalMember(owner = "client!ms", name = "bb", descriptor = "Lgr;")
    private class379 field994;

    @OriginalMember(owner = "client!ms", name = "K", descriptor = "J")
    public static long field977 = 0L;

    @OriginalMember(owner = "client!ms", name = "fb", descriptor = "I")
    public static int field998 = 0;

    @OriginalMember(owner = "client!ms", name = "kb", descriptor = "D")
    private double field1003;

    @OriginalMember(owner = "client!ms", name = "qb", descriptor = "D")
    private double field1009;

    @OriginalMember(owner = "client!ms", name = "D", descriptor = "D")
    private double field971;

    @OriginalMember(owner = "client!ms", name = "N", descriptor = "D")
    private double field980;

    @OriginalMember(owner = "client!ms", name = "S", descriptor = "D")
    private double field985;

    @OriginalMember(owner = "client!ms", name = "T", descriptor = "D")
    private double field986;

    @OriginalMember(owner = "client!ms", name = "U", descriptor = "D")
    private double field987;

    @OriginalMember(owner = "client!ms", name = "ab", descriptor = "D")
    private double field993;

    @OriginalMember(owner = "client!ms", name = "hb", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!ms", name = "ib", descriptor = "I")
    private int field1001;

    @OriginalMember(owner = "client!ms", name = "mb", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!ms", name = "nb", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ms", name = "ob", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ms", name = "y", descriptor = "I")
    public static int field966;

    @OriginalMember(owner = "client!ms", name = "z", descriptor = "I")
    public static int field967;

    @OriginalMember(owner = "client!ms", name = "C", descriptor = "I")
    public static int field970;

    @OriginalMember(owner = "client!ms", name = "E", descriptor = "I")
    public static int field972;

    @OriginalMember(owner = "client!ms", name = "F", descriptor = "I")
    public static int field973;

    @OriginalMember(owner = "client!ms", name = "G", descriptor = "I")
    public static int field974;

    @OriginalMember(owner = "client!ms", name = "I", descriptor = "I")
    public static int field975;

    @OriginalMember(owner = "client!ms", name = "L", descriptor = "I")
    public static int field978;

    @OriginalMember(owner = "client!ms", name = "M", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!ms", name = "O", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!ms", name = "Q", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!ms", name = "R", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ms", name = "db", descriptor = "I")
    private int field996;

    @OriginalMember(owner = "client!ms", name = "eb", descriptor = "I")
    public static int field997;

    @OriginalMember(owner = "client!ms", name = "gb", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!ms", name = "P", descriptor = "Liq;")
    public static class134 field982;

    @OriginalMember(owner = "client!ms", name = "jb", descriptor = "Lmk;")
    private class336 field1002;

    @OriginalMember(owner = "client!ms", name = "lb", descriptor = "Lvp;")
    public static class77 field1004;

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(Z)Z")
    public final boolean method112(boolean arg0) {
        ++field966;
        if (!arg0) {
            this.method116((byte) 12);
        }
        return false;
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(Z)I")
    public final int method120(boolean arg0) {
        if (arg0) {
            this.field986 = 0.3409445063882695D;
        }
        ++field974;
        return this.field995;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIBI)V")
    public final void method485(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field967;
        if (arg3 != 84) {
            this.field987 = 0.023987413432017216D;
        }
        if (!this.field990) {
            double var6 = (double) (-super.field1900 + arg2);
            double var8 = (double) (-super.field1892 + arg0);
            double var10 = Math.sqrt(var6 * var6 + var8 * var8);
            this.field993 = (double) this.field991 * var8 / var10 + (double) super.field1892;
            this.field971 = (double) this.field991 * var6 / var10 + (double) super.field1900;
            this.field1003 = (double) super.field1888;
        }
        double var12 = (double) (-arg4 + this.field1010 + 1);
        this.field1009 = ((double) arg2 - this.field971) / var12;
        this.field980 = ((double) arg0 + -this.field993) / var12;
        this.field985 = Math.sqrt(this.field980 * this.field980 + this.field1009 * this.field1009);
        if (~this.field1008 != 0) {
            if (!this.field990) {
                this.field986 = -this.field985 * Math.tan((double) this.field1008 * 0.02454369D);
            }
            this.field987 = ((double) arg1 + -this.field1003 + -(this.field986 * var12)) * 2.0D / (var12 * var12);
        } else {
            this.field986 = ((double) arg1 - this.field1003) / var12;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IIIIIII)V")
    public static final void method486(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field1007;
        if (arg2 >= class192.field2917 && class39.field497 >= arg5 && arg0 >= class189.field2831 && arg3 <= class204.field3060) {
            if (arg4 == 1) {
                class219.method1334(arg3, arg0, arg5, arg1, (byte) 23, arg2);
            } else {
                class134.method826(arg1, 0, arg5, arg4, arg2, arg0, arg3);
            }
        } else if (arg4 != 1) {
            class11.method76((byte) 81, arg0, arg1, arg2, arg3, arg4, arg5);
        } else {
            class266.method1646(arg0, arg5, (byte) -128, arg2, arg3, arg1);
        }
        if (arg6 < 97) {
            method486(122, -120, -82, -122, 38, 89, -27);
        }
    }

    @OriginalMember(owner = "client!ms", name = "d", descriptor = "(Ldr;I)Lkq;")
    public final class70 method10(class261 arg0, int arg1) {
        ++field997;
        if (arg1 != 7) {
            this.field1010 = -115;
        }
        class292 var3 = this.method491(arg0, 1024, -11878);
        if (var3 == null) {
            return null;
        } else {
            class361 var4 = arg0.method434();
            var4.method615(this.field1001);
            var4.method607(this.field996);
            var4.method604((int) this.field971, (int) this.field1003, (int) this.field993);
            if (this.field1002 != null) {
                class439 var5 = this.field1002.method2050();
                arg0.method369(var3, var5, var4, (class158) null, 0);
            } else {
                var3.method1282(var4, (class158) null, 0);
            }
            this.field995 = var3.method1263();
            this.method488(var3, arg0, 1);
            return null;
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(I)V")
    public final void method487(int arg0) {
        if (arg0 == -1) {
            if (this.field1002 != null) {
                this.field1002.method2051();
            }
            ++field978;
        }
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(B)V")
    public final void method116(byte arg0) {
        ++field999;
        if (arg0 >= -45) {
            field982 = null;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Lwp;Ldr;I)V")
    private final void method488(class292 arg0, class261 arg1, int arg2) {
        ++field1006;
        class219[] var4 = arg0.method1302();
        if (arg2 != 1) {
            this.method491((class261) null, -22, -13);
        }
        class95[] var5 = arg0.method1271();
        if ((this.field1002 == null || this.field1002.field4991) && (var4 != null || var5 != null)) {
            this.field1002 = new class336(class26.field332);
        }
        if (this.field1002 != null) {
            this.field1002.method2060(arg1, (long) class26.field332, var4, var5, false);
            this.field1002.method2049(super.field1902, super.field1895, super.field1890, super.field1901, super.field1889);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZILla;IIILdr;)V")
    public final void method117(boolean arg0, int arg1, class269 arg2, int arg3, int arg4, int arg5, class261 arg6) {
        if (arg1 != 0) {
            this.method488((class292) null, (class261) null, 84);
        }
        ++field983;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(IILdr;I)Z")
    public final boolean method4(int arg0, int arg1, class261 arg2, int arg3) {
        if (arg3 != 2) {
            return false;
        } else {
            ++field970;
            return false;
        }
    }

    @OriginalMember(owner = "client!ms", name = "e", descriptor = "(I)V")
    public final void method489(int arg0) {
        super.field1895 = super.field1890 = (short) ((int) (this.field971 / 128.0D));
        super.field1901 = super.field1889 = (short) ((int) (this.field993 / 128.0D));
        ++field981;
        if (arg0 != 28155) {
            method486(-67, -118, 118, 116, -111, -35, 78);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Z)V")
    public static void method490(boolean arg0) {
        field982 = null;
        field1004 = null;
        if (arg0) {
            method490(true);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(Ldr;II)Lwp;")
    private final class292 method491(class261 arg0, int arg1, int arg2) {
        ++field972;
        class195 var4 = class251.method1530(this.field969, arg2 ^ -11810);
        if (arg2 != -11878) {
            method486(-121, -10, -29, 63, 52, 73, 28);
        }
        return var4.method1164(this.field1011, arg1, this.field968, arg0, this.field988, false);
    }

    @OriginalMember(owner = "client!ms", name = "<init>", descriptor = "(IIIIIIIIIII)V")
    public class74(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg1, arg2, arg4, arg3, arg2 >> 7, arg2 >> 7, arg3 >> 7, arg3 >> 7, false, (byte) 0);
        this.field992 = arg9;
        this.field976 = arg10;
        this.field991 = arg8;
        this.field1010 = arg6;
        this.field990 = false;
        this.field1008 = arg7;
        this.field989 = arg5;
        this.field969 = arg0;
        int var12 = class251.method1530(this.field969, 90).field2950;
        if (var12 == -1) {
            this.field994 = null;
        } else {
            this.field994 = class98.method629(var12, (byte) -115);
        }
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(B)V")
    public static final void method492(byte arg0) {
        ++field1005;
        class316.method1929(false, 25);
        class326.method2012((byte) -5);
        if (arg0 != 12) {
            field1004 = null;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(II)V")
    public final void method493(int arg0, int arg1) {
        if (this.field1008 != -1) {
            this.field1003 += this.field987 * 0.5D * (double) arg0 * (double) arg0 + (double) arg0 * this.field986;
            this.field986 += (double) arg0 * this.field987;
        } else {
            this.field1003 += (double) arg0 * this.field986;
        }
        this.field993 += (double) arg0 * this.field980;
        this.field990 = true;
        ++field984;
        if (arg1 == 0) {
            this.field971 += (double) arg0 * this.field1009;
            this.field996 = 16383 & 8192 + (int) (2607.5945876176133D * Math.atan2(this.field1009, this.field980));
            this.field1001 = 16383 & (int) (2607.5945876176133D * Math.atan2(this.field986, this.field985));
            if (this.field994 != null) {
                this.field968 += arg0;
                while (true) {
                    do {
                        do {
                            if (this.field968 <= this.field994.field5540[this.field1011]) {
                                return;
                            }
                            this.field968 -= this.field994.field5540[this.field1011];
                            ++this.field1011;
                            if (~this.field1011 <= ~this.field994.field5539.length) {
                                this.field1011 -= this.field994.field5527;
                                if (~this.field1011 > -1 || this.field994.field5539.length <= this.field1011) {
                                    this.field1011 = 0;
                                }
                            }
                            this.field988 = this.field1011 + 1;
                        } while (this.field988 < this.field994.field5539.length);
                        this.field988 -= this.field994.field5527;
                    } while (~this.field988 <= -1 && this.field988 < this.field994.field5539.length);
                    this.field988 = -1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "c", descriptor = "(Ldr;I)V")
    public final void method15(class261 arg0, int arg1) {
        ++field975;
        if (arg1 > 114) {
            class292 var3 = this.method491(arg0, 0, -11878);
            if (var3 != null) {
                class361 var4 = arg0.method434();
                var4.method615(this.field1001);
                var4.method607(this.field996);
                var4.method604((int) this.field971, (int) this.field1003, (int) this.field993);
                this.field995 = var3.method1263();
                this.method488(var3, arg0, 1);
            }
        }
    }

    @OriginalMember(owner = "client!ms", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field1002 != null) {
            this.field1002.method2051();
        }
        ++field1000;
    }
}
