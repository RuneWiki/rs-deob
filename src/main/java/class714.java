import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pca")
public class class714 {

    @OriginalMember(owner = "client!pca", name = "r", descriptor = "Llga;")
    private class711 field9933;

    @OriginalMember(owner = "client!pca", name = "o", descriptor = "I")
    private int field9930;

    @OriginalMember(owner = "client!pca", name = "s", descriptor = "I")
    private int field9934;

    @OriginalMember(owner = "client!pca", name = "i", descriptor = "Lkk;")
    private class188 field9924;

    @OriginalMember(owner = "client!pca", name = "n", descriptor = "Lqfa;")
    public static class98 field9929 = new class98(88, 20);

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "I")
    public static int field9916;

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "I")
    public static int field9917;

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "I")
    public static int field9918;

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "I")
    public static int field9919;

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "I")
    public static int field9920;

    @OriginalMember(owner = "client!pca", name = "f", descriptor = "I")
    public static int field9921;

    @OriginalMember(owner = "client!pca", name = "g", descriptor = "I")
    public static int field9922;

    @OriginalMember(owner = "client!pca", name = "h", descriptor = "I")
    public static int field9923;

    @OriginalMember(owner = "client!pca", name = "j", descriptor = "I")
    public static int field9925;

    @OriginalMember(owner = "client!pca", name = "k", descriptor = "I")
    public static int field9926;

    @OriginalMember(owner = "client!pca", name = "l", descriptor = "I")
    public static int field9927;

    @OriginalMember(owner = "client!pca", name = "m", descriptor = "I")
    public static int field9928;

    @OriginalMember(owner = "client!pca", name = "p", descriptor = "I")
    public static int field9931;

    @OriginalMember(owner = "client!pca", name = "q", descriptor = "I")
    public static int field9932;

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(ILei;)V", line = 3)
    private final void method4014(int arg0, class175 arg1) {
        if (arg1 != null) {
            arg1.method1185(-60);
            arg1.method3311(100);
            this.field9930 += arg1.field2359;
        }
        int var3 = 56 / ((arg0 + 44) / 48);
        field9931++;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IJ)V", line = 21)
    private final void method4015(int arg0, long arg1) {
        field9922++;
        class175 var4 = (class175) this.field9924.method1180((byte) 26, arg1);
        if (arg0 != 88) {
            this.method4018((byte) -96, null, -96L);
        }
        this.method4014(100, var4);
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(I)V", line = 34)
    public class714(int arg0) {
        this(arg0, arg0);
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IB)V", line = 38)
    public final void method4016(int arg0, byte arg1) {
        field9919++;
        if (class248.field3297 != null) {
            for (class175 var3 = (class175) this.field9933.method4000((byte) -7); var3 != null; var3 = (class175) this.field9933.method4002(-69)) {
                if (var3.method1118((byte) 111)) {
                    if (var3.method1116(106) == null) {
                        var3.method1185(-124);
                        var3.method3311(100);
                        this.field9930 += var3.field2359;
                    }
                } else if ((long) arg0 < ++var3.field8207) {
                    class175 var4 = class248.field3297.method2694(arg1 ^ 0xFFFFFFB5, var3);
                    this.field9924.method1179(var3.field2546, var4, (byte) -26);
                    class375.method2357(var4, arg1 ^ 0xFFFFF982, var3);
                    var3.method1185(-50);
                    var3.method3311(arg1 + 173);
                }
            }
        }
        if (arg1 != -73) {
            this.field9930 = 30;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(I)V", line = 87)
    public static void method4017(int arg0) {
        field9929 = null;
        if (arg0 != 27927) {
            method4017(9);
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(BLjava/lang/Object;J)V", line = 99)
    public final void method4018(byte arg0, Object arg1, long arg2) {
        this.method4028(1, arg2, arg1, 1);
        field9920++;
        if (arg0 < 123) {
            this.field9930 = 98;
        }
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(Z)I", line = 111)
    public static final int method4019(boolean arg0) {
        if (!arg0) {
            field9929 = null;
        }
        field9927++;
        return class202.field2651;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(B)Ljava/lang/Object;", line = 123)
    public final Object method4020(byte arg0) {
        field9932++;
        if (arg0 > -39) {
            this.method4020((byte) -71);
        }
        class175 var2 = (class175) this.field9924.method1176(24490);
        while (var2 != null) {
            Object var3 = var2.method1116(102);
            if (var3 != null) {
                return var3;
            }
            class175 var4 = var2;
            var2 = (class175) this.field9924.method1178((byte) 71);
            var4.method1185(-90);
            var4.method3311(100);
            this.field9930 += var4.field2359;
        }
        return null;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(Z)Ljava/lang/Object;", line = 161)
    public final Object method4021(boolean arg0) {
        if (!arg0) {
            this.field9934 = -125;
        }
        field9921++;
        class175 var2 = (class175) this.field9924.method1178((byte) 71);
        while (var2 != null) {
            Object var3 = var2.method1116(67);
            if (var3 != null) {
                return var3;
            }
            class175 var4 = var2;
            var2 = (class175) this.field9924.method1178((byte) 71);
            var4.method1185(-108);
            var4.method3311(100);
            this.field9930 += var4.field2359;
        }
        return null;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(JB)Ljava/lang/Object;", line = 193)
    public final Object method4022(long arg0, byte arg1) {
        field9918++;
        int var4 = 7 % ((15 - arg1) / 58);
        class175 var5 = (class175) this.field9924.method1180((byte) 26, arg0);
        if (var5 == null) {
            return null;
        }
        Object var6 = var5.method1116(83);
        if (var6 == null) {
            var5.method1185(-94);
            var5.method3311(100);
            this.field9930 += var5.field2359;
            return null;
        }
        if (var5.method1118((byte) 125)) {
            class576 var7 = new class576(var6, var5.field2359);
            this.field9924.method1179(var5.field2546, var7, (byte) -26);
            this.field9933.method3999(var7, 21934);
            var7.field8207 = 0L;
            var5.method1185(-106);
            var5.method3311(100);
        } else {
            this.field9933.method3999(var5, 21934);
            var5.field8207 = 0L;
        }
        return var6;
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(B)V", line = 234)
    public final void method4023(byte arg0) {
        this.field9933.method4003(3);
        field9926++;
        this.field9924.method1175((byte) 106);
        this.field9930 = this.field9934;
        int var2 = 77 / ((-arg0 - 80) / 44);
    }

    @OriginalMember(owner = "client!pca", name = "b", descriptor = "(I)V", line = 247)
    public final void method4024(int arg0) {
        for (class175 var2 = (class175) this.field9933.method4000((byte) -7); var2 != null; var2 = (class175) this.field9933.method4002(-121)) {
            if (var2.method1118((byte) 110)) {
                var2.method1185(arg0 ^ 0xFFFFFFB1);
                var2.method3311(100);
                this.field9930 += var2.field2359;
            }
        }
        field9928++;
        if (arg0 != 0) {
            this.method4027(-70);
        }
    }

    @OriginalMember(owner = "client!pca", name = "c", descriptor = "(I)I", line = 272)
    public final int method4025(int arg0) {
        field9917++;
        int var2 = -122 % ((arg0 + 34) / 59);
        return this.field9930;
    }

    @OriginalMember(owner = "client!pca", name = "d", descriptor = "(I)I", line = 288)
    public final int method4026(int arg0) {
        field9925++;
        int var2 = 0;
        if (arg0 != 1) {
            this.field9930 = 72;
        }
        for (class175 var3 = (class175) this.field9933.method4000((byte) -7); var3 != null; var3 = (class175) this.field9933.method4002(-116)) {
            if (!var3.method1118((byte) 112)) {
                var2++;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!pca", name = "e", descriptor = "(I)I", line = 313)
    public final int method4027(int arg0) {
        field9923++;
        if (arg0 != 0) {
            this.method4018((byte) -86, null, 43L);
        }
        return this.field9934;
    }

    @OriginalMember(owner = "client!pca", name = "a", descriptor = "(IJLjava/lang/Object;I)V", line = 324)
    public final void method4028(int arg0, long arg1, Object arg2, int arg3) {
        field9916++;
        if (arg0 > this.field9934) {
            throw new IllegalStateException("s>cs");
        }
        this.method4015(arg3 + 87, arg1);
        this.field9930 -= arg0;
        while (this.field9930 < 0) {
            class175 var7 = (class175) this.field9933.method3997(arg3 ^ 0x1);
            this.method4014(-96, var7);
        }
        class576 var6 = new class576(arg2, arg0);
        if (arg3 != 1) {
            this.method4020((byte) 57);
        }
        this.field9924.method1179(arg1, var6, (byte) -26);
        this.field9933.method3999(var6, 21934);
        var6.field8207 = 0L;
    }

    @OriginalMember(owner = "client!pca", name = "<init>", descriptor = "(II)V", line = 358)
    public class714(int arg0, int arg1) {
        this.field9933 = new class711();
        this.field9930 = arg0;
        this.field9934 = arg0;
        int var3;
        for (var3 = 1; arg0 > (var3 + var3) && var3 < arg1; var3 += var3) {
        }
        this.field9924 = new class188(var3);
    }
}
