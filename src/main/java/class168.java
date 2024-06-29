import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class168 {

    @OriginalMember(owner = "client!si", name = "g", descriptor = "Z")
    public static boolean field2096 = false;

    @OriginalMember(owner = "client!si", name = "h", descriptor = "I")
    public static int field2097 = 4;

    @OriginalMember(owner = "client!si", name = "c", descriptor = "Lrh;")
    public static class59 field2092 = new class59();

    @OriginalMember(owner = "client!si", name = "o", descriptor = "Lnl;")
    public static class50 field2104 = new class50(1);

    @OriginalMember(owner = "client!si", name = "a", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!si", name = "b", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!si", name = "e", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!si", name = "f", descriptor = "I")
    public int field2095;

    @OriginalMember(owner = "client!si", name = "i", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!si", name = "j", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!si", name = "k", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!si", name = "l", descriptor = "I")
    private int field2101;

    @OriginalMember(owner = "client!si", name = "p", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!si", name = "d", descriptor = "Lpq;")
    public static class159 field2093;

    @OriginalMember(owner = "client!si", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field2102;

    @OriginalMember(owner = "client!si", name = "n", descriptor = "[S")
    public static short[] field2103;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(I)V", line = 6)
    public static void method1116(int arg0) {
        field2103 = null;
        if (arg0 < 94) {
            method1121(null, -39);
        }
        field2093 = null;
        field2104 = null;
        field2092 = null;
        field2102 = null;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BI)V", line = 20)
    public final void method1117(byte arg0, int arg1) {
        if (arg0 >= -93) {
            field2103 = null;
        }
        field2090++;
        this.field2095 = arg1;
        this.field2101 = 0;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)Z", line = 36)
    public final boolean method1118(int arg0, int arg1, int arg2, int arg3) {
        field2100++;
        int var5 = this.field2101;
        if (arg3 >= -68) {
            this.method1120(99);
        }
        if (this.field2095 == arg2 && this.field2101 == 0) {
            return false;
        }
        boolean var6;
        if (this.field2101 == 0) {
            if (arg2 > this.field2095 && arg2 <= (this.field2095 + arg1) || this.field2095 > arg2 && this.field2095 - arg1 <= arg2) {
                this.field2095 = arg2;
                return false;
            }
            var6 = true;
        } else if (this.field2101 > 0 && arg2 > this.field2095) {
            int var7 = this.field2101 * this.field2101 / (arg1 * 2);
            int var8 = this.field2095 + var7;
            if (arg2 > var8 && this.field2095 <= var8) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else if (this.field2101 < 0 && arg2 < this.field2095) {
            int var9 = this.field2101 * this.field2101 / (arg1 * 2);
            int var10 = this.field2095 - var9;
            if (var10 > arg2 && this.field2095 >= var10) {
                var6 = true;
            } else {
                var6 = false;
            }
        } else {
            var6 = false;
        }
        if (var6) {
            if (this.field2095 < arg2) {
                this.field2101 += arg1;
                if (arg0 != 0 && this.field2101 > arg0) {
                    this.field2101 = arg0;
                }
            } else {
                this.field2101 -= arg1;
                if (arg0 != 0 && (-arg0) > this.field2101) {
                    this.field2101 = -arg0;
                }
            }
            if (this.field2101 != var5) {
                int var11 = this.field2101 * this.field2101 / (arg1 * 2);
                if (arg2 > this.field2095) {
                    if (arg2 < (this.field2095 + var11)) {
                        this.field2101 = var5;
                    }
                } else if (arg2 < this.field2095 && arg2 > this.field2095 - var11) {
                    this.field2101 = var5;
                }
            }
        } else if (this.field2101 <= 0) {
            this.field2101 += arg1;
            if (this.field2101 > 0) {
                this.field2101 = 0;
            }
        } else {
            this.field2101 -= arg1;
            if (this.field2101 < 0) {
                this.field2101 = 0;
            }
        }
        this.field2095 += this.field2101 + var5 >> 1;
        return var6;
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(I)V", line = 175)
    public final void method1119(int arg0) {
        field2091++;
        if (arg0 == -5821) {
            this.field2095 &= 0x3FFF;
        }
    }

    @OriginalMember(owner = "client!si", name = "c", descriptor = "(I)I", line = 192)
    public final int method1120(int arg0) {
        field2098++;
        return arg0 == 1 ? this.field2095 & 0x3FFF : -62;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(Lpq;I)V", line = 205)
    public static final void method1121(class159 arg0, int arg1) {
        field2099++;
        class626.field8522 = 0;
        class654.field9254 = 0;
        if (arg1 != 1) {
            method1121(null, 14);
        }
        class379.field5440 = new class361();
        class580.field8003 = new class260[1024];
        class104.field1269 = new class117[class127.field1625[class353.field5149] + 1];
        class645.field9135 = 0;
        class314.field4520 = 0;
        class615.method3380(arg0, (byte) -94);
        class438.method2519((byte) 14, arg0);
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(BJ)V", line = 236)
    public static final void method1122(byte arg0, long arg1) {
        if (arg0 < 7) {
            field2103 = null;
        }
        field2094++;
        int var3 = class225.field2923 + class596.field8164.field3929;
        int var4 = class603.field8245 + class596.field8164.field3917;
        if ((class243.field3277 - var3) < -2000 || class243.field3277 - var3 > 2000 || class397.field5667 - var4 < -2000 || (class397.field5667 - var4) > 2000) {
            class243.field3277 = var3;
            class397.field5667 = var4;
        }
        if (class243.field3277 != var3) {
            int var5 = var3 - class243.field3277;
            int var6 = (int) ((long) var5 * arg1 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var6 > var5) {
                var6 = var5;
            }
            class243.field3277 += var6;
        }
        if (class397.field5667 != var4) {
            int var7 = var4 - class397.field5667;
            int var8 = (int) ((long) var7 * arg1 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class397.field5667 += var8;
        }
        if (!class72.field935.field6535) {
            class620.field8432 += (float) arg1 * class690.field9748 / 6.0F;
            class283.field3826 += (float) arg1 * class74.field945 / 6.0F;
        }
        class425.method2455(1024);
    }
}
