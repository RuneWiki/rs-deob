import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public abstract class class74 extends class86 {

    @OriginalMember(owner = "client!vg", name = "u", descriptor = "[Lvg;")
    public class74[] field1239;

    @OriginalMember(owner = "client!vg", name = "A", descriptor = "Z")
    public boolean field1245;

    @OriginalMember(owner = "client!vg", name = "v", descriptor = "[I")
    public static int[] field1240 = new int[4];

    @OriginalMember(owner = "client!vg", name = "w", descriptor = "Ljava/lang/String;")
    public static String field1241 = "slide:";

    @OriginalMember(owner = "client!vg", name = "y", descriptor = "Lta;")
    public static class262 field1243 = new class262(5);

    @OriginalMember(owner = "client!vg", name = "I", descriptor = "J")
    public static long field1253 = 0L;

    @OriginalMember(owner = "client!vg", name = "L", descriptor = "I")
    public static int field1256 = 0;

    @OriginalMember(owner = "client!vg", name = "o", descriptor = "I")
    public static int field1233;

    @OriginalMember(owner = "client!vg", name = "p", descriptor = "I")
    public static int field1234;

    @OriginalMember(owner = "client!vg", name = "q", descriptor = "I")
    public static int field1235;

    @OriginalMember(owner = "client!vg", name = "r", descriptor = "I")
    public static int field1236;

    @OriginalMember(owner = "client!vg", name = "s", descriptor = "I")
    public int field1237;

    @OriginalMember(owner = "client!vg", name = "t", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!vg", name = "x", descriptor = "I")
    public static int field1242;

    @OriginalMember(owner = "client!vg", name = "z", descriptor = "I")
    public static int field1244;

    @OriginalMember(owner = "client!vg", name = "B", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!vg", name = "C", descriptor = "I")
    public static int field1247;

    @OriginalMember(owner = "client!vg", name = "E", descriptor = "I")
    public static int field1249;

    @OriginalMember(owner = "client!vg", name = "F", descriptor = "I")
    public static int field1250;

    @OriginalMember(owner = "client!vg", name = "G", descriptor = "I")
    public static int field1251;

    @OriginalMember(owner = "client!vg", name = "H", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!vg", name = "K", descriptor = "I")
    public static int field1255;

    @OriginalMember(owner = "client!vg", name = "J", descriptor = "Lwh;")
    public class198 field1254;

    @OriginalMember(owner = "client!vg", name = "D", descriptor = "Lbl;")
    public class34 field1248;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(Z)V")
    public static void method584(boolean arg0) {
        field1240 = null;
        if (!arg0) {
            method584(true);
        }
        field1243 = null;
        field1241 = null;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Lka;II)V")
    public static final void method585(class264 arg0, int arg1, int arg2) {
        field1251++;
        if (arg2 < 23) {
            return;
        }
        if (arg0.field4201 > class267.field4256) {
            class165.method1094(true, arg0);
        } else if (class267.field4256 > arg0.field4219) {
            class237.method1597(arg0, (byte) -2);
        } else {
            class294.method1974((byte) -16, arg0);
        }
        if (arg0.field4176 < 128 || arg0.field4123 < 128 || arg0.field4176 >= 13184 || arg0.field4123 >= 13184) {
            arg0.field4210 = -1;
            arg0.field4135 = -1;
            arg0.field4201 = 0;
            arg0.field4219 = 0;
            arg0.field4176 = arg0.field4204[0] * 128 + (arg0.method226((byte) -97) * 64);
            arg0.field4123 = arg0.field4143[0] * 128 + arg0.method226((byte) -97) * 64;
            arg0.method1797(25402);
        }
        if (class261.field4058 == arg0 && (arg0.field4176 < 1536 || arg0.field4123 < 1536 || arg0.field4176 >= 11776 || arg0.field4123 >= 11776)) {
            arg0.field4219 = 0;
            arg0.field4210 = -1;
            arg0.field4135 = -1;
            arg0.field4201 = 0;
            arg0.field4176 = arg0.field4204[0] * 128 + (arg0.method226((byte) -97) * 64);
            arg0.field4123 = arg0.field4143[0] * 128 + (arg0.method226((byte) -97) * 64);
            arg0.method1797(25402);
        }
        class220.method1478(arg0, (byte) 55);
        class72.method560(false, arg0);
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(I)[Lcg;")
    public static final class168[] method586(int arg0) {
        field1234++;
        if (arg0 >= -7) {
            method586(-35);
        }
        class168[] var1 = new class168[class163.field2489];
        for (int var2 = 0; var2 < class163.field2489; var2++) {
            var1[var2] = new class168(class205.field3187, class174.field2581, class184.field2764[var2], class239.field3698[var2], class270.field4281[var2], class107.field1717[var2], class289.field4554[var2], class35.field560);
        }
        class239.method1619(65306);
        return var1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IB)[[I")
    public int[][] method82(int arg0, byte arg1) {
        field1244++;
        if (arg1 >= -112) {
            this.field1245 = true;
        }
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BII)V")
    public final void method587(byte arg0, int arg1, int arg2) {
        if (arg0 != -102) {
            method593(-116, 36, 11, -87, true);
        }
        int var4 = this.field1237 == 255 ? arg2 : this.field1237;
        field1235++;
        if (this.field1245) {
            this.field1254 = new class198(var4, arg2, arg1);
        } else {
            this.field1248 = new class34(var4, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(B)I")
    public int method588(byte arg0) {
        if (arg0 == 115) {
            field1252++;
            return -1;
        } else {
            return 108;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ILjava/lang/String;III)V")
    public static final void method589(int arg0, String arg1, int arg2, int arg3, int arg4) {
        field1238++;
        class188 var5 = class32.method261(arg0, arg3, 87);
        if (var5 == null) {
            return;
        }
        if (var5.field2832 != null) {
            class39 var6 = new class39();
            var6.field653 = arg1;
            var6.field647 = var5.field2832;
            var6.field648 = arg4;
            var6.field657 = var5;
            class243.method1648((byte) 123, var6);
        }
        boolean var7 = true;
        if (var5.field2950 > 0) {
            var7 = class255.method1695(-206, var5);
        }
        if (!var7 || !client.method1063(var5).method1468(arg4 - 1, arg2 + -31513) || arg2 != 191) {
            return;
        }
        if (arg4 == 1) {
            class33.field529++;
            class292.field4607.method1251(170, (byte) -87);
            class292.field4607.method289(arg0, -128);
            class292.field4607.method312(1489253544, arg3);
        }
        if (arg4 == 2) {
            class292.field4607.method1251(43, (byte) -50);
            class292.field4607.method289(arg0, 58);
            class292.field4607.method312(1489253544, arg3);
            class256.field3917++;
        }
        if (arg4 == 3) {
            class156.field2380++;
            class292.field4607.method1251(68, (byte) -29);
            class292.field4607.method289(arg0, 83);
            class292.field4607.method312(1489253544, arg3);
        }
        if (arg4 == 4) {
            class292.field4607.method1251(155, (byte) -48);
            class119.field1838++;
            class292.field4607.method289(arg0, 102);
            class292.field4607.method312(1489253544, arg3);
        }
        if (arg4 == 5) {
            class292.field4607.method1251(191, (byte) -75);
            class283.field4470++;
            class292.field4607.method289(arg0, arg2 - 319);
            class292.field4607.method312(1489253544, arg3);
        }
        if (arg4 == 6) {
            class50.field796++;
            class292.field4607.method1251(60, (byte) -42);
            class292.field4607.method289(arg0, arg2 ^ 0x87);
            class292.field4607.method312(1489253544, arg3);
        }
        if (arg4 == 7) {
            class210.field3260++;
            class292.field4607.method1251(34, (byte) -26);
            class292.field4607.method289(arg0, 111);
            class292.field4607.method312(1489253544, arg3);
        }
        if (arg4 == 8) {
            class292.field4607.method1251(194, (byte) -15);
            class292.field4607.method289(arg0, -126);
            class191.field3039++;
            class292.field4607.method312(1489253544, arg3);
        }
        if (arg4 == 9) {
            class16.field257++;
            class292.field4607.method1251(253, (byte) -80);
            class292.field4607.method289(arg0, -125);
            class292.field4607.method312(1489253544, arg3);
        }
        if (arg4 == 10) {
            class292.field4607.method1251(30, (byte) -71);
            class204.field3175++;
            class292.field4607.method289(arg0, 65);
            class292.field4607.method312(arg2 ^ 0x58C43417, arg3);
        }
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(I)I")
    public int method87(int arg0) {
        if (arg0 != 128) {
            this.method493(false);
        }
        field1233++;
        return -1;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(II)[I")
    public int[] method448(int arg0, int arg1) {
        field1247++;
        if (arg0 != 4) {
            this.field1254 = null;
        }
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "(Z)V")
    public void method493(boolean arg0) {
        field1250++;
        if (arg0) {
            this.method87(27);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(III)[I")
    public final int[] method590(int arg0, int arg1, int arg2) {
        field1255++;
        if (arg0 != 0) {
            method584(true);
        }
        return this.field1239[arg1].field1245 ? this.field1239[arg1].method448(4, arg2) : this.field1239[arg1].method82(arg2, (byte) -127)[0];
    }

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "(Z)V")
    public static final void method591(boolean arg0) {
        field1246++;
        class134.field2087.method1782(-91);
        if (arg0) {
            method593(68, 111, 1, 5, true);
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BLf;I)V")
    public void method80(byte arg0, class37 arg1, int arg2) {
        field1249++;
        if (arg0 != -79) {
            this.method80((byte) 45, (class37) null, 82);
        }
    }

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "(I)V")
    public void method91(int arg0) {
        if (this.field1245) {
            this.field1254.method1323(116);
            this.field1254 = null;
        } else {
            this.field1248.method271(1);
            this.field1248 = null;
        }
        field1242++;
        if (arg0 != 0) {
            this.method493(true);
        }
    }

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "(III)[[I")
    public final int[][] method592(int arg0, int arg1, int arg2) {
        if (arg2 < 74) {
            method584(true);
        }
        field1236++;
        if (!this.field1239[arg1].field1245) {
            return this.field1239[arg1].method82(arg0, (byte) -113);
        }
        int[][] var4 = new int[3][];
        int[] var5 = this.field1239[arg1].method448(4, arg0);
        var4[1] = var5;
        var4[2] = var5;
        var4[0] = var5;
        return var4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIIIZ)V")
    public static final void method593(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        class113.field1777 = arg1;
        class191.field3032 = arg2;
        class227.field3557 = arg3;
        class71.field1134 = new class23[arg0][class113.field1777][class191.field3032];
        class214.field3307 = new int[arg0][class113.field1777 + 1][class191.field3032 + 1];
        if (arg4) {
            class88.field1439 = new class23[1][class113.field1777][class191.field3032];
            class272.field4297 = new int[class113.field1777][class191.field3032];
            class118.field1825 = new int[1][class113.field1777 + 1][class191.field3032 + 1];
        } else {
            class88.field1439 = null;
            class272.field4297 = null;
            class118.field1825 = null;
        }
        class19.method169(false);
        class61.field990 = new class100[500];
        class173.field2576 = 0;
        class169.field2540 = new class100[500];
        class7.field119 = 0;
        class5.field98 = new int[arg0][class113.field1777 + 1][class191.field3032 + 1];
        class75.field1264 = new class172[5000];
        class273.field4306 = 0;
        class295.field4642 = new class172[100];
        class256.field3918 = new boolean[class227.field3557 + class227.field3557 + 1][class227.field3557 + class227.field3557 + 1];
        class176.field2648 = new boolean[class227.field3557 + class227.field3557 + 2][class227.field3557 + class227.field3557 + 2];
        class217.field3379 = new byte[arg0][class113.field1777][class191.field3032];
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "(IZ)V")
    public class74(int arg0, boolean arg1) {
        this.field1239 = new class74[arg0];
        this.field1245 = arg1;
    }
}
