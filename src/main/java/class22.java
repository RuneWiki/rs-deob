import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class22 extends class144 {

    @OriginalMember(owner = "client!bj", name = "ub", descriptor = "Z")
    private volatile boolean field348 = false;

    @OriginalMember(owner = "client!bj", name = "ob", descriptor = "Z")
    private boolean field342 = false;

    @OriginalMember(owner = "client!bj", name = "yb", descriptor = "I")
    private int field352 = -1;

    @OriginalMember(owner = "client!bj", name = "mb", descriptor = "Lud;")
    private class222 field340;

    @OriginalMember(owner = "client!bj", name = "gb", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!bj", name = "fb", descriptor = "Lud;")
    private class222 field333;

    @OriginalMember(owner = "client!bj", name = "qb", descriptor = "Li;")
    public static class88 field344 = class208.method1425(105, "::errortest");

    @OriginalMember(owner = "client!bj", name = "eb", descriptor = "Li;")
    public static class88 field332 = class208.method1425(105, "-5berpr-Ufen Sie Ihr Mitteilungsfach)3");

    @OriginalMember(owner = "client!bj", name = "zb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field353 = Calendar.getInstance();

    @OriginalMember(owner = "client!bj", name = "Bb", descriptor = "Z")
    public static boolean field355 = true;

    @OriginalMember(owner = "client!bj", name = "Cb", descriptor = "Li;")
    public static class88 field356 = class208.method1425(105, "(U0a )2 via: ");

    @OriginalMember(owner = "client!bj", name = "Db", descriptor = "Li;")
    public static class88 field357 = class208.method1425(105, "Bitte geben Sie Ihren Benutzernamen ein)3");

    @OriginalMember(owner = "client!bj", name = "db", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!bj", name = "hb", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!bj", name = "ib", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!bj", name = "jb", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!bj", name = "kb", descriptor = "I")
    public static int field338;

    @OriginalMember(owner = "client!bj", name = "lb", descriptor = "I")
    public static int field339;

    @OriginalMember(owner = "client!bj", name = "nb", descriptor = "I")
    public static int field341;

    @OriginalMember(owner = "client!bj", name = "pb", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!bj", name = "rb", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!bj", name = "sb", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!bj", name = "tb", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!bj", name = "vb", descriptor = "I")
    private int field349;

    @OriginalMember(owner = "client!bj", name = "wb", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!bj", name = "Ab", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!bj", name = "Eb", descriptor = "I")
    public static int field358;

    @OriginalMember(owner = "client!bj", name = "xb", descriptor = "[I")
    public static int[] field351;

    @OriginalMember(owner = "client!bj", name = "cb", descriptor = "[Z")
    private volatile boolean[] field330;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I[BZIZ)V")
    public final void method105(int arg0, byte[] arg1, boolean arg2, int arg3, boolean arg4) {
        ++field338;
        if (arg3 < 85) {
            this.method105(52, (byte[]) null, true, 78, true);
        }
        if (!arg4) {
            arg1[arg1.length + -2] = (byte) (super.field2670[arg0] >> 8);
            arg1[arg1.length + -1] = (byte) super.field2670[arg0];
            if (this.field333 != null) {
                class36.method244(arg1, true, arg0, this.field333);
                this.field330[arg0] = true;
            }
            if (arg2) {
                super.field2708[arg0] = class168.method1155(false, (byte) -55, arg1);
                return;
            }
        } else {
            if (this.field348) {
                throw new RuntimeException();
            }
            if (this.field340 != null) {
                class36.method244(arg1, true, this.field334, this.field340);
            }
            this.method969(arg1, false);
            this.method113(103);
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(BI)Lqb;")
    public static final class176 method106(byte arg0, int arg1) {
        class176 var2 = (class176) class168.field3230.method666((long) arg1, 0);
        ++field335;
        if (arg0 < 122) {
            method118(-72);
        }
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class34.field584.method941((byte) 56, arg1, 26);
            class176 var4 = new class176();
            if (var3 != null) {
                var4.method1266(new class46(var3), 126);
            }
            class168.field3230.method664((long) arg1, var4, false);
            return var4;
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(Z)V")
    public static final void method107(boolean arg0) {
        ++field345;
        try {
            if (arg0) {
                method106((byte) 4, 47);
            }
            if (class122.field2232 == 1) {
                int var1 = class31.field503.method1199((byte) -126);
                if (var1 > 0 && class31.field503.method1201(22643)) {
                    int var2 = var1 - class172.field3345;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class31.field503.method1188((byte) -14, var2);
                } else {
                    class31.field503.method1210(arg0);
                    class31.field503.method1182(-81);
                    class248.field4554 = null;
                    class196.field3766 = null;
                    if (class158.field3041 != null) {
                        class122.field2232 = 2;
                    } else {
                        class122.field2232 = 0;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class31.field503.method1210(arg0);
            class248.field4554 = null;
            class158.field3041 = null;
            class196.field3766 = null;
            class122.field2232 = 0;
        }
    }

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "(I)V")
    public static void method108(int arg0) {
        field332 = null;
        field344 = null;
        field357 = null;
        field351 = null;
        if (arg0 != -6) {
            method108(-73);
        }
        field353 = null;
        field356 = null;
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(III)V")
    public final void method109(int arg0, int arg1, int arg2) {
        this.field349 = arg0;
        if (arg1 < 17) {
            field355 = false;
        }
        this.field347 = arg2;
        if (this.field340 == null) {
            class188.method1314(this, this.field334, 255, (byte) 0, -439631408, this.field349, true);
        } else {
            class81.method540(this, this.field334, 0, this.field340);
        }
        ++field358;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(II)V")
    public final void method110(int arg0, int arg1) {
        ++field350;
        if (this.method970(arg0 ^ -23856, arg1)) {
            class59.method426(this.field334, 121, arg1);
            if (arg0 != -23896) {
                this.method112(96, false);
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([BILud;BZ)V")
    public final void method111(byte[] arg0, int arg1, class222 arg2, byte arg3, boolean arg4) {
        ++field343;
        if (arg3 > -70) {
            this.field334 = -79;
        }
        if (this.field340 != arg2) {
            if (!arg4 && ~this.field352 == ~arg1) {
                this.field348 = true;
            }
            if (arg0 == null || ~arg0.length >= -3) {
                this.field330[arg1] = false;
                if (this.field342 || arg4) {
                    class188.method1314(this, arg1, this.field334, (byte) 2, -439631408, super.field2692[arg1], arg4);
                }
                return;
            }
            class226.field4243.reset();
            class226.field4243.update(arg0, 0, arg0.length + -2);
            int var6 = (int) class226.field4243.getValue();
            int var7 = ((arg0[arg0.length - 2] & 255) << 8) - -(arg0[arg0.length + -1] & 255);
            if (super.field2692[arg1] != var6 || super.field2670[arg1] != var7) {
                this.field330[arg1] = false;
                if (this.field342 || arg4) {
                    class188.method1314(this, arg1, this.field334, (byte) 2, -439631408, super.field2692[arg1], arg4);
                }
                return;
            }
            this.field330[arg1] = true;
            if (arg4) {
                super.field2708[arg1] = class168.method1155(false, (byte) -109, arg0);
                return;
            }
        } else {
            if (this.field348) {
                throw new RuntimeException();
            }
            if (arg0 == null) {
                class188.method1314(this, this.field334, 255, (byte) 0, -439631408, this.field349, true);
                return;
            }
            class226.field4243.reset();
            class226.field4243.update(arg0, 0, arg0.length);
            int var8 = (int) class226.field4243.getValue();
            if (this.field349 != var8) {
                class188.method1314(this, this.field334, 255, (byte) 0, -439631408, this.field349, true);
                return;
            }
            class46 var9;
            try {
                var9 = new class46(class23.method119(arg0, -1));
            } catch (RuntimeException var12) {
                class188.method1314(this, this.field334, 255, (byte) 0, -439631408, this.field349, true);
                return;
            }
            int var10 = var9.method347(26119);
            if (~var10 != -6 && var10 != 6) {
                class188.method1314(this, this.field334, 255, (byte) 0, -439631408, this.field349, true);
                return;
            }
            int var11 = 0;
            if (~var10 <= -7) {
                var11 = var9.method323((byte) -116);
            }
            if (~this.field347 != ~var11) {
                class188.method1314(this, this.field334, 255, (byte) 0, -439631408, this.field349, true);
                return;
            }
            this.method969(arg0, false);
            this.method113(102);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IZ)V")
    public final void method112(int arg0, boolean arg1) {
        ++field336;
        if (arg1) {
            if (this.method970(123, arg0)) {
                if (this.field333 != null && this.field330 != null && this.field330[arg0]) {
                    class81.method540(this, arg0, 0, this.field333);
                } else {
                    class188.method1314(this, arg0, this.field334, (byte) 2, -439631408, super.field2692[arg0], true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "(I)V")
    private final void method113(int arg0) {
        ++field337;
        this.field330 = new boolean[super.field2708.length];
        for (int var2 = 0; ~var2 > ~this.field330.length; ++var2) {
            this.field330[var2] = false;
        }
        if (this.field333 == null) {
            this.field348 = true;
        } else {
            this.field352 = -1;
            if (arg0 < 43) {
                method114((int[][]) null, (byte) -117);
            }
            for (int var3 = 0; var3 < this.field330.length; ++var3) {
                if (~super.field2685[var3] < -1) {
                    class122.method830(-1, var3, this, this.field333);
                    this.field352 = var3;
                }
            }
            if (~this.field352 == 0) {
                this.field348 = true;
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "([[IB)V")
    public static final void method114(int[][] arg0, byte arg1) {
        class3.field42 = arg0;
        if (arg1 < 8) {
            method106((byte) 102, 42);
        }
        ++field339;
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(Z)I")
    public final int method115(boolean arg0) {
        ++field346;
        if (!arg0) {
            return 10;
        } else if (this.field348) {
            return 100;
        } else if (super.field2708 != null) {
            return 99;
        } else {
            int var2 = class228.method1525(255, this.field334, -14013488);
            if (~var2 <= -101) {
                var2 = 99;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(BI)I")
    public final int method116(byte arg0, int arg1) {
        ++field354;
        if (arg0 != 17) {
            this.field349 = 113;
        }
        if (!this.method970(119, arg1)) {
            return 0;
        } else if (super.field2708[arg1] != null) {
            return 100;
        } else {
            return this.field330[arg1] ? 100 : class228.method1525(this.field334, arg1, arg0 ^ -14013503);
        }
    }

    @OriginalMember(owner = "client!bj", name = "<init>", descriptor = "(Lud;Lud;IZZZ)V")
    public class22(class222 arg0, class222 arg1, int arg2, boolean arg3, boolean arg4, boolean arg5) {
        super(arg3, arg4);
        this.field340 = arg1;
        this.field342 = arg5;
        this.field334 = arg2;
        this.field333 = arg0;
        class119.method816(this.field334, (byte) 0, this);
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IBIIZI)Lrc;")
    public static final class188 method117(int arg0, byte arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg1 > -97) {
            field344 = null;
        }
        long var6 = ((long) arg3 << 16) + ((long) arg5 << 40) + ((long) arg2 - (-(arg4 ? 137438953472L : 0L) + -((long) arg0 << 38)));
        class188 var8 = (class188) class206.field3922.method666(var6, 0);
        ++field341;
        if (var8 != null) {
            return var8;
        } else {
            class173.field3366 = false;
            class188 var9 = class77.method516(arg2, arg3, arg5, arg0, true, false, false, arg4);
            if (var9 != null && !class173.field3366) {
                class206.field3922.method664(var6, var9, false);
            }
            return var9;
        }
    }

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "(I)V")
    public static final void method118(int arg0) {
        ++field331;
        boolean var1 = false;
        if (arg0 != 28360) {
            method118(-86);
        }
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class203.field3864 + -1; ++var2) {
                if (class53.field994[var2] < 1000 && ~class53.field994[var2 + 1] < -1001) {
                    var1 = false;
                    class88 var3 = class201.field3838[var2];
                    class201.field3838[var2] = class201.field3838[var2 - -1];
                    class201.field3838[var2 + 1] = var3;
                    class88 var4 = class66.field1191[var2];
                    class66.field1191[var2] = class66.field1191[var2 + 1];
                    class66.field1191[var2 - -1] = var4;
                    int var5 = class165.field3178[var2];
                    class165.field3178[var2] = class165.field3178[var2 + 1];
                    class165.field3178[var2 + 1] = var5;
                    int var6 = class217.field4062[var2];
                    class217.field4062[var2] = class217.field4062[var2 + 1];
                    class217.field4062[var2 - -1] = var6;
                    short var7 = class53.field994[var2];
                    class53.field994[var2] = class53.field994[var2 + 1];
                    class53.field994[var2 + 1] = var7;
                    long var8 = class74.field1352[var2];
                    class74.field1352[var2] = class74.field1352[var2 + 1];
                    class74.field1352[var2 + 1] = var8;
                }
            }
        }
    }
}
