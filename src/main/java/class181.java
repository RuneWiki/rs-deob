import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class181 extends class167 {

    @OriginalMember(owner = "client!ek", name = "A", descriptor = "[I")
    private final int[] field3309 = new int[this.field3019];

    @OriginalMember(owner = "client!ek", name = "p", descriptor = "J")
    public static long field3298 = 0L;

    @OriginalMember(owner = "client!ek", name = "q", descriptor = "I")
    public static int field3299 = -1;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    public static int field3314 = 0;

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    public static int field3310 = 0;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "[Lud;")
    public static class279[] field3312 = new class279[5];

    @OriginalMember(owner = "client!ek", name = "s", descriptor = "I")
    private int field3301;

    @OriginalMember(owner = "client!ek", name = "t", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!ek", name = "u", descriptor = "I")
    public static int field3303;

    @OriginalMember(owner = "client!ek", name = "v", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!ek", name = "w", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!ek", name = "y", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!ek", name = "z", descriptor = "I")
    private int field3308;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field3311;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!ek", name = "r", descriptor = "Lia;")
    public static class206 field3300;

    @OriginalMember(owner = "client!ek", name = "x", descriptor = "[B")
    private byte[] field3306;

    @OriginalMember(owner = "client!ek", name = "b", descriptor = "(I)V", line = 7)
    public static void method1401(int arg0) {
        field3312 = null;
        field3300 = null;
        if (arg0 != 0) {
            field3299 = 72;
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 21)
    public final void method229(byte arg0) {
        this.field3308 = 0;
        if (arg0 != 28) {
            field3298 = 39L;
        }
        field3311++;
        this.field3301 = 0;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(III)V", line = 38)
    public final void method230(int arg0, int arg1, int arg2) {
        this.field3301 += this.field3309[arg2] * arg0 >> 12;
        if (arg1 <= -78) {
            field3303++;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V", line = 49)
    public static final void method1402(byte arg0) {
        field3302++;
        class119.field2148.method1338((byte) -128);
        if (arg0 != 113) {
            method1404(-128);
        }
        class34.field767.method1338((byte) -115);
        class172.field3111.method1338((byte) -117);
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Z)V", line = 62)
    public final void method226(boolean arg0) {
        field3313++;
        this.field3301 = Math.abs(this.field3301);
        if (!arg0) {
            field3300 = (class206) null;
        }
        if (this.field3301 >= 4096) {
            this.field3301 = 4095;
        }
        this.method565(this.field3308++, (byte) (this.field3301 >> 4));
        this.field3301 = 0;
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "(IIIIIF)V", line = 78)
    public class181(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; var7 < this.field3019; var7++) {
            this.field3309[var7] = (short) ((int) (Math.pow((double) arg5, (double) var7) * 4096.0D));
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(IB)V", line = 111)
    public void method565(int arg0, byte arg1) {
        this.field3306[this.field3308++] = (byte) ((class52.method442(255, arg1) >> 1) + 127);
        field3305++;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(Lff;IIIII)V", line = 121)
    public static final void method1403(class52 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3315++;
        if (arg0.field1084 == -1 && arg0.field1081 == null) {
            return;
        }
        int var6 = 0;
        if (arg0.field1078 < arg3) {
            var6 += arg3 - arg0.field1078;
        } else if (arg3 < arg0.field1079) {
            var6 += arg0.field1079 - arg3;
        }
        if (arg5 > arg0.field1068) {
            var6 += arg5 - arg0.field1068;
        } else if (arg5 < arg0.field1076) {
            var6 += arg0.field1076 - arg5;
        }
        if (arg0.field1086 == 0 || var6 - 64 > arg0.field1086 || class3.field105 == 0 || arg0.field1098 != arg1) {
            if (arg0.field1083 != null) {
                class322.field5630.method1957(arg0.field1083);
                arg0.field1083 = null;
            }
            if (arg0.field1096 != null) {
                class322.field5630.method1957(arg0.field1096);
                arg0.field1096 = null;
            }
            return;
        }
        var6 -= 64;
        if (~var6 > arg4) {
            var6 = 0;
        }
        int var7 = (arg0.field1086 - var6) * class3.field105 / arg0.field1086;
        if (arg0.field1083 != null) {
            arg0.field1083.method704(var7);
        } else if (arg0.field1084 >= 0) {
            class187 var8 = class187.method1438(class317.field5574, arg0.field1084, 0);
            if (var8 != null) {
                class40 var9 = var8.method1436().method350(class213.field3747);
                class82 var10 = class82.method685(var9, 100, var7);
                var10.method715(-1);
                class322.field5630.method1960(var10);
                arg0.field1083 = var10;
            }
        }
        if (arg0.field1096 != null) {
            arg0.field1096.method704(var7);
            if (!arg0.field1096.method2224((byte) -23)) {
                arg0.field1096 = null;
            }
        } else if (arg0.field1081 != null && (arg0.field1089 -= arg2) <= 0) {
            int var11 = (int) ((double) arg0.field1081.length * Math.random());
            class187 var12 = class187.method1438(class317.field5574, arg0.field1081[var11], 0);
            if (var12 != null) {
                class40 var13 = var12.method1436().method350(class213.field3747);
                class82 var14 = class82.method685(var13, 100, var7);
                var14.method715(0);
                class322.field5630.method1960(var14);
                arg0.field1089 = arg0.field1072 + (int) (Math.random() * (double) (arg0.field1102 - arg0.field1072));
                arg0.field1096 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(I)V", line = 244)
    public static final void method1404(int arg0) {
        class254 var1 = class101.field1892;
        synchronized (class101.field1892) {
            class260.field4619++;
            class110.field2032 = class194.field3487;
            if (class262.field4664 >= 0) {
                while (class262.field4664 != class221.field3907) {
                    int var3 = class31.field720[class221.field3907];
                    class221.field3907 = class221.field3907 + 1 & 0x7F;
                    if (var3 < 0) {
                        class284.field5075[~var3] = false;
                    } else {
                        class284.field5075[var3] = true;
                    }
                }
            } else {
                for (int var2 = 0; var2 < 112; var2++) {
                    class284.field5075[var2] = false;
                }
                class262.field4664 = class221.field3907;
            }
            class194.field3487 = class238.field4174;
        }
        field3307++;
        int var5 = -53 / ((arg0 - 57) / 46);
    }
}
